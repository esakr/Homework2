/* Compile : javac Manager.java */

public class Manager extends Employee
{
	private String namedDepartment;
	
	Manager (String name, double sal, String namedDepartment)
	{
		super(name, sal);
		setNamedDepartment(namedDepartment);
		
	}
	
	/**
	 * sets the namedDepartment for the manager
	 * @param namedDepartmenet the namedDepartment
	 */
	
	public void setNamedDepartment (String namedDepartment)
	{
		this.namedDepartment = namedDepartment;
	}
	
	/**
	 * returns the String namedDepartment
	 */
	
	public String getNamedDepartment ()
	{
		return namedDepartment;
	}
	
	/**
	 * Overriding the toString method to manager
	 */
	
	public String toString() 
	{
		return "Manager" + super.toString() +"Department is :" + namedDepartment;
		
	}

}
