public class NewGugudan2 {
    public int[] calculate(int times, int second){
        int[] resultCal=new int[100];
        for(int i=0;i<second;i++){
            resultCal[i]=times*(i+1);
        }
        return resultCal;
    }
    public void print(int times, int second, int[] ressultCal){
        System.out.println(times+"단");
        for(int i=0;i<second;i++){
            System.out.println(times+" * "+(i+1)+" = "+ressultCal[i]);
        }
    }
}
