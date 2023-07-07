import java.util.HashMap;

public class Exam14_HashMap {

    public static void main(String[] args) {
	HashMap<String, String> map = new HashMap<>();
	
	// key-value 기반 데이터 저장
	map.put("홍길동", "010-1234-1443");
	map.put("전우치", "010-4321-1446");
	map.put("손오공", "010-9876-1443");
	
	//데이터 탐색 
	System.out.println("홍길동 : " + map.get("홍길동"));
	System.out.println("전우치 : " + map.get("전우치"));
	System.out.println("손오공 : " + map.get("손오공"));
	System.out.println();
	
	// 데이터 삭제 
	
	map.remove("손오공");
	
	// 데이터 삭제 확인
	System.out.println("손오공 : " + map.get("손오공"));
    }

}
