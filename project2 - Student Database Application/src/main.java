import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = new ArrayList<Student>();
	       Scanner input = new Scanner(System.in);

	       int menuChoice = 3;
	       int numStudents = 0;
	       do {
	           System.out.println("\t\t\tStudent Record Menu");
	           System.out.println("\t\t1. Add Student\t2. View Students\t3. Exit");
	           try {
	               System.out.println("Enter a choice: ");
	               menuChoice = Integer.parseInt(input.nextLine());
	           } catch (NumberFormatException e) {
	               continue;
	           }

	           if (menuChoice==1)
	           {
	        	   try {
		               System.out.println("Enter how many students, you want add: ");
		               numStudents = Integer.parseInt(input.nextLine());
		           } catch (NumberFormatException e) {
		               continue;
		           }
	        	   
	        	   for(int i=0; i<numStudents;i++) {
		        	   System.out.println("Full name:");
		               String name = input.nextLine();
		               
		               System.out.println("Year:");
		               String year = input.nextLine();
		               
		               System.out.println("ID:");
		               String Id = input.nextLine();
		               
		               System.out.println("Course:");
		               ArrayList<String> mylist = new ArrayList<String>();		               
		            
		               boolean good = false;
		               do {
		            	   String word = input.nextLine();
		            	   if(word.equals("quit")) {
		            		   good = true;
		            	   } else {
		            		   mylist.add(word);
		            	   }
		               } while (!good);
		               
		               //System.out.println(mylist);
		               int balance = 600*mylist.size();
		               System.out.println(balance);
		               Student student = new Student(name, year, mylist, balance, Id);
		               students.add(student);
	        	   }
	        	   
	           } else if (menuChoice==2) {
	               System.out.println("Students:");
	               for (Student student : students)
	               {
	                   System.out.println(student.toString());
	               }
	               
	           } else if (menuChoice==3) {
	        	   System.out.println("System Exited");
	        	   System.exit(0);
	           }
	       } while (menuChoice<4);
	}

}
