public class com.sun.jna.MethodParameterContext {
    public void MethodParameterContext(com.sun.jna.Function f, java.lang.Object[] args, int index, java.lang.reflect.Method m) {
        invokespecial:FunctionParameterContext(FunctionParameterContext::<init>, this:MethodParameterContext, f:Function, args:Object[], index:int)
        putfield:Method(MethodParameterContext::method, this:MethodParameterContext, m:Method)
    }
    
    public java.lang.reflect.Method getMethod() {
        return:Method(getfield:Method(MethodParameterContext::method, this:MethodParameterContext))
    }
}
