const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");


const [a, b, c] = input.shift().split(" ").map(item => +item);
let count = 0; //같은 눈이 나온 개수
let result = 0;
if(a === b && b === c) {
    result = 10000 + a * 1000;
}
else if(a === b || b === c || a === c) {
    if(a === b) {
        result = 1000 + a * 100;
    }
    else if(b === c) {
        result = 1000 + b * 100;
    }
    else if(a === c) {
        result = 1000 + c * 100;
    }
}
else {
    result = Math.max(Math.max(a,b),c) * 100;
}

console.log(result);