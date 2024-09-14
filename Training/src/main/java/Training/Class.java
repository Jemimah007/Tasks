package Training;

class Student1 {

	String name;
	int age;
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
	}
	

	public class Student {
	
	public void main(String[] args) {
		
		Student1 S1 = new Student1();
		S1.name = "Jemi";
		S1.age = 34;
		S1.printInfo();
		
		Student1 S2 = new Student1();
		S2.name = "coll";
		S2.age = 24;
		
	
	S2.printInfo();
		
	}
	

	}

}
