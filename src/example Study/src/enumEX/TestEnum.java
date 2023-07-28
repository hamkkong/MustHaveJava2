package enumEX;

public class TestEnum {

    public static void main(String[] args) {
	for(Enum01 type : Enum01.values()) {
	//    System.out.println(type.getValue()); // 에스케이, 엘지, 케이티, 삼성, 애플
	   System.out.println(type);  // SK, LG, KT, SAMSUNG, APPLE
	}
	//System.out.println(Enum01.APPLE.getValue());  //애플
	System.out.println(Enum01.APPLE.ordinal());  // 4 (배열의 인덱스값 출력)
    }

}
