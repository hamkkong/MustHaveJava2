package birthday;

public abstract class BirthExample {
    
    public static void main(String[] args) {
    
    Birth iu = new Birth("아이유",1993,5,16); 
    Birth mingyung = new Birth("강민경", 1990, 8, 3);
    Birth haeri = new Birth("이해리", 1985, 2, 14);
    
    System.out.println(iu.getBirth());
    System.out.println(mingyung.getBirth());
    System.out.println(haeri.getBirth());
    System.out.println("---------------------------------");  //게터, 세터로 불러온것
  
    
    iu.printHumanBirth();
    mingyung.printHumanBirth();
    haeri.printHumanBirth();      // get, set 메서드를 작성해서 불러온것 
}

}
