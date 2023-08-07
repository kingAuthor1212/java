public class Main {

	static void myMethod(){
		System.out.println("g");
	}

	public void myPublic() {
		System.out.println("oublic");
	}

	public void fullThrottle(){
		System.out.println("going fast ");
	}

	public void speed(int maxSpeed){
		System.out.println("max is " +maxSpeed);
	}


	public static void main(String[] args){
		myMethod();

		Main objPublic = new Main();
		objPublic.myPublic();
		objPublic.fullThrottle();
		objPublic.speed(100);
	}
}
