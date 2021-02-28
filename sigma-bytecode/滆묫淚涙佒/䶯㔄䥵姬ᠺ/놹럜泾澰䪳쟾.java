public final class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\ub1b9\ub7dc\u6cfe\u6fb0\u4ab3\uc7fe {
    public void \ub1b9\ub7dc\u6cfe\u6fb0\u4ab3\uc7fe() {
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
            invokespecial:Object(Object::<init>, this:\ub1b9\ub7dc\u6cfe\u6fb0\u4ab3\uc7fe)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.IFormattableTextComponent deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) {
        var_6_CC : JsonArray
        var_7_CF : IFormattableTextComponent
        var_8_D6 : Iterator
        var_9_F3 : JsonElement
        var_10_101 : IFormattableTextComponent
        
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
        
        if (invokevirtual:boolean(JsonElement::isJsonPrimitive, p0:JsonElement)) {
            return:IFormattableTextComponent(initobject:StringTextComponent[expected:IFormattableTextComponent](StringTextComponent::<init>, invokevirtual:String(JsonElement::getAsString, p0:JsonElement)))
        }
        
        if (logicalnot:boolean(invokevirtual:boolean(JsonElement::isJsonArray, p0:JsonElement))) {
            athrow(initobject:JsonParseException(JsonParseException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub1b9\ub7dc\u6cfe\u6fb0\u4ab3\uc7fe::\uc31c\ud7e8\uf995\u4c04\u88c5\u3d64), and:int(ldc:int(-14434), ldc:int(14433)))), p0:JsonElement[expected:Object]), loadelement:String(getstatic:String[](\ub1b9\ub7dc\u6cfe\u6fb0\u4ab3\uc7fe::\uc31c\ud7e8\uf995\u4c04\u88c5\u3d64), xor:int(ldc:int(72), ldc:int(73)))))))
        }
        
        var_6_CC = invokevirtual:JsonArray(JsonElement::getAsJsonArray, p0:JsonElement)
        var_7_CF = aconstnull:IFormattableTextComponent()
        var_8_D6 = invokevirtual:Iterator(JsonArray::iterator, var_6_CC:JsonArray)
        
        while (invokeinterface:boolean(Iterator::hasNext, var_8_D6:Iterator)) {
            var_9_F3 = checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:JsonElement(Iterator<JsonElement>::next, var_8_D6:Iterator<JsonElement>))
            var_10_101 = invokevirtual:IFormattableTextComponent(\ub1b9\ub7dc\u6cfe\u6fb0\u4ab3\uc7fe::deserialize, this:\ub1b9\ub7dc\u6cfe\u6fb0\u4ab3\uc7fe, var_9_F3:JsonElement, invokevirtual:Class<? extends JsonElement>[expected:Type](JsonElement::getClass, var_9_F3:JsonElement), p2:JsonDeserializationContext)
            
            if (cmpne:boolean(var_7_CF:IFormattableTextComponent, aconstnull:IFormattableTextComponent())) {
                invokeinterface:IFormattableTextComponent(IFormattableTextComponent::append, var_7_CF:IFormattableTextComponent, var_10_101:IFormattableTextComponent[expected:ITextComponent])
            }
            else {
                var_7_CF = var_10_101:IFormattableTextComponent
            }
        }
        
        return:IFormattableTextComponent(var_7_CF:IFormattableTextComponent)
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
            return:Object(invokevirtual:IFormattableTextComponent[expected:Object](\ub1b9\ub7dc\u6cfe\u6fb0\u4ab3\uc7fe::deserialize, this:\ub1b9\ub7dc\u6cfe\u6fb0\u4ab3\uc7fe, p0:JsonElement, p1:Type, p2:JsonDeserializationContext))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_19A : int
        expr_6B : int [generated]
        stack_8C_0 : byte[] [generated]
        stack_8E_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1BB_0 : byte[] [generated]
        stack_20E_0 : byte[] [generated]
        stack_271_0 : byte[] [generated]
        stack_2C4_0 : byte[] [generated]
        var_4_187 : int
        var_3_18C : byte[]
        var_5_18D : int
        expr_1BB : byte [generated]
        var_0_2BA : int
        expr_2C4 : byte [generated]
        stack_2F2_2 : byte [generated]
        var_2_8C : byte[]
        expr_90 : int [generated]
        var_3_1FD : byte[]
        var_5_1FE : int
        expr_C3 : int [generated]
        expr_FE : int [generated]
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
        var_0_19A = and:int(ldc:int(234128252), ldc:int(1339680124))
        expr_6B = arraylength:int(stack_8C_0 = stack_8E_0 = stack_C1_0 = stack_C3_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1BB_0 = stack_20E_0 = stack_271_0 = stack_2C4_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Tfg3lW/hZA44/7Xl5OJ0KOoz33Lmo0L4dZehwTgYocQYf8aq5JPQad0=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_187 = expr_6B:int
        var_3_18C = newarray:byte[](byte.class, expr_6B:int)
        var_5_18D = expr_6B:int
        Label_0399:
        
        while (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_19A = and:int(var_0_19A:int, ldc:int(1249179145))
                goto(Label_0597)
            }
            
            var_0_19A = and:int(var_0_19A:int, ldc:int(-142949380))
            var_5_18D = add:int(var_5_18D:int, ldc:int(-1))
            expr_1BB = loadelement:byte(stack_1BB_0:byte[], var_5_18D:int)
            storeelement:byte(var_3_18C:byte[], var_5_18D:int, add:int(or:int(and:int(shl:int(expr_1BB:byte, and:int(ldc:int(3077), ldc:int(12484))), ldc:int(-16)), and:int(shr:int(expr_1BB:byte[expected:int], and:int(ldc:int(6287), ldc:int(25620))), ldc:int(15))), ldc:int(47)))
            
            if (cmpne:boolean(var_5_18D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1BB_0 = stack_20E_0 = stack_271_0 = stack_2C4_0 = var_3_18C:byte[]
            goto(Label_0112)
        }
        
        var_0_19A = and:int(var_0_19A:int, ldc:int(789375818))
        goto(Label_0672)
        Label_0597:
        
        while (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0399)
            }
            
            var_0_19A = and:int(var_0_19A:int, ldc:int(-447094402))
            var_5_18D = add:int(var_5_18D:int, ldc:int(-1))
            storeelement:byte(var_3_18C:byte[], var_5_18D:int, xor:byte(loadelement:byte(stack_271_0:byte[], var_5_18D:int), ldc:byte(93)))
            
            if (cmpne:boolean(var_5_18D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1BB_0 = stack_20E_0 = stack_271_0 = stack_2C4_0 = var_3_18C:byte[]
            goto(Label_0200)
        }
        
        Label_0672:
        
        while (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(2)), ldc:int(0))) {
                var_0_19A = and:int(var_0_19A:int, ldc:int(843399314))
                goto(Label_0399)
            }
            
            var_0_2BA = and:int(var_0_19A:int, ldc:int(-35924491))
            var_5_18D = add:int(var_5_18D:int, ldc:int(-1))
            expr_2C4 = loadelement:byte(stack_2C4_0:byte[], var_5_18D:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_18D:int, ldc:int(2)), neg:int(var_4_187:int)), ldc:int(0))) {
                var_0_2BA = and:int(var_0_2BA:int, ldc:int(-1074009746))
                stack_2F2_2 = add:byte(expr_2C4:byte, ldc:byte(2))
            }
            else {
                stack_2F2_2 = add:byte(expr_2C4:byte, loadelement:byte(var_3_18C:byte[], add:int(var_5_18D:int, ldc:int(2))))
            }
            
            var_0_19A = and:int(var_0_2BA:int, ldc:int(2002057206))
            storeelement:byte(var_3_18C:byte[], var_5_18D:int, stack_2F2_2:byte)
            
            if (cmpne:boolean(var_5_18D:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1BB_0 = stack_20E_0 = stack_271_0 = stack_2C4_0 = var_3_18C:byte[]
            goto(Label_0259)
        }
        
        goto(Label_0597)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(2)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(-942150667))
            var_2_8C = stack_8C_0:byte[]
            expr_90 = add:int(arraylength:int(stack_8E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_90:int, ldc:int(0))) {
                var_3_1FD = newarray:byte[](byte.class, expr_90:int)
                var_5_1FE = expr_90:int
                
                loop {
                    var_0_19A = and:int(var_0_19A:int, ldc:int(1072942454))
                    var_5_1FE = add:int(var_5_1FE:int, ldc:int(-1))
                    storeelement:byte(var_3_1FD:byte[], var_5_1FE:int, add:int(shl:int(loadelement:byte(stack_20E_0:byte[], var_5_1FE:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_8C:byte[], add:int(var_5_1FE:int, xor:int(ldc:int(-24504), ldc:int(-24503)))), ldc:int(2)), xor:int(ldc:int(4255), ldc:int(4256)))))
                    
                    if (cmpne:boolean(var_5_1FE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8E_0 = stack_8C_0 = stack_C1_0 = stack_C3_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1BB_0 = stack_20E_0 = stack_271_0 = stack_2C4_0 = var_3_1FD:byte[]
            }
        }
        
        Label_0149:
        
        if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(62881587))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_19A = and:int(var_0_19A:int, ldc:int(1163934326))
                goto(Label_0112)
            }
            
            var_0_19A = and:int(var_0_19A:int, ldc:int(-1384272513))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_187 = expr_C3:int
                var_3_18C = newarray:byte[](byte.class, expr_C3:int)
                var_5_18D = expr_C3:int
                goto(Label_0597)
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(128)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(842727091))
        }
        else {
            if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(8192)), ldc:int(0))) {
                var_0_19A = and:int(var_0_19A:int, ldc:int(330324420))
                goto(Label_0149)
            }
            
            if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(64)), ldc:int(0))) {
                var_0_19A = and:int(var_0_19A:int, ldc:int(1993665081))
                goto(Label_0112)
            }
            
            var_0_19A = and:int(var_0_19A:int, ldc:int(-145507986))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_4_187 = expr_FE:int
                var_3_18C = newarray:byte[](byte.class, expr_FE:int)
                var_5_18D = expr_FE:int
                goto(Label_0672)
            }
        }
        
        Label_0259:
        
        if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_19A:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0149)
        }
        
        if (cmpeq:boolean(and:int(var_0_19A:int, ldc:int(256)), ldc:int(0))) {
            var_0_19A = and:int(var_0_19A:int, ldc:int(809572765))
            goto(Label_0112)
        }
        
        var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_180_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(258), ldc:int(9319)))
        expr_144 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4358), ldc:int(17451)))
        storeelement:String(expr_144:String[], xor:int(ldc:int(3072), ldc:int(3073)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-14049), ldc:int(13920)), xor:int(ldc:int(4107), ldc:int(4122))))
        storeelement:String(expr_144:String[], and:int(ldc:int(-31830), ldc:int(31829)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(12331), ldc:int(12346)), xor:int(ldc:int(11266), ldc:int(11306))))
        putstatic:String[](\ub1b9\ub7dc\u6cfe\u6fb0\u4ab3\uc7fe::\uc31c\ud7e8\uf995\u4c04\u88c5\u3d64, expr_144:String[])
    }
    
    public void \u5245\u56bd\u624e\u7873\ubff1\ub19c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_685 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_690 : int
        
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
        var_3_685 = and:int(ldc:int(691594656), ldc:int(997096419))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub1b9\ub7dc\u6cfe\u6fb0\u4ab3\uc7fe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
            var_3_685 = and:int(var_3_685:int, ldc:int(708631003))
        }
        else {
            var_3_685 = and:int(var_3_685:int, ldc:int(2070739308))
            var_5_85 = and:int(ldc:int(28000), ldc:int(-28650))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(20620), ldc:int(-20638)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_685:int, ldc:int(2132373415))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(65), ldc:int(64)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(16465), ldc:int(16464)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_685 = and:int(var_3_D2:int, ldc:int(-1681492682))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(25393), ldc:int(3137)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-933319480))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(2046802266))
                        goto(Label_0842)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(373853979))
                        goto(Label_0717)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-2062691879))
                        goto(Label_0571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(582392403))
                    }
                    else {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1762651492))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0571)
                            }
                            
                            goto(Label_0842)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(731808737))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(920848910))
                        goto(Label_1397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-972308377))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(342735498))
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1747516849))
                        goto(Label_0842)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-2039140622))
                        goto(Label_0717)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-112724617))
                            var_11_E3 = and:int(ldc:int(12636), ldc:int(-31069))
                            goto(Label_1544)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0571:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1005745669))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-945839236))
                        goto(Label_1397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1728814480))
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1815599885))
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1837475148))
                        goto(Label_0969)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1705425929))
                        goto(Label_0842)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-835024358))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1980407390))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0842)
                        }
                    }
                    
                    Label_0717:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(263653169))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-476826950))
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0969)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-583993284))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(1090597858))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(1530884068))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0842:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1717584799))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-487490332))
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-2077296803))
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(2018601436))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(28356749))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1185153554))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(7313), ldc:int(9))
                                goto(Label_1104)
                            }
                        }
                    }
                    
                    Label_0969:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-83872422))
                        goto(Label_1397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0842)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1311040926))
                            goto(Label_0717)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1084199648))
                        var_11_E3 = and:int(ldc:int(-10883), ldc:int(10882))
                    }
                    
                    Label_1104:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-539175016))
                        goto(Label_1397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1643858488))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(1191064095))
                            goto(Label_0969)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(857453831))
                            goto(Label_0842)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0717)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-28825441))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-2075651409))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(1340598068))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1397)
                            }
                        }
                    }
                    
                    Label_1240:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(2133371723))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1795702670))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(945195890))
                            goto(Label_1104)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(74136279))
                            goto(Label_0969)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0842)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(1219960445))
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(208862028))
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-813728001))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1153341006))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1544)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1397:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-430598854))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1829321894))
                        goto(Label_1240)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1660146729))
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0969)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0842)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(32)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1961469884))
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-356228402))
                        goto(Label_0571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1373808469))
                        loopcontinue()
                    }
                    
                    var_3_685 = and:int(var_3_685:int, ldc:int(-545397462))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_690 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1240)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-2004088740))
                        goto(Label_0969)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1360336260))
                        goto(Label_0842)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-566273287))
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(757356703))
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-162827792))
                        goto(Label_0397)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1294465977))
                        var_17_690 = add:int(var_16_111:int, xor:int(ldc:int(4290), ldc:int(4291)))
                        looporswitchbreak()
                    }
                }
                
                var_3_685 = and:int(var_3_685:int, ldc:int(-377259670))
                
                if (cmple:boolean(var_5_85 = var_17_690:int, sub:int(var_6_8C:int, xor:int(ldc:int(8194), ldc:int(8195))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
