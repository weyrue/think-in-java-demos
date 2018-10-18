package com.thinkInJava.Chapter12;

public class Practice1to5 {
    public static void main(String[] args) {
        String s = null;
        try {
            s.length();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Practice 2.");
        }

        Integer[] sArray = {1, 2, 3};
        try {
            System.out.println(sArray[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        try{
            new Practice1to5().throwPractice4Exception();
        }catch(Practice4Exception e){
            e.printStackTrace();
        }
    }

    public void throwPractice4Exception() throws Practice4Exception{
        throw new Practice4Exception("This is Practice4Exception test.");
    }
}

class Practice4Exception extends Exception {
    public Practice4Exception() {
    }

    public Practice4Exception(String s) {
        super(s);
    }
}
