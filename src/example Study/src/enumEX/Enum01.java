package enumEX;

public enum Enum01 {  //상수와 특정 값들을 연결하기 
    
    SK("에스케이"),
    LG("엘지"),
    KT("케이티"),
   SAMSUNG("삼성"),
   APPLE("애플");
    
    private final String value;
    
    Enum01(String value){
	
	this.value = value;
    }
    
    public String getValue() {
	return value;
    }

}
