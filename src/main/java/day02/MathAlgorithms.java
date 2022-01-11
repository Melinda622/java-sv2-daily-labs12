package day02;

public class MathAlgorithms {

    public int greatestCommonDivisor(int a, int b){

        int divisor=0;

        if(b<=a){
            for (int i = 1; i <=b ; i++) {
                if(a%i==0&&b%i==0){
                    divisor=i;
                }
            }
        }else{
            for (int i = 1; i <=a ; i++) {
                if(a%i==0&&b%i==0){
                    divisor=i;
                }
            }
        }
        return divisor;
    }
}
