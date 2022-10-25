const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");

const tmp = input.shift().split(" ").map(item => +item);
const R = tmp[0];
const C = tmp[1];


let map = [];


const dx = [0,0,-1,1];
const dy = [-1,1,0,0];

input.map(item => map.push(item.split('')));

let result = JSON.parse(JSON.stringify(map));

let minX = 10;
let maxX = 0;
let minY = 10;
let maxY = 0;



const test = (y,x) => {
    let count = 0;
    for(let i = 0; i < 4; i++) {
        let nextY = y+dy[i];
        let nextX = x+dx[i];
        if(nextY < 0 || nextX < 0 || nextX >= C || nextY >= R) { //범위에서 벗어나면 count증가시키고 continue
            count++;
            continue;
        }
        if(map[nextY][nextX] === '.') {
            count++;
        }
    }
    if(count >= 3) { //true라면 바다로 바뀜
        return true;
    }
    else {
        return false;
    }
}

const coordinate = (y, x) =>{
    minY = Math.min(minY,y);
    maxY = Math.max(maxY,y);
    minX = Math.min(minX,x);
    maxX = Math.max(maxX,x);
}

for(let i = 0; i < R; i++) {
    for(let j = 0; j < C; j++) {
        if(map[i][j] === 'X') { //땅일때만 검사함
            if(test(i,j)) { //true라면 바다로 바뀜
                result[i][j] = '.'; //
            }
            else { //false라면 그대로 땅이므로 땅의 x,y값 갱신
                coordinate(i,j);
            }
        }
    }
}



for(let i = minY; i <= maxY; i++) {
    let target = [];
    for(let j = minX; j <= maxX; j++) {
        target.push(result[i][j]);
    }
    console.log(target.join(' '));
}



