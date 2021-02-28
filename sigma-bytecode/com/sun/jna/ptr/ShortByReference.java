public class com.sun.jna.ptr.ShortByReference {
    public void ShortByReference() {
        invokespecial:ShortByReference(ShortByReference::<init>, this:ShortByReference, ldc:short(0))
    }
    
    public void ShortByReference(short value) {
        invokespecial:ByReference(ByReference::<init>, this:ShortByReference, ldc:int(2))
        invokevirtual:void(ShortByReference::setValue, this:ShortByReference, value:short)
    }
    
    public void setValue(short value) {
        invokevirtual:void(Pointer::setShort, invokevirtual:Pointer(PointerType::getPointer, this:ShortByReference[expected:PointerType]), ldc:long(0L), value:short)
    }
    
    public short getValue() {
        return:short(invokevirtual:short(Pointer::getShort, invokevirtual:Pointer(PointerType::getPointer, this:ShortByReference[expected:PointerType]), ldc:long(0L)))
    }
}
