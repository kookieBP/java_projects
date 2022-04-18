import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //for 문으로 다이아몬드 만들기
        System.out.println("원하는 정수 <=2에 해당하는 숫자를 입력하세요: ");
        int i = scan.nextInt();

        if (2 < i) {
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < i - j + 1; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 2 * j + 1; k++) {
                    System.out.print(".");
                }
                System.out.println(" ");
            }

            //첫줄은 점이 다 찍히고 공백은 없고, 마지막줄은 점 하나만 나오게하기!
            for (int j = 0; j < i + 1; j++) {
                for (int k = 0; k < j + 1; k++) {
                    System.out.print(" ");
                }
                for (int k = -1; k < (i + i - j * 2); k++) {
                    System.out.print(".");
                }
                System.out.println(" ");
            }
        }else {
            System.out.println("다시 재생 하세요!");
        }

        //for 문으로 정사각형 만들기
        System.out.println("원하는 정수 <=2에 해당하는 숫자를 입력하세요: ");
        int s = scan.nextInt();

        if(2<s){
            for(int a = 0; a < s; a++){
                for(int b = 0; b < s; b++){
                    System.out.print(".");
                    System.out.print("  ");
                }
                System.out.println(" ");
        }
        }else {
            System.out.println("다시 재생 하세요!");
        }


        //원 만들기 전 납작한 마름
        for (int p = 0; p < 5; p++) {
            for (int j = 0; j < -3 * p + 13; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * p + 3; j++) {
                System.out.print(".");
                System.out.print("   ");
                System.out.print("  ");
            }
            System.out.println(" ");
        }

        for (int u = 0; u < 5; u++) {

            //1 4
            for(int j = 0; j < 3 * u + 1; j++){
                System.out.print("  ");
            }
            //12,10,8,6,4
            for (int j = 0; j < -2 * u + 11; j++) {
                System.out.print(".");
                System.out.print("   ");
                System.out.print("  ");
            }
            System.out.println(" ");
        }


        //입력 받은 숫자대로 가로가 긴 마름모 만들기
        System.out.println("원하는 정수 <=10에 해당하는 숫자를 입력하세요: ");
        int c = scan.nextInt();

        for(int p = 0; p < c; p++) {
            for (int j = c; j > p; j--) {
                System.out.print("     ");

            }
            for (int j = 0; j < 2 * p + 3; j++) {
                System.out.print(".");
                System.out.print("    ");

            }
            System.out.println(" ");


        }
        for(int p = 0; p <c; p++){
            for(int j = 0; j < p+1; j++){
                System.out.print("     ");
            }
            for(int j = c; j > 2*p-c-1; j--){
                System.out.print(".");
                System.out.print("    ");
            }
            System.out.println(" ");

        }




        //배열로 삼각형 만들기

        int[][] z = new int[5][5];
        int e=0;



        for(int r = 0;r<5;r++){  //r는 행, l는 열
            for(int l=r;l<5;l++){
                e= e+1;
                z[r][l] = e;

            }
        }
        for(int r = 0; r<5;r++){
            for(int l =0; l<5; l++){
                System.out.print(z[r][l]+"\t");
            }
            System.out.println();
        }



    }
}