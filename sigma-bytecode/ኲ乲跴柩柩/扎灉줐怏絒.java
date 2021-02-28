public class \u12b2\u4e72\u8df4\u67e9\u67e9.\u624e\u7049\uc910\u600f\u7d52 {
    public void \u624e\u7049\uc910\u600f\u7d52(int p0) {
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
            invokespecial:Object(Object::<init>, this:\u624e\u7049\uc910\u600f\u7d52)
            putfield:int(\u624e\u7049\uc910\u600f\u7d52::\u34df\ua068\u72f1\u527a\u0b8e, this:\u624e\u7049\uc910\u600f\u7d52, p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8709\u5f50\u64ab\ud4fe\u5245\u3711(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0) {
        var_2_5F : int
        var_2_70 : int
        var_4_11F : int
        var_5_81 : int
        var_6_8A : int
        var_7_93 : int
        var_8_CA : \u12cb\u93a2\ubf56\uc229\u8d90
        
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
        var_2_5F = and:int(ldc:int(1009917226), ldc:int(-1845814661))
        
        if (cmpgt:boolean(invokeinterface:int(List<E>::size, invokevirtual:List<\u12cb\u93a2\ubf56\uc229\u8d90>(\u12cb\u93a2\ubf56\uc229\u8d90::\u67e9\u7330\u62da\u3c25\u624e, p0:\u12cb\u93a2\ubf56\uc229\u8d90)), ldc:int(0))) {
            var_2_70 = and:int(var_2_5F:int, ldc:int(-97052162))
            var_4_11F = and:int(ldc:int(26189), ldc:int(-26190))
            var_5_81 = and:int(ldc:int(-318), ldc:int(317))
            var_6_8A = and:int(ldc:int(-30048), ldc:int(28934))
            var_7_93 = and:int(ldc:int(23896), ldc:int(-23897))
            
            while (cmplt:boolean(var_7_93:int, invokeinterface:int(List<E>::size, invokevirtual:List<\u12cb\u93a2\ubf56\uc229\u8d90>(\u12cb\u93a2\ubf56\uc229\u8d90::\u67e9\u7330\u62da\u3c25\u624e, p0:\u12cb\u93a2\ubf56\uc229\u8d90)))) {
                var_8_CA = checkcast:\u12cb\u93a2\ubf56\uc229\u8d90(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90.class, invokeinterface:\u12cb\u93a2\ubf56\uc229\u8d90(List<\u12cb\u93a2\ubf56\uc229\u8d90>::get, invokevirtual:List<\u12cb\u93a2\ubf56\uc229\u8d90>(\u12cb\u93a2\ubf56\uc229\u8d90::\u67e9\u7330\u62da\u3c25\u624e, p0:\u12cb\u93a2\ubf56\uc229\u8d90), var_7_93:int))
                
                if (cmpgt:boolean(add:int(add:int(var_4_11F:int, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, var_8_CA:\u12cb\u93a2\ubf56\uc229\u8d90)), getfield:int(\u624e\u7049\uc910\u600f\u7d52::\u34df\ua068\u72f1\u527a\u0b8e, this:\u624e\u7049\uc910\u600f\u7d52)), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, p0:\u12cb\u93a2\ubf56\uc229\u8d90))) {
                    var_4_11F = and:int(ldc:int(31238), ldc:int(-31495))
                    var_5_81 = add:int(var_5_81:int, var_6_8A:int)
                }
                
                var_2_70 = and:int(var_2_70:int, ldc:int(-1094830678))
                invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u839e\u960f\u64ab\u8cae\ub8be, var_8_CA:\u12cb\u93a2\ubf56\uc229\u8d90, var_5_81:int)
                invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\ube23\u4daf\ub171\u6198\u51b2, var_8_CA:\u12cb\u93a2\ubf56\uc229\u8d90, var_4_11F:int)
                var_4_11F = add:int(var_4_11F:int, add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, var_8_CA:\u12cb\u93a2\ubf56\uc229\u8d90), getfield:int(\u624e\u7049\uc910\u600f\u7d52::\u34df\ua068\u72f1\u527a\u0b8e, this:\u624e\u7049\uc910\u600f\u7d52)))
                var_6_8A = invokestatic:int(Math::max, invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, var_8_CA:\u12cb\u93a2\ubf56\uc229\u8d90), var_6_8A:int)
                inc:int(var_7_93, ldc:int(1))
            }
        }
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
    
    public void \u9937\u8d98\uf9c5\uc238\u5fe1\ud12e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5ED : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_5F8 : int
        
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
        var_3_5ED = and:int(ldc:int(1457848613), ldc:int(2053874111))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u624e\u7049\uc910\u600f\u7d52[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1430584139))
        }
        else {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-663644187))
            var_5_85 = and:int(ldc:int(10667), ldc:int(-11184))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-1350), ldc:int(1349)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5ED:int, ldc:int(-529716754))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(12480), ldc:int(12481)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(9739), ldc:int(129)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5ED = and:int(var_3_DA:int, ldc:int(-855654396))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(41), ldc:int(29971)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1974096759))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1765982027))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(564185959))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1222512048))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(784962532))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1181988968))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-691387755))
                    }
                    else {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-629464249))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-891651731))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1580904079))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1510675909))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-470739244))
                            var_11_EB = and:int(ldc:int(-24725), ldc:int(24724))
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1719570023))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1680081815))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-191940435))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1407806749))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-866776983))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-570145329))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(848908962))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1016500869))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1366158015))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1290282944))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2031735164))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1003086255))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(278252825))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1852726171))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-127726732))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(4224), ldc:int(4225))
                                goto(Label_1059)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1651882338))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1932766862))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(853452014))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1894124312))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(947054232))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-789889095))
                        var_11_EB = and:int(ldc:int(10534), ldc:int(-10535))
                    }
                    
                    Label_1059:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-314985610))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1368913599))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(851520520))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2045584183))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1284)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1326787870))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-578920088))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_1059)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1701169892))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1874936945))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1684531256))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1284:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1522263256))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-561116517))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(766195055))
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5ED = and:int(var_3_5ED:int, ldc:int(-419716432))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F8 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-2074563902))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1562353022))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-904829612))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1688995920))
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-143019215))
                        var_17_5F8 = add:int(var_16_119:int, and:int(ldc:int(26329), ldc:int(37)))
                        looporswitchbreak()
                    }
                    
                    var_3_5ED = and:int(var_3_5ED:int, ldc:int(2002644789))
                }
                
                var_3_5ED = and:int(var_3_5ED:int, ldc:int(-713324883))
                
                if (cmple:boolean(var_5_85 = var_17_5F8:int, sub:int(var_6_8C:int, xor:int(ldc:int(10497), ldc:int(10496))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1746275989))
            goto(Label_0106)
        }
    }
}
