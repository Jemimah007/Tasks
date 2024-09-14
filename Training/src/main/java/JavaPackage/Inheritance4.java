package JavaPackage;

public class Inheritance4 extends Inheritance3{

    public void sub(int x, int y) {
    	int z;
    z = x - y;
    System.out.println("sub is :"+z);
}
	public static void main(String[] args) {

		
			Inheritance4 obj = new Inheritance4();
			obj.add(23,40);
			obj.sub(20,40);
			
		
		}

}
