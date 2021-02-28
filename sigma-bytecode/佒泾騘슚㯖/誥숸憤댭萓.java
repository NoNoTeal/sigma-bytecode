public class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u8aa5\uc238\u61a4\ub32d\u8413 {
    public void \u8aa5\uc238\u61a4\ub32d\u8413() {
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
            invokespecial:Object(Object::<init>, this:\u8aa5\uc238\u61a4\ub32d\u8413)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\u6198\ub113\u8709\uf9c5\u0a06 \u3504\u873d\ub70c\ube23\u7049\ubff1(com.google.gson.JsonObject p0) {
        var_4_72 : IFormattableTextComponent
        
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
        var_4_72 = invokestatic:IFormattableTextComponent(ITextComponent$Serializer::func_240641_a_, invokevirtual:JsonElement(JsonObject::get, p0:JsonObject, loadelement:String(getstatic:String[](\u8aa5\uc238\u61a4\ub32d\u8413::\ud4fe\u4bc8\u64f2\uae87\u6cfe\ud7e8), and:int(ldc:int(155), ldc:int(-4288)))))
        
        if (cmpne:boolean(var_4_72:IFormattableTextComponent, aconstnull:IFormattableTextComponent())) {
            return:\u6198\ub113\u8709\uf9c5\u0a06(initobject:\u6198\ub113\u8709\uf9c5\u0a06(\u6198\ub113\u8709\uf9c5\u0a06::<init>, var_4_72:IFormattableTextComponent[expected:ITextComponent], invokestatic:int(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u4e72\u4f4a\u6c52\u446c\u97b7\uae5d, p0:JsonObject, loadelement:String(getstatic:String[](\u8aa5\uc238\u61a4\ub32d\u8413::\ud4fe\u4bc8\u64f2\uae87\u6cfe\ud7e8), xor:int(ldc:int(-32763), ldc:int(-32761))))))
        }
        
        athrow(initobject:JsonParseException(JsonParseException::<init>, loadelement:String(getstatic:String[](\u8aa5\uc238\u61a4\ub32d\u8413::\ud4fe\u4bc8\u64f2\uae87\u6cfe\ud7e8), and:int(ldc:int(2573), ldc:int(16545)))))
    }
    
    public java.lang.String \u8709\u88c5\ubb2b\u67e9\u6435\ub6ab() {
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
            return:String(loadelement:String(getstatic:String[](\u8aa5\uc238\u61a4\ub32d\u8413::\ud4fe\u4bc8\u64f2\uae87\u6cfe\ud7e8), xor:int(ldc:int(23553), ldc:int(23554))))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u3504\u873d\ub70c\ube23\u7049\ubff1(com.google.gson.JsonObject p0) {
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
            return:Object(invokevirtual:\u6198\ub113\u8709\uf9c5\u0a06[expected:Object](\u8aa5\uc238\u61a4\ub32d\u8413::\u3504\u873d\ub70c\ube23\u7049\ubff1, this:\u8aa5\uc238\u61a4\ub32d\u8413, p0:JsonObject))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_180 : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_192_0 : byte[] [generated]
        stack_211_0 : byte[] [generated]
        stack_267_0 : byte[] [generated]
        var_4_16D : int
        var_3_172 : byte[]
        var_5_173 : int
        var_0_1AA : int
        expr_192 : byte [generated]
        stack_1D6_2 : byte [generated]
        stack_1AD_0 : byte [generated]
        expr_211 : byte [generated]
        expr_8F : int [generated]
        var_2_B9 : byte[]
        expr_BD : int [generated]
        var_3_256 : byte[]
        var_5_257 : int
        var_3_E2 : String
        stack_166_0 : String[] [generated]
        expr_F4 : String[] [generated]
        
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
        var_0_180 = and:int(ldc:int(716364244), ldc:int(1006620990))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_B9_0 = stack_BB_0 = stack_D6_0 = stack_192_0 = stack_211_0 = stack_267_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Jvj2Ac35/EscBvDlvPkOVgkN7w73AvDtsvgPXQoN7w73AvDtAvkC+xEB9vjx/v0cDf0Coqaa/Q==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_16D = expr_6B:int
        var_3_172 = newarray:byte[](byte.class, expr_6B:int)
        var_5_173 = expr_6B:int
        Label_0373:
        
        while (cmpeq:boolean(and:int(var_0_180:int, ldc:int(512)), ldc:int(0))) {
            var_0_1AA = and:int(var_0_180:int, ldc:int(1673319829))
            var_5_173 = add:int(var_5_173:int, ldc:int(-1))
            expr_192 = stack_1D6_2 = loadelement(stack_192_0, var_5_173)
            
            if (cmplt:boolean(add:int(add:int(var_5_173:int, ldc:int(3)), neg:int(var_4_16D:int)), ldc:int(0))) {
                stack_1D6_2 = stack_1AD_0 = add:byte(expr_192:byte, loadelement:byte(var_3_172:byte[], add:int(var_5_173:int, ldc:int(3))))
                goto(Label_0445)
            }
            
            Label_0415:
            
            if (cmpne:boolean(and:int(var_0_1AA:int, ldc:int(4)), ldc:int(0))) {
                var_0_1AA = and:int(var_0_1AA:int, ldc:int(1677253919))
                stack_1D6_2 = stack_1AD_0 = add:byte(expr_192:byte, ldc:byte(3))
            }
            
            Label_0445:
            
            if (cmpeq:boolean(and:int(var_0_1AA:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_1AA = and:int(var_0_1AA:int, ldc:int(-572900423))
                goto(Label_0415)
            }
            
            var_0_180 = and:int(var_0_1AA:int, ldc:int(2117788484))
            storeelement:byte(var_3_172:byte[], var_5_173:int, stack_1D6_2:byte)
            
            if (cmpne:boolean(var_5_173:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B9_0 = stack_BB_0 = stack_D6_0 = stack_192_0 = stack_211_0 = stack_267_0 = var_3_172:byte[]
            goto(Label_0112)
        }
        
        var_0_180 = and:int(var_0_180:int, ldc:int(-2050329324))
        Label_0508:
        
        while (cmpeq:boolean(and:int(var_0_180:int, ldc:int(8192)), ldc:int(0))) {
            var_0_180 = and:int(var_0_180:int, ldc:int(1857281534))
            var_5_173 = add:int(var_5_173:int, ldc:int(-1))
            expr_211 = loadelement:byte(stack_211_0:byte[], var_5_173:int)
            storeelement:byte(var_3_172:byte[], var_5_173:int, add:int(xor:int(or:int(and:int(shl:int(expr_211:byte, and:int(ldc:int(1237), ldc:int(18470))), ldc:int(-16)), and:int(shr:int(expr_211:byte[expected:int], and:int(ldc:int(4382), ldc:int(1028))), ldc:int(15))), ldc:int(39)), ldc:int(25)))
            
            if (cmpne:boolean(var_5_173:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B9_0 = stack_BB_0 = stack_D6_0 = stack_192_0 = stack_211_0 = stack_267_0 = var_3_172:byte[]
            goto(Label_0148)
        }
        
        goto(Label_0373)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_180:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_180 = and:int(var_0_180:int, ldc:int(-38956111))
            goto(Label_0194)
        }
        
        if (cmpeq:boolean(and:int(var_0_180:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_180 = and:int(var_0_180:int, ldc:int(-1426066020))
            expr_8F = arraylength:int(stack_8F_0:byte[])
            
            if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                var_4_16D = expr_8F:int
                var_3_172 = newarray:byte[](byte.class, expr_8F:int)
                var_5_173 = expr_8F:int
                goto(Label_0508)
            }
        }
        
        Label_0148:
        
        if (cmpne:boolean(and:int(var_0_180:int, ldc:int(2)), ldc:int(0))) {
            var_0_180 = and:int(var_0_180:int, ldc:int(506742402))
        }
        else {
            if (cmpne:boolean(and:int(var_0_180:int, ldc:int(512)), ldc:int(0))) {
                var_0_180 = and:int(var_0_180:int, ldc:int(1231465362))
                goto(Label_0112)
            }
            
            var_0_180 = and:int(var_0_180:int, ldc:int(729016823))
            var_2_B9 = stack_B9_0:byte[]
            expr_BD = add:int(arraylength:int(stack_BB_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_BD:int, ldc:int(0))) {
                var_3_256 = newarray:byte[](byte.class, expr_BD:int)
                var_5_257 = expr_BD:int
                
                loop {
                    var_0_180 = and:int(var_0_180:int, ldc:int(-491334284))
                    var_5_257 = add:int(var_5_257:int, ldc:int(-1))
                    storeelement:byte(var_3_256:byte[], var_5_257:int, add:int(shl:int(loadelement:byte(stack_267_0:byte[], var_5_257:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_B9:byte[], add:int(var_5_257:int, and:int(ldc:int(1025), ldc:int(24593)))), ldc:int(4)), xor:int(ldc:int(4173), ldc:int(4162)))))
                    
                    if (cmpne:boolean(var_5_257:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B9_0 = stack_BB_0 = stack_D6_0 = stack_192_0 = stack_211_0 = stack_267_0 = var_3_256:byte[]
            }
        }
        
        Label_0194:
        
        if (cmpne:boolean(and:int(var_0_180:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0148)
        }
        
        if (cmpeq:boolean(and:int(var_0_180:int, ldc:int(65536)), ldc:int(0))) {
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_166_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(28689), ldc:int(28693)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(132), ldc:int(20750)))
            storeelement:String(expr_F4:String[], and:int(ldc:int(2049), ldc:int(1603)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(28931), ldc:int(-30984)), and:int(ldc:int(26781), ldc:int(1118))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(16747), ldc:int(-29164)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(92), ldc:int(11038)), and:int(ldc:int(1079), ldc:int(2735))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(8271), ldc:int(21891)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(8751), ldc:int(19639)), xor:int(ldc:int(-28411), ldc:int(-28370))))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(12289), ldc:int(12291)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(5163), ldc:int(11071)), and:int(ldc:int(16447), ldc:int(9334))))
            putstatic:String[](\u8aa5\uc238\u61a4\ub32d\u8413::\ud4fe\u4bc8\u64f2\uae87\u6cfe\ud7e8, expr_F4:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ud36e\uc229\u88c5\u3776\u494c\u8350(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_602 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_60D : int
        
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
        var_3_602 = and:int(ldc:int(-476923082), ldc:int(-339986277))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8aa5\uc238\u61a4\ub32d\u8413[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(8192)), ldc:int(0))) {
            var_3_602 = and:int(var_3_602:int, ldc:int(-336774277))
            var_5_7D = and:int(ldc:int(-8067), ldc:int(8066))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(31316), ldc:int(-32629)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_602:int, ldc:int(-1280214725))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(15237), ldc:int(1027)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(17418), ldc:int(17419)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_602 = and:int(var_3_D2:int, ldc:int(-1347158950))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(24833), ldc:int(1047)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1864518036))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(912964909))
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(841258614))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1666939115))
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-690331541))
                    }
                    else {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-4538442))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-497789198))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-557818471))
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1868541528))
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(2111699124))
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(2072020151))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1695064951))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1177716230))
                            var_11_E3 = and:int(ldc:int(23700), ldc:int(-23797))
                            goto(Label_1432)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0565:
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-711281023))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1096490656))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1560634506))
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-172869313))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(367929808))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1890868151))
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(319912742))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(128)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1836018662))
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-471479583))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-497435995))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(53519107))
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1244349186))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-11120685))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(387510954))
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(746148590))
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(128)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1484864430))
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1208038199))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-755428141))
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-472203753))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(-28652), ldc:int(-28651))
                                goto(Label_1097)
                            }
                        }
                    }
                    
                    Label_0937:
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1918722937))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(64098814))
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1951239909))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1878675999))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1244339413))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-7915242))
                        var_11_E3 = and:int(ldc:int(-2760), ldc:int(583))
                    }
                    
                    Label_1097:
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1409768503))
                        goto(Label_1322)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1574824420))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-813995320))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1047395262))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(1653986686))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_602 = and:int(var_3_602:int, ldc:int(-176014986))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1322)
                            }
                        }
                    }
                    
                    Label_1222:
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1502478762))
                            goto(Label_1097)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0937)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(2)), ldc:int(0))) {
                            var_3_602 = and:int(var_3_602:int, ldc:int(-1110852994))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1432)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1322:
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(1635610814))
                        goto(Label_1097)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(2091512100))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_602 = and:int(var_3_602:int, ldc:int(-1109967426))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1432:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_60D = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1443:
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1322)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(866257600))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1097)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0937)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-612060211))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1982112284))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_602:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_602:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_602 = and:int(var_3_602:int, ldc:int(-1281918669))
                        var_17_60D = add:int(var_16_111:int, xor:int(ldc:int(-15808), ldc:int(-15807)))
                        looporswitchbreak()
                    }
                }
                
                var_3_602 = and:int(var_3_602:int, ldc:int(-370328581))
                
                if (cmple:boolean(var_5_7D = var_17_60D:int, sub:int(var_6_84:int, and:int(ldc:int(5937), ldc:int(2051))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_602:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_602 = and:int(var_3_602:int, ldc:int(335473320))
            goto(Label_0106)
        }
    }
}
