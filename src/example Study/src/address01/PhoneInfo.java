package address01;

import java.io.Serializable;

class PhoneInfo implements Serializable{
    private static final long serialVersionUID = 2722636174616819972L;
    private String name;
    private String phone;
    private String email;
    
    public PhoneInfo(String name, String phone, String email) {
	
	this.name = name;
	this.phone = phone;
	this.email = email;
	
    }
    
    public String getname() {
	return this.name;
    }
    
    public String getnumber() {
	return this.phone;
    }
   
    public String getemail() {
	return this.email;
    }
    
    public void phoneInfo() {
    System.out.println("이름 : " + getname());  // private이기 때문에 해당 getter메서드를 사용 
    System.out.println("연락처 : " + getnumber());
    System.out.println("메일주소 : " + getemail());
    
    }
		
 }

