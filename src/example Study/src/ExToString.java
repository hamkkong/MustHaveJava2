class MyObject {
    
    int myId;
    String myName;
    
    public MyObject(int myId, String myName) {
	
		this.myId = myId;
		this.myName = myName;
    }
}

public class ExToString {

    public static void main(String[] args) {
	MyObject o1 = new MyObject(101, "firstObject");  // 객체는 클래스로밖에 못 만든다. 
	MyObject o2 = new MyObject(102,"SecondObject");
	
	// 클래스 타입 이름 @ 객체주소 해시코드
	System.out.println(o1.toString());  // MyObject@3f8f9dd6
	System.out.println(o2);  // MyObject@aec6354

    }

}
