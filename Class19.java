package Java09;
class Data
{
	private String name;
	private Test score;

	class Test
	{
		private int english;
		private int math;

		public Test(int eng,int m)
		{
			english=eng;
			math=m;
		}
		public double avg()
		{
			return (english+math)/2.0;
		}
	}
	public Data(String na,int eng,int ma)
	{
		name=na;
		score=new Test(eng,ma);
	}
	public void show()
	{
	System.out.println("�ǥͩm�W:"+name);
	System.out.println("�^�妨�Z:"+score.english);
	System.out.println("�ƾǦ��Z:"+score.math);
	System.out.println("�������Z:"+score.avg());
	}
	
}
public class Class19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data stu=new Data("Annie",85,92);
		stu.show();
	}

}
