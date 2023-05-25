function checkPassword(password) {
    if (password.length < 8) {
      return "Kata sandi minimal 8 karakter";
    }
  
    if (password.length > 32) {
      return "Kata sandi maksimal 32 karakter";
    }
  
    if (/^\d/.test(password)) {
      return "Karakter awal tidak boleh angka";
    }
  
    if (!/\d/.test(password)) {
      return "Harus memiliki angka";
    }
  
    if (!/[a-z]/.test(password) || !/[A-Z]/.test(password)) {
      return "Harus memiliki huruf kapital dan huruf kecil";
    }
  
    return "Kata sandi valid";
  }
  
  // Contoh penggunaan
  console.log(checkPassword("5andiwara")); // Karakter awal tidak boleh angka
  console.log(checkPassword("sandiwar4")); // Harus memiliki huruf kapital dan huruf kecil
  console.log(checkPassword("Sandiwar4")); // Kata sandi valid
  