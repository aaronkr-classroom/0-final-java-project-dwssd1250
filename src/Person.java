public class Person {
	//클래스 변수
	private String name;
	private int phone;
	private String address;
	//클래스 생성자
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int phone) {
		this.name = name;
		this.phone = phone;
	}
	public Person(String name, int phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	public String getName() { return this.name; }
	public int getPhone() { return this.phone; }
	public String getAddress() { return this.address; }
	
	public void setName(String name) { this.name = name; }
	public void setPhone(int phone) { this.phone = phone; }
	public void setAddress(String address) { this.address = address; }
	
}
