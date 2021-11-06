package Java09;
class CWin // 定義類別 CWin
{
	private String color;
	private int width;
	private int height;
	private static int cnt=0;

	public CWin(String str,int w,int h) 
	{
		color=str;
		width=w;
		height=h;
		count();
	}
	public CWin() 
	{
		this("Red",2,2);
	}
	public static void count()
	{
		cnt++;
	}
	public static void setZero()
	{
		cnt=0;
	}
	public static void setValue(int n)
	{
		cnt=n;
	}
	public static void show()
	{
		System.out.println("cnt="+cnt);
	}
}
public class Class08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CWin w1=new CWin();
		CWin w2=new CWin("Blue",5,8);
		CWin.show();
		
		CWin.setZero();
		System.out.println("using setZero()...");
		CWin.show();
		
		CWin.setValue(10);
		System.out.println("using setValue(10)...");
		CWin.show();
		
		CWin w3=new CWin("Green",4,6);
		CWin.show();
	}

}
