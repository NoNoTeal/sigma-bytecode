public class com.sun.jna.NativeLibrary$1 {
    public void NativeLibrary$1(com.sun.jna.NativeLibrary this$0, com.sun.jna.NativeLibrary library, java.lang.String functionName, int callFlags, java.lang.String encoding) {
        putfield:NativeLibrary(NativeLibrary$1::this$0, this:NativeLibrary$1, this$0:NativeLibrary)
        invokespecial:Function(Function::<init>, this:NativeLibrary$1, library:NativeLibrary, functionName:String, callFlags:int, encoding:String)
    }
    
    public java.lang.Object invoke(java.lang.Object[] args, java.lang.Class<?> returnType, boolean b, int fixedArgs) {
        return:Object(invokestatic:Integer[expected:Object](Integer::valueOf, invokestatic:int(Native::getLastError)))
    }
    
    public java.lang.Object invoke(java.lang.reflect.Method invokingMethod, java.lang.Class<?>[] paramTypes, java.lang.Class<?> returnType, java.lang.Object[] inArgs, java.util.Map<java.lang.String, ?> options) {
        return:Object(invokestatic:Integer[expected:Object](Integer::valueOf, invokestatic:int(Native::getLastError)))
    }
}
