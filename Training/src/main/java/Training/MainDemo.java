package Training;

public class MainDemo implements ClientDemo {

	public static void main(String[] args) {
		
		MainDemo obj = new MainDemo();
		System.out.println("The value is " + pi);
		obj.display();
		
	}

	public void display() {
		
		
		System.out.println(ClientDemo.pi);
	}

}
