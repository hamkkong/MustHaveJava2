
class People<T, M> {
    private T name;
    private M age;

    People(T name, M age) { // 생성자
	this.name = name;
	this.age = age;
    }

    public T getName(){  //게터 
	 return name;
		
    }

    public void setName(T name) {  // 세터
	this.name = name;
    }

    public M getAge() {
	return age;
    }

    // Generic Method
    public static <T, V> boolean compare(People<T, V> p1, People<T, V> p2) {
	boolean nameCompare = p1.getName().equals(p2.getName());
	boolean ageCompare = p1.getAge().equals(p2.getAge());
	return nameCompare && ageCompare;

    }
}

public class ExGeneric {
    public static void main(String[] args) {
	// 타입 파라미터 지정
	People<String, Integer> p1 = new People<String,Integer>("Jack", 20);
	// 타입 파라미터 추정
	People<String, Integer> p2 = new People("Steve", 30);
	// GenericMeThod 호출
	boolean result = p1.compare(p1, p2);
	System.out.println(result);
    }
}