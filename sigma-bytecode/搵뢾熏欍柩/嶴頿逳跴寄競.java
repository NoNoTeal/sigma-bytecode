public abstract class \u6435\ub8be\u718f\u6b0d\u67e9.\u5db4\u983f\u9033\u8df4\u5bc4\u7af6 {
    public void \u5db4\u983f\u9033\u8df4\u5bc4\u7af6() {
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
            invokespecial:Object(Object::<init>, this:\u5db4\u983f\u9033\u8df4\u5bc4\u7af6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u6bb9\u6b5f\u071d\u4975\u839e\ubf56() {
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
        
        if (logicalnot:boolean(getstatic:boolean(\u5db4\u983f\u9033\u8df4\u5bc4\u7af6::\u34df\u62da\u8bb0\ub171\ub8be\u527a))) {
            invokeinterface:void(\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20::\ufcaf\u8709\u839e\u446c\u3bc9\u2dcc, invokestatic:\ub18d\uc2e8\u7d52\u7049\u16f6\u5d20(\u3776\u600f\u5245\u62da\u6b5f\uafe7::\u8640\u6bb9\u9033\u76bc\u8413\u839e))
            putstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5db4\u983f\u9033\u8df4\u5bc4\u7af6::\u6ec6\u1833\u5245\uf9c5\ub32d\u92ff, invokestatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u69d9\u3e75\u8389\u647c\u983f\u7ce1::\uf995\u4c2b\ua61f\u839e\u4492\u6c52))
            invokestatic:void(\u69d9\u3e75\u8389\u647c\u983f\u7ce1::\u6b0d\u8aa5\uc910\u494c\u965f\ud171)
            invokestatic:void(GL11::glPushAttrib, ldc:int(1048575))
            invokestatic:void(GL11::glPushClientAttrib, ldc:int(1048575))
            invokestatic:void(GL11::glMatrixMode, and:int(ldc:int(32512), ldc:int(6040)))
            invokestatic:void(GL11::glPushMatrix)
            invokestatic:void(GL11::glMatrixMode, and:int(ldc:int(14123), ldc:int(22341)))
            invokestatic:void(GL11::glPushMatrix)
            invokestatic:void(GL11::glMatrixMode, xor:int(ldc:int(9290), ldc:int(13130)))
            putstatic:boolean(\u5db4\u983f\u9033\u8df4\u5bc4\u7af6::\u34df\u62da\u8bb0\ub171\ub8be\u527a, xor:int[expected:boolean](ldc:int(-28607), ldc:int(-28608)))
        }
    }
    
    public static void \u7d52\u416d\ucfaf\ubefe\ub6ab\u40a9() {
        var_0_5F : int
        var_0_B3 : int
        
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
        var_0_5F = and:int(ldc:int(-181607405), ldc:int(-143200450))
        
        if (getstatic:boolean(\u5db4\u983f\u9033\u8df4\u5bc4\u7af6::\u34df\u62da\u8bb0\ub171\ub8be\u527a)) {
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_B3 = and:int(var_0_5F:int, ldc:int(695943330))
                }
                else {
                    var_0_B3 = and:int(var_0_5F:int, ldc:int(-134221802))
                    invokestatic:void(GL11::glMatrixMode, and:int(ldc:int(8085), ldc:int(30497)))
                    invokestatic:void(GL11::glPopMatrix)
                    invokestatic:void(GL11::glMatrixMode, and:int(ldc:int(5920), ldc:int(5954)))
                    invokestatic:void(GL11::glPopMatrix)
                    invokestatic:void(GL11::glPopClientAttrib)
                    invokestatic:void(GL11::glPopAttrib)
                    
                    if (cmpne:boolean(getstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5db4\u983f\u9033\u8df4\u5bc4\u7af6::\u6ec6\u1833\u5245\uf9c5\ub32d\u92ff), aconstnull:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe())) {
                        invokeinterface:void(\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe::\uc9f6\u3776\uc246\u4f52\ua3b4\u624e, getstatic:\ubcb0\uc246\ua6bd\u527a\u97e6\ubefe(\u5db4\u983f\u9033\u8df4\u5bc4\u7af6::\u6ec6\u1833\u5245\uf9c5\ub32d\u92ff))
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_0_B3:int, ldc:int(134217728)), ldc:int(0))) {
                    var_0_B3 = and:int(var_0_B3:int, ldc:int(-225130))
                    invokestatic:void(\u69d9\u3e75\u8389\u647c\u983f\u7ce1::\u6b0d\u8aa5\uc910\u494c\u965f\ud171)
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_B3:int, ldc:int(-2097199803))
            }
            
            putstatic:boolean(\u5db4\u983f\u9033\u8df4\u5bc4\u7af6::\u34df\u62da\u8bb0\ub171\ub8be\u527a, and:int[expected:boolean](ldc:int(4802), ldc:int(-4803)))
        }
    }
    
    public final void \u120d\uc910\u69d9\u71ae\u12cb\u946b() {
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
            invokestatic:void(\u5db4\u983f\u9033\u8df4\u5bc4\u7af6::\u6bb9\u6b5f\u071d\u4975\u839e\ubf56)
            invokevirtual:void(\u5db4\u983f\u9033\u8df4\u5bc4\u7af6::\u759a\u156b\u5db4\u3c25\u71f1\u071d, this:\u5db4\u983f\u9033\u8df4\u5bc4\u7af6)
            invokestatic:void(\u5db4\u983f\u9033\u8df4\u5bc4\u7af6::\u7d52\u416d\ucfaf\ubefe\ub6ab\u40a9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract void \u759a\u156b\u5db4\u3c25\u71f1\u071d();
    
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
            putstatic:boolean(\u5db4\u983f\u9033\u8df4\u5bc4\u7af6::\u34df\u62da\u8bb0\ub171\ub8be\u527a, and:int[expected:boolean](ldc:int(-12022), ldc:int(3301)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u12b2\u392e\u56bd\u4e72\u74b1\u8389(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_632 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_63D : int
        
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
        var_3_632 = and:int(ldc:int(-851006815), ldc:int(-606098747))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5db4\u983f\u9033\u8df4\u5bc4\u7af6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(2048)), ldc:int(0))) {
            var_3_632 = and:int(var_3_632:int, ldc:int(-571098406))
            var_5_7D = and:int(ldc:int(16865), ldc:int(-16866))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-7559), ldc:int(7556)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_632:int, ldc:int(1240922612))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(-31456), ldc:int(-31455)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(12), ldc:int(13)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_632 = and:int(var_3_D2:int, ldc:int(-883036466))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(16688), ldc:int(16689)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1229998006))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-508009151))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(128)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(992471224))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1828991003))
                    }
                    else {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1566571665))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1848555355))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1903945660))
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1556510877))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-935065928))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-615584639))
                            var_11_E3 = and:int(ldc:int(-16518), ldc:int(16517))
                            goto(Label_1471)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(201781834))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-228379302))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1214605598))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1785939387))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(64)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-837699177))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1529372920))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-1103852092))
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(2144189628))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-584774813))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(64)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1999139853))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1865726479))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-235202294))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-1847581494))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(1498938589))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1193597908))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-2107091941))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1524546665))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-1560860494))
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(-648036895))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(23043), ldc:int(8597))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-393532079))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1170)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-507968609))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1223969007))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(-78333741))
                        var_11_E3 = and:int(ldc:int(26424), ldc:int(-30525))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(604822600))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(1404981399))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-879989730))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(2096889645))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(64)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-934496903))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(1843838911))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1170:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(128)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1785656512))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-2100668335))
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-1728662321))
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-992914440))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-1705271794))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(135383880))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_632 = and:int(var_3_632:int, ldc:int(-204307640))
                            loopcontinue()
                        }
                        
                        var_3_632 = and:int(var_3_632:int, ldc:int(-546391645))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1471)
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1847970557))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1991310144))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-1194095744))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-504043716))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(101184011))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(64)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1554192442))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(64)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(413262528))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_632 = and:int(var_3_632:int, ldc:int(-639194666))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1471:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63D = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1482:
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(-760266838))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(480843264))
                        goto(Label_1170)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(726439353))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_632:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_632:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_632 = and:int(var_3_632:int, ldc:int(1811414430))
                        var_17_63D = add:int(var_16_111:int, xor:int(ldc:int(19712), ldc:int(19713)))
                        looporswitchbreak()
                    }
                    
                    var_3_632 = and:int(var_3_632:int, ldc:int(-95779292))
                }
                
                var_3_632 = and:int(var_3_632:int, ldc:int(-381228883))
                
                if (cmple:boolean(var_5_7D = var_17_63D:int, sub:int(var_6_84:int, xor:int(ldc:int(16640), ldc:int(16641))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_632:int, ldc:int(64)), ldc:int(0))) {
            var_3_632 = and:int(var_3_632:int, ldc:int(-1602082859))
            goto(Label_0106)
        }
    }
}
