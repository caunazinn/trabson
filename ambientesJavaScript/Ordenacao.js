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
console.log("Array ordenado:", ordem);
