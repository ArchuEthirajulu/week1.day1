package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		boolean IsPrime =true;
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				IsPrime =false;
				break;
		
				
			}
		}
			
		System.out.println(IsPrime);	
		
		

	}

}
