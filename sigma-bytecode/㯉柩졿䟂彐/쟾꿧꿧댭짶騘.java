public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\uc7fe\uafe7\uafe7\ub32d\uc9f6\u9a18 {
    public void \uc7fe\uafe7\uafe7\ub32d\uc9f6\u9a18() {
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
            invokespecial:Object(Object::<init>, this:\uc7fe\uafe7\uafe7\ub32d\uc9f6\u9a18)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u5140\uafe7\ud171\u97b7\ub70c\u7006(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p0) {
        var_3_67 : \uc29a\u6198\u6bb9\u4492\u965f[]
        var_5_86 : \uc29a\u6198\u6bb9\u4492\u965f
        
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
        var_3_67 = invokevirtual:\uc29a\u6198\u6bb9\u4492\u965f[](\ud523\u92ff\ubb2b\u759a\ud36e::\uc84e\u446c\u4f4a\uc910\u9a18\u416d, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u960f\uf9c5\u3a62\u3e2a\u494c\u4cd9, p0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910))
        
        if (cmpne:boolean(var_3_67:\uc29a\u6198\u6bb9\u4492\u965f[], aconstnull:\uc29a\u6198\u6bb9\u4492\u965f[]())) {
            var_5_86 = loadelement:\uc29a\u6198\u6bb9\u4492\u965f(var_3_67:\uc29a\u6198\u6bb9\u4492\u965f[], shr:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910::\u7d52\ub32d\u7e3f\ubefe\u40a9\u67d0, p0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)), xor:int(ldc:int(8450), ldc:int(8454))))
            return:int(ternaryop:int(cmpne:boolean(var_5_86:\uc29a\u6198\u6bb9\u4492\u965f, aconstnull:\uc29a\u6198\u6bb9\u4492\u965f()), invokevirtual:short(\uc29a\u6198\u6bb9\u4492\u965f::\u0800\u392e\u3bd6\ub32d\ub113\ub113, var_5_86:\uc29a\u6198\u6bb9\u4492\u965f), and:int(ldc:int(7250), ldc:int(-7763))))
        }
        
        return:int(and:int(ldc:int(-4012), ldc:int(2475)))
    }
    
    public static double \u36d3\u7af6\u7ce1\ub8be\u8308\uceb8(\ub113\uc4d2\u183a\u527a\u6435.\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910 p0) {
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
            return:double(invokestatic:double(\uc7fe\uafe7\uafe7\ub32d\uc9f6\u9a18::\u36d3\u7af6\u7ce1\ub8be\u8308\uceb8, invokestatic:int(\uc7fe\uafe7\uafe7\ub32d\uc9f6\u9a18::\u5140\uafe7\ud171\u97b7\ub70c\u7006, p0:\u4ab3\ub1b9\u2dcc\ub8be\ube23\uc910)))
        }
        
        goto(Label_0006)
    }
    
    public static double \u36d3\u7af6\u7ce1\ub8be\u8308\uceb8(int p0) {
        var_5_7F : double
        
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
            var_5_7F = invokestatic:double(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, sub:double(mul:double(mul:double(div:double(i2d:double(p0:int), ldc:double(4096.0)), ldc:double(0.995)), ldc:double(2.0)), ldc:double(1.0)), ldc:double(-1.0), ldc:double(1.0))
            return:double(f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7d52\u8258\u61a4\u7049\uc3e3\u4c2b, sub:double(ldc:double(1.0), mul:double(var_5_7F:double, var_5_7F:double)))))
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
    
    public void \u759a\u1833\ub18d\u446c\u4492\u7d52(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_605 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_610 : int
        
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
        var_3_605 = and:int(ldc:int(-1066989728), ldc:int(563420919))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc7fe\uafe7\uafe7\ub32d\uc9f6\u9a18[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(262144)), ldc:int(0))) {
            var_3_605 = and:int(var_3_605:int, ldc:int(669889568))
        }
        else {
            var_3_605 = and:int(var_3_605:int, ldc:int(1609393691))
            var_5_85 = and:int(ldc:int(-28652), ldc:int(28136))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-28880), ldc:int(28869)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_605:int, ldc:int(-895641660))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(9288), ldc:int(9289)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(169), ldc:int(168)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_605 = and:int(var_3_D2:int, ldc:int(57620391))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(17792), ldc:int(17793)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(2126933460))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-503673508))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1882268573))
                    }
                    else {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-764573757))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(815704726))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1005110713))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(801999711))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(2012979028))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-14852358))
                            var_11_E3 = and:int(ldc:int(-20149), ldc:int(3252))
                            goto(Label_1423)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1865809949))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1904293911))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1783571852))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1230735782))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(218164268))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1707311183))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1691902452))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1672244015))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(622287052))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-6434488))
                        goto(Label_0881)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(292457414))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(1661292532))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1964466699))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1016203289))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-300528999))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(1265069899))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(96), ldc:int(97))
                                goto(Label_1059)
                            }
                        }
                    }
                    
                    Label_0881:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-791179482))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-413232225))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-818672094))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-491012435))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(98612724))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-90829198))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-280192600))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1845991667))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(46614246))
                        var_11_E3 = and:int(ldc:int(10757), ldc:int(-11014))
                    }
                    
                    Label_1059:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1189017335))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1408577037))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1930989066))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1694750989))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1039546720))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-414198060))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(105007809))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1059)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1952693113))
                            goto(Label_0881)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-192401986))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1819942957))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1423)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1292:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-2087087058))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-547630034))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1103458546))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1788321131))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1834868049))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_605 = and:int(var_3_605:int, ldc:int(420435836))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_610 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1027290650))
                        goto(Label_0881)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(759463331))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(487955835))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-568573344))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-957923672))
                        var_17_610 = add:int(var_16_111:int, xor:int(ldc:int(24712), ldc:int(24713)))
                        looporswitchbreak()
                    }
                    
                    var_3_605 = and:int(var_3_605:int, ldc:int(-1952901712))
                }
                
                var_3_605 = and:int(var_3_605:int, ldc:int(1194827763))
                
                if (cmple:boolean(var_5_85 = var_17_610:int, sub:int(var_6_8C:int, and:int(ldc:int(12561), ldc:int(2701))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
