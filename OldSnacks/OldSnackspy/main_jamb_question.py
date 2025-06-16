import random
import jamb_question
from jamb_question import *

questions = {0: first, 1: second, 2: third, 3: fourth, 4: fifth, 5: sixth, 6: seven, 7: eight, 8: ninth, 9: tenth}

random.shuffle(questions)

quest_count = 0
correct = 0
iccorrect = 0
score = 0
while quest_count < 10:
	user_choice = int(input("pick a question from (1-10): "))
	if user_choice < 1 or user_choice > 10:
		print("Invalid number")
		continue

	user_choice = user_choice - 1

	if any(user_choice == index for index in questions):

		answer = questions[user_choice]
		answer(True)

		if answer == True:
			quest_count += 1
			correct += 1
			score += 1

		else:
			incorrect += 1
		questios.pop(user_choice)

