public final class com.sun.jna.Native$3 {
    public void Native$3(com.sun.jna.Library$Handler p0, com.sun.jna.Library p1) {
        putfield:Library$Handler(Native$3::val$handler, this:Native$3, p0:Library$Handler)
        putfield:Library(Native$3::val$library, this:Native$3, p1:Library)
        invokespecial:Object(Object::<init>, this:Native$3)
    }
    
    public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args) {
        monitorenter(invokevirtual:NativeLibrary(Library$Handler::getNativeLibrary, getfield:Library$Handler(Native$3::val$handler, this:Native$3)))
        
        try {
            return:Object(invokevirtual:Object(Library$Handler::invoke, getfield:Library$Handler(Native$3::val$handler, this:Native$3), getfield:Library[expected:Object](Native$3::val$library, this:Native$3), method:Method, args:Object[]))
        }
        finally {
            monitorexit(invokevirtual:NativeLibrary(Library$Handler::getNativeLibrary, getfield:Library$Handler(Native$3::val$handler, this:Native$3)))
        }
    }
}
