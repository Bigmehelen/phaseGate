list = []

def add_employee_payroll(list , names, numOfHour, payRate, fedTax, stateTax):
	
	if numOfHour <= 0 or numOfHour > 40:
		return "mumu na only you dey work"
	
	elif payRate <= 0:
		return "pay rate cant be empty"

	grosspay = payRate * numOfHour
	
	if fedTax <= 0 or fedTax > 100:
		return "invalid input"
	fedTax = grosspay * (fedTax / 100)

	if stateTax <= 0 or stateTax > 100:
		return "invalid input"
	stateTax = grosspay * (stateTax / 100)
	
	total = fedTax + stateTax
	
	netPay = grosspay - total
		
	list.append(f"Employee name: {names}\n Hours_worked: {numOfHour}\n Pay rate: {payRate:.2f}\n Gross pay: {grosspay:.2f}\n Deductions:\n\tFederal withholding: {fedTax:.2f}\n\tState withholding: {stateTax:.2f}\n\t Total Deduction: {total:.2f}\n\t Net Pay: {netPay:.2f}")

	return True

def view_employee_payroll(list):
	for index, person in enumerate(list):
		print(f"{index}\n{person}")

def update_employee_payroll(list, choice):

	if list[choice] not in list:
		return "employee not found"

	list.pop(choice)
	return True
	




			
