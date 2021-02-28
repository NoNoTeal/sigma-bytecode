public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u8640\ubded\u8d98\ucb79\u3c25\u7ce1 {
    public void \u8640\ubded\u8d98\ucb79\u3c25\u7ce1() {
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
            invokespecial:\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6(\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6::<init>, this:\u8640\ubded\u8d98\ucb79\u3c25\u7ce1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \ub113\ufcaf\u3c25\u071d\u97b7.\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) {
        var_6_6A : \u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e
        var_7_70 : JsonObject
        
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
            var_6_6A = initobject:\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e(\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e::<init>)
            var_7_70 = invokevirtual:JsonObject(JsonElement::getAsJsonObject, p0:JsonElement)
            invokevirtual:void(\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6::deserialize, this:\u8640\ubded\u8d98\ucb79\u3c25\u7ce1[expected:\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6], var_7_70:JsonObject, var_6_6A:\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e[expected:\u527a\u36d3\u8d90\u6ec6\u71ae\uc229], p2:JsonDeserializationContext)
            invokevirtual:void(\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e::\u8413\u416d\u7d52\ud51e\u3d4b\uc29a, var_6_6A:\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e, invokevirtual:String(JsonElement::getAsString, invokevirtual:JsonElement(JsonObject::get, var_7_70:JsonObject, loadelement:String(getstatic:String[](\u8640\ubded\u8d98\ucb79\u3c25\u7ce1::\u8df4\u4cd9\ud7e8\u7d52\u7330\u7d52), and:int(ldc:int(11169), ldc:int(-15272))))))
            
            if (invokevirtual:boolean(JsonObject::has, var_7_70:JsonObject, loadelement:String(getstatic:String[](\u8640\ubded\u8d98\ucb79\u3c25\u7ce1::\u8df4\u4cd9\ud7e8\u7d52\u7330\u7d52), and:int(ldc:int(12451), ldc:int(16977))))) {
                invokevirtual:void(\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e::\u61a4\u9255\uc87f\ud7e8\uc910\u69d9, var_6_6A:\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e, invokestatic:List<\u527a\u36d3\u8d90\u6ec6\u71ae\uc229>(Arrays::asList, checkcast:\u527a\u36d3\u8d90\u6ec6\u71ae\uc229[](\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u36d3\u8d90\u6ec6\u71ae\uc229[].class, checkcast:\u527a\u36d3\u8d90\u6ec6\u71ae\uc229[](\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u36d3\u8d90\u6ec6\u71ae\uc229[].class, invokeinterface:Object(JsonDeserializationContext::deserialize, p2:JsonDeserializationContext, invokevirtual:JsonElement(JsonObject::get, var_7_70:JsonObject, loadelement:String(getstatic:String[](\u8640\ubded\u8d98\ucb79\u3c25\u7ce1::\u8df4\u4cd9\ud7e8\u7d52\u7330\u7d52), xor:int(ldc:int(8580), ldc:int(8581)))), ldc:Class<\u527a\u36d3\u8d90\u6ec6\u71ae\uc229[]>[expected:Type](\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u527a\u36d3\u8d90\u6ec6\u71ae\uc229[].class))))))
            }
            
            return:\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e(var_6_6A:\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e)
        }
        
        goto(Label_0006)
    }
    
    public com.google.gson.JsonElement serialize(\ub113\ufcaf\u3c25\u071d\u97b7.\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
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
            invokevirtual:void(\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6::serialize, this:\u8640\ubded\u8d98\ucb79\u3c25\u7ce1[expected:\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6], var_6_6A:JsonObject, p0:\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e[expected:\u527a\u36d3\u8d90\u6ec6\u71ae\uc229], p2:JsonSerializationContext)
            invokevirtual:void(JsonObject::addProperty, var_6_6A:JsonObject, loadelement:String(getstatic:String[](\u8640\ubded\u8d98\ucb79\u3c25\u7ce1::\u8df4\u4cd9\ud7e8\u7d52\u7330\u7d52), and:int(ldc:int(-24616), ldc:int(24614))), invokevirtual:String(\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e::\u983f\uc9f6\u416d\u5654\u4c2b\u98a4, p0:\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e))
            
            if (cmpne:boolean(invokevirtual:List<\u527a\u36d3\u8d90\u6ec6\u71ae\uc229>(\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e::\u69d9\ua61f\u67d0\u1187\u9af2\u4d85, p0:\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e), aconstnull:List<\u527a\u36d3\u8d90\u6ec6\u71ae\uc229>())) {
                invokevirtual:void(JsonObject::add, var_6_6A:JsonObject, loadelement:String(getstatic:String[](\u8640\ubded\u8d98\ucb79\u3c25\u7ce1::\u8df4\u4cd9\ud7e8\u7d52\u7330\u7d52), xor:int(ldc:int(4124), ldc:int(4125))), invokeinterface:JsonElement(JsonSerializationContext::serialize, p2:JsonSerializationContext, invokevirtual:List<\u527a\u36d3\u8d90\u6ec6\u71ae\uc229>[expected:Object](\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e::\u69d9\ua61f\u67d0\u1187\u9af2\u4d85, p0:\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e)))
            }
            
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
            return:JsonElement(invokevirtual:JsonElement(\u8640\ubded\u8d98\ucb79\u3c25\u7ce1::serialize, this:\u8640\ubded\u8d98\ucb79\u3c25\u7ce1, checkcast:\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e(\ub113\ufcaf\u3c25\u071d\u97b7.\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e.class, p0:Object[expected:\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e]), p1:Type, p2:JsonSerializationContext))
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
            return:Object(invokevirtual:\u4c2b\u983f\ubcb0\u8c8a\u12cb\uc84e[expected:Object](\u8640\ubded\u8d98\ucb79\u3c25\u7ce1::deserialize, this:\u8640\ubded\u8d98\ucb79\u3c25\u7ce1, p0:JsonElement, p1:Type, p2:JsonDeserializationContext))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_7B : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1A4_0 : byte[] [generated]
        stack_223_0 : byte[] [generated]
        stack_276_0 : byte[] [generated]
        stack_2CB_0 : byte[] [generated]
        var_4_187 : int
        var_3_18C : byte[]
        var_5_18D : int
        var_0_19A : int
        expr_1A4 : byte [generated]
        stack_1E8_2 : byte [generated]
        stack_1C7_0 : byte [generated]
        expr_223 : byte [generated]
        expr_9E : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_265 : byte[]
        var_5_266 : int
        expr_EE : int [generated]
        var_3_2BA : byte[]
        var_5_2BB : int
        var_3_132 : String
        stack_180_0 : String[] [generated]
        expr_144 : String[] [generated]
        
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
        var_0_7B = and:int(ldc:int(1707902391), ldc:int(-94384713))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_126_0 = stack_1A4_0 = stack_223_0 = stack_276_0 = stack_2CB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AuY/1f3/JxrrEd9TPmI=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_187 = expr_6B:int
        var_3_18C = newarray:byte[](byte.class, expr_6B:int)
        var_5_18D = expr_6B:int
        Label_0399:
        
        while (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(65536)), ldc:int(0))) {
            var_0_19A = and:int(var_0_7B:int, ldc:int(-1603885169))
            var_5_18D = add:int(var_5_18D:int, ldc:int(-1))
            expr_1A4 = stack_1E8_2 = loadelement(stack_1A4_0, var_5_18D)
            
            if (cmplt:boolean(add:int(add:int(var_5_18D:int, ldc:int(3)), neg:int(var_4_187:int)), ldc:int(0))) {
                stack_1E8_2 = stack_1C7_0 = add:byte(expr_1A4:byte, loadelement:byte(var_3_18C:byte[], add:int(var_5_18D:int, ldc:int(3))))
                goto(Label_0471)
            }
            
            Label_0433:
            
            if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(128)), ldc:int(0))) {
                var_0_19A = and:int(var_0_19A:int, ldc:int(2002636349))
            }
            else {
                var_0_19A = and:int(var_0_19A:int, ldc:int(2133786079))
                stack_1E8_2 = stack_1C7_0 = add:byte(expr_1A4:byte, ldc:byte(3))
            }
            
            Label_0471:
            
            if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0433)
            }
            
            var_0_7B = and:int(var_0_19A:int, ldc:int(1053613471))
            storeelement:byte(var_3_18C:byte[], var_5_18D:int, stack_1E8_2:byte)
            
            if (cmpne:boolean(var_5_18D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_126_0 = stack_1A4_0 = stack_223_0 = stack_276_0 = stack_2CB_0 = var_3_18C:byte[]
            goto(Label_0112)
        }
        
        Label_0526:
        
        while (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(8)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(1896335299))
            var_5_18D = add:int(var_5_18D:int, ldc:int(-1))
            expr_223 = loadelement:byte(stack_223_0:byte[], var_5_18D:int)
            storeelement:byte(var_3_18C:byte[], var_5_18D:int, xor:int(or:int(and:int(shl:int(expr_223:byte, and:int(ldc:int(9708), ldc:int(4))), ldc:int(-16)), and:int(shr:int(expr_223:byte[expected:int], and:int(ldc:int(20654), ldc:int(68))), ldc:int(15))), ldc:int(6)))
            
            if (cmpne:boolean(var_5_18D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_126_0 = stack_1A4_0 = stack_223_0 = stack_276_0 = stack_2CB_0 = var_3_18C:byte[]
            goto(Label_0163)
        }
        
        goto(Label_0399)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(1216286696))
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(2025847894))
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(262144)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(611634657))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_187 = expr_9E:int
                var_3_18C = newarray:byte[](byte.class, expr_9E:int)
                var_5_18D = expr_9E:int
                goto(Label_0526)
            }
        }
        
        Label_0163:
        
        if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_7B = and:int(var_0_7B:int, ldc:int(-1437143561))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_265 = newarray:byte[](byte.class, expr_C3:int)
                var_5_266 = expr_C3:int
                
                loop {
                    var_0_7B = and:int(var_0_7B:int, ldc:int(-241320533))
                    var_5_266 = add:int(var_5_266:int, ldc:int(-1))
                    storeelement:byte(var_3_265:byte[], var_5_266:int, add:int(shl:int(loadelement:byte(stack_276_0:byte[], var_5_266:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_266:int, and:int(ldc:int(14977), ldc:int(73)))), ldc:int(4)), and:int(ldc:int(31), ldc:int(9775)))))
                    
                    if (cmpne:boolean(var_5_266:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_126_0 = stack_1A4_0 = stack_223_0 = stack_276_0 = stack_2CB_0 = var_3_265:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(64)), ldc:int(0))) {
                var_0_7B = and:int(var_0_7B:int, ldc:int(1902166200))
                goto(Label_0112)
            }
            
            var_0_7B = and:int(var_0_7B:int, ldc:int(746030551))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_2BA = newarray:byte[](byte.class, expr_EE:int)
                var_5_2BB = expr_EE:int
                
                loop {
                    var_0_7B = and:int(var_0_7B:int, ldc:int(1978636181))
                    var_5_2BB = add:int(var_5_2BB:int, ldc:int(-1))
                    storeelement:byte(var_3_2BA:byte[], var_5_2BB:int, add:byte(loadelement:byte(stack_2CB_0:byte[], var_5_2BB:int), ldc:byte(67)))
                    
                    if (cmpne:boolean(var_5_2BB:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_BF_0 = stack_C1_0 = stack_EC_0 = stack_EE_0 = stack_126_0 = stack_1A4_0 = stack_223_0 = stack_276_0 = stack_2CB_0 = var_3_2BA:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(262144)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(-1723623600))
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_7B:int, ldc:int(8)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(-274184895))
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_7B:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_7B = and:int(var_0_7B:int, ldc:int(-1123911872))
            goto(Label_0112)
        }
        
        var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_180_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-28635), ldc:int(-28633)))
        expr_144 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(10306), ldc:int(19)))
        storeelement:String(expr_144:String[], and:int(ldc:int(10566), ldc:int(-10567)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(18488), ldc:int(-18489)), xor:int(ldc:int(9258), ldc:int(9251))))
        storeelement:String(expr_144:String[], xor:int(ldc:int(4304), ldc:int(4305)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(3865), ldc:int(20591)), and:int(ldc:int(591), ldc:int(12573))))
        putstatic:String[](\u8640\ubded\u8d98\ucb79\u3c25\u7ce1::\u8df4\u4cd9\ud7e8\u7d52\u7330\u7d52, expr_144:String[])
    }
    
    public void \u071d\u836c\u3776\u7e3f\u74b1\uc87f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_668 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_673 : int
        
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
        var_3_668 = and:int(ldc:int(1049903571), ldc:int(-1078146109))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8640\ubded\u8d98\ucb79\u3c25\u7ce1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
            var_3_668 = and:int(var_3_668:int, ldc:int(1941296619))
            var_5_7D = and:int(ldc:int(-9196), ldc:int(8675))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-31785), ldc:int(31776)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_668:int, ldc:int(-1428369557))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(16409), ldc:int(16408)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(17444), ldc:int(17445)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_668 = and:int(var_3_CA:int, ldc:int(721182195))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(-32724), ldc:int(-32723)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(272709185))
                        goto(Label_1121)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-338299747))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(312017147))
                        goto(Label_0546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(786332103))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0546)
                            }
                            
                            goto(Label_0823)
                        }
                    }
                    
                    Label_0383:
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(39890788))
                        goto(Label_1250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1157546167))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1975521858))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-1904801767))
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(999675903))
                        var_11_DB = and:int(ldc:int(-1094), ldc:int(1093))
                        goto(Label_1518)
                    }
                    
                    Label_0546:
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(740868926))
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1219120696))
                        goto(Label_1250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-427379222))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1314918786))
                        goto(Label_0823)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0383)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1210096149))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0823)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(179917086))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(119204588))
                        goto(Label_1250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-278270135))
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1944572663))
                        goto(Label_0964)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-511390995))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(2129990148))
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0383)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-108750567))
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(-335712809))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0823:
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(32)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(2076724419))
                        goto(Label_1394)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1876431027))
                        goto(Label_1121)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(32)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-86743529))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-1314286968))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(1788017781))
                            goto(Label_0546)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-1772838763))
                            goto(Label_0383)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(1056358779))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(3105), ldc:int(85))
                                goto(Label_1121)
                            }
                        }
                    }
                    
                    Label_0964:
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1345636179))
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1738722577))
                        goto(Label_1250)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0823)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-1710606520))
                            goto(Label_0546)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(1472104207))
                            goto(Label_0383)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(601782227))
                        var_11_DB = and:int(ldc:int(26889), ldc:int(-26890))
                    }
                    
                    Label_1121:
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1364440078))
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(256)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(633085622))
                            goto(Label_0964)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0823)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(1304705593))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(8)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(30796811))
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0383)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-723930731))
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(1874259963))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1394)
                            }
                        }
                    }
                    
                    Label_1250:
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(701715339))
                            goto(Label_1121)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0964)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0823)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(32)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(786493451))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(256)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(2022369380))
                            goto(Label_0546)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-1135444637))
                            goto(Label_0383)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4)), ldc:int(0))) {
                            var_3_668 = and:int(var_3_668:int, ldc:int(-807076312))
                            loopcontinue()
                        }
                        
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1224981177))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1518)
                    }
                    
                    Label_1394:
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1529)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1250)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(329959117))
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(1123977633))
                        goto(Label_0823)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1093782836))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_668 = and:int(var_3_668:int, ldc:int(-1162395305))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1518:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_673 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1529:
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-89730617))
                        goto(Label_1250)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(1)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1249231017))
                        goto(Label_1121)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(4)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(-1087005636))
                        goto(Label_0964)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0823)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_668:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(769584828))
                        goto(Label_0383)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_668 = and:int(var_3_668:int, ldc:int(670364023))
                        var_17_673 = add:int(var_16_109:int, and:int(ldc:int(2755), ldc:int(4381)))
                        looporswitchbreak()
                    }
                }
                
                var_3_668 = and:int(var_3_668:int, ldc:int(-1363820041))
                
                if (cmple:boolean(var_5_7D = var_17_673:int, sub:int(var_6_84:int, and:int(ldc:int(29491), ldc:int(65))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_668:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
