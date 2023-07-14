class Car3{
    
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    
    Car3(String modelName, int modelYear, String color, int maxSpeed){
	this.modelName = modelName;
	this.modelYear = modelYear;
	this.color = color;
	this.maxSpeed = maxSpeed;
	this.currentSpeed = 0;
    }
    
    public String getModel(){ 
	
	return this.modelYear + "년식 " + this.modelName + " " + this.color;
	
    }
    
}
public class Method4 {

    public static void main(String[] args) {
	// Car myCar = new Car(); //기본 생성자의 호출 (오류 발생)
	Car3 myCar = new Car3("아반떼", 2016 , "흰색", 200); //생성자의 호출 

	System.out.println(myCar.getModel());
    }

}
