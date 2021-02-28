public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5f50\ubefe\ud158\u8258\u7d52 {
    public void \u5f50\ubefe\ud158\u8258\u7d52() {
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
            invokespecial:\u8df4\u416d\u718f\uc2e8\u7af6(\u8df4\u416d\u718f\uc2e8\u7af6::<init>, this:\u5f50\ubefe\ud158\u8258\u7d52)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7006\u71ae\u946b\u120d\u5140\u5140(com.google.gson.JsonObject p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u7c6b\u6b5f\u8413\u97e6\u7873 p1, com.google.gson.JsonSerializationContext p2) {
        var_4_61 : int
        var_6_87 : JsonArray
        var_7_92 : Iterator<ITextComponent>
        
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
            var_4_61 = and:int(ldc:int(326122385), ldc:int(-1946818805))
            invokespecial:void(\u8df4\u416d\u718f\uc2e8\u7af6<\u7c6b\u6b5f\u8413\u97e6\u7873>::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\u5f50\ubefe\ud158\u8258\u7d52[expected:\u8df4\u416d\u718f\uc2e8\u7af6<\u7c6b\u6b5f\u8413\u97e6\u7873>], p0:JsonObject, p1:\u7c6b\u6b5f\u8413\u97e6\u7873, p2:JsonSerializationContext)
            invokevirtual:void(JsonObject::addProperty, p0:JsonObject, loadelement:String(getstatic:String[](\u5f50\ubefe\ud158\u8258\u7d52::\u9255\u3bc9\u416d\u4179\u3d64\ubb2b), and:int(ldc:int(-17467), ldc:int(17466))), invokestatic:Boolean(Boolean::valueOf, invokestatic:boolean(\u7c6b\u6b5f\u8413\u97e6\u7873::\ub83f\ubf56\u99f7\ub18d\u97e6\u5245, p1:\u7c6b\u6b5f\u8413\u97e6\u7873)))
            var_6_87 = initobject:JsonArray(JsonArray::<init>)
            var_7_92 = invokeinterface:Iterator<ITextComponent>(List<ITextComponent>::iterator, invokestatic:List(\u7c6b\u6b5f\u8413\u97e6\u7873::\u7bad\ubff1\ubf56\ub32d\u3711\ucfaf, p1:\u7c6b\u6b5f\u8413\u97e6\u7873))
            
            loop {
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(4)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(877289856))
                }
                else {
                    var_4_61 = and:int(var_4_61:int, ldc:int(588344903))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_7_92:Iterator<ITextComponent>)) {
                        invokevirtual:void(JsonArray::add, var_6_87:JsonArray, invokestatic:JsonElement(ITextComponent$Serializer::toJsonTree, checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, invokeinterface:ITextComponent(Iterator<ITextComponent>::next, var_7_92:Iterator<ITextComponent>))))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(16777216)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokevirtual:void(JsonObject::add, p0:JsonObject, loadelement:String(getstatic:String[](\u5f50\ubefe\ud158\u8258\u7d52::\u9255\u3bc9\u416d\u4179\u3d64\ubb2b), and:int(ldc:int(4481), ldc:int(16395))), var_6_87:JsonElement)
            
            if (cmpne:boolean(invokestatic:\u5bc4\ub7dc\u6c56\ubded\u8c8a(\u7c6b\u6b5f\u8413\u97e6\u7873::\u16f6\u8d98\uc238\u8d90\u3776\u9255, p1:\u7c6b\u6b5f\u8413\u97e6\u7873), aconstnull:\u5bc4\ub7dc\u6c56\ubded\u8c8a())) {
                invokevirtual:void(JsonObject::add, p0:JsonObject, loadelement:String(getstatic:String[](\u5f50\ubefe\ud158\u8258\u7d52::\u9255\u3bc9\u416d\u4179\u3d64\ubb2b), xor:int(ldc:int(4099), ldc:int(4097))), invokeinterface:JsonElement(JsonSerializationContext::serialize, p2:JsonSerializationContext, invokestatic:\u5bc4\ub7dc\u6c56\ubded\u8c8a[expected:Object](\u7c6b\u6b5f\u8413\u97e6\u7873::\u16f6\u8d98\uc238\u8d90\u3776\u9255, p1:\u7c6b\u6b5f\u8413\u97e6\u7873)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u7c6b\u6b5f\u8413\u97e6\u7873 \u5bc4\ua562\ub1b9\u34df\u6d99\ube23(com.google.gson.JsonObject p0, com.google.gson.JsonDeserializationContext p1, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18[] p2) {
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
            return:\u7c6b\u6b5f\u8413\u97e6\u7873(initobject:\u7c6b\u6b5f\u8413\u97e6\u7873(\u7c6b\u6b5f\u8413\u97e6\u7873::<init>, p2:\u67d0\u36d3\uae5d\u99f7\u9a18[], invokestatic:boolean(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u51fa\u8d98\ub70c\ubb2b\ud4fe\u156b, p0:JsonObject, loadelement:String(getstatic:String[](\u5f50\ubefe\ud158\u8258\u7d52::\u9255\u3bc9\u416d\u4179\u3d64\ubb2b), and:int(ldc:int(-22637), ldc:int(22572))), and:int[expected:boolean](ldc:int(9237), ldc:int(-9878))), checkcast:List<ITextComponent>(java.util.List<net.minecraft.util.text.ITextComponent>.class, invokeinterface:List<ITextComponent>(Stream<Object>::collect, invokeinterface:Stream<Object>(Stream<Object>::map, invokestatic:Stream(Streams::stream, invokestatic:JsonArray[expected:Iterable](\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u4bc8\u446c\u873d\u3dd3\uf94d\u7bad, p0:JsonObject, loadelement:String(getstatic:String[](\u5f50\ubefe\ud158\u8258\u7d52::\u9255\u3bc9\u416d\u4179\u3d64\ubb2b), xor:int(ldc:int(337), ldc:int(336))))), invokedynamic:Function<JsonElement, IFormattableTextComponent>(apply:()Ljava/util/function/Function;)), invokestatic:Collector(ImmutableList::toImmutableList))), checkcast:\u5bc4\ub7dc\u6c56\ubded\u8c8a(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u5bc4\ub7dc\u6c56\ubded\u8c8a.class, invokestatic:\u5bc4\ub7dc\u6c56\ubded\u8c8a(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\ub83f\uae5d\u7330\u7873\u7ce1\u516c, p0:JsonObject, loadelement:String(getstatic:String[](\u5f50\ubefe\ud158\u8258\u7d52::\u9255\u3bc9\u416d\u4179\u3d64\ubb2b), and:int(ldc:int(16931), ldc:int(14738))), checkcast:\u5bc4\ub7dc\u6c56\ubded\u8c8a(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u5bc4\ub7dc\u6c56\ubded\u8c8a.class, aconstnull:\u5bc4\ub7dc\u6c56\ubded\u8c8a()), p1:JsonDeserializationContext, ldc:Class<\u5bc4\ub7dc\u6c56\ubded\u8c8a>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u5bc4\ub7dc\u6c56\ubded\u8c8a.class)))))
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
            return:\ub6ab\ube23\ub70c\u67d0\u88c5(invokevirtual:\u7c6b\u6b5f\u8413\u97e6\u7873[expected:\ub6ab\ube23\ub70c\u67d0\u88c5](\u5f50\ubefe\ud158\u8258\u7d52::\u5bc4\ua562\ub1b9\u34df\u6d99\ube23, this:\u5f50\ubefe\ud158\u8258\u7d52, p0:JsonObject, p1:JsonDeserializationContext, p2:\u67d0\u36d3\uae5d\u99f7\u9a18[]))
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
            invokevirtual:void(\u5f50\ubefe\ud158\u8258\u7d52::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\u5f50\ubefe\ud158\u8258\u7d52, p0:JsonObject, checkcast:\u7c6b\u6b5f\u8413\u97e6\u7873(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u7c6b\u6b5f\u8413\u97e6\u7873.class, p1:\ub6ab\ube23\ub70c\u67d0\u88c5[expected:\u7c6b\u6b5f\u8413\u97e6\u7873]), p2:JsonSerializationContext)
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
            invokevirtual:void(\u5f50\ubefe\ud158\u8258\u7d52::\u7006\u71ae\u946b\u120d\u5140\u5140, this:\u5f50\ubefe\ud158\u8258\u7d52, p0:JsonObject, checkcast:\u7c6b\u6b5f\u8413\u97e6\u7873(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u7c6b\u6b5f\u8413\u97e6\u7873.class, p1:Object[expected:\u7c6b\u6b5f\u8413\u97e6\u7873]), p2:JsonSerializationContext)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1CD : int
        expr_6B : int [generated]
        stack_95_0 : byte[] [generated]
        stack_97_0 : byte[] [generated]
        stack_B1_0 : byte[] [generated]
        stack_B3_0 : byte[] [generated]
        stack_DE_0 : byte[] [generated]
        stack_177_0 : byte[] [generated]
        stack_1DF_0 : byte[] [generated]
        stack_257_0 : byte[] [generated]
        var_4_15A : int
        var_3_15F : byte[]
        var_5_160 : int
        expr_177 : byte [generated]
        var_0_1D5 : int
        expr_1DF : byte [generated]
        stack_225_2 : byte [generated]
        stack_202_0 : byte [generated]
        expr_97 : int [generated]
        var_2_B1 : byte[]
        expr_B5 : int [generated]
        var_3_245 : byte[]
        var_5_246 : int
        var_3_EA : String
        stack_153_0 : String[] [generated]
        expr_FC : String[] [generated]
        
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
        var_0_1CD = and:int(ldc:int(-1256236235), ldc:int(-2051036908))
        expr_6B = arraylength:int(stack_95_0 = stack_97_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_177_0 = stack_1DF_0 = stack_257_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("6prq4jIyAuJyojIqegLP7/+S")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_15A = expr_6B:int
        var_3_15F = newarray:byte[](byte.class, expr_6B:int)
        var_5_160 = expr_6B:int
        Label_0354:
        
        while (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(2048)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-311084670))
            var_5_160 = add:int(var_5_160:int, ldc:int(-1))
            expr_177 = loadelement:byte(stack_177_0:byte[], var_5_160:int)
            storeelement:byte(var_3_15F:byte[], var_5_160:int, add:int(xor:int(or:int(and:int(shl:int(expr_177:byte, and:int(ldc:int(13324), ldc:int(16932))), ldc:int(-16)), and:int(shr:int(expr_177:byte[expected:int], xor:int(ldc:int(16389), ldc:int(16385))), ldc:int(15))), ldc:int(90)), ldc:int(10)))
            
            if (cmpne:boolean(var_5_160:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_97_0 = stack_95_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_177_0 = stack_1DF_0 = stack_257_0 = var_3_15F:byte[]
            goto(Label_0112)
        }
        
        Label_0450:
        
        while (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_1D5 = and:int(var_0_1CD:int, ldc:int(2005884867))
            var_5_160 = add:int(var_5_160:int, ldc:int(-1))
            expr_1DF = stack_225_2 = loadelement(stack_1DF_0, var_5_160)
            
            if (cmplt:boolean(add:int(add:int(var_5_160:int, ldc:int(3)), neg:int(var_4_15A:int)), ldc:int(0))) {
                stack_225_2 = stack_202_0 = add:byte(expr_1DF:byte, loadelement:byte(var_3_15F:byte[], add:int(var_5_160:int, ldc:int(3))))
                goto(Label_0530)
            }
            
            Label_0492:
            
            if (cmpeq:boolean(and:int(var_0_1D5:int, ldc:int(2048)), ldc:int(0))) {
                var_0_1D5 = and:int(var_0_1D5:int, ldc:int(1870221734))
            }
            else {
                var_0_1D5 = and:int(var_0_1D5:int, ldc:int(1329572616))
                stack_225_2 = stack_202_0 = add:byte(expr_1DF:byte, ldc:byte(3))
            }
            
            Label_0530:
            
            if (cmpne:boolean(and:int(var_0_1D5:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0492)
            }
            
            var_0_1CD = and:int(var_0_1D5:int, ldc:int(-821055524))
            storeelement:byte(var_3_15F:byte[], var_5_160:int, stack_225_2:byte)
            
            if (cmpne:boolean(var_5_160:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_97_0 = stack_95_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_177_0 = stack_1DF_0 = stack_257_0 = var_3_15F:byte[]
            goto(Label_0156)
        }
        
        var_0_1CD = and:int(var_0_1CD:int, ldc:int(2112530938))
        goto(Label_0354)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(256)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(-1251149916))
            goto(Label_0186)
        }
        
        if (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(1990444191))
        }
        else {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(365419868))
            expr_97 = arraylength:int(stack_97_0:byte[])
            
            if (cmpne:boolean(expr_97:int, ldc:int(0))) {
                var_4_15A = expr_97:int
                var_3_15F = newarray:byte[](byte.class, expr_97:int)
                var_5_160 = expr_97:int
                goto(Label_0450)
            }
        }
        
        Label_0156:
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(1426963900))
            var_2_B1 = stack_B1_0:byte[]
            expr_B5 = add:int(arraylength:int(stack_B3_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_B5:int, ldc:int(0))) {
                var_3_245 = newarray:byte[](byte.class, expr_B5:int)
                var_5_246 = expr_B5:int
                
                loop {
                    var_0_1CD = and:int(var_0_1CD:int, ldc:int(399895000))
                    var_5_246 = add:int(var_5_246:int, ldc:int(-1))
                    storeelement:byte(var_3_245:byte[], var_5_246:int, add:int(shl:int(loadelement:byte(stack_257_0:byte[], var_5_246:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_B1:byte[], add:int(var_5_246:int, and:int(ldc:int(2337), ldc:int(13339)))), ldc:int(7)), xor:int(ldc:int(-16319), ldc:int(-16320)))))
                    
                    if (cmpne:boolean(var_5_246:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_97_0 = stack_95_0 = stack_B1_0 = stack_B3_0 = stack_DE_0 = stack_177_0 = stack_1DF_0 = stack_257_0 = var_3_245:byte[]
            }
        }
        
        Label_0186:
        
        if (cmpne:boolean(and:int(var_0_1CD:int, ldc:int(2)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(1852554406))
            goto(Label_0156)
        }
        
        if (cmpeq:boolean(and:int(var_0_1CD:int, ldc:int(262144)), ldc:int(0))) {
            var_0_1CD = and:int(var_0_1CD:int, ldc:int(2082650699))
            goto(Label_0112)
        }
        
        var_3_EA = initobject:String(String::<init>, stack_DE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_153_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4489), ldc:int(4490)))
        expr_FC = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(11), ldc:int(30295)))
        storeelement:String(expr_FC:String[], and:int(ldc:int(17026), ldc:int(2)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, and:int(ldc:int(67), ldc:int(-68)), xor:int(ldc:int(12418), ldc:int(12420))))
        storeelement:String(expr_FC:String[], and:int(ldc:int(2723), ldc:int(1025)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(773), ldc:int(771)), xor:int(ldc:int(18), ldc:int(24))))
        storeelement:String(expr_FC:String[], and:int(ldc:int(21442), ldc:int(-29635)), invokevirtual:String[expected:String](String::substring, var_3_EA:String, xor:int(ldc:int(1028), ldc:int(1038)), and:int(ldc:int(1105), ldc:int(8217))))
        putstatic:String[](\u5f50\ubefe\ud158\u8258\u7d52::\u9255\u3bc9\u416d\u4179\u3d64\ubb2b, expr_FC:String[])
    }
    
    public void \u0800\u8753\u7006\ua068\u93a2\u16f6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BF : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6CA : int
        
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
        var_3_6BF = and:int(ldc:int(407901625), ldc:int(-237611024))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5f50\ubefe\ud158\u8258\u7d52[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1783260709))
            var_5_81 = and:int(ldc:int(3910), ldc:int(-3911))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3295), ldc:int(-3296)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6BF:int, ldc:int(-49015088))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(8752), ldc:int(8753)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(129), ldc:int(128)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6BF = and:int(var_3_DA:int, ldc:int(1385838514))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(3456), ldc:int(3457)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(513510778))
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-834012417))
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(348400489))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0880)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1129952548))
                        goto(Label_0725)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(435378424))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0585)
                            }
                            
                            goto(Label_0880)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1608)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1439574906))
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-598227806))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(772154174))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0880)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1649585898))
                        goto(Label_0725)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1020614309))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1850469379))
                            var_11_EB = and:int(ldc:int(-10915), ldc:int(10914))
                            goto(Label_1597)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0585:
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-683276164))
                        goto(Label_1608)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1361389956))
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-391472943))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-797075333))
                        goto(Label_0880)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1584270314))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-275254490))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1202480161))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0880)
                        }
                    }
                    
                    Label_0725:
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1467731172))
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1344994710))
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-789109102))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(438709201))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1452747014))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(773490269))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1612423144))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1105259364))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0880:
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1608)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1984929095))
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1823929923))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(1785304612))
                            goto(Label_0725)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-2053972493))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1846036234))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(12322), ldc:int(12323))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_1004:
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1451)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1777173360))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1325563641))
                            goto(Label_0880)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0725)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(1600094001))
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-342713716))
                            loopcontinue()
                        }
                        
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1362990515))
                        var_11_EB = and:int(ldc:int(9636), ldc:int(-11701))
                    }
                    
                    Label_1164:
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(1690462073))
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(34243731))
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1592568948))
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-725149126))
                            goto(Label_0880)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(1625308050))
                            goto(Label_0725)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1109968968))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1451)
                            }
                        }
                    }
                    
                    Label_1298:
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-723187047))
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(137486034))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1937660723))
                            goto(Label_1164)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1528714430))
                            goto(Label_0880)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0725)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(1195641201))
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-497266302))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1768262983))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1597)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1451:
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-423185667))
                        goto(Label_1608)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-697103512))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(600160378))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0880)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-572481999))
                        goto(Label_0725)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1492197533))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(512)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6BF = and:int(var_3_6BF:int, ldc:int(-682575466))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1597:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CA = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1608:
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-407006727))
                        goto(Label_1451)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BF:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1476372014))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0880)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-171129947))
                        goto(Label_0725)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-761391564))
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BF = and:int(var_3_6BF:int, ldc:int(-214311728))
                        var_17_6CA = add:int(var_16_119:int, and:int(ldc:int(353), ldc:int(20511)))
                        looporswitchbreak()
                    }
                    
                    var_3_6BF = and:int(var_3_6BF:int, ldc:int(22169382))
                }
                
                var_3_6BF = and:int(var_3_6BF:int, ldc:int(-1302841353))
                
                if (cmple:boolean(var_5_81 = var_17_6CA:int, sub:int(var_6_88:int, and:int(ldc:int(2309), ldc:int(107))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6BF:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_6BF = and:int(var_3_6BF:int, ldc:int(-269917427))
            goto(Label_0108)
        }
    }
}
