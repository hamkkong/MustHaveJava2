package useWhile;

public class SellCoffee {

    public static void main(String[] args) {
	
	int coffee = 10; // 커피 양 
	int money = 300; //돈 
	
	System.out.println("while문 실행");
	while (money>0) {
	    
	    System.out.println("돈을 받았으니 커피를 판매합니다.");
	    coffee--;
	    System.out.println("남은 커피의 양은 " + coffee + "입니다.");
	    if (coffee == 0) {
		System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
		break;
	    }
	
	}
	System.out.println("while문 빠져 나옴!");

    }

}
