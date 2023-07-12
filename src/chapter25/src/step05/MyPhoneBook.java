package step05;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyPhoneBook {

    static Scanner sc = new Scanner(System.in);
    static Map<String, PhoneInfo> map = new HashMap<>();

    public static void showMenu() {

	System.out.println("[메뉴 선택]");
	System.out.println("1.전화번호 입력");
	System.out.println("2.전화번호 조회");
	System.out.println("3.전화번호 삭제");
	System.out.println("4.종료");
	System.out.println("선택 : ");

    }

    public static void addNumber() {
	System.out.print("이름 : ");
	String name = sc.nextLine();
	
	System.out.print("전화번호 : ");
	String phoneNumber = sc.nextLine();
	
	System.out.print("이메일 : ");
	String email = sc.nextLine();
	
	PhoneInfo pInfo;
	if (email != null) {
	    
	    pInfo = new PhoneInfo(name, phoneNumber, email);
	}
	else {
	    pInfo = new PhoneInfo(name, phoneNumber);
	}
//	pInfo.showPhoneInfo();
	map.put(name, pInfo);
//	System.out.println("맵의 크기 : " + map.size());
    }

    public static void selNumber() {
	System.out.print("조회할 이름 : ");
	String name = sc.nextLine();
	
	PhoneInfo pInfo = map.get(name);
	if (pInfo != null) {
	    pInfo.showPhoneInfo();
	}
	else {
	    System.out.println("해당 값이 없습니다.");
	}
    }

    public static void delNumber() {
	System.out.print("삭제할 이름 : ");
	String name = sc.nextLine();
	
	PhoneInfo pInfo = map.remove(name);
	if(pInfo != null) {
	    System.out.println("삭제되었습니다.");
	}
	else {
	    System.out.println("해당 값이 없습니다.");
	}
    }

    public static void main(String[] args) {

	int choice;
	while (true) {

	    showMenu();
	    choice = sc.nextInt();
	    sc.nextLine();
	    switch (choice) {

	    case 1:
		addNumber();
		break;
	    case 2:
		selNumber();
		break;
	    case 3:
		delNumber();
		break;
	    case 4:
		System.out.println("프로그램을 종료합니다.");
		return;
	    default:
		System.out.println("잘못 입력하셨습니다.");
		break;
	    }
	}

    }

}
