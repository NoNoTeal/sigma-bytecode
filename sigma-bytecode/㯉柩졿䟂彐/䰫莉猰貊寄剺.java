public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4c2b\u8389\u7330\u8c8a\u5bc4\u527a {
    public void \u4c2b\u8389\u7330\u8c8a\u5bc4\u527a() {
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
            invokespecial:Object(Object::<init>, this:\u4c2b\u8389\u7330\u8c8a\u5bc4\u527a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u93a2\ua3b4\u624e\u64ab\u8350\u7af6(java.util.Set p0, java.util.Set p1) {
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
            var_2_5F = and:int(ldc:int(215302973), ldc:int(-1056467550))
            
            if (invokestatic:boolean(\u4c2b\u8389\u7330\u8c8a\u5bc4\u527a::\u5bc4\uf995\u8c8a\u516c\u8bb0\u3e75, p0:Set, p1:Set)) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1237677928))
                stack_87_0 = and:int(ldc:int(-21739), ldc:int(21738))
            }
            else {
                stack_87_0 = and:int(ldc:int(1929), ldc:int(81))
            }
            
            return:boolean(stack_87_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u5bc4\uf995\u8c8a\u516c\u8bb0\u3e75(java.util.Set p0, java.util.Set p1) {
        var_2_5F : int
        var_4_BC : Set<Object>
        var_2_AB : int
        var_4_B2 : Iterator<Object>
        
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
        var_2_5F = and:int(ldc:int(-773290650), ldc:int(-876697762))
        
        if (logicalnot:boolean(invokeinterface:boolean(Set<E>::isEmpty, p0:Set<Object>))) {
            if (logicalnot:boolean(invokeinterface:boolean(Set<E>::isEmpty, p1:Set<Object>))) {
                if (cmpge:boolean(invokeinterface:int(Set<E>::size, p1:Set<Object>), invokeinterface:int(Set<E>::size, p0:Set<Object>))) {
                    goto(Label_0160)
                }
                
                var_4_BC = p0:Set<Object>
                p0 = p1:Set<Object>
                p1 = var_4_BC:Set<Object>
                goto(Label_0160)
            }
        }
        
        Label_0105:
        
        if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(8)), ldc:int(0))) {
            return:boolean(and:int[expected:boolean](ldc:int(26372), ldc:int(-30599)))
        }
        
        Label_0160:
        
        if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(8)), ldc:int(0))) {
            var_2_AB = and:int(var_2_5F:int, ldc:int(-1028084225))
            var_4_B2 = invokeinterface:Iterator<Object>(Set<Object>::iterator, p0:Set<Object>)
            
            while (invokeinterface:boolean(Iterator::hasNext, var_4_B2:Iterator)) {
                if (invokeinterface:boolean(Set<E>::contains, p1:Set<Object>, invokeinterface:Object(Iterator<Object>::next, var_4_B2:Iterator<Object>))) {
                    return:boolean(xor:int[expected:boolean](ldc:int(1346), ldc:int(1347)))
                }
                
                var_2_AB = and:int(var_2_AB:int, ldc:int(-643053993))
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(-17139), ldc:int(17104)))
        }
        
        goto(Label_0105)
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
    
    public void \uc910\u4e72\u647c\ud158\u7330\u6ec6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
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
        var_3_5FD = and:int(ldc:int(1648585252), ldc:int(1402686773))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4c2b\u8389\u7330\u8c8a\u5bc4\u527a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1312454095))
        }
        else {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-828413764))
            var_5_85 = and:int(ldc:int(13536), ldc:int(-13537))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(27928), ldc:int(-28441)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5FD:int, ldc:int(1535376231))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(4369), ldc:int(577)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(8261), ldc:int(8260)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5FD = and:int(var_3_D2:int, ldc:int(-163063107))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(4623), ldc:int(16449)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-325820877))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1810817435))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1963430531))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1070421163))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1467439525))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1239687733))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1028102148))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2002413142))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1444320499))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1862224491))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-688141076))
                            var_11_E3 = and:int(ldc:int(-15959), ldc:int(7764))
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1820180551))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(440227665))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(357488413))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(209122841))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-692677303))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1608871451))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-404755163))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0794)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-472401481))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(311623772))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-929420383))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-311774927))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-767571418))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0794:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1979216601))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1935665134))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1252817839))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2123646269))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-952153754))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(3761), ldc:int(11))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0905:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1232673784))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1587164580))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1678218182))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1984915964))
                        var_11_E3 = and:int(ldc:int(10337), ldc:int(-10338))
                    }
                    
                    Label_1043:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(886745795))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1498352847))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0794)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(694232163))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1484396205))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1019745818))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2078545371))
                            goto(Label_1043)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0905)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(261191728))
                            goto(Label_0794)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1826219708))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(922254450))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-739817179))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1399)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1276:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1281756902))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1059481392))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0905)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(769804540))
                        goto(Label_0794)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(888397631))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(-220734154))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1399:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_608 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1410:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1076164222))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1419132364))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-951256239))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1593436185))
                        goto(Label_0905)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1911583814))
                        goto(Label_0794)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1147192364))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-679590380))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1015026562))
                        var_17_608 = add:int(var_16_111:int, xor:int(ldc:int(4097), ldc:int(4096)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5FD = and:int(var_3_5FD:int, ldc:int(1986223541))
                
                if (cmple:boolean(var_5_85 = var_17_608:int, sub:int(var_6_8C:int, and:int(ldc:int(21605), ldc:int(8585))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
