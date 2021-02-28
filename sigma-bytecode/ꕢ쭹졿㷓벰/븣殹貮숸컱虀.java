public class \ua562\ucb79\uc87f\u3dd3\ubcb0.\ube23\u6bb9\u8cae\uc238\ucef1\u8640 {
    public void \ube23\u6bb9\u8cae\uc238\ucef1\u8640(java.lang.String p0, int p1, java.lang.String p2, java.util.function.BooleanSupplier p3) {
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
            invokespecial:\u40a9\u36d3\u183a\u446c\u3504\ubf56(\u40a9\u36d3\u183a\u446c\u3504\ubf56::<init>, this:\ube23\u6bb9\u8cae\uc238\ucef1\u8640, p0:String, getstatic:\ucfaf\uff55\u40a9\u5f50\u7af6\u5d20(\ucfaf\uff55\u40a9\u5f50\u7af6\u5d20::\u8d98\ub70c\u446c\u12cb\uc9f6\ubff1), p1:int, p2:String)
            putfield:BooleanSupplier(\ube23\u6bb9\u8cae\uc238\ucef1\u8640::\u8c8a\u5db4\u494c\u494c\u88c5\u4ab3, this:\ube23\u6bb9\u8cae\uc238\ucef1\u8640, p3:BooleanSupplier)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8389\u5f50\u92ff\u3dd3\ud12e\u9033(boolean p0) {
        var_2_AD : int
        stack_C8_1 : int [generated]
        
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
        var_2_AD = and:int(ldc:int(870899121), ldc:int(-69034011))
        
        if (invokeinterface:boolean(BooleanSupplier::getAsBoolean, getfield:BooleanSupplier(\ube23\u6bb9\u8cae\uc238\ucef1\u8640::\u8c8a\u5db4\u494c\u494c\u88c5\u4ab3, this:\ube23\u6bb9\u8cae\uc238\ucef1\u8640))) {
            if (logicalnot:boolean(p0:boolean)) {
                goto(Label_0144)
            }
            
            if (invokevirtual:boolean(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u718f\u3776\u5d20\ub70c\ud217\u759a, this:\ube23\u6bb9\u8cae\uc238\ucef1\u8640[expected:\u40a9\u36d3\u183a\u446c\u3504\ubf56])) {
                var_2_AD = and:int(var_2_AD:int, ldc:int(-1212966495))
                stack_C8_1 = and:int[expected:boolean](ldc:int(21222), ldc:int(-31464))
            }
            else {
                stack_C8_1 = and:int[expected:boolean](ldc:int(1095), ldc:int(8209))
            }
            
            var_2_AD = and:int(var_2_AD:int, ldc:int(804904419))
            invokespecial:void(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u8389\u5f50\u92ff\u3dd3\ud12e\u9033, this:\ube23\u6bb9\u8cae\uc238\ucef1\u8640[expected:\u40a9\u36d3\u183a\u446c\u3504\ubf56], stack_C8_1:boolean)
            goto(Label_0144)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_2_AD:int, ldc:int(131072)), ldc:int(0))) {
            var_2_AD = and:int(var_2_AD:int, ldc:int(1367096809))
        }
        else {
            var_2_AD = and:int(var_2_AD:int, ldc:int(598343587))
            invokespecial:void(\u40a9\u36d3\u183a\u446c\u3504\ubf56::\u8389\u5f50\u92ff\u3dd3\ud12e\u9033, this:\ube23\u6bb9\u8cae\uc238\ucef1\u8640[expected:\u40a9\u36d3\u183a\u446c\u3504\ubf56], p0:boolean)
        }
        
        Label_0144:
        
        if (cmpne:boolean(and:int(var_2_AD:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
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
    
    public void \uc87f\uf94d\ubefe\uc238\u3e75\u5db4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FD : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
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
        var_3_5FD = and:int(ldc:int(-252181834), ldc:int(-472383274))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ube23\u6bb9\u8cae\uc238\ucef1\u8640[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-989951162))
            var_5_7D = and:int(ldc:int(-24092), ldc:int(23059))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(14597), ldc:int(-14598)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5FD:int, ldc:int(-338365786))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(2570), ldc:int(2571)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(19617), ldc:int(515)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5FD = and:int(var_3_CA:int, ldc:int(-387426194))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-32320), ldc:int(-32319)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-804030161))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1242240431))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1833092324))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(366094324))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-51377850))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-986907373))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1086807354))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-798211852))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1421822534))
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(942046267))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1295772520))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(2021687013))
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(188653216))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-238052722))
                            var_11_DB = and:int(ldc:int(3362), ldc:int(-23851))
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(432073923))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(65505898))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1201916241))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-579942384))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-773105385))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1862912685))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(354477804))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1099067756))
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-237947938))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1932563386))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1014019508))
                        goto(Label_1276)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1524130194))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1228568982))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-858626538))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(4097), ldc:int(265))
                                goto(Label_1035)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(438505660))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(637226300))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1182346132))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-790696154))
                        var_11_DB = and:int(ldc:int(-5249), ldc:int(5248))
                    }
                    
                    Label_1035:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(40871772))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-2034637940))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(847294672))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(508579366))
                            goto(Label_0676)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1831398612))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-406381953))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1276)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1598884609))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1035)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-111015476))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1650470739))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(1636398402))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5FD = and:int(var_3_5FD:int, ldc:int(-539934394))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1276:
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1982712600))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1035)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1735651580))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-1963743069))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-218186470))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(656448928))
                        loopcontinue()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(-943175465))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1407:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_608 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1418:
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(520825959))
                        goto(Label_1276)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(541016749))
                        goto(Label_1035)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-836436298))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-733877869))
                        goto(Label_0676)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(1380454458))
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FD:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5FD = and:int(var_3_5FD:int, ldc:int(-889517897))
                        var_17_608 = add:int(var_16_109:int, xor:int(ldc:int(-32606), ldc:int(-32605)))
                        looporswitchbreak()
                    }
                    
                    var_3_5FD = and:int(var_3_5FD:int, ldc:int(-634895908))
                }
                
                var_3_5FD = and:int(var_3_5FD:int, ldc:int(-926871306))
                
                if (cmple:boolean(var_5_7D = var_17_608:int, sub:int(var_6_84:int, and:int(ldc:int(7779), ldc:int(24585))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5FD:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
