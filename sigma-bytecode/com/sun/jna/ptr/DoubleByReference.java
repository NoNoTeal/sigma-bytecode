public class com.sun.jna.ptr.DoubleByReference {
    public void DoubleByReference() {
        invokespecial:DoubleByReference(DoubleByReference::<init>, this:DoubleByReference, ldc:double(0.0))
    }
    
    public void DoubleByReference(double value) {
        invokespecial:ByReference(ByReference::<init>, this:DoubleByReference, ldc:int(8))
        invokevirtual:void(DoubleByReference::setValue, this:DoubleByReference, value:double)
    }
    
    public void setValue(double value) {
        invokevirtual:void(Pointer::setDouble, invokevirtual:Pointer(PointerType::getPointer, this:DoubleByReference[expected:PointerType]), ldc:long(0L), value:double)
    }
    
    public double getValue() {
        return:double(invokevirtual:double(Pointer::getDouble, invokevirtual:Pointer(PointerType::getPointer, this:DoubleByReference[expected:PointerType]), ldc:long(0L)))
    }
}
