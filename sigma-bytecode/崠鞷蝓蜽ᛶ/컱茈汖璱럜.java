public class \u5d20\u97b7\u8753\u873d\u16f6.\ucef1\u8308\u6c56\u74b1\ub7dc {
    public void \ucef1\u8308\u6c56\u74b1\ub7dc() {
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
            invokespecial:\u8df4\u416d\u718f\uc2e8\u7af6(\u8df4\u416d\u718f\uc2e8\u7af6::<init>, this:\ucef1\u8308\u6c56\u74b1\ub7dc)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7006\u71ae\u946b\u120d\u5140\u5140(com.google.gson.JsonObject p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u6cfe\u3bc9\u385b\uc7fe\u88c5 p1, com.google.gson.JsonSerializationContext p2) {
        var_4_61 : int
        var_6_71 : JsonArray
        var_7_7C : Iterator<\u9033\u5654\u071d\ub113\uc246>
        
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
            var_4_61 = and:int(ldc:int(1522809518), ldc:int(1888230591))
            invokespecial:void(\u8df4\u416d\u718f\uc2e8\u7af6<\u6cfe\u3bc9\u385b\uc7fe\u88c5>::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\ucef1\u8308\u6c56\u74b1\ub7dc[expected:\u8df4\u416d\u718f\uc2e8\u7af6<\u6cfe\u3bc9\u385b\uc7fe\u88c5>], p0:JsonObject, p1:\u6cfe\u3bc9\u385b\uc7fe\u88c5, p2:JsonSerializationContext)
            var_6_71 = initobject:JsonArray(JsonArray::<init>)
            var_7_7C = invokeinterface:Iterator(List::iterator, invokestatic:List(\u6cfe\u3bc9\u385b\uc7fe\u88c5::\u4d85\u3dd3\u64f2\ufcaf\u9033\u4f4a, p1:\u6cfe\u3bc9\u385b\uc7fe\u88c5))
            
            loop {
                var_4_61 = and:int(var_4_61:int, ldc:int(981376508))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_7_7C:Iterator<\u9033\u5654\u071d\ub113\uc246>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(JsonArray::add, var_6_71:JsonArray, invokevirtual:JsonObject(\u9033\u5654\u071d\ub113\uc246::\u7006\u1833\uf9c5\u4bc8\u600f\u5140, checkcast:\u9033\u5654\u071d\ub113\uc246(\ub113\uc4d2\u183a\u527a\u6435.\u9033\u5654\u071d\ub113\uc246.class, invokeinterface:\u9033\u5654\u071d\ub113\uc246(Iterator<\u9033\u5654\u071d\ub113\uc246>::next, var_7_7C:Iterator<\u9033\u5654\u071d\ub113\uc246>)), p2:JsonSerializationContext))
            }
            
            invokevirtual:void(JsonObject::add, p0:JsonObject, loadelement:String(getstatic:String[](\ucef1\u8308\u6c56\u74b1\ub7dc::\u6fb0\u6bb9\ua562\u527a\u4c04\u12cb), and:int(ldc:int(-19887), ldc:int(19758))), var_6_71:JsonElement)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u6cfe\u3bc9\u385b\uc7fe\u88c5 \u5bc4\ua562\ub1b9\u34df\u6d99\ube23(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] p2) {
        var_4_61 : int
        var_6_72 : JsonArray
        var_7_7C : ArrayList
        var_8_83 : Iterator
        
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
        var_4_61 = and:int(ldc:int(716344832), ldc:int(-1344852432))
        var_6_72 = invokestatic:JsonArray(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u4bc8\u446c\u873d\u3dd3\uf94d\u7bad, p0:JsonObject, loadelement:String(getstatic:String[](\ucef1\u8308\u6c56\u74b1\ub7dc::\u6fb0\u6bb9\ua562\u527a\u4c04\u12cb), and:int(ldc:int(-30521), ldc:int(26408))))
        var_7_7C = invokestatic:ArrayList(Lists::newArrayListWithExpectedSize, invokevirtual:int(JsonArray::size, var_6_72:JsonArray))
        var_8_83 = invokevirtual:Iterator(JsonArray::iterator, var_6_72:JsonArray)
        
        loop {
            if (cmpne:boolean(and:int(var_4_61:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_61 = and:int(var_4_61:int, ldc:int(-1170945444))
                
                if (invokeinterface:boolean(Iterator::hasNext, var_8_83:Iterator)) {
                    invokeinterface:boolean(List<\u9033\u5654\u071d\ub113\uc246>::add, var_7_7C:ArrayList<\u9033\u5654\u071d\ub113\uc246>[expected:List<\u9033\u5654\u071d\ub113\uc246>], invokestatic:\u9033\u5654\u071d\ub113\uc246(\u9033\u5654\u071d\ub113\uc246::\uf995\u69d9\u6fb0\u624e\u8413\u6198, invokestatic:JsonObject(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u51fa\u9af2\u718f\u3bc9\ud217\ub18d, checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:JsonElement(Iterator<JsonElement>::next, var_8_83:Iterator<JsonElement>)), loadelement:String(getstatic:String[](\ucef1\u8308\u6c56\u74b1\ub7dc::\u6fb0\u6bb9\ua562\u527a\u4c04\u12cb), xor:int(ldc:int(-32680), ldc:int(-32679)))), p1:JsonDeserializationContext))
                    loopcontinue()
                }
            }
            
            if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(262144)), ldc:int(0))) {
                looporswitchbreak()
            }
            
            var_4_61 = and:int(var_4_61:int, ldc:int(1554938886))
        }
        
        if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, var_7_7C:ArrayList<\u9033\u5654\u071d\ub113\uc246>))) {
            return:\u6cfe\u3bc9\u385b\uc7fe\u88c5(initobject:\u6cfe\u3bc9\u385b\uc7fe\u88c5(\u6cfe\u3bc9\u385b\uc7fe\u88c5::<init>, p2:\u67d0\u36d3\uae5d\u99f7\u9a18[], var_7_7C:ArrayList<\u9033\u5654\u071d\ub113\uc246>[expected:List], aconstnull:\u6b0d\u3711\u7c6b\u3bc9\ud171()))
        }
        
        athrow(initobject:JsonSyntaxException(JsonSyntaxException::<init>, loadelement:String(getstatic:String[](\ucef1\u8308\u6c56\u74b1\ub7dc::\u6fb0\u6bb9\ua562\u527a\u4c04\u12cb), and:int(ldc:int(16410), ldc:int(3)))))
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
            return:\ub6ab\ube23\ub70c\u67d0\u88c5(invokevirtual:\u6cfe\u3bc9\u385b\uc7fe\u88c5[expected:\ub6ab\ube23\ub70c\u67d0\u88c5](\ucef1\u8308\u6c56\u74b1\ub7dc::\u5bc4\ua562\ub1b9\u34df\u6d99\ube23, this:\ucef1\u8308\u6c56\u74b1\ub7dc, p0:JsonObject, p1:JsonDeserializationContext, p2:\u67d0\u36d3\uae5d\u99f7\u9a18[]))
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
            invokevirtual:void(\ucef1\u8308\u6c56\u74b1\ub7dc::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\ucef1\u8308\u6c56\u74b1\ub7dc, p0:JsonObject, checkcast:\u6cfe\u3bc9\u385b\uc7fe\u88c5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u6cfe\u3bc9\u385b\uc7fe\u88c5.class, p1:\ub6ab\ube23\ub70c\u67d0\u88c5[expected:\u6cfe\u3bc9\u385b\uc7fe\u88c5]), p2:JsonSerializationContext)
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
            invokevirtual:void(\ucef1\u8308\u6c56\u74b1\ub7dc::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\ucef1\u8308\u6c56\u74b1\ub7dc, p0:JsonObject, checkcast:\u6cfe\u3bc9\u385b\uc7fe\u88c5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u6cfe\u3bc9\u385b\uc7fe\u88c5.class, p1:Object[expected:\u6cfe\u3bc9\u385b\uc7fe\u88c5]), p2:JsonSerializationContext)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1F7 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_9E_0 : byte[] [generated]
        stack_A0_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_209_0 : byte[] [generated]
        stack_266_0 : byte[] [generated]
        stack_2DE_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_194 : byte[]
        var_4_195 : int
        expr_A0 : int [generated]
        var_5_1E4 : int
        var_3_1E9 : byte[]
        var_4_1EA : int
        expr_209 : byte [generated]
        var_0_27E : int
        expr_266 : byte [generated]
        stack_2AA_2 : byte [generated]
        stack_281_0 : byte [generated]
        expr_C3 : int [generated]
        expr_EE : int [generated]
        var_3_2CD : byte[]
        var_4_2CE : int
        var_3_122 : String
        stack_18B_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
            var_0_1F7 = and:int(ldc:int(1195943020), ldc:int(1322231239))
            expr_65 = var_2_69 = stack_9E_0 = stack_A0_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_209_0 = stack_266_0 = stack_2DE_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AMrZYr/UylN2XWHfVFE+ZuLd/9NZ38vWtFpa2f5VuUNeWIV8WNcwXVRH8tzQcFpc4mJn01nfzNla3OfTWd/L0e/sdPA="))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_194 = newarray:byte[](byte.class, expr_6D:int)
                var_4_195 = expr_6D:int
                
                loop {
                    var_0_1F7 = and:int(var_0_1F7:int, ldc:int(109493470))
                    var_4_195 = add:int(var_4_195:int, ldc:int(-1))
                    storeelement:byte(var_3_194:byte[], var_4_195:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_195:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_195:int, xor:int(ldc:int(528), ldc:int(529)))), ldc:int(3)), xor:int(ldc:int(135), ldc:int(152)))))
                    
                    if (cmpne:boolean(var_4_195:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A0_0 = stack_9E_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_209_0 = stack_266_0 = stack_2DE_0 = var_3_194:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(1024)), ldc:int(0))) {
                    var_0_1F7 = and:int(var_0_1F7:int, ldc:int(1001004822))
                    goto(Label_0243)
                }
                
                if (cmpne:boolean(and:int(var_0_1F7:int, ldc:int(2048)), ldc:int(0))) {
                    var_0_1F7 = and:int(var_0_1F7:int, ldc:int(1050969081))
                    goto(Label_0200)
                }
                
                if (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_0_1F7 = and:int(var_0_1F7:int, ldc:int(-896143389))
                expr_A0 = arraylength:int(stack_A0_0:byte[])
                
                if (cmpeq:boolean(expr_A0:int, ldc:int(0))) {
                    goto(Label_0165)
                }
                
                var_5_1E4 = expr_A0:int
                var_3_1E9 = newarray:byte[](byte.class, expr_A0:int)
                var_4_1EA = expr_A0:int
                Label_0492:
                
                while (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_1F7 = and:int(var_0_1F7:int, ldc:int(305540549))
                    var_4_1EA = add:int(var_4_1EA:int, ldc:int(-1))
                    expr_209 = loadelement:byte(stack_209_0:byte[], var_4_1EA:int)
                    storeelement:byte(var_3_1E9:byte[], var_4_1EA:int, add:int(or:int(and:int(shl:int(expr_209:byte, xor:int(ldc:int(283), ldc:int(287))), ldc:int(-16)), and:int(shr:int(expr_209:byte[expected:int], xor:int(ldc:int(17459), ldc:int(17463))), ldc:int(15))), ldc:int(76)))
                    
                    if (cmpne:boolean(var_4_1EA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_209_0 = stack_266_0 = stack_2DE_0 = var_3_1E9:byte[]
                    goto(Label_0165)
                }
                
                var_0_1F7 = and:int(var_0_1F7:int, ldc:int(299850058))
                Label_0593:
                
                while (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(8388608)), ldc:int(0))) {
                    var_0_27E = and:int(var_0_1F7:int, ldc:int(-2086195263))
                    var_4_1EA = add:int(var_4_1EA:int, ldc:int(-1))
                    expr_266 = stack_2AA_2 = loadelement(stack_266_0, var_4_1EA)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_1EA:int, ldc:int(4)), neg:int(var_5_1E4:int)), ldc:int(0))) {
                        stack_2AA_2 = stack_281_0 = add:byte(expr_266:byte, loadelement:byte(var_3_1E9:byte[], add:int(var_4_1EA:int, ldc:int(4))))
                        goto(Label_0657)
                    }
                    
                    Label_0627:
                    
                    if (cmpeq:boolean(and:int(var_0_27E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_0_27E = and:int(var_0_27E:int, ldc:int(2142862836))
                        stack_2AA_2 = stack_281_0 = add:byte(expr_266:byte, ldc:byte(4))
                    }
                    
                    Label_0657:
                    
                    if (cmpeq:boolean(and:int(var_0_27E:int, ldc:int(64)), ldc:int(0))) {
                        var_0_27E = and:int(var_0_27E:int, ldc:int(-58209053))
                        goto(Label_0627)
                    }
                    
                    var_0_1F7 = and:int(var_0_27E:int, ldc:int(1926473725))
                    storeelement:byte(var_3_1E9:byte[], var_4_1EA:int, stack_2AA_2:byte)
                    
                    if (cmpne:boolean(var_4_1EA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_A0_0 = stack_9E_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_209_0 = stack_266_0 = stack_2DE_0 = var_3_1E9:byte[]
                    goto(Label_0200)
                }
                
                goto(Label_0492)
                Label_0165:
                
                if (cmpne:boolean(and:int(var_0_1F7:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0243)
                }
                
                if (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(262144)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_1F7 = and:int(var_0_1F7:int, ldc:int(198649711))
                    expr_C3 = arraylength:int(stack_C3_0:byte[])
                    
                    if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                        var_5_1E4 = expr_C3:int
                        var_3_1E9 = newarray:byte[](byte.class, expr_C3:int)
                        var_4_1EA = expr_C3:int
                        goto(Label_0593)
                    }
                }
                
                Label_0200:
                
                if (cmpne:boolean(and:int(var_0_1F7:int, ldc:int(2097152)), ldc:int(0))) {
                    var_0_1F7 = and:int(var_0_1F7:int, ldc:int(1058047659))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_1F7:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0165)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_1F7:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_1F7 = and:int(var_0_1F7:int, ldc:int(-1159715385))
                    expr_EE = arraylength:int(stack_EE_0:byte[])
                    
                    if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                        var_3_2CD = newarray:byte[](byte.class, expr_EE:int)
                        var_4_2CE = expr_EE:int
                        
                        loop {
                            var_0_1F7 = and:int(var_0_1F7:int, ldc:int(-433046078))
                            var_4_2CE = add:int(var_4_2CE:int, ldc:int(-1))
                            storeelement:byte(var_3_2CD:byte[], var_4_2CE:int, xor:byte(loadelement:byte(stack_2DE_0:byte[], var_4_2CE:int), ldc:byte(74)))
                            
                            if (cmpne:boolean(var_4_2CE:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_A0_0 = stack_9E_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_209_0 = stack_266_0 = stack_2DE_0 = var_3_2CD:byte[]
                    }
                }
                
                Label_0243:
                
                if (cmpne:boolean(and:int(var_0_1F7:int, ldc:int(16384)), ldc:int(0))) {
                    var_0_1F7 = and:int(var_0_1F7:int, ldc:int(-75605625))
                    goto(Label_0200)
                }
                
                if (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0165)
                }
                
                if (cmpeq:boolean(and:int(var_0_1F7:int, ldc:int(8388608)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_18B_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(651), ldc:int(648)))
            expr_134 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(163), ldc:int(579)))
            storeelement:String(expr_134:String[], xor:int(ldc:int(105), ldc:int(107)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(-31648), ldc:int(30859)), xor:int(ldc:int(21), ldc:int(39))))
            storeelement:String(expr_134:String[], and:int(ldc:int(16425), ldc:int(4291)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(1587), ldc:int(4154)), and:int(ldc:int(10042), ldc:int(122))))
            storeelement:String(expr_134:String[], and:int(ldc:int(-18585), ldc:int(18584)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(221), ldc:int(231)), xor:int(ldc:int(20637), ldc:int(20702))))
            putstatic:String[](\ucef1\u8308\u6c56\u74b1\ub7dc::\u6fb0\u6bb9\ua562\u527a\u4c04\u12cb, expr_134:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0800\u8753\u7006\ua068\u93a2\u16f6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_653 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C4 : double
        var_3_D6 : int
        var_11_E7 : int
        var_14_111 : double
        var_16_115 : int
        var_12_10D : double
        var_17_65E : int
        
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
        var_3_653 = and:int(ldc:int(-1372692586), ldc:int(1046802173))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucef1\u8308\u6c56\u74b1\ub7dc[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_653 = and:int(var_3_653:int, ldc:int(1874742795))
            var_5_7D = and:int(ldc:int(-20415), ldc:int(18206))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10413), ldc:int(10412)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C4 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D6 = and:int(var_3_653:int, ldc:int(1064223421))
                    var_9_C4 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E7 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E7:int, sub:int(var_6_84:int, xor:int(ldc:int(657), ldc:int(656)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E7:int, xor:int(ldc:int(4611), ldc:int(4610)))), var_7_93:double))) {
                        inc:int(var_11_E7, ldc:int(1))
                    }
                    
                    var_3_653 = and:int(var_3_D6:int, ldc:int(-1125367077))
                    var_14_111 = var_7_93:double
                    var_16_115 = var_11_E7:int
                }
                else {
                    var_11_E7 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(12491), ldc:int(17429)))
                    var_12_10D = var_14_111 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_115 = var_11_E7:int, var_6_84:int)) {
                        var_9_C4 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E7:int)
                        var_16_115 = var_11_E7:int
                        var_14_111 = var_12_10D:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-429952322))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(882864487))
                        goto(Label_0556)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1228775977))
                    }
                    else {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-10060842))
                        
                        if (cmplt:boolean(var_16_115:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0556)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0395:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1026363786))
                        goto(Label_1121)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1879495836))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-169395863))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1217785053))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(2133187295))
                        var_11_E7 = and:int(ldc:int(-5588), ldc:int(5459))
                        goto(Label_1509)
                    }
                    
                    Label_0556:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(64)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1781294666))
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1033631509))
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1048530682))
                        goto(Label_0946)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-838130425))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(302857313))
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1389995331))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_111 = var_9_C4:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0686:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(752464944))
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1536438821))
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(911011060))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1454996639))
                        goto(Label_1121)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1926663732))
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1373357483))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(763539717))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1342344498))
                        var_14_111 = mul:double(ldc:double(0.5), add:double(var_9_C4:double, var_14_111:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-146469138))
                            goto(Label_0686)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1917949738))
                            goto(Label_0556)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(1836936028))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E7 = and:int(ldc:int(3349), ldc:int(12449))
                                goto(Label_1121)
                            }
                        }
                    }
                    
                    Label_0946:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(292468621))
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(654755701))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(2138533125))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(64)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1274840350))
                            goto(Label_0686)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(622449726))
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1942376042))
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1373317354))
                        var_11_E7 = and:int(ldc:int(-29973), ldc:int(28932))
                    }
                    
                    Label_1121:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-2008742199))
                            goto(Label_0946)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(1832938638))
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-43098196))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                                goto(Label_1378)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1113899772))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1060178819))
                            goto(Label_1121)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(64)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1708416735))
                            goto(Label_0946)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(1)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-995231894))
                            goto(Label_0686)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(512)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(1409579157))
                            goto(Label_0556)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-2110891085))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(1035982424))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_111:double, var_5_7D:int, var_16_115:int)
                        goto(Label_1509)
                    }
                    
                    Label_1378:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1520)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-951579637))
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(64)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-197399455))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-197989580))
                        goto(Label_0556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1378190387))
                        goto(Label_0395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_653 = and:int(var_3_653:int, ldc:int(-311634419))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_111:double, ldc:double(0.0))
                    Label_1509:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65E = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1520:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1378)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-671039))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1121)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1404229269))
                        goto(Label_0946)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0686)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(368639403))
                        goto(Label_0556)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1030741676))
                        var_17_65E = add:int(var_16_115:int, and:int(ldc:int(18513), ldc:int(783)))
                        looporswitchbreak()
                    }
                }
                
                var_3_653 = and:int(var_3_653:int, ldc:int(1865409123))
                
                if (cmple:boolean(var_5_7D = var_17_65E:int, sub:int(var_6_84:int, xor:int(ldc:int(16484), ldc:int(16485))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32)), ldc:int(0))) {
            var_3_653 = and:int(var_3_653:int, ldc:int(-238323797))
            goto(Label_0106)
        }
    }
}
