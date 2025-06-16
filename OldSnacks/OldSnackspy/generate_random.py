import random
def generate_random(number):
	check = 0
	correct = 0
	for number in range(10):

		random_number = random.randrange(1 , 10)
		random_number_two = random.randrange(1 , 10)

		if random_number > random_number_two:
			print(random_number, " - ", random_number_two)
			result = random_number - random_number_two
			user = int(input("Enter guess: "))			
			check += 1

		if user == result:
			print("Correct guess")
			correct += 1
		if user != result and check == 2:
			print("incorrect guess")

		#elif user < result or user > result and check == 2:

			#print(" Wrong answer, Try again")

	print("your result is ", number ,  correct)

generate_random(10)

