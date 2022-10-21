const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");


let [N, m, M, T, R] = input.shift().split(" ").map(item => +item);



let time = 0;
let current = m; //현재 맥박 == 초기 맥박을 대입

while(N > 0) { //운동 횟수가 0보다 크면 계속 진행
    if(current === m && current + T > M) {
        time = -1;
        break;
    }
    else if(current + T <= M) { //현재 맥박에서 운동했을 때 M보다 작다면 운동 가능
        N-=1;
        current = current + T;
    }
    else { //운동이 불가능할 때는 휴식으로 맥박을 회복
        current = current - R;
        if(current < m) { //
            current = m;
        }
    }
    time++;
}

console.log(time);