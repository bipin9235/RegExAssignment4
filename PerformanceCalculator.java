/*
 * Task-18: Problem Description: Let us create a performance rating system to calculate the performance of each employee. Create an Employee class with an instance variable point: int with private access modifier.
			Generate getter and setter method of the instance variable.
	Registration ID: JIRSS1132
	Name: Bipin Kumar
 */
package ConstructorAndStaticKeyword;
import java.util.Scanner;

class Employee{
	private int point;

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
}
class PerformanceRating {

	private static final int outstanding=5;
	private static final int good=4;
	private static final int average=3;
	private static final int poor=2;
	
	static int calculatePerformance(Employee employee) {
		int point=employee.getPoint();
		if(point>=80&&point<=100)
		{
			return outstanding;
		}
		else if(point >=60 && point <=79) {
			return good;
		}
		else if(point >= 50 && point <= 59) {
			return average;
		}
		else if(point >=1 && point <=49)
		{
			return poor;
		}
		else
		{
			System.out.println("Invalid input!");
			return -1;
		}
		
	}
}

public class PerformanceCalculator{
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		Employee employee3=new Employee();
		System.out.print("Enter Point for Employee 1 : "); int point1=sc.nextInt();
		System.out.print("Enter Point for Employee 2 : "); int point2=sc.nextInt();
		System.out.print("Enter Point for Employee 3 : "); int point3=sc.nextInt();
		employee1.setPoint(point1);
		employee2.setPoint(point2);
		employee3.setPoint(point3);
		
		System.out.println(" Employee 1 Rating : "+PerformanceRating.calculatePerformance(employee1));
		System.out.println(" Employee 2 Rating : "+PerformanceRating.calculatePerformance(employee2));
		System.out.println(" Employee 3 Rating : "+PerformanceRating.calculatePerformance(employee3));
		
	}
}