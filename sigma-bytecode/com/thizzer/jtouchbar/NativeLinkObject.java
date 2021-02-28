public abstract class com.thizzer.jtouchbar.NativeLinkObject {
    public void NativeLinkObject() {
        invokespecial:Observable(Observable::<init>, this:NativeLinkObject)
        putfield:long(NativeLinkObject::_nativeInstancePointer, this:NativeLinkObject, ldc:long(0L))
    }
    
    public long getNativeInstancePointer() {
        return:long(getfield:long(NativeLinkObject::_nativeInstancePointer, this:NativeLinkObject))
    }
    
    public void setNativeInstancePointer(long nativeInstancePointer) {
        putfield:long(NativeLinkObject::_nativeInstancePointer, this:NativeLinkObject, nativeInstancePointer:long)
    }
}
