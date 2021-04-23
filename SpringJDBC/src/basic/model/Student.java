package basic.model;

public class Student {
        
		public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
		public Student(int id, String name, String branch, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.phone = phone;
	}
		int id;
         String name;
         String branch;
         String phone;
}
