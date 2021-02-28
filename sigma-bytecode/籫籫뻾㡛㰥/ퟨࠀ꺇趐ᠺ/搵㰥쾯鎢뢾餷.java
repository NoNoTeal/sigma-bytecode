public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u6435\u3c25\ucfaf\u93a2\ub8be\u9937 {
    private void \u6435\u3c25\ucfaf\u93a2\ub8be\u9937(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6) {
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
            invokespecial:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::<init>, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double)
            invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3c25\u5245\u7af6\u8413\ub102\u8753, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], ldc:float(0.02f), ldc:float(0.02f))
            putfield:float(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937, mul:float(getfield:float(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937), add:float(mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937)), ldc:float(0.6f)), ldc:float(0.2f))))
            putfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937, add:double(mul:double(p4:double, ldc:double(0.20000000298023224)), mul:double(sub:double(mul:double(invokestatic:double(Math::random), ldc:double(2.0)), ldc:double(1.0)), ldc:double(0.019999999552965164))))
            putfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937, add:double(mul:double(p5:double, ldc:double(0.20000000298023224)), mul:double(sub:double(mul:double(invokestatic:double(Math::random), ldc:double(2.0)), ldc:double(1.0)), ldc:double(0.019999999552965164))))
            putfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937, add:double(mul:double(p6:double, ldc:double(0.20000000298023224)), mul:double(sub:double(mul:double(invokestatic:double(Math::random), ldc:double(2.0)), ldc:double(1.0)), ldc:double(0.019999999552965164))))
            putfield:int(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937, d2i:int(div:double(ldc:double(40.0), add:double(mul:double(invokestatic:double(Math::random), ldc:double(0.8)), ldc:double(0.2)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4ab3\u120d\u3504\ub6ab\u071d\u5bc4() {
        var_1_5F : int
        expr_86 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-318509581), ldc:int(-19931161))
            putfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u7006\u74b1\u759a\uf9c5\u946b\u92ee, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937, getfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937))
            putfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\ub113\ud7e8\u98a4\u56bd\ud36e\u4e72, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937, getfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937))
            putfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\ud7e8\u3776\u8640\u873d\u40a9\u3e2a, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937, getfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937))
            putfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937, add:double(getfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937), ldc:double(0.005)))
            expr_86 = getfield:int(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937)
            putfield:int(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937, sub:int(expr_86:int, xor:int(ldc:int(17), ldc:int(16))))
            
            if (cmpgt:boolean(expr_86:int, ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-39735309))
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\ua61f\uc238\u718f\u5f50\u647c\u8389, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], getfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937), getfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937), getfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937))
                putfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937, mul:double(getfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937), ldc:double(0.8500000238418579)))
                putfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937, mul:double(getfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937), ldc:double(0.8500000238418579)))
                putfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937, mul:double(getfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937), ldc:double(0.8500000238418579)))
                
                if (logicalnot:boolean(invokevirtual:boolean(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\ud36e\u8aa5\u5654\ub1b9\u7049\ub7dc, invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u9033\u3711\u494c\u88c5\u69d9\u97b7, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u0c95\u1187\u61a4\u1187\u4bc8\u759a, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, getfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937), getfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937), getfield:double(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937))), getstatic:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>[expected:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>](\u76bc\u5fe1\u5fe1\u36d3\u93a2\u3d64::\ua6bd\u3bd6\u3711\u4e72\u416d\u759a)))) {
                    invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3d64\uae87\u6bb9\u5140\u67e9\uf995, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
                }
            }
            else {
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3d64\uae87\u6bb9\u5140\u67e9\uf995, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
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
            return:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34(getstatic:\u97b7\u3504\u718f\u5bc4\ud51e\ufe34(\u97b7\u3504\u718f\u5bc4\ud51e\ufe34::\uc31c\uae87\u7006\u3dd3\u156b\u120d))
        }
        
        goto(Label_0006)
    }
    
    public void \u6435\u3c25\ucfaf\u93a2\ub8be\u9937(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u2dcc\uf995\u527a\uae5d\ua3b4\ub18d p7) {
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
            invokespecial:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937(\u6435\u3c25\ucfaf\u93a2\ub8be\u9937::<init>, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p4:double, p5:double, p6:double)
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
        var_3_65A : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_665 : int
        
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
        var_3_65A = and:int(ldc:int(493705405), ldc:int(-1156620291))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6435\u3c25\ucfaf\u93a2\ub8be\u9937[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(65536)), ldc:int(0))) {
            var_3_65A = and:int(var_3_65A:int, ldc:int(-1111663361))
            var_5_7D = and:int(ldc:int(-17163), ldc:int(17162))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9754), ldc:int(-9755)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_65A:int, ldc:int(-141723467))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(1035), ldc:int(1034)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-31484), ldc:int(-31483)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_65A = and:int(var_3_D2:int, ldc:int(2144173239))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(4688), ldc:int(4689)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1511)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0942)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0805)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(126075304))
                        goto(Label_0661)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1632814657))
                    }
                    else {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(2102360575))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0805)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1511)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(306812036))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(43118690))
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0942)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1380640899))
                        goto(Label_0805)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-2003119798))
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-75414642))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-686949187))
                        var_11_E3 = and:int(ldc:int(13040), ldc:int(-13045))
                        goto(Label_1500)
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(97718451))
                        goto(Label_1511)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(435045924))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0942)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1050285124))
                        goto(Label_0805)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(2061980408))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1154706960))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-679641347))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0805)
                        }
                    }
                    
                    Label_0661:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1511)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1320582502))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(76832969))
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1982017869))
                        goto(Label_0942)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1644969128))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-2027475852))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1196724470))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-175155017))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0805:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1212161333))
                        goto(Label_1511)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1643105954))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-105475300))
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-951967214))
                        goto(Label_1114)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1969913130))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-494281389))
                            goto(Label_0661)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(991952823))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(8195), ldc:int(1061))
                                goto(Label_1114)
                            }
                        }
                    }
                    
                    Label_0942:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1511)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(690989085))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-430500237))
                        goto(Label_1243)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(525452805))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0805)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(837523147))
                            goto(Label_0661)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1413619543))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(308904519))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1082295043))
                        var_11_E3 = and:int(ldc:int(-3793), ldc:int(3792))
                    }
                    
                    Label_1114:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1511)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1242890789))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-2055925150))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0942)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(643230614))
                            goto(Label_0805)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0661)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(602853663))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(390299179))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1572731837))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1380)
                            }
                        }
                    }
                    
                    Label_1243:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1511)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1677962485))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1375139690))
                            goto(Label_1114)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-54364321))
                            goto(Label_0942)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0805)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0661)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1147377991))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1348927787))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1813161795))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1500)
                    }
                    
                    Label_1380:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1852481295))
                        goto(Label_1511)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0942)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0805)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0661)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1974732628))
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-402740090))
                        loopcontinue()
                    }
                    
                    var_3_65A = and:int(var_3_65A:int, ldc:int(494763967))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1500:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_665 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1511:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1940796501))
                        goto(Label_1243)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1114)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(944527373))
                        goto(Label_0942)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-70862289))
                        goto(Label_0805)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(250232824))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-617775945))
                        var_17_665 = add:int(var_16_111:int, xor:int(ldc:int(540), ldc:int(541)))
                        looporswitchbreak()
                    }
                    
                    var_3_65A = and:int(var_3_65A:int, ldc:int(1636751091))
                }
                
                var_3_65A = and:int(var_3_65A:int, ldc:int(289364919))
                
                if (cmple:boolean(var_5_7D = var_17_665:int, sub:int(var_6_84:int, and:int(ldc:int(18497), ldc:int(12439))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
            var_3_65A = and:int(var_3_65A:int, ldc:int(1004785670))
            goto(Label_0106)
        }
    }
}
