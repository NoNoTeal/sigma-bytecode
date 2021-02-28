public class \u36d3\u9033\u6b0d\u983f\u8d90.\u3c25\uafe7\u3776\u5bc4\u6bb9 {
    public void \u3c25\uafe7\u3776\u5bc4\u6bb9() {
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
            invokespecial:Object(Object::<init>, this:\u3c25\uafe7\u3776\u5bc4\u6bb9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\uc84e\ub32d\u3dd3\u2dcc\u34df deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) {
        var_4_61 : int
        var_6_72 : JsonObject
        var_7_7B : \uc84e\ub32d\u3dd3\u2dcc\u34df
        
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
            var_4_61 = and:int(ldc:int(39074645), ldc:int(-1315065927))
            var_6_72 = invokestatic:JsonObject(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u51fa\u9af2\u718f\u3bc9\ud217\ub18d, p0:JsonElement, loadelement:String(getstatic:String[](\u3c25\uafe7\u3776\u5bc4\u6bb9::\u62da\uff55\ub18d\u494c\u7e3f\u5bc4), and:int(ldc:int(23140), ldc:int(-23141))))
            var_7_7B = initobject:\uc84e\ub32d\u3dd3\u2dcc\u34df(\uc84e\ub32d\u3dd3\u2dcc\u34df::<init>)
            
            if (invokevirtual:boolean(JsonObject::has, var_6_72:JsonObject, loadelement:String(getstatic:String[](\u3c25\uafe7\u3776\u5bc4\u6bb9::\u62da\uff55\ub18d\u494c\u7e3f\u5bc4), xor:int(ldc:int(16405), ldc:int(16404))))) {
                invokevirtual:void(\uc84e\ub32d\u3dd3\u2dcc\u34df::\u3c25\ua61f\u51b2\u6ec6\ubded\ubefe, var_7_7B:\uc84e\ub32d\u3dd3\u2dcc\u34df, checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, invokeinterface:Object[expected:ITextComponent](JsonDeserializationContext::deserialize, p2:JsonDeserializationContext, invokevirtual:JsonElement(JsonObject::get, var_6_72:JsonObject, loadelement:String(getstatic:String[](\u3c25\uafe7\u3776\u5bc4\u6bb9::\u62da\uff55\ub18d\u494c\u7e3f\u5bc4), and:int(ldc:int(903), ldc:int(20577)))), ldc:Class<ITextComponent>[expected:Type](net.minecraft.util.text.ITextComponent.class))))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0238)
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-783950570))
                }
                else {
                    var_4_61 = and:int(var_4_61:int, ldc:int(479329055))
                    
                    if (invokevirtual:boolean(JsonObject::has, var_6_72:JsonObject, loadelement:String(getstatic:String[](\u3c25\uafe7\u3776\u5bc4\u6bb9::\u62da\uff55\ub18d\u494c\u7e3f\u5bc4), and:int(ldc:int(1058), ldc:int(30786))))) {
                        invokevirtual:void(\uc84e\ub32d\u3dd3\u2dcc\u34df::\ub6ab\u6ec6\u624e\u6198\u12b2\u8df4, var_7_7B:\uc84e\ub32d\u3dd3\u2dcc\u34df, checkcast:\u3dd3\u4179\u839e\ubcb0\u4d85(\u71f1\uc910\u3bc9\u516c\u93a2.\u3dd3\u4179\u839e\ubcb0\u4d85.class, invokeinterface:Object[expected:\u3dd3\u4179\u839e\ubcb0\u4d85](JsonDeserializationContext::deserialize, p2:JsonDeserializationContext, invokevirtual:JsonElement(JsonObject::get, var_6_72:JsonObject, loadelement:String(getstatic:String[](\u3c25\uafe7\u3776\u5bc4\u6bb9::\u62da\uff55\ub18d\u494c\u7e3f\u5bc4), xor:int(ldc:int(272), ldc:int(274)))), ldc:Class<\u3dd3\u4179\u839e\ubcb0\u4d85>[expected:Type](\u71f1\uc910\u3bc9\u516c\u93a2.\u3dd3\u4179\u839e\ubcb0\u4d85.class))))
                    }
                }
                
                Label_0196:
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(256)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_4_61:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_61 = and:int(var_4_61:int, ldc:int(-491489507))
                    
                    if (invokevirtual:boolean(JsonObject::has, var_6_72:JsonObject, loadelement:String(getstatic:String[](\u3c25\uafe7\u3776\u5bc4\u6bb9::\u62da\uff55\ub18d\u494c\u7e3f\u5bc4), xor:int(ldc:int(312), ldc:int(315))))) {
                        invokevirtual:void(\uc84e\ub32d\u3dd3\u2dcc\u34df::\ub32d\u120d\u71ae\ubff1\u16f6\uc2e8, var_7_7B:\uc84e\ub32d\u3dd3\u2dcc\u34df, checkcast:\u4daf\ub70c\ubded\ub19c\u0b8e(\u5d20\u97b7\u8753\u873d\u16f6.\u4daf\ub70c\ubded\ub19c\u0b8e.class, invokeinterface:Object[expected:\u4daf\ub70c\ubded\ub19c\u0b8e](JsonDeserializationContext::deserialize, p2:JsonDeserializationContext, invokevirtual:JsonElement(JsonObject::get, var_6_72:JsonObject, loadelement:String(getstatic:String[](\u3c25\uafe7\u3776\u5bc4\u6bb9::\u62da\uff55\ub18d\u494c\u7e3f\u5bc4), xor:int(ldc:int(-28671), ldc:int(-28670)))), ldc:Class<\u4daf\ub70c\ubded\ub19c\u0b8e>[expected:Type](\u5d20\u97b7\u8753\u873d\u16f6.\u4daf\ub70c\ubded\ub19c\u0b8e.class))))
                    }
                }
                
                Label_0238:
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0196)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(8)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_4_61 = and:int(var_4_61:int, ldc:int(1541765281))
            }
            
            if (invokevirtual:boolean(JsonObject::has, var_6_72:JsonObject, loadelement:String(getstatic:String[](\u3c25\uafe7\u3776\u5bc4\u6bb9::\u62da\uff55\ub18d\u494c\u7e3f\u5bc4), and:int(ldc:int(4934), ldc:int(16421))))) {
                invokevirtual:void(\uc84e\ub32d\u3dd3\u2dcc\u34df::\u156b\ud12e\u8709\u7d52\ud51e\u2dcc, var_7_7B:\uc84e\ub32d\u3dd3\u2dcc\u34df, invokestatic:String(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u72f1\uae5d\u3504\u64f2\u759a\u5654, var_6_72:JsonObject, loadelement:String(getstatic:String[](\u3c25\uafe7\u3776\u5bc4\u6bb9::\u62da\uff55\ub18d\u494c\u7e3f\u5bc4), xor:int(ldc:int(333), ldc:int(329)))))
            }
            
            return:\uc84e\ub32d\u3dd3\u2dcc\u34df(var_7_7B:\uc84e\ub32d\u3dd3\u2dcc\u34df)
        }
        
        goto(Label_0006)
    }
    
    public com.google.gson.JsonElement serialize(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc84e\ub32d\u3dd3\u2dcc\u34df p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
        var_4_61 : int
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
            var_4_61 = and:int(ldc:int(-930313011), ldc:int(-309398289))
            var_6_6A = initobject:JsonObject(JsonObject::<init>)
            
            if (cmpne:boolean(invokevirtual:ITextComponent(\uc84e\ub32d\u3dd3\u2dcc\u34df::\u392e\u2dcc\ua61f\u8df4\u836c\u5bc4, p0:\uc84e\ub32d\u3dd3\u2dcc\u34df), aconstnull:ITextComponent())) {
                invokevirtual:void(JsonObject::add, var_6_6A:JsonObject, loadelement:String(getstatic:String[](\u3c25\uafe7\u3776\u5bc4\u6bb9::\u62da\uff55\ub18d\u494c\u7e3f\u5bc4), and:int(ldc:int(9223), ldc:int(81))), invokeinterface:JsonElement(JsonSerializationContext::serialize, p2:JsonSerializationContext, invokevirtual:ITextComponent[expected:Object](\uc84e\ub32d\u3dd3\u2dcc\u34df::\u392e\u2dcc\ua61f\u8df4\u836c\u5bc4, p0:\uc84e\ub32d\u3dd3\u2dcc\u34df)))
            }
            
            loop {
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(512)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(1758106400))
                    goto(Label_0195)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(4096)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(-17834304))
                    
                    if (cmpne:boolean(invokevirtual:\u3dd3\u4179\u839e\ubcb0\u4d85(\uc84e\ub32d\u3dd3\u2dcc\u34df::\u34df\u6c56\ua6bd\u6435\u7af6\u1187, p0:\uc84e\ub32d\u3dd3\u2dcc\u34df), aconstnull:\u3dd3\u4179\u839e\ubcb0\u4d85())) {
                        invokevirtual:void(JsonObject::add, var_6_6A:JsonObject, loadelement:String(getstatic:String[](\u3c25\uafe7\u3776\u5bc4\u6bb9::\u62da\uff55\ub18d\u494c\u7e3f\u5bc4), xor:int(ldc:int(1537), ldc:int(1539))), invokeinterface:JsonElement(JsonSerializationContext::serialize, p2:JsonSerializationContext, invokevirtual:\u3dd3\u4179\u839e\ubcb0\u4d85[expected:Object](\uc84e\ub32d\u3dd3\u2dcc\u34df::\u34df\u6c56\ua6bd\u6435\u7af6\u1187, p0:\uc84e\ub32d\u3dd3\u2dcc\u34df)))
                    }
                }
                
                Label_0155:
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(956111359))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_61:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_61 = and:int(var_4_61:int, ldc:int(1610428375))
                    
                    if (cmpne:boolean(invokevirtual:\u4daf\ub70c\ubded\ub19c\u0b8e(\uc84e\ub32d\u3dd3\u2dcc\u34df::\u67d0\uc9f6\ucb79\u88c5\u600f\u0c95, p0:\uc84e\ub32d\u3dd3\u2dcc\u34df), aconstnull:\u4daf\ub70c\ubded\ub19c\u0b8e())) {
                        invokevirtual:void(JsonObject::add, var_6_6A:JsonObject, loadelement:String(getstatic:String[](\u3c25\uafe7\u3776\u5bc4\u6bb9::\u62da\uff55\ub18d\u494c\u7e3f\u5bc4), xor:int(ldc:int(-26624), ldc:int(-26621))), invokeinterface:JsonElement(JsonSerializationContext::serialize, p2:JsonSerializationContext, invokevirtual:\u4daf\ub70c\ubded\ub19c\u0b8e[expected:Object](\uc84e\ub32d\u3dd3\u2dcc\u34df::\u67d0\uc9f6\ucb79\u88c5\u600f\u0c95, p0:\uc84e\ub32d\u3dd3\u2dcc\u34df)))
                    }
                }
                
                Label_0195:
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0155)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(16384)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_4_61 = and:int(var_4_61:int, ldc:int(-1947760480))
            }
            
            if (cmpne:boolean(invokevirtual:String(\uc84e\ub32d\u3dd3\u2dcc\u34df::\u3504\uc87f\u527a\u4c2b\u40a9\u4c04, p0:\uc84e\ub32d\u3dd3\u2dcc\u34df), aconstnull:String())) {
                invokevirtual:void(JsonObject::addProperty, var_6_6A:JsonObject, loadelement:String(getstatic:String[](\u3c25\uafe7\u3776\u5bc4\u6bb9::\u62da\uff55\ub18d\u494c\u7e3f\u5bc4), xor:int(ldc:int(186), ldc:int(190))), invokevirtual:String(\uc84e\ub32d\u3dd3\u2dcc\u34df::\u3504\uc87f\u527a\u4c2b\u40a9\u4c04, p0:\uc84e\ub32d\u3dd3\u2dcc\u34df))
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
            return:Object(invokevirtual:\uc84e\ub32d\u3dd3\u2dcc\u34df[expected:Object](\u3c25\uafe7\u3776\u5bc4\u6bb9::deserialize, this:\u3c25\uafe7\u3776\u5bc4\u6bb9, p0:JsonElement, p1:Type, p2:JsonDeserializationContext))
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
            return:JsonElement(invokevirtual:JsonElement(\u3c25\uafe7\u3776\u5bc4\u6bb9::serialize, this:\u3c25\uafe7\u3776\u5bc4\u6bb9, checkcast:\uc84e\ub32d\u3dd3\u2dcc\u34df(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc84e\ub32d\u3dd3\u2dcc\u34df.class, p0:Object[expected:\uc84e\ub32d\u3dd3\u2dcc\u34df]), p1:Type, p2:JsonSerializationContext))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1EB : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_126_0 : byte[] [generated]
        stack_1FD_0 : byte[] [generated]
        stack_24D_0 : byte[] [generated]
        stack_2A9_0 : byte[] [generated]
        stack_321_0 : byte[] [generated]
        var_4_1D8 : int
        var_3_1DD : byte[]
        var_5_1DE : int
        expr_1FD : byte [generated]
        var_0_29F : int
        expr_2A9 : byte [generated]
        stack_2ED_2 : byte [generated]
        stack_2CC_0 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_23C : byte[]
        var_5_23D : int
        expr_CB : int [generated]
        expr_FE : int [generated]
        var_3_310 : byte[]
        var_5_311 : int
        var_3_132 : String
        stack_1D1_0 : String[] [generated]
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
        var_0_1EB = and:int(ldc:int(-795277), ldc:int(-68239949))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1FD_0 = stack_24D_0 = stack_2A9_0 = stack_321_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("AMBDwbLO8LzK8r/MwfKPQYCzfo9As38PgYEwjzG+vr7N8XCwMrFB")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1D8 = expr_6B:int
        var_3_1DD = newarray:byte[](byte.class, expr_6B:int)
        var_5_1DE = expr_6B:int
        Label_0480:
        
        while (cmpeq:boolean(and:int(var_0_1EB:int, ldc:int(128)), ldc:int(0))) {
            var_0_1EB = and:int(var_0_1EB:int, ldc:int(2146630879))
            var_5_1DE = add:int(var_5_1DE:int, ldc:int(-1))
            expr_1FD = loadelement:byte(stack_1FD_0:byte[], var_5_1DE:int)
            storeelement:byte(var_3_1DD:byte[], var_5_1DE:int, or:int(and:int(shl:int(expr_1FD:byte, and:int(ldc:int(8420), ldc:int(18700))), ldc:int(-16)), and:int(shr:int(expr_1FD:byte[expected:int], xor:int(ldc:int(4355), ldc:int(4359))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1DE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1FD_0 = stack_24D_0 = stack_2A9_0 = stack_321_0 = var_3_1DD:byte[]
            goto(Label_0112)
        }
        
        var_0_1EB = and:int(var_0_1EB:int, ldc:int(1843121126))
        Label_0660:
        
        while (cmpeq:boolean(and:int(var_0_1EB:int, ldc:int(262144)), ldc:int(0))) {
            var_0_29F = and:int(var_0_1EB:int, ldc:int(2146612879))
            var_5_1DE = add:int(var_5_1DE:int, ldc:int(-1))
            expr_2A9 = stack_2ED_2 = loadelement(stack_2A9_0, var_5_1DE)
            
            if (cmplt:boolean(add:int(add:int(var_5_1DE:int, ldc:int(5)), neg:int(var_4_1D8:int)), ldc:int(0))) {
                stack_2ED_2 = stack_2CC_0 = add:byte(expr_2A9:byte, loadelement:byte(var_3_1DD:byte[], add:int(var_5_1DE:int, ldc:int(5))))
                goto(Label_0732)
            }
            
            Label_0694:
            
            if (cmpeq:boolean(and:int(var_0_29F:int, ldc:int(131072)), ldc:int(0))) {
                var_0_29F = and:int(var_0_29F:int, ldc:int(952983609))
            }
            else {
                var_0_29F = and:int(var_0_29F:int, ldc:int(2146613115))
                stack_2ED_2 = stack_2CC_0 = add:byte(expr_2A9:byte, ldc:byte(5))
            }
            
            Label_0732:
            
            if (cmpeq:boolean(and:int(var_0_29F:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0694)
            }
            
            var_0_1EB = and:int(var_0_29F:int, ldc:int(-134301845))
            storeelement:byte(var_3_1DD:byte[], var_5_1DE:int, stack_2ED_2:byte)
            
            if (cmpne:boolean(var_5_1DE:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1FD_0 = stack_24D_0 = stack_2A9_0 = stack_321_0 = var_3_1DD:byte[]
            goto(Label_0208)
        }
        
        goto(Label_0480)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1EB:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_1EB = and:int(var_0_1EB:int, ldc:int(1843731472))
            goto(Label_0259)
        }
        
        if (cmpeq:boolean(and:int(var_0_1EB:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_1EB:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_1EB = and:int(var_0_1EB:int, ldc:int(437172372))
        }
        else {
            var_0_1EB = and:int(var_0_1EB:int, ldc:int(-135612841))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_23C = newarray:byte[](byte.class, expr_A0:int)
                var_5_23D = expr_A0:int
                
                loop {
                    var_0_1EB = and:int(var_0_1EB:int, ldc:int(2146410287))
                    var_5_23D = add:int(var_5_23D:int, ldc:int(-1))
                    storeelement:byte(var_3_23C:byte[], var_5_23D:int, add:int(shl:int(loadelement:byte(stack_24D_0:byte[], var_5_23D:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_23D:int, xor:int(ldc:int(594), ldc:int(595)))), ldc:int(2)), xor:int(ldc:int(-24541), ldc:int(-24548)))))
                    
                    if (cmpne:boolean(var_5_23D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1FD_0 = stack_24D_0 = stack_2A9_0 = stack_321_0 = var_3_23C:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpeq:boolean(and:int(var_0_1EB:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_1EB = and:int(var_0_1EB:int, ldc:int(-938850969))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_1EB:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1EB:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1EB = and:int(var_0_1EB:int, ldc:int(2145637643))
            expr_CB = arraylength:int(stack_CB_0:byte[])
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_4_1D8 = expr_CB:int
                var_3_1DD = newarray:byte[](byte.class, expr_CB:int)
                var_5_1DE = expr_CB:int
                goto(Label_0660)
            }
        }
        
        Label_0208:
        
        if (cmpeq:boolean(and:int(var_0_1EB:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_1EB = and:int(var_0_1EB:int, ldc:int(588931304))
        }
        else {
            if (cmpne:boolean(and:int(var_0_1EB:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_1EB:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_1EB = and:int(var_0_1EB:int, ldc:int(-635468606))
                goto(Label_0112)
            }
            
            var_0_1EB = and:int(var_0_1EB:int, ldc:int(2079315147))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_310 = newarray:byte[](byte.class, expr_FE:int)
                var_5_311 = expr_FE:int
                
                loop {
                    var_0_1EB = and:int(var_0_1EB:int, ldc:int(2146385603))
                    var_5_311 = add:int(var_5_311:int, ldc:int(-1))
                    storeelement:byte(var_3_310:byte[], var_5_311:int, xor:byte(add:byte(loadelement:byte(stack_321_0:byte[], var_5_311:int), ldc:byte(72)), ldc:byte(124)))
                    
                    if (cmpne:boolean(var_5_311:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_126_0 = stack_1FD_0 = stack_24D_0 = stack_2A9_0 = stack_321_0 = var_3_310:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpeq:boolean(and:int(var_0_1EB:int, ldc:int(4096)), ldc:int(0))) {
            var_0_1EB = and:int(var_0_1EB:int, ldc:int(672964165))
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_1EB:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0165)
        }
        
        if (cmpne:boolean(and:int(var_0_1EB:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_132 = initobject:String(String::<init>, stack_126_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1D1_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(8213), ldc:int(2053)))
            expr_144 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(13), ldc:int(8)))
            storeelement:String(expr_144:String[], xor:int(ldc:int(3106), ldc:int(3107)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(-28939), ldc:int(28930)), and:int(ldc:int(1035), ldc:int(25131))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(145), ldc:int(149)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(523), ldc:int(14479)), xor:int(ldc:int(-24576), ldc:int(-24558))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(24864), ldc:int(24866)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(655), ldc:int(669)), xor:int(ldc:int(2087), ldc:int(2110))))
            storeelement:String(expr_144:String[], and:int(ldc:int(7728), ldc:int(-24113)), invokevirtual:String[expected:String](String::substring, var_3_132:String, and:int(ldc:int(20633), ldc:int(89)), and:int(ldc:int(1567), ldc:int(8575))))
            storeelement:String(expr_144:String[], xor:int(ldc:int(8201), ldc:int(8202)), invokevirtual:String[expected:String](String::substring, var_3_132:String, xor:int(ldc:int(10), ldc:int(21)), and:int(ldc:int(17126), ldc:int(1062))))
            putstatic:String[](\u3c25\uafe7\u3776\u5bc4\u6bb9::\u62da\uff55\ub18d\u494c\u7e3f\u5bc4, expr_144:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u4179\u88c5\u97b7\u2dcc\u4492\u3d64(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_663 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C3 : double
        var_3_D5 : int
        var_11_E6 : int
        var_14_110 : double
        var_16_114 : int
        var_12_10C : double
        var_17_66E : int
        
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
        var_3_663 = and:int(ldc:int(1049963606), ldc:int(-190845186))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3c25\uafe7\u3776\u5bc4\u6bb9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
            var_3_663 = and:int(var_3_663:int, ldc:int(1895694018))
            var_5_7D = and:int(ldc:int(-2745), ldc:int(2728))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16455), ldc:int(16454)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C3 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D5 = and:int(var_3_663:int, ldc:int(-1209696710))
                    var_9_C3 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E6 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E6:int, sub:int(var_6_84:int, xor:int(ldc:int(20), ldc:int(21)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E6:int, xor:int(ldc:int(1049), ldc:int(1048)))), var_7_93:double))) {
                        inc:int(var_11_E6, ldc:int(1))
                    }
                    
                    var_3_663 = and:int(var_3_D5:int, ldc:int(1002958179))
                    var_14_110 = var_7_93:double
                    var_16_114 = var_11_E6:int
                }
                else {
                    var_11_E6 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(3329), ldc:int(8305)))
                    var_12_10C = var_14_110 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_114 = var_11_E6:int, var_6_84:int)) {
                        var_9_C3 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E6:int)
                        var_16_114 = var_11_E6:int
                        var_14_110 = var_12_10C:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1587474302))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1687348377))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-335145537))
                        goto(Label_0589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-777379806))
                    }
                    else {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1294651509))
                        
                        if (cmplt:boolean(var_16_114:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0589)
                            }
                            
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0400:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-226882409))
                        goto(Label_1491)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-271545378))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(675281566))
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-406882574))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1685268399))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-4075991))
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1911800500))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(832810502))
                            var_11_E6 = and:int(ldc:int(-23948), ldc:int(21897))
                            goto(Label_1480)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0589:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1149289491))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1939756217))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1093583289))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_110 = var_9_C3:double
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0690:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-2068615887))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1211671839))
                        goto(Label_1209)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1889080231))
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-422888578))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-261772877))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(1018539359))
                        var_14_110 = mul:double(ldc:double(0.5), add:double(var_9_C3:double, var_14_110:double))
                    }
                    
                    Label_0826:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(2139872507))
                        goto(Label_1491)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1100763243))
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1179633674))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1613618154))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1006082196))
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1228689657))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E6 = xor:int(ldc:int(-32764), ldc:int(-32763))
                                goto(Label_1081)
                            }
                        }
                    }
                    
                    Label_0953:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1319365343))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1199309081))
                        var_11_E6 = and:int(ldc:int(-14901), ldc:int(14388))
                    }
                    
                    Label_1081:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1040243148))
                        goto(Label_1491)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-140305323))
                        goto(Label_1356)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-871939369))
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(848427790))
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-59920922))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1265648029))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                                goto(Label_1356)
                            }
                        }
                    }
                    
                    Label_1209:
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(254101629))
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1660221186))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_1081)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0953)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(559906985))
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(-1854103595))
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(1116314574))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_663:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_663 = and:int(var_3_663:int, ldc:int(2136102067))
                            loopcontinue()
                        }
                        
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1311560481))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_110:double, var_5_7D:int, var_16_114:int)
                        goto(Label_1480)
                    }
                    
                    Label_1356:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1491)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1252970007))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1081)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-791915487))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(1135690449))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_663 = and:int(var_3_663:int, ldc:int(-2392130))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_110:double, ldc:double(0.0))
                    Label_1480:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66E = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E6:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1491:
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1356)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(713706957))
                        goto(Label_1209)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-164579673))
                        goto(Label_1081)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1959694633))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(512)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-982386610))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-840764240))
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(271353191))
                        goto(Label_0589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-1456465050))
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_663:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_663 = and:int(var_3_663:int, ldc:int(-35164906))
                        var_17_66E = add:int(var_16_114:int, and:int(ldc:int(16745), ldc:int(1159)))
                        looporswitchbreak()
                    }
                    
                    var_3_663 = and:int(var_3_663:int, ldc:int(-600751383))
                }
                
                var_3_663 = and:int(var_3_663:int, ldc:int(1924890282))
                
                if (cmple:boolean(var_5_7D = var_17_66E:int, sub:int(var_6_84:int, and:int(ldc:int(19461), ldc:int(675))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpeq:boolean(and:int(var_3_663:int, ldc:int(8192)), ldc:int(0))) {
            var_3_663 = and:int(var_3_663:int, ldc:int(1920437148))
            goto(Label_0106)
        }
    }
}
