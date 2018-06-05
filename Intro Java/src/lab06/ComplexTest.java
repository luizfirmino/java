package lab06;

public class ComplexTest {

	public ComplexTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Complex num1 = new Complex(5.0, 11.0);
	    Complex num2 = new Complex(4.0, 5.0);
	    Complex result;
	    result = num1.add(num2);
	    System.out.print("Add: " + result + "\n");
	    result = num1.sub(num2);
	    System.out.print("Sub: " + result);
	}

}
