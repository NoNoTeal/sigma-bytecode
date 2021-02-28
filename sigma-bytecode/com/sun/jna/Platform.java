public final class com.sun.jna.Platform {
    private void Platform() {
        invokespecial:Object(Object::<init>, this:Platform)
    }
    
    public static final int getOSType() {
        return:int(getstatic:int(Platform::osType))
    }
    
    public static final boolean isMac() {
        return:boolean(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(0)))
    }
    
    public static final boolean isAndroid() {
        return:boolean(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(8)))
    }
    
    public static final boolean isLinux() {
        return:boolean(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(1)))
    }
    
    public static final boolean isAIX() {
        return:boolean(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(7)))
    }
    
    public static final boolean isAix() {
        return:boolean(invokestatic:boolean(Platform::isAIX))
    }
    
    public static final boolean isWindowsCE() {
        return:boolean(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(6)))
    }
    
    public static final boolean isWindows() {
        return:boolean(logicalor:boolean(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(2)), cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(6))))
    }
    
    public static final boolean isSolaris() {
        return:boolean(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(3)))
    }
    
    public static final boolean isFreeBSD() {
        return:boolean(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(4)))
    }
    
    public static final boolean isOpenBSD() {
        return:boolean(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(5)))
    }
    
    public static final boolean isNetBSD() {
        return:boolean(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(11)))
    }
    
    public static final boolean isGNU() {
        return:boolean(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(9)))
    }
    
    public static final boolean iskFreeBSD() {
        return:boolean(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(10)))
    }
    
    public static final boolean isX11() {
        return:boolean(logicaland:boolean(logicalnot:boolean(invokestatic:boolean(Platform::isWindows)), logicalnot:boolean(invokestatic:boolean(Platform::isMac))))
    }
    
    public static final boolean hasRuntimeExec() {
        return:boolean(logicalor:boolean(logicalnot:boolean(invokestatic:boolean(Platform::isWindowsCE)), logicalnot:boolean(invokevirtual:boolean(String::equals, ldc:String("J9"), invokestatic:String[expected:Object](System::getProperty, ldc:String("java.vm.name"))))))
    }
    
    public static final boolean is64Bit() {
        var_2_0D : String
        
        var_2_0D = invokestatic:String(System::getProperty, ldc:String("sun.arch.data.model"), invokestatic:String(System::getProperty, ldc:String("com.ibm.vm.bitmode")))
        
        if (cmpne:boolean(var_2_0D:String, aconstnull:String())) {
            return:boolean(invokevirtual:boolean(String::equals, ldc:String("64"), var_2_0D:String[expected:Object]))
        }
        
        return:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(logicalor:boolean(invokevirtual:boolean(String::equals, ldc:String("x86-64"), getstatic:String[expected:Object](Platform::ARCH)), invokevirtual:boolean(String::equals, ldc:String("ia64"), getstatic:String[expected:Object](Platform::ARCH))), invokevirtual:boolean(String::equals, ldc:String("ppc64"), getstatic:String[expected:Object](Platform::ARCH))), invokevirtual:boolean(String::equals, ldc:String("ppc64le"), getstatic:String[expected:Object](Platform::ARCH))), invokevirtual:boolean(String::equals, ldc:String("sparcv9"), getstatic:String[expected:Object](Platform::ARCH))), invokevirtual:boolean(String::equals, ldc:String("amd64"), getstatic:String[expected:Object](Platform::ARCH))), cmpeq:boolean(getstatic:int(Native::POINTER_SIZE), ldc:int(8))))
    }
    
    public static final boolean isIntel() {
        return:boolean(invokevirtual:boolean(String::startsWith, getstatic:String(Platform::ARCH), ldc:String("x86")))
    }
    
    public static final boolean isPPC() {
        return:boolean(invokevirtual:boolean(String::startsWith, getstatic:String(Platform::ARCH), ldc:String("ppc")))
    }
    
    public static final boolean isARM() {
        return:boolean(invokevirtual:boolean(String::startsWith, getstatic:String(Platform::ARCH), ldc:String("arm")))
    }
    
    public static final boolean isSPARC() {
        return:boolean(invokevirtual:boolean(String::startsWith, getstatic:String(Platform::ARCH), ldc:String("sparc")))
    }
    
    public static java.lang.String getCanonicalArchitecture(java.lang.String arch, boolean softfloat) {
        arch = invokevirtual:String(String::trim, invokevirtual:String(String::toLowerCase, arch:String))
        
        if (invokevirtual:boolean(String::equals, ldc:String("powerpc"), arch:String[expected:Object])) {
            arch = ldc:String("ppc")
        }
        else {
            if (invokevirtual:boolean(String::equals, ldc:String("powerpc64"), arch:String[expected:Object])) {
                arch = ldc:String("ppc64")
            }
            else {
                if (logicalor:boolean(invokevirtual:boolean(String::equals, ldc:String("i386"), arch:String[expected:Object]), invokevirtual:boolean(String::equals, ldc:String("i686"), arch:String[expected:Object]))) {
                    arch = ldc:String("x86")
                }
                else {
                    if (logicalor:boolean(invokevirtual:boolean(String::equals, ldc:String("x86_64"), arch:String[expected:Object]), invokevirtual:boolean(String::equals, ldc:String("amd64"), arch:String[expected:Object]))) {
                        arch = ldc:String("x86-64")
                    }
                }
            }
        }
        
        if (logicaland:boolean(invokevirtual:boolean(String::equals, ldc:String("ppc64"), arch:String[expected:Object]), invokevirtual:boolean(String::equals, ldc:String("little"), invokestatic:String[expected:Object](System::getProperty, ldc:String("sun.cpu.endian"))))) {
            arch = ldc:String("ppc64le")
        }
        
        if (logicaland:boolean(invokevirtual:boolean(String::equals, ldc:String("arm"), arch:String[expected:Object]), softfloat:boolean)) {
            arch = ldc:String("armel")
        }
        
        return:String(arch:String)
    }
    
    private static boolean isSoftFloat() {
        var_2_1A : IOException
        
        try {
            return:boolean(invokevirtual:boolean(ELFAnalyser::isArmSoftFloat, invokestatic:ELFAnalyser(ELFAnalyser::analyse, invokevirtual:String(File::getCanonicalPath, initobject:File(File::<init>, ldc:String("/proc/self/exe"))))))
        }
        catch (java.io.IOException var_2_1A) {
            invokevirtual:void(Logger::log, invokestatic:Logger(Logger::getLogger, invokevirtual:String(Class<T>::getName, ldc:Class<Platform>(com.sun.jna.Platform.class))), getstatic:Level(Level::FINE), aconstnull:String(), var_2_1A:IOException[expected:Throwable])
            return:boolean(ldc:boolean(0))
        }
    }
    
    public static java.lang.String getNativeLibraryResourcePrefix() {
        var_2_08 : String
        
        var_2_08 = invokestatic:String(System::getProperty, ldc:String("jna.prefix"))
        
        if (cmpne:boolean(var_2_08:String, aconstnull:String())) {
            return:String(var_2_08:String)
        }
        
        return:String(invokestatic:String(Platform::getNativeLibraryResourcePrefix, invokestatic:int(Platform::getOSType), invokestatic:String(System::getProperty, ldc:String("os.arch")), invokestatic:String(System::getProperty, ldc:String("os.name"))))
    }
    
    public static java.lang.String getNativeLibraryResourcePrefix(int osType, java.lang.String arch, java.lang.String name) {
        return:String(invokestatic:String(Platform::getNativeLibraryResourcePrefix, osType:int, arch:String, name:String, invokestatic:boolean(Platform::isSoftFloat)))
    }
    
    public static java.lang.String getNativeLibraryResourcePrefix(int osType, java.lang.String arch, java.lang.String name, boolean isSoftfloat) {
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
    
    static {
        var_2_09 : String
        var_3_106 : boolean
        
        var_2_09 = invokestatic:String(System::getProperty, ldc:String("os.name"))
        
        if (invokevirtual:boolean(String::startsWith, var_2_09:String, ldc:String("Linux"))) {
            if (invokevirtual:boolean(String::equals, ldc:String("dalvik"), invokevirtual:String[expected:Object](String::toLowerCase, invokestatic:String(System::getProperty, ldc:String("java.vm.name"))))) {
                putstatic:int(Platform::osType, ldc:int(8))
                invokestatic:String(System::setProperty, ldc:String("jna.nounpack"), ldc:String("true"))
            }
            else {
                putstatic:int(Platform::osType, ldc:int(1))
            }
        }
        else {
            if (invokevirtual:boolean(String::startsWith, var_2_09:String, ldc:String("AIX"))) {
                putstatic:int(Platform::osType, ldc:int(7))
            }
            else {
                if (logicalor:boolean(invokevirtual:boolean(String::startsWith, var_2_09:String, ldc:String("Mac")), invokevirtual:boolean(String::startsWith, var_2_09:String, ldc:String("Darwin")))) {
                    putstatic:int(Platform::osType, ldc:int(0))
                }
                else {
                    if (invokevirtual:boolean(String::startsWith, var_2_09:String, ldc:String("Windows CE"))) {
                        putstatic:int(Platform::osType, ldc:int(6))
                    }
                    else {
                        if (invokevirtual:boolean(String::startsWith, var_2_09:String, ldc:String("Windows"))) {
                            putstatic:int(Platform::osType, ldc:int(2))
                        }
                        else {
                            if (logicalor:boolean(invokevirtual:boolean(String::startsWith, var_2_09:String, ldc:String("Solaris")), invokevirtual:boolean(String::startsWith, var_2_09:String, ldc:String("SunOS")))) {
                                putstatic:int(Platform::osType, ldc:int(3))
                            }
                            else {
                                if (invokevirtual:boolean(String::startsWith, var_2_09:String, ldc:String("FreeBSD"))) {
                                    putstatic:int(Platform::osType, ldc:int(4))
                                }
                                else {
                                    if (invokevirtual:boolean(String::startsWith, var_2_09:String, ldc:String("OpenBSD"))) {
                                        putstatic:int(Platform::osType, ldc:int(5))
                                    }
                                    else {
                                        if (invokevirtual:boolean(String::equalsIgnoreCase, var_2_09:String, ldc:String("gnu"))) {
                                            putstatic:int(Platform::osType, ldc:int(9))
                                        }
                                        else {
                                            if (invokevirtual:boolean(String::equalsIgnoreCase, var_2_09:String, ldc:String("gnu/kfreebsd"))) {
                                                putstatic:int(Platform::osType, ldc:int(10))
                                            }
                                            else {
                                                if (invokevirtual:boolean(String::equalsIgnoreCase, var_2_09:String, ldc:String("netbsd"))) {
                                                    putstatic:int(Platform::osType, ldc:int(11))
                                                }
                                                else {
                                                    putstatic:int(Platform::osType, ldc:int(-1))
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
        var_3_106 = ldc:boolean(0)
        
        try {
            invokestatic:Class<?>(Class<T>::forName, ldc:String("java.nio.Buffer"))
            var_3_106 = ldc:boolean(1)
        }
        catch (java.lang.ClassNotFoundException stack_113_0) {
        }
        
        putstatic:boolean(Platform::HAS_AWT, logicaland:boolean(logicaland:boolean(cmpne:boolean(getstatic:int(Platform::osType), ldc:int(6)), cmpne:boolean(getstatic:int(Platform::osType), ldc:int(8))), cmpne:boolean(getstatic:int(Platform::osType), ldc:int(7))))
        putstatic:boolean(Platform::HAS_JAWT, logicaland:boolean(getstatic:boolean(Platform::HAS_AWT), cmpne:boolean(getstatic:int(Platform::osType), ldc:int(0))))
        putstatic:boolean(Platform::HAS_BUFFERS, var_3_106:boolean)
        putstatic:boolean(Platform::RO_FIELDS, cmpne:boolean(getstatic:int(Platform::osType), ldc:int(6)))
        putstatic:String(Platform::C_LIBRARY_NAME, ternaryop:String(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(2)), ldc:String("msvcrt"), ternaryop:String(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(6)), ldc:String("coredll"), ldc:String("c"))))
        putstatic:String(Platform::MATH_LIBRARY_NAME, ternaryop:String(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(2)), ldc:String("msvcrt"), ternaryop:String(cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(6)), ldc:String("coredll"), ldc:String("m"))))
        putstatic:boolean(Platform::HAS_DLL_CALLBACKS, cmpeq:boolean(getstatic:int(Platform::osType), ldc:int(2)))
        putstatic:String(Platform::ARCH, invokestatic:String(Platform::getCanonicalArchitecture, invokestatic:String(System::getProperty, ldc:String("os.arch")), invokestatic:boolean(Platform::isSoftFloat)))
        putstatic:String(Platform::RESOURCE_PREFIX, invokestatic:String(Platform::getNativeLibraryResourcePrefix))
    }
}
