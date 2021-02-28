public class com.sun.jna.Function$PointerArray {
    public void Function$PointerArray(com.sun.jna.Pointer[] arg) {
        var_4_16 : int
        
        invokespecial:Memory(Memory::<init>, this:Function$PointerArray, i2l:long(mul:int(getstatic:int(Pointer::SIZE), add:int(arraylength:int(arg:Pointer[]), ldc:int(1)))))
        putfield:Pointer[](Function$PointerArray::original, this:Function$PointerArray, arg:Pointer[])
        var_4_16 = ldc:int(0)
        
        while (cmplt:boolean(var_4_16:int, arraylength:int(arg:Pointer[]))) {
            invokevirtual:void(Memory::setPointer, this:Function$PointerArray[expected:Memory], i2l:long(mul:int(var_4_16:int, getstatic:int(Pointer::SIZE))), loadelement:Pointer(arg:Pointer[], var_4_16:int))
            inc:int(var_4_16, ldc:int(1))
        }
        
        invokevirtual:void(Memory::setPointer, this:Function$PointerArray[expected:Memory], i2l:long(mul:int(getstatic:int(Pointer::SIZE), arraylength:int(arg:Pointer[]))), aconstnull:Pointer())
    }
    
    public void read() {
        invokevirtual:void(Pointer::read, this:Function$PointerArray[expected:Pointer], ldc:long(0L), getfield:Pointer[](Function$PointerArray::original, this:Function$PointerArray), ldc:int(0), arraylength:int(getfield:Pointer[](Function$PointerArray::original, this:Function$PointerArray)))
    }
}
