package animals;

public class Cat extends Animal implements Runnable  {
	
private String d="CAT";

public String show() {
	 return d;
	}
	@Override
	public void eat() {
		String e="the "+d+" eat!!";
		System.out.println(e);
	}


	@Override
	public void sleep() {
		String e="the "+d+" sleep!!";
		System.out.println(e);
	}

	@Override
	public void run() {
		String e="the "+d+" run!!";
		System.out.println(e);
	}
}
