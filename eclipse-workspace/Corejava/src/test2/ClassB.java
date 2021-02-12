package test2;

public class ClassB {
	String Name;
	
	public ClassB() {
		System.out.println("Inside non paramiterized constructor");
	}
	
	public ClassB(String name) {
		
		System.out.println("Inside paramiterized constructor");
		System.out.println("Name is :"+name);
		Name=name;
	}

}
