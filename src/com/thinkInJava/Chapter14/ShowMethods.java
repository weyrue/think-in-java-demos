package com.thinkInJava.Chapter14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

import static com.thinkInJava.Chapter6.Print.print;

public class ShowMethods {
    public static void main(String[] args) {
        if (args.length < 1) {
            print(usage);
            System.exit(0);
        }

        int lines = 0;

        try {
            Class<?> c = Class.forName(args[0]);
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();

            if (args.length == 1) {
                for (Method method : methods) {
                    print(p.matcher(method.toString()).replaceAll(""));
                }
                for (Constructor ctor : ctors) {
                    print(p.matcher(ctor.toString()).replaceAll(""));
                }
                lines = methods.length + ctors.length;
            } else {
                for (Method method : methods) {
                    if (method.toString().indexOf(args[1]) != -1) {
                        print(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                }

                for (Constructor ctor : ctors) {
                    if (ctor.toString().indexOf(args[1]) != -1) {
                        print(p.matcher(ctor.toString()).replaceAll(""));
                        lines++;
                    }
                }
            }

        } catch (ClassNotFoundException e) {
            print("No such class: " + e);
        }
    }

    private static String usage = "usage:\n" +
            "ShowMethods qualifieds.class.name\n" +
            "To show all mehtods in class or:\n" +
            "ShowMethods qualifieds.class.word\n" +
            "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.");

}
