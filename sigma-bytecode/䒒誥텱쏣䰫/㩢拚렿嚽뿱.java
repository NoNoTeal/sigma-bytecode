public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u3a62\u62da\ub83f\u56bd\ubff1 {
    public void \u3a62\u62da\ub83f\u56bd\ubff1() {
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
            invokespecial:Object(Object::<init>, this:\u3a62\u62da\ub83f\u56bd\ubff1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ufcaf\u3504\u67e9\u7e3f\u2dcc\ub70c(java.util.Random p0) {
        var_2_E9 : int
        var_4_6B : int
        
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
            var_2_E9 = and:int(ldc:int(9081593), ldc:int(1210967231))
            var_4_6B = invokevirtual:int(Random::nextInt, p0:Random, xor:int(ldc:int(-31733), ldc:int(-31730)))
            
            if (cmpgt:boolean(var_4_6B:int, and:int(ldc:int(261), ldc:int(8705)))) {
                loop {
                    if (cmpeq:boolean(and:int(var_2_E9:int, ldc:int(1)), ldc:int(0))) {
                        var_2_E9 = and:int(var_2_E9:int, ldc:int(-1108871176))
                        goto(Label_0199)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_E9:int, ldc:int(2097152)), ldc:int(0))) {
                        var_2_E9 = and:int(var_2_E9:int, ldc:int(107658907))
                        
                        if (cmple:boolean(var_4_6B:int, and:int(ldc:int(1794), ldc:int(43)))) {
                            putfield:\ud523\u4f52\u59ec\u516c\u3e75(\u3a62\u62da\ub83f\u56bd\ubff1::\ub70c\u98a4\uc2e8\uf94d\u71f1\ua6bd, this:\u3a62\u62da\ub83f\u56bd\ubff1, getstatic:\ud523\u4f52\u59ec\u516c\u3e75(\ud523\u7ce1\ubff1\ubefe\u12cb::\u4c04\ua61f\ud217\u3a62\u6d69\u7ce1))
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0160:
                    
                    if (cmpne:boolean(and:int(var_2_E9:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_E9:int, ldc:int(262144)), ldc:int(0))) {
                            var_2_E9 = and:int(var_2_E9:int, ldc:int(-1567523857))
                            loopcontinue()
                        }
                        
                        var_2_E9 = and:int(var_2_E9:int, ldc:int(-217202947))
                        
                        if (cmple:boolean(var_4_6B:int, and:int(ldc:int(1059), ldc:int(30811)))) {
                            putfield:\ud523\u4f52\u59ec\u516c\u3e75(\u3a62\u62da\ub83f\u56bd\ubff1::\ub70c\u98a4\uc2e8\uf94d\u71f1\ua6bd, this:\u3a62\u62da\ub83f\u56bd\ubff1, getstatic:\ud523\u4f52\u59ec\u516c\u3e75(\ud523\u7ce1\ubff1\ubefe\u12cb::\u93a2\u4e72\uc9f6\ub6ab\u1833\u960f))
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0199:
                    
                    if (cmpne:boolean(and:int(var_2_E9:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_E9 = and:int(var_2_E9:int, ldc:int(147618277))
                        goto(Label_0160)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_E9:int, ldc:int(134217728)), ldc:int(0))) {
                        var_2_E9 = and:int(var_2_E9:int, ldc:int(-1997664287))
                    }
                    else {
                        var_2_E9 = and:int(var_2_E9:int, ldc:int(2060185725))
                        
                        if (cmpgt:boolean(var_4_6B:int, xor:int(ldc:int(1169), ldc:int(1173)))) {
                            looporswitchbreak()
                        }
                        
                        putfield:\ud523\u4f52\u59ec\u516c\u3e75(\u3a62\u62da\ub83f\u56bd\ubff1::\ub70c\u98a4\uc2e8\uf94d\u71f1\ua6bd, this:\u3a62\u62da\ub83f\u56bd\ubff1, getstatic:\ud523\u4f52\u59ec\u516c\u3e75(\ud523\u7ce1\ubff1\ubefe\u12cb::\u9255\u3504\u9255\uafe7\u8cae\u6ec6))
                        looporswitchbreak()
                    }
                }
            }
            else {
                putfield:\ud523\u4f52\u59ec\u516c\u3e75(\u3a62\u62da\ub83f\u56bd\ubff1::\ub70c\u98a4\uc2e8\uf94d\u71f1\ua6bd, this:\u3a62\u62da\ub83f\u56bd\ubff1, getstatic:\ud523\u4f52\u59ec\u516c\u3e75(\ud523\u7ce1\ubff1\ubefe\u12cb::\uc3e3\u3d4b\u7bad\u88c5\u836c\u7e3f))
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
    
    public void \u51fa\u71f1\u5d20\u3bc9\u4bc8\ud36e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FD : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_608 : int
        
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
        var_3_5FD = and:int(ldc:int(535933838), ldc:int(-558768442))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3a62\u62da\ub83f\u56bd\ubff1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1589406956))
        }
        else {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1145195811))
            var_5_85 = and:int(ldc:int(-29266), ldc:int(21073))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-30910), ldc:int(28829)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5FD:int, ldc:int(2142353071))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(20514), ldc:int(20515)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(17153), ldc:int(101)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5FD = and:int(var_3_D2:int, ldc:int(-1632128344))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(17121), ldc:int(21)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2113461919))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1417424313))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1209859078))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-67387655))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1937587252))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(779665778))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-57168355))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(354867332))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-811451759))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1052621457))
                        var_11_E3 = and:int(ldc:int(-12661), ldc:int(12404))
                        goto(Label_1423)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1861507834))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(377262734))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1847556455))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1552696965))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-88885528))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1476654251))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1794057530))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1513232468))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-930563967))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(519167662))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1237860199))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1279632388))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2142251261))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(492753347))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1436510094))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-88105084))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(18573), ldc:int(67))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1251029855))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1342748583))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1114602810))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1838014562))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2111539850))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1614824824))
                        var_11_E3 = and:int(ldc:int(-19458), ldc:int(19457))
                    }
                    
                    Label_1043:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(757932309))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1229849712))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-206456528))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1300810905))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2125577113))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1284)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(100180788))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1375310749))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1639759148))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1082375587))
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(207701005))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1611008292))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1423)
                    }
                    
                    Label_1284:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1426798001))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1666817486))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-21910572))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2026558526))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(543000342))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-404158432))
                        loopcontinue()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1699225706))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_608 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-711010354))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1394636531))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(519805675))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1141101783))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-551229))
                        var_17_608 = add:int(var_16_111:int, and:int(ldc:int(11), ldc:int(18689)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5FD = and:int(var_3_5FD:int, ldc:int(469612519))
                
                if (cmple:boolean(var_5_85 = var_17_608:int, sub:int(var_6_8C:int, and:int(ldc:int(1221), ldc:int(26641))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
