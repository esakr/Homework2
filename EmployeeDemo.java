/*Compile : javac EmployeeDemo.java
 * Run    : java  EmployeeDemo
 */

class EmployeeDemo 
{
	public static void main(String args[])
	{
		Manager m = new Manager ("Elie", 50000.0, "Sales");
		Executive e = new Executive("Tony", 10000.0, "Sales");
		

		System.out.println("Manager name is :" + m.getName());
		System.out.println("Manager salary is :" + m.getSalary());
		System.out.println("Manager Department is :" + m.getNamedDepartment());
		System.out.println("Executive name is :" + e.getName());
		System.out.println("Executive salary is :" + e.getSalary());
		System.out.println("Executive Department is :" + e.getNamedDepartment());
		System.out.println(m.toString());
		System.out.println(e.toString());





	}

}
