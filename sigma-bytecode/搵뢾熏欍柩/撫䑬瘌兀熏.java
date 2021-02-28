public class \u6435\ub8be\u718f\u6b0d\u67e9.\u64ab\u446c\u760c\u5140\u718f {
    public void \u64ab\u446c\u760c\u5140\u718f() {
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
            invokespecial:\u8df4\u416d\u718f\uc2e8\u7af6(\u8df4\u416d\u718f\uc2e8\u7af6::<init>, this:\u64ab\u446c\u760c\u5140\u718f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7006\u71ae\u946b\u120d\u5140\u5140(com.google.gson.JsonObject p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u927d\u8753\ub171\u392e\ub7dc p1, com.google.gson.JsonSerializationContext p2) {
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
            invokespecial:void(\u8df4\u416d\u718f\uc2e8\u7af6<\u927d\u8753\ub171\u392e\ub7dc>::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\u64ab\u446c\u760c\u5140\u718f[expected:\u8df4\u416d\u718f\uc2e8\u7af6<\u927d\u8753\ub171\u392e\ub7dc>], p0:JsonObject, p1:\u927d\u8753\ub171\u392e\ub7dc, p2:JsonSerializationContext)
            invokevirtual:void(JsonObject::addProperty, p0:JsonObject, loadelement:String(getstatic:String[](\u64ab\u446c\u760c\u5140\u718f::\u4ab3\u071d\u7c6b\u5fe1\u7bad\u2dcc), and:int(ldc:int(-24581), ldc:int(24580))), invokevirtual:String(\uc31c\uc87f\uc246\u3776\ub7dc::toString, invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u927d\u8753\ub171\u392e\ub7dc::\u927d\u3dd3\ub8be\u34df\u6b5f\ud12e, p1:\u927d\u8753\ub171\u392e\ub7dc)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u927d\u8753\ub171\u392e\ub7dc \u5bc4\ua562\ub1b9\u34df\u6d99\ube23(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] p2) {
        var_4_61 : int
        var_6_7C : \uc31c\uc87f\uc246\u3776\ub7dc
        expr_85 : \u927d\u8753\ub171\u392e\ub7dc [generated]
        var_6_9C : CommandSyntaxException
        
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
        var_4_61 = and:int(ldc:int(261338616), ldc:int(-270025485))
        
        try {
            var_4_61 = and:int(var_4_61:int, ldc:int(-537405645))
            var_6_7C = invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\u3e75\u6c52\u946b\u76bc\uc31c::\u8df4\u0b8e\u983f\u8c8a\uc9f6\u8308, invokestatic:String(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u72f1\uae5d\u3504\u64f2\u759a\u5654, p0:JsonObject, loadelement:String(getstatic:String[](\u64ab\u446c\u760c\u5140\u718f::\u4ab3\u071d\u7c6b\u5fe1\u7bad\u2dcc), and:int(ldc:int(-2426), ldc:int(2417)))))
            var_4_61 = and:int(var_4_61:int, ldc:int(-1370508204))
            expr_85 = initobject:\u927d\u8753\ub171\u392e\ub7dc(\u927d\u8753\ub171\u392e\ub7dc::<init>, p2:\u67d0\u36d3\uae5d\u99f7\u9a18[], var_6_7C:\uc31c\uc87f\uc246\u3776\ub7dc, aconstnull:\u4daf\uc910\u62da\ud36e\u647c())
            var_4_61 = and:int(var_4_61:int, ldc:int(-1900022119))
            return:\u927d\u8753\ub171\u392e\ub7dc(expr_85:\u927d\u8753\ub171\u392e\ub7dc)
        }
        catch (com.mojang.brigadier.exceptions.CommandSyntaxException var_6_9C) {
            athrow(initobject:JsonSyntaxException(JsonSyntaxException::<init>, invokevirtual:String(CommandSyntaxException::getMessage, var_6_9C:CommandSyntaxException)))
        }
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ub6ab\ube23\ub70c\u67d0\u88c5 \u5bc4\ua562\ub1b9\u34df\u6d99\ube23(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] p2) {
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
            return:\ub6ab\ube23\ub70c\u67d0\u88c5(invokevirtual:\u927d\u8753\ub171\u392e\ub7dc[expected:\ub6ab\ube23\ub70c\u67d0\u88c5](\u64ab\u446c\u760c\u5140\u718f::\u5bc4\ua562\ub1b9\u34df\u6d99\ube23, this:\u64ab\u446c\u760c\u5140\u718f, p0:JsonObject, p1:JsonDeserializationContext, p2:\u67d0\u36d3\uae5d\u99f7\u9a18[]))
        }
        
        goto(Label_0006)
    }
    
    public void \u7006\u71ae\u946b\u120d\u5140\u5140(com.google.gson.JsonObject p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ub6ab\ube23\ub70c\u67d0\u88c5 p1, com.google.gson.JsonSerializationContext p2) {
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
            invokevirtual:void(\u64ab\u446c\u760c\u5140\u718f::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\u64ab\u446c\u760c\u5140\u718f, p0:JsonObject, checkcast:\u927d\u8753\ub171\u392e\ub7dc(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u927d\u8753\ub171\u392e\ub7dc.class, p1:\ub6ab\ube23\ub70c\u67d0\u88c5[expected:\u927d\u8753\ub171\u392e\ub7dc]), p2:JsonSerializationContext)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7006\u71ae\u946b\u120d\u5140\u5140(com.google.gson.JsonObject p0, java.lang.Object p1, com.google.gson.JsonSerializationContext p2) {
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
            invokevirtual:void(\u64ab\u446c\u760c\u5140\u718f::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\u64ab\u446c\u760c\u5140\u718f, p0:JsonObject, checkcast:\u927d\u8753\ub171\u392e\ub7dc(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u927d\u8753\ub171\u392e\ub7dc.class, p1:Object[expected:\u927d\u8753\ub171\u392e\ub7dc]), p2:JsonSerializationContext)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_17F : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_191_0 : byte[] [generated]
        stack_1EE_0 : byte[] [generated]
        stack_263_0 : byte[] [generated]
        stack_2B8_0 : byte[] [generated]
        var_4_16C : int
        var_3_171 : byte[]
        var_5_172 : int
        expr_194 : byte [generated]
        var_0_206 : int
        expr_1EE : byte [generated]
        stack_232_2 : byte [generated]
        stack_209_0 : byte [generated]
        expr_96 : int [generated]
        var_2_BF : byte[]
        expr_C3 : int [generated]
        var_3_252 : byte[]
        var_5_253 : int
        expr_F6 : int [generated]
        var_3_2A7 : byte[]
        var_5_2A8 : int
        var_3_132 : String
        stack_165_0 : String[] [generated]
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
        var_0_17F = and:int(ldc:int(614493699), ldc:int(-1007916530))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_BF_0 = stack_C1_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_191_0 = stack_1EE_0 = stack_263_0 = stack_2B8_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("HdKKkg==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_16C = expr_6B:int
        var_3_171 = newarray:byte[](byte.class, expr_6B:int)
        var_5_172 = expr_6B:int
        Label_0372:
        
        while (cmpne:boolean(and:int(var_0_17F:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(317029954))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_194 = xor:byte(loadelement:byte(stack_191_0:byte[], var_5_172:int), ldc:byte(77))
            storeelement:byte(var_3_171:byte[], var_5_172:int, or:int(and:int(shl:int(expr_194:byte, and:int(ldc:int(29190), ldc:int(2244))), ldc:int(-16)), and:int(shr:int(expr_194:byte[expected:int], xor:int(ldc:int(9472), ldc:int(9476))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_191_0 = stack_1EE_0 = stack_263_0 = stack_2B8_0 = var_3_171:byte[]
            goto(Label_0112)
        }
        
        var_0_17F = and:int(var_0_17F:int, ldc:int(-61448147))
        Label_0473:
        
        while (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_206 = and:int(var_0_17F:int, ldc:int(-73142653))
            var_5_172 = add:int(var_5_172:int, ldc:int(-1))
            expr_1EE = stack_232_2 = loadelement(stack_1EE_0, var_5_172)
            
            if (cmplt:boolean(add:int(add:int(var_5_172:int, ldc:int(3)), neg:int(var_4_16C:int)), ldc:int(0))) {
                stack_232_2 = stack_209_0 = add:byte(expr_1EE:byte, loadelement:byte(var_3_171:byte[], add:int(var_5_172:int, ldc:int(3))))
                goto(Label_0537)
            }
            
            Label_0507:
            
            if (cmpeq:boolean(and:int(var_0_206:int, ldc:int(64)), ldc:int(0))) {
                var_0_206 = and:int(var_0_206:int, ldc:int(787577814))
                stack_232_2 = stack_209_0 = add:byte(expr_1EE:byte, ldc:byte(3))
            }
            
            Label_0537:
            
            if (cmpeq:boolean(and:int(var_0_206:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_206 = and:int(var_0_206:int, ldc:int(-1716948407))
                goto(Label_0507)
            }
            
            var_0_17F = and:int(var_0_206:int, ldc:int(2074279638))
            storeelement:byte(var_3_171:byte[], var_5_172:int, stack_232_2:byte)
            
            if (cmpne:boolean(var_5_172:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_191_0 = stack_1EE_0 = stack_263_0 = stack_2B8_0 = var_3_171:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0372)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(512)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-1909726173))
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(8)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-1427701869))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_16C = expr_96:int
                var_3_171 = newarray:byte[](byte.class, expr_96:int)
                var_5_172 = expr_96:int
                goto(Label_0473)
            }
        }
        
        Label_0155:
        
        if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(4)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(1951684628))
        }
        else {
            if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_17F = and:int(var_0_17F:int, ldc:int(837512115))
            var_2_BF = stack_BF_0:byte[]
            expr_C3 = add:int(arraylength:int(stack_C1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_3_252 = newarray:byte[](byte.class, expr_C3:int)
                var_5_253 = expr_C3:int
                
                loop {
                    var_0_17F = and:int(var_0_17F:int, ldc:int(-1229262993))
                    var_5_253 = add:int(var_5_253:int, ldc:int(-1))
                    storeelement:byte(var_3_252:byte[], var_5_253:int, add:int(shl:int(loadelement:byte(stack_263_0:byte[], var_5_253:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_BF:byte[], add:int(var_5_253:int, and:int(ldc:int(2057), ldc:int(5219)))), ldc:int(7)), xor:int(ldc:int(8224), ldc:int(8225)))))
                    
                    if (cmpne:boolean(var_5_253:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_191_0 = stack_1EE_0 = stack_263_0 = stack_2B8_0 = var_3_252:byte[]
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(-1360064953))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_17F:int, ldc:int(16384)), ldc:int(0))) {
                var_0_17F = and:int(var_0_17F:int, ldc:int(1827243553))
                goto(Label_0155)
            }
            
            if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_17F = and:int(var_0_17F:int, ldc:int(1004826270))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_2A7 = newarray:byte[](byte.class, expr_F6:int)
                var_5_2A8 = expr_F6:int
                
                loop {
                    var_0_17F = and:int(var_0_17F:int, ldc:int(2025455430))
                    var_5_2A8 = add:int(var_5_2A8:int, ldc:int(-1))
                    storeelement:byte(var_3_2A7:byte[], var_5_2A8:int, add:byte(loadelement:byte(stack_2B8_0:byte[], var_5_2A8:int), ldc:byte(105)))
                    
                    if (cmpne:boolean(var_5_2A8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_BF_0 = stack_C1_0 = stack_F4_0 = stack_F6_0 = stack_126_0 = stack_191_0 = stack_1EE_0 = stack_263_0 = stack_2B8_0 = var_3_2A7:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(1009130757))
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(8)), ldc:int(0))) {
            var_0_17F = and:int(var_0_17F:int, ldc:int(166306142))
            goto(Label_0112)
        }
        
        var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_165_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8273), ldc:int(8272)))
        expr_144 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(9219), ldc:int(22593)))
        storeelement:String(expr_144:String[], and:int(ldc:int(16682), ldc:int(-16683)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(25895), ldc:int(-26408)), and:int(ldc:int(6411), ldc:int(547))))
        putstatic:String[](\u64ab\u446c\u760c\u5140\u718f::\u4ab3\u071d\u7c6b\u5fe1\u7bad\u2dcc, expr_144:String[])
    }
    
    public void \u0800\u8753\u7006\ua068\u93a2\u16f6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_651 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_65C : int
        
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
        var_3_651 = and:int(ldc:int(855505776), ldc:int(2042624663))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u64ab\u446c\u760c\u5140\u718f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
            var_3_651 = and:int(var_3_651:int, ldc:int(-54531342))
            var_5_7D = and:int(ldc:int(11940), ldc:int(-11944))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-28786), ldc:int(28753)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_651:int, ldc:int(1429207962))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(4103), ldc:int(4102)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(117), ldc:int(129)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_651 = and:int(var_3_CA:int, ldc:int(-248517957))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(544), ldc:int(545)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(128)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1758285517))
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1728885222))
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-524955175))
                        goto(Label_0836)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1555291039))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1052144519))
                    }
                    else {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1925184408))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0565)
                            }
                            
                            goto(Label_0836)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-233482656))
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1776646984))
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-733526366))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(33468401))
                        goto(Label_0836)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(892248276))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(852783216))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1198878355))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(1350545168))
                        var_11_DB = and:int(ldc:int(-10353), ldc:int(10352))
                        goto(Label_1492)
                    }
                    
                    Label_0565:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(285729193))
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(595389580))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-787468343))
                        goto(Label_1088)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1428561068))
                        goto(Label_0836)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1591289104))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1077528896))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(2129636030))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0836)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-686299843))
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1121513447))
                        goto(Label_1088)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1811681442))
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1332886910))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(2007577169))
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-739263916))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0836:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-449106381))
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1162224098))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1088)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(865346863))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(1433382458))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(201), ldc:int(27671))
                                goto(Label_1088)
                            }
                        }
                    }
                    
                    Label_0943:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(128)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-473325472))
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0836)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-254820723))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(307856342))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(901639830))
                        var_11_DB = and:int(ldc:int(-18647), ldc:int(18642))
                    }
                    
                    Label_1088:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1935235074))
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-875457139))
                            goto(Label_0943)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0836)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0565)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_651 = and:int(var_3_651:int, ldc:int(-188765639))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1354)
                            }
                        }
                    }
                    
                    Label_1190:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(869634638))
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1869435372))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(733375112))
                            goto(Label_1088)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-89547404))
                            goto(Label_0943)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(447184455))
                            goto(Label_0836)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-408019075))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(1786765607))
                            goto(Label_0565)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1445461978))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_651 = and:int(var_3_651:int, ldc:int(-1687290889))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1492)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1354:
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(4)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(2052031404))
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-53131167))
                        goto(Label_1088)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(782357531))
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0836)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-274448507))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1435015017))
                        loopcontinue()
                    }
                    
                    var_3_651 = and:int(var_3_651:int, ldc:int(-1774208418))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1492:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65C = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1503:
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-717771146))
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(8)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(256604337))
                        goto(Label_1088)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(-1744996515))
                        goto(Label_0836)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0565)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_651:int, ldc:int(512)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(1457681952))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_651 = and:int(var_3_651:int, ldc:int(914222813))
                        var_17_65C = add:int(var_16_109:int, and:int(ldc:int(129), ldc:int(5)))
                        looporswitchbreak()
                    }
                    
                    var_3_651 = and:int(var_3_651:int, ldc:int(-1283137595))
                }
                
                var_3_651 = and:int(var_3_651:int, ldc:int(-633492802))
                
                if (cmple:boolean(var_5_7D = var_17_65C:int, sub:int(var_6_84:int, and:int(ldc:int(3205), ldc:int(273))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_651:int, ldc:int(268435456)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
