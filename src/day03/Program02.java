package day03;

public class Program02 {

	public static void main(String[] args) {
		Program02 pqr= new Program02();
		addMethod(10,20);
		pqr.subMethod(30,40);
		pqr.mulMethod(50,60);
		
		System.out.println("************");
		
		addMethod(100,200);
		pqr.subMethod(300,400);
		pqr.mulMethod(500,600);
		}
	
	public static void addMethod(int r,int m)
	{
			System.out.println(r+m);
			
	}
		public void subMethod(int r,int m)
		{
				System.out.println(r-m);
				
		}
		public void mulMethod(int r,int m)
		{
				System.out.println(r*m);
				
		}
	}


