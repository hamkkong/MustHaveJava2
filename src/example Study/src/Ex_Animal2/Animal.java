package Ex_Animal2;

public interface Animal {   // 인터페이스는 자체가 클래스이다. 클래스를 덧붙여 쓰지 말것!
    
    public static final String name = "동물";
    
   public abstract void move();   //abstract 가 들어간 추상 메서드 
   public abstract void eat();
   public abstract void bark();

}
