// Title : CODSOFT INTERNSHIP TASK1 (Student Grade Calculator program)
// Author : Vartak Omkar Ajit

import java.util.*;
public class Calculator
{

	public static void main(String[] args)
	{
		int english,marathi,maths,science,history,geography,sanskrit,total;
		String name;
		float percentage;
		
		System.out.println("\n\tWelcome To the Student Grade Calculator");
		while(true)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\tEnter Name Of the Student : ");
		name = sc.nextLine();
		System.out.println("\n\tEnter Marks Obtained In English Subject Out Of 100 : ");
		english = sc.nextInt();
		System.out.println("\n\tEnter Marks Obtained In Marathi Subject Out Of 100 : ");
		marathi = sc.nextInt();
		System.out.println("\n\tEnter Marks Obtained In Mathematics Subject Out Of 100 : ");
		maths = sc.nextInt();
		System.out.println("\n\tEnter Marks Obtained In Science Subject Out Of 100 : ");
		science = sc.nextInt();
		System.out.println("\n\tEnter Marks Obtained In History Subject Out Of 100 : ");
		history = sc.nextInt();
		System.out.println("\n\tEnter Marks Obtained In Geography Subject Out Of 100 : ");
		geography = sc.nextInt();
		System.out.println("\n\tEnter Marks Obtained In Sanskrit Subject Out Of 100 : ");
		sanskrit = sc.nextInt();
		total = (english+marathi+maths+science+history+geography+sanskrit);
		System.out.println("\n\tTotal marks Obtained are : "+total);
		percentage = (total)/7;
		System.out.println("\n\tAverage Of the Marks : "+percentage);
		
		
		if(percentage>90 && percentage<=100)
		{
			System.out.println("\n\tCongratulations You have achieved A++ grade.... ");
		}
		else if(percentage>80 && percentage<=90)
		{
			System.out.println("Congratulations you have achieved A+ grade try for A++ grade next Time....");
		}
		else if(percentage>70 && percentage<=80)
		{
			System.out.println("You have achieved B+ grade.Try to get A+ next Time..... ");
		}
		else if(percentage>60 && percentage<=70)
		{
			System.out.println("You have achieved B grade. ");
		}
		else if(percentage>50 && percentage<=60)
		{
			System.out.println("You have achieved c grade. Need to improve Your Performance.... ");
		}
		else if(percentage>40 && percentage<=50)
		{
			System.out.println("You have achieved D grade. Need to improve Your Performance.... ");
		}
		else
		{
			System.out.println("Sorry Student.You are Failed in this academic year...... ");
		}
		System.out.println("Thank you....visit again....");
		System.out.println(".......................................................................");
		}
		
		
		
		
		
		
		
		
		
		

		

	}

}
