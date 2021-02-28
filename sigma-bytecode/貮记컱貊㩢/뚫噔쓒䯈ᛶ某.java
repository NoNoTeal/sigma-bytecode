public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0 {
    public void \ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0(java.lang.String p0) {
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
            invokespecial:Object(Object::<init>, this:\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0)
            putfield:ThreadFactory(\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0::\u156b\ua3b4\ub70c\u7043\u9937\u8389, this:\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0, invokestatic:ThreadFactory(Executors::defaultThreadFactory))
            putfield:AtomicInteger(\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0::\ub113\uc246\u8d98\u6ec6\u5db4\ub32d, this:\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0, initobject:AtomicInteger(AtomicInteger::<init>, xor:int(ldc:int(2824), ldc:int(2825))))
            putfield:String(\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0::\u97b7\u7006\u527a\u494c\u56bd\u6d99, this:\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Thread newThread(java.lang.Runnable p0) {
        var_4_6A : Thread
        
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
            var_4_6A = invokeinterface:Thread(ThreadFactory::newThread, getfield:ThreadFactory(\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0::\u156b\ua3b4\ub70c\u7043\u9937\u8389, this:\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0), p0:Runnable)
            invokevirtual:void(Thread::setName, var_4_6A:Thread, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0::\u97b7\u7006\u527a\u494c\u56bd\u6d99, this:\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0)), loadelement:String(getstatic:String[](\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0::\u88c5\u965f\u5bc4\u183a\u69d9\u93a2), and:int(ldc:int(-9877), ldc:int(9876)))), getfield:AtomicInteger[expected:Object](\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0::\ub113\uc246\u8d98\u6ec6\u5db4\ub32d, this:\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0))))
            return:Thread(var_4_6A:Thread)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_181 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_87_0 : byte[] [generated]
        stack_89_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_193_0 : byte[] [generated]
        stack_1F3_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_11E : byte[]
        var_4_11F : int
        expr_89 : int [generated]
        var_5_16E : int
        var_3_173 : byte[]
        var_4_174 : int
        expr_193 : byte [generated]
        var_0_1E9 : int
        expr_1F3 : byte [generated]
        stack_221_2 : byte [generated]
        expr_B5 : int [generated]
        var_3_E2 : String
        stack_115_0 : String[] [generated]
        expr_F4 : String[] [generated]
        
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
            var_0_181 = and:int(ldc:int(-943617711), ldc:int(-505953555))
            expr_65 = var_2_69 = stack_87_0 = stack_89_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_193_0 = stack_1F3_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AOA="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_11E = newarray:byte[](byte.class, expr_6D:int)
                var_4_11F = expr_6D:int
                
                loop {
                    var_0_181 = and:int(var_0_181:int, ldc:int(-673062059))
                    var_4_11F = add:int(var_4_11F:int, ldc:int(-1))
                    storeelement:byte(var_3_11E:byte[], var_4_11F:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_11F:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_11F:int, xor:int(ldc:int(-30456), ldc:int(-30455)))), ldc:int(4)), and:int(ldc:int(8335), ldc:int(21263)))))
                    
                    if (cmpne:boolean(var_4_11F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_89_0 = stack_87_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_193_0 = stack_1F3_0 = var_3_11E:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_181:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0186)
                }
                
                if (cmpne:boolean(and:int(var_0_181:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0142)
                }
                
                var_0_181 = and:int(var_0_181:int, ldc:int(-537225877))
                expr_89 = arraylength:int(stack_89_0:byte[])
                
                if (cmpeq:boolean(expr_89:int, ldc:int(0))) {
                    goto(Label_0142)
                }
                
                var_5_16E = expr_89:int
                var_3_173 = newarray:byte[](byte.class, expr_89:int)
                var_4_174 = expr_89:int
                Label_0374:
                
                while (cmpeq:boolean(and:int(var_0_181:int, ldc:int(536870912)), ldc:int(0))) {
                    var_0_181 = and:int(var_0_181:int, ldc:int(-673670147))
                    var_4_174 = add:int(var_4_174:int, ldc:int(-1))
                    expr_193 = loadelement:byte(stack_193_0:byte[], var_4_174:int)
                    storeelement:byte(var_3_173:byte[], var_4_174:int, xor:int(add:int(or:int(and:int(shl:int(expr_193:byte, xor:int(ldc:int(8226), ldc:int(8230))), ldc:int(-16)), and:int(shr:int(expr_193:byte[expected:int], and:int(ldc:int(772), ldc:int(2247))), ldc:int(15))), ldc:int(81)), ldc:int(25)))
                    
                    if (cmpne:boolean(var_4_174:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_89_0 = stack_87_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_193_0 = stack_1F3_0 = var_3_173:byte[]
                    goto(Label_0142)
                }
                
                var_0_181 = and:int(var_0_181:int, ldc:int(-1690766918))
                Label_0478:
                
                while (cmpne:boolean(and:int(var_0_181:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_0_1E9 = and:int(var_0_181:int, ldc:int(-436687141))
                    var_4_174 = add:int(var_4_174:int, ldc:int(-1))
                    expr_1F3 = loadelement:byte(stack_1F3_0:byte[], var_4_174:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_174:int, ldc:int(5)), neg:int(var_5_16E:int)), ldc:int(0))) {
                        var_0_1E9 = and:int(var_0_1E9:int, ldc:int(-572472095))
                        stack_221_2 = add:byte(expr_1F3:byte, ldc:byte(5))
                    }
                    else {
                        stack_221_2 = add:byte(expr_1F3:byte, loadelement:byte(var_3_173:byte[], add:int(var_4_174:int, ldc:int(5))))
                    }
                    
                    var_0_181 = and:int(var_0_1E9:int, ldc:int(-235871551))
                    storeelement:byte(var_3_173:byte[], var_4_174:int, stack_221_2:byte)
                    
                    if (cmpne:boolean(var_4_174:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_89_0 = stack_87_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_193_0 = stack_1F3_0 = var_3_173:byte[]
                    goto(Label_0186)
                }
                
                goto(Label_0374)
                Label_0142:
                
                if (cmpne:boolean(and:int(var_0_181:int, ldc:int(131072)), ldc:int(0))) {
                    var_0_181 = and:int(var_0_181:int, ldc:int(-715446631))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_181:int, ldc:int(2097152)), ldc:int(0))) {
                        var_0_181 = and:int(var_0_181:int, ldc:int(1124494150))
                        loopcontinue()
                    }
                    
                    var_0_181 = and:int(var_0_181:int, ldc:int(-707078683))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_5_16E = expr_B5:int
                        var_3_173 = newarray:byte[](byte.class, expr_B5:int)
                        var_4_174 = expr_B5:int
                        goto(Label_0478)
                    }
                }
                
                Label_0186:
                
                if (cmpeq:boolean(and:int(var_0_181:int, ldc:int(4194304)), ldc:int(0))) {
                    var_0_181 = and:int(var_0_181:int, ldc:int(-1907112378))
                    goto(Label_0142)
                }
                
                if (cmpeq:boolean(and:int(var_0_181:int, ldc:int(536870912)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_115_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(12313), ldc:int(2113)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(10528), ldc:int(10529)))
            storeelement:String(expr_F4:String[], and:int(ldc:int(-12212), ldc:int(11923)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-31012), ldc:int(31011)), xor:int(ldc:int(25092), ldc:int(25093))))
            putstatic:String[](\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0::\u88c5\u965f\u5bc4\u183a\u69d9\u93a2, expr_F4:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u759a\u7d52\u7d52\u927d\u16f6\u3bc9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_607 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_612 : int
        
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
        var_3_607 = and:int(ldc:int(963858301), ldc:int(1039366815))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub6ab\u5654\uc4d2\u4bc8\u16f6\u67d0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2)), ldc:int(0))) {
            var_3_607 = and:int(var_3_607:int, ldc:int(-12605793))
            var_5_7D = and:int(ldc:int(18736), ldc:int(-31029))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(28304), ldc:int(-28377)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_607:int, ldc:int(-9239811))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(16645), ldc:int(16644)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(6156), ldc:int(6157)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_607 = and:int(var_3_CA:int, ldc:int(-1204600100))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-30400), ldc:int(-30399)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(916271710))
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1039)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1304170130))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-92301698))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0517)
                            }
                            
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0365:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(6785881))
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1636553380))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(822617286))
                        goto(Label_1039)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1759474648))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1039920893))
                            var_11_DB = and:int(ldc:int(-22849), ldc:int(22848))
                            goto(Label_1419)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0517:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1797648710))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1039)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1878565400))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1966397768))
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1347491628))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-1809948593))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(968835966))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1757690987))
                        goto(Label_1264)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1459109762))
                        goto(Label_1039)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1303143879))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-129952409))
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1096064289))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0754:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-251658718))
                        goto(Label_1039)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1151299499))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-37710555))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-1713481618))
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1344428138))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(2042061503))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(4353), ldc:int(137))
                                goto(Label_1039)
                            }
                        }
                    }
                    
                    Label_0873:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(512)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(393516762))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(325976668))
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1612298159))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-1754005094))
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-1643148962))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-964116341))
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(2146648796))
                        var_11_DB = and:int(ldc:int(-25062), ldc:int(25060))
                    }
                    
                    Label_1039:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-502492946))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(223494334))
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-203040137))
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-960636584))
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(2045456191))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1264)
                            }
                        }
                    }
                    
                    Label_1155:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-712909289))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1039)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(2035264604))
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-76555267))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1419)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1264:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-2038716857))
                        goto(Label_1430)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(804468088))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-856941887))
                        goto(Label_1039)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-206955441))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1415449829))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1305781348))
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1898266342))
                        goto(Label_0365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_607 = and:int(var_3_607:int, ldc:int(2020331196))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1419:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_612 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1430:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1264)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1039)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(512)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1472071019))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(278278685))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1834301586))
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1051181192))
                        goto(Label_0365)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1051406108))
                        var_17_612 = add:int(var_16_109:int, xor:int(ldc:int(-32736), ldc:int(-32735)))
                        looporswitchbreak()
                    }
                    
                    var_3_607 = and:int(var_3_607:int, ldc:int(2094102815))
                }
                
                var_3_607 = and:int(var_3_607:int, ldc:int(-9459937))
                
                if (cmple:boolean(var_5_7D = var_17_612:int, sub:int(var_6_84:int, and:int(ldc:int(385), ldc:int(3141))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
