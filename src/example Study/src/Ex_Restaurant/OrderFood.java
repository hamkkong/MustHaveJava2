package Ex_Restaurant;

interface ResCustomer{
    
    String getOrder();
    
}

// ResCustomer 클래스로부터 단골손님 A와 B 상속 
class ResCustomerA implements ResCustomer {
    public String getOrder() {
	return "손님A에게 김치찌개를 준다." ;
    }
}

class ResCustomerB implements ResCustomer {
    public String getOrder() {
	return "손님B에게 제육볶음을 준다";
    }
}

// 식당 사장 
class ResOwner { 
    public void giveFood(ResCustomer rescustomer) {
	System.out.println(rescustomer.getOrder());
    }
    
}
//음식 주문 
public class OrderFood {

    public static void main(String[] args) {
	ResOwner owner = new ResOwner();
	ResCustomerA a = new ResCustomerA();
	ResCustomerB b = new ResCustomerB();

	owner.giveFood(a);
	owner.giveFood(b);
    }

}
