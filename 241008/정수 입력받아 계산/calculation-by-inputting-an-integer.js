const fs = require("fs");

// 입력 받기
let a = Number(fs.readFileSync(0).toString().trim());

// 입력값 검증 및 계산
if (a >= 1 && a <= 100) {
    // 계산: a에 2를 곱하고 3을 더함
    let result = a * 2 + 3;
    
    // 결과 출력
    console.log(result);
} else {
    console.log("입력값이 유효한 범위를 벗어났습니다.");
}