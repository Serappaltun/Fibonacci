package a;

public class Fibo {

	
	public static int fib(int w)
	{
		if(w==0)
		return 0;
		if(w==1)
			return 1;
		
		return fib(w-2)+fib(w-1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(6));
		
		
		
		
		 
		  
	}

}
