public final class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u4179\u34df\ufe34\ud4fe\uc7fe\uc3e3 {
    public void \u4179\u34df\ufe34\ud4fe\uc7fe\uc3e3(java.lang.String p0) {
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
            invokespecial:Thread(Thread::<init>, this:\u4179\u34df\ufe34\ud4fe\uc7fe\uc3e3, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run() {
        var_1_5F : int
        
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
        var_1_5F = and:int(ldc:int(782422278), ldc:int(-284969738))
        
        try {
            loop {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(536870912)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1001171555))
                }
                else {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(-1080006837))
                    invokestatic:void(Thread::sleep, ldc:long(2147483647L))
                }
                
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(524288)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1040986678))
                }
            }
        }
        catch (java.lang.InterruptedException var_3_8D) {
            invokeinterface:void(Logger::warn, invokestatic:Logger(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u64ab\ub18d\u6d99\ua068\u72f1\ua068), loadelement:String(getstatic:String[](\u4179\u34df\ufe34\ud4fe\uc7fe\uc3e3::\u7043\ua3b4\u120d\u1187\u8389\u64ab), and:int(ldc:int(5924), ldc:int(-7981))))
        }
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_E1_0 : byte[] [generated]
        stack_E3_0 : byte[] [generated]
        stack_11C_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_14E_0 : byte[] [generated]
        stack_1B1_0 : byte[] [generated]
        stack_1EB_0 : byte[] [generated]
        stack_247_0 : byte[] [generated]
        stack_2BF_0 : byte[] [generated]
        var_4_194 : int
        var_3_199 : byte[]
        var_5_19A : int
        var_0_25F : int
        expr_247 : byte [generated]
        stack_28B_2 : byte [generated]
        stack_262_0 : byte [generated]
        var_0_99 : int
        var_2_A4 : byte[]
        expr_A8 : int [generated]
        var_3_1DA : byte[]
        var_5_1DB : int
        expr_E3 : int [generated]
        expr_11E : int [generated]
        var_3_2AE : byte[]
        var_5_2AF : int
        expr_2BF : byte [generated]
        var_3_15A : String
        stack_18D_0 : String[] [generated]
        expr_16C : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(-1359418829), ldc:int(-1528991803))
        expr_6B = arraylength:int(stack_A4_0 = stack_A6_0 = stack_E1_0 = stack_E3_0 = stack_11C_0 = stack_11E_0 = stack_14E_0 = stack_1B1_0 = stack_1EB_0 = stack_247_0 = stack_2BF_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("DjERxtuXaSFug7Sx/rnxOUtsiQEpxtE5eTEp2WixtLHpNsukufF20UaSPImWgRkRy0SpCUuXaVbRCeb5UQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_194 = expr_6B:int
        var_3_199 = newarray:byte[](byte.class, expr_6B:int)
        var_5_19A = expr_6B:int
        Label_0412:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(262144)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-520563915))
            var_5_19A = add:int(var_5_19A:int, ldc:int(-1))
            storeelement:byte(var_3_199:byte[], var_5_19A:int, xor:byte(loadelement:byte(stack_1B1_0:byte[], var_5_19A:int), ldc:byte(81)))
            
            if (cmpne:boolean(var_5_19A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_E1_0 = stack_E3_0 = stack_11C_0 = stack_11E_0 = stack_14E_0 = stack_1B1_0 = stack_1EB_0 = stack_247_0 = stack_2BF_0 = var_3_199:byte[]
            goto(Label_0112)
        }
        
        Label_0562:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_25F = and:int(var_0_5F:int, ldc:int(-4405565))
            var_5_19A = add:int(var_5_19A:int, ldc:int(-1))
            expr_247 = stack_28B_2 = loadelement(stack_247_0, var_5_19A)
            
            if (cmplt:boolean(add:int(add:int(var_5_19A:int, ldc:int(1)), neg:int(var_4_194:int)), ldc:int(0))) {
                stack_28B_2 = stack_262_0 = add:byte(expr_247:byte, loadelement:byte(var_3_199:byte[], add:int(var_5_19A:int, ldc:int(1))))
                goto(Label_0626)
            }
            
            Label_0596:
            
            if (cmpne:boolean(and:int(var_0_25F:int, ldc:int(512)), ldc:int(0))) {
                var_0_25F = and:int(var_0_25F:int, ldc:int(-153564583))
                stack_28B_2 = stack_262_0 = add:byte(expr_247:byte, ldc:byte(1))
            }
            
            Label_0626:
            
            if (cmpne:boolean(and:int(var_0_25F:int, ldc:int(128)), ldc:int(0))) {
                var_0_25F = and:int(var_0_25F:int, ldc:int(162256609))
                goto(Label_0596)
            }
            
            var_0_5F = and:int(var_0_25F:int, ldc:int(-1579556263))
            storeelement:byte(var_3_199:byte[], var_5_19A:int, stack_28B_2:byte)
            
            if (cmpne:boolean(var_5_19A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_E1_0 = stack_E3_0 = stack_11C_0 = stack_11E_0 = stack_14E_0 = stack_1B1_0 = stack_1EB_0 = stack_247_0 = stack_2BF_0 = var_3_199:byte[]
            goto(Label_0232)
        }
        
        goto(Label_0412)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(128)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-465510080))
            goto(Label_0291)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(524288)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-616451546))
            goto(Label_0232)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(4096)), ldc:int(0))) {
            var_0_99 = and:int(var_0_5F:int, ldc:int(-1022528367))
        }
        else {
            var_0_99 = and:int(var_0_5F:int, ldc:int(-1545940305))
            var_2_A4 = stack_A4_0:byte[]
            expr_A8 = add:int(arraylength:int(stack_A6_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A8:int, ldc:int(0))) {
                var_3_1DA = newarray:byte[](byte.class, expr_A8:int)
                var_5_1DB = expr_A8:int
                
                loop {
                    var_0_99 = and:int(var_0_99:int, ldc:int(-1311191289))
                    var_5_1DB = add:int(var_5_1DB:int, ldc:int(-1))
                    storeelement:byte(var_3_1DA:byte[], var_5_1DB:int, add:int(shl:int(loadelement:byte(stack_1EB_0:byte[], var_5_1DB:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_A4:byte[], add:int(var_5_1DB:int, and:int(ldc:int(3221), ldc:int(16393)))), ldc:int(7)), xor:int(ldc:int(2146), ldc:int(2147)))))
                    
                    if (cmpne:boolean(var_5_1DB:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_E1_0 = stack_E3_0 = stack_11C_0 = stack_11E_0 = stack_14E_0 = stack_1B1_0 = stack_1EB_0 = stack_247_0 = stack_2BF_0 = var_3_1DA:byte[]
            }
        }
        
        Label_0173:
        
        if (cmpeq:boolean(and:int(var_0_99:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_5F = and:int(var_0_99:int, ldc:int(-476805556))
            goto(Label_0291)
        }
        
        if (cmpeq:boolean(and:int(var_0_99:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_5F = and:int(var_0_99:int, ldc:int(1529535034))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_99:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_5F = and:int(var_0_99:int, ldc:int(-1869271693))
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_99:int, ldc:int(-1432660299))
            expr_E3 = arraylength:int(stack_E3_0:byte[])
            
            if (cmpne:boolean(expr_E3:int, ldc:int(0))) {
                var_4_194 = expr_E3:int
                var_3_199 = newarray:byte[](byte.class, expr_E3:int)
                var_5_19A = expr_E3:int
                goto(Label_0562)
            }
        }
        
        Label_0232:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1611188308))
        }
        else {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_99 = and:int(var_0_5F:int, ldc:int(-2092072804))
                goto(Label_0173)
            }
            
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-52593871))
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-476263593))
            expr_11E = arraylength:int(stack_11E_0:byte[])
            
            if (cmpne:boolean(expr_11E:int, ldc:int(0))) {
                var_3_2AE = newarray:byte[](byte.class, expr_11E:int)
                var_5_2AF = expr_11E:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1428266371))
                    var_5_2AF = add:int(var_5_2AF:int, ldc:int(-1))
                    expr_2BF = loadelement:byte(stack_2BF_0:byte[], var_5_2AF:int)
                    storeelement:byte(var_3_2AE:byte[], var_5_2AF:int, add:int(or:int(and:int(shl:int(expr_2BF:byte, and:int(ldc:int(16430), ldc:int(12292))), ldc:int(-16)), and:int(shr:int(expr_2BF:byte[expected:int], and:int(ldc:int(8277), ldc:int(550))), ldc:int(15))), ldc:int(89)))
                    
                    if (cmpne:boolean(var_5_2AF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_E1_0 = stack_E3_0 = stack_11C_0 = stack_11E_0 = stack_14E_0 = stack_1B1_0 = stack_1EB_0 = stack_247_0 = stack_2BF_0 = var_3_2AE:byte[]
            }
        }
        
        Label_0291:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0232)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(256)), ldc:int(0))) {
            var_0_99 = and:int(var_0_5F:int, ldc:int(1953616828))
            goto(Label_0173)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-494933008))
            goto(Label_0112)
        }
        
        var_3_15A = initobject:String(String::<init>, stack_14E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_18D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(12353), ldc:int(3605)))
        expr_16C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4166), ldc:int(4167)))
        storeelement:String(expr_16C:String[], and:int(ldc:int(-8539), ldc:int(346)), invokevirtual:String[expected:String](String::substring, var_3_15A:String, and:int(ldc:int(-28180), ldc:int(11792)), xor:int(ldc:int(2511), ldc:int(2547))))
        putstatic:String[](\u4179\u34df\ufe34\ud4fe\uc7fe\uc3e3::\u7043\ua3b4\u120d\u1187\u8389\u64ab, expr_16C:String[])
    }
    
    public void \u5654\u960f\u5245\uc87f\u8df4\u983f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_630 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_63B : int
        
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
        var_3_630 = and:int(ldc:int(-1481219378), ldc:int(1627270111))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4179\u34df\ufe34\ud4fe\uc7fe\uc3e3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(2048)), ldc:int(0))) {
            var_3_630 = and:int(var_3_630:int, ldc:int(-147524770))
        }
        else {
            var_3_630 = and:int(var_3_630:int, ldc:int(637527726))
            var_5_85 = and:int(ldc:int(-22248), ldc:int(18151))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20860), ldc:int(20787)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_630:int, ldc:int(704622583))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:boolean(0), ldc:boolean(1)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(13), ldc:int(17763)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_630 = and:int(var_3_D2:int, ldc:int(-803946))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(4245), ldc:int(11779)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1670607447))
                        goto(Label_1453)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1855247500))
                        goto(Label_1187)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(512)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1044833585))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1955566103))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1054428468))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-590204338))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-974540640))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1754012890))
                    }
                    else {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1021715151))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1453)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1187)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1806791330))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(77161811))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-521244729))
                            var_11_E3 = and:int(ldc:int(13418), ldc:int(-29935))
                            goto(Label_1442)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1453)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1187)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1277409540))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1214118306))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1937791335))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(1597245046))
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(564916199))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0802)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(512)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1794432895))
                        goto(Label_1187)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-163968298))
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1862588881))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(512)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(190413388))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(4)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(157984278))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-282685213))
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(-336628057))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0802:
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-584845159))
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(816370424))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1365806644))
                        goto(Label_1187)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-2120160718))
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-524861015))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-261953389))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1447347322))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(4608), ldc:int(4609))
                                goto(Label_1083)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-353532818))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1025177652))
                        goto(Label_1187)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(1237860891))
                            goto(Label_0802)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(802933236))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-1218028416))
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1561923690))
                        var_11_E3 = and:int(ldc:int(-6099), ldc:int(5842))
                    }
                    
                    Label_1083:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1453)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(841637227))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(4)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-576197224))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(1475957439))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(-223461673))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1332)
                            }
                        }
                    }
                    
                    Label_1187:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1383136163))
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1455201970))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1083)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_630:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(231877815))
                            goto(Label_0802)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(128)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(246237121))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-1130155949))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_630 = and:int(var_3_630:int, ldc:int(-324951608))
                            loopcontinue()
                        }
                        
                        var_3_630 = and:int(var_3_630:int, ldc:int(803945207))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1442)
                    }
                    
                    Label_1332:
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1453)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1187)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(1434859126))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-106292074))
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_630 = and:int(var_3_630:int, ldc:int(-1548042297))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1442:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63B = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1453:
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-419397860))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1187)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1083)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(524346317))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(895676699))
                        goto(Label_0802)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(512)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1111634976))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(339283073))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1996527728))
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_630:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_630 = and:int(var_3_630:int, ldc:int(-1482509386))
                        var_17_63B = add:int(var_16_111:int, and:int(ldc:int(10245), ldc:int(17083)))
                        looporswitchbreak()
                    }
                    
                    var_3_630 = and:int(var_3_630:int, ldc:int(103778351))
                }
                
                var_3_630 = and:int(var_3_630:int, ldc:int(-104864122))
                
                if (cmple:boolean(var_5_85 = var_17_63B:int, sub:int(var_6_8C:int, xor:int(ldc:int(768), ldc:int(769))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_630:int, ldc:int(256)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
