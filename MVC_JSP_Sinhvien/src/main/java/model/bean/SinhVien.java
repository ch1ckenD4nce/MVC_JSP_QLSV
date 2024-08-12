package model.bean;

public class SinhVien {
	private String id;
	private String name;
	private int age;
	private String university;
	
	public SinhVien() {
		
	}
	public SinhVien(String _id, String _name, int _age, String _university) {
		this.id = _id;
		this.name = _name;
		this.age = _age;
		this.university = _university;
	}
	
	public String getId() {
		return id;
		
	}
	
	public void setId(String id) {
		this.id = id;
		
	}
	
	public String getName() {
		return name;
		
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public int getAge() {
		return age;
		
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public String getUniversity() {
		return university;
		
	}
	
	public void setUniversity(String university) {
		this.university = university;
		
	}
	
	

}
