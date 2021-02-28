public final class \u3d64\u7af6\uae87\uc238\u7d52.\u7e3f\ufe34\u92ff\u97b7\ubf56 {
    public void \u7e3f\ufe34\u92ff\u97b7\ubf56() {
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
            invokespecial:Object(Object::<init>, this:\u7e3f\ufe34\u92ff\u97b7\ubf56)
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
            var_3_8F = and:int(ldc:int(-1007722438), ldc:int(-1489488770))
            
            if (cmpge:boolean(invokevirtual:long(\ud217\u624e\u34df\u0b8e\u416d::\u946b\u16f6\ubefe\u76bc\uae87, p0:\ud217\u624e\u34df\u0b8e\u416d), invokevirtual:long(\ud217\u624e\u34df\u0b8e\u416d::\u946b\u16f6\ubefe\u76bc\uae87, p1:\ud217\u624e\u34df\u0b8e\u416d))) {
                do {
                    if (cmpeq:boolean(and:int(var_3_8F:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_8F = and:int(var_3_8F:int, ldc:int(-713530572))
                        
                        if (cmple:boolean(invokevirtual:long(\ud217\u624e\u34df\u0b8e\u416d::\u946b\u16f6\ubefe\u76bc\uae87, p0:\ud217\u624e\u34df\u0b8e\u416d), invokevirtual:long(\ud217\u624e\u34df\u0b8e\u416d::\u946b\u16f6\ubefe\u76bc\uae87, p1:\ud217\u624e\u34df\u0b8e\u416d))) {
                            loopcontinue()
                        }
                        
                        stack_B2_0 = ldc:int(-1)
                        return:int(stack_B2_0:int)
                    }
                } while (cmpeq:boolean(and:int(var_3_8F:int, ldc:int(2097152)), ldc:int(0)))
                
                var_3_8F = and:int(var_3_8F:int, ldc:int(-915756291))
                stack_B2_0 = and:int(ldc:int(12355), ldc:int(-12356))
            }
            else {
                stack_B2_0 = xor:int(ldc:int(514), ldc:int(515))
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
            return:int(invokevirtual:int(\u7e3f\ufe34\u92ff\u97b7\ubf56::compare, this:\u7e3f\ufe34\u92ff\u97b7\ubf56, checkcast:\ud217\u624e\u34df\u0b8e\u416d(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ud217\u624e\u34df\u0b8e\u416d.class, p0:Object[expected:\ud217\u624e\u34df\u0b8e\u416d]), checkcast:\ud217\u624e\u34df\u0b8e\u416d(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\ud217\u624e\u34df\u0b8e\u416d.class, p1:Object[expected:\ud217\u624e\u34df\u0b8e\u416d])))
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
    
    public void \u7ce1\uc9f6\u61a4\u0a06\uff55(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5D5 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5E0 : int
        
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
        var_3_5D5 = and:int(ldc:int(1775616015), ldc:int(2041962171))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7e3f\ufe34\u92ff\u97b7\ubf56[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1010495014))
        }
        else {
            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-136454849))
            var_5_85 = and:int(ldc:int(10579), ldc:int(-11616))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1294), ldc:int(-1295)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5D5:int, ldc:int(-437125461))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(20737), ldc:int(20736)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(2064), ldc:int(2065)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5D5 = and:int(var_3_D2:int, ldc:int(-103038341))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(24585), ldc:int(2465)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1544111772))
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(888137520))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-666237954))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1744686011))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1006301702))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1192420031))
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-552800408))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(859070427))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2006960943))
                            var_11_E3 = and:int(ldc:int(709), ldc:int(-9934))
                            goto(Label_1383)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-408573966))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1285193097))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(887377652))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-286662630))
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(971759511))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2107233903))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0762)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-783122222))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(998348399))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1882729597))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-138951493))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0762:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-72256411))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(114215161))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1610444764))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-770299602))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-404766597))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(10817), ldc:int(131))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-365037039))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1966581988))
                        goto(Label_1138)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-663027891))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(707111431))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1124566367))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1905651935))
                        var_11_E3 = and:int(ldc:int(-18345), ldc:int(17320))
                    }
                    
                    Label_1027:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1150102681))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(968032945))
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1088349257))
                            goto(Label_0762)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(932411569))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1977342155))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1260)
                            }
                        }
                    }
                    
                    Label_1138:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(981691001))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_1027)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-830436995))
                            goto(Label_0762)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-345903644))
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-184230512))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2141183691))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1383)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1260:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(890264644))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0762)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(556588750))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1307726351))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2043909109))
                        loopcontinue()
                    }
                    
                    var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2013262623))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1383:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E0 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1394:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1138)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1945787979))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1208106763))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1814541321))
                        goto(Label_0762)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-402665105))
                        var_17_5E0 = add:int(var_16_111:int, xor:int(ldc:int(20552), ldc:int(20553)))
                        looporswitchbreak()
                    }
                    
                    var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1873654061))
                }
                
                var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2041702187))
                
                if (cmple:boolean(var_5_85 = var_17_5E0:int, sub:int(var_6_8C:int, and:int(ldc:int(4355), ldc:int(10373))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
