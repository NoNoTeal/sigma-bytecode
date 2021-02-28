public class \ud36e\u6bb9\u960f\u4c04\u64ab.\u183a\u392e\u8c8a\u647c\u16f6\ub102 {
    public void \u183a\u392e\u8c8a\u647c\u16f6\ub102(\ub113\ufcaf\u3c25\u071d\u97b7.\u836c\u3bd6\u8753\u4e72\u965f\u3e2a p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1) {
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
            invokespecial:\u8aa5\u92ee\u8709\u6d69\u6c52\u6b5f(\u8aa5\u92ee\u8709\u6d69\u6c52\u6b5f::<init>, this:\u183a\u392e\u8c8a\u647c\u16f6\ub102, invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u494c\ubded\ud4fe\u71f1\u7330\u4f4a::\u61a4\u120d\u8413\u4c04\uae5d\u34df), p0:\u836c\u3bd6\u8753\u4e72\u965f\u3e2a)
            putfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u183a\u392e\u8c8a\u647c\u16f6\ub102::\u4f4a\u836c\ud523\ub32d\u6d99\u9255, this:\u183a\u392e\u8c8a\u647c\u16f6\ub102, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.google.gson.JsonObject \ua562\u965f\u4d85\u7e3f\u16f6\u836c(\u516c\u3d64\u718f\ub171\u6b5f.\u5fe1\u64f2\u9a18\u4cd9\u51b2 p0) {
        var_4_65 : JsonObject
        
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
            var_4_65 = invokespecial:JsonObject(\u8aa5\u92ee\u8709\u6d69\u6c52\u6b5f::\ua562\u965f\u4d85\u7e3f\u16f6\u836c, this:\u183a\u392e\u8c8a\u647c\u16f6\ub102[expected:\u8aa5\u92ee\u8709\u6d69\u6c52\u6b5f], p0:\u5fe1\u64f2\u9a18\u4cd9\u51b2)
            invokevirtual:void(JsonObject::addProperty, var_4_65:JsonObject, loadelement:String(getstatic:String[](\u183a\u392e\u8c8a\u647c\u16f6\ub102::\u9255\u56bd\u9937\u93a2\u494c\ub6ab), and:int(ldc:int(-1848), ldc:int(819))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u183a\u392e\u8c8a\u647c\u16f6\ub102::\u4f4a\u836c\ud523\ub32d\u6d99\u9255, this:\u183a\u392e\u8c8a\u647c\u16f6\ub102)))
            return:JsonObject(var_4_65:JsonObject)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7e3f\u4d85\u4cd9\u52d3\uc4d2\u56bd(\u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?> p0) {
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
            return:boolean(invokevirtual:boolean(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::equals, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u183a\u392e\u8c8a\u647c\u16f6\ub102::\u4f4a\u836c\ud523\ub32d\u6d99\u9255, this:\u183a\u392e\u8c8a\u647c\u16f6\ub102), invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7::\u52d3\u385b\ub70c\u5db4\u67d0\ubcb0, p0:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_16F : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_181_0 : byte[] [generated]
        stack_1DE_0 : byte[] [generated]
        stack_25B_0 : byte[] [generated]
        stack_2B0_0 : byte[] [generated]
        var_4_15C : int
        var_3_161 : byte[]
        var_5_162 : int
        expr_181 : byte [generated]
        var_0_1F6 : int
        expr_1DE : byte [generated]
        stack_22A_2 : byte [generated]
        stack_201_0 : byte [generated]
        expr_96 : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_24A : byte[]
        var_5_24B : int
        expr_EE : int [generated]
        var_3_29F : byte[]
        var_5_2A0 : int
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
        var_0_16F = and:int(ldc:int(1844715623), ldc:int(837570944))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_181_0 = stack_1DE_0 = stack_25B_0 = stack_2B0_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("8soXAw8dZw==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_15C = expr_6B:int
        var_3_161 = newarray:byte[](byte.class, expr_6B:int)
        var_5_162 = expr_6B:int
        Label_0356:
        
        while (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(65536)), ldc:int(0))) {
            var_0_16F = and:int(var_0_16F:int, ldc:int(-1560870896))
            var_5_162 = add:int(var_5_162:int, ldc:int(-1))
            expr_181 = loadelement:byte(stack_181_0:byte[], var_5_162:int)
            storeelement:byte(var_3_161:byte[], var_5_162:int, xor:int(or:int(and:int(shl:int(expr_181:byte, xor:int(ldc:int(183), ldc:int(179))), ldc:int(-16)), and:int(shr:int(expr_181:byte[expected:int], xor:int(ldc:int(-32320), ldc:int(-32316))), ldc:int(15))), ldc:int(13)))
            
            if (cmpne:boolean(var_5_162:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_181_0 = stack_1DE_0 = stack_25B_0 = stack_2B0_0 = var_3_161:byte[]
            goto(Label_0112)
        }
        
        var_0_16F = and:int(var_0_16F:int, ldc:int(-1165181482))
        Label_0457:
        
        while (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(256)), ldc:int(0))) {
            var_0_1F6 = and:int(var_0_16F:int, ldc:int(1894984986))
            var_5_162 = add:int(var_5_162:int, ldc:int(-1))
            expr_1DE = stack_22A_2 = loadelement(stack_1DE_0, var_5_162)
            
            if (cmplt:boolean(add:int(add:int(var_5_162:int, ldc:int(5)), neg:int(var_4_15C:int)), ldc:int(0))) {
                stack_22A_2 = stack_201_0 = add:byte(expr_1DE:byte, loadelement:byte(var_3_161:byte[], add:int(var_5_162:int, ldc:int(5))))
                goto(Label_0529)
            }
            
            Label_0491:
            
            if (cmpne:boolean(and:int(var_0_1F6:int, ldc:int(65536)), ldc:int(0))) {
                var_0_1F6 = and:int(var_0_1F6:int, ldc:int(308839885))
            }
            else {
                var_0_1F6 = and:int(var_0_1F6:int, ldc:int(1979140922))
                stack_22A_2 = stack_201_0 = add:byte(expr_1DE:byte, ldc:byte(5))
            }
            
            Label_0529:
            
            if (cmpeq:boolean(and:int(var_0_1F6:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_1F6 = and:int(var_0_1F6:int, ldc:int(-1766597910))
                goto(Label_0491)
            }
            
            var_0_16F = and:int(var_0_1F6:int, ldc:int(-1092147947))
            storeelement:byte(var_3_161:byte[], var_5_162:int, stack_22A_2:byte)
            
            if (cmpne:boolean(var_5_162:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_181_0 = stack_1DE_0 = stack_25B_0 = stack_2B0_0 = var_3_161:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0356)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_16F:int, ldc:int(4096)), ldc:int(0))) {
            var_0_16F = and:int(var_0_16F:int, ldc:int(631864971))
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(256)), ldc:int(0))) {
            var_0_16F = and:int(var_0_16F:int, ldc:int(-303982255))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_15C = expr_96:int
                var_3_161 = newarray:byte[](byte.class, expr_96:int)
                var_5_162 = expr_96:int
                goto(Label_0457)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_16F:int, ldc:int(4096)), ldc:int(0))) {
            var_0_16F = and:int(var_0_16F:int, ldc:int(455561807))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_16F = and:int(var_0_16F:int, ldc:int(-1091066211))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_24A = newarray:byte[](byte.class, expr_C3:int)
                var_5_24B = expr_C3:int
                
                loop {
                    var_0_16F = and:int(var_0_16F:int, ldc:int(1711170861))
                    var_5_24B = add:int(var_5_24B:int, ldc:int(-1))
                    storeelement:byte(var_3_24A:byte[], var_5_24B:int, add:int(shl:int(loadelement:byte(stack_25B_0:byte[], var_5_24B:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_24B:int, xor:int(ldc:int(-31744), ldc:int(-31743)))), ldc:int(5)), and:int(ldc:int(2087), ldc:int(5399)))))
                    
                    if (cmpne:boolean(var_5_24B:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_181_0 = stack_1DE_0 = stack_25B_0 = stack_2B0_0 = var_3_24A:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_16F = and:int(var_0_16F:int, ldc:int(-1163585352))
        }
        else {
            if (cmpne:boolean(and:int(var_0_16F:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_16F = and:int(var_0_16F:int, ldc:int(-270146002))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_29F = newarray:byte[](byte.class, expr_EE:int)
                var_5_2A0 = expr_EE:int
                
                loop {
                    var_0_16F = and:int(var_0_16F:int, ldc:int(1844960786))
                    var_5_2A0 = add:int(var_5_2A0:int, ldc:int(-1))
                    storeelement:byte(var_3_29F:byte[], var_5_2A0:int, add:byte(loadelement:byte(stack_2B0_0:byte[], var_5_2A0:int), ldc:byte(89)))
                    
                    if (cmpne:boolean(var_5_2A0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_181_0 = stack_1DE_0 = stack_25B_0 = stack_2B0_0 = var_3_29F:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpeq:boolean(and:int(var_0_16F:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_16F:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_16F:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_16F = and:int(var_0_16F:int, ldc:int(1701555229))
            goto(Label_0112)
        }
        
        var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_155_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8449), ldc:int(3689)))
        expr_134 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8211), ldc:int(4621)))
        storeelement:String(expr_134:String[], and:int(ldc:int(-11482), ldc:int(11465)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(22597), ldc:int(-23670)), xor:int(ldc:int(16673), ldc:int(16679))))
        putstatic:String[](\u183a\u392e\u8c8a\u647c\u16f6\ub102::\u9255\u56bd\u9937\u93a2\u494c\ub6ab, expr_134:String[])
    }
    
    public void \u3d64\u98a4\u3504\u5bc4\uc3e3\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5C1 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_5CC : int
        
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
        var_3_5C1 = and:int(ldc:int(418768925), ldc:int(1504898847))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u183a\u392e\u8c8a\u647c\u16f6\ub102[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(512)), ldc:int(0))) {
            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-1120276754))
            var_5_7D = and:int(ldc:int(8396), ldc:int(-8397))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(11787), ldc:int(-11820)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5C1:int, ldc:int(404291487))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(141), ldc:int(1027)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(21015), ldc:int(1345)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5C1 = and:int(var_3_CA:int, ldc:int(-1179321315))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(16385), ldc:int(16384)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1360)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(1807816858))
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0612)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-1075773462))
                        goto(Label_0501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(412937119))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0501)
                            }
                            
                            goto(Label_0722)
                        }
                    }
                    
                    Label_0365:
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1360)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-1531159296))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0612)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-473146471))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(192543646))
                            var_11_DB = and:int(ldc:int(-4727), ldc:int(4726))
                            goto(Label_1349)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0501:
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-99967985))
                        goto(Label_1360)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(24027992))
                        goto(Label_0971)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-1394860785))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(512)), ldc:int(0))) {
                            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(1296010659))
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-1617368724))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0722)
                        }
                    }
                    
                    Label_0612:
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(879590433))
                        goto(Label_1360)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(1440864072))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-1532382659))
                        goto(Label_0971)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0501)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-337712210))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0722:
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-756143684))
                        goto(Label_1360)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-179897900))
                            goto(Label_0612)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(443437049))
                            goto(Label_0501)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-266682677))
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-926643027))
                            loopcontinue()
                        }
                        
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(682949518))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(2053), ldc:int(5633))
                                goto(Label_0971)
                            }
                        }
                    }
                    
                    Label_0841:
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1360)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0612)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-435410613))
                            goto(Label_0501)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(469238653))
                            goto(Label_0365)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-367925155))
                        var_11_DB = and:int(ldc:int(5440), ldc:int(-5441))
                    }
                    
                    Label_0971:
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(1668371376))
                        goto(Label_1360)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(132433587))
                            goto(Label_0841)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0612)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(1113939413))
                            goto(Label_0501)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(1305440382))
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(1497168604))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1212)
                            }
                        }
                    }
                    
                    Label_1085:
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(1347507625))
                        goto(Label_1360)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-359884231))
                            goto(Label_0971)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(418304014))
                            goto(Label_0612)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(565034980))
                            goto(Label_0501)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0365)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-544151379))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1349)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1212:
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(2024596084))
                        goto(Label_1360)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(669403149))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-619311912))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0612)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-1754595566))
                        goto(Label_0501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-2068631149))
                        loopcontinue()
                    }
                    
                    var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-1880031235))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1349:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5CC = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1360:
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-278371692))
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(424150897))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0971)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(65015982))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(640694528))
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0612)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5C1:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-527552336))
                        goto(Label_0501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0365)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5C1 = and:int(var_3_5C1:int, ldc:int(-585498931))
                        var_17_5CC = add:int(var_16_109:int, xor:int(ldc:int(17922), ldc:int(17923)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5C1 = and:int(var_3_5C1:int, ldc:int(2111171583))
                
                if (cmple:boolean(var_5_7D = var_17_5CC:int, sub:int(var_6_84:int, and:int(ldc:int(609), ldc:int(18437))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_5C1:int, ldc:int(1024)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
