// Java Program to convert string to an object 

import java.io.*; 

import java.util.*; 

   

class GFG { 

    public static void main(String[] args) 

    { 

        // string 

        String s = "GeeksForGeeks"; 

        

        // assigning string to an object 

        Object object = s; 

        

        // to check the data-typeof the object  

        // to confirm that s has been stored in object 

       System.out.println("Datatype of the variable in object is : " 

                          +object.getClass().getName()); 

        

       System.out.println("object is : "+object); 

    } 

}

