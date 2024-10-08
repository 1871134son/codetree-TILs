const fs = require("fs");

let input = Number(fs.readFileSync(0).toString());

if (input < 1 || input > 100) {
    console.log("입력값이 범위를 벗어났습니다.");
}
else {
    let result = input + 2;
    console.log(result);
}