
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("введите математическое выражение");
        Scanner scan = new Scanner(System.in);
        String strEnter = scan.nextLine();


        String strWithOut1 = strEnter.replaceAll("/", "");
        String strWithOut2 = strEnter.replaceAll("\\*", "");
        String strWithOut3 = strEnter.replaceAll("-", "");
        String strWithOut4 = strEnter.replaceAll("\\+", "");

        int intWO11 = strWithOut1.length();
        int intWO12 = strEnter.length();
        int intWO13 = intWO12 - intWO11; // кол-во символов математической операции "/"
        int intWO21 = strWithOut2.length();
        int intWO22 = strEnter.length();
        int intWO23 = intWO22 - intWO21; // кол-во символов математической операции "*"
        int intWO31 = strWithOut3.length();
        int intWO32 = strEnter.length();
        int intWO33 = intWO32 - intWO31; // кол-во символов математической операции "-"
        int intWO41 = strWithOut4.length();
        int intWO42 = strEnter.length();
        int intWO43 = intWO42 - intWO41; // кол-во символов математической операции "+"
        int intWOSum = intWO13 + intWO23 + intWO33 + intWO43; // должна быть равна единице

        if (intWOSum == 1) {

                int intForSwitch = intWO13 + intWO23 * 2 + intWO33 * 3 + intWO43 * 4;

                switch (intForSwitch) {
                    case 1:
                        String[] strEnSplit1 = strEnter.split("/");

                            try {
                                Rum strEnSplitRum1 = Rum.valueOf(strEnSplit1[0]);
                                Rum strEnSplitRum2 = Rum.valueOf(strEnSplit1[1]);
                                int intRum1 = Integer.parseInt(strEnSplitRum1.getTransToNum());
                                int intRum2 = Integer.parseInt(strEnSplitRum2.getTransToNum());
                                int intOutRum = intRum1/intRum2;
                                try {
                                    RumOut OutRum = RumOut.values()[intOutRum-1];
                                    System.out.println(OutRum);
                                }catch (ArrayIndexOutOfBoundsException ae){
                                    System.out.println("в римской системе исчесления нет отрицательных чисел и нуля");
                                }
                          } catch (IllegalArgumentException il) {
                                try {
                                    int intExceptionInt11 = Integer.parseInt(strEnSplit1[0].trim());
                                    int intExceptionInt21 = Integer.parseInt(strEnSplit1[1].trim());
                                    if(intExceptionInt11 >= 1 & intExceptionInt11 <= 10 & intExceptionInt21 >= 1 & intExceptionInt21 <= 10){
                                        System.out.println(intExceptionInt11 / intExceptionInt21);
                                    } else {
                                        System.out.println("принимаются только числа в диапозоне от 1 до 10 (от I до X)");
                                    }
                                } catch (NumberFormatException nfe){
                                    System.out.println("принимаются только числа в диапозоне от 1 до 10 (от I до X)");
                                }
                            }
                         break;
                    case 2:
                        String[] strEnSplit2 = strEnter.split("\\*");

                        try {
                            Rum strEnSplitRum1 = Rum.valueOf(strEnSplit2[0]);
                            Rum strEnSplitRum2 = Rum.valueOf(strEnSplit2[1]);
                            int intRum1 = Integer.parseInt(strEnSplitRum1.getTransToNum());
                            int intRum2 = Integer.parseInt(strEnSplitRum2.getTransToNum());
                            int intOutRum = intRum1*intRum2;
                            try {
                                RumOut OutRum = RumOut.values()[intOutRum-1];
                                System.out.println(OutRum);
                            }catch (ArrayIndexOutOfBoundsException ae){
                                System.out.println("в римской системе исчесления нет отрицательных чисел и нуля");
                            }
                        } catch (IllegalArgumentException il) {
                            try {
                                int intExceptionInt11 = Integer.parseInt(strEnSplit2[0].trim());
                                int intExceptionInt21 = Integer.parseInt(strEnSplit2[1].trim());
                                if(intExceptionInt11 >= 1 & intExceptionInt11 <= 10 & intExceptionInt21 >= 1 & intExceptionInt21 <= 10){
                                    System.out.println(intExceptionInt11 * intExceptionInt21);
                                } else {
                                    System.out.println("принимаются только числа в диапозоне от 1 до 10 (от I до X)");
                                }
                            } catch (NumberFormatException nfe){
                                System.out.println("принимаются только числа в диапозоне от 1 до 10 (от I до X)");
                            }
                        }
                        break;
                    case 3:
                        String[] strEnSplit3 = strEnter.split("-");

                        try {
                            Rum strEnSplitRum1 = Rum.valueOf(strEnSplit3[0]);
                            Rum strEnSplitRum2 = Rum.valueOf(strEnSplit3[1]);
                            int intRum1 = Integer.parseInt(strEnSplitRum1.getTransToNum());
                            int intRum2 = Integer.parseInt(strEnSplitRum2.getTransToNum());
                            int intOutRum = intRum1-intRum2;
                            try {
                                RumOut OutRum = RumOut.values()[intOutRum-1];
                                System.out.println(OutRum);
                            }catch (ArrayIndexOutOfBoundsException ae){
                                System.out.println("в римской системе исчесления нет отрицательных чисел и нуля");
                            }
                        } catch (IllegalArgumentException il) {
                            try {
                                int intExceptionInt11 = Integer.parseInt(strEnSplit3[0].trim());
                                int intExceptionInt21 = Integer.parseInt(strEnSplit3[1].trim());
                                if(intExceptionInt11 >= 1 & intExceptionInt11 <= 10 & intExceptionInt21 >= 1 & intExceptionInt21 <= 10){
                                    System.out.println(intExceptionInt11 - intExceptionInt21);
                                } else {
                                    System.out.println("принимаются только числа в диапозоне от 1 до 10 (от I до X)");
                                }
                            } catch (NumberFormatException nfe){
                                System.out.println("принимаются только числа в диапозоне от 1 до 10 (от I до X)");
                            }
                        }
                        break;
                    case 4:
                        String[] strEnSplit4 = strEnter.split("\\+");

                        try {
                            Rum strEnSplitRum1 = Rum.valueOf(strEnSplit4[0]);
                            Rum strEnSplitRum2 = Rum.valueOf(strEnSplit4[1]);
                            int intRum1 = Integer.parseInt(strEnSplitRum1.getTransToNum());
                            int intRum2 = Integer.parseInt(strEnSplitRum2.getTransToNum());
                            int intOutRum = intRum1+intRum2;
                            try {
                                RumOut OutRum = RumOut.values()[intOutRum-1];
                                System.out.println(OutRum);
                            }catch (ArrayIndexOutOfBoundsException ae){
                                System.out.println("в римской системе исчесления нет отрицательных чисел и нуля");
                            }
                        } catch (IllegalArgumentException il) {
                            try {
                                int intExceptionInt11 = Integer.parseInt(strEnSplit4[0].trim());
                                int intExceptionInt21 = Integer.parseInt(strEnSplit4[1].trim());
                                if(intExceptionInt11 >= 1 & intExceptionInt11 <= 10 & intExceptionInt21 >= 1 & intExceptionInt21 <= 10){
                                    System.out.println(intExceptionInt11 + intExceptionInt21);
                                } else {
                                    System.out.println("принимаются только числа в диапозоне от 1 до 10 (от I до X)");
                                }
                            } catch (NumberFormatException nfe){
                                System.out.println("принимаются только числа в диапозоне от 1 до 10 (от I до X)");
                            }
                        }
                        break;

                }




        } else {
            System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }

                }

        }