package phonePack;

import java.util.Scanner;

public class Phoneinfo {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
	
	String name,strNum;
	int phoneNum;
		
	while (true) {
	    
	    showMenu(); // 메뉴 출력
		
		int num = sc.nextInt();

		if (num == 0) {
		    System.out.println("없는 메뉴입니다.");

		    continue;
		}

		else {
		    if (num > 4) {
			System.out.println("없는 메뉴입니다.");
			continue;
		    }
		    
		       
					
			if(num == 1) {
		         System.out.println("이름을 입력하세요 ");
			name = sc.nextLine();
			
			
			System.out.println("전화번호 입력하세요");
			strNum = sc.nextLine();
			phoneNum = Integer.parseInt(strNum);
			
			System.out.printf("[%s],[%d]",name,phoneNum);
			
			}
			
			//else if(num == 2) //조회 
			
		//	else if(num == 3) // 삭제 

		} 
	
		
		System.out.println("주소록을 종료합니다. ");
		
		break;
	}
	
	
	
    }

    public static void showMenu() {

	System.out.println("[메뉴 선택]");
	System.out.println("1.전화번호 입력");
	System.out.println("2.전화번호 조회");
	System.out.println("3.전화번호 삭제");
	System.out.println("4.종료");
    }
   

    
	
}
