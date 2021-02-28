public class \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u8258\u624e\uae87\ud12e\ucef1 {
    public void \u8258\u624e\uae87\ud12e\ucef1() {
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
            invokespecial:Object(Object::<init>, this:\u8258\u624e\uae87\ud12e\ucef1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\u4daf\ub70c\ubded\ub19c\u0b8e deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) {
        var_6_72 : JsonObject
        
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
            var_6_72 = invokestatic:JsonObject(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u51fa\u9af2\u718f\u3bc9\ud217\ub18d, p0:JsonElement, loadelement:String(getstatic:String[](\u8258\u624e\uae87\ud12e\ucef1::\u5f50\u0c95\u0800\ubcb0\ubefe\u8258), and:int(ldc:int(-9137), ldc:int(9136))))
            return:\u4daf\ub70c\ubded\ub19c\u0b8e(initobject:\u4daf\ub70c\ubded\ub19c\u0b8e(\u4daf\ub70c\ubded\ub19c\u0b8e::<init>, invokestatic:String(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u72f1\uae5d\u3504\u64f2\u759a\u5654, var_6_72:JsonObject, loadelement:String(getstatic:String[](\u8258\u624e\uae87\ud12e\ucef1::\u5f50\u0c95\u0800\ubcb0\ubefe\u8258), xor:int(ldc:int(17408), ldc:int(17409)))), invokestatic:int(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u4e72\u4f4a\u6c52\u446c\u97b7\uae5d, var_6_72:JsonObject, loadelement:String(getstatic:String[](\u8258\u624e\uae87\ud12e\ucef1::\u5f50\u0c95\u0800\ubcb0\ubefe\u8258), xor:int(ldc:int(4244), ldc:int(4246))))))
        }
        
        goto(Label_0006)
    }
    
    public com.google.gson.JsonElement serialize(\u5d20\u97b7\u8753\u873d\u16f6.\u4daf\ub70c\ubded\ub19c\u0b8e p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
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
            invokevirtual:void(JsonObject::addProperty, var_6_6A:JsonObject, loadelement:String(getstatic:String[](\u8258\u624e\uae87\ud12e\ucef1::\u5f50\u0c95\u0800\ubcb0\ubefe\u8258), xor:int(ldc:int(17456), ldc:int(17457))), invokevirtual:String(\u4daf\ub70c\ubded\ub19c\u0b8e::\uc84e\u67e9\u446c\u5f50\u983f\u3bc9, p0:\u4daf\ub70c\ubded\ub19c\u0b8e))
            invokevirtual:void(JsonObject::addProperty, var_6_6A:JsonObject, loadelement:String(getstatic:String[](\u8258\u624e\uae87\ud12e\ucef1::\u5f50\u0c95\u0800\ubcb0\ubefe\u8258), xor:int(ldc:int(1920), ldc:int(1922))), invokestatic:Integer[expected:Number](Integer::valueOf, invokevirtual:int(\u4daf\ub70c\ubded\ub19c\u0b8e::\u965f\ube23\u839e\u2dcc\u3bc9\u8389, p0:\u4daf\ub70c\ubded\ub19c\u0b8e)))
            return:JsonElement(var_6_6A:JsonObject)
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
            return:Object(invokevirtual:\u4daf\ub70c\ubded\ub19c\u0b8e[expected:Object](\u8258\u624e\uae87\ud12e\ucef1::deserialize, this:\u8258\u624e\uae87\ud12e\ucef1, p0:JsonElement, p1:Type, p2:JsonDeserializationContext))
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
            return:JsonElement(invokevirtual:JsonElement(\u8258\u624e\uae87\ud12e\ucef1::serialize, this:\u8258\u624e\uae87\ud12e\ucef1, checkcast:\u4daf\ub70c\ubded\ub19c\u0b8e(\u5d20\u97b7\u8753\u873d\u16f6.\u4daf\ub70c\ubded\ub19c\u0b8e.class, p0:Object[expected:\u4daf\ub70c\ubded\ub19c\u0b8e]), p1:Type, p2:JsonSerializationContext))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_15D : int
        expr_6B : int [generated]
        stack_85_0 : byte[] [generated]
        stack_87_0 : byte[] [generated]
        stack_AB_0 : byte[] [generated]
        stack_AD_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_16F_0 : byte[] [generated]
        stack_1C5_0 : byte[] [generated]
        stack_229_0 : byte[] [generated]
        var_4_14A : int
        var_3_14F : byte[]
        var_5_150 : int
        expr_175 : byte [generated]
        var_0_21F : int
        expr_229 : byte [generated]
        stack_257_2 : byte [generated]
        var_2_85 : byte[]
        expr_89 : int [generated]
        var_3_1B4 : byte[]
        var_5_1B5 : int
        expr_AD : int [generated]
        var_3_DA : String
        stack_143_0 : String[] [generated]
        expr_EC : String[] [generated]
        
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
        var_0_15D = and:int(ldc:int(-1497555385), ldc:int(-283594913))
        expr_6B = arraylength:int(stack_85_0 = stack_87_0 = stack_AB_0 = stack_AD_0 = stack_CE_0 = stack_16F_0 = stack_1C5_0 = stack_229_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("jH6NjltbXVyUk46PY49W+P33AWI=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_14A = expr_6B:int
        var_3_14F = newarray:byte[](byte.class, expr_6B:int)
        var_5_150 = expr_6B:int
        Label_0338:
        
        while (cmpne:boolean(and:int(var_0_15D:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_15D = and:int(var_0_15D:int, ldc:int(-423752081))
            var_5_150 = add:int(var_5_150:int, ldc:int(-1))
            expr_175 = xor:byte(add:byte(loadelement:byte(stack_16F_0:byte[], var_5_150:int), ldc:byte(11)), ldc:byte(103))
            storeelement:byte(var_3_14F:byte[], var_5_150:int, or:int(and:int(shl:int(expr_175:byte, xor:int(ldc:int(8260), ldc:int(8256))), ldc:int(-16)), and:int(shr:int(expr_175:byte[expected:int], and:int(ldc:int(17285), ldc:int(1062))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_150:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_87_0 = stack_85_0 = stack_AB_0 = stack_AD_0 = stack_CE_0 = stack_16F_0 = stack_1C5_0 = stack_229_0 = var_3_14F:byte[]
            goto(Label_0112)
        }
        
        var_0_15D = and:int(var_0_15D:int, ldc:int(1512230237))
        Label_0524:
        
        while (cmpne:boolean(and:int(var_0_15D:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_21F = and:int(var_0_15D:int, ldc:int(2138269399))
            var_5_150 = add:int(var_5_150:int, ldc:int(-1))
            expr_229 = loadelement:byte(stack_229_0:byte[], var_5_150:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_150:int, ldc:int(4)), neg:int(var_4_14A:int)), ldc:int(0))) {
                var_0_21F = and:int(var_0_21F:int, ldc:int(928132727))
                stack_257_2 = add:byte(expr_229:byte, ldc:byte(4))
            }
            else {
                stack_257_2 = add:byte(expr_229:byte, loadelement:byte(var_3_14F:byte[], add:int(var_5_150:int, ldc:int(4))))
            }
            
            var_0_15D = and:int(var_0_21F:int, ldc:int(-286169177))
            storeelement:byte(var_3_14F:byte[], var_5_150:int, stack_257_2:byte)
            
            if (cmpne:boolean(var_5_150:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_87_0 = stack_85_0 = stack_AB_0 = stack_AD_0 = stack_CE_0 = stack_16F_0 = stack_1C5_0 = stack_229_0 = var_3_14F:byte[]
            goto(Label_0178)
        }
        
        var_0_15D = and:int(var_0_15D:int, ldc:int(65622735))
        goto(Label_0338)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_15D:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0178)
        }
        
        if (cmpne:boolean(and:int(var_0_15D:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_15D = and:int(var_0_15D:int, ldc:int(909446879))
            var_2_85 = stack_85_0:byte[]
            expr_89 = add:int(arraylength:int(stack_87_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_89:int, ldc:int(0))) {
                var_3_1B4 = newarray:byte[](byte.class, expr_89:int)
                var_5_1B5 = expr_89:int
                
                loop {
                    var_0_15D = and:int(var_0_15D:int, ldc:int(-1096882353))
                    var_5_1B5 = add:int(var_5_1B5:int, ldc:int(-1))
                    storeelement:byte(var_3_1B4:byte[], var_5_1B5:int, add:int(shl:int(loadelement:byte(stack_1C5_0:byte[], var_5_1B5:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_85:byte[], add:int(var_5_1B5:int, and:int(ldc:int(3661), ldc:int(35)))), ldc:int(4)), xor:int(ldc:int(68), ldc:int(75)))))
                    
                    if (cmpne:boolean(var_5_1B5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_87_0 = stack_85_0 = stack_AB_0 = stack_AD_0 = stack_CE_0 = stack_16F_0 = stack_1C5_0 = stack_229_0 = var_3_1B4:byte[]
            }
        }
        
        Label_0142:
        
        if (cmpeq:boolean(and:int(var_0_15D:int, ldc:int(8)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_15D:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_15D = and:int(var_0_15D:int, ldc:int(-1927090640))
                goto(Label_0112)
            }
            
            var_0_15D = and:int(var_0_15D:int, ldc:int(-1088645393))
            expr_AD = arraylength:int(stack_AD_0:byte[])
            
            if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                var_4_14A = expr_AD:int
                var_3_14F = newarray:byte[](byte.class, expr_AD:int)
                var_5_150 = expr_AD:int
                goto(Label_0524)
            }
        }
        
        Label_0178:
        
        if (cmpne:boolean(and:int(var_0_15D:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_15D = and:int(var_0_15D:int, ldc:int(846050653))
            goto(Label_0142)
        }
        
        if (cmpeq:boolean(and:int(var_0_15D:int, ldc:int(256)), ldc:int(0))) {
            var_3_DA = initobject:String(String::<init>, stack_CE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_143_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(791), ldc:int(26627)))
            expr_EC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2467), ldc:int(4103)))
            storeelement:String(expr_EC:String[], and:int(ldc:int(9393), ldc:int(16385)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(-15187), ldc:int(14658)), and:int(ldc:int(24646), ldc:int(4653))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(3586), ldc:int(4130)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(78), ldc:int(1412)), and:int(ldc:int(8812), ldc:int(17437))))
            storeelement:String(expr_EC:String[], and:int(ldc:int(18258), ldc:int(-18291)), invokevirtual:String[expected:String](String::substring, var_3_DA:String, and:int(ldc:int(6684), ldc:int(1038)), and:int(ldc:int(23), ldc:int(5275))))
            putstatic:String[](\u8258\u624e\uae87\ud12e\ucef1::\u5f50\u0c95\u0800\ubcb0\ubefe\u8258, expr_EC:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \ub83f\u56bd\ud158\u5db4\uf9c5\u5245(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5DC : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5E7 : int
        
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
        var_3_5DC = and:int(ldc:int(1158255667), ldc:int(2006687231))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8258\u624e\uae87\ud12e\ucef1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_5DC = and:int(var_3_5DC:int, ldc:int(1926096435))
            var_5_7D = and:int(ldc:int(9426), ldc:int(-11739))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-23523), ldc:int(23456)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5DC:int, ldc:int(-1625209413))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, xor:int(ldc:int(16392), ldc:int(16393)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(65), ldc:int(64)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5DC = and:int(var_3_D2:int, ldc:int(-430445122))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(24833), ldc:int(1041)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(541847592))
                        goto(Label_1245)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-817180300))
                        goto(Label_0892)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0791)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-597383370))
                    }
                    else {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1588043258))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0791)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1137638256))
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-876420499))
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1733203596))
                        goto(Label_0892)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(213209098))
                        goto(Label_0791)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(494904922))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(2157650))
                            loopcontinue()
                        }
                        
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-901538693))
                        var_11_E3 = and:int(ldc:int(-25137), ldc:int(25136))
                        goto(Label_1373)
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1245)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-29775170))
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0892)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-923107988))
                        goto(Label_0791)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(1590628738))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(368026123))
                            loopcontinue()
                        }
                        
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1973952842))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0791)
                        }
                    }
                    
                    Label_0660:
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1255895593))
                        goto(Label_1245)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-298080968))
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1611808347))
                        goto(Label_0892)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-2029068543))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(116228143))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1845982847))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0791:
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1245)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1696623217))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-375890195))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(621088187))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = and:int(ldc:int(6169), ldc:int(8705))
                                goto(Label_1027)
                            }
                        }
                    }
                    
                    Label_0892:
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(512)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1904990939))
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1888896241))
                        goto(Label_1125)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0791)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1360048130))
                        var_11_E3 = and:int(ldc:int(7946), ldc:int(-7963))
                    }
                    
                    Label_1027:
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(161304010))
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1245)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0892)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0791)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0660)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-800909712))
                            loopcontinue()
                        }
                        
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(687720123))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1245)
                            }
                        }
                    }
                    
                    Label_1125:
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1384)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(4)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-517237935))
                            goto(Label_1027)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0892)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0791)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-248291158))
                            goto(Label_0660)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1343894410))
                            loopcontinue()
                        }
                        
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(998731003))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1373)
                    }
                    
                    Label_1245:
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1676841194))
                        goto(Label_1384)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(582700200))
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0892)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-209021285))
                        goto(Label_0791)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1529765660))
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1848252870))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1373:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5E7 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1384:
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1245)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1669090065))
                        goto(Label_1125)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1027)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-2124559442))
                        goto(Label_0892)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(138134987))
                        goto(Label_0791)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(-1006230292))
                        goto(Label_0660)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(1070158196))
                        goto(Label_0381)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5DC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5DC = and:int(var_3_5DC:int, ldc:int(146783999))
                        var_17_5E7 = add:int(var_16_111:int, and:int(ldc:int(1045), ldc:int(16417)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5DC = and:int(var_3_5DC:int, ldc:int(1736045690))
                
                if (cmple:boolean(var_5_7D = var_17_5E7:int, sub:int(var_6_84:int, xor:int(ldc:int(8716), ldc:int(8717))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_5DC:int, ldc:int(262144)), ldc:int(0))) {
            var_3_5DC = and:int(var_3_5DC:int, ldc:int(1802388480))
            goto(Label_0106)
        }
    }
}
