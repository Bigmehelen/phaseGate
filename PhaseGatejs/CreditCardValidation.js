function cardNumber(theNumber) {
    const nums = theNumber.split('');

    if (nums.length < 13 || nums.length > 16) {
        return "Invalid number";
    }

    if (nums.length >= 13 && nums.length <= 16) {
        if (nums[0] === '4') {
            return "Visa card";
        } else if (nums[0] === '5') {
            return "Master Card";
        } else if (nums[0] === '3' && nums[1] === '7') {
            return "American Express card";
        } else if (nums[0] === '6') {
            return "Discovery Card";
        } else {
            return "Invalid card";
        }
    }

    return "hello";
}

function checkValidation(theNumber) {
    const cardNumbers = cardNumber(theNumber);

    const cardNums = theNumber.split('').map(Number);

    let sum = 0;
    let shouldDouble = false;

   
    for (let i = cardNums.length - 1; i >= 0; i--) {
        let digit = cardNums[i];
        if (shouldDouble) {
            digit *= 2;
            if (digit > 9) digit -= 9;
        }
        sum += digit;
        shouldDouble = !shouldDouble;
    }

    return sum % 10 === 0 ? "Valid" : "Invalid";
}

function printCreditCard(theNumber) {
    const theCardNumber = cardNumber(theNumber);
    const validity = checkValidation(theNumber);

    const message = `
**************************************************
** Credit Card Type:         ${theCardNumber}
** Credit Card Number:       ${theNumber}
** Credit Card Digit Length: ${theNumber.length}
** Credit Card Validity:     ${validity}
**************************************************
`;
    return message;
}


(function main() {
    const number = "3799831619690403";
    console.log(printCreditCard(number));
})();
