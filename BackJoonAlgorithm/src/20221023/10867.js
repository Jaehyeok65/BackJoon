const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");

const N = input.shift();

let array = input[0].split(" ").map(item => +item);
array.sort((a,b) => {
    if(a > b) return 1;
    if(a === b) return 0;
    if(a < b) return -1;
})
const result = [...new Set(array)];
console.log(result.join(' '));