
public class Attendance {

	
	
	public static void main(String[] args) {
		
		Child c=new Child();
		c.display();
		c.displays();
		

		// TODO Auto-generated method stu
	}

}
class Parent
{
public void displays()
{
	System.out.println("Paret method");
	System.out.println("Parent method");
}
}
class Child extends Parent
{
	public void display()
	{
		System.out.println("Child method");
	}
}