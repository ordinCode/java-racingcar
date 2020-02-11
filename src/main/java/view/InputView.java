package view;

import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputCarName() {
        System.out.println("이름을 입력하세요");
        return scanner.nextLine();
    }

    public static int inputRoundNumber(){
        System.out.println("시도할 횟수 입력");
        return scanner.nextInt();
    }
}
