
public class Seller extends Goods{
    
    String sellerName;
   
    
    
    public void print() {
	
	System.out.println("상품 이름은 "+ this.goodsName  +"이고, "
		+ "상품수량은 " + this.goodsCount + "입니다.");
	System.out.println(this.goodsName + "상품은 " 
		+ this.sellerName + "이 판매 담당자 입니다. ");
    }
    

}
