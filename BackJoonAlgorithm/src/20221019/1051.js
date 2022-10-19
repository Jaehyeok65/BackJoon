const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");

const [N, M] = input
    .shift()
    .split(" ")
    .map((item) => +item);

let size = Math.min(N,M)-1; //배열은 0부터 시작하므로 1을 빼줌

let check = false; //정사각형을 찾으면 true로 변환

let result = 1;

while(size > 0) {
    for(let i = 0; i < N-size; i++) {
        for(let j = 0; j < M-size; j++) {
            if(input[i][j] === input[i+size][j] && input[i][j] === input[i][j+size] && input[i][j] === input[i+size][j+size]) {
                result = (size+1) * (size+1);
                check = true;
            }
        }
    }
    if(check) break;
    size--;
}

console.log(result);

