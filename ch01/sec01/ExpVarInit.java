package ch01.sec01;

public class ExpVarInit {
    public static void main(String[] args) {

        int a1, b1, c1; // init, not assigning
        int a2, b2, c2 = 0; // only c2 gets '0'

        // All gets '0'
        int b3, c3;
        int a3 = b3 = c3 = 0;

        int a4 = 0, b4 = 0, c4 = 0; // better, more explicit
    }
}