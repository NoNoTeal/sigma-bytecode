public class com.sun.jna.MethodResultContext {
    public void MethodResultContext(java.lang.Class<?> resultClass, com.sun.jna.Function function, java.lang.Object[] args, java.lang.reflect.Method method) {
        invokespecial:FunctionResultContext(FunctionResultContext::<init>, this:MethodResultContext, resultClass:Class<?>, function:Function, args:Object[])
        putfield:Method(MethodResultContext::method, this:MethodResultContext, method:Method)
    }
    
    public java.lang.reflect.Method getMethod() {
        return:Method(getfield:Method(MethodResultContext::method, this:MethodResultContext))
    }
}
