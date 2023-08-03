package variableEX;

import java.util.Arrays;
import java.util.List;

public class Main4 {

    public static void main(String[] args) {

	printArgs("Hello,\t", "World \n"); // 가변인수를 사용한 경우

	List<String> argList = Arrays.asList("Hello,\t", "World \n");
	printArgs(argList); // List 를 사용한 경우

    }

    public static void printArgs(String... args) {
	for (String arg : args) {
	    System.out.print(arg);
	}
    }

    public static void printArgs(List<String> args) {
	for (String arg : args) {
	    System.out.print(arg);
	}
    }

}
