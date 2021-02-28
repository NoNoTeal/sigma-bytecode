public class com.sun.jna.NativeString$StringMemory {
    public void NativeString$StringMemory(com.sun.jna.NativeString p0, long size) {
        putfield:NativeString(NativeString$StringMemory::this$0, this:NativeString$StringMemory, p0:NativeString)
        invokespecial:Memory(Memory::<init>, this:NativeString$StringMemory, size:long)
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(NativeString::toString, getfield:NativeString(NativeString$StringMemory::this$0, this:NativeString$StringMemory)))
    }
}
