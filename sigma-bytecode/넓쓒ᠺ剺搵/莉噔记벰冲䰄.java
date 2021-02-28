public class \ub113\uc4d2\u183a\u527a\u6435.\u8389\u5654\u8bb0\ubcb0\u51b2\u4c04 {
    public void \u8389\u5654\u8bb0\ubcb0\u51b2\u4c04() {
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
            invokespecial:Object(Object::<init>, this:\u8389\u5654\u8bb0\ubcb0\u51b2\u4c04)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int[] \ubf56\ufcaf\u4c2b\uae87\u0c95\uc229(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1) {
        var_4_6C : \ufe34\u960f\ua6bd\u71f1\u516c
        var_5_74 : Throwable
        var_6_80 : \u5db4\ud523\u7043\u6c52\u8308\u8350
        var_7_83 : Throwable
        var_8_8A : int[]
        var_9_BE : Throwable
        var_11_E3 : Throwable
        var_6_135 : Throwable
        var_13_15C : Throwable
        
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
            var_4_6C = invokeinterface:\ufe34\u960f\ua6bd\u71f1\u516c(\u6c52\u52d3\u516c\uae87\uae5d::\u5d20\uc2e8\ubff1\u120d\u965f\u36d3, p0:\u6c52\u52d3\u516c\uae87\uae5d, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            var_5_74 = aconstnull:Throwable()
            
            try {
                var_6_80 = invokestatic:\u5db4\ud523\u7043\u6c52\u8308\u8350(\u5db4\ud523\u7043\u6c52\u8308\u8350::\u3c25\u647c\u7006\u4e72\u9937\u385b, invokeinterface:InputStream(\ufe34\u960f\ua6bd\u71f1\u516c::\u494c\u9af2\u3a62\u67d0\uff55\uc9f6, var_4_6C:\ufe34\u960f\ua6bd\u71f1\u516c))
                var_7_83 = aconstnull:Throwable()
                
                try {
                    var_8_8A = invokevirtual:int[](\u5db4\ud523\u7043\u6c52\u8308\u8350::\u62da\u8d98\u7ce1\u7d52\u67d0\uae5d, var_6_80:\u5db4\ud523\u7043\u6c52\u8308\u8350)
                }
                catch (java.lang.Throwable var_9_BE) {
                    var_7_83 = var_9_BE:Throwable
                    athrow(var_9_BE:Throwable)
                }
                finally {
                    if (cmpne:boolean(var_6_80:\u5db4\ud523\u7043\u6c52\u8308\u8350, aconstnull:\u5db4\ud523\u7043\u6c52\u8308\u8350())) {
                        if (cmpne:boolean(var_7_83:Throwable, aconstnull:Throwable())) {
                            try {
                                invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::close, var_6_80:\u5db4\ud523\u7043\u6c52\u8308\u8350)
                            }
                            catch (java.lang.Throwable var_11_E3) {
                                invokevirtual:void(Throwable::addSuppressed, var_7_83:Throwable, var_11_E3:Throwable)
                            }
                        }
                        else {
                            invokevirtual:void(\u5db4\ud523\u7043\u6c52\u8308\u8350::close, var_6_80:\u5db4\ud523\u7043\u6c52\u8308\u8350)
                        }
                    }
                }
            }
            catch (java.lang.Throwable var_6_135) {
                var_5_74 = var_6_135:Throwable
                athrow(var_6_135:Throwable)
            }
            finally {
                if (cmpne:boolean(var_4_6C:\ufe34\u960f\ua6bd\u71f1\u516c, aconstnull:\ufe34\u960f\ua6bd\u71f1\u516c())) {
                    if (cmpne:boolean(var_5_74:Throwable, aconstnull:Throwable())) {
                        try {
                            invokeinterface:void(Closeable::close, var_4_6C:\ufe34\u960f\ua6bd\u71f1\u516c[expected:Closeable])
                        }
                        catch (java.lang.Throwable var_13_15C) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_74:Throwable, var_13_15C:Throwable)
                        }
                    }
                    else {
                        invokeinterface:void(Closeable::close, var_4_6C:\ufe34\u960f\ua6bd\u71f1\u516c[expected:Closeable])
                    }
                }
            }
            
            return:int[](var_8_8A:int[])
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
    
    public void \u62da\u3d64\u64f2\ud523\u4e72\u6bb9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
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
        var_3_60D = and:int(ldc:int(-1023598176), ldc:int(-490946070))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8389\u5654\u8bb0\ubcb0\u51b2\u4c04[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(-863264384))
        }
        else {
            var_3_60D = and:int(var_3_60D:int, ldc:int(2011167458))
            var_5_85 = and:int(ldc:int(-11945), ldc:int(11944))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2985), ldc:int(-2990)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_60D:int, ldc:int(-3148567))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(1152), ldc:int(1153)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(330), ldc:int(331)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_60D = and:int(var_3_D2:int, ldc:int(-660760))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(4487), ldc:int(24577)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1618790257))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1117445365))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-47072196))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-638153082))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(595055379))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1502075542))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1321593848))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1429310677))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1274842948))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1743685881))
                            var_11_E3 = and:int(ldc:int(-9715), ldc:int(9394))
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(872506119))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2079679505))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(890247413))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(255359371))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-639138493))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2100953700))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(420627819))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(523627510))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-877173526))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-866886729))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(29523853))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(283458307))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1924136522))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1321476278))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-82195983))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-757808307))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1322405995))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(905948031))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(694873557))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-943886620))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(519), ldc:int(7553))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(755786382))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1580286830))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1998755370))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(461299294))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1523973295))
                        var_11_E3 = and:int(ldc:int(-11789), ldc:int(11788))
                    }
                    
                    Label_1067:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1291314824))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1954950641))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1046546034))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1544015220))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-340373791))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1090787898))
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(556683248))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(154996882))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1671775718))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1292:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(897442062))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(209821537))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1970813131))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(-69741917))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1407:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_618 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1418:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-261446974))
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1521569379))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1553683754))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-469126340))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(761670402))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1649836519))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1623645494))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1201411258))
                        var_17_618 = add:int(var_16_111:int, and:int(ldc:int(12377), ldc:int(289)))
                        looporswitchbreak()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(-732790458))
                }
                
                var_3_60D = and:int(var_3_60D:int, ldc:int(-275882050))
                
                if (cmple:boolean(var_5_85 = var_17_618:int, sub:int(var_6_8C:int, and:int(ldc:int(2625), ldc:int(9251))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(33554432)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
