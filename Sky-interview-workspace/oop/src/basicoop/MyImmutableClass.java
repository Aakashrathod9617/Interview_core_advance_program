package basicoop;


final class MyImmutableClass 
{ 

private final int count; 
private final double value; 


public MyImmutableClass(int Count,double Value) 
{ 
   this.count = Count; 
   this.value = Value; 
} 

public int getCount() 
{ 
   return count; 
} 
public double getValue() 
{ 
  return value; 
} 
} 

