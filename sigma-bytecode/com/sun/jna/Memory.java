public class com.sun.jna.Memory {
    public static void purge() {
        invokevirtual:void(WeakMemoryHolder::clean, getstatic:WeakMemoryHolder(Memory::buffers))
    }
    
    public static void disposeAll() {
        var_3_19 : Iterator<Memory>
        
        var_3_19 = invokeinterface:Iterator<Memory>(Collection<Memory>::iterator, initobject:LinkedList<Memory>[expected:Collection<Memory>](LinkedList<Memory>::<init>, invokeinterface:Set<Memory>[expected:Collection<? extends Memory>](Map<Memory, Reference<Memory>>::keySet, getstatic:Map<Memory, Reference<Memory>>(Memory::allocatedMemory))))
        
        while (invokeinterface:boolean(Iterator<E>::hasNext, var_3_19:Iterator<Memory>)) {
            invokevirtual:void(Memory::dispose, checkcast:Memory(com.sun.jna.Memory.class, invokeinterface:Memory(Iterator<Memory>::next, var_3_19:Iterator<Memory>)))
        }
    }
    
    public void Memory(long size) {
        invokespecial:Pointer(Pointer::<init>, this:Memory)
        putfield:long(Memory::size, this:Memory, size:long)
        
        if (cmple:boolean(size:long, ldc:long(0L))) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, ldc:String("Allocation size must be greater than zero")))
        }
        
        putfield:long(Memory::peer, this:Memory, invokestatic:long(Memory::malloc, size:long))
        
        if (cmpeq:boolean(getfield:long(Memory::peer, this:Memory), ldc:long(0L))) {
            athrow(initobject:OutOfMemoryError(OutOfMemoryError::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Cannot allocate ")), size:long), ldc:String(" bytes")))))
        }
        
        invokeinterface:WeakReference<Memory>(Map<Memory, WeakReference<Memory>>::put, getstatic:Map<Memory, Reference<Memory>>(Memory::allocatedMemory), this:Memory, initobject:WeakReference<Memory>(WeakReference<Memory>::<init>, this:Memory))
    }
    
    public void Memory() {
        invokespecial:Pointer(Pointer::<init>, this:Memory)
    }
    
    public com.sun.jna.Pointer share(long offset) {
        return:Pointer(invokevirtual:Pointer(Memory::share, this:Memory, offset:long, sub:long(invokevirtual:long(Memory::size, this:Memory), offset:long)))
    }
    
    public com.sun.jna.Pointer share(long offset, long sz) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, sz:long)
        return:Pointer(initobject:Memory$SharedMemory[expected:Pointer](Memory$SharedMemory::<init>, this:Memory, offset:long, sz:long))
    }
    
    public com.sun.jna.Memory align(int byteBoundary) {
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:136)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void finalize() {
        invokevirtual:void(Memory::dispose, this:Memory)
    }
    
    public synchronized void dispose() {
        try {
            invokestatic:void(Memory::free, getfield:long(Memory::peer, this:Memory))
        }
        finally {
            invokeinterface:Reference<Memory>(Map<Memory, Reference<Memory>>::remove, getstatic:Map<Memory, Reference<Memory>>(Memory::allocatedMemory), this:Memory[expected:Object])
            putfield:long(Memory::peer, this:Memory, ldc:long(0L))
        }
    }
    
    public void clear() {
        invokevirtual:void(Pointer::clear, this:Memory[expected:Pointer], getfield:long(Memory::size, this:Memory))
    }
    
    public boolean valid() {
        return:boolean(cmpne:boolean(getfield:long(Memory::peer, this:Memory), ldc:long(0L)))
    }
    
    public long size() {
        return:long(getfield:long(Memory::size, this:Memory))
    }
    
    public void boundsCheck(long off, long sz) {
        if (cmplt:boolean(off:long, ldc:long(0L))) {
            athrow(initobject:IndexOutOfBoundsException(IndexOutOfBoundsException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Invalid offset: ")), off:long))))
        }
        
        if (cmpgt:boolean(add:long(off:long, sz:long), getfield:long(Memory::size, this:Memory))) {
            athrow(initobject:IndexOutOfBoundsException(IndexOutOfBoundsException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Bounds exceeds available space : size=")), getfield:long(Memory::size, this:Memory)), ldc:String(", offset=")), add:long(off:long, sz:long)))))
        }
    }
    
    public void read(long bOff, byte[] buf, int index, int length) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, bOff:long, mul:long(i2l:long(length:int), ldc:long(1L)))
        invokespecial:void(Pointer::read, this:Memory[expected:Pointer], bOff:long, buf:byte[], index:int, length:int)
    }
    
    public void read(long bOff, short[] buf, int index, int length) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, bOff:long, mul:long(i2l:long(length:int), ldc:long(2L)))
        invokespecial:void(Pointer::read, this:Memory[expected:Pointer], bOff:long, buf:short[], index:int, length:int)
    }
    
    public void read(long bOff, char[] buf, int index, int length) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, bOff:long, mul:long(i2l:long(length:int), ldc:long(2L)))
        invokespecial:void(Pointer::read, this:Memory[expected:Pointer], bOff:long, buf:char[], index:int, length:int)
    }
    
    public void read(long bOff, int[] buf, int index, int length) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, bOff:long, mul:long(i2l:long(length:int), ldc:long(4L)))
        invokespecial:void(Pointer::read, this:Memory[expected:Pointer], bOff:long, buf:int[], index:int, length:int)
    }
    
    public void read(long bOff, long[] buf, int index, int length) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, bOff:long, mul:long(i2l:long(length:int), ldc:long(8L)))
        invokespecial:void(Pointer::read, this:Memory[expected:Pointer], bOff:long, buf:long[], index:int, length:int)
    }
    
    public void read(long bOff, float[] buf, int index, int length) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, bOff:long, mul:long(i2l:long(length:int), ldc:long(4L)))
        invokespecial:void(Pointer::read, this:Memory[expected:Pointer], bOff:long, buf:float[], index:int, length:int)
    }
    
    public void read(long bOff, double[] buf, int index, int length) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, bOff:long, mul:long(i2l:long(length:int), ldc:long(8L)))
        invokespecial:void(Pointer::read, this:Memory[expected:Pointer], bOff:long, buf:double[], index:int, length:int)
    }
    
    public void write(long bOff, byte[] buf, int index, int length) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, bOff:long, mul:long(i2l:long(length:int), ldc:long(1L)))
        invokespecial:void(Pointer::write, this:Memory[expected:Pointer], bOff:long, buf:byte[], index:int, length:int)
    }
    
    public void write(long bOff, short[] buf, int index, int length) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, bOff:long, mul:long(i2l:long(length:int), ldc:long(2L)))
        invokespecial:void(Pointer::write, this:Memory[expected:Pointer], bOff:long, buf:short[], index:int, length:int)
    }
    
    public void write(long bOff, char[] buf, int index, int length) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, bOff:long, mul:long(i2l:long(length:int), ldc:long(2L)))
        invokespecial:void(Pointer::write, this:Memory[expected:Pointer], bOff:long, buf:char[], index:int, length:int)
    }
    
    public void write(long bOff, int[] buf, int index, int length) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, bOff:long, mul:long(i2l:long(length:int), ldc:long(4L)))
        invokespecial:void(Pointer::write, this:Memory[expected:Pointer], bOff:long, buf:int[], index:int, length:int)
    }
    
    public void write(long bOff, long[] buf, int index, int length) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, bOff:long, mul:long(i2l:long(length:int), ldc:long(8L)))
        invokespecial:void(Pointer::write, this:Memory[expected:Pointer], bOff:long, buf:long[], index:int, length:int)
    }
    
    public void write(long bOff, float[] buf, int index, int length) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, bOff:long, mul:long(i2l:long(length:int), ldc:long(4L)))
        invokespecial:void(Pointer::write, this:Memory[expected:Pointer], bOff:long, buf:float[], index:int, length:int)
    }
    
    public void write(long bOff, double[] buf, int index, int length) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, bOff:long, mul:long(i2l:long(length:int), ldc:long(8L)))
        invokespecial:void(Pointer::write, this:Memory[expected:Pointer], bOff:long, buf:double[], index:int, length:int)
    }
    
    public byte getByte(long offset) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, ldc:long(1L))
        return:byte(invokespecial:byte(Pointer::getByte, this:Memory[expected:Pointer], offset:long))
    }
    
    public char getChar(long offset) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, ldc:long(1L))
        return:char(invokespecial:char(Pointer::getChar, this:Memory[expected:Pointer], offset:long))
    }
    
    public short getShort(long offset) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, ldc:long(2L))
        return:short(invokespecial:short(Pointer::getShort, this:Memory[expected:Pointer], offset:long))
    }
    
    public int getInt(long offset) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, ldc:long(4L))
        return:int(invokespecial:int(Pointer::getInt, this:Memory[expected:Pointer], offset:long))
    }
    
    public long getLong(long offset) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, ldc:long(8L))
        return:long(invokespecial:long(Pointer::getLong, this:Memory[expected:Pointer], offset:long))
    }
    
    public float getFloat(long offset) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, ldc:long(4L))
        return:float(invokespecial:float(Pointer::getFloat, this:Memory[expected:Pointer], offset:long))
    }
    
    public double getDouble(long offset) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, ldc:long(8L))
        return:double(invokespecial:double(Pointer::getDouble, this:Memory[expected:Pointer], offset:long))
    }
    
    public com.sun.jna.Pointer getPointer(long offset) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, i2l:long(getstatic:int(Pointer::SIZE)))
        return:Pointer(invokespecial:Pointer(Pointer::getPointer, this:Memory[expected:Pointer], offset:long))
    }
    
    public java.nio.ByteBuffer getByteBuffer(long offset, long length) {
        var_7_11 : ByteBuffer
        
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, length:long)
        var_7_11 = invokespecial:ByteBuffer(Pointer::getByteBuffer, this:Memory[expected:Pointer], offset:long, length:long)
        invokevirtual:void(WeakMemoryHolder::put, getstatic:WeakMemoryHolder(Memory::buffers), var_7_11:ByteBuffer[expected:Object], this:Memory)
        return:ByteBuffer(var_7_11:ByteBuffer)
    }
    
    public java.lang.String getString(long offset, java.lang.String encoding) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, ldc:long(0L))
        return:String(invokespecial:String(Pointer::getString, this:Memory[expected:Pointer], offset:long, encoding:String))
    }
    
    public java.lang.String getWideString(long offset) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, ldc:long(0L))
        return:String(invokespecial:String(Pointer::getWideString, this:Memory[expected:Pointer], offset:long))
    }
    
    public void setByte(long offset, byte value) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, ldc:long(1L))
        invokespecial:void(Pointer::setByte, this:Memory[expected:Pointer], offset:long, value:byte)
    }
    
    public void setChar(long offset, char value) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, i2l:long(getstatic:int(Native::WCHAR_SIZE)))
        invokespecial:void(Pointer::setChar, this:Memory[expected:Pointer], offset:long, value:char)
    }
    
    public void setShort(long offset, short value) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, ldc:long(2L))
        invokespecial:void(Pointer::setShort, this:Memory[expected:Pointer], offset:long, value:short)
    }
    
    public void setInt(long offset, int value) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, ldc:long(4L))
        invokespecial:void(Pointer::setInt, this:Memory[expected:Pointer], offset:long, value:int)
    }
    
    public void setLong(long offset, long value) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, ldc:long(8L))
        invokespecial:void(Pointer::setLong, this:Memory[expected:Pointer], offset:long, value:long)
    }
    
    public void setFloat(long offset, float value) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, ldc:long(4L))
        invokespecial:void(Pointer::setFloat, this:Memory[expected:Pointer], offset:long, value:float)
    }
    
    public void setDouble(long offset, double value) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, ldc:long(8L))
        invokespecial:void(Pointer::setDouble, this:Memory[expected:Pointer], offset:long, value:double)
    }
    
    public void setPointer(long offset, com.sun.jna.Pointer value) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, i2l:long(getstatic:int(Pointer::SIZE)))
        invokespecial:void(Pointer::setPointer, this:Memory[expected:Pointer], offset:long, value:Pointer)
    }
    
    public void setString(long offset, java.lang.String value, java.lang.String encoding) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, add:long(i2l:long(arraylength:int(invokestatic:byte[](Native::getBytes, value:String, encoding:String))), ldc:long(1L)))
        invokespecial:void(Pointer::setString, this:Memory[expected:Pointer], offset:long, value:String, encoding:String)
    }
    
    public void setWideString(long offset, java.lang.String value) {
        invokevirtual:void(Memory::boundsCheck, this:Memory, offset:long, mul:long(add:long(i2l:long(invokevirtual:int(String::length, value:String)), ldc:long(1L)), i2l:long(getstatic:int(Native::WCHAR_SIZE))))
        invokespecial:void(Pointer::setWideString, this:Memory[expected:Pointer], offset:long, value:String)
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("allocated@0x")), invokestatic:String(Long::toHexString, getfield:long(Memory::peer, this:Memory))), ldc:String(" (")), getfield:long(Memory::size, this:Memory)), ldc:String(" bytes)"))))
    }
    
    public static void free(long p) {
        if (cmpne:boolean(p:long, ldc:long(0L))) {
            invokestatic:void(Native::free, p:long)
        }
    }
    
    public static long malloc(long size) {
        return:long(invokestatic:long(Native::malloc, size:long))
    }
    
    public java.lang.String dump() {
        return:String(invokevirtual:String(Pointer::dump, this:Memory[expected:Pointer], ldc:long(0L), l2i:int(invokevirtual:long(Memory::size, this:Memory))))
    }
    
    static {
        putstatic:Map<Memory, Reference<Memory>>(Memory::allocatedMemory, invokestatic:Map<Memory, Reference<Memory>>(Collections::synchronizedMap, initobject:WeakHashMap<Memory, Reference<Memory>>[expected:Map<Memory, Reference<Memory>>](WeakHashMap<K, V>::<init>)))
        putstatic:WeakMemoryHolder(Memory::buffers, initobject:WeakMemoryHolder(WeakMemoryHolder::<init>))
    }
}
