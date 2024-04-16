let num = parseInt(prompt("Digite um número para ver se é primo:"));
if (num < 2) {
    console.log("O numero não é primo.");
} else {
    let primo = true;
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) {
            primo = false;
            break;
        }
    }
    if (primo) {
        console.log("O numero é primo.");
    } else {
        console.log("O número não é primo.");
    }
}