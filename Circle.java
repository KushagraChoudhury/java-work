class Circle
{
	float radius;
	float pi;
	Circle()
	{
		radius=1.5f;
	}
	Circle(float radius)
	{
		this.radius=radius;
	}
	Circle(float radius, float pi)
	{
		radius=radius;
		pi=pi;
	}
	float calculateArea(float radius,float pi)
	{
		float area=pi*radius*radius;
		return area;
	}
	float calculateCircumference(float radius,float pi)
	{
		float circum=2*pi*radius;
		return circum;
	}
	public static void main(String args[])
	{
		Circle ob1=new Circle();
		Circle ob2=new Circle(2.1f);
		Circle ob3=new Circle(2.8f,3.5f);
		float area1=ob3.calculateArea(2.8f,3.5f);
		float circum1=ob3.calculateCircumference(2.8f,3.5f);
		
		System.out.println("The area of the circle is: "+area1);
		System.out.println("The circumference of the circle is: "+circum1);
	}
	
}