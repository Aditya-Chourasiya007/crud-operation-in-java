package task1.com;

public class Employee implements Comparable<Employee> {

	private int employeeid;
	private String name;
	private String skills;
	private String age;
	private int salary;
	private String joiningdate;

	public Employee(int employeeid, String name, String skills, String age, int salary, String joiningdate) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.skills = skills;
		this.age = age;
		this.salary = salary;
		this.joiningdate = joiningdate;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + ", skills=" + skills + ", age=" + age
				+ ", salary=" + salary + ", joiningdate=" + joiningdate + "]";
	}

	@Override
	public int compareTo(Employee employee) {
		return this.age.compareTo(employee.age);
	}

}
