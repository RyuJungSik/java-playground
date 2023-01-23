import java.util.Scanner;

public class Calendar {
    private static final int[] MAX_DAYS={31,28,31,30,31,30,31,31,30,31,30,12};

    public boolean isLeapYear(int year){
        if(year%4==0 && (year%100!=0 && year % 400==0)) return true;
        else return false;
    }
    public int whatDayStart(String day){
        if(day.equals("SU"))return 0;
        else if(day.equals("MO")) return 1;
        else if(day.equals("TU")) return 2;
        else if(day.equals("WE")) return 3;
        else if(day.equals("TH")) return 4;
        else if(day.equals("FR")) return 5;
        else return 6;
    }

    public int getMaxDaysOfMonth(int year, int month){
        if(isLeapYear(year)){
            MAX_DAYS[1]=29;
            return MAX_DAYS[month-1];
        }else{
            return MAX_DAYS[month-1];
        }

    }

    public void printSampleClender(){
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("--------------------");
        System.out.println("1  2  3  4  5  6  7");
        System.out.println("8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
    }

    public void printRealClender(int year, int month, String startDay){
        int nowMaxDays=getMaxDaysOfMonth(year,month);
        int startDayNumber=whatDayStart(startDay);
        System.out.printf("<<<<<%3d %3d>>>>>\n",year, month);
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("--------------------");
        for(int j=0;j<startDayNumber;j++){
            System.out.printf("   ");
        }
        for(int i =0;i<nowMaxDays;i++){
            System.out.printf("%3d", i+1);
            if((startDayNumber+i)%7==6){
                System.out.println();
            }
        }
        System.out.println();
    }
}