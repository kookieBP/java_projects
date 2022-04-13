import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//
//        //for 문으로 다이아몬드 만들기
//        System.out.println("원하는 정수 <=2에 해당하는 숫자를 입력하세요: ");
//        int i = scan.nextInt();
//
//        if (2 < i) {
//            for (int j = 0; j < i; j++) {
//                for (int k = 0; k < i - j + 1; k++) {
//                    System.out.print(" ");
//                }
//                for (int k = 0; k < 2 * j + 1; k++) {
//                    System.out.print(".");
//                }
//                System.out.println(" ");
//            }
//
//            //첫줄은 점이 다 찍히고 공백은 없고, 마지막줄은 점 하나만 나오게하기!
//            for (int j = 0; j < i + 1; j++) {
//                for (int k = 0; k < j + 1; k++) {
//                    System.out.print(" ");
//                }
//                for (int k = -1; k < (i + i - j * 2); k++) {
//                    System.out.print(".");
//                }
//                System.out.println(" ");
//            }
//        }else {
//            System.out.println("다시 재생 하세요!");
//        }

        //for 문으로 정사각형 만들기
        System.out.println("원하는 정수 <=3에 해당하는 숫자를 입력하세요: ");
        int s = scan.nextInt();

        for(int a = 0; a < s; a++){
            for(int b = 0; b < s+2; b++){
                System.out.print(".");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }


}
