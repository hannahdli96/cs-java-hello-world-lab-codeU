package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
        String s = System.getProperty("java.specification.version");
        return Double.parseDouble(s);
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
	    System.out.println(getVersion());
    }
}
