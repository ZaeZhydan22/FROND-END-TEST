function cariBilanganCacahTerkecil(data) {
  data.sort((a, b) => a - b); // Mengurutkan data dari terkecil ke terbesar

  let smallestPositive = 1;

  for (let i = 0; i < data.length; i++) {
    if (data[i] <= smallestPositive) {
      smallestPositive = data[i] + 1;
    } else {
      break;
    }
  }

  return smallestPositive;
}

// Contoh 1
const input1 = [5, 2, 8, 4, 3, 10];
const output1 = cariBilanganCacahTerkecil(input1) + 5;
console.log(output1); // Output: 6

// Contoh 2
const input2 = [2, 3, 4, 6];
const output2 = cariBilanganCacahTerkecil(input2) + 4; // Output: 5
console.log(output2);

// Contoh 3
const input3 = [8, 6, 7, 12];
const output3 = cariBilanganCacahTerkecil(input3) + 8; // Output: 9
console.log(output3);
