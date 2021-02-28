public class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u8d90\u4f52\uc29a\u839e\u6c56\u5f50 {
    public void \u8d90\u4f52\uc29a\u839e\u6c56\u5f50(int p0, int p1) {
        var_5_76 : byte[]
        var_6_7E : ByteBuffer
        
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
            invokespecial:Object(Object::<init>, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50)
            putfield:int(\u8d90\u4f52\uc29a\u839e\u6c56\u5f50::\u8640\ub102\uc4d2\u12b2\u6b5f\u8389, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50, invokestatic:int(GL11::glGenTextures))
            putfield:int(\u8d90\u4f52\uc29a\u839e\u6c56\u5f50::\u6bb9\u64f2\uf9c5\u647c\u3e75\u40a9, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50, ldc:int(15))
            var_5_76 = invokespecial:byte[](\u8d90\u4f52\uc29a\u839e\u6c56\u5f50::\u946b\u647c\u9af2\u156b\u5140\ub102, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50, p0:int, p1:int)
            var_6_7E = invokestatic:ByteBuffer(BufferUtils::createByteBuffer, arraylength:int(var_5_76:byte[]))
            invokevirtual:ByteBuffer(ByteBuffer::put, var_6_7E:ByteBuffer, var_5_76:byte[])
            invokevirtual:Buffer(Buffer::flip, var_6_7E:ByteBuffer[expected:Buffer])
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, getfield:int(\u8d90\u4f52\uc29a\u839e\u6c56\u5f50::\u8640\ub102\uc4d2\u12b2\u6b5f\u8389, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50))
            invokestatic:void(\uc910\uc2e8\u3e2a\u3bd6\u836c\uff55::\u5654\uc9f6\u51fa\uc87f\u8640\u0c95)
            invokestatic:void(GL11::glTexImage2D, and:int(ldc:int(19945), ldc:int(3555)), and:int(ldc:int(-20348), ldc:int(3962)), xor:int(ldc:int(2827), ldc:int(4620)), p0:int, p1:int, and:int(ldc:int(-28022), ldc:int(26736)), and:int(ldc:int(23815), ldc:int(7119)), and:int(ldc:int(14081), ldc:int(21601)), var_6_7E:ByteBuffer)
            invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(4089), ldc:int(15841)), xor:int(ldc:int(458), ldc:int(10696)), and:int(ldc:int(26897), ldc:int(11015)))
            invokestatic:void(GL11::glTexParameteri, xor:int(ldc:int(2188), ldc:int(1389)), and:int(ldc:int(10503), ldc:int(27827)), xor:int(ldc:int(1427), ldc:int(11410)))
            invokestatic:void(GL11::glTexParameteri, and:int(ldc:int(3559), ldc:int(20457)), xor:int(ldc:int(-5477), ldc:int(-15717)), xor:int(ldc:int(8369), ldc:int(1712)))
            invokestatic:void(GL11::glTexParameteri, xor:int(ldc:int(23202), ldc:int(22339)), and:int(ldc:int(26649), ldc:int(10497)), and:int(ldc:int(9739), ldc:int(11841)))
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, and:int(ldc:int(-16067), ldc:int(13890)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u3bc9\u52d3\u97e6\ubb2b\u92ff\u4492() {
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
            return:int(getfield:int(\u8d90\u4f52\uc29a\u839e\u6c56\u5f50::\u8640\ub102\uc4d2\u12b2\u6b5f\u8389, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50))
        }
        
        goto(Label_0006)
    }
    
    public void \uc31c\u3bd6\ub8be\u7006\u1833\u9033() {
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
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u64ab\u7d52\u3dd3\u0b8e\uafe7\u5654, getfield:int(\u8d90\u4f52\uc29a\u839e\u6c56\u5f50::\u8640\ub102\uc4d2\u12b2\u6b5f\u8389, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50))
            putfield:int(\u8d90\u4f52\uc29a\u839e\u6c56\u5f50::\u8640\ub102\uc4d2\u12b2\u6b5f\u8389, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50, and:int(ldc:int(9505), ldc:int(-9506)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private int \u5d20\u52d3\u6b0d\uc3e3\u624e\u983f(int p0) {
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
            p0 = xor:int(p0:int, shl:int(p0:int, ldc:int(13)))
            p0 = xor:int(p0:int, shr:int(p0:int, ldc:int(17)))
            return:int(xor:int(p0:int, shl:int(p0:int, and:int(ldc:int(4197), ldc:int(25223)))))
        }
        
        goto(Label_0006)
    }
    
    private byte \u5d20\u52d3\u6b0d\uc3e3\u624e\u983f(int p0, int p1, int p2) {
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
            return:byte(i2b:byte(rem:int(invokespecial:int(\u8d90\u4f52\uc29a\u839e\u6c56\u5f50::\u5d20\u52d3\u6b0d\uc3e3\u624e\u983f, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50, sub:int(mul:int(add:int(invokespecial:int(\u8d90\u4f52\uc29a\u839e\u6c56\u5f50::\u5d20\u52d3\u6b0d\uc3e3\u624e\u983f, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50, p0:int), invokespecial:int(\u8d90\u4f52\uc29a\u839e\u6c56\u5f50::\u5d20\u52d3\u6b0d\uc3e3\u624e\u983f, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50, mul:int(p1:int, ldc:int(19)))), invokespecial:int(\u8d90\u4f52\uc29a\u839e\u6c56\u5f50::\u5d20\u52d3\u6b0d\uc3e3\u624e\u983f, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50, mul:int(p2:int, ldc:int(23)))), p2:int)), xor:int(ldc:int(-32669), ldc:int(-32541)))))
        }
        
        goto(Label_0006)
    }
    
    private byte[] \u946b\u647c\u9af2\u156b\u5140\ub102(int p0, int p1) {
        var_3_5F : int
        var_5_6D : byte[]
        var_6_76 : int
        var_7_7F : int
        var_3_FC : int
        var_8_BD : int
        var_9_F6 : int
        
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
            var_3_5F = and:int(ldc:int(1361367294), ldc:int(1244572150))
            var_5_6D = newarray:byte[](byte.class, mul:int(mul:int(p0:int, p1:int), and:int(ldc:int(35), ldc:int(18975))))
            var_6_76 = and:int(ldc:int(10440), ldc:int(-10441))
            var_7_7F = and:int(ldc:int(-21034), ldc:int(21033))
            
            loop {
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(1)), ldc:int(0))) {
                    var_3_FC = and:int(var_3_5F:int, ldc:int(933728186))
                }
                else {
                    var_3_FC = and:int(var_3_5F:int, ldc:int(582466014))
                    
                    if (cmplt:boolean(var_7_7F:int, p1:int)) {
                        var_8_BD = and:int(ldc:int(-30271), ldc:int(30262))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(1048576)), ldc:int(0))) {
                                var_3_FC = and:int(var_3_FC:int, ldc:int(418642679))
                                
                                if (cmplt:boolean(var_8_BD:int, p0:int)) {
                                    var_9_F6 = and:int(ldc:int(24641), ldc:int(57))
                                    
                                    loop {
                                        var_3_FC = and:int(var_3_FC:int, ldc:int(1002303710))
                                        
                                        if (cmpge:boolean(var_9_F6:int, xor:int(ldc:int(12313), ldc:int(12317)))) {
                                            looporswitchbreak()
                                        }
                                        
                                        storeelement:byte(var_5_6D:byte[], postincrement:int(1, var_6_76:int), invokespecial:byte(\u8d90\u4f52\uc29a\u839e\u6c56\u5f50::\u5d20\u52d3\u6b0d\uc3e3\u624e\u983f, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50, var_8_BD:int, var_7_7F:int, var_9_F6:int))
                                        inc:int(var_9_F6, ldc:int(1))
                                    }
                                    
                                    var_3_FC = and:int(var_3_FC:int, ldc:int(-505112106))
                                    inc:int(var_8_BD, ldc:int(1))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_FC:int, ldc:int(4194304)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_3_FC = and:int(var_3_FC:int, ldc:int(-479428736))
                        }
                        
                        var_3_5F = and:int(var_3_FC:int, ldc:int(465095671))
                        inc:int(var_7_7F, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_FC:int, ldc:int(2)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_5F = and:int(var_3_FC:int, ldc:int(-1836370869))
            }
            
            return:byte[](var_5_6D:byte[])
        }
        
        goto(Label_0006)
    }
    
    public int \u98a4\ubded\u760c\uae87\u74b1\u34df() {
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
            return:int(getfield:int(\u8d90\u4f52\uc29a\u839e\u6c56\u5f50::\u8640\ub102\uc4d2\u12b2\u6b5f\u8389, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50))
        }
        
        goto(Label_0006)
    }
    
    public int \u718f\ud158\u4bc8\uceb8\u0800\u4492() {
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
            return:int(getfield:int(\u8d90\u4f52\uc29a\u839e\u6c56\u5f50::\u6bb9\u64f2\uf9c5\u647c\u3e75\u40a9, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50))
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0a06\u93a2\u0c95\u5fe1\u8d98\u494c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_614 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_61F : int
        
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
        var_3_614 = and:int(ldc:int(266166219), ldc:int(-304800098))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8d90\u4f52\uc29a\u839e\u6c56\u5f50[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_614 = and:int(var_3_614:int, ldc:int(78755012))
        }
        else {
            var_3_614 = and:int(var_3_614:int, ldc:int(-1176658728))
            var_5_85 = and:int(ldc:int(-28656), ldc:int(26351))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1574), ldc:int(-1575)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_614:int, ldc:int(-1145749585))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(72), ldc:int(73)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(267), ldc:int(7413)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_614 = and:int(var_3_DA:int, ldc:int(-1615484787))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(7565), ldc:int(547)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(846127798))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1993198785))
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(786410916))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1776873857))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1682478766))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1175118675))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1247224198))
                        goto(Label_1295)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1439834548))
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1503382168))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-589440565))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-375398726))
                        var_11_EB = and:int(ldc:int(7330), ldc:int(-23716))
                        goto(Label_1432)
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1233081162))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1000171254))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-2047624157))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-73986834))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-728595080))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-2008523336))
                        goto(Label_1177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-610936299))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1382720295))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(259887552))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(667608984))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1227842955))
                        goto(Label_1177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1259138382))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-247651161))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(232724970))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(11), ldc:int(4097))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1351638917))
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(746461120))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1583590739))
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(221440400))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(510672158))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-838862658))
                        var_11_EB = and:int(ldc:int(7706), ldc:int(-16159))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(415580624))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(294111700))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(619298216))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1676284912))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1533370565))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-2054498007))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1145225251))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1295)
                            }
                        }
                    }
                    
                    Label_1177:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-507754503))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1688374857))
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-103054449))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1650504023))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1432)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1295:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1760112772))
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(476371782))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(914605358))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1669404376))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1453087071))
                        loopcontinue()
                    }
                    
                    var_3_614 = and:int(var_3_614:int, ldc:int(1774190316))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1432:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61F = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1443:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(369008437))
                        goto(Label_1295)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-695166174))
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(199209269))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1934371658))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(128)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1102138584))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1071631592))
                        var_17_61F = add:int(var_16_119:int, xor:int(ldc:int(-32188), ldc:int(-32187)))
                        looporswitchbreak()
                    }
                }
                
                var_3_614 = and:int(var_3_614:int, ldc:int(1272786841))
                
                if (cmple:boolean(var_5_85 = var_17_61F:int, sub:int(var_6_8C:int, xor:int(ldc:int(9088), ldc:int(9089))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_614 = and:int(var_3_614:int, ldc:int(1784282107))
            goto(Label_0106)
        }
    }
}
