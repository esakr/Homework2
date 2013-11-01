/* Compile: javac Executive.java*/

class Executive extends Manager {
	
	Executive(String name, double sal, String namedDepartment) {
		super(name, sal, namedDepartment);
	}
	
	/**
	 * Overriding the toString method to Executive
	 */
	
	public String toString()
	{
		return "Executive name is " + getName() + " and Salary is " + getSalary()+
				" Department is : " + getNamedDepartment();
	}

}
