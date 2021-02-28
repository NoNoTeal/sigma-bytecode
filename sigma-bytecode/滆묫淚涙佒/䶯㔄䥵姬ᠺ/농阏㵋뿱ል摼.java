public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ub18d\u960f\u3d4b\ubff1\u120d\u647c {
    private void \ub18d\u960f\u3d4b\ubff1\u120d\u647c(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u873d\ube23\uc84e\u9033\u494c\uff55 p7) {
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
            invokespecial:\u8bb0\uc910\ua562\u4f52\u385b\u6cfe(\u8bb0\uc910\ua562\u4f52\u385b\u6cfe::<init>, this:\ub18d\u960f\u3d4b\ubff1\u120d\u647c, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p7:\u873d\ube23\uc84e\u9033\u494c\uff55, ldc:float(-5.0E-4f))
            putfield:double(\ub18d\u960f\u3d4b\ubff1\u120d\u647c::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\ub18d\u960f\u3d4b\ubff1\u120d\u647c, p4:double)
            putfield:double(\ub18d\u960f\u3d4b\ubff1\u120d\u647c::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\ub18d\u960f\u3d4b\ubff1\u120d\u647c, p5:double)
            putfield:double(\ub18d\u960f\u3d4b\ubff1\u120d\u647c::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\ub18d\u960f\u3d4b\ubff1\u120d\u647c, p6:double)
            putfield:float(\ub18d\u960f\u3d4b\ubff1\u120d\u647c::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\ub18d\u960f\u3d4b\ubff1\u120d\u647c, mul:float(getfield:float(\ub18d\u960f\u3d4b\ubff1\u120d\u647c::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\ub18d\u960f\u3d4b\ubff1\u120d\u647c), ldc:float(0.75f)))
            putfield:int(\ub18d\u960f\u3d4b\ubff1\u120d\u647c::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\ub18d\u960f\u3d4b\ubff1\u120d\u647c, add:int(ldc:int(60), invokevirtual:int(Random::nextInt, getfield:Random(\ub18d\u960f\u3d4b\ubff1\u120d\u647c::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\ub18d\u960f\u3d4b\ubff1\u120d\u647c), ldc:int(12))))
            invokevirtual:void(\u8bb0\uc910\ua562\u4f52\u385b\u6cfe::\u51fa\uc238\u8d98\u8258\u3e75\ud7e8, this:\ub18d\u960f\u3d4b\ubff1\u120d\u647c[expected:\u8bb0\uc910\ua562\u4f52\u385b\u6cfe], ldc:int(15916745))
            invokevirtual:void(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::\ud523\u52d3\u647c\uc4d2\u6d99\u8df4, this:\ub18d\u960f\u3d4b\ubff1\u120d\u647c[expected:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800], p7:\u873d\ube23\uc84e\u9033\u494c\uff55)
            return:void()
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
            invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\uf995\u34df\uc238\ubded\u71ae\u51fa, this:\ub18d\u960f\u3d4b\ubff1\u120d\u647c[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7::\u0c95\u88c5\ube23\u3776\u6d99\uff55, invokevirtual:\u7c6b\u965f\ua6bd\u69d9\u56bd\u97b7(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u7043\u5bc4\u3d64\u416d\u7049\uc31c, this:\ub18d\u960f\u3d4b\ubff1\u120d\u647c[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a]), p0:double, p1:double, p2:double))
            invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\u51fa\u3bd6\u9033\u97e6\uceb8\u2dcc, this:\ub18d\u960f\u3d4b\ubff1\u120d\u647c[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub18d\u960f\u3d4b\ubff1\u120d\u647c(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u873d\ube23\uc84e\u9033\u494c\uff55 p7, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u4492\u8258\u7043\u071d\ub19c\u156b p8) {
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
            invokespecial:\ub18d\u960f\u3d4b\ubff1\u120d\u647c(\ub18d\u960f\u3d4b\ubff1\u120d\u647c::<init>, this:\ub18d\u960f\u3d4b\ubff1\u120d\u647c, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p4:double, p5:double, p6:double, p7:\u873d\ube23\uc84e\u9033\u494c\uff55)
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
        var_3_63A : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_645 : int
        
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
        var_3_63A = and:int(ldc:int(-1100697095), ldc:int(762822608))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub18d\u960f\u3d4b\ubff1\u120d\u647c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_63A = and:int(var_3_63A:int, ldc:int(1879358742))
        }
        else {
            var_3_63A = and:int(var_3_63A:int, ldc:int(-35135517))
            var_5_85 = and:int(ldc:int(-4951), ldc:int(4886))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16804), ldc:int(-24997)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_63A:int, ldc:int(569899395))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(4933), ldc:int(8227)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-32512), ldc:int(-32511)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_63A = and:int(var_3_D2:int, ldc:int(2129132352))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(2177), ldc:int(12657)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(820992357))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1742482199))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-1727957546))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1821162868))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1550415642))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-1202790232))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-1152975512))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-9890678))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1128858189))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1571538728))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(551011021))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(2115048253))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1534784870))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-772061767))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(-1159212596))
                            var_11_E3 = and:int(ldc:int(1473), ldc:int(-1474))
                            goto(Label_1463)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-9445781))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1758599307))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1159318730))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(496876053))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(650336320))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(1941093130))
                            loopcontinue()
                        }
                        
                        var_3_63A = and:int(var_3_63A:int, ldc:int(636354472))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0708:
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(684922633))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-156920781))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-42164851))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(-1861122327))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-1175668243))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0826:
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-933706634))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1821588210))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-1971278283))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(597162467))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(-122285117))
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(2100182686))
                            loopcontinue()
                        }
                        
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1985264083))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(25153), ldc:int(4097))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0953:
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(1185164090))
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(1277720032))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63A = and:int(var_3_63A:int, ldc:int(592362342))
                        var_11_E3 = and:int(ldc:int(-10418), ldc:int(10289))
                    }
                    
                    Label_1083:
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-1987658924))
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-1071305130))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-809283116))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(-419934977))
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(-487427276))
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(-382957153))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1675467564))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1340)
                            }
                        }
                    }
                    
                    Label_1210:
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-1221204508))
                        goto(Label_1474)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1982033509))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(-46284457))
                            goto(Label_1083)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0953)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(509239122))
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(701188174))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_63A = and:int(var_3_63A:int, ldc:int(2145882420))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1463)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1340:
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1474)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1709413886))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-1700263197))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1430717344))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(479146723))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63A = and:int(var_3_63A:int, ldc:int(-353386578))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1463:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_645 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1474:
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-28836537))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(168166941))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(2092584504))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1329340190))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-141139828))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(1038221472))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63A = and:int(var_3_63A:int, ldc:int(-12190788))
                        var_17_645 = add:int(var_16_111:int, and:int(ldc:int(4801), ldc:int(24597)))
                        looporswitchbreak()
                    }
                }
                
                var_3_63A = and:int(var_3_63A:int, ldc:int(-354635457))
                
                if (cmple:boolean(var_5_85 = var_17_645:int, sub:int(var_6_8C:int, xor:int(ldc:int(13314), ldc:int(13315))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_63A:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
