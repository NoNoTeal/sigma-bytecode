public final class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u76bc\u6fb0\uc84e\u0b8e\u8389\u12cb {
    public void \u76bc\u6fb0\uc84e\u0b8e\u8389\u12cb() {
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
            invokespecial:Object(Object::<init>, this:\u76bc\u6fb0\uc84e\u0b8e\u8389\u12cb)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int compare(java.lang.String p0, java.lang.String p1) {
        var_3_1A3 : int
        var_5_67 : int
        var_6_74 : int
        var_7_110 : char
        var_8_118 : char
        stack_166_0 : int [generated]
        stack_1B8_0 : int [generated]
        
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
            var_3_1A3 = and:int(ldc:int(-584391912), ldc:int(1600840875))
            var_5_67 = and:int(ldc:int(23300), ldc:int(1135))
            var_6_74 = invokestatic:int(Math::min, invokevirtual:int(String::length, p0:String), invokevirtual:int(String::length, p1:String))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_1A3:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0370)
                }
                
                if (cmpne:boolean(and:int(var_3_1A3:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0212)
                }
                
                if (cmpeq:boolean(and:int(var_3_1A3:int, ldc:int(2048)), ldc:int(0))) {
                    var_3_1A3 = and:int(var_3_1A3:int, ldc:int(1544268430))
                    
                    if (cmplt:boolean(var_5_67:int, var_6_74:int)) {
                        var_7_110 = invokevirtual:char(String::charAt, p0:String, var_5_67:int)
                        var_8_118 = invokevirtual:char(String::charAt, p1:String, var_5_67:int)
                        
                        if (cmpne:boolean(var_7_110:char, var_8_118:char)) {
                            if (cmpge:boolean(var_7_110:char, var_8_118:char)) {
                                goto(Label_0326)
                            }
                            
                            stack_166_0 = ldc:int(-1)
                            looporswitchbreak()
                        }
                        
                        Label_0289:
                        
                        if (cmpne:boolean(and:int(var_3_1A3:int, ldc:int(8)), ldc:int(0))) {
                            var_3_1A3 = and:int(var_3_1A3:int, ldc:int(2107367930))
                            inc:int(var_5_67, ldc:int(1))
                            loopcontinue()
                        }
                        
                        var_3_1A3 = and:int(var_3_1A3:int, ldc:int(-17396018))
                        Label_0326:
                        
                        if (cmpne:boolean(and:int(var_3_1A3:int, ldc:int(8)), ldc:int(0))) {
                            var_3_1A3 = and:int(var_3_1A3:int, ldc:int(2121239756))
                            stack_166_0 = and:int(ldc:int(641), ldc:int(4451))
                            looporswitchbreak()
                        }
                        
                        goto(Label_0289)
                    }
                }
                
                Label_0151:
                
                if (cmpeq:boolean(and:int(var_3_1A3:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0370)
                }
                
                if (cmpeq:boolean(and:int(var_3_1A3:int, ldc:int(8)), ldc:int(0))) {
                    var_3_1A3 = and:int(var_3_1A3:int, ldc:int(1789993240))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_1A3:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_1A3 = and:int(var_3_1A3:int, ldc:int(-1212714464))
                        loopcontinue()
                    }
                    
                    var_3_1A3 = and:int(var_3_1A3:int, ldc:int(2100018814))
                    var_5_67 = invokevirtual:int(String::length, p0:String)
                    var_6_74 = invokevirtual:int(String::length, p1:String)
                    
                    if (cmpne:boolean(var_5_67:int, var_6_74:int)) {
                        if (cmpge:boolean(var_5_67:int, var_6_74:int)) {
                            goto(Label_0370)
                        }
                        
                        stack_1B8_0 = ldc:int(-1)
                        return:int(stack_1B8_0:int)
                    }
                }
                
                Label_0212:
                
                if (cmpeq:boolean(and:int(var_3_1A3:int, ldc:int(4096)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_1A3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_1A3 = and:int(var_3_1A3:int, ldc:int(-95542416))
                        goto(Label_0151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_1A3:int, ldc:int(32)), ldc:int(0))) {
                        var_3_1A3 = and:int(var_3_1A3:int, ldc:int(-1779961138))
                        loopcontinue()
                    }
                    
                    return:int(and:int(ldc:int(-18858), ldc:int(18601)))
                }
                
                Label_0370:
                
                if (cmpeq:boolean(and:int(var_3_1A3:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_3_1A3 = and:int(var_3_1A3:int, ldc:int(-446336679))
                    goto(Label_0212)
                }
                
                if (cmpeq:boolean(and:int(var_3_1A3:int, ldc:int(67108864)), ldc:int(0))) {
                    var_3_1A3 = and:int(var_3_1A3:int, ldc:int(-1774300782))
                    goto(Label_0151)
                }
                
                if (cmpeq:boolean(and:int(var_3_1A3:int, ldc:int(4194304)), ldc:int(0))) {
                    var_3_1A3 = and:int(var_3_1A3:int, ldc:int(-30744353))
                    stack_1B8_0 = and:int(ldc:int(4105), ldc:int(8499))
                    return:int(stack_1B8_0:int)
                }
                
                var_3_1A3 = and:int(var_3_1A3:int, ldc:int(-568828825))
            }
            
            return:int(stack_166_0:int)
        }
        
        goto(Label_0006)
    }
    
    public int compare(java.lang.Object p0, java.lang.Object p1) {
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
            return:int(invokevirtual:int(\u76bc\u6fb0\uc84e\u0b8e\u8389\u12cb::compare, this:\u76bc\u6fb0\uc84e\u0b8e\u8389\u12cb, checkcast:String(java.lang.String.class, p0:Object[expected:String]), checkcast:String(java.lang.String.class, p1:Object[expected:String])))
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
    
    public void \u6ec6\ubded\ub113\ud523\u6198\u9af2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_60D : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
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
        var_3_60D = and:int(ldc:int(680356075), ldc:int(1685583763))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u76bc\u6fb0\uc84e\u0b8e\u8389\u12cb[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
            var_3_60D = and:int(var_3_60D:int, ldc:int(1972355051))
            var_5_7D = and:int(ldc:int(-16510), ldc:int(16509))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(30752), ldc:int(-30761)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_60D:int, ldc:int(-4380439))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(10560), ldc:int(10561)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(17537), ldc:int(8705)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_60D = and:int(var_3_CA:int, ldc:int(-1589154363))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(1321), ldc:int(6229)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1065197419))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-2115737243))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(414968223))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1424007543))
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1583139865))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-664247488))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1104689729))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1208339805))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-2095713847))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1030878973))
                        var_11_DB = and:int(ldc:int(-3486), ldc:int(1437))
                        goto(Label_1415)
                    }
                    
                    Label_0533:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-3674172))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-46792092))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1332429499))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(938456273))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0746)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2107115493))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-824888700))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1611172796))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1215453469))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0746:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(644537884))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-569030215))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(682600407))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1018579854))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-18682506))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1128351193))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-471881779))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(264), ldc:int(265))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-844813475))
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-732345264))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-458431357))
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(2036236852))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1070108534))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(1798713321))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2147296951))
                        var_11_DB = and:int(ldc:int(-5906), ldc:int(5905))
                    }
                    
                    Label_1035:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1884130423))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-416464893))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-603900138))
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0746)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-931121138))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-557270376))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-1310871067))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1284)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-757554906))
                            goto(Label_1035)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(2084373210))
                            goto(Label_0746)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-434325112))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(828121073))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_60D = and:int(var_3_60D:int, ldc:int(-1156983034))
                            loopcontinue()
                        }
                        
                        var_3_60D = and:int(var_3_60D:int, ldc:int(683500457))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1415)
                    }
                    
                    Label_1284:
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1116027165))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1177183200))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(2034874499))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(794047165))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(362813111))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(-1234574123))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1415:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_618 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1426:
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1644656424))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1951488414))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-654525155))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0746)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_60D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-193506767))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1045908732))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(-307938185))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_60D = and:int(var_3_60D:int, ldc:int(1787131583))
                        var_17_618 = add:int(var_16_109:int, and:int(ldc:int(1027), ldc:int(445)))
                        looporswitchbreak()
                    }
                    
                    var_3_60D = and:int(var_3_60D:int, ldc:int(-1749910499))
                }
                
                var_3_60D = and:int(var_3_60D:int, ldc:int(-199791131))
                
                if (cmple:boolean(var_5_7D = var_17_618:int, sub:int(var_6_84:int, and:int(ldc:int(18561), ldc:int(4675))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_60D:int, ldc:int(536870912)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
