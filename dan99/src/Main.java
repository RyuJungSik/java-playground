import java.util.Scanner;

public class Main {
    //요구 사항 5
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Scanner scanner =new Scanner(System.in);

        //요구 사항 1
        System.out.println("2단");
        for(int i =1;i<10;i++){
            System.out.println("2 * "+i+" = "+2*i);
        }

        System.out.println("3단");
        for(int i =1;i<10;i++){
            System.out.println("3 * "+i+" = "+3*i);
        }

        //요구 사항 2
        int result=0;
        System.out.println("4단");
        for(int i =1;i<10;i++){
            result=4*i;
            System.out.println("4 * "+i+" = "+result);
        }

        System.out.println("5단");
        for(int i =1;i<10;i++){
            result=5*i;
            System.out.println("5 * "+i+" = "+result);
        }

        //요구 사항 3
        System.out.println("6단");
        for(int i =1;i<10;i++){
            System.out.println("6 * "+i+" = "+6*i);
        }

        System.out.println("7단");
        for(int i =1;i<10;i++){
            System.out.println("7 * "+i+" = "+7*i);
        }

        //요구 사항 4
        System.out.println("구구단 중 출력할 단은? : ");
        int dan=in.nextInt();

        if(dan <2 || dan>9){
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
        }else{
            System.out.println(dan+"단");
            for(int i =1;i<10;i++){
                System.out.println(dan+" * "+i+" = "+dan*i);
            }
        }

        //요구 사항 5
        int[] resultArr = new int[9];
        for(int i =1;i<10;i++){
            resultArr[i-1]=2*i;
        }
        System.out.println("2단");
        for(int i =1;i<10;i++){
            System.out.println("2 * "+i+" = "+resultArr[i-1]);
        }

        //요구 사항 6
//        int times=3;
//        int [] resultMethod=calculate(times);
//        print(times,resultMethod);

        //요구 사항 7
        int times=4;
        Gugudan oneGame=new Gugudan();
        int [] resultMethod=oneGame.calculate(times);
        oneGame.print(times,resultMethod);

        //요구 사항 8
        times=8;
        NewGugudan twoGame=new NewGugudan();
        int [] resultMethod2=twoGame.calculate(times);
        twoGame.print(times,resultMethod2);

        String inputValue=scanner.nextLine();
        String [] splitedValue=inputValue.split(",");
        int first=Integer.parseInt(splitedValue[0]);
        int second=Integer.parseInt(splitedValue[1]);
        NewGugudan2 thirdGema=new NewGugudan2();
        for(int i=2;i<first+1;i++){
            int[] resultMethod3=thirdGema.calculate(i,second);
            thirdGema.print(i,second, resultMethod3);
        }
    }
}