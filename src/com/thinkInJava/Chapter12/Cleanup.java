package com.thinkInJava.Chapter12;

public class Cleanup {
    public static void main(String[] args) {
        try {
            String current_dir = System.getProperty("user.dir");

            InputFile in = new InputFile(current_dir + "\\src\\com\\thinkInJava\\Chapter12\\Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null) System.out.println(s);
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace();
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }

    }
}
