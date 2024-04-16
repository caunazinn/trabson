let n = parseInt(prompt("Digite um número para gerar a sequência de Fibonacci:"));

let n1 = 0;
let n2 = 1;
let n3 = n1 + ", " + n2;

for (let i = 3; i <= n; i++) {
    n3 += ", " + (n1 + n2);
    let temp = n2;
    n2 = n1 + n2;
    n1 = temp;
}

console.log('Sequência de Fibonacci até ' + n + ' é: '+ n3);
