let num1 = parseInt(prompt("Digite o primeiro número: "));
let num2 = parseInt(prompt("Digite o segundo número: "));
let a = num1;
let b = num2;
let resto;

while (b !== 0) {
    resto = a % b;
    a = b;
    b = resto;
}

console.log("O MDC é: " + a);
