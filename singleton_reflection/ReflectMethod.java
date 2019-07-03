package singleton_reflection;

public class ReflectMethod {
	public String name;
	public int age;
	public ReflectMethod(String name,int age){
		this.name=name;
		this.age=age;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setAge(int age) {
		 this.age = age;
	}
	private String getName(){
		return this.name;
	}
	private int getAge(){
		return this.age;
	}

	
}
