package step06;

public class PhoneInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    String name;
    String phoneNumber;
    String email;

    public PhoneInfo(String name, String phoneNumber) {

	this.name = name;
	this.phoneNumber = phoneNumber;
    }

    public PhoneInfo(String name, String phoneNumber, String email) {
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.email = email;
    }

    public void showPhoneInfo() {
	    
	    System.out.println("Name : " + name);
	    System.out.println("PhoneNumber : " + phoneNumber);
	    if(email != null)
		 System.out.println("email : " + email);
	    
	    System.out.println("-------------------------------------");
	}

}
