package birthday;

public class Birth {
    
    private int year;
    private int month;
    private int day;
    private String name;
    
  Birth(String name, int year, int month, int day) { // public void set 생략가능 
	
      this.year = year;
      this.month = month;
      this.day = day;
      this.name = name;
      
    }
  public String getBirth() {
      
      return this.name  + "의 생일은 " + this.year + " 년 " + this.month + " 월 " + this.day +" 일 "+ "입니다."; 
	     
  }

}
