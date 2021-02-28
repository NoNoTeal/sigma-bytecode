public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u071d\u4c2b\ub32d\u8258\u5f50\u97e6 {
    private void \u071d\u4c2b\ub32d\u8258\u5f50\u97e6(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u873d\ube23\uc84e\u9033\u494c\uff55 p5) {
        var_13_8B : float
        
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
            invokespecial:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::<init>, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, ldc:double(0.0), ldc:double(0.0), ldc:double(0.0))
            putfield:\u873d\ube23\uc84e\u9033\u494c\uff55(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\ub8be\u3e2a\u6435\ub102\u3e75\ube23, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6, p5:\u873d\ube23\uc84e\u9033\u494c\uff55)
            putfield:int(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6, and:int(ldc:int(516), ldc:int(359)))
            var_13_8B = add:float(mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6)), ldc:float(0.6f)), ldc:float(0.4f))
            putfield:float(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\uc3e3\uc910\u64f2\u34df\u7af6\ub19c, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6, var_13_8B:float)
            putfield:float(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\ub8be\u0800\ufcaf\ube23\u8cae\u624e, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6, var_13_8B:float)
            putfield:float(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\u7ce1\ub171\u3776\u56bd\u7bad\uceb8, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6, var_13_8B:float)
            putfield:float(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6, sub:float(ldc:float(1.0f), mul:float(d2f:float(p4:double), ldc:float(0.5f))))
            invokevirtual:void(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::\ud523\u52d3\u647c\uc4d2\u6d99\u8df4, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6[expected:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800], p5:\u873d\ube23\uc84e\u9033\u494c\uff55)
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
            var_1_5F = and:int(ldc:int(1156928907), ldc:int(1559895453))
            putfield:double(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\u7006\u74b1\u759a\uf9c5\u946b\u92ee, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6, getfield:double(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6))
            putfield:double(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\ub113\ud7e8\u98a4\u56bd\ud36e\u4e72, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6, getfield:double(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6))
            putfield:double(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\ud7e8\u3776\u8640\u873d\u40a9\u3e2a, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6, getfield:double(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6))
            expr_7A = getfield:int(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6)
            putfield:int(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6, add:int(expr_7A:int, xor:int(ldc:int(3), ldc:int(2))))
            
            if (cmplt:boolean(expr_7A:int, getfield:int(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1624894731))
                invokevirtual:void(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::\ud523\u52d3\u647c\uc4d2\u6d99\u8df4, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6[expected:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800], getfield:\u873d\ube23\uc84e\u9033\u494c\uff55(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::\ub8be\u3e2a\u6435\ub102\u3e75\ube23, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6))
            }
            else {
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3d64\uae87\u6bb9\u5140\u67e9\uf995, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
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
    
    public void \u071d\u4c2b\ub32d\u8258\u5f50\u97e6(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u873d\ube23\uc84e\u9033\u494c\uff55 p5, \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u7330\u9937\u56bd\ub32d\u8640\u56bd p6) {
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
            invokespecial:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6(\u071d\u4c2b\ub32d\u8258\u5f50\u97e6::<init>, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p4:double, p5:\u873d\ube23\uc84e\u9033\u494c\uff55)
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
        var_3_5D8 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5E3 : int
        
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
        var_3_5D8 = and:int(ldc:int(-1637163782), ldc:int(-1814178571))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u071d\u4c2b\ub32d\u8258\u5f50\u97e6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(1024)), ldc:int(0))) {
            var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-766967830))
            var_5_7D = and:int(ldc:int(-10525), ldc:int(10524))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10377), ldc:int(10376)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5D8:int, ldc:int(-1090986808))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(4289), ldc:int(9)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(2305), ldc:int(16467)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5D8 = and:int(var_3_CA:int, ldc:int(-565651764))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(9284), ldc:int(9285)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(1993394597))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-1755567855))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(1206595821))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(818894411))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(1866232951))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(1376198790))
                    }
                    else {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-19145228))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(450015433))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-2129951776))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-1626594407))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(170554197))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-1300498730))
                            var_11_DB = and:int(ldc:int(27668), ldc:int(-27797))
                            goto(Label_1363)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(1046026051))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(777900401))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-1828989492))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-597970173))
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(1755879604))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(1967706943))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(890912637))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5D8 = and:int(var_3_5D8:int, ldc:int(1322304634))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5D8 = and:int(var_3_5D8:int, ldc:int(1426317816))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-1144391722))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-1183901693))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-2088673878))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-1745947414))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(18993), ldc:int(5193))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-1258144291))
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(1983944594))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(14200612))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-463033845))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-924921854))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-740756239))
                        var_11_DB = and:int(ldc:int(9508), ldc:int(-9637))
                    }
                    
                    Label_1027:
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(1196837800))
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(1533032556))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5D8 = and:int(var_3_5D8:int, ldc:int(1793144924))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-1832135206))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1244)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1374)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1027)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5D8 = and:int(var_3_5D8:int, ldc:int(858277))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5D8 = and:int(var_3_5D8:int, ldc:int(2030582361))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5D8 = and:int(var_3_5D8:int, ldc:int(681742534))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-1287061770))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1363)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1244:
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(984455150))
                        goto(Label_1374)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-1536847088))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-156861395))
                        loopcontinue()
                    }
                    
                    var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-545456653))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1363:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E3 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1374:
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-700874542))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(1846660103))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-633767541))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(1861756976))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-889219584))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-101270754))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-1771381555))
                        var_17_5E3 = add:int(var_16_109:int, and:int(ldc:int(7749), ldc:int(145)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5D8 = and:int(var_3_5D8:int, ldc:int(-1209281314))
                
                if (cmple:boolean(var_5_7D = var_17_5E3:int, sub:int(var_6_84:int, xor:int(ldc:int(4296), ldc:int(4297))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5D8:int, ldc:int(16384)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
