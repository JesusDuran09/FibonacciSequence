public class FibSeq {
	
	
	public static void main(String[] args) {
		
		long start = System.nanoTime();
		long start1 = System.nanoTime();
		
		System.out.print("Fibonacci series(R): ");
		for(int i=0;i<=10;i++){
			System.out.print(fibonacciRecursive(i)+" ");
			System.out.printf("Recurssive Time: %d ns", System.nanoTime() - start1);
		}
		System.out.println();
		
		System.out.print("Fibonacci series(I): ");
		for(int i=0;i<=10;i++){
			System.out.print(fibonacciIterative(i)+" ");
			System.out.printf("Iterative Time: %d ns", System.nanoTime() - start);
		}
		System.out.println();
		System.out.printf("Iterative Time: %d ns", System.nanoTime() - start);
		System.out.println();
		System.out.printf("Recurssive Time: %d ns", System.nanoTime() - start1);
	}
	
	public static int fibonacciRecursive(int n){
		if(n<=1){
			return 1;
		}
		else{
			return fibonacciRecursive(n-1)+fibonacciRecursive(n-2);
		}
	}
	
	public static int fibonacciIterative(int n){
		int i=0,result=1,prevresult=1;
		while(i<n-1){
			int temp=result;
			result=result+prevresult;
			prevresult=temp;
			i++;
		}
		
		return result;
	}
}
