import MenstralApp;
from MenstralApp import *;
const prompt = require("prompt-sync")();

let previous = prompt("Enter previous menstrual day (dd-MM-yyyy): ");
let next = prompt("Enter current menstrual day (dd-MM-yyyy): ");
console.log("You have a " + tracker(previous, next) + " day cycle");

let lastPeriod = prompt("Enter last period date (dd-MM-yyyy): ");
let cycleLength = Number(prompt("Enter cycle length: "), 10);
console.log("Your next period is on " + expectingNextPeriod(lastPeriod, cycleLength) + "\n");

let numDates = Number(prompt("Enter number of period dates to check regularity: "), 10);
let dates = [];

for (let i = 0; i < numDates; i++) {
	dates.push(prompt(`Enter period date ${i + 1} (dd-MM-yyyy):`));
}

let result = checkRegularOrNot(dates, cycleLength);
console.log("Period regularity: " + result + "\n");

let startDay = prompt("Enter start date (dd-MM-yyyy):");
let noOfDays = parseInt(prompt("Enter cycle length:"), 10);
let results = fertileWindow(startDay, noOfDays);
console.log(results);

