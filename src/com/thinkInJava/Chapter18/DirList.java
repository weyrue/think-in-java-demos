package com.thinkInJava.Chapter18;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {
    public static void main(String[] args) {
        DirList dirList = new DirList();
        dirList.test("sss");

        // (./ 代表当前的工作空间?)
        File path = new File("./src/com/thinkInJava/Chapter12");
        String[] list;

        if (args.length == 0) {
            list = path.list();
        } else {
//            list = path.list(new DirFilter(args[0]));
            list = path.list(dirFilter2(args[0]));

        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }

    public static FilenameFilter dirFilter2(final String regex) {
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher((name)).matches();
            }
        };
    }

    public Inner test(final String str) {
        return new Inner() {
            @Override
            public void f() {
                System.out.println(str);
            }
        };
    }
}

class DirFilter implements FilenameFilter {
    private Pattern pattern;

    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher((name)).matches();
    }
}

interface Inner {
    void f();
}
