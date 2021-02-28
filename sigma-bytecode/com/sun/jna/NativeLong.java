public class com.sun.jna.NativeLong {
    public void NativeLong() {
        invokespecial:NativeLong(NativeLong::<init>, this:NativeLong, ldc:long(0L))
    }
    
    public void NativeLong(long value) {
        invokespecial:NativeLong(NativeLong::<init>, this:NativeLong, value:long, ldc:boolean(0))
    }
    
    public void NativeLong(long value, boolean unsigned) {
        invokespecial:IntegerType(IntegerType::<init>, this:NativeLong, getstatic:int(NativeLong::SIZE), value:long, unsigned:boolean)
    }
    
    static {
        putstatic:int(NativeLong::SIZE, getstatic:int(Native::LONG_SIZE))
    }
}
