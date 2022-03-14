package Generics;



public class Main {

	public static void main(String[] args) {
	        //Initialize GenericsClass with Integer Data
		GenericsClass<Integer> intObj = new GenericsClass<>(5);
		System.out.println(intObj.getData());
		
		//Initialize GenericsClass with String Data
		GenericsClass<String> stringObj = new GenericsClass<>("java");
		System.out.println(stringObj.getData());
		

	}

}
