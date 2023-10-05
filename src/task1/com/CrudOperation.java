package task1.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CrudOperation {
	public static void main(String args[]) {
		List<Employee> employeeList = new ArrayList<Employee>();
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Save Employee");
			System.out.println("2.Show Employee");
			System.out.println("3.Search Employee");
			System.out.println("4.Delete Employee");
			System.out.println("5.Update Employee");
			System.out.println("6.Shorting By Age Employee");
			System.out.print("Enter your choice : ");
			ch = s.nextInt();
			switch (ch) {
			// Insert Operation
			case 1:
				System.out.print("Enter employeeid : ");
				int employeeid = s.nextInt();

				System.out.print("Enter name : ");
				String name = s1.nextLine();

				System.out.print("Enter skills : ");
				String skills = s1.nextLine();

				System.out.print("Enter age : ");
				String age = s1.nextLine();

				System.out.print("Enter Salary : ");
				int salary = s.nextInt();

				System.out.print("Enter joiningdate : ");
				String joiningdate = s1.nextLine();

				employeeList.add(new Employee(employeeid, name, skills, age, salary, joiningdate));
				System.out.println("---------------------");
				System.out.println("Record save Sucessfully");
				System.out.println("---------------------");
				break;
			// Display Operation
			case 2:
				System.out.println("---------------------");
				Iterator<Employee> show = employeeList.iterator();
				while (show.hasNext()) {
					Employee e = show.next();
					System.out.println(e);
				}
				System.out.println("---------------------");
				break;
			// Search Opeartion
			case 3:
				boolean found = false;
				System.out.print("Enter employeeid for Search : ");
				employeeid = s.nextInt();
				// int empl = s.nextInt();
				System.out.println("---------------------");
				show = employeeList.iterator();
				while (show.hasNext()) {
					Employee e = show.next();
					if (e.getEmployeeid() == employeeid) {
						System.out.println(e);
						found = true;
					}
				}
				if (!found) {
					System.out.println("Record Not Found");
				}
				System.out.println("---------------------");
				break;
			// Delete Operation
			case 4:
				found = false;
				System.out.print("Enter employeeid for Delete : ");
				employeeid = s.nextInt();
				System.out.println("---------------------");
				show = employeeList.iterator();
				while (show.hasNext()) {
					Employee e = show.next();
					if (e.getEmployeeid() == employeeid) {
						show.remove();
						found = true;
					}
				}
				if (!found) {
					System.out.println("Record Not Found");
				} else {
					System.out.println("Record is Deleted Sucessfully");
				}
				System.out.println("---------------------");
				break;
			// Update Opeartion
			case 5:
				found = false;
				System.out.print("Enter employeeid for Update : ");
				employeeid = s.nextInt();
				ListIterator<Employee> list = employeeList.listIterator();
				while (list.hasNext()) {
					Employee e = list.next();
					if (e.getEmployeeid() == employeeid) {
						System.out.print("Enter new Name : ");
						name = s1.nextLine();

						System.out.print("Enter new skills : ");
						skills = s1.nextLine();

						System.out.print("Enter new age : ");
						age = s1.nextLine();

						System.out.print("Enter new Salary : ");
						salary = s.nextInt();

						System.out.print("Enter new joiningdate : ");
						joiningdate = s1.nextLine();

						list.set(new Employee(employeeid, name, skills, age, salary, joiningdate));
						found = true;
					}
				}
				System.out.println("---------------------");
				if (!found) {
					System.out.println("Record Not Found");
				} else {
					System.out.println("Record is Updated Sucessfully");
				}
				System.out.println("---------------------");
				break;
			// shorting Opeartion
			case 6:
				final Function<Employee, Integer> byAge = x -> Integer.parseInt(x.getAge());
				final Function<Employee, String> byTheirName = x -> x.getName();
				List<Employee> sortByAgeList = employeeList.stream()
						.sorted(Comparator.comparing(byAge).thenComparing(byTheirName)).collect(Collectors.toList());
				sortByAgeList.forEach(System.out::println);
				break;
			}
		} while (ch != 0);
	}

}