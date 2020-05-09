package Palyndrom;

import org.junit.Test;

public class Polyndrom_Integer {

    @Test
    public void test(){
        int a= 12343321;
        System.out.println(isPolyndrom(a));

    }

    public boolean isPolyndrom(int number){

        int old = number;
        int result =0;

        while(number>0){
            int reminder = number%10;
            result =result*10 +reminder;
            number/=10;
        }

        return result==old;
    }
}
