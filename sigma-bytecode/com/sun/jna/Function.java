public class com.sun.jna.Function {
    public static com.sun.jna.Function getFunction(java.lang.String libraryName, java.lang.String functionName) {
        return:Function(invokevirtual:Function(NativeLibrary::getFunction, invokestatic:NativeLibrary(NativeLibrary::getInstance, libraryName:String), functionName:String))
    }
    
    public static com.sun.jna.Function getFunction(java.lang.String libraryName, java.lang.String functionName, int callFlags) {
        return:Function(invokevirtual:Function(NativeLibrary::getFunction, invokestatic:NativeLibrary(NativeLibrary::getInstance, libraryName:String), functionName:String, callFlags:int, aconstnull:String()))
    }
    
    public static com.sun.jna.Function getFunction(java.lang.String libraryName, java.lang.String functionName, int callFlags, java.lang.String encoding) {
        return:Function(invokevirtual:Function(NativeLibrary::getFunction, invokestatic:NativeLibrary(NativeLibrary::getInstance, libraryName:String), functionName:String, callFlags:int, encoding:String))
    }
    
    public static com.sun.jna.Function getFunction(com.sun.jna.Pointer p) {
        return:Function(invokestatic:Function(Function::getFunction, p:Pointer, ldc:int(0), aconstnull:String()))
    }
    
    public static com.sun.jna.Function getFunction(com.sun.jna.Pointer p, int callFlags) {
        return:Function(invokestatic:Function(Function::getFunction, p:Pointer, callFlags:int, aconstnull:String()))
    }
    
    public static com.sun.jna.Function getFunction(com.sun.jna.Pointer p, int callFlags, java.lang.String encoding) {
        return:Function(initobject:Function(Function::<init>, p:Pointer, callFlags:int, encoding:String))
    }
    
    public void Function(com.sun.jna.NativeLibrary library, java.lang.String functionName, int callFlags, java.lang.String encoding) {
        var_7_52 : UnsatisfiedLinkError
        
        invokespecial:Pointer(Pointer::<init>, this:Function)
        invokespecial:void(Function::checkCallingConvention, this:Function, and:int(callFlags:int, ldc:int(63)))
        
        if (cmpeq:boolean(functionName:String, aconstnull:String())) {
            athrow(initobject:NullPointerException(NullPointerException::<init>, ldc:String("Function name must not be null")))
        }
        
        putfield:NativeLibrary(Function::library, this:Function, library:NativeLibrary)
        putfield:String(Function::functionName, this:Function, functionName:String)
        putfield:int(Function::callFlags, this:Function, callFlags:int)
        putfield:Map<String, ?>(Function::options, this:Function, getfield:Map<String, ?>(NativeLibrary::options, library:NativeLibrary))
        putfield:String(Function::encoding, this:Function, ternaryop:String(cmpne:boolean(encoding:String, aconstnull:String()), encoding:String, invokestatic:String(Native::getDefaultStringEncoding)))
        
        try {
            putfield:long(Function::peer, this:Function, invokevirtual:long(NativeLibrary::getSymbolAddress, library:NativeLibrary, functionName:String))
        }
        catch (java.lang.UnsatisfiedLinkError var_7_52) {
            athrow(initobject:UnsatisfiedLinkError(UnsatisfiedLinkError::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Error looking up function '")), functionName:String), ldc:String("': ")), invokevirtual:String(Throwable::getMessage, var_7_52:UnsatisfiedLinkError[expected:Throwable])))))
        }
    }
    
    public void Function(com.sun.jna.Pointer functionAddress, int callFlags, java.lang.String encoding) {
        invokespecial:Pointer(Pointer::<init>, this:Function)
        invokespecial:void(Function::checkCallingConvention, this:Function, and:int(callFlags:int, ldc:int(63)))
        
        if (logicalor:boolean(cmpeq:boolean(functionAddress:Pointer, aconstnull:Pointer()), cmpeq:boolean(getfield:long(Pointer::peer, functionAddress:Pointer), ldc:long(0L)))) {
            athrow(initobject:NullPointerException(NullPointerException::<init>, ldc:String("Function address may not be null")))
        }
        
        putfield:String(Function::functionName, this:Function, invokevirtual:String(Pointer::toString, functionAddress:Pointer))
        putfield:int(Function::callFlags, this:Function, callFlags:int)
        putfield:long(Function::peer, this:Function, getfield:long(Pointer::peer, functionAddress:Pointer))
        putfield:Map<String, ?>(Function::options, this:Function, getstatic:Map(Collections::EMPTY_MAP))
        putfield:String(Function::encoding, this:Function, ternaryop:String(cmpne:boolean(encoding:String, aconstnull:String()), encoding:String, invokestatic:String(Native::getDefaultStringEncoding)))
    }
    
    private void checkCallingConvention(int convention) {
        if (cmpne:boolean(and:int(convention:int, ldc:int(63)), convention:int)) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Unrecognized calling convention: ")), convention:int))))
        }
    }
    
    public java.lang.String getName() {
        return:String(getfield:String(Function::functionName, this:Function))
    }
    
    public int getCallingConvention() {
        return:int(and:int(getfield:int(Function::callFlags, this:Function), ldc:int(63)))
    }
    
    public java.lang.Object invoke(java.lang.Class<?> returnType, java.lang.Object[] inArgs) {
        return:Object(invokevirtual:Object(Function::invoke, this:Function, returnType:Class<?>, inArgs:Object[], getfield:Map<String, ?>(Function::options, this:Function)))
    }
    
    public java.lang.Object invoke(java.lang.Class<?> returnType, java.lang.Object[] inArgs, java.util.Map<java.lang.String, ?> options) {
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
    
    public java.lang.Object invoke(java.lang.reflect.Method invokingMethod, java.lang.Class<?>[] paramTypes, java.lang.Class<?> returnType, java.lang.Object[] inArgs, java.util.Map<java.lang.String, ?> options) {
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
    
    public java.lang.Object invoke(java.lang.Object[] args, java.lang.Class<?> returnType, boolean allowObjects) {
        return:Object(invokevirtual:Object(Function::invoke, this:Function, args:Object[], returnType:Class<?>, allowObjects:boolean, ldc:int(0)))
    }
    
    public java.lang.Object invoke(java.lang.Object[] args, java.lang.Class<?> returnType, boolean allowObjects, int fixedArgs) {
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
    
    private com.sun.jna.Pointer invokePointer(int callFlags, java.lang.Object[] args) {
        var_5_0E : long
        
        var_5_0E = invokestatic:long(Native::invokePointer, this:Function, getfield:long(Function::peer, this:Function), callFlags:int, args:Object[])
        return:Pointer(ternaryop:Pointer(cmpeq:boolean(var_5_0E:long, ldc:long(0L)), aconstnull:Pointer(), initobject:Pointer(Pointer::<init>, var_5_0E:long)))
    }
    
    private java.lang.Object convertArgument(java.lang.Object[] args, int index, java.lang.reflect.Method invokingMethod, com.sun.jna.TypeMapper mapper, boolean allowObjects, java.lang.Class<?> expectedType) {
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
    
    private boolean isPrimitiveArray(java.lang.Class<?> argClass) {
        return:boolean(logicaland:boolean(invokevirtual:boolean(Class<T>::isArray, argClass:Class<?>), invokevirtual:boolean(Class<T>::isPrimitive, invokevirtual:Class<?>(Class<T>::getComponentType, argClass:Class<?>))))
    }
    
    public void invoke(java.lang.Object[] args) {
        invokevirtual:Object(Function::invoke, this:Function, ldc:Class<Void>(java.lang.Void.class), args:Object[])
    }
    
    private java.lang.String invokeString(int callFlags, java.lang.Object[] args, boolean wide) {
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
        if (cmpne:boolean(getfield:NativeLibrary(Function::library, this:Function), aconstnull:NativeLibrary())) {
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("native function ")), getfield:String(Function::functionName, this:Function)), ldc:String("(")), invokevirtual:String(NativeLibrary::getName, getfield:NativeLibrary(Function::library, this:Function))), ldc:String(")@0x")), invokestatic:String(Long::toHexString, getfield:long(Function::peer, this:Function)))))
        }
        
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("native function@0x")), invokestatic:String(Long::toHexString, getfield:long(Function::peer, this:Function)))))
    }
    
    public java.lang.Object invokeObject(java.lang.Object[] args) {
        return:Object(invokevirtual:Object(Function::invoke, this:Function, ldc:Class<Object>(java.lang.Object.class), args:Object[]))
    }
    
    public com.sun.jna.Pointer invokePointer(java.lang.Object[] args) {
        return:Pointer(checkcast:Pointer(com.sun.jna.Pointer.class, invokevirtual:Object[expected:Pointer](Function::invoke, this:Function, ldc:Class<Pointer>(com.sun.jna.Pointer.class), args:Object[])))
    }
    
    public java.lang.String invokeString(java.lang.Object[] args, boolean wide) {
        var_5_15 : Object
        
        var_5_15 = invokevirtual:Object(Function::invoke, this:Function, ternaryop:Serializable[expected:Class<?>](wide:boolean, ldc:Class<WString>[expected:Serializable](com.sun.jna.WString.class), ldc:Class<String>[expected:Serializable](java.lang.String.class)), args:Object[])
        return:String(ternaryop:String(cmpne:boolean(var_5_15:Object, aconstnull:Object()), invokevirtual:String(Object::toString, var_5_15:Object), aconstnull:String()))
    }
    
    public int invokeInt(java.lang.Object[] args) {
        return:int(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Object[expected:Integer](Function::invoke, this:Function, ldc:Class<Integer>(java.lang.Integer.class), args:Object[]))))
    }
    
    public long invokeLong(java.lang.Object[] args) {
        return:long(invokevirtual:long(Long::longValue, checkcast:Long(java.lang.Long.class, invokevirtual:Object[expected:Long](Function::invoke, this:Function, ldc:Class<Long>(java.lang.Long.class), args:Object[]))))
    }
    
    public float invokeFloat(java.lang.Object[] args) {
        return:float(invokevirtual:float(Float::floatValue, checkcast:Float(java.lang.Float.class, invokevirtual:Object[expected:Float](Function::invoke, this:Function, ldc:Class<Float>(java.lang.Float.class), args:Object[]))))
    }
    
    public double invokeDouble(java.lang.Object[] args) {
        return:double(invokevirtual:double(Double::doubleValue, checkcast:Double(java.lang.Double.class, invokevirtual:Object[expected:Double](Function::invoke, this:Function, ldc:Class<Double>(java.lang.Double.class), args:Object[]))))
    }
    
    public void invokeVoid(java.lang.Object[] args) {
        invokevirtual:Object(Function::invoke, this:Function, ldc:Class<Void>(java.lang.Void.class), args:Object[])
    }
    
    public boolean equals(java.lang.Object o) {
        var_4_20 : Function
        
        if (cmpeq:boolean(o:Object, this:Function[expected:Object])) {
            return:boolean(ldc:boolean(1))
        }
        
        if (cmpeq:boolean(o:Object, aconstnull:Object())) {
            return:boolean(ldc:boolean(0))
        }
        
        if (cmpeq:boolean(invokevirtual:Class<?>(Object::getClass, o:Object), invokevirtual:Class<? extends Function>(Function::getClass, this:Function))) {
            var_4_20 = checkcast:Function(com.sun.jna.Function.class, o:Object[expected:Function])
            return:boolean(logicaland:boolean(logicaland:boolean(cmpeq:boolean(getfield:int(Function::callFlags, var_4_20:Function), getfield:int(Function::callFlags, this:Function)), invokeinterface:boolean(Map<K, V>::equals, getfield:Map<String, ?>(Function::options, var_4_20:Function), getfield:Map<String, ?>[expected:Object](Function::options, this:Function))), cmpeq:boolean(getfield:long(Function::peer, var_4_20:Function), getfield:long(Function::peer, this:Function))))
        }
        
        return:boolean(ldc:boolean(0))
    }
    
    public int hashCode() {
        return:int(add:int(add:int(getfield:int(Function::callFlags, this:Function), invokeinterface:int(Map<K, V>::hashCode, getfield:Map<String, ?>(Function::options, this:Function))), invokespecial:int(Pointer::hashCode, this:Function[expected:Pointer])))
    }
    
    public static java.lang.Object[] concatenateVarArgs(java.lang.Object[] inArgs) {
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
    
    public static boolean isVarArgs(java.lang.reflect.Method m) {
        return:boolean(invokevirtual:boolean(VarArgsChecker::isVarArgs, getstatic:VarArgsChecker(Function::IS_VARARGS), m:Method))
    }
    
    public static int fixedArgs(java.lang.reflect.Method m) {
        return:int(invokevirtual:int(VarArgsChecker::fixedArgs, getstatic:VarArgsChecker(Function::IS_VARARGS), m:Method))
    }
    
    public static java.lang.Boolean valueOf(boolean b) {
        return:Boolean(ternaryop:Boolean(b:boolean, getstatic:Boolean(Boolean::TRUE), getstatic:Boolean(Boolean::FALSE)))
    }
    
    static {
        putstatic:Integer(Function::INTEGER_TRUE, invokestatic:Integer(Integer::valueOf, ldc:int(-1)))
        putstatic:Integer(Function::INTEGER_FALSE, invokestatic:Integer(Integer::valueOf, ldc:int(0)))
        putstatic:VarArgsChecker(Function::IS_VARARGS, invokestatic:VarArgsChecker(VarArgsChecker::create))
    }
}
