public class com.sun.jna.win32.StdCallFunctionMapper {
    public void StdCallFunctionMapper() {
        invokespecial:Object(Object::<init>, this:StdCallFunctionMapper)
    }
    
    public int getArgumentNativeStackSize(java.lang.Class<?> cls) {
        if (invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<NativeMapped>(com.sun.jna.NativeMapped.class), cls:Class<?>)) {
            cls = invokevirtual:Class<?>(NativeMappedConverter::nativeType, invokestatic:NativeMappedConverter(NativeMappedConverter::getInstance, cls:Class<?>))
        }
        
        if (invokevirtual:boolean(Class<T>::isArray, cls:Class<?>)) {
            return:int(getstatic:int(Pointer::SIZE))
        }
        
        try {
            return:int(invokestatic:int(Native::getNativeSize, cls:Class<?>))
        }
        catch (java.lang.IllegalArgumentException var_4_24) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Unknown native stack allocation size for ")), cls:Class<?>[expected:Object]))))
        }
    }
    
    public java.lang.String getFunctionName(com.sun.jna.NativeLibrary library, java.lang.reflect.Method method) {
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
}
