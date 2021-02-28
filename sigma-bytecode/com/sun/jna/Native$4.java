public final class com.sun.jna.Native$4 {
    public void Native$4() {
        invokespecial:Object(Object::<init>, this:Native$4)
    }
    
    public java.lang.reflect.Method run() {
        var_3_13 : Method
        
        try {
            var_3_13 = invokevirtual:Method(Class<T>::getDeclaredMethod, ldc:Class<ClassLoader>(java.lang.ClassLoader.class), ldc:String("findLibrary"), initarray:Class[](java.lang.Class[].class, ldc:Class<String>(java.lang.String.class)))
            invokevirtual:void(AccessibleObject::setAccessible, var_3_13:Method[expected:AccessibleObject], ldc:boolean(1))
            return:Method(var_3_13:Method)
        }
        catch (java.lang.Exception var_3_1B) {
            return:Method(aconstnull:Method())
        }
    }
    
    public java.lang.Object run() {
        return:Object(invokevirtual:Method[expected:Object](Native$4::run, this:Native$4))
    }
}
