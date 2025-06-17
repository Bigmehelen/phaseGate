from datetime import datetime

def print_header(cashier_name, customer_name):
    today = datetime.now()
    message = f"""\
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 08088406240
Date: {today.date()}   {today.strftime('%H:%M:%S')}
Cashier: {cashier_name}
Customer Name: {customer_name}

========================================================
    ITEMS   QTY     PRICE   TOTAL(NGN)
--------------------------------------------------------
"""
    return message

cart_items = []

def add_items(item, quantity, price):
    items = [item, quantity, price]
    cart_items.append(items)
    return cart_items

def clear_cart():
    cart_items.clear()

def total():
    for count in range(len(cart_items)):
        if len(cart_items[count]) < 4:  # Ensure total is only added once
            quantity = int(cart_items[count][1])
            price = float(cart_items[count][2])
            total_value = quantity * price
            cart_items[count].append(str(total_value))
    return cart_items

def print_total():
    cart_new_items = total()
    for item in cart_new_items:
        for value in item:
            print(f"\t{value}", end='')
        print()

def the_sub_total():
    all_total = 0.0
    for item in cart_items:
        quantity = int(item[1])
        price = float(item[2])
        total = quantity * price
        all_total += total
    return str(all_total)

vat = 0.175  # 17.5% VAT

def item_discount(discount_percent):
    item_subtotal = float(the_sub_total())
    discount = (float(discount_percent) / 100) * item_subtotal
    return str(discount)

def item_vat():
    subtotal = float(the_sub_total())
    vat_value = subtotal * vat
    return f"{vat_value:.2f}"

def bill_total(discount_percent):
    subtotal = float(the_sub_total())
    discount_value = float(item_discount(discount_percent))
    vat_value = float(item_vat())
    total_bill = subtotal + vat_value - discount_value
    return str(total_bill)

def print_discount(discount):
    item_subtotal = the_sub_total()
    discounts = item_discount(discount)
    vat_value = item_vat()
    bill = bill_total(discount)
    
    message = f"""\
---------------------------------------------------------
    Sub Total :     {item_subtotal}
    Discount :      {discounts}

    Vat @ 17.50 :   {vat_value}
=========================================================
    Bill Total:     {bill}
=========================================================
THIS IS NOT A RECEIPT KINDLY PAY     {bill}
"""
    return message

def amount(cost_paid):
    return str(float(cost_paid))

def balance(bill_discount, cost_paid):
    bill_total_value = float(bill_total(bill_discount))
    amount_paid = float(amount(cost_paid))
    difference = amount_paid - bill_total_value
    payment = abs(difference)
    return f"{payment:.2f}"

def print_bill_total(bill_discount, cost_paid):
    bill_val = bill_total(bill_discount)
    amount_val = amount(cost_paid)
    balance_val = balance(bill_discount, cost_paid)

    message = f"""

    Bill Total :    {bill_val}
    Amount paid:    {amount_val}
    Balance:        {balance_val}

==========================================================
    THANK YOU FOR YOUR PATRONAGE
==========================================================
"""
    return message

def print_first_bill(cashier_name, customer_name, discount):
    print(print_header(cashier_name, customer_name))
    print_total()
    print(print_discount(discount))

def print_final_bill(cashier_name, customer_name, amount_paid, discount):
    print(print_header(cashier_name, customer_name))
    print(print_bill_total(discount, amount_paid))

