import java.util.ArrayDeque;
import java.util.Deque;

public class Exam13_Deque {

    public static void main(String[] args) {
	
	//둘 다 사용가능 
	Deque<String> deq = new ArrayDeque<>();
//	 Deque<String> deq = new LinkedList<>();
	
	// 앞으로 넣고
	deq.offerFirst("A");
	deq.offerFirst("B");
	deq.offerFirst("C");
	
	//앞에서 꺼내기 
	System.out.println(deq.pollFirst());
	System.out.println(deq.pollFirst());
	System.out.println(deq.pollFirst());

	System.out.println("--------------------------------");
	
	//뒤로 넣고
	deq.offerLast("A");
	deq.offerLast("B");
	deq.offerLast("C");
	
	//뒤에서 꺼내기
	System.out.println(deq.pollLast());
	System.out.println(deq.pollLast());
	System.out.println(deq.pollLast());
	
	System.out.println("---------------------------------");
	
	//뒤로 넣고
	deq.offerLast("A");
	deq.offerLast("B");
	deq.offerLast("C");
	
	//앞에서 꺼내기
	System.out.println(deq.pollFirst());
	System.out.println(deq.pollFirst());
	System.out.println(deq.pollFirst());
    }

}
