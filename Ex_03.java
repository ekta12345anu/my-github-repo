import java.util.Date;

public class Ex_03 {

	public static void main(String[] args) {
		Date date = new Date();
		long time = date.getTime();
		System.out.println("Time in Milliseconds: " + time);

		
		int[] a={1,2,3,4,5};
		int[] a2=a;
		int[] a3 = new int[2];
		for(int i=0;i<a.length;i++){
			if(a[i]+a2[i+1]==9){
				a3[0]=a[i];
				a3[1]=a2[i+1];
				break;
			}
		}

		System.out.println(a3[0] + " " + a3[1]);
		
		long time2 = date.getTime();
		System.out.println("Time in Milliseconds: " + (time2-time));

	}

}
