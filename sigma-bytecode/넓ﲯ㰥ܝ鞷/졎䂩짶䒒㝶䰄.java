public class \ub113\ufcaf\u3c25\u071d\u97b7.\uc84e\u40a9\uc9f6\u4492\u3776\u4c04 {
    public void \uc84e\u40a9\uc9f6\u4492\u3776\u4c04() {
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
            invokespecial:Object(Object::<init>, this:\uc84e\u40a9\uc9f6\u4492\u3776\u4c04)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \ub1b9\u8709\ucb79\uc3e3\u12b2\u0c95(int p0) {
        var_1_5F : int
        var_3_64 : int
        var_4_69 : int
        var_3_6F : int
        stack_C9_0 : String [generated]
        
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
            var_1_5F = and:int(ldc:int(-996479697), ldc:int(-845241474))
            var_3_64 = div:int(p0:int, ldc:int(20))
            var_4_69 = div:int(var_3_64:int, ldc:int(60))
            var_3_6F = rem:int(var_3_64:int, ldc:int(60))
            
            if (cmpge:boolean(var_3_6F:int, ldc:int(10))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-40787142))
                stack_C9_0 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_4_69:int), loadelement:String(getstatic:String[](\uc84e\u40a9\uc9f6\u4492\u3776\u4c04::\u6b0d\u0800\uc3e3\u7006\ubcb0\ud4fe), and:int(ldc:int(12353), ldc:int(1427)))), var_3_6F:int))
            }
            else {
                stack_C9_0 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_4_69:int), loadelement:String(getstatic:String[](\uc84e\u40a9\uc9f6\u4492\u3776\u4c04::\u6b0d\u0800\uc3e3\u7006\ubcb0\ud4fe), and:int(ldc:int(28748), ldc:int(-30797)))), var_3_6F:int))
            }
            
            return:String(stack_C9_0:String)
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u120d\u873d\u5140\u3d64\ua068\uc246(java.lang.String p0) {
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
            return:String(invokevirtual:String(Matcher::replaceAll, invokevirtual:Matcher(Pattern::matcher, getstatic:Pattern(\uc84e\u40a9\uc9f6\u4492\u3776\u4c04::\u120d\u4f52\u7049\u9255\u3504\u600f), p0:String[expected:CharSequence]), loadelement:String(getstatic:String[](\uc84e\u40a9\uc9f6\u4492\u3776\u4c04::\u6b0d\u0800\uc3e3\u7006\ubcb0\ud4fe), and:int(ldc:int(19651), ldc:int(274)))))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u56bd\u0800\ub171\uc31c\u99f7\uc9f6(java.lang.String p0) {
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
            return:boolean(invokestatic:boolean(StringUtils::isEmpty, p0:String[expected:CharSequence]))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1E1 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1F3_0 : byte[] [generated]
        stack_22D_0 : byte[] [generated]
        stack_291_0 : byte[] [generated]
        stack_309_0 : byte[] [generated]
        var_4_1CE : int
        var_3_1D3 : byte[]
        var_5_1D4 : int
        var_0_287 : int
        expr_291 : byte [generated]
        stack_2D5_2 : byte [generated]
        stack_2B4_0 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_21C : byte[]
        var_5_21D : int
        expr_C3 : int [generated]
        expr_F6 : int [generated]
        var_3_2F8 : byte[]
        var_5_2F9 : int
        expr_30C : byte [generated]
        var_3_132 : String
        expr_13A : String[] [generated]
        expr_144 : String[] [generated]
        
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
        var_0_1E1 = and:int(ldc:int(-177962928), ldc:int(-373736997))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1F3_0 = stack_22D_0 = stack_291_0 = stack_309_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("zJuO+uX2VMyRsWs6aGfQTqII8ItwP/5WVNQ=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1CE = expr_6B:int
        var_3_1D3 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1D4 = expr_6B:int
        Label_0470:
        
        while (cmpeq:boolean(and:int(var_0_1E1:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-284236297))
            var_5_1D4 = add:int(var_5_1D4:int, ldc:int(-1))
            storeelement:byte(var_3_1D3:byte[], var_5_1D4:int, add:byte(loadelement:byte(stack_1F3_0:byte[], var_5_1D4:int), ldc:byte(52)))
            
            if (cmpne:boolean(var_5_1D4:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1F3_0 = stack_22D_0 = stack_291_0 = stack_309_0 = var_3_1D3:byte[]
            goto(Label_0112)
        }
        
        var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-1123183145))
        Label_0628:
        
        while (cmpeq:boolean(and:int(var_0_1E1:int, ldc:int(65536)), ldc:int(0))) {
            var_0_287 = and:int(var_0_1E1:int, ldc:int(-504686248))
            var_5_1D4 = add:int(var_5_1D4:int, ldc:int(-1))
            expr_291 = stack_2D5_2 = loadelement(stack_291_0, var_5_1D4)
            
            if (cmplt:boolean(add:int(add:int(var_5_1D4:int, ldc:int(5)), neg:int(var_4_1CE:int)), ldc:int(0))) {
                stack_2D5_2 = stack_2B4_0 = add:byte(expr_291:byte, loadelement:byte(var_3_1D3:byte[], add:int(var_5_1D4:int, ldc:int(5))))
                goto(Label_0708)
            }
            
            Label_0670:
            
            if (cmpne:boolean(and:int(var_0_287:int, ldc:int(8)), ldc:int(0))) {
                var_0_287 = and:int(var_0_287:int, ldc:int(-607813424))
            }
            else {
                var_0_287 = and:int(var_0_287:int, ldc:int(1701879516))
                stack_2D5_2 = stack_2B4_0 = add:byte(expr_291:byte, ldc:byte(5))
            }
            
            Label_0708:
            
            if (cmpne:boolean(and:int(var_0_287:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0670)
            }
            
            var_0_1E1 = and:int(var_0_287:int, ldc:int(-383787009))
            storeelement:byte(var_3_1D3:byte[], var_5_1D4:int, stack_2D5_2:byte)
            
            if (cmpne:boolean(var_5_1D4:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1F3_0 = stack_22D_0 = stack_291_0 = stack_309_0 = var_3_1D3:byte[]
            goto(Label_0200)
        }
        
        var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-1143649797))
        goto(Label_0470)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_1E1:int, ldc:int(2)), ldc:int(0))) {
            var_0_1E1 = and:int(var_0_1E1:int, ldc:int(2038102676))
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E1:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_1E1:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-342325934))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_21C = newarray:byte[](byte.class, expr_98:int)
                var_5_21D = expr_98:int
                
                loop {
                    var_0_1E1 = and:int(var_0_1E1:int, ldc:int(1864684377))
                    var_5_21D = add:int(var_5_21D:int, ldc:int(-1))
                    storeelement:byte(var_3_21C:byte[], var_5_21D:int, add:int(shl:int(loadelement:byte(stack_22D_0:byte[], var_5_21D:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_21D:int, xor:int(ldc:int(-16248), ldc:int(-16247)))), ldc:int(2)), xor:int(ldc:int(54), ldc:int(9)))))
                    
                    if (cmpne:boolean(var_5_21D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1F3_0 = stack_22D_0 = stack_291_0 = stack_309_0 = var_3_21C:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpne:boolean(and:int(var_0_1E1:int, ldc:int(128)), ldc:int(0))) {
            var_0_1E1 = and:int(var_0_1E1:int, ldc:int(1256932335))
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_1E1:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1E1:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1E1 = and:int(var_0_1E1:int, ldc:int(2030291804))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_1CE = expr_C3:int
                var_3_1D3 = newarray:byte[](byte.class, expr_C3:int)
                var_5_1D4 = expr_C3:int
                goto(Label_0628)
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_1E1:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-1140160335))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1E1:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0157)
            }
            
            if (cmpne:boolean(and:int(var_0_1E1:int, ldc:int(2)), ldc:int(0))) {
                var_0_1E1 = and:int(var_0_1E1:int, ldc:int(1504449587))
                goto(Label_0112)
            }
            
            var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-210533929))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_2F8 = newarray:byte[](byte.class, expr_F6:int)
                var_5_2F9 = expr_F6:int
                
                loop {
                    var_0_1E1 = and:int(var_0_1E1:int, ldc:int(1636281042))
                    var_5_2F9 = add:int(var_5_2F9:int, ldc:int(-1))
                    expr_30C = xor:byte(loadelement:byte(stack_309_0:byte[], var_5_2F9:int), ldc:byte(4))
                    storeelement:byte(var_3_2F8:byte[], var_5_2F9:int, or:int(and:int(shl:int(expr_30C:byte, and:int(ldc:int(1252), ldc:int(270))), ldc:int(-16)), and:int(shr:int(expr_30C:byte[expected:int], xor:int(ldc:int(-16382), ldc:int(-16378))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_2F9:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_1F3_0 = stack_22D_0 = stack_291_0 = stack_309_0 = var_3_2F8:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpne:boolean(and:int(var_0_1E1:int, ldc:int(256)), ldc:int(0))) {
            var_0_1E1 = and:int(var_0_1E1:int, ldc:int(1130339319))
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_1E1:int, ldc:int(32)), ldc:int(0))) {
            var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-1811654063))
            goto(Label_0157)
        }
        
        if (cmpne:boolean(and:int(var_0_1E1:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_13A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1180), ldc:int(2372)))
            expr_144 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16846), ldc:int(2612)))
            storeelement:String(expr_144:String[], xor:int(ldc:int(5889), ldc:int(5891)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-13442), ldc:int(13441)), and:int(ldc:int(-5909), ldc:int(5908))))
            storeelement:String(expr_13A:String[], and:int(ldc:int(275), ldc:int(22595)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(4410), ldc:int(-5435)), xor:int(ldc:int(64), ldc:int(86))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(2050), ldc:int(2051)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(12886), ldc:int(54)), and:int(ldc:int(15391), ldc:int(16983))))
            storeelement:String(expr_144:String[], and:int(ldc:int(-16447), ldc:int(16446)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(18455), ldc:int(12855)), xor:int(ldc:int(16575), ldc:int(16550))))
            putstatic:String[](\uc84e\u40a9\uc9f6\u4492\u3776\u4c04::\u6b0d\u0800\uc3e3\u7006\ubcb0\ud4fe, expr_144:String[])
            putstatic:Pattern(\uc84e\u40a9\uc9f6\u4492\u3776\u4c04::\u120d\u4f52\u7049\u9255\u3504\u600f, invokestatic:Pattern(Pattern::compile, loadelement:String(expr_13A:String[], and:int(ldc:int(16451), ldc:int(1411)))))
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u51fa\u34df\ube23\u3d64\u9033\u3711(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_623 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_62E : int
        
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
        var_3_623 = and:int(ldc:int(1822124644), ldc:int(-1248282978))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc84e\u40a9\uc9f6\u4492\u3776\u4c04[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(524288)), ldc:int(0))) {
            var_3_623 = and:int(var_3_623:int, ldc:int(1023261305))
            var_5_7D = and:int(ldc:int(-32315), ldc:int(28200))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(370), ldc:int(-371)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_623:int, ldc:int(-37882928))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(25616), ldc:int(25617)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(212), ldc:int(213)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_623 = and:int(var_3_CA:int, ldc:int(1857843812))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(18048), ldc:int(18049)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-806938830))
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(739599892))
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(409041709))
                        goto(Label_1013)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0871)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-193448453))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(766216765))
                    }
                    else {
                        var_3_623 = and:int(var_3_623:int, ldc:int(1992238332))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0738)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(602453450))
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(256)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(1515707656))
                        goto(Label_1013)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0871)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(2092090458))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-778232664))
                        goto(Label_0636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(1050623512))
                            var_11_DB = and:int(ldc:int(-13989), ldc:int(12964))
                            goto(Label_1456)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(2143275484))
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0871)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-446136551))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_623 = and:int(var_3_623:int, ldc:int(1721393287))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0738)
                        }
                    }
                    
                    Label_0636:
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-790006020))
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(256)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-206432029))
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0871)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_623 = and:int(var_3_623:int, ldc:int(1878864297))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-1827054412))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-50281137))
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-1083455882))
                        goto(Label_1013)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(938078201))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(-1903263795))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(-2037697357))
                            loopcontinue()
                        }
                        
                        var_3_623 = and:int(var_3_623:int, ldc:int(-185687))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(16832), ldc:int(16833))
                                goto(Label_1013)
                            }
                        }
                    }
                    
                    Label_0871:
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(19007316))
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(16)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(1942497710))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(-51996953))
                            loopcontinue()
                        }
                        
                        var_3_623 = and:int(var_3_623:int, ldc:int(1723692459))
                        var_11_DB = and:int(ldc:int(-3310), ldc:int(1133))
                    }
                    
                    Label_1013:
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1467)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-166328022))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(-2072396192))
                            goto(Label_0871)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(256)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(-35489155))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0636)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(256)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(526565729))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_623 = and:int(var_3_623:int, ldc:int(-37753000))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1283)
                            }
                        }
                    }
                    
                    Label_1129:
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(152331369))
                        goto(Label_1467)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-721563574))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_1013)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(1726866918))
                            goto(Label_0871)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(-690787239))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(1876433824))
                            goto(Label_0636)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(1400827393))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_623 = and:int(var_3_623:int, ldc:int(1722706556))
                            loopcontinue()
                        }
                        
                        var_3_623 = and:int(var_3_623:int, ldc:int(1035530842))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1456)
                    }
                    
                    Label_1283:
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-1772785445))
                        goto(Label_1467)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(1054949360))
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(1197240692))
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-1246441824))
                        goto(Label_0871)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-270842112))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(16)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(163333962))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(925608314))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-1981412570))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(1720087995))
                        loopcontinue()
                    }
                    
                    var_3_623 = and:int(var_3_623:int, ldc:int(-33691610))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1456:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62E = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1467:
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0871)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-851525688))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-953634560))
                        goto(Label_0636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-1521213666))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_623:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_623:int, ldc:int(16)), ldc:int(0))) {
                        var_3_623 = and:int(var_3_623:int, ldc:int(-291888781))
                        var_17_62E = add:int(var_16_109:int, xor:int(ldc:int(-30720), ldc:int(-30719)))
                        looporswitchbreak()
                    }
                    
                    var_3_623 = and:int(var_3_623:int, ldc:int(-1781331519))
                }
                
                var_3_623 = and:int(var_3_623:int, ldc:int(-1526848571))
                
                if (cmple:boolean(var_5_7D = var_17_62E:int, sub:int(var_6_84:int, xor:int(ldc:int(-32704), ldc:int(-32703))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_623:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
