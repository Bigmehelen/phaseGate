accounts = []
check = []

def account_balance(balance):
	if balance < 0:
		print("Invalid amount")
	else:
		amount = 0.0
		amount = amount + balance
		accounts.append(amount)
		check.append(balance)
		print("your current balance is: ", amount)
		return amount

def withdraw(withdrawAmount):
	balance = accounts[0]
	if withdrawAmount > balance:
		print("Insufficient Amount")
	checker = account[0]
	checker = checker * 0.90
	
	if withdrawAmount > checker:
		print("cant withdraw more than 90% of the balance")

	else:
		bal = accounts[0] - withdraw
		print("Transaction Successful")
		print("withdraw amount" , withdrawAmount)
		charges = 100
		bal = bal - charges
		print("withdraw fee", charges)
		print("remaining balance", bal)
		accounts[0] = bal
		check.append(withdraw)

def transaction():
	print("This are the list of your transactions")
	print(check)
	return check