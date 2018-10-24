import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //01月份轉換
        Scanner scn = new Scanner(System.in);
        int month =scn.nextInt();
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
        //02季節轉月份
//        Scanner scn = new Scanner(System.in);
//        String str =scn.next();
//        switch (str){
//            case "Spring":
//                System.out.println("2~4月");
//                break;
//            case "Summer":
//                System.out.println("5~7月");
//                break;
//            case "Autumn":
//                System.out.println("8~10月");
//                break;
//            case "Winter":
//                System.out.println("11~1月");
//                break;
//        }
        //03奇數合
//        Scanner scn = new Scanner(System.in);
//        int a=scn.nextInt(),b=scn.nextInt();
//        int sum=0;
//        if (a<b){
//            for (int i=a;i<=b;i++){
//                if (i%2==1){
//                    sum+=i;
//                }
//            }
//            System.out.println(sum);
//        }
        //04偶數合
//        Scanner scn = new Scanner(System.in);
//        int a=scn.nextInt(),b=scn.nextInt();
//        int sum=0;
//        if (a<b){
//            for (int i=a;i<=b;i++){
//                if (i%2==0){
//                    sum+=i;
//                }
//            }
//            System.out.println(sum);
//        }
    }
}
