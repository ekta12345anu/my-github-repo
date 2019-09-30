import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



interface InterfaceOne{
	
	void display();
	
	int add();
	
}
class ClassOne implements InterfaceOne{

	@Override
	public void display() {
		System.out.println("Display method");
	}

	@Override
	public int add() {
		return 9;
	}
	
	int multiply(){
		return 20;
	}
	
}

public class TestThread {

	public static void main(String[] args) {
		
		/*while(true){
			System.out.println(new TestThread().method());
		}*/

		
		Map<String,String> hm= new HashMap<String,String>();
		
		System.out.println(hm.get("abc"));
		
		
		try{
			throw new StackOverflowError();
		}catch(Throwable th){
			System.out.println("Error caught");
		}
		
	}
	
	 int method(){
		
		int a=10;
		int b=10;
		return a+b;
	}
	 
	 
	 InterfaceOne i = new ClassOne();
	 
	 
	 
}



