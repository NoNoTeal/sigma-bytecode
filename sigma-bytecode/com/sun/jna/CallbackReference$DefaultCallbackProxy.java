public class com.sun.jna.CallbackReference$DefaultCallbackProxy {
    public void CallbackReference$DefaultCallbackProxy(com.sun.jna.CallbackReference p0, java.lang.reflect.Method callbackMethod, com.sun.jna.TypeMapper mapper, java.lang.String encoding) {
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
    
    public com.sun.jna.Callback getCallback() {
        return:Callback(invokestatic:Callback(CallbackReference::access$000, getfield:CallbackReference(CallbackReference$DefaultCallbackProxy::this$0, this:CallbackReference$DefaultCallbackProxy)))
    }
    
    private java.lang.Object invokeCallback(java.lang.Object[] args) {
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
    
    public java.lang.Object callback(java.lang.Object[] args) {
        var_4_09 : Throwable
        
        try {
            return:Object(invokespecial:Object(CallbackReference$DefaultCallbackProxy::invokeCallback, this:CallbackReference$DefaultCallbackProxy, args:Object[]))
        }
        catch (java.lang.Throwable var_4_09) {
            invokeinterface:void(Callback$UncaughtExceptionHandler::uncaughtException, invokestatic:Callback$UncaughtExceptionHandler(Native::getCallbackExceptionHandler), invokevirtual:Callback(CallbackReference$DefaultCallbackProxy::getCallback, this:CallbackReference$DefaultCallbackProxy), var_4_09:Throwable)
            return:Object(aconstnull:Object())
        }
    }
    
    private java.lang.Object convertArgument(java.lang.Object value, java.lang.Class<?> dstType) {
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
    
    private java.lang.Object convertResult(java.lang.Object value) {
        var_4_2B : Class<?>
        var_5_C6 : StringArray
        
        if (cmpne:boolean(getfield:ToNativeConverter(CallbackReference$DefaultCallbackProxy::toNative, this:CallbackReference$DefaultCallbackProxy), aconstnull:ToNativeConverter())) {
            value = invokeinterface:Object(ToNativeConverter::toNative, getfield:ToNativeConverter(CallbackReference$DefaultCallbackProxy::toNative, this:CallbackReference$DefaultCallbackProxy), value:Object, initobject:CallbackResultContext[expected:ToNativeContext](CallbackResultContext::<init>, getfield:Method(CallbackReference$DefaultCallbackProxy::callbackMethod, this:CallbackReference$DefaultCallbackProxy)))
        }
        
        if (cmpeq:boolean(value:Object, aconstnull:Object())) {
            return:Object(aconstnull:Object())
        }
        
        var_4_2B = invokevirtual:Class<?>(Object::getClass, value:Object)
        
        if (invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Structure>(com.sun.jna.Structure.class), var_4_2B:Class<?>)) {
            if (invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Structure$ByValue>(com.sun.jna.Structure$ByValue.class), var_4_2B:Class<?>)) {
                return:Object(value:Object)
            }
            
            return:Object(invokevirtual:Pointer[expected:Object](Structure::getPointer, checkcast:Structure(com.sun.jna.Structure.class, value:Object[expected:Structure])))
        }
        else {
            if (logicalor:boolean(cmpeq:boolean(var_4_2B:Class<Boolean>, getstatic:Class<Boolean>(Boolean::TYPE)), cmpeq:boolean(var_4_2B:Class<Boolean>, ldc:Class<Boolean>(java.lang.Boolean.class)))) {
                return:Object(ternaryop:Integer[expected:Object](invokevirtual:boolean(Boolean::equals, getstatic:Boolean(Boolean::TRUE), value:Object), getstatic:Integer(Function::INTEGER_TRUE), getstatic:Integer(Function::INTEGER_FALSE)))
            }
            
            if (logicalor:boolean(cmpeq:boolean(var_4_2B:Class<String>, ldc:Class<String>(java.lang.String.class)), cmpeq:boolean(var_4_2B:Class<WString>, ldc:Class<WString>(com.sun.jna.WString.class)))) {
                return:Object(invokestatic:Pointer(CallbackReference::access$100, value:Object, cmpeq:boolean(var_4_2B:Class<WString>, ldc:Class<WString>(com.sun.jna.WString.class))))
            }
            
            if (logicalor:boolean(cmpeq:boolean(var_4_2B:Class<String[]>, ldc:Class<String[]>(java.lang.String[].class)), cmpeq:boolean(var_4_2B:Class<WString>, ldc:Class<WString>(com.sun.jna.WString.class)))) {
                var_5_C6 = ternaryop:StringArray(cmpeq:boolean(var_4_2B:Class<String[]>, ldc:Class<String[]>(java.lang.String[].class)), initobject:StringArray(StringArray::<init>, checkcast:String[](java.lang.String[].class, checkcast:String[](java.lang.String[].class, value:Object[expected:String[]])), getfield:String(CallbackReference$DefaultCallbackProxy::encoding, this:CallbackReference$DefaultCallbackProxy)), initobject:StringArray(StringArray::<init>, checkcast:WString[](com.sun.jna.WString[].class, checkcast:WString[](com.sun.jna.WString[].class, value:Object[expected:WString[]]))))
                invokeinterface:StringArray(Map<Object, StringArray>::put, getstatic:Map<Object, Object>(CallbackReference::allocations), value:Object, var_5_C6:StringArray)
                return:Object(var_5_C6:StringArray)
            }
            
            if (invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Callback>(com.sun.jna.Callback.class), var_4_2B:Class<String[]>)) {
                return:Object(invokestatic:Pointer[expected:Object](CallbackReference::getFunctionPointer, checkcast:Callback(com.sun.jna.Callback.class, value:Object[expected:Callback])))
            }
            
            return:Object(value:Object)
        }
    }
    
    public java.lang.Class<?>[] getParameterTypes() {
        return:Class<?>[](invokevirtual:Class<?>[](Method::getParameterTypes, getfield:Method(CallbackReference$DefaultCallbackProxy::callbackMethod, this:CallbackReference$DefaultCallbackProxy)))
    }
    
    public java.lang.Class<?> getReturnType() {
        return:Class<?>(invokevirtual:Class<?>(Method::getReturnType, getfield:Method(CallbackReference$DefaultCallbackProxy::callbackMethod, this:CallbackReference$DefaultCallbackProxy)))
    }
}
