public final class com.sun.jna.Native {
    public static float parseVersion(java.lang.String v) {
        return:float(invokestatic:float(Float::parseFloat, invokevirtual:String(String::substring, v:String, ldc:int(0), invokevirtual:int(String::lastIndexOf, v:String, ldc:String(".")))))
    }
    
    public static boolean isCompatibleVersion(java.lang.String expectedVersion, java.lang.String nativeVersion) {
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
    
    private static void dispose() {
        invokestatic:void(CallbackReference::disposeAll)
        invokestatic:void(Memory::disposeAll)
        invokestatic:void(NativeLibrary::disposeAll)
        invokestatic:void(Native::unregisterAll)
        putstatic:String(Native::jnidispatchPath, aconstnull:String())
        invokestatic:String(System::setProperty, ldc:String("jna.loaded"), ldc:String("false"))
    }
    
    public static boolean deleteLibrary(java.io.File lib) {
        if (invokevirtual:boolean(File::delete, lib:File)) {
            return:boolean(ldc:boolean(1))
        }
        
        invokestatic:void(Native::markTemporaryFile, lib:File)
        return:boolean(ldc:boolean(0))
    }
    
    private void Native() {
        invokespecial:Object(Object::<init>, this:Native)
    }
    
    private static native void initIDs();
    
    public static synchronized native void setProtected(boolean p0);
    
    public static synchronized native boolean isProtected();
    
    public static void setPreserveLastError(boolean enable) {
    }
    
    public static boolean getPreserveLastError() {
        return:boolean(ldc:boolean(1))
    }
    
    public static long getWindowID(java.awt.Window w) {
        return:long(invokestatic:long(Native$AWT::getWindowID, w:Window))
    }
    
    public static long getComponentID(java.awt.Component c) {
        return:long(invokestatic:long(Native$AWT::getComponentID, c:Component[expected:Object]))
    }
    
    public static com.sun.jna.Pointer getWindowPointer(java.awt.Window w) {
        return:Pointer(initobject:Pointer(Pointer::<init>, invokestatic:long(Native$AWT::getWindowID, w:Window)))
    }
    
    public static com.sun.jna.Pointer getComponentPointer(java.awt.Component c) {
        return:Pointer(initobject:Pointer(Pointer::<init>, invokestatic:long(Native$AWT::getComponentID, c:Component[expected:Object])))
    }
    
    public static native long getWindowHandle0(java.awt.Component p0);
    
    public static com.sun.jna.Pointer getDirectBufferPointer(java.nio.Buffer b) {
        var_3_07 : long
        
        var_3_07 = invokestatic:long(Native::_getDirectBufferPointer, b:Buffer)
        return:Pointer(ternaryop:Pointer(cmpeq:boolean(var_3_07:long, ldc:long(0L)), aconstnull:Pointer(), initobject:Pointer(Pointer::<init>, var_3_07:long)))
    }
    
    private static native long _getDirectBufferPointer(java.nio.Buffer p0);
    
    public static java.lang.String toString(byte[] buf) {
        return:String(invokestatic:String(Native::toString, buf:byte[], invokestatic:String(Native::getDefaultStringEncoding)))
    }
    
    public static java.lang.String toString(byte[] buf, java.lang.String encoding) {
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
    
    public static java.lang.String toString(char[] buf) {
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
    
    public static java.util.List<java.lang.String> toStringList(char[] buf) {
        return:List<String>(invokestatic:List<String>(Native::toStringList, buf:char[], ldc:int(0), arraylength:int(buf:char[])))
    }
    
    public static java.util.List<java.lang.String> toStringList(char[] buf, int offset, int len) {
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
    
    public static T loadLibrary(java.lang.Class<T> interfaceClass) {
        return:T(invokestatic:T(Native::loadLibrary, aconstnull:String(), interfaceClass:Class<T>))
    }
    
    public static T loadLibrary(java.lang.Class<T> interfaceClass, java.util.Map<java.lang.String, ?> options) {
        return:T(invokestatic:T(Native::loadLibrary, aconstnull:String(), interfaceClass:Class<T>, options:Map<String, ?>))
    }
    
    public static T loadLibrary(java.lang.String name, java.lang.Class<T> interfaceClass) {
        return:T(invokestatic:T(Native::loadLibrary, name:String, interfaceClass:Class<T>, invokestatic:Map<String, ?>(Collections::emptyMap)))
    }
    
    public static T loadLibrary(java.lang.String name, java.lang.Class<T> interfaceClass, java.util.Map<java.lang.String, ?> options) {
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
    
    private static void loadLibraryInstance(java.lang.Class<?> cls) {
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
    
    public static java.lang.Class<?> findEnclosingLibraryClass(java.lang.Class<?> cls) {
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
    
    public static java.util.Map<java.lang.String, java.lang.Object> getLibraryOptions(java.lang.Class<?> type) {
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
    
    private static java.lang.Object lookupField(java.lang.Class<?> mappingClass, java.lang.String fieldName, java.lang.Class<?> resultClass) {
        var_5_09 : Field
        var_5_1C : Exception
        
        try {
            var_5_09 = invokevirtual:Field(Class<T>::getField, mappingClass:Class<?>, fieldName:String)
            invokevirtual:void(AccessibleObject::setAccessible, var_5_09:Field[expected:AccessibleObject], ldc:boolean(1))
            return:Object(invokevirtual:Object(Field::get, var_5_09:Field, aconstnull:Object()))
        }
        catch (java.lang.NoSuchFieldException var_5_18) {
            return:Object(aconstnull:Object())
        }
        catch (java.lang.Exception var_5_1C) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), fieldName:String), ldc:String(" must be a public field of type ")), invokevirtual:String(Class<T>::getName, resultClass:Class<?>)), ldc:String(" (")), var_5_1C:Exception[expected:Object]), ldc:String("): ")), mappingClass:Class<?>[expected:Object]))))
        }
    }
    
    public static com.sun.jna.TypeMapper getTypeMapper(java.lang.Class<?> cls) {
        return:TypeMapper(checkcast:TypeMapper(com.sun.jna.TypeMapper.class, invokeinterface:TypeMapper(Map<String, TypeMapper>::get, invokestatic:Map<String, Object>(Native::getLibraryOptions, cls:Class<?>), ldc:String[expected:Object]("type-mapper"))))
    }
    
    public static java.lang.String getStringEncoding(java.lang.Class<?> cls) {
        var_4_15 : String
        
        var_4_15 = checkcast:String(java.lang.String.class, invokeinterface:String(Map<String, String>::get, invokestatic:Map<String, Object>(Native::getLibraryOptions, cls:Class<?>), ldc:String[expected:Object]("string-encoding")))
        return:String(ternaryop:String(cmpne:boolean(var_4_15:String, aconstnull:String()), var_4_15:String, invokestatic:String(Native::getDefaultStringEncoding)))
    }
    
    public static java.lang.String getDefaultStringEncoding() {
        return:String(invokestatic:String(System::getProperty, ldc:String("jna.encoding"), getstatic:String(Native::DEFAULT_ENCODING)))
    }
    
    public static int getStructureAlignment(java.lang.Class<?> cls) {
        var_3_13 : Integer
        
        var_3_13 = checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Map<String, Integer>::get, invokestatic:Map<String, Object>(Native::getLibraryOptions, cls:Class<?>), ldc:String[expected:Object]("structure-alignment")))
        return:int(ternaryop:int(cmpeq:boolean(var_3_13:Integer, aconstnull:Integer()), ldc:int(0), invokevirtual:int(Integer::intValue, var_3_13:Integer)))
    }
    
    public static byte[] getBytes(java.lang.String s) {
        return:byte[](invokestatic:byte[](Native::getBytes, s:String, invokestatic:String(Native::getDefaultStringEncoding)))
    }
    
    public static byte[] getBytes(java.lang.String s, java.lang.String encoding) {
        if (cmpne:boolean(encoding:String, aconstnull:String())) {
            try {
                return:byte[](invokevirtual:byte[](String::getBytes, s:String, encoding:String))
            }
            catch (java.io.UnsupportedEncodingException var_4_0E) {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::err), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("JNA Warning: Encoding '")), encoding:String), ldc:String("' is unsupported"))))
            }
        }
        
        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::err), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("JNA Warning: Encoding with fallback ")), invokestatic:String(System::getProperty, ldc:String("file.encoding")))))
        return:byte[](invokevirtual:byte[](String::getBytes, s:String))
    }
    
    public static byte[] toByteArray(java.lang.String s) {
        return:byte[](invokestatic:byte[](Native::toByteArray, s:String, invokestatic:String(Native::getDefaultStringEncoding)))
    }
    
    public static byte[] toByteArray(java.lang.String s, java.lang.String encoding) {
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
    
    public static char[] toCharArray(java.lang.String s) {
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
    
    private static void loadNativeDispatchLibrary() {
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
    
    private static void loadNativeDispatchLibraryFromClasspath() {
        var_3_3C : File
        var_2_C6 : IOException
        
        try {
            var_3_3C = invokestatic:File(Native::extractFromResourcePath, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("/com/sun/jna/")), getstatic:String(Platform::RESOURCE_PREFIX)), ldc:String("/")), invokevirtual:String(String::replace, invokestatic:String(System::mapLibraryName, ldc:String("jnidispatch")), ldc:String[expected:CharSequence](".dylib"), ldc:String[expected:CharSequence](".jnilib")))), invokevirtual:ClassLoader(Class<T>::getClassLoader, ldc:Class<Native>(com.sun.jna.Native.class)))
            
            if (logicaland:boolean(cmpeq:boolean(var_3_3C:File, aconstnull:File()), cmpeq:boolean(var_3_3C:File, aconstnull:File()))) {
                athrow(initobject:UnsatisfiedLinkError(UnsatisfiedLinkError::<init>, ldc:String("Could not find JNA native support")))
            }
            
            if (getstatic:boolean(Native::DEBUG_JNA_LOAD)) {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Trying ")), invokevirtual:String(File::getAbsolutePath, var_3_3C:File))))
            }
            
            invokestatic:String(System::setProperty, ldc:String("jnidispatch.path"), invokevirtual:String(File::getAbsolutePath, var_3_3C:File))
            invokestatic:void(System::load, invokevirtual:String(File::getAbsolutePath, var_3_3C:File))
            putstatic:String(Native::jnidispatchPath, invokevirtual:String(File::getAbsolutePath, var_3_3C:File))
            
            if (getstatic:boolean(Native::DEBUG_JNA_LOAD)) {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Found jnidispatch at ")), getstatic:String(Native::jnidispatchPath))))
            }
            
            if (logicaland:boolean(invokestatic:boolean(Native::isUnpacked, var_3_3C:File), logicalnot:boolean(invokestatic:boolean(Boolean::getBoolean, ldc:String("jnidispatch.preserve"))))) {
                invokestatic:boolean(Native::deleteLibrary, var_3_3C:File)
            }
        }
        catch (java.io.IOException var_2_C6) {
            athrow(initobject:UnsatisfiedLinkError(UnsatisfiedLinkError::<init>, invokevirtual:String(Throwable::getMessage, var_2_C6:IOException[expected:Throwable])))
        }
    }
    
    public static boolean isUnpacked(java.io.File file) {
        return:boolean(invokevirtual:boolean(String::startsWith, invokevirtual:String(File::getName, file:File), ldc:String("jna")))
    }
    
    public static java.io.File extractFromResourcePath(java.lang.String name) {
        return:File(invokestatic:File(Native::extractFromResourcePath, name:String, aconstnull:ClassLoader()))
    }
    
    public static java.io.File extractFromResourcePath(java.lang.String name, java.lang.ClassLoader loader) {
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
    
    private static native int sizeof(int p0);
    
    private static native java.lang.String getNativeVersion();
    
    private static native java.lang.String getAPIChecksum();
    
    public static native int getLastError();
    
    public static native void setLastError(int p0);
    
    public static com.sun.jna.Library synchronizedLibrary(com.sun.jna.Library library) {
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
    
    public static java.lang.String getWebStartLibraryPath(java.lang.String libName) {
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
    
    public static void markTemporaryFile(java.io.File file) {
        var_3_2F : IOException
        
        try {
            invokevirtual:boolean(File::createNewFile, initobject:File(File::<init>, invokevirtual:File(File::getParentFile, file:File), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokevirtual:String(File::getName, file:File)), ldc:String(".x")))))
        }
        catch (java.io.IOException var_3_2F) {
            invokevirtual:void(Throwable::printStackTrace, var_3_2F:IOException[expected:Throwable])
        }
    }
    
    public static java.io.File getTempDir() {
        var_2_0A : String
        var_3_17 : File
        var_4_2D : File
        tmp : File
        
        var_2_0A = invokestatic:String(System::getProperty, ldc:String("jna.tmpdir"))
        
        if (cmpne:boolean(var_2_0A:String, aconstnull:String())) {
            var_3_17 = initobject:File(File::<init>, var_2_0A:String)
            invokevirtual:boolean(File::mkdirs, var_3_17:File)
        }
        else {
            var_4_2D = initobject:File(File::<init>, invokestatic:String(System::getProperty, ldc:String("java.io.tmpdir")))
            tmp = initobject:File(File::<init>, var_4_2D:File, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("jna-")), invokevirtual:int(String::hashCode, invokestatic:String(System::getProperty, ldc:String("user.name"))))))
            invokevirtual:boolean(File::mkdirs, tmp:File)
            
            if (logicalnot:boolean(logicaland:boolean(invokevirtual:boolean(File::exists, tmp:File), invokevirtual:boolean(File::canWrite, tmp:File)))) {
                tmp = var_4_2D:File
            }
        }
        
        if (logicalnot:boolean(invokevirtual:boolean(File::exists, tmp:File))) {
            athrow(initobject:IOException(IOException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("JNA temporary directory '")), var_3_17:File[expected:Object]), ldc:String("' does not exist")))))
        }
        
        if (logicalnot:boolean(invokevirtual:boolean(File::canWrite, var_3_17:File))) {
            athrow(initobject:IOException(IOException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("JNA temporary directory '")), var_3_17:File[expected:Object]), ldc:String("' is not writable")))))
        }
        
        return:File(var_3_17:File)
    }
    
    public static void removeTemporaryFiles() {
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
    
    public static int getNativeSize(java.lang.Class<?> type, java.lang.Object value) {
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
    
    public static int getNativeSize(java.lang.Class<?> cls) {
        if (invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<NativeMapped>(com.sun.jna.NativeMapped.class), cls:Class<?>)) {
            cls = invokevirtual:Class<?>(NativeMappedConverter::nativeType, invokestatic:NativeMappedConverter(NativeMappedConverter::getInstance, cls:Class<?>))
        }
        
        if (logicalor:boolean(cmpeq:boolean(cls:Class<?>, getstatic:Class<Boolean>(Boolean::TYPE)), cmpeq:boolean(cls:Class<?>, ldc:Class<Boolean>(java.lang.Boolean.class)))) {
            return:int(ldc:int(4))
        }
        
        if (logicalor:boolean(cmpeq:boolean(cls:Class<?>, getstatic:Class<Byte>(Byte::TYPE)), cmpeq:boolean(cls:Class<?>, ldc:Class<Byte>(java.lang.Byte.class)))) {
            return:int(ldc:int(1))
        }
        
        if (logicalor:boolean(cmpeq:boolean(cls:Class<?>, getstatic:Class<Short>(Short::TYPE)), cmpeq:boolean(cls:Class<?>, ldc:Class<Short>(java.lang.Short.class)))) {
            return:int(ldc:int(2))
        }
        
        if (logicalor:boolean(cmpeq:boolean(cls:Class<?>, getstatic:Class<Character>(Character::TYPE)), cmpeq:boolean(cls:Class<?>, ldc:Class<Character>(java.lang.Character.class)))) {
            return:int(getstatic:int(Native::WCHAR_SIZE))
        }
        
        if (logicalor:boolean(cmpeq:boolean(cls:Class<?>, getstatic:Class<Integer>(Integer::TYPE)), cmpeq:boolean(cls:Class<?>, ldc:Class<Integer>(java.lang.Integer.class)))) {
            return:int(ldc:int(4))
        }
        
        if (logicalor:boolean(cmpeq:boolean(cls:Class<?>, getstatic:Class<Long>(Long::TYPE)), cmpeq:boolean(cls:Class<?>, ldc:Class<Long>(java.lang.Long.class)))) {
            return:int(ldc:int(8))
        }
        
        if (logicalor:boolean(cmpeq:boolean(cls:Class<?>, getstatic:Class<Float>(Float::TYPE)), cmpeq:boolean(cls:Class<?>, ldc:Class<Float>(java.lang.Float.class)))) {
            return:int(ldc:int(4))
        }
        
        if (logicalor:boolean(cmpeq:boolean(cls:Class<?>, getstatic:Class<Double>(Double::TYPE)), cmpeq:boolean(cls:Class<?>, ldc:Class<Double>(java.lang.Double.class)))) {
            return:int(ldc:int(8))
        }
        
        if (invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Structure>(com.sun.jna.Structure.class), cls:Class<?>)) {
            if (invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Structure$ByValue>(com.sun.jna.Structure$ByValue.class), cls:Class<?>)) {
                return:int(invokestatic:int(Structure::size, cls:Class<?>))
            }
            
            return:int(getstatic:int(Native::POINTER_SIZE))
        }
        else {
            if (logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Pointer>(com.sun.jna.Pointer.class), cls:Class<?>), logicaland:boolean(getstatic:boolean(Platform::HAS_BUFFERS), invokestatic:boolean(Native$Buffers::isBuffer, cls:Class<?>))), invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Callback>(com.sun.jna.Callback.class), cls:Class<?>)), cmpeq:boolean(ldc:Class<String>(java.lang.String.class), cls:Class<?>)), cmpeq:boolean(ldc:Class<WString>(com.sun.jna.WString.class), cls:Class<?>))) {
                return:int(getstatic:int(Native::POINTER_SIZE))
            }
            
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Native size for type \"")), invokevirtual:String(Class<T>::getName, cls:Class<?>)), ldc:String("\" is unknown")))))
        }
    }
    
    public static boolean isSupportedNativeType(java.lang.Class<?> cls) {
        if (invokevirtual:boolean(Class<T>::isAssignableFrom, ldc:Class<Structure>(com.sun.jna.Structure.class), cls:Class<?>)) {
            return:boolean(ldc:boolean(1))
        }
        
        try {
            return:boolean(cmpne:boolean(invokestatic:int(Native::getNativeSize, cls:Class<?>), ldc:int(0)))
        }
        catch (java.lang.IllegalArgumentException var_3_1D) {
            return:boolean(ldc:boolean(0))
        }
    }
    
    public static void setCallbackExceptionHandler(com.sun.jna.Callback$UncaughtExceptionHandler eh) {
        putstatic:Callback$UncaughtExceptionHandler(Native::callbackExceptionHandler, ternaryop:Callback$UncaughtExceptionHandler(cmpeq:boolean(eh:Callback$UncaughtExceptionHandler, aconstnull:Callback$UncaughtExceptionHandler()), getstatic:Callback$UncaughtExceptionHandler(Native::DEFAULT_HANDLER), eh:Callback$UncaughtExceptionHandler))
    }
    
    public static com.sun.jna.Callback$UncaughtExceptionHandler getCallbackExceptionHandler() {
        return:Callback$UncaughtExceptionHandler(getstatic:Callback$UncaughtExceptionHandler(Native::callbackExceptionHandler))
    }
    
    public static void register(java.lang.String libName) {
        invokestatic:void(Native::register, invokestatic:Class<?>(Native::findDirectMappedClass, invokestatic:Class<?>(Native::getCallingClass)), libName:String)
    }
    
    public static void register(com.sun.jna.NativeLibrary lib) {
        invokestatic:void(Native::register, invokestatic:Class<?>(Native::findDirectMappedClass, invokestatic:Class<?>(Native::getCallingClass)), lib:NativeLibrary)
    }
    
    public static java.lang.Class<?> findDirectMappedClass(java.lang.Class<?> cls) {
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
    
    public static java.lang.Class<?> getCallingClass() {
        var_2_0E : Class<?>[]
        
        var_2_0E = invokevirtual:Class<?>[](Native$6::getClassContext, initobject:Native$6(Native$6::<init>))
        
        if (cmpeq:boolean(var_2_0E:Class<?>[], aconstnull:Class<?>[]())) {
            athrow(initobject:IllegalStateException(IllegalStateException::<init>, ldc:String("The SecurityManager implementation on this platform is broken; you must explicitly provide the class to register")))
        }
        
        if (cmplt:boolean(arraylength:int(var_2_0E:Class<?>[]), ldc:int(4))) {
            athrow(initobject:IllegalStateException(IllegalStateException::<init>, ldc:String("This method must be called from the static initializer of a class")))
        }
        
        return:Class<?>(loadelement:Class<?>(var_2_0E:Class<?>[], ldc:int(3)))
    }
    
    public static void setCallbackThreadInitializer(com.sun.jna.Callback cb, com.sun.jna.CallbackThreadInitializer initializer) {
        invokestatic:CallbackThreadInitializer(CallbackReference::setCallbackThreadInitializer, cb:Callback, initializer:CallbackThreadInitializer)
    }
    
    private static void unregisterAll() {
        var_3_17 : Iterator<Entry<Class<?>, long[]>>
        var_4_2A : Entry<Class<?>, long[]>
        
        monitorenter(getstatic:Map<Class<?>, long[]>(Native::registeredClasses))
        
        try {
            var_3_17 = invokeinterface:Iterator<Entry<Class<?>, long[]>>(Set<Entry<Class<?>, long[]>>::iterator, invokeinterface:Set<Entry<Class<?>, long[]>>(Map<Class<?>, long[]>::entrySet, getstatic:Map<Class<?>, long[]>(Native::registeredClasses)))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_3_17:Iterator<Entry<Class<?>, long[]>>)) {
                var_4_2A = checkcast:Entry<Class<?>, long[]>(java.util.Map.Entry<java.lang.Class<?>, long[]>.class, invokeinterface:Entry<Class<?>, long[]>(Iterator<Entry<Class<?>, long[]>>::next, var_3_17:Iterator<Entry<Class<?>, long[]>>))
                invokestatic:void(Native::unregister, checkcast:Class<?>(java.lang.Class<?>.class, invokeinterface:Class<?>(Entry<Class<?>, long[]>::getKey, var_4_2A:Entry<Class<?>, long[]>)), checkcast:long[](long[].class, invokeinterface:long[](Entry<Class<?>, long[]>::getValue, var_4_2A:Entry<Class<?>, long[]>)))
            }
            
            invokeinterface:void(Map<K, V>::clear, getstatic:Map<Class<?>, long[]>(Native::registeredClasses))
        }
        finally {
            monitorexit(getstatic:Map<Class<?>, long[]>(Native::registeredClasses))
        }
    }
    
    public static void unregister() {
        invokestatic:void(Native::unregister, invokestatic:Class<?>(Native::findDirectMappedClass, invokestatic:Class<?>(Native::getCallingClass)))
    }
    
    public static void unregister(java.lang.Class<?> cls) {
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
    
    public static boolean registered(java.lang.Class<?> cls) {
        monitorenter(getstatic:Map<Class<?>, long[]>(Native::registeredClasses))
        
        try {
            return:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getstatic:Map<Class<?>, long[]>(Native::registeredClasses), cls:Class<?>[expected:Object]))
        }
        finally {
            monitorexit(getstatic:Map<Class<?>, long[]>(Native::registeredClasses))
        }
    }
    
    private static native void unregister(java.lang.Class<?> p0, long[] p1);
    
    public static java.lang.String getSignature(java.lang.Class<?> cls) {
        if (invokevirtual:boolean(Class<T>::isArray, cls:Class<?>)) {
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("[")), invokestatic:String(Native::getSignature, invokevirtual:Class<?>(Class<T>::getComponentType, cls:Class<?>)))))
        }
        
        if (invokevirtual:boolean(Class<T>::isPrimitive, cls:Class<?>)) {
            if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Void>(Void::TYPE))) {
                return:String(ldc:String("V"))
            }
            
            if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Boolean>(Boolean::TYPE))) {
                return:String(ldc:String("Z"))
            }
            
            if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Byte>(Byte::TYPE))) {
                return:String(ldc:String("B"))
            }
            
            if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Short>(Short::TYPE))) {
                return:String(ldc:String("S"))
            }
            
            if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Character>(Character::TYPE))) {
                return:String(ldc:String("C"))
            }
            
            if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Integer>(Integer::TYPE))) {
                return:String(ldc:String("I"))
            }
            
            if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Long>(Long::TYPE))) {
                return:String(ldc:String("J"))
            }
            
            if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Float>(Float::TYPE))) {
                return:String(ldc:String("F"))
            }
            
            if (cmpeq:boolean(cls:Class<?>, getstatic:Class<Double>(Double::TYPE))) {
                return:String(ldc:String("D"))
            }
        }
        
        return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("L")), invokestatic:String(Native::replace, ldc:String("."), ldc:String("/"), invokevirtual:String(Class<T>::getName, cls:Class<?>))), ldc:String(";"))))
    }
    
    public static java.lang.String replace(java.lang.String s1, java.lang.String s2, java.lang.String str) {
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
    
    private static int getConversion(java.lang.Class<?> type, com.sun.jna.TypeMapper mapper) {
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
    
    public static void register(java.lang.Class<?> cls, java.lang.String libName) {
        invokestatic:void(Native::register, cls:Class<?>, invokestatic:NativeLibrary(NativeLibrary::getInstance, libName:String, invokestatic:Map<String, ClassLoader>(Collections::singletonMap, ldc:String("classloader"), invokevirtual:ClassLoader(Class<T>::getClassLoader, cls:Class<?>))))
    }
    
    public static void register(java.lang.Class<?> cls, com.sun.jna.NativeLibrary lib) {
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
    
    private static java.util.Map<java.lang.String, java.lang.Object> cacheOptions(java.lang.Class<?> cls, java.util.Map<java.lang.String, ?> options, java.lang.Object proxy) {
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
    
    private static native long registerMethod(java.lang.Class<?> p0, java.lang.String p1, java.lang.String p2, int[] p3, long[] p4, long[] p5, int p6, long p7, long p8, java.lang.reflect.Method p9, long p10, int p11, boolean p12, com.sun.jna.ToNativeConverter[] p13, com.sun.jna.FromNativeConverter p14, java.lang.String p15);
    
    private static com.sun.jna.NativeMapped fromNative(java.lang.Class<?> cls, java.lang.Object value) {
        return:NativeMapped(checkcast:NativeMapped(com.sun.jna.NativeMapped.class, invokevirtual:Object[expected:NativeMapped](NativeMappedConverter::fromNative, invokestatic:NativeMappedConverter(NativeMappedConverter::getInstance, cls:Class<?>), value:Object, initobject:FromNativeContext(FromNativeContext::<init>, cls:Class<?>))))
    }
    
    private static com.sun.jna.NativeMapped fromNative(java.lang.reflect.Method m, java.lang.Object value) {
        var_4_08 : Class<?>
        
        var_4_08 = invokevirtual:Class<?>(Method::getReturnType, m:Method)
        return:NativeMapped(checkcast:NativeMapped(com.sun.jna.NativeMapped.class, invokevirtual:Object(NativeMappedConverter::fromNative, invokestatic:NativeMappedConverter(NativeMappedConverter::getInstance, var_4_08:Class<?>), value:Object, initobject:MethodResultContext(MethodResultContext::<init>, var_4_08:Class<?>, aconstnull:Function(), aconstnull:Object[](), m:Method))))
    }
    
    private static java.lang.Class<?> nativeType(java.lang.Class<?> cls) {
        return:Class<?>(invokevirtual:Class<?>(NativeMappedConverter::nativeType, invokestatic:NativeMappedConverter(NativeMappedConverter::getInstance, cls:Class<?>)))
    }
    
    private static java.lang.Object toNative(com.sun.jna.ToNativeConverter cvt, java.lang.Object o) {
        return:Object(invokeinterface:Object(ToNativeConverter::toNative, cvt:ToNativeConverter, o:Object, initobject:ToNativeContext(ToNativeContext::<init>)))
    }
    
    private static java.lang.Object fromNative(com.sun.jna.FromNativeConverter cvt, java.lang.Object o, java.lang.reflect.Method m) {
        return:Object(invokeinterface:Object(FromNativeConverter::fromNative, cvt:FromNativeConverter, o:Object, initobject:MethodResultContext[expected:FromNativeContext](MethodResultContext::<init>, invokevirtual:Class<?>(Method::getReturnType, m:Method), aconstnull:Function(), aconstnull:Object[](), m:Method)))
    }
    
    public static native long ffi_prep_cif(int p0, int p1, long p2, long p3);
    
    public static native void ffi_call(long p0, long p1, long p2, long p3);
    
    public static native long ffi_prep_closure(long p0, com.sun.jna.Native$ffi_callback p1);
    
    public static native void ffi_free_closure(long p0);
    
    public static native int initialize_ffi_type(long p0);
    
    public static void main(java.lang.String[] args) {
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
    
    public static synchronized native void freeNativeCallback(long p0);
    
    public static synchronized native long createNativeCallback(com.sun.jna.Callback p0, java.lang.reflect.Method p1, java.lang.Class<?>[] p2, java.lang.Class<?> p3, int p4, int p5, java.lang.String p6);
    
    public static native int invokeInt(com.sun.jna.Function p0, long p1, int p2, java.lang.Object[] p3);
    
    public static native long invokeLong(com.sun.jna.Function p0, long p1, int p2, java.lang.Object[] p3);
    
    public static native void invokeVoid(com.sun.jna.Function p0, long p1, int p2, java.lang.Object[] p3);
    
    public static native float invokeFloat(com.sun.jna.Function p0, long p1, int p2, java.lang.Object[] p3);
    
    public static native double invokeDouble(com.sun.jna.Function p0, long p1, int p2, java.lang.Object[] p3);
    
    public static native long invokePointer(com.sun.jna.Function p0, long p1, int p2, java.lang.Object[] p3);
    
    private static native void invokeStructure(com.sun.jna.Function p0, long p1, int p2, java.lang.Object[] p3, long p4, long p5);
    
    public static com.sun.jna.Structure invokeStructure(com.sun.jna.Function function, long fp, int callFlags, java.lang.Object[] args, com.sun.jna.Structure s) {
        invokestatic:void(Native::invokeStructure, function:Function, fp:long, callFlags:int, args:Object[], getfield:long(Pointer::peer, invokevirtual:Pointer(Structure::getPointer, s:Structure)), getfield:long(Pointer::peer, invokevirtual:Pointer(Structure::getTypeInfo, s:Structure)))
        return:Structure(s:Structure)
    }
    
    public static native java.lang.Object invokeObject(com.sun.jna.Function p0, long p1, int p2, java.lang.Object[] p3);
    
    public static long open(java.lang.String name) {
        return:long(invokestatic:long(Native::open, name:String, ldc:int(-1)))
    }
    
    public static native long open(java.lang.String p0, int p1);
    
    public static native void close(long p0);
    
    public static native long findSymbol(long p0, java.lang.String p1);
    
    public static native long indexOf(com.sun.jna.Pointer p0, long p1, long p2, byte p3);
    
    public static native void read(com.sun.jna.Pointer p0, long p1, long p2, byte[] p3, int p4, int p5);
    
    public static native void read(com.sun.jna.Pointer p0, long p1, long p2, short[] p3, int p4, int p5);
    
    public static native void read(com.sun.jna.Pointer p0, long p1, long p2, char[] p3, int p4, int p5);
    
    public static native void read(com.sun.jna.Pointer p0, long p1, long p2, int[] p3, int p4, int p5);
    
    public static native void read(com.sun.jna.Pointer p0, long p1, long p2, long[] p3, int p4, int p5);
    
    public static native void read(com.sun.jna.Pointer p0, long p1, long p2, float[] p3, int p4, int p5);
    
    public static native void read(com.sun.jna.Pointer p0, long p1, long p2, double[] p3, int p4, int p5);
    
    public static native void write(com.sun.jna.Pointer p0, long p1, long p2, byte[] p3, int p4, int p5);
    
    public static native void write(com.sun.jna.Pointer p0, long p1, long p2, short[] p3, int p4, int p5);
    
    public static native void write(com.sun.jna.Pointer p0, long p1, long p2, char[] p3, int p4, int p5);
    
    public static native void write(com.sun.jna.Pointer p0, long p1, long p2, int[] p3, int p4, int p5);
    
    public static native void write(com.sun.jna.Pointer p0, long p1, long p2, long[] p3, int p4, int p5);
    
    public static native void write(com.sun.jna.Pointer p0, long p1, long p2, float[] p3, int p4, int p5);
    
    public static native void write(com.sun.jna.Pointer p0, long p1, long p2, double[] p3, int p4, int p5);
    
    public static native byte getByte(com.sun.jna.Pointer p0, long p1, long p2);
    
    public static native char getChar(com.sun.jna.Pointer p0, long p1, long p2);
    
    public static native short getShort(com.sun.jna.Pointer p0, long p1, long p2);
    
    public static native int getInt(com.sun.jna.Pointer p0, long p1, long p2);
    
    public static native long getLong(com.sun.jna.Pointer p0, long p1, long p2);
    
    public static native float getFloat(com.sun.jna.Pointer p0, long p1, long p2);
    
    public static native double getDouble(com.sun.jna.Pointer p0, long p1, long p2);
    
    public static com.sun.jna.Pointer getPointer(long addr) {
        var_4_08 : long
        
        var_4_08 = invokestatic:long(Native::_getPointer, addr:long)
        return:Pointer(ternaryop:Pointer(cmpeq:boolean(var_4_08:long, ldc:long(0L)), aconstnull:Pointer(), initobject:Pointer(Pointer::<init>, var_4_08:long)))
    }
    
    private static native long _getPointer(long p0);
    
    public static native java.lang.String getWideString(com.sun.jna.Pointer p0, long p1, long p2);
    
    public static java.lang.String getString(com.sun.jna.Pointer pointer, long offset) {
        return:String(invokestatic:String(Native::getString, pointer:Pointer, offset:long, invokestatic:String(Native::getDefaultStringEncoding)))
    }
    
    public static java.lang.String getString(com.sun.jna.Pointer pointer, long offset, java.lang.String encoding) {
        var_6_0E : byte[]
        
        var_6_0E = invokestatic:byte[](Native::getStringBytes, pointer:Pointer, getfield:long(Pointer::peer, pointer:Pointer), offset:long)
        
        if (cmpne:boolean(encoding:String, aconstnull:String())) {
            try {
                return:String(initobject:String(String::<init>, var_6_0E:byte[], encoding:String))
            }
            catch (java.io.UnsupportedEncodingException stack_1F_0) {
            }
        }
        
        return:String(initobject:String(String::<init>, var_6_0E:byte[]))
    }
    
    public static native byte[] getStringBytes(com.sun.jna.Pointer p0, long p1, long p2);
    
    public static native void setMemory(com.sun.jna.Pointer p0, long p1, long p2, long p3, byte p4);
    
    public static native void setByte(com.sun.jna.Pointer p0, long p1, long p2, byte p3);
    
    public static native void setShort(com.sun.jna.Pointer p0, long p1, long p2, short p3);
    
    public static native void setChar(com.sun.jna.Pointer p0, long p1, long p2, char p3);
    
    public static native void setInt(com.sun.jna.Pointer p0, long p1, long p2, int p3);
    
    public static native void setLong(com.sun.jna.Pointer p0, long p1, long p2, long p3);
    
    public static native void setFloat(com.sun.jna.Pointer p0, long p1, long p2, float p3);
    
    public static native void setDouble(com.sun.jna.Pointer p0, long p1, long p2, double p3);
    
    public static native void setPointer(com.sun.jna.Pointer p0, long p1, long p2, long p3);
    
    public static native void setWideString(com.sun.jna.Pointer p0, long p1, long p2, java.lang.String p3);
    
    public static native java.nio.ByteBuffer getDirectByteBuffer(com.sun.jna.Pointer p0, long p1, long p2, long p3);
    
    public static native long malloc(long p0);
    
    public static native void free(long p0);
    
    public static native java.nio.ByteBuffer getDirectByteBuffer(long p0, long p1);
    
    public static void detach(boolean detach) {
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
    
    public static com.sun.jna.Pointer getTerminationFlag(java.lang.Thread t) {
        return:Pointer(checkcast:Pointer(com.sun.jna.Pointer.class, invokeinterface:Pointer(Map<Thread, Pointer>::get, getstatic:Map<Thread, Pointer>(Native::nativeThreads), t:Thread[expected:Object])))
    }
    
    private static native void setDetachState(boolean p0, long p1);
    
    public static void access$000() {
        invokestatic:void(Native::dispose)
    }
    
    static {
        var_2_5C : String
        
        putstatic:String(Native::DEFAULT_ENCODING, invokevirtual:String(Charset::name, invokestatic:Charset(Charset::defaultCharset)))
        putstatic:boolean(Native::DEBUG_LOAD, invokestatic:boolean(Boolean::getBoolean, ldc:String("jna.debug_load")))
        putstatic:boolean(Native::DEBUG_JNA_LOAD, invokestatic:boolean(Boolean::getBoolean, ldc:String("jna.debug_load.jna")))
        putstatic:String(Native::jnidispatchPath, aconstnull:String())
        putstatic:Map<Class<?>, Map<String, Object>>(Native::typeOptions, initobject:WeakHashMap<Class<?>, Map<String, Object>>[expected:Map<Class<?>, Map<String, Object>>](WeakHashMap<K, V>::<init>))
        putstatic:Map<Class<?>, Reference<?>>(Native::libraries, initobject:WeakHashMap<Class<?>, Reference<?>>[expected:Map<Class<?>, Reference<?>>](WeakHashMap<K, V>::<init>))
        putstatic:Callback$UncaughtExceptionHandler(Native::DEFAULT_HANDLER, initobject:Native$1[expected:Callback$UncaughtExceptionHandler](Native$1::<init>))
        putstatic:Callback$UncaughtExceptionHandler(Native::callbackExceptionHandler, getstatic:Callback$UncaughtExceptionHandler(Native::DEFAULT_HANDLER))
        invokestatic:void(Native::loadNativeDispatchLibrary)
        
        if (logicalnot:boolean(invokestatic:boolean(Native::isCompatibleVersion, ldc:String("5.1.0"), invokestatic:String(Native::getNativeVersion)))) {
            var_2_5C = invokestatic:String(System::getProperty, ldc:String("line.separator"))
            athrow(initobject:Error(Error::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_2_5C:String), var_2_5C:String), ldc:String("There is an incompatible JNA native library installed on this system")), var_2_5C:String), ldc:String("Expected: ")), ldc:String("5.1.0")), var_2_5C:String), ldc:String("Found:    ")), invokestatic:String(Native::getNativeVersion)), var_2_5C:String), ternaryop:String(cmpne:boolean(getstatic:String(Native::jnidispatchPath), aconstnull:String()), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("(at ")), getstatic:String(Native::jnidispatchPath)), ldc:String(")"))), invokestatic:String(System::getProperty, ldc:String("java.library.path")))), ldc:String(".")), var_2_5C:String), ldc:String("To resolve this issue you may do one of the following:")), var_2_5C:String), ldc:String(" - remove or uninstall the offending library")), var_2_5C:String), ldc:String(" - set the system property jna.nosys=true")), var_2_5C:String), ldc:String(" - set jna.boot.library.path to include the path to the version of the ")), var_2_5C:String), ldc:String("   jnidispatch library included with the JNA jar file you are using")), var_2_5C:String))))
        }
        
        putstatic:int(Native::POINTER_SIZE, invokestatic:int(Native::sizeof, ldc:int(0)))
        putstatic:int(Native::LONG_SIZE, invokestatic:int(Native::sizeof, ldc:int(1)))
        putstatic:int(Native::WCHAR_SIZE, invokestatic:int(Native::sizeof, ldc:int(2)))
        putstatic:int(Native::SIZE_T_SIZE, invokestatic:int(Native::sizeof, ldc:int(3)))
        putstatic:int(Native::BOOL_SIZE, invokestatic:int(Native::sizeof, ldc:int(4)))
        invokestatic:void(Native::initIDs)
        
        if (invokestatic:boolean(Boolean::getBoolean, ldc:String("jna.protected"))) {
            invokestatic:void(Native::setProtected, ldc:boolean(1))
        }
        
        putstatic:int(Native::MAX_ALIGNMENT, ternaryop:int(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(invokestatic:boolean(Platform::isSPARC), invokestatic:boolean(Platform::isWindows)), logicaland:boolean(invokestatic:boolean(Platform::isLinux), logicalor:boolean(invokestatic:boolean(Platform::isARM), invokestatic:boolean(Platform::isPPC)))), invokestatic:boolean(Platform::isAIX)), invokestatic:boolean(Platform::isAndroid)), ldc:int(8), getstatic:int(Native::LONG_SIZE)))
        putstatic:int(Native::MAX_PADDING, ternaryop:int(logicaland:boolean(invokestatic:boolean(Platform::isMac), invokestatic:boolean(Platform::isPPC)), ldc:int(8), getstatic:int(Native::MAX_ALIGNMENT)))
        invokestatic:String(System::setProperty, ldc:String("jna.loaded"), ldc:String("true"))
        putstatic:Object(Native::finalizer, initobject:Native$2[expected:Object](Native$2::<init>))
        putstatic:Map<Class<?>, long[]>(Native::registeredClasses, initobject:WeakHashMap<Class<?>, long[]>[expected:Map<Class<?>, long[]>](WeakHashMap<K, V>::<init>))
        putstatic:Map<Class<?>, NativeLibrary>(Native::registeredLibraries, initobject:WeakHashMap<Class<?>, NativeLibrary>[expected:Map<Class<?>, NativeLibrary>](WeakHashMap<K, V>::<init>))
        putstatic:ThreadLocal<Memory>(Native::nativeThreadTerminationFlag, initobject:Native$7[expected:ThreadLocal<Memory>](Native$7::<init>))
        putstatic:Map<Thread, Pointer>(Native::nativeThreads, invokestatic:Map<Thread, Pointer>(Collections::synchronizedMap, initobject:WeakHashMap<Thread, Pointer>[expected:Map<Thread, Pointer>](WeakHashMap<K, V>::<init>)))
    }
}
