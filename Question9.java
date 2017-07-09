package assignment2;
interface birds{
	public String legs();
	public String colour();
}

interface dogs{
	public String dogbreed();
	public String dogcolour();
}

abstract class animals{
	public abstract String animalType();
}
class a1 extends animals implements dogs,birds{
	@Override
	public String dogbreed() {
		System.out.println("this methods tells about the breed of dog");
		return null;
	}

	@Override
	public String dogcolour() {
		System.out.println("this methods tells about the colour of dog");
		return null;
	}

	@Override
	public String legs() {
		System.out.println("the bird has two legs");
		return null;
	}

	@Override
	public String colour() {
		System.out.println("this methods tells about the colour of bird");
		return null;
	}

	@Override
	public String animalType() {
		System.out.println("this method tells about the type of animal");
		return null;
	}
}
public class Question9 extends a1{

	public static void main(String[] args) {
		Question9 f = new Question9();
		
		f.animalType();
		f.colour();
		f.dogbreed();
		f.dogcolour();
		f.legs();
	}

	

}
