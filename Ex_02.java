import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

public class Ex_02 {

	public static void main(String[] args) {
		Date date = new Date();
		long time = date.getTime();
		System.out.println("Time in Milliseconds: " + time);

		// lambda expression to implement above
		// functional interface. This interface
		// by default implements abstractFun()
		FuncInterface fobj = (int x) -> System.out.println(2 * x);

		// This calls above lambda expression and prints 10.
		fobj.abstractFun(5);

		
		/**
		 * searching through lambda expression
		 */
		Search search = (List<User> users) -> {
			ListIterator<User> itr = users.listIterator();
			while (itr.hasNext()) {
				User user = itr.next();
				if (user.getName().equalsIgnoreCase("john")) {
					return user;
				} 
			}
			return null;
		};

		List<User> users = new ArrayList<>();

		users.add(new User("ekta", 10, 20, "Delhi"));
		users.add(new User("anu", 10, 20, "Mumbai"));
		users.add(new User("ram", 10, 20, "chennai"));
		users.add(new User("john", 10, 20, "calcutta"));
		
		
		
		users.forEach(search2->{ 
			for(int i=0;i<users.size();i++){
				System.out.println(users.get(i).getName());
			}
		});
		
		
		System.out.println((search.search(users)).getCity());

		long time2 = date.getTime();
		System.out.println("Time in Milliseconds: " + (time2 - time));
	}

}

interface FuncInterface {
	// An abstract function
	void abstractFun(int x);

	// A non-abstract (or default) function
	default void normalFun() {
		System.out.println("Hello");
	}
}

interface Search {
	// An abstract function
	User search(List<User> users);
	
	//void show(int a);

	/*
	 * // A non-abstract (or default) function default void normalFun() {
	 * System.out.println("Hello"); }
	 */
}

class User {
	String name;
	int id;
	int age;
	String city;

	public User(String name, int id, int age, String city) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}