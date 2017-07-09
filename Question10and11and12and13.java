package assignment2;

class Accessmodifiers{
	private int i = 10;
	public int j = 20;
	protected int k = 30;
	static int l = 40;
	final int m = 50;
	
	private void display1(){
		System.out.println("inside private method");
	}
	
	public void display2(){
		System.out.println("inside public method");
	}
	
	protected void display3(){
		System.out.println("inisde protected method");
	}
	
	static void display4(){
		System.out.println("inside static method");
	}
}
public class Question10and11and12and13 {

	public static void main(String[] args) {
		
		Accessmodifiers am = new Accessmodifiers();
		//System.out.println(am.i); private variables is not accesible
		System.out.println(am.j);
		System.out.println(am.k);
		System.out.println(am.l);
		System.out.println(am.m);
		
		//am.display1(); private methods not accesible
		am.display2();
		am.display3();
		am.display4();
		
		
		//constructors cannot be overridded
		//constructors can be overloaded
		//java follows pass by value
	}

}
