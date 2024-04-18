<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ordenação</title>
    <script>
const input = prompt("Digite os números: ");
const array = input.split(' ').map(Number);

const quickSort = (array) => {
  if (array.length <= 1) {
    return array;
  }

  const pivot = array[Math.floor(array.length / 2)];
  const left = [];
  const right = [];

  for (let i = 0; i < array.length; i++) {
    if (i !== Math.floor(array.length / 2)) {
      if (array[i] < pivot) {
        left.push(array[i]);
      } else {
        right.push(array[i]);
      }
    }
  }

  return [...quickSort(left), pivot, ...quickSort(right)];
};

const ordem = quickSort(array);
document.write("Numeros em ordem: " + ordem);

    </script>
</head>
<body>
    
</body>
</html>
