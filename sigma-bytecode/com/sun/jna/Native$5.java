public final class com.sun.jna.Native$5 {
    public void Native$5() {
        invokespecial:Object(Object::<init>, this:Native$5)
    }
    
    public boolean accept(java.io.File dir, java.lang.String name) {
        return:boolean(logicaland:boolean(invokevirtual:boolean(String::endsWith, name:String, ldc:String(".x")), invokevirtual:boolean(String::startsWith, name:String, ldc:String("jna"))))
    }
}
