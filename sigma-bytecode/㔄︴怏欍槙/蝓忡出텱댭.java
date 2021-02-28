public final class \u3504\ufe34\u600f\u6b0d\u69d9.\u8753\u5fe1\u51fa\ud171\ub32d {
    public void \u8753\u5fe1\u51fa\ud171\ub32d(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0, java.util.List p1) {
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
            putfield:\u88c5\ud171\ub113\u6435\ud51e(\u8753\u5fe1\u51fa\ud171\ub32d::\ucef1\u99f7\u4e72\u7873\u0800\u72f1, this:\u8753\u5fe1\u51fa\ud171\ub32d, p0:\u88c5\ud171\ub113\u6435\ud51e)
            putfield:List(\u8753\u5fe1\u51fa\ud171\ub32d::\u5db4\u965f\u6c56\u92ee\ud4fe\ub83f, this:\u8753\u5fe1\u51fa\ud171\ub32d, p1:List)
            invokespecial:Object(Object::<init>, this:\u8753\u5fe1\u51fa\ud171\ub32d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void onProfileLookupSucceeded(com.mojang.authlib.GameProfile p0) {
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
            invokevirtual:void(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u12cb\u99f7\u8c8a\u183a\u600f\ub6ab, invokevirtual:\ub1b9\u983f\uf9c5\u6fb0\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\u62da\u8df4\ua3b4\u64f2\u3bc9\u927d, getfield:\u88c5\ud171\ub113\u6435\ud51e(\u8753\u5fe1\u51fa\ud171\ub32d::\ucef1\u99f7\u4e72\u7873\u0800\u72f1, this:\u8753\u5fe1\u51fa\ud171\ub32d)), p0:GameProfile)
            invokeinterface:boolean(List<GameProfile>::add, getfield:List(\u8753\u5fe1\u51fa\ud171\ub32d::\u5db4\u965f\u6c56\u92ee\ud4fe\ub83f, this:\u8753\u5fe1\u51fa\ud171\ub32d), p0:GameProfile)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void onProfileLookupFailed(com.mojang.authlib.GameProfile p0, java.lang.Exception p1) {
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
            invokeinterface:void(Logger::warn, invokestatic:Logger(\u4c04\u7330\uc3e3\u4492\uae87::\ubf56\u7bad\u40a9\ub70c\u6c56\uc3e3), loadelement:String(getstatic:String[](\u8753\u5fe1\u51fa\ud171\ub32d::\u527a\u59ec\ubded\u7bad\ub70c\u92ff), and:int(ldc:int(2377), ldc:int(-3534))), invokevirtual:String[expected:Object](GameProfile::getName, p0:GameProfile), p1:Exception[expected:Object])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_97_0 : byte[] [generated]
        stack_99_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_19C_0 : byte[] [generated]
        stack_214_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_136 : byte[]
        var_4_137 : int
        var_0_7D : int
        var_0_8C : int
        expr_99 : int [generated]
        var_5_186 : int
        var_3_18B : byte[]
        var_4_18C : int
        var_0_1B4 : int
        expr_19C : byte [generated]
        stack_1E0_2 : byte [generated]
        stack_1B7_0 : byte [generated]
        expr_C5 : int [generated]
        var_3_203 : byte[]
        var_4_204 : int
        expr_21A : byte [generated]
        var_3_FA : String
        stack_12D_0 : String[] [generated]
        expr_10C : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(1271216006), ldc:int(1539978983))
            expr_65 = var_2_69 = stack_97_0 = stack_99_0 = stack_C3_0 = stack_C5_0 = stack_EE_0 = stack_19C_0 = stack_214_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("FwgvwN5ieAAHmqC2UMD/8ABwV6AwGlf4MIBmOBg4UDrmQCeARarIpPxuxBQA"))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_136 = newarray:byte[](byte.class, expr_6D:int)
                var_4_137 = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-839227722))
                    var_4_137 = add:int(var_4_137:int, ldc:int(-1))
                    storeelement:byte(var_3_136:byte[], var_4_137:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_137:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_137:int, and:int(ldc:int(165), ldc:int(16641)))), ldc:int(7)), and:int(ldc:int(1537), ldc:int(8275)))))
                    
                    if (cmpne:boolean(var_4_137:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_99_0 = stack_97_0 = stack_C3_0 = stack_C5_0 = stack_EE_0 = stack_19C_0 = stack_214_0 = var_3_136:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_7D = and:int(var_0_5F:int, ldc:int(-445248309))
                    goto(Label_0202)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_8C = and:int(var_0_5F:int, ldc:int(2123463629))
                }
                else {
                    var_0_8C = and:int(var_0_5F:int, ldc:int(-7757889))
                    expr_99 = arraylength:int(stack_99_0:byte[])
                    
                    if (cmpne:boolean(expr_99:int, ldc:int(0))) {
                        var_5_186 = expr_99:int
                        var_3_18B = newarray:byte[](byte.class, expr_99:int)
                        var_4_18C = expr_99:int
                        
                        loop {
                            var_0_1B4 = and:int(var_0_8C:int, ldc:int(-541499554))
                            var_4_18C = add:int(var_4_18C:int, ldc:int(-1))
                            expr_19C = stack_1E0_2 = loadelement(stack_19C_0, var_4_18C)
                            
                            if (cmplt:boolean(add:int(add:int(var_4_18C:int, ldc:int(5)), neg:int(var_5_186:int)), ldc:int(0))) {
                                stack_1E0_2 = stack_1B7_0 = add:byte(expr_19C:byte, loadelement:byte(var_3_18B:byte[], add:int(var_4_18C:int, ldc:int(5))))
                                goto(Label_0455)
                            }
                            
                            Label_0425:
                            
                            if (cmpne:boolean(and:int(var_0_1B4:int, ldc:int(134217728)), ldc:int(0))) {
                                var_0_1B4 = and:int(var_0_1B4:int, ldc:int(-272908310))
                                stack_1E0_2 = stack_1B7_0 = add:byte(expr_19C:byte, ldc:byte(5))
                            }
                            
                            Label_0455:
                            
                            if (cmpeq:boolean(and:int(var_0_1B4:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_0_1B4 = and:int(var_0_1B4:int, ldc:int(-2031676193))
                                goto(Label_0425)
                            }
                            
                            var_0_8C = and:int(var_0_1B4:int, ldc:int(1239942974))
                            storeelement:byte(var_3_18B:byte[], var_4_18C:int, stack_1E0_2:byte)
                            
                            if (cmpne:boolean(var_4_18C:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_99_0 = stack_97_0 = stack_C3_0 = stack_C5_0 = stack_EE_0 = stack_19C_0 = stack_214_0 = var_3_18B:byte[]
                    }
                }
                
                Label_0158:
                
                if (cmpne:boolean(and:int(var_0_8C:int, ldc:int(64)), ldc:int(0))) {
                    var_0_7D = and:int(var_0_8C:int, ldc:int(1553540037))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_8C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_8C:int, ldc:int(2023958946))
                        loopcontinue()
                    }
                    
                    var_0_7D = and:int(var_0_8C:int, ldc:int(-607224186))
                    expr_C5 = arraylength:int(stack_C5_0:byte[])
                    
                    if (cmpne:boolean(expr_C5:int, ldc:int(0))) {
                        var_3_203 = newarray:byte[](byte.class, expr_C5:int)
                        var_4_204 = expr_C5:int
                        
                        loop {
                            var_0_7D = and:int(var_0_7D:int, ldc:int(1505771234))
                            var_4_204 = add:int(var_4_204:int, ldc:int(-1))
                            expr_21A = xor:byte(add:byte(loadelement:byte(stack_214_0:byte[], var_4_204:int), ldc:byte(99)), ldc:byte(71))
                            storeelement:byte(var_3_203:byte[], var_4_204:int, or:int(and:int(shl:int(expr_21A:byte, xor:int(ldc:int(5121), ldc:int(5125))), ldc:int(-16)), and:int(shr:int(expr_21A:byte[expected:int], and:int(ldc:int(16926), ldc:int(36))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_204:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_99_0 = stack_97_0 = stack_C3_0 = stack_C5_0 = stack_EE_0 = stack_19C_0 = stack_214_0 = var_3_203:byte[]
                    }
                }
                
                Label_0202:
                
                if (cmpeq:boolean(and:int(var_0_7D:int, ldc:int(512)), ldc:int(0))) {
                    var_0_8C = and:int(var_0_7D:int, ldc:int(-1307849203))
                    goto(Label_0158)
                }
                
                if (cmpne:boolean(and:int(var_0_7D:int, ldc:int(2)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_5F = and:int(var_0_7D:int, ldc:int(118459282))
            }
            
            var_3_FA = initobject:String(String::<init>, stack_EE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_12D_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2050), ldc:int(2051)))
            expr_10C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(801), ldc:int(29705)))
            storeelement:String(expr_10C:String[], and:int(ldc:int(-5993), ldc:int(1896)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(-14572), ldc:int(14528)), and:int(ldc:int(20524), ldc:int(8764))))
            putstatic:String[](\u8753\u5fe1\u51fa\ud171\ub32d::\u527a\u59ec\ubded\u7bad\ub70c\u92ff, expr_10C:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9255\u5db4\u494c\u5140\uc246\u2dcc(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_619 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_624 : int
        
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
        var_3_619 = and:int(ldc:int(975649631), ldc:int(2075535711))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8753\u5fe1\u51fa\ud171\ub32d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(256)), ldc:int(0))) {
            var_3_619 = and:int(var_3_619:int, ldc:int(1048571351))
            var_5_7D = and:int(ldc:int(8515), ldc:int(-8520))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8561), ldc:int(-24948)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_619:int, ldc:int(2049380191))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(105), ldc:int(20499)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(3137), ldc:int(8721)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_619 = and:int(var_3_CA:int, ldc:int(707181431))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-24570), ldc:int(-24569)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1274635611))
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1026)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0866)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1139741906))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(256)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(430051975))
                    }
                    else {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1041194455))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-599528092))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1026)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-134386891))
                        goto(Label_0866)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-180457868))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(504639754))
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(1786702687))
                        var_11_DB = and:int(ldc:int(-5311), ldc:int(1214))
                        goto(Label_1427)
                    }
                    
                    Label_0525:
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(1)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-28298342))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-432742129))
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(4)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1976663620))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-703074670))
                        goto(Label_1026)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-991920601))
                        goto(Label_0866)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0754)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(2134292863))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0754)
                        }
                    }
                    
                    Label_0644:
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(626197348))
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1026)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1508913666))
                        goto(Label_0866)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(256)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1891295021))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1148282377))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0754:
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(848515581))
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-398068680))
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1845976336))
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1026)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(256)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-443556823))
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(2115931639))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(18977), ldc:int(8521))
                                goto(Label_1026)
                            }
                        }
                    }
                    
                    Label_0866:
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(4)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-492643282))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-892013763))
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1852519581))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(144619470))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(578041718))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(-32536097))
                        var_11_DB = and:int(ldc:int(-7939), ldc:int(3842))
                    }
                    
                    Label_1026:
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1281586873))
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-773168360))
                            goto(Label_0866)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(1075116298))
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(1810628092))
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(4)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-2028055735))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_619 = and:int(var_3_619:int, ldc:int(1066909527))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1263)
                            }
                        }
                    }
                    
                    Label_1154:
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(395909305))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(1465449405))
                            goto(Label_1026)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0866)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0754)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0644)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_619 = and:int(var_3_619:int, ldc:int(-273240737))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1427)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1263:
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(4)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1666345253))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(4)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1118240162))
                        goto(Label_1154)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(256)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(1652224874))
                        goto(Label_1026)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1918966422))
                        goto(Label_0866)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(4)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-2138749530))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(331163285))
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(1)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-130503182))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(2146442490))
                        loopcontinue()
                    }
                    
                    var_3_619 = and:int(var_3_619:int, ldc:int(-1355375273))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1427:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_624 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1438:
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1154)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1210316478))
                        goto(Label_1026)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(2)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-957796428))
                        goto(Label_0866)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1957906635))
                        goto(Label_0754)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0644)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_619:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1112555225))
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-1710813967))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_619:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_619 = and:int(var_3_619:int, ldc:int(-366034977))
                        var_17_624 = add:int(var_16_109:int, xor:int(ldc:int(2050), ldc:int(2051)))
                        looporswitchbreak()
                    }
                    
                    var_3_619 = and:int(var_3_619:int, ldc:int(1859097053))
                }
                
                var_3_619 = and:int(var_3_619:int, ldc:int(1848012631))
                
                if (cmple:boolean(var_5_7D = var_17_624:int, sub:int(var_6_84:int, xor:int(ldc:int(48), ldc:int(49))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_619:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
