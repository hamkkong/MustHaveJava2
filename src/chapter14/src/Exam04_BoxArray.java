class BoxA4{
    public String name;
    
    BoxA4(String name) {
	this.name = name;
    }
}

public class Exam04_BoxArray {

    public static void main(String[] args) {
	
	BoxA4[]ar = new BoxA4[3];
	
	// 배열에 객체 저장  
	ar[0] = new BoxA4("홍길동");
	ar[1] = new BoxA4("전우치");
	ar[2] = new BoxA4("손오공");
	
	// 저장된 객체의 참조
	System.out.println(ar[0].name);
	System.out.println(ar[1].name);
	System.out.println(ar[2].name);

    }

}
