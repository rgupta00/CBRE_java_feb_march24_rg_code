package q2;

import java.util.Scanner;

/*
 * Write a program called GradesAverage, which prompts user for 
 * the number of students, reads it from the keyboard,
 *  and saves it in an int variable called numStudents. 
 *  
 *  It then prompts user for the grades of each of the students and
 *   saves them in an int array called grades. 
 *   Your program shall check that the grade is between 0 and 100. A sample session is as follow:

Enter the number of students: 3 
Enter the grade for student 1: 55 
Enter the grade for student 2: 108 
Invalid grade, try again...
Enter the grade for student 2: 56 
Enter the grade for student 3: 57 The average is: 56.0

 */

public class AssignQ2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int numStudents;
		int marks;
		System.out.println("PE number of students....");
		numStudents= scanner.nextInt();
		double average=0.0;
		double total=0.0;
		
		int grades[]=new int[numStudents];
		
		int counter=0;
		while(counter<numStudents) {
			System.out.println("Enter the grade for student  "+ (counter+1));
			marks=scanner.nextInt();
			if(marks>100 || marks<0 ) {
				System.out.println("Invalid grade, try again...");
				continue;
			}
			grades[counter++]= marks;
		}
		
		for(int grade: grades) {
			total+=grade;
		}
		System.out.println("total marks: "+ total);
		
		average=total/grades.length;
		
		System.out.println("average: "+ average);
		
	}
}






