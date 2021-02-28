public class com.sun.jna.win32.W32APIFunctionMapper {
    public void W32APIFunctionMapper(boolean unicode) {
        invokespecial:Object(Object::<init>, this:W32APIFunctionMapper)
        putfield:String(W32APIFunctionMapper::suffix, this:W32APIFunctionMapper, ternaryop:String(unicode:boolean, ldc:String("W"), ldc:String("A")))
    }
    
    public java.lang.String getFunctionName(com.sun.jna.NativeLibrary library, java.lang.reflect.Method method) {
        var_5_07 : String
        
        var_5_07 = invokevirtual:String(Method::getName, method:Method)
        
        if (logicalnot:boolean(logicalor:boolean(invokevirtual:boolean(String::endsWith, var_5_07:String, ldc:String("W")), invokevirtual:boolean(String::endsWith, var_5_07:String, ldc:String("A"))))) {
            try {
                var_5_07 = invokevirtual:String(Function::getName, invokevirtual:Function(NativeLibrary::getFunction, library:NativeLibrary, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_5_07:String), getfield:String(W32APIFunctionMapper::suffix, this:W32APIFunctionMapper))), ldc:int(63)))
            }
            catch (java.lang.UnsatisfiedLinkError stack_41_0) {
            }
        }
        
        return:String(var_5_07:String)
    }
    
    static {
        putstatic:FunctionMapper(W32APIFunctionMapper::UNICODE, initobject:W32APIFunctionMapper[expected:FunctionMapper](W32APIFunctionMapper::<init>, ldc:boolean(1)))
        putstatic:FunctionMapper(W32APIFunctionMapper::ASCII, initobject:W32APIFunctionMapper[expected:FunctionMapper](W32APIFunctionMapper::<init>, ldc:boolean(0)))
    }
}
