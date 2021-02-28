public class \u6b0d\u12cb\u156b\u4179\u8bb0.\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504 {
    public void \u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504(java.util.UUID p0, int p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u071d\u69d9\u3bc9\u983f\u3c25\u64ab p2, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u6c52\u647c\u3a62\u7af6\u62da\u8bb0 p3, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p4, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p5, int p6) {
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
            invokespecial:Object(Object::<init>, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504)
            putfield:List<String>(\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504::\u8640\u67d0\ub70c\ub19c\u7049\u8c8a, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504, invokestatic:ArrayList[expected:List<String>](Lists::newArrayList))
            putfield:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504::\uf9c5\u5654\u760c\uc3e3\u5245\u7049, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504, invokestatic:HashSet[expected:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>](Sets::newHashSet))
            putfield:UUID(\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504::\uae5d\u47c2\u5654\ub171\u1833\ubf56, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504, p0:UUID)
            putfield:int(\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504::\ub32d\u071d\u516c\u0c95\u624e\ucfaf, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504, p1:int)
            putfield:\u071d\u69d9\u3bc9\u983f\u3c25\u64ab(\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504::\u62da\u47c2\ucfaf\u61a4\u71ae\u5245, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504, p2:\u071d\u69d9\u3bc9\u983f\u3c25\u64ab)
            putfield:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0(\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504::\u416d\ub113\u6c52\ud7e8\u2dcc\u7d52, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504, p3:\u6c52\u647c\u3a62\u7af6\u62da\u8bb0)
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504::\u64f2\u93a2\ucb79\u36d3\ub6ab\ud36e, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504, p4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504::\ubb2b\u0a06\u7e3f\u8cae\u6198\ub8be, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504, p5:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            putfield:int(\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504::\u6bb9\u7006\u52d3\u4c2b\u7af6\u5bc4, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504, p6:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8df4\u3bd6\u69d9\u6ec6\u8d98\uc4d2(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_5F : int
        stack_98_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(2096995011), ldc:int(2127429330))
            
            if (logicaland:boolean(cmpne:boolean(getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504::\u64f2\u93a2\ucb79\u36d3\ub6ab\ud36e, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504), aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()), invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::equals, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504::\u64f2\u93a2\ucb79\u36d3\ub6ab\ud36e, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object]))) {
                stack_98_0 = xor:int(ldc:int(7172), ldc:int(7173))
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(2129974981))
                stack_98_0 = and:int(ldc:int(11801), ldc:int(-11802))
            }
            
            return:boolean(stack_98_0:int)
        }
        
        goto(Label_0006)
    }
    
    public java.util.UUID \uc2e8\u873d\u647c\u92ff\u156b\u0a06() {
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
            return:UUID(getfield:UUID(\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504::\uae5d\u47c2\u5654\ub171\u1833\ubf56, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \uc9f6\uf995\u7330\uf995\u4c2b\u3776() {
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
            return:String(invokestatic:String(\u4e72\u600f\u8258\u7ce1\u8413\uafe7::\u8c8a\ua3b4\u97e6\u760c\u62da\u760c, getfield:UUID(\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504::\uae5d\u47c2\u5654\ub171\u1833\ubf56, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504::\uc9f6\uf995\u7330\uf995\u4c2b\u3776, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ufe34\u6d69\u67e9\ubb2b\u8308\ucb79() {
        var_1_5F : int
        stack_86_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-2029666709), ldc:int(-682099077))
            
            if (cmpeq:boolean(getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504::\ubb2b\u0a06\u7e3f\u8cae\u6198\ub8be, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504), aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-144834818))
                stack_86_0 = and:int(ldc:int(-3782), ldc:int(3781))
            }
            else {
                stack_86_0 = and:int(ldc:int(3105), ldc:int(129))
            }
            
            return:boolean(stack_86_0:int)
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
    
    public void \uceb8\ud51e\uc910\uc7fe\u12cb\u51b2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5DA : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5E5 : int
        
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
        var_3_5DA = and:int(ldc:int(-1502690575), ldc:int(-1208065346))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u51b2\u7bad\ub1b9\ufcaf\ub1b9\u3504[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16384)), ldc:int(0))) {
            var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1174562648))
        }
        else {
            var_3_5DA = and:int(var_3_5DA:int, ldc:int(796910259))
            var_5_85 = and:int(ldc:int(-23893), ldc:int(3412))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-28634), ldc:int(12233)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5DA:int, ldc:int(1735388088))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(1280), ldc:int(1281)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-30655), ldc:int(-30656)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5DA = and:int(var_3_D2:int, ldc:int(-1225823280))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(66), ldc:int(67)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-766457462))
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-351784424))
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-446744333))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-40292221))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-614261465))
                    }
                    else {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(2146360989))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(388356498))
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(406281402))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(914033886))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1944642907))
                            loopcontinue()
                        }
                        
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1073823076))
                        var_11_E3 = and:int(ldc:int(10040), ldc:int(-14137))
                        goto(Label_1401)
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-401061169))
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1620098738))
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(159032453))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1860161509))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1631924322))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1058503456))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1793638980))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1083213872))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1965665680))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(2018744540))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1176323867))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1768245543))
                            loopcontinue()
                        }
                        
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-16878926))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1503590633))
                        goto(Label_1281)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1064258290))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(849), ldc:int(21513))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1821327948))
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(608223723))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(479783636))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(-437223560))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(804219830))
                        var_11_E3 = and:int(ldc:int(6932), ldc:int(-16277))
                    }
                    
                    Label_1035:
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1412)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1209936789))
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1307305538))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(-2141767155))
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(282330498))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1825959566))
                            loopcontinue()
                        }
                        
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(670984159))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1281)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1477787457))
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1035)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(1618506068))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(1563805601))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5DA = and:int(var_3_5DA:int, ldc:int(-424104117))
                            loopcontinue()
                        }
                        
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-269526020))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1401)
                    }
                    
                    Label_1281:
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1780102852))
                        goto(Label_1412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(1357090465))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1097786861))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5DA = and:int(var_3_5DA:int, ldc:int(1744820210))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1401:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E5 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1412:
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-534212047))
                        goto(Label_1281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(-1650156384))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DA = and:int(var_3_5DA:int, ldc:int(661609108))
                        var_17_5E5 = add:int(var_16_111:int, xor:int(ldc:int(8368), ldc:int(8369)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5DA = and:int(var_3_5DA:int, ldc:int(654205877))
                
                if (cmple:boolean(var_5_85 = var_17_5E5:int, sub:int(var_6_8C:int, xor:int(ldc:int(579), ldc:int(578))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5DA:int, ldc:int(536870912)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
