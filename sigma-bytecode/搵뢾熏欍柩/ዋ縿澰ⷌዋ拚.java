public abstract class \u6435\ub8be\u718f\u6b0d\u67e9.\u12cb\u7e3f\u6fb0\u2dcc\u12cb\u62da {
    public void \u12cb\u7e3f\u6fb0\u2dcc\u12cb\u62da(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d p0) {
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
            invokespecial:\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b(\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b::<init>, this:\u12cb\u7e3f\u6fb0\u2dcc\u12cb\u62da, p0:\u4daf\u5d20\u12cb\u8c8a\u8aa5\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5bc4\ucef1\ub70c\u8bb0\ub171\u600f() {
        var_1_5F : int
        var_1_72 : int
        
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
        var_1_5F = and:int(ldc:int(238675637), ldc:int(-9195522))
        
        if (logicalnot:boolean(invokevirtual:boolean(\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b::\u9937\u759a\u5db4\u6435\u4975\uc2bd, this:\u12cb\u7e3f\u6fb0\u2dcc\u12cb\u62da[expected:\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b]))) {
            athrow(initobject:\u983f\u3711\ud171\ub32d\ubded\uc3e3(\u983f\u3711\ud171\ub32d\ubded\uc3e3::<init>, ldc:String("Control frame cant have fin==false set")))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(262144)), ldc:int(0))) {
                var_1_72 = and:int(var_1_5F:int, ldc:int(-1941650586))
                goto(Label_0179)
            }
            
            if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(2)), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-712981596))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(855612342))
                
                if (invokevirtual:boolean(\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b::\u47c2\u9937\u0a06\u836c\u4daf\u8753, this:\u12cb\u7e3f\u6fb0\u2dcc\u12cb\u62da[expected:\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b])) {
                    athrow(initobject:\u983f\u3711\ud171\ub32d\ubded\uc3e3(\u983f\u3711\ud171\ub32d\ubded\uc3e3::<init>, ldc:String("Control frame cant have rsv1==true set")))
                }
            }
            
            Label_0145:
            
            if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(128)), ldc:int(0))) {
                var_1_72 = and:int(var_1_5F:int, ldc:int(-2035120465))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(16)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_72 = and:int(var_1_5F:int, ldc:int(1806935991))
                
                if (invokevirtual:boolean(\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b::\uceb8\u62da\u6b0d\u5fe1\u7c6b\ua3b4, this:\u12cb\u7e3f\u6fb0\u2dcc\u12cb\u62da[expected:\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b])) {
                    athrow(initobject:\u983f\u3711\ud171\ub32d\ubded\uc3e3(\u983f\u3711\ud171\ub32d\ubded\uc3e3::<init>, ldc:String("Control frame cant have rsv2==true set")))
                }
            }
            
            Label_0179:
            
            if (cmpne:boolean(and:int(var_1_72:int, ldc:int(256)), ldc:int(0))) {
                var_1_5F = and:int(var_1_72:int, ldc:int(515805024))
                goto(Label_0145)
            }
            
            if (cmpeq:boolean(and:int(var_1_72:int, ldc:int(32768)), ldc:int(0))) {
                var_1_5F = and:int(var_1_72:int, ldc:int(776856509))
            }
            else {
                if (logicalnot:boolean(invokevirtual:boolean(\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b::\u4975\u960f\uc7fe\u6c56\u8aa5\u6fb0, this:\u12cb\u7e3f\u6fb0\u2dcc\u12cb\u62da[expected:\u8308\u6bb9\u8308\u7e3f\u965f\ubb2b]))) {
                    return:void()
                }
                
                athrow(initobject:\u983f\u3711\ud171\ub32d\ubded\uc3e3(\u983f\u3711\ud171\ub32d\ubded\uc3e3::<init>, ldc:String("Control frame cant have rsv3==true set")))
            }
        }
    }
    
    public void \u7049\u67e9\u7af6\u40a9\u97e6\u12cb(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_635 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_640 : int
        
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
        var_3_635 = and:int(ldc:int(1372900447), ldc:int(1940942415))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u12cb\u7e3f\u6fb0\u2dcc\u12cb\u62da[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_635 = and:int(var_3_635:int, ldc:int(830568462))
        }
        else {
            var_3_635 = and:int(var_3_635:int, ldc:int(1526394479))
            var_5_85 = and:int(ldc:int(-5449), ldc:int(5448))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5653), ldc:int(-22038)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_635:int, ldc:int(2140167887))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(24673), ldc:int(1293)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(20480), ldc:int(20481)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_635 = and:int(var_3_DA:int, ldc:int(1471573119))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(5133), ldc:int(2707)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(163389152))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(2076814830))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(210692764))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-514091962))
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1672051338))
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1144472301))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-171450401))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-847707086))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1387707577))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(297885572))
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(623218039))
                        goto(Label_0708)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1637150527))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1754161873))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(1556803167))
                        var_11_EB = and:int(ldc:int(-24815), ldc:int(8424))
                        goto(Label_1471)
                    }
                    
                    Label_0581:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-394140682))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1806002291))
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1739102311))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1718566992))
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(211771568))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-985992057))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(880869247))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0708:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-775153566))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(2142786605))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(28848283))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1496934389))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-847566691))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-695838779))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-773090671))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(2088922447))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0850:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1952772911))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-906544890))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1431000193))
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(679689572))
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-725647537))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(25), ldc:int(1729))
                                goto(Label_1123)
                            }
                        }
                    }
                    
                    Label_0961:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-749659882))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-994583858))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-368030621))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-122038474))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(712846978))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1091845737))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-186753825))
                        var_11_EB = and:int(ldc:int(26652), ldc:int(-30973))
                    }
                    
                    Label_1123:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1712999307))
                            goto(Label_0961)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(2067511357))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1228079537))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1348)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(512)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-197631))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-457658716))
                            goto(Label_1123)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(512)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1497728423))
                            goto(Label_0961)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-973826909))
                            goto(Label_0708)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1185973159))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-728477969))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1471)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1348:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1625912869))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-935447697))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1989421115))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1770645557))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_635 = and:int(var_3_635:int, ldc:int(1519931263))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1471:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_640 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1482:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1838675371))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(893342367))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1328307750))
                        goto(Label_0708)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(506142697))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1936809505))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-136086049))
                        var_17_640 = add:int(var_16_119:int, and:int(ldc:int(1), ldc:int(12097)))
                        looporswitchbreak()
                    }
                }
                
                var_3_635 = and:int(var_3_635:int, ldc:int(528841983))
                
                if (cmple:boolean(var_5_85 = var_17_640:int, sub:int(var_6_8C:int, xor:int(ldc:int(8496), ldc:int(8497))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(131072)), ldc:int(0))) {
            var_3_635 = and:int(var_3_635:int, ldc:int(1861232039))
            goto(Label_0106)
        }
    }
}
