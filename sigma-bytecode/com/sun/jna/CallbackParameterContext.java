public class com.sun.jna.CallbackParameterContext {
    public void CallbackParameterContext(java.lang.Class<?> javaType, java.lang.reflect.Method m, java.lang.Object[] args, int index) {
        invokespecial:FromNativeContext(FromNativeContext::<init>, this:CallbackParameterContext, javaType:Class<?>)
        putfield:Method(CallbackParameterContext::method, this:CallbackParameterContext, m:Method)
        putfield:Object[](CallbackParameterContext::args, this:CallbackParameterContext, args:Object[])
        putfield:int(CallbackParameterContext::index, this:CallbackParameterContext, index:int)
    }
    
    public java.lang.reflect.Method getMethod() {
        return:Method(getfield:Method(CallbackParameterContext::method, this:CallbackParameterContext))
    }
    
    public java.lang.Object[] getArguments() {
        return:Object[](getfield:Object[](CallbackParameterContext::args, this:CallbackParameterContext))
    }
    
    public int getIndex() {
        return:int(getfield:int(CallbackParameterContext::index, this:CallbackParameterContext))
    }
}
