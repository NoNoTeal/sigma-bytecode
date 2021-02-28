public class \u3d64\u7af6\uae87\uc238\u7d52.\u718f\ud171\u516c\ubded\u2dcc {
    private void \u718f\ud171\u516c\ubded\u2dcc() {
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
            invokespecial:\u97e6\u8753\u4179\ub1b9\u1833(\u97e6\u8753\u4179\ub1b9\u1833::<init>, this:\u718f\ud171\u516c\ubded\u2dcc)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8df4\u3bd6\u93a2\u7c6b\u8aa5\u6d99(java.util.Random p0, int p1, int p2, int p3, boolean p4) {
        var_6_61 : int
        
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
            var_6_61 = and:int(ldc:int(-232209063), ldc:int(-1635867565))
            
            if (cmpge:boolean(invokevirtual:float(Random::nextFloat, p0:Random), ldc:float(0.4f))) {
                var_6_61 = and:int(var_6_61:int, ldc:int(-257193353))
                putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\ud171\u516c\ubded\u2dcc::\u183a\u8389\uc2e8\u6198\u3d64\u836c, this:\u718f\ud171\u516c\ubded\u2dcc, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8bb0\uc246\uc87f\u67d0\u0800\u12cb)))
            }
            else {
                putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\ud171\u516c\ubded\u2dcc::\u183a\u8389\uc2e8\u6198\u3d64\u836c, this:\u718f\ud171\u516c\ubded\u2dcc, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u1187\uc238\u8350\u59ec\uae87\u92ee)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u718f\ud171\u516c\ubded\u2dcc(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4daf\u8753\u4c2b\u5654\u4c04 p0) {
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
            invokespecial:\u718f\ud171\u516c\ubded\u2dcc(\u718f\ud171\u516c\ubded\u2dcc::<init>, this:\u718f\ud171\u516c\ubded\u2dcc)
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
    
    public void \ubff1\u624e\u5f50\u76bc\u76bc\u2dcc(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5BD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
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
        var_3_5BD = and:int(ldc:int(443184395), ldc:int(-1192336005))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u718f\ud171\u516c\ubded\u2dcc[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-612860226))
            var_5_7D = and:int(ldc:int(23049), ldc:int(-23178))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16667), ldc:int(-21280)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5BD:int, ldc:int(-100962309))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(-14848), ldc:int(-14847)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(4177), ldc:int(8705)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5BD = and:int(var_3_CA:int, ldc:int(2087382539))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(1355), ldc:int(8193)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1506080818))
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-2054107739))
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1318215531))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(331215499))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1997721955))
                    }
                    else {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(535592238))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1371440751))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(310576023))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(152819278))
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-2112505316))
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(2104354079))
                            var_11_DB = and:int(ldc:int(18609), ldc:int(-26804))
                            goto(Label_1351)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-454458838))
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1215045631))
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1180015389))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1509485791))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1496088955))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(2122242444))
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1739572030))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(461307707))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0754:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1259591216))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-559916652))
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(626645375))
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1579379362))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(519011930))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(8261), ldc:int(16913))
                                goto(Label_0987)
                            }
                        }
                    }
                    
                    Label_0865:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(203191403))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1073840738))
                        var_11_DB = and:int(ldc:int(-13198), ldc:int(12421))
                    }
                    
                    Label_0987:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0865)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1028078125))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1946800734))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(501868319))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1220)
                            }
                        }
                    }
                    
                    Label_1082:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-72857357))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1141697518))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(844798576))
                            goto(Label_0987)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0865)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1114816859))
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1932210273))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1369335332))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-42277570))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1351)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1220:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1524403103))
                        goto(Label_1082)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1029645871))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1750943750))
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1048017464))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1288444246))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5BD = and:int(var_3_5BD:int, ldc:int(2045273418))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1351:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5C8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1362:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(2038801890))
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(2084594615))
                        goto(Label_1082)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-2001515999))
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0865)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(497095554))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(419263530))
                        var_17_5C8 = add:int(var_16_109:int, xor:int(ldc:int(513), ldc:int(512)))
                        looporswitchbreak()
                    }
                    
                    var_3_5BD = and:int(var_3_5BD:int, ldc:int(-734667889))
                }
                
                var_3_5BD = and:int(var_3_5BD:int, ldc:int(-8755249))
                
                if (cmple:boolean(var_5_7D = var_17_5C8:int, sub:int(var_6_84:int, and:int(ldc:int(9249), ldc:int(457))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
