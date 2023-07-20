package thisReferance;

class Car {  //Car가 클래스와 메서드로 중첩되는 경우 public 을 붙이지 않는다. 붙이면 에러남! 
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    
    Car(String modelName, int modelYear, String color,int maxSpeed, int currentSpeed){
	
	this.modelName = modelName;
	this.modelYear = modelYear;
	this.color = color;
	this.maxSpeed = maxSpeed;
	this.currentSpeed = 0;
	
    }
    
    Car(){
	this("소나타", 2012, "검정색", 160,0); //다른 생성자를 호출함.
    }
    
   public String getModel() {
       
       return this.modelYear + "년식 " + this.modelName + " " + this.color;
   }

}

public class Method05{
    public static void main(String[]args) {
	Car tcpCar = new Car();
	System.out.println(tcpCar.getModel());
    }
}