import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
public class QueueStack {

    public static void main(String[] args) {
	
	Stack st = new Stack();
	Queue q = new LinkedList<>();  // Queue 인터페이스의 구현체 LinkedList 사용
	
	st.push("0");
	st.push("1");
	st.push("2");

	q.offer("0");
	q.offer("1");
	q.offer("2");
	
	while(!st.empty()) {
	    System.out.println(st.pop());
	}
	
	while(!q.isEmpty()) {
	    System.out.println(q.poll());
	}

    }

}
