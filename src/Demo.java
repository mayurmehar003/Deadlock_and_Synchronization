//even and Odd element in array

public class Demo {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 10, 9 };

		System.out.println("Even :");
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]+" ");
				
			}}
		
		
		System.out.println("Odd :");
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]+" ");
			}
		}
			
			
		}
	

		
		
	}


