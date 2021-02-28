public class com.sun.jna.ptr.IntByReference {
    public void IntByReference() {
        invokespecial:IntByReference(IntByReference::<init>, this:IntByReference, ldc:int(0))
    }
    
    public void IntByReference(int value) {
        invokespecial:ByReference(ByReference::<init>, this:IntByReference, ldc:int(4))
        invokevirtual:void(IntByReference::setValue, this:IntByReference, value:int)
    }
    
    public void setValue(int value) {
        invokevirtual:void(Pointer::setInt, invokevirtual:Pointer(PointerType::getPointer, this:IntByReference[expected:PointerType]), ldc:long(0L), value:int)
    }
    
    public int getValue() {
        return:int(invokevirtual:int(Pointer::getInt, invokevirtual:Pointer(PointerType::getPointer, this:IntByReference[expected:PointerType]), ldc:long(0L)))
    }
}
