const fs = require("fs");

let score = Number(fs.readFileSync(0).toString().trim());

if(score >= 1 && score <= 1000){
    console.log(`Your score is ${score} point.`)
}
else{
    console.log(`입력값이 유효한 범위를 벗어났습니다.`)
}