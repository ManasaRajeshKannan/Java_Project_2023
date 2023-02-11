package day02;

public class Program03 {

	public static int fun()
	{ 
		int n=100;
		System.out.println(n*n);
		return n*n;
		}
	public static void main(String[] args)
	{
		float b=fun();//64,32//10000.0
		System.out.println(b+b); //20000
	}

}
