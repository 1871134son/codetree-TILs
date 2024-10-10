let output = '';
for (let i = 5; i <= 17; i++) {
    output += i + (i < 17 ? ` ` : ``);
}
console.log(output);