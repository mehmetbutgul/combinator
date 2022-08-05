public class MathUtils {
    public static long combine(int num1, int num2){
        long first= factorize(num1);
        long second= factorize(num2);
        long third= factorize(num1-num2);
        return first/(second*third);
    }
    public static long factorize(int  number){
        long result= 1;
        for (;number>=2;number--){
            result*=number;
        }
        return result;
    }

}
