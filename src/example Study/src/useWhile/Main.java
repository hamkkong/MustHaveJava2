package useWhile;

public class Main {    

    public static void main(String[] args) {
	
	int count = 0;
	
	// while 조건이 참이면 반복문이 계속 실행된다. (true 일 경우 무한루프)
	while(count <10) { // 조건을 정해주면 정해진 조건만큼만 반복한다.
	    count++;
	    System.out.println("count : " + count);
	    
	    if (count == 10) {
		System.out.println("count 값이 10이면 반복문 종료 count 값 : " +count);
	    }
	}

    }   // while 조건이 false(거짓)이면 반복문은 종료된다.

}
