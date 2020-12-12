package com.itstyle.doc.stream.nativedir;

/**
 * 谨怀敬畏之心
 */
public class HelloNative {
    static
    {
        System.loadLibrary("HelloNative");
    }

    public static native void sayHello();

    @SuppressWarnings("static-access")
    public static void main(String[] args)
    {
        new HelloNative().sayHello();
    }
}
