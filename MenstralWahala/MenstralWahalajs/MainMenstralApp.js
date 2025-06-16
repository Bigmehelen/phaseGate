const prompt = require("prompt-sync")();

const tracker = function(currentPeriod, cycleLength) {
    const [day, month, year] = currentPeriod.split('-').map(Number);
    const currentDate = new Date(year, month - 1, day);
    currentDate.setDate(currentDate.getDate() + cycleLength);

    const nextDay = String(currentDate.getDate()).padStart(2, '0');
    const nextMonth = String(currentDate.getMonth() + 1).padStart(2, '0');
    const nextYear = currentDate.getFullYear();

    return `${nextDay}-${nextMonth}-${nextYear}`;
}

const fertileWindow = function(currentPeriod, cycleLength) {
    const formatDate = (date) => {
        const day = String(date.getDate()).padStart(2, '0');
        const month = String(date.getMonth() + 1).padStart(2, '0');
        const year = date.getFullYear();
        return `${day}-${month}-${year}`;
    };

    const trackerDate = tracker(currentPeriod, cycleLength);
    const [tDay, tMonth, tYear] = trackerDate.split('-').map(Number);
    const periodDate = new Date(tYear, tMonth - 1, tDay);

    const ovulationDate = new Date(periodDate);
    ovulationDate.setDate(ovulationDate.getDate() - 14);

    const fertileStart = new Date(ovulationDate);
    fertileStart.setDate(fertileStart.getDate() - 5);

    const fertileEnd = new Date(ovulationDate);
    fertileEnd.setDate(fertileEnd.getDate() + 1);

    return `Ovulation Date: ${formatDate(ovulationDate)}\nFertile Window: ${formatDate(fertileStart)} to ${formatDate(fertileEnd)}`;
}

const checkRegularOrNot = function(periodDates, cycleLength) {
    const formatter = (dateStr) => {
        const [day, month, year] = dateStr.split('-').map(Number);
        return new Date(year, month - 1, day);
    };

    const actualCycleLengths = [];

    for (let i = 1; i < periodDates.length; i++) {
        const previous = formatter(periodDates[i - 1]);
        const current = formatter(periodDates[i]);
        const diffInDays = (current - previous) / (1000 * 60 * 60 * 24);
        actualCycleLengths.push(diffInDays);
    }

    for (const cycle of actualCycleLengths) {
        if (Math.abs(cycle - cycleLength) > 2) {
            return "Irregular";
        }
    }

    return "Regular";
}

const lastPeriod = prompt("Enter last period date (dd-MM-yyyy): ");
const cycleLength = Number(prompt("Enter cycle length to predict next period: "));

console.log("Your next period will be:", tracker(lastPeriod, cycleLength));
console.log(fertileWindow(lastPeriod, cycleLength));

const numberOfDates = Number(prompt("Enter number of recorded period dates to check regularity:"));
const dates = [];

for (let i = 0; i < numberOfDates; i++) {
    const dateInput = prompt(`Enter date ${i + 1} (dd-MM-yyyy):`);
    dates.push(dateInput);
}

const avgCycleLength = Number(prompt("Enter your average cycle length again: "));
const result = checkRegularOrNot(dates, avgCycleLength);

console.log("Period regularity:", result);

