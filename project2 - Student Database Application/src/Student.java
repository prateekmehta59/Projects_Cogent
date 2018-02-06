import java.util.List;

public class Student {

	private String name;
	private String year;
	private String Id;
	private List<String> courses;
	private Integer balance;
	
	public Student( String name, String year, List<String> courses, Integer balance, String Id) {
		this.name = name;
		this.year = year;
		this.courses = courses;
		this.balance = balance;
		this.Id = Id;
	}

	public String toString()
    {
        return "Full Name: " + name + ", ID: " + Id + 
               ", Courses: " + courses + ", Balance: " + balance;
    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	
	
	
}
