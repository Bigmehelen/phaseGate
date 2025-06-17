all_questions = []

def set_one():
    extroverted_vs_introverted = [
        "expand energy, enjoy groups",
        "conserve energy, enjoy one-on-one",
        "more outgoing, think out loud",
        "more reserved, think to yourself",
        "seek many tasks, public activities, interaction with others",
        "seek private, solitary activities with quiet to concentrate",
        "external, communicative, express yourself",
        "internal, reticent, keep to yourself",
        "active, initiate",
        "reflective, deliberate"
    ]
    all_questions.append(extroverted_vs_introverted)
    return all_questions

def set_two():
    sensing_vs_intuitive = [
        "interpret literally",
        "look for meaning and possibilities",
        "practical, realistic, experimental",
        "imaginative, innovative, theoretical",
        "standard, usual, conventional",
        "different, novel, unique",
        "focus on here-and-now",
        "look to the future, global perspective, big picture",
        "facts, things, what is",
        "ideas, dreams, what could be, philosophical"
    ]
    all_questions.append(sensing_vs_intuitive)
    return all_questions

def set_three():
    thinking_vs_feeling = [
        "logical, thinking, questioning",
        "empathetic, feeling, accommodating",
        "candid, straightforward, frank",
        "tactful, kind, encouraging",
        "firm, tend to criticize, hold the line",
        "gentle, tend to appreciate, conciliate",
        "tough-minded, just",
        "tender-hearted, merciful",
        "matter of fact, issue-oriented",
        "sensitive, people-oriented, compassionate"
    ]
    all_questions.append(thinking_vs_feeling)
    return all_questions

def set_four():
    judging_vs_perceiving = [
        "organized, orderly",
        "flexible, adaptable",
        "plan, schedule",
        "unplanned, spontaneous",
        "regulated, structured",
        "easy-going, live and let live",
        "preparation, plan ahead",
        "go with the flow, adapt as you go",
        "control, govern",
        "latitude, freedom"
    ]
    all_questions.append(judging_vs_perceiving)

def print_all_questions():
    a_count = 0
    b_count = 0
    print("Answer with 'a' or 'b':\n")

    for i in range(0, 10, 2):  # Go through pairs (0&1, 2&3, ...)
        for category in all_questions:
            print(f"A: {category[i]}  |  B: {category[i + 1]}")
            answer = input("Your choice (a/b): ").strip().lower()
            if answer == 'a':
                a_count += 1
            elif answer == 'b':
                b_count += 1
            else:
                print("Invalid input, skipping question.\n")
        print()  # Newline between rounds

    print(f"Total A answers: {a_count}")
    print(f"Total B answers: {b_count}")
