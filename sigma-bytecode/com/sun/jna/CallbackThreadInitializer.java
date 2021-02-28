public class com.sun.jna.CallbackThreadInitializer {
    public void CallbackThreadInitializer() {
        invokespecial:CallbackThreadInitializer(CallbackThreadInitializer::<init>, this:CallbackThreadInitializer, ldc:boolean(1))
    }
    
    public void CallbackThreadInitializer(boolean daemon) {
        invokespecial:CallbackThreadInitializer(CallbackThreadInitializer::<init>, this:CallbackThreadInitializer, daemon:boolean, ldc:boolean(0))
    }
    
    public void CallbackThreadInitializer(boolean daemon, boolean detach) {
        invokespecial:CallbackThreadInitializer(CallbackThreadInitializer::<init>, this:CallbackThreadInitializer, daemon:boolean, detach:boolean, aconstnull:String())
    }
    
    public void CallbackThreadInitializer(boolean daemon, boolean detach, java.lang.String name) {
        invokespecial:CallbackThreadInitializer(CallbackThreadInitializer::<init>, this:CallbackThreadInitializer, daemon:boolean, detach:boolean, name:String, aconstnull:ThreadGroup())
    }
    
    public void CallbackThreadInitializer(boolean daemon, boolean detach, java.lang.String name, java.lang.ThreadGroup group) {
        invokespecial:Object(Object::<init>, this:CallbackThreadInitializer)
        putfield:boolean(CallbackThreadInitializer::daemon, this:CallbackThreadInitializer, daemon:boolean)
        putfield:boolean(CallbackThreadInitializer::detach, this:CallbackThreadInitializer, detach:boolean)
        putfield:String(CallbackThreadInitializer::name, this:CallbackThreadInitializer, name:String)
        putfield:ThreadGroup(CallbackThreadInitializer::group, this:CallbackThreadInitializer, group:ThreadGroup)
    }
    
    public java.lang.String getName(com.sun.jna.Callback cb) {
        return:String(getfield:String(CallbackThreadInitializer::name, this:CallbackThreadInitializer))
    }
    
    public java.lang.ThreadGroup getThreadGroup(com.sun.jna.Callback cb) {
        return:ThreadGroup(getfield:ThreadGroup(CallbackThreadInitializer::group, this:CallbackThreadInitializer))
    }
    
    public boolean isDaemon(com.sun.jna.Callback cb) {
        return:boolean(getfield:boolean(CallbackThreadInitializer::daemon, this:CallbackThreadInitializer))
    }
    
    public boolean detach(com.sun.jna.Callback cb) {
        return:boolean(getfield:boolean(CallbackThreadInitializer::detach, this:CallbackThreadInitializer))
    }
}
