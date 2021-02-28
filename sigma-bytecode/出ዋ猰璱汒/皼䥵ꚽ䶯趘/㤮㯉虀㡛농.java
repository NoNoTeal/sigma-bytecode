public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u392e\u3bc9\u8640\u385b\ub18d {
    public void \u392e\u3bc9\u8640\u385b\ub18d() {
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
            invokespecial:\u9937\ubb2b\u600f\u6b0d\u74b1(\u9937\ubb2b\u600f\u6b0d\u74b1::<init>, this:\u392e\u3bc9\u8640\u385b\ub18d)
            putfield:Set<String>(\u392e\u3bc9\u8640\u385b\ub18d::\u516c\u92ff\u74b1\u97e6\ub171\u3711, this:\u392e\u3bc9\u8640\u385b\ub18d, invokestatic:HashSet[expected:Set<String>](Sets::newHashSet))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u392e\u3bc9\u8640\u385b\ub18d \u71ae\u927d\uc238\ud51e\u7043\uc2e8(java.lang.String p0) {
        var_1_64 : int
        var_3_6C : \u392e\u3bc9\u8640\u385b\ub18d
        var_1_71 : int
        var_4_79 : JsonParser
        var_1_7F : int
        var_5_86 : JsonElement
        var_1_8C : int
        var_6_92 : JsonObject
        var_1_98 : int
        var_7_A9 : JsonElement
        var_1_C5 : int
        var_1_113 : int
        var_8_11C : Iterator
        var_1_129 : int
        var_1_14F : int
        var_9_15A : JsonElement
        var_1_160 : int
        
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
            var_1_64 = and:int(and:int(ldc:int(-1025620799), ldc:int(2092820693)), ldc:int(-1011781695))
            var_3_6C = initobject:\u392e\u3bc9\u8640\u385b\ub18d(\u392e\u3bc9\u8640\u385b\ub18d::<init>)
            var_1_71 = and:int(var_1_64:int, ldc:int(-453622315))
            var_4_79 = initobject:JsonParser(JsonParser::<init>)
            
            try {
                var_1_7F = and:int(var_1_71:int, ldc:int(1135932873))
                var_5_86 = invokevirtual:JsonElement(JsonParser::parse, var_4_79:JsonParser, p0:String)
                var_1_8C = and:int(var_1_7F:int, ldc:int(-308658741))
                var_6_92 = invokevirtual:JsonObject(JsonElement::getAsJsonObject, var_5_86:JsonElement)
                var_1_98 = and:int(var_1_8C:int, ldc:int(1777520117))
                var_7_A9 = invokevirtual:JsonElement(JsonObject::get, var_6_92:JsonObject, loadelement:String(getstatic:String[](\u392e\u3bc9\u8640\u385b\ub18d::\u3d4b\ub70c\uc229\u600f\ud51e\u72f1), and:int(ldc:int(-5204), ldc:int(5203))))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_98:int, ldc:int(8)), ldc:int(0))) {
                        var_1_98 = and:int(var_1_98:int, ldc:int(-845823873))
                        goto(Label_0249)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_98:int, ldc:int(1)), ldc:int(0))) {
                        var_1_C5 = and:int(var_1_98:int, ldc:int(1106731049))
                    }
                    else {
                        var_1_C5 = and:int(var_1_98:int, ldc:int(-608864805))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(JsonElement::isJsonArray, var_7_A9:JsonElement))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0214:
                    
                    if (cmpne:boolean(and:int(var_1_C5:int, ldc:int(8)), ldc:int(0))) {
                        var_1_98 = and:int(var_1_C5:int, ldc:int(-2049673922))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_1_C5:int, ldc:int(8192)), ldc:int(0))) {
                            var_1_98 = and:int(var_1_C5:int, ldc:int(-1709651003))
                            loopcontinue()
                        }
                        
                        var_1_98 = and:int(var_1_C5:int, ldc:int(1742424053))
                    }
                    
                    Label_0249:
                    
                    if (cmpeq:boolean(and:int(var_1_98:int, ldc:int(1048576)), ldc:int(0))) {
                        var_1_C5 = and:int(var_1_98:int, ldc:int(-797593596))
                        goto(Label_0214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_98:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_1_113 = and:int(var_1_98:int, ldc:int(-539263289))
                    var_8_11C = invokevirtual:Iterator(JsonArray::iterator, invokevirtual:JsonArray(JsonElement::getAsJsonArray, var_7_A9:JsonElement))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_1_113:int, ldc:int(8)), ldc:int(0))) {
                            var_1_129 = and:int(var_1_113:int, ldc:int(-1457708021))
                        }
                        else {
                            var_1_129 = and:int(var_1_113:int, ldc:int(-520977699))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_8_11C:Iterator))) {
                                looporswitchbreak(Label_0380)
                            }
                        }
                        
                        if (cmpne:boolean(and:int(var_1_129:int, ldc:int(134217728)), ldc:int(0))) {
                            var_1_113 = and:int(var_1_129:int, ldc:int(-1796860327))
                        }
                        else {
                            var_1_14F = and:int(var_1_129:int, ldc:int(-289535533))
                            var_9_15A = checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:JsonElement(Iterator<JsonElement>::next, var_8_11C:Iterator<JsonElement>))
                            var_1_160 = and:int(var_1_14F:int, ldc:int(1169800913))
                            invokeinterface:boolean(Set<String>::add, getfield:Set<String>(\u392e\u3bc9\u8640\u385b\ub18d::\u516c\u92ff\u74b1\u97e6\ub171\u3711, var_3_6C:\u392e\u3bc9\u8640\u385b\ub18d), invokevirtual:String(JsonElement::getAsString, var_9_15A:JsonElement))
                            var_1_113 = and:int(var_1_160:int, ldc:int(-124634419))
                        }
                    }
                }
                
                Label_0380:
            }
            catch (java.lang.Exception stack_183_0) {
            }
            
            return:\u392e\u3bc9\u8640\u385b\ub18d(var_3_6C:\u392e\u3bc9\u8640\u385b\ub18d)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_A8 : int
        expr_6B : int [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_AB_0 : byte[] [generated]
        stack_AD_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_139_0 : byte[] [generated]
        stack_18F_0 : byte[] [generated]
        stack_1EB_0 : byte[] [generated]
        var_4_11C : int
        var_3_121 : byte[]
        var_5_122 : int
        expr_13F : byte [generated]
        var_0_1E1 : int
        expr_1EB : byte [generated]
        stack_219_2 : byte [generated]
        var_2_8D : byte[]
        expr_91 : int [generated]
        var_3_17E : byte[]
        var_5_17F : int
        expr_AD : int [generated]
        var_3_E2 : String
        stack_115_0 : String[] [generated]
        expr_F4 : String[] [generated]
        
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
        var_0_A8 = and:int(ldc:int(-1020761616), ldc:int(-37259032))
        expr_6B = arraylength:int(stack_8D_0 = stack_8F_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_139_0 = stack_18F_0 = stack_1EB_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("nZ1xLA==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_11C = expr_6B:int
        var_3_121 = newarray:byte[](byte.class, expr_6B:int)
        var_5_122 = expr_6B:int
        Label_0292:
        
        while (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(32768)), ldc:int(0))) {
            var_0_A8 = and:int(var_0_A8:int, ldc:int(-307537495))
            var_5_122 = add:int(var_5_122:int, ldc:int(-1))
            expr_13F = xor:byte(add:byte(loadelement:byte(stack_139_0:byte[], var_5_122:int), ldc:byte(62)), ldc:byte(106))
            storeelement:byte(var_3_121:byte[], var_5_122:int, or:int(and:int(shl:int(expr_13F:byte, and:int(ldc:int(26148), ldc:int(4116))), ldc:int(-16)), and:int(shr:int(expr_13F:byte[expected:int], and:int(ldc:int(4142), ldc:int(3412))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_122:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_139_0 = stack_18F_0 = stack_1EB_0 = var_3_121:byte[]
            goto(Label_0112)
        }
        
        Label_0470:
        
        while (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_1E1 = and:int(var_0_A8:int, ldc:int(-203854675))
            var_5_122 = add:int(var_5_122:int, ldc:int(-1))
            expr_1EB = loadelement:byte(stack_1EB_0:byte[], var_5_122:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_122:int, ldc:int(3)), neg:int(var_4_11C:int)), ldc:int(0))) {
                var_0_1E1 = and:int(var_0_1E1:int, ldc:int(-977638933))
                stack_219_2 = add:byte(expr_1EB:byte, ldc:byte(3))
            }
            else {
                stack_219_2 = add:byte(expr_1EB:byte, loadelement:byte(var_3_121:byte[], add:int(var_5_122:int, ldc:int(3))))
            }
            
            var_0_A8 = and:int(var_0_1E1:int, ldc:int(-674136156))
            storeelement:byte(var_3_121:byte[], var_5_122:int, stack_219_2:byte)
            
            if (cmpne:boolean(var_5_122:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_8F_0 = stack_8D_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_139_0 = stack_18F_0 = stack_1EB_0 = var_3_121:byte[]
            goto(Label_0178)
        }
        
        goto(Label_0292)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0178)
        }
        
        if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(32)), ldc:int(0))) {
            var_0_A8 = and:int(var_0_A8:int, ldc:int(-1612738585))
        }
        else {
            var_0_A8 = and:int(var_0_A8:int, ldc:int(-216139603))
            var_2_8D = stack_8D_0:byte[]
            expr_91 = add:int(arraylength:int(stack_8F_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                var_3_17E = newarray:byte[](byte.class, expr_91:int)
                var_5_17F = expr_91:int
                
                loop {
                    var_0_A8 = and:int(var_0_A8:int, ldc:int(-740960086))
                    var_5_17F = add:int(var_5_17F:int, ldc:int(-1))
                    storeelement:byte(var_3_17E:byte[], var_5_17F:int, add:int(shl:int(loadelement:byte(stack_18F_0:byte[], var_5_17F:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_8D:byte[], add:int(var_5_17F:int, and:int(ldc:int(18691), ldc:int(17)))), ldc:int(6)), and:int(ldc:int(20803), ldc:int(8739)))))
                    
                    if (cmpne:boolean(var_5_17F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_AB_0 = stack_AD_0 = stack_D6_0 = stack_139_0 = stack_18F_0 = stack_1EB_0 = var_3_17E:byte[]
            }
        }
        
        Label_0150:
        
        if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_A8 = and:int(var_0_A8:int, ldc:int(-248362321))
            expr_AD = arraylength:int(stack_AD_0:byte[])
            
            if (cmpne:boolean(expr_AD:int, ldc:int(0))) {
                var_4_11C = expr_AD:int
                var_3_121 = newarray:byte[](byte.class, expr_AD:int)
                var_5_122 = expr_AD:int
                goto(Label_0470)
            }
        }
        
        Label_0178:
        
        if (cmpeq:boolean(and:int(var_0_A8:int, ldc:int(2048)), ldc:int(0))) {
            var_0_A8 = and:int(var_0_A8:int, ldc:int(376553038))
            goto(Label_0150)
        }
        
        if (cmpne:boolean(and:int(var_0_A8:int, ldc:int(1)), ldc:int(0))) {
            var_0_A8 = and:int(var_0_A8:int, ldc:int(1582572227))
            goto(Label_0112)
        }
        
        var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_115_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(272), ldc:int(273)))
        expr_F4 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4099), ldc:int(169)))
        storeelement:String(expr_F4:String[], and:int(ldc:int(23312), ldc:int(-23315)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-14199), ldc:int(14196)), xor:int(ldc:int(21), ldc:int(22))))
        putstatic:String[](\u392e\u3bc9\u8640\u385b\ub18d::\u3d4b\ub70c\uc229\u600f\ud51e\u72f1, expr_F4:String[])
    }
    
    public void \u6c52\u983f\u7873\u92ff\ua068\u4c2b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_647 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_652 : int
        
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
        var_3_647 = and:int(ldc:int(70732110), ldc:int(1782038485))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u392e\u3bc9\u8640\u385b\ub18d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(524288)), ldc:int(0))) {
            var_3_647 = and:int(var_3_647:int, ldc:int(-12620484))
            var_5_7D = and:int(ldc:int(19040), ldc:int(-19057))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21519), ldc:int(-21776)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_647:int, ldc:int(-947933756))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(-16255), ldc:int(-16256)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(65), ldc:int(1541)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_647 = and:int(var_3_CA:int, ldc:int(427187646))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(4224), ldc:int(4225)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1512)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(1)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-1976084522))
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1242183693))
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-997133117))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0775)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0638)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0538)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-179081022))
                    }
                    else {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1941343495))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0538)
                            }
                            
                            goto(Label_0775)
                        }
                    }
                    
                    Label_0381:
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-636185538))
                        goto(Label_1512)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-1551085296))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-1934982867))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0775)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0638)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1868248289))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(1279159084))
                            var_11_DB = and:int(ldc:int(7830), ldc:int(-32727))
                            goto(Label_1501)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0538:
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1512)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0775)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(4)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-934423232))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(-481778558))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_647 = and:int(var_3_647:int, ldc:int(213318030))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0775)
                        }
                    }
                    
                    Label_0638:
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1615265913))
                        goto(Label_1512)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(943378655))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-422799711))
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(256)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(-2136864654))
                            goto(Label_0538)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(-1602214064))
                            loopcontinue()
                        }
                        
                        var_3_647 = and:int(var_3_647:int, ldc:int(1219967327))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0775:
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1906831358))
                        goto(Label_1512)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-953171061))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-562997273))
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1344189661))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0638)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(256)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(-847397511))
                            goto(Label_0538)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(-1420449204))
                            goto(Label_0381)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_647 = and:int(var_3_647:int, ldc:int(1241444101))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(-23424), ldc:int(-23423))
                                goto(Label_1073)
                            }
                        }
                    }
                    
                    Label_0912:
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-1594460181))
                        goto(Label_1512)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(931271509))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(256)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(-699753330))
                            goto(Label_0775)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(4)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(-1420044436))
                            goto(Label_0638)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0538)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(4)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(1670207204))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_647 = and:int(var_3_647:int, ldc:int(1672993157))
                        var_11_DB = and:int(ldc:int(-22442), ldc:int(5800))
                    }
                    
                    Label_1073:
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(1)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(2085655995))
                        goto(Label_1512)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(4)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-1402663919))
                        goto(Label_1359)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(4)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(172902014))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(14405942))
                            goto(Label_0912)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(10413677))
                            goto(Label_0775)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(1775000653))
                            goto(Label_0638)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(2034446674))
                            goto(Label_0538)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_647 = and:int(var_3_647:int, ldc:int(1803549687))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1359)
                            }
                        }
                    }
                    
                    Label_1220:
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-1961621400))
                        goto(Label_1512)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1073)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0912)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0775)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(1303982994))
                            goto(Label_0638)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(-223703630))
                            goto(Label_0538)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(256)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(-1509310584))
                            goto(Label_0381)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_647 = and:int(var_3_647:int, ldc:int(1726215272))
                            loopcontinue()
                        }
                        
                        var_3_647 = and:int(var_3_647:int, ldc:int(884357430))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1501)
                    }
                    
                    Label_1359:
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-2049822484))
                        goto(Label_1512)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-234960458))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1951031338))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0912)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0775)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(256)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1364561829))
                        goto(Label_0638)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1961934003))
                        goto(Label_0538)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_647 = and:int(var_3_647:int, ldc:int(1085770148))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1501:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_652 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1512:
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1359)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(1273937182))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(128)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(476720499))
                        goto(Label_0912)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0775)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0638)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0538)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_647:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0381)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_647:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_647 = and:int(var_3_647:int, ldc:int(-126378219))
                        var_17_652 = add:int(var_16_109:int, xor:int(ldc:int(16674), ldc:int(16675)))
                        looporswitchbreak()
                    }
                    
                    var_3_647 = and:int(var_3_647:int, ldc:int(1660350141))
                }
                
                var_3_647 = and:int(var_3_647:int, ldc:int(1106688455))
                
                if (cmple:boolean(var_5_7D = var_17_652:int, sub:int(var_6_84:int, xor:int(ldc:int(226), ldc:int(227))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_647:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
