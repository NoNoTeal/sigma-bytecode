public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u873d\ud171\u8c8a\u7d52\u67d0\u4975 {
    public void \u873d\ud171\u8c8a\u7d52\u67d0\u4975() {
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
            invokespecial:\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6(\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6::<init>, this:\u873d\ud171\u8c8a\u7d52\u67d0\u4975)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u4f52\u5654\u960f\u8389\u93a2\ub70c deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) {
        var_6_67 : JsonObject
        var_7_83 : \u4f52\u5654\u960f\u8389\u93a2\ub70c
        
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
            var_6_67 = invokevirtual:JsonObject(JsonElement::getAsJsonObject, p0:JsonElement)
            var_7_83 = initobject:\u4f52\u5654\u960f\u8389\u93a2\ub70c(\u4f52\u5654\u960f\u8389\u93a2\ub70c::<init>, invokevirtual:String(JsonElement::getAsString, invokevirtual:JsonElement(JsonObject::get, var_6_67:JsonObject, loadelement:String(getstatic:String[](\u873d\ud171\u8c8a\u7d52\u67d0\u4975::\u6bb9\u0b8e\ub113\uc2bd\u5d20\u6bb9), and:int(ldc:int(10650), ldc:int(-14779))))))
            invokevirtual:void(\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6::deserialize, this:\u873d\ud171\u8c8a\u7d52\u67d0\u4975[expected:\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6], var_6_67:JsonObject, var_7_83:\u4f52\u5654\u960f\u8389\u93a2\ub70c[expected:\u527a\u36d3\u8d90\u6ec6\u71ae\uc229], p2:JsonDeserializationContext)
            return:\u4f52\u5654\u960f\u8389\u93a2\ub70c(var_7_83:\u4f52\u5654\u960f\u8389\u93a2\ub70c)
        }
        
        goto(Label_0006)
    }
    
    public com.google.gson.JsonElement serialize(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u4f52\u5654\u960f\u8389\u93a2\ub70c p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
        var_6_6A : JsonObject
        
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
            var_6_6A = initobject:JsonObject(JsonObject::<init>)
            invokevirtual:void(\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6::serialize, this:\u873d\ud171\u8c8a\u7d52\u67d0\u4975[expected:\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6], var_6_6A:JsonObject, p0:\u4f52\u5654\u960f\u8389\u93a2\ub70c[expected:\u527a\u36d3\u8d90\u6ec6\u71ae\uc229], p2:JsonSerializationContext)
            invokevirtual:void(JsonObject::addProperty, var_6_6A:JsonObject, loadelement:String(getstatic:String[](\u873d\ud171\u8c8a\u7d52\u67d0\u4975::\u6bb9\u0b8e\ub113\uc2bd\u5d20\u6bb9), and:int(ldc:int(-1477), ldc:int(1476))), invokevirtual:String(\u4f52\u5654\u960f\u8389\u93a2\ub70c::\u927d\uc910\ufcaf\u4e72\u5bc4\uf995, p0:\u4f52\u5654\u960f\u8389\u93a2\ub70c))
            return:JsonElement(var_6_6A:JsonObject)
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
            return:JsonElement(invokevirtual:JsonElement(\u873d\ud171\u8c8a\u7d52\u67d0\u4975::serialize, this:\u873d\ud171\u8c8a\u7d52\u67d0\u4975, checkcast:\u4f52\u5654\u960f\u8389\u93a2\ub70c(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u4f52\u5654\u960f\u8389\u93a2\ub70c.class, p0:Object[expected:\u4f52\u5654\u960f\u8389\u93a2\ub70c]), p1:Type, p2:JsonSerializationContext))
        }
        
        goto(Label_0006)
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
            return:Object(invokevirtual:\u4f52\u5654\u960f\u8389\u93a2\ub70c[expected:Object](\u873d\ud171\u8c8a\u7d52\u67d0\u4975::deserialize, this:\u873d\ud171\u8c8a\u7d52\u67d0\u4975, p0:JsonElement, p1:Type, p2:JsonDeserializationContext))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_197 : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B9_0 : byte[] [generated]
        stack_BB_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_141_0 : byte[] [generated]
        stack_1A9_0 : byte[] [generated]
        stack_21E_0 : byte[] [generated]
        var_4_124 : int
        var_3_129 : byte[]
        var_5_12A : int
        expr_147 : byte [generated]
        var_0_19F : int
        expr_1A9 : byte [generated]
        stack_1ED_2 : byte [generated]
        stack_1CC_0 : byte [generated]
        expr_8F : int [generated]
        var_2_B9 : byte[]
        expr_BD : int [generated]
        var_3_20D : byte[]
        var_5_20E : int
        var_3_EA : String
        stack_11D_0 : String[] [generated]
        expr_FC : String[] [generated]
        
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
        var_0_197 = and:int(ldc:int(-1431460896), ldc:int(633271206))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_B9_0 = stack_BB_0 = stack_DE_0 = stack_141_0 = stack_1A9_0 = stack_21E_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("nblWSl5nHQt2")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_124 = expr_6B:int
        var_3_129 = newarray:byte[](byte.class, expr_6B:int)
        var_5_12A = expr_6B:int
        Label_0300:
        
        while (cmpeq:boolean(and:int(var_0_197:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_197 = and:int(var_0_197:int, ldc:int(721402029))
            var_5_12A = add:int(var_5_12A:int, ldc:int(-1))
            expr_147 = xor:byte(add:byte(loadelement:byte(stack_141_0:byte[], var_5_12A:int), ldc:byte(120)), ldc:byte(61))
            storeelement:byte(var_3_129:byte[], var_5_12A:int, or:int(and:int(shl:int(expr_147:byte, xor:int(ldc:int(-24558), ldc:int(-24554))), ldc:int(-16)), and:int(shr:int(expr_147:byte[expected:int], xor:int(ldc:int(1284), ldc:int(1280))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_12A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B9_0 = stack_BB_0 = stack_DE_0 = stack_141_0 = stack_1A9_0 = stack_21E_0 = var_3_129:byte[]
            goto(Label_0112)
        }
        
        Label_0396:
        
        while (cmpne:boolean(and:int(var_0_197:int, ldc:int(32)), ldc:int(0))) {
            var_0_19F = and:int(var_0_197:int, ldc:int(-1297290254))
            var_5_12A = add:int(var_5_12A:int, ldc:int(-1))
            expr_1A9 = stack_1ED_2 = loadelement(stack_1A9_0, var_5_12A)
            
            if (cmplt:boolean(add:int(add:int(var_5_12A:int, ldc:int(3)), neg:int(var_4_124:int)), ldc:int(0))) {
                stack_1ED_2 = stack_1CC_0 = add:byte(expr_1A9:byte, loadelement:byte(var_3_129:byte[], add:int(var_5_12A:int, ldc:int(3))))
                goto(Label_0476)
            }
            
            Label_0438:
            
            if (cmpne:boolean(and:int(var_0_19F:int, ldc:int(4096)), ldc:int(0))) {
                var_0_19F = and:int(var_0_19F:int, ldc:int(160421541))
            }
            else {
                var_0_19F = and:int(var_0_19F:int, ldc:int(637317562))
                stack_1ED_2 = stack_1CC_0 = add:byte(expr_1A9:byte, ldc:byte(3))
            }
            
            Label_0476:
            
            if (cmpeq:boolean(and:int(var_0_19F:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0438)
            }
            
            var_0_197 = and:int(var_0_19F:int, ldc:int(-138562139))
            storeelement:byte(var_3_129:byte[], var_5_12A:int, stack_1ED_2:byte)
            
            if (cmpne:boolean(var_5_12A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_B9_0 = stack_BB_0 = stack_DE_0 = stack_141_0 = stack_1A9_0 = stack_21E_0 = var_3_129:byte[]
            goto(Label_0148)
        }
        
        var_0_197 = and:int(var_0_197:int, ldc:int(-279512544))
        goto(Label_0300)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_197:int, ldc:int(32)), ldc:int(0))) {
            var_0_197 = and:int(var_0_197:int, ldc:int(1797074321))
            goto(Label_0194)
        }
        
        if (cmpne:boolean(and:int(var_0_197:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_197 = and:int(var_0_197:int, ldc:int(-1191396446))
            expr_8F = arraylength:int(stack_8F_0:byte[])
            
            if (cmpne:boolean(expr_8F:int, ldc:int(0))) {
                var_4_124 = expr_8F:int
                var_3_129 = newarray:byte[](byte.class, expr_8F:int)
                var_5_12A = expr_8F:int
                goto(Label_0396)
            }
        }
        
        Label_0148:
        
        if (cmpne:boolean(and:int(var_0_197:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_197 = and:int(var_0_197:int, ldc:int(-457994805))
        }
        else {
            if (cmpne:boolean(and:int(var_0_197:int, ldc:int(4)), ldc:int(0))) {
                var_0_197 = and:int(var_0_197:int, ldc:int(602499450))
                goto(Label_0112)
            }
            
            var_0_197 = and:int(var_0_197:int, ldc:int(1974248119))
            var_2_B9 = stack_B9_0:byte[]
            expr_BD = add:int(arraylength:int(stack_BB_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_BD:int, ldc:int(0))) {
                var_3_20D = newarray:byte[](byte.class, expr_BD:int)
                var_5_20E = expr_BD:int
                
                loop {
                    var_0_197 = and:int(var_0_197:int, ldc:int(767470073))
                    var_5_20E = add:int(var_5_20E:int, ldc:int(-1))
                    storeelement:byte(var_3_20D:byte[], var_5_20E:int, add:int(shl:int(loadelement:byte(stack_21E_0:byte[], var_5_20E:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_B9:byte[], add:int(var_5_20E:int, xor:int(ldc:int(-31739), ldc:int(-31740)))), ldc:int(5)), and:int(ldc:int(16407), ldc:int(14471)))))
                    
                    if (cmpne:boolean(var_5_20E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B9_0 = stack_BB_0 = stack_DE_0 = stack_141_0 = stack_1A9_0 = stack_21E_0 = var_3_20D:byte[]
            }
        }
        
        Label_0194:
        
        if (cmpne:boolean(and:int(var_0_197:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_197 = and:int(var_0_197:int, ldc:int(275616927))
            goto(Label_0148)
        }
        
        if (cmpne:boolean(and:int(var_0_197:int, ldc:int(8192)), ldc:int(0))) {
            var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_11D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(361), ldc:int(19601)))
            expr_FC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1091), ldc:int(513)))
            storeelement:String(expr_FC:String[], and:int(ldc:int(438), ldc:int(-4535)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(161), ldc:int(-162)), and:int(ldc:int(1482), ldc:int(44))))
            putstatic:String[](\u873d\ud171\u8c8a\u7d52\u67d0\u4975::\u6bb9\u0b8e\ub113\uc2bd\u5d20\u6bb9, expr_FC:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u071d\u836c\u3776\u7e3f\u74b1\uc87f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_641 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_64C : int
        
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
        var_3_641 = and:int(ldc:int(952039646), ldc:int(-21464114))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u873d\ud171\u8c8a\u7d52\u67d0\u4975[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
            var_3_641 = and:int(var_3_641:int, ldc:int(1325190350))
            var_5_7D = and:int(ldc:int(-3825), ldc:int(3696))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(12807), ldc:int(-13832)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_641:int, ldc:int(-1762213410))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(8385), ldc:int(8384)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(20576), ldc:int(20577)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_641 = and:int(var_3_D2:int, ldc:int(2008874190))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(593), ldc:int(17671)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1151326908))
                        goto(Label_1327)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1064)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(141500830))
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(467838423))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(256)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1561383548))
                    }
                    else {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1582107393))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1064)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1649152786))
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(640903471))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(256)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(2092660959))
                            var_11_E3 = and:int(ldc:int(21523), ldc:int(-23896))
                            goto(Label_1475)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0525:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1581505844))
                        goto(Label_1327)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-849411746))
                        goto(Label_1064)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1492572820))
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1095023382))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(2008593062))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1102029059))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(1320838639))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0652:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1228265164))
                        goto(Label_1327)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-842194242))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1554852788))
                        goto(Label_1064)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(772788451))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-2085951662))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(1287281151))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1293329494))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-731300678))
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(243187658))
                        goto(Label_1064)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(142886367))
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(54274679))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-1080811043))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(1945303758))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(18693), ldc:int(43))
                                goto(Label_1064)
                            }
                        }
                    }
                    
                    Label_0912:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-574999402))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-284825485))
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(140214730))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(256)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1749501778))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1979912498))
                        var_11_E3 = and:int(ldc:int(-27498), ldc:int(27488))
                    }
                    
                    Label_1064:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(2018600755))
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-2065075509))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0912)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-870367317))
                            goto(Label_0652)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-2065665001))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(459229016))
                            loopcontinue()
                        }
                        
                        var_3_641 = and:int(var_3_641:int, ldc:int(465367247))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1327)
                            }
                        }
                    }
                    
                    Label_1191:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(4)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1643484667))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(-860532755))
                            goto(Label_1064)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0912)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(256)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1897119561))
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0652)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1822977680))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(798893033))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                            var_3_641 = and:int(var_3_641:int, ldc:int(1606117103))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                            goto(Label_1475)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1327:
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(223120019))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1518469975))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1010956904))
                        goto(Label_1064)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(650239904))
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-190052451))
                        goto(Label_0652)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(665804770))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(64)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_641 = and:int(var_3_641:int, ldc:int(871727070))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1475:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_64C = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1486:
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1327)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1064)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-661926035))
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(108418783))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_641:int, ldc:int(256)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(-1547575206))
                        goto(Label_0652)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(208779631))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(128)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(607293151))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_641:int, ldc:int(256)), ldc:int(0))) {
                        var_3_641 = and:int(var_3_641:int, ldc:int(1157560542))
                        var_17_64C = add:int(var_16_111:int, xor:int(ldc:int(-28660), ldc:int(-28659)))
                        looporswitchbreak()
                    }
                }
                
                var_3_641 = and:int(var_3_641:int, ldc:int(-721584385))
                
                if (cmple:boolean(var_5_7D = var_17_64C:int, sub:int(var_6_84:int, xor:int(ldc:int(20492), ldc:int(20493))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_641:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_641 = and:int(var_3_641:int, ldc:int(-262161691))
            goto(Label_0106)
        }
    }
}
