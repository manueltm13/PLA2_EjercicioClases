public class Employer {
	private String name;
	private String dni;
	private float grossSalary;
	
	public Employer() {
		setName("");
		setDni("");
		setGrossSalary(0);
	}

	/**
	 * @return The name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name The name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return The dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni The dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return The grossSalary
	 */
	public float getGrossSalary() {
		return grossSalary;
	}

	/**
	 * @param grossSalary The grossSalary to set
	 */
	public void setGrossSalary(float grossSalary) {
		if(grossSalary < 0)
			this.grossSalary = 0;
		else
			this.grossSalary = Math.round(grossSalary * 100f) / 100f;
	};
	
	public float getNetSalary() {
		return Math.round(getGrossSalary() * .85f * 100f) / 100f;
	}
	
	public String toString() {
		return "[name: " + getName() + ", dni: " + getDni() + ", grossSalary: " + getGrossSalary() + ", netSalary: " + getNetSalary() + "]";
	}

}
