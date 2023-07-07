import java.util.LinkedList;
import java.util.Queue;

public class Exam12_Queue {

    public static void main(String[] args) {
	Queue<String> que = new LinkedList<>();
	
	//데이터 저장 
	que.offer("A");
	que.offer("B");
	que.offer("C");
	System.out.println(que.size());
	
	//무엇이 다음에 나올지 확인
	System.out.println("next: " + que.peek());
	//첫번째 객체 꺼내기
	System.out.println(que.poll());
	System.out.println(que.size());
	
	//무엇이  다음에 나올지 확인
	System.out.println("next: " + que.peek());
	//두 번째 객체 꺼내기
	System.out.println(que.poll());
	System.out.println(que.size());
	
	//무엇이 다음에 나올지 확인
	System.out.println("next: "+ que.peek());
	//마지막 객체 꺼내기
	System.out.println(que.poll());
	System.out.println(que.size());

    }

}
