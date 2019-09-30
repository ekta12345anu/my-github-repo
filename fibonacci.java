
public class fibonacci {

	public static void main (String[] args) {
		
		long a=0;
		long b=1;
		long c=0;
		long[] fib= new long[50];
		fib[0]=a;
		fib[1]=b;
		long sum=0;
		for(int i=2;i<50;i++){
		        c=a+b;
		        a=b;
		        b=c;
		    fib[i]=c;    
		}
		
		for(int i=0;i<50;i++){
			
			if(fib[i]<4000000 && fib[i]%2==0){
				
				sum+=fib[i];
			}
		}
		
		System.out.print(sum);
		
			
		}

}
