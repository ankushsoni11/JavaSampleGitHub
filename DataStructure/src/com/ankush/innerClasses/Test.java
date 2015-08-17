package com.ankush.innerClasses;

public class Test {

	public static void main(String[] args) {
		int stringCount = 0; 
       // List l = new ArrayList(1000000); 
        while(true) 
        { 
            if((stringCount % 10000) == 0) 
            { 
                long freeMem =Runtime.getRuntime().freeMemory(); 
                long totalMem = Runtime.getRuntime().totalMemory(); 
                //print status message every 10,000 objects                 System.out.print("stringCount is "+stringCount+", " ); 
                System.out.print("total memory = "+totalMem); 
                System.out.print(", free memory = "+freeMem); 
                System.out.println(", Free Percent = "+(int)((double)freeMem/totalMem*100)); 
            } 
            //create new string object and intern it             
           // String newString = "Hello I am a moderately long sized unique string object "+stringCount++;
            String newString = new String("Hello I am a moderately long sized unique string object "+stringCount++);
            newString.intern(); 
           // l.add(newString); //LINE 1 
	}
}
}
