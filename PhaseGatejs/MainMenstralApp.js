const {tracker, expectingNextPeriod, checkRegularOrNot, fertileWindow} = require ('./menstralApps')

const prompt = require("prompt-sync")();

const previous = prompt("Enter previous menstrual day (dd-MM-yyyy): ");
const next = prompt("Enter current menstrual day (dd-MM-yyyy): ");
console.log("You have a " + tracker(previous, next) + " day cycle");

const lastPeriod = prompt("Enter last period date (dd-MM-yyyy): ");
const cycleLength = Number(prompt("Enter cycle length: "), 10);
console.log("Your next period is on " + expectingNextPeriod(lastPeriod, cycleLength));

const numDates = Number(prompt("Enter number of period dates to check regularity: "), 10);
const dates = [];

for (let i = 0; i < numDates; i++) {
	dates.push(prompt(`Enter period date ${i + 1} (dd-MM-yyyy):`));
}

const result = checkRegularOrNot(dates, cycleLength);
console.log("Period regularity: " + result);

const startDay = prompt("Enter start date (dd-MM-yyyy):");
const noOfDays = parseInt(prompt("Enter cycle length:"), 10);
const results = fertileWindow(startDay, noOfDays);
console.log(results);

