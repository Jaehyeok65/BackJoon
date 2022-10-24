const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");

const N = input.shift();

input.sort((a,b) => {
    const prev = (Number)(a.split(" ")[3]);
    const next = (Number)(b.split(" ")[3]);
    if(prev > next) return 1;
    if(prev === next) {
        const prev1 = (Number)(a.split(" ")[2]);
        const next1 = (Number)(b.split(" ")[2]);
        if(prev1 > next1) {
            return 1;
        }
        if(prev1 === next1) {
            const prev2 = (Number)(a.split(" ")[1]);
            const next2 = (Number)(b.split(" ")[1]);
            if(prev2 > next2) {
                return 1;
            }
            if(prev2 === next2) {
                return 0;
            }
            if(prev2 < next2) {
                return -1;
            }
        }
        if(prev1 < next1) {
            return -1;
        }
    }
    if(prev < next) return -1;
});

console.log(input[N-1].split(" ")[0]);
console.log(input[0].split(" ")[0]);