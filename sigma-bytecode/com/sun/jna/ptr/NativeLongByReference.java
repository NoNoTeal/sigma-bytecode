public class com.sun.jna.ptr.NativeLongByReference {
    public void NativeLongByReference() {
        invokespecial:NativeLongByReference(NativeLongByReference::<init>, this:NativeLongByReference, initobject:NativeLong(NativeLong::<init>, ldc:long(0L)))
    }
    
    public void NativeLongByReference(com.sun.jna.NativeLong value) {
        invokespecial:ByReference(ByReference::<init>, this:NativeLongByReference, getstatic:int(NativeLong::SIZE))
        invokevirtual:void(NativeLongByReference::setValue, this:NativeLongByReference, value:NativeLong)
    }
    
    public void setValue(com.sun.jna.NativeLong value) {
        invokevirtual:void(Pointer::setNativeLong, invokevirtual:Pointer(PointerType::getPointer, this:NativeLongByReference[expected:PointerType]), ldc:long(0L), value:NativeLong)
    }
    
    public com.sun.jna.NativeLong getValue() {
        return:NativeLong(invokevirtual:NativeLong(Pointer::getNativeLong, invokevirtual:Pointer(PointerType::getPointer, this:NativeLongByReference[expected:PointerType]), ldc:long(0L)))
    }
}
