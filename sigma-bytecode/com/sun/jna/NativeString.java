public class com.sun.jna.NativeString {
    public void NativeString(java.lang.String string) {
        invokespecial:NativeString(NativeString::<init>, this:NativeString, string:String, invokestatic:String(Native::getDefaultStringEncoding))
    }
    
    public void NativeString(java.lang.String string, boolean wide) {
        invokespecial:NativeString(NativeString::<init>, this:NativeString, string:String, ternaryop:String(wide:boolean, ldc:String("--WIDE-STRING--"), invokestatic:String(Native::getDefaultStringEncoding)))
    }
    
    public void NativeString(com.sun.jna.WString string) {
        invokespecial:NativeString(NativeString::<init>, this:NativeString, invokevirtual:String(WString::toString, string:WString), ldc:String("--WIDE-STRING--"))
    }
    
    public void NativeString(java.lang.String string, java.lang.String encoding) {
        var_5_52 : byte[]
        
        invokespecial:Object(Object::<init>, this:NativeString)
        
        if (cmpeq:boolean(string:String, aconstnull:String())) {
            athrow(initobject:NullPointerException(NullPointerException::<init>, ldc:String("String must not be null")))
        }
        
        putfield:String(NativeString::encoding, this:NativeString, encoding:String)
        
        if (invokevirtual:boolean(String::equals, ldc:String("--WIDE-STRING--"), getfield:String[expected:Object](NativeString::encoding, this:NativeString))) {
            invokevirtual:void(Pointer::setWideString, putfield:Pointer(NativeString::pointer, this:NativeString, initobject:NativeString$StringMemory[expected:Pointer](NativeString$StringMemory::<init>, this:NativeString, i2l:long(mul:int(add:int(invokevirtual:int(String::length, string:String), ldc:int(1)), getstatic:int(Native::WCHAR_SIZE))))), ldc:long(0L), string:String)
        }
        else {
            var_5_52 = invokestatic:byte[](Native::getBytes, string:String, encoding:String)
            invokevirtual:void(Pointer::write, putfield:Pointer(NativeString::pointer, this:NativeString, initobject:NativeString$StringMemory(NativeString$StringMemory::<init>, this:NativeString, i2l:long(add:int(arraylength:int(var_5_52:byte[]), ldc:int(1))))), ldc:long(0L), var_5_52:byte[], ldc:int(0), arraylength:int(var_5_52:byte[]))
            invokevirtual:void(Pointer::setByte, getfield:Pointer(NativeString::pointer, this:NativeString), i2l:long(arraylength:int(var_5_52:byte[])), ldc:byte(0))
        }
    }
    
    public int hashCode() {
        return:int(invokevirtual:int(String::hashCode, invokevirtual:String(NativeString::toString, this:NativeString)))
    }
    
    public boolean equals(java.lang.Object other) {
        return:boolean(logicaland:boolean(instanceof:boolean(java.lang.CharSequence.class, other:Object), cmpeq:boolean(invokevirtual:int(NativeString::compareTo, this:NativeString, other:Object), ldc:int(0))))
    }
    
    public java.lang.String toString() {
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
    
    public com.sun.jna.Pointer getPointer() {
        return:Pointer(getfield:Pointer(NativeString::pointer, this:NativeString))
    }
    
    public char charAt(int index) {
        return:char(invokevirtual:char(String::charAt, invokevirtual:String(NativeString::toString, this:NativeString), index:int))
    }
    
    public int length() {
        return:int(invokevirtual:int(String::length, invokevirtual:String(NativeString::toString, this:NativeString)))
    }
    
    public java.lang.CharSequence subSequence(int start, int end) {
        return:CharSequence(invokevirtual:CharBuffer[expected:CharSequence](CharBuffer::subSequence, invokestatic:CharBuffer(CharBuffer::wrap, invokevirtual:String[expected:CharSequence](NativeString::toString, this:NativeString)), start:int, end:int))
    }
    
    public int compareTo(java.lang.Object other) {
        if (cmpeq:boolean(other:Object, aconstnull:Object())) {
            return:int(ldc:int(1))
        }
        
        return:int(invokevirtual:int(String::compareTo, invokevirtual:String(NativeString::toString, this:NativeString), invokevirtual:String(Object::toString, other:Object)))
    }
}
