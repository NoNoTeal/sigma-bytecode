public class com.sun.jna.FunctionParameterContext {
    public void FunctionParameterContext(com.sun.jna.Function f, java.lang.Object[] args, int index) {
        invokespecial:ToNativeContext(ToNativeContext::<init>, this:FunctionParameterContext)
        putfield:Function(FunctionParameterContext::function, this:FunctionParameterContext, f:Function)
        putfield:Object[](FunctionParameterContext::args, this:FunctionParameterContext, args:Object[])
        putfield:int(FunctionParameterContext::index, this:FunctionParameterContext, index:int)
    }
    
    public com.sun.jna.Function getFunction() {
        return:Function(getfield:Function(FunctionParameterContext::function, this:FunctionParameterContext))
    }
    
    public java.lang.Object[] getParameters() {
        return:Object[](getfield:Object[](FunctionParameterContext::args, this:FunctionParameterContext))
    }
    
    public int getParameterIndex() {
        return:int(getfield:int(FunctionParameterContext::index, this:FunctionParameterContext))
    }
}
