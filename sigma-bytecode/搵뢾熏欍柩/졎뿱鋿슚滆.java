public class \u6435\ub8be\u718f\u6b0d\u67e9.\uc84e\ubff1\u92ff\uc29a\u6ec6 {
    public void \uc84e\ubff1\u92ff\uc29a\u6ec6(\ua562\ucb79\uc87f\u3dd3\ubcb0.\uc31c\u6c52\u9033\u16f6\uc9f6 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> p2, long p3) {
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
            putfield:\uc31c\u6c52\u9033\u16f6\uc9f6(\uc84e\ubff1\u92ff\uc29a\u6ec6::\u8308\u760c\ud36e\ufe34\u4bc8, this:\uc84e\ubff1\u92ff\uc29a\u6ec6, p0:\uc31c\u6c52\u9033\u16f6\uc9f6)
            invokespecial:Object(Object::<init>, this:\uc84e\ubff1\u92ff\uc29a\u6ec6)
            putfield:\u946b\u6d99\u8df4\u12cb\u5d20(\uc84e\ubff1\u92ff\uc29a\u6ec6::\u960f\ub83f\uc4d2\u839e\u16f6, this:\uc84e\ubff1\u92ff\uc29a\u6ec6, p2:\u946b\u6d99\u8df4\u12cb\u5d20<?>)
            putfield:long(\uc84e\ubff1\u92ff\uc29a\u6ec6::\ub171\u92ff\u4c04\u67d0\u8640, this:\uc84e\ubff1\u92ff\uc29a\u6ec6, add:long(invokestatic:long(System::currentTimeMillis), p3:long))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u71f1\uf995\u3d4b\u47c2\u72f1() {
        var_1_5F : int
        stack_8C_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-452401335), ldc:int(-1770526883))
            
            if (cmpge:boolean(sub:long(getfield:long(\uc84e\ubff1\u92ff\uc29a\u6ec6::\ub171\u92ff\u4c04\u67d0\u8640, this:\uc84e\ubff1\u92ff\uc29a\u6ec6), invokestatic:long(System::currentTimeMillis)), ldc:long(0L))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1375148675))
                stack_8C_0 = and:int(ldc:int(-20519), ldc:int(20518))
            }
            else {
                stack_8C_0 = xor:int(ldc:int(24594), ldc:int(24595))
            }
            
            return:boolean(stack_8C_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20 \u9af2\ub19c\ub1b9\u5bc4\u8640() {
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
            return:\u946b\u6d99\u8df4\u12cb\u5d20(getfield:\u946b\u6d99\u8df4\u12cb\u5d20(\uc84e\ubff1\u92ff\uc29a\u6ec6::\u960f\ub83f\uc4d2\u839e\u16f6, this:\uc84e\ubff1\u92ff\uc29a\u6ec6))
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
    
    public void \u6bb9\u5140\ub18d\u97e6\u4975(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_605 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
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
        var_3_605 = and:int(ldc:int(249339213), ldc:int(1851628527))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc84e\ubff1\u92ff\uc29a\u6ec6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
            var_3_605 = and:int(var_3_605:int, ldc:int(-455934533))
            var_5_7D = and:int(ldc:int(-12849), ldc:int(12848))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3141), ldc:int(-3142)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_605:int, ldc:int(-1189871621))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(1164), ldc:int(1165)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-28660), ldc:int(-28659)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_605 = and:int(var_3_D2:int, ldc:int(1471535565))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(5192), ldc:int(5193)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(534909881))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-374968305))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1006510328))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1421438170))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1125548220))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-759195223))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(73533036))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1264819112))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1302747435))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1261027082))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-76744094))
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(32)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1754586982))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1568069947))
                            var_11_E3 = and:int(ldc:int(-18502), ldc:int(18501))
                            goto(Label_1447)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1503970565))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(55608381))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-560252696))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1161182162))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(91916631))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1207255738))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(861276632))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-357236753))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1765016342))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1833002834))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-2060481435))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1413384526))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1969045399))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1854613718))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(645594525))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-571418942))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1041107174))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1003070457))
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1794790434))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1262615780))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1017801603))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1552826577))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(16853), ldc:int(13857))
                                goto(Label_1099)
                            }
                        }
                    }
                    
                    Label_0961:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1649305316))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(32)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1986889249))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1719496475))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(1320533309))
                        var_11_E3 = and:int(ldc:int(12404), ldc:int(-13429))
                    }
                    
                    Label_1099:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1301816850))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0961)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1414847379))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(125804333))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1194:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(17491084))
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(671531899))
                            goto(Label_1099)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0961)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1685016870))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-66457281))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(112852751))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1447)
                    }
                    
                    Label_1316:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1458)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-2018595855))
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(2119228592))
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(234041883))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1598648664))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-190966783))
                        loopcontinue()
                    }
                    
                    var_3_605 = and:int(var_3_605:int, ldc:int(1912586217))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1447:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_610 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1458:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-144756983))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1194)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1099)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(354256260))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-737019089))
                        var_17_610 = add:int(var_16_111:int, xor:int(ldc:int(17538), ldc:int(17539)))
                        looporswitchbreak()
                    }
                }
                
                var_3_605 = and:int(var_3_605:int, ldc:int(-1057121969))
                
                if (cmple:boolean(var_5_7D = var_17_610:int, sub:int(var_6_84:int, xor:int(ldc:int(16896), ldc:int(16897))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_605 = and:int(var_3_605:int, ldc:int(145908429))
            goto(Label_0106)
        }
    }
}
