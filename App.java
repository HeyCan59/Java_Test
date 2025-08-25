/*
編譯 javac App.java
執行 java App
打包 jar cvfm test.jar manifest.txt *.class
*/

import math.BasicMath;
import math.geometry.Rectangle;

class App{
    public static void main(String[] args) {
        System.out.println(BasicMath.PI);
        int result=BasicMath.add(3, 4);
        System.out.println(result);
        System.out.println(Rectangle.GOLDEN_RATIO);
    }
}