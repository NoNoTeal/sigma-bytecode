public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\ubefe\u3504\u6ec6\u5654\ub171\uc87f {
    public void \ubefe\u3504\u6ec6\u5654\ub171\uc87f(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u873d\ube23\uc84e\u9033\u494c\uff55 p7) {
        var_17_B9 : float
        
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
            invokespecial:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::<init>, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double)
            putfield:\u873d\ube23\uc84e\u9033\u494c\uff55(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\uc87f\ub1b9\u98a4\u71f1\u7c6b\uae87, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, p7:\u873d\ube23\uc84e\u9033\u494c\uff55)
            putfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, add:double(p4:double, mul:double(sub:double(mul:double(invokestatic:double(Math::random), ldc:double(2.0)), ldc:double(1.0)), ldc:double(0.05000000074505806))))
            putfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, add:double(p5:double, mul:double(sub:double(mul:double(invokestatic:double(Math::random), ldc:double(2.0)), ldc:double(1.0)), ldc:double(0.05000000074505806))))
            putfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, add:double(p6:double, mul:double(sub:double(mul:double(invokestatic:double(Math::random), ldc:double(2.0)), ldc:double(1.0)), ldc:double(0.05000000074505806))))
            var_17_B9 = add:float(mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f)), ldc:float(0.3f)), ldc:float(0.7f))
            putfield:float(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\uc3e3\uc910\u64f2\u34df\u7af6\ub19c, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, var_17_B9:float)
            putfield:float(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\ub8be\u0800\ufcaf\ube23\u8cae\u624e, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, var_17_B9:float)
            putfield:float(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u7ce1\ub171\u3776\u56bd\u7bad\uceb8, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, var_17_B9:float)
            putfield:float(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, mul:float(ldc:float(0.1f), add:float(mul:float(mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f)), invokevirtual:float(Random::nextFloat, getfield:Random(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f))), ldc:float(6.0f)), ldc:float(1.0f))))
            putfield:int(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, add:int(d2i:int(div:double(ldc:double(16.0), add:double(mul:double(f2d:double(invokevirtual:float(Random::nextFloat, getfield:Random(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f))), ldc:double(0.8)), ldc:double(0.2)))), xor:int(ldc:int(26627), ldc:int(26625))))
            invokevirtual:void(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::\ud523\u52d3\u647c\uc4d2\u6d99\u8df4, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f[expected:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800], p7:\u873d\ube23\uc84e\u9033\u494c\uff55)
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
            return:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34(getstatic:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34(\u97b7\u3504\u718f\u5bc4\ud51e\ufe34::\uc31c\uae87\u7006\u3dd3\u156b\u120d))
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
            var_1_5F = and:int(ldc:int(-1139534494), ldc:int(-386616877))
            putfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u7006\u74b1\u759a\uf9c5\u946b\u92ee, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, getfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f))
            putfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\ub113\ud7e8\u98a4\u56bd\ud36e\u4e72, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, getfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f))
            putfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\ud7e8\u3776\u8640\u873d\u40a9\u3e2a, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, getfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f))
            expr_7A = getfield:int(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f)
            putfield:int(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, add:int(expr_7A:int, xor:int(ldc:int(4109), ldc:int(4108))))
            
            if (cmplt:boolean(expr_7A:int, getfield:int(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1457635610))
                invokevirtual:void(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::\ud523\u52d3\u647c\uc4d2\u6d99\u8df4, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f[expected:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800], getfield:\u873d\ube23\uc84e\u9033\u494c\uff55(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\uc87f\ub1b9\u98a4\u71f1\u7c6b\uae87, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f))
                putfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, add:double(getfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f), ldc:double(0.004)))
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\ua61f\uc238\u718f\u5f50\u647c\u8389, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], getfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f), getfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f), getfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f))
                putfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, mul:double(getfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f), ldc:double(0.8999999761581421)))
                putfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, mul:double(getfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f), ldc:double(0.8999999761581421)))
                putfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, mul:double(getfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f), ldc:double(0.8999999761581421)))
                
                if (getfield:boolean(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\ud217\ud523\u4daf\uf995\u47c2\uc87f, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f)) {
                    putfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, mul:double(getfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f), ldc:double(0.699999988079071)))
                    putfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f, mul:double(getfield:double(\ubefe\u3504\u6ec6\u5654\ub171\uc87f::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f), ldc:double(0.699999988079071)))
                }
            }
            else {
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3d64\uae87\u6bb9\u5140\u67e9\uf995, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
            }
            
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
        var_3_675 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_680 : int
        
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
        var_3_675 = and:int(ldc:int(832030419), ldc:int(366477041))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubefe\u3504\u6ec6\u5654\ub171\uc87f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16384)), ldc:int(0))) {
            var_3_675 = and:int(var_3_675:int, ldc:int(1209627692))
        }
        else {
            var_3_675 = and:int(var_3_675:int, ldc:int(2008541147))
            var_5_85 = and:int(ldc:int(-22737), ldc:int(22736))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(13569), ldc:int(-13570)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_675:int, ldc:int(-1247945545))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(4224), ldc:int(4225)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(8208), ldc:int(8209)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_675 = and:int(var_3_D2:int, ldc:int(-208536131))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(85), ldc:int(84)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(156407034))
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-857021328))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-219509458))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1329733647))
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1289685739))
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1173688844))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(328895268))
                    }
                    else {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1145053223))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-590358459))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(128)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(463457860))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1555381603))
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-1684947142))
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(-606736899))
                        var_11_E3 = and:int(ldc:int(-16513), ldc:int(16512))
                        goto(Label_1536)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(560996243))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1919033776))
                        goto(Label_1233)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1202875340))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1055075331))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-1532212268))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(1092960495))
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(1574694811))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1328014920))
                        goto(Label_1547)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1092771319))
                        goto(Label_1233)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(1156450450))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-504884856))
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(463326609))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0816:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-806248370))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1233)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1849059947))
                        goto(Label_1088)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(1727742301))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(2126445346))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(196189594))
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(838454675))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(16597), ldc:int(2049))
                                goto(Label_1088)
                            }
                        }
                    }
                    
                    Label_0943:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(116852690))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-1847106559))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-515499464))
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(366728949))
                        var_11_E3 = and:int(ldc:int(-9057), ldc:int(9056))
                    }
                    
                    Label_1088:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-297253466))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-537928288))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-1676823340))
                            goto(Label_0943)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(822936609))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-445958905))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-998445765))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(456540020))
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(2075393265))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1380)
                            }
                        }
                    }
                    
                    Label_1233:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(523454427))
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(2039625957))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(-954236014))
                            goto(Label_1088)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(1397843199))
                            goto(Label_0943)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(1210614245))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16)), ldc:int(0))) {
                            var_3_675 = and:int(var_3_675:int, ldc:int(1461742958))
                            loopcontinue()
                        }
                        
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1143607873))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1536)
                    }
                    
                    Label_1380:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1547)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(103298555))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(67159030))
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1274762859))
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1071814305))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1882701714))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1344162999))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(214725092))
                        loopcontinue()
                    }
                    
                    var_3_675 = and:int(var_3_675:int, ldc:int(865977599))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1536:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_680 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1547:
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(150829846))
                        goto(Label_1233)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(1)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1408830166))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(1612475711))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_675:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-205136546))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_675:int, ldc:int(16)), ldc:int(0))) {
                        var_3_675 = and:int(var_3_675:int, ldc:int(-1648498767))
                        var_17_680 = add:int(var_16_111:int, xor:int(ldc:int(-31936), ldc:int(-31935)))
                        looporswitchbreak()
                    }
                }
                
                var_3_675 = and:int(var_3_675:int, ldc:int(834127827))
                
                if (cmple:boolean(var_5_85 = var_17_680:int, sub:int(var_6_8C:int, xor:int(ldc:int(-31487), ldc:int(-31488))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_675:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
