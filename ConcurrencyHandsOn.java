import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencyHandsOn {

	public static void main(String[] args) {

		ConcurrentHashMap<String, String> hm = new ConcurrentHashMap<>();
		
		Hashtable<String, String> ht= new Hashtable<>();
		ht.entrySet().iterator();
		
		HashMap<String, String> hmm= new HashMap<String, String>();
		
		
		hmm.entrySet().iterator();
		
		One one = One.getObject();
		One two = One.getObject();
		One three = One.getObject();
		One four = One.getObject();
		One five = One.getObject();
		
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);

	}

}

final class One {

	private static int count = 1;
	private static One object = null;

	private One() {}
	
	public static One getObject(){
		
		if(object.count<=3){
			object=new One();
			count++;
			return object;
		}
		return object;
	}
}
