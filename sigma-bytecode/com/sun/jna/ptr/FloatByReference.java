public class com.sun.jna.ptr.FloatByReference {
    public void FloatByReference() {
        invokespecial:FloatByReference(FloatByReference::<init>, this:FloatByReference, ldc:float(0.0f))
    }
    
    public void FloatByReference(float value) {
        invokespecial:ByReference(ByReference::<init>, this:FloatByReference, ldc:int(4))
        invokevirtual:void(FloatByReference::setValue, this:FloatByReference, value:float)
    }
    
    public void setValue(float value) {
        invokevirtual:void(Pointer::setFloat, invokevirtual:Pointer(PointerType::getPointer, this:FloatByReference[expected:PointerType]), ldc:long(0L), value:float)
    }
    
    public float getValue() {
        return:float(invokevirtual:float(Pointer::getFloat, invokevirtual:Pointer(PointerType::getPointer, this:FloatByReference[expected:PointerType]), ldc:long(0L)))
    }
}
