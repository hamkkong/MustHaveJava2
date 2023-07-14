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
	
	 setName(name);  // 메서드 사용 
	 setYear(year);
	 setMonth(month);
	 setDay(day);

    }

    public int getYear() {
	return year;
    }

    public void setYear(int year) {
	this.year = year;
    }

    public int getMonth() {
	return month;
    }

    public void setMonth(int month) {
	this.month = month;
    }

    public int getDay() {
	return day;
    }

    public void setDay(int day) {
	this.day = day;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getBirth() {  // 기본적인 게터, 세터 추출 방법 

	return this.name + "의 생일은 " + this.year + " 년 " + this.month + " 월 " + this.day + " 일 " + "입니다.";

    }


   void printHumanBirth() {  //메서드 생성해서 바로 불러오기 
       
       System.out.println(getName()+ "의 생년월일");
       System.out.println(getYear() + " 년 " + getMonth() +" 월 "+ getDay()+"일");
   
	}
}
