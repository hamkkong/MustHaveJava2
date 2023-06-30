class BoxA1{
    
}
public class Exam01_ArrayInstance {

    public static void main(String[] args) {
	
	// 길이가 5인 int형 1차원 배열 생성
	int[] ar1 = new int[5];
	
	//길이가 7인 double형 1차원 배열 생성
	double[] ar2 = new double[7];
	
	//배열의 참조 변수와 객체 생성 분리
	float[] ar3;
	ar3 = new float[9];
	
	//객체 대상 1차원 배열
	BoxA1[] ar4 = new BoxA1[5];
	
	//배열의 객체 변수 접근 / 메서드 사용
	System.out.println("배열 ar1 길이 : " + ar1.length);
	System.out.println("배열 ar2 길이 : " + ar2.length);
	System.out.println("배열 ar3 길이 : " + ar3.length);
	System.out.println("배열 ar4 길이 : " + ar4.length);
	
    }

}
