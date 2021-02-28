public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud158\ub6ab\ub6ab\u5140\u0a06 {
    public void \ud158\ub6ab\ub6ab\u5140\u0a06(\u71f1\uc910\u3bc9\u516c\u93a2.\ud4fe\u156b\ud523\ucef1\uc7fe p0) {
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
            putfield:\ud4fe\u156b\ud523\ucef1\uc7fe(\ud158\ub6ab\ub6ab\u5140\u0a06::\u960f\u8cae\uc910\u3776\u9255\u718f, this:\ud158\ub6ab\ub6ab\u5140\u0a06, p0:\ud4fe\u156b\ud523\ucef1\uc7fe)
            invokespecial:Object(Object::<init>, this:\ud158\ub6ab\ub6ab\u5140\u0a06)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uae87\u5245\ucb79\u5654\u9af2\u9033(java.lang.Object[] p0) {
        var_4_69 : Object
        
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
            var_4_69 = loadelement:Object(p0:Object[], and:int(ldc:int(29776), ldc:int(-29811)))
            
            if (logicalnot:boolean(instanceof:boolean(java.lang.String.class, var_4_69:Object))) {
                if (instanceof:boolean(byte[].class, var_4_69:Object)) {
                    invokestatic:void(\ud4fe\u156b\ud523\ucef1\uc7fe::\u3dd3\u4cd9\u6d99\u7c6b\u873d\u494c, getfield:\ud4fe\u156b\ud523\ucef1\uc7fe(\ud158\ub6ab\ub6ab\u5140\u0a06::\u960f\u8cae\uc910\u3776\u9255\u718f, this:\ud158\ub6ab\ub6ab\u5140\u0a06), checkcast:byte[](byte[].class, checkcast:byte[](byte[].class, var_4_69:byte[][expected:Object])))
                }
            }
            else {
                invokestatic:void(\ud4fe\u156b\ud523\ucef1\uc7fe::\u7bad\ua61f\u385b\u8d90\ubefe\ua6bd, getfield:\ud4fe\u156b\ud523\ucef1\uc7fe(\ud158\ub6ab\ub6ab\u5140\u0a06::\u960f\u8cae\uc910\u3776\u9255\u718f, this:\ud158\ub6ab\ub6ab\u5140\u0a06), checkcast:String(java.lang.String.class, var_4_69:String[expected:Object]))
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
    
    public void \u759a\uc3e3\u36d3\u7873\u7bad\uc246(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_628 : int
        
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
        var_3_61D = and:int(ldc:int(484945590), ldc:int(-1358967044))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud158\ub6ab\ub6ab\u5140\u0a06[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(-1855308117))
        }
        else {
            var_3_61D = and:int(var_3_61D:int, ldc:int(251080631))
            var_5_85 = and:int(ldc:int(2204), ldc:int(-3229))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-283), ldc:int(282)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_61D:int, ldc:int(1022324343))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(10240), ldc:int(10241)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(8489), ldc:int(1027)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_61D = and:int(var_3_DA:int, ldc:int(-319860996))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(18437), ldc:int(18436)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1112612474))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-523811843))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1370096748))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1148592499))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1413762514))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1735284251))
                    }
                    else {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2143792893))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1601170867))
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1243247329))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(603285763))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(369048778))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1121967877))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1590636469))
                            var_11_EB = and:int(ldc:int(-26874), ldc:int(18665))
                            goto(Label_1471)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0573:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1076718928))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(818026483))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1812637460))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-628869506))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(686043628))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1093156867))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0692:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1767223157))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1296493350))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-117390439))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1476537240))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(214425150))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1344758115))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(707761908))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(442905606))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(993666749))
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-628958229))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(753876670))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(-31104), ldc:int(-31103))
                                goto(Label_1091)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1823824999))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(577638298))
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1144332620))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1967095480))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1859426963))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1183360782))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-858820929))
                        var_11_EB = and:int(ldc:int(25112), ldc:int(-25113))
                    }
                    
                    Label_1091:
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1684603996))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1878007705))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(157977888))
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1018868817))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(2094468799))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1348)
                            }
                        }
                    }
                    
                    Label_1202:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1780285630))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(369288168))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-618385101))
                            goto(Label_1091)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-305680082))
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-1351274405))
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0692)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(-57549178))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61D = and:int(var_3_61D:int, ldc:int(1161494016))
                            loopcontinue()
                        }
                        
                        var_3_61D = and:int(var_3_61D:int, ldc:int(500113396))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1471)
                    }
                    
                    Label_1348:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(841573562))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-1455181668))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0692)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-2082673215))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1595920253))
                        loopcontinue()
                    }
                    
                    var_3_61D = and:int(var_3_61D:int, ldc:int(1842839100))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1471:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_628 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1482:
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1202)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-859847797))
                        goto(Label_0692)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(-402364097))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61D = and:int(var_3_61D:int, ldc:int(1304915511))
                        var_17_628 = add:int(var_16_119:int, xor:int(ldc:int(16652), ldc:int(16653)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61D = and:int(var_3_61D:int, ldc:int(-1395679233))
                
                if (cmple:boolean(var_5_85 = var_17_628:int, sub:int(var_6_8C:int, and:int(ldc:int(10901), ldc:int(20481))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_61D:int, ldc:int(16384)), ldc:int(0))) {
            var_3_61D = and:int(var_3_61D:int, ldc:int(2090850929))
            goto(Label_0106)
        }
    }
}
