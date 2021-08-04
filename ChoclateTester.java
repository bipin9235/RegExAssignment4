/*
 * #Task-16: Problem Description: ABC Confectionary is a chocolate manufacturer. Every chocolate which is
	manufactured will be with a default weight and cost. The cost and weight might be modified later based on
	business needs.
	
	Registration ID: JIRSS1132
	Name: Bipin Kumar
 */
package ConstructorAndStaticKeyword;

class Chocolate{
	// class data memebers
	int barCode;
	String name;
	int weight;
	int cost;
	
	// class constructor initialize the data members
	Chocolate(){
		this.barCode=101;
		this.name="Cadbury";
		weight=12;
		cost=10;
	}
	
	// class consturctor parametrized
	Chocolate(int barCode, String name,double weight,double cost ){
		this.barCode=barCode;
		this.name=name;
		this.weight=(int)weight;
		this.cost=(int)cost;
	}
	
	// Getter and setter methods
	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = (int)weight;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost =(int) cost;
	}
	
}



public class ChoclateTester {

	public static void main(String[] args) {
		Chocolate chocolateOne=new Chocolate();// create an object of Chocolate
		System.out.println("Chocolate details with initialized value");
		System.out.println(" Bar Code : "+chocolateOne.getBarCode()+"\n Name : "+chocolateOne.getName()+"\n Weight : "+chocolateOne.getWeight()+"\n Cost : "+chocolateOne.getCost());
		
		chocolateOne.setBarCode(102);
		chocolateOne.setName("Hershey's");
		chocolateOne.setWeight(24);
		chocolateOne.setCost(50);
		System.out.println("\nChocolate details after modification");
		System.out.println(" Bar Code : "+chocolateOne.getBarCode()+"\n Name : "+chocolateOne.getName()+"\n Weight : "+chocolateOne.getWeight()+"\n Cost : "+chocolateOne.getCost());
	}

}
