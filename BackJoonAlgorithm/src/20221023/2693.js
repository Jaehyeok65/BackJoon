const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");


const Test = input.shift();

for(let i = 0; i < Test; i++) {
    let target = input[i].split(" ").map(item => +item);
    target.sort((a,b) => {
        if(a < b) return 1;
        if(a === b) return 0;
        if(a > b) return -1;
    });
    console.log(target[2]);
}