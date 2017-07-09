package assignment2;

abstract class cars{
	
	// concrete methods.
	
	public int wheels(){return 4;}	
	private void a1(){
		System.out.println("this is private method");
		}
	protected void a2() {
		System.out.println("this is protected method");
		}
	void a3() {
		System.out.println("this is default method");
		}
	
	//dummy methods
	
	abstract public void a4();
	abstract protected void a5();
	abstract void a6();
	
	// we cannot use private methods in abstract
	
		
}

interface car1{
	
	public void b1();
	static void b2() {System.out.println("inside interface 1");}
	void b3();
	// private and protected methods are not allowed in interfaces.
}

interface car2{
	public void c1();
	static void c2(){System.out.println("inside interface 2");}
	void c3();
	// private and protected methods are not allowed in interfaces.
}

class carclass extends cars implements car1,car2{

	@Override
	public void c1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void c3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void b3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void a5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void a6() {
		// TODO Auto-generated method stub
		
	}

	

}

public class Question6 {

	public static void main(String[] args) {
		 carclass a = new carclass();
		a.wheels(); // public method of abstract class can be accessed.
		//a.a1(); // private methods of abstract class are not accessible.
		a.a2();	// protected methods of abstract class are accessible.
		a.a3();	// default methods of abstract class are accessible.
		a.a4();	//dummy public, protected, and default methods that are accessible.
		a.a5();
		a.a6();
		
		a.b1();// public method of interface1 are accessible
		//bobj.b2(); // static methods of interface1 are not accessible.
		a.b3(); //default methods of interface1 are accessible
		
		a.c1(); // public method of interface2 are not accessible.
		//bobj.b22(); // static methods of interface 2 are not accessible.
		a.c3(); // default methods of interface 2 are accessible.

	}

}
