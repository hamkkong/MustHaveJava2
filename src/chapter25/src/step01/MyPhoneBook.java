package step01;

public class MyPhoneBook {

    public static void main(String[] args) {
	
	PhoneInfo pInfo1 = new PhoneInfo("손오공", "010-1234-5678","test1@test1.com");
	PhoneInfo pInfo2 = new PhoneInfo("전우치", "010-4321-8765");
	
	pInfo1.showPhoneInfo();
	pInfo2.showPhoneInfo();
		

    }

}
