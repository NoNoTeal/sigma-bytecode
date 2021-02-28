public final class \u71f1\uc910\u3bc9\u516c\u93a2.\u6d69\u965f\u9af2\ud4fe\u72f1\u67e9 {
    public void \u6d69\u965f\u9af2\ud4fe\u72f1\u67e9() {
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
            invokespecial:Object(Object::<init>, this:\u6d69\u965f\u9af2\ud4fe\u72f1\u67e9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \ufe34\u92ee\u64f2\u7af6\u3dd3\u3711(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u12b2\u7049\u8df4\uc9f6\uae87.\u8bb0\u759a\u3bc9\u527a\ube23\u5140 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
        var_4_61 : int
        stack_89_0 : int [generated]
        
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
            var_4_61 = and:int(ldc:int(-1585746921), ldc:int(-1414108417))
            
            if (cmpeq:boolean(invokestatic:\uc238\u156b\u59ec\u36d3\u67e9\u8389(\u6d69\u92ff\u983f\u873d\u8258\u40a9::\u6198\u36d3\u494c\ub32d\u4492\u120d), aconstnull:\uc238\u156b\u59ec\u36d3\u67e9\u8389())) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-64689857))
                stack_89_0 = invokestatic:int(\u718f\u4179\u7e3f\ub113\ud51e\u8413::\u7043\uc84e\u7330\ub1b9\u36d3\u7e3f)
            }
            else {
                stack_89_0 = invokevirtual:int(\uc238\u156b\u59ec\u36d3\u67e9\u8389::\ufe34\u92ee\u64f2\u7af6\u3dd3\u3711, invokestatic:\uc238\u156b\u59ec\u36d3\u67e9\u8389(\u6d69\u92ff\u983f\u873d\u8258\u40a9::\u6198\u36d3\u494c\ub32d\u4492\u120d), p1:\u8bb0\u759a\u3bc9\u527a\ube23\u5140, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            }
            
            return:int(stack_89_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u6435\u7ce1\u3d64\u8413\u4e72\u34df() {
        var_1_5F : int
        stack_85_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(47890199), ldc:int(-1949040875))
            
            if (cmpne:boolean(invokestatic:\uc238\u156b\u59ec\u36d3\u67e9\u8389(\u6d69\u92ff\u983f\u873d\u8258\u40a9::\u6198\u36d3\u494c\ub32d\u4492\u120d), aconstnull:\uc238\u156b\u59ec\u36d3\u67e9\u8389())) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1387456399))
                stack_85_0 = and:int(ldc:int(13075), ldc:int(-15196))
            }
            else {
                stack_85_0 = xor:int(ldc:int(20), ldc:int(21))
            }
            
            return:boolean(stack_85_0:int)
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
    
    public void \u4179\ub83f\u8bb0\ucfaf\u6bb9\u8d98(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
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
        var_3_60D = and:int(ldc:int(1889824280), ldc:int(-1147147715))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6d69\u965f\u9af2\ud4fe\u72f1\u67e9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(231983189))
        }
        else {
            var_3_60D = and:int(var_3_60D:int, ldc:int(-1293981583))
            var_5_85 = and:int(ldc:int(-25075), ldc:int(24946))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-5579), ldc:int(5322)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_60D:int, ldc:int(-184551115))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(1059), ldc:int(2313)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(17921), ldc:int(5)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_60D = and:int(var_3_D2:int, ldc:int(992935633))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(329), ldc:int(328)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1607198718))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(657638643))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1440677246))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-396261409))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2054618202))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1467212902))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2106597071))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1193416240))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-98117951))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(2128080025))
                            var_11_E3 = and:int(ldc:int(16413), ldc:int(-20638))
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1376154594))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-690798011))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1206108903))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(66049334))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1045232439))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-471774933))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2124972030))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1931907097))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2026559458))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(517775465))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1266680776))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1637965915))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1298764790))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1981838488))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1903671050))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1588037542))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-390497152))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-123863374))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(556), ldc:int(557))
                                goto(Label_1075)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-754482017))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1672355268))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-277305168))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-742450534))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(192201))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-776952078))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-432490105))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1019537951))
                        var_11_E3 = and:int(ldc:int(23065), ldc:int(-31260))
                    }
                    
                    Label_1075:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(805356327))
                            goto(Label_0905)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(852403147))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(2124529997))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1804360645))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1926130003))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(607984352))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(205087501))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1359716157))
                            goto(Label_1075)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1906587072))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(561833095))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(2027945722))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1439)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1316:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-699234092))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1122710230))
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1332097030))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-250595223))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(955116191))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1439:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_618 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1450:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1883470248))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1992439582))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(329693457))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1994220807))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1340118313))
                        var_17_618 = add:int(var_16_111:int, xor:int(ldc:int(16488), ldc:int(16489)))
                        looporswitchbreak()
                    }
                }
                
                var_3_60D = and:int(var_3_60D:int, ldc:int(-208667267))
                
                if (cmple:boolean(var_5_85 = var_17_618:int, sub:int(var_6_8C:int, xor:int(ldc:int(202), ldc:int(203))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
