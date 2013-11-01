/* Compile : javac Employee.java*/


public class Employee 
{
	private String name;
	private double salary;
	
	// Construct Employee with name and sal
	
	Employee(String name, double sal)
	{
		setName(name);
		setSalary(sal);
	}
	
	/*
	 * sets the name for employee
	 * @param name the name
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/*
	 * sets the salary for the employee
	 * @param sal the salary
	 */
	
	public void setSalary (double sal)
	{
		salary = sal;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * Overriding the ToString method to Employee
	 */
	
	public String toString()
	{
		return "Name is" + getName() + "and salary is " + getSalary();
	}

}
