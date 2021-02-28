public abstract class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u71ae\u8389\u92ff\u92ff\u0800 {
    public void \u71ae\u8389\u92ff\u92ff\u0800() {
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
            invokespecial:Object(Object::<init>, this:\u71ae\u8389\u92ff\u92ff\u0800)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract boolean \u946b\u92ee\u6fb0\ua6bd\ubefe(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u3e75\u8709\u927d\ub171\u51b2 p0);
    
    public abstract double \u6c52\u8753\ud36e\ua562\ub113(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u3e75\u8709\u927d\ub171\u51b2 p0);
    
    public void \u64f2\u9255\uc7fe\u51b2\u3e75(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5DD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5E8 : int
        
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
        var_3_5DD = and:int(ldc:int(-1678872384), ldc:int(-67851323))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u71ae\u8389\u92ff\u92ff\u0800[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1863550759))
            var_5_7D = and:int(ldc:int(-10095), ldc:int(1322))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-31953), ldc:int(15568)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5DD:int, ldc:int(-1161357327))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(-30400), ldc:int(-30399)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(528), ldc:int(529)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5DD = and:int(var_3_CA:int, ldc:int(-1327717917))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(25651), ldc:int(2569)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1930971769))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1289799080))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1945702724))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1409924226))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(2145032599))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(140440741))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1622066492))
                    }
                    else {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-705758988))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1990587587))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-533044223))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-2038175065))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(420890723))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(247597456))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-86603543))
                        var_11_DB = and:int(ldc:int(1523), ldc:int(-5620))
                        goto(Label_1407)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(623090865))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1070620741))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-273280492))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(313820419))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-2093789402))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1076924203))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-564806525))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1691413239))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(437894374))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1352095903))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1116095788))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1277691188))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1667138245))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-328794754))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(170070826))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1244389179))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(6147), ldc:int(16977))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1702046189))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(2042461922))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-2109543695))
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-739779089))
                        var_11_DB = and:int(ldc:int(-28756), ldc:int(20563))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1740868341))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-2068440780))
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(1680064810))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1525878924))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1208501515))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1162:
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1104383814))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-677599827))
                            goto(Label_1051)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(32321562))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5DD = and:int(var_3_5DD:int, ldc:int(-654456620))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1276:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1839523656))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(54968001))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-512730411))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-967655186))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(1280269899))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1241670402))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1407:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1418:
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-1253304871))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(29784962))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5DD = and:int(var_3_5DD:int, ldc:int(-69867027))
                        var_17_5E8 = add:int(var_16_109:int, and:int(ldc:int(7), ldc:int(17913)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5DD = and:int(var_3_5DD:int, ldc:int(-724590609))
                
                if (cmple:boolean(var_5_7D = var_17_5E8:int, sub:int(var_6_84:int, and:int(ldc:int(8209), ldc:int(17825))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5DD:int, ldc:int(16)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
