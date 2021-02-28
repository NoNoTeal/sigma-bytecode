public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u385b\u4c2b\u8640\u8df4\u156b\ucfaf {
    private void \u385b\u4c2b\u8640\u8df4\u156b\ucfaf(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6) {
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
            invokespecial:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::<init>, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double)
            invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3c25\u5245\u7af6\u8413\ub102\u8753, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], ldc:float(0.02f), ldc:float(0.02f))
            putfield:float(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf, mul:float(getfield:float(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf), add:float(mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf)), ldc:float(0.6f)), ldc:float(0.2f))))
            putfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf, add:double(mul:double(p4:double, ldc:double(0.20000000298023224)), mul:double(sub:double(mul:double(invokestatic:double(Math::random), ldc:double(2.0)), ldc:double(1.0)), ldc:double(0.019999999552965164))))
            putfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf, add:double(mul:double(p5:double, ldc:double(0.20000000298023224)), mul:double(sub:double(mul:double(invokestatic:double(Math::random), ldc:double(2.0)), ldc:double(1.0)), ldc:double(0.019999999552965164))))
            putfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf, add:double(mul:double(p6:double, ldc:double(0.20000000298023224)), mul:double(sub:double(mul:double(invokestatic:double(Math::random), ldc:double(2.0)), ldc:double(1.0)), ldc:double(0.019999999552965164))))
            putfield:int(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf, d2i:int(div:double(ldc:double(8.0), add:double(mul:double(invokestatic:double(Math::random), ldc:double(0.8)), ldc:double(0.2)))))
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
            var_1_5F = and:int(ldc:int(-1292903951), ldc:int(2054118837))
            putfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u7006\u74b1\u759a\uf9c5\u946b\u92ee, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf, getfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf))
            putfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\ub113\ud7e8\u98a4\u56bd\ud36e\u4e72, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf, getfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf))
            putfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\ud7e8\u3776\u8640\u873d\u40a9\u3e2a, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf, getfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf))
            expr_7A = getfield:int(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf)
            putfield:int(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf, sub:int(expr_7A:int, xor:int(ldc:int(1152), ldc:int(1153))))
            
            if (cmpgt:boolean(expr_7A:int, ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-764428807))
                putfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf, add:double(getfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf), ldc:double(0.002)))
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\ua61f\uc238\u718f\u5f50\u647c\u8389, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], getfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf), getfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf), getfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf))
                putfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf, mul:double(getfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf), ldc:double(0.8500000238418579)))
                putfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf, mul:double(getfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf), ldc:double(0.8500000238418579)))
                putfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf, mul:double(getfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf), ldc:double(0.8500000238418579)))
                
                if (logicalnot:boolean(invokevirtual:boolean(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\ud36e\u8aa5\u5654\ub1b9\u7049\ub7dc, invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u9033\u3711\u494c\u88c5\u69d9\u97b7, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u0c95\u1187\u61a4\u1187\u4bc8\u759a, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, getfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u3dd3\u9af2\ubded\u76bc\uc31c\uc29a, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf), getfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf), getfield:double(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::\u7c6b\u69d9\u8aa5\ub18d\u64f2\u416d, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf))), getstatic:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>[expected:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>](\u76bc\u5fe1\u5fe1\u36d3\u93a2\u3d64::\ua6bd\u3bd6\u3711\u4e72\u416d\u759a)))) {
                    invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3d64\uae87\u6bb9\u5140\u67e9\uf995, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
                }
            }
            else {
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u3d64\uae87\u6bb9\u5140\u67e9\uf995, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
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
    
    public void \u385b\u4c2b\u8640\u8df4\u156b\ucfaf(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ub70c\u98a4\u760c\u36d3\uf995\u52d3 p7) {
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
            invokespecial:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf(\u385b\u4c2b\u8640\u8df4\u156b\ucfaf::<init>, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p4:double, p5:double, p6:double)
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
        var_3_618 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_623 : int
        
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
        var_3_618 = and:int(ldc:int(-712810611), ldc:int(-1750866593))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u385b\u4c2b\u8640\u8df4\u156b\ucfaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16384)), ldc:int(0))) {
            var_3_618 = and:int(var_3_618:int, ldc:int(-595362019))
            var_5_7D = and:int(ldc:int(-11087), ldc:int(11020))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20744), ldc:int(16647)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_618:int, ldc:int(-587246531))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(774), ldc:int(775)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(2050), ldc:int(2051)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_618 = and:int(var_3_D2:int, ldc:int(-54790821))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(1891), ldc:int(8337)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1665880121))
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1406387718))
                        goto(Label_1287)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0908)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0783)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0658)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1922397136))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1286182016))
                    }
                    else {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-34343879))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0783)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1077212194))
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1354703871))
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1915966128))
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-881845673))
                        goto(Label_0908)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0783)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0658)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-725885635))
                            var_11_E3 = and:int(ldc:int(7396), ldc:int(-15863))
                            goto(Label_1425)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1843552853))
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1435588113))
                        goto(Label_1287)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-455293564))
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0908)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0783)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(714706667))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1655210835))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0783)
                        }
                    }
                    
                    Label_0658:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-219614556))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1759850767))
                        goto(Label_0908)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1511903081))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(107095038))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-674279719))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0783:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1667786472))
                        goto(Label_1068)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(2001074210))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1012426020))
                            goto(Label_0658)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1022470137))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1958789272))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-63211891))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(4941), ldc:int(1))
                                goto(Label_1068)
                            }
                        }
                    }
                    
                    Label_0908:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-485608844))
                        goto(Label_1167)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1381156843))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(151622277))
                            goto(Label_0783)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1219486911))
                            goto(Label_0658)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-1296287346))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-141561925))
                        var_11_E3 = and:int(ldc:int(31107), ldc:int(-31140))
                    }
                    
                    Label_1068:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1423775094))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0908)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0783)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0658)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1825033340))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-58231511))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1287)
                            }
                        }
                    }
                    
                    Label_1167:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_1068)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1902173134))
                            goto(Label_0908)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0783)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0658)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(1474682988))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(16)), ldc:int(0))) {
                            var_3_618 = and:int(var_3_618:int, ldc:int(-562044619))
                            loopcontinue()
                        }
                        
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1777342947))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1425)
                    }
                    
                    Label_1287:
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1950719982))
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0908)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(436554975))
                        goto(Label_0783)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1200163770))
                        goto(Label_0658)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(32)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1233484484))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1281539037))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_618 = and:int(var_3_618:int, ldc:int(-1618778307))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1425:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_623 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1436:
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(8)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1151126527))
                        goto(Label_1287)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(795028836))
                        goto(Label_1167)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-1363461482))
                        goto(Label_1068)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0908)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(1340284733))
                        goto(Label_0783)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(416418432))
                        goto(Label_0658)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-650521282))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_618:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_618:int, ldc:int(8)), ldc:int(0))) {
                        var_3_618 = and:int(var_3_618:int, ldc:int(-566762049))
                        var_17_623 = add:int(var_16_111:int, and:int(ldc:int(10249), ldc:int(22181)))
                        looporswitchbreak()
                    }
                }
                
                var_3_618 = and:int(var_3_618:int, ldc:int(-675813831))
                
                if (cmple:boolean(var_5_7D = var_17_623:int, sub:int(var_6_84:int, xor:int(ldc:int(5504), ldc:int(5505))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_618:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_618 = and:int(var_3_618:int, ldc:int(-1262792602))
            goto(Label_0106)
        }
    }
}
