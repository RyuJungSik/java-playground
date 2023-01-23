import java.util.Scanner;

public class Calendar {
    private static final int[] MAX_DAYS={31,28,31,30,31,30,31,31,30,31,30,12};
    public void printSampleClender(){
        System.out.println("일 월 화 수 목 금 토");
        System.out.println("--------------------");
        System.out.println("1  2  3  4  5  6  7");
        System.out.println("8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
    }

    public int getMaxDaysOfMonth(int month){
        return MAX_DAYS[month-1];

    }

    public static void main(String[] args) {
        Calendar cal=new Calendar();
        //요구 사항 1
        cal.printSampleClender();


        //요구 사항 2
        Scanner scanner=new Scanner(System.in);
        System.out.println("두 수를 입력하세요.");
        String inputString=scanner.nextLine();
        String[] numArray=inputString.split(" ");
        int firstNumber = Integer.parseInt(numArray[0]);
        int secondNumber = Integer.parseInt(numArray[1]);
        System.out.println("두 수 합은" +(firstNumber+secondNumber) +" 입니다.");

        //요구 사항 3
        System.out.println("달을 입력하세요.");
        int month=scanner.nextInt();
        System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));

        //요구 사항 4
        System.out.println("반복횟수를 입력하세요.");
        int count=scanner.nextInt();
        for(int i=0;i<count;i++){
            System.out.println("달을 입력하세요.");
            month=scanner.nextInt();
            System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
        }

        //요구 사항 5
        while(true){
            System.out.println("달을 입력하세요.");
            month=scanner.nextInt();
            if(month==-1){
                System.out.println("Have a nice day!");
                break;
            }
            System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
        }
    }
}