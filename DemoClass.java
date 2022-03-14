package Generics;

//create generic method
public class DemoClass {
    public <T> void genericsmethod(T data)
{
	System.out.println("Dta passed" + data);
}
}