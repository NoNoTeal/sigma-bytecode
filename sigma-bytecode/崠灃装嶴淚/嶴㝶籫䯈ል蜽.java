public class \u5d20\u7043\u88c5\u5db4\uf94d.\u5db4\u3776\u7c6b\u4bc8\u120d\u873d {
    public void \u5db4\u3776\u7c6b\u4bc8\u120d\u873d(int[] p0) {
        var_4_91 : int
        var_5_9A : int
        var_6_BA : int
        var_7_CB : float
        var_8_DC : float
        var_9_ED : float
        
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
            invokespecial:Object(Object::<init>, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            putfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u69d9\ucb79\ubff1\u8d90\ud7e8\uc87f, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d, ldc:float(3.4028235E38f))
            putfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\uc2e8\u5654\u4179\u3c25\u5245\uae5d, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d, ldc:float(3.4028235E38f))
            putfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\ua6bd\u6435\ub83f\u0800\u7006\u3711, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d, ldc:float(3.4028235E38f))
            putfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u3504\u8aa5\u9255\ucb79\u52d3\u5245, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d, ldc:float(-3.4028235E38f))
            putfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\uff55\u2dcc\u385b\ub102\u6435\u8413, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d, ldc:float(-3.4028235E38f))
            putfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u59ec\u4492\u0800\u76bc\u1833\u6d99, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d, ldc:float(-3.4028235E38f))
            var_4_91 = div:int(arraylength:int(p0:int[]), xor:int(ldc:int(139), ldc:int(143)))
            var_5_9A = and:int(ldc:int(6786), ldc:int(-7811))
            
            while (cmplt:boolean(var_5_9A:int, xor:int(ldc:int(6211), ldc:int(6215)))) {
                var_6_BA = mul:int(var_5_9A:int, var_4_91:int)
                var_7_CB = invokestatic:float(Float::intBitsToFloat, loadelement:int(p0:int[], add:int(var_6_BA:int, and:int(ldc:int(-25623), ldc:int(25622)))))
                var_8_DC = invokestatic:float(Float::intBitsToFloat, loadelement:int(p0:int[], add:int(var_6_BA:int, and:int(ldc:int(3077), ldc:int(225)))))
                var_9_ED = invokestatic:float(Float::intBitsToFloat, loadelement:int(p0:int[], add:int(var_6_BA:int, and:int(ldc:int(8226), ldc:int(18966)))))
                
                if (cmpgt:boolean(getfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u69d9\ucb79\ubff1\u8d90\ud7e8\uc87f, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d), var_7_CB:float)) {
                    putfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u69d9\ucb79\ubff1\u8d90\ud7e8\uc87f, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d, var_7_CB:float)
                }
                
                if (cmpgt:boolean(getfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\uc2e8\u5654\u4179\u3c25\u5245\uae5d, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d), var_8_DC:float)) {
                    putfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\uc2e8\u5654\u4179\u3c25\u5245\uae5d, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d, var_8_DC:float)
                }
                
                if (cmpgt:boolean(getfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\ua6bd\u6435\ub83f\u0800\u7006\u3711, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d), var_9_ED:float)) {
                    putfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\ua6bd\u6435\ub83f\u0800\u7006\u3711, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d, var_9_ED:float)
                }
                
                if (cmplt:boolean(getfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u3504\u8aa5\u9255\ucb79\u52d3\u5245, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d), var_7_CB:float)) {
                    putfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u3504\u8aa5\u9255\ucb79\u52d3\u5245, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d, var_7_CB:float)
                }
                
                if (cmplt:boolean(getfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\uff55\u2dcc\u385b\ub102\u6435\u8413, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d), var_8_DC:float)) {
                    putfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\uff55\u2dcc\u385b\ub102\u6435\u8413, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d, var_8_DC:float)
                }
                
                if (cmplt:boolean(getfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u59ec\u4492\u0800\u76bc\u1833\u6d99, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d), var_9_ED:float)) {
                    putfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u59ec\u4492\u0800\u76bc\u1833\u6d99, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d, var_9_ED:float)
                }
                
                inc:int(var_5_9A, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public float \u7873\u6d99\u67d0\u7330\u3711\u67d0() {
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
            return:float(getfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u69d9\ucb79\ubff1\u8d90\ud7e8\uc87f, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d))
        }
        
        goto(Label_0006)
    }
    
    public float \ud36e\ub18d\u8bb0\u51b2\u6d99\u98a4() {
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
            return:float(getfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\uc2e8\u5654\u4179\u3c25\u5245\uae5d, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d))
        }
        
        goto(Label_0006)
    }
    
    public float \u7c6b\u5d20\uf995\u8413\u0a06\u4179() {
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
            return:float(getfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\ua6bd\u6435\ub83f\u0800\u7006\u3711, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d))
        }
        
        goto(Label_0006)
    }
    
    public float \ub19c\uc84e\u624e\u92ff\u6fb0\u47c2() {
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
            return:float(getfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u3504\u8aa5\u9255\ucb79\u52d3\u5245, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d))
        }
        
        goto(Label_0006)
    }
    
    public float \u5245\u0a06\u3e75\uc2e8\u836c\ud217() {
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
            return:float(getfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\uff55\u2dcc\u385b\ub102\u6435\u8413, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d))
        }
        
        goto(Label_0006)
    }
    
    public float \u8d90\u6b5f\uc87f\u97e6\ube23\ua562() {
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
            return:float(getfield:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u59ec\u4492\u0800\u76bc\u1833\u6d99, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7ce1\u927d\u4c2b\uf94d\uafe7\ud171(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p0) {
        var_2_B0 : int
        var_4_9C : float
        var_2_DD : int
        var_5_E2 : float
        var_2_6C7 : int
        var_6_11D : float
        stack_6E2_0 : int [generated]
        
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
            var_2_B0 = and:int(and:int(ldc:int(1598768373), ldc:int(1188914103)), ldc:int(390289183))
            
            switch (loadelement:int(getstatic:int[](\u446c\uc246\u92ff\u9937\u3d64\ud217::\u12cb\u8389\ud158\u88c5\ubcb0\u7006), invokevirtual:int(Enum<E>::ordinal, p0:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>]))) {
                case 1:
                    var_4_9C = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\ud36e\ub18d\u8bb0\u51b2\u6d99\u98a4, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
                    looporswitchbreak()
                
                case 2:
                    var_4_9C = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\ud36e\ub18d\u8bb0\u51b2\u6d99\u98a4, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
                    goto(Label_0378)
                
                case 3:
                    var_4_9C = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u7c6b\u5d20\uf995\u8413\u0a06\u4179, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
                    goto(Label_0606)
                
                case 4:
                    var_4_9C = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u7c6b\u5d20\uf995\u8413\u0a06\u4179, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
                    goto(Label_0842)
                
                case 5:
                    var_4_9C = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u7873\u6d99\u67d0\u7330\u3711\u67d0, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
                    goto(Label_1062)
                
                case 6:
                    var_4_9C = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u7873\u6d99\u67d0\u7330\u3711\u67d0, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
                    goto(Label_1306)
                
                default:
                    return:boolean(and:int[expected:boolean](ldc:int(-1986), ldc:int(1985)))
            }
            
            Label_0158:
            
            if (cmpeq:boolean(and:int(var_2_B0:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_1306)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(-1325940053))
                goto(Label_1062)
            }
            
            if (cmpeq:boolean(and:int(var_2_B0:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(-416129645))
                goto(Label_0842)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(729564182))
                goto(Label_0606)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0378)
            }
            
            var_2_DD = and:int(var_2_B0:int, ldc:int(1178816721))
            var_5_E2 = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u5245\u0a06\u3e75\uc2e8\u836c\ud217, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            Label_0228:
            
            if (cmpeq:boolean(and:int(var_2_DD:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_1368)
            }
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(8192)), ldc:int(0))) {
                var_2_DD = and:int(var_2_DD:int, ldc:int(-73324031))
                goto(Label_1148)
            }
            
            if (cmpeq:boolean(and:int(var_2_DD:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0904)
            }
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_DD = and:int(var_2_DD:int, ldc:int(1654608813))
                goto(Label_0676)
            }
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0456)
            }
            
            var_2_6C7 = and:int(var_2_DD:int, ldc:int(-1356737135))
            var_6_11D = ldc:float(0.0f)
            Label_0287:
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(16)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-712715520))
                goto(Label_1658)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_1548)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_1435)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-1713449559))
                goto(Label_1215)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(32768)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(1375137133))
                goto(Label_0963)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0735)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(16384)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(105077495))
                goto(Label_1540)
            }
            
            goto(Label_0523)
            Label_0378:
            
            if (cmpeq:boolean(and:int(var_2_B0:int, ldc:int(33554432)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(1492623230))
                goto(Label_1306)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(512)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(-1029919332))
                goto(Label_1062)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0842)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(32768)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(1087240154))
                goto(Label_0606)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(8192)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(2122711208))
                goto(Label_0158)
            }
            
            var_2_DD = and:int(var_2_B0:int, ldc:int(1444923159))
            var_5_E2 = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u5245\u0a06\u3e75\uc2e8\u836c\ud217, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            Label_0456:
            
            if (cmpeq:boolean(and:int(var_2_DD:int, ldc:int(65536)), ldc:int(0))) {
                var_2_DD = and:int(var_2_DD:int, ldc:int(1420044780))
                goto(Label_1368)
            }
            
            if (cmpeq:boolean(and:int(var_2_DD:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_1148)
            }
            
            if (cmpeq:boolean(and:int(var_2_DD:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0904)
            }
            
            if (cmpeq:boolean(and:int(var_2_DD:int, ldc:int(1)), ldc:int(0))) {
                var_2_DD = and:int(var_2_DD:int, ldc:int(-268346436))
                goto(Label_0676)
            }
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(32768)), ldc:int(0))) {
                var_2_DD = and:int(var_2_DD:int, ldc:int(-2107981572))
                goto(Label_0228)
            }
            
            var_2_6C7 = and:int(var_2_DD:int, ldc:int(-16811533))
            var_6_11D = ldc:float(1.0f)
            Label_0523:
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_1658)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_1548)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_1435)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(16)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(736716489))
                goto(Label_1215)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0963)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(1048576)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(712155660))
                goto(Label_0735)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(645363803))
                goto(Label_1540)
            }
            
            goto(Label_0287)
            Label_0606:
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(1834265563))
                goto(Label_1306)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_1062)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0842)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(256)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(-761666781))
                goto(Label_0378)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(8)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(-1311166029))
                goto(Label_0158)
            }
            
            var_2_DD = and:int(var_2_B0:int, ldc:int(794256893))
            var_5_E2 = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u8d90\u6b5f\uc87f\u97e6\ube23\ua562, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            Label_0676:
            
            if (cmpeq:boolean(and:int(var_2_DD:int, ldc:int(1)), ldc:int(0))) {
                var_2_DD = and:int(var_2_DD:int, ldc:int(-463397192))
                goto(Label_1368)
            }
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_1148)
            }
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(4096)), ldc:int(0))) {
                var_2_DD = and:int(var_2_DD:int, ldc:int(-229181098))
                goto(Label_0904)
            }
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0456)
            }
            
            if (cmpeq:boolean(and:int(var_2_DD:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0228)
            }
            
            var_2_6C7 = and:int(var_2_DD:int, ldc:int(2008382513))
            var_6_11D = ldc:float(0.0f)
            Label_0735:
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-1928688819))
                goto(Label_1658)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(65536)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(365115440))
                goto(Label_1548)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_1435)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_1215)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(65536)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-210550020))
                goto(Label_0963)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(1048576)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(2040890096))
                goto(Label_0523)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(16384)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-379856240))
                goto(Label_0287)
            }
            
            var_2_6C7 = and:int(var_2_6C7:int, ldc:int(1065579987))
            goto(Label_1540)
            Label_0842:
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(8192)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(-1218427875))
                goto(Label_1306)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_1062)
            }
            
            if (cmpeq:boolean(and:int(var_2_B0:int, ldc:int(16)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(226336557))
                goto(Label_0606)
            }
            
            if (cmpeq:boolean(and:int(var_2_B0:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0378)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0158)
            }
            
            var_2_DD = and:int(var_2_B0:int, ldc:int(-1084139913))
            var_5_E2 = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u8d90\u6b5f\uc87f\u97e6\ube23\ua562, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            Label_0904:
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(1048576)), ldc:int(0))) {
                var_2_DD = and:int(var_2_DD:int, ldc:int(-2006517895))
                goto(Label_1368)
            }
            
            if (cmpeq:boolean(and:int(var_2_DD:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_1148)
            }
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(256)), ldc:int(0))) {
                var_2_DD = and:int(var_2_DD:int, ldc:int(-1361292907))
                goto(Label_0676)
            }
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0456)
            }
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0228)
            }
            
            var_2_6C7 = and:int(var_2_DD:int, ldc:int(-555527727))
            var_6_11D = ldc:float(1.0f)
            Label_0963:
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_1658)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(65536)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-1540167410))
                goto(Label_1548)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(32768)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-295721239))
                goto(Label_1435)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_1215)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(65536)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-1331116334))
                goto(Label_0735)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0523)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(16384)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-1163150392))
                goto(Label_0287)
            }
            
            var_2_6C7 = and:int(var_2_6C7:int, ldc:int(1455782963))
            goto(Label_1540)
            Label_1062:
            
            if (cmpeq:boolean(and:int(var_2_B0:int, ldc:int(33554432)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(166476854))
                goto(Label_1306)
            }
            
            if (cmpeq:boolean(and:int(var_2_B0:int, ldc:int(65536)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(13610049))
                goto(Label_0842)
            }
            
            if (cmpeq:boolean(and:int(var_2_B0:int, ldc:int(1)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(-115072590))
                goto(Label_0606)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(1048576)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(-851324270))
                goto(Label_0378)
            }
            
            if (cmpeq:boolean(and:int(var_2_B0:int, ldc:int(65536)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(-909502726))
                goto(Label_0158)
            }
            
            var_2_DD = and:int(var_2_B0:int, ldc:int(-696791585))
            var_5_E2 = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\ub19c\uc84e\u624e\u92ff\u6fb0\u47c2, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            Label_1148:
            
            if (cmpeq:boolean(and:int(var_2_DD:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_1368)
            }
            
            if (cmpeq:boolean(and:int(var_2_DD:int, ldc:int(16)), ldc:int(0))) {
                var_2_DD = and:int(var_2_DD:int, ldc:int(49616015))
                goto(Label_0904)
            }
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0676)
            }
            
            if (cmpeq:boolean(and:int(var_2_DD:int, ldc:int(65536)), ldc:int(0))) {
                var_2_DD = and:int(var_2_DD:int, ldc:int(734955412))
                goto(Label_0456)
            }
            
            if (cmpeq:boolean(and:int(var_2_DD:int, ldc:int(16384)), ldc:int(0))) {
                var_2_DD = and:int(var_2_DD:int, ldc:int(1267663263))
                goto(Label_0228)
            }
            
            var_2_6C7 = and:int(var_2_DD:int, ldc:int(645004889))
            var_6_11D = ldc:float(0.0f)
            Label_1215:
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_1658)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-2040246892))
                goto(Label_1548)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_1435)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0963)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(16384)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-1990177240))
                goto(Label_0735)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(8192)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(879652418))
                goto(Label_0523)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(8192)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-159911559))
                goto(Label_1540)
            }
            
            goto(Label_0287)
            Label_1306:
            
            if (cmpeq:boolean(and:int(var_2_B0:int, ldc:int(16384)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(-1784580806))
                goto(Label_1062)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0842)
            }
            
            if (cmpeq:boolean(and:int(var_2_B0:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0606)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0378)
            }
            
            if (cmpne:boolean(and:int(var_2_B0:int, ldc:int(1048576)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_B0:int, ldc:int(132683810))
                goto(Label_0158)
            }
            
            var_2_DD = and:int(var_2_B0:int, ldc:int(1717920249))
            var_5_E2 = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\ub19c\uc84e\u624e\u92ff\u6fb0\u47c2, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            Label_1368:
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_DD = and:int(var_2_DD:int, ldc:int(-1911265077))
                goto(Label_1148)
            }
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0904)
            }
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0676)
            }
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(512)), ldc:int(0))) {
                var_2_DD = and:int(var_2_DD:int, ldc:int(-276072856))
                goto(Label_0456)
            }
            
            if (cmpne:boolean(and:int(var_2_DD:int, ldc:int(8192)), ldc:int(0))) {
                var_2_DD = and:int(var_2_DD:int, ldc:int(1905191229))
                goto(Label_0228)
            }
            
            var_2_6C7 = and:int(var_2_DD:int, ldc:int(-148022823))
            var_6_11D = ldc:float(1.0f)
            Label_1435:
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_1658)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(32768)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-369148860))
                goto(Label_1548)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(892747017))
                goto(Label_1215)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(67108864)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(783170105))
                goto(Label_0963)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0735)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(512)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(1012527460))
                goto(Label_0523)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0287)
            }
            
            var_2_6C7 = and:int(var_2_6C7:int, ldc:int(2003435379))
            Label_1540:
            
            if (cmpne:boolean(var_4_9C:float, var_6_11D:float)) {
                return:boolean(and:int[expected:boolean](ldc:int(-17540), ldc:int(17539)))
            }
            
            Label_1548:
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(537949552))
            }
            else {
                if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_1435)
                }
                
                if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(256)), ldc:int(0))) {
                    var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-1386990912))
                    goto(Label_1215)
                }
                
                if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(256)), ldc:int(0))) {
                    var_2_6C7 = and:int(var_2_6C7:int, ldc:int(1784577139))
                    goto(Label_0963)
                }
                
                if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_6C7 = and:int(var_2_6C7:int, ldc:int(1585668466))
                    goto(Label_0735)
                }
                
                if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(1)), ldc:int(0))) {
                    var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-1086581137))
                    goto(Label_0523)
                }
                
                if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-1324518130))
                    goto(Label_0287)
                }
                
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(1475174037))
                
                if (cmpne:boolean(var_5_E2:float, var_6_11D:float)) {
                    return:boolean(and:int[expected:boolean](ldc:int(-17540), ldc:int(17539)))
                }
            }
            
            Label_1658:
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-557309596))
                goto(Label_1548)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_1435)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_1215)
            }
            
            if (cmpeq:boolean(and:int(var_2_6C7:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0963)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(1048576)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-998179447))
                goto(Label_0735)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-754283881))
                goto(Label_0523)
            }
            
            if (cmpne:boolean(and:int(var_2_6C7:int, ldc:int(33554432)), ldc:int(0))) {
                var_2_6C7 = and:int(var_2_6C7:int, ldc:int(-832454307))
                stack_6E2_0 = xor:int[expected:boolean](ldc:int(-14334), ldc:int(-14333))
                return:boolean(stack_6E2_0:boolean)
            }
            
            goto(Label_0287)
            stack_6E2_0 = and:int[expected:boolean](ldc:int(-17540), ldc:int(17539))
            return:boolean(stack_6E2_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public boolean \u6c52\ud36e\u446c\u965f\uceb8\u5140(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p0) {
        var_2_64 : int
        var_4_9C : float
        var_2_B0 : int
        var_5_B5 : float
        var_2_C2 : int
        var_2_D9 : int
        var_6_DE : float
        var_2_F2 : int
        var_2_42D : int
        var_7_FF : float
        stack_449_0 : int [generated]
        
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
            var_2_64 = and:int(and:int(ldc:int(-1150106694), ldc:int(-1346737301)), ldc:int(-680329284))
            
            switch (loadelement:int(getstatic:int[](\u446c\uc246\u92ff\u9937\u3d64\ud217::\u12cb\u8389\ud158\u88c5\ubcb0\u7006), invokevirtual:int(Enum<E>::ordinal, p0:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>]))) {
                case 1:
                case 2:
                    var_4_9C = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u7873\u6d99\u67d0\u7330\u3711\u67d0, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
                    looporswitchbreak()
                
                case 3:
                case 4:
                    var_4_9C = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u7873\u6d99\u67d0\u7330\u3711\u67d0, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
                    goto(Label_0365)
                
                case 5:
                case 6:
                    var_4_9C = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\ud36e\ub18d\u8bb0\u51b2\u6d99\u98a4, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
                    goto(Label_0580)
                
                default:
                    return:boolean(and:int[expected:boolean](ldc:int(5565), ldc:int(-6078)))
            }
            
            Label_0158:
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0580)
            }
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0365)
            }
            
            var_2_B0 = and:int(var_2_64:int, ldc:int(-1879084280))
            var_5_B5 = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\ub19c\uc84e\u624e\u92ff\u6fb0\u47c2, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            Label_0183:
            
            if (cmpeq:boolean(and:int(var_2_B0:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_C2 = and:int(var_2_B0:int, ldc:int(-1400796776))
                goto(Label_0615)
            }
            
            if (cmpeq:boolean(and:int(var_2_B0:int, ldc:int(16384)), ldc:int(0))) {
                var_2_C2 = and:int(var_2_B0:int, ldc:int(-1681810644))
                goto(Label_0398)
            }
            
            var_2_D9 = and:int(var_2_B0:int, ldc:int(-1388684612))
            var_6_DE = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u7c6b\u5d20\uf995\u8413\u0a06\u4179, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            Label_0224:
            
            if (cmpne:boolean(and:int(var_2_D9:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0650)
            }
            
            if (cmpne:boolean(and:int(var_2_D9:int, ldc:int(4)), ldc:int(0))) {
                var_2_F2 = and:int(var_2_D9:int, ldc:int(-530234763))
                goto(Label_0439)
            }
            
            var_2_42D = and:int(var_2_D9:int, ldc:int(-471338230))
            var_7_FF = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u8d90\u6b5f\uc87f\u97e6\ube23\ua562, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            Label_0257:
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(131072)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(-614223835))
                goto(Label_1012)
            }
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(-230886521))
                goto(Label_0920)
            }
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(446271383))
                goto(Label_0855)
            }
            
            if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(264145543))
                goto(Label_0762)
            }
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(-1100526014))
                goto(Label_0686)
            }
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(512)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(-1501296741))
                goto(Label_0480)
            }
            
            var_2_42D = and:int(var_2_42D:int, ldc:int(-1041243383))
            goto(Label_0755)
            Label_0365:
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(131072)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(-85573689))
                goto(Label_0580)
            }
            
            if (cmpne:boolean(and:int(var_2_64:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0158)
            }
            
            var_2_C2 = and:int(var_2_64:int, ldc:int(-43554228))
            var_5_B5 = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\ub19c\uc84e\u624e\u92ff\u6fb0\u47c2, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            Label_0398:
            
            if (cmpeq:boolean(and:int(var_2_C2:int, ldc:int(131072)), ldc:int(0))) {
                var_2_C2 = and:int(var_2_C2:int, ldc:int(-1294116690))
                goto(Label_0615)
            }
            
            if (cmpeq:boolean(and:int(var_2_C2:int, ldc:int(16384)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_C2:int, ldc:int(1027344455))
                goto(Label_0183)
            }
            
            var_2_F2 = and:int(var_2_C2:int, ldc:int(-885301348))
            var_6_DE = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\ud36e\ub18d\u8bb0\u51b2\u6d99\u98a4, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            Label_0439:
            
            if (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(8)), ldc:int(0))) {
                var_2_D9 = and:int(var_2_F2:int, ldc:int(-1349835669))
                goto(Label_0650)
            }
            
            if (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(16384)), ldc:int(0))) {
                var_2_D9 = and:int(var_2_F2:int, ldc:int(-748135926))
                goto(Label_0224)
            }
            
            var_2_42D = and:int(var_2_F2:int, ldc:int(-2123672676))
            var_7_FF = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u5245\u0a06\u3e75\uc2e8\u836c\ud217, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            Label_0480:
            
            if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(65536)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(-1142722448))
                goto(Label_1012)
            }
            
            if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(4)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(-1992313539))
                goto(Label_0920)
            }
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0855)
            }
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(1528250826))
                goto(Label_0762)
            }
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(16384)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(430526131))
                goto(Label_0686)
            }
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(16384)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(1339883125))
                goto(Label_0257)
            }
            
            var_2_42D = and:int(var_2_42D:int, ldc:int(-1792119240))
            goto(Label_0755)
            Label_0580:
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0365)
            }
            
            if (cmpeq:boolean(and:int(var_2_64:int, ldc:int(16384)), ldc:int(0))) {
                var_2_64 = and:int(var_2_64:int, ldc:int(-1692317400))
                goto(Label_0158)
            }
            
            var_2_C2 = and:int(var_2_64:int, ldc:int(-843429975))
            var_5_B5 = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u5245\u0a06\u3e75\uc2e8\u836c\ud217, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            Label_0615:
            
            if (cmpne:boolean(and:int(var_2_C2:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0398)
            }
            
            if (cmpeq:boolean(and:int(var_2_C2:int, ldc:int(16384)), ldc:int(0))) {
                var_2_B0 = and:int(var_2_C2:int, ldc:int(8597741))
                goto(Label_0183)
            }
            
            var_2_D9 = and:int(var_2_C2:int, ldc:int(-2025890292))
            var_6_DE = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u7c6b\u5d20\uf995\u8413\u0a06\u4179, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            Label_0650:
            
            if (cmpne:boolean(and:int(var_2_D9:int, ldc:int(64)), ldc:int(0))) {
                var_2_F2 = and:int(var_2_D9:int, ldc:int(2068358826))
                goto(Label_0439)
            }
            
            if (cmpeq:boolean(and:int(var_2_D9:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0224)
            }
            
            var_2_42D = and:int(var_2_D9:int, ldc:int(-1918449057))
            var_7_FF = invokevirtual:float(\u5db4\u3776\u7c6b\u4bc8\u120d\u873d::\u8d90\u6b5f\uc87f\u97e6\ube23\ua562, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d)
            Label_0686:
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_1012)
            }
            
            if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0920)
            }
            
            if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0855)
            }
            
            if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0762)
            }
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0480)
            }
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0257)
            }
            
            var_2_42D = and:int(var_2_42D:int, ldc:int(-1687263302))
            Label_0755:
            
            if (cmpne:boolean(var_4_9C:float, ldc:float(0.0f))) {
                return:boolean(and:int[expected:boolean](ldc:int(-4300), ldc:int(4299)))
            }
            
            Label_0762:
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(131072)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(469720847))
                goto(Label_1012)
            }
            
            if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0920)
            }
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(408010754))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(8)), ldc:int(0))) {
                    var_2_42D = and:int(var_2_42D:int, ldc:int(604877369))
                    goto(Label_0686)
                }
                
                if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0480)
                }
                
                if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(64)), ldc:int(0))) {
                    var_2_42D = and:int(var_2_42D:int, ldc:int(438143865))
                    goto(Label_0257)
                }
                
                var_2_42D = and:int(var_2_42D:int, ldc:int(-310971633))
                
                if (cmpne:boolean(var_5_B5:float, ldc:float(1.0f))) {
                    return:boolean(and:int[expected:boolean](ldc:int(-4300), ldc:int(4299)))
                }
            }
            
            Label_0855:
            
            if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_1012)
            }
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(131072)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(1640428529))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0762)
                }
                
                if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0686)
                }
                
                if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0480)
                }
                
                if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0257)
                }
                
                var_2_42D = and:int(var_2_42D:int, ldc:int(-1884301682))
                
                if (cmpne:boolean(var_6_DE:float, ldc:float(0.0f))) {
                    return:boolean(and:int[expected:boolean](ldc:int(-4300), ldc:int(4299)))
                }
            }
            
            Label_0920:
            
            if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(64)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(-1630690777))
            }
            else {
                if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_42D = and:int(var_2_42D:int, ldc:int(1200999800))
                    goto(Label_0855)
                }
                
                if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0762)
                }
                
                if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_42D = and:int(var_2_42D:int, ldc:int(686091840))
                    goto(Label_0686)
                }
                
                if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0480)
                }
                
                if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_42D = and:int(var_2_42D:int, ldc:int(643703761))
                    goto(Label_0257)
                }
                
                var_2_42D = and:int(var_2_42D:int, ldc:int(-43092465))
                
                if (cmpne:boolean(var_7_FF:float, ldc:float(1.0f))) {
                    return:boolean(and:int[expected:boolean](ldc:int(-4300), ldc:int(4299)))
                }
            }
            
            Label_1012:
            
            if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0920)
            }
            
            if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0855)
            }
            
            if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_0762)
            }
            
            if (cmpne:boolean(and:int(var_2_42D:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(-989536944))
                goto(Label_0686)
            }
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0480)
            }
            
            if (cmpeq:boolean(and:int(var_2_42D:int, ldc:int(65536)), ldc:int(0))) {
                var_2_42D = and:int(var_2_42D:int, ldc:int(-1249980883))
                stack_449_0 = xor:int[expected:boolean](ldc:int(14337), ldc:int(14336))
                return:boolean(stack_449_0:boolean)
            }
            
            goto(Label_0257)
            stack_449_0 = and:int[expected:boolean](ldc:int(-4300), ldc:int(4299))
            return:boolean(stack_449_0:boolean[expected:int])
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
    
    public void \u839e\u3d4b\u5bc4\u3dd3\u67e9\u7af6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66B : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_676 : int
        
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
        var_3_66B = and:int(ldc:int(223014325), ldc:int(1568472892))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5db4\u3776\u7c6b\u4bc8\u120d\u873d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
            var_3_66B = and:int(var_3_66B:int, ldc:int(523153311))
            var_5_80 = and:int(ldc:int(-9158), ldc:int(8773))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-14620), ldc:int(14619)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_66B:int, ldc:int(-581255747))
                    var_9_C6 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_87:int, xor:int(ldc:int(6401), ldc:int(6400)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, xor:int(ldc:int(12322), ldc:int(12323)))), var_7_96:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_66B = and:int(var_3_D8:int, ldc:int(794476341))
                    var_14_113 = var_7_96:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(2115), ldc:int(12349)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_87:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1652044572))
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-252658472))
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1563078142))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0555)
                            }
                            
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0385:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-965803634))
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(877877881))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-2085364602))
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2138742998))
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-348475807))
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(798944692))
                            var_11_E9 = and:int(ldc:int(-680), ldc:int(679))
                            goto(Label_1506)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0555:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1399817405))
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-288278555))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(61154804))
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-229061909))
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1768391338))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1293876503))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0683:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-2013121561))
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-102464964))
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-910478211))
                            goto(Label_0555)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(556383859))
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-819020356))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0806:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-246027538))
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2135896210))
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(344879093))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1355276542))
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1915027617))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E9 = xor:int(ldc:int(4768), ldc:int(4769))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0926:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-730871964))
                        goto(Label_1368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2020921036))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-108420546))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1472601335))
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1356689143))
                            goto(Label_0555)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-799728305))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-37818883))
                        var_11_E9 = and:int(ldc:int(-8014), ldc:int(8009))
                    }
                    
                    Label_1101:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-406937808))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0926)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1933219089))
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-862739634))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-820204234))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1368)
                            }
                        }
                    }
                    
                    Label_1213:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-197592796))
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1101)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-473496950))
                            goto(Label_0926)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1885849425))
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-47082036))
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1579706485))
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1996832568))
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-26334535))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(254737693))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_80:int, var_16_117:int)
                        goto(Label_1506)
                    }
                    
                    Label_1368:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-2042842481))
                        goto(Label_1101)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(35973728))
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1549530666))
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1306407753))
                        goto(Label_0683)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1986130377))
                        goto(Label_0555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66B = and:int(var_3_66B:int, ldc:int(-36770370))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1506:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_676 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1517:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-931362561))
                        goto(Label_1368)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2061480021))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(727693817))
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1398433539))
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1655754589))
                        goto(Label_0385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1565437852))
                        var_17_676 = add:int(var_16_117:int, xor:int(ldc:int(-8176), ldc:int(-8175)))
                        looporswitchbreak()
                    }
                    
                    var_3_66B = and:int(var_3_66B:int, ldc:int(-412165035))
                }
                
                var_3_66B = and:int(var_3_66B:int, ldc:int(-546701482))
                
                if (cmple:boolean(var_5_80 = var_17_676:int, sub:int(var_6_87:int, and:int(ldc:int(8193), ldc:int(2181))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
            var_3_66B = and:int(var_3_66B:int, ldc:int(-1671708879))
            goto(Label_0108)
        }
    }
}
