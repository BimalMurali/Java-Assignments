package Customer;

public class CustomerAccount {
	public long Accno;
	public String Name;
	public short age;
	public String Place,AccType;
	
	public CustomerAccount() {
		
	}

	@Override
	public String toString() {
		return "Customeraccount [Accno=" + Accno + ", Name=" + Name + ", age=" + age + ", Place=" + Place + ", AccType="
				+ AccType + "]";
	}
	
	

}