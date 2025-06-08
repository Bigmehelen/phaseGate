import menstral_app
from menstral_app import *

previous = input("Enter previous menstrual day (dd-MM-yyyy): ")
current = input("Enter current menstrual day (dd-MM-yyyy): ")
print(tracker(previous ,  current))

last_period = input("Enter last period (dd-MM-yyyy) and cycle length to predict next period: ")
cycle_length = int(input("Enter cycle length in days: "))

last_period_date = datetime.strptime(last_period, "%d-%m-%Y")

next_period_date = last_period_date + timedelta(days=cycle_length)

print("Your next period is on", next_period_date.strftime("%d-%m-%Y"))

num_dates = int(input("Enter number of period dates to check regularity: "))
dates = []

print(f"Enter {num_dates} period dates (dd-MM-yyyy):")
for _ in range(num_dates):
	dates.append(input())

	cycle_length = int(input("Enter cycle length: "))
	result = check_regular_or_not(dates, cycle_length)
	print("Period regularity:", result)

print()

start_day = input("Enter start date (dd-MM-yyyy): ")
no_of_days = int(input("Enter cycle length: "))
results = fertile_window(start_day, no_of_days)
print(results)
