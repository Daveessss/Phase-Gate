public class TwoArray{
    public static int[][] TwoArray(int [][] number){
    for(int rows = 0; rows < number.length; rows++){
        for(int index = 0; index < number[rows].length; index++){
            for(int count =index +1; count < number[rows].length; count++){
                int temp = number[rows][index];
                number[rows][index] = number[rows][count];
                number[rows][count] = temp;

            }
        }
    }
    return number;
    }
  


public static void main(String [] args){
    int [][] number = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };

    int [][]result = TwoArray(number);
    for(int index = 0; index < result.length; index++){
        for(int count = 0; count < result[index].length; count++){
        System.out.print(result[index][count] + " ");
     }
    System.out.println();
   }
 } 
}      

