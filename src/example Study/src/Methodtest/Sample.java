package Methodtest;

public class Sample {
    void varTest(int a) {
	
	a++;
    }

    public static void main(String[] args) {
	
	int a = 1;
	Sample sample = new Sample();
	sample.varTest(a);
	System.out.println(a);
    }

}
