class Car2 {
    
    private String modelName = "소나타";
    private int modelYear = 2016;
    private String color = "파란색";
    
    public String getModel() {
	
	return this.modelYear + "년식 " + this.color + " " + this.modelName;
    }
}
public class Method03 {

    public static void main(String[] args) {
	Car2 myCar = new Car2();  //기본 생성자의 호출 
	System.out.println(myCar.getModel());  // 2016년식 파란색 소나타 

    }

}
