const allQuestions = [];

function setOne(){
    const extrovertedEVsIntrovertedI = [
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
    ];

    allQuestions.push(extrovertedEVsIntrovertedI);
    return allQuestions;
}

function setTwo(){
    const sensingSVsIntuitiveN = [
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
    ];

    allQuestions.push(sensingSVsIntuitiveN);
    return allQuestions;
}

function setThree(){
    const thinkingTVsFeelingF = [
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
    ];

    allQuestions.push(thinkingTVsFeelingF);
    return allQuestions;
}

function setFour(){
    const judgingJVsPerceptionP = [
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
    ];
    allQuestions.push(judgingJVsPerceptionP);
}

(function main()printAllQuestions(){
    let aCount = 0;
    let bCount = 0;

    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });

    function askQuestion(query) {
        return new Promise(resolve => rl.question(query, answer => resolve(answer.trim().toLowerCase())));
    }

    for (let count = 0; count < 10; count += 2) {
        for (let i = 0; i < allQuestions.length; i++) {
            const currentSet = allQuestions[i];
            const optionA = currentSet[count];
            const optionB = currentSet[count + 1];
            const answer = await askQuestion(`A: ${optionA} \nB: ${optionB} \nEnter 'a' or 'b': `);

            if (answer === 'a') {
                aCount++;
            } else if (answer === 'b') {
                bCount++;
            } else {
                console.log("Invalid input. Exiting...");
                rl.close();
                return;
            }
        }
        console.log();
    }

    rl.close();

    console.log(`Total A Answers: ${aCount}`);
    console.log(`Total B Answers: ${bCount}`);
}
