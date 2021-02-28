public class com.sun.jna.NativeLibrary {
    private static java.lang.String functionKey(java.lang.String name, int flags, java.lang.String encoding) {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), name:String), ldc:String("|")), flags:int), ldc:String("|")), encoding:String)))
    }
    
    private void NativeLibrary(java.lang.String libraryName, java.lang.String libraryPath, long handle, java.util.Map<java.lang.String, ?> options) {
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
    
    private static int openFlags(java.util.Map<java.lang.String, ?> options) {
        var_3_0B : Object
        
        var_3_0B = invokeinterface:?[expected:Object](Map<String, ?>::get, options:Map<String, ?>, ldc:String[expected:Object]("open-flags"))
        
        if (instanceof:boolean(java.lang.Number.class, var_3_0B:Object[expected:?])) {
            return:int(invokevirtual:int(Number::intValue, checkcast:Number(java.lang.Number.class, var_3_0B:Object[expected:?])))
        }
        
        return:int(ldc:int(-1))
    }
    
    private static com.sun.jna.NativeLibrary loadLibrary(java.lang.String libraryName, java.util.Map<java.lang.String, ?> options) {
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
    
    public static java.lang.String matchFramework(java.lang.String libraryName) {
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
    
    private java.lang.String getLibraryName(java.lang.String libraryName) {
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
    
    public static final com.sun.jna.NativeLibrary getInstance(java.lang.String libraryName) {
        return:NativeLibrary(invokestatic:NativeLibrary(NativeLibrary::getInstance, libraryName:String, invokestatic:Map<String, ?>(Collections::emptyMap)))
    }
    
    public static final com.sun.jna.NativeLibrary getInstance(java.lang.String libraryName, java.lang.ClassLoader classLoader) {
        return:NativeLibrary(invokestatic:NativeLibrary(NativeLibrary::getInstance, libraryName:String, invokestatic:Map<String, ClassLoader>(Collections::singletonMap, ldc:String("classloader"), classLoader:ClassLoader)))
    }
    
    public static final com.sun.jna.NativeLibrary getInstance(java.lang.String libraryName, java.util.Map<java.lang.String, ?> libraryOptions) {
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
    
    public static final synchronized com.sun.jna.NativeLibrary getProcess() {
        return:NativeLibrary(invokestatic:NativeLibrary(NativeLibrary::getInstance, aconstnull:String()))
    }
    
    public static final synchronized com.sun.jna.NativeLibrary getProcess(java.util.Map<java.lang.String, ?> options) {
        return:NativeLibrary(invokestatic:NativeLibrary(NativeLibrary::getInstance, aconstnull:String(), options:Map<String, ?>))
    }
    
    public static final void addSearchPath(java.lang.String libraryName, java.lang.String path) {
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
    
    public com.sun.jna.Function getFunction(java.lang.String functionName) {
        return:Function(invokevirtual:Function(NativeLibrary::getFunction, this:NativeLibrary, functionName:String, getfield:int(NativeLibrary::callFlags, this:NativeLibrary)))
    }
    
    public com.sun.jna.Function getFunction(java.lang.String name, java.lang.reflect.Method method) {
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
    
    public com.sun.jna.Function getFunction(java.lang.String functionName, int callFlags) {
        return:Function(invokevirtual:Function(NativeLibrary::getFunction, this:NativeLibrary, functionName:String, callFlags:int, getfield:String(NativeLibrary::encoding, this:NativeLibrary)))
    }
    
    public com.sun.jna.Function getFunction(java.lang.String functionName, int callFlags, java.lang.String encoding) {
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
    
    public java.util.Map<java.lang.String, ?> getOptions() {
        return:Map<String, ?>(getfield:Map<String, ?>(NativeLibrary::options, this:NativeLibrary))
    }
    
    public com.sun.jna.Pointer getGlobalVariableAddress(java.lang.String symbolName) {
        var_4_11 : UnsatisfiedLinkError
        
        try {
            return:Pointer(initobject:Pointer(Pointer::<init>, invokevirtual:long(NativeLibrary::getSymbolAddress, this:NativeLibrary, symbolName:String)))
        }
        catch (java.lang.UnsatisfiedLinkError var_4_11) {
            athrow(initobject:UnsatisfiedLinkError(UnsatisfiedLinkError::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Error looking up '")), symbolName:String), ldc:String("': ")), invokevirtual:String(Throwable::getMessage, var_4_11:UnsatisfiedLinkError[expected:Throwable])))))
        }
    }
    
    public long getSymbolAddress(java.lang.String name) {
        if (cmpeq:boolean(getfield:long(NativeLibrary::handle, this:NativeLibrary), ldc:long(0L))) {
            athrow(initobject:UnsatisfiedLinkError(UnsatisfiedLinkError::<init>, ldc:String("Library has been unloaded")))
        }
        
        return:long(invokestatic:long(Native::findSymbol, getfield:long(NativeLibrary::handle, this:NativeLibrary), name:String))
    }
    
    public java.lang.String toString() {
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Native Library <")), getfield:String(NativeLibrary::libraryPath, this:NativeLibrary)), ldc:String("@")), getfield:long(NativeLibrary::handle, this:NativeLibrary)), ldc:String(">"))))
    }
    
    public java.lang.String getName() {
        return:String(getfield:String(NativeLibrary::libraryName, this:NativeLibrary))
    }
    
    public java.io.File getFile() {
        if (cmpeq:boolean(getfield:String(NativeLibrary::libraryPath, this:NativeLibrary), aconstnull:String())) {
            return:File(aconstnull:File())
        }
        
        return:File(initobject:File(File::<init>, getfield:String(NativeLibrary::libraryPath, this:NativeLibrary)))
    }
    
    public void finalize() {
        invokevirtual:void(NativeLibrary::dispose, this:NativeLibrary)
    }
    
    public static void disposeAll() {
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
    
    public void dispose() {
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
    
    private static java.util.List<java.lang.String> initPaths(java.lang.String key) {
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
    
    private static java.lang.String findLibraryPath(java.lang.String libName, java.util.List<java.lang.String> searchPath) {
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
    
    public static java.lang.String mapSharedLibraryName(java.lang.String libName) {
        var_3_2E : String
        
        if (logicalnot:boolean(invokestatic:boolean(Platform::isMac))) {
            if (logicalor:boolean(invokestatic:boolean(Platform::isLinux), invokestatic:boolean(Platform::isFreeBSD))) {
                if (logicalor:boolean(invokestatic:boolean(NativeLibrary::isVersionedName, libName:String), invokevirtual:boolean(String::endsWith, libName:String, ldc:String(".so")))) {
                    return:String(libName:String)
                }
            }
            else {
                if (invokestatic:boolean(Platform::isAIX)) {
                    if (invokevirtual:boolean(String::startsWith, libName:String, ldc:String("lib"))) {
                        return:String(libName:String)
                    }
                }
                else {
                    if (logicaland:boolean(invokestatic:boolean(Platform::isWindows), logicalor:boolean(invokevirtual:boolean(String::endsWith, libName:String, ldc:String(".drv")), invokevirtual:boolean(String::endsWith, libName:String, ldc:String(".dll"))))) {
                        return:String(libName:String)
                    }
                }
            }
            
            return:String(invokestatic:String(System::mapLibraryName, libName:String))
        }
        
        if (logicaland:boolean(invokevirtual:boolean(String::startsWith, libName:String, ldc:String("lib")), logicalor:boolean(invokevirtual:boolean(String::endsWith, libName:String, ldc:String(".dylib")), invokevirtual:boolean(String::endsWith, libName:String, ldc:String(".jnilib"))))) {
            return:String(libName:String)
        }
        
        var_3_2E = invokestatic:String(System::mapLibraryName, libName:String)
        
        if (invokevirtual:boolean(String::endsWith, var_3_2E:String, ldc:String(".jnilib"))) {
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(String::substring, var_3_2E:String, ldc:int(0), invokevirtual:int(String::lastIndexOf, var_3_2E:String, ldc:String(".jnilib")))), ldc:String(".dylib"))))
        }
        
        return:String(var_3_2E:String)
    }
    
    private static boolean isVersionedName(java.lang.String name) {
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
    
    public static java.lang.String matchLibrary(java.lang.String libName, java.util.List<java.lang.String> searchPath) {
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
    
    public static double parseVersion(java.lang.String ver) {
        var_3_05 : double
        var_5_07 : double
        var_7_10 : int
        var_8_23 : String
        num : String
        
        var_3_05 = ldc:double(0.0)
        var_5_07 = ldc:double(1.0)
        var_7_10 = invokevirtual:int(String::indexOf, ver:String, ldc:String("."))
        
        while (cmpne:boolean(ver:String, aconstnull:String())) {
            if (cmpne:boolean(var_7_10:int, ldc:int(-1))) {
                var_8_23 = invokevirtual:String(String::substring, ver:String, ldc:int(0), var_7_10:int)
                ver = invokevirtual:String(String::substring, ver:String, add:String[expected:int](num:String, ldc:int[expected:String](1)))
                num = invokevirtual:int[expected:String](String::indexOf, ver:String, ldc:String("."))
            }
            else {
                var_8_23 = ver:String
                ver = aconstnull:String()
            }
            
            try {
                var_3_05 = add:double(var_3_05:double, div:double(i2d:double(invokestatic:int(Integer::parseInt, var_8_23:String)), var_5_07:double))
            }
            catch (java.lang.NumberFormatException var_9_4E) {
                return:double(ldc:double(0.0))
            }
            
            var_5_07 = mul:double(var_5_07:double, ldc:double(100.0))
        }
        
        return:double(var_3_05:double)
    }
    
    private static java.lang.String getMultiArchPath() {
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
    
    private static java.util.ArrayList<java.lang.String> getLinuxLdPaths() {
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
    
    public static boolean access$000(java.lang.String x0) {
        return:boolean(invokestatic:boolean(NativeLibrary::isVersionedName, x0:String))
    }
    
    static {
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
