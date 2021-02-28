public class \u494c\u4975\ua068\u0c95\uc84e.\u965f\u7c6b\u8258\u4975\uceb8\uc29a {
    private void \u965f\u7c6b\u8258\u4975\uceb8\uc29a(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6) {
        var_16_7D : float
        
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
            invokespecial:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::<init>, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p4:double, p5:double, p6:double)
            var_16_7D = add:float(mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a)), ldc:float(0.1f)), ldc:float(0.2f))
            putfield:float(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\uc3e3\uc910\u64f2\u34df\u7af6\ub19c, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, var_16_7D:float)
            putfield:float(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\ub8be\u0800\ufcaf\ube23\u8cae\u624e, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, var_16_7D:float)
            putfield:float(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\u7ce1\ub171\u3776\u56bd\u7bad\uceb8, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, var_16_7D:float)
            invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3c25\u5245\u7af6\u8413\ub102\u8753, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], ldc:float(0.02f), ldc:float(0.02f))
            putfield:float(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, mul:float(getfield:float(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a), add:float(mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a)), ldc:float(0.6f)), ldc:float(0.5f))))
            putfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, mul:double(getfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a), ldc:double(0.019999999552965164)))
            putfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, mul:double(getfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a), ldc:double(0.019999999552965164)))
            putfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, mul:double(getfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a), ldc:double(0.019999999552965164)))
            putfield:int(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, d2i:int(div:double(ldc:double(20.0), add:double(mul:double(invokestatic:double(Math::random), ldc:double(0.8)), ldc:double(0.2)))))
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
    
    public void \ua61f\uc238\u718f\u5f50\u647c\u8389(double p0, double p1, double p2) {
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
            invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\uf995\u34df\uc238\ubded\u71ae\u51fa, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u0c95\u88c5\ube23\u3776\u6d99\uff55, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u7043\u5bc4\u3d64\u416d\u7049\uc31c, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a]), p0:double, p1:double, p2:double))
            invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u51fa\u3bd6\u9033\u97e6\uceb8\u2dcc, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
            return:void()
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
            var_1_5F = and:int(ldc:int(1355323202), ldc:int(-229213342))
            putfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\u7006\u74b1\u759a\uf9c5\u946b\u92ee, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, getfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a))
            putfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\ub113\ud7e8\u98a4\u56bd\ud36e\u4e72, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, getfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a))
            putfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\ud7e8\u3776\u8640\u873d\u40a9\u3e2a, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, getfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a))
            expr_7A = getfield:int(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a)
            putfield:int(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, sub:int(expr_7A:int, and:int(ldc:int(769), ldc:int(8247))))
            
            if (cmpgt:boolean(expr_7A:int, ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-129860677))
                invokevirtual:void(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\ua61f\uc238\u718f\u5f50\u647c\u8389, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, getfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a), getfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a), getfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a))
                putfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, mul:double(getfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a), ldc:double(0.99)))
                putfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, mul:double(getfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a), ldc:double(0.99)))
                putfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, mul:double(getfield:double(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a), ldc:double(0.99)))
            }
            else {
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3d64\uae87\u6bb9\u5140\u67e9\uf995, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u965f\u7c6b\u8258\u4975\uceb8\uc29a(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u8df4\ub113\ufcaf\u4d85\ud12e\u4c04 p7) {
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
            invokespecial:\u965f\u7c6b\u8258\u4975\uceb8\uc29a(\u965f\u7c6b\u8258\u4975\uceb8\uc29a::<init>, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p4:double, p5:double, p6:double)
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
        var_3_61B : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_626 : int
        
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
        var_3_61B = and:int(ldc:int(-1595758569), ldc:int(-439425615))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u965f\u7c6b\u8258\u4975\uceb8\uc29a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
            var_3_61B = and:int(var_3_61B:int, ldc:int(-269866374))
        }
        else {
            var_3_61B = and:int(var_3_61B:int, ldc:int(-1519863073))
            var_5_85 = and:int(ldc:int(-22837), ldc:int(22836))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16589), ldc:int(-19662)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_61B:int, ldc:int(-236652845))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(17289), ldc:int(1029)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(12713), ldc:int(1601)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_61B = and:int(var_3_DA:int, ldc:int(-112526157))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-32256), ldc:int(-32255)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1249676582))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1798218411))
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-187638222))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1159760153))
                    }
                    else {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1594251471))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1897612463))
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1940076071))
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1196219918))
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-196538068))
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1100698493))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-2561251))
                            var_11_EB = and:int(ldc:int(-28235), ldc:int(20042))
                            goto(Label_1475)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1315134446))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(561923819))
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1129316584))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(43622086))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1519485025))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-438503819))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0678:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1318843558))
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-262335179))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1393517546))
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(676783891))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1223271505))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-373180741))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1223575819))
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-295109564))
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1462397827))
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-939527277))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1595101767))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(3140), ldc:int(3141))
                                goto(Label_1104)
                            }
                        }
                    }
                    
                    Label_0926:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(640183238))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1316958812))
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1554310854))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1985447680))
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(219519009))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1713805417))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-529232902))
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1603144451))
                        var_11_EB = and:int(ldc:int(-20441), ldc:int(4048))
                    }
                    
                    Label_1104:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1864352916))
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-528294144))
                        goto(Label_1338)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1871680347))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(1709991358))
                            goto(Label_0926)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1345274061))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1338)
                            }
                        }
                    }
                    
                    Label_1220:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1673914957))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1104)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(724472688))
                            goto(Label_0926)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-153233606))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_61B = and:int(var_3_61B:int, ldc:int(-1219298953))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1475)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1338:
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1424947628))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-774476157))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1962896744))
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-587944478))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(1432578171))
                        loopcontinue()
                    }
                    
                    var_3_61B = and:int(var_3_61B:int, ldc:int(-94068523))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1475:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_626 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1486:
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1338)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1926405904))
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_61B = and:int(var_3_61B:int, ldc:int(-1253658927))
                        var_17_626 = add:int(var_16_119:int, and:int(ldc:int(14417), ldc:int(517)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61B = and:int(var_3_61B:int, ldc:int(-497160743))
                
                if (cmple:boolean(var_5_85 = var_17_626:int, sub:int(var_6_8C:int, xor:int(ldc:int(-28128), ldc:int(-28127))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_61B:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_61B = and:int(var_3_61B:int, ldc:int(-1074882857))
            goto(Label_0106)
        }
    }
}
