package shaiful;

public class Student {
	
	private double icno;
	private String sname;
	private String birthday;
	private String pname;
	private String phone;
	private String address;
		
	public Student() {
		super();
	}
	public Student(double icno, String sname, String birthday, String pname, String phone, String address) {
		super();
		this.icno = icno;
		this.sname = sname;
		this.birthday = birthday;
		this.pname = pname;
		this.phone = phone;
		this.address = address;
	}
	public double getIcno() {
		return icno;
	}
	public void setIcno(double icno) {
		this.icno = icno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
