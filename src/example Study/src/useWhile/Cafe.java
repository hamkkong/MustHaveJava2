package useWhile;

public class Cafe {

    public static void main(String[] args) {
	
	int coffee = 10; // 커피 양
	int money = 0; //돈 
	
	System.out.println("while문 실행");
	while (money <= 100) {
	    
	    if (money == 100) {
		System.out.println("장사 끝 !!! :");
		break;
	    }
	    System.out.println("돈을 받았으니 커피를 판매합니다.");
	    money += 10;
	    coffee--;
	    System.out.println("[돈]"+ money);
	    System.out.println("[커피]"+coffee);
	    
	    if (money == 100) {
		System.out.println("남은 커피의 양은 " + coffee + "입니다.");
		System.out.println("돈을 다 모았습니다.");
		continue;
	    }
	    System.out.println("힘들다... 힘내자!!"); //while문 안쪽에 써두면 반복하면서 출력  
	}
	System.out.println("while문 빠져 나옴!");

    }

}
