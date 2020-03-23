package com.epam;

public class App{
    public static boolean check(int ind,String str){
        if(str.charAt(ind)=='A' || str.charAt(ind)=='a')
            return true;
        else
            return false;
    }
    public static String solve(String str){
        if(str.length()==0){
            return "";
        }
        else if(str.length()==1){
            if(check(0,str))
                return "";
            else
                return str;
        }
        else{
            if(check(0,str)) {
                str = str.substring(1, str.length());
                if (check(0, str)) {
                    str = str.substring(1, str.length());
                    return str;
                }
                else
                    return str;
            }
            else{
                if(check(1,str)){
                    str = str.charAt(0) + str.substring(2, str.length());
                    return str;
                }
                else
                    return str;
            }
        }
    }
}
