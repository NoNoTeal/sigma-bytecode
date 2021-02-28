public class \u3d64\u7af6\uae87\uc238\u7d52.\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe {
    public void \ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe() {
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
            invokespecial:Object(Object::<init>, this:\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.google.gson.TypeAdapter<T> create(com.google.gson.Gson p0, com.google.gson.reflect.TypeToken<T> p1) {
        var_5_64 : Class
        var_6_76 : HashMap
        var_7_7D : Object[]
        var_8_82 : int
        var_9_8B : int
        var_10_BD : Object
        
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
        var_5_64 = invokevirtual:Class(TypeToken::getRawType, p1:TypeToken<T>)
        
        if (invokevirtual:boolean(Class::isEnum, var_5_64:Class)) {
            var_6_76 = invokestatic:HashMap(Maps::newHashMap)
            var_7_7D = invokevirtual:Object[](Class<Object>::getEnumConstants, var_5_64:Class<Object>)
            var_8_82 = arraylength:int(var_7_7D:Object[])
            var_9_8B = and:int(ldc:int(-31069), ldc:int(30796))
            
            while (cmplt:boolean(var_9_8B:int, var_8_82:int)) {
                var_10_BD = loadelement:Object(var_7_7D:Object[], var_9_8B:int)
                invokeinterface:Object(Map<String, Object>::put, var_6_76:HashMap<String, Object>[expected:Map<String, Object>], invokespecial:String(\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe::\u960f\u647c\uc9f6\u4179\u12cb\ubcb0, this:\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe, var_10_BD:Object), var_10_BD:Object)
                inc:int(var_9_8B, ldc:int(1))
            }
            
            return:TypeAdapter<T>(initobject:\uff55\u4ab3\u74b1\u67e9\u7bad\u416d(\uff55\u4ab3\u74b1\u67e9\u7bad\u416d::<init>, this:\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe, var_6_76:HashMap<String, Object>[expected:Map]))
        }
        
        return:TypeAdapter<T>(aconstnull:TypeAdapter<T>())
    }
    
    private java.lang.String \u960f\u647c\uc9f6\u4179\u12cb\ubcb0(java.lang.Object p0) {
        var_2_5F : int
        stack_8F_0 : String [generated]
        
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
            var_2_5F = and:int(ldc:int(-1214633854), ldc:int(-1090521686))
            
            if (logicalnot:boolean(instanceof:boolean(java.lang.Enum.class, p0:Object))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-22219880))
                stack_8F_0 = invokevirtual:String(String::toLowerCase, invokevirtual:String(Object::toString, p0:Object), getstatic:Locale(Locale::ROOT))
            }
            else {
                stack_8F_0 = invokevirtual:String(String::toLowerCase, invokevirtual:String(Enum::name, checkcast:Enum(java.lang.Enum.class, p0:Object[expected:Enum])), getstatic:Locale(Locale::ROOT))
            }
            
            return:String(stack_8F_0:String)
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u4ab3\u8753\u67e9\u88c5\u6b5f\u8df4(\u3d64\u7af6\uae87\uc238\u7d52.\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe p0, java.lang.Object p1) {
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
            return:String(invokespecial:String(\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe::\u960f\u647c\uc9f6\u4179\u12cb\ubcb0, p0:\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe, p1:Object))
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
    
    public void \uc9f6\u6bb9\u4492\u62da\u8709\uc29a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FE : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_609 : int
        
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
        var_3_5FE = and:int(ldc:int(-55432784), ldc:int(-38377045))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubded\u4bc8\u92ff\u4daf\u5d20\u6cfe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-33900631))
            var_5_7D = and:int(ldc:int(-17607), ldc:int(17606))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-8795), ldc:int(8786)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5FE:int, ldc:int(-21515970))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(2145), ldc:int(8731)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(-28672), ldc:int(-28671)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5FE = and:int(var_3_D2:int, ldc:int(-34098125))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(21793), ldc:int(517)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(884807075))
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1243544206))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1378995690))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1980682544))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1469246581))
                    }
                    else {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-21926736))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(450578416))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1153993889))
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1546044310))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-2068147546))
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-571274283))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(375141927))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(694866069))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-106647426))
                        var_11_E3 = and:int(ldc:int(-15137), ldc:int(15136))
                        goto(Label_1419)
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1140275886))
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(695353488))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1430097794))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(83509207))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-609228618))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1374541847))
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(2072134670))
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(496084927))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-547958902))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-69190933))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(752885571))
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1071186984))
                        goto(Label_1186)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1560984607))
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1399992035))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1540880920))
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-660080026))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(5120), ldc:int(5121))
                                goto(Label_1075)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1326375076))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-22151239))
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1535085097))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1653095869))
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(851167599))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-123065808))
                        var_11_E3 = and:int(ldc:int(-1338), ldc:int(1337))
                    }
                    
                    Label_1075:
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1814907338))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-748814689))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1300220488))
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1487427826))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-554729862))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1309)
                            }
                        }
                    }
                    
                    Label_1186:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1460013434))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1075)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(1743477223))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(255209183))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1145002026))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5FE = and:int(var_3_5FE:int, ldc:int(-39374810))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1419)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1309:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1075)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1681390814))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1332339996))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5FE = and:int(var_3_5FE:int, ldc:int(-656330962))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1419:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_609 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1430:
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1186)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(916827893))
                        goto(Label_1075)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(112276870))
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-1455070948))
                        goto(Label_0684)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FE:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(1859533861))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5FE = and:int(var_3_5FE:int, ldc:int(-18566353))
                        var_17_609 = add:int(var_16_111:int, xor:int(ldc:int(36), ldc:int(37)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5FE = and:int(var_3_5FE:int, ldc:int(-622581521))
                
                if (cmple:boolean(var_5_7D = var_17_609:int, sub:int(var_6_84:int, xor:int(ldc:int(4178), ldc:int(4179))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5FE:int, ldc:int(524288)), ldc:int(0))) {
            var_3_5FE = and:int(var_3_5FE:int, ldc:int(473947491))
            goto(Label_0106)
        }
    }
}
