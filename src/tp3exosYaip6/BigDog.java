package tp3exosYaip6;

public class BigDog extends Dog {
	
	public BigDog(String name) {
		super(name);
	}
	
	@Override
	public void greets() {
		System.out.println("Woooooow");
	}
	
	public void greets(Dog another) {
		System.out.println("Wooooooooow");
		
	}
	

	public void greets(BigDog another) {
		System.out.println("Wooooooooooooooooooooow");
		
	}
	
//	public static void main(String[] args) {
//        Animal myCat = new Cat("skibidi");
//        Dog myDog = new Dog("marge");
//        BigDog myBigDog = new BigDog("marcus");
//
//        myCat.greets(); 
//        myDog.greets(); 
//
//        myBigDog.greets(); 
//        Dog anotherDog = new Dog("speed");
//        myDog.greets(anotherDog);
//        BigDog anotherBigDog = new BigDog("beast");
//        myBigDog.greets(anotherDog); 
//        myBigDog.greets(anotherBigDog); 
//    }
	
	

}