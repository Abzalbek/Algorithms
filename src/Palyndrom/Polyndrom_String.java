package Palyndrom;

import org.junit.Test;

public class Polyndrom_String {

    @Test
    public void test(){
        String str = "aziza";
        String str2 = "ggr";
        System.out.println(str+" : "+isPolyndrom(str));
        System.out.println(str2+" : "+isPolyndrom(str2));

    }

    public boolean isPolyndrom(String str){
        if(str.length()<2){
            return true;
        }

        if(str.charAt(0) == str.charAt(str.length()-1)){
            return isPolyndrom(str.substring(1,str.length()-1));
        }else {
            return false;
        }
    }
}
