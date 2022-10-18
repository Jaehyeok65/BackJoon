const fs = require('fs');
let input = fs.readFileSync("./input.txt").toString();

let zerocount = 0;
let onecount = 0;

for(let i = 0; i < input.length; i++) { //0을 1로 바꾸기
    if(input[i] === '0') {
        while(i < input.length) {
            if(input[i] === '1') break;
            i++;
        }
        zerocount++;
    }
}

for(let i = 0; i < input.length; i++) {
    if(input[i] === '1') {
        while(i < input.length) {
            if(input[i] === '0') break;
            i++;
        }
        onecount++;
    }
}

console.log(Math.min(zerocount,onecount));