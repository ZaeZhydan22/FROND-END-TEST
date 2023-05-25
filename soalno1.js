function displayNumbers(N) {
    let output = "";
    for (let i = 1; i <= N; i++) {
      if (i % 3 === 0 || i % 7 === 0) {
        if (i % 3 === 0 && i % 7 === 0) {
          output += "Z, ";
        } else {
          output += i + ", ";
        }
      }
    }
    console.log(output.slice(0, -2));
  }
  
  displayNumbers(30);
  