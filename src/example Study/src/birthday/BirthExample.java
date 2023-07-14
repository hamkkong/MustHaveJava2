package birthday;

public abstract class BirthExample {
    
    public static void main(String[] args) {
    
    Birth iu = new Birth("아이유",1993,5,16); 
    Birth mingyung = new Birth("강민경", 1990, 8, 3);
    Birth haeri = new Birth("이해리", 1985, 2, 14);
    
    System.out.println(iu.getBirth());
    System.out.println(mingyung.getBirth());
    System.out.println(haeri.getBirth());

}

}
