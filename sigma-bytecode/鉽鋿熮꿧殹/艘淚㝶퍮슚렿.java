public class \u927d\u92ff\u71ae\uafe7\u6bb9.\u8258\uf94d\u3776\ud36e\uc29a\ub83f {
    private void \u8258\uf94d\u3776\ud36e\uc29a\ub83f(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3) {
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
            invokespecial:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::<init>, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double)
            putfield:int(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, add:int(d2i:int(mul:double(invokestatic:double(Math::random), ldc:double(60.0))), ldc:int(30)))
            putfield:boolean(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u527a\ud12e\u8aa5\ub70c\u4f52\uc7fe, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, and:int[expected:boolean](ldc:int(25864), ldc:int(-25865)))
            putfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, ldc:double(0.0))
            putfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, ldc:double(-0.05))
            putfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, ldc:double(0.0))
            invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3c25\u5245\u7af6\u8413\ub102\u8753, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], ldc:float(0.02f), ldc:float(0.02f))
            putfield:float(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, mul:float(getfield:float(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f), add:float(mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f)), ldc:float(0.6f)), ldc:float(0.2f))))
            putfield:float(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u1187\u9a18\u5140\u6ec6\u4492\ua6bd, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, ldc:float(0.002f))
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
        var_1_94 : int
        
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
            var_1_5F = and:int(ldc:int(-985349392), ldc:int(-707351705))
            putfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u7006\u74b1\u759a\uf9c5\u946b\u92ee, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, getfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f))
            putfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\ub113\ud7e8\u98a4\u56bd\ud36e\u4e72, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, getfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f))
            putfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\ud7e8\u3776\u8640\u873d\u40a9\u3e2a, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, getfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f))
            expr_7A = getfield:int(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f)
            putfield:int(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u446c\uf995\u67e9\ud217\u6c56\u120d, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, add:int(expr_7A:int, xor:int(ldc:int(192), ldc:int(193))))
            
            if (cmplt:boolean(expr_7A:int, getfield:int(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f))) {
                var_1_94 = and:int(var_1_5F:int, ldc:int(-313396363))
                putfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, add:double(getfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f), f2d:double(mul:float(ldc:float(0.6f), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u88c5\u7ce1\u4ab3\u8350\uae87\u62da, getfield:float(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u4c2b\u4ab3\uc238\u3a62\u64ab\u836c, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f))))))
                putfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, add:double(getfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f), f2d:double(mul:float(ldc:float(0.6f), invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u67d0\u5654\ud158\u72f1\u7bad\ua562, getfield:float(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u4c2b\u4ab3\uc238\u3a62\u64ab\u836c, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f))))))
                putfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, mul:double(getfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f), ldc:double(0.07)))
                putfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, mul:double(getfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f), ldc:double(0.07)))
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\ua61f\uc238\u718f\u5f50\u647c\u8389, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], getfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f), getfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f), getfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f))
                
                if (logicalor:boolean(logicalnot:boolean(invokevirtual:boolean(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\ud36e\u8aa5\u5654\ub1b9\u7049\ub7dc, invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u9033\u3711\u494c\u88c5\u69d9\u97b7, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u0c95\u1187\u61a4\u1187\u4bc8\u759a, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, getfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f), getfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f), getfield:double(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f))), getstatic:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>[expected:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>](\u76bc\u5fe1\u5fe1\u36d3\u93a2\u3d64::\ua6bd\u3bd6\u3711\u4e72\u416d\u759a))), getfield:boolean(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\ud217\ud523\u4daf\uf995\u47c2\uc87f, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f))) {
                    var_1_94 = and:int(var_1_94:int, ldc:int(-1822888334))
                    invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3d64\uae87\u6bb9\u5140\u67e9\uf995, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
                }
                
                putfield:float(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u4c2b\u4ab3\uc238\u3a62\u64ab\u836c, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, d2f:float(add:double(f2d:double(getfield:float(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::\u4c2b\u4ab3\uc238\u3a62\u64ab\u836c, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f)), ldc:double(0.08))))
            }
            else {
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3d64\uae87\u6bb9\u5140\u67e9\uf995, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8258\uf94d\u3776\ud36e\uc29a\ub83f(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, \u71f1\uc910\u3bc9\u516c\u93a2.\u4bc8\u51b2\ub7dc\u8413\u183a\u5f50 p4) {
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
            invokespecial:\u8258\uf94d\u3776\ud36e\uc29a\ub83f(\u8258\uf94d\u3776\ud36e\uc29a\ub83f::<init>, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double)
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
        var_3_6B0 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_6BB : int
        
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
        var_3_6B0 = and:int(ldc:int(1866031205), ldc:int(2038127401))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8258\uf94d\u3776\ud36e\uc29a\ub83f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(32768)), ldc:int(0))) {
            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(2104178559))
            var_5_7D = and:int(ldc:int(23954), ldc:int(-32148))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(13619), ldc:int(-13620)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_6B0:int, ldc:int(-336656921))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(1), ldc:int(2241)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(18449), ldc:int(1153)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_6B0 = and:int(var_3_CA:int, ldc:int(-918579787))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(545), ldc:int(20627)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-1060427674))
                        goto(Label_1569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0975)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(2123891032))
                        goto(Label_0689)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(641605907))
                        goto(Label_0550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-1047668674))
                    }
                    else {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(1262076717))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0550)
                            }
                            
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(494350692))
                        goto(Label_1569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-28134615))
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-2012585465))
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0975)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(1675570026))
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0689)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-964545583))
                            loopcontinue()
                        }
                        
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(1537950185))
                        var_11_DB = and:int(ldc:int(9331), ldc:int(-9332))
                        goto(Label_1558)
                    }
                    
                    Label_0550:
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-1266929701))
                        goto(Label_1569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(1957542103))
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-1310469775))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-1894224991))
                        goto(Label_0975)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-268308601))
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-1976319179))
                            loopcontinue()
                        }
                        
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(1610177913))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0827)
                        }
                    }
                    
                    Label_0689:
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1569)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-1213014297))
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-906679161))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-1250938429))
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-887492091))
                        goto(Label_0975)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-234017014))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-612825103))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0827:
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(18346268))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(719137674))
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(522829991))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-1963693153))
                            goto(Label_0689)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-1164934714))
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-1845366198))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-904340525))
                            loopcontinue()
                        }
                        
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-114453271))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(17088), ldc:int(17089))
                                goto(Label_1141)
                            }
                        }
                    }
                    
                    Label_0975:
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(467401705))
                        goto(Label_1569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(116788802))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-820560513))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-769668704))
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(1162504370))
                            loopcontinue()
                        }
                        
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(2067791715))
                        var_11_DB = and:int(ldc:int(-13928), ldc:int(13925))
                    }
                    
                    Label_1141:
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(188106378))
                            goto(Label_0975)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(1595128721))
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0689)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-885808644))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-1314852330))
                            loopcontinue()
                        }
                        
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-344202585))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1409)
                            }
                        }
                    }
                    
                    Label_1262:
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(273783506))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1141)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-1528988689))
                            goto(Label_0975)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0827)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-2028195815))
                            goto(Label_0689)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-1598699667))
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(2070697612))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-232243959))
                            loopcontinue()
                        }
                        
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-273944529))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1558)
                    }
                    
                    Label_1409:
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(1625590538))
                        goto(Label_1569)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(1536334499))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-350747018))
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(11727595))
                        goto(Label_0975)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(236527037))
                        goto(Label_0827)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0689)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(65343415))
                        goto(Label_0550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-605165533))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1558:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BB = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1569:
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-810787978))
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(649417908))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(1701627338))
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(490803429))
                        goto(Label_0975)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0827)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(1309050139))
                        goto(Label_0689)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(1822294403))
                        goto(Label_0550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(2004866959))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B0:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B0 = and:int(var_3_6B0:int, ldc:int(-105142363))
                        var_17_6BB = add:int(var_16_109:int, and:int(ldc:int(31233), ldc:int(21)))
                        looporswitchbreak()
                    }
                    
                    var_3_6B0 = and:int(var_3_6B0:int, ldc:int(717369011))
                }
                
                var_3_6B0 = and:int(var_3_6B0:int, ldc:int(1333337659))
                
                if (cmple:boolean(var_5_7D = var_17_6BB:int, sub:int(var_6_84:int, and:int(ldc:int(529), ldc:int(1325))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_6B0:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
