import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class test {

	public static void main(String[] args) {

		
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("1");
		
//		list.iterator().get;
		
		/*list.listIterator().remove();*/
		System.out.println(list);


		
		String s="ekta";
		String s1="ekta";
		String s2=new String("ekta");
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		CopyOnWriteArrayList  obj = new CopyOnWriteArrayList();
	}

}
