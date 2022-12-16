function nonConstructibleChange(coins) {
    // if no coins return 1
      coins.sort((a,b) => a - b);
      
      let currentValue = 0;
      for (let coin of coins) {
          if (coin > currentValue + 1) return currentValue + 1;
          
          currentValue += coin;
      }
      
      return currentValue + 1;
  }

   array = [2, 3, 8 ,5 ,6 ];
   array2 = [1, 2, 5]
   array3 = [5, 7, 1, 1, 2, 3, 22]
console.log(   nonConstructibleChange(array2))
