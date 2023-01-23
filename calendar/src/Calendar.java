import java.util.Scanner;

public class Calendar {
    private static final int[] MAX_DAYS={31,28,31,30,31,30,31,31,30,31,30,12};

    public int getMaxDaysOfMonth(int month){
        return MAX_DAYS[month-1];
    }

    public void printSampleClender(){
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("--------------------");
        System.out.println("1  2  3  4  5  6  7");
        System.out.println("8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
    }

    public void printRealClender(int year, int month){
        System.out.printf("<<<<<%3d %3d>>>>>\n",year, month);
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("--------------------");
        int nowMaxDays=MAX_DAYS[month];
        for(int i =0;i<nowMaxDays;i++){
            System.out.printf("%3d", i+1);
            if(i%7==6){
                System.out.println();
            }
        }
        System.out.println();
    }
}