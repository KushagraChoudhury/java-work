class EmployeeTax
{
	public static void main(String args[])
	{
		TaxCalculator ob=new TaxCalculator();
		
		ob.basicsalary=25000;
		ob.citizenship=true;
		ob.calculateTax();
		ob.deductTax();
		ob.validateSalary();
	}
}