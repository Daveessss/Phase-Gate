import java.util.Scanner;
import java.util.ArrayList;
public class Studentgrade{
    public static void main(String [] args){
   
     int StudentScore = 0;
   Scanner input = new Scanner(System.in);
    
    System.out.println("Hello, how many students do you have");
    int NumberOfStudents = input.nextInt();

    System.out.println("How many subjects do they take");
    int NumberOfSubjects = input.nextInt();

    		int [][] array = new int [NumberOfStudents][NumberOfSubjects];
		int sum = 0;
		int [] sums = new int [NumberOfStudents];
		double [] average = new double [NumberOfStudents];
		int [] position = new int [NumberOfStudents];
		
        System.out.println();
		System.out.println();
		
        for(int index = 0; index < array.length; index++){
			System.out.println("Entering score for student " + (index + 1));
			
            for(int count = 0; count < array[index].length; count++){
				System.out.println("Enter score for subject " + (count + 1));
				int score = input.nextInt();
				
                if(score >= 0 && score <= 100){
					
                    System.out.println("Saving >>>>>>>>>>>>>>>>>>>>");
					
                    System.out.println("Saved successfully");
  					System.out.println();
					
                    array[index][count] = score;
					sum += score;
				}
				else{
					System.out.println("Invalid input, Enter a score from 0-100");
					break;
  }
}
}
}
}

