public final class \u516c\u3d64\u718f\ub171\u6b5f.\u64ab\u3bc9\ubcb0\ua6bd\ubefe {
    public void \u64ab\u3bc9\ubcb0\ua6bd\ubefe() {
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
            invokespecial:Object(Object::<init>, this:\u64ab\u3bc9\ubcb0\ua6bd\ubefe)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int compare(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ud217\u624e\u34df\u0b8e\u416d p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ud217\u624e\u34df\u0b8e\u416d p1) {
        var_3_8F : int
        stack_B2_0 : int [generated]
        
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
            var_3_8F = and:int(ldc:int(-1842756853), ldc:int(1048249235))
            
            if (cmpge:boolean(invokevirtual:long(\ud217\u624e\u34df\u0b8e\u416d::\u16f6\u960f\u7ce1\u16f6\u59ec, p0:\ud217\u624e\u34df\u0b8e\u416d), invokevirtual:long(\ud217\u624e\u34df\u0b8e\u416d::\u16f6\u960f\u7ce1\u16f6\u59ec, p1:\ud217\u624e\u34df\u0b8e\u416d))) {
                do {
                    if (cmpne:boolean(and:int(var_3_8F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_8F = and:int(var_3_8F:int, ldc:int(-26341340))
                        
                        if (cmple:boolean(invokevirtual:long(\ud217\u624e\u34df\u0b8e\u416d::\u16f6\u960f\u7ce1\u16f6\u59ec, p0:\ud217\u624e\u34df\u0b8e\u416d), invokevirtual:long(\ud217\u624e\u34df\u0b8e\u416d::\u16f6\u960f\u7ce1\u16f6\u59ec, p1:\ud217\u624e\u34df\u0b8e\u416d))) {
                            loopcontinue()
                        }
                        
                        stack_B2_0 = ldc:int(-1)
                        return:int(stack_B2_0:int)
                    }
                } while (cmpne:boolean(and:int(var_3_8F:int, ldc:int(4096)), ldc:int(0)))
                
                var_3_8F = and:int(var_3_8F:int, ldc:int(1995098121))
                stack_B2_0 = and:int(ldc:int(18850), ldc:int(-23011))
            }
            else {
                stack_B2_0 = and:int(ldc:int(2049), ldc:int(8993))
            }
            
            return:int(stack_B2_0:int)
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
            return:int(invokevirtual:int(\u64ab\u3bc9\ubcb0\ua6bd\ubefe::compare, this:\u64ab\u3bc9\ubcb0\ua6bd\ubefe, checkcast:\ud217\u624e\u34df\u0b8e\u416d(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ud217\u624e\u34df\u0b8e\u416d.class, p0:Object[expected:\ud217\u624e\u34df\u0b8e\u416d]), checkcast:\ud217\u624e\u34df\u0b8e\u416d(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ud217\u624e\u34df\u0b8e\u416d.class, p1:Object[expected:\ud217\u624e\u34df\u0b8e\u416d])))
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
    
    public void \u8cae\uc87f\u8640\u836c\uc238(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5BD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5C8 : int
        
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
        var_3_5BD = and:int(ldc:int(-1191553769), ldc:int(1019797203))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u64ab\u3bc9\ubcb0\ua6bd\ubefe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1416659629))
            var_5_7D = and:int(ldc:int(24065), ldc:int(-24258))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-32530), ldc:int(18193)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5BD:int, ldc:int(2094562327))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(12289), ldc:int(2629)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(72), ldc:int(73)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5BD = and:int(var_3_CA:int, ldc:int(-1363381157))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(18592), ldc:int(18593)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-811009890))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-2088275154))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1459095522))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1159751491))
                    }
                    else {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1842339163))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1680913245))
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(2016162145))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(613425872))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1846632756))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1143032313))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-2145761209))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1826512371))
                        var_11_DB = and:int(ldc:int(301), ldc:int(-302))
                        goto(Label_1359)
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(748581359))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1207439748))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(708315299))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-319011496))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-566301887))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(1193359222))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1020157555))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1108773558))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1686049659))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(123091178))
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(771521727))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(112373305))
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(686415707))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(16481), ldc:int(16480))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1657899092))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-369442874))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1965157357))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1026316685))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(754676855))
                        var_11_DB = and:int(ldc:int(-26773), ldc:int(26772))
                    }
                    
                    Label_1019:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(835180805))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(690208331))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(552189577))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1049551585))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-106954785))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1236)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1019)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(629752170))
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-410847349))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1080200013))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1359)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1236:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1164335329))
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-696380760))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1013992709))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(1675541795))
                        loopcontinue()
                    }
                    
                    var_3_5BD = and:int(var_3_5BD:int, ldc:int(2096027091))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1359:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5C8 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1370:
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-112781513))
                        goto(Label_1236)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(2098500115))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1219516705))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5BD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(2139194430))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1112802125))
                        var_17_5C8 = add:int(var_16_109:int, and:int(ldc:int(2153), ldc:int(1541)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5BD = and:int(var_3_5BD:int, ldc:int(-1157955945))
                
                if (cmple:boolean(var_5_7D = var_17_5C8:int, sub:int(var_6_84:int, and:int(ldc:int(19469), ldc:int(12881))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5BD:int, ldc:int(8192)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
