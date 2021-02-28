public class com.sun.jna.Function$NativeMappedArray {
    public void Function$NativeMappedArray(com.sun.jna.NativeMapped[] arg) {
        invokespecial:Memory(Memory::<init>, this:Function$NativeMappedArray, i2l:long(invokestatic:int(Native::getNativeSize, invokevirtual:Class<? extends NativeMapped[]>(NativeMapped[]::getClass, arg:NativeMapped[]), arg:NativeMapped[][expected:Object])))
        invokevirtual:void(Pointer::setValue, this:Function$NativeMappedArray[expected:Pointer], ldc:long(0L), putfield:NativeMapped[][expected:Object](Function$NativeMappedArray::original, this:Function$NativeMappedArray, arg:NativeMapped[]), invokevirtual:Class<? extends NativeMapped[]>(NativeMapped[]::getClass, getfield:NativeMapped[](Function$NativeMappedArray::original, this:Function$NativeMappedArray)))
    }
    
    public void read() {
        invokevirtual:Object(Pointer::getValue, this:Function$NativeMappedArray[expected:Pointer], ldc:long(0L), invokevirtual:Class<? extends NativeMapped[]>(NativeMapped[]::getClass, getfield:NativeMapped[](Function$NativeMappedArray::original, this:Function$NativeMappedArray)), getfield:NativeMapped[][expected:Object](Function$NativeMappedArray::original, this:Function$NativeMappedArray))
    }
}
