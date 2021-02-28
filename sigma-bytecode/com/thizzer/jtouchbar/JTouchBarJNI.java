public class com.thizzer.jtouchbar.JTouchBarJNI {
    public void JTouchBarJNI() {
        invokespecial:Object(Object::<init>, this:JTouchBarJNI)
    }
    
    public static native void setTouchBar0(long p0, com.thizzer.jtouchbar.JTouchBar p1);
    
    public static native void updateTouchBarItem(long p0);
    
    public static native void callObjectSelector(long p0, java.lang.String p1, boolean p2);
    
    public static native int callIntObjectSelector(long p0, java.lang.String p1);
    
    public static native long getAWTViewPointer0(java.awt.Component p0);
    
    private static void loadLibraryFromJar(java.lang.String path) {
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:136)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    static {
        try {
            invokestatic:void(System::loadLibrary, ldc:String("JTouchBar"))
        }
        catch (java.lang.UnsatisfiedLinkError var_2_0B) {
            invokestatic:void(JTouchBarJNI::loadLibraryFromJar, ldc:String("/lib/libJTouchBar.dylib"))
        }
    }
}
