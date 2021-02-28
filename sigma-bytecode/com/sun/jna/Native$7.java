public final class com.sun.jna.Native$7 {
    public void Native$7() {
        invokespecial:ThreadLocal(ThreadLocal::<init>, this:Native$7)
    }
    
    public com.sun.jna.Memory initialValue() {
        var_3_0D : Memory
        
        var_3_0D = initobject:Memory(Memory::<init>, ldc:long(4L))
        invokevirtual:void(Memory::clear, var_3_0D:Memory)
        return:Memory(var_3_0D:Memory)
    }
    
    public java.lang.Object initialValue() {
        return:Object(invokevirtual:Memory[expected:Object](Native$7::initialValue, this:Native$7))
    }
}
