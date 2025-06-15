from datetime import datetime, timedelta

def tracker(current_period: str, cycle_length: int): 
    formatter = "%d-%m-%Y"
    current_date = datetime.strptime(current_period, formatter)
    next_period_date = current_date + timedelta(days=cycle_length)
    return next_period_date.strftime(formatter)

def fertile_window(current_period: str, cycle_length: int): 
    formatter = "%d-%m-%Y"
    the_tracker = tracker(current_period, cycle_length)
    period_date = datetime.strptime(the_tracker, formatter)
    ovulation_date = period_date - timedelta(days=14)
    fertile_start = ovulation_date - timedelta(days=5)
    fertile_end = ovulation_date + timedelta(days=1)

    return (
        f"Ovulation Date: {ovulation_date.strftime(formatter)}\n"
        f"Fertile Window: {fertile_start.strftime(formatter)} to {fertile_end.strftime(formatter)}"
    )

def check_regular_or_not(period_dates: list[str], cycle_length: int): 
    formatter = "%d-%m-%Y"
    actual_cycle_lengths = []

    for count in range(1, len(period_dates)):
        previous = datetime.strptime(period_dates[count - 1], formatter)
        current = datetime.strptime(period_dates[count], formatter)
        cycle = (current - previous).days
        actual_cycle_lengths.append(cycle)

    for cycle in actual_cycle_lengths:
        if abs(cycle - cycle_length) > 2:
            return "Irregular"
    
    return "Regular"


