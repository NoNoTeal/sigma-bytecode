public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ube23\uc29a\u16f6\u6c52\u873d {
    public void \ube23\uc29a\u16f6\u6c52\u873d(java.lang.StringBuffer p0, java.io.InputStream p1) {
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
            invokespecial:Thread(Thread::<init>, this:\ube23\uc29a\u16f6\u6c52\u873d)
            putfield:InputStream(\ube23\uc29a\u16f6\u6c52\u873d::\u64ab\ua6bd\u8413\u93a2\u88c5, this:\ube23\uc29a\u16f6\u6c52\u873d, p1:InputStream)
            putfield:StringBuffer(\ube23\uc29a\u16f6\u6c52\u873d::\u4c2b\u6b5f\u8df4\uceb8\u960f, this:\ube23\uc29a\u16f6\u6c52\u873d, p0:StringBuffer)
            invokevirtual:void(Thread::start, this:\ube23\uc29a\u16f6\u6c52\u873d[expected:Thread])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run() {
        var_1_5F : int
        var_3_6D : int
        
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
            var_1_5F = and:int(ldc:int(132091077), ldc:int(1203501717))
            
            try {
                loop {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-285800485))
                    
                    if (cmpeq:boolean(var_3_6D = invokevirtual:int(InputStream::read, getfield:InputStream(\ube23\uc29a\u16f6\u6c52\u873d::\u64ab\ua6bd\u8413\u93a2\u88c5, this:\ube23\uc29a\u16f6\u6c52\u873d)), ldc:int(-1))) {
                        looporswitchbreak()
                    }
                    
                    loop {
                        if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_1_5F = and:int(var_1_5F:int, ldc:int(263871119))
                        }
                        
                        if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(8192)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_1_5F = and:int(var_1_5F:int, ldc:int(726596020))
                    }
                    
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1988808179))
                    invokevirtual:StringBuffer(StringBuffer::append, getfield:StringBuffer(\ube23\uc29a\u16f6\u6c52\u873d::\u4c2b\u6b5f\u8df4\uceb8\u960f, this:\ube23\uc29a\u16f6\u6c52\u873d), i2c:char(var_3_6D:int))
                }
            }
            catch (java.io.IOException stack_AA_0) {
            }
            
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
    
    public void \uceb8\ud36e\u99f7\u8350\ufe34\u7049(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_615 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
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
        var_3_615 = and:int(ldc:int(-1214921800), ldc:int(-1252527107))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ube23\uc29a\u16f6\u6c52\u873d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_615 = and:int(var_3_615:int, ldc:int(1384251077))
        }
        else {
            var_3_615 = and:int(var_3_615:int, ldc:int(-44699970))
            var_5_85 = and:int(ldc:int(-28149), ldc:int(28112))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3467), ldc:int(3466)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_615:int, ldc:int(-237642178))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(24867), ldc:int(1033)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(9225), ldc:int(9224)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_615 = and:int(var_3_D2:int, ldc:int(-35791078))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(17729), ldc:int(6695)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-84481388))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1569065948))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(788588364))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1952534516))
                    }
                    else {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1220546916))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1188077647))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1994874392))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1159958140))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1521616499))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1654513104))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1955309134))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1644144886))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-216013157))
                        var_11_E3 = and:int(ldc:int(-22973), ldc:int(18876))
                        goto(Label_1455)
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-896199390))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1296631949))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-2089905641))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1507543985))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-224025786))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1145055458))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(681866180))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1367708208))
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1943492337))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1089447479))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1212685768))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(2131082802))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1541421801))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1352529381))
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1262091001))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1323829346))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(13897), ldc:int(289))
                                goto(Label_1059)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1110848032))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-2003481462))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1110752703))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-2098164299))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-170403846))
                        var_11_E3 = and:int(ldc:int(-1558), ldc:int(1557))
                    }
                    
                    Label_1059:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1296654006))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1023915994))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1171093348))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1507198550))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(1198847586))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-38283751))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(1461868641))
                        goto(Label_1466)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(634330468))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1059)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(438479936))
                            goto(Label_0913)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-1397237650))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(-642607688))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_615 = and:int(var_3_615:int, ldc:int(2130532275))
                            loopcontinue()
                        }
                        
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1290405990))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1455)
                    }
                    
                    Label_1316:
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-1515101102))
                        goto(Label_1466)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-424730407))
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(850531998))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(502133650))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(2032506717))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-614971050))
                        loopcontinue()
                    }
                    
                    var_3_615 = and:int(var_3_615:int, ldc:int(-105395429))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1455:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_620 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1466:
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(2)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(802917171))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1059)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-666050062))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_615:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(750477401))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_615:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_615 = and:int(var_3_615:int, ldc:int(-35782821))
                        var_17_620 = add:int(var_16_111:int, and:int(ldc:int(5187), ldc:int(53)))
                        looporswitchbreak()
                    }
                }
                
                var_3_615 = and:int(var_3_615:int, ldc:int(-1107954024))
                
                if (cmple:boolean(var_5_85 = var_17_620:int, sub:int(var_6_8C:int, and:int(ldc:int(16465), ldc:int(12841))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_615:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
