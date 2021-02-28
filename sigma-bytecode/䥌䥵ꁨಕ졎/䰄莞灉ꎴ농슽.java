public final class \u494c\u4975\ua068\u0c95\uc84e.\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd {
    public void \u4c04\u839e\u7049\ua3b4\ub18d\uc2bd(\ub113\uc4d2\u183a\u527a\u6435.\ub113\u1187\u4c04\u4cd9\u416d\u9255 p0, \u5d20\u7043\u88c5\u5db4\uf94d.\ubefe\u5654\u47c2\u34df\u6b0d\u385b p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u6bb9\ua068\u6c56\u071d\u946b\u36d3 p2, java.lang.String p3, java.lang.String p4) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public int \u16f6\u97e6\u51b2\u5245\u5d20\ub32d() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            return:int(invokestatic:int(\u97b7\u71ae\u8709\u5d20\u3776::\u52d3\u52d3\uc9f6\u3d64\uc31c\ud51e, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u071d\ub70c\u59ec\u624e\u527a\ube23() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(invokestatic:boolean(\u97b7\u71ae\u8709\u5d20\u3776::\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public static void \u99f7\u0a06\uc910\u8c8a\u36d3\uf995(java.util.function.BiConsumer<java.lang.Integer, java.lang.String> p0) {
        var_3_79 : MemoryStack
        var_4_7B : Throwable
        var_5_88 : PointerBuffer
        var_6_8F : int
        var_7_9B : long
        var_5_F9 : Throwable
        var_11_11C : Throwable
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            var_3_79 = invokestatic:MemoryStack(MemoryStack::stackPush)
            var_4_7B = aconstnull:Throwable()
            
            try {
                var_5_88 = invokevirtual:PointerBuffer(MemoryStack::mallocPointer, var_3_79:MemoryStack, and:int(ldc:int(1289), ldc:int(16517)))
                var_6_8F = invokestatic:int(GLFW::glfwGetError, var_5_88:PointerBuffer)
                
                if (cmpne:boolean(var_6_8F:int, ldc:int(0))) {
                    var_7_9B = invokevirtual:long(PointerBuffer::get, var_5_88:PointerBuffer)
                    invokeinterface:void(BiConsumer<Integer, String>::accept, p0:BiConsumer<Integer, String>, invokestatic:Integer(Integer::valueOf, var_6_8F:int), ternaryop:String(cmpeq:boolean(var_7_9B:long, ldc:long(0L)), loadelement:String(getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), and:int(ldc:int(-27443), ldc:int(19248))), invokestatic:String(MemoryUtil::memUTF8, var_7_9B:long)))
                }
            }
            catch (java.lang.Throwable var_5_F9) {
                var_4_7B = var_5_F9:Throwable
                athrow(var_5_F9:Throwable)
            }
            finally {
                if (cmpne:boolean(var_3_79:MemoryStack, aconstnull:MemoryStack())) {
                    if (cmpne:boolean(var_4_7B:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(MemoryStack::close, var_3_79:MemoryStack)
                        }
                        catch (java.lang.Throwable var_11_11C) {
                            invokevirtual:void(Throwable::addSuppressed, var_4_7B:Throwable, var_11_11C:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(MemoryStack::close, var_3_79:MemoryStack)
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\ucef1\u97e6\u74b1\u4179\u0a06(java.io.InputStream p0, java.io.InputStream p1) {
        var_3_85 : int
        var_5_89 : MemoryStack
        var_6_8C : Throwable
        var_7_D0 : IntBuffer
        var_8_DE : IntBuffer
        var_9_EC : IntBuffer
        var_10_FA : GLFWImage$Buffer
        var_11_107 : ByteBuffer
        var_12_17C : ByteBuffer
        var_7_238 : Throwable
        var_14_25D : Throwable
        var_5_280 : IOException
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_85 = and:int(ldc:int(-1250135757), ldc:int(-1185815376))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_85:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_85 = and:int(var_3_85:int, ldc:int(-245727434))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
                }
                
                try {
                    if (cmpeq:boolean(and:int(var_3_85:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_85 = and:int(var_3_85:int, ldc:int(-234957250))
                    var_5_89 = invokestatic:MemoryStack(MemoryStack::stackPush)
                    var_6_8C = aconstnull:Throwable()
                    
                    try {
                        if (cmpeq:boolean(p0:InputStream, aconstnull:InputStream())) {
                            athrow(initobject:FileNotFoundException(FileNotFoundException::<init>, loadelement:String(getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), and:int(ldc:int(17090), ldc:int(263)))))
                        }
                        
                        if (cmpeq:boolean(p1:InputStream, aconstnull:InputStream())) {
                            athrow(initobject:FileNotFoundException(FileNotFoundException::<init>, loadelement:String(getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), xor:int(ldc:int(19457), ldc:int(19458)))))
                        }
                        
                        var_7_D0 = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_5_89:MemoryStack, xor:int(ldc:int(4289), ldc:int(4288)))
                        var_8_DE = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_5_89:MemoryStack, and:int(ldc:int(2063), ldc:int(28769)))
                        var_9_EC = invokevirtual:IntBuffer(MemoryStack::mallocInt, var_5_89:MemoryStack, xor:int(ldc:int(17040), ldc:int(17041)))
                        var_10_FA = invokestatic:GLFWImage$Buffer(GLFWImage::mallocStack, xor:int(ldc:int(2561), ldc:int(2563)), var_5_89:MemoryStack)
                        var_11_107 = invokespecial:ByteBuffer(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u7c6b\u0a06\u5245\u2dcc\u416d\ub7dc, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, p0:InputStream, var_7_D0:IntBuffer, var_8_DE:IntBuffer, var_9_EC:IntBuffer)
                        
                        if (cmpeq:boolean(var_11_107:ByteBuffer, aconstnull:ByteBuffer())) {
                            athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), xor:int(ldc:int(527), ldc:int(523)))), invokestatic:String(STBImage::stbi_failure_reason)))))
                        }
                        
                        invokevirtual:CustomBuffer(GLFWImage$Buffer::position, var_10_FA:GLFWImage$Buffer, and:int(ldc:int(-22518), ldc:int(6116)))
                        invokevirtual:GLFWImage$Buffer(GLFWImage$Buffer::width, var_10_FA:GLFWImage$Buffer, invokevirtual:int(IntBuffer::get, var_7_D0:IntBuffer, and:int(ldc:int(-15788), ldc:int(7336))))
                        invokevirtual:GLFWImage$Buffer(GLFWImage$Buffer::height, var_10_FA:GLFWImage$Buffer, invokevirtual:int(IntBuffer::get, var_8_DE:IntBuffer, and:int(ldc:int(-15809), ldc:int(13760))))
                        invokevirtual:GLFWImage$Buffer(GLFWImage$Buffer::pixels, var_10_FA:GLFWImage$Buffer, var_11_107:ByteBuffer)
                        var_12_17C = invokespecial:ByteBuffer(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u7c6b\u0a06\u5245\u2dcc\u416d\ub7dc, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, p1:InputStream, var_7_D0:IntBuffer, var_8_DE:IntBuffer, var_9_EC:IntBuffer)
                        
                        if (cmpeq:boolean(var_12_17C:ByteBuffer, aconstnull:ByteBuffer())) {
                            athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), and:int(ldc:int(8724), ldc:int(4110)))), invokestatic:String(STBImage::stbi_failure_reason)))))
                        }
                        
                        invokevirtual:CustomBuffer(GLFWImage$Buffer::position, var_10_FA:GLFWImage$Buffer, and:int(ldc:int(20493), ldc:int(2819)))
                        invokevirtual:GLFWImage$Buffer(GLFWImage$Buffer::width, var_10_FA:GLFWImage$Buffer, invokevirtual:int(IntBuffer::get, var_7_D0:IntBuffer, and:int(ldc:int(14250), ldc:int(-32687))))
                        invokevirtual:GLFWImage$Buffer(GLFWImage$Buffer::height, var_10_FA:GLFWImage$Buffer, invokevirtual:int(IntBuffer::get, var_8_DE:IntBuffer, and:int(ldc:int(27044), ldc:int(-31159))))
                        invokevirtual:GLFWImage$Buffer(GLFWImage$Buffer::pixels, var_10_FA:GLFWImage$Buffer, var_12_17C:ByteBuffer)
                        invokevirtual:CustomBuffer(GLFWImage$Buffer::position, var_10_FA:GLFWImage$Buffer, and:int(ldc:int(-2955), ldc:int(2946)))
                        invokestatic:void(GLFW::glfwSetWindowIcon, getfield:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6435\u8d90\u960f\uf94d\u93a2\u0b8e, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), var_10_FA:GLFWImage$Buffer)
                        invokestatic:void(STBImage::stbi_image_free, var_11_107:ByteBuffer)
                        invokestatic:void(STBImage::stbi_image_free, var_12_17C:ByteBuffer)
                        looporswitchbreak()
                    }
                    catch (java.lang.Throwable var_7_238) {
                        var_6_8C = var_7_238:Throwable
                        athrow(var_7_238:Throwable)
                    }
                    finally {
                        if (cmpne:boolean(var_5_89:MemoryStack, aconstnull:MemoryStack())) {
                            if (cmpne:boolean(var_6_8C:Throwable, aconstnull:Throwable())) {
                                try {
                                    invokevirtual:void(MemoryStack::close, var_5_89:MemoryStack)
                                }
                                catch (java.lang.Throwable var_14_25D) {
                                    invokevirtual:void(Throwable::addSuppressed, var_6_8C:Throwable, var_14_25D:Throwable)
                                }
                            }
                            else {
                                invokevirtual:void(MemoryStack::close, var_5_89:MemoryStack)
                            }
                        }
                    }
                }
                catch (java.io.IOException var_5_280) {
                    invokeinterface:void(Logger::error, getstatic:Logger(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ud51e\u759a\u647c\u12b2\u99f7\u61a4), loadelement:String(getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), xor:int(ldc:int(17604), ldc:int(17601))), var_5_280:IOException[expected:Throwable])
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.nio.ByteBuffer \u7c6b\u0a06\u5245\u2dcc\u416d\ub7dc(java.io.InputStream p0, java.nio.IntBuffer p1, java.nio.IntBuffer p2, java.nio.IntBuffer p3) {
        var_5_74 : int
        var_5_98 : int
        var_7_9B : ByteBuffer
        var_5_C9 : int
        var_8_DB : ByteBuffer
        var_5_EC : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_74 = and:int(ldc:int(-1121088737), ldc:int(-1107440673))
            
            loop {
                if (cmpne:boolean(and:int(var_5_74:int, ldc:int(4)), ldc:int(0))) {
                    var_5_74 = and:int(var_5_74:int, ldc:int(1038063103))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
                }
                
                if (cmpne:boolean(and:int(var_5_74:int, ldc:int(65536)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_5_74 = and:int(var_5_74:int, ldc:int(-321927398))
            }
            
            var_5_98 = and:int(var_5_74:int, ldc:int(2100285214))
            var_7_9B = aconstnull:ByteBuffer()
            
            try {
                var_7_9B = invokestatic:ByteBuffer(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\u8709\u600f\ubefe\ub6ab\u0b8e\u6d99, p0:InputStream)
                
                do {
                    if (cmpeq:boolean(and:int(var_5_98:int, ldc:int(33554432)), ldc:int(0))) {
                        var_5_98 = and:int(var_5_98:int, ldc:int(1010552286))
                        invokevirtual:Buffer(Buffer::rewind, var_7_9B:ByteBuffer)
                    }
                } while (cmpeq:boolean(and:int(var_5_98:int, ldc:int(524288)), ldc:int(0)))
                
                var_5_C9 = and:int(var_5_98:int, ldc:int(-60162596))
                var_8_DB = invokestatic:ByteBuffer(STBImage::stbi_load_from_memory, var_7_9B:ByteBuffer, p1:IntBuffer, p2:IntBuffer, p3:IntBuffer, and:int(ldc:int(-2528), ldc:int(2206)))
                
                loop {
                    if (cmpeq:boolean(and:int(var_5_C9:int, ldc:int(4)), ldc:int(0))) {
                        var_5_EC = and:int(var_5_C9:int, ldc:int(-947685982))
                    }
                    else {
                        var_5_EC = and:int(var_5_C9:int, ldc:int(1029420124))
                        
                        if (cmpeq:boolean(var_7_9B:ByteBuffer, aconstnull:ByteBuffer())) {
                            return:ByteBuffer(var_8_DB:ByteBuffer)
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_5_EC:int, ldc:int(65536)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_5_C9 = and:int(var_5_EC:int, ldc:int(-658906449))
                }
                
                invokestatic:void(MemoryUtil::memFree, var_7_9B:ByteBuffer[expected:Buffer])
            }
            finally {
                if (cmpne:boolean(var_7_9B:ByteBuffer, aconstnull:ByteBuffer())) {
                    invokestatic:void(MemoryUtil::memFree, var_7_9B:ByteBuffer[expected:Buffer])
                }
            }
            
            return:ByteBuffer(var_8_DB:ByteBuffer)
        }
        
        goto(Label_0006)
    }
    
    public void \u647c\u983f\ud158\u7873\u516c\u8753(java.lang.String p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:String(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u516c\u61a4\uc31c\u3bd6\uae5d\u92ee, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, p0:String)
            
            if (invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), xor:int(ldc:int(8773), ldc:int(8771))))) {
                invokestatic:void(\uc910\uc2e8\u3e2a\u3bd6\u836c\uff55::\u836c\ub102\u6cfe\u7bad\u67e9\u8308)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u7c6b\u8350\u9255\u4f52\u527a\u92ff() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            invokestatic:GLFWErrorCallback(GLFW::glfwSetErrorCallback, invokedynamic:GLFWErrorCallbackI(invoke:()Lorg/lwjgl/glfw/GLFWErrorCallbackI;))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u7006\u71f1\ubf56\uae87\u9937\ub70c(int p0, long p1) {
        var_5_9B : String
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            var_5_9B = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), xor:int(ldc:int(10757), ldc:int(10754)))), p0:int), loadelement:String(getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), xor:int(ldc:int(2208), ldc:int(2216)))), invokestatic:String(MemoryUtil::memUTF8, p1:long)))
            invokestatic:boolean(TinyFileDialogs::tinyfd_messageBox, loadelement:String[expected:CharSequence](getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), xor:int(ldc:int(2438), ldc:int(2447))), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_5_9B:String), loadelement:String(getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), xor:int(ldc:int(8292), ldc:int(8302))))), loadelement:String[expected:CharSequence](getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), xor:int(ldc:int(794), ldc:int(785))), loadelement:String[expected:CharSequence](getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), and:int(ldc:int(17932), ldc:int(350))), and:int[expected:boolean](ldc:int(-8879), ldc:int(8366)))
            athrow(initobject:\u9937\u8c8a\u527a\u8413\u5654\u4179(\u9937\u8c8a\u527a\u8413\u5654\u4179::<init>, var_5_9B:String, aconstnull:\u7049\ua3b4\u3c25\u5db4\u7049\ub18d()))
        }
        
        goto(Label_0006)
    }
    
    public void \uc2e8\u8350\u839e\u71ae\u8350\u0a06(int p0, long p1) {
        var_6_71 : String
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            var_6_71 = invokestatic:String(MemoryUtil::memUTF8, p1:long)
            invokeinterface:void(Logger::error, getstatic:Logger(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ud51e\u759a\u647c\u12b2\u99f7\u61a4), loadelement:String(getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), and:int(ldc:int(3549), ldc:int(12813))))
            invokeinterface:void(Logger::error, getstatic:Logger(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ud51e\u759a\u647c\u12b2\u99f7\u61a4), loadelement:String(getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), xor:int(ldc:int(17036), ldc:int(17026))), getfield:String[expected:Object](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u516c\u61a4\uc31c\u3bd6\uae5d\u92ee, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
            invokeinterface:void(Logger::error, getstatic:Logger(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ud51e\u759a\u647c\u12b2\u99f7\u61a4), loadelement:String(getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), and:int(ldc:int(3599), ldc:int(24703))), invokestatic:Integer[expected:Object](Integer::valueOf, p0:int), var_6_71:String[expected:Object])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4f4a\uc7fe\u946b\ub171\u6bb9\u7c6b() {
        var_3_69 : GLFWErrorCallback
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_69 = invokestatic:GLFWErrorCallback(GLFW::glfwSetErrorCallback, getfield:GLFWErrorCallback[expected:GLFWErrorCallbackI](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3e75\uc2bd\u3c25\ucb79\ufcaf\u8753, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
            
            if (cmpne:boolean(var_3_69:GLFWErrorCallback, aconstnull:GLFWErrorCallback())) {
                invokevirtual:void(GLFWErrorCallback::free, var_3_69:GLFWErrorCallback)
            }
            
            invokestatic:void(\uc910\uc2e8\u3e2a\u3bd6\u836c\uff55::\ub18d\u759a\u3776\ub32d\ucb79\u40a9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u72f1\u8640\u8389\u873d\u4975\u8df4(boolean p0) {
        var_2_61 : int
        stack_94_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_61 = and:int(ldc:int(-1064965361), ldc:int(-507646503))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            
            if (logicalnot:boolean(putfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ubcb0\u5140\uc87f\u9a18\u4d85\uc29a, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, p0:boolean))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-199114801))
                stack_94_0 = and:int(ldc:int(-17586), ldc:int(17585))
            }
            else {
                stack_94_0 = and:int(ldc:int(195), ldc:int(22581))
            }
            
            invokestatic:void(GLFW::glfwSwapInterval, stack_94_0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void close() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            putfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ud4fe\u6198\u0800\u69d9\ua562\u516c, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, and:int[expected:boolean](ldc:int(3073), ldc:int(8205)))
            invokestatic:void(Callbacks::glfwFreeCallbacks, getfield:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6435\u8d90\u960f\uf94d\u93a2\u0b8e, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
            invokevirtual:void(GLFWErrorCallback::close, getfield:GLFWErrorCallback(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3e75\uc2bd\u3c25\ucb79\ufcaf\u8753, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
            invokestatic:void(GLFW::glfwDestroyWindow, getfield:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6435\u8d90\u960f\uf94d\u93a2\u0b8e, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
            invokestatic:void(GLFW::glfwTerminate)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uf94d\u759a\u6fb0\u62da\u6b5f\u3e2a(long p0, int p1, int p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8d90\uc3e3\u6b5f\u4f52\ub6ab\uafe7, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, p1:int)
            putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5db4\u12cb\uc238\u1833\u4f52\u74b1, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u2dcc\u34df\u156b\ube23\u527a\uc229(long p0, int p1, int p2) {
        var_5_63 : int
        var_7_7F : int
        var_8_85 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_63 = and:int(ldc:int(-1745279192), ldc:int(-230721832))
            
            if (cmpeq:boolean(p0:long, getfield:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6435\u8d90\u960f\uf94d\u93a2\u0b8e, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))) {
                var_7_7F = invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8c8a\ud51e\u071d\u59ec\u392e\u62da, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)
                var_8_85 = invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ucef1\u7c6b\u6d99\ud36e\u8bb0\u927d, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)
                
                if (cmpne:boolean(p1:int, ldc:int(0))) {
                    if (cmpne:boolean(p2:int, ldc:int(0))) {
                        putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5fe1\u67e9\ub7dc\u624e\u1833\u4492, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, p1:int)
                        putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u9a18\u7873\uc87f\u718f\u62da\u3776, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, p2:int)
                        
                        if (logicalor:boolean(cmpne:boolean(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8c8a\ud51e\u071d\u59ec\u392e\u62da, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), var_7_7F:int), cmpne:boolean(invokevirtual:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ucef1\u7c6b\u6d99\ud36e\u8bb0\u927d, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), var_8_85:int))) {
                            var_5_63 = and:int(var_5_63:int, ldc:int(-605342087))
                            invokeinterface:void(\ub113\u1187\u4c04\u4cd9\u416d\u9255::\ua6bd\u9a18\u88c5\u67d0\uc238\u0a06, getfield:\ub113\u1187\u4c04\u4cd9\u416d\u9255(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6c56\u946b\u4bc8\u4975\u36d3\ud7e8, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
                        }
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u5d20\uc2bd\u759a\u7bad\u6cfe\u4492() {
        var_3_73 : int[]
        var_4_7D : int[]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            var_3_73 = newarray:int[](int.class, and:int(ldc:int(22145), ldc:int(1)))
            var_4_7D = newarray:int[](int.class, and:int(ldc:int(1187), ldc:int(73)))
            invokestatic:void(GLFW::glfwGetFramebufferSize, getfield:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6435\u8d90\u960f\uf94d\u93a2\u0b8e, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), var_3_73:int[], var_4_7D:int[])
            putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5fe1\u67e9\ub7dc\u624e\u1833\u4492, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, loadelement:int(var_3_73:int[], and:int(ldc:int(8506), ldc:int(-14651))))
            putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u9a18\u7873\uc87f\u718f\u62da\u3776, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, loadelement:int(var_4_7D:int[], and:int(ldc:int(13740), ldc:int(-13743))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ua3b4\ubcb0\ua61f\u7006\u4f4a\u62da(long p0, int p1, int p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u88c5\uae5d\u6bb9\u12cb\u6bb9\ub83f, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, p1:int)
            putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u7c6b\u5bc4\u3d64\u5654\u12b2\u40a9, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, p2:int)
            invokevirtual:void(\ucfaf\ud217\u8df4\u52d3\u446c::\u120d\u183a\u1187\ubff1\u9af2\u0c95, invokevirtual:\ucfaf\ud217\u8df4\u52d3\u446c(\u6b0d\ua068\uc4d2\u5245\u4d85::\u16f6\u5fe1\uc3e3\u6d69\u4c2b, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u7d52\u7c6b\u6b5f\u4f52\u7873\uc9f6(long p0, boolean p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            
            if (cmpeq:boolean(p0:long, getfield:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6435\u8d90\u960f\uf94d\u93a2\u0b8e, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))) {
                invokeinterface:void(\ub113\u1187\u4c04\u4cd9\u416d\u9255::\u7bad\uc238\u416d\u4179\u9a18\u6198, getfield:\ub113\u1187\u4c04\u4cd9\u416d\u9255(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6c56\u946b\u4bc8\u4975\u36d3\ud7e8, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), p1:boolean)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4c2b\uc4d2\u873d\u4daf\ua562\u4492(long p0, boolean p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            
            if (p1:boolean) {
                invokeinterface:void(\ub113\u1187\u4c04\u4cd9\u416d\u9255::\u74b1\u99f7\uc7fe\u8c8a\u446c\u5654, getfield:\ub113\u1187\u4c04\u4cd9\u416d\u9255(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6c56\u946b\u4bc8\u4975\u36d3\ud7e8, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubf56\ub113\ud4fe\u7049\u3711\u8d90(int p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u494c\uf94d\u5654\uff55\u624e\u61a4, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u64ab\u9937\uc87f\u8d98\u36d3\u16f6() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u494c\uf94d\u5654\uff55\u624e\u61a4, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public void \u946b\u92ee\u4c2b\u8aa5\u56bd\u64ab() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\ua61f\u8bb0\uc29a\u7006\u6b0d\u392e, getfield:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6435\u8d90\u960f\uf94d\u93a2\u0b8e, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
            
            if (cmpne:boolean(getfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u071d\u156b\u12cb\u8d98\ubded\u071d, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), getfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3776\u416d\u0a06\u12b2\ub19c\u071d, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))) {
                putfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3776\u416d\u0a06\u12b2\ub19c\u071d, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, getfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u071d\u156b\u12cb\u8d98\ubded\u071d, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
                invokespecial:void(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u9033\u9af2\u647c\u965f\u6c52\ub18d, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, getfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ubcb0\u5140\uc87f\u9a18\u4d85\uc29a, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Optional<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae> \u5bc4\u74b1\u6bb9\u6bb9\u183a\u61a4() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Optional<\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae>(getfield:Optional<\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae>(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u624e\u4c04\ub7dc\u69d9\uc238\u36d3, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public void \uc2bd\u3e2a\u4c2b\u527a\ud12e\u9af2(java.util.Optional<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae> p0) {
        var_2_61 : int
        stack_8E_0 : int [generated]
        var_4_8E : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_61 = and:int(ldc:int(1905083404), ldc:int(2107517270))
            
            if (invokevirtual:boolean(Optional::equals, p0:Optional, getfield:Optional<\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae>[expected:Object](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u624e\u4c04\ub7dc\u69d9\uc238\u36d3, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1895769741))
                stack_8E_0 = and:int(ldc:int(21152), ldc:int(-21153))
            }
            else {
                stack_8E_0 = and:int(ldc:int(387), ldc:int(1033))
            }
            
            var_4_8E = stack_8E_0:int
            putfield:Optional<\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae>(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u624e\u4c04\ub7dc\u69d9\uc238\u36d3, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, p0:Optional<\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae>)
            
            if (cmpne:boolean(var_4_8E:int, ldc:int(0))) {
                putfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uf9c5\u6ec6\u624e\u6cfe\uc910\u6b5f, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, xor:int[expected:boolean](ldc:int(16664), ldc:int(16665)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8aa5\u6b0d\ud171\u3d4b\ub18d\u3d4b() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            
            if (getfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u071d\u156b\u12cb\u8d98\ubded\u071d, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)) {
                if (getfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uf9c5\u6ec6\u624e\u6cfe\uc910\u6b5f, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)) {
                    putfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uf9c5\u6ec6\u624e\u6cfe\uc910\u6b5f, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, and:int[expected:boolean](ldc:int(-9932), ldc:int(9418)))
                    invokespecial:void(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8cae\uc4d2\u3d4b\u98a4\u67e9\u7bad, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)
                    invokeinterface:void(\ub113\u1187\u4c04\u4cd9\u416d\u9255::\ua6bd\u9a18\u88c5\u67d0\uc238\u0a06, getfield:\ub113\u1187\u4c04\u4cd9\u416d\u9255(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6c56\u946b\u4bc8\u4975\u36d3\ud7e8, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u8cae\uc4d2\u3d4b\u98a4\u67e9\u7bad() {
        var_1_61 : int
        stack_97_0 : int [generated]
        var_1_96 : int
        var_3_97 : int
        var_4_ED : \u52d3\u34df\u4daf\u7af6\u873d\u7e3f
        var_1_F9 : int
        var_5_103 : \ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_61 = and:int(ldc:int(1889186518), ldc:int(1570340842))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
            
            if (cmpeq:boolean(invokestatic:long(GLFW::glfwGetWindowMonitor, getfield:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6435\u8d90\u960f\uf94d\u93a2\u0b8e, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)), ldc:long(0L))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-979763237))
                stack_97_0 = and:int(ldc:int(30740), ldc:int(-30999))
            }
            else {
                stack_97_0 = xor:int(ldc:int(132), ldc:int(133))
            }
            
            var_1_96 = and:int(var_1_61:int, ldc:int(1251637236))
            var_3_97 = stack_97_0:int
            
            if (logicalnot:boolean(getfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u071d\u156b\u12cb\u8d98\ubded\u071d, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))) {
                var_1_96 = and:int(var_1_96:int, ldc:int(-956334370))
                putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8d90\uc3e3\u6b5f\u4f52\ub6ab\uafe7, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u34df\u9937\ub7dc\ud217\u839e\u6fb0, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
                putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5db4\u12cb\uc238\u1833\u4f52\u74b1, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u0b8e\u3bc9\uf94d\ua61f\ud158\ucef1, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
                putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u88c5\uae5d\u6bb9\u12cb\u6bb9\ub83f, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u36d3\u6fb0\u0800\uf995\u7049\ua3b4, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
                putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u7c6b\u5bc4\u3d64\u5654\u12b2\u40a9, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ubff1\u4bc8\u97e6\u3c25\u647c\u7c6b, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
                invokestatic:void(GLFW::glfwSetWindowMonitor, getfield:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6435\u8d90\u960f\uf94d\u93a2\u0b8e, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), ldc:long(0L), getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8d90\uc3e3\u6b5f\u4f52\ub6ab\uafe7, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5db4\u12cb\uc238\u1833\u4f52\u74b1, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u88c5\uae5d\u6bb9\u12cb\u6bb9\ub83f, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u7c6b\u5bc4\u3d64\u5654\u12b2\u40a9, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), ldc:int(-1))
            }
            else {
                var_4_ED = invokevirtual:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f(\ubefe\u5654\u47c2\u34df\u6b0d\u385b::\u3711\uc31c\u98a4\u9937\u446c\ua3b4, getfield:\ubefe\u5654\u47c2\u34df\u6b0d\u385b(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u071d\uae87\ubcb0\u7006\u385b\u59ec, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)
                
                if (cmpne:boolean(var_4_ED:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f, aconstnull:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f())) {
                    var_1_F9 = and:int(var_1_96:int, ldc:int(1390099389))
                    var_5_103 = invokevirtual:\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae(\u52d3\u34df\u4daf\u7af6\u873d\u7e3f::\u12b2\u4c04\u6435\u6b0d\ud158\u3a62, var_4_ED:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f, getfield:Optional<\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae>(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u624e\u4c04\ub7dc\u69d9\uc238\u36d3, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
                    
                    if (cmpeq:boolean(var_3_97:int, ldc:int(0))) {
                        putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u34df\u9937\ub7dc\ud217\u839e\u6fb0, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8d90\uc3e3\u6b5f\u4f52\ub6ab\uafe7, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
                        putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u0b8e\u3bc9\uf94d\ua61f\ud158\ucef1, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5db4\u12cb\uc238\u1833\u4f52\u74b1, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
                        putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u36d3\u6fb0\u0800\uf995\u7049\ua3b4, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u88c5\uae5d\u6bb9\u12cb\u6bb9\ub83f, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
                        putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ubff1\u4bc8\u97e6\u3c25\u647c\u7c6b, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u7c6b\u5bc4\u3d64\u5654\u12b2\u40a9, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
                    }
                    
                    var_1_96 = and:int(var_1_F9:int, ldc:int(1828240034))
                    putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8d90\uc3e3\u6b5f\u4f52\ub6ab\uafe7, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, and:int(ldc:int(15186), ldc:int(-15199)))
                    putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5db4\u12cb\uc238\u1833\u4f52\u74b1, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, and:int(ldc:int(4523), ldc:int(-4528)))
                    putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u88c5\uae5d\u6bb9\u12cb\u6bb9\ub83f, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, invokevirtual:int(\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae::\u9033\u156b\u4f52\uc7fe\u4daf\u4975, var_5_103:\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae))
                    putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u7c6b\u5bc4\u3d64\u5654\u12b2\u40a9, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, invokevirtual:int(\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae::\u4d85\u3c25\uc29a\u6d99\u873d\u4e72, var_5_103:\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae))
                    invokestatic:void(GLFW::glfwSetWindowMonitor, getfield:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6435\u8d90\u960f\uf94d\u93a2\u0b8e, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), invokevirtual:long(\u52d3\u34df\u4daf\u7af6\u873d\u7e3f::\u5f50\u516c\ub19c\u8640\ud7e8\u9033, var_4_ED:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f), getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8d90\uc3e3\u6b5f\u4f52\ub6ab\uafe7, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5db4\u12cb\uc238\u1833\u4f52\u74b1, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u88c5\uae5d\u6bb9\u12cb\u6bb9\ub83f, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u7c6b\u5bc4\u3d64\u5654\u12b2\u40a9, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), invokevirtual:int(\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae::\u0c95\u5bc4\u718f\u6cfe\ud158\u6c52, var_5_103:\ub6ab\u4c2b\u6d69\u9a18\u6ec6\u8cae))
                }
                else {
                    invokeinterface:void(Logger::warn, getstatic:Logger(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ud51e\u759a\u647c\u12b2\u99f7\u61a4), loadelement:String(getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), xor:int(ldc:int(18474), ldc:int(18490))))
                    putfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u071d\u156b\u12cb\u8d98\ubded\u071d, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, and:int[expected:boolean](ldc:int(26276), ldc:int(-28327)))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9033\u9af2\u647c\u965f\u6c52\ub18d() {
        var_1_61 : int
        stack_8B_1 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_61 = and:int(ldc:int(-1673138117), ldc:int(-1396447169))
            
            if (getfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u071d\u156b\u12cb\u8d98\ubded\u071d, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1921390346))
                stack_8B_1 = and:int[expected:boolean](ldc:int(-26409), ldc:int(26408))
            }
            else {
                stack_8B_1 = xor:int[expected:boolean](ldc:int(1043), ldc:int(1042))
            }
            
            putfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u071d\u156b\u12cb\u8d98\ubded\u071d, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, stack_8B_1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u9033\u9af2\u647c\u965f\u6c52\ub18d(boolean p0) {
        var_2_229 : int
        var_4_222 : Exception
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_229 = and:int(ldc:int(-1141504327), ldc:int(1071877711))
            
            loop {
                Label_0098:
                
                if (cmpne:boolean(and:int(var_2_229:int, ldc:int(2)), ldc:int(0))) {
                    var_2_229 = and:int(var_2_229:int, ldc:int(1962304377))
                    goto(Label_0466)
                }
                
                if (cmpne:boolean(and:int(var_2_229:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_229 = and:int(var_2_229:int, ldc:int(-1667643710))
                    goto(Label_0380)
                }
                
                if (cmpne:boolean(and:int(var_2_229:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0320)
                }
                
                if (cmpeq:boolean(and:int(var_2_229:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0247)
                }
                
                if (cmpeq:boolean(and:int(var_2_229:int, ldc:int(1)), ldc:int(0))) {
                    var_2_229 = and:int(var_2_229:int, ldc:int(1790061426))
                    goto(Label_0179)
                }
                
                var_2_229 = and:int(var_2_229:int, ldc:int(937934675))
                invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
                
                try {
                    loop {
                        Label_0179:
                        
                        if (cmpeq:boolean(and:int(var_2_229:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0466)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_229:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0380)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_229:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_2_229 = and:int(var_2_229:int, ldc:int(-82278353))
                            goto(Label_0320)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_229:int, ldc:int(64)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_2_229:int, ldc:int(4194304)), ldc:int(0))) {
                                var_2_229 = and:int(var_2_229:int, ldc:int(1248544913))
                                loopcontinue(Label_0098)
                            }
                            
                            var_2_229 = and:int(var_2_229:int, ldc:int(-68762063))
                            invokespecial:void(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8cae\uc4d2\u3d4b\u98a4\u67e9\u7bad, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)
                        }
                        
                        Label_0247:
                        
                        if (cmpne:boolean(and:int(var_2_229:int, ldc:int(65536)), ldc:int(0))) {
                            var_2_229 = and:int(var_2_229:int, ldc:int(1178420852))
                            goto(Label_0466)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_229:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0380)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_229:int, ldc:int(2147483647)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_2_229:int, ldc:int(1)), ldc:int(0))) {
                                var_2_229 = and:int(var_2_229:int, ldc:int(-1985843070))
                                loopcontinue()
                            }
                            
                            if (cmpne:boolean(and:int(var_2_229:int, ldc:int(524288)), ldc:int(0))) {
                                loopcontinue(Label_0098)
                            }
                            
                            var_2_229 = and:int(var_2_229:int, ldc:int(-1216632963))
                            invokeinterface:void(\ub113\u1187\u4c04\u4cd9\u416d\u9255::\ua6bd\u9a18\u88c5\u67d0\uc238\u0a06, getfield:\ub113\u1187\u4c04\u4cd9\u416d\u9255(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6c56\u946b\u4bc8\u4975\u36d3\ud7e8, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
                        }
                        
                        Label_0320:
                        
                        if (cmpne:boolean(and:int(var_2_229:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0466)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_229:int, ldc:int(2147483647)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_2_229:int, ldc:int(16777216)), ldc:int(0))) {
                                goto(Label_0247)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_229:int, ldc:int(65536)), ldc:int(0))) {
                                var_2_229 = and:int(var_2_229:int, ldc:int(-631585576))
                                loopcontinue()
                            }
                            
                            if (cmpne:boolean(and:int(var_2_229:int, ldc:int(2)), ldc:int(0))) {
                                loopcontinue(Label_0098)
                            }
                            
                            var_2_229 = and:int(var_2_229:int, ldc:int(-201453813))
                            invokevirtual:void(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u72f1\u8640\u8389\u873d\u4975\u8df4, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, p0:boolean)
                        }
                        
                        Label_0380:
                        
                        if (cmpne:boolean(and:int(var_2_229:int, ldc:int(32768)), ldc:int(0))) {
                            var_2_229 = and:int(var_2_229:int, ldc:int(1253292278))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_2_229:int, ldc:int(536870912)), ldc:int(0))) {
                                var_2_229 = and:int(var_2_229:int, ldc:int(665102969))
                                goto(Label_0320)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_229:int, ldc:int(33554432)), ldc:int(0))) {
                                var_2_229 = and:int(var_2_229:int, ldc:int(-1148288571))
                                goto(Label_0247)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_229:int, ldc:int(64)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_229:int, ldc:int(536870912)), ldc:int(0))) {
                                var_2_229 = and:int(var_2_229:int, ldc:int(-1719553148))
                                loopcontinue(Label_0098)
                            }
                            
                            var_2_229 = and:int(var_2_229:int, ldc:int(2147153677))
                            invokevirtual:void(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u946b\u92ee\u4c2b\u8aa5\u56bd\u64ab, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)
                        }
                        
                        Label_0466:
                        
                        if (cmpne:boolean(and:int(var_2_229:int, ldc:int(67108864)), ldc:int(0))) {
                            var_2_229 = and:int(var_2_229:int, ldc:int(77111055))
                            goto(Label_0380)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_229:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0320)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_229:int, ldc:int(16777216)), ldc:int(0))) {
                            var_2_229 = and:int(var_2_229:int, ldc:int(1956131417))
                            goto(Label_0247)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_229:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        if (cmpne:boolean(and:int(var_2_229:int, ldc:int(32768)), ldc:int(0))) {
                            var_2_229 = and:int(var_2_229:int, ldc:int(1068764790))
                            loopcontinue(Label_0098)
                        }
                        
                        var_2_229 = and:int(var_2_229:int, ldc:int(-203219229))
                        looporswitchbreak()
                    }
                }
                catch (java.lang.Exception var_4_222) {
                    var_2_229 = and:int(var_2_229:int, ldc:int(1073730781))
                    invokeinterface:void(Logger::error, getstatic:Logger(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ud51e\u759a\u647c\u12b2\u99f7\u61a4), loadelement:String(getstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0), xor:int(ldc:int(8259), ldc:int(8274))), var_4_222:Exception[expected:Throwable])
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \uc3e3\uf995\u12b2\u760c\u6d69\uc31c(int p0, boolean p1) {
        var_3_78 : int
        var_5_69 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_78 = and:int(ldc:int(-1312028171), ldc:int(-570634833))
            var_5_69 = xor:int(ldc:int(90), ldc:int(91))
            
            loop {
                if (cmpne:boolean(and:int(var_3_78:int, ldc:int(67108864)), ldc:int(0))) {
                    var_3_78 = and:int(var_3_78:int, ldc:int(1444261718))
                }
                else {
                    var_3_78 = and:int(var_3_78:int, ldc:int(-4085435))
                    
                    if (cmpne:boolean(var_5_69:int, p0:int)) {
                        if (cmplt:boolean(var_5_69:int, getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5fe1\u67e9\ub7dc\u624e\u1833\u4492, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))) {
                            if (cmplt:boolean(var_5_69:int, getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u9a18\u7873\uc87f\u718f\u62da\u3776, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))) {
                                if (cmpge:boolean(div:int(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5fe1\u67e9\ub7dc\u624e\u1833\u4492, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), add:int(var_5_69:int, xor:int(ldc:int(5888), ldc:int(5889)))), and:int(ldc:int(15169), ldc:int(1378)))) {
                                    if (cmpge:boolean(div:int(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u9a18\u7873\uc87f\u718f\u62da\u3776, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), add:int(var_5_69:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), xor:int(ldc:int(4286), ldc:int(4174)))) {
                                        inc:int(var_5_69, ldc:int(1))
                                        loopcontinue()
                                    }
                                }
                            }
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_78:int, ldc:int(4194304)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_78 = and:int(var_3_78:int, ldc:int(-917738438))
            }
            
            if (p1:boolean) {
                if (cmpne:boolean(rem:int(var_5_69:int, and:int(ldc:int(458), ldc:int(4102))), ldc:int(0))) {
                    inc:int(var_5_69, ldc:int(1))
                }
            }
            
            return:int(var_5_69:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u4e72\u6b0d\u960f\u8709\u873d\u0b8e(double p0) {
        var_3_61 : int
        var_5_6F : int
        stack_9F_1 : int [generated]
        var_3_9E : int
        var_6_AA : int
        stack_DA_1 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_61 = and:int(ldc:int(1540701640), ldc:int(-879337528))
            putfield:double(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ucb79\u8d98\ua562\u5245\uf9c5\uc4d2, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, p0:double)
            var_5_6F = d2i:int(div:double(i2d:double(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5fe1\u67e9\ub7dc\u624e\u1833\u4492, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)), p0:double))
            
            if (cmple:boolean(div:double(i2d:double(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5fe1\u67e9\ub7dc\u624e\u1833\u4492, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)), p0:double), i2d:double(var_5_6F:int))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-290113603))
                stack_9F_1 = var_5_6F:int
            }
            else {
                stack_9F_1 = add:int(var_5_6F:int, xor:int(ldc:int(312), ldc:int(313)))
            }
            
            var_3_9E = and:int(var_3_61:int, ldc:int(-23838920))
            putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uf9c5\uc4d2\ud4fe\u4daf\uc31c\u5245, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, stack_9F_1:int)
            var_6_AA = d2i:int(div:double(i2d:double(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u9a18\u7873\uc87f\u718f\u62da\u3776, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)), p0:double))
            
            if (cmple:boolean(div:double(i2d:double(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u9a18\u7873\uc87f\u718f\u62da\u3776, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd)), p0:double), i2d:double(var_6_AA:int))) {
                var_3_9E = and:int(var_3_9E:int, ldc:int(-824836311))
                stack_DA_1 = var_6_AA:int
            }
            else {
                stack_DA_1 = add:int(var_6_AA:int, xor:int(ldc:int(544), ldc:int(545)))
            }
            
            putfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u7043\ud217\u7c6b\u7006\u7af6\u1833, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, stack_DA_1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0c95\u74b1\u4179\u516c\u7e3f\ubcb0(java.lang.String p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(GLFW::glfwSetWindowTitle, getfield:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6435\u8d90\u960f\uf94d\u93a2\u0b8e, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), p0:String[expected:CharSequence])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public long \u5fe1\u8308\ubb2b\u5245\ubefe\ud158() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:long(getfield:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6435\u8d90\u960f\uf94d\u93a2\u0b8e, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u40a9\uc910\u4f4a\u6d99\u8258\u7006() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(getfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u071d\u156b\u12cb\u8d98\ubded\u071d, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public int \u8c8a\ud51e\u071d\u59ec\u392e\u62da() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5fe1\u67e9\ub7dc\u624e\u1833\u4492, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public int \ucef1\u7c6b\u6d99\ud36e\u8bb0\u927d() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u9a18\u7873\uc87f\u718f\u62da\u3776, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public int \uc910\u0c95\u5d20\u6435\ucfaf\u836c() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u88c5\uae5d\u6bb9\u12cb\u6bb9\ub83f, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public int \uff55\ua068\ubcb0\u67e9\u56bd\u071d() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u7c6b\u5bc4\u3d64\u5654\u12b2\u40a9, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public int \uae87\ua562\uceb8\uc9f6\u600f\u74b1() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\uf9c5\uc4d2\ud4fe\u4daf\uc31c\u5245, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public int \u6c56\ud171\u3e75\u76bc\u99f7\u946b() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u7043\ud217\u7c6b\u7006\u7af6\u1833, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public int \u3d64\u8753\u56bd\uf995\u8640\u960f() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u8d90\uc3e3\u6b5f\u4f52\ub6ab\uafe7, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public int \ub7dc\u71ae\u6198\u64f2\u98a4\u8d90() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u5db4\u12cb\uc238\u1833\u4f52\u74b1, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public double \u600f\u6b0d\u8389\u8cae\u4179\u7049() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:double(getfield:double(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ucb79\u8d98\ua562\u5245\uf9c5\uc4d2, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u34df\u4daf\u7af6\u873d\u7e3f \uc238\u6435\u7e3f\ud171\u97e6\u5654() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f(invokevirtual:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f(\ubefe\u5654\u47c2\u34df\u6b0d\u385b::\u3711\uc31c\u98a4\u9937\u446c\ua3b4, getfield:\ubefe\u5654\u47c2\u34df\u6b0d\u385b(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u071d\uae87\ubcb0\u7006\u385b\u59ec, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    public void \u4daf\u5d20\u718f\u6ec6\uc84e\u3bc9(boolean p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokestatic:void(\ud217\u600f\u1833\u1187\ud36e\u9255::\ubded\ub32d\u3711\u6d99\u4492\u4cd9, getfield:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6435\u8d90\u960f\uf94d\u93a2\u0b8e, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u960f\uc910\u3dd3\ufe34\u5db4\u7d52(int p0, int p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:void(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u2dcc\u34df\u156b\ube23\u527a\uc229, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd, getfield:long(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u6435\u8d90\u960f\uf94d\u93a2\u0b8e, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), p0:int, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u0800\ubefe\u6c56\ucef1\u6c52\ubf56() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(getfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ud4fe\u6198\u0800\u69d9\ua562\u516c, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    private long lambda$\u6d99\u3e75\uc29a\ub19c\uf9c5\ud4fe$3(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u52d3\u34df\u4daf\u7af6\u873d\u7e3f p0) {
        var_2_61 : int
        stack_8C_0 : long [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_2_61 = and:int(ldc:int(-1216268101), ldc:int(-174622295))
            
            if (logicaland:boolean(getfield:boolean(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u071d\u156b\u12cb\u8d98\ubded\u071d, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd), cmpne:boolean(p0:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f, aconstnull:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f()))) {
                stack_8C_0 = invokevirtual:long(\u52d3\u34df\u4daf\u7af6\u873d\u7e3f::\u5f50\u516c\ub19c\u8640\ud7e8\u9033, p0:\u52d3\u34df\u4daf\u7af6\u873d\u7e3f)
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(1036730074))
                stack_8C_0 = ldc:long(0L)
            }
            
            return:long(stack_8C_0:long)
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\ubefe\u927d\u67d0\ub1b9\ub70c\u5d20$2(java.lang.String p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:String(p0:String)
        }
        
        goto(Label_0006)
    }
    
    private int lambda$\u927d\u61a4\ud36e\ua562\u3504\u0a06$1() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u7c6b\u5bc4\u3d64\u5654\u12b2\u40a9, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    private int lambda$\ub18d\u4daf\u92ee\ud51e\u4975\uc2e8$0() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(getfield:int(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u88c5\uae5d\u6bb9\u12cb\u6bb9\ub83f, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_37D_0 : byte[] [generated]
        stack_3CB_0 : byte[] [generated]
        stack_450_0 : byte[] [generated]
        stack_4A4_0 : byte[] [generated]
        var_4_356 : int
        var_3_35B : byte[]
        var_5_35C : int
        var_0_3C1 : int
        expr_3CB : byte [generated]
        stack_40B_2 : byte [generated]
        stack_3E8_0 : byte [generated]
        expr_450 : byte [generated]
        expr_9E : int [generated]
        expr_D7 : int [generated]
        var_2_10E : byte[]
        expr_112 : int [generated]
        var_3_492 : byte[]
        var_5_493 : int
        var_3_14B : String
        stack_349_0 : String[] [generated]
        expr_15D : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_0_61 = and:int(ldc:int(-1325243371), ldc:int(-1138039238))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D5_0 = stack_D7_0 = stack_10E_0 = stack_110_0 = stack_13F_0 = stack_37D_0 = stack_3CB_0 = stack_450_0 = stack_4A4_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("2FdXV1dXV1dXNrpNIyRQLdZH39/YV1dXV1dXV1fd27WauNLSrkgtjNhWSCGP0tZ+roLfdC8x2K5IrIB/U4l31DJRr0itN1AqqVVVTU4yMdZ/JLbdRii+yai1UdIuKqlVdSSx300vM16sqtYo0Naq1SlI9NUgsKqnNcZboKDV/qGM30ovs9/S8SYK2arMzLA8L6DV3kgpqiM32vckMtmq3FE4oNXeSCmqI7ff0VMpdaEI0qrSK9PWqNHb1yEpLFVzJI/+rTPcq/SgD9JS1lNeLMihjN/XVKqqdi+x300vsdKq0ivT1qjRyyQ339JC2SrW3LS/UC3Wd981LNdV0i1WUdCspvGuj1FeViApRVa5XlYgKVVfqC3WV1TQqixIKLNRqtxO2DMr9FY2tFfT1VWqLEgos1Gq3E7ZMSr3VDW2V9Moqa1P9gkI5Uy8")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_356 = expr_6E:int
        var_3_35B = newarray:byte[](byte.class, expr_6E:int)
        var_5_35C = expr_6E:int
        Label_0862:
        
        while (cmpeq:boolean(and:int(var_0_61:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_61:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0940)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(-160793453))
            var_5_35C = add:int(var_5_35C:int, ldc:int(-1))
            storeelement:byte(var_3_35B:byte[], var_5_35C:int, xor:byte(loadelement:byte(stack_37D_0:byte[], var_5_35C:int), ldc:byte(87)))
            
            if (cmpne:boolean(var_5_35C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_10E_0 = stack_110_0 = stack_13F_0 = stack_37D_0 = stack_3CB_0 = stack_450_0 = stack_4A4_0 = var_3_35B:byte[]
            goto(Label_0115)
        }
        
        goto(Label_1073)
        Label_0940:
        
        while (cmpne:boolean(and:int(var_0_61:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_61:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0862)
            }
            
            var_0_3C1 = and:int(var_0_61:int, ldc:int(-223627047))
            var_5_35C = add:int(var_5_35C:int, ldc:int(-1))
            expr_3CB = stack_40B_2 = loadelement(stack_3CB_0, var_5_35C)
            
            if (cmplt:boolean(add:int(add:int(var_5_35C:int, ldc:int(2)), neg:int(var_4_356:int)), ldc:int(0))) {
                stack_40B_2 = stack_3E8_0 = add:byte(expr_3CB:byte, loadelement:byte(var_3_35B:byte[], add:int(var_5_35C:int, ldc:int(2))))
                goto(Label_1016)
            }
            
            Label_0984:
            
            if (cmpeq:boolean(and:int(var_0_3C1:int, ldc:int(2)), ldc:int(0))) {
                var_0_3C1 = and:int(var_0_3C1:int, ldc:int(-244106473))
                stack_40B_2 = stack_3E8_0 = add:byte(expr_3CB:byte, ldc:byte(2))
            }
            
            Label_1016:
            
            if (cmpne:boolean(and:int(var_0_3C1:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0984)
            }
            
            var_0_61 = and:int(var_0_3C1:int, ldc:int(-18390348))
            storeelement:byte(var_3_35B:byte[], var_5_35C:int, stack_40B_2:byte)
            
            if (cmpne:boolean(var_5_35C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_10E_0 = stack_110_0 = stack_13F_0 = stack_37D_0 = stack_3CB_0 = stack_450_0 = stack_4A4_0 = var_3_35B:byte[]
            goto(Label_0163)
        }
        
        Label_1073:
        
        while (cmpne:boolean(and:int(var_0_61:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0862)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(-1219024521))
            var_5_35C = add:int(var_5_35C:int, ldc:int(-1))
            expr_450 = loadelement:byte(stack_450_0:byte[], var_5_35C:int)
            storeelement:byte(var_3_35B:byte[], var_5_35C:int, add:int(or:int(and:int(shl:int(expr_450:byte, and:int(ldc:int(10244), ldc:int(20484))), ldc:int(-16)), and:int(shr:int(expr_450:byte[expected:int], xor:int(ldc:int(-32231), ldc:int(-32227))), ldc:int(15))), ldc:int(10)))
            
            if (cmpne:boolean(var_5_35C:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_10E_0 = stack_110_0 = stack_13F_0 = stack_37D_0 = stack_3CB_0 = stack_450_0 = stack_4A4_0 = var_3_35B:byte[]
            goto(Label_0220)
        }
        
        goto(Label_0940)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0279)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(-540869843))
        }
        else {
            var_0_61 = and:int(var_0_61:int, ldc:int(-87657764))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_356 = expr_9E:int
                var_3_35B = newarray:byte[](byte.class, expr_9E:int)
                var_5_35C = expr_9E:int
                goto(Label_0940)
            }
        }
        
        Label_0163:
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(2040695093))
        }
        else {
            if (cmpne:boolean(and:int(var_0_61:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_61 = and:int(var_0_61:int, ldc:int(-1882256285))
                goto(Label_0115)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(-1121033126))
            expr_D7 = arraylength:int(stack_D7_0:byte[])
            
            if (cmpne:boolean(expr_D7:int, ldc:int(0))) {
                var_4_356 = expr_D7:int
                var_3_35B = newarray:byte[](byte.class, expr_D7:int)
                var_5_35C = expr_D7:int
                goto(Label_1073)
            }
        }
        
        Label_0220:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(262144)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(1947881071))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_61 = and:int(var_0_61:int, ldc:int(-240393688))
                goto(Label_0163)
            }
            
            if (cmpne:boolean(and:int(var_0_61:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_61 = and:int(var_0_61:int, ldc:int(-167545552))
            var_2_10E = stack_10E_0:byte[]
            expr_112 = add:int(arraylength:int(stack_110_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                var_3_492 = newarray:byte[](byte.class, expr_112:int)
                var_5_493 = expr_112:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-1082722891))
                    var_5_493 = add:int(var_5_493:int, ldc:int(-1))
                    storeelement:byte(var_3_492:byte[], var_5_493:int, add:int(shl:int(loadelement:byte(stack_4A4_0:byte[], var_5_493:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_10E:byte[], add:int(var_5_493:int, xor:int(ldc:int(89), ldc:int(88)))), ldc:int(3)), xor:int(ldc:int(175), ldc:int(176)))))
                    
                    if (cmpne:boolean(var_5_493:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_10E_0 = stack_110_0 = stack_13F_0 = stack_37D_0 = stack_3CB_0 = stack_450_0 = stack_4A4_0 = var_3_492:byte[]
            }
        }
        
        Label_0279:
        
        if (cmpne:boolean(and:int(var_0_61:int, ldc:int(8)), ldc:int(0))) {
            var_0_61 = and:int(var_0_61:int, ldc:int(792789283))
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_349_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(29463), ldc:int(2138)))
            expr_15D = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(5), ldc:int(23)))
            storeelement:String(expr_15D:String[], and:int(ldc:int(-21413), ldc:int(5028)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(-5519), ldc:int(5260)), and:int(ldc:int(6730), ldc:int(-6731))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(4269), ldc:int(4256)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(2383), ldc:int(-10592)), xor:int(ldc:int(4168), ldc:int(4182))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(9231), ldc:int(2186)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(18591), ldc:int(30)), and:int(ldc:int(8565), ldc:int(2173))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(30), ldc:int(22)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-11955), ldc:int(-11976)), xor:int(ldc:int(16506), ldc:int(16397))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(270), ldc:int(2815)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-32619), ldc:int(-32542)), and:int(ldc:int(635), ldc:int(13691))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(69), ldc:int(6174)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(11259), ldc:int(16507)), and:int(ldc:int(2452), ldc:int(9914))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(161), ldc:int(164)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(14832), ldc:int(16528)), and:int(ldc:int(161), ldc:int(24749))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(137), ldc:int(152)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(6295), ldc:int(6198)), and:int(ldc:int(16571), ldc:int(5823))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(-31736), ldc:int(-31720)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(447), ldc:int(18171)), xor:int(ldc:int(16614), ldc:int(16392))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(19151), ldc:int(8215)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(6126), ldc:int(24830)), xor:int(ldc:int(17026), ldc:int(17019))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(15), ldc:int(6537)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(18491), ldc:int(18626)), xor:int(ldc:int(2185), ldc:int(2443))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(5767), ldc:int(10537)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-32709), ldc:int(-32455)), and:int(ldc:int(4527), ldc:int(861))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(134), ldc:int(2094)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-31703), ldc:int(-31452)), and:int(ldc:int(2452), ldc:int(16660))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(-7161), ldc:int(-7157)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(154), ldc:int(398)), xor:int(ldc:int(624), ldc:int(873))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(18448), ldc:int(18450)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(3965), ldc:int(16793)), and:int(ldc:int(317), ldc:int(24877))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(16523), ldc:int(10803)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-32554), ldc:int(-32261)), and:int(ldc:int(16881), ldc:int(1869))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(16618), ldc:int(16609)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(27995), ldc:int(865)), xor:int(ldc:int(-31392), ldc:int(-31709))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(20543), ldc:int(8335)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(-21321), ldc:int(-21004)), and:int(ldc:int(4441), ldc:int(26989))))
            putstatic:String[](\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\u3504\u8640\ud36e\u8350\u6d69\u8bb0, expr_15D:String[])
            putstatic:Logger(\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd::\ud51e\u759a\u647c\u12b2\u99f7\u61a4, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u4c2b\u8413\u6c56\u1187\u8709\u3e75(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_67D : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_672 = and:int(ldc:int(-353414752), ldc:int(-2084610583))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4c04\u839e\u7049\ua3b4\ub18d\uc2bd[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(-1314014941))
        }
        else {
            var_3_672 = and:int(var_3_672:int, ldc:int(-51481542))
            var_5_8A = and:int(ldc:int(-32550), ldc:int(30465))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1671), ldc:int(-9960)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_672:int, ldc:int(-1930561540))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(8513), ldc:int(3125)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(16536), ldc:int(16537)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_E3:int, ldc:int(-995856032))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(161), ldc:int(20803)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(91038248))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(340254417))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1068388434))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2104648184))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2114998108))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1814099362))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(278923296))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(775790557))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(143305508))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-441699230))
                        var_11_F4 = and:int(ldc:int(-4570), ldc:int(4569))
                        goto(Label_1544)
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-920193875))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(605996400))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1486121936))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-911341613))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1558468280))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1143735788))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1950061568))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2137876969))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(832477158))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-353904400))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(999049435))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(568127041))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1279867296))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1139702487))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1790705057))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2031757897))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(18952), ldc:int(18953))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-423975475))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1849198409))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1433360189))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1253522687))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1755912209))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1019345017))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1058578949))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1044991759))
                        var_11_F4 = and:int(ldc:int(-6311), ldc:int(6310))
                    }
                    
                    Label_1164:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(58082190))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-246819949))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1836882881))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-2110245617))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-754351216))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(385700602))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1298:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1205660783))
                            goto(Label_1164)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1986061730))
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1526034943))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1544)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1416:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1177113462))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1306232847))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1937394045))
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(1911878140))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(446237299))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1595206638))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1908152872))
                        var_17_67D = add:int(var_16_122:int, and:int(ldc:int(2305), ldc:int(8209)))
                        looporswitchbreak()
                    }
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(-1146316759))
                
                if (cmple:boolean(var_5_8A = var_17_67D:int, sub:int(var_6_91:int, and:int(ldc:int(4101), ldc:int(1963))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(993364046))
            goto(Label_0108)
        }
    }
}
