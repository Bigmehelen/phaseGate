def validate_card(the_number):
    if len(the_number) <= 13 or len(the_number) > 16:
        return "Invalid Card Length"

    if the_number.startswith("4"):
        return "VisaCard"
    elif the_number.startswith("5"):
        return "MasterCard"
    elif the_number.startswith("6"):
        return "Discover Credit Card"
    elif the_number.startswith("37"):
        return "America Express"
    else:
        return "Invalid Card"

def check_validity(card_number):
    sum_odd = 0
    sum_even = 0

    size = len(card_number)
    card_digits = [int(digit) for digit in card_number]

    for index in range(size - 1, -1, -1):
        digit = card_digits[index]

        if (size - index) % 2 == 0:
            doubled = digit * 2
            if doubled > 9:
                doubled = (doubled // 10) + (doubled % 10)
            sum_even += doubled
        else:
            sum_odd += digit

    total_sum = sum_even + sum_odd
    return "Valid" if total_sum % 10 == 0 else "Invalid"


    user_card = input("Enter Card Number: ")

    print("\n************************************")
    print("Credit Card Type: " + validate_card(user_card))
    print("Credit Card Number: " + user_card)
    print("Credit Card Digit Length: " + str(len(user_card)))
    print("Card Type: " + check_validity(user_card))
    print("************************************")


    
