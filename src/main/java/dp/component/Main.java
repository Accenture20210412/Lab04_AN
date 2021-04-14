package main.java.dp.component;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Directory> directories = new ArrayList<>();

        Directory a = new Directory("A");
        File f1 = new File("f1.doc");
        File f2 = new File("f1.txt");
        File f3 = new File("f2.xls");
        a.add(f1);
        a.add(f2);
        a.add(f3);

        Directory b = new Directory("B");
        File f4 = new File("f4.mov");
        File f5 = new File("f5.m2t");
        File f6 = new File("f6.c");
        b.add(f4);
        b.add(f5);
        b.add(f6);
        a.add(b);

        Directory c = new Directory("C");
        File f7 = new File("abc.txt");
        c.add(f7);
        a.add(c);

        Directory d = new Directory("D");
        File f8 = new File("document.odt");
        d.add(f8);
        c.add(d);

        directories.add(a);
        directories.add(b);
        directories.add(c);
        directories.add(d);

        for (Directory directory : directories) {
            if(directories.contains(f8)) directory.removeElementIncluded(f8.getName());
            b.add(f8);
        }


    }
}
