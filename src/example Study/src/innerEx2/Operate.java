package innerEx2;

public interface Operate {
    //추상 메서드가 하나이다
    int operate(int a, int b);
    
    //default 메서드는 추상 메서드에 포함되지 않는다
    default void print() {
	System.out.println("출력");
    }


Operate operate = (a, b) -> {
   // print();
    return a + b;
   };
}