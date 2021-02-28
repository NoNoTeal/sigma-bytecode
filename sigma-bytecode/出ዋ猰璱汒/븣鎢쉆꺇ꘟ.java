public final class \u51fa\u12cb\u7330\u74b1\u6c52.\ube23\u93a2\uc246\uae87\ua61f {
    public void \ube23\u93a2\uc246\uae87\ua61f() {
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
            invokespecial:CacheLoader(CacheLoader::<init>, this:\ube23\u93a2\uc246\uae87\ua61f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.authlib.GameProfile load(java.lang.String p0) {
        var_4_7E : GameProfile
        
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
        var_4_7E = invokeinterface:GameProfile(MinecraftSessionService::fillProfileProperties, invokestatic:MinecraftSessionService(\u6b5f\u56bd\u071d\ub32d\u16f6::\u759a\u61a4\u600f\ube23\u8c8a\u88c5), initobject:GameProfile(GameProfile::<init>, invokestatic:UUID(UUIDTypeAdapter::fromString, p0:String), checkcast:String(java.lang.String.class, aconstnull:String())), and:int[expected:boolean](ldc:int(-17545), ldc:int(17544)))
        
        if (cmpne:boolean(var_4_7E:GameProfile, aconstnull:GameProfile())) {
            return:GameProfile(var_4_7E:GameProfile)
        }
        
        athrow(initobject:Exception(Exception::<init>, loadelement:String(getstatic:String[](\ube23\u93a2\uc246\uae87\ua61f::\ud171\ub171\u4c2b\uae5d\u4c04\u494c), and:int(ldc:int(21507), ldc:int(-21508)))))
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
            return:Object(invokevirtual:GameProfile[expected:Object](\ube23\u93a2\uc246\uae87\ua61f::load, this:\ube23\u93a2\uc246\uae87\ua61f, checkcast:String(java.lang.String.class, p0:Object[expected:String])))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_179_0 : byte[] [generated]
        stack_1F8_0 : byte[] [generated]
        stack_248_0 : byte[] [generated]
        stack_29D_0 : byte[] [generated]
        var_4_15C : int
        var_3_161 : byte[]
        var_5_162 : int
        var_0_16F : int
        expr_179 : byte [generated]
        stack_1BD_2 : byte [generated]
        stack_19C_0 : byte [generated]
        expr_1F8 : byte [generated]
        expr_96 : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_237 : byte[]
        var_5_238 : int
        expr_EE : int [generated]
        var_3_28C : byte[]
        var_5_28D : int
        var_3_122 : String
        stack_155_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(1512768412), ldc:int(-25990229))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_179_0 = stack_1F8_0 = stack_248_0 = stack_29D_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Q+A4HNApw1Xf/NhNv/AYFPz8DAUD")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_15C = expr_6B:int
        var_3_161 = newarray:byte[](byte.class, expr_6B:int)
        var_5_162 = expr_6B:int
        Label_0356:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_16F = and:int(var_0_5F:int, ldc:int(976460617))
            var_5_162 = add:int(var_5_162:int, ldc:int(-1))
            expr_179 = stack_1BD_2 = loadelement(stack_179_0, var_5_162)
            
            if (cmplt:boolean(add:int(add:int(var_5_162:int, ldc:int(1)), neg:int(var_4_15C:int)), ldc:int(0))) {
                stack_1BD_2 = stack_19C_0 = add:byte(expr_179:byte, loadelement:byte(var_3_161:byte[], add:int(var_5_162:int, ldc:int(1))))
                goto(Label_0428)
            }
            
            Label_0390:
            
            if (cmpne:boolean(and:int(var_0_16F:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_16F = and:int(var_0_16F:int, ldc:int(-1066599772))
            }
            else {
                var_0_16F = and:int(var_0_16F:int, ldc:int(2117297576))
                stack_1BD_2 = stack_19C_0 = add:byte(expr_179:byte, ldc:byte(1))
            }
            
            Label_0428:
            
            if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0390)
            }
            
            var_0_5F = and:int(var_0_16F:int, ldc:int(-158117943))
            storeelement:byte(var_3_161:byte[], var_5_162:int, stack_1BD_2:byte)
            
            if (cmpne:boolean(var_5_162:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_179_0 = stack_1F8_0 = stack_248_0 = stack_29D_0 = var_3_161:byte[]
            goto(Label_0112)
        }
        
        Label_0483:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1586729309))
            var_5_162 = add:int(var_5_162:int, ldc:int(-1))
            expr_1F8 = loadelement:byte(stack_1F8_0:byte[], var_5_162:int)
            storeelement:byte(var_3_161:byte[], var_5_162:int, or:int(and:int(shl:int(expr_1F8:byte, xor:int(ldc:int(4672), ldc:int(4676))), ldc:int(-16)), and:int(shr:int(expr_1F8:byte[expected:int], and:int(ldc:int(24716), ldc:int(581))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_162:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_179_0 = stack_1F8_0 = stack_248_0 = stack_29D_0 = var_3_161:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0356)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2048)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1399463789))
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1146405893))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_15C = expr_96:int
                var_3_161 = newarray:byte[](byte.class, expr_96:int)
                var_5_162 = expr_96:int
                goto(Label_0483)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(64)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(866826275))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(321381278))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_237 = newarray:byte[](byte.class, expr_C3:int)
                var_5_238 = expr_C3:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1526178794))
                    var_5_238 = add:int(var_5_238:int, ldc:int(-1))
                    storeelement:byte(var_3_237:byte[], var_5_238:int, add:int(shl:int(loadelement:byte(stack_248_0:byte[], var_5_238:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_238:int, and:int(ldc:int(18177), ldc:int(4099)))), ldc:int(6)), and:int(ldc:int(17415), ldc:int(4267)))))
                    
                    if (cmpne:boolean(var_5_238:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_179_0 = stack_1F8_0 = stack_248_0 = stack_29D_0 = var_3_237:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(-1715154832))
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-161503827))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_28C = newarray:byte[](byte.class, expr_EE:int)
                var_5_28D = expr_EE:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1701359861))
                    var_5_28D = add:int(var_5_28D:int, ldc:int(-1))
                    storeelement:byte(var_3_28C:byte[], var_5_28D:int, add:byte(xor:byte(loadelement:byte(stack_29D_0:byte[], var_5_28D:int), ldc:byte(33)), ldc:byte(5)))
                    
                    if (cmpne:boolean(var_5_28D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_179_0 = stack_1F8_0 = stack_248_0 = stack_29D_0 = var_3_28C:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(131072)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1087200820))
            goto(Label_0155)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_155_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16457), ldc:int(6421)))
            expr_134 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2689), ldc:int(17665)))
            storeelement:String(expr_134:String[], and:int(ldc:int(-11077), ldc:int(9028)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(17264), ldc:int(-17265)), and:int(ldc:int(3156), ldc:int(4661))))
            putstatic:String[](\ube23\u93a2\uc246\uae87\ua61f::\ud171\ub171\u4c2b\uae5d\u4c04\u494c, expr_134:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u47c2\u56bd\u5140\uae87\uc31c\u97b7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F1 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5FC : int
        
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
        var_3_5F1 = and:int(ldc:int(-299235771), ldc:int(-576082310))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ube23\u93a2\uc246\uae87\ua61f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1648652620))
            var_5_7D = and:int(ldc:int(-25613), ldc:int(25612))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-32271), ldc:int(32270)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5F1:int, ldc:int(-319125593))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(5153), ldc:int(577)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(12576), ldc:int(12577)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5F1 = and:int(var_3_D2:int, ldc:int(-1354907876))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-32251), ldc:int(-32252)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1628148907))
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(663770274))
                    }
                    else {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1389877747))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0517)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1273441483))
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1646551134))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(2050651105))
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-29567164))
                        var_11_E3 = and:int(ldc:int(20290), ldc:int(-20307))
                        goto(Label_1397)
                    }
                    
                    Label_0517:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1082581359))
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1074636858))
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(2058898012))
                        goto(Label_0889)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(641170117))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1478846602))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1004734783))
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1912832052))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(979541558))
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(2057086370))
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1932951070))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(692814314))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1364376923))
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1366430720))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(533275539))
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1615028494))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-562324355))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(561354087))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1627154754))
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1909457254))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(6149), ldc:int(6148))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0889:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(729651957))
                        goto(Label_1408)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-18290711))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-839764220))
                            goto(Label_0517)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-47679954))
                        var_11_E3 = and:int(ldc:int(-274), ldc:int(273))
                    }
                    
                    Label_1027:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1269)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(858816261))
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1162804382))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-833092131))
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1773722968))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-155183584))
                            loopcontinue()
                        }
                        
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1121417658))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1269)
                            }
                        }
                    }
                    
                    Label_1151:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1449737568))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1725554914))
                            goto(Label_1027)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0889)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-468498446))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0517)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1356009671))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1397)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1269:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(18159873))
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-2052154340))
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1116622694))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-934165326))
                        loopcontinue()
                    }
                    
                    var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-1372887540))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1397:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5FC = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1408:
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(999641362))
                        goto(Label_1269)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0889)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(161491609))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-153066177))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1492088052))
                        goto(Label_0517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F1:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-310731021))
                        var_17_5FC = add:int(var_16_111:int, and:int(ldc:int(1283), ldc:int(20609)))
                        looporswitchbreak()
                    }
                    
                    var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-634565890))
                }
                
                var_3_5F1 = and:int(var_3_5F1:int, ldc:int(-832006478))
                
                if (cmple:boolean(var_5_7D = var_17_5FC:int, sub:int(var_6_84:int, xor:int(ldc:int(-32766), ldc:int(-32765))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5F1:int, ldc:int(2)), ldc:int(0))) {
            var_3_5F1 = and:int(var_3_5F1:int, ldc:int(1884237086))
            goto(Label_0106)
        }
    }
}
