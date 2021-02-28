public class com.sun.jna.ptr.PointerByReference {
    public void PointerByReference() {
        invokespecial:PointerByReference(PointerByReference::<init>, this:PointerByReference, aconstnull:Pointer())
    }
    
    public void PointerByReference(com.sun.jna.Pointer value) {
        invokespecial:ByReference(ByReference::<init>, this:PointerByReference, getstatic:int(Pointer::SIZE))
        invokevirtual:void(PointerByReference::setValue, this:PointerByReference, value:Pointer)
    }
    
    public void setValue(com.sun.jna.Pointer value) {
        invokevirtual:void(Pointer::setPointer, invokevirtual:Pointer(PointerType::getPointer, this:PointerByReference[expected:PointerType]), ldc:long(0L), value:Pointer)
    }
    
    public com.sun.jna.Pointer getValue() {
        return:Pointer(invokevirtual:Pointer(Pointer::getPointer, invokevirtual:Pointer(PointerType::getPointer, this:PointerByReference[expected:PointerType]), ldc:long(0L)))
    }
}
