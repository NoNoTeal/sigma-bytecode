public class \u927d\u92ff\u71ae\uafe7\u6bb9.\ud158\uff55\u4d85\u7c6b\u8aa5\uc84e {
    public void \ud158\uff55\u4d85\u7c6b\u8aa5\uc84e() {
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
            invokespecial:Object(Object::<init>, this:\ud158\uff55\u4d85\u7c6b\u8aa5\uc84e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.google.gson.JsonElement serialize(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u6435\u0800\uae87\uc2e8\uc31c\u4e72 p0, java.lang.reflect.Type p1, com.google.gson.JsonSerializationContext p2) {
        var_4_9A : int
        var_6_6A : JsonObject
        var_7_73 : JsonObject
        var_8_83 : Iterator<Entry<String, V>>
        var_9_127 : Entry<String, V>
        var_10_133 : \u6c56\u4179\u760c\u71ae\ua6bd\u2dcc
        
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
            var_4_9A = and:int(ldc:int(1341537939), ldc:int(1709176021))
            var_6_6A = initobject:JsonObject(JsonObject::<init>)
            var_7_73 = initobject:JsonObject(JsonObject::<init>)
            var_8_83 = invokeinterface:Iterator<Entry<String, V>>(Set<Entry<String, V>>::iterator, invokeinterface:Set<Entry<String, V>>(Map<String, V>::entrySet, invokestatic:Map(\u6435\u0800\uae87\uc2e8\uc31c\u4e72::\u7ce1\uc7fe\uc4d2\u3bd6\u71f1\ucef1, p0:\u6435\u0800\uae87\uc2e8\uc31c\u4e72)))
            
            loop {
                if (cmpeq:boolean(and:int(var_4_9A:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0232)
                }
                
                if (cmpeq:boolean(and:int(var_4_9A:int, ldc:int(4096)), ldc:int(0))) {
                    var_4_9A = and:int(var_4_9A:int, ldc:int(292682458))
                }
                else {
                    var_4_9A = and:int(var_4_9A:int, ldc:int(-536874063))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_8_83:Iterator<Entry<String, V>>)) {
                        var_9_127 = checkcast:Entry<String, V>(java.util.Map.Entry<java.lang.String, V>.class, invokeinterface:Entry<String, V>(Iterator<Entry<String, V>>::next, var_8_83:Iterator<Entry<String, V>>))
                        var_10_133 = checkcast:\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc(\u6b0d\u12cb\u156b\u4179\u8bb0.\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc.class, invokeinterface:V[expected:\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc](Entry<K, V>::getValue, var_9_127:Entry<String, V>))
                        
                        if (invokevirtual:boolean(\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc::\u5140\u965f\u5d20\ub32d\ud523\u7006, var_10_133:\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc)) {
                            invokevirtual:void(JsonObject::add, var_7_73:JsonObject, checkcast:String(java.lang.String.class, invokeinterface:String(Entry<String, V>::getKey, var_9_127:Entry<String, V>)), invokevirtual:JsonElement(\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc::\u67e9\u3d64\ua562\u4cd9\u61a4\u8c8a, var_10_133:\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc))
                        }
                        
                        var_4_9A = and:int(var_4_9A:int, ldc:int(1876229624))
                        loopcontinue()
                    }
                }
                
                Label_0176:
                
                if (cmpeq:boolean(and:int(var_4_9A:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_4_9A = and:int(var_4_9A:int, ldc:int(-168304017))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_9A:int, ldc:int(128)), ldc:int(0))) {
                        var_4_9A = and:int(var_4_9A:int, ldc:int(-1633265577))
                        loopcontinue()
                    }
                    
                    var_4_9A = and:int(var_4_9A:int, ldc:int(1475410316))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Set::isEmpty, invokevirtual:Set(JsonObject::entrySet, var_7_73:JsonObject)))) {
                        invokevirtual:void(JsonObject::add, var_6_6A:JsonObject, loadelement:String(getstatic:String[](\ud158\uff55\u4d85\u7c6b\u8aa5\uc84e::\u8258\ub102\ucef1\ub1b9\u5fe1\u12cb), and:int(ldc:int(-28877), ldc:int(28876))), var_7_73:JsonElement)
                    }
                }
                
                Label_0232:
                
                if (cmpne:boolean(and:int(var_4_9A:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0176)
                }
                
                if (cmpne:boolean(and:int(var_4_9A:int, ldc:int(128)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokevirtual:void(JsonObject::addProperty, var_6_6A:JsonObject, loadelement:String(getstatic:String[](\ud158\uff55\u4d85\u7c6b\u8aa5\uc84e::\u8258\ub102\ucef1\ub1b9\u5fe1\u12cb), xor:int(ldc:int(2117), ldc:int(2116))), invokestatic:Boolean(Boolean::valueOf, invokevirtual:boolean(\u6435\u0800\uae87\uc2e8\uc31c\u4e72::\uc84e\u3bc9\u760c\u5245\ua068\ud7e8, p0:\u6435\u0800\uae87\uc2e8\uc31c\u4e72)))
            return:JsonElement(var_6_6A:JsonObject)
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u6435\u0800\uae87\uc2e8\uc31c\u4e72 deserialize(com.google.gson.JsonElement p0, java.lang.reflect.Type p1, com.google.gson.JsonDeserializationContext p2) {
        var_4_61 : int
        var_7_8B : JsonObject
        var_8_94 : \u6435\u0800\uae87\uc2e8\uc31c\u4e72
        var_9_A0 : Iterator
        var_10_CB : Entry<String, V>
        var_11_D7 : String
        
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
            var_4_61 = and:int(ldc:int(1432159677), ldc:int(-143800417))
            var_7_8B = invokestatic:JsonObject(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u51fa\u9af2\u718f\u3bc9\ud217\ub18d, invokestatic:JsonObject(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u51fa\u9af2\u718f\u3bc9\ud217\ub18d, p0:JsonElement, loadelement:String(getstatic:String[](\ud158\uff55\u4d85\u7c6b\u8aa5\uc84e::\u8258\ub102\ucef1\ub1b9\u5fe1\u12cb), xor:int(ldc:int(34), ldc:int(32)))), loadelement:String(getstatic:String[](\ud158\uff55\u4d85\u7c6b\u8aa5\uc84e::\u8258\ub102\ucef1\ub1b9\u5fe1\u12cb), and:int(ldc:int(-15785), ldc:int(14504))), initobject:JsonObject(JsonObject::<init>))
            var_8_94 = initobject:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(\u6435\u0800\uae87\uc2e8\uc31c\u4e72::<init>)
            var_9_A0 = invokeinterface:Iterator(Set::iterator, invokevirtual:Set(JsonObject::entrySet, var_7_8B:JsonObject))
            
            loop {
                var_4_61 = and:int(var_4_61:int, ldc:int(-982563653))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_9_A0:Iterator))) {
                    looporswitchbreak()
                }
                
                var_10_CB = checkcast:Entry<String, V>(java.util.Map.Entry<java.lang.String, V>.class, invokeinterface:Entry<String, V>(Iterator<Entry<String, V>>::next, var_9_A0:Iterator<Entry<String, V>>))
                var_11_D7 = checkcast:String(java.lang.String.class, invokeinterface:String(Entry<String, V>::getKey, var_10_CB:Entry<String, V>))
                invokeinterface:\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc(Map<String, \u6c56\u4179\u760c\u71ae\ua6bd\u2dcc>::put, invokestatic:Map(\u6435\u0800\uae87\uc2e8\uc31c\u4e72::\u7ce1\uc7fe\uc4d2\u3bd6\u71f1\ucef1, var_8_94:\u6435\u0800\uae87\uc2e8\uc31c\u4e72), var_11_D7:String, invokestatic:\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc(\u6c56\u4179\u760c\u71ae\ua6bd\u2dcc::\u416d\u416d\u8640\u8308\u4975\u6ec6, invokestatic:String(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u72f1\uae5d\u3504\u64f2\u759a\u5654, checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:V[expected:JsonElement](Entry<K, V>::getValue, var_10_CB:Entry<String, V>)), var_11_D7:String)))
            }
            
            return:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(var_8_94:\u6435\u0800\uae87\uc2e8\uc31c\u4e72)
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
            return:Object(invokevirtual:\u6435\u0800\uae87\uc2e8\uc31c\u4e72[expected:Object](\ud158\uff55\u4d85\u7c6b\u8aa5\uc84e::deserialize, this:\ud158\uff55\u4d85\u7c6b\u8aa5\uc84e, p0:JsonElement, p1:Type, p2:JsonDeserializationContext))
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
            return:JsonElement(invokevirtual:JsonElement(\ud158\uff55\u4d85\u7c6b\u8aa5\uc84e::serialize, this:\ud158\uff55\u4d85\u7c6b\u8aa5\uc84e, checkcast:\u6435\u0800\uae87\uc2e8\uc31c\u4e72(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u6435\u0800\uae87\uc2e8\uc31c\u4e72.class, p0:Object[expected:\u6435\u0800\uae87\uc2e8\uc31c\u4e72]), p1:Type, p2:JsonSerializationContext))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1B7 : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_8F_0 : byte[] [generated]
        stack_91_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_D6_0 : byte[] [generated]
        stack_1C9_0 : byte[] [generated]
        stack_229_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_154 : byte[]
        var_4_155 : int
        expr_91 : int [generated]
        var_5_1A4 : int
        var_3_1A9 : byte[]
        var_4_1AA : int
        expr_1CC : byte [generated]
        var_0_21F : int
        expr_229 : byte [generated]
        stack_257_2 : byte [generated]
        expr_B5 : int [generated]
        var_3_E2 : String
        stack_14B_0 : String[] [generated]
        expr_F4 : String[] [generated]
        
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
            var_0_1B7 = and:int(ldc:int(-1395790318), ldc:int(1047506646))
            expr_65 = var_2_69 = stack_8F_0 = stack_91_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1C9_0 = stack_229_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("DrO5p7C6t7apgaiwuaWlo72nDxwRAgsQ"))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_154 = newarray:byte[](byte.class, expr_6D:int)
                var_4_155 = expr_6D:int
                
                loop {
                    var_0_1B7 = and:int(var_0_1B7:int, ldc:int(1034811099))
                    var_4_155 = add:int(var_4_155:int, ldc:int(-1))
                    storeelement:byte(var_3_154:byte[], var_4_155:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_155:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_155:int, and:int(ldc:int(17793), ldc:int(2161)))), ldc:int(4)), and:int(ldc:int(5391), ldc:int(111)))))
                    
                    if (cmpne:boolean(var_4_155:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1C9_0 = stack_229_0 = var_3_154:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_1B7:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0186)
                }
                
                if (cmpeq:boolean(and:int(var_0_1B7:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_1B7 = and:int(var_0_1B7:int, ldc:int(-203512929))
                    goto(Label_0150)
                }
                
                var_0_1B7 = and:int(var_0_1B7:int, ldc:int(-330453070))
                expr_91 = arraylength:int(stack_91_0:byte[])
                
                if (cmpeq:boolean(expr_91:int, ldc:int(0))) {
                    goto(Label_0150)
                }
                
                var_5_1A4 = expr_91:int
                var_3_1A9 = newarray:byte[](byte.class, expr_91:int)
                var_4_1AA = expr_91:int
                Label_0428:
                
                while (cmpne:boolean(and:int(var_0_1B7:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_1B7 = and:int(var_0_1B7:int, ldc:int(-58737098))
                    var_4_1AA = add:int(var_4_1AA:int, ldc:int(-1))
                    expr_1CC = xor:byte(loadelement:byte(stack_1C9_0:byte[], var_4_1AA:int), ldc:byte(113))
                    storeelement:byte(var_3_1A9:byte[], var_4_1AA:int, add:int(or:int(and:int(shl:int(expr_1CC:byte, and:int(ldc:int(1069), ldc:int(19204))), ldc:int(-16)), and:int(shr:int(expr_1CC:byte[expected:int], xor:int(ldc:int(-27582), ldc:int(-27578))), ldc:int(15))), ldc:int(83)))
                    
                    if (cmpne:boolean(var_4_1AA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1C9_0 = stack_229_0 = var_3_1A9:byte[]
                    goto(Label_0150)
                }
                
                var_0_1B7 = and:int(var_0_1B7:int, ldc:int(718121900))
                Label_0532:
                
                while (cmpne:boolean(and:int(var_0_1B7:int, ldc:int(16)), ldc:int(0))) {
                    var_0_21F = and:int(var_0_1B7:int, ldc:int(1007468254))
                    var_4_1AA = add:int(var_4_1AA:int, ldc:int(-1))
                    expr_229 = loadelement:byte(stack_229_0:byte[], var_4_1AA:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_1AA:int, ldc:int(6)), neg:int(var_5_1A4:int)), ldc:int(0))) {
                        var_0_21F = and:int(var_0_21F:int, ldc:int(745531070))
                        stack_257_2 = add:byte(expr_229:byte, ldc:byte(6))
                    }
                    else {
                        stack_257_2 = add:byte(expr_229:byte, loadelement:byte(var_3_1A9:byte[], add:int(var_4_1AA:int, ldc:int(6))))
                    }
                    
                    var_0_1B7 = and:int(var_0_21F:int, ldc:int(2103347187))
                    storeelement:byte(var_3_1A9:byte[], var_4_1AA:int, stack_257_2:byte)
                    
                    if (cmpne:boolean(var_4_1AA:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_91_0 = stack_8F_0 = stack_B3_0 = stack_B5_0 = stack_D6_0 = stack_1C9_0 = stack_229_0 = var_3_1A9:byte[]
                    goto(Label_0186)
                }
                
                goto(Label_0428)
                Label_0150:
                
                if (cmpne:boolean(and:int(var_0_1B7:int, ldc:int(512)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_0_1B7:int, ldc:int(32)), ldc:int(0))) {
                        var_0_1B7 = and:int(var_0_1B7:int, ldc:int(528822911))
                        loopcontinue()
                    }
                    
                    var_0_1B7 = and:int(var_0_1B7:int, ldc:int(2092891954))
                    expr_B5 = arraylength:int(stack_B5_0:byte[])
                    
                    if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                        var_5_1A4 = expr_B5:int
                        var_3_1A9 = newarray:byte[](byte.class, expr_B5:int)
                        var_4_1AA = expr_B5:int
                        goto(Label_0532)
                    }
                }
                
                Label_0186:
                
                if (cmpeq:boolean(and:int(var_0_1B7:int, ldc:int(262144)), ldc:int(0))) {
                    var_0_1B7 = and:int(var_0_1B7:int, ldc:int(-1470746035))
                    goto(Label_0150)
                }
                
                if (cmpne:boolean(and:int(var_0_1B7:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_E2 = initobject:String(String::<init>, stack_D6_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_14B_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1091), ldc:int(18851)))
            expr_F4 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(67), ldc:int(15)))
            storeelement:String(expr_F4:String[], and:int(ldc:int(906), ldc:int(14338)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(-54), ldc:int(53)), xor:int(ldc:int(137), ldc:int(130))))
            storeelement:String(expr_F4:String[], and:int(ldc:int(9553), ldc:int(-12126)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(17935), ldc:int(6315)), and:int(ldc:int(8755), ldc:int(5143))))
            storeelement:String(expr_F4:String[], xor:int(ldc:int(1088), ldc:int(1089)), invokevirtual:String[expected:String](String::substring, var_3_E2:String, and:int(ldc:int(17239), ldc:int(4123)), and:int(ldc:int(2591), ldc:int(16599))))
            putstatic:String[](\ud158\uff55\u4d85\u7c6b\u8aa5\uc84e::\u8258\ub102\ucef1\ub1b9\u5fe1\u12cb, expr_F4:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubff1\ubf56\u8308\u946b\ud158\u71ae(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_686 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_CC : double
        var_3_DE : int
        var_11_EF : int
        var_14_119 : double
        var_16_11D : int
        var_12_115 : double
        var_17_691 : int
        
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
        var_3_686 = and:int(ldc:int(-510008731), ldc:int(-1866909955))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud158\uff55\u4d85\u7c6b\u8aa5\uc84e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(4)), ldc:int(0))) {
            var_3_686 = and:int(var_3_686:int, ldc:int(261951398))
        }
        else {
            var_3_686 = and:int(var_3_686:int, ldc:int(-607389777))
            var_5_85 = and:int(ldc:int(20699), ldc:int(-20700))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3291), ldc:int(3288)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CC = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DE = and:int(var_3_686:int, ldc:int(-724782219))
                    var_9_CC = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EF = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EF:int, sub:int(var_6_8C:int, xor:int(ldc:int(4166), ldc:int(4167)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EF:int, xor:int(ldc:int(17056), ldc:int(17057)))), var_7_9B:double))) {
                        inc:int(var_11_EF, ldc:int(1))
                    }
                    
                    var_3_686 = and:int(var_3_DE:int, ldc:int(-1012092371))
                    var_14_119 = var_7_9B:double
                    var_16_11D = var_11_EF:int
                }
                else {
                    var_11_EF = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(1093), ldc:int(1092)))
                    var_12_115 = var_14_119 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_11D = var_11_EF:int, var_6_8C:int)) {
                        var_9_CC = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EF:int)
                        var_16_11D = var_11_EF:int
                        var_14_119 = var_12_115:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(256)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(699923297))
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(957326854))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0860)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(888210896))
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(256)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(371145332))
                    }
                    else {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-721570835))
                        
                        if (cmplt:boolean(var_16_11D:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0576)
                            }
                            
                            goto(Label_0860)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1943753192))
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(2095956693))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1272918859))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0860)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1535170249))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(256)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-88526931))
                            var_11_EF = and:int(ldc:int(17692), ldc:int(-25885))
                            goto(Label_1542)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0576:
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1549881022))
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(4)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1707606802))
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(512)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-492064490))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-612784029))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0860)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-1969335195))
                            loopcontinue()
                        }
                        
                        var_3_686 = and:int(var_3_686:int, ldc:int(-404146499))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_119 = var_9_CC:double
                            goto(Label_0860)
                        }
                    }
                    
                    Label_0704:
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(563648291))
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(4)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1472718766))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1271306657))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-2028943388))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(512)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-1426414403))
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(1613631670))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-557179140))
                            loopcontinue()
                        }
                        
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1832010761))
                        var_14_119 = mul:double(ldc:double(0.5), add:double(var_9_CC:double, var_14_119:double))
                    }
                    
                    Label_0860:
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-237166516))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0704)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1161944265))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EF = and:int(ldc:int(25345), ldc:int(1025))
                                goto(Label_1146)
                            }
                        }
                    }
                    
                    Label_0953:
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(512)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1411926854))
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1462395947))
                        goto(Label_1409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(255494933))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(1)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1119039428))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(1)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(312403614))
                            goto(Label_0860)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(512)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(664480760))
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0576)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(1067101460))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-1812817602))
                            loopcontinue()
                        }
                        
                        var_3_686 = and:int(var_3_686:int, ldc:int(-175578571))
                        var_11_EF = and:int(ldc:int(-14124), ldc:int(13353))
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1282139476))
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1992145267))
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0860)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0704)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-26023289))
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-953438495))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1046629515))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EF:int, ldc:int(0))) {
                                goto(Label_1409)
                            }
                        }
                    }
                    
                    Label_1268:
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(512)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1246483772))
                        goto(Label_1553)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1680071134))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1146)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-290284303))
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0860)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-1031613760))
                            goto(Label_0704)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(4)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-626434367))
                            goto(Label_0576)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_686 = and:int(var_3_686:int, ldc:int(-1096961363))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_119:double, var_5_85:int, var_16_11D:int)
                            goto(Label_1542)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1409:
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(1)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(657581594))
                        goto(Label_1553)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(1)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(624852897))
                        goto(Label_1268)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-482043187))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0860)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0704)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-1451022172))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_686 = and:int(var_3_686:int, ldc:int(-1985118481))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_119:double, ldc:double(0.0))
                    Label_1542:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_691 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EF:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1553:
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1268)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1994824814))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(1912663897))
                        goto(Label_0860)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(307220733))
                        goto(Label_0704)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_686:int, ldc:int(1)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(475474726))
                        goto(Label_0576)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_686:int, ldc:int(512)), ldc:int(0))) {
                        var_3_686 = and:int(var_3_686:int, ldc:int(-863488323))
                        var_17_691 = add:int(var_16_11D:int, and:int(ldc:int(257), ldc:int(9241)))
                        looporswitchbreak()
                    }
                    
                    var_3_686 = and:int(var_3_686:int, ldc:int(1537620609))
                }
                
                var_3_686 = and:int(var_3_686:int, ldc:int(-1165395969))
                
                if (cmple:boolean(var_5_85 = var_17_691:int, sub:int(var_6_8C:int, and:int(ldc:int(1413), ldc:int(9))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_686:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_686 = and:int(var_3_686:int, ldc:int(1621177942))
            goto(Label_0106)
        }
    }
}
