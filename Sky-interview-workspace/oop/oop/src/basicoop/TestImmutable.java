package basicoop;

public class TestImmutable 
{ 
  public static void main(String[] args) 
  { 
   MyImmutableClass obj1 = new MyImmutableClass(3,5); 
   System.out.println(obj1.getCount()); 
   System.out.println(obj1.getValue()); 
 
} 
}