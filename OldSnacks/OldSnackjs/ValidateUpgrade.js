const validateCard = function(numbers){
	
	for(let count = 0; count < numbers.length; count++){
		if(isNaN(numbers[count])){
			let exception = "Invalid Input";
			return exception; 
		}

	}
	
		if(numbers[0] == 4 && numbers.length == 16){
			let object = {
			issuer: "Visa",
			Valid: true
			};
			return object;
		}
		

		if(numbers[0] == 5 && numbers.length == 16){
			let object = {
			issuer: "Master",
			Valid: true
			};
			return object;
		}
		

		if(numbers[0] == 6 && numbers.length == 16){
			let object = {
			issuer: "Discover",
			Valid: true
			};
			return object;
		}
		

		if(numbers[0] == 3 && numbers.length == 15){
			let object = {
			issuer: "American Express",
			Valid: true
			};
			return object;
		}
		

		if((numbers[0] < 3 || numbers[0] > 6) && (numbers.length < 15 || numbers.length > 16)){
			let inValid = {
			issuer: "Invalid Length",
			Valid: false
			};
			return inValid;
		}

		if((numbers[0] >= 3 || numbers[0] <= 6) && (numbers.length < 15 || numbers.length > 16)){
			let inValid = {
			reason: "Invalid Length",
			Valid: false
			};
			return inValid;
		}

}

let array = [3,3,7,4,8,9,4,2,3,8,7,6,5,4,3,8,8];
console.log(validateCard(array));

