public abstract class com.sun.jna.ptr.ByReference {
    public void ByReference(int dataSize) {
        invokespecial:PointerType(PointerType::<init>, this:ByReference)
        invokevirtual:void(PointerType::setPointer, this:ByReference[expected:PointerType], initobject:Memory[expected:Pointer](Memory::<init>, i2l:long(dataSize:int)))
    }
}
