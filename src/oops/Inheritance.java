package oops;

   class Animal{
     void eat(){
    	 System.out.println("Animal is eating");
     }
   }
     class Cat extends Animal {
    	 void bark() {
    		 System.out.println("Dog is barking");
    	 }
     }
    public class Inheritance {
    	
    
	public static void main(String[] args) {
		
		Cat obj=new Cat();
		obj.eat();
		obj.bark();
		

	}

}
   
