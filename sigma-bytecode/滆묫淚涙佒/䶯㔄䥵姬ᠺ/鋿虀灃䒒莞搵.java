public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u92ff\u8640\u7043\u4492\u839e\u6435 {
    private void \u92ff\u8640\u7043\u4492\u839e\u6435(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u873d\ube23\uc84e\u9033\u494c\uff55 p5) {
        var_13_8F : float
        
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
            invokespecial:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::<init>, this:\u92ff\u8640\u7043\u4492\u839e\u6435, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))
            putfield:int(\u92ff\u8640\u7043\u4492\u839e\u6435::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u92ff\u8640\u7043\u4492\u839e\u6435, add:int(ldc:int(6), invokevirtual:int(Random::nextInt, getfield:Random(\u92ff\u8640\u7043\u4492\u839e\u6435::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u92ff\u8640\u7043\u4492\u839e\u6435), xor:int(ldc:int(-24030), ldc:int(-24026)))))
            var_13_8F = add:float(mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u92ff\u8640\u7043\u4492\u839e\u6435::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u92ff\u8640\u7043\u4492\u839e\u6435)), ldc:float(0.6f)), ldc:float(0.4f))
            putfield:float(\u92ff\u8640\u7043\u4492\u839e\u6435::\uc3e3\uc910\u64f2\u34df\u7af6\ub19c, this:\u92ff\u8640\u7043\u4492\u839e\u6435, var_13_8F:float)
            putfield:float(\u92ff\u8640\u7043\u4492\u839e\u6435::\ub8be\u0800\ufcaf\ube23\u8cae\u624e, this:\u92ff\u8640\u7043\u4492\u839e\u6435, var_13_8F:float)
            putfield:float(\u92ff\u8640\u7043\u4492\u839e\u6435::\u7ce1\ub171\u3776\u56bd\u7bad\uceb8, this:\u92ff\u8640\u7043\u4492\u839e\u6435, var_13_8F:float)
            putfield:float(\u92ff\u8640\u7043\u4492\u839e\u6435::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\u92ff\u8640\u7043\u4492\u839e\u6435, mul:float(ldc:float(2.0f), sub:float(ldc:float(1.0f), mul:float(d2f:float(p4:double), ldc:float(0.5f)))))
            invokevirtual:void(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::\ud523\u52d3\u647c\uc4d2\u6d99\u8df4, this:\u92ff\u8640\u7043\u4492\u839e\u6435[expected:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800], putfield:\u873d\ube23\uc84e\u9033\u494c\uff55(\u92ff\u8640\u7043\u4492\u839e\u6435::\u600f\uc7fe\u9033\u3e2a\uf995\ucfaf, this:\u92ff\u8640\u7043\u4492\u839e\u6435, p5:\u873d\ube23\uc84e\u9033\u494c\uff55))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u4c2b\ucfaf\u5d20\u4f52\ub113\u51fa(float p0) {
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
            return:int(ldc:int(15728880))
        }
        
        goto(Label_0006)
    }
    
    public void \u4ab3\u120d\u3504\ub6ab\u071d\u5bc4() {
        var_1_5F : int
        expr_7A : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-613948165), ldc:int(-604026893))
            putfield:double(\u92ff\u8640\u7043\u4492\u839e\u6435::\u7006\u74b1\u759a\uf9c5\u946b\u92ee, this:\u92ff\u8640\u7043\u4492\u839e\u6435, getfield:double(\u92ff\u8640\u7043\u4492\u839e\u6435::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u92ff\u8640\u7043\u4492\u839e\u6435))
            putfield:double(\u92ff\u8640\u7043\u4492\u839e\u6435::\ub113\ud7e8\u98a4\u56bd\ud36e\u4e72, this:\u92ff\u8640\u7043\u4492\u839e\u6435, getfield:double(\u92ff\u8640\u7043\u4492\u839e\u6435::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u92ff\u8640\u7043\u4492\u839e\u6435))
            putfield:double(\u92ff\u8640\u7043\u4492\u839e\u6435::\ud7e8\u3776\u8640\u873d\u40a9\u3e2a, this:\u92ff\u8640\u7043\u4492\u839e\u6435, getfield:double(\u92ff\u8640\u7043\u4492\u839e\u6435::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u92ff\u8640\u7043\u4492\u839e\u6435))
            expr_7A = getfield:int(\u92ff\u8640\u7043\u4492\u839e\u6435::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\u92ff\u8640\u7043\u4492\u839e\u6435)
            putfield:int(\u92ff\u8640\u7043\u4492\u839e\u6435::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\u92ff\u8640\u7043\u4492\u839e\u6435, add:int(expr_7A:int, and:int(ldc:int(9793), ldc:int(20645))))
            
            if (cmplt:boolean(expr_7A:int, getfield:int(\u92ff\u8640\u7043\u4492\u839e\u6435::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u92ff\u8640\u7043\u4492\u839e\u6435))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-747739165))
                invokevirtual:void(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::\ud523\u52d3\u647c\uc4d2\u6d99\u8df4, this:\u92ff\u8640\u7043\u4492\u839e\u6435[expected:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800], getfield:\u873d\ube23\uc84e\u9033\u494c\uff55(\u92ff\u8640\u7043\u4492\u839e\u6435::\u600f\uc7fe\u9033\u3e2a\uf995\ucfaf, this:\u92ff\u8640\u7043\u4492\u839e\u6435))
            }
            else {
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3d64\uae87\u6bb9\u5140\u67e9\uf995, this:\u92ff\u8640\u7043\u4492\u839e\u6435[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u6435\ub8be\u718f\u6b0d\u67e9.\u97b7\u3504\u718f\u5bc4\ud51e\ufe34 \u3d64\ud523\uae5d\ud51e\u120d\u8c8a() {
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
            return:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34(getstatic:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34(\u97b7\u3504\u718f\u5bc4\ud51e\ufe34::\uc87f\u64ab\uc229\ub83f\u446c\u59ec))
        }
        
        goto(Label_0006)
    }
    
    public void \u92ff\u8640\u7043\u4492\u839e\u6435(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u873d\ube23\uc84e\u9033\u494c\uff55 p5, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u9a18\u4492\u71f1\uc2e8\u8350\u9937 p6) {
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
            invokespecial:\u92ff\u8640\u7043\u4492\u839e\u6435(\u92ff\u8640\u7043\u4492\u839e\u6435::<init>, this:\u92ff\u8640\u7043\u4492\u839e\u6435, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p4:double, p5:\u873d\ube23\uc84e\u9033\u494c\uff55)
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8c8a\u5140\ub8be\u760c\u7af6\ub70c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FE : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_609 : int
        
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
        var_3_5FE = and:int(ldc:int(-1728320317), ldc:int(-1664254555))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u92ff\u8640\u7043\u4492\u839e\u6435[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_5FE = and:int(var_3_5FE:int, ldc:int(303973978))
        }
        else {
            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-86376805))
            var_5_85 = and:int(ldc:int(-19829), ldc:int(19828))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(28805), ldc:int(-29360)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5FE:int, ldc:int(-1080066436))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(2063), ldc:int(17169)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(26371), ldc:int(4097)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5FE = and:int(var_3_D2:int, ldc:int(-540053786))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(6309), ldc:int(9219)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-2138080126))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-885196072))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-537952307))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1778091004))
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1416894257))
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1086174138))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(211951496))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-25858602))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(223496608))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1634996848))
                        var_11_E3 = and:int(ldc:int(-25841), ldc:int(25808))
                        goto(Label_1419)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-2069615497))
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-759388974))
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1139091377))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1728217310))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1942982872))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-2021453296))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1663079404))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0746:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1500156957))
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-2039105927))
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(338234321))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1197872418))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1850420880))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(136728450))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-577016327))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(34), ldc:int(35))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(340326862))
                        goto(Label_1264)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-309679))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1268552088))
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1709312581))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1611961321))
                        var_11_E3 = and:int(ldc:int(27139), ldc:int(-27172))
                    }
                    
                    Label_1019:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1279041316))
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(786775821))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(662430015))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-199997706))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-541197242))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1264)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(175041838))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1019)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1129263319))
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1214825847))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1676032987))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-587060097))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-624165436))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1419)
                    }
                    
                    Label_1264:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1972633568))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1705923211))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(2002990652))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1586754026))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1156173641))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(31003785))
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1574951338))
                        loopcontinue()
                    }
                    
                    var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1632899844))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1419:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_609 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1430:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-997828702))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-428895854))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-537139563))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-610782323))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1160937624))
                        var_17_609 = add:int(var_16_111:int, and:int(ldc:int(707), ldc:int(1289)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1144034197))
                
                if (cmple:boolean(var_5_85 = var_17_609:int, sub:int(var_6_8C:int, xor:int(ldc:int(2316), ldc:int(2317))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(67108864)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
