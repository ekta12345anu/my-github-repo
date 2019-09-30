import java.io.IOException;
import java.sql.SQLException;

public class mytest {

	public static void main(String[] args) throws SQLException, IOException {

		/*
		 * List<String> list = new LinkedList<>(); list.add("1"); list.add("1");
		 * list.add("1"); list.add("1");
		 * 
		 * list.listIterator().remove(); System.out.println(list);
		 */

		method();

		/*
		 * try{
		 * 
		 * }catch(Exception1 e){
		 * 
		 * } catch(Throwable e){
		 * 
		 * }
		 */

	}

	public static void method() throws SQLException, IOException {
		try {
			method();
			int a = 1 / 0;
		} catch (IndexOutOfBoundsException e) {

		}
	}
}
