public class com.sun.jna.ptr.ByteByReference {
    public void ByteByReference() {
        invokespecial:ByteByReference(ByteByReference::<init>, this:ByteByReference, ldc:byte(0))
    }
    
    public void ByteByReference(byte value) {
        invokespecial:ByReference(ByReference::<init>, this:ByteByReference, ldc:int(1))
        invokevirtual:void(ByteByReference::setValue, this:ByteByReference, value:byte)
    }
    
    public void setValue(byte value) {
        invokevirtual:void(Pointer::setByte, invokevirtual:Pointer(PointerType::getPointer, this:ByteByReference[expected:PointerType]), ldc:long(0L), value:byte)
    }
    
    public byte getValue() {
        return:byte(invokevirtual:byte(Pointer::getByte, invokevirtual:Pointer(PointerType::getPointer, this:ByteByReference[expected:PointerType]), ldc:long(0L)))
    }
}
