package javacode;

/**
* Name: Meriam G. Licanda
* Section: IT Dept
* Year: 4th Year
*/

import java.util.Scanner;
public class Main {

  public static void main (String[]args){

	Scanner console = new Scanner (System.in);

   int yn = 0, total = 0, gradonimu = 0, i = 0;

do{
	System.out.println ("Do you want to enter a grade?");
	System.out.println ("Press 1 == YES");
	System.out.println ("Press 2 == NO");
   	yn = console.nextInt();

if ( yn == 1){
	System.out.println ("You chose YES");
	System.out.println ("Please enter a grade:");
	gradonimu = console.nextInt();
	total += gradonimu;
	i++;
}else{
	System.out.println ("You chose NO, Thank you!!"); }
}while (yn == 1);

	total = total / i;

	System.out.print ("Total average is: " +total);

	}

}
