public class \u3504\ufe34\u600f\u6b0d\u69d9.\ud171\u4daf\u6bb9\u8d98\u8bb0 {
    public void \ud171\u4daf\u6bb9\u8d98\u8bb0(java.lang.String p0, int p1, int p2) {
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
            invokespecial:\u156b\uc2bd\u4179\u600f\u9255(\u156b\uc2bd\u4179\u600f\u9255::<init>, this:\ud171\u4daf\u6bb9\u8d98\u8bb0, p0:String, p1:int, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3504\ufe34\u600f\u6b0d\u69d9.\ud171\u4daf\u6bb9\u8d98\u8bb0 \u4c2b\uc9f6\u0800\u92ff\u88c5\ub1b9() {
        var_1_106 : int
        var_3_112 : Exception
        
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
        var_1_106 = and:int(ldc:int(533686124), ldc:int(-538739272))
        
        try {
            loop {
                if (cmpeq:boolean(and:int(var_1_106:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0229)
                }
                
                if (cmpeq:boolean(and:int(var_1_106:int, ldc:int(67108864)), ldc:int(0))) {
                    var_1_106 = and:int(var_1_106:int, ldc:int(-360079292))
                    goto(Label_0196)
                }
                
                if (cmpne:boolean(and:int(var_1_106:int, ldc:int(268435456)), ldc:int(0))) {
                    var_1_106 = and:int(var_1_106:int, ldc:int(-1077446879))
                    invokevirtual:void(URLConnection::setDoOutput, getfield:HttpURLConnection[expected:URLConnection](\ud171\u4daf\u6bb9\u8d98\u8bb0::\u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4, this:\ud171\u4daf\u6bb9\u8d98\u8bb0), xor:int[expected:boolean](ldc:int(9984), ldc:int(9985)))
                }
                
                Label_0144:
                
                if (cmpeq:boolean(and:int(var_1_106:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0229)
                }
                
                if (cmpeq:boolean(and:int(var_1_106:int, ldc:int(256)), ldc:int(0))) {
                    var_1_106 = and:int(var_1_106:int, ldc:int(-308350876))
                }
                else {
                    if (cmpne:boolean(and:int(var_1_106:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_106 = and:int(var_1_106:int, ldc:int(1069803369))
                    invokevirtual:void(HttpURLConnection::setRequestMethod, getfield:HttpURLConnection(\ud171\u4daf\u6bb9\u8d98\u8bb0::\u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4, this:\ud171\u4daf\u6bb9\u8d98\u8bb0), loadelement:String(getstatic:String[](\ud171\u4daf\u6bb9\u8d98\u8bb0::\u9af2\ub171\u71f1\u0800\u51b2\u92ff), and:int(ldc:int(9316), ldc:int(-25701))))
                }
                
                Label_0196:
                
                if (cmpne:boolean(and:int(var_1_106:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_1_106:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0144)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_106:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_106 = and:int(var_1_106:int, ldc:int(-9443405))
                    invokevirtual:void(URLConnection::connect, getfield:HttpURLConnection[expected:URLConnection](\ud171\u4daf\u6bb9\u8d98\u8bb0::\u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4, this:\ud171\u4daf\u6bb9\u8d98\u8bb0))
                }
                
                Label_0229:
                
                if (cmpne:boolean(and:int(var_1_106:int, ldc:int(32768)), ldc:int(0))) {
                    var_1_106 = and:int(var_1_106:int, ldc:int(-163330366))
                    goto(Label_0196)
                }
                
                if (cmpeq:boolean(and:int(var_1_106:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0144)
                }
                
                if (cmpne:boolean(and:int(var_1_106:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_1_106 = and:int(var_1_106:int, ldc:int(509575153))
            var_1_106 = and:int(var_1_106:int, ldc:int(1600614242))
            return:\ud171\u4daf\u6bb9\u8d98\u8bb0(this:\ud171\u4daf\u6bb9\u8d98\u8bb0)
        }
        catch (java.lang.Exception var_3_112) {
            athrow(initobject:\u6fb0\uc84e\u92ee\ub6ab\u3504(\u6fb0\uc84e\u92ee\ub6ab\u3504::<init>, invokevirtual:String(Throwable::getMessage, var_3_112:Exception[expected:Throwable]), var_3_112:Exception))
        }
    }
    
    public \u6435\ub8be\u718f\u6b0d\u67e9.\u156b\uc2bd\u4179\u600f\u9255 \u4c2b\uc9f6\u0800\u92ff\u88c5\ub1b9() {
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
            return:\u156b\uc2bd\u4179\u600f\u9255(invokevirtual:\ud171\u4daf\u6bb9\u8d98\u8bb0[expected:\u156b\uc2bd\u4179\u600f\u9255](\ud171\u4daf\u6bb9\u8d98\u8bb0::\u4c2b\uc9f6\u0800\u92ff\u88c5\ub1b9, this:\ud171\u4daf\u6bb9\u8d98\u8bb0))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_BF : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_9E_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_DB_0 : byte[] [generated]
        stack_114_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_1EB_0 : byte[] [generated]
        stack_22F_0 : byte[] [generated]
        stack_2A7_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_17E : byte[]
        var_4_17F : int
        expr_A0 : int [generated]
        var_5_1CE : int
        var_3_1D3 : byte[]
        var_4_1D4 : int
        var_0_225 : int
        expr_22F : byte [generated]
        stack_273_2 : byte [generated]
        stack_252_0 : byte [generated]
        expr_DB : int [generated]
        expr_116 : int [generated]
        var_3_296 : byte[]
        var_4_297 : int
        expr_2A7 : byte [generated]
        var_3_142 : String
        stack_175_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
            var_0_BF = and:int(ldc:int(2012314409), ldc:int(-738887687))
            expr_65 = var_2_69 = stack_9E_0 = stack_A0_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_136_0 = stack_1EB_0 = stack_22F_0 = stack_2A7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("A2vlaNyg3A=="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_17E = newarray:byte[](byte.class, expr_6D:int)
                var_4_17F = expr_6D:int
                
                loop {
                    var_0_BF = and:int(var_0_BF:int, ldc:int(1508996054))
                    var_4_17F = add:int(var_4_17F:int, ldc:int(-1))
                    storeelement:byte(var_3_17E:byte[], var_4_17F:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_17F:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_17F:int, xor:int(ldc:int(4372), ldc:int(4373)))), ldc:int(2)), xor:int(ldc:int(24), ldc:int(39)))))
                    
                    if (cmpne:boolean(var_4_17F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A0_0 = stack_9E_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_136_0 = stack_1EB_0 = stack_22F_0 = stack_2A7_0 = var_3_17E:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_BF:int, ldc:int(65536)), ldc:int(0))) {
                    var_0_BF = and:int(var_0_BF:int, ldc:int(-979862116))
                    goto(Label_0283)
                }
                
                if (cmpeq:boolean(and:int(var_0_BF:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0224)
                }
                
                if (cmpeq:boolean(and:int(var_0_BF:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_BF = and:int(var_0_BF:int, ldc:int(-1232057815))
                    goto(Label_0165)
                }
                
                var_0_BF = and:int(var_0_BF:int, ldc:int(-742428723))
                expr_A0 = arraylength:int(stack_A0_0:byte[])
                
                if (cmpeq:boolean(expr_A0:int, ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_5_1CE = expr_A0:int
                var_3_1D3 = newarray:byte[](byte.class, expr_A0:int)
                var_4_1D4 = expr_A0:int
                Label_0470:
                
                while (cmpne:boolean(and:int(var_0_BF:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_BF = and:int(var_0_BF:int, ldc:int(-71998563))
                    var_4_1D4 = add:int(var_4_1D4:int, ldc:int(-1))
                    storeelement:byte(var_3_1D3:byte[], var_4_1D4:int, add:byte(loadelement:byte(stack_1EB_0:byte[], var_4_1D4:int), ldc:byte(22)))
                    
                    if (cmpne:boolean(var_4_1D4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_136_0 = stack_1EB_0 = stack_22F_0 = stack_2A7_0 = var_3_1D3:byte[]
                    goto(Label_0165)
                }
                
                Label_0538:
                
                while (cmpeq:boolean(and:int(var_0_BF:int, ldc:int(524288)), ldc:int(0))) {
                    var_0_225 = and:int(var_0_BF:int, ldc:int(-33820721))
                    var_4_1D4 = add:int(var_4_1D4:int, ldc:int(-1))
                    expr_22F = stack_273_2 = loadelement(stack_22F_0, var_4_1D4)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1D4:int, ldc:int(3)), neg:int(var_5_1CE:int)), ldc:int(0))) {
                        stack_273_2 = stack_252_0 = add:byte(expr_22F:byte, loadelement:byte(var_3_1D3:byte[], add:int(var_4_1D4:int, ldc:int(3))))
                        goto(Label_0610)
                    }
                    
                    Label_0572:
                    
                    if (cmpne:boolean(and:int(var_0_225:int, ldc:int(524288)), ldc:int(0))) {
                        var_0_225 = and:int(var_0_225:int, ldc:int(-429735129))
                    }
                    else {
                        var_0_225 = and:int(var_0_225:int, ldc:int(1908012839))
                        stack_273_2 = stack_252_0 = add:byte(expr_22F:byte, ldc:byte(3))
                    }
                    
                    Label_0610:
                    
                    if (cmpeq:boolean(and:int(var_0_225:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    var_0_BF = and:int(var_0_225:int, ldc:int(-139232414))
                    storeelement:byte(var_3_1D3:byte[], var_4_1D4:int, stack_273_2:byte)
                    
                    if (cmpne:boolean(var_4_1D4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_136_0 = stack_1EB_0 = stack_22F_0 = stack_2A7_0 = var_3_1D3:byte[]
                    goto(Label_0224)
                }
                
                goto(Label_0470)
                Label_0165:
                
                if (cmpne:boolean(and:int(var_0_BF:int, ldc:int(32768)), ldc:int(0))) {
                    var_0_BF = and:int(var_0_BF:int, ldc:int(-304573708))
                    goto(Label_0283)
                }
                
                if (cmpeq:boolean(and:int(var_0_BF:int, ldc:int(512)), ldc:int(0))) {
                    var_0_BF = and:int(var_0_BF:int, ldc:int(-1555852554))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_BF:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_0_BF = and:int(var_0_BF:int, ldc:int(-1966968797))
                        loopcontinue()
                    }
                    
                    var_0_BF = and:int(var_0_BF:int, ldc:int(-575176844))
                    expr_DB = arraylength:int(stack_DB_0:byte[])
                    
                    if (cmpne:boolean(expr_DB:int, ldc:int(0))) {
                        var_5_1CE = expr_DB:int
                        var_3_1D3 = newarray:byte[](byte.class, expr_DB:int)
                        var_4_1D4 = expr_DB:int
                        goto(Label_0538)
                    }
                }
                
                Label_0224:
                
                if (cmpeq:boolean(and:int(var_0_BF:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_BF = and:int(var_0_BF:int, ldc:int(-1954500929))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_BF:int, ldc:int(524288)), ldc:int(0))) {
                        var_0_BF = and:int(var_0_BF:int, ldc:int(1505674863))
                        goto(Label_0165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_BF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_0_BF = and:int(var_0_BF:int, ldc:int(-1403470246))
                        loopcontinue()
                    }
                    
                    var_0_BF = and:int(var_0_BF:int, ldc:int(-638322736))
                    expr_116 = arraylength:int(stack_116_0:byte[])
                    
                    if (cmpne:boolean(expr_116:int, ldc:int(0))) {
                        var_3_296 = newarray:byte[](byte.class, expr_116:int)
                        var_4_297 = expr_116:int
                        
                        loop {
                            var_0_BF = and:int(var_0_BF:int, ldc:int(2109208379))
                            var_4_297 = add:int(var_4_297:int, ldc:int(-1))
                            expr_2A7 = loadelement:byte(stack_2A7_0:byte[], var_4_297:int)
                            storeelement:byte(var_3_296:byte[], var_4_297:int, xor:int(or:int(and:int(shl:int(expr_2A7:byte, and:int(ldc:int(557), ldc:int(84))), ldc:int(-16)), and:int(shr:int(expr_2A7:byte[expected:int], xor:int(ldc:int(12310), ldc:int(12306))), ldc:int(15))), ldc:int(64)))
                            
                            if (cmpne:boolean(var_4_297:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_D9_0 = stack_DB_0 = stack_114_0 = stack_116_0 = stack_136_0 = stack_1EB_0 = stack_22F_0 = stack_2A7_0 = var_3_296:byte[]
                    }
                }
                
                Label_0283:
                
                if (cmpne:boolean(and:int(var_0_BF:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0224)
                }
                
                if (cmpeq:boolean(and:int(var_0_BF:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                if (cmpne:boolean(and:int(var_0_BF:int, ldc:int(256)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_175_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(5379), ldc:int(9)))
            expr_154 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8276), ldc:int(8277)))
            storeelement:String(expr_154:String[], and:int(ldc:int(-12719), ldc:int(12718)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(-4189), ldc:int(4188)), xor:int(ldc:int(6336), ldc:int(6342))))
            putstatic:String[](\ud171\u4daf\u6bb9\u8d98\u8bb0::\u9af2\ub171\u71f1\u0800\u51b2\u92ff, expr_154:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8350\ub32d\ud171\u4975\u4cd9\u6cfe(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_614 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_61F : int
        
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
        var_3_614 = and:int(ldc:int(-1384693649), ldc:int(-1209726245))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud171\u4daf\u6bb9\u8d98\u8bb0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
            var_3_614 = and:int(var_3_614:int, ldc:int(1297022558))
        }
        else {
            var_3_614 = and:int(var_3_614:int, ldc:int(-1208504743))
            var_5_85 = and:int(ldc:int(10545), ldc:int(-11580))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-14681), ldc:int(12632)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_614:int, ldc:int(-1761778453))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(2049), ldc:int(13603)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(29184), ldc:int(29185)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_614 = and:int(var_3_D2:int, ldc:int(-1862289725))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(15377), ldc:int(77)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(953248760))
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-579037014))
                        goto(Label_1034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1058000282))
                        goto(Label_0874)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(252275925))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1155597296))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-588443313))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(64)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-682173169))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1034)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-10102616))
                        goto(Label_0874)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1862955401))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1903863550))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-194517275))
                            var_11_E3 = and:int(ldc:int(5484), ldc:int(-30573))
                            goto(Label_1414)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1761629147))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0874)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-817843492))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(544638489))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-650799282))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-683159435))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0770)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1973588986))
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1034)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0874)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1141286126))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(716323569))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-45152013))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0770:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1926881581))
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1034)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1734093175))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(64)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-878562588))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-381172283))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(17680), ldc:int(17681))
                                goto(Label_1034)
                            }
                        }
                    }
                    
                    Label_0874:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1399095448))
                        goto(Label_1277)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(82112462))
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-696657008))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-221207742))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-2018285644))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-639107715))
                        var_11_E3 = and:int(ldc:int(-26270), ldc:int(9881))
                    }
                    
                    Label_1034:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1253871412))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(672156725))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(1)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-1353006178))
                            goto(Label_0874)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-325293025))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-413727657))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1277)
                            }
                        }
                    }
                    
                    Label_1150:
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(875748303))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1034)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0874)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0770)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-23574750))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(-2006840967))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_614 = and:int(var_3_614:int, ldc:int(719472137))
                            loopcontinue()
                        }
                        
                        var_3_614 = and:int(var_3_614:int, ldc:int(-968525963))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1414)
                    }
                    
                    Label_1277:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(451205592))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(580211331))
                        goto(Label_1034)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0874)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1099856882))
                        goto(Label_0770)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(1884818152))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-229925191))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_614 = and:int(var_3_614:int, ldc:int(-1228466983))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1414:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_61F = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1425:
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1323883656))
                        goto(Label_1277)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1253146254))
                        goto(Label_1034)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(512)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-383366981))
                        goto(Label_0874)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(441107935))
                        goto(Label_0770)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-608605760))
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_614:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(16)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(835503945))
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_614:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_614 = and:int(var_3_614:int, ldc:int(-1891165341))
                        var_17_61F = add:int(var_16_111:int, xor:int(ldc:int(13344), ldc:int(13345)))
                        looporswitchbreak()
                    }
                    
                    var_3_614 = and:int(var_3_614:int, ldc:int(2106998751))
                }
                
                var_3_614 = and:int(var_3_614:int, ldc:int(-1277168909))
                
                if (cmple:boolean(var_5_85 = var_17_61F:int, sub:int(var_6_8C:int, xor:int(ldc:int(16908), ldc:int(16909))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_614:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
