public class com.sun.jna.Structure$AutoAllocated {
    public void Structure$AutoAllocated(int size) {
        invokespecial:Memory(Memory::<init>, this:Structure$AutoAllocated, i2l:long(size:int))
        invokespecial:void(Memory::clear, this:Structure$AutoAllocated[expected:Memory])
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("auto-")), invokespecial:String(Memory::toString, this:Structure$AutoAllocated[expected:Memory]))))
    }
}
