public class com.sun.jna.CallbackResultContext {
    public void CallbackResultContext(java.lang.reflect.Method callbackMethod) {
        invokespecial:ToNativeContext(ToNativeContext::<init>, this:CallbackResultContext)
        putfield:Method(CallbackResultContext::method, this:CallbackResultContext, callbackMethod:Method)
    }
    
    public java.lang.reflect.Method getMethod() {
        return:Method(getfield:Method(CallbackResultContext::method, this:CallbackResultContext))
    }
}
