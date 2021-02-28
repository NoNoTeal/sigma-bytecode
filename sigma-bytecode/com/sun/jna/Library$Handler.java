public class com.sun.jna.Library$Handler {
    public void Library$Handler(java.lang.String libname, java.lang.Class<?> interfaceClass, java.util.Map<java.lang.String, ?> options) {
        var_6_8C : int
        
        invokespecial:Object(Object::<init>, this:Library$Handler)
        putfield:Map<Method, Library$Handler$FunctionInfo>(Library$Handler::functions, this:Library$Handler, initobject:WeakHashMap<Method, Library$Handler$FunctionInfo>[expected:Map<Method, Library$Handler$FunctionInfo>](WeakHashMap<K, V>::<init>))
        
        if (logicaland:boolean(cmpne:boolean(libname:String, aconstnull:String()), invokevirtual:boolean(String::equals, ldc:String(""), invokevirtual:String[expected:Object](String::trim, libname:String)))) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Invalid library name \"")), libname:String), ldc:String("\"")))))
        }
        
        if (logicalnot:boolean(invokevirtual:boolean(Class<T>::isInterface, interfaceClass:Class<?>))) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), libname:String), ldc:String(" does not implement an interface: ")), invokevirtual:String(Class<T>::getName, interfaceClass:Class<?>)))))
        }
        
        putfield:Class<?>(Library$Handler::interfaceClass, this:Library$Handler, interfaceClass:Class<?>)
        putfield:Map<String, Object>(Library$Handler::options, this:Library$Handler, initobject:HashMap<String, Object>[expected:Map<String, Object>](HashMap<String, Object>::<init>, options:Map<String, ?>))
        var_6_8C = ternaryop:int(invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<AltCallingConvention>(com.sun.jna.AltCallingConvention.class), interfaceClass:Class<?>), ldc:int(63), ldc:int(0))
        
        if (cmpeq:boolean(invokeinterface:Object(Map<String, Object>::get, getfield:Map<String, Object>(Library$Handler::options, this:Library$Handler), ldc:String[expected:Object]("calling-convention")), aconstnull:Object())) {
            invokeinterface:Integer(Map<String, Integer>::put, getfield:Map<String, Object>(Library$Handler::options, this:Library$Handler), ldc:String("calling-convention"), invokestatic:Integer(Integer::valueOf, var_6_8C:int))
        }
        
        if (cmpeq:boolean(invokeinterface:Object(Map<String, Object>::get, getfield:Map<String, Object>(Library$Handler::options, this:Library$Handler), ldc:String[expected:Object]("classloader")), aconstnull:Object())) {
            invokeinterface:ClassLoader(Map<String, ClassLoader>::put, getfield:Map<String, Object>(Library$Handler::options, this:Library$Handler), ldc:String("classloader"), invokevirtual:ClassLoader(Class<T>::getClassLoader, interfaceClass:Class<?>))
        }
        
        putfield:NativeLibrary(Library$Handler::nativeLibrary, this:Library$Handler, invokestatic:NativeLibrary(NativeLibrary::getInstance, libname:String, getfield:Map<String, Object>(Library$Handler::options, this:Library$Handler)))
        putfield:InvocationMapper(Library$Handler::invocationMapper, this:Library$Handler, checkcast:InvocationMapper(com.sun.jna.InvocationMapper.class, invokeinterface:InvocationMapper(Map<String, InvocationMapper>::get, getfield:Map<String, Object>(Library$Handler::options, this:Library$Handler), ldc:String[expected:Object]("invocation-mapper"))))
    }
    
    public com.sun.jna.NativeLibrary getNativeLibrary() {
        return:NativeLibrary(getfield:NativeLibrary(Library$Handler::nativeLibrary, this:Library$Handler))
    }
    
    public java.lang.String getLibraryName() {
        return:String(invokevirtual:String(NativeLibrary::getName, getfield:NativeLibrary(Library$Handler::nativeLibrary, this:Library$Handler)))
    }
    
    public java.lang.Class<?> getInterfaceClass() {
        return:Class<?>(getfield:Class<?>(Library$Handler::interfaceClass, this:Library$Handler))
    }
    
    public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] inArgs) {
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
            putstatic:Method(Library$Handler::OBJECT_TOSTRING, invokevirtual:Method(Class<T>::getMethod, ldc:Class<Object>(java.lang.Object.class), ldc:String("toString"), newarray:Class[](java.lang.Class.class, ldc:int(0))))
            putstatic:Method(Library$Handler::OBJECT_HASHCODE, invokevirtual:Method(Class<T>::getMethod, ldc:Class<Object>(java.lang.Object.class), ldc:String("hashCode"), newarray:Class[](java.lang.Class.class, ldc:int(0))))
            putstatic:Method(Library$Handler::OBJECT_EQUALS, invokevirtual:Method(Class<T>::getMethod, ldc:Class<Object>(java.lang.Object.class), ldc:String("equals"), initarray:Class[](java.lang.Class[].class, ldc:Class<Object>(java.lang.Object.class))))
        }
        catch (java.lang.Exception var_2_39) {
            athrow(initobject:Error(Error::<init>, ldc:String("Error retrieving Object.toString() method")))
        }
    }
}
