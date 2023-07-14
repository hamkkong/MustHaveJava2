package counter;
class Counter{
    
   static int count = 0;
    Counter(){
	count++;    //count는 더이상 객체변수가 아니므로 this를 제거하는 것이 좋다. 
	System.out.println(count); //this 제거 
    }
    
    public static int getCount() {  //  게터 메서드 (이 메서드가 들어있는 상위 클래스에 호출을 해야지만  출력된다.)
	                             // static 으로 인해 이 메서드에 바로 접근할수 없기 때문이다.
	return count;
    }
}


public class Sample {

    public static void main(String[] args) {
	Counter c1 = new Counter();      // 1
	Counter c2 = new Counter();      // 2
	
	System.out.println(Counter.getCount());    // 2

    }

}
