public class ClassAB implements InterfaceAB {
   
     public void methodA(){
 	System.out.println("A");}
     public void methodB(){
 	System.out.println("B");}
     public void otherMethod(){
 		System.out.println("blablah");}
      public static void main(String[] args) {
 		ClassAB classAb = new ClassAB();

		classAb.methodA();
 		classAb.methodB();
 		classAb.otherMethod();
 	}

}
 
 

