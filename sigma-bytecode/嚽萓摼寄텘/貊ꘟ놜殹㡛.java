public class \u56bd\u8413\u647c\u5bc4\ud158.\u8c8a\ua61f\ub19c\u6bb9\u385b {
    public void \u8c8a\ua61f\ub19c\u6bb9\u385b() {
        expr_93 : int [generated]
        
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
            invokespecial:Object(Object::<init>, this:\u8c8a\ua61f\ub19c\u6bb9\u385b)
            putfield:List<ConcurrentLinkedQueue<\u6b5f\u8389\ub32d\ub83f\u71f1>>(\u8c8a\ua61f\ub19c\u6bb9\u385b::\u446c\u183a\u97e6\ub8be\u3504\u446c, this:\u8c8a\ua61f\ub19c\u6bb9\u385b, invokestatic:ImmutableList[expected:List<ConcurrentLinkedQueue<\u6b5f\u8389\ub32d\ub83f\u71f1>>](ImmutableList::of, initobject:ConcurrentLinkedQueue<E>[expected:Object](ConcurrentLinkedQueue<E>::<init>), initobject:ConcurrentLinkedQueue<E>[expected:Object](ConcurrentLinkedQueue<E>::<init>), initobject:ConcurrentLinkedQueue<E>[expected:Object](ConcurrentLinkedQueue<E>::<init>), initobject:ConcurrentLinkedQueue<E>[expected:Object](ConcurrentLinkedQueue<E>::<init>)))
            expr_93 = add:int(getfield:int(\u8c8a\ua61f\ub19c\u6bb9\u385b::\uc29a\u873d\u6bb9\u6d99\u3c25\ube23, this:\u8c8a\ua61f\ub19c\u6bb9\u385b), and:int(ldc:int(16779), ldc:int(8737)))
            putfield:int(\u8c8a\ua61f\ub19c\u6bb9\u385b::\u4c04\u6b0d\u47c2\ud12e\u5f50\u5bc4, this:\u8c8a\ua61f\ub19c\u6bb9\u385b, expr_93:int)
            putfield:int(\u8c8a\ua61f\ub19c\u6bb9\u385b::\u59ec\u3bd6\u5d20\uc246\u4d85\u7873, this:\u8c8a\ua61f\ub19c\u6bb9\u385b, expr_93:int)
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
    
    public void \u4f52\ua562\u624e\u6198\uc910\u7043(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_635 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
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
        var_3_635 = and:int(ldc:int(-1962225049), ldc:int(-1291551241))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8c8a\ua61f\ub19c\u6bb9\u385b[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_635 = and:int(var_3_635:int, ldc:int(-483784713))
            var_5_7D = and:int(ldc:int(-27211), ldc:int(10826))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1922), ldc:int(-22504)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_635:int, ldc:int(-1922438697))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(-28672), ldc:int(-28671)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(1040), ldc:int(1041)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_635 = and:int(var_3_CA:int, ldc:int(-1625046073))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(640), ldc:int(641)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-942355811))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-219405617))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-449626054))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1042240256))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-304979102))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1723206086))
                    }
                    else {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1510548490))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-567995386))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(625898850))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(312394528))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1764509505))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(2021976108))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1384062640))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1379032248))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1019477122))
                        var_11_DB = and:int(ldc:int(-23869), ldc:int(23852))
                        goto(Label_1471)
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1385037541))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1725580542))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(861773553))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1820097093))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-511434017))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1493713221))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-401686895))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1129256604))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1765756382))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1652347927))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1951872265))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(931355023))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(288858095))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1950372168))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1443391923))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1505960206))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1753431073))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(25669), ldc:int(6161))
                                goto(Label_1091)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-2022834758))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1970442165))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1035955316))
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-441950285))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-2090922547))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1338972858))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-242567833))
                        var_11_DB = and:int(ldc:int(22562), ldc:int(-22563))
                    }
                    
                    Label_1091:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1437400158))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-326689415))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-2059594316))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(2132916666))
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(1788334961))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1116921649))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1348)
                            }
                        }
                    }
                    
                    Label_1210:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1089258743))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-1846618009))
                            goto(Label_1091)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(3109094))
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(101620058))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-571099069))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                            var_3_635 = and:int(var_3_635:int, ldc:int(-285213772))
                            loopcontinue()
                        }
                        
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1185932841))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1471)
                    }
                    
                    Label_1348:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(656523463))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(13442006))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(1103041310))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1804734454))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_635 = and:int(var_3_635:int, ldc:int(-1862257178))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1471:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_640 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1482:
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(2093194964))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(75165780))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(2029501465))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(2)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-1682539858))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_635:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_635:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_635 = and:int(var_3_635:int, ldc:int(-644700722))
                        var_17_640 = add:int(var_16_109:int, and:int(ldc:int(7301), ldc:int(49)))
                        looporswitchbreak()
                    }
                    
                    var_3_635 = and:int(var_3_635:int, ldc:int(1458212573))
                }
                
                var_3_635 = and:int(var_3_635:int, ldc:int(-1510896161))
                
                if (cmple:boolean(var_5_7D = var_17_640:int, sub:int(var_6_84:int, xor:int(ldc:int(4230), ldc:int(4231))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_635:int, ldc:int(64)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
