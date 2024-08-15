class Dog{
	int size;
	String name;

	public void bark(){
		if (size > 60){
			System.out.println("Gaf Gaf!");
		} else if (size > 14) {
			System.out.println("Woof Woof!");
		} else {
			System.out.println("Tiaf Tiaf!");
		}	
	}	
}