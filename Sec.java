class Sec{
	public static void main(String[] args){
		Main obj = new Main();
		obj.speed(200);
		obj.fullThrottle();

		int num = 0;

		while (num < 10){
			System.out.println("*");
			++num;
		}

		for (int x = 0; x < 10; ++x){
			System.out.println("1");
		}
	}
}
