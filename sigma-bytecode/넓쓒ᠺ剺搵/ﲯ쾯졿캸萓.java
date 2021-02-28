public class \ub113\uc4d2\u183a\u527a\u6435.\ufcaf\ucfaf\uc87f\uceb8\u8413 {
    public void \ufcaf\ucfaf\uc87f\uceb8\u8413() {
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
            invokespecial:\u8df4\u416d\u718f\uc2e8\u7af6(\u8df4\u416d\u718f\uc2e8\u7af6::<init>, this:\ufcaf\ucfaf\uc87f\uceb8\u8413)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7006\u71ae\u946b\u120d\u5140\u5140(com.google.gson.JsonObject p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud51e\u7873\u0a06\ubcb0\u946b p1, com.google.gson.JsonSerializationContext p2) {
        var_4_CB : int
        var_6_89 : JsonArray
        var_7_99 : Iterator<\ud523\u4f52\u59ec\u516c\u3e75>
        var_4_A8 : int
        var_8_F9 : \ud523\u4f52\u59ec\u516c\u3e75
        var_9_102 : JsonObject
        var_10_10C : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        
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
            var_4_CB = and:int(ldc:int(-1156178975), ldc:int(-70043155))
            invokespecial:void(\u8df4\u416d\u718f\uc2e8\u7af6<\ud51e\u7873\u0a06\ubcb0\u946b>::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\ufcaf\ucfaf\uc87f\uceb8\u8413[expected:\u8df4\u416d\u718f\uc2e8\u7af6<\ud51e\u7873\u0a06\ubcb0\u946b>], p0:JsonObject, p1:\ud51e\u7873\u0a06\ubcb0\u946b, p2:JsonSerializationContext)
            
            if (logicalnot:boolean(invokeinterface:boolean(Map::isEmpty, invokestatic:Map(\ud51e\u7873\u0a06\ubcb0\u946b::\ua068\u40a9\u7049\u960f\u4492\u983f, p1:\ud51e\u7873\u0a06\ubcb0\u946b)))) {
                var_6_89 = initobject:JsonArray(JsonArray::<init>)
                var_7_99 = invokeinterface:Iterator<\ud523\u4f52\u59ec\u516c\u3e75>(Set<\ud523\u4f52\u59ec\u516c\u3e75>::iterator, invokeinterface:Set<\ud523\u4f52\u59ec\u516c\u3e75>(Map<\ud523\u4f52\u59ec\u516c\u3e75, V>::keySet, invokestatic:Map(\ud51e\u7873\u0a06\ubcb0\u946b::\ua068\u40a9\u7049\u960f\u4492\u983f, p1:\ud51e\u7873\u0a06\ubcb0\u946b)))
                
                loop {
                    if (cmpne:boolean(and:int(var_4_CB:int, ldc:int(8)), ldc:int(0))) {
                        var_4_A8 = and:int(var_4_CB:int, ldc:int(-1178825867))
                    }
                    else {
                        var_4_A8 = and:int(var_4_CB:int, ldc:int(-1624064537))
                        
                        if (invokeinterface:boolean(Iterator<E>::hasNext, var_7_99:Iterator<\ud523\u4f52\u59ec\u516c\u3e75>)) {
                            var_8_F9 = checkcast:\ud523\u4f52\u59ec\u516c\u3e75(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ud523\u4f52\u59ec\u516c\u3e75.class, invokeinterface:\ud523\u4f52\u59ec\u516c\u3e75(Iterator<\ud523\u4f52\u59ec\u516c\u3e75>::next, var_7_99:Iterator<\ud523\u4f52\u59ec\u516c\u3e75>))
                            var_9_102 = initobject:JsonObject(JsonObject::<init>)
                            var_10_10C = invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\ud523\u4f52\u59ec\u516c\u3e75>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\ud523\u4f52\u59ec\u516c\u3e75>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\uae5d\u0800\ubded\u5d20\u9033\u64f2), var_8_F9:\ud523\u4f52\u59ec\u516c\u3e75)
                            
                            if (cmpne:boolean(var_10_10C:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, aconstnull:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753())) {
                                var_4_CB = and:int(var_4_A8:int, ldc:int(-545809921))
                                invokevirtual:void(JsonObject::add, var_9_102:JsonObject, loadelement:String(getstatic:String[](\ufcaf\ucfaf\uc87f\uceb8\u8413::\ud523\u5d20\u183a\u62da\u6d99\u836c), and:int(ldc:int(21827), ldc:int(8201))), initobject:JsonPrimitive(JsonPrimitive::<init>, invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, var_10_10C:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
                                invokevirtual:void(JsonObject::add, var_9_102:JsonObject, loadelement:String(getstatic:String[](\ufcaf\ucfaf\uc87f\uceb8\u8413::\ud523\u5d20\u183a\u62da\u6d99\u836c), xor:int(ldc:int(10754), ldc:int(10752))), invokeinterface:JsonElement(JsonSerializationContext::serialize, p2:JsonSerializationContext, invokeinterface:Object(Map<K, Object>::get, invokestatic:Map(\ud51e\u7873\u0a06\ubcb0\u946b::\ua068\u40a9\u7049\u960f\u4492\u983f, p1:\ud51e\u7873\u0a06\ubcb0\u946b), var_8_F9:\ud523\u4f52\u59ec\u516c\u3e75[expected:Object])))
                                invokevirtual:void(JsonArray::add, var_6_89:JsonArray, var_9_102:JsonElement)
                                loopcontinue()
                            }
                            
                            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ufcaf\ucfaf\uc87f\uceb8\u8413::\ud523\u5d20\u183a\u62da\u6d99\u836c), and:int(ldc:int(8016), ldc:int(-16209)))), var_8_F9:\ud523\u4f52\u59ec\u516c\u3e75[expected:Object]))))
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_4_A8:int, ldc:int(2048)), ldc:int(0))) {
                        var_4_CB = and:int(var_4_A8:int, ldc:int(-1155843609))
                        invokevirtual:void(JsonObject::add, p0:JsonObject, loadelement:String(getstatic:String[](\ufcaf\ucfaf\uc87f\uceb8\u8413::\ud523\u5d20\u183a\u62da\u6d99\u836c), xor:int(ldc:int(146), ldc:int(145))), var_6_89:JsonElement)
                        looporswitchbreak()
                    }
                    
                    var_4_CB = and:int(var_4_A8:int, ldc:int(866418902))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud51e\u7873\u0a06\ubcb0\u946b \u5bc4\ua562\ub1b9\u34df\u6d99\ube23(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] p2) {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
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
            return:\ub6ab\ube23\ub70c\u67d0\u88c5(invokevirtual:\ud51e\u7873\u0a06\ubcb0\u946b[expected:\ub6ab\ube23\ub70c\u67d0\u88c5](\ufcaf\ucfaf\uc87f\uceb8\u8413::\u5bc4\ua562\ub1b9\u34df\u6d99\ube23, this:\ufcaf\ucfaf\uc87f\uceb8\u8413, p0:JsonObject, p1:JsonDeserializationContext, p2:\u67d0\u36d3\uae5d\u99f7\u9a18[]))
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
            invokevirtual:void(\ufcaf\ucfaf\uc87f\uceb8\u8413::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\ufcaf\ucfaf\uc87f\uceb8\u8413, p0:JsonObject, checkcast:\ud51e\u7873\u0a06\ubcb0\u946b(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud51e\u7873\u0a06\ubcb0\u946b.class, p1:\ub6ab\ube23\ub70c\u67d0\u88c5[expected:\ud51e\u7873\u0a06\ubcb0\u946b]), p2:JsonSerializationContext)
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
            invokevirtual:void(\ufcaf\ucfaf\uc87f\uceb8\u8413::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\ufcaf\ucfaf\uc87f\uceb8\u8413, p0:JsonObject, checkcast:\ud51e\u7873\u0a06\ubcb0\u946b(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud51e\u7873\u0a06\ubcb0\u946b.class, p1:Object[expected:\ud51e\u7873\u0a06\ubcb0\u946b]), p2:JsonSerializationContext)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static com.google.gson.JsonSyntaxException lambda$\uafe7\uc3e3\u5fe1\ua61f\uf9c5\u0a06$0(java.lang.String p0) {
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
            return:JsonSyntaxException(initobject:JsonSyntaxException(JsonSyntaxException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ufcaf\ucfaf\uc87f\uceb8\u8413::\ud523\u5d20\u183a\u62da\u6d99\u836c), and:int(ldc:int(8213), ldc:int(20996)))), p0:String), loadelement:String(getstatic:String[](\ufcaf\ucfaf\uc87f\uceb8\u8413::\ud523\u5d20\u183a\u62da\u6d99\u836c), and:int(ldc:int(1287), ldc:int(8437)))))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_21F : int
        expr_6C : int [generated]
        stack_AC_0 : byte[] [generated]
        stack_AE_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_103_0 : byte[] [generated]
        stack_105_0 : byte[] [generated]
        stack_13D_0 : byte[] [generated]
        stack_239_0 : byte[] [generated]
        stack_28A_0 : byte[] [generated]
        stack_318_0 : byte[] [generated]
        stack_369_0 : byte[] [generated]
        var_4_20A : int
        var_3_20F : byte[]
        var_5_210 : int
        var_0_2A4 : int
        expr_28A : byte [generated]
        stack_2D3_2 : byte [generated]
        stack_2A7_0 : byte [generated]
        expr_318 : byte [generated]
        expr_AE : int [generated]
        expr_D5 : int [generated]
        var_2_103 : byte[]
        expr_107 : int [generated]
        var_3_357 : byte[]
        var_5_358 : int
        var_3_149 : String
        stack_203_0 : String[] [generated]
        expr_15B : String[] [generated]
        
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
        var_0_21F = and:int(ldc:int(-672973476), ldc:int(-1379484329))
        expr_6C = arraylength:int(stack_AC_0 = stack_AE_0 = stack_D3_0 = stack_D5_0 = stack_103_0 = stack_105_0 = stack_13D_0 = stack_239_0 = stack_28A_0 = stack_318_0 = stack_369_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Xyd75/OJZePfeYlp1XX5YQXvf+Hln/Xd14Mf42f1Aflt4+n10XWxWTPz99/pFfll9QH5bePp9dF1EW1P05P/24ft8YP36fXR1ffn86/PKf8=")))
        
        if (cmpeq:boolean(expr_6C:int, ldc:int(0))) {
            goto(Label_0113)
        }
        
        var_4_20A = expr_6C:int
        var_3_20F = newarray:byte[](byte.class, expr_6C:int)
        var_5_210 = expr_6C:int
        Label_0530:
        
        while (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(1048576)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0619)
            }
            
            var_0_21F = and:int(var_0_21F:int, ldc:int(-1361901476))
            var_5_210 = add:int(var_5_210:int, ldc:int(-1))
            storeelement:byte(var_3_20F:byte[], var_5_210:int, add:byte(xor:byte(loadelement:byte(stack_239_0:byte[], var_5_210:int), ldc:byte(71)), ldc:byte(80)))
            
            if (cmpne:boolean(var_5_210:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AE_0 = stack_AC_0 = stack_D3_0 = stack_D5_0 = stack_103_0 = stack_105_0 = stack_13D_0 = stack_239_0 = stack_28A_0 = stack_318_0 = stack_369_0 = var_3_20F:byte[]
            goto(Label_0113)
        }
        
        var_0_21F = and:int(var_0_21F:int, ldc:int(1275815756))
        goto(Label_0761)
        Label_0619:
        
        while (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(32)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0530)
            }
            
            var_0_2A4 = and:int(var_0_21F:int, ldc:int(-1770825345))
            var_5_210 = add:int(var_5_210:int, ldc:int(-1))
            expr_28A = stack_2D3_2 = loadelement(stack_28A_0, var_5_210)
            
            if (cmplt:boolean(add:int(add:int(var_5_210:int, ldc:int(2)), neg:int(var_4_20A:int)), ldc:int(0))) {
                stack_2D3_2 = stack_2A7_0 = add:byte(expr_28A:byte, loadelement:byte(var_3_20F:byte[], add:int(var_5_210:int, ldc:int(2))))
                goto(Label_0695)
            }
            
            Label_0663:
            
            if (cmpne:boolean(and:int(var_0_2A4:int, ldc:int(64)), ldc:int(0))) {
                var_0_2A4 = and:int(var_0_2A4:int, ldc:int(-1224770979))
                stack_2D3_2 = stack_2A7_0 = add:byte(expr_28A:byte, ldc:byte(2))
            }
            
            Label_0695:
            
            if (cmpeq:boolean(and:int(var_0_2A4:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_2A4 = and:int(var_0_2A4:int, ldc:int(-2021871508))
                goto(Label_0663)
            }
            
            var_0_21F = and:int(var_0_2A4:int, ldc:int(-816107811))
            storeelement:byte(var_3_20F:byte[], var_5_210:int, stack_2D3_2:byte)
            
            if (cmpne:boolean(var_5_210:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AE_0 = stack_AC_0 = stack_D3_0 = stack_D5_0 = stack_103_0 = stack_105_0 = stack_13D_0 = stack_239_0 = stack_28A_0 = stack_318_0 = stack_369_0 = var_3_20F:byte[]
            goto(Label_0179)
        }
        
        Label_0761:
        
        while (cmpne:boolean(and:int(var_0_21F:int, ldc:int(4)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0530)
            }
            
            var_0_21F = and:int(var_0_21F:int, ldc:int(-1000362787))
            var_5_210 = add:int(var_5_210:int, ldc:int(-1))
            expr_318 = loadelement:byte(stack_318_0:byte[], var_5_210:int)
            storeelement:byte(var_3_20F:byte[], var_5_210:int, or:int(and:int(shl:int(expr_318:byte, xor:int(ldc:int(17416), ldc:int(17420))), ldc:int(-16)), and:int(shr:int(expr_318:byte[expected:int], and:int(ldc:int(12356), ldc:int(16917))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_210:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AE_0 = stack_AC_0 = stack_D3_0 = stack_D5_0 = stack_103_0 = stack_105_0 = stack_13D_0 = stack_239_0 = stack_28A_0 = stack_318_0 = stack_369_0 = var_3_20F:byte[]
            goto(Label_0218)
        }
        
        goto(Label_0619)
        Label_0113:
        
        if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(32)), ldc:int(0))) {
            var_0_21F = and:int(var_0_21F:int, ldc:int(-50145754))
            goto(Label_0268)
        }
        
        if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_21F = and:int(var_0_21F:int, ldc:int(-1673638539))
            goto(Label_0218)
        }
        
        if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(131072)), ldc:int(0))) {
            var_0_21F = and:int(var_0_21F:int, ldc:int(-1023327163))
        }
        else {
            var_0_21F = and:int(var_0_21F:int, ldc:int(-1115747841))
            expr_AE = arraylength:int(stack_AE_0:byte[])
            
            if (cmpne:boolean(expr_AE:int, ldc:int(0))) {
                var_4_20A = expr_AE:int
                var_3_20F = newarray:byte[](byte.class, expr_AE:int)
                var_5_210 = expr_AE:int
                goto(Label_0619)
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0268)
        }
        
        if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(32)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0113)
            }
            
            var_0_21F = and:int(var_0_21F:int, ldc:int(-2024542602))
            expr_D5 = arraylength:int(stack_D5_0:byte[])
            
            if (cmpne:boolean(expr_D5:int, ldc:int(0))) {
                var_4_20A = expr_D5:int
                var_3_20F = newarray:byte[](byte.class, expr_D5:int)
                var_5_210 = expr_D5:int
                goto(Label_0761)
            }
        }
        
        Label_0218:
        
        if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(4)), ldc:int(0))) {
                var_0_21F = and:int(var_0_21F:int, ldc:int(-1707445681))
                goto(Label_0179)
            }
            
            if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0113)
            }
            
            var_0_21F = and:int(var_0_21F:int, ldc:int(-1210943148))
            var_2_103 = stack_103_0:byte[]
            expr_107 = add:int(arraylength:int(stack_105_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_107:int, ldc:int(0))) {
                var_3_357 = newarray:byte[](byte.class, expr_107:int)
                var_5_358 = expr_107:int
                
                loop {
                    var_0_21F = and:int(var_0_21F:int, ldc:int(-27009676))
                    var_5_358 = add:int(var_5_358:int, ldc:int(-1))
                    storeelement:byte(var_3_357:byte[], var_5_358:int, add:int(shl:int(loadelement:byte(stack_369_0:byte[], var_5_358:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_103:byte[], add:int(var_5_358:int, xor:int(ldc:int(-32767), ldc:int(-32768)))), ldc:int(5)), and:int(ldc:int(263), ldc:int(4647)))))
                    
                    if (cmpne:boolean(var_5_358:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AE_0 = stack_AC_0 = stack_D3_0 = stack_D5_0 = stack_103_0 = stack_105_0 = stack_13D_0 = stack_239_0 = stack_28A_0 = stack_318_0 = stack_369_0 = var_3_357:byte[]
            }
        }
        
        Label_0268:
        
        if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0218)
        }
        
        if (cmpne:boolean(and:int(var_0_21F:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_21F = and:int(var_0_21F:int, ldc:int(1237683833))
            goto(Label_0179)
        }
        
        if (cmpeq:boolean(and:int(var_0_21F:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_21F = and:int(var_0_21F:int, ldc:int(-503273462))
            goto(Label_0113)
        }
        
        var_3_149 = initobject:String(String::<init>, stack_13D_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_203_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-16315), ldc:int(-16317)))
        expr_15B = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4486), ldc:int(11302)))
        storeelement:String(expr_15B:String[], and:int(ldc:int(8525), ldc:int(18613)), invokevirtual:String[expected:String](String::substring, var_3_149:String, and:int(ldc:int(6237), ldc:int(-31230)), xor:int(ldc:int(16428), ldc:int(16429))))
        storeelement:String(expr_15B:String[], and:int(ldc:int(-16627), ldc:int(16626)), invokevirtual:String[expected:String](String::substring, var_3_149:String, and:int(ldc:int(12611), ldc:int(18977)), and:int(ldc:int(42), ldc:int(4588))))
        storeelement:String(expr_15B:String[], and:int(ldc:int(644), ldc:int(24703)), invokevirtual:String[expected:String](String::substring, var_3_149:String, xor:int(ldc:int(392), ldc:int(416)), xor:int(ldc:int(8211), ldc:int(8239))))
        storeelement:String(expr_15B:String[], xor:int(ldc:int(5127), ldc:int(5125)), invokevirtual:String[expected:String](String::substring, var_3_149:String, xor:int(ldc:int(4119), ldc:int(4139)), xor:int(ldc:int(2140), ldc:int(2072))))
        storeelement:String(expr_15B:String[], and:int(ldc:int(4687), ldc:int(2083)), invokevirtual:String[expected:String](String::substring, var_3_149:String, and:int(ldc:int(4678), ldc:int(10452)), xor:int(ldc:int(5), ldc:int(78))))
        storeelement:String(expr_15B:String[], and:int(ldc:int(1585), ldc:int(22593)), invokevirtual:String[expected:String](String::substring, var_3_149:String, xor:int(ldc:int(20496), ldc:int(20571)), and:int(ldc:int(8287), ldc:int(6735))))
        putstatic:String[](\ufcaf\ucfaf\uc87f\uceb8\u8413::\ud523\u5d20\u183a\u62da\u6d99\u836c, expr_15B:String[])
    }
    
    public void \u0800\u8753\u7006\ua068\u93a2\u16f6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_684 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_68F : int
        
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
        var_3_684 = and:int(ldc:int(-148665408), ldc:int(1447020537))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ufcaf\ucfaf\uc87f\uceb8\u8413[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(-3935265))
            var_5_81 = and:int(ldc:int(-31787), ldc:int(7210))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16437), ldc:int(-24694)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_684:int, ldc:int(-71305495))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(10241), ldc:int(16717)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(9281), ldc:int(945)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_684 = and:int(var_3_DA:int, ldc:int(2137253878))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(16416), ldc:int(16417)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-2070178839))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-336530625))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(661286711))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1268344286))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1499462853))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1843648516))
                    }
                    else {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1999885004))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(185659689))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(292085977))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(565462730))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(519015732))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-262553848))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-242642213))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-233317813))
                        var_11_EB = and:int(ldc:int(-8492), ldc:int(8491))
                        goto(Label_1544)
                    }
                    
                    Label_0613:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-677742869))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1416472946))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(423818243))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1260346417))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(1945087710))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0861)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1444522680))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1594013690))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(2103484533))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(2010379971))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0861:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1706440743))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-522345079))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1875456197))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-85734556))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(20740), ldc:int(20741))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1519976601))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1403489216))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(456069055))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(686912329))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(1652286286))
                        var_11_EB = and:int(ldc:int(27177), ldc:int(-27178))
                    }
                    
                    Label_1137:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-558330751))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(314498305))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(110367527))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1747921757))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(2055467000))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1389)
                            }
                        }
                    }
                    
                    Label_1262:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1261973571))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1137)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1418114963))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0861)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-591190696))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1734071903))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1544)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1389:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1169669100))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1134511399))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-2045206536))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-2017656459))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(669241972))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1479640144))
                        loopcontinue()
                    }
                    
                    var_3_684 = and:int(var_3_684:int, ldc:int(-552862862))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68F = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(971614465))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-312707773))
                        goto(Label_0861)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1298131108))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-943065030))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-408713616))
                        var_17_68F = add:int(var_16_119:int, and:int(ldc:int(16441), ldc:int(14465)))
                        looporswitchbreak()
                    }
                }
                
                var_3_684 = and:int(var_3_684:int, ldc:int(1845999439))
                
                if (cmple:boolean(var_5_81 = var_17_68F:int, sub:int(var_6_88:int, xor:int(ldc:int(561), ldc:int(560))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(-650698086))
            goto(Label_0108)
        }
    }
}
