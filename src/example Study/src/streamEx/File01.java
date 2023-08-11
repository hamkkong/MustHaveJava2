package streamEx;

import java.io.File;

public class File01 { //C 드라이브를 열어주고 .list() 를 이용해서 파일 이름 정보를 names 배열에 넣은 것  

    public static void main(String[] args) {
	//new File("새로 만들거나 제어하고 싶은 파일이나 폴더의 경로")
	File f = new File("c://Users/ihyemi/Documents/workspace/mustHaveJava2/MustHaveJava/src/address\\ book ");
	String[] names = f.list();
	// 배열에 있는 내용을 반복문 돌면서 콘솔창에 모두 출력할 수 있을까?
	
	if (names != null) {
	for (int i=0; i< names.length; i++) {
	    String tmp = names[i];
	    System.out.println(tmp);
	}
	
	System.out.println("확장 for 문을 이용하면");
	for(String tmp : names) {
	    System.out.println(tmp);
	}
	
	}else {
	    System.out.println("해당 경로에 파일이나 폴더가 없습니다.");
	}

    }

}
