public class \ub113\ufcaf\u3c25\u071d\u97b7.\u5140\u9255\ud7e8\ud51e\u6435 {
    public void \u5140\u9255\ud7e8\ud51e\u6435(com.mojang.serialization.Codec<\u47c2\u2dcc\u12cb\ud171\u8c8a.\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937> p0, int p1) {
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
            invokespecial:\u5140\u5bc4\u4e72\ud523\u7bad<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>(\u5140\u5bc4\u4e72\ud523\u7bad<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>::<init>, this:\u5140\u9255\ud7e8\ud51e\u6435[expected:\u5140\u5bc4\u4e72\ud523\u7bad<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>], p0:Codec<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4f4a\u6435\u4c04\uc229\u0c95\u647c(java.util.Random p0, int p1, int p2, \u47c2\u2dcc\u12cb\ud171\u8c8a.\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937 p3) {
        var_5_61 : int
        stack_93_0 : int [generated]
        
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
            var_5_61 = and:int(ldc:int(-117783283), ldc:int(-463497927))
            
            if (cmpgt:boolean(invokevirtual:float(Random::nextFloat, p0:Random), getfield:float(\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937::\ua562\ud171\u47c2\uae87\u946b\u873d, p3:\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(-439100017))
                stack_93_0 = and:int(ldc:int(27209), ldc:int(-27210))
            }
            else {
                stack_93_0 = xor:int(ldc:int(544), ldc:int(545))
            }
            
            return:boolean(stack_93_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u960f\u12b2\u71ae\u839e\u7873\u9033(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p0, java.util.function.Function<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56> p1, java.util.Random p2, int p3, int p4, int p5, int p6, int p7, java.util.BitSet p8, \u47c2\u2dcc\u12cb\ud171\u8c8a.\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937 p9) {
        var_11_61 : int
        var_13_7A : int
        var_14_9C : int
        var_15_A5 : int
        var_16_E5 : double
        var_18_ED : double
        var_20_FC : double
        var_22_105 : int
        var_11_11A : int
        var_23_123 : int
        
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
            var_11_61 = and:int(ldc:int(-1755810454), ldc:int(-538988086))
            var_13_7A = mul:int(sub:int(mul:int(invokevirtual:int(\u5140\u5bc4\u4e72\ud523\u7bad<C>::\u0c95\u3bc9\uc4d2\u4daf\ub19c\u9937, this:\u5140\u9255\ud7e8\ud51e\u6435[expected:\u5140\u5bc4\u4e72\ud523\u7bad<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>]), and:int(ldc:int(786), ldc:int(2062))), and:int(ldc:int(73), ldc:int(3073))), ldc:int(16))
            var_14_9C = invokevirtual:int(Random::nextInt, p2:Random, add:int(invokevirtual:int(Random::nextInt, p2:Random, add:int(invokevirtual:int(Random::nextInt, p2:Random, invokevirtual:int(\u5140\u9255\ud7e8\ud51e\u6435::\ub19c\u6d69\u8aa5\u3c25\uc3e3\u960f, this:\u5140\u9255\ud7e8\ud51e\u6435)), xor:int(ldc:int(16386), ldc:int(16387)))), xor:int(ldc:int(8320), ldc:int(8321))))
            var_15_A5 = and:int(ldc:int(-26985), ldc:int(26984))
            
            loop {
                if (cmpeq:boolean(and:int(var_11_61:int, ldc:int(2097152)), ldc:int(0))) {
                    var_11_61 = and:int(var_11_61:int, ldc:int(-1610914962))
                    
                    if (cmplt:boolean(var_15_A5:int, var_14_9C:int)) {
                        var_16_E5 = i2d:double(add:int(mul:int(p4:int, ldc:int(16)), invokevirtual:int(Random::nextInt, p2:Random, ldc:int(16))))
                        var_18_ED = i2d:double(invokevirtual:int(\u5140\u9255\ud7e8\ud51e\u6435::\ucb79\ub18d\u8d90\u7c6b\uc9f6\u4c04, this:\u5140\u9255\ud7e8\ud51e\u6435, p2:Random))
                        var_20_FC = i2d:double(add:int(mul:int(p5:int, ldc:int(16)), invokevirtual:int(Random::nextInt, p2:Random, ldc:int(16))))
                        var_22_105 = xor:int(ldc:int(360), ldc:int(361))
                        
                        if (cmpeq:boolean(invokevirtual:int(Random::nextInt, p2:Random, xor:int(ldc:int(2640), ldc:int(2644))), ldc:int(0))) {
                            invokevirtual:void(\u5140\u9255\ud7e8\ud51e\u6435::\uc4d2\u16f6\u47c2\u5db4\u1187\ua068, this:\u5140\u9255\ud7e8\ud51e\u6435, p0:\u8aa5\ubded\ub18d\u4f4a\u4f52, p1:Function<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc2e8\u9255\u647c\ud171\ubf56>, invokevirtual:long(Random::nextLong, p2:Random), p3:int, p6:int, p7:int, var_16_E5:double, var_18_ED:double, var_20_FC:double, add:float(ldc:float(1.0f), mul:float(invokevirtual:float(Random::nextFloat, p2:Random), ldc:float(6.0f))), ldc:double(0.5), p8:BitSet)
                            var_22_105 = add:int(var_22_105:int, invokevirtual:int(Random::nextInt, p2:Random, and:int(ldc:int(838), ldc:int(1084))))
                        }
                        
                        var_11_11A = and:int(var_11_61:int, ldc:int(-675353137))
                        var_23_123 = and:int(ldc:int(18802), ldc:int(-18807))
                        
                        while (cmplt:boolean(var_23_123:int, var_22_105:int)) {
                            invokevirtual:void(\u5140\u9255\ud7e8\ud51e\u6435::\u0a06\u52d3\uc246\u3504\u6c52\ua068, this:\u5140\u9255\ud7e8\ud51e\u6435, p0:\u8aa5\ubded\ub18d\u4f4a\u4f52, p1:Function<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc2e8\u9255\u647c\ud171\ubf56>, invokevirtual:long(Random::nextLong, p2:Random), p3:int, p6:int, p7:int, var_16_E5:double, var_18_ED:double, var_20_FC:double, invokevirtual:float(\u5140\u9255\ud7e8\ud51e\u6435::\u8350\ub113\u983f\ube23\u99f7\u6ec6, this:\u5140\u9255\ud7e8\ud51e\u6435, p2:Random), mul:float(invokevirtual:float(Random::nextFloat, p2:Random), ldc:float(6.2831855f)), div:float(sub:float(invokevirtual:float(Random::nextFloat, p2:Random), ldc:float(0.5f)), ldc:float(4.0f)), and:int(ldc:int(-28466), ldc:int(10032)), sub:int(var_13_7A:int, invokevirtual:int(Random::nextInt, p2:Random, div:int(var_13_7A:int, and:int(ldc:int(8844), ldc:int(17476))))), invokevirtual:double(\u5140\u9255\ud7e8\ud51e\u6435::\u3776\u3d64\u92ff\uc87f\u59ec\ub83f, this:\u5140\u9255\ud7e8\ud51e\u6435), p8:BitSet)
                            inc:int(var_23_123, ldc:int(1))
                        }
                        
                        var_11_61 = and:int(var_11_11A:int, ldc:int(-1617320563))
                        inc:int(var_15_A5, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_11_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(29709), ldc:int(833)))
        }
        
        goto(Label_0006)
    }
    
    public int \ub19c\u6d69\u8aa5\u3c25\uc3e3\u960f() {
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
            return:int(ldc:int(15))
        }
        
        goto(Label_0006)
    }
    
    public float \u8350\ub113\u983f\ube23\u99f7\u6ec6(java.util.Random p0) {
        var_4_6B : float
        
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
            var_4_6B = add:float(mul:float(invokevirtual:float(Random::nextFloat, p0:Random), ldc:float(2.0f)), invokevirtual:float(Random::nextFloat, p0:Random))
            
            if (cmpeq:boolean(invokevirtual:int(Random::nextInt, p0:Random, ldc:int(10)), ldc:int(0))) {
                var_4_6B = mul:float(var_4_6B:float, add:float(mul:float(mul:float(invokevirtual:float(Random::nextFloat, p0:Random), invokevirtual:float(Random::nextFloat, p0:Random)), ldc:float(3.0f)), ldc:float(1.0f)))
            }
            
            return:float(var_4_6B:float)
        }
        
        goto(Label_0006)
    }
    
    public double \u3776\u3d64\u92ff\uc87f\u59ec\ub83f() {
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
            return:double(ldc:double(1.0))
        }
        
        goto(Label_0006)
    }
    
    public int \ucb79\ub18d\u8d90\u7c6b\uc9f6\u4c04(java.util.Random p0) {
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
            return:int(invokevirtual:int(Random::nextInt, p0:Random, add:int(invokevirtual:int(Random::nextInt, p0:Random, ldc:int(120)), ldc:int(8))))
        }
        
        goto(Label_0006)
    }
    
    public void \uc4d2\u16f6\u47c2\u5db4\u1187\ua068(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p0, java.util.function.Function<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56> p1, long p2, int p3, int p4, int p5, double p6, double p7, double p8, float p9, double p10, java.util.BitSet p11) {
        var_20_70 : double
        
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
            var_20_70 = add:double(ldc:double(1.5), f2d:double(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, ldc:float(1.5707964f)), p9:float)))
            invokevirtual:boolean(\u5140\u5bc4\u4e72\ud523\u7bad<C>::\ube23\ud158\u7e3f\u965f\u6cfe\uae87, this:\u5140\u9255\ud7e8\ud51e\u6435[expected:\u5140\u5bc4\u4e72\ud523\u7bad<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>], p0:\u8aa5\ubded\ub18d\u4f4a\u4f52, p1:Function<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc2e8\u9255\u647c\ud171\ubf56>, p2:long, p3:int, p4:int, p5:int, add:double(p6:double, ldc:double(1.0)), p7:double, p8:double, var_20_70:double, mul:double(var_20_70:double, p10:double), p11:BitSet)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0a06\u52d3\uc246\u3504\u6c52\ua068(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p0, java.util.function.Function<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56> p1, long p2, int p3, int p4, int p5, double p6, double p7, double p8, float p9, float p10, float p11, int p12, int p13, double p14, java.util.BitSet p15) {
        var_22_61 : int
        var_24_6B : Random
        var_25_87 : int
        stack_B6_0 : int [generated]
        var_22_14E : int
        var_26_B6 : int
        var_27_B9 : float
        var_28_BC : float
        var_29_C0 : int
        var_30_10B : double
        var_32_112 : double
        var_34_119 : float
        stack_162_0 : float [generated]
        stack_162_1 : float [generated]
        var_22_160 : int
        var_28_17E : float
        var_27_185 : float
        
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
        var_22_61 = and:int(ldc:int(-1330020937), ldc:int(-1428861252))
        var_24_6B = initobject:Random(Random::<init>, p2:long)
        var_25_87 = add:int(invokevirtual:int(Random::nextInt, var_24_6B:Random, div:int(p13:int, xor:int(ldc:int(107), ldc:int(105)))), div:int(p13:int, xor:int(ldc:int(28), ldc:int(24))))
        
        if (cmpne:boolean(invokevirtual:int(Random::nextInt, var_24_6B:Random, ldc:int(6)), ldc:int(0))) {
            var_22_61 = and:int(var_22_61:int, ldc:int(-1527152757))
            stack_B6_0 = and:int(ldc:int(358), ldc:int(-359))
        }
        else {
            stack_B6_0 = xor:int(ldc:int(80), ldc:int(81))
        }
        
        var_22_14E = and:int(var_22_61:int, ldc:int(1830550687))
        var_26_B6 = stack_B6_0:int
        var_27_B9 = ldc:float(0.0f)
        var_28_BC = ldc:float(0.0f)
        var_29_C0 = p12:int
        
        loop {
            Label_0194:
            
            if (cmpne:boolean(and:int(var_22_14E:int, ldc:int(512)), ldc:int(0))) {
                var_22_14E = and:int(var_22_14E:int, ldc:int(-1985776492))
            }
            else {
                var_22_14E = and:int(var_22_14E:int, ldc:int(-1578340428))
                
                if (cmplt:boolean(var_29_C0:int, p13:int)) {
                    var_30_10B = add:double(ldc:double(1.5), f2d:double(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, div:float(mul:float(ldc:float(3.1415927f), i2f:float(var_29_C0:int)), i2f:float(p13:int))), p9:float)))
                    var_32_112 = mul:double(var_30_10B:double, p14:double)
                    var_34_119 = invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, p11:float)
                    p6 = add:double(p6:double, f2d:double(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, p10:float), var_34_119:float)))
                    p7 = add:double(p7:double, f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, p11:float)))
                    p8 = add:double(p8:double, f2d:double(mul:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, p10:float), var_34_119:float)))
                    stack_162_0 = p11:float
                    
                    if (cmpeq:boolean(var_26_B6:int, ldc:int(0))) {
                        var_22_14E = and:int(var_22_14E:int, ldc:int(-1241100966))
                        stack_162_1 = ldc:float(0.7f)
                    }
                    else {
                        stack_162_1 = ldc:float(0.92f)
                    }
                    
                    var_22_160 = and:int(var_22_14E:int, ldc:int(-1371607193))
                    p11 = mul:float(stack_162_0:float, stack_162_1:float)
                    p11 = add:float(p11:float, mul:float(var_28_BC:float, ldc:float(0.1f)))
                    p10 = add:float(p10:float, mul:float(var_27_B9:float, ldc:float(0.1f)))
                    var_28_17E = mul:float(var_28_BC:float, ldc:float(0.9f))
                    var_27_185 = mul:float(var_27_B9:float, ldc:float(0.75f))
                    var_28_BC = add:float(var_28_17E:float, mul:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_24_6B:Random), invokevirtual:float(Random::nextFloat, var_24_6B:Random)), invokevirtual:float(Random::nextFloat, var_24_6B:Random)), ldc:float(2.0f)))
                    var_27_B9 = add:float(var_27_185:float, mul:float(mul:float(sub:float(invokevirtual:float(Random::nextFloat, var_24_6B:Random), invokevirtual:float(Random::nextFloat, var_24_6B:Random)), invokevirtual:float(Random::nextFloat, var_24_6B:Random)), ldc:float(4.0f)))
                    
                    if (cmpeq:boolean(var_29_C0:int, var_25_87:int)) {
                        if (cmpgt:boolean(p9:float, ldc:float(1.0f))) {
                            invokevirtual:void(\u5140\u9255\ud7e8\ud51e\u6435::\u0a06\u52d3\uc246\u3504\u6c52\ua068, this:\u5140\u9255\ud7e8\ud51e\u6435, p0:\u8aa5\ubded\ub18d\u4f4a\u4f52, p1:Function<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc2e8\u9255\u647c\ud171\ubf56>, invokevirtual:long(Random::nextLong, var_24_6B:Random), p3:int, p4:int, p5:int, p6:double, p7:double, p8:double, add:float(mul:float(invokevirtual:float(Random::nextFloat, var_24_6B:Random), ldc:float(0.5f)), ldc:float(0.5f)), sub:float(p10:float, ldc:float(1.5707964f)), div:float(p11:float, ldc:float(3.0f)), var_29_C0:int, p13:int, ldc:double(1.0), p15:BitSet)
                            invokevirtual:void(\u5140\u9255\ud7e8\ud51e\u6435::\u0a06\u52d3\uc246\u3504\u6c52\ua068, this:\u5140\u9255\ud7e8\ud51e\u6435, p0:\u8aa5\ubded\ub18d\u4f4a\u4f52, p1:Function<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc2e8\u9255\u647c\ud171\ubf56>, invokevirtual:long(Random::nextLong, var_24_6B:Random), p3:int, p4:int, p5:int, p6:double, p7:double, p8:double, add:float(mul:float(invokevirtual:float(Random::nextFloat, var_24_6B:Random), ldc:float(0.5f)), ldc:float(0.5f)), add:float(p10:float, ldc:float(1.5707964f)), div:float(p11:float, ldc:float(3.0f)), var_29_C0:int, p13:int, ldc:double(1.0), p15:BitSet)
                            return:void()
                        }
                    }
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_22_160:int, ldc:int(33554432)), ldc:int(0))) {
                            var_22_160 = and:int(var_22_160:int, ldc:int(1917414705))
                            
                            if (cmpne:boolean(invokevirtual:int(Random::nextInt, var_24_6B:Random, xor:int(ldc:int(18464), ldc:int(18468))), ldc:int(0))) {
                                if (logicalnot:boolean(invokevirtual:boolean(\u5140\u5bc4\u4e72\ud523\u7bad<C>::\u1833\u120d\u71ae\u7043\u983f\ucb79, this:\u5140\u9255\ud7e8\ud51e\u6435[expected:\u5140\u5bc4\u4e72\ud523\u7bad<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>], p4:int, p5:int, p6:double, p8:double, var_29_C0:int, p13:int, p9:float))) {
                                    return:void()
                                }
                                
                                var_22_160 = and:int(var_22_160:int, ldc:int(-1187610913))
                                invokevirtual:boolean(\u5140\u5bc4\u4e72\ud523\u7bad<C>::\ube23\ud158\u7e3f\u965f\u6cfe\uae87, this:\u5140\u9255\ud7e8\ud51e\u6435[expected:\u5140\u5bc4\u4e72\ud523\u7bad<\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937>], p0:\u8aa5\ubded\ub18d\u4f4a\u4f52, p1:Function<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc2e8\u9255\u647c\ud171\ubf56>, p2:long, p3:int, p4:int, p5:int, p6:double, p7:double, p8:double, var_30_10B:double, var_32_112:double, p15:BitSet)
                            }
                        }
                        
                        if (cmpeq:boolean(and:int(var_22_160:int, ldc:int(33554432)), ldc:int(0))) {
                            var_22_14E = and:int(var_22_160:int, ldc:int(1950277318))
                            inc:int(var_29_C0, ldc:int(1))
                            loopcontinue(Label_0194)
                        }
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_22_14E:int, ldc:int(536870912)), ldc:int(0))) {
                return:void()
            }
        }
    }
    
    public boolean \ucfaf\u6c52\u92ee\u120d\u7043\u960f(double p0, double p1, double p2, int p3) {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(cmpgt:boolean(p1:double, ldc:double(-0.7)), cmplt:boolean(add:double(add:double(mul:double(p0:double, p0:double), mul:double(p1:double, p1:double)), mul:double(p2:double, p2:double)), ldc:double(1.0))), and:int(ldc:int(32164), ldc:int(-32743)), and:int(ldc:int(20833), ldc:int(5))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4f4a\u6435\u4c04\uc229\u0c95\u647c(java.util.Random p0, int p1, int p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u183a\u3504\u12b2\ub19c\uc29a p3) {
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
            return:boolean(invokevirtual:boolean(\u5140\u9255\ud7e8\ud51e\u6435::\u4f4a\u6435\u4c04\uc229\u0c95\u647c, this:\u5140\u9255\ud7e8\ud51e\u6435, p0:Random, p1:int, p2:int, checkcast:\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937.class, p3:\u183a\u3504\u12b2\ub19c\uc29a[expected:\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937])))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u960f\u12b2\u71ae\u839e\u7873\u9033(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u8aa5\ubded\ub18d\u4f4a\u4f52 p0, java.util.function.Function p1, java.util.Random p2, int p3, int p4, int p5, int p6, int p7, java.util.BitSet p8, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u183a\u3504\u12b2\ub19c\uc29a p9) {
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
            return:boolean(invokevirtual:boolean(\u5140\u9255\ud7e8\ud51e\u6435::\u960f\u12b2\u71ae\u839e\u7873\u9033, this:\u5140\u9255\ud7e8\ud51e\u6435, p0:\u8aa5\ubded\ub18d\u4f4a\u4f52, p1:Function<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \uc2e8\u9255\u647c\ud171\ubf56>, p2:Random, p3:int, p4:int, p5:int, p6:int, p7:int, p8:BitSet, checkcast:\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937.class, p9:\u183a\u3504\u12b2\ub19c\uc29a[expected:\u59ec\u3dd3\u64ab\uc87f\ucb79\u9937])))
        }
        
        goto(Label_0006)
    }
    
    public void \u6b5f\u0a06\u8389\u7873\u3776\u9937(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_633 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_63E : int
        
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
        var_3_633 = and:int(ldc:int(-839531975), ldc:int(-877662401))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5140\u9255\ud7e8\ud51e\u6435[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4096)), ldc:int(0))) {
            var_3_633 = and:int(var_3_633:int, ldc:int(-542980722))
        }
        else {
            var_3_633 = and:int(var_3_633:int, ldc:int(-68292853))
            var_5_85 = and:int(ldc:int(31396), ldc:int(-31405))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16673), ldc:int(16672)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_633:int, ldc:int(-553794709))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(16416), ldc:int(16417)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(545), ldc:int(6153)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_633 = and:int(var_3_D2:int, ldc:int(-860887073))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(1), ldc:int(8529)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-2071792200))
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1902659215))
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1068478975))
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(401127186))
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1329643992))
                        goto(Label_0824)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-895098069))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0824)
                        }
                    }
                    
                    Label_0399:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1151781568))
                        goto(Label_0824)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-650845104))
                        goto(Label_0661)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-71836775))
                            var_11_E3 = and:int(ldc:int(-11499), ldc:int(11488))
                            goto(Label_1479)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(539622362))
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1419707601))
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1773555861))
                        goto(Label_0824)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1657605409))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-303695907))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0824)
                        }
                    }
                    
                    Label_0661:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1446639687))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1485954559))
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(511010094))
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(558888832))
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1376819810))
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-964920122))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1666358442))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-220217975))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-822746551))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0824:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-698475812))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-470362639))
                        goto(Label_1090)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0661)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1916503886))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-839393521))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(2063), ldc:int(65))
                                goto(Label_1090)
                            }
                        }
                    }
                    
                    Label_0936:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1375)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1414121862))
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1385887032))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(268361475))
                            goto(Label_0824)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-329198930))
                            goto(Label_0661)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-122305875))
                        var_11_E3 = and:int(ldc:int(28804), ldc:int(-28805))
                    }
                    
                    Label_1090:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(764928414))
                        goto(Label_1375)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-762501946))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(1722559129))
                            goto(Label_0936)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0824)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1946932445))
                            goto(Label_0661)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(1751475222))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-391923044))
                            loopcontinue()
                        }
                        
                        var_3_633 = and:int(var_3_633:int, ldc:int(-924463559))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1375)
                            }
                        }
                    }
                    
                    Label_1228:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(787838732))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-447503829))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1090)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1184086512))
                            goto(Label_0936)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0824)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-241747889))
                            goto(Label_0661)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-780233431))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-1193268049))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_633 = and:int(var_3_633:int, ldc:int(-272771379))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1479)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1375:
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(8)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-1896384161))
                        goto(Label_0824)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0661)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_633 = and:int(var_3_633:int, ldc:int(-554696869))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1479:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63E = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1490:
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1375)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-37055561))
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1090)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0936)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(1932334222))
                        goto(Label_0824)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0661)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_633:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_633:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_633 = and:int(var_3_633:int, ldc:int(-856304753))
                        var_17_63E = add:int(var_16_111:int, xor:int(ldc:int(-30672), ldc:int(-30671)))
                        looporswitchbreak()
                    }
                    
                    var_3_633 = and:int(var_3_633:int, ldc:int(-945622813))
                }
                
                var_3_633 = and:int(var_3_633:int, ldc:int(-21629027))
                
                if (cmple:boolean(var_5_85 = var_17_63E:int, sub:int(var_6_8C:int, xor:int(ldc:int(-32760), ldc:int(-32759))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_633:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
