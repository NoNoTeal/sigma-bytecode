public class com.sun.jna.CallbackReference$NativeFunctionHandler {
    public void CallbackReference$NativeFunctionHandler(com.sun.jna.Pointer address, int callingConvention, java.util.Map<java.lang.String, ?> options) {
        invokespecial:Object(Object::<init>, this:CallbackReference$NativeFunctionHandler)
        putfield:Map<String, ?>(CallbackReference$NativeFunctionHandler::options, this:CallbackReference$NativeFunctionHandler, options:Map<String, ?>)
        putfield:Function(CallbackReference$NativeFunctionHandler::function, this:CallbackReference$NativeFunctionHandler, initobject:Function(Function::<init>, address:Pointer, callingConvention:int, checkcast:String(java.lang.String.class, invokeinterface:?[expected:String](Map<String, ?>::get, options:Map<String, ?>, ldc:String[expected:Object]("string-encoding")))))
    }
    
    public java.lang.Object invoke(java.lang.Object proxy, java.lang.reflect.Method method, java.lang.Object[] args) {
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
        return:Pointer(getfield:Function[expected:Pointer](CallbackReference$NativeFunctionHandler::function, this:CallbackReference$NativeFunctionHandler))
    }
}
