package project1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newEmployee emp1 = new newEmployee("prateek", "mehta", "saleads");
		System.out.println(emp1.getEmail());
		System.out.println(emp1.getPassword());
		emp1.setPassword("abcdefg");
		System.out.println(emp1.getPassword());
	}

}
