package com.ankush.cloning;

 class X implements Cloneable {
    public X clone() throws CloneNotSupportedException {
            return (X) super.clone();
    }
}

abstract class Y extends X { 
	public static void test1(){
		
	}
}

class Z extends Y {
	public static void test1(){
			
		}
}

public class test1 {
    public void function() throws CloneNotSupportedException {
            Y varY1 = new Z();
            Y varY2 = (Y) varY1.clone();
            
            System.out.println(varY1.getClass());
            System.out.println(varY2.getClass());
    }
    public static final void main(String[] args) throws CloneNotSupportedException {
		//new test1().function();
    	
    	int decimal = Integer.parseInt("101", 2);
    	String dec = Integer.toString(decimal);
    	System.out.println(dec);
    	
    	System.out.println(Math.pow(5, 2));

	}
}
