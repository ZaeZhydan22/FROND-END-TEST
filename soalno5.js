function generatePattern(N) {
    if (N % 2 === 0) {
      console.log("N harus bilangan ganjil!");
      return;
    }
  
    var middle = Math.floor(N / 2) + 1;
  
    for (var i = 1; i <= N; i++) {
      if (i <= middle) {
        for (var j = 1; j <= i; j++) {
          process.stdout.write(j + " ");
        }
      } else {
        for (var j = 1; j <= N - i + 2; j++) {
          process.stdout.write(j + " ");
        }
      }
  
      console.log();
    }
  }
  
  // Set the value of N
  var N = 7;
  
  // Call the function with the given value
  generatePattern(N);
  