import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseNumber {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			int num = Integer.parseInt(br.readLine());
			int revNum=0;
			int i=0;
			int length=1;
			int lenNum=num;
			while(lenNum/10!=0){
				length++;
				lenNum/=10;
			}
			
			while(num/10!=0){
				revNum=num%10;
				revNum*=(int)Math.pow(10, length-1);
				revNum+=revNum;
				length--;
				num/=10;
			}
			System.out.println(revNum);
		}catch(Exception e){
			
		}
		
	}

}
