public class com.sun.jna.Pointer {
    public static final com.sun.jna.Pointer createConstant(long peer) {
        return:Pointer(initobject:Pointer$Opaque[expected:Pointer](Pointer$Opaque::<init>, peer:long, aconstnull:Pointer$1()))
    }
    
    public static final com.sun.jna.Pointer createConstant(int peer) {
        return:Pointer(initobject:Pointer$Opaque[expected:Pointer](Pointer$Opaque::<init>, and:long(i2l:long(peer:int), ldc:long(-1L)), aconstnull:Pointer$1()))
    }
    
    public void Pointer() {
        invokespecial:Object(Object::<init>, this:Pointer)
    }
    
    public void Pointer(long peer) {
        invokespecial:Object(Object::<init>, this:Pointer)
        putfield:long(Pointer::peer, this:Pointer, peer:long)
    }
    
    public com.sun.jna.Pointer share(long offset) {
        return:Pointer(invokevirtual:Pointer(Pointer::share, this:Pointer, offset:long, ldc:long(0L)))
    }
    
    public com.sun.jna.Pointer share(long offset, long sz) {
        if (cmpeq:boolean(offset:long, ldc:long(0L))) {
            return:Pointer(this:Pointer)
        }
        
        return:Pointer(initobject:Pointer(Pointer::<init>, add:long(getfield:long(Pointer::peer, this:Pointer), offset:long)))
    }
    
    public void clear(long size) {
        invokevirtual:void(Pointer::setMemory, this:Pointer, ldc:long(0L), size:long, ldc:byte(0))
    }
    
    public boolean equals(java.lang.Object o) {
        return:boolean(logicalor:boolean(cmpeq:boolean(o:Object, this:Pointer[expected:Object]), logicaland:boolean(logicaland:boolean(cmpne:boolean(o:Object, aconstnull:Object()), instanceof:boolean(com.sun.jna.Pointer.class, o:Object)), cmpeq:boolean(getfield:long(Pointer::peer, checkcast:Pointer(com.sun.jna.Pointer.class, o:Object[expected:Pointer])), getfield:long(Pointer::peer, this:Pointer)))))
    }
    
    public int hashCode() {
        return:int(l2i:int(add:long(ushr:long(getfield:long(Pointer::peer, this:Pointer), ldc:int(32)), and:long(getfield:long(Pointer::peer, this:Pointer), ldc:long(-1L)))))
    }
    
    public long indexOf(long offset, byte value) {
        return:long(invokestatic:long(Native::indexOf, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, value:byte))
    }
    
    public void read(long offset, byte[] buf, int index, int length) {
        invokestatic:void(Native::read, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, buf:byte[], index:int, length:int)
    }
    
    public void read(long offset, short[] buf, int index, int length) {
        invokestatic:void(Native::read, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, buf:short[], index:int, length:int)
    }
    
    public void read(long offset, char[] buf, int index, int length) {
        invokestatic:void(Native::read, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, buf:char[], index:int, length:int)
    }
    
    public void read(long offset, int[] buf, int index, int length) {
        invokestatic:void(Native::read, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, buf:int[], index:int, length:int)
    }
    
    public void read(long offset, long[] buf, int index, int length) {
        invokestatic:void(Native::read, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, buf:long[], index:int, length:int)
    }
    
    public void read(long offset, float[] buf, int index, int length) {
        invokestatic:void(Native::read, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, buf:float[], index:int, length:int)
    }
    
    public void read(long offset, double[] buf, int index, int length) {
        invokestatic:void(Native::read, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, buf:double[], index:int, length:int)
    }
    
