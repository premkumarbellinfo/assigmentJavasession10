package assignment2;

public class InterfaceQue1 {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();// As the two print methods are with same signature and type
		//only one implementation is necessary and the output of the program is Hello World

	}

}

 interface interface1{
	public void print();
}
 
interface interface2{
	public void print();
}

class Demo implements interface1,interface2{
	public void print(){
		System.out.println("hello world");
	}
		
}