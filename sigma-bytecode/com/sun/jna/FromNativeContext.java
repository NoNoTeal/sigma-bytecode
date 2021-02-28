public class com.sun.jna.FromNativeContext {
    public void FromNativeContext(java.lang.Class<?> javaType) {
        invokespecial:Object(Object::<init>, this:FromNativeContext)
        putfield:Class<?>(FromNativeContext::type, this:FromNativeContext, javaType:Class<?>)
    }
    
    public java.lang.Class<?> getTargetType() {
        return:Class<?>(getfield:Class<?>(FromNativeContext::type, this:FromNativeContext))
    }
}
