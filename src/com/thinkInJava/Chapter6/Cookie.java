package com.thinkInJava.Chapter6;

public class Cookie {
    public Cookie() {
        Print.print("Cookie constructor");
    }

    private void bitePrivate() {
        Print.print("bitePrivate");
    }

    protected void biteProtected() {
        Print.print("biteProtected");
    }

    public void bitePublic() {
        Print.print("bitePublic");
    }
}
