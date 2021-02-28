public class \u12b2\u7049\u8df4\uc9f6\uae87.\ud217\u416d\u67e9\u16f6\ua61f\u3d4b {
    private void \ud217\u416d\u67e9\u16f6\ua61f\u3d4b() {
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
            invokespecial:\u97e6\u8753\u4179\ub1b9\u1833(\u97e6\u8753\u4179\ub1b9\u1833::<init>, this:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8df4\u3bd6\u93a2\u7c6b\u8aa5\u6d99(java.util.Random p0, int p1, int p2, int p3, boolean p4) {
        var_6_61 : int
        var_8_84 : float
        
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
            var_6_61 = and:int(ldc:int(-1188958130), ldc:int(-1422188994))
            
            if (logicalnot:boolean(p4:boolean)) {
                putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ud217\u416d\u67e9\u16f6\ua61f\u3d4b::\u183a\u8389\uc2e8\u6198\u3d64\u836c, this:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u3504\u9a18\u3a62\u446c\u960f\u3e75)))
            }
            else {
                var_8_84 = invokevirtual:float(Random::nextFloat, p0:Random)
                
                if (cmplt:boolean(var_8_84:float, ldc:float(0.2f))) {
                    putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ud217\u416d\u67e9\u16f6\ua61f\u3d4b::\u183a\u8389\uc2e8\u6198\u3d64\u836c, this:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u5fe1\u983f\u6bb9\u983f\u5db4\u7d52)))
                    goto(Label_0352)
                }
                
                Label_0142:
                
                if (cmpne:boolean(and:int(var_6_61:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0352)
                }
                
                if (cmpeq:boolean(and:int(var_6_61:int, ldc:int(2)), ldc:int(0))) {
                    var_6_61 = and:int(var_6_61:int, ldc:int(1135066245))
                    goto(Label_0240)
                }
                
                if (cmpeq:boolean(and:int(var_6_61:int, ldc:int(1024)), ldc:int(0))) {
                    var_6_61 = and:int(var_6_61:int, ldc:int(695070247))
                    
                    if (cmplt:boolean(var_8_84:float, ldc:float(0.5f))) {
                        putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ud217\u416d\u67e9\u16f6\ua61f\u3d4b::\u183a\u8389\uc2e8\u6198\u3d64\u836c, this:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\uc910\u1833\u5fe1\ud4fe\ubf56\u62da)))
                        goto(Label_0352)
                    }
                }
                
                Label_0191:
                
                if (cmpne:boolean(and:int(var_6_61:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0352)
                }
                
                if (cmpeq:boolean(and:int(var_6_61:int, ldc:int(2)), ldc:int(0))) {
                    var_6_61 = and:int(var_6_61:int, ldc:int(1412448209))
                }
                else {
                    if (cmpne:boolean(and:int(var_6_61:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0142)
                    }
                    
                    var_6_61 = and:int(var_6_61:int, ldc:int(1768593239))
                    
                    if (cmplt:boolean(var_8_84:float, ldc:float(0.55f))) {
                        putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ud217\u416d\u67e9\u16f6\ua61f\u3d4b::\u183a\u8389\uc2e8\u6198\u3d64\u836c, this:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8413\u74b1\u983f\u385b\u527a\u97b7)))
                        goto(Label_0352)
                    }
                }
                
                Label_0240:
                
                if (cmpne:boolean(and:int(var_6_61:int, ldc:int(536870912)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_6_61:int, ldc:int(1024)), ldc:int(0))) {
                        var_6_61 = and:int(var_6_61:int, ldc:int(578289967))
                        goto(Label_0191)
                    }
                    
                    if (cmpne:boolean(and:int(var_6_61:int, ldc:int(33554432)), ldc:int(0))) {
                        var_6_61 = and:int(var_6_61:int, ldc:int(1253800428))
                        goto(Label_0142)
                    }
                    
                    var_6_61 = and:int(var_6_61:int, ldc:int(803344103))
                    putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ud217\u416d\u67e9\u16f6\ua61f\u3d4b::\u183a\u8389\uc2e8\u6198\u3d64\u836c, this:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u647c\u7e3f\u8cae\u516c\ub1b9\ub18d)))
                }
                
                Label_0352:
                
                if (cmpne:boolean(and:int(var_6_61:int, ldc:int(1)), ldc:int(0))) {
                    var_6_61 = and:int(var_6_61:int, ldc:int(-384670418))
                    goto(Label_0240)
                }
                
                if (cmpne:boolean(and:int(var_6_61:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0191)
                }
                
                if (cmpeq:boolean(and:int(var_6_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0142)
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud217\u416d\u67e9\u16f6\ua61f\u3d4b(\u516c\u3d64\u718f\ub171\u6b5f.\ufcaf\u64f2\uc84e\ua3b4\u64f2 p0) {
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
            invokespecial:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b(\ud217\u416d\u67e9\u16f6\ua61f\u3d4b::<init>, this:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b)
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
        var_3_62F : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_63A : int
        
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
        var_3_62F = and:int(ldc:int(-328122343), ldc:int(2138927387))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud217\u416d\u67e9\u16f6\ua61f\u3d4b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_62F = and:int(var_3_62F:int, ldc:int(-58721669))
            var_5_7D = and:int(ldc:int(8436), ldc:int(-8437))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3466), ldc:int(3465)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_62F:int, ldc:int(-1384260454))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(1089), ldc:int(6921)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(8580), ldc:int(8581)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_62F = and:int(var_3_D2:int, ldc:int(-278967078))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(693), ldc:int(26945)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1932947283))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1587956118))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(211978488))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1986564359))
                    }
                    else {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1037749721))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1449517859))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-817036465))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1311563852))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1067872101))
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(631466553))
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-19011655))
                        var_11_E3 = and:int(ldc:int(-23420), ldc:int(20859))
                        goto(Label_1471)
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(256044269))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-411505920))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1378778842))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(917193762))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(669971488))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-2090761932))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-186651776))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(28146326))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-1708992986))
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(777158617))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1810384340))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1796051065))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-364748405))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-572724070))
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(696534036))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1851224763))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0826:
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(95790749))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(201275289))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-120126710))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-1364233218))
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-61187714))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(4128), ldc:int(4129))
                                goto(Label_1091)
                            }
                        }
                    }
                    
                    Label_0937:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1547127537))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(370667817))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-242507931))
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(1484249928))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(1012176168))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1367711971))
                        var_11_E3 = and:int(ldc:int(19372), ldc:int(-23533))
                    }
                    
                    Label_1091:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1479583491))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1231076033))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-1544019341))
                            goto(Label_0937)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-987175685))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(68117049))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1092794696))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1348)
                            }
                        }
                    }
                    
                    Label_1210:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1371400685))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(516222527))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1091)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-1847622075))
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(8)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-1565559857))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(1769242611))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(1035685515))
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1022518940))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1471)
                    }
                    
                    Label_1348:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1038790959))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1106658853))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(130853279))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1411523048))
                        loopcontinue()
                    }
                    
                    var_3_62F = and:int(var_3_62F:int, ldc:int(-1375909158))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1471:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63A = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1482:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1070586892))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1366011268))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1350873644))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1257641722))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1020612218))
                        var_17_63A = add:int(var_16_111:int, xor:int(ldc:int(456), ldc:int(457)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62F = and:int(var_3_62F:int, ldc:int(1851641407))
                
                if (cmple:boolean(var_5_7D = var_17_63A:int, sub:int(var_6_84:int, and:int(ldc:int(3605), ldc:int(20553))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(16)), ldc:int(0))) {
            var_3_62F = and:int(var_3_62F:int, ldc:int(-396172227))
            goto(Label_0106)
        }
    }
}
