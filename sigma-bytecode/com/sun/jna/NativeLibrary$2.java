public final class com.sun.jna.NativeLibrary$2 {
    public void NativeLibrary$2(java.lang.String p0) {
        putfield:String(NativeLibrary$2::val$libName, this:NativeLibrary$2, p0:String)
        invokespecial:Object(Object::<init>, this:NativeLibrary$2)
    }
    
    public boolean accept(java.io.File dir, java.lang.String filename) {
        return:boolean(logicaland:boolean(logicalor:boolean(invokevirtual:boolean(String::startsWith, filename:String, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("lib")), getfield:String(NativeLibrary$2::val$libName, this:NativeLibrary$2)), ldc:String(".so")))), logicaland:boolean(invokevirtual:boolean(String::startsWith, filename:String, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(NativeLibrary$2::val$libName, this:NativeLibrary$2)), ldc:String(".so")))), invokevirtual:boolean(String::startsWith, getfield:String(NativeLibrary$2::val$libName, this:NativeLibrary$2), ldc:String("lib")))), invokestatic:boolean(NativeLibrary::access$000, filename:String)))
    }
}
