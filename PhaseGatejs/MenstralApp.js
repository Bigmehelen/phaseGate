const tracker = function(previousPeriod, currentPeriod){

	const parseDate = (dateStr) =>{
	const [day, month, year] = dateStr.split('-').map(Number);
	return new Date(year, month - 1, day); 
  	};

  	const previousDate = parseDate(previousPeriod);
  	const currentDate = parseDate(currentPeriod);

  	const millisecondsPerDay = 1000 * 60 * 60 * 24;
  	const length = Math.floor((currentDate - previousDate) / millisecondsPerDay);

  return length.toString();
}

const expectingNextPeriod = function(lastPeriod, cycleLength){
 
	const [day, month, year] = lastPeriod.split('-').map(Number);
	const lastStart = new Date(year, month - 1, day); 

	lastStart.setDate(lastStart.getDate() + cycleLength);

	const formattedDate = lastStart.toLocaleDateString('en-GB')
        .split('/')
        .map(part => part.padStart(2, '0'))
        .join('-');

    return formattedDate;
}

const checkRegularOrNot = function(periodDates, cycleLength){
	const actualCycleLengths = [];

	for (let i = 1; i < periodDates.length; i++){
	const previous = new Date(periodDates[i - 1].split('-').reverse().join('-'));
	const current = new Date(periodDates[i].split('-').reverse().join('-'));
    
	const diffTime = current - previous;
	const cycle = diffTime / (1000 * 60 * 60 * 24); // Convert milliseconds to days
	actualCycleLengths.push(cycle);

	}

	for (const cycle of actualCycleLengths){
		if (Math.abs(cycle - cycleLength) > 2){
			return "Irregular";
		}
	}

	return "Regular";
}

const fertileWindow = function(startDate, cycleLength){
  
	const [day, month, year] = startDate.split('-').map(Number);
	const lastPeriodStartDate = new Date(year, month - 1, day);

  	const ovulationDate = new Date(lastPeriodStartDate);
	ovulationDate.setDate(ovulationDate.getDate() + (cycleLength - 14));

	const fertileStart = new Date(ovulationDate);
	fertileStart.setDate(ovulationDate.getDate() - 5);

	const fertileEnd = new Date(ovulationDate);
	fertileEnd.setDate(ovulationDate.getDate() + 1);

const formatDate = (date) =>{
	const d = String(date.getDate()).padStart(2, '0');
    	const m = String(date.getMonth() + 1).padStart(2, '0');
	const y = date.getFullYear();
	return `${d}-${m}-${y}`;
};

return `Ovulation Date: ${formatDate(ovulationDate)}\nFertile Window: ${formatDate(fertileStart)} to ${formatDate(fertileEnd)}`;
}
