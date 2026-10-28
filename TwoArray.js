
  function TwoArray(number){
    for(let rows = 0; rows < number.length; rows++){
        for(let index = 0; index < number[rows].length; index++){
            for(let count =index +1; count < number[rows].length; count++){
                let temp = number[rows][index];
                number[rows][index] = number[rows][count];
                number[rows][count] = temp;

            }
        }
    }
    return number;
    }
  

    let number = [
        [1,2,3],
        [4,5,6],
        [7,8,9]
    ];

    let result = TwoArray(number);
      console.log(result);
     
     

