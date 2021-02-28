public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\u5db4\u4cd9\uc3e3\u8413\u600f {
    public void \u5db4\u4cd9\uc3e3\u8413\u600f() {
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
            invokespecial:Object(Object::<init>, this:\u5db4\u4cd9\uc3e3\u8413\u600f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.String \u3504\u4cd9\ucef1\u927d\ube23\u8aa5(java.lang.String p0) {
        var_1_BF : int
        var_3_77 : String
        
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
            var_1_BF = and:int(ldc:int(1428572379), ldc:int(-66178))
            
            try {
                var_1_BF = and:int(var_1_BF:int, ldc:int(1964403579))
                var_3_77 = invokevirtual:String(ResourceBundle::getString, invokestatic:ResourceBundle(ResourceBundle::getBundle, loadelement:String(getstatic:String[](\u5db4\u4cd9\uc3e3\u8413\u600f::\ucfaf\u1187\u4c2b\u8350\u5f50\uc910), and:int(ldc:int(-28758), ldc:int(20565)))), p0:String)
                var_1_BF = and:int(var_1_BF:int, ldc:int(-715691681))
            }
            catch (java.util.MissingResourceException var_4_84) {
                do {
                    if (cmpne:boolean(and:int(var_1_BF:int, ldc:int(16777216)), ldc:int(0))) {
                        var_1_BF = and:int(var_1_BF:int, ldc:int(-1111557666))
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::err), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u5db4\u4cd9\uc3e3\u8413\u600f::\ucfaf\u1187\u4c2b\u8350\u5f50\uc910), xor:int(ldc:int(19968), ldc:int(19969)))), p0:String)))
                    }
                } while (cmpeq:boolean(and:int(var_1_BF:int, ldc:int(64)), ldc:int(0)))
                
                var_1_BF = and:int(var_1_BF:int, ldc:int(-1112024865))
                var_3_77 = p0:String
            }
            
            return:String(var_3_77:String)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_192 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_1A4_0 : byte[] [generated]
        stack_22B_0 : byte[] [generated]
        stack_27E_0 : byte[] [generated]
        stack_2D3_0 : byte[] [generated]
        var_4_17F : int
        var_3_184 : byte[]
        var_5_185 : int
        var_0_1BC : int
        expr_1A4 : byte [generated]
        stack_1E8_2 : byte [generated]
        stack_1BF_0 : byte [generated]
        expr_22B : byte [generated]
        expr_9E : int [generated]
        var_2_C7 : byte[]
        expr_CB : int [generated]
        var_3_26D : byte[]
        var_5_26E : int
        expr_EE : int [generated]
        var_3_2C2 : byte[]
        var_5_2C3 : int
        var_3_12A : String
        stack_178_0 : String[] [generated]
        expr_13C : String[] [generated]
        
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
        var_0_192 = and:int(ldc:int(-488824204), ldc:int(-807441844))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1A4_0 = stack_22B_0 = stack_27E_0 = stack_2D3_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("VurSBmnQyBQeEkY4TxKn9PzwRfoGMrEWCLwK8CYud15V9gDIeSLq0oe+SDipIrrI1Oy0EgoKOhr63q+Jq9M=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_17F = expr_6B:int
        var_3_184 = newarray:byte[](byte.class, expr_6B:int)
        var_5_185 = expr_6B:int
        Label_0391:
        
        while (cmpeq:boolean(and:int(var_0_192:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_1BC = and:int(var_0_192:int, ldc:int(-540183980))
            var_5_185 = add:int(var_5_185:int, ldc:int(-1))
            expr_1A4 = stack_1E8_2 = loadelement(stack_1A4_0, var_5_185)
            
            if (cmplt:boolean(add:int(add:int(var_5_185:int, ldc:int(4)), neg:int(var_4_17F:int)), ldc:int(0))) {
                stack_1E8_2 = stack_1BF_0 = add:byte(expr_1A4:byte, loadelement:byte(var_3_184:byte[], add:int(var_5_185:int, ldc:int(4))))
                goto(Label_0463)
            }
            
            Label_0433:
            
            if (cmpne:boolean(and:int(var_0_1BC:int, ldc:int(512)), ldc:int(0))) {
                var_0_1BC = and:int(var_0_1BC:int, ldc:int(-874091819))
                stack_1E8_2 = stack_1BF_0 = add:byte(expr_1A4:byte, ldc:byte(4))
            }
            
            Label_0463:
            
            if (cmpne:boolean(and:int(var_0_1BC:int, ldc:int(1)), ldc:int(0))) {
                var_0_1BC = and:int(var_0_1BC:int, ldc:int(949224175))
                goto(Label_0433)
            }
            
            var_0_192 = and:int(var_0_1BC:int, ldc:int(-805438628))
            storeelement:byte(var_3_184:byte[], var_5_185:int, stack_1E8_2:byte)
            
            if (cmpne:boolean(var_5_185:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1A4_0 = stack_22B_0 = stack_27E_0 = stack_2D3_0 = var_3_184:byte[]
            goto(Label_0112)
        }
        
        var_0_192 = and:int(var_0_192:int, ldc:int(-403390491))
        Label_0526:
        
        while (cmpne:boolean(and:int(var_0_192:int, ldc:int(4)), ldc:int(0))) {
            var_0_192 = and:int(var_0_192:int, ldc:int(-403313852))
            var_5_185 = add:int(var_5_185:int, ldc:int(-1))
            expr_22B = loadelement:byte(stack_22B_0:byte[], var_5_185:int)
            storeelement:byte(var_3_184:byte[], var_5_185:int, xor:int(or:int(and:int(shl:int(expr_22B:byte, xor:int(ldc:int(19489), ldc:int(19493))), ldc:int(-16)), and:int(shr:int(expr_22B:byte[expected:int], and:int(ldc:int(16397), ldc:int(14406))), ldc:int(15))), ldc:int(29)))
            
            if (cmpne:boolean(var_5_185:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1A4_0 = stack_22B_0 = stack_27E_0 = stack_2D3_0 = var_3_184:byte[]
            goto(Label_0163)
        }
        
        var_0_192 = and:int(var_0_192:int, ldc:int(234511493))
        goto(Label_0391)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_192:int, ldc:int(8)), ldc:int(0))) {
            var_0_192 = and:int(var_0_192:int, ldc:int(1947232760))
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_192:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_192:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_192 = and:int(var_0_192:int, ldc:int(1145213620))
        }
        else {
            var_0_192 = and:int(var_0_192:int, ldc:int(-893045778))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_17F = expr_9E:int
                var_3_184 = newarray:byte[](byte.class, expr_9E:int)
                var_5_185 = expr_9E:int
                goto(Label_0526)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_192:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_192:int, ldc:int(128)), ldc:int(0))) {
            var_0_192 = and:int(var_0_192:int, ldc:int(-291298660))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_192:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_192 = and:int(var_0_192:int, ldc:int(-624516356))
            var_2_C7 = stack_C7_0:byte[]
            expr_CB = add:int(arraylength:int(stack_C9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_3_26D = newarray:byte[](byte.class, expr_CB:int)
                var_5_26E = expr_CB:int
                
                loop {
                    var_0_192 = and:int(var_0_192:int, ldc:int(-135895044))
                    var_5_26E = add:int(var_5_26E:int, ldc:int(-1))
                    storeelement:byte(var_3_26D:byte[], var_5_26E:int, add:int(shl:int(loadelement:byte(stack_27E_0:byte[], var_5_26E:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_C7:byte[], add:int(var_5_26E:int, xor:int(ldc:int(16405), ldc:int(16404)))), ldc:int(5)), xor:int(ldc:int(-16345), ldc:int(-16352)))))
                    
                    if (cmpne:boolean(var_5_26E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1A4_0 = stack_22B_0 = stack_27E_0 = stack_2D3_0 = var_3_26D:byte[]
            }
        }
        
        Label_0208:
        
        if (cmpeq:boolean(and:int(var_0_192:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_192:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpne:boolean(and:int(var_0_192:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_192 = and:int(var_0_192:int, ldc:int(-1009845411))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_2C2 = newarray:byte[](byte.class, expr_EE:int)
                var_5_2C3 = expr_EE:int
                
                loop {
                    var_0_192 = and:int(var_0_192:int, ldc:int(-85066883))
                    var_5_2C3 = add:int(var_5_2C3:int, ldc:int(-1))
                    storeelement:byte(var_3_2C2:byte[], var_5_2C3:int, add:byte(loadelement:byte(stack_2D3_0:byte[], var_5_2C3:int), ldc:byte(56)))
                    
                    if (cmpne:boolean(var_5_2C3:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_11E_0 = stack_1A4_0 = stack_22B_0 = stack_27E_0 = stack_2D3_0 = var_3_2C2:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpeq:boolean(and:int(var_0_192:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_192 = and:int(var_0_192:int, ldc:int(409719691))
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_192:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_192:int, ldc:int(1)), ldc:int(0))) {
            var_0_192 = and:int(var_0_192:int, ldc:int(-2004771968))
            goto(Label_0112)
        }
        
        var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_178_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4394), ldc:int(18566)))
        expr_13C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8386), ldc:int(23570)))
        storeelement:String(expr_13C:String[], and:int(ldc:int(24771), ldc:int(2069)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(-19304), ldc:int(18790)), xor:int(ldc:int(49), ldc:int(46))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(-162), ldc:int(161)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(5215), ldc:int(2463)), xor:int(ldc:int(7216), ldc:int(7181))))
        putstatic:String[](\u5db4\u4cd9\uc3e3\u8413\u600f::\ucfaf\u1187\u4c2b\u8350\u5f50\uc910, expr_13C:String[])
    }
    
    public void \u71ae\u873d\u9033\u5db4\u416d\ub70c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65A : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_665 : int
        
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
        var_3_65A = and:int(ldc:int(1425155322), ldc:int(1442053631))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5db4\u4cd9\uc3e3\u8413\u600f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_65A = and:int(var_3_65A:int, ldc:int(-1307433819))
        }
        else {
            var_3_65A = and:int(var_3_65A:int, ldc:int(1995548632))
            var_5_85 = and:int(ldc:int(-21731), ldc:int(4322))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3270), ldc:int(-3783)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_65A:int, ldc:int(-1627439910))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(16584), ldc:int(16585)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(20624), ldc:int(20625)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_65A = and:int(var_3_DA:int, ldc:int(-537531683))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(8206), ldc:int(8207)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(887417715))
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(479103061))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-76796975))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(398835552))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(790642705))
                    }
                    else {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(2113692382))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(453907677))
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(881167574))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(343927032))
                            var_11_EB = and:int(ldc:int(6922), ldc:int(-7020))
                            goto(Label_1474)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1869606767))
                        goto(Label_1485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-579016384))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-33921717))
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(112573486))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1940819466))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-408912132))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(519814139))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(379199932))
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1056764412))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1556191804))
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1017757961))
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-895192611))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(62936896))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(390564703))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1459332315))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1473543541))
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(284623430))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(2076993783))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1607166944))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-663493709))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1627867144))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(81), ldc:int(2177))
                                goto(Label_1076)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1380938721))
                        goto(Label_1201)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(629442453))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-637938614))
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1578077684))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-151720705))
                        var_11_EB = and:int(ldc:int(-22387), ldc:int(22386))
                    }
                    
                    Label_1076:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1142739972))
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1346)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(981585837))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(2134060594))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(925829082))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-299068088))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(494776828))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1346)
                            }
                        }
                    }
                    
                    Label_1201:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-61902523))
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1461793432))
                            goto(Label_1076)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-637062632))
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-395091454))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1308389690))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(843539360))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1970317567))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1474)
                    }
                    
                    Label_1346:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(993136782))
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1460213856))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(804701462))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1528097657))
                        loopcontinue()
                    }
                    
                    var_3_65A = and:int(var_3_65A:int, ldc:int(510933726))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1474:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_665 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1485:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1212742063))
                        goto(Label_1346)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-34739282))
                        goto(Label_1201)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1734921504))
                        goto(Label_1076)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(775168219))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1243444445))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-291181520))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1042531724))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-159388166))
                        var_17_665 = add:int(var_16_119:int, and:int(ldc:int(33), ldc:int(18753)))
                        looporswitchbreak()
                    }
                    
                    var_3_65A = and:int(var_3_65A:int, ldc:int(-364443005))
                }
                
                var_3_65A = and:int(var_3_65A:int, ldc:int(1072889560))
                
                if (cmple:boolean(var_5_85 = var_17_665:int, sub:int(var_6_8C:int, and:int(ldc:int(1601), ldc:int(22937))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_65A = and:int(var_3_65A:int, ldc:int(-272664744))
            goto(Label_0106)
        }
    }
}
