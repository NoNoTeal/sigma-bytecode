public class \u36d3\u9033\u6b0d\u983f\u8d90.\u3a62\u624e\u983f\ud171\u3c25\u74b1 {
    public void \u3a62\u624e\u983f\ud171\u3c25\u74b1(double p0) {
        var_5_69 : int
        var_6_77 : double
        var_8_7D : double
        var_10_87 : double
        var_6_91 : double
        var_12_95 : double
        var_8_9C : double
        var_10_AA : double
        var_6_B4 : double
        var_12_B8 : double
        var_8_BF : double
        var_10_CD : double
        
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
            invokespecial:Object(Object::<init>, this:\u3a62\u624e\u983f\ud171\u3c25\u74b1)
            var_5_69 = d2i:int(mul:double(p0:double, ldc:double(0.6366197723675814)))
            
            loop {
                var_6_77 = mul:double(i2d:double(neg:int(var_5_69:int)), ldc:double(1.570796251296997))
                var_8_7D = add:double(p0:double, var_6_77:double)
                var_10_87 = neg:double(sub:double(sub:double(var_8_7D:double, p0:double), var_6_77:double))
                var_6_91 = mul:double(i2d:double(neg:int(var_5_69:int)), ldc:double(7.549789948768648E-8))
                var_12_95 = var_8_7D:double
                var_8_9C = add:double(var_6_91:double, var_12_95:double)
                var_10_AA = add:double(var_10_87:double, neg:double(sub:double(sub:double(var_8_9C:double, var_12_95:double), var_6_91:double)))
                var_6_B4 = mul:double(i2d:double(neg:int(var_5_69:int)), ldc:double(6.123233995736766E-17))
                var_12_B8 = var_8_9C:double
                var_8_BF = add:double(var_6_B4:double, var_12_B8:double)
                var_10_CD = add:double(var_10_AA:double, neg:double(sub:double(sub:double(var_8_BF:double, var_12_B8:double), var_6_B4:double)))
                
                if (cmpgt:boolean(var_8_BF:double, ldc:double(0.0))) {
                    looporswitchbreak()
                }
                
                inc:int(var_5_69, ldc:int(-1))
            }
            
            putfield:int(\u3a62\u624e\u983f\ud171\u3c25\u74b1::\u4492\ud12e\u983f\u946b\u71ae\u516c, this:\u3a62\u624e\u983f\ud171\u3c25\u74b1, var_5_69:int)
            putfield:double(\u3a62\u624e\u983f\ud171\u3c25\u74b1::\u7873\uff55\u416d\u3e2a\u76bc\uae5d, this:\u3a62\u624e\u983f\ud171\u3c25\u74b1, var_8_BF:double)
            putfield:double(\u3a62\u624e\u983f\ud171\u3c25\u74b1::\u51fa\u624e\u0b8e\u8c8a\uc87f\u624e, this:\u3a62\u624e\u983f\ud171\u3c25\u74b1, var_10_CD:double)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u88c5\u836c\u8cae\u6c56\ufe34\u71f1() {
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
            return:int(getfield:int(\u3a62\u624e\u983f\ud171\u3c25\u74b1::\u4492\ud12e\u983f\u946b\u71ae\u516c, this:\u3a62\u624e\u983f\ud171\u3c25\u74b1))
        }
        
        goto(Label_0006)
    }
    
    public double \uc29a\u183a\u983f\u120d\u7bad\u67d0() {
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
            return:double(getfield:double(\u3a62\u624e\u983f\ud171\u3c25\u74b1::\u7873\uff55\u416d\u3e2a\u76bc\uae5d, this:\u3a62\u624e\u983f\ud171\u3c25\u74b1))
        }
        
        goto(Label_0006)
    }
    
    public double \u6fb0\u8c8a\u3bc9\ub8be\u416d\u7006() {
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
            return:double(getfield:double(\u3a62\u624e\u983f\ud171\u3c25\u74b1::\u51fa\u624e\u0b8e\u8c8a\uc87f\u624e, this:\u3a62\u624e\u983f\ud171\u3c25\u74b1))
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
    
    public void \ub113\uc2e8\u51fa\uceb8\u8308\ucb79(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5E5 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5F0 : int
        
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
        var_3_5E5 = and:int(ldc:int(-1899150549), ldc:int(920503101))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3a62\u624e\u983f\ud171\u3c25\u74b1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-75650840))
        }
        else {
            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-528250945))
            var_5_85 = and:int(ldc:int(4717), ldc:int(-5742))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-13735), ldc:int(5542)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5E5:int, ldc:int(-488665221))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(10753), ldc:int(4113)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(18480), ldc:int(18481)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5E5 = and:int(var_3_D2:int, ldc:int(629765035))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(649), ldc:int(648)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1729808860))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1862926336))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1083726616))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-345943014))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(111815318))
                    }
                    else {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1737096189))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1055996035))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(8998609))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(624045022))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1739562987))
                            var_11_E3 = and:int(ldc:int(30144), ldc:int(-30147))
                            goto(Label_1423)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-135966737))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-593269844))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1199345002))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-90545638))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-473540850))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(866485421))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(548873519))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1119546152))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(970567498))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-2086504572))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1201423819))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1536266951))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1896818681))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1792263983))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1685302173))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-227631721))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-2116416224))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1444672672))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1627801671))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(18449), ldc:int(1857))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(835081533))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(84191883))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(832491680))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-692895761))
                        var_11_E3 = and:int(ldc:int(-23691), ldc:int(21642))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-920301951))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1207208393))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1106046961))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1833109823))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(183365103))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-762410721))
                            goto(Label_1051)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1109139535))
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-360016404))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1477120485))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1283365944))
                            loopcontinue()
                        }
                        
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1248083541))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1423)
                    }
                    
                    Label_1292:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-1347007641))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1733220399))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-499075997))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(965542958))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(1645268579))
                        loopcontinue()
                    }
                    
                    var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-556532419))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F0 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(-952730928))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5E5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5E5 = and:int(var_3_5E5:int, ldc:int(413740989))
                        var_17_5F0 = add:int(var_16_111:int, and:int(ldc:int(1321), ldc:int(8727)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5E5 = and:int(var_3_5E5:int, ldc:int(932424489))
                
                if (cmple:boolean(var_5_85 = var_17_5F0:int, sub:int(var_6_8C:int, and:int(ldc:int(16417), ldc:int(137))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5E5:int, ldc:int(32768)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
