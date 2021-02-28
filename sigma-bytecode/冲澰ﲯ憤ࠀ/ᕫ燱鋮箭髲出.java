public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\u156b\u71f1\u92ee\u7bad\u9af2\u51fa {
    public void \u156b\u71f1\u92ee\u7bad\u9af2\u51fa(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c<?> p0) {
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
            invokespecial:\u7006\u7330\ub1b9\u7c6b\u5245\u98a4(\u7006\u7330\ub1b9\u7c6b\u5245\u98a4::<init>, this:\u156b\u71f1\u92ee\u7bad\u9af2\u51fa)
            putfield:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u156b\u71f1\u92ee\u7bad\u9af2\u51fa::\u6c52\u6bb9\u12cb\u4c04\u7043\u516c, this:\u156b\u71f1\u92ee\u7bad\u9af2\u51fa, p0:\u9255\u0c95\u4cd9\ube23\u760c<?>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u5bc4\u59ec\u624e\ua068\u0b8e\ub1b9(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c<?> p0) {
        var_2_5F : int
        stack_87_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(-1150618747), ldc:int(-1993477753))
            
            if (cmpne:boolean(getfield:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u156b\u71f1\u92ee\u7bad\u9af2\u51fa::\u6c52\u6bb9\u12cb\u4c04\u7043\u516c, this:\u156b\u71f1\u92ee\u7bad\u9af2\u51fa), p0:\u9255\u0c95\u4cd9\ube23\u760c<?>)) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1341911487))
                stack_87_0 = and:int(ldc:int(17674), ldc:int(-17675))
            }
            else {
                stack_87_0 = and:int(ldc:int(12289), ldc:int(1171))
            }
            
            return:boolean(stack_87_0:int)
        }
        
        goto(Label_0006)
    }
    
    public com.google.gson.JsonElement \u7d52\uc29a\ucef1\u9a18\u51b2\u6bb9() {
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
            return:JsonElement(initobject:JsonPrimitive[expected:JsonElement](JsonPrimitive::<init>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u6d69\u64f2\uc2bd\ub6ab\ub7dc\u7873), getfield:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u156b\u71f1\u92ee\u7bad\u9af2\u51fa::\u6c52\u6bb9\u12cb\u4c04\u7043\u516c, this:\u156b\u71f1\u92ee\u7bad\u9af2\u51fa)))))
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
    
    public void \uc229\u873d\u120d\u3e2a\u8753\u9033(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_605 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
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
        var_3_605 = and:int(ldc:int(384314647), ldc:int(1626959765))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u156b\u71f1\u92ee\u7bad\u9af2\u51fa[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_605 = and:int(var_3_605:int, ldc:int(-545605305))
        }
        else {
            var_3_605 = and:int(var_3_605:int, ldc:int(211642837))
            var_5_85 = and:int(ldc:int(2335), ldc:int(-10528))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(29065), ldc:int(-29578)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_605:int, ldc:int(2143741327))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(129), ldc:int(513)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(4249), ldc:int(25379)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_605 = and:int(var_3_D2:int, ldc:int(801176839))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-32752), ldc:int(-32751)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1470964154))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1904330648))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-731042558))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-594520271))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(837011918))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(740755931))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(619423669))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1207494887))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1532644787))
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1851702956))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1017644479))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1936744002))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-155336817))
                            var_11_E3 = and:int(ldc:int(22789), ldc:int(-22790))
                            goto(Label_1415)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1317600893))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1788601831))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-617292668))
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1661412906))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(545633621))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-317979118))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(299805436))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1460198073))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-81985273))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1464111713))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(1188198223))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(805754867))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1061322400))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1051)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(184156293))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-200198487))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-964429313))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(8457), ldc:int(8456))
                                goto(Label_1051)
                            }
                        }
                    }
                    
                    Label_0913:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1749464923))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(489100144))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-1084529180))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1769528483))
                        var_11_E3 = and:int(ldc:int(-13041), ldc:int(13040))
                    }
                    
                    Label_1051:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(392819399))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(236582520))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1367323837))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(1017559375))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1268)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-284772347))
                            goto(Label_1051)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0913)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(-849265113))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_605 = and:int(var_3_605:int, ldc:int(1310320659))
                            loopcontinue()
                        }
                        
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1243857987))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1415)
                    }
                    
                    Label_1268:
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-479775444))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-313437466))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1249575524))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(1421370112))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-382074146))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-919180336))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-567782496))
                        loopcontinue()
                    }
                    
                    var_3_605 = and:int(var_3_605:int, ldc:int(-554272795))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1415:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_610 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1426:
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(100615657))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(128)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(858268286))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(512)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1911497641))
                        goto(Label_1051)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-1374258915))
                        goto(Label_0913)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(417118495))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_605:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_605:int, ldc:int(64)), ldc:int(0))) {
                        var_3_605 = and:int(var_3_605:int, ldc:int(-846891065))
                        var_17_610 = add:int(var_16_111:int, xor:int(ldc:int(3592), ldc:int(3593)))
                        looporswitchbreak()
                    }
                    
                    var_3_605 = and:int(var_3_605:int, ldc:int(-2145628377))
                }
                
                var_3_605 = and:int(var_3_605:int, ldc:int(-822659595))
                
                if (cmple:boolean(var_5_85 = var_17_610:int, sub:int(var_6_8C:int, xor:int(ldc:int(16712), ldc:int(16713))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_605:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
