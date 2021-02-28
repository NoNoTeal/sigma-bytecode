public class com.sun.jna.ptr.LongByReference {
    public void LongByReference() {
        invokespecial:LongByReference(LongByReference::<init>, this:LongByReference, ldc:long(0L))
    }
    
    public void LongByReference(long value) {
        invokespecial:ByReference(ByReference::<init>, this:LongByReference, ldc:int(8))
        invokevirtual:void(LongByReference::setValue, this:LongByReference, value:long)
    }
    
    public void setValue(long value) {
        invokevirtual:void(Pointer::setLong, invokevirtual:Pointer(PointerType::getPointer, this:LongByReference[expected:PointerType]), ldc:long(0L), value:long)
    }
    
    public long getValue() {
        return:long(invokevirtual:long(Pointer::getLong, invokevirtual:Pointer(PointerType::getPointer, this:LongByReference[expected:PointerType]), ldc:long(0L)))
    }
}
