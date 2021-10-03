package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Write a program to create a calculator that can Add, Subtract, Multiply, and Divide 2 numbers entered by the user. Also, add an option to exit out from the program.
//
//		  OPTIONS//
//		1. Add
//		2. Subtract
//		3. Multiply
//		4. Divide
//		5. Exit
//
//		1. Write different methods for each module (add, subtract, multiply, and divide).
//
//		2. Use switch/case to call the particular method.
//
//		3. Take input inside the methods to perform the related operation.
//
//		4. Return the answer and display it inside the main method.
//
//		5. Display a default message (ex. "Invalid Entry, Try Again") if any number other than 1-5 is entered by the user
		
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the operation you would like; +, -, *, /, and exit :");
	
		//reading the user input
		String operation=input.next();
		//equals is a method for declaring a conditional equation. 
		//if input is not exit then while loop will be activated
		while(!operation.equals("exit")) {
			//according to the user input switch stement will call the related method
			switch(operation){
				case "+":
					addition();
					break;
				case "-":
					subtraction();
					break;
				case "*":
					multipication();
					break;
				case "/":
					division();
					break;
				default:				
					break;
			}
			//user will be prompt for exit or continue
			System.out.println("Exit or choose another operation; Add, Subtract, Multiply, Divide and Exit :");
			input.nextLine();
			//reading the user input
			operation=input.next();
			
		}exit();
		
	}
	
	public static void addition() {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the first number for the calculator:");
		int num1=input.nextInt();
		while(num1>5 || num1<1) {
			System.out.println("Invalid Entry, Try Again");
			input.nextLine();
			num1=input.nextInt();		
		}
		System.out.println("Enter the second number for the calculator:");
		input.nextLine();
		int num2=input.nextInt();
		while(num2>5 || num2<1) {
			System.out.println("Invalid Entry, Try Again");
			input.nextLine();
			num2=input.nextInt();	
		}
		int sum=num1+num2;
		System.out.println(sum);
	}
	
	public static void subtraction() {
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the first number for the calculator:");
		int num1=input.nextInt();
		while(num1>5 || num1<1) {
			System.out.println("Invalid Entry, Try Again");
			input.nextLine();
			num1=input.nextInt();		
		}
		System.out.println("Enter the second number for the calculator:");
		input.nextLine();		
		int num2=input.nextInt();
		while(num2>5 || num2<1) {
			System.out.println("Invalid Entry, Try Again");
			input.nextLine();
			num2=input.nextInt();	
		}
		int difrence=num1-num2;
		System.out.println(difrence);
		
	}
	public static void multipication() {
	
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the first number for the calculator:");
		int num1=input.nextInt();
		while(num1>5 || num1<1) {
			System.out.println("Invalid Entry, Try Again");
			input.nextLine();
			num1=input.nextInt();		
		}
		System.out.println("Enter the second number for the calculator:");
		input.nextLine();		
		int num2=input.nextInt();
		while(num2>5 || num2<1) {
			System.out.println("Invalid Entry, Try Again");
			input.nextLine();
			num2=input.nextInt();	
		}
		int mult=num1*num2;
		System.out.println(mult);
	
	}
	public static void division() {
	
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the first number for the calculator:");
		int num1=input.nextInt();
		while(num1>5 || num1<1) {
			System.out.println("Invalid Entry, Try Again");
			input.nextLine();
			num1=input.nextInt();		
		}
		System.out.println("Enter the second number for the calculator:");
		input.nextLine();		
		int num2=input.nextInt();
		while(num2>5 || num2<1) {
			System.out.println("Invalid Entry, Try Again");
			input.nextLine();
			num2=input.nextInt();	
		}
		int div=num1/num2;
		System.out.println(div);
		
	}
	public static void exit() {
		System.out.println("Sorry to see you go :(");
	}

}
