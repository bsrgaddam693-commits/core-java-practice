package logicalstatements;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter student marks:");
		
		int marks=sc.nextInt();
		
		if (marks < 0 || marks > 100) {
        System.out.println("Invalid marks");
	}else if(marks>=90)

	{
		System.out.println("A Grade");
	}else if(marks>=80)
	{
		System.out.println("B Grade");
	}

	else if(marks>=70)
	{
		System.out.println("C Grade");
	}

	else if(marks>=60)
	{
		System.out.println("D Grade");
	}else
	{
		System.out.println("Fail");
	}sc.close();
}}