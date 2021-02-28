public class \u51fa\u12cb\u7330\u74b1\u6c52.\ub113\u960f\u4975\u74b1\ubcb0 {
    public void \ub113\u960f\u4975\u74b1\ubcb0() {
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
            invokespecial:Object(Object::<init>, this:\ub113\u960f\u4975\u74b1\ubcb0)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u47c2\u2dcc\u12cb\ud171\u8c8a.\u6bb9\ubefe\u183a\u92ee\uc3e3 deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) {
        var_6_80 : JsonObject
        
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
        
        if (logicalnot:boolean(invokestatic:boolean(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u8389\u3a62\u8350\ucef1\ub18d\u7330, p0:JsonElement))) {
            var_6_80 = invokestatic:JsonObject(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u51fa\u9af2\u718f\u3bc9\ud217\ub18d, p0:JsonElement, loadelement:String(getstatic:String[](\ub113\u960f\u4975\u74b1\ubcb0::\u2dcc\u4c2b\u3bc9\uc9f6\u4c04\u3e2a), and:int(ldc:int(-16387), ldc:int(16386))))
            return:\u6bb9\ubefe\u183a\u92ee\uc3e3(initobject:\u6bb9\ubefe\u183a\u92ee\uc3e3(\u6bb9\ubefe\u183a\u92ee\uc3e3::<init>, invokestatic:float(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u5245\u624e\u93a2\u3c25\u759a\ud4fe, var_6_80:JsonObject, loadelement:String(getstatic:String[](\ub113\u960f\u4975\u74b1\ubcb0::\u2dcc\u4c2b\u3bc9\uc9f6\u4c04\u3e2a), xor:int(ldc:int(576), ldc:int(577)))), invokestatic:float(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u5245\u624e\u93a2\u3c25\u759a\ud4fe, var_6_80:JsonObject, loadelement:String(getstatic:String[](\ub113\u960f\u4975\u74b1\ubcb0::\u2dcc\u4c2b\u3bc9\uc9f6\u4c04\u3e2a), and:int(ldc:int(10338), ldc:int(17666))))))
        }
        
        return:\u6bb9\ubefe\u183a\u92ee\uc3e3(initobject:\u6bb9\ubefe\u183a\u92ee\uc3e3(\u6bb9\ubefe\u183a\u92ee\uc3e3::<init>, invokestatic:float(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u5245\u624e\u93a2\u3c25\u759a\ud4fe, p0:JsonElement, loadelement:String(getstatic:String[](\ub113\u960f\u4975\u74b1\ubcb0::\u2dcc\u4c2b\u3bc9\uc9f6\u4c04\u3e2a), and:int(ldc:int(18460), ldc:int(-18461))))))
    }
    
    public com.google.gson.JsonElement serialize(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u6bb9\ubefe\u183a\u92ee\uc3e3 p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
        var_6_7D : JsonObject
        
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
        
        if (cmpne:boolean(invokestatic:float(\u6bb9\ubefe\u183a\u92ee\uc3e3::\u392e\u946b\u67d0\u97b7\ud12e\u8d90, p0:\u6bb9\ubefe\u183a\u92ee\uc3e3), invokestatic:float(\u6bb9\ubefe\u183a\u92ee\uc3e3::\ua6bd\uff55\u5140\ud523\u120d\u3d64, p0:\u6bb9\ubefe\u183a\u92ee\uc3e3))) {
            var_6_7D = initobject:JsonObject(JsonObject::<init>)
            invokevirtual:void(JsonObject::addProperty, var_6_7D:JsonObject, loadelement:String(getstatic:String[](\ub113\u960f\u4975\u74b1\ubcb0::\u2dcc\u4c2b\u3bc9\uc9f6\u4c04\u3e2a), and:int(ldc:int(16465), ldc:int(15141))), invokestatic:Float[expected:Number](Float::valueOf, invokestatic:float(\u6bb9\ubefe\u183a\u92ee\uc3e3::\u392e\u946b\u67d0\u97b7\ud12e\u8d90, p0:\u6bb9\ubefe\u183a\u92ee\uc3e3)))
            invokevirtual:void(JsonObject::addProperty, var_6_7D:JsonObject, loadelement:String(getstatic:String[](\ub113\u960f\u4975\u74b1\ubcb0::\u2dcc\u4c2b\u3bc9\uc9f6\u4c04\u3e2a), and:int(ldc:int(6418), ldc:int(70))), invokestatic:Float[expected:Number](Float::valueOf, invokestatic:float(\u6bb9\ubefe\u183a\u92ee\uc3e3::\ua6bd\uff55\u5140\ud523\u120d\u3d64, p0:\u6bb9\ubefe\u183a\u92ee\uc3e3)))
            return:JsonElement(var_6_7D:JsonObject)
        }
        
        return:JsonElement(initobject:JsonPrimitive[expected:JsonElement](JsonPrimitive::<init>, invokestatic:Float[expected:Number](Float::valueOf, invokestatic:float(\u6bb9\ubefe\u183a\u92ee\uc3e3::\u392e\u946b\u67d0\u97b7\ud12e\u8d90, p0:\u6bb9\ubefe\u183a\u92ee\uc3e3))))
    }
    
    public java.lang.Object deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) {
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
            return:Object(invokevirtual:\u6bb9\ubefe\u183a\u92ee\uc3e3[expected:Object](\ub113\u960f\u4975\u74b1\ubcb0::deserialize, this:\ub113\u960f\u4975\u74b1\ubcb0, p0:JsonElement, p1:Type, p2:JsonDeserializationContext))
        }
        
        goto(Label_0006)
    }
    
    public com.google.gson.JsonElement serialize(java.lang.Object p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
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
            return:JsonElement(invokevirtual:JsonElement(\ub113\u960f\u4975\u74b1\ubcb0::serialize, this:\ub113\u960f\u4975\u74b1\ubcb0, checkcast:\u6bb9\ubefe\u183a\u92ee\uc3e3(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u6bb9\ubefe\u183a\u92ee\uc3e3.class, p0:Object[expected:\u6bb9\ubefe\u183a\u92ee\uc3e3]), p1:Type, p2:JsonSerializationContext))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_1F9_0 : byte[] [generated]
        stack_23D_0 : byte[] [generated]
        stack_2AD_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_18C : byte[]
        var_4_18D : int
        expr_98 : int [generated]
        var_5_1DC : int
        var_3_1E1 : byte[]
        var_4_1E2 : int
        var_0_233 : int
        expr_23D : byte [generated]
        stack_279_2 : byte [generated]
        stack_258_0 : byte [generated]
        expr_C3 : int [generated]
        expr_EE : int [generated]
        var_3_29C : byte[]
        var_4_29D : int
        expr_2B0 : byte [generated]
        var_3_11A : String
        stack_183_0 : String[] [generated]
        expr_12C : String[] [generated]
        
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
            var_0_5F = and:int(ldc:int(159930957), ldc:int(2140663742))
            expr_65 = var_2_69 = stack_96_0 = stack_98_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_10E_0 = stack_1F9_0 = stack_23D_0 = stack_2AD_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("F3yHS26bdFpgclJg"))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_18C = newarray:byte[](byte.class, expr_6D:int)
                var_4_18D = expr_6D:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-1449189754))
                    var_4_18D = add:int(var_4_18D:int, ldc:int(-1))
                    storeelement:byte(var_3_18C:byte[], var_4_18D:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_18D:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_18D:int, and:int(ldc:int(4133), ldc:int(12035)))), ldc:int(5)), and:int(ldc:int(29335), ldc:int(7)))))
                    
                    if (cmpne:boolean(var_4_18D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_10E_0 = stack_1F9_0 = stack_23D_0 = stack_2AD_0 = var_3_18C:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0243)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(256)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(635845023))
                    goto(Label_0200)
                }
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_0_5F = and:int(var_0_5F:int, ldc:int(-2002887716))
                expr_98 = arraylength:int(stack_98_0:byte[])
                
                if (cmpeq:boolean(expr_98:int, ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_5_1DC = expr_98:int
                var_3_1E1 = newarray:byte[](byte.class, expr_98:int)
                var_4_1E2 = expr_98:int
                Label_0484:
                
                while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-909505940))
                    var_4_1E2 = add:int(var_4_1E2:int, ldc:int(-1))
                    storeelement:byte(var_3_1E1:byte[], var_4_1E2:int, xor:byte(loadelement:byte(stack_1F9_0:byte[], var_4_1E2:int), ldc:byte(75)))
                    
                    if (cmpne:boolean(var_4_1E2:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_10E_0 = stack_1F9_0 = stack_23D_0 = stack_2AD_0 = var_3_1E1:byte[]
                    goto(Label_0157)
                }
                
                Label_0552:
                
                while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(33554432)), ldc:int(0))) {
                    var_0_233 = and:int(var_0_5F:int, ldc:int(-1882391683))
                    var_4_1E2 = add:int(var_4_1E2:int, ldc:int(-1))
                    expr_23D = stack_279_2 = loadelement(stack_23D_0, var_4_1E2)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1E2:int, ldc:int(5)), neg:int(var_5_1DC:int)), ldc:int(0))) {
                        stack_279_2 = stack_258_0 = add:byte(expr_23D:byte, loadelement:byte(var_3_1E1:byte[], add:int(var_4_1E2:int, ldc:int(5))))
                        goto(Label_0616)
                    }
                    
                    Label_0586:
                    
                    if (cmpne:boolean(and:int(var_0_233:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_233 = and:int(var_0_233:int, ldc:int(1271631615))
                        stack_279_2 = stack_258_0 = add:byte(expr_23D:byte, ldc:byte(5))
                    }
                    
                    Label_0616:
                    
                    if (cmpne:boolean(and:int(var_0_233:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    var_0_5F = and:int(var_0_233:int, ldc:int(445967349))
                    storeelement:byte(var_3_1E1:byte[], var_4_1E2:int, stack_279_2:byte)
                    
                    if (cmpne:boolean(var_4_1E2:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_10E_0 = stack_1F9_0 = stack_23D_0 = stack_2AD_0 = var_3_1E1:byte[]
                    goto(Label_0200)
                }
                
                goto(Label_0484)
                Label_0157:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1343116652))
                    goto(Label_0243)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(4)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-275514498))
                    expr_C3 = arraylength:int(stack_C3_0:byte[])
                    
                    if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                        var_5_1DC = expr_C3:int
                        var_3_1E1 = newarray:byte[](byte.class, expr_C3:int)
                        var_4_1E2 = expr_C3:int
                        goto(Label_0552)
                    }
                }
                
                Label_0200:
                
                if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(536870912)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_0_5F = and:int(var_0_5F:int, ldc:int(-1771334992))
                        loopcontinue()
                    }
                    
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1049385623))
                    expr_EE = arraylength:int(stack_EE_0:byte[])
                    
                    if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                        var_3_29C = newarray:byte[](byte.class, expr_EE:int)
                        var_4_29D = expr_EE:int
                        
                        loop {
                            var_0_5F = and:int(var_0_5F:int, ldc:int(-604743010))
                            var_4_29D = add:int(var_4_29D:int, ldc:int(-1))
                            expr_2B0 = add:byte(loadelement:byte(stack_2AD_0:byte[], var_4_29D:int), ldc:byte(121))
                            storeelement:byte(var_3_29C:byte[], var_4_29D:int, or:int(and:int(shl:int(expr_2B0:byte, xor:int(ldc:int(44), ldc:int(40))), ldc:int(-16)), and:int(shr:int(expr_2B0:byte[expected:int], and:int(ldc:int(22916), ldc:int(52))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_29D:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_10E_0 = stack_1F9_0 = stack_23D_0 = stack_2AD_0 = var_3_29C:byte[]
                    }
                }
                
                Label_0243:
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0200)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_11A = initobject:String(String::<init>, stack_10E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_183_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4353), ldc:int(4354)))
            expr_12C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(18693), ldc:int(18694)))
            storeelement:String(expr_12C:String[], and:int(ldc:int(66), ldc:int(10395)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(-18158), ldc:int(17125)), xor:int(ldc:int(4240), ldc:int(4243))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(12291), ldc:int(12290)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(20515), ldc:int(31)), and:int(ldc:int(2566), ldc:int(1399))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(11135), ldc:int(-12160)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(-31998), ldc:int(-31996)), and:int(ldc:int(14763), ldc:int(17419))))
            putstatic:String[](\ub113\u960f\u4975\u74b1\ubcb0::\u2dcc\u4c2b\u3bc9\uc9f6\u4c04\u3e2a, expr_12C:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u76bc\u40a9\u3776\u516c\uc229\u0c95(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F8 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_603 : int
        
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
        var_3_5F8 = and:int(ldc:int(816224853), ldc:int(-1700996361))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub113\u960f\u4975\u74b1\ubcb0[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(16)), ldc:int(0))) {
            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1389296369))
            var_5_7D = and:int(ldc:int(25716), ldc:int(-25717))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2698), ldc:int(2697)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_5F8:int, ldc:int(1507318461))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(16493), ldc:int(2433)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(1537), ldc:int(147)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_5F8 = and:int(var_3_CA:int, ldc:int(1049493369))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(12288), ldc:int(12289)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1062)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(565353550))
                        goto(Label_0910)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0774)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0543)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(868202589))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0543)
                            }
                            
                            goto(Label_0774)
                        }
                    }
                    
                    Label_0357:
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-53906406))
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1430349765))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-550889399))
                        goto(Label_1062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-792098516))
                        goto(Label_0910)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(241373197))
                        goto(Label_0774)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1932115599))
                        goto(Label_0670)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(419154890))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1351654821))
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1332437421))
                        var_11_DB = and:int(ldc:int(10296), ldc:int(-10297))
                        goto(Label_1440)
                    }
                    
                    Label_0543:
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(63467478))
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1064078051))
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1062)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0910)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(297785170))
                        goto(Label_0774)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1612175862))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1248081093))
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-706805965))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0774)
                        }
                    }
                    
                    Label_0670:
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1537243316))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1037573214))
                        goto(Label_1062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0910)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0543)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(816224853))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0774:
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1535959267))
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(268514770))
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1062)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1925464241))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(2009781203))
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1102712776))
                            goto(Label_0543)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(532696237))
                            goto(Label_0357)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1632780641))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(132), ldc:int(133))
                                goto(Label_1062)
                            }
                        }
                    }
                    
                    Label_0910:
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1851757150))
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-2136191151))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0774)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0670)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0543)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1289236946))
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(2007442088))
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1786340525))
                        var_11_DB = and:int(ldc:int(-22587), ldc:int(18474))
                    }
                    
                    Label_1062:
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-2046076194))
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1887992413))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0910)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0774)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1448919632))
                            goto(Label_0670)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1846067198))
                            goto(Label_0543)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1834215575))
                            goto(Label_0357)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1958739579))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1309)
                            }
                        }
                    }
                    
                    Label_1190:
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1062)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(566458818))
                            goto(Label_0910)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(876567707))
                            goto(Label_0774)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1276546212))
                            goto(Label_0670)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0543)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0357)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1107828879))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1440)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1309:
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(1312375513))
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1062)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1069719165))
                        goto(Label_0910)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0774)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0543)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-844315449))
                        goto(Label_0357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1685525212))
                        loopcontinue()
                    }
                    
                    var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1680867621))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1440:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_603 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1451:
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1309)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1062)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0910)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0774)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0670)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0543)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F8:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(-1574665778))
                        goto(Label_0357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F8 = and:int(var_3_5F8:int, ldc:int(351059313))
                        var_17_603 = add:int(var_16_109:int, and:int(ldc:int(1), ldc:int(1397)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5F8 = and:int(var_3_5F8:int, ldc:int(294575383))
                
                if (cmple:boolean(var_5_7D = var_17_603:int, sub:int(var_6_84:int, and:int(ldc:int(513), ldc:int(6369))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5F8:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
