package src;

import com.eclipsesource.v8.*;

public class Main {
    public static void main(String[] args) {
        V8 v8Runtime = V8.createV8Runtime();
        System.out.println("V8 Version: " + V8.getV8Version());
    }
}