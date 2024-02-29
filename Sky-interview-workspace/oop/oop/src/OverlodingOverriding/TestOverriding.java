package OverlodingOverriding;

public class TestOverriding {
public static void main(String[] args) {
	AnimalOverride a= new AnimalOverride();
	AnimalOverride b=new Dog();
	
	a.show();
	b.show();
}
}
