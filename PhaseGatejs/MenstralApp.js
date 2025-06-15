module.exports = {tracker, expectingNextPeriod, checkRegularOrNot, fertileWindow}

const tracker = function(currentPeriod, cycleLength) {
   
    const [day, month, year] = currentPeriod.split('-').map(Number);
    
    const currentDate = new Date(year, month - 1, day); 
    
    currentDate.setDate(currentDate.getDate() + cycleLength);
    
    const nextDay = String(currentDate.getDate()).padStart(2, '0');
    const nextMonth = String(currentDate.getMonth() + 1).padStart(2, '0'); // month is 0-indexed
    const nextYear = currentDate.getFullYear();

    return `${nextDay}-${nextMonth}-${nextYear}`;
}

constt fertileWindow = function(currentPeriod, cycleLength) {
    const formatter = (date) => {
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

    return (
        `Ovulation Date: ${formatter(ovulationDate)}\n` +
        `Fertile Window: ${formatter(fertileStart)} to ${formatter(fertileEnd)}`
    );
}
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
        const diffInDays = (current - previous) / (1000 * 60 * 60 * 24); // convert ms to days
        actualCycleLengths.push(diffInDays);
    }

    for (const cycle of actualCycleLengths) {
        if (Math.abs(cycle - cycleLength) > 2) {
            return "Irregular";
        }
    }

    return "Regular";
}

