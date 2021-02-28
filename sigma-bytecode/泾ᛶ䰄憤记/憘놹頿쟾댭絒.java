public class \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52 {
    private void \u6198\ub1b9\u983f\uc7fe\ub32d\u7d52(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u873d\ube23\uc84e\u9033\u494c\uff55 p7) {
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
            invokespecial:\u8bb0\uc910\ua562\u4f52\u385b\u6cfe(\u8bb0\uc910\ua562\u4f52\u385b\u6cfe::<init>, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p7:\u873d\ube23\uc84e\u9033\u494c\uff55, ldc:float(-0.05f))
            putfield:double(\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52::\uc238\u839e\u3bc9\u446c\u9af2\uf995, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52, p4:double)
            putfield:double(\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52::\u718f\u64ab\u9033\ub32d\ub32d\u1833, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52, p5:double)
            putfield:double(\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52::\ub18d\u839e\uc910\u7043\u59ec\u839e, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52, p6:double)
            putfield:float(\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52, mul:float(getfield:float(\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52::\u3c25\ub83f\u36d3\uf995\u0b8e\u3504, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52), ldc:float(0.75f)))
            putfield:int(\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52::\u3776\u8709\u67e9\u6fb0\uff55\u97e6, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52, add:int(ldc:int(60), invokevirtual:int(Random::nextInt, getfield:Random(\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52), ldc:int(12))))
            invokevirtual:void(\u6c56\ua068\u8bb0\u7ce1\u8413\u0800::\ud523\u52d3\u647c\uc4d2\u6d99\u8df4, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52[expected:\u6c56\ua068\u8bb0\u7ce1\u8413\u0800], p7:\u873d\ube23\uc84e\u9033\u494c\uff55)
            
            if (cmpne:boolean(invokevirtual:int(Random::nextInt, getfield:Random(\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52), and:int(ldc:int(16420), ldc:int(1052))), ldc:int(0))) {
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\ud51e\ud4fe\ua6bd\u4179\u965f\u7e3f, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], add:float(ldc:float(0.1f), mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52)), ldc:float(0.2f))), add:float(ldc:float(0.4f), mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52)), ldc:float(0.3f))), mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52)), ldc:float(0.2f)))
            }
            else {
                invokevirtual:void(\uff55\u97b7\u6fb0\u8308\u183a\u183a::\ud51e\ud4fe\ua6bd\u4179\u965f\u7e3f, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52[expected:\uff55\u97b7\u6fb0\u8308\u183a\u183a], add:float(ldc:float(0.6f), mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52)), ldc:float(0.2f))), add:float(ldc:float(0.6f), mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52)), ldc:float(0.3f))), mul:float(invokevirtual:float(Random::nextFloat, getfield:Random(\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52::\uceb8\u34df\ucb79\u446c\u99f7\uc29a, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52)), ldc:float(0.2f)))
            }
            
            invokevirtual:void(\u8bb0\uc910\ua562\u4f52\u385b\u6cfe::\u51fa\u7006\u120d\ua068\u3504\u8aa5, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52[expected:\u8bb0\uc910\ua562\u4f52\u385b\u6cfe], ldc:float(0.6f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6198\ub1b9\u983f\uc7fe\ub32d\u7d52(\u927d\u92ff\u71ae\uafe7\u6bb9.\u16f6\u61a4\u5db4\u4c04\u64ab\u9255 p0, double p1, double p2, double p3, double p4, double p5, double p6, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u873d\ube23\uc84e\u9033\u494c\uff55 p7, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5140\u93a2\ub7dc\uc29a\u0a06\u8d90 p8) {
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
            invokespecial:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52(\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52::<init>, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52, p0:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255, p1:double, p2:double, p3:double, p4:double, p5:double, p6:double, p7:\u873d\ube23\uc84e\u9033\u494c\uff55)
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
        var_3_5BD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5C8 : int
        
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
        var_3_5BD = and:int(ldc:int(-75759626), ldc:int(-662964292))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6198\ub1b9\u983f\uc7fe\ub32d\u7d52[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-612369999))
            var_5_7D = and:int(ldc:int(685), ldc:int(-19118))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23680), ldc:int(17439)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5BD:int, ldc:int(-663225412))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(-32256), ldc:int(-32255)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(33), ldc:int(32)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5BD = and:int(var_3_D2:int, ldc:int(-537396361))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(9), ldc:int(10243)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1185622314))
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1826996247))
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1343906189))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1380972996))
                    }
                    else {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-84413582))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0517)
                            }
                            
                            goto(Label_0738)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1252)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(367124364))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1095))
                            var_11_E3 = and:int(ldc:int(25922), ldc:int(-25956))
                            goto(Label_1359)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0517:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1920306633))
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-379384369))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(40958417))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-637796360))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0738)
                        }
                    }
                    
                    Label_0620:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1014754230))
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1046459464))
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-968715859))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0849)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-72025809))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-587466435))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0738:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-264062590))
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(946990922))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-335126831))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-718357252))
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-663488586))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(17795), ldc:int(12905))
                                goto(Label_1003)
                            }
                        }
                    }
                    
                    Label_0849:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1610643458))
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(378808682))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1088191254))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1220460140))
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1744833666))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-545523279))
                        var_11_E3 = and:int(ldc:int(30764), ldc:int(-30781))
                    }
                    
                    Label_1003:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(787058062))
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(307547446))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(2053546539))
                            goto(Label_0849)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1848499804))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1955494438))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-524996))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1252)
                            }
                        }
                    }
                    
                    Label_1122:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1449437245))
                            goto(Label_1003)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0849)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1060779658))
                            goto(Label_0620)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1617792641))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(801012191))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1304990321))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-58720335))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1359)
                    }
                    
                    Label_1252:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1942351037))
                        goto(Label_1122)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1475870918))
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5BD = and:int(var_3_5BD:int, ldc:int(-51118664))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1359:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5C8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1370:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1683925274))
                        goto(Label_1252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1122)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1184377706))
                        goto(Label_0849)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-979334807))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0620)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(930676489))
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-84151429))
                        var_17_5C8 = add:int(var_16_111:int, xor:int(ldc:int(-32160), ldc:int(-32159)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5BD = and:int(var_3_5BD:int, ldc:int(-571213505))
                
                if (cmple:boolean(var_5_7D = var_17_5C8:int, sub:int(var_6_84:int, and:int(ldc:int(16457), ldc:int(8453))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32768)), ldc:int(0))) {
            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-729908421))
            goto(Label_0106)
        }
    }
}
