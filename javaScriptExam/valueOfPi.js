let prompt = require(`prompt-sync`)();
let log = console.log;

function findValueOfPi(){
    let counter = 0;
    let number = 4;
    let denominator = 1;
    let sum = 0;
    for (let i = 0; i < 200000; i++) {
        if (i%2 == 0) {
            sum+= number/denominator;
            log(`${i.toString().padEnd(10)} ${sum.toFixed(5).toString().padStart(20)}`);
        }
        else {
            sum-= number/denominator;
            log(`${i.toString().padEnd(10)} ${sum.toFixed(5).toString().padStart(20)}`);
        }
        if(sum < 3.14159){
            counter++;
        }
        denominator+=2;
    }
    log(counter);
    return sum;
}

findValueOfPi();

