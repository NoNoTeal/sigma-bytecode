public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c {
    public void \u9255\uc2e8\u6d69\u7e3f\uae87\uc31c() {
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
            invokespecial:Object(Object::<init>, this:\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \ubff1\ubf56\u5db4\u5245\u4f4a\ufe34() {
        var_2_8D : int[]
        var_3_95 : int
        
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
        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
        
        if (logicalnot:boolean(getstatic:boolean(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\uc31c\ub8be\u52d3\u5fe1\uceb8\u7006))) {
            return:int(invokestatic:int(\u3a62\u92ff\u12cb\u8753\u7bad::\u34df\uc7fe\ud12e\u99f7\ubff1\ua61f))
        }
        
        var_2_8D = newarray:int[](int.class, add:int(invokevirtual:int(ThreadLocalRandom::nextInt, invokestatic:ThreadLocalRandom(ThreadLocalRandom::current), ldc:int(15)), and:int(ldc:int(1027), ldc:int(12457))))
        invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7, var_2_8D:int[])
        var_3_95 = invokestatic:int(\u3a62\u92ff\u12cb\u8753\u7bad::\u34df\uc7fe\ud12e\u99f7\ubff1\ua61f)
        invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u6b5f\u5f50\u071d\u4daf\u3d64\u6435, var_2_8D:int[])
        return:int(var_3_95:int)
    }
    
    public static void \ubff1\ub6ab\ub18d\u56bd\u12b2\u527a(int p0) {
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
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u64ab\u7d52\u3dd3\u0b8e\uafe7\u5654, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u946b\u92ee\u8cae\u624e\u4d85\u6435(int p0, int p1, int p2) {
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
            invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\u946b\u92ee\u8cae\u624e\u4d85\u6435, getstatic:\u3c25\u8cae\u99f7\u4d85\uc238\u836c(\u3c25\u8cae\u99f7\u4d85\uc238\u836c::\uc29a\ub8be\ud12e\u4c04\uc9f6\ubcb0), p0:int, and:int(ldc:int(472), ldc:int(-5085)), p1:int, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u946b\u92ee\u8cae\u624e\u4d85\u6435(\u71f1\uc910\u3bc9\u516c\u93a2.\u3c25\u8cae\u99f7\u4d85\uc238\u836c p0, int p1, int p2, int p3) {
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
            invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\u946b\u92ee\u8cae\u624e\u4d85\u6435, p0:\u3c25\u8cae\u99f7\u4d85\uc238\u836c, p1:int, and:int(ldc:int(-25492), ldc:int(25489)), p2:int, p3:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u946b\u92ee\u8cae\u624e\u4d85\u6435(int p0, int p1, int p2, int p3) {
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
            invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\u946b\u92ee\u8cae\u624e\u4d85\u6435, getstatic:\u3c25\u8cae\u99f7\u4d85\uc238\u836c(\u3c25\u8cae\u99f7\u4d85\uc238\u836c::\uc29a\ub8be\ud12e\u4c04\uc9f6\ubcb0), p0:int, p1:int, p2:int, p3:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u946b\u92ee\u8cae\u624e\u4d85\u6435(\u71f1\uc910\u3bc9\u516c\u93a2.\u3c25\u8cae\u99f7\u4d85\uc238\u836c p0, int p1, int p2, int p3, int p4) {
        var_7_81 : int
        
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
            invokestatic:void(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\u8640\u64ab\u4c04\ua068\u3c25\ud51e, p1:int)
            
            if (cmpge:boolean(p2:int, ldc:int(0))) {
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, xor:int(ldc:int(1429), ldc:int(2164)), ldc:int(33085), p2:int)
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, xor:int(ldc:int(6687), ldc:int(6142)), ldc:int(33082), and:int(ldc:int(16570), ldc:int(-16575)))
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, and:int(ldc:int(28649), ldc:int(7665)), ldc:int(33083), p2:int)
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ub70c\u1833\u3bc9\u12b2\uc2e8\ubcb0, and:int(ldc:int(24051), ldc:int(11757)), ldc:int(34049), ldc:float(0.0f))
            }
            
            var_7_81 = and:int(ldc:int(-25328), ldc:int(25199))
            
            while (cmple:boolean(var_7_81:int, p2:int)) {
                invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\ubcb0\ub70c\u6c52\u3776\u93a2\u8df4, xor:int(ldc:int(19311), ldc:int(18062)), var_7_81:int, invokevirtual:int(\u3c25\u8cae\u99f7\u4d85\uc238\u836c::\u6cfe\u8640\u71f1\u4ab3\u4bc8\uc4d2, p0:\u3c25\u8cae\u99f7\u4d85\uc238\u836c), shr:int(p3:int, var_7_81:int), shr:int(p4:int, var_7_81:int), and:int(ldc:int(-25768), ldc:int(9383)), xor:int(ldc:int(18229), ldc:int(24125)), and:int(ldc:int(21505), ldc:int(14205)), checkcast:IntBuffer(java.nio.IntBuffer.class, aconstnull:IntBuffer()))
                inc:int(var_7_81, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u8640\u64ab\u4c04\ua068\u3c25\ud51e(int p0) {
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
            invokestatic:void(\u3a62\u92ff\u12cb\u8753\u7bad::\u67d0\u93a2\ub83f\u6c52\u8308\uc3e3, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.nio.ByteBuffer \u8709\u600f\ubefe\ub6ab\u0b8e\u6d99(java.io.InputStream p0) {
        var_1_5F : int
        var_3_A2 : ByteBuffer
        var_5_8F : FileChannel
        
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
            var_1_5F = and:int(ldc:int(-1126473531), ldc:int(-1780766779))
            
            if (logicalnot:boolean(instanceof:boolean(java.io.FileInputStream.class, p0:InputStream))) {
                var_3_A2 = invokestatic:ByteBuffer(MemoryUtil::memAlloc, xor:int(ldc:int(25978), ldc:int(17786)))
                
                while (cmpne:boolean(invokeinterface:int(ReadableByteChannel::read, invokestatic:ReadableByteChannel(Channels::newChannel, p0:InputStream), var_3_A2:ByteBuffer), ldc:int(-1))) {
                    if (cmpne:boolean(invokevirtual:int(Buffer::remaining, var_3_A2:ByteBuffer[expected:Buffer]), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_A2 = invokestatic:ByteBuffer(MemoryUtil::memRealloc, var_3_A2:ByteBuffer, mul:int(invokevirtual:int(Buffer::capacity, var_3_A2:ByteBuffer[expected:Buffer]), and:int(ldc:int(5634), ldc:int(8266))))
                }
            }
            else {
                var_5_8F = invokevirtual:FileChannel(FileInputStream::getChannel, checkcast:FileInputStream(java.io.FileInputStream.class, p0:InputStream[expected:FileInputStream]))
                var_3_A2 = invokestatic:ByteBuffer(MemoryUtil::memAlloc, add:int(l2i:int(invokevirtual:long(FileChannel::size, var_5_8F:FileChannel)), and:int(ldc:int(1057), ldc:int(195))))
                
                loop {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-1779762773))
                    
                    if (cmpeq:boolean(invokevirtual:int(FileChannel::read, var_5_8F:FileChannel, var_3_A2:ByteBuffer), ldc:int(-1))) {
                        looporswitchbreak()
                    }
                }
            }
            
            return:ByteBuffer(var_3_A2:ByteBuffer)
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u4e72\ubefe\ufe34\ua3b4\u9255\u4daf(java.io.InputStream p0) {
        var_1_5F : int
        var_1_6B : int
        var_1_8F : int
        var_3_91 : ByteBuffer
        var_1_9B : int
        var_4_A0 : int
        var_1_132 : int
        var_5_CD : String
        
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
            var_1_5F = and:int(ldc:int(-228373819), ldc:int(-813611410))
            
            loop {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_6B = and:int(var_1_5F:int, ldc:int(1187743962))
                }
                else {
                    var_1_6B = and:int(var_1_5F:int, ldc:int(-471731228))
                    invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u71f1\u7006\u927d\uafe7\u0800\u6bb9, invokedynamic:Supplier<Boolean>(get:()Ljava/util/function/Supplier;))
                }
                
                if (cmpeq:boolean(and:int(var_1_6B:int, ldc:int(8192)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_5F = and:int(var_1_6B:int, ldc:int(-2076240942))
            }
            
            var_1_8F = and:int(var_1_6B:int, ldc:int(-616050058))
            var_3_91 = aconstnull:ByteBuffer()
            
            try {
                var_3_91 = invokestatic:ByteBuffer(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\u8709\u600f\ubefe\ub6ab\u0b8e\u6d99, p0:InputStream)
                var_1_9B = and:int(var_1_8F:int, ldc:int(-216185914))
                var_4_A0 = invokevirtual:int(Buffer::position, var_3_91:ByteBuffer[expected:Buffer])
                
                do {
                    if (cmpne:boolean(and:int(var_1_9B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_9B = and:int(var_1_9B:int, ldc:int(109178630))
                    }
                    else {
                        var_1_9B = and:int(var_1_9B:int, ldc:int(-547524667))
                        invokevirtual:Buffer(Buffer::rewind, var_3_91:ByteBuffer[expected:Buffer])
                    }
                } while (cmpne:boolean(and:int(var_1_9B:int, ldc:int(134217728)), ldc:int(0)))
                
                var_1_132 = and:int(var_1_9B:int, ldc:int(-349092012))
                var_5_CD = invokestatic:String(MemoryUtil::memASCII, var_3_91:ByteBuffer, var_4_A0:int)
                
                loop {
                    if (cmpne:boolean(and:int(var_1_132:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_132 = and:int(var_1_132:int, ldc:int(-908593994))
                        goto(Label_0268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_132:int, ldc:int(64)), ldc:int(0))) {
                        var_1_132 = and:int(var_1_132:int, ldc:int(1238321615))
                    }
                    else {
                        var_1_132 = and:int(var_1_132:int, ldc:int(-1026855048))
                        
                        if (cmpeq:boolean(var_3_91:ByteBuffer, aconstnull:ByteBuffer())) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0247:
                    
                    if (cmpne:boolean(and:int(var_1_132:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_1_132:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_1_132 = and:int(var_1_132:int, ldc:int(-549849257))
                    }
                    
                    Label_0268:
                    
                    if (cmpne:boolean(and:int(var_1_132:int, ldc:int(4096)), ldc:int(0))) {
                        var_1_132 = and:int(var_1_132:int, ldc:int(-590500551))
                        goto(Label_0247)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_132:int, ldc:int(512)), ldc:int(0))) {
                        var_1_132 = and:int(var_1_132:int, ldc:int(-836253867))
                        invokestatic:void(MemoryUtil::memFree, var_3_91:ByteBuffer[expected:Buffer])
                        looporswitchbreak()
                    }
                    
                    var_1_132 = and:int(var_1_132:int, ldc:int(-428762933))
                }
                
                return:String(var_5_CD:String)
            }
            catch (java.io.IOException var_4_144) {
            }
            finally {
                if (cmpne:boolean(var_3_91:ByteBuffer, aconstnull:ByteBuffer())) {
                    invokestatic:void(MemoryUtil::memFree, var_3_91:ByteBuffer[expected:Buffer])
                }
            }
            
            return:String(aconstnull:String())
        }
        
        goto(Label_0006)
    }
    
    public static void \ud171\u92ee\ubff1\ud171\u7e3f\u8389(java.nio.IntBuffer p0, int p1, int p2) {
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
            invokestatic:void(GL11::glPixelStorei, xor:int(ldc:int(358), ldc:int(3478)), and:int(ldc:int(9537), ldc:int(-9538)))
            invokestatic:void(GL11::glPixelStorei, and:int(ldc:int(15615), ldc:int(3313)), and:int(ldc:int(23118), ldc:int(-23151)))
            invokestatic:void(GL11::glPixelStorei, and:int(ldc:int(3315), ldc:int(28150)), and:int(ldc:int(-24985), ldc:int(24984)))
            invokestatic:void(GL11::glPixelStorei, xor:int(ldc:int(5331), ldc:int(6176)), and:int(ldc:int(-8894), ldc:int(8749)))
            invokestatic:void(GL11::glPixelStorei, xor:int(ldc:int(1126), ldc:int(2194)), and:int(ldc:int(-741), ldc:int(740)))
            invokestatic:void(GL11::glPixelStorei, and:int(ldc:int(31989), ldc:int(4085)), xor:int(ldc:int(1050), ldc:int(1054)))
            invokestatic:void(GL11::glTexImage2D, and:int(ldc:int(4065), ldc:int(7665)), and:int(ldc:int(-17855), ldc:int(17798)), xor:int(ldc:int(-3550), ldc:int(-5334)), p1:int, p2:int, and:int(ldc:int(-15845), ldc:int(7652)), ldc:int(32993), ldc:int(33639), p0:IntBuffer)
            invokestatic:void(GL11::glTexParameteri, xor:int(ldc:int(16936), ldc:int(20425)), xor:int(ldc:int(11230), ldc:int(988)), and:int(ldc:int(27907), ldc:int(11017)))
            invokestatic:void(GL11::glTexParameteri, xor:int(ldc:int(19367), ldc:int(17990)), xor:int(ldc:int(5548), ldc:int(15791)), and:int(ldc:int(11521), ldc:int(15153)))
            invokestatic:void(GL11::glTexParameteri, xor:int(ldc:int(10115), ldc:int(10850)), and:int(ldc:int(11858), ldc:int(10248)), and:int(ldc:int(12037), ldc:int(9738)))
            invokestatic:void(GL11::glTexParameteri, xor:int(ldc:int(3160), ldc:int(441)), and:int(ldc:int(26753), ldc:int(11359)), xor:int(ldc:int(13175), ldc:int(5494)))
            return:void()
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
            putstatic:Logger(\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c::\u392e\u600f\uc87f\u4ab3\ub6ab\ub171, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud523\u4492\uf9c5\u760c\u5bc4\u8413(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B3 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6BE : int
        
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
        var_3_6B3 = and:int(ldc:int(2032171611), ldc:int(-13731233))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9255\uc2e8\u6d69\u7e3f\uae87\uc31c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(65536)), ldc:int(0))) {
            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(2123525082))
            var_5_81 = and:int(ldc:int(-23873), ldc:int(21824))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(120), ldc:int(-121)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6B3:int, ldc:int(-11449510))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(4141), ldc:int(11539)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(9729), ldc:int(9728)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6B3 = and:int(var_3_D1:int, ldc:int(-117867522))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(6153), ldc:int(513)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1753434842))
                        goto(Label_1593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1668666340))
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1163932811))
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1081564967))
                        goto(Label_0866)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-383825724))
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0594)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(2118802271))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0594)
                            }
                            
                            goto(Label_0866)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1605450645))
                        goto(Label_1593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-546076763))
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(843367069))
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0866)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-549305108))
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1259886357))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1650227826))
                            loopcontinue()
                        }
                        
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(2035080926))
                        var_11_E2 = and:int(ldc:int(-10953), ldc:int(10952))
                        goto(Label_1582)
                    }
                    
                    Label_0594:
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(164494993))
                        goto(Label_1293)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1883477292))
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-740186540))
                        goto(Label_0866)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1666805649))
                            loopcontinue()
                        }
                        
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(2054507099))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0866)
                        }
                    }
                    
                    Label_0718:
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-228692468))
                        goto(Label_1593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1529971735))
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-910643817))
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1689977940))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1495345286))
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(260328104))
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(2069519323))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0866:
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1477711739))
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1293)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0718)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1202557180))
                            loopcontinue()
                        }
                        
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-124925094))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(20801), ldc:int(8209))
                                goto(Label_1160)
                            }
                        }
                    }
                    
                    Label_0973:
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(847367349))
                        goto(Label_1593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1401573372))
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1020485590))
                        goto(Label_1293)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1997583788))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0866)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1229261044))
                            goto(Label_0718)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(220792102))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-615309996))
                            loopcontinue()
                        }
                        
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(2146949759))
                        var_11_E2 = and:int(ldc:int(-2925), ldc:int(2924))
                    }
                    
                    Label_1160:
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1883037287))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0973)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(357911732))
                            goto(Label_0866)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1839602640))
                            goto(Label_0718)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(708762666))
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1022754016))
                            loopcontinue()
                        }
                        
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-34214053))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1428)
                            }
                        }
                    }
                    
                    Label_1293:
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1827174030))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1160)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-494152291))
                            goto(Label_0973)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0866)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(438623262))
                            goto(Label_0718)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1411218854))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6B3 = and:int(var_3_6B3:int, ldc:int(2064992991))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1582)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1428:
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1028083301))
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0973)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-446422067))
                        goto(Label_0866)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-238943785))
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1938839930))
                        goto(Label_0594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1517396178))
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1477635635))
                        loopcontinue()
                    }
                    
                    var_3_6B3 = and:int(var_3_6B3:int, ldc:int(2018103003))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1582:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BE = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1593:
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-285765604))
                        goto(Label_1428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-425035182))
                        goto(Label_1160)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(1630248213))
                        goto(Label_0973)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B3:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0866)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0594)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-2005940106))
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-69219717))
                        var_17_6BE = add:int(var_16_110:int, and:int(ldc:int(18131), ldc:int(4097)))
                        looporswitchbreak()
                    }
                    
                    var_3_6B3 = and:int(var_3_6B3:int, ldc:int(-1442374346))
                }
                
                var_3_6B3 = and:int(var_3_6B3:int, ldc:int(2077084414))
                
                if (cmple:boolean(var_5_81 = var_17_6BE:int, sub:int(var_6_88:int, xor:int(ldc:int(27648), ldc:int(27649))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6B3:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
