
public class Exam02_PackageUse {

    public static void main(String[] args) {
	Apple apple = new Apple();
	apple.showName();
	
	//Banana banana = new Banana();
	com.study.Banana banana = new com.study.Banana();
	banana.showName();

    }

}
