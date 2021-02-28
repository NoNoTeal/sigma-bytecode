public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u600f\u64ab\u4d85\ub19c\u446c {
    public void \u600f\u64ab\u4d85\ub19c\u446c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u960f\u6ec6\u3e75\u8d90\u36d3 p0, java.lang.String p1, java.lang.Object[] p2) {
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
            putfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u600f\u64ab\u4d85\ub19c\u446c::\u64ab\u392e\u759a\uf995\ubcb0\ubf56, this:\u600f\u64ab\u4d85\ub19c\u446c, p0:\u960f\u6ec6\u3e75\u8d90\u36d3)
            putfield:String(\u600f\u64ab\u4d85\ub19c\u446c::\u5140\ucb79\ub19c\uae5d\u0800\u8640, this:\u600f\u64ab\u4d85\ub19c\u446c, p1:String)
            putfield:Object[](\u600f\u64ab\u4d85\ub19c\u446c::\u3bc9\u965f\ucfaf\u71ae\u385b\uc7fe, this:\u600f\u64ab\u4d85\ub19c\u446c, p2:Object[])
            invokespecial:Object(Object::<init>, this:\u600f\u64ab\u4d85\ub19c\u446c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run() {
        var_1_5F : int
        var_1_73 : int
        var_3_81 : int
        var_4_93 : Object[]
        var_6_D7 : int
        var_5_96 : \u3bc9\u47c2\u74b1\u5bc4\u7006
        
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
        var_1_5F = and:int(ldc:int(-1613688031), ldc:int(-550489241))
        
        if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getstatic:Map<String, Integer>(\u960f\u6ec6\u3e75\u8d90\u36d3::\uc246\u516c\ub32d\uff55\uc2e8\ua6bd), getfield:String[expected:Object](\u600f\u64ab\u4d85\ub19c\u446c::\u5140\ucb79\ub19c\uae5d\u0800\u8640, this:\u600f\u64ab\u4d85\ub19c\u446c)))) {
            var_1_73 = and:int(var_1_5F:int, ldc:int(-14757513))
            var_3_81 = sub:int(arraylength:int(getfield:Object[](\u600f\u64ab\u4d85\ub19c\u446c::\u3bc9\u965f\ucfaf\u71ae\u385b\uc7fe, this:\u600f\u64ab\u4d85\ub19c\u446c)), xor:int(ldc:int(3120), ldc:int(3121)))
            
            if (logicaland:boolean(cmpgt:boolean(arraylength:int(getfield:Object[](\u600f\u64ab\u4d85\ub19c\u446c::\u3bc9\u965f\ucfaf\u71ae\u385b\uc7fe, this:\u600f\u64ab\u4d85\ub19c\u446c)), ldc:int(0)), instanceof:boolean(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u3bc9\u47c2\u74b1\u5bc4\u7006.class, loadelement:Object(getfield:Object[](\u600f\u64ab\u4d85\ub19c\u446c::\u3bc9\u965f\ucfaf\u71ae\u385b\uc7fe, this:\u600f\u64ab\u4d85\ub19c\u446c), var_3_81:int)))) {
                var_4_93 = newarray:Object[](java.lang.Object.class, var_3_81:int)
                var_6_D7 = and:int(ldc:int(16534), ldc:int(-16535))
                
                loop {
                    var_1_73 = and:int(var_1_73:int, ldc:int(-21258897))
                    
                    if (cmpge:boolean(var_6_D7:int, var_3_81:int)) {
                        looporswitchbreak()
                    }
                    
                    storeelement:Object(var_4_93:Object[], var_6_D7:int, loadelement:Object(getfield:Object[](\u600f\u64ab\u4d85\ub19c\u446c::\u3bc9\u965f\ucfaf\u71ae\u385b\uc7fe, this:\u600f\u64ab\u4d85\ub19c\u446c), var_6_D7:int))
                    inc:int(var_6_D7, ldc:int(1))
                }
                
                var_5_96 = checkcast:\u3bc9\u47c2\u74b1\u5bc4\u7006(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u3bc9\u47c2\u74b1\u5bc4\u7006.class, loadelement:Object[expected:\u3bc9\u47c2\u74b1\u5bc4\u7006](getfield:Object[](\u600f\u64ab\u4d85\ub19c\u446c::\u3bc9\u965f\ucfaf\u71ae\u385b\uc7fe, this:\u600f\u64ab\u4d85\ub19c\u446c), var_3_81:int))
            }
            else {
                var_4_93 = getfield:Object[](\u600f\u64ab\u4d85\ub19c\u446c::\u3bc9\u965f\ucfaf\u71ae\u385b\uc7fe, this:\u600f\u64ab\u4d85\ub19c\u446c)
                var_5_96 = aconstnull:\u3bc9\u47c2\u74b1\u5bc4\u7006()
            }
            
            invokevirtual:\u8350\u183a\u6b5f\uc229\ud12e(\u960f\u6ec6\u3e75\u8d90\u36d3::\u8350\u76bc\u67e9\uff55\u8bb0\u385b, getfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u600f\u64ab\u4d85\ub19c\u446c::\u64ab\u392e\u759a\uf995\ubcb0\ubf56, this:\u600f\u64ab\u4d85\ub19c\u446c), getfield:String(\u600f\u64ab\u4d85\ub19c\u446c::\u5140\ucb79\ub19c\uae5d\u0800\u8640, this:\u600f\u64ab\u4d85\ub19c\u446c), var_4_93:Object[], var_5_96:\u3bc9\u47c2\u74b1\u5bc4\u7006)
            return:void()
        }
        
        invokestatic:\u8350\u183a\u6b5f\uc229\ud12e(\u960f\u6ec6\u3e75\u8d90\u36d3::\uc238\u156b\u59ec\u36d3\u67e9\u8389, getfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u600f\u64ab\u4d85\ub19c\u446c::\u64ab\u392e\u759a\uf995\ubcb0\ubf56, this:\u600f\u64ab\u4d85\ub19c\u446c), getfield:String(\u600f\u64ab\u4d85\ub19c\u446c::\u5140\ucb79\ub19c\uae5d\u0800\u8640, this:\u600f\u64ab\u4d85\ub19c\u446c), getfield:Object[](\u600f\u64ab\u4d85\ub19c\u446c::\u3bc9\u965f\ucfaf\u71ae\u385b\uc7fe, this:\u600f\u64ab\u4d85\ub19c\u446c))
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
    
    public void \u8cae\ud158\uf9c5\u839e\u8350\u983f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_625 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_630 : int
        
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
        var_3_625 = and:int(ldc:int(1029108204), ldc:int(-27648027))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u600f\u64ab\u4d85\ub19c\u446c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
            var_3_625 = and:int(var_3_625:int, ldc:int(469460454))
            var_5_7D = and:int(ldc:int(-12058), ldc:int(8985))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(27411), ldc:int(-28440)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_625:int, ldc:int(2065083637))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(5121), ldc:int(257)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(16426), ldc:int(16427)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_625 = and:int(var_3_D2:int, ldc:int(500748797))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(537), ldc:int(536)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(202866349))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1038913088))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1608181482))
                        goto(Label_1234)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(942680237))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1523659718))
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(658576045))
                        goto(Label_0597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1698682058))
                    }
                    else {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-128778771))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0597)
                            }
                            
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(338568517))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(319226013))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(2129255169))
                        goto(Label_1234)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1461583376))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-300085768))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(397354429))
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-482370832))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(842219171))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(1605798655))
                        var_11_E3 = and:int(ldc:int(26248), ldc:int(-26267))
                        goto(Label_1487)
                    }
                    
                    Label_0597:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1998284573))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1234)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(988766652))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(892220347))
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1336524015))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1805370450))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-132563467))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0716:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1476126335))
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-906907009))
                        goto(Label_1234)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1136821169))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-252966192))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-120715097))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-2009605574))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(459219942))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0850:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1881208214))
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1234)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1693171698))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1117760294))
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(797231124))
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-972991722))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(64005662))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(1029527286))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(-25600), ldc:int(-25599))
                                goto(Label_1123)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-191523749))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1234)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(1148892796))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(198837595))
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1051845217))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-583669265))
                        var_11_E3 = and:int(ldc:int(17920), ldc:int(-17921))
                    }
                    
                    Label_1123:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(250256130))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-1223906758))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-2102596001))
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(2085729052))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-575161628))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1356)
                            }
                        }
                    }
                    
                    Label_1234:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(1826722638))
                            goto(Label_1123)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-66441513))
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-593479462))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_625 = and:int(var_3_625:int, ldc:int(-729086818))
                            loopcontinue()
                        }
                        
                        var_3_625 = and:int(var_3_625:int, ldc:int(-76145420))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1487)
                    }
                    
                    Label_1356:
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1498)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1234)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(64)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-713460666))
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(32)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-882468934))
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(727029190))
                        goto(Label_0597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(16)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1539967306))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-476925571))
                        loopcontinue()
                    }
                    
                    var_3_625 = and:int(var_3_625:int, ldc:int(-541142019))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1487:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_630 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1498:
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1234)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-1196739743))
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_625:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_625 = and:int(var_3_625:int, ldc:int(-53050883))
                        var_17_630 = add:int(var_16_111:int, and:int(ldc:int(1), ldc:int(16833)))
                        looporswitchbreak()
                    }
                }
                
                var_3_625 = and:int(var_3_625:int, ldc:int(-596172313))
                
                if (cmple:boolean(var_5_7D = var_17_630:int, sub:int(var_6_84:int, and:int(ldc:int(2819), ldc:int(1109))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_625:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_625 = and:int(var_3_625:int, ldc:int(-539978473))
            goto(Label_0106)
        }
    }
}
