package Training;

	class Student {

		String name;
		int age;
		
		public void printInfo() {
			System.out.println(name);
			System.out.println(age);
		}
		
	}

public class Mark {
		
	public static void main(String[] args) {
			
			Student S1 = new Student();
			S1.name = "Jemi";
			S1.age = 34;
			S1.printInfo();
			
			Student S2 = new Student();
			S2.name = "coll";
			S2.age = 24;
			
		
		S2.printInfo();
			


		}

	}


