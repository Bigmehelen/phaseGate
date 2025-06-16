import employee_payroll
from employee_payroll import *
while True:

	print("""
  	Welcome to Semicolon Employee Payroll
	1. Add Employee Payroll
	2. View Employee Payroll
	3. Update Employee Payroll
	4. Exit

Enter your choice:
		""")
	
	user_input = input("Enter input (1-4): ")
	match (user_input):
		case "1": 
			names = input("Enter Employee name: ")
			numOfHour = float(input("Enter number of hours: "))
			payRate = float(input("Hour pay Rate: "))
			fedTax = float(input("Enter federal witholding rate: "))
			stateTax = float(input("Enter state tax: "))

			if add_employee_payroll(list , names, numOfHour, payRate, fedTax, stateTax) != True:
				print( add_employee_payroll(list , names, numOfHour, payRate, fedTax, stateTax))
	
			print("Employee payroll added")	

		case "2": 
			view_employee_payroll(list)
			
		case "3":
			view_employee_payroll(list)

			choice = int(input("Choose number of employee to edit: "))

			if update_employee_payroll(list, choice) != True:
				print(update_employee_payroll(list, choice))

			names = input("Enter Employee name: ")
			numOfHour = float(input("Enter number of hours: "))
			payRate = float(input("Hour pay Rate: "))
			fedTax = float(input("Enter federal witholding rate: "))
			stateTax = float(input("Enter state tax: "))

			if add_employee_payroll(list , names, numOfHour, payRate, fedTax, stateTax) != True:
				print( add_employee_payroll(list , names, numOfHour, payRate, fedTax, stateTax))
	
			print("update your employee payroll added")

		case "4":
			Print("Thanks for coming")
			break
