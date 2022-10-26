const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n").map(item => +item);

let N = input[0];
let count = 0;

if(N === 1 || N === 3) {
    count = -1;
    console.log(count);
    return;
}

while(N > 0) {
    
    if(N % 5 === 0 || N % 2 === 1) {
        count++;
        N -= 5;
    }
    else if(N % 2 === 0){
        count++;
        N -= 2;
    }
}

console.log(count);




