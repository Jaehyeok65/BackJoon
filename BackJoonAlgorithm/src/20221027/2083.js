const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");

input.forEach(item => {
    if(item !== '# 0 0') {
        let data = item.split(" ");
        if(+data[1] > 17 || +data[2] >= 80) {
            console.log(data[0] + " Senior");
        }
        else {
            console.log(data[0] + " Junior");
        }
    }
})