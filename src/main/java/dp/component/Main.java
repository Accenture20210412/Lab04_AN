package main.java.dp.component;

public class Main {

    public static void main(String[] args) {

        Directory A = new Directory("A");
        File f1 = new File("f1.doc");
        File f2 = new File("f1.txt");
        File f3 = new File("f2.xls");
        A.add(f1);
        A.add(f2);
        A.add(f3);

        Directory B = new Directory("B");
        File f4 = new File("f4.mov");
        File f5 = new File("f5.m2t");
        File f6 = new File("f6.c");
        B.add(f4);
        B.add(f5);
        B.add(f6);
        A.add(B);

        Directory C = new Directory("C");
        File f7 = new File("abc.txt");
        C.add(f7);
        A.add(C);

        Directory D = new Directory("D");
        File f8 = new File("document.odt");
        D.add(f8);
        C.add(D);


    }
}
