public class \u5d20\u7043\u88c5\u5db4\uf94d.\uae5d\u64ab\u6d69\ud12e\u5db4 {
    public void \uae5d\u64ab\u6d69\ud12e\u5db4() {
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
            invokespecial:Object(Object::<init>, this:\uae5d\u64ab\u6d69\ud12e\u5db4)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u3dd3\u4179\u839e\ubcb0\u4d85 deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) {
        var_4_F7 : int
        var_6_72 : JsonObject
        var_7_9B : \u3dd3\u4179\u839e\ubcb0\u4d85
        var_8_CE : JsonArray
        var_9_E7 : GameProfile[]
        var_10_F0 : int
        var_11_14B : JsonObject
        
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
            var_4_F7 = and:int(ldc:int(1210814593), ldc:int(-6606417))
            var_6_72 = invokestatic:JsonObject(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u51fa\u9af2\u718f\u3bc9\ud217\ub18d, p0:JsonElement, loadelement:String(getstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4), and:int(ldc:int(-2238), ldc:int(2237))))
            var_7_9B = initobject:\u3dd3\u4179\u839e\ubcb0\u4d85(\u3dd3\u4179\u839e\ubcb0\u4d85::<init>, invokestatic:int(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u4e72\u4f4a\u6c52\u446c\u97b7\uae5d, var_6_72:JsonObject, loadelement:String(getstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4), xor:int(ldc:int(17504), ldc:int(17505)))), invokestatic:int(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u4e72\u4f4a\u6c52\u446c\u97b7\uae5d, var_6_72:JsonObject, loadelement:String(getstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4), and:int(ldc:int(9226), ldc:int(822)))))
            
            if (invokestatic:boolean(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u8aa5\u5140\uae5d\ua61f\u9255\uc246, var_6_72:JsonObject, loadelement:String(getstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4), and:int(ldc:int(115), ldc:int(10499))))) {
                var_8_CE = invokestatic:JsonArray(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u4bc8\u446c\u873d\u3dd3\uf94d\u7bad, var_6_72:JsonObject, loadelement:String(getstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4), and:int(ldc:int(16395), ldc:int(12359))))
                
                if (cmpgt:boolean(invokevirtual:int(JsonArray::size, var_8_CE:JsonArray), ldc:int(0))) {
                    var_9_E7 = newarray:GameProfile[](com.mojang.authlib.GameProfile.class, invokevirtual:int(JsonArray::size, var_8_CE:JsonArray))
                    var_10_F0 = and:int(ldc:int(-28815), ldc:int(28812))
                    
                    loop {
                        var_4_F7 = and:int(var_4_F7:int, ldc:int(1789788141))
                        
                        if (cmpge:boolean(var_10_F0:int, arraylength:int(var_9_E7:GameProfile[]))) {
                            looporswitchbreak()
                        }
                        
                        var_11_14B = invokestatic:JsonObject(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u51fa\u9af2\u718f\u3bc9\ud217\ub18d, invokevirtual:JsonElement(JsonArray::get, var_8_CE:JsonArray, var_10_F0:int), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4), xor:int(ldc:int(-32575), ldc:int(-32571)))), var_10_F0:int), loadelement:String(getstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4), and:int(ldc:int(16791), ldc:int(13))))))
                        storeelement:GameProfile(var_9_E7:GameProfile[], var_10_F0:int, initobject:GameProfile(GameProfile::<init>, invokestatic:UUID(UUID::fromString, invokestatic:String(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u72f1\uae5d\u3504\u64f2\u759a\u5654, var_11_14B:JsonObject, loadelement:String(getstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4), and:int(ldc:int(2214), ldc:int(18190))))), invokestatic:String(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u72f1\uae5d\u3504\u64f2\u759a\u5654, var_11_14B:JsonObject, loadelement:String(getstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4), xor:int(ldc:int(772), ldc:int(771))))))
                        inc:int(var_10_F0, ldc:int(1))
                    }
                    
                    var_4_F7 = and:int(var_4_F7:int, ldc:int(2075881705))
                    invokevirtual:void(\u3dd3\u4179\u839e\ubcb0\u4d85::\uafe7\u34df\uf995\ubded\ua6bd\u718f, var_7_9B:\u3dd3\u4179\u839e\ubcb0\u4d85, var_9_E7:GameProfile[])
                }
            }
            
            return:\u3dd3\u4179\u839e\ubcb0\u4d85(var_7_9B:\u3dd3\u4179\u839e\ubcb0\u4d85)
        }
        
        goto(Label_0006)
    }
    
    public com.google.gson.JsonElement serialize(\u71f1\uc910\u3bc9\u516c\u93a2.\u3dd3\u4179\u839e\ubcb0\u4d85 p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
        var_4_D5 : int
        var_6_6A : JsonObject
        var_7_C5 : JsonArray
        var_8_CE : int
        var_9_108 : JsonObject
        var_10_114 : UUID
        
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
            var_4_D5 = and:int(ldc:int(1744105219), ldc:int(-1342785226))
            var_6_6A = initobject:JsonObject(JsonObject::<init>)
            invokevirtual:void(JsonObject::addProperty, var_6_6A:JsonObject, loadelement:String(getstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4), and:int(ldc:int(8449), ldc:int(725))), invokestatic:Integer[expected:Number](Integer::valueOf, invokevirtual:int(\u3dd3\u4179\u839e\ubcb0\u4d85::\u47c2\u92ff\ud171\u4179\uf94d\u7af6, p0:\u3dd3\u4179\u839e\ubcb0\u4d85)))
            invokevirtual:void(JsonObject::addProperty, var_6_6A:JsonObject, loadelement:String(getstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4), and:int(ldc:int(20002), ldc:int(14))), invokestatic:Integer[expected:Number](Integer::valueOf, invokevirtual:int(\u3dd3\u4179\u839e\ubcb0\u4d85::\u7049\uc2bd\u64ab\uc9f6\u40a9\u59ec, p0:\u3dd3\u4179\u839e\ubcb0\u4d85)))
            
            if (cmpne:boolean(invokevirtual:GameProfile[](\u3dd3\u4179\u839e\ubcb0\u4d85::\u12b2\u99f7\uc910\u8389\uc31c\u7006, p0:\u3dd3\u4179\u839e\ubcb0\u4d85), aconstnull:GameProfile[]())) {
                if (cmpgt:boolean(arraylength:int(invokevirtual:GameProfile[](\u3dd3\u4179\u839e\ubcb0\u4d85::\u12b2\u99f7\uc910\u8389\uc31c\u7006, p0:\u3dd3\u4179\u839e\ubcb0\u4d85)), ldc:int(0))) {
                    var_7_C5 = initobject:JsonArray(JsonArray::<init>)
                    var_8_CE = and:int(ldc:int(-22123), ldc:int(22120))
                    
                    loop {
                        var_4_D5 = and:int(var_4_D5:int, ldc:int(-269021402))
                        
                        if (cmpge:boolean(var_8_CE:int, arraylength:int(invokevirtual:GameProfile[](\u3dd3\u4179\u839e\ubcb0\u4d85::\u12b2\u99f7\uc910\u8389\uc31c\u7006, p0:\u3dd3\u4179\u839e\ubcb0\u4d85)))) {
                            looporswitchbreak()
                        }
                        
                        var_9_108 = initobject:JsonObject(JsonObject::<init>)
                        var_10_114 = invokevirtual:UUID(GameProfile::getId, loadelement:GameProfile(invokevirtual:GameProfile[](\u3dd3\u4179\u839e\ubcb0\u4d85::\u12b2\u99f7\uc910\u8389\uc31c\u7006, p0:\u3dd3\u4179\u839e\ubcb0\u4d85), var_8_CE:int))
                        invokevirtual:void(JsonObject::addProperty, var_9_108:JsonObject, loadelement:String(getstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4), and:int(ldc:int(18574), ldc:int(1095))), ternaryop:String(cmpne:boolean(var_10_114:UUID, aconstnull:UUID()), invokevirtual:String(UUID::toString, var_10_114:UUID), loadelement:String(getstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4), and:int(ldc:int(11288), ldc:int(4364)))))
                        invokevirtual:void(JsonObject::addProperty, var_9_108:JsonObject, loadelement:String(getstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4), and:int(ldc:int(13831), ldc:int(18535))), invokevirtual:String(GameProfile::getName, loadelement:GameProfile(invokevirtual:GameProfile[](\u3dd3\u4179\u839e\ubcb0\u4d85::\u12b2\u99f7\uc910\u8389\uc31c\u7006, p0:\u3dd3\u4179\u839e\ubcb0\u4d85), var_8_CE:int)))
                        invokevirtual:void(JsonArray::add, var_7_C5:JsonArray, var_9_108:JsonElement)
                        inc:int(var_8_CE, ldc:int(1))
                    }
                    
                    var_4_D5 = and:int(var_4_D5:int, ldc:int(804829507))
                    invokevirtual:void(JsonObject::add, var_6_6A:JsonObject, loadelement:String(getstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4), and:int(ldc:int(16723), ldc:int(8235))), var_7_C5:JsonElement)
                }
            }
            
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
            return:Object(invokevirtual:\u3dd3\u4179\u839e\ubcb0\u4d85[expected:Object](\uae5d\u64ab\u6d69\ud12e\u5db4::deserialize, this:\uae5d\u64ab\u6d69\ud12e\u5db4, p0:JsonElement, p1:Type, p2:JsonDeserializationContext))
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
            return:JsonElement(invokevirtual:JsonElement(\uae5d\u64ab\u6d69\ud12e\u5db4::serialize, this:\uae5d\u64ab\u6d69\ud12e\u5db4, checkcast:\u3dd3\u4179\u839e\ubcb0\u4d85(\u71f1\uc910\u3bc9\u516c\u93a2.\u3dd3\u4179\u839e\ubcb0\u4d85.class, p0:Object[expected:\u3dd3\u4179\u839e\ubcb0\u4d85]), p1:Type, p2:JsonSerializationContext))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_23F : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_260_0 : byte[] [generated]
        stack_29A_0 : byte[] [generated]
        stack_305_0 : byte[] [generated]
        stack_372_0 : byte[] [generated]
        var_4_22C : int
        var_3_231 : byte[]
        var_5_232 : int
        expr_305 : byte [generated]
        var_0_368 : int
        expr_372 : byte [generated]
        stack_3A2_2 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_289 : byte[]
        var_5_28A : int
        expr_C3 : int [generated]
        expr_EE : int [generated]
        var_3_11A : String
        stack_225_0 : String[] [generated]
        expr_12C : String[] [generated]
        
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
        var_0_23F = and:int(ldc:int(1971097267), ldc:int(2064919998))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_10E_0 = stack_260_0 = stack_29A_0 = stack_305_0 = stack_372_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("PfwdpDwE9E2kdew8ZHXMXGXkJa9V7Axl5CXsTbTsRFX8EfFJCQ==")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_22C = expr_6B:int
        var_3_231 = newarray:byte[](byte.class, expr_6B:int)
        var_5_232 = expr_6B:int
        Label_0564:
        
        while (cmpne:boolean(and:int(var_0_23F:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_23F:int, ldc:int(128)), ldc:int(0))) {
                var_0_23F = and:int(var_0_23F:int, ldc:int(1809535780))
                goto(Label_0737)
            }
            
            var_0_23F = and:int(var_0_23F:int, ldc:int(-46280970))
            var_5_232 = add:int(var_5_232:int, ldc:int(-1))
            storeelement:byte(var_3_231:byte[], var_5_232:int, xor:byte(loadelement:byte(stack_260_0:byte[], var_5_232:int), ldc:byte(9)))
            
            if (cmpne:boolean(var_5_232:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_10E_0 = stack_260_0 = stack_29A_0 = stack_305_0 = stack_372_0 = var_3_231:byte[]
            goto(Label_0112)
        }
        
        var_0_23F = and:int(var_0_23F:int, ldc:int(1816409523))
        goto(Label_0845)
        Label_0737:
        
        while (cmpeq:boolean(and:int(var_0_23F:int, ldc:int(33554432)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(4096)), ldc:int(0))) {
                var_0_23F = and:int(var_0_23F:int, ldc:int(-805346397))
                goto(Label_0564)
            }
            
            var_0_23F = and:int(var_0_23F:int, ldc:int(1433525501))
            var_5_232 = add:int(var_5_232:int, ldc:int(-1))
            expr_305 = loadelement:byte(stack_305_0:byte[], var_5_232:int)
            storeelement:byte(var_3_231:byte[], var_5_232:int, add:int(or:int(and:int(shl:int(expr_305:byte, and:int(ldc:int(24596), ldc:int(7820))), ldc:int(-16)), and:int(shr:int(expr_305:byte[expected:int], xor:int(ldc:int(16519), ldc:int(16515))), ldc:int(15))), ldc:int(90)))
            
            if (cmpne:boolean(var_5_232:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_10E_0 = stack_260_0 = stack_29A_0 = stack_305_0 = stack_372_0 = var_3_231:byte[]
            goto(Label_0200)
        }
        
        Label_0845:
        
        while (cmpeq:boolean(and:int(var_0_23F:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(16384)), ldc:int(0))) {
                var_0_23F = and:int(var_0_23F:int, ldc:int(-585712192))
                goto(Label_0564)
            }
            
            var_0_368 = and:int(var_0_23F:int, ldc:int(1867767792))
            var_5_232 = add:int(var_5_232:int, ldc:int(-1))
            expr_372 = loadelement:byte(stack_372_0:byte[], var_5_232:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_232:int, ldc:int(3)), neg:int(var_4_22C:int)), ldc:int(0))) {
                var_0_368 = and:int(var_0_368:int, ldc:int(-948101899))
                stack_3A2_2 = add:byte(expr_372:byte, ldc:byte(3))
            }
            else {
                stack_3A2_2 = add:byte(expr_372:byte, loadelement:byte(var_3_231:byte[], add:int(var_5_232:int, ldc:int(3))))
            }
            
            var_0_23F = and:int(var_0_368:int, ldc:int(-68154184))
            storeelement:byte(var_3_231:byte[], var_5_232:int, stack_3A2_2:byte)
            
            if (cmpne:boolean(var_5_232:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_10E_0 = stack_260_0 = stack_29A_0 = stack_305_0 = stack_372_0 = var_3_231:byte[]
            goto(Label_0243)
        }
        
        goto(Label_0737)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_23F:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_23F = and:int(var_0_23F:int, ldc:int(-296298826))
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_23F:int, ldc:int(64)), ldc:int(0))) {
            var_0_23F = and:int(var_0_23F:int, ldc:int(2037833137))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_289 = newarray:byte[](byte.class, expr_98:int)
                var_5_28A = expr_98:int
                
                loop {
                    var_0_23F = and:int(var_0_23F:int, ldc:int(-878871374))
                    var_5_28A = add:int(var_5_28A:int, ldc:int(-1))
                    storeelement:byte(var_3_289:byte[], var_5_28A:int, add:int(shl:int(loadelement:byte(stack_29A_0:byte[], var_5_28A:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_28A:int, xor:int(ldc:int(16552), ldc:int(16553)))), ldc:int(7)), xor:int(ldc:int(5633), ldc:int(5632)))))
                    
                    if (cmpne:boolean(var_5_28A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_10E_0 = stack_260_0 = stack_29A_0 = stack_305_0 = stack_372_0 = var_3_289:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpeq:boolean(and:int(var_0_23F:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(33554432)), ldc:int(0))) {
                var_0_23F = and:int(var_0_23F:int, ldc:int(1867161443))
                goto(Label_0112)
            }
            
            var_0_23F = and:int(var_0_23F:int, ldc:int(1934720242))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_22C = expr_C3:int
                var_3_231 = newarray:byte[](byte.class, expr_C3:int)
                var_5_232 = expr_C3:int
                goto(Label_0737)
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(128)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_23F:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0157)
            }
            
            if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(8192)), ldc:int(0))) {
                var_0_23F = and:int(var_0_23F:int, ldc:int(-234788723))
                goto(Label_0112)
            }
            
            var_0_23F = and:int(var_0_23F:int, ldc:int(1643913151))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_4_22C = expr_EE:int
                var_3_231 = newarray:byte[](byte.class, expr_EE:int)
                var_5_232 = expr_EE:int
                goto(Label_0845)
            }
        }
        
        Label_0243:
        
        if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_23F:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0157)
        }
        
        if (cmpne:boolean(and:int(var_0_23F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_11A = initobject:String(String::<init>, stack_10E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_225_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8328), ldc:int(8321)))
            expr_12C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(5190), ldc:int(5199)))
            storeelement:String(expr_12C:String[], and:int(ldc:int(9740), ldc:int(18683)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(-14645), ldc:int(6448)), and:int(ldc:int(20680), ldc:int(-20681))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(4187), ldc:int(4190)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(25233), ldc:int(-28314)), xor:int(ldc:int(8976), ldc:int(8977))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(5142), ldc:int(5136)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(48), ldc:int(49)), and:int(ldc:int(1027), ldc:int(8327))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(768), ldc:int(769)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(16899), ldc:int(3107)), xor:int(ldc:int(88), ldc:int(94))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(9377), ldc:int(9382)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(16643), ldc:int(16645)), xor:int(ldc:int(6), ldc:int(12))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(4352), ldc:int(4354)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(4686), ldc:int(8250)), and:int(ldc:int(3346), ldc:int(48))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(16434), ldc:int(16438)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(4209), ldc:int(3350)), and:int(ldc:int(151), ldc:int(23))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(27616), ldc:int(-27634)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(28951), ldc:int(2591)), xor:int(ldc:int(46), ldc:int(48))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(2595), ldc:int(13395)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(126), ldc:int(16799)), and:int(ldc:int(10404), ldc:int(20581))))
            putstatic:String[](\uae5d\u64ab\u6d69\ud12e\u5db4::\u3711\u7e3f\ub83f\u74b1\u2dcc\u8df4, expr_12C:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u62da\u64ab\u40a9\u93a2\uc2e8\u5d20(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_688 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_693 : int
        
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
        var_3_688 = and:int(ldc:int(-788002228), ldc:int(-284423489))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uae5d\u64ab\u6d69\ud12e\u5db4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(65536)), ldc:int(0))) {
            var_3_688 = and:int(var_3_688:int, ldc:int(-385050833))
            var_5_81 = and:int(ldc:int(7059), ldc:int(-7068))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(25158), ldc:int(-25159)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_688:int, ldc:int(-980610418))
                    var_9_C7 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_88:int, and:int(ldc:int(7179), ldc:int(113)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(22532), ldc:int(22533)))), var_7_97:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_688 = and:int(var_3_D9:int, ldc:int(-605288804))
                    var_14_114 = var_7_97:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-32766), ldc:int(-32765)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_88:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1472161108))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1299932029))
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-2102904296))
                        goto(Label_1148)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1710258204))
                        goto(Label_0990)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(215207301))
                        goto(Label_0867)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1660553008))
                        goto(Label_0748)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(32)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-686087235))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0600)
                            }
                            
                            goto(Label_0867)
                        }
                    }
                    
                    Label_0428:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1860199015))
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(136014663))
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-343507195))
                        goto(Label_1148)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0990)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-740389744))
                        goto(Label_0867)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0748)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1028422806))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-173303073))
                            var_11_EA = and:int(ldc:int(9299), ldc:int(-9812))
                            goto(Label_1543)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0600:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(126113804))
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-785309749))
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1457030217))
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1148)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(2133142382))
                        goto(Label_0990)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0867)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1415067509))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1818096852))
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-334136844))
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-845560956))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0867)
                        }
                    }
                    
                    Label_0748:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-499740019))
                        goto(Label_1554)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(512)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(2105157272))
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1148)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0990)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1580966221))
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-82062723))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0867:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1748746956))
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1227739930))
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-2025626826))
                        goto(Label_1148)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-1636338836))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0748)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-16037300))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EA = and:int(ldc:int(4129), ldc:int(16897))
                                goto(Label_1148)
                            }
                        }
                    }
                    
                    Label_0990:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1072346442))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0867)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0748)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(315463360))
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-609189523))
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1910498875))
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-317757881))
                        var_11_EA = and:int(ldc:int(10138), ldc:int(-26524))
                    }
                    
                    Label_1148:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1050432397))
                            goto(Label_0990)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0867)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(1612254887))
                            goto(Label_0748)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-1178872359))
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-852797467))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1390)
                            }
                        }
                    }
                    
                    Label_1261:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(163298231))
                            goto(Label_1148)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-938618351))
                            goto(Label_0990)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0867)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0748)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(48433731))
                            goto(Label_0600)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_688 = and:int(var_3_688:int, ldc:int(-1920007504))
                            loopcontinue()
                        }
                        
                        var_3_688 = and:int(var_3_688:int, ldc:int(-107101473))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_81:int, var_16_118:int)
                        goto(Label_1543)
                    }
                    
                    Label_1390:
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1830305755))
                        goto(Label_1554)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1148)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1160260996))
                        goto(Label_0990)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(803194529))
                        goto(Label_0867)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-387368741))
                        goto(Label_0748)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1670919733))
                        goto(Label_0428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(823166227))
                        loopcontinue()
                    }
                    
                    var_3_688 = and:int(var_3_688:int, ldc:int(-38941770))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1543:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_693 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1554:
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1390)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1261)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1148)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(2137574804))
                        goto(Label_0990)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0867)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_688:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(861580500))
                        goto(Label_0748)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(1067416810))
                        goto(Label_0600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(2074265360))
                        goto(Label_0428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_688:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_688 = and:int(var_3_688:int, ldc:int(-653284689))
                        var_17_693 = add:int(var_16_118:int, xor:int(ldc:int(1286), ldc:int(1287)))
                        looporswitchbreak()
                    }
                    
                    var_3_688 = and:int(var_3_688:int, ldc:int(909210935))
                }
                
                var_3_688 = and:int(var_3_688:int, ldc:int(-410063891))
                
                if (cmple:boolean(var_5_81 = var_17_693:int, sub:int(var_6_88:int, and:int(ldc:int(257), ldc:int(1097))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_688:int, ldc:int(256)), ldc:int(0))) {
            var_3_688 = and:int(var_3_688:int, ldc:int(669058509))
            goto(Label_0108)
        }
    }
}
