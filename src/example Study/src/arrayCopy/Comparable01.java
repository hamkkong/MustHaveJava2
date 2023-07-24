package arrayCopy;

class Car implements Comparable <Car> {  // 지금부터 Comparable 인스턴스를 사용하겠다 선언 
    
    private String modelName;
    private int modelYear;
    private String color;
    
    Car(String mn, int my, String c) {
	
	this.modelName = mn;
	this.modelYear = my;
	this.color = c;
    }
    
    public String getModel() {
	
	return this.modelYear + "식" + this.modelName + "" + this.color;
    }
    
    public int compareTo(Car obj) {  //compareTo 인터페이스 사용 
	
	if (this.modelYear == obj.modelYear) {  // 두 자동차의 년식을 비교한다. 
	    return 0;  // this. 와 obj. 가 서로 같다면 0을 반환하라.
	}else if (this.modelYear<obj.modelYear) {
	    return -1; // this.가 obj.보다 작다면 -1 을 반환하라. (2016 > 2010)
	}
	else {
	    return 1;  // this.가 obj.보다 크다면 1을 반환하라.  (2016 > 2010)
	}
    }
}

public class Comparable01 {

    public static void main(String[] args) {
	Car car01 = new Car("아반떼", 2016,"노란색");
	Car car02 = new Car("소나타", 2010,"흰색");
	
	System.out.println(car01.compareTo(car02));

    }  // 아반떼가 소나타보다  최신 모델이기 때문에 (2016>2010) 1이 출력됨. 
    	// 두 자동차의 년식이 같은 경우 0을, 년식이 역순으로 설정된 경우 -1을 출력함.
}
