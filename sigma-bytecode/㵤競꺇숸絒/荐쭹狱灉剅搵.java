public class \u3d64\u7af6\uae87\uc238\u7d52.\u8350\ucb79\u72f1\u7049\u5245\u6435 {
    public void \u8350\ucb79\u72f1\u7049\u5245\u6435() {
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
            invokespecial:Object(Object::<init>, this:\u8350\ucb79\u72f1\u7049\u5245\u6435)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3d64\u7af6\uae87\uc238\u7d52.\ud12e\ucfaf\uc7fe\u59ec\u718f\ua3b4 deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) {
        var_6_66 : ArrayList
        var_7_92 : JsonArray
        var_8_A8 : Iterator
        
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
            var_6_66 = invokestatic:ArrayList(Lists::newArrayList)
            
            if (logicalnot:boolean(invokevirtual:boolean(JsonElement::isJsonArray, p0:JsonElement))) {
                invokeinterface:boolean(List<\u071d\u965f\u6cfe\u9af2\u6d99\u8d90>::add, var_6_66:ArrayList<\u071d\u965f\u6cfe\u9af2\u6d99\u8d90>[expected:List<\u071d\u965f\u6cfe\u9af2\u6d99\u8d90>], invokeinterface:Object[expected:\u071d\u965f\u6cfe\u9af2\u6d99\u8d90](JsonDeserializationContext::deserialize, p2:JsonDeserializationContext, p0:JsonElement, ldc:Class<\u071d\u965f\u6cfe\u9af2\u6d99\u8d90>[expected:Type](\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u071d\u965f\u6cfe\u9af2\u6d99\u8d90.class)))
            }
            else {
                var_7_92 = invokevirtual:JsonArray(JsonElement::getAsJsonArray, p0:JsonElement)
                
                if (cmpeq:boolean(invokevirtual:int(JsonArray::size, var_7_92:JsonArray), ldc:int(0))) {
                    athrow(initobject:JsonParseException(JsonParseException::<init>, loadelement:String(getstatic:String[](\u8350\ucb79\u72f1\u7049\u5245\u6435::\u527a\uf94d\u385b\ub83f\ub32d\u7af6), and:int(ldc:int(-23424), ldc:int(23358)))))
                }
                
                var_8_A8 = invokevirtual:Iterator(JsonArray::iterator, var_7_92:JsonArray)
                
                while (invokeinterface:boolean(Iterator::hasNext, var_8_A8:Iterator)) {
                    invokeinterface:boolean(List<\u071d\u965f\u6cfe\u9af2\u6d99\u8d90>::add, var_6_66:ArrayList<\u071d\u965f\u6cfe\u9af2\u6d99\u8d90>[expected:List<\u071d\u965f\u6cfe\u9af2\u6d99\u8d90>], invokeinterface:Object(JsonDeserializationContext::deserialize, p2:JsonDeserializationContext, checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:JsonElement(Iterator<JsonElement>::next, var_8_A8:Iterator<JsonElement>)), ldc:Class<\u071d\u965f\u6cfe\u9af2\u6d99\u8d90>[expected:Type](\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u071d\u965f\u6cfe\u9af2\u6d99\u8d90.class)))
                }
            }
            
            return:\ud12e\ucfaf\uc7fe\u59ec\u718f\ua3b4(initobject:\ud12e\ucfaf\uc7fe\u59ec\u718f\ua3b4(\ud12e\ucfaf\uc7fe\u59ec\u718f\ua3b4::<init>, var_6_66:ArrayList<\u071d\u965f\u6cfe\u9af2\u6d99\u8d90>))
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
            return:Object(invokevirtual:\ud12e\ucfaf\uc7fe\u59ec\u718f\ua3b4[expected:Object](\u8350\ucb79\u72f1\u7049\u5245\u6435::deserialize, this:\u8350\ucb79\u72f1\u7049\u5245\u6435, p0:JsonElement, p1:Type, p2:JsonDeserializationContext))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_187 : int
        expr_6B : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_CF_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_199_0 : byte[] [generated]
        stack_218_0 : byte[] [generated]
        stack_252_0 : byte[] [generated]
        stack_2A7_0 : byte[] [generated]
        var_4_174 : int
        var_3_179 : byte[]
        var_5_17A : int
        var_0_18F : int
        expr_199 : byte [generated]
        stack_1DD_2 : byte [generated]
        stack_1BC_0 : byte [generated]
        expr_A6 : int [generated]
        var_2_CF : byte[]
        expr_D3 : int [generated]
        var_3_241 : byte[]
        var_5_242 : int
        expr_106 : int [generated]
        var_3_296 : byte[]
        var_5_297 : int
        expr_2AA : byte [generated]
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
        var_0_187 = and:int(ldc:int(447519385), ldc:int(-176286273))
        expr_6B = arraylength:int(stack_A4_0 = stack_A6_0 = stack_CF_0 = stack_D1_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_199_0 = stack_218_0 = stack_252_0 = stack_2A7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("YJPMIYI1XPT/N4ywwIFc/b12hLg=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_174 = expr_6B:int
        var_3_179 = newarray:byte[](byte.class, expr_6B:int)
        var_5_17A = expr_6B:int
        Label_0380:
        
        while (cmpeq:boolean(and:int(var_0_187:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_18F = and:int(var_0_187:int, ldc:int(1846934366))
            var_5_17A = add:int(var_5_17A:int, ldc:int(-1))
            expr_199 = stack_1DD_2 = loadelement(stack_199_0, var_5_17A)
            
            if (cmplt:boolean(add:int(add:int(var_5_17A:int, ldc:int(3)), neg:int(var_4_174:int)), ldc:int(0))) {
                stack_1DD_2 = stack_1BC_0 = add:byte(expr_199:byte, loadelement:byte(var_3_179:byte[], add:int(var_5_17A:int, ldc:int(3))))
                goto(Label_0460)
            }
            
            Label_0422:
            
            if (cmpeq:boolean(and:int(var_0_18F:int, ldc:int(8)), ldc:int(0))) {
                var_0_18F = and:int(var_0_18F:int, ldc:int(368611368))
            }
            else {
                var_0_18F = and:int(var_0_18F:int, ldc:int(-907176227))
                stack_1DD_2 = stack_1BC_0 = add:byte(expr_199:byte, ldc:byte(3))
            }
            
            Label_0460:
            
            if (cmpne:boolean(and:int(var_0_18F:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0422)
            }
            
            var_0_187 = and:int(var_0_18F:int, ldc:int(579408798))
            storeelement:byte(var_3_179:byte[], var_5_17A:int, stack_1DD_2:byte)
            
            if (cmpne:boolean(var_5_17A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_CF_0 = stack_D1_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_199_0 = stack_218_0 = stack_252_0 = stack_2A7_0 = var_3_179:byte[]
            goto(Label_0112)
        }
        
        var_0_187 = and:int(var_0_187:int, ldc:int(1338779318))
        Label_0515:
        
        while (cmpeq:boolean(and:int(var_0_187:int, ldc:int(1024)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(-735486885))
            var_5_17A = add:int(var_5_17A:int, ldc:int(-1))
            storeelement:byte(var_3_179:byte[], var_5_17A:int, xor:byte(loadelement:byte(stack_218_0:byte[], var_5_17A:int), ldc:byte(91)))
            
            if (cmpne:boolean(var_5_17A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_CF_0 = stack_D1_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_199_0 = stack_218_0 = stack_252_0 = stack_2A7_0 = var_3_179:byte[]
            goto(Label_0171)
        }
        
        goto(Label_0380)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_187:int, ldc:int(1024)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(-1562849115))
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(-1891866573))
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_187:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(1371114387))
        }
        else {
            var_0_187 = and:int(var_0_187:int, ldc:int(82770139))
            expr_A6 = arraylength:int(stack_A6_0:byte[])
            
            if (cmpne:boolean(expr_A6:int, ldc:int(0))) {
                var_4_174 = expr_A6:int
                var_3_179 = newarray:byte[](byte.class, expr_A6:int)
                var_5_17A = expr_A6:int
                goto(Label_0515)
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpne:boolean(and:int(var_0_187:int, ldc:int(4)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(574512762))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_187 = and:int(var_0_187:int, ldc:int(1502411324))
            var_2_CF = stack_CF_0:byte[]
            expr_D3 = add:int(arraylength:int(stack_D1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_3_241 = newarray:byte[](byte.class, expr_D3:int)
                var_5_242 = expr_D3:int
                
                loop {
                    var_0_187 = and:int(var_0_187:int, ldc:int(-462081409))
                    var_5_242 = add:int(var_5_242:int, ldc:int(-1))
                    storeelement:byte(var_3_241:byte[], var_5_242:int, add:int(shl:int(loadelement:byte(stack_252_0:byte[], var_5_242:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_CF:byte[], add:int(var_5_242:int, and:int(ldc:int(20483), ldc:int(33)))), ldc:int(2)), and:int(ldc:int(7231), ldc:int(8383)))))
                    
                    if (cmpne:boolean(var_5_242:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_CF_0 = stack_D1_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_199_0 = stack_218_0 = stack_252_0 = stack_2A7_0 = var_3_241:byte[]
            }
        }
        
        Label_0216:
        
        if (cmpne:boolean(and:int(var_0_187:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(2102855783))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0171)
            }
            
            if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(4096)), ldc:int(0))) {
                var_0_187 = and:int(var_0_187:int, ldc:int(1780624167))
                goto(Label_0112)
            }
            
            var_0_187 = and:int(var_0_187:int, ldc:int(-1234004743))
            expr_106 = arraylength:int(stack_106_0:byte[])
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_3_296 = newarray:byte[](byte.class, expr_106:int)
                var_5_297 = expr_106:int
                
                loop {
                    var_0_187 = and:int(var_0_187:int, ldc:int(1696185789))
                    var_5_297 = add:int(var_5_297:int, ldc:int(-1))
                    expr_2AA = add:byte(loadelement:byte(stack_2A7_0:byte[], var_5_297:int), ldc:byte(95))
                    storeelement:byte(var_3_296:byte[], var_5_297:int, or:int(and:int(shl:int(expr_2AA:byte, and:int(ldc:int(23820), ldc:int(8372))), ldc:int(-16)), and:int(shr:int(expr_2AA:byte[expected:int], and:int(ldc:int(2052), ldc:int(21260))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_297:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_CF_0 = stack_D1_0 = stack_104_0 = stack_106_0 = stack_12E_0 = stack_199_0 = stack_218_0 = stack_252_0 = stack_2A7_0 = var_3_296:byte[]
            }
        }
        
        Label_0267:
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_187:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0171)
        }
        
        if (cmpne:boolean(and:int(var_0_187:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_187 = and:int(var_0_187:int, ldc:int(-808261098))
            goto(Label_0112)
        }
        
        var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_16D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4161), ldc:int(26373)))
        expr_14C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(3072), ldc:int(3073)))
        storeelement:String(expr_14C:String[], and:int(ldc:int(-31258), ldc:int(29201)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(-7600), ldc:int(7341)), xor:int(ldc:int(2570), ldc:int(2585))))
        putstatic:String[](\u8350\ucb79\u72f1\u7049\u5245\u6435::\u527a\uf94d\u385b\ub83f\ub32d\u7af6, expr_14C:String[])
    }
    
    public void \u416d\u527a\uc29a\u6b5f\u92ff\u120d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63B : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_646 : int
        
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
        var_3_63B = and:int(ldc:int(-1120102837), ldc:int(1056857387))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8350\ucb79\u72f1\u7049\u5245\u6435[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_63B = and:int(var_3_63B:int, ldc:int(796587915))
            var_5_7D = and:int(ldc:int(-30927), ldc:int(8398))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-14871), ldc:int(6678)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_63B:int, ldc:int(746068911))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, and:int(ldc:int(257), ldc:int(10371)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(1920), ldc:int(1921)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_63B = and:int(var_3_CA:int, ldc:int(-1393536145))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(18), ldc:int(19)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(2036275838))
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-160292924))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-821560180))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(2124025752))
                        goto(Label_0651)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1914439321))
                    }
                    else {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(2122092955))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0533)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-2042895772))
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1317781591))
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0651)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(1962084161))
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(2126000681))
                        var_11_DB = and:int(ldc:int(20000), ldc:int(-20001))
                        goto(Label_1478)
                    }
                    
                    Label_0533:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1954457512))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-2133800061))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1629499937))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1693216449))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1031200287))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0651:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-442485542))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-402886613))
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(2028396098))
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-235041964))
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(1099572866))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-306749845))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-516312861))
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-217534378))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(160856888))
                            goto(Label_0651)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(2023566684))
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(659793958))
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-55274757))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(-16379), ldc:int(-16380))
                                goto(Label_1067)
                            }
                        }
                    }
                    
                    Label_0914:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1986867244))
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-238221544))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0651)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0533)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-524286728))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-30079046))
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(766923677))
                        var_11_DB = and:int(ldc:int(663), ldc:int(-4760))
                    }
                    
                    Label_1067:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1164758958))
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1850486468))
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(258873871))
                            goto(Label_0914)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(1185856831))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(175039504))
                            goto(Label_0651)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-1784896462))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(659758025))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(746133663))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1339)
                            }
                        }
                    }
                    
                    Label_1211:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1067)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0914)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(1927764184))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(299279230))
                            goto(Label_0651)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-243978463))
                            goto(Label_0533)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(128)), ldc:int(0))) {
                            var_3_63B = and:int(var_3_63B:int, ldc:int(-2025754630))
                            loopcontinue()
                        }
                        
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1359349105))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1478)
                    }
                    
                    Label_1339:
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1489)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1683421978))
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1851590374))
                        goto(Label_0651)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1938463227))
                        goto(Label_0533)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1925107624))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1402547300))
                        loopcontinue()
                    }
                    
                    var_3_63B = and:int(var_3_63B:int, ldc:int(-327297315))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1478:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_646 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1489:
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1674370935))
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1067)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1508589724))
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(1270976930))
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0651)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(-1836624759))
                        goto(Label_0533)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63B = and:int(var_3_63B:int, ldc:int(2122085199))
                        var_17_646 = add:int(var_16_109:int, xor:int(ldc:int(4152), ldc:int(4153)))
                        looporswitchbreak()
                    }
                }
                
                var_3_63B = and:int(var_3_63B:int, ldc:int(2125993325))
                
                if (cmple:boolean(var_5_7D = var_17_646:int, sub:int(var_6_84:int, and:int(ldc:int(465), ldc:int(19461))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_63B:int, ldc:int(8)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
