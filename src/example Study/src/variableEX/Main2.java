package variableEX;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
	print(1, true, "홍길동","이순신","유성룡");

    }
    
    //매개변수가 여러 개 있을 경우, 가변 인자(varargs)는 반드시 마지막에 위치
    public static void print(int num, boolean bool, String... str) {
   
    System.out.println("number : " + num);
    System.out.println("bool : " + bool);
    System.out.println("rest parameters : " + Arrays.toString(str));
   
    }

}
