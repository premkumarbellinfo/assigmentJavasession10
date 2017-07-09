package assignment2;

class Parent{
	int wheels = 4;
	public String carType;
	public String company;
	
	void carColour(){
		System.out.println("this method says car colour type");
	}
	
	public int noOfSeats(){
		System.out.println("this method says number of seats in car");
		return 0;
	}
}		
class Child extends Parent{

	int wheels = 5;
	int mirror = 2;
	@Override
	void carColour() {
		// TODO Auto-generated method stub
		System.out.println("this method says car colour in child class");
	}
	void BreakSystem(){
		System.out.println("this methos says the breaking system of car");
	}
	
	
	
}



public class Question7and8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		System.out.println(c.wheels);
		c.carColour();
		c.noOfSeats();
		System.out.println(c.mirror);
		c.BreakSystem();
		
		Parent p = new Child();
		System.out.println(p.wheels);
		//System.out.println(p.mirror);
		//p.Breaksystem(); the specific methods and variable to child class cannot be accessed when using parent reference variable and asign to child class
		p.carColour();// overrided methods of child class will be executed.
		p.noOfSeats();//only methods and variables of parent class will be executed
		
	}

}
