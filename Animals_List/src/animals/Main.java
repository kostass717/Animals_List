package animals;

import java.util.ArrayList;

public class Main {

	public static void main(String args[]) {
		
		Animal dog=new Dog();
		Animal cat=new Cat();
		Animal fish=new Fish();
		Animal horse=new Horse();
		
		ArrayList<Animal>animal=new ArrayList();
		animal.add(dog);
		animal.add(cat);
		animal.add(fish);
		animal.add(horse);
		
		
		
		for(Animal x:animal) {
			
			System.out.println(x.show());
			
				if (x.equals(dog)) {
				Dog anima=new Dog();
				anima.eat();
				anima.run();
				anima.sleep();
				}
			else 
				if (x.equals(cat)) {
				Cat anima=new Cat();
				anima.eat();
				anima.run();
				anima.sleep();
				}
			
			else 
				if (x.equals(fish)) {
				Fish anima=new Fish();
				anima.eat();
				anima.run();
				anima.sleep();
				}
			
			else {
				Horse anima=new Horse();
				anima.eat();
				anima.run();
				anima.sleep();
			}
				
		
		
	}
  }
}


	

	