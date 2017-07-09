package assignment2;

interface interfaceStack{
//	static{
//		System.out.println("Inside a static block");
//	}
//	{
//		System.out.println("inside a instance");
//	}
	// we cannot define any block in interface whether it is static or instance block
}

abstract class Helloworld{
	static{
		System.out.println("Inside a static block");
	}
	{
		System.out.println("inside a instance");
	}
}
// static block will be executed firt and instance block will not be executed
class AnotherClass{
	static{
		System.out.println("Inside a static block");
	}
	{
		System.out.println("inside a instance");
	}
	AnotherClass(){
		System.out.println("inside constructor");
	}
	
}
// first static, second instance and third default constructor will be executed

public class StacandInterfaceDemo extends Helloworld{

	public static void main(String[] args) {
		AnotherClass a = new AnotherClass();

	}

}
