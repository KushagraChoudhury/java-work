class TaxCalculator
{
	float basicsalary;
	boolean citizenship;
	float tax;
	int nettSalary;
	
	void calculateTax()
	{
		tax=(30*basicsalary)/100;
		
		System.out.println("The tax of the employee for the "+basicsalary+" is: "+tax);
	}
	void deductTax()
	{
		nettSalary=(int)(basicsalary-tax);
		System.out.println("The nett salary of the employee is :"+nettSalary);
	}
	void validateSalary()
	{
		if(basicsalary>100000 && (citizenship==true))
			System.out.println("The salary and citizenship eligibility : True");
		else
			System.out.println("The salary and citizenship eligibility : False");
	}
}