public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u6fb0\uf94d\u8753\u4c04\ubefe\u3e75 {
    public void \u6fb0\uf94d\u8753\u4c04\ubefe\u3e75() {
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
            invokespecial:\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6(\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6::<init>, this:\u6fb0\uf94d\u8753\u4c04\ubefe\u3e75)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9 deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) {
        var_6_6A : \ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9
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
            var_6_6A = initobject:\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9(\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9::<init>)
            var_7_70 = invokevirtual:JsonObject(JsonElement::getAsJsonObject, p0:JsonElement)
            invokevirtual:void(\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6::deserialize, this:\u6fb0\uf94d\u8753\u4c04\ubefe\u3e75[expected:\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6], var_7_70:JsonObject, var_6_6A:\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9[expected:\u527a\u36d3\u8d90\u6ec6\u71ae\uc229], p2:JsonDeserializationContext)
            invokevirtual:void(\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9::\uf9c5\u6c56\u8350\uf9c5\uff55\u59ec, var_6_6A:\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9, invokevirtual:String(JsonElement::getAsString, invokevirtual:JsonElement(JsonObject::get, var_7_70:JsonObject, loadelement:String(getstatic:String[](\u6fb0\uf94d\u8753\u4c04\ubefe\u3e75::\ub70c\ud158\u3bc9\u40a9\u983f\u98a4), and:int(ldc:int(-6339), ldc:int(6338))))))
            return:\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9(var_6_6A:\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9)
        }
        
        goto(Label_0006)
    }
    
    public com.google.gson.JsonElement serialize(\u12b2\u4e72\u8df4\u67e9\u67e9.\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9 p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
        var_4_61 : int
        var_6_67 : List<\u527a\u36d3\u8d90\u6ec6\u71ae\uc229>
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
            var_4_61 = and:int(ldc:int(1357624353), ldc:int(-55591125))
            var_6_67 = invokevirtual:List<\u527a\u36d3\u8d90\u6ec6\u71ae\uc229>(\u527a\u36d3\u8d90\u6ec6\u71ae\uc229::\u69d9\u836c\u392e\uc29a\u5bc4\ub102, p0:\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9[expected:\u527a\u36d3\u8d90\u6ec6\u71ae\uc229])
            var_7_70 = initobject:JsonObject(JsonObject::<init>)
            
            if (logicalnot:boolean(invokevirtual:boolean(\u527a\u36d3\u8d90\u6ec6\u71ae\uc229::\uae5d\u3504\uceb8\u76bc\ub171\u97e6, p0:\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9[expected:\u527a\u36d3\u8d90\u6ec6\u71ae\uc229]))) {
                if (cmpeq:boolean(var_6_67:List<\u527a\u36d3\u8d90\u6ec6\u71ae\uc229>, aconstnull:List<\u527a\u36d3\u8d90\u6ec6\u71ae\uc229>())) {
                    goto(Label_0148)
                }
                
                if (invokeinterface:boolean(List::isEmpty, var_6_67:List<\u527a\u36d3\u8d90\u6ec6\u71ae\uc229>)) {
                    goto(Label_0148)
                }
            }
            
            var_4_61 = and:int(var_4_61:int, ldc:int(-500173517))
            invokevirtual:void(\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6::serialize, this:\u6fb0\uf94d\u8753\u4c04\ubefe\u3e75[expected:\u4f4a\ubff1\u3e75\ubefe\ub19c\uc9f6], var_7_70:JsonObject, p0:\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9[expected:\u527a\u36d3\u8d90\u6ec6\u71ae\uc229], p2:JsonSerializationContext)
            Label_0148:
            invokevirtual:void(JsonObject::addProperty, var_7_70:JsonObject, loadelement:String(getstatic:String[](\u6fb0\uf94d\u8753\u4c04\ubefe\u3e75::\ub70c\ud158\u3bc9\u40a9\u983f\u98a4), and:int(ldc:int(10792), ldc:int(-10793))), invokevirtual:String(\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9::\u93a2\u5d20\uceb8\u7d52\u98a4\u8bb0, p0:\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9))
            return:JsonElement(var_7_70:JsonObject)
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
            return:JsonElement(invokevirtual:JsonElement(\u6fb0\uf94d\u8753\u4c04\ubefe\u3e75::serialize, this:\u6fb0\uf94d\u8753\u4c04\ubefe\u3e75, checkcast:\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9(\u12b2\u4e72\u8df4\u67e9\u67e9.\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9.class, p0:Object[expected:\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9]), p1:Type, p2:JsonSerializationContext))
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
            return:Object(invokevirtual:\ud51e\uc4d2\u71ae\u6c56\u8709\u4cd9[expected:Object](\u6fb0\uf94d\u8753\u4c04\ubefe\u3e75::deserialize, this:\u6fb0\uf94d\u8753\u4c04\ubefe\u3e75, p0:JsonElement, p1:Type, p2:JsonDeserializationContext))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_187 : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_199_0 : byte[] [generated]
        stack_1FE_0 : byte[] [generated]
        stack_273_0 : byte[] [generated]
        stack_2C8_0 : byte[] [generated]
        var_4_174 : int
        var_3_179 : byte[]
        var_5_17A : int
        expr_19C : byte [generated]
        var_0_216 : int
        expr_1FE : byte [generated]
        stack_242_2 : byte [generated]
        stack_219_0 : byte [generated]
        expr_9E : int [generated]
        var_2_C7 : byte[]
        expr_CB : int [generated]
        var_3_262 : byte[]
        var_5_263 : int
        expr_106 : int [generated]
        var_3_2B7 : byte[]
        var_5_2B8 : int
        var_3_13A : String
        stack_16D_0 : String[] [generated]
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
        var_0_187 = and:int(ldc:int(483547691), ldc:int(-19064089))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C7_0 = stack_C9_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_199_0 = stack_1FE_0 = stack_273_0 = stack_2C8_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("9+G0gu0=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_174 = expr_6B:int
        var_3_179 = newarray:byte[](byte.class, expr_6B:int)
        var_5_17A = expr_6B:int
        Label_0380:
        
        while (cmpne:boolean(and:int(var_0_187:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(2058518267))
            var_5_17A = add:int(var_5_17A:int, ldc:int(-1))
            expr_19C = xor:byte(loadelement:byte(stack_199_0:byte[], var_5_17A:int), ldc:byte(6))
            storeelement:byte(var_3_179:byte[], var_5_17A:int, or:int(and:int(shl:int(expr_19C:byte, xor:int(ldc:int(74), ldc:int(78))), ldc:int(-16)), and:int(shr:int(expr_19C:byte[expected:int], xor:int(ldc:int(2370), ldc:int(2374))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_17A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_199_0 = stack_1FE_0 = stack_273_0 = stack_2C8_0 = var_3_179:byte[]
            goto(Label_0112)
        }
        
        var_0_187 = and:int(var_0_187:int, ldc:int(1936943420))
        Label_0481:
        
        while (cmpeq:boolean(and:int(var_0_187:int, ldc:int(65536)), ldc:int(0))) {
            var_0_216 = and:int(var_0_187:int, ldc:int(1574535075))
            var_5_17A = add:int(var_5_17A:int, ldc:int(-1))
            expr_1FE = stack_242_2 = loadelement(stack_1FE_0, var_5_17A)
            
            if (cmplt:boolean(add:int(add:int(var_5_17A:int, ldc:int(2)), neg:int(var_4_174:int)), ldc:int(0))) {
                stack_242_2 = stack_219_0 = add:byte(expr_1FE:byte, loadelement:byte(var_3_179:byte[], add:int(var_5_17A:int, ldc:int(2))))
                goto(Label_0553)
            }
            
            Label_0523:
            
            if (cmpne:boolean(and:int(var_0_216:int, ldc:int(4096)), ldc:int(0))) {
                var_0_216 = and:int(var_0_216:int, ldc:int(-73400593))
                stack_242_2 = stack_219_0 = add:byte(expr_1FE:byte, ldc:byte(2))
            }
            
            Label_0553:
            
            if (cmpeq:boolean(and:int(var_0_216:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_216 = and:int(var_0_216:int, ldc:int(461764961))
                goto(Label_0523)
            }
            
            var_0_187 = and:int(var_0_216:int, ldc:int(-16835861))
            storeelement:byte(var_3_179:byte[], var_5_17A:int, stack_242_2:byte)
            
            if (cmpne:boolean(var_5_17A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_199_0 = stack_1FE_0 = stack_273_0 = stack_2C8_0 = var_3_179:byte[]
            goto(Label_0163)
        }
        
        var_0_187 = and:int(var_0_187:int, ldc:int(-1922953421))
        goto(Label_0380)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_187:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(1612381386))
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(-28051298))
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(4)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(2027691875))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_174 = expr_9E:int
                var_3_179 = newarray:byte[](byte.class, expr_9E:int)
                var_5_17A = expr_9E:int
                goto(Label_0481)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_187:int, ldc:int(4)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(27556354))
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(64)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_187:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_187 = and:int(var_0_187:int, ldc:int(-2245781))
            var_2_C7 = stack_C7_0:byte[]
            expr_CB = add:int(arraylength:int(stack_C9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_3_262 = newarray:byte[](byte.class, expr_CB:int)
                var_5_263 = expr_CB:int
                
                loop {
                    var_0_187 = and:int(var_0_187:int, ldc:int(-1164854477))
                    var_5_263 = add:int(var_5_263:int, ldc:int(-1))
                    storeelement:byte(var_3_262:byte[], var_5_263:int, add:int(shl:int(loadelement:byte(stack_273_0:byte[], var_5_263:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_C7:byte[], add:int(var_5_263:int, and:int(ldc:int(1), ldc:int(13963)))), ldc:int(5)), and:int(ldc:int(21351), ldc:int(135)))))
                    
                    if (cmpne:boolean(var_5_263:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_199_0 = stack_1FE_0 = stack_273_0 = stack_2C8_0 = var_3_262:byte[]
            }
        }
        
        Label_0208:
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(-693801187))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_187 = and:int(var_0_187:int, ldc:int(591051063))
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_187 = and:int(var_0_187:int, ldc:int(785536380))
                goto(Label_0112)
            }
            
            var_0_187 = and:int(var_0_187:int, ldc:int(536361707))
            expr_106 = arraylength:int(stack_106_0:byte[])
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_3_2B7 = newarray:byte[](byte.class, expr_106:int)
                var_5_2B8 = expr_106:int
                
                loop {
                    var_0_187 = and:int(var_0_187:int, ldc:int(972201959))
                    var_5_2B8 = add:int(var_5_2B8:int, ldc:int(-1))
                    storeelement:byte(var_3_2B7:byte[], var_5_2B8:int, add:byte(loadelement:byte(stack_2C8_0:byte[], var_5_2B8:int), ldc:byte(30)))
                    
                    if (cmpne:boolean(var_5_2B8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C7_0 = stack_C9_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_199_0 = stack_1FE_0 = stack_273_0 = stack_2C8_0 = var_3_2B7:byte[]
            }
        }
        
        Label_0267:
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_187:int, ldc:int(65536)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(-1365836517))
            goto(Label_0112)
        }
        
        var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_16D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1063), ldc:int(20505)))
        expr_14C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(137), ldc:int(4195)))
        storeelement:String(expr_14C:String[], and:int(ldc:int(22531), ldc:int(-23044)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(4483), ldc:int(-4580)), xor:int(ldc:int(-31615), ldc:int(-31611))))
        putstatic:String[](\u6fb0\uf94d\u8753\u4c04\ubefe\u3e75::\ub70c\ud158\u3bc9\u40a9\u983f\u98a4, expr_14C:String[])
    }
    
    public void \u071d\u836c\u3776\u7e3f\u74b1\uc87f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_607 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_612 : int
        
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
        var_3_607 = and:int(ldc:int(855784389), ldc:int(-1079500803))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6fb0\uf94d\u8753\u4c04\ubefe\u3e75[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_607 = and:int(var_3_607:int, ldc:int(1241274244))
        }
        else {
            var_3_607 = and:int(var_3_607:int, ldc:int(-844367121))
            var_5_85 = and:int(ldc:int(2910), ldc:int(-7007))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-30554), ldc:int(12617)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_607:int, ldc:int(1863965391))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(15361), ldc:int(407)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-15328), ldc:int(-15327)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_607 = and:int(var_3_DA:int, ldc:int(2067931079))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(18625), ldc:int(1085)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1344517946))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1917577513))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1800018237))
                        goto(Label_1078)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0663)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1105746687))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0556)
                            }
                            
                            goto(Label_0799)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1726297982))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(560737625))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1078)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(110897184))
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(845448491))
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0663)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1119701474))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1653965849))
                        var_11_EB = and:int(ldc:int(-20007), ldc:int(19494))
                        goto(Label_1427)
                    }
                    
                    Label_0556:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1078)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-880929202))
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1586955852))
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-89910244))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(-507700483))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0799)
                        }
                    }
                    
                    Label_0663:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1990906719))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(512)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-859649540))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1078)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(133862915))
                        goto(Label_0926)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-684033147))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1430948400))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(926400479))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0799:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1822390819))
                        goto(Label_1438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1693389501))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1078)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1811823026))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0663)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(2103128608))
                            goto(Label_0556)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-1535287213))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(432873167))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(16896), ldc:int(16897))
                                goto(Label_1078)
                            }
                        }
                    }
                    
                    Label_0926:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(799764909))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-161280451))
                            goto(Label_0799)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0663)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(64)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-934829330))
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1139480974))
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(1738324717))
                        var_11_EB = and:int(ldc:int(-23805), ldc:int(22732))
                    }
                    
                    Label_1078:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-563291468))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1690993528))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(64)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(322572939))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(2)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(486538555))
                            goto(Label_0926)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0799)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(812511633))
                            goto(Label_0663)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-1430473528))
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_607 = and:int(var_3_607:int, ldc:int(1198537709))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1325)
                            }
                        }
                    }
                    
                    Label_1213:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(64)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-262567385))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_1078)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0926)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0799)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0663)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(-490695201))
                            goto(Label_0556)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_607 = and:int(var_3_607:int, ldc:int(1093868517))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1427)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1325:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(586068405))
                        goto(Label_1438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1078)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0663)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_607 = and:int(var_3_607:int, ldc:int(-1256965145))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1427:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_612 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1438:
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(1204038417))
                        goto(Label_1213)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(512)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-573985606))
                        goto(Label_1078)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0926)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(111721005))
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-619222864))
                        goto(Label_0663)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_607:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_607:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_607 = and:int(var_3_607:int, ldc:int(-1754316801))
                        var_17_612 = add:int(var_16_119:int, and:int(ldc:int(21785), ldc:int(8739)))
                        looporswitchbreak()
                    }
                }
                
                var_3_607 = and:int(var_3_607:int, ldc:int(1998601967))
                
                if (cmple:boolean(var_5_85 = var_17_612:int, sub:int(var_6_8C:int, xor:int(ldc:int(17504), ldc:int(17505))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_607:int, ldc:int(1024)), ldc:int(0))) {
            var_3_607 = and:int(var_3_607:int, ldc:int(890788412))
            goto(Label_0106)
        }
    }
}
