package arrayExam;

public class Ex06 {

    public static void main(String[] args) {
	System.out.println("----- 배열 복사 (얕은 복사) -----");
		
	int [] iArr1 = new int[] {1, 2, 3, 4};
	int [] iArr2 = iArr1;
	for (int i = 0; i <iArr1.length; i++) {
	    System.out.println("iArr1[" + i+ "]:" + iArr1[i]+"|iArr2[" + i + "]"+ iArr2[i]);
	}
	System.out.println("---- 배열 복사 후 값 변경 ----");
	
	iArr1[0] = 15; //동일한 참조값으로 변경을 하기 때문에 iArr1이나 iArr2 모두 변경된 것으로 보임 
	
	iArr1[3] = 25; //동일한 참조값으로 변경을 하기 때문에 iArr1이나 iArr2 모두 변경된 것으로 보임 
	for(int i = 0; i < iArr1.length; i++) {
	    System.out.println("iArr1[" + i + "]:" + iArr1[i] + "|iArr2[" + i + "]" + iArr2[i]);
	}
	System.out.println("---- 참조값 확인 ----");
	System.out.println("iArr1 참조값 : " + iArr1); 
	System.out.println("iArr2 참조값 : " + iArr2); 
    }

}
