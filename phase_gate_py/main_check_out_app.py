import check_out_app
from check_out_app import*

cashier_name = None
discount = "0"
balance = "0"

customer = input("What is the customer's Name: ")
items = input("What did the user buy: ")
quantity = input("How many pieces: ")
price = input("How much per unit: ")

add_items(items, quantity, price)
print_first_bill(cashier_name, customer, discount)

while True:
        add = input("Add more items? (yes/no): ").lower()
        if add == "yes":
            item = input("What did the user buy: ")
            quantity = input("How many pieces: ")
            price = input("How much per unit: ")
            add_items(item, quantity, price)
        elif add == "no":
            cashier_name = input("What is your name: ")
            discount = input("How much discount: ")
            print_first_bill(cashier_name, customer, discount)

            amount_paid = input("How much did the customer give you? ")
            print_final_bill(cashier_name, customer, amount_paid, discount)
            break
        else:
            print("Please enter 'yes' or 'no'.")

