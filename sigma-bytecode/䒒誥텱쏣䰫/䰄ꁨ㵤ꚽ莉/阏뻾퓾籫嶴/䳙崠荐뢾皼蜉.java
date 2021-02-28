public abstract class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u4cd9\u5d20\u8350\ub8be\u76bc\u8709<T, X> {
    public void \u4cd9\u5d20\u8350\ub8be\u76bc\u8709(X p0, java.lang.Class<T> p1) {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\u4cd9\u5d20\u8350\ub8be\u76bc\u8709<T, X>, p1:Class<T>)
            putfield:X(\u4cd9\u5d20\u8350\ub8be\u76bc\u8709::\ua61f\u4e72\uf9c5\u76bc\u98a4\u5db4, this:\u4cd9\u5d20\u8350\ub8be\u76bc\u8709<T, X>, p0:X)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract T \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0, X p1);
    
    public abstract void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, X p1, T p2);
    
    public T \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
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
            return:T(invokevirtual:T(\u4cd9\u5d20\u8350\ub8be\u76bc\u8709<T, X>::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u4cd9\u5d20\u8350\ub8be\u76bc\u8709<T, X>, p0:ByteBuf, getfield:X(\u4cd9\u5d20\u8350\ub8be\u76bc\u8709::\ua61f\u4e72\uf9c5\u76bc\u98a4\u5db4, this:\u4cd9\u5d20\u8350\ub8be\u76bc\u8709<T, X>)))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, T p1) {
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
            invokevirtual:void(\u4cd9\u5d20\u8350\ub8be\u76bc\u8709<T, X>::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u4cd9\u5d20\u8350\ub8be\u76bc\u8709<T, X>, p0:ByteBuf, getfield:X(\u4cd9\u5d20\u8350\ub8be\u76bc\u8709::\ua61f\u4e72\uf9c5\u76bc\u98a4\u5db4, this:\u4cd9\u5d20\u8350\ub8be\u76bc\u8709<T, X>), p1:T)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_618 : int
        
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
        var_3_60D = and:int(ldc:int(-581672567), ldc:int(-33888259))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4cd9\u5d20\u8350\ub8be\u76bc\u8709<T, X>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(-683873319))
            var_5_7D = and:int(ldc:int(-15573), ldc:int(7380))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10298), ldc:int(-10555)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_60D:int, ldc:int(-1156057111))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(-30703), ldc:int(-30704)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(-20352), ldc:int(-20351)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_60D = and:int(var_3_CA:int, ldc:int(-1176802375))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(9744), ldc:int(9745)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(127707937))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-170615598))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-327528971))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1829644080))
                    }
                    else {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1189284903))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1846403010))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(229141680))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1245337244))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1319310853))
                            var_11_DB = and:int(ldc:int(-27358), ldc:int(25305))
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(856626029))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1577091365))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1855144866))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(301192024))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-764940995))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-2053562531))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-550116983))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2042013974))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-285966563))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(636458715))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-780569617))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0762:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-701128960))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1642891413))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1109375910))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1574143200))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-285443380))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1219335034))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1211471178))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1015001280))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1726022661))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(13345), ldc:int(1))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(988001098))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1330149687))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-335313664))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(467252497))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1785074707))
                        var_11_DB = and:int(ldc:int(-6775), ldc:int(6262))
                    }
                    
                    Label_1051:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(675354004))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2137569770))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1792249049))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1815933630))
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1092401796))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(699136870))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1716487171))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1226855078))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1534904995))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-758021563))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-782997027))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1292:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1410791409))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-996645414))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1918874529))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(342580414))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1467965209))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1377469408))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-468752775))
                        loopcontinue()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(-103354981))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_618 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2043520043))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(985291656))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(837361012))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1727873090))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-537795619))
                        var_17_618 = add:int(var_16_109:int, and:int(ldc:int(4353), ldc:int(16425)))
                        looporswitchbreak()
                    }
                }
                
                var_3_60D = and:int(var_3_60D:int, ldc:int(-1749720663))
                
                if (cmple:boolean(var_5_7D = var_17_618:int, sub:int(var_6_84:int, xor:int(ldc:int(2067), ldc:int(2066))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
