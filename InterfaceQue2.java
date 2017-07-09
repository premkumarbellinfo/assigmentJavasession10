package assignment2;

public class InterfaceQue2 {

	public static void main(String[] args) {
		Dem d = new Dem();
		System.out.println(d.print());
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//The return type is incompatible with interface3.print()
		//Duplicate method print() in type Dem
		
	}
	

}

interface interface3{
	public int print();
}

interface interface4{
	public String print();
}

class Dem implements interface3,interface4{

	//@Override
//	public String print() {
//		// TODO Auto-generated method stub
//		return "prem";
//	}
	//public String print(){
		//return "prem";
	//}
	//Answer we cannot use a method with different return type and same signatures. 
}