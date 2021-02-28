public class com.sun.jna.Memory$SharedMemory {
    public void Memory$SharedMemory(com.sun.jna.Memory p0, long offset, long size) {
        putfield:Memory(Memory$SharedMemory::this$0, this:Memory$SharedMemory, p0:Memory)
        invokespecial:Memory(Memory::<init>, this:Memory$SharedMemory)
        putfield:long(Memory$SharedMemory::size, this:Memory$SharedMemory, size:long)
        putfield:long(Memory$SharedMemory::peer, this:Memory$SharedMemory, add:long(getfield:long(Memory::peer, p0:Memory), offset:long))
    }
    
    public void dispose() {
        putfield:long(Memory$SharedMemory::peer, this:Memory$SharedMemory, ldc:long(0L))
    }
    
    public void boundsCheck(long off, long sz) {
        invokevirtual:void(Memory::boundsCheck, getfield:Memory(Memory$SharedMemory::this$0, this:Memory$SharedMemory), add:long(sub:long(getfield:long(Memory$SharedMemory::peer, this:Memory$SharedMemory), getfield:long(Memory::peer, getfield:Memory(Memory$SharedMemory::this$0, this:Memory$SharedMemory))), off:long), sz:long)
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokespecial:String(Memory::toString, this:Memory$SharedMemory[expected:Memory])), ldc:String(" (shared from ")), invokevirtual:String(Memory::toString, getfield:Memory(Memory$SharedMemory::this$0, this:Memory$SharedMemory))), ldc:String(")"))))
    }
}
