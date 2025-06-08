from datetime import datetime, timedelta

def tracker(previous_period, current_period):
	formatter = "%d-%m-%Y"
	previous_date = datetime.strptime(previous_period, formatter)
	current_date = datetime.strptime(current_period, formatter)

	length = (current_date - previous_date).days
	return str(length)

def expecting_next_period(last_period, cycle_length):
	formatter = "%d-%m-%Y"
	last_start = datetime.strptime(last_period, formatter)
	next_period = last_start + timedelta(days=cycle_length)
	return next_period.strftime(formatter)

def check_regular_or_not(period_dates, cycle_length):
	actual_cycle_lengths = []

	for i in range(1, len(period_dates)):
		previous = datetime.strptime(period_dates[i - 1], "%d-%m-%Y")
		current = datetime.strptime(period_dates[i], "%d-%m-%Y")
		cycle = (current - previous).days
		actual_cycle_lengths.append(cycle)

	for cycle in actual_cycle_lengths:
		if abs(cycle - cycle_length) > 2:
			return "Irregular"

	return "Regular"

def fertile_window(start_date, cycle_length):
	formatter = "%d-%m-%Y"

	last_period_start_date = datetime.strptime(start_date, formatter)
	ovulation_date = last_period_start_date + timedelta(days=cycle_length - 14)
    
	fertile_start = ovulation_date - timedelta(days=5)
	fertile_end = ovulation_date + timedelta(days=1)

	return (
        f"Ovulation Date: {ovulation_date.strftime(formatter)}\n"
	f"Fertile Window: {fertile_start.strftime(formatter)} to {fertile_end.strftime(formatter)}"
    )

