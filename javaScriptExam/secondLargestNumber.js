let prompt = require(`prompt-sync`)();
let log = console.log;

function secondLargesetNumber(){
    let count = 0
    let largesetNumber = Number.MIN_SAFE_INTEGER;
    let secondLargesetNumber = Number.MIN_SAFE_INTEGER;

    while (count >= 0) {
        userInput = parseInt(prompt("Enter a number and -1 when done: "));
        if (userInput == -1) {
            break;
        }

        if (userInput > largesetNumber) {
            largesetNumber = userInput;
        }
        if (userInput < largesetNumber && userInput > secondLargesetNumber) {
            secondLargesetNumber = userInput;
        }
    }
    count++
    return secondLargesetNumber;    
}

log(secondLargesetNumber());

