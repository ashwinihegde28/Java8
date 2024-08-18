package org.example.staticIntro;

public class StaticVariableDemo {
    static  int cnt = 1;

    public void counter(){
        while (cnt <= 10){
            cnt++;
        }
        System.out.println(cnt);
    }
}
