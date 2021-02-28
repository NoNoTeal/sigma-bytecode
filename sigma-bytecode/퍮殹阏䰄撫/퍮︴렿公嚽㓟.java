public class \ud36e\u6bb9\u960f\u4c04\u64ab.\ud36e\ufe34\ub83f\u516c\u56bd\u34df {
    private void \ud36e\ufe34\ub83f\u516c\u56bd\u34df(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6, \u51b2\u6fb0\ufcaf\u61a4\u0800.\u8350\u4f52\u62da\ub19c\ubf56\u12cb p7, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u873d\ube23\uc84e\u9033\u494c\uff55 p8) {
        var_18_A4 : float
        
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
            invokespecial:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::<init>, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p4:double, p5:double, p6:double)
            putfield:\u873d\ube23\uc84e\u9033\u494c\uff55(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u47c2\uc87f\u120d\u120d\u92ee\uceb8, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, p8:\u873d\ube23\uc84e\u9033\u494c\uff55)
            putfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, mul:double(getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df), ldc:double(0.10000000149011612)))
            putfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, mul:double(getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df), ldc:double(0.10000000149011612)))
            putfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, mul:double(getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df), ldc:double(0.10000000149011612)))
            var_18_A4 = add:float(mul:float(d2f:float(invokestatic:double(Math::random)), ldc:float(0.4f)), ldc:float(0.6f))
            putfield:float(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\uc3e3\uc910\u64f2\u34df\u7af6\ub19c, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, mul:float(mul:float(add:float(d2f:float(mul:double(invokestatic:double(Math::random), ldc:double(0.20000000298023224))), ldc:float(0.8f)), invokevirtual:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u1187\uc3e3\ud4fe\u7d52\u3d4b\uf995, p7:\u8350\u4f52\u62da\ub19c\ubf56\u12cb)), var_18_A4:float))
            putfield:float(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\ub8be\u0800\ufcaf\ube23\u8cae\u624e, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, mul:float(mul:float(add:float(d2f:float(mul:double(invokestatic:double(Math::random), ldc:double(0.20000000298023224))), ldc:float(0.8f)), invokevirtual:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u8709\ud523\u416d\u5db4\ud4fe\ud4fe, p7:\u8350\u4f52\u62da\ub19c\ubf56\u12cb)), var_18_A4:float))
            putfield:float(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u7ce1\ub171\u3776\u56bd\u7bad\uceb8, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, mul:float(mul:float(add:float(d2f:float(mul:double(invokestatic:double(Math::random), ldc:double(0.20000000298023224))), ldc:float(0.8f)), invokevirtual:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u516c\uceb8\ube23\u4daf\u12cb\u0a06, p7:\u8350\u4f52\u62da\ub19c\ubf56\u12cb)), var_18_A4:float))
            putfield:float(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, mul:float(getfield:float(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df), mul:float(ldc:float(0.75f), invokevirtual:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u0b8e\ufcaf\u3d4b\u7330\u7043\u5d20, p7:\u8350\u4f52\u62da\ub19c\ubf56\u12cb))))
            putfield:int(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, f2i:int(invokestatic:float(Math::max, mul:float(i2f:float(d2i:int(div:double(ldc:double(8.0), add:double(mul:double(invokestatic:double(Math::random), ldc:double(0.8)), ldc:double(0.2))))), invokevirtual:float(\u8350\u4f52\u62da\ub19c\ubf56\u12cb::\u0b8e\ufcaf\u3d4b\u7330\u7043\u5d20, p7:\u8350\u4f52\u62da\ub19c\ubf56\u12cb)), ldc:float(1.0f))))
            invokevirtual:void(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::\ud523\u52d3\u647c\uc4d2\u6d99\u8df4, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df[expected:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800], p8:\u873d\ube23\uc84e\u9033\u494c\uff55)
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
    
    public float \u6b0d\u92ff\u183a\u7d52\u4c04\uc7fe(float p0) {
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
            return:float(mul:float(getfield:float(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, mul:float(div:float(add:float(i2f:float(getfield:int(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df)), p0:float), i2f:float(getfield:int(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df))), ldc:float(32.0f)), ldc:float(0.0f), ldc:float(1.0f))))
        }
        
        goto(Label_0006)
    }
    
    public void \u4ab3\u120d\u3504\ub6ab\u071d\u5bc4() {
        var_1_CB : int
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
            var_1_CB = and:int(ldc:int(1510226590), ldc:int(1255091759))
            putfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u7006\u74b1\u759a\uf9c5\u946b\u92ee, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df))
            putfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\ub113\ud7e8\u98a4\u56bd\ud36e\u4e72, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df))
            putfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\ud7e8\u3776\u8640\u873d\u40a9\u3e2a, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df))
            expr_7A = getfield:int(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df)
            putfield:int(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, add:int(expr_7A:int, and:int(ldc:int(587), ldc:int(25857))))
            
            if (cmplt:boolean(expr_7A:int, getfield:int(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df))) {
                loop {
                    if (cmpne:boolean(and:int(var_1_CB:int, ldc:int(2)), ldc:int(0))) {
                        var_1_CB = and:int(var_1_CB:int, ldc:int(2071834243))
                        invokevirtual:void(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::\ud523\u52d3\u647c\uc4d2\u6d99\u8df4, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df[expected:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800], getfield:\u873d\ube23\uc84e\u9033\u494c\uff55(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u47c2\uc87f\u120d\u120d\u92ee\uceb8, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df))
                        invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\ua61f\uc238\u718f\u5f50\u647c\u8389, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df), getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df), getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df))
                        
                        if (cmpeq:boolean(getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df), getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\ub113\ud7e8\u98a4\u56bd\ud36e\u4e72, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df))) {
                            putfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, mul:double(getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df), ldc:double(1.1)))
                            putfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, mul:double(getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df), ldc:double(1.1)))
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_CB:int, ldc:int(1048576)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_1_CB = and:int(var_1_CB:int, ldc:int(-300537622))
                putfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, mul:double(getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df), ldc:double(0.9599999785423279)))
                putfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, mul:double(getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df), ldc:double(0.9599999785423279)))
                putfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, mul:double(getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df), ldc:double(0.9599999785423279)))
                
                if (getfield:boolean(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\ud217\ud523\u4daf\uf995\u47c2\uc87f, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df)) {
                    putfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, mul:double(getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df), ldc:double(0.699999988079071)))
                    putfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, mul:double(getfield:double(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df), ldc:double(0.699999988079071)))
                }
            }
            else {
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3d64\uae87\u6bb9\u5140\u67e9\uf995, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud36e\ufe34\ub83f\u516c\u56bd\u34df(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6, \u51b2\u6fb0\ufcaf\u61a4\u0800.\u8350\u4f52\u62da\ub19c\ubf56\u12cb p7, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u873d\ube23\uc84e\u9033\u494c\uff55 p8, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u36d3\u16f6\uc229\u4179\ub32d\u64ab p9) {
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
            invokespecial:\ud36e\ufe34\ub83f\u516c\u56bd\u34df(\ud36e\ufe34\ub83f\u516c\u56bd\u34df::<init>, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p4:double, p5:double, p6:double, p7:\u8350\u4f52\u62da\ub19c\ubf56\u12cb, p8:\u873d\ube23\uc84e\u9033\u494c\uff55)
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
        var_3_638 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_643 : int
        
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
        var_3_638 = and:int(ldc:int(-253764926), ldc:int(-82330647))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud36e\ufe34\ub83f\u516c\u56bd\u34df[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(4096)), ldc:int(0))) {
            var_3_638 = and:int(var_3_638:int, ldc:int(-115385110))
            var_5_7D = and:int(ldc:int(10033), ldc:int(-26424))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(728), ldc:int(-11005)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_638:int, ldc:int(-115360528))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(4128), ldc:int(4129)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(8276), ldc:int(8277)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_638 = and:int(var_3_CA:int, ldc:int(-12584223))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(9225), ldc:int(9224)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(128)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-875649353))
                        goto(Label_1456)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1380838279))
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1789537569))
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-285553850))
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0788)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(64)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(327645365))
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-103204624))
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-172016937))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0559)
                            }
                            
                            goto(Label_0788)
                        }
                    }
                    
                    Label_0398:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(695924447))
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(2085881355))
                        goto(Label_0788)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(914860734))
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1684280273))
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-67117840))
                        var_11_DB = and:int(ldc:int(-27795), ldc:int(26770))
                        goto(Label_1445)
                    }
                    
                    Label_0559:
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1109166867))
                        goto(Label_1456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-903644524))
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0788)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-15220738))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0788)
                        }
                    }
                    
                    Label_0661:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1071195553))
                        goto(Label_1456)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1081595490))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-963494116))
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1385473755))
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-67126300))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0788:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(128)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-991789476))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1012477338))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1593125901))
                            goto(Label_0661)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1398343032))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-231228725))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(170), ldc:int(171))
                                goto(Label_1073)
                            }
                        }
                    }
                    
                    Label_0907:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(344542670))
                        goto(Label_1456)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(832727615))
                            goto(Label_0788)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1032658714))
                            goto(Label_0661)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1786461818))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1632070929))
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-266887487))
                        var_11_DB = and:int(ldc:int(-21231), ldc:int(20654))
                    }
                    
                    Label_1073:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-935192196))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0907)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(1983224323))
                            goto(Label_0788)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0661)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0559)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1758781279))
                            goto(Label_0398)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_638 = and:int(var_3_638:int, ldc:int(-161513474))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1183:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1189564004))
                        goto(Label_1456)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-452737984))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-346535838))
                            goto(Label_1073)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0907)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0788)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-294004751))
                            goto(Label_0661)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(256)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-1953973404))
                            goto(Label_0559)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0398)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_638 = and:int(var_3_638:int, ldc:int(-125879300))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1445)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1324:
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1172950998))
                        goto(Label_1456)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0788)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(64)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1711969695))
                        goto(Label_0559)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1442893955))
                        goto(Label_0398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_638 = and:int(var_3_638:int, ldc:int(-37774912))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1445:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_643 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1456:
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(999389492))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(22497784))
                        goto(Label_1183)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(256)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1754271011))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-1164778470))
                        goto(Label_0788)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(128)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1623820809))
                        goto(Label_0661)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(1786082159))
                        goto(Label_0559)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_638:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-9578282))
                        goto(Label_0398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_638:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_638 = and:int(var_3_638:int, ldc:int(-150996257))
                        var_17_643 = add:int(var_16_109:int, xor:int(ldc:int(-20416), ldc:int(-20415)))
                        looporswitchbreak()
                    }
                }
                
                var_3_638 = and:int(var_3_638:int, ldc:int(-115344913))
                
                if (cmple:boolean(var_5_7D = var_17_643:int, sub:int(var_6_84:int, and:int(ldc:int(4483), ldc:int(9769))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_638:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
