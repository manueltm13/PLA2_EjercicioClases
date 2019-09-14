
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employer employer1 = new Employer();
		
		System.out.println(employer1.toString());
		
		employer1.setName("Manuel");
		employer1.setDni("99999999X");
		employer1.setGrossSalary(-0.010f);
		System.out.println("-0.010f: " + employer1.toString());
		
		employer1.setGrossSalary(1000.99f);
		System.out.println("1000.99f, 1000.99, 850.84: " + employer1.toString());
		
		employer1.setGrossSalary(1000.004f);
		System.out.println("1000.004f, 1000.00, 850.00: " + employer1.toString());
		
		employer1.setGrossSalary(1000.005f);
		System.out.println("1000.005f, 1000.01, 850.01: " + employer1.toString());
		
		employer1.setGrossSalary(1000.024f);
		System.out.println("1000.024f, 1000.02, 850.02: " + employer1.toString());
		
		employer1.setGrossSalary(1000.025f);
		System.out.println("1000.025f, 1000.03, 850.03: " + employer1.toString());
		
		employer1.setGrossSalary(1000.034f);
		System.out.println("1000.034f, 1000.03, 850.03: " + employer1.toString());
		
		employer1.setGrossSalary(1000.035f);
		System.out.println("1000.035f, 1000.04, 850.03: " + employer1.toString());
	}

}
