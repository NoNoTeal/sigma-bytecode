public class \ud36e\u6bb9\u960f\u4c04\u64ab.\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4 {
    public void \u647c\u6435\u92ee\ubff1\u4bc8\u5bc4() {
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
            invokespecial:\u6198\uceb8\ud12e\u839e\u071d\ub6ab(\u6198\uceb8\ud12e\u839e\u071d\ub6ab::<init>, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4, loadelement:String(getstatic:String[](\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\u5140\u99f7\u120d\u8d90\u93a2\ucef1), and:int(ldc:int(15696), ldc:int(-16215))), loadelement:String(getstatic:String[](\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\u5140\u99f7\u120d\u8d90\u93a2\ucef1), xor:int(ldc:int(40), ldc:int(41))))
            putfield:Map<String, Integer[]>(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\u494c\ub8be\ub113\ud217\ua562\ubff1, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4, initobject:HashMap<String, Integer[]>[expected:Map<String, Integer[]>](HashMap<K, V>::<init>))
            putfield:Map<String, Integer[]>(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\ub83f\ud7e8\u7873\u59ec\ud171\u4cd9, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4, initobject:HashMap<String, Integer[]>[expected:Map<String, Integer[]>](HashMap<K, V>::<init>))
            putfield:Map<String, Integer[]>(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\u9a18\u40a9\ufcaf\u7ce1\ua3b4\u516c, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4, initobject:HashMap<String, Integer[]>[expected:Map<String, Integer[]>](HashMap<K, V>::<init>))
            putfield:Map<String, String>(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\u3e2a\u946b\u071d\u3776\u6c52\u7049, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4, initobject:HashMap<String, String>[expected:Map<String, String>](HashMap<K, V>::<init>))
            putfield:Map<String, String>(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\uc87f\ubf56\u3d64\uc87f\u4179\u9af2, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4, initobject:HashMap<String, String>[expected:Map<String, String>](HashMap<K, V>::<init>))
            putfield:BiMap<String, String>(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\ub171\ud36e\u3c25\uc2e8\u7d52\u34df, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4, invokestatic:HashBiMap[expected:BiMap<String, String>](HashBiMap::create))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7006\uae5d\u7006\ub6ab\u8c8a\u4ab3(com.google.gson.JsonObject p0, com.google.gson.JsonObject p1, com.google.gson.JsonObject p2) {
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:136)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u5245\ub1b9\ube23\u0b8e\u0c95\u99f7 \u99f7\u40a9\uc910\u7ce1\ube23\u3711(com.google.gson.JsonObject p0, com.google.gson.JsonObject p1, com.google.gson.JsonObject p2, java.lang.String p3) {
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
        
        if (logicalnot:boolean(invokevirtual:boolean(String::equals, p3:String, loadelement:String[expected:Object](getstatic:String[](\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\u5140\u99f7\u120d\u8d90\u93a2\ucef1), and:int(ldc:int(2575), ldc:int(8591)))))) {
            return:\u5245\ub1b9\ube23\u0b8e\u0c95\u99f7(invokespecial:\u5245\ub1b9\ube23\u0b8e\u0c95\u99f7(\u6198\uceb8\ud12e\u839e\u071d\ub6ab::\u99f7\u40a9\uc910\u7ce1\ube23\u3711, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4[expected:\u6198\uceb8\ud12e\u839e\u071d\ub6ab], p0:JsonObject, p1:JsonObject, p2:JsonObject, p3:String))
        }
        
        return:\u5245\ub1b9\ube23\u0b8e\u0c95\u99f7(initobject:\u5245\ub1b9\ube23\u0b8e\u0c95\u99f7(\u5245\ub1b9\ube23\u0b8e\u0c95\u99f7::<init>, and:int(ldc:int(20468), ldc:int(16373)), invokevirtual:JsonObject(JsonObject::getAsJsonObject, p0:JsonObject, loadelement:String(getstatic:String[](\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\u5140\u99f7\u120d\u8d90\u93a2\ucef1), and:int(ldc:int(16527), ldc:int(12319)))), invokevirtual:JsonObject(JsonObject::getAsJsonObject, p1:JsonObject, loadelement:String(getstatic:String[](\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\u5140\u99f7\u120d\u8d90\u93a2\ucef1), and:int(ldc:int(8504), ldc:int(4242))))))
    }
    
    public static java.lang.String \u4e72\uc2e8\ube23\u0a06\u183a\u97b7(java.lang.String p0) {
        var_1_61 : int
        var_1_6E : int
        var_3_75 : int
        
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
        var_1_61 = and:int(ldc:int(1100224621), ldc:int(2074050039))
        
        if (invokestatic:boolean(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\uc4d2\u8d90\u416d\u3e75\u88c5\u6b5f, p0:String)) {
            var_1_6E = and:int(var_1_61:int, ldc:int(-143388689))
            var_3_75 = invokevirtual:int(String::indexOf, p0:String, ldc:int(58))
            
            if (logicalor:boolean(cmpeq:boolean(var_3_75:int, ldc:int(-1)), cmpeq:boolean(var_3_75:int, ldc:int(0)))) {
                var_1_6E = and:int(var_1_6E:int, ldc:int(784216063))
                
                if (cmple:boolean(invokevirtual:int(String::length, p0:String), ldc:int(10))) {
                    p0 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\u5140\u99f7\u120d\u8d90\u93a2\ucef1), xor:int(ldc:int(16398), ldc:int(16415)))), p0:String))
                }
            }
            
            return:String(p0:String)
        }
        
        return:String(aconstnull:String())
    }
    
    public static boolean \uc4d2\u8d90\u416d\u3e75\u88c5\u6b5f(java.lang.String p0) {
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
            return:boolean(invokevirtual:boolean(String::matches, p0:String, loadelement:String(getstatic:String[](\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\u5140\u99f7\u120d\u8d90\u93a2\ucef1), and:int(ldc:int(86), ldc:int(51)))))
        }
        
        goto(Label_0006)
    }
    
    private void \u624e\ub6ab\u52d3\u52d3\u0a06\u8cae(java.util.Map<java.lang.String, java.lang.Integer[]> p0, com.google.gson.JsonObject p1) {
        var_3_D4 : int
        var_5_6B : Iterator<Entry<K, JsonElement>>
        var_6_AB : Entry<K, JsonElement>
        var_7_BA : JsonArray
        var_8_C4 : Integer[]
        var_9_CD : int
        
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
            var_3_D4 = and:int(ldc:int(-1818875922), ldc:int(-1686174321))
            var_5_6B = invokeinterface:Iterator<Entry<K, JsonElement>>(Set<Entry<K, JsonElement>>::iterator, invokevirtual:Set(JsonObject::entrySet, p1:JsonObject))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_D4:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_D4 = and:int(var_3_D4:int, ldc:int(-1941872646))
                }
                else {
                    var_3_D4 = and:int(var_3_D4:int, ldc:int(-582502466))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_6B:Iterator<Entry<K, JsonElement>>)) {
                        var_6_AB = checkcast:Entry<K, JsonElement>(java.util.Map.Entry<K, com.google.gson.JsonElement>.class, invokeinterface:Entry<K, JsonElement>(Iterator<Entry<K, JsonElement>>::next, var_5_6B:Iterator<Entry<K, JsonElement>>))
                        var_7_BA = invokevirtual:JsonArray(JsonElement::getAsJsonArray, checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:JsonElement(Entry<K, JsonElement>::getValue, var_6_AB:Entry<K, JsonElement>)))
                        var_8_C4 = newarray:Integer[](java.lang.Integer.class, invokevirtual:int(JsonArray::size, var_7_BA:JsonArray))
                        var_9_CD = and:int(ldc:int(-16151), ldc:int(15376))
                        
                        loop {
                            var_3_D4 = and:int(var_3_D4:int, ldc:int(-779629137))
                            
                            if (cmpge:boolean(var_9_CD:int, invokevirtual:int(JsonArray::size, var_7_BA:JsonArray))) {
                                looporswitchbreak()
                            }
                            
                            storeelement:Integer(var_8_C4:Integer[], var_9_CD:int, invokestatic:Integer(Integer::valueOf, invokevirtual:int(JsonElement::getAsInt, invokevirtual:JsonElement(JsonArray::get, var_7_BA:JsonArray, var_9_CD:int))))
                            inc:int(var_9_CD, ldc:int(1))
                        }
                        
                        var_3_D4 = and:int(var_3_D4:int, ldc:int(-1177041473))
                        invokeinterface:Integer[](Map<String, Integer[]>::put, p0:Map<String, Integer[]>, invokeinterface:K[expected:String](Entry<K, V>::getKey, var_6_AB:Entry<K, JsonElement>), var_8_C4:Integer[])
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_D4:int, ldc:int(128)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u69d9\u3711\u624e\ub1b9\u156b\u4c04(java.util.Map<java.lang.Short, java.lang.String> p0, com.google.gson.JsonObject p1) {
        var_3_61 : int
        var_5_6B : Iterator<Entry<String, V>>
        var_6_92 : Entry<String, V>
        
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
            var_3_61 = and:int(ldc:int(2145316241), ldc:int(1323124147))
            var_5_6B = invokeinterface:Iterator(Set::iterator, invokevirtual:Set(JsonObject::entrySet, p1:JsonObject))
            
            loop {
                var_3_61 = and:int(var_3_61:int, ldc:int(653651931))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_6B:Iterator<Entry<String, V>>))) {
                    looporswitchbreak()
                }
                
                var_6_92 = checkcast:Entry<String, V>(java.util.Map.Entry<java.lang.String, V>.class, invokeinterface:Entry<String, V>(Iterator<Entry<String, V>>::next, var_5_6B:Iterator<Entry<String, V>>))
                invokeinterface:String(Map<Short, String>::put, p0:Map<Short, String>, invokestatic:Short(Short::valueOf, invokestatic:short(Short::parseShort, checkcast:String(java.lang.String.class, invokeinterface:String(Entry<String, V>::getKey, var_6_92:Entry<String, V>)))), invokevirtual:String(JsonElement::getAsString, checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:V(Entry<K, V>::getValue, var_6_92:Entry<String, V>))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<java.lang.String, java.lang.Integer[]> \u7330\uc4d2\u7c6b\u76bc\u965f\u4d85() {
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
            return:Map<String, Integer[]>(getfield:Map<String, Integer[]>(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\u494c\ub8be\ub113\ud217\ua562\ubff1, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<java.lang.String, java.lang.Integer[]> \uc7fe\u873d\u873d\ua6bd\u7bad\ubff1() {
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
            return:Map<String, Integer[]>(getfield:Map<String, Integer[]>(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\ub83f\ud7e8\u7873\u59ec\ud171\u4cd9, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<java.lang.String, java.lang.Integer[]> \uc29a\u74b1\u12b2\u8d98\uafe7\u946b() {
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
            return:Map<String, Integer[]>(getfield:Map<String, Integer[]>(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\u9a18\u40a9\ufcaf\u7ce1\ua3b4\u516c, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4))
        }
        
        goto(Label_0006)
    }
    
    public com.google.common.collect.BiMap<java.lang.Short, java.lang.String> \u51fa\ubefe\ua3b4\u67e9\u120d\u7bad() {
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
            return:BiMap<Short, String>(getstatic:BiMap<Short, String>(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\ufe34\u6c56\ubf56\u9033\u3d4b\uf995))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<java.lang.String, java.lang.String> \u59ec\ub171\u5db4\uf995\ub70c\u67d0() {
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
            return:Map<String, String>(getfield:Map<String, String>(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\u3e2a\u946b\u071d\u3776\u6c52\u7049, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<java.lang.String, java.lang.String> \u6c52\u071d\u3711\u6b5f\ubefe\u6c52() {
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
            return:Map<String, String>(getfield:Map<String, String>(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\uc87f\ubf56\u3d64\uc87f\u4179\u9af2, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4))
        }
        
        goto(Label_0006)
    }
    
    public com.google.common.collect.BiMap<java.lang.String, java.lang.String> \ud523\u9af2\uafe7\u12b2\ud36e\ub102() {
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
            return:BiMap<String, String>(getfield:BiMap<String, String>(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\ub171\ud36e\u3c25\uc2e8\u7d52\u34df, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u5245\ub1b9\ube23\u0b8e\u0c95\u99f7 \u8640\u183a\u8389\u7049\u600f\u51fa() {
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
            return:\u5245\ub1b9\ube23\u0b8e\u0c95\u99f7(getfield:\u5245\ub1b9\ube23\u0b8e\u0c95\u99f7(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\ub70c\uc246\u4f4a\u7006\ubf56\u392e, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_3CA : int
        expr_6E : int [generated]
        stack_91_0 : byte[] [generated]
        stack_93_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_F7_0 : byte[] [generated]
        stack_F9_0 : byte[] [generated]
        stack_138_0 : byte[] [generated]
        stack_38F_0 : byte[] [generated]
        stack_3EE_0 : byte[] [generated]
        stack_479_0 : byte[] [generated]
        stack_4CD_0 : byte[] [generated]
        var_4_36A : int
        var_3_36F : byte[]
        var_5_370 : int
        var_0_3E4 : int
        expr_3EE : byte [generated]
        stack_436_2 : byte [generated]
        stack_413_0 : byte [generated]
        expr_47C : byte [generated]
        expr_93 : int [generated]
        expr_CB : int [generated]
        var_2_F7 : byte[]
        expr_FB : int [generated]
        var_3_4BB : byte[]
        var_5_4BC : int
        var_3_144 : String
        stack_35D_0 : String[] [generated]
        expr_156 : String[] [generated]
        
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
        var_0_3CA = and:int(ldc:int(-905920273), ldc:int(-230329969))
        expr_6E = arraylength:int(stack_91_0 = stack_93_0 = stack_C9_0 = stack_CB_0 = stack_F7_0 = stack_F9_0 = stack_138_0 = stack_38F_0 = stack_3EE_0 = stack_479_0 = stack_4CD_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("5paocHKGirBOIpiC+sSaNoyMlogSphSmInYcKh4uvnIqFBIUepb0oqCKMpyCnhIMxKIIFpaCFqKEnhiiCMiwoDTkipCEEJyMqLqQuI6Qnu4e+jC0sCaMLl4cjtiyoMK+gqh6siaMLl4cjPaSnKCywKaslpiYmKZADvr8ZoKeAhSWsDoSvJIIsIZ+LHqqtoSyhACAgrQMNKJwviqmsG76joKyChQ2GDi0jqCSjqqMDiAEEIiIloiu9qKejECArKJ4qKaKspZwqKaqnqx2lJqEoJCigp6SisKyoLBuihIgMhqsjA4gBBCIgoKgpKC4lo6QmKiclpyGnPySiphCkL6SjPSMmJBEkKaoeoSshqK2JqighuyahhiyoqAkloqUqIycoo4afJzoYPwcSGZOIISOqI6WmDZ9h2/L")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_36A = expr_6E:int
        var_3_36F = newarray:byte[](byte.class, expr_6E:int)
        var_5_370 = expr_6E:int
        Label_0882:
        
        while (cmpne:boolean(and:int(var_0_3CA:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_3CA:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0958)
            }
            
            var_0_3CA = and:int(var_0_3CA:int, ldc:int(-845821057))
            var_5_370 = add:int(var_5_370:int, ldc:int(-1))
            storeelement:byte(var_3_36F:byte[], var_5_370:int, add:byte(loadelement:byte(stack_38F_0:byte[], var_5_370:int), ldc:byte(104)))
            
            if (cmpne:boolean(var_5_370:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_93_0 = stack_91_0 = stack_C9_0 = stack_CB_0 = stack_F7_0 = stack_F9_0 = stack_138_0 = stack_38F_0 = stack_3EE_0 = stack_479_0 = stack_4CD_0 = var_3_36F:byte[]
            goto(Label_0115)
        }
        
        goto(Label_1116)
        Label_0958:
        
        while (cmpeq:boolean(and:int(var_0_3CA:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_3CA:int, ldc:int(65536)), ldc:int(0))) {
                var_0_3CA = and:int(var_0_3CA:int, ldc:int(-516506148))
                goto(Label_0882)
            }
            
            var_0_3E4 = and:int(var_0_3CA:int, ldc:int(-516068993))
            var_5_370 = add:int(var_5_370:int, ldc:int(-1))
            expr_3EE = stack_436_2 = loadelement(stack_3EE_0, var_5_370)
            
            if (cmplt:boolean(add:int(add:int(var_5_370:int, ldc:int(4)), neg:int(var_4_36A:int)), ldc:int(0))) {
                stack_436_2 = stack_413_0 = add:byte(expr_3EE:byte, loadelement:byte(var_3_36F:byte[], add:int(var_5_370:int, ldc:int(4))))
                goto(Label_1059)
            }
            
            Label_1019:
            
            if (cmpne:boolean(and:int(var_0_3E4:int, ldc:int(2097152)), ldc:int(0))) {
                var_0_3E4 = and:int(var_0_3E4:int, ldc:int(379759843))
            }
            else {
                var_0_3E4 = and:int(var_0_3E4:int, ldc:int(-1088923489))
                stack_436_2 = stack_413_0 = add:byte(expr_3EE:byte, ldc:byte(4))
            }
            
            Label_1059:
            
            if (cmpne:boolean(and:int(var_0_3E4:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_1019)
            }
            
            var_0_3CA = and:int(var_0_3E4:int, ldc:int(-387492421))
            storeelement:byte(var_3_36F:byte[], var_5_370:int, stack_436_2:byte)
            
            if (cmpne:boolean(var_5_370:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_93_0 = stack_91_0 = stack_C9_0 = stack_CB_0 = stack_F7_0 = stack_F9_0 = stack_138_0 = stack_38F_0 = stack_3EE_0 = stack_479_0 = stack_4CD_0 = var_3_36F:byte[]
            goto(Label_0152)
        }
        
        var_0_3CA = and:int(var_0_3CA:int, ldc:int(-851519095))
        Label_1116:
        
        while (cmpeq:boolean(and:int(var_0_3CA:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_3CA:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0882)
            }
            
            var_0_3CA = and:int(var_0_3CA:int, ldc:int(-641698581))
            var_5_370 = add:int(var_5_370:int, ldc:int(-1))
            expr_47C = xor:byte(loadelement:byte(stack_479_0:byte[], var_5_370:int), ldc:byte(49))
            storeelement:byte(var_3_36F:byte[], var_5_370:int, or:int(and:int(shl:int(expr_47C:byte, and:int(ldc:int(2198), ldc:int(8236))), ldc:int(-16)), and:int(shr:int(expr_47C:byte[expected:int], xor:int(ldc:int(2069), ldc:int(2065))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_370:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_93_0 = stack_91_0 = stack_C9_0 = stack_CB_0 = stack_F7_0 = stack_F9_0 = stack_138_0 = stack_38F_0 = stack_3EE_0 = stack_479_0 = stack_4CD_0 = var_3_36F:byte[]
            goto(Label_0208)
        }
        
        goto(Label_0958)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_3CA:int, ldc:int(8192)), ldc:int(0))) {
            goto(Label_0256)
        }
        
        if (cmpne:boolean(and:int(var_0_3CA:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_3CA:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_3CA = and:int(var_0_3CA:int, ldc:int(-1635125745))
            expr_93 = arraylength:int(stack_93_0:byte[])
            
            if (cmpne:boolean(expr_93:int, ldc:int(0))) {
                var_4_36A = expr_93:int
                var_3_36F = newarray:byte[](byte.class, expr_93:int)
                var_5_370 = expr_93:int
                goto(Label_0958)
            }
        }
        
        Label_0152:
        
        if (cmpne:boolean(and:int(var_0_3CA:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0256)
        }
        
        if (cmpeq:boolean(and:int(var_0_3CA:int, ldc:int(2)), ldc:int(0))) {
            var_0_3CA = and:int(var_0_3CA:int, ldc:int(2069611051))
        }
        else {
            if (cmpne:boolean(and:int(var_0_3CA:int, ldc:int(4096)), ldc:int(0))) {
                var_0_3CA = and:int(var_0_3CA:int, ldc:int(1256446004))
                goto(Label_0115)
            }
            
            var_0_3CA = and:int(var_0_3CA:int, ldc:int(-1585809941))
            expr_CB = arraylength:int(stack_CB_0:byte[])
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_4_36A = expr_CB:int
                var_3_36F = newarray:byte[](byte.class, expr_CB:int)
                var_5_370 = expr_CB:int
                goto(Label_1116)
            }
        }
        
        Label_0208:
        
        if (cmpeq:boolean(and:int(var_0_3CA:int, ldc:int(1048576)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_3CA:int, ldc:int(256)), ldc:int(0))) {
                var_0_3CA = and:int(var_0_3CA:int, ldc:int(1052536649))
                goto(Label_0152)
            }
            
            if (cmpne:boolean(and:int(var_0_3CA:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_3CA = and:int(var_0_3CA:int, ldc:int(-1338414437))
            var_2_F7 = stack_F7_0:byte[]
            expr_FB = add:int(arraylength:int(stack_F9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_FB:int, ldc:int(0))) {
                var_3_4BB = newarray:byte[](byte.class, expr_FB:int)
                var_5_4BC = expr_FB:int
                
                loop {
                    var_0_3CA = and:int(var_0_3CA:int, ldc:int(-1094655333))
                    var_5_4BC = add:int(var_5_4BC:int, ldc:int(-1))
                    storeelement:byte(var_3_4BB:byte[], var_5_4BC:int, add:int(shl:int(loadelement:byte(stack_4CD_0:byte[], var_5_4BC:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_F7:byte[], add:int(var_5_4BC:int, xor:int(ldc:int(24), ldc:int(25)))), ldc:int(5)), and:int(ldc:int(21255), ldc:int(1039)))))
                    
                    if (cmpne:boolean(var_5_4BC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_93_0 = stack_91_0 = stack_C9_0 = stack_CB_0 = stack_F7_0 = stack_F9_0 = stack_138_0 = stack_38F_0 = stack_3EE_0 = stack_479_0 = stack_4CD_0 = var_3_4BB:byte[]
            }
        }
        
        Label_0256:
        
        if (cmpne:boolean(and:int(var_0_3CA:int, ldc:int(65536)), ldc:int(0))) {
            var_0_3CA = and:int(var_0_3CA:int, ldc:int(1372029780))
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_3CA:int, ldc:int(1)), ldc:int(0))) {
            var_0_3CA = and:int(var_0_3CA:int, ldc:int(1785177136))
            goto(Label_0152)
        }
        
        if (cmpeq:boolean(and:int(var_0_3CA:int, ldc:int(1)), ldc:int(0))) {
            var_0_3CA = and:int(var_0_3CA:int, ldc:int(-39270969))
            goto(Label_0115)
        }
        
        var_3_144 = initobject:String(String::<init>, stack_138_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_35D_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(6291), ldc:int(19)))
        expr_156 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(707), ldc:int(720)))
        storeelement:String(expr_156:String[], and:int(ldc:int(2251), ldc:int(17419)), invokevirtual:String[expected:String](String::substring, var_3_144:String, and:int(ldc:int(-26757), ldc:int(26756)), and:int(ldc:int(257), ldc:int(2695))))
        storeelement:String(expr_156:String[], and:int(ldc:int(12622), ldc:int(559)), invokevirtual:String[expected:String](String::substring, var_3_144:String, and:int(ldc:int(4369), ldc:int(1161)), and:int(ldc:int(9221), ldc:int(2085))))
        storeelement:String(expr_156:String[], xor:int(ldc:int(198), ldc:int(203)), invokevirtual:String[expected:String](String::substring, var_3_144:String, and:int(ldc:int(2693), ldc:int(4421)), xor:int(ldc:int(10631), ldc:int(10633))))
        storeelement:String(expr_156:String[], xor:int(ldc:int(167), ldc:int(175)), invokevirtual:String[expected:String](String::substring, var_3_144:String, and:int(ldc:int(18126), ldc:int(318)), xor:int(ldc:int(9235), ldc:int(9287))))
        storeelement:String(expr_156:String[], and:int(ldc:int(19538), ldc:int(275)), invokevirtual:String[expected:String](String::substring, var_3_144:String, xor:int(ldc:int(4665), ldc:int(4717)), xor:int(ldc:int(-16382), ldc:int(-16272))))
        storeelement:String(expr_156:String[], and:int(ldc:int(-12759), ldc:int(12502)), invokevirtual:String[expected:String](String::substring, var_3_144:String, and:int(ldc:int(370), ldc:int(14454)), xor:int(ldc:int(16571), ldc:int(16589))))
        storeelement:String(expr_156:String[], and:int(ldc:int(1289), ldc:int(16593)), invokevirtual:String[expected:String](String::substring, var_3_144:String, xor:int(ldc:int(26716), ldc:int(26666)), and:int(ldc:int(16507), ldc:int(5758))))
        storeelement:String(expr_156:String[], and:int(ldc:int(2061), ldc:int(16462)), invokevirtual:String[expected:String](String::substring, var_3_144:String, xor:int(ldc:int(97), ldc:int(27)), xor:int(ldc:int(108), ldc:int(23))))
        storeelement:String(expr_156:String[], and:int(ldc:int(135), ldc:int(15623)), invokevirtual:String[expected:String](String::substring, var_3_144:String, xor:int(ldc:int(-31675), ldc:int(-31682)), xor:int(ldc:int(2100), ldc:int(2224))))
        storeelement:String(expr_156:String[], xor:int(ldc:int(8336), ldc:int(8345)), invokevirtual:String[expected:String](String::substring, var_3_144:String, and:int(ldc:int(2196), ldc:int(10126)), and:int(ldc:int(12479), ldc:int(2806))))
        storeelement:String(expr_156:String[], and:int(ldc:int(14), ldc:int(2050)), invokevirtual:String[expected:String](String::substring, var_3_144:String, and:int(ldc:int(182), ldc:int(3830)), and:int(ldc:int(200), ldc:int(208))))
        storeelement:String(expr_156:String[], and:int(ldc:int(17167), ldc:int(1135)), invokevirtual:String[expected:String](String::substring, var_3_144:String, and:int(ldc:int(200), ldc:int(30452)), xor:int(ldc:int(14991), ldc:int(14921))))
        storeelement:String(expr_156:String[], and:int(ldc:int(17168), ldc:int(12374)), invokevirtual:String[expected:String](String::substring, var_3_144:String, xor:int(ldc:int(199), ldc:int(1)), xor:int(ldc:int(1341), ldc:int(1516))))
        storeelement:String(expr_156:String[], xor:int(ldc:int(-31727), ldc:int(-31721)), invokevirtual:String[expected:String](String::substring, var_3_144:String, xor:int(ldc:int(16488), ldc:int(16569)), and:int(ldc:int(4346), ldc:int(20458))))
        storeelement:String(expr_156:String[], and:int(ldc:int(165), ldc:int(18437)), invokevirtual:String[expected:String](String::substring, var_3_144:String, xor:int(ldc:int(20533), ldc:int(20703)), xor:int(ldc:int(16841), ldc:int(16703))))
        storeelement:String(expr_156:String[], and:int(ldc:int(18998), ldc:int(1157)), invokevirtual:String[expected:String](String::substring, var_3_144:String, xor:int(ldc:int(1259), ldc:int(1053)), and:int(ldc:int(1810), ldc:int(425))))
        storeelement:String(expr_156:String[], and:int(ldc:int(2083), ldc:int(1799)), invokevirtual:String[expected:String](String::substring, var_3_144:String, and:int(ldc:int(27440), ldc:int(269)), and:int(ldc:int(22969), ldc:int(1289))))
        storeelement:String(expr_156:String[], xor:int(ldc:int(12429), ldc:int(12444)), invokevirtual:String[expected:String](String::substring, var_3_144:String, and:int(ldc:int(4477), ldc:int(27401)), and:int(ldc:int(283), ldc:int(9623))))
        storeelement:String(expr_156:String[], xor:int(ldc:int(20997), ldc:int(21007)), invokevirtual:String[expected:String](String::substring, var_3_144:String, and:int(ldc:int(12051), ldc:int(339)), xor:int(ldc:int(584), ldc:int(895))))
        putstatic:String[](\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\u5140\u99f7\u120d\u8d90\u93a2\ucef1, expr_156:String[])
        putstatic:BiMap<Short, String>(\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4::\ufe34\u6c56\ubf56\u9033\u3d4b\uf995, invokestatic:HashBiMap[expected:BiMap<Short, String>](HashBiMap::create))
    }
    
    public void \u51b2\u9937\u6b0d\ua61f\u5245\u9937(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68A : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_695 : int
        
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
        var_3_68A = and:int(ldc:int(-751784806), ldc:int(-2002956750))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u647c\u6435\u92ee\ubff1\u4bc8\u5bc4[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_68A = and:int(var_3_68A:int, ldc:int(-522809578))
            var_5_80 = and:int(ldc:int(25352), ldc:int(-25353))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(4191), ldc:int(-4192)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_68A:int, ldc:int(-847691941))
                    var_9_C6 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_87:int, and:int(ldc:int(2203), ldc:int(517)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, and:int(ldc:int(17409), ldc:int(4225)))), var_7_96:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_68A = and:int(var_3_D8:int, ldc:int(-654324550))
                    var_14_113 = var_7_96:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(10395), ldc:int(20993)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_87:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1064324181))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1066)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(187630285))
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0662)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1622852242))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1966877819))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0799)
                        }
                    }
                    
                    Label_0395:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1815568515))
                        goto(Label_1066)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1711714315))
                        goto(Label_0920)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-417742623))
                        goto(Label_0662)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(644906482))
                            var_11_E9 = and:int(ldc:int(-16299), ldc:int(4010))
                            goto(Label_1535)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(868579418))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1066)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-807501137))
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(20537195))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-10764937))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0799)
                        }
                    }
                    
                    Label_0662:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1066)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(542290051))
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-922504411))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1288266344))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(863733880))
                            goto(Label_0395)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1355938090))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(601489247))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0799:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-131425093))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1593698446))
                        goto(Label_1066)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0662)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-238449495))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-708872978))
                            goto(Label_0395)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-342520770))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E9 = and:int(ldc:int(16899), ldc:int(10297))
                                goto(Label_1066)
                            }
                        }
                    }
                    
                    Label_0920:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-7566549))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(4308196))
                            goto(Label_0799)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0662)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(199040200))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0395)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1064746994))
                        var_11_E9 = and:int(ldc:int(6185), ldc:int(-6186))
                    }
                    
                    Label_1066:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-940081464))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-554289330))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1977875206))
                            goto(Label_0920)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1288031946))
                            goto(Label_0799)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0662)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(909941333))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(32)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(661647063))
                            goto(Label_0395)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(36343465))
                            loopcontinue()
                        }
                        
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1571570029))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1376)
                            }
                        }
                    }
                    
                    Label_1217:
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-546635769))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1664982139))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1567181404))
                            goto(Label_1066)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1572009315))
                            goto(Label_0920)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0799)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(16)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-1470151826))
                            goto(Label_0662)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1773723080))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(1167661469))
                            goto(Label_0395)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68A = and:int(var_3_68A:int, ldc:int(-471982505))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_80:int, var_16_117:int)
                            goto(Label_1535)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1376:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1807096713))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(809181803))
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1066)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(613362844))
                        goto(Label_0920)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-164540025))
                        goto(Label_0662)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1796125328))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(2049495249))
                        goto(Label_0395)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-285575029))
                        loopcontinue()
                    }
                    
                    var_3_68A = and:int(var_3_68A:int, ldc:int(370753434))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1535:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_695 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1546:
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(1542777227))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-1491670254))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-2015467720))
                        goto(Label_1066)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0799)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-681717338))
                        goto(Label_0662)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(-188278758))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0395)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68A = and:int(var_3_68A:int, ldc:int(805097047))
                        var_17_695 = add:int(var_16_117:int, and:int(ldc:int(16705), ldc:int(14481)))
                        looporswitchbreak()
                    }
                    
                    var_3_68A = and:int(var_3_68A:int, ldc:int(1609468407))
                }
                
                var_3_68A = and:int(var_3_68A:int, ldc:int(503119130))
                
                if (cmple:boolean(var_5_80 = var_17_695:int, sub:int(var_6_87:int, and:int(ldc:int(5249), ldc:int(10309))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_68A:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_68A = and:int(var_3_68A:int, ldc:int(778631194))
            goto(Label_0108)
        }
    }
}
