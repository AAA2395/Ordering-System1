package myPackage;

class MyClass
{
    public void getNames(String s)
    {        
        System.out.println(s);        
    }


import myPackage.MyClass;

public class PrintName 
{
   public static void main(String args[]) 
   {       
      // Initializing the String variable 
      // with a value 
      String name = "GeeksforGeeks";
      
      // Creating an instance of class MyClass in 
      // the package.
      MyClass obj = new MyClass();
      
      obj.getNames(name);
   }
}
}