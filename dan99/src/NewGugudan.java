public class NewGugudan {
    public int[] calculate(int times){
        int[] resultCal=new int[100];
        for(int i=0;i<times;i++){
            resultCal[i]=times*(i+1);
        }
        return resultCal;
    }
    public void print(int times, int[] ressultCal){
        System.out.println(times+"단");
        for(int i=0;i<times;i++){
            System.out.println(times+" * "+(i+1)+" = "+ressultCal[i]);
        }
    }
}
