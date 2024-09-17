package collection;

public class MyOwnClass {

//	private int id;
//	private String name;
//	public MyOwnClass(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
	
	private int age;
	private String name;
	public MyOwnClass(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int id) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String toString() {
		return "Age: "+ age +" Name: "+ name;
	}
}
