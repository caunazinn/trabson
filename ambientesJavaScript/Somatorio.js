let n = parseInt(prompt("Informe a quantidade de números:"));
let soma = 0;

for (let i = 0; i < n; i++) {
    let numero = parseInt(prompt("Informe um número:"));
    soma += numero;
}

console.log("O somatório dos números é:", soma);