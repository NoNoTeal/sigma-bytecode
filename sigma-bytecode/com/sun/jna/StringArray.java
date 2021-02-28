public class com.sun.jna.StringArray {
    public void StringArray(java.lang.String[] strings) {
        invokespecial:StringArray(StringArray::<init>, this:StringArray, strings:String[], ldc:boolean(0))
    }
    
    public void StringArray(java.lang.String[] strings, boolean wide) {
        invokespecial:StringArray(StringArray::<init>, this:StringArray, checkcast:String[][expected:Object[]](java.lang.String[].class, strings:String[][expected:Object[]]), ternaryop:String(wide:boolean, ldc:String("--WIDE-STRING--"), invokestatic:String(Native::getDefaultStringEncoding)))
    }
    
    public void StringArray(java.lang.String[] strings, java.lang.String encoding) {
        invokespecial:StringArray(StringArray::<init>, this:StringArray, checkcast:String[][expected:Object[]](java.lang.String[].class, strings:String[][expected:Object[]]), encoding:String)
    }
    
    public void StringArray(com.sun.jna.WString[] strings) {
        invokespecial:StringArray(StringArray::<init>, this:StringArray, strings:WString[][expected:Object[]], ldc:String("--WIDE-STRING--"))
    }
    
    private void StringArray(java.lang.Object[] strings, java.lang.String encoding) {
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
    
    public void read() {
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
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ternaryop:String(invokevirtual:boolean(String::equals, ldc:String("--WIDE-STRING--"), getfield:String[expected:Object](StringArray::encoding, this:StringArray)), ldc:String("const wchar_t*[]"), ldc:String("const char*[]"))), invokestatic:List<Object>[expected:Object](Arrays::asList, getfield:Object[](StringArray::original, this:StringArray)))))
    }
}
