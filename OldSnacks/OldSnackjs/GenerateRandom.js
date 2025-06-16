const prompt = require("prompt-sync")();

const generateRandom = function(numberOne){

	let randomGuess = Math.floor(Math.random() *10)
	let randomGuessTwo = Math.floor(Math.random() *10)

	let result = 0
	let check = 0

	for(let count = 1; count <= 10; count++){
		
		 randomGuess = Math.floor(Math.random() *10)
		 randomGuessTwo = Math.floor(Math.random() *10)

		if(randomGuess > randomGuessTwo ){
		console.log(`${randomGuess} - ${randomGuessTwo}`)
		result = randomGuess - randomGuessTwo
		}

		let user = Number(prompt("Enter correct answer: "))	
		check++

		if (user == result && check == 2){
		console.log("correct answer")
		
		
		} else if (user < result || user > result && check == 2){
			console.log("Try again")
		}

	}
	console.log("your final Score is: ", check)

}
generateRandom(Math.random(20, 10))