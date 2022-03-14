package Generics;

public class MainGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoClass d = new DemoClass();
		d.<String>genericsmethod("Java");
		d.<Integer>genericsmethod(868);

	}

}
