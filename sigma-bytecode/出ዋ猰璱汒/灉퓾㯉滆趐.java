public class \u51fa\u12cb\u7330\u74b1\u6c52.\u7049\ud4fe\u3bc9\u6ec6\u8d90 {
    public void \u7049\ud4fe\u3bc9\u6ec6\u8d90(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u960f\u6ec6\u3e75\u8d90\u36d3 p0) {
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
            putfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u7049\ud4fe\u3bc9\u6ec6\u8d90::\u600f\uae5d\u0b8e\u5245\uc31c\u8350, this:\u7049\ud4fe\u3bc9\u6ec6\u8d90, p0:\u960f\u6ec6\u3e75\u8d90\u36d3)
            invokespecial:Object(Object::<init>, this:\u7049\ud4fe\u3bc9\u6ec6\u8d90)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run() {
        var_1_5F : int
        stack_F0_0 : Logger [generated]
        stack_ED_0 : String [generated]
        expr_DA : Object[] [generated]
        
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
            var_1_5F = and:int(ldc:int(-1149230441), ldc:int(1049852663))
            
            if (invokestatic:boolean(\u960f\u6ec6\u3e75\u8d90\u36d3::\u56bd\u0a06\u836c\ud36e\ua068\u6bb9, getfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u7049\ud4fe\u3bc9\u6ec6\u8d90::\u600f\uae5d\u0b8e\u5245\uc31c\u8350, this:\u7049\ud4fe\u3bc9\u6ec6\u8d90))) {
                if (invokevirtual:boolean(Logger::isLoggable, invokestatic:Logger(\u960f\u6ec6\u3e75\u8d90\u36d3::\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded), getstatic:Level(Level::FINE))) {
                    stack_F0_0 = invokestatic:Logger(\u960f\u6ec6\u3e75\u8d90\u36d3::\ubf56\ucb79\u64ab\u8cae\u4c2b\ubded)
                    stack_ED_0 = loadelement:String(getstatic:String[](\u7049\ud4fe\u3bc9\u6ec6\u8d90::\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b), and:int(ldc:int(-23546), ldc:int(18928)))
                    expr_DA = newarray:Object[](java.lang.Object.class, and:int(ldc:int(4691), ldc:int(8361)))
                    storeelement:Object(expr_DA:Object[], and:int(ldc:int(20771), ldc:int(-20772)), invokestatic:String[expected:Object](\u960f\u6ec6\u3e75\u8d90\u36d3::\ub113\u8389\u99f7\u6c56\u983f\uceb8, getfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u7049\ud4fe\u3bc9\u6ec6\u8d90::\u600f\uae5d\u0b8e\u5245\uc31c\u8350, this:\u7049\ud4fe\u3bc9\u6ec6\u8d90)))
                    invokevirtual:void(Logger::fine, stack_F0_0:Logger, invokestatic:String(String::format, stack_ED_0:String, expr_DA:Object[]))
                }
                
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1165973505))
                invokestatic:void(\u960f\u6ec6\u3e75\u8d90\u36d3::\u7006\u3bd6\ua562\u67d0\u5d20\u7bad, getfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u7049\ud4fe\u3bc9\u6ec6\u8d90::\u600f\uae5d\u0b8e\u5245\uc31c\u8350, this:\u7049\ud4fe\u3bc9\u6ec6\u8d90), initobject:\u36d3\u4975\uae87\u873d\u6d69(\u36d3\u4975\uae87\u873d\u6d69<T>::<init>, and:int(ldc:int(16431), ldc:int(4481))))
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(32)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1041464277))
                    invokestatic:void(\u960f\u6ec6\u3e75\u8d90\u36d3::\u983f\uae5d\u7330\u6d69\u52d3\u120d, getfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u7049\ud4fe\u3bc9\u6ec6\u8d90::\u600f\uae5d\u0b8e\u5245\uc31c\u8350, this:\u7049\ud4fe\u3bc9\u6ec6\u8d90))
                    
                    if (invokestatic:boolean(\u960f\u6ec6\u3e75\u8d90\u36d3::\u56bd\u0a06\u836c\ud36e\ua068\u6bb9, getfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u7049\ud4fe\u3bc9\u6ec6\u8d90::\u600f\uae5d\u0b8e\u5245\uc31c\u8350, this:\u7049\ud4fe\u3bc9\u6ec6\u8d90))) {
                        invokestatic:void(\u960f\u6ec6\u3e75\u8d90\u36d3::\u965f\u8aa5\u156b\u71f1\u67e9\u8753, getfield:\u960f\u6ec6\u3e75\u8d90\u36d3(\u7049\ud4fe\u3bc9\u6ec6\u8d90::\u600f\uae5d\u0b8e\u5245\uc31c\u8350, this:\u7049\ud4fe\u3bc9\u6ec6\u8d90), loadelement:String(getstatic:String[](\u7049\ud4fe\u3bc9\u6ec6\u8d90::\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b), xor:int(ldc:int(-30686), ldc:int(-30685))))
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1A2 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_1BB_0 : byte[] [generated]
        stack_1F8_0 : byte[] [generated]
        stack_263_0 : byte[] [generated]
        stack_2CC_0 : byte[] [generated]
        var_4_18F : int
        var_3_194 : byte[]
        var_5_195 : int
        expr_263 : byte [generated]
        var_0_2C2 : int
        expr_2CC : byte [generated]
        stack_2FA_2 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_1E7 : byte[]
        var_5_1E8 : int
        expr_D3 : int [generated]
        expr_106 : int [generated]
        var_3_13A : String
        stack_188_0 : String[] [generated]
        expr_14C : String[] [generated]
        
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
        var_0_1A2 = and:int(ldc:int(-830785361), ldc:int(-403015489))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_1BB_0 = stack_1F8_0 = stack_263_0 = stack_2CC_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("0wPE0jHrKrJLTJqyo9My2ovyomtaiosKk8GL0zJzzJqyo9MyoeHRyrk7eNAm8NM=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_18F = expr_6B:int
        var_3_194 = newarray:byte[](byte.class, expr_6B:int)
        var_5_195 = expr_6B:int
        Label_0407:
        
        while (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(4194304)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1A2:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0575)
            }
            
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-982730569))
            var_5_195 = add:int(var_5_195:int, ldc:int(-1))
            storeelement:byte(var_3_194:byte[], var_5_195:int, add:byte(xor:byte(loadelement:byte(stack_1BB_0:byte[], var_5_195:int), ldc:byte(26)), ldc:byte(55)))
            
            if (cmpne:boolean(var_5_195:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_1BB_0 = stack_1F8_0 = stack_263_0 = stack_2CC_0 = var_3_194:byte[]
            goto(Label_0112)
        }
        
        var_0_1A2 = and:int(var_0_1A2:int, ldc:int(1982479320))
        goto(Label_0680)
        Label_0575:
        
        while (cmpeq:boolean(and:int(var_0_1A2:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1A2:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0407)
            }
            
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-461431105))
            var_5_195 = add:int(var_5_195:int, ldc:int(-1))
            expr_263 = loadelement:byte(stack_263_0:byte[], var_5_195:int)
            storeelement:byte(var_3_194:byte[], var_5_195:int, or:int(and:int(shl:int(expr_263:byte, xor:int(ldc:int(19968), ldc:int(19972))), ldc:int(-16)), and:int(shr:int(expr_263:byte[expected:int], and:int(ldc:int(12404), ldc:int(17164))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_195:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_1BB_0 = stack_1F8_0 = stack_263_0 = stack_2CC_0 = var_3_194:byte[]
            goto(Label_0216)
        }
        
        var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-852830076))
        Label_0680:
        
        while (cmpeq:boolean(and:int(var_0_1A2:int, ldc:int(16)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1A2:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-701612375))
                goto(Label_0407)
            }
            
            var_0_2C2 = and:int(var_0_1A2:int, ldc:int(-210560777))
            var_5_195 = add:int(var_5_195:int, ldc:int(-1))
            expr_2CC = loadelement:byte(stack_2CC_0:byte[], var_5_195:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_195:int, ldc:int(5)), neg:int(var_4_18F:int)), ldc:int(0))) {
                var_0_2C2 = and:int(var_0_2C2:int, ldc:int(-227202309))
                stack_2FA_2 = add:byte(expr_2CC:byte, ldc:byte(5))
            }
            else {
                stack_2FA_2 = add:byte(expr_2CC:byte, loadelement:byte(var_3_194:byte[], add:int(var_5_195:int, ldc:int(5))))
            }
            
            var_0_1A2 = and:int(var_0_2C2:int, ldc:int(-654885377))
            storeelement:byte(var_3_194:byte[], var_5_195:int, stack_2FA_2:byte)
            
            if (cmpne:boolean(var_5_195:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_1BB_0 = stack_1F8_0 = stack_263_0 = stack_2CC_0 = var_3_194:byte[]
            goto(Label_0267)
        }
        
        goto(Label_0575)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1A2:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-151500710))
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_1A2:int, ldc:int(32)), ldc:int(0))) {
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(730324315))
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_1A2:int, ldc:int(64)), ldc:int(0))) {
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-848343113))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_1E7 = newarray:byte[](byte.class, expr_A0:int)
                var_5_1E8 = expr_A0:int
                
                loop {
                    var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-420302849))
                    var_5_1E8 = add:int(var_5_1E8:int, ldc:int(-1))
                    storeelement:byte(var_3_1E7:byte[], var_5_1E8:int, add:int(shl:int(loadelement:byte(stack_1F8_0:byte[], var_5_1E8:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_1E8:int, and:int(ldc:int(17025), ldc:int(8529)))), ldc:int(7)), and:int(ldc:int(17089), ldc:int(8481)))))
                    
                    if (cmpne:boolean(var_5_1E8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D1_0 = stack_D3_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_1BB_0 = stack_1F8_0 = stack_263_0 = stack_2CC_0 = var_3_1E7:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(32768)), ldc:int(0))) {
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(1907646101))
            goto(Label_0267)
        }
        
        if (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(16)), ldc:int(0))) {
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(1532352483))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1A2:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-488129609))
            expr_D3 = arraylength:int(stack_D3_0:byte[])
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_4_18F = expr_D3:int
                var_3_194 = newarray:byte[](byte.class, expr_D3:int)
                var_5_195 = expr_D3:int
                goto(Label_0575)
            }
        }
        
        Label_0216:
        
        if (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(64)), ldc:int(0))) {
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(1896232775))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1A2:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-5984654))
                goto(Label_0165)
            }
            
            if (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-287195725))
            expr_106 = arraylength:int(stack_106_0:byte[])
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_4_18F = expr_106:int
                var_3_194 = newarray:byte[](byte.class, expr_106:int)
                var_5_195 = expr_106:int
                goto(Label_0680)
            }
        }
        
        Label_0267:
        
        if (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_1A2 = and:int(var_0_1A2:int, ldc:int(-681471321))
            goto(Label_0165)
        }
        
        if (cmpne:boolean(and:int(var_0_1A2:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_188_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-28671), ldc:int(-28669)))
            expr_14C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2086), ldc:int(2084)))
            storeelement:String(expr_14C:String[], xor:int(ldc:int(-32767), ldc:int(-32768)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(-5046), ldc:int(5041)), xor:int(ldc:int(4163), ldc:int(4183))))
            storeelement:String(expr_14C:String[], and:int(ldc:int(31783), ldc:int(-32552)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(5268), ldc:int(20)), and:int(ldc:int(16191), ldc:int(16622))))
            putstatic:String[](\u7049\ud4fe\u3bc9\u6ec6\u8d90::\u5140\ud523\u3d4b\u647c\ub1b9\u4c2b, expr_14C:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ub8be\u7d52\u3dd3\ub171\ud158\ufcaf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5D5 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
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
        var_3_5D5 = and:int(ldc:int(-690773065), ldc:int(-698768485))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7049\ud4fe\u3bc9\u6ec6\u8d90[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-361045197))
            var_5_7D = and:int(ldc:int(-25436), ldc:int(25411))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16181), ldc:int(12084)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5D5:int, ldc:int(-671563817))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(8193), ldc:int(8192)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(9497), ldc:int(18945)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5D5 = and:int(var_3_CA:int, ldc:int(-940237))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-31231), ldc:int(-31232)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1604285656))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0874)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0758)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-562057317))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0517)
                            }
                            
                            goto(Label_0758)
                        }
                    }
                    
                    Label_0357:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-238381272))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1967736224))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-130735715))
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1430393838))
                        goto(Label_0874)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0758)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(614769081))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-623837377))
                            var_11_DB = and:int(ldc:int(-31555), ldc:int(31490))
                            goto(Label_1387)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0517:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1849382172))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1156328687))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-383225717))
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1514631279))
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0874)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(858255586))
                        goto(Label_0758)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1015798653))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-957306885))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0758)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-2002281311))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0874)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1711283922))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1391060176))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-673793133))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0758:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1398351170))
                        goto(Label_1043)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(158223651))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1257903696))
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-630213704))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-881481805))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(8485), ldc:int(18945))
                                goto(Label_1043)
                            }
                        }
                    }
                    
                    Label_0874:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(772072522))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1848773176))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0758)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1876751395))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(585896095))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1686910783))
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-489278122))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-562845865))
                        var_11_DB = and:int(ldc:int(18916), ldc:int(-18917))
                    }
                    
                    Label_1043:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0874)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0758)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(160642857))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1114050622))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-688265281))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1268)
                            }
                        }
                    }
                    
                    Label_1141:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-2015163939))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_1043)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0874)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1417222434))
                            goto(Label_0758)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-311855196))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-162719283))
                            loopcontinue()
                        }
                        
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-615252197))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1387)
                    }
                    
                    Label_1268:
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(2008565523))
                        goto(Label_0874)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0758)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1347997978))
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-782178252))
                        loopcontinue()
                    }
                    
                    var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-833357961))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1387:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E0 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1398:
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-1832242724))
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1141)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1043)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(1318672376))
                        goto(Label_0874)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0758)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-790614295))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5D5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-671171681))
                        var_17_5E0 = add:int(var_16_109:int, xor:int(ldc:int(2050), ldc:int(2051)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5D5 = and:int(var_3_5D5:int, ldc:int(-354883753))
                
                if (cmple:boolean(var_5_7D = var_17_5E0:int, sub:int(var_6_84:int, and:int(ldc:int(5189), ldc:int(545))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5D5:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
