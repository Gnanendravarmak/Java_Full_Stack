let num = 454;
let temp = num; 
let rev = 0;
let rem;

while (num > 0) {
    rem = num % 10;
    rev = rev * 10 + rem;
    num = Math.floor(num / 10);
}

if (temp === rev) {
    console.log("palindrome");
} else {
    console.log("Not a palindrome");
}
