public class \u51fa\u12cb\u7330\u74b1\u6c52.\u6c52\u8258\ud171\uc3e3\ud4fe\ub171 {
    public void \u6c52\u8258\ud171\uc3e3\ud4fe\ub171(\u36d3\u9033\u6b0d\u983f\u8d90.\u385b\u6ec6\u8640\u71ae\ufe34\ud36e p0) {
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
            putfield:\u385b\u6ec6\u8640\u71ae\ufe34\ud36e(\u6c52\u8258\ud171\uc3e3\ud4fe\ub171::\uae87\u64f2\u47c2\u9937\u6d69\u4cd9, this:\u6c52\u8258\ud171\uc3e3\ud4fe\ub171, p0:\u385b\u6ec6\u8640\u71ae\ufe34\ud36e)
            invokespecial:Object(Object::<init>, this:\u6c52\u8258\ud171\uc3e3\ud4fe\ub171)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u62da\u0b8e\u6198\u647c\u7043\u3711(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p0) {
        var_2_5F : int
        var_5_75 : int[]
        var_6_7A : int
        var_7_83 : int
        
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
            var_2_5F = and:int(ldc:int(1266562348), ldc:int(2004485102))
            var_5_75 = checkcast:int[](int[].class, invokevirtual:int[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u120d\u51b2\u071d\u071d\u5140\u0800, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<int[]>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc31c\u8753\ua6bd\u836c\ub18d\u4c2b), and:int(ldc:int(5644), ldc:int(-5661))))
            var_6_7A = arraylength:int(var_5_75:int[])
            var_7_83 = and:int(ldc:int(-19133), ldc:int(19108))
            
            loop {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-2030257108))
                
                if (cmpge:boolean(var_7_83:int, var_6_7A:int)) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u9937\u8c8a\u4c2b\u3d4b\u416d\u8709::\uc87f\u5140\ud158\u183a\u6fb0\u873d, checkcast:\u9937\u8c8a\u4c2b\u3d4b\u416d\u8709(\ud36e\u6bb9\u960f\u4c04\u64ab.\u9937\u8c8a\u4c2b\u3d4b\u416d\u8709.class, invokevirtual:\u9937\u8c8a\u4c2b\u3d4b\u416d\u8709(\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709::\u4d85\u71f1\u6435\u1833\u1187\u6435, invokevirtual:\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u6b0d\u6bb9\u6fb0\u5245\u4975\u624e, p0:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4), ldc:Class<\u9937\u8c8a\u4c2b\u3d4b\u416d\u8709>(\ud36e\u6bb9\u960f\u4c04\u64ab.\u9937\u8c8a\u4c2b\u3d4b\u416d\u8709.class))), loadelement:int(var_5_75:int[], var_7_83:int))
                inc:int(var_7_83, ldc:int(1))
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
    
    public void \u4492\u8258\u59ec\ucef1\u51b2\u69d9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_648 : int
        
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
        var_3_63D = and:int(ldc:int(-1950121836), ldc:int(-848963401))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6c52\u8258\ud171\uc3e3\ud4fe\ub171[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(262144)), ldc:int(0))) {
            var_3_63D = and:int(var_3_63D:int, ldc:int(-685879908))
        }
        else {
            var_3_63D = and:int(var_3_63D:int, ldc:int(-1921534562))
            var_5_85 = and:int(ldc:int(-9000), ldc:int(8999))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-19628), ldc:int(19594)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_63D:int, ldc:int(-1342314251))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(8467), ldc:int(22605)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(288), ldc:int(289)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_63D = and:int(var_3_D2:int, ldc:int(-615468355))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(3393), ldc:int(16385)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1267864229))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-164110257))
                    }
                    else {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-303073900))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-750860183))
                        goto(Label_1324)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-352462587))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1769542294))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1998822317))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(27659477))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1357288756))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1117605218))
                            var_11_E3 = and:int(ldc:int(-4811), ldc:int(4810))
                            goto(Label_1479)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1619463364))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-861435420))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1288553283))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(907885798))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1203259008))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-271334986))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1457779791))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-98127258))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1607116384))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1433285431))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1150173003))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1495519457))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-2115744246))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(705208213))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-2118518136))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1077874796))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(21249), ldc:int(2187))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(643029693))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(567222111))
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1996361869))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(1441153228))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(682368))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1681008228))
                        var_11_E3 = and:int(ldc:int(307), ldc:int(-312))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(2015889342))
                        goto(Label_1490)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1600262102))
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-630654223))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(524679500))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(60455379))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1655093709))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-993817869))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1991154529))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1324)
                            }
                        }
                    }
                    
                    Label_1178:
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-125212702))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-2012647575))
                            goto(Label_1043)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1495493557))
                            goto(Label_0889)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-134922250))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-279981206))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(44313988))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63D = and:int(var_3_63D:int, ldc:int(-1221354133))
                            loopcontinue()
                        }
                        
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1620957476))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1479)
                    }
                    
                    Label_1324:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1172569876))
                        goto(Label_1490)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-406673632))
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1832002359))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(745471641))
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(383145564))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(453362914))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-358676144))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-706112520))
                        loopcontinue()
                    }
                    
                    var_3_63D = and:int(var_3_63D:int, ldc:int(-1152306762))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1479:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_648 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1490:
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1324)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1178)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-895280147))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-827473802))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(216844450))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(1105525953))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63D = and:int(var_3_63D:int, ldc:int(-1619185665))
                        var_17_648 = add:int(var_16_111:int, and:int(ldc:int(1373), ldc:int(1)))
                        looporswitchbreak()
                    }
                    
                    var_3_63D = and:int(var_3_63D:int, ldc:int(1880249632))
                }
                
                var_3_63D = and:int(var_3_63D:int, ldc:int(-571589411))
                
                if (cmple:boolean(var_5_85 = var_17_648:int, sub:int(var_6_8C:int, and:int(ldc:int(5129), ldc:int(16709))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_63D:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
