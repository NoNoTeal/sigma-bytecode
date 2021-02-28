public class \u59ec\u8413\u97e6\uc229\u3776.\ub70c\ua068\u183a\u965f\u4f4a {
    public void \ub70c\ua068\u183a\u965f\u4f4a() {
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
            invokespecial:Object(Object::<init>, this:\ub70c\ua068\u183a\u965f\u4f4a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4daf\ubf56\uc910\u40a9\u624e\uc31c(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p0, \ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90 p1) {
        var_3_5F : int
        var_5_67 : int
        var_6_70 : int
        var_7_7B : Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>
        var_3_88 : int
        var_8_CA : \u12cb\u93a2\ubf56\uc229\u8d90
        var_3_E0 : int
        
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
            var_3_5F = and:int(ldc:int(1426234268), ldc:int(497721341))
            var_5_67 = and:int(ldc:int(1617), ldc:int(-1618))
            var_6_70 = and:int(ldc:int(-1160), ldc:int(1159))
            var_7_7B = invokeinterface:Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>(List<\u12cb\u93a2\ubf56\uc229\u8d90>::iterator, invokevirtual:List<\u12cb\u93a2\ubf56\uc229\u8d90>(\u12cb\u93a2\ubf56\uc229\u8d90::\u67e9\u7330\u62da\u3c25\u624e, p0:\u12cb\u93a2\ubf56\uc229\u8d90))
            
            loop {
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(524288)), ldc:int(0))) {
                    var_3_88 = and:int(var_3_5F:int, ldc:int(1318793566))
                }
                else {
                    var_3_88 = and:int(var_3_5F:int, ldc:int(286192317))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_7_7B:Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>)) {
                        var_8_CA = checkcast:\u12cb\u93a2\ubf56\uc229\u8d90(\ud36e\u6bb9\u960f\u4c04\u64ab.\u12cb\u93a2\ubf56\uc229\u8d90.class, invokeinterface:\u12cb\u93a2\ubf56\uc229\u8d90(Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>::next, var_7_7B:Iterator<\u12cb\u93a2\ubf56\uc229\u8d90>))
                        
                        if (cmpgt:boolean(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, var_8_CA:\u12cb\u93a2\ubf56\uc229\u8d90), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, var_8_CA:\u12cb\u93a2\ubf56\uc229\u8d90)), var_5_67:int)) {
                            var_5_67 = add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u99f7\u836c\u2dcc\u9033\u5140, var_8_CA:\u12cb\u93a2\ubf56\uc229\u8d90), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u3dd3\u0a06\u6c52\u92ee\u5bc4, var_8_CA:\u12cb\u93a2\ubf56\uc229\u8d90))
                        }
                        
                        var_3_E0 = and:int(var_3_88:int, ldc:int(1935856574))
                        
                        if (cmpgt:boolean(add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, var_8_CA:\u12cb\u93a2\ubf56\uc229\u8d90), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, var_8_CA:\u12cb\u93a2\ubf56\uc229\u8d90)), var_6_70:int)) {
                            var_6_70 = add:int(invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u120d\u98a4\uceb8\u8cae\u47c2, var_8_CA:\u12cb\u93a2\ubf56\uc229\u8d90), invokevirtual:int(\u12cb\u93a2\ubf56\uc229\u8d90::\u183a\u1187\uc229\u3bc9\u7e3f, var_8_CA:\u12cb\u93a2\ubf56\uc229\u8d90))
                        }
                        
                        var_3_5F = and:int(var_3_E0:int, ldc:int(-1516333092))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_88:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_5F = and:int(var_3_88:int, ldc:int(-2013596440))
            }
            
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\u0b8e\ud4fe\uc229\u92ee\ud4fe, p0:\u12cb\u93a2\ubf56\uc229\u8d90, var_5_67:int)
            invokevirtual:void(\u12cb\u93a2\ubf56\uc229\u8d90::\uc9f6\u759a\u64ab\u97e6\u9255, p0:\u12cb\u93a2\ubf56\uc229\u8d90, var_6_70:int)
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
    
    public void \ua562\ubded\u64ab\ub113\u6c56\u3711(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_615 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_620 : int
        
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
        var_3_615 = and:int(ldc:int(-951834992), ldc:int(-848425196))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub70c\ua068\u183a\u965f\u4f4a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(-595576858))
            var_5_7D = and:int(ldc:int(-27637), ldc:int(8916))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-31067), ldc:int(31058)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_615:int, ldc:int(-473033040))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(8737), ldc:int(6417)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(2709), ldc:int(24841)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_615 = and:int(var_3_D2:int, ldc:int(-1041732085))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(2327), ldc:int(169)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(186765084))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1019385142))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-933561990))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1305794863))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1250561173))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(289389722))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(277738462))
                    }
                    else {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1010497840))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1307708662))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1446493711))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1940792969))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(777142713))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-549886356))
                            var_11_E3 = and:int(ldc:int(-5312), ldc:int(5274))
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-306635576))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-407008861))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(701497735))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1690359509))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-504709339))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(2042928202))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-445366319))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1067825072))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(181775475))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-764062574))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1151441582))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-158236917))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(624282262))
                        goto(Label_1300)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1929195731))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-2095742005))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-553533606))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(1409), ldc:int(8237))
                                goto(Label_1075)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1599449358))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(377407790))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1376311964))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(412428614))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1784639860))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1149476275))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-292936048))
                        var_11_E3 = and:int(ldc:int(7814), ldc:int(-7815))
                    }
                    
                    Label_1075:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-385378725))
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(825047410))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1033161827))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1930534062))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-511152430))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1300)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1537937739))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-2092428014))
                            goto(Label_1075)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(399347188))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1048133678))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1431)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1300:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1661593284))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-210110917))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-881572999))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1155320751))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(2141852395))
                        loopcontinue()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(-810946972))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1431:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_620 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1442:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1520481831))
                        goto(Label_1300)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1425994630))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1898001250))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-157305958))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1000439555))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-261812566))
                        var_17_620 = add:int(var_16_111:int, and:int(ldc:int(14341), ldc:int(553)))
                        looporswitchbreak()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(-1084842844))
                }
                
                var_3_615 = and:int(var_3_615:int, ldc:int(-658862166))
                
                if (cmple:boolean(var_5_7D = var_17_620:int, sub:int(var_6_84:int, xor:int(ldc:int(18), ldc:int(19))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(506836363))
            goto(Label_0106)
        }
    }
}
