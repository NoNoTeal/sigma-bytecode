public class \u5d20\u97b7\u8753\u873d\u16f6.\u8d98\u6d99\u1833\u62da\uc3e3\ud7e8 {
    public void \u8d98\u6d99\u1833\u62da\uc3e3\ud7e8(java.lang.String p0, java.lang.Runnable p1, java.lang.Runnable p2) {
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
            invokespecial:\u9033\u12b2\u516c\u97e6\u6d99\ua3b4(\u9033\u12b2\u516c\u97e6\u6d99\ua3b4::<init>, this:\u8d98\u6d99\u1833\u62da\uc3e3\ud7e8, p0:String, p1:Runnable, p2:Runnable)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4bc8\u960f\u8aa5\u51b2\u2dcc\u960f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5ED : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
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
        var_3_5ED = and:int(ldc:int(-1102131832), ldc:int(-1126244404))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8d98\u6d99\u1833\u62da\uc3e3\ud7e8[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-27304770))
            var_5_7D = and:int(ldc:int(-25522), ldc:int(25521))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-24882), ldc:int(24849)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5ED:int, ldc:int(-35665478))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(8201), ldc:int(17155)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(33), ldc:int(1547)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5ED = and:int(var_3_CA:int, ldc:int(2096023978))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(257), ldc:int(19523)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1383132918))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1370288278))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(783991080))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-87794628))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(756783246))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2144239338))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1257690260))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(554817099))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1791568273))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1102994885))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2105474714))
                        var_11_DB = and:int(ldc:int(-14910), ldc:int(14389))
                        goto(Label_1415)
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-984919732))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-971313525))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(769540874))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1974165634))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2015158438))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1641798377))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2085603833))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-2126842160))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1757834476))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(876820195))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1808916272))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-274616712))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-17900807))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2103599378))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-488351936))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1760676397))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-920281225))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1975867269))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-618637445))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-19997285))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(353), ldc:int(1549))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-708037477))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1065343448))
                        var_11_DB = and:int(ldc:int(27396), ldc:int(-27397))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(407314076))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(1525952620))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(2081595300))
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1533965715))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(422314097))
                            loopcontinue()
                        }
                        
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1014976173))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(604216311))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1043)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-367893760))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-167393584))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-56325470))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-231564518))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5ED = and:int(var_3_5ED:int, ldc:int(-10490423))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1292:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-539420633))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1764635652))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(546612461))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(166560883))
                        loopcontinue()
                    }
                    
                    var_3_5ED = and:int(var_3_5ED:int, ldc:int(-36799253))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1415:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5F8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1426:
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(1751946205))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-2005736680))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1203800803))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5ED:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5ED = and:int(var_3_5ED:int, ldc:int(2128599227))
                        var_17_5F8 = add:int(var_16_109:int, and:int(ldc:int(8577), ldc:int(6157)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5ED = and:int(var_3_5ED:int, ldc:int(-1085342305))
                
                if (cmple:boolean(var_5_7D = var_17_5F8:int, sub:int(var_6_84:int, xor:int(ldc:int(-30652), ldc:int(-30651))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5ED:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
