function searchKeywords(text) {
    const keywords = ['sang gajah', 'serigala', 'harimau'];
    let output = '';
  
    for (let i = 0; i < keywords.length; i++) {
      const keyword = keywords[i];
      const regex = new RegExp(keyword, 'gi');
      const matches = text.match(regex);
  
      if (matches) {
        output += matches.join(' - ') + ' - ';
      }
    }
  
    output = output.slice(0, -3); // Menghapus tanda hubung di akhir
    return output;
  }
  
  const input = "Berikut adalah kisah sang gajah. Sang gajah memiliki teman serigala bernama DoeSang. Gajah sering dibela oleh serigala ketika harimau mendekati gajah.";
  const output = searchKeywords(input);
  console.log(output);
  