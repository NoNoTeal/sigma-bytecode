public class \u6b0d\u12cb\u156b\u4179\u8bb0.\u8709\ub70c\u8413\ucef1\uc31c {
    public void \u8709\ub70c\u8413\ucef1\uc31c() {
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
            invokespecial:\u8df4\u416d\u718f\uc2e8\u7af6(\u8df4\u416d\u718f\uc2e8\u7af6::<init>, this:\u8709\ub70c\u8413\ucef1\uc31c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7006\u71ae\u946b\u120d\u5140\u5140(com.google.gson.JsonObject p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u76bc\ubb2b\ubb2b\u1833\u4f52 p1, com.google.gson.JsonSerializationContext p2) {
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
            invokespecial:void(\u8df4\u416d\u718f\uc2e8\u7af6<\u76bc\ubb2b\ubb2b\u1833\u4f52>::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\u8709\ub70c\u8413\ucef1\uc31c[expected:\u8df4\u416d\u718f\uc2e8\u7af6<\u76bc\ubb2b\ubb2b\u1833\u4f52>], p0:JsonObject, p1:\u76bc\ubb2b\ubb2b\u1833\u4f52, p2:JsonSerializationContext)
            invokevirtual:void(JsonObject::addProperty, p0:JsonObject, loadelement:String(getstatic:String[](\u8709\ub70c\u8413\ucef1\uc31c::\u98a4\u99f7\u6198\u7043\uff55\uc84e), and:int(ldc:int(-29002), ldc:int(29001))), getfield:String(\u071d\u385b\ubb2b\ud158\u6198::\u99f7\u97b7\u7873\u92ee\u494c\u56bd, invokestatic:\u071d\u385b\ubb2b\ud158\u6198(\u76bc\ubb2b\ubb2b\u1833\u4f52::\uc2bd\ud217\u97b7\u5245\u36d3\u99f7, p1:\u76bc\ubb2b\ubb2b\u1833\u4f52)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u76bc\ubb2b\ubb2b\u1833\u4f52 \u5bc4\ua562\ub1b9\u34df\u6d99\ube23(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] p2) {
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
            return:\u76bc\ubb2b\ubb2b\u1833\u4f52(initobject:\u76bc\ubb2b\ubb2b\u1833\u4f52(\u76bc\ubb2b\ubb2b\u1833\u4f52::<init>, p2:\u67d0\u36d3\uae5d\u99f7\u9a18[], invokestatic:\u071d\u385b\ubb2b\ud158\u6198(\u071d\u385b\ubb2b\ud158\u6198::\u1187\u6b5f\u0a06\u527a\u7006\ub18d, invokestatic:String(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u72f1\uae5d\u3504\u64f2\u759a\u5654, p0:JsonObject, loadelement:String(getstatic:String[](\u8709\ub70c\u8413\ucef1\uc31c::\u98a4\u99f7\u6198\u7043\uff55\uc84e), and:int(ldc:int(9668), ldc:int(-9701))))), aconstnull:\ub171\u647c\u12b2\ube23\u7d52()))
        }
        
        goto(Label_0006)
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
            return:\ub6ab\ube23\ub70c\u67d0\u88c5(invokevirtual:\u76bc\ubb2b\ubb2b\u1833\u4f52[expected:\ub6ab\ube23\ub70c\u67d0\u88c5](\u8709\ub70c\u8413\ucef1\uc31c::\u5bc4\ua562\ub1b9\u34df\u6d99\ube23, this:\u8709\ub70c\u8413\ucef1\uc31c, p0:JsonObject, p1:JsonDeserializationContext, p2:\u67d0\u36d3\uae5d\u99f7\u9a18[]))
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
            invokevirtual:void(\u8709\ub70c\u8413\ucef1\uc31c::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\u8709\ub70c\u8413\ucef1\uc31c, p0:JsonObject, checkcast:\u76bc\ubb2b\ubb2b\u1833\u4f52(\u71f1\uc910\u3bc9\u516c\u93a2.\u76bc\ubb2b\ubb2b\u1833\u4f52.class, p1:\ub6ab\ube23\ub70c\u67d0\u88c5[expected:\u76bc\ubb2b\ubb2b\u1833\u4f52]), p2:JsonSerializationContext)
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
            invokevirtual:void(\u8709\ub70c\u8413\ucef1\uc31c::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\u8709\ub70c\u8413\ucef1\uc31c, p0:JsonObject, checkcast:\u76bc\ubb2b\ubb2b\u1833\u4f52(\u71f1\uc910\u3bc9\u516c\u93a2.\u76bc\ubb2b\ubb2b\u1833\u4f52.class, p1:Object[expected:\u76bc\ubb2b\ubb2b\u1833\u4f52]), p2:JsonSerializationContext)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_85_0 : byte[] [generated]
        stack_87_0 : byte[] [generated]
        stack_A1_0 : byte[] [generated]
        stack_A3_0 : byte[] [generated]
        stack_C6_0 : byte[] [generated]
        stack_129_0 : byte[] [generated]
        stack_189_0 : byte[] [generated]
        stack_1F6_0 : byte[] [generated]
        var_4_10C : int
        var_3_111 : byte[]
        var_5_112 : int
        expr_129 : byte [generated]
        var_0_17F : int
        expr_189 : byte [generated]
        stack_1C5_2 : byte [generated]
        stack_1A4_0 : byte [generated]
        expr_87 : int [generated]
        var_2_A1 : byte[]
        expr_A5 : int [generated]
        var_3_1E5 : byte[]
        var_5_1E6 : int
        var_3_D2 : String
        stack_105_0 : String[] [generated]
        expr_E4 : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(1133867641), ldc:int(-475684375))
        expr_6B = arraylength:int(stack_85_0 = stack_87_0 = stack_A1_0 = stack_A3_0 = stack_C6_0 = stack_129_0 = stack_189_0 = stack_1F6_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Ubq1O3q2Jw==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_10C = expr_6B:int
        var_3_111 = newarray:byte[](byte.class, expr_6B:int)
        var_5_112 = expr_6B:int
        Label_0276:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(32)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1595352685))
            var_5_112 = add:int(var_5_112:int, ldc:int(-1))
            expr_129 = loadelement:byte(stack_129_0:byte[], var_5_112:int)
            storeelement:byte(var_3_111:byte[], var_5_112:int, xor:int(add:int(or:int(and:int(shl:int(expr_129:byte, xor:int(ldc:int(69), ldc:int(65))), ldc:int(-16)), and:int(shr:int(expr_129:byte[expected:int], xor:int(ldc:int(41), ldc:int(45))), ldc:int(15))), ldc:int(58)), ldc:int(34)))
            
            if (cmpne:boolean(var_5_112:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_87_0 = stack_85_0 = stack_A1_0 = stack_A3_0 = stack_C6_0 = stack_129_0 = stack_189_0 = stack_1F6_0 = var_3_111:byte[]
            goto(Label_0112)
        }
        
        Label_0372:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_17F = and:int(var_0_5F:int, ldc:int(1372938977))
            var_5_112 = add:int(var_5_112:int, ldc:int(-1))
            expr_189 = stack_1C5_2 = loadelement(stack_189_0, var_5_112)
            
            if (cmplt:boolean(add:int(add:int(var_5_112:int, ldc:int(6)), neg:int(var_4_10C:int)), ldc:int(0))) {
                stack_1C5_2 = stack_1A4_0 = add:byte(expr_189:byte, loadelement:byte(var_3_111:byte[], add:int(var_5_112:int, ldc:int(6))))
                goto(Label_0436)
            }
            
            Label_0406:
            
            if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(1)), ldc:int(0))) {
                var_0_17F = and:int(var_0_17F:int, ldc:int(535670141))
                stack_1C5_2 = stack_1A4_0 = add:byte(expr_189:byte, ldc:byte(6))
            }
            
            Label_0436:
            
            if (cmpne:boolean(and:int(var_0_17F:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0406)
            }
            
            var_0_5F = and:int(var_0_17F:int, ldc:int(934641519))
            storeelement:byte(var_3_111:byte[], var_5_112:int, stack_1C5_2:byte)
            
            if (cmpne:boolean(var_5_112:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_87_0 = stack_85_0 = stack_A1_0 = stack_A3_0 = stack_C6_0 = stack_129_0 = stack_189_0 = stack_1F6_0 = var_3_111:byte[]
            goto(Label_0140)
        }
        
        goto(Label_0276)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0170)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(32768)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-211344655))
            expr_87 = arraylength:int(stack_87_0:byte[])
            
            if (cmpne:boolean(expr_87:int, ldc:int(0))) {
                var_4_10C = expr_87:int
                var_3_111 = newarray:byte[](byte.class, expr_87:int)
                var_5_112 = expr_87:int
                goto(Label_0372)
            }
        }
        
        Label_0140:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(8192)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1558873097))
            var_2_A1 = stack_A1_0:byte[]
            expr_A5 = add:int(arraylength:int(stack_A3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A5:int, ldc:int(0))) {
                var_3_1E5 = newarray:byte[](byte.class, expr_A5:int)
                var_5_1E6 = expr_A5:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(1497722733))
                    var_5_1E6 = add:int(var_5_1E6:int, ldc:int(-1))
                    storeelement:byte(var_3_1E5:byte[], var_5_1E6:int, add:int(shl:int(loadelement:byte(stack_1F6_0:byte[], var_5_1E6:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_A1:byte[], add:int(var_5_1E6:int, and:int(ldc:int(14625), ldc:int(16393)))), ldc:int(2)), xor:int(ldc:int(1811), ldc:int(1836)))))
                    
                    if (cmpne:boolean(var_5_1E6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_87_0 = stack_85_0 = stack_A1_0 = stack_A3_0 = stack_C6_0 = stack_129_0 = stack_189_0 = stack_1F6_0 = var_3_1E5:byte[]
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0140)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1331487284))
            goto(Label_0112)
        }
        
        var_3_D2 = initobject:String(String::<init>, stack_C6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_105_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(5192), ldc:int(5193)))
        expr_E4 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4353), ldc:int(8289)))
        storeelement:String(expr_E4:String[], and:int(ldc:int(-14107), ldc:int(14090)), invokevirtual:String[expected:String](String::substring, var_3_D2:String, and:int(ldc:int(25129), ldc:int(-25148)), and:int(ldc:int(3142), ldc:int(918))))
        putstatic:String[](\u8709\ub70c\u8413\ucef1\uc31c::\u98a4\u99f7\u6198\u7043\uff55\uc84e, expr_E4:String[])
    }
    
    public void \u0800\u8753\u7006\ua068\u93a2\u16f6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5FB : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_606 : int
        
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
        var_3_5FB = and:int(ldc:int(539660348), ldc:int(646585061))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8709\ub70c\u8413\ucef1\uc31c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(8192)), ldc:int(0))) {
            var_3_5FB = and:int(var_3_5FB:int, ldc:int(812302922))
        }
        else {
            var_3_5FB = and:int(var_3_5FB:int, ldc:int(1498657615))
            var_5_85 = and:int(ldc:int(-28783), ldc:int(28782))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(29648), ldc:int(-32753)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5FB:int, ldc:int(-1624368428))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(8201), ldc:int(1093)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(23040), ldc:int(23041)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5FB = and:int(var_3_DA:int, ldc:int(1098364550))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(1025), ldc:int(1024)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-2145565936))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(475799077))
                        goto(Label_1179)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1063)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(194617472))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-695435425))
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(816431459))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1751610274))
                    }
                    else {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1389159249))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-200251921))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1659481274))
                        goto(Label_1288)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1179)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-698684384))
                        goto(Label_1063)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(1577184423))
                        goto(Label_0921)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(303487028))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(517424277))
                            loopcontinue()
                        }
                        
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1367401867))
                        var_11_EB = and:int(ldc:int(-11930), ldc:int(11417))
                        goto(Label_1407)
                    }
                    
                    Label_0581:
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(772066238))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1179)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1063)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1745898514))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0786)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(385237653))
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1063)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(1122154255))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1742737418))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(1852516265))
                            loopcontinue()
                        }
                        
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1655443034))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0786:
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-2020036668))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-2036159757))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1179)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1063)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(974820086))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1414319974))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-18633889))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1194973059))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1742030145))
                            loopcontinue()
                        }
                        
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(152801566))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(2945), ldc:int(5161))
                                goto(Label_1063)
                            }
                        }
                    }
                    
                    Label_0921:
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1693452655))
                            goto(Label_0786)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(1815986925))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(64)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1741518376))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-745016889))
                        var_11_EB = and:int(ldc:int(-25500), ldc:int(25497))
                    }
                    
                    Label_1063:
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1948938106))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(1728298066))
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(1680393907))
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(128)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-136318894))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-2110383490))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1288)
                            }
                        }
                    }
                    
                    Label_1179:
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1363933907))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(-738521730))
                            goto(Label_1063)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0921)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0786)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5FB = and:int(var_3_5FB:int, ldc:int(505566390))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1288:
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(1430087211))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1179)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-273686910))
                        goto(Label_1063)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-1718951321))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5FB = and:int(var_3_5FB:int, ldc:int(1575916613))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1407:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_606 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1418:
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(602948334))
                        goto(Label_1288)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-375046332))
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(4)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(-422494507))
                        goto(Label_1063)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0921)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0786)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(555512155))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5FB:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5FB = and:int(var_3_5FB:int, ldc:int(1159410710))
                        var_17_606 = add:int(var_16_119:int, and:int(ldc:int(16385), ldc:int(7109)))
                        looporswitchbreak()
                    }
                    
                    var_3_5FB = and:int(var_3_5FB:int, ldc:int(1009374421))
                }
                
                var_3_5FB = and:int(var_3_5FB:int, ldc:int(974074452))
                
                if (cmple:boolean(var_5_85 = var_17_606:int, sub:int(var_6_8C:int, xor:int(ldc:int(53), ldc:int(52))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5FB:int, ldc:int(64)), ldc:int(0))) {
            var_3_5FB = and:int(var_3_5FB:int, ldc:int(1438382297))
            goto(Label_0106)
        }
    }
}
