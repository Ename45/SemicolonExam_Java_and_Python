let prompt = require(`prompt-sync`)();
let log = console.log;

function numberOfOccurrence(word){
    let wordStore = {};
    for (let letter of word) {
        if (letter in wordStore) {
            wordStore[letter]++;
        }
        else {
            wordStore[letter] = 1;
        }
    }
    log({wordStore});

    let result = `letter "s" occurs ${wordStore.s} times\nletter "i" occurs ${wordStore.i} times`
    return result;
}

let word = "Mississippi";
log(numberOfOccurrence(word));
