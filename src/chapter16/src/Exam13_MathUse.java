public class Exam13_MathUse {

    public static void main(String[] args) {
	System.out.println("4의 제곱근 : " + Math.toDegrees(Math.PI));
	System.out.println("log2(8) : " + baseLog(8, 2));
	System.out.println("2의 3승 : " + Math.pow(2, 3));
	System.out.println();
	
	System.out.println("원주율 : " + Math.PI);
	System.out.println("파이에 대한 Degree : " + Math.toDegrees(Math.PI));
	System.out.println("2파이에 대한 Degree : " + Math.toDegrees(2.0*Math.PI));
	
	System.out.println();
	
	double radian45 = Math.toRadians(45);  // 라디안으로 변환!
	
	System.out.println("싸인 45 : " + Math.sin(radian45));
	System.out.println("코싸인 45 : " + Math.cos(radian45));
	System.out.println("탄젠트 45 : " + Math.tan(radian45));	

    }
    
    public static double baseLog(double x, double base) {
	
	return Math.log(x) / Math.log(base);
    }

}
