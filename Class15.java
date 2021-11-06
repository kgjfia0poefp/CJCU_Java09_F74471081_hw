package Java09;
class CCircle
{
	private static double pi=3.14;
	private double radius;

	public CCircle(double r)
	{
		radius=r;
	}
	public static double average(CCircle c[])
	{
		double sum=0.0;
		for(int i=0;i<c.length;i++)
			sum+=c[i].radius;
		return (sum/c.length);
	}
}
public class Class15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCircle circle[];
		circle=new CCircle[3];
		circle[0]=new CCircle(2.0);
		circle[1]=new CCircle(4.0);
		circle[2]=new CCircle(3.0);
		
		System.out.println("average radius = "+CCircle.average(circle));
	}

}
