public final class com.sun.jna.Native$1 {
    public void Native$1() {
        invokespecial:Object(Object::<init>, this:Native$1)
    }
    
    public void uncaughtException(com.sun.jna.Callback c, java.lang.Throwable e) {
        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::err), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("JNA: Callback ")), c:Callback[expected:Object]), ldc:String(" threw the following exception:"))))
        invokevirtual:void(Throwable::printStackTrace, e:Throwable)
    }
}
