public class Ex_01 {

	public static void main(String[] args) {
		
		new A().show();
		
		

	}

}

class A{
	int a=20;
	String name ="ekta";
	
	//String n2="ekta";
	
	String str=null;
	
	public void show(){
		int a=90;
		
		name="sharma";
		str="ekta";
		System.out.println("a= " + this.a);
		System.out.println("a= " + a);
		
		System.out.println("a= " + name);
		System.out.println("a= " + this.name);
		
		
		if(str==name){
			System.out.println("true");
		}
		
		if(str.equals(name)){
			System.out.println("true");
		}
	}
}
