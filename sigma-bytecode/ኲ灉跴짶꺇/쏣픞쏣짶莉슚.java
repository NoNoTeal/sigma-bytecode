public class \u12b2\u7049\u8df4\uc9f6\uae87.\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a {
    public void \uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub113\ubefe\ua61f\u965f\u120d\u927d p0, com.mojang.authlib.minecraft.MinecraftSessionService p1) {
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
            putfield:\ub113\ubefe\ua61f\u965f\u120d\u927d(\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a::\u9255\u5bc4\ub83f\u64f2\u9033\u071d, this:\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a, p0:\ub113\ubefe\ua61f\u965f\u120d\u927d)
            putfield:MinecraftSessionService(\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a::\u97e6\u93a2\u16f6\u5fe1\u5db4\u760c, this:\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a, p1:MinecraftSessionService)
            invokespecial:CacheLoader(CacheLoader::<init>, this:\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<com.mojang.authlib.minecraft.MinecraftProfileTexture$Type, com.mojang.authlib.minecraft.MinecraftProfileTexture> load(java.lang.String p0) {
        var_2_D6 : int
        var_4_7B : GameProfile
        stack_EE_0 : Map [generated]
        
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
        var_2_D6 = and:int(and:int(ldc:int(-889820058), ldc:int(-1096415106)), ldc:int(-1175016841))
        var_4_7B = initobject:GameProfile(GameProfile::<init>, checkcast:UUID(java.util.UUID.class, aconstnull:UUID()), loadelement:String(getstatic:String[](\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a::\u494c\u4c2b\u52d3\ubf56\u71ae\ub1b9), and:int(ldc:int(-4834), ldc:int(4705))))
        
        loop {
            if (cmpne:boolean(and:int(var_2_D6:int, ldc:int(65536)), ldc:int(0))) {
                var_2_D6 = and:int(var_2_D6:int, ldc:int(-188281072))
            }
            else {
                var_2_D6 = and:int(var_2_D6:int, ldc:int(-269672670))
                invokevirtual:boolean(PropertyMap::put, invokevirtual:PropertyMap(GameProfile::getProperties, var_4_7B:GameProfile), loadelement:String[expected:Object](getstatic:String[](\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a::\u494c\u4c2b\u52d3\ubf56\u71ae\ub1b9), xor:int(ldc:int(516), ldc:int(517))), initobject:Property[expected:Object](Property::<init>, loadelement:String(getstatic:String[](\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a::\u494c\u4c2b\u52d3\ubf56\u71ae\ub1b9), and:int(ldc:int(461), ldc:int(16897))), p0:String, loadelement:String(getstatic:String[](\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a::\u494c\u4c2b\u52d3\ubf56\u71ae\ub1b9), xor:int(ldc:int(1027), ldc:int(1025)))))
            }
            
            try {
                if (cmpne:boolean(and:int(var_2_D6:int, ldc:int(2097152)), ldc:int(0))) {
                    var_2_D6 = and:int(var_2_D6:int, ldc:int(-1611343633))
                    stack_EE_0 = invokeinterface:Map(MinecraftSessionService::getTextures, getfield:MinecraftSessionService(\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a::\u97e6\u93a2\u16f6\u5fe1\u5db4\u760c, this:\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a), var_4_7B:GameProfile, and:int[expected:boolean](ldc:int(-1068), ldc:int(1067)))
                    var_2_D6 = and:int(var_2_D6:int, ldc:int(-1074455046))
                    return:Map<MinecraftProfileTexture$Type, MinecraftProfileTexture>(stack_EE_0:Map)
                }
                
                var_2_D6 = and:int(var_2_D6:int, ldc:int(-1440164994))
            }
            catch (java.lang.Throwable var_5_F3) {
                return:Map<MinecraftProfileTexture$Type, MinecraftProfileTexture>(invokestatic:ImmutableMap[expected:Map<MinecraftProfileTexture$Type, MinecraftProfileTexture>](ImmutableMap::of))
            }
        }
    }
    
    public java.lang.Object load(java.lang.Object p0) {
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
            return:Object(invokevirtual:Map<MinecraftProfileTexture$Type, MinecraftProfileTexture>[expected:Object](\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a::load, this:\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a, checkcast:String(java.lang.String.class, p0:Object[expected:String])))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1F7 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_8E_0 : byte[] [generated]
        stack_90_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_E4_0 : byte[] [generated]
        stack_E6_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_209_0 : byte[] [generated]
        stack_26B_0 : byte[] [generated]
        stack_2E3_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_194 : byte[]
        var_4_195 : int
        expr_90 : int [generated]
        var_5_1E4 : int
        var_3_1E9 : byte[]
        var_4_1EA : int
        expr_209 : byte [generated]
        var_0_261 : int
        expr_26B : byte [generated]
        stack_2AF_2 : byte [generated]
        stack_28E_0 : byte [generated]
        expr_BB : int [generated]
        expr_E6 : int [generated]
        var_3_2D2 : byte[]
        var_4_2D3 : int
        var_3_122 : String
        stack_18B_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
            var_0_1F7 = and:int(ldc:int(191815722), ldc:int(-2053848))
            expr_65 = var_2_69 = stack_8E_0 = stack_90_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_209_0 = stack_26B_0 = stack_2E3_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("HBvn4DO7EHfMG+PkE6h0KBx/mFvIDDPMd8A="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_194 = newarray:byte[](byte.class, expr_6D:int)
                var_4_195 = expr_6D:int
                
                loop {
                    var_0_1F7 = and:int(var_0_1F7:int, ldc:int(1323350250))
                    var_4_195 = add:int(var_4_195:int, ldc:int(-1))
                    storeelement:byte(var_3_194:byte[], var_4_195:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_195:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_195:int, xor:int(ldc:int(-32620), ldc:int(-32619)))), ldc:int(6)), xor:int(ldc:int(-12158), ldc:int(-12159)))))
                    
                    if (cmpne:boolean(var_4_195:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_90_0 = stack_8E_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_209_0 = stack_26B_0 = stack_2E3_0 = var_3_194:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0235)
                }
                
                if (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0192)
                }
                
                if (cmpne:boolean(and:int(var_0_1F7:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0149)
                }
                
                var_0_1F7 = and:int(var_0_1F7:int, ldc:int(-1965848516))
                expr_90 = arraylength:int(stack_90_0:byte[])
                
                if (cmpeq:boolean(expr_90:int, ldc:int(0))) {
                    goto(Label_0149)
                }
                
                var_5_1E4 = expr_90:int
                var_3_1E9 = newarray:byte[](byte.class, expr_90:int)
                var_4_1EA = expr_90:int
                Label_0492:
                
                while (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(128)), ldc:int(0))) {
                    var_0_1F7 = and:int(var_0_1F7:int, ldc:int(-137643076))
                    var_4_1EA = add:int(var_4_1EA:int, ldc:int(-1))
                    expr_209 = loadelement:byte(stack_209_0:byte[], var_4_1EA:int)
                    storeelement:byte(var_3_1E9:byte[], var_4_1EA:int, or:int(and:int(shl:int(expr_209:byte, and:int(ldc:int(17414), ldc:int(660))), ldc:int(-16)), and:int(shr:int(expr_209:byte[expected:int], xor:int(ldc:int(20517), ldc:int(20513))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_1EA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_90_0 = stack_8E_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_209_0 = stack_26B_0 = stack_2E3_0 = var_3_1E9:byte[]
                    goto(Label_0149)
                }
                
                var_0_1F7 = and:int(var_0_1F7:int, ldc:int(1946513045))
                Label_0590:
                
                while (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_261 = and:int(var_0_1F7:int, ldc:int(-1955270941))
                    var_4_1EA = add:int(var_4_1EA:int, ldc:int(-1))
                    expr_26B = stack_2AF_2 = loadelement(stack_26B_0, var_4_1EA)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1EA:int, ldc:int(6)), neg:int(var_5_1E4:int)), ldc:int(0))) {
                        stack_2AF_2 = stack_28E_0 = add:byte(expr_26B:byte, loadelement:byte(var_3_1E9:byte[], add:int(var_4_1EA:int, ldc:int(6))))
                        goto(Label_0670)
                    }
                    
                    Label_0632:
                    
                    if (cmpeq:boolean(and:int(var_0_261:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_261 = and:int(var_0_261:int, ldc:int(1906170390))
                    }
                    else {
                        var_0_261 = and:int(var_0_261:int, ldc:int(385203747))
                        stack_2AF_2 = stack_28E_0 = add:byte(expr_26B:byte, ldc:byte(6))
                    }
                    
                    Label_0670:
                    
                    if (cmpeq:boolean(and:int(var_0_261:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0632)
                    }
                    
                    var_0_1F7 = and:int(var_0_261:int, ldc:int(-1351163009))
                    storeelement:byte(var_3_1E9:byte[], var_4_1EA:int, stack_2AF_2:byte)
                    
                    if (cmpne:boolean(var_4_1EA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_90_0 = stack_8E_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_209_0 = stack_26B_0 = stack_2E3_0 = var_3_1E9:byte[]
                    goto(Label_0192)
                }
                
                var_0_1F7 = and:int(var_0_1F7:int, ldc:int(-296992123))
                goto(Label_0492)
                Label_0149:
                
                if (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0235)
                }
                
                if (cmpne:boolean(and:int(var_0_1F7:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(4194304)), ldc:int(0))) {
                        var_0_1F7 = and:int(var_0_1F7:int, ldc:int(-1015098356))
                        loopcontinue()
                    }
                    
                    var_0_1F7 = and:int(var_0_1F7:int, ldc:int(-143151453))
                    expr_BB = arraylength:int(stack_BB_0:byte[])
                    
                    if (cmpne:boolean(expr_BB:int, ldc:int(0))) {
                        var_5_1E4 = expr_BB:int
                        var_3_1E9 = newarray:byte[](byte.class, expr_BB:int)
                        var_4_1EA = expr_BB:int
                        goto(Label_0590)
                    }
                }
                
                Label_0192:
                
                if (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(67108864)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(33554432)), ldc:int(0))) {
                        var_0_1F7 = and:int(var_0_1F7:int, ldc:int(633334568))
                        loopcontinue()
                    }
                    
                    var_0_1F7 = and:int(var_0_1F7:int, ldc:int(577938607))
                    expr_E6 = arraylength:int(stack_E6_0:byte[])
                    
                    if (cmpne:boolean(expr_E6:int, ldc:int(0))) {
                        var_3_2D2 = newarray:byte[](byte.class, expr_E6:int)
                        var_4_2D3 = expr_E6:int
                        
                        loop {
                            var_0_1F7 = and:int(var_0_1F7:int, ldc:int(133863331))
                            var_4_2D3 = add:int(var_4_2D3:int, ldc:int(-1))
                            storeelement:byte(var_3_2D2:byte[], var_4_2D3:int, xor:byte(add:byte(loadelement:byte(stack_2E3_0:byte[], var_4_2D3:int), ldc:byte(38)), ldc:byte(90)))
                            
                            if (cmpne:boolean(var_4_2D3:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_90_0 = stack_8E_0 = stack_B9_0 = stack_BB_0 = stack_E4_0 = stack_E6_0 = stack_116_0 = stack_209_0 = stack_26B_0 = stack_2E3_0 = var_3_2D2:byte[]
                    }
                }
                
                Label_0235:
                
                if (cmpne:boolean(and:int(var_0_1F7:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_1F7 = and:int(var_0_1F7:int, ldc:int(1290529162))
                    goto(Label_0192)
                }
                
                if (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0149)
                }
                
                if (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_1F7 = and:int(var_0_1F7:int, ldc:int(-1005997984))
            }
            
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_18B_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32256), ldc:int(-32253)))
            expr_134 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(151), ldc:int(148)))
            storeelement:String(expr_134:String[], and:int(ldc:int(1059), ldc:int(22998)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(-27345), ldc:int(25296)), and:int(ldc:int(-7435), ldc:int(5386))))
            storeelement:String(expr_134:String[], and:int(ldc:int(-31737), ldc:int(31344)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(4530), ldc:int(-5043)), xor:int(ldc:int(16532), ldc:int(16517))))
            storeelement:String(expr_134:String[], and:int(ldc:int(1285), ldc:int(12289)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(8201), ldc:int(8216)), xor:int(ldc:int(2081), ldc:int(2104))))
            putstatic:String[](\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a::\u494c\u4c2b\u52d3\ubf56\u71ae\ub1b9, expr_134:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u92ff\ucb79\u385b\u92ee\ub1b9\uceb8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F2 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5FD : int
        
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
        var_3_5F2 = and:int(ldc:int(-69660522), ldc:int(-509295))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc3e3\ud51e\uc3e3\uc9f6\u8389\uc29a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1980029353))
        }
        else {
            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-208245))
            var_5_85 = and:int(ldc:int(-31491), ldc:int(23298))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-24467), ldc:int(24208)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5F2:int, ldc:int(1878217409))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(915), ldc:int(4133)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(33), ldc:int(18441)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5F2 = and:int(var_3_D2:int, ldc:int(1677062395))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(4773), ldc:int(25617)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(49006754))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1054)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1717973332))
                        goto(Label_0891)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1892458435))
                        goto(Label_0792)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-371964142))
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-503799))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0792)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1228374806))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1121036469))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1054)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(202245888))
                        goto(Label_0891)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-282961857))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(2077718706))
                            var_11_E3 = and:int(ldc:int(-190), ldc:int(189))
                            goto(Label_1405)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-154590588))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(150022422))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-680905106))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-399062913))
                        goto(Label_1054)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0891)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1366884528))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-167807331))
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-68609514))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0792)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(652497947))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(242258996))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1297649036))
                        goto(Label_1054)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0891)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(398398262))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1739238))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0792:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1054)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1319739546))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1727697980))
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-67322241))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(652), ldc:int(653))
                                goto(Label_1054)
                            }
                        }
                    }
                    
                    Label_0891:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1333810773))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-316476018))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0792)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1658410524))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1753351239))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1231321245))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(2145475360))
                        var_11_E3 = and:int(ldc:int(358), ldc:int(-359))
                    }
                    
                    Label_1054:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(76580344))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0891)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0792)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-235562226))
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-405717619))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1284)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-977612572))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1508217354))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1705760981))
                            goto(Label_1054)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0891)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0792)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(264983653))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-2073540))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1405)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1284:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1054)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0891)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1918189959))
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(739667548))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1430966998))
                        loopcontinue()
                    }
                    
                    var_3_5F2 = and:int(var_3_5F2:int, ldc:int(2012664998))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1405:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5FD = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1416:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1054)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1025661034))
                        goto(Label_0891)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1340926637))
                        goto(Label_0792)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(144168252))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-67898845))
                        var_17_5FD = add:int(var_16_111:int, xor:int(ldc:int(4392), ldc:int(4393)))
                        looporswitchbreak()
                    }
                    
                    var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1018788834))
                }
                
                var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1944163489))
                
                if (cmple:boolean(var_5_85 = var_17_5FD:int, sub:int(var_6_8C:int, xor:int(ldc:int(17408), ldc:int(17409))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
