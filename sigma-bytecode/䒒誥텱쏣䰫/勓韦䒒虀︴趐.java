public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u52d3\u97e6\u4492\u8640\ufe34\u8d90 {
    public void \u52d3\u97e6\u4492\u8640\ufe34\u8d90() {
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
            invokespecial:Object(Object::<init>, this:\u52d3\u97e6\u4492\u8640\ufe34\u8d90)
            putfield:ByteBuffer(\u52d3\u97e6\u4492\u8640\ufe34\u8d90::\ua068\u071d\u67d0\u3a62\ucef1\u983f, this:\u52d3\u97e6\u4492\u8640\ufe34\u8d90, invokestatic:ByteBuffer(BufferUtils::createByteBuffer, xor:int(ldc:int(-25570), ldc:int(-17378))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \ucb79\ub171\u59ec\u6bb9\uc4d2\uc84e(long p0, org.lwjgl.glfw.GLFWErrorCallbackI p1) {
        var_6_67 : GLFWErrorCallback
        var_7_6D : String
        var_7_92 : String
        var_8_99 : GLFWErrorCallback
        
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
            var_6_67 = invokestatic:GLFWErrorCallback(GLFW::glfwSetErrorCallback, p1:GLFWErrorCallbackI)
            var_7_6D = invokestatic:String(GLFW::glfwGetClipboardString, p0:long)
            var_7_92 = ternaryop:String(cmpeq:boolean(var_7_6D:String, aconstnull:String()), loadelement:String(getstatic:String[](\u52d3\u97e6\u4492\u8640\ufe34\u8d90::\u385b\u51fa\ube23\ub18d\u92ee\u494c), and:int(ldc:int(-31482), ldc:int(23129))), invokestatic:String(TextProcessing::func_238338_a_, var_7_6D:String))
            var_8_99 = invokestatic:GLFWErrorCallback(GLFW::glfwSetErrorCallback, var_6_67:GLFWErrorCallbackI)
            
            if (cmpne:boolean(var_8_99:GLFWErrorCallback, aconstnull:GLFWErrorCallback())) {
                invokevirtual:void(GLFWErrorCallback::free, var_8_99:GLFWErrorCallback)
            }
            
            return:String(var_7_92:String)
        }
        
        goto(Label_0006)
    }
    
    private static void \ucfaf\u7006\u6d99\uc29a\u92ff\u69d9(long p0, java.nio.ByteBuffer p1, byte[] p2) {
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
            invokevirtual:Buffer(Buffer::clear, p1:ByteBuffer[expected:Buffer])
            invokevirtual:ByteBuffer(ByteBuffer::put, p1:ByteBuffer, p2:byte[])
            invokevirtual:ByteBuffer(ByteBuffer::put, p1:ByteBuffer, and:int[expected:byte](ldc:int(9682), ldc:int(-9683)))
            invokevirtual:Buffer(Buffer::flip, p1:ByteBuffer[expected:Buffer])
            invokestatic:void(GLFW::glfwSetClipboardString, p0:long, p1:ByteBuffer)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ufcaf\u965f\u9af2\u9255\u51fa\ud7e8(long p0, java.lang.String p1) {
        var_4_68 : int
        var_6_71 : byte[]
        var_4_C1 : int
        var_7_85 : int
        var_4_19A : int
        var_8_120 : ByteBuffer
        
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
            var_4_68 = and:int(and:int(ldc:int(-391145259), ldc:int(-1430801574)), ldc:int(-1150305323))
            var_6_71 = invokevirtual:byte[](String::getBytes, p1:String, getstatic:Charset(Charsets::UTF_8))
            var_4_C1 = and:int(var_4_68:int, ldc:int(-1200098475))
            var_7_85 = add:int(arraylength:int(var_6_71:byte[]), and:int(ldc:int(4361), ldc:int(517)))
            
            loop {
                if (cmpeq:boolean(and:int(var_4_C1:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0223)
                }
                
                if (cmpeq:boolean(and:int(var_4_C1:int, ldc:int(64)), ldc:int(0))) {
                    var_4_19A = and:int(var_4_C1:int, ldc:int(790223303))
                }
                else {
                    var_4_19A = and:int(var_4_C1:int, ldc:int(-1321217311))
                    
                    if (cmpge:boolean(var_7_85:int, invokevirtual:int(Buffer::capacity, getfield:ByteBuffer[expected:Buffer](\u52d3\u97e6\u4492\u8640\ufe34\u8d90::\ua068\u071d\u67d0\u3a62\ucef1\u983f, this:\u52d3\u97e6\u4492\u8640\ufe34\u8d90)))) {
                        var_8_120 = invokestatic:ByteBuffer(MemoryUtil::memAlloc, var_7_85:int)
                        
                        try {
                            loop {
                                if (cmpne:boolean(and:int(var_4_19A:int, ldc:int(268435456)), ldc:int(0))) {
                                    goto(Label_0369)
                                }
                                
                                if (cmpeq:boolean(and:int(var_4_19A:int, ldc:int(16384)), ldc:int(0))) {
                                    var_4_19A = and:int(var_4_19A:int, ldc:int(-306227100))
                                    invokestatic:void(\u52d3\u97e6\u4492\u8640\ufe34\u8d90::\ucfaf\u7006\u6d99\uc29a\u92ff\u69d9, p0:long, var_8_120:ByteBuffer, var_6_71:byte[])
                                }
                                
                                Label_0321:
                                
                                if (cmpeq:boolean(and:int(var_4_19A:int, ldc:int(131072)), ldc:int(0))) {
                                    var_4_19A = and:int(var_4_19A:int, ldc:int(633215386))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_4_19A:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_4_19A = and:int(var_4_19A:int, ldc:int(1765364932))
                                        loopcontinue()
                                    }
                                    
                                    var_4_19A = and:int(var_4_19A:int, ldc:int(-1603292810))
                                    invokestatic:void(MemoryUtil::memFree, var_8_120:ByteBuffer[expected:Buffer])
                                }
                                
                                Label_0369:
                                
                                if (cmpne:boolean(and:int(var_4_19A:int, ldc:int(268435456)), ldc:int(0))) {
                                    var_4_19A = and:int(var_4_19A:int, ldc:int(148585926))
                                    goto(Label_0321)
                                }
                                
                                if (cmpne:boolean(and:int(var_4_19A:int, ldc:int(2097152)), ldc:int(0))) {
                                    looporswitchbreak()
                                }
                                
                                var_4_19A = and:int(var_4_19A:int, ldc:int(1503628439))
                            }
                            
                            var_4_19A = and:int(var_4_19A:int, ldc:int(-277406142))
                        }
                        finally {
                            invokestatic:void(MemoryUtil::memFree, var_8_120:ByteBuffer[expected:Buffer])
                        }
                        
                        looporswitchbreak()
                    }
                }
                
                Label_0180:
                
                if (cmpne:boolean(and:int(var_4_19A:int, ldc:int(4194304)), ldc:int(0))) {
                    var_4_C1 = and:int(var_4_19A:int, ldc:int(-1796746492))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_19A:int, ldc:int(262144)), ldc:int(0))) {
                        var_4_C1 = and:int(var_4_19A:int, ldc:int(980629959))
                        loopcontinue()
                    }
                    
                    var_4_C1 = and:int(var_4_19A:int, ldc:int(-533769777))
                }
                
                Label_0223:
                
                if (cmpeq:boolean(and:int(var_4_C1:int, ldc:int(64)), ldc:int(0))) {
                    var_4_19A = and:int(var_4_C1:int, ldc:int(-1977692190))
                    goto(Label_0180)
                }
                
                if (cmpeq:boolean(and:int(var_4_C1:int, ldc:int(1024)), ldc:int(0))) {
                    invokestatic:void(\u52d3\u97e6\u4492\u8640\ufe34\u8d90::\ucfaf\u7006\u6d99\uc29a\u92ff\u69d9, p0:long, getfield:ByteBuffer(\u52d3\u97e6\u4492\u8640\ufe34\u8d90::\ua068\u071d\u67d0\u3a62\ucef1\u983f, this:\u52d3\u97e6\u4492\u8640\ufe34\u8d90), var_6_71:byte[])
                    looporswitchbreak()
                }
                
                var_4_C1 = and:int(var_4_C1:int, ldc:int(1209772491))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1F6 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_179_0 : byte[] [generated]
        stack_208_0 : byte[] [generated]
        stack_242_0 : byte[] [generated]
        stack_297_0 : byte[] [generated]
        var_4_15C : int
        var_3_161 : byte[]
        var_5_162 : int
        var_0_191 : int
        expr_179 : byte [generated]
        stack_1C5_2 : byte [generated]
        stack_19C_0 : byte [generated]
        expr_9E : int [generated]
        var_2_C7 : byte[]
        expr_CB : int [generated]
        var_3_231 : byte[]
        var_5_232 : int
        expr_EE : int [generated]
        var_3_286 : byte[]
        var_5_287 : int
        expr_297 : byte [generated]
        var_3_122 : String
        stack_155_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
        var_0_1F6 = and:int(ldc:int(-1904590735), ldc:int(-1678347676))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_179_0 = stack_208_0 = stack_242_0 = stack_297_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("3g==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_15C = expr_6B:int
        var_3_161 = newarray:byte[](byte.class, expr_6B:int)
        var_5_162 = expr_6B:int
        Label_0356:
        
        while (cmpne:boolean(and:int(var_0_1F6:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_191 = and:int(var_0_1F6:int, ldc:int(929448319))
            var_5_162 = add:int(var_5_162:int, ldc:int(-1))
            expr_179 = stack_1C5_2 = loadelement(stack_179_0, var_5_162)
            
            if (cmplt:boolean(add:int(add:int(var_5_162:int, ldc:int(5)), neg:int(var_4_15C:int)), ldc:int(0))) {
                stack_1C5_2 = stack_19C_0 = add:byte(expr_179:byte, loadelement:byte(var_3_161:byte[], add:int(var_5_162:int, ldc:int(5))))
                goto(Label_0428)
            }
            
            Label_0390:
            
            if (cmpne:boolean(and:int(var_0_191:int, ldc:int(2)), ldc:int(0))) {
                var_0_191 = and:int(var_0_191:int, ldc:int(2135032987))
            }
            else {
                var_0_191 = and:int(var_0_191:int, ldc:int(779347820))
                stack_1C5_2 = stack_19C_0 = add:byte(expr_179:byte, ldc:byte(5))
            }
            
            Label_0428:
            
            if (cmpne:boolean(and:int(var_0_191:int, ldc:int(128)), ldc:int(0))) {
                var_0_191 = and:int(var_0_191:int, ldc:int(83377937))
                goto(Label_0390)
            }
            
            var_0_1F6 = and:int(var_0_191:int, ldc:int(-1419578429))
            storeelement:byte(var_3_161:byte[], var_5_162:int, stack_1C5_2:byte)
            
            if (cmpne:boolean(var_5_162:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_179_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_161:byte[]
            goto(Label_0112)
        }
        
        Label_0491:
        
        while (cmpne:boolean(and:int(var_0_1F6:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1F6 = and:int(var_0_1F6:int, ldc:int(-873838498))
            var_5_162 = add:int(var_5_162:int, ldc:int(-1))
            storeelement:byte(var_3_161:byte[], var_5_162:int, add:byte(loadelement:byte(stack_208_0:byte[], var_5_162:int), ldc:byte(29)))
            
            if (cmpne:boolean(var_5_162:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_179_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_161:byte[]
            goto(Label_0163)
        }
        
        var_0_1F6 = and:int(var_0_1F6:int, ldc:int(1302564041))
        goto(Label_0356)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1F6:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1F6 = and:int(var_0_1F6:int, ldc:int(1288431261))
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_1F6:int, ldc:int(2048)), ldc:int(0))) {
            var_0_1F6 = and:int(var_0_1F6:int, ldc:int(714123904))
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F6:int, ldc:int(128)), ldc:int(0))) {
            var_0_1F6 = and:int(var_0_1F6:int, ldc:int(-160806785))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_15C = expr_9E:int
                var_3_161 = newarray:byte[](byte.class, expr_9E:int)
                var_5_162 = expr_9E:int
                goto(Label_0491)
            }
        }
        
        Label_0163:
        
        if (cmpeq:boolean(and:int(var_0_1F6:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F6:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1F6:int, ldc:int(131072)), ldc:int(0))) {
                var_0_1F6 = and:int(var_0_1F6:int, ldc:int(1813518585))
                goto(Label_0112)
            }
            
            var_0_1F6 = and:int(var_0_1F6:int, ldc:int(536304996))
            var_2_C7 = stack_C7_0:byte[]
            expr_CB = add:int(arraylength:int(stack_C9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_3_231 = newarray:byte[](byte.class, expr_CB:int)
                var_5_232 = expr_CB:int
                
                loop {
                    var_0_1F6 = and:int(var_0_1F6:int, ldc:int(654262879))
                    var_5_232 = add:int(var_5_232:int, ldc:int(-1))
                    storeelement:byte(var_3_231:byte[], var_5_232:int, add:int(shl:int(loadelement:byte(stack_242_0:byte[], var_5_232:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_C7:byte[], add:int(var_5_232:int, and:int(ldc:int(24929), ldc:int(2079)))), ldc:int(7)), and:int(ldc:int(15), ldc:int(21537)))))
                    
                    if (cmpne:boolean(var_5_232:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_179_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_231:byte[]
            }
        }
        
        Label_0208:
        
        if (cmpne:boolean(and:int(var_0_1F6:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1F6:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_1F6:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1F6 = and:int(var_0_1F6:int, ldc:int(-1100022156))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_286 = newarray:byte[](byte.class, expr_EE:int)
                var_5_287 = expr_EE:int
                
                loop {
                    var_0_1F6 = and:int(var_0_1F6:int, ldc:int(-144544567))
                    var_5_287 = add:int(var_5_287:int, ldc:int(-1))
                    expr_297 = loadelement:byte(stack_297_0:byte[], var_5_287:int)
                    storeelement:byte(var_3_286:byte[], var_5_287:int, xor:int(or:int(and:int(shl:int(expr_297:byte, xor:int(ldc:int(18432), ldc:int(18436))), ldc:int(-16)), and:int(shr:int(expr_297:byte[expected:int], xor:int(ldc:int(1026), ldc:int(1030))), ldc:int(15))), ldc:int(122)))
                    
                    if (cmpne:boolean(var_5_287:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_179_0 = stack_208_0 = stack_242_0 = stack_297_0 = var_3_286:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpeq:boolean(and:int(var_0_1F6:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F6:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_1F6:int, ldc:int(131072)), ldc:int(0))) {
            var_0_1F6 = and:int(var_0_1F6:int, ldc:int(-1741856248))
            goto(Label_0112)
        }
        
        var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_155_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(24641), ldc:int(7817)))
        expr_134 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(30027), ldc:int(2209)))
        storeelement:String(expr_134:String[], and:int(ldc:int(-13378), ldc:int(13377)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(-29155), ldc:int(29152)), and:int(ldc:int(-19503), ldc:int(19502))))
        putstatic:String[](\u52d3\u97e6\u4492\u8640\ufe34\u8d90::\u385b\u51fa\ube23\ub18d\u92ee\u494c, expr_134:String[])
    }
    
    public void \u59ec\ucef1\u7ce1\uceb8\u8753\ubf56(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_660 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C2 : double
        var_3_D4 : int
        var_11_E5 : int
        var_14_10F : double
        var_16_113 : int
        var_12_10B : double
        var_17_66B : int
        
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
        var_3_660 = and:int(ldc:int(-1801460073), ldc:int(-1665184353))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u52d3\u97e6\u4492\u8640\ufe34\u8d90[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
            var_3_660 = and:int(var_3_660:int, ldc:int(-957406948))
        }
        else {
            var_3_660 = and:int(var_3_660:int, ldc:int(-1214619947))
            var_5_85 = and:int(ldc:int(-28553), ldc:int(26504))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-243), ldc:int(242)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C2 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D4 = and:int(var_3_660:int, ldc:int(-191171435))
                    var_9_C2 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E5 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E5:int, sub:int(var_6_8C:int, and:int(ldc:int(777), ldc:int(17489)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E5:int, and:int(ldc:int(285), ldc:int(20193)))), var_7_9B:double))) {
                        inc:int(var_11_E5, ldc:int(1))
                    }
                    
                    var_3_660 = and:int(var_3_D4:int, ldc:int(1070561023))
                    var_14_10F = var_7_9B:double
                    var_16_113 = var_11_E5:int
                }
                else {
                    var_11_E5 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(8353), ldc:int(521)))
                    var_12_10B = var_14_10F = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_113 = var_11_E5:int, var_6_8C:int)) {
                        var_9_C2 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E5:int)
                        var_16_113 = var_11_E5:int
                        var_14_10F = var_12_10B:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-824738317))
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1803831185))
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(115387596))
                    }
                    else {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1420543677))
                        
                        if (cmplt:boolean(var_16_113:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0567)
                            }
                            
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0390:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1556979296))
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1564574613))
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(603440095))
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1847656411))
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1935248391))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(21901552))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(887879327))
                        var_11_E5 = and:int(ldc:int(15437), ldc:int(-15950))
                        goto(Label_1505)
                    }
                    
                    Label_0567:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-2031342323))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1875410801))
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1183956556))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1606715853))
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1968462607))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(496959485))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10F = var_9_C2:double
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0694:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1585702636))
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(570292100))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1685896341))
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-629123783))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(832639792))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1911593704))
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-25187548))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(1038018557))
                        var_14_10F = mul:double(ldc:double(0.5), add:double(var_9_C2:double, var_14_10F:double))
                    }
                    
                    Label_0848:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-44121991))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-998364791))
                        goto(Label_1096)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(899867322))
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(516933309))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E5 = and:int(ldc:int(4611), ldc:int(26657))
                                goto(Label_1096)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-35038))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(930369603))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0848)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(381667261))
                        var_11_E5 = and:int(ldc:int(-10960), ldc:int(10887))
                    }
                    
                    Label_1096:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1078758029))
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0848)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1979763853))
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-501046294))
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1941823301))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(498859509))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E5:int, ldc:int(0))) {
                                goto(Label_1374)
                            }
                        }
                    }
                    
                    Label_1217:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1274268495))
                        goto(Label_1516)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-913699558))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1096)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-2076586724))
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(276760283))
                            goto(Label_0848)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1214931345))
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1773695865))
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(426385084))
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1802810113))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10F:double, var_5_85:int, var_16_113:int)
                            goto(Label_1505)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1374:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1516)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(751521787))
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1456521231))
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1355015260))
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1906402987))
                        loopcontinue()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(-1749060129))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10F:double, ldc:double(0.0))
                    Label_1505:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66B = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E5:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1516:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1054516859))
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(925394767))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(97433817))
                        goto(Label_1096)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(2135471808))
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(128)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-2023548933))
                        goto(Label_0390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-17086563))
                        var_17_66B = add:int(var_16_113:int, xor:int(ldc:int(2400), ldc:int(2401)))
                        looporswitchbreak()
                    }
                }
                
                var_3_660 = and:int(var_3_660:int, ldc:int(1439365087))
                
                if (cmple:boolean(var_5_85 = var_17_66B:int, sub:int(var_6_8C:int, xor:int(ldc:int(-28606), ldc:int(-28605))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
