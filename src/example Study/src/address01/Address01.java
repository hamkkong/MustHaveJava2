package address01;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.FileOutputStream;

   
public class Address01 {
    private Scanner sc;
    private Map<String, PhoneInfo> phoneBookMap;
    

   public Address01(){
       sc = new Scanner(System.in);
       phoneBookMap = new HashMap<>();
   }
   
    public static void main(String[] args) {
	Address01 address01 = new Address01();
	
	// 파일에서 주소록 데이터 로드 (파일 존재하는 경우에만)
	try (FileInputStream fis = new FileInputStream("user.ser");
	ObjectInputStream ois = new ObjectInputStream(fis)){
	address01.phoneBookMap = (Map<String, PhoneInfo>) ois.readObject();

      } // 파일을 찾을수 없거나 역직렬화에 문제가 있는 경우 빈 주소록으로 시작함 
    catch(IOException | ClassNotFoundException e) {
	System.out.println("기존 주소록 데이터가 없습니다. 빈주소록부터 다시 시작합니다.");
     }
	address01.run();
	
	// 종료하기 전 파일에 주소록 데이터 저장
	try(FileOutputStream fos = new FileOutputStream("user.ser");  
	    ObjectOutputStream oos = new ObjectOutputStream(fos)){
	    oos.writeObject(address01.phoneBookMap);
	}
	catch (IOException e) {
	    e.printStackTrace();
	}
    }
    public void run() {
	
        int choice;
	
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
       
        
       String name = null, phone = null, email = null; 
        
     while(true) {   
	
        System.out.println("\n[메뉴 선택]");
        System.out.println("1. 전화번호 입력");
        System.out.println("2. 전화번호 조회");
        System.out.println("3. 전화번호 삭제");
        System.out.println("4. 종료");
	
        System.out.print("숫자를 선택하세요 : ");
        choice = sc.nextInt();
        sc.nextLine();
    
       // PhoneInfo info = null;
        
        switch (choice) {
        
            case 1://전화번호 등록 기능 
                System.out.println("선택 : " + num1);
          
                
                System.out.println("이름 : ");
                name = sc.nextLine();
                
                System.out.println("연락처 : ");
               phone = sc.nextLine();
          
               
                System.out.println("이메일 : ");
                email = sc.nextLine();
                
                PhoneInfo info = new PhoneInfo(name,phone,email); // 객체 생성
                phoneBookMap.put(name, info);  // 객체 저장 

               break;
                
            case 2: // 전화번호 찾기 기능
                System.out.println("선택 : " + num2);
                System.out.println("이름 : ");
                name = sc.nextLine();
                info = phoneBookMap.get(name);
                if(info == null) {
                    System.out.println(name + "의 전화번호 정보가 없습니다.");
                }
                else { System.out.println(name + "의 전화번호 정보");
                        info.phoneInfo();
                }
                   
                break; 
               
                
            case 3:  //전화번호 삭제 기능 
                System.out.println("선택 : " + num3);
               System.out.println("삭제할 전화번호 정보를 입력하세요.");
               System.out.println("이름 : ");
               name = sc.nextLine();
               info = phoneBookMap.remove(name);
               if(info == null) {
        	   System.out.println(name + "의 전화번호 정보가 없습니다.");
               } 
               else {
        	   System.out.println(name + "의 전화번호 정보가 삭제되었습니다.");
               }
                break;
        	
            case 4: //종료
                System.out.println("시스템을 종료합니다.");
           //     System.exit(0);
                break;
            default:
                System.out.println("잘못된 메뉴를 선택했습니다.");
                break;
                
             }     
        }
    }
}
