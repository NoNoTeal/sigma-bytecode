public class com.sun.jna.FunctionResultContext {
    public void FunctionResultContext(java.lang.Class<?> resultClass, com.sun.jna.Function function, java.lang.Object[] args) {
        invokespecial:FromNativeContext(FromNativeContext::<init>, this:FunctionResultContext, resultClass:Class<?>)
        putfield:Function(FunctionResultContext::function, this:FunctionResultContext, function:Function)
        putfield:Object[](FunctionResultContext::args, this:FunctionResultContext, args:Object[])
    }
    
    public com.sun.jna.Function getFunction() {
        return:Function(getfield:Function(FunctionResultContext::function, this:FunctionResultContext))
    }
    
    public java.lang.Object[] getArguments() {
        return:Object[](getfield:Object[](FunctionResultContext::args, this:FunctionResultContext))
    }
}
