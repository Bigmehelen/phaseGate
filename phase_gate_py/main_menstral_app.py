import menstral_app
from menstral_app import *

last_period = input("Enter last period date (dd-MM-yyyy): ")
cycle_length = int(input("Enter cycle length to predict next period: "))

print("Your next period will be", tracker(last_period, cycle_length))
print(fertile_window(last_period, cycle_length))

number_of_dates = int(input("Enter number of recorded period dates to check regularity: "))
dates = []

for i in range(number_of_dates):
	date_input = input(f"Enter date {i + 1} (dd-MM-yyyy): ")
	dates.append(date_input)

avg_cycle_length = int(input("Enter your average cycle length again: "))

result = check_regular_or_not(dates, avg_cycle_length)
print("Period regularity:", result)