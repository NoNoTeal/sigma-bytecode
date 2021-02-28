public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u4daf\ub19c\ua562\u3c25\u12cb\ubded {
    public void \u4daf\ub19c\ua562\u3c25\u12cb\ubded() {
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
            invokespecial:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u1833\ud171\u8350\ubded\u34df\uc9f6::<init>, this:\u4daf\ub19c\ua562\u3c25\u12cb\ubded, ldc:Class<JsonElement>(com.google.gson.JsonElement.class))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.google.gson.JsonElement \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
        var_2_64 : int
        var_4_6C : String
        stack_80_0 : JsonElement [generated]
        var_5_85 : JsonSyntaxException
        
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
        var_2_64 = and:int(and:int(ldc:int(-980831175), ldc:int(-2068998465)), ldc:int(-1898352299))
        var_4_6C = invokevirtual:String(\u4daf\u8308\uc238\u3711\u4179\ucfaf::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, getstatic:\u4daf\u8308\uc238\u3711\u4179\ucfaf(\u4daf\ub19c\ua562\u3c25\u12cb\ubded::\ubb2b\u965f\u3776\u9033\ub83f\u8389), p0:ByteBuf)
        
        try {
            var_2_64 = and:int(var_2_64:int, ldc:int(-1614185519))
            stack_80_0 = invokevirtual:JsonElement(JsonParser::parse, invokestatic:JsonParser(\u8308\u16f6\u71f1\uc3e3\uc2bd\u7c6b::\u7af6\u6c56\u647c\u4bc8\uc4d2\ub102), var_4_6C:String)
            var_2_64 = and:int(var_2_64:int, ldc:int(-539019745))
            return:JsonElement(stack_80_0:JsonElement)
        }
        catch (com.google.gson.JsonSyntaxException var_5_85) {
            invokevirtual:void(Logger::severe, invokeinterface:Logger(\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3::\u8709\u839e\uafe7\ua61f\u71ae\ud158, invokestatic:\u0b8e\u12cb\ud523\u8308\u6fb0\u4ab3(\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b::\u836c\u527a\u76bc\u4492\u72f1\u98a4)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Error when trying to parse json: ")), var_4_6C:String)))
            athrow(var_5_85:JsonSyntaxException)
        }
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, com.google.gson.JsonElement p1) {
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
            invokevirtual:void(\u4daf\u8308\uc238\u3711\u4179\ucfaf::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, getstatic:\u4daf\u8308\uc238\u3711\u4179\ucfaf(\u4daf\ub19c\ua562\u3c25\u12cb\ubded::\ubb2b\u965f\u3776\u9033\ub83f\u8389), p0:ByteBuf, invokevirtual:String(JsonElement::toString, p1:JsonElement))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u4d85\uff55\uc3e3\ud4fe\u9937\uc229(io.netty.buffer.ByteBuf p0) {
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
            return:Object(invokevirtual:JsonElement[expected:Object](\u4daf\ub19c\ua562\u3c25\u12cb\ubded::\u4d85\uff55\uc3e3\ud4fe\u9937\uc229, this:\u4daf\ub19c\ua562\u3c25\u12cb\ubded, p0:ByteBuf))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\uc229\ufe34\u36d3\u5f50\uc2e8(io.netty.buffer.ByteBuf p0, java.lang.Object p1) {
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
            invokevirtual:void(\u4daf\ub19c\ua562\u3c25\u12cb\ubded::\ud171\uc229\ufe34\u36d3\u5f50\uc2e8, this:\u4daf\ub19c\ua562\u3c25\u12cb\ubded, p0:ByteBuf, checkcast:JsonElement(com.google.gson.JsonElement.class, p1:Object[expected:JsonElement]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
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
            putstatic:\u4daf\u8308\uc238\u3711\u4179\ucfaf(\u4daf\ub19c\ua562\u3c25\u12cb\ubded::\ubb2b\u965f\u3776\u9033\ub83f\u8389, initobject:\u4daf\u8308\uc238\u3711\u4179\ucfaf(\u4daf\u8308\uc238\u3711\u4179\ucfaf::<init>, ldc:int(262144)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8cae\u5f50\u3e75\uceb8\u873d\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_5F2 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_5FD : int
        
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
        var_3_5F2 = and:int(ldc:int(2103923572), ldc:int(-428877517))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4daf\ub19c\ua562\u3c25\u12cb\ubded[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-467597998))
        }
        else {
            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1660977287))
            var_5_85 = and:int(ldc:int(25680), ldc:int(-25685))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-19933), ldc:int(17820)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_5F2:int, ldc:int(-156795095))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(8453), ldc:int(8452)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(28673), ldc:int(1091)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_5F2 = and:int(var_3_D2:int, ldc:int(-1782898881))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-30648), ldc:int(-30647)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(14566162))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1951397404))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-873044382))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1875948800))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(842261958))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-666484956))
                    }
                    else {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-810051721))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-159723587))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1652255516))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1838774378))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1346804272))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1620845129))
                            var_11_E3 = and:int(ldc:int(1447), ldc:int(-13736))
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1044831683))
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-401995627))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1909050201))
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(771181404))
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1433614767))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(886338100))
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-2125958177))
                        goto(Label_1130)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1439925755))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(237500335))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(597797208))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1270903025))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1019)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-630470807))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(237355912))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1984937859))
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1060093437))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(610), ldc:int(611))
                                goto(Label_1019)
                            }
                        }
                    }
                    
                    Label_0897:
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1579827446))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1588312499))
                        var_11_E3 = and:int(ldc:int(-5894), ldc:int(5893))
                    }
                    
                    Label_1019:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1272247070))
                        goto(Label_1418)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(524268032))
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1608561432))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1102537309))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-2068375758))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1261)
                            }
                        }
                    }
                    
                    Label_1130:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1248969934))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1966842112))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1103140145))
                            goto(Label_1019)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-490206796))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1043207814))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                            var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1039643631))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1407)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1261:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-168380441))
                        goto(Label_1418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(549605904))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1581516026))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1151850219))
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(263978811))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1466300777))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-1755062872))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1407:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_5FD = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1418:
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(901804113))
                        goto(Label_1130)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(607669731))
                        goto(Label_1019)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1578913198))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(1627661199))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-853278734))
                        var_17_5FD = add:int(var_16_111:int, and:int(ldc:int(9937), ldc:int(18725)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5F2 = and:int(var_3_5F2:int, ldc:int(-718597142))
                
                if (cmple:boolean(var_5_85 = var_17_5FD:int, sub:int(var_6_8C:int, and:int(ldc:int(737), ldc:int(17665))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_5F2:int, ldc:int(2048)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