    public void read(long offset, com.sun.jna.Pointer[] buf, int index, int length) {
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
    
    public void write(long offset, byte[] buf, int index, int length) {
        invokestatic:void(Native::write, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, buf:byte[], index:int, length:int)
    }
    
    public void write(long offset, short[] buf, int index, int length) {
        invokestatic:void(Native::write, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, buf:short[], index:int, length:int)
    }
    
    public void write(long offset, char[] buf, int index, int length) {
        invokestatic:void(Native::write, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, buf:char[], index:int, length:int)
    }
    
    public void write(long offset, int[] buf, int index, int length) {
        invokestatic:void(Native::write, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, buf:int[], index:int, length:int)
    }
    
    public void write(long offset, long[] buf, int index, int length) {
        invokestatic:void(Native::write, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, buf:long[], index:int, length:int)
    }
    
    public void write(long offset, float[] buf, int index, int length) {
        invokestatic:void(Native::write, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, buf:float[], index:int, length:int)
    }
    
    public void write(long offset, double[] buf, int index, int length) {
        invokestatic:void(Native::write, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, buf:double[], index:int, length:int)
    }
    
    public void write(long bOff, com.sun.jna.Pointer[] buf, int index, int length) {
        var_8_05 : int
        
        var_8_05 = ldc:int(0)
        
        while (cmplt:boolean(var_8_05:int, length:int)) {
            invokevirtual:void(Pointer::setPointer, this:Pointer, add:long(bOff:long, i2l:long(mul:int(var_8_05:int, getstatic:int(Pointer::SIZE)))), loadelement:Pointer(buf:Pointer[], add:int(index:int, var_8_05:int)))
            inc:int(var_8_05, ldc:int(1))
        }
    }
    
    public java.lang.Object getValue(long offset, java.lang.Class<?> type, java.lang.Object currentValue) {
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
    
    private void readArray(long offset, java.lang.Object o, java.lang.Class<?> cls) {
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
    
    public byte getByte(long offset) {
        return:byte(invokestatic:byte(Native::getByte, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long))
    }
    
    public char getChar(long offset) {
        return:char(invokestatic:char(Native::getChar, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long))
    }
    
    public short getShort(long offset) {
        return:short(invokestatic:short(Native::getShort, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long))
    }
    
    public int getInt(long offset) {
        return:int(invokestatic:int(Native::getInt, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long))
    }
    
    public long getLong(long offset) {
        return:long(invokestatic:long(Native::getLong, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long))
    }
    
    public com.sun.jna.NativeLong getNativeLong(long offset) {
        return:NativeLong(initobject:NativeLong(NativeLong::<init>, ternaryop:long(cmpeq:boolean(getstatic:int(NativeLong::SIZE), ldc:int(8)), invokevirtual:long(Pointer::getLong, this:Pointer, offset:long), i2l:long(invokevirtual:int(Pointer::getInt, this:Pointer, offset:long)))))
    }
    
    public float getFloat(long offset) {
        return:float(invokestatic:float(Native::getFloat, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long))
    }
    
    public double getDouble(long offset) {
        return:double(invokestatic:double(Native::getDouble, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long))
    }
    
    public com.sun.jna.Pointer getPointer(long offset) {
        return:Pointer(invokestatic:Pointer(Native::getPointer, add:long(getfield:long(Pointer::peer, this:Pointer), offset:long)))
    }
    
    public java.nio.ByteBuffer getByteBuffer(long offset, long length) {
        return:ByteBuffer(invokevirtual:ByteBuffer(ByteBuffer::order, invokestatic:ByteBuffer(Native::getDirectByteBuffer, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, length:long), invokestatic:ByteOrder(ByteOrder::nativeOrder)))
    }
    
    public java.lang.String getString(long offset, boolean wide) {
        return:String(ternaryop:String(wide:boolean, invokevirtual:String(Pointer::getWideString, this:Pointer, offset:long), invokevirtual:String(Pointer::getString, this:Pointer, offset:long)))
    }
    
    public java.lang.String getWideString(long offset) {
        return:String(invokestatic:String(Native::getWideString, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long))
    }
    
    public java.lang.String getString(long offset) {
        return:String(invokevirtual:String(Pointer::getString, this:Pointer, offset:long, invokestatic:String(Native::getDefaultStringEncoding)))
    }
    
    public java.lang.String getString(long offset, java.lang.String encoding) {
        return:String(invokestatic:String(Native::getString, this:Pointer, offset:long, encoding:String))
    }
    
    public byte[] getByteArray(long offset, int arraySize) {
        var_6_08 : byte[]
        
        var_6_08 = newarray:byte[](byte.class, arraySize:int)
        invokevirtual:void(Pointer::read, this:Pointer, offset:long, var_6_08:byte[], ldc:int(0), arraySize:int)
        return:byte[](var_6_08:byte[])
    }
    
    public char[] getCharArray(long offset, int arraySize) {
        var_6_08 : char[]
        
        var_6_08 = newarray:char[](char.class, arraySize:int)
        invokevirtual:void(Pointer::read, this:Pointer, offset:long, var_6_08:char[], ldc:int(0), arraySize:int)
        return:char[](var_6_08:char[])
    }
    
    public short[] getShortArray(long offset, int arraySize) {
        var_6_08 : short[]
        
        var_6_08 = newarray:short[](short.class, arraySize:int)
        invokevirtual:void(Pointer::read, this:Pointer, offset:long, var_6_08:short[], ldc:int(0), arraySize:int)
        return:short[](var_6_08:short[])
    }
    
    public int[] getIntArray(long offset, int arraySize) {
        var_6_08 : int[]
        
        var_6_08 = newarray:int[](int.class, arraySize:int)
        invokevirtual:void(Pointer::read, this:Pointer, offset:long, var_6_08:int[], ldc:int(0), arraySize:int)
        return:int[](var_6_08:int[])
    }
    
    public long[] getLongArray(long offset, int arraySize) {
        var_6_08 : long[]
        
        var_6_08 = newarray:long[](long.class, arraySize:int)
        invokevirtual:void(Pointer::read, this:Pointer, offset:long, var_6_08:long[], ldc:int(0), arraySize:int)
        return:long[](var_6_08:long[])
    }
    
    public float[] getFloatArray(long offset, int arraySize) {
        var_6_08 : float[]
        
        var_6_08 = newarray:float[](float.class, arraySize:int)
        invokevirtual:void(Pointer::read, this:Pointer, offset:long, var_6_08:float[], ldc:int(0), arraySize:int)
        return:float[](var_6_08:float[])
    }
    
    public double[] getDoubleArray(long offset, int arraySize) {
        var_6_08 : double[]
        
        var_6_08 = newarray:double[](double.class, arraySize:int)
        invokevirtual:void(Pointer::read, this:Pointer, offset:long, var_6_08:double[], ldc:int(0), arraySize:int)
        return:double[](var_6_08:double[])
    }
    
    public com.sun.jna.Pointer[] getPointerArray(long offset) {
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
    
    public com.sun.jna.Pointer[] getPointerArray(long offset, int arraySize) {
        var_6_09 : Pointer[]
        
        var_6_09 = newarray:Pointer[](com.sun.jna.Pointer.class, arraySize:int)
        invokevirtual:void(Pointer::read, this:Pointer, offset:long, var_6_09:Pointer[], ldc:int(0), arraySize:int)
        return:Pointer[](var_6_09:Pointer[])
    }
    
    public java.lang.String[] getStringArray(long offset) {
        return:String[](invokevirtual:String[](Pointer::getStringArray, this:Pointer, offset:long, ldc:int(-1), invokestatic:String(Native::getDefaultStringEncoding)))
    }
    
    public java.lang.String[] getStringArray(long offset, java.lang.String encoding) {
        return:String[](invokevirtual:String[](Pointer::getStringArray, this:Pointer, offset:long, ldc:int(-1), encoding:String))
    }
    
    public java.lang.String[] getStringArray(long offset, int length) {
        return:String[](invokevirtual:String[](Pointer::getStringArray, this:Pointer, offset:long, length:int, invokestatic:String(Native::getDefaultStringEncoding)))
    }
    
    public java.lang.String[] getStringArray(long offset, boolean wide) {
        return:String[](invokevirtual:String[](Pointer::getStringArray, this:Pointer, offset:long, ldc:int(-1), wide:boolean))
    }
    
    public java.lang.String[] getWideStringArray(long offset) {
        return:String[](invokevirtual:String[](Pointer::getWideStringArray, this:Pointer, offset:long, ldc:int(-1)))
    }
    
    public java.lang.String[] getWideStringArray(long offset, int length) {
        return:String[](invokevirtual:String[](Pointer::getStringArray, this:Pointer, offset:long, length:int, ldc:String("--WIDE-STRING--")))
    }
    
    public java.lang.String[] getStringArray(long offset, int length, boolean wide) {
        return:String[](invokevirtual:String[](Pointer::getStringArray, this:Pointer, offset:long, length:int, ternaryop:String(wide:boolean, ldc:String("--WIDE-STRING--"), invokestatic:String(Native::getDefaultStringEncoding))))
    }
    
    public java.lang.String[] getStringArray(long offset, int length, java.lang.String encoding) {
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
    
    public void setValue(long offset, java.lang.Object value, java.lang.Class<?> type) {
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
    
    private void writeArray(long offset, java.lang.Object value, java.lang.Class<?> cls) {
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
    
    public void setMemory(long offset, long length, byte value) {
        invokestatic:void(Native::setMemory, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, length:long, value:byte)
    }
    
    public void setByte(long offset, byte value) {
        invokestatic:void(Native::setByte, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, value:byte)
    }
    
    public void setShort(long offset, short value) {
        invokestatic:void(Native::setShort, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, value:short)
    }
    
    public void setChar(long offset, char value) {
        invokestatic:void(Native::setChar, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, value:char)
    }
    
    public void setInt(long offset, int value) {
        invokestatic:void(Native::setInt, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, value:int)
    }
    
    public void setLong(long offset, long value) {
        invokestatic:void(Native::setLong, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, value:long)
    }
    
    public void setNativeLong(long offset, com.sun.jna.NativeLong value) {
        if (cmpeq:boolean(getstatic:int(NativeLong::SIZE), ldc:int(8))) {
            invokevirtual:void(Pointer::setLong, this:Pointer, offset:long, invokevirtual:long(IntegerType::longValue, value:NativeLong[expected:IntegerType]))
        }
        else {
            invokevirtual:void(Pointer::setInt, this:Pointer, offset:long, invokevirtual:int(IntegerType::intValue, value:NativeLong[expected:IntegerType]))
        }
    }
    
    public void setFloat(long offset, float value) {
        invokestatic:void(Native::setFloat, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, value:float)
    }
    
    public void setDouble(long offset, double value) {
        invokestatic:void(Native::setDouble, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, value:double)
    }
    
    public void setPointer(long offset, com.sun.jna.Pointer value) {
        invokestatic:void(Native::setPointer, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, ternaryop:long(cmpne:boolean(value:Pointer, aconstnull:Pointer()), getfield:long(Pointer::peer, value:Pointer), ldc:long(0L)))
    }
    
    public void setString(long offset, java.lang.String value, boolean wide) {
        if (wide:boolean) {
            invokevirtual:void(Pointer::setWideString, this:Pointer, offset:long, value:String)
        }
        else {
            invokevirtual:void(Pointer::setString, this:Pointer, offset:long, value:String)
        }
    }
    
    public void setWideString(long offset, java.lang.String value) {
        invokestatic:void(Native::setWideString, this:Pointer, getfield:long(Pointer::peer, this:Pointer), offset:long, value:String)
    }
    
    public void setString(long offset, com.sun.jna.WString value) {
        invokevirtual:void(Pointer::setWideString, this:Pointer, offset:long, ternaryop:String(cmpeq:boolean(value:WString, aconstnull:WString()), aconstnull:String(), invokevirtual:String(WString::toString, value:WString)))
    }
    
    public void setString(long offset, java.lang.String value) {
        invokevirtual:void(Pointer::setString, this:Pointer, offset:long, value:String, invokestatic:String(Native::getDefaultStringEncoding))
    }
    
    public void setString(long offset, java.lang.String value, java.lang.String encoding) {
        var_7_0B : byte[]
        
        var_7_0B = invokestatic:byte[](Native::getBytes, value:String, encoding:String)
        invokevirtual:void(Pointer::write, this:Pointer, offset:long, var_7_0B:byte[], ldc:int(0), arraylength:int(var_7_0B:byte[]))
        invokevirtual:void(Pointer::setByte, this:Pointer, add:long(offset:long, i2l:long(arraylength:int(var_7_0B:byte[]))), ldc:byte(0))
    }
    
    public java.lang.String dump(long offset, int size) {
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
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("native@0x")), invokestatic:String(Long::toHexString, getfield:long(Pointer::peer, this:Pointer)))))
    }
    
    public static long nativeValue(com.sun.jna.Pointer p) {
        return:long(ternaryop:long(cmpeq:boolean(p:Pointer, aconstnull:Pointer()), ldc:long(0L), getfield:long(Pointer::peer, p:Pointer)))
    }
    
    public static void nativeValue(com.sun.jna.Pointer p, long value) {
        putfield:long(Pointer::peer, p:Pointer, value:long)
    }
    
    static {
        if (cmpeq:boolean(putstatic:int(Pointer::SIZE, getstatic:int(Native::POINTER_SIZE)), ldc:int(0))) {
            athrow(initobject:Error(Error::<init>, ldc:String("Native library not initialized")))
        }
        
        putstatic:Pointer(Pointer::NULL, aconstnull:Pointer())
    }
}
