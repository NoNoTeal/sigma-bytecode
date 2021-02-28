public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc9f6\uc238\u51b2\uf94d\u99f7\uff55 {
    private static \u3d64\u7af6\uae87\uc238\u7d52.\u8308\u3a62\u8753\ud523\u16f6\uc2e8 \u92ee\u2dcc\u7e3f\u64f2\u647c\u385b(java.lang.String p0, com.google.gson.JsonElement p1) {
        var_4_7B : JsonObject
        var_5_C8 : String
        var_6_F8 : String
        
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
        
        if (logicalnot:boolean(invokevirtual:boolean(JsonElement::isJsonPrimitive, p1:JsonElement))) {
            var_4_7B = invokestatic:JsonObject(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u51fa\u9af2\u718f\u3bc9\ud217\ub18d, p1:JsonElement, loadelement:String(getstatic:String[](\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\u51fa\u40a9\u3dd3\u88c5\u3bc9\uc229), and:int(ldc:int(22540), ldc:int(-22557))))
            var_5_C8 = ternaryop:String(invokevirtual:boolean(JsonObject::has, var_4_7B:JsonObject, loadelement:String(getstatic:String[](\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\u51fa\u40a9\u3dd3\u88c5\u3bc9\uc229), xor:int(ldc:int(8289), ldc:int(8288)))), invokestatic:String(\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\ua61f\ud12e\u9af2\u4f52\u4d85\u98a4, invokevirtual:JsonElement(JsonObject::get, var_4_7B:JsonObject, loadelement:String(getstatic:String[](\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\u51fa\u40a9\u3dd3\u88c5\u3bc9\uc229), xor:int(ldc:int(768), ldc:int(769))))), aconstnull:String())
            var_6_F8 = ternaryop:String(invokevirtual:boolean(JsonObject::has, var_4_7B:JsonObject, loadelement:String(getstatic:String[](\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\u51fa\u40a9\u3dd3\u88c5\u3bc9\uc229), and:int(ldc:int(17954), ldc:int(10242)))), invokestatic:String(\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\ua61f\ud12e\u9af2\u4f52\u4d85\u98a4, invokevirtual:JsonElement(JsonObject::get, var_4_7B:JsonObject, loadelement:String(getstatic:String[](\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\u51fa\u40a9\u3dd3\u88c5\u3bc9\uc229), and:int(ldc:int(6), ldc:int(4387))))), aconstnull:String())
            return:\u8308\u3a62\u8753\ud523\u16f6\uc2e8(ternaryop:\u8308\u3a62\u8753\ud523\u16f6\uc2e8(logicaland:boolean(cmpne:boolean(var_5_C8:String, aconstnull:String()), invokevirtual:boolean(String::equals, var_5_C8:String, var_6_F8:String[expected:Object])), initobject:\u64f2\u8d90\u3e2a\u62da\u7873\ubded[expected:\u8308\u3a62\u8753\ud523\u16f6\uc2e8](\u64f2\u8d90\u3e2a\u62da\u7873\ubded::<init>, p0:String, var_5_C8:String), initobject:\u4975\u3e2a\uc4d2\u8cae\u34df\ub7dc(\u4975\u3e2a\uc4d2\u8cae\u34df\ub7dc::<init>, p0:String, var_5_C8:String, var_6_F8:String)))
        }
        
        return:\u8308\u3a62\u8753\ud523\u16f6\uc2e8(initobject:\u64f2\u8d90\u3e2a\u62da\u7873\ubded[expected:\u8308\u3a62\u8753\ud523\u16f6\uc2e8](\u64f2\u8d90\u3e2a\u62da\u7873\ubded::<init>, p0:String, invokevirtual:String(JsonElement::getAsString, p1:JsonElement)))
    }
    
    private static java.lang.String \ua61f\ud12e\u9af2\u4f52\u4d85\u98a4(com.google.gson.JsonElement p0) {
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
            return:String(ternaryop:String(invokevirtual:boolean(JsonElement::isJsonNull, p0:JsonElement), aconstnull:String(), invokevirtual:String(JsonElement::getAsString, p0:JsonElement)))
        }
        
        goto(Label_0006)
    }
    
    private void \uc9f6\uc238\u51b2\uf94d\u99f7\uff55(java.util.List<\u3d64\u7af6\uae87\uc238\u7d52.\u8308\u3a62\u8753\ud523\u16f6\uc2e8> p0) {
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
            invokespecial:Object(Object::<init>, this:\uc9f6\uc238\u51b2\uf94d\u99f7\uff55)
            putfield:List<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>(\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\u52d3\u8c8a\u527a\u0800\ud158\u7049, this:\uc9f6\uc238\u51b2\uf94d\u99f7\uff55, invokestatic:ImmutableList[expected:List<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>](ImmutableList::copyOf, p0:List<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>[expected:Collection]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3d4b\uc31c\u9937\u7c6b\u183a\u7043(\u6b0d\u12cb\u156b\u4179\u8bb0.\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<?, S> p0, S extends \u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c<?, S> p1) {
        var_3_5F : int
        var_5_69 : Iterator<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>
        var_3_76 : int
        
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
        var_3_5F = and:int(ldc:int(238891734), ldc:int(-904435883))
        var_5_69 = invokeinterface:Iterator<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>(List<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>::iterator, getfield:List<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>(\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\u52d3\u8c8a\u527a\u0800\ud158\u7049, this:\uc9f6\uc238\u51b2\uf94d\u99f7\uff55))
        
        loop {
            if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(32)), ldc:int(0))) {
                var_3_76 = and:int(var_3_5F:int, ldc:int(1041000735))
            }
            else {
                var_3_76 = and:int(var_3_5F:int, ldc:int(236138711))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_69:Iterator<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>)) {
                    if (invokevirtual:boolean(\u8308\u3a62\u8753\ud523\u16f6\uc2e8::\u8c8a\u72f1\uc3e3\u385b\u5d20\u5db4, checkcast:\u8308\u3a62\u8753\ud523\u16f6\uc2e8(\u3d64\u7af6\uae87\uc238\u7d52.\u8308\u3a62\u8753\ud523\u16f6\uc2e8.class, invokeinterface:\u8308\u3a62\u8753\ud523\u16f6\uc2e8(Iterator<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>::next, var_5_69:Iterator<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>)), p0:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<?, S>, p1:S extends \uc31c\u74b1\u8389\u494c\u88c5\u446c<?, S>)) {
                        var_3_5F = and:int(var_3_76:int, ldc:int(-1015994444))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(12572), ldc:int(-13599)))
                }
            }
            
            if (cmpne:boolean(and:int(var_3_76:int, ldc:int(8192)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(1363), ldc:int(2561)))
            }
            
            var_3_5F = and:int(var_3_76:int, ldc:int(-1861248444))
        }
    }
    
    public boolean \u1187\u927d\u69d9\u3bd6\u3e2a\u839e(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
            return:boolean(invokevirtual:boolean(\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\u3d4b\uc31c\u9937\u7c6b\u183a\u7043, this:\uc9f6\uc238\u51b2\uf94d\u99f7\uff55, invokevirtual:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u51b2\u72f1\ubcb0\uc87f\u2dcc\u92ee, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])), p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u1187\u927d\u69d9\u3bd6\u3e2a\u839e(\u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 p0) {
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
            return:boolean(invokevirtual:boolean(\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\u3d4b\uc31c\u9937\u7c6b\u183a\u7043, this:\uc9f6\uc238\u51b2\uf94d\u99f7\uff55, invokevirtual:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f, \uf995\u8709\ua61f\ub32d\ubff1\u99f7>(\u8cae\ucb79\ud7e8\ub8be\u156b\u960f::\u624e\u8cae\uf995\u120d\uc238\u760c, invokevirtual:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u156b\ubb2b\u4492\u647c\ud217\uc4d2, p0:\uf995\u8709\ua61f\ub32d\ubff1\u99f7)), p0:\uf995\u8709\ua61f\ub32d\ubff1\u99f7))
        }
        
        goto(Label_0006)
    }
    
    public void \ub171\u62da\ucfaf\u416d\u6d99\u5d20(\u6b0d\u12cb\u156b\u4179\u8bb0.\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<?, ?> p0, java.util.function.Consumer<java.lang.String> p1) {
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
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\uc9f6\uc238\u51b2\uf94d\u99f7\uff55 \u965f\ufe34\u718f\u8308\u59ec\u392e(com.google.gson.JsonElement p0) {
        var_1_5F : int
        var_3_8E : JsonObject
        var_4_92 : ArrayList
        var_5_9D : Iterator
        var_6_CB : Entry<String, V>
        
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
        var_1_5F = and:int(ldc:int(-401080153), ldc:int(-326847569))
        
        if (logicaland:boolean(cmpne:boolean(p0:JsonElement, aconstnull:JsonElement()), logicalnot:boolean(invokevirtual:boolean(JsonElement::isJsonNull, p0:JsonElement)))) {
            var_3_8E = invokestatic:JsonObject(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\u51fa\u9af2\u718f\u3bc9\ud217\ub18d, p0:JsonElement, loadelement:String(getstatic:String[](\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\u51fa\u40a9\u3dd3\u88c5\u3bc9\uc229), and:int(ldc:int(17571), ldc:int(2375))))
            var_4_92 = invokestatic:ArrayList(Lists::newArrayList)
            var_5_9D = invokeinterface:Iterator(Set::iterator, invokevirtual:Set(JsonObject::entrySet, var_3_8E:JsonObject))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1852749791))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_9D:Iterator))) {
                    looporswitchbreak()
                }
                
                var_6_CB = checkcast:Entry<String, V>(java.util.Map.Entry<java.lang.String, V>.class, invokeinterface:Entry<String, V>(Iterator<Entry<String, V>>::next, var_5_9D:Iterator<Entry<String, V>>))
                invokeinterface:boolean(List<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>::add, var_4_92:ArrayList<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>[expected:List<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>], invokestatic:\u8308\u3a62\u8753\ud523\u16f6\uc2e8(\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\u92ee\u2dcc\u7e3f\u64f2\u647c\u385b, checkcast:String(java.lang.String.class, invokeinterface:String(Entry<String, V>::getKey, var_6_CB:Entry<String, V>)), checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:V(Entry<K, V>::getValue, var_6_CB:Entry<String, V>))))
            }
            
            return:\uc9f6\uc238\u51b2\uf94d\u99f7\uff55(initobject:\uc9f6\uc238\u51b2\uf94d\u99f7\uff55(\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::<init>, var_4_92:ArrayList<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>))
        }
        
        return:\uc9f6\uc238\u51b2\uf94d\u99f7\uff55(getstatic:\uc9f6\uc238\u51b2\uf94d\u99f7\uff55(\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\u183a\u8640\uc238\u6cfe\u5db4\ub1b9))
    }
    
    public com.google.gson.JsonElement \u516c\ucef1\u5f50\ud51e\u7bad\u8258() {
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
    
    private static void lambda$\u51b2\u965f\u3776\u718f\ub102\u494c$1(com.google.gson.JsonObject p0, \u3d64\u7af6\uae87\uc238\u7d52.\u8308\u3a62\u8753\ud523\u16f6\uc2e8 p1) {
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
            invokevirtual:void(JsonObject::add, p0:JsonObject, invokevirtual:String(\u8308\u3a62\u8753\ud523\u16f6\uc2e8::\u8258\ud217\u7049\u7d52\u156b\u5654, p1:\u8308\u3a62\u8753\ud523\u16f6\uc2e8), invokevirtual:JsonElement(\u8308\u3a62\u8753\ud523\u16f6\uc2e8::\u4c04\u6435\u16f6\u97e6\u4cd9\u3711, p1:\u8308\u3a62\u8753\ud523\u16f6\uc2e8))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u2dcc\u3c25\ud51e\uc87f\ud523\u927d$0(\u6b0d\u12cb\u156b\u4179\u8bb0.\ubcb0\ud4fe\uff55\u965f\u5f50\u9937 p0, java.util.function.Consumer p1, \u3d64\u7af6\uae87\uc238\u7d52.\u8308\u3a62\u8753\ud523\u16f6\uc2e8 p2) {
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
            invokevirtual:void(\u8308\u3a62\u8753\ud523\u16f6\uc2e8::\u7c6b\u4c04\u3c25\u8aa5\ubff1\ucfaf, p2:\u8308\u3a62\u8753\ud523\u16f6\uc2e8, p0:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<?, ?>, p1:Consumer<String>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc9f6\uc238\u51b2\uf94d\u99f7\uff55(java.util.List p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u4d85\ubefe\u88c5\uc31c\u3dd3\u74b1 p1) {
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
            invokespecial:\uc9f6\uc238\u51b2\uf94d\u99f7\uff55(\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::<init>, this:\uc9f6\uc238\u51b2\uf94d\u99f7\uff55, p0:List<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_1FE : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_10C_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_145_0 : byte[] [generated]
        stack_222_0 : byte[] [generated]
        stack_270_0 : byte[] [generated]
        stack_307_0 : byte[] [generated]
        stack_35B_0 : byte[] [generated]
        var_4_1E9 : int
        var_3_1EE : byte[]
        var_5_1EF : int
        var_0_28A : int
        expr_270 : byte [generated]
        stack_2B9_2 : byte [generated]
        stack_28D_0 : byte [generated]
        expr_307 : byte [generated]
        expr_A7 : int [generated]
        expr_D5 : int [generated]
        var_2_10C : byte[]
        expr_110 : int [generated]
        var_3_349 : byte[]
        var_5_34A : int
        var_3_151 : String
        stack_1D5_0 : String[] [generated]
        expr_163 : String[] [generated]
        
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
        var_0_1FE = and:int(ldc:int(-659702518), ldc:int(-72372357))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D3_0 = stack_D5_0 = stack_10C_0 = stack_10E_0 = stack_145_0 = stack_222_0 = stack_270_0 = stack_307_0 = stack_35B_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("x+2hxb3Ly6u1x92htdO7Y5S6oJa4+A==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1E9 = expr_6E:int
        var_3_1EE = newarray:byte[](byte.class, expr_6E:int)
        var_5_1EF = expr_6E:int
        Label_0497:
        
        while (cmpne:boolean(and:int(var_0_1FE:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(2)), ldc:int(0))) {
                var_0_1FE = and:int(var_0_1FE:int, ldc:int(-1718603276))
                goto(Label_0593)
            }
            
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-188879570))
            var_5_1EF = add:int(var_5_1EF:int, ldc:int(-1))
            storeelement:byte(var_3_1EE:byte[], var_5_1EF:int, add:byte(loadelement:byte(stack_222_0:byte[], var_5_1EF:int), ldc:byte(61)))
            
            if (cmpne:boolean(var_5_1EF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D3_0 = stack_D5_0 = stack_10C_0 = stack_10E_0 = stack_145_0 = stack_222_0 = stack_270_0 = stack_307_0 = stack_35B_0 = var_3_1EE:byte[]
            goto(Label_0115)
        }
        
        var_0_1FE = and:int(var_0_1FE:int, ldc:int(-1812339016))
        goto(Label_0735)
        Label_0593:
        
        while (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0497)
            }
            
            var_0_28A = and:int(var_0_1FE:int, ldc:int(-252858609))
            var_5_1EF = add:int(var_5_1EF:int, ldc:int(-1))
            expr_270 = stack_2B9_2 = loadelement(stack_270_0, var_5_1EF)
            
            if (cmplt:boolean(add:int(add:int(var_5_1EF:int, ldc:int(6)), neg:int(var_4_1E9:int)), ldc:int(0))) {
                stack_2B9_2 = stack_28D_0 = add:byte(expr_270:byte, loadelement:byte(var_3_1EE:byte[], add:int(var_5_1EF:int, ldc:int(6))))
                goto(Label_0669)
            }
            
            Label_0637:
            
            if (cmpne:boolean(and:int(var_0_28A:int, ldc:int(2048)), ldc:int(0))) {
                var_0_28A = and:int(var_0_28A:int, ldc:int(-608256241))
                stack_2B9_2 = stack_28D_0 = add:byte(expr_270:byte, ldc:byte(6))
            }
            
            Label_0669:
            
            if (cmpne:boolean(and:int(var_0_28A:int, ldc:int(512)), ldc:int(0))) {
                var_0_28A = and:int(var_0_28A:int, ldc:int(599355509))
                goto(Label_0637)
            }
            
            var_0_1FE = and:int(var_0_28A:int, ldc:int(-726864005))
            storeelement:byte(var_3_1EE:byte[], var_5_1EF:int, stack_2B9_2:byte)
            
            if (cmpne:boolean(var_5_1EF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D3_0 = stack_D5_0 = stack_10C_0 = stack_10E_0 = stack_145_0 = stack_222_0 = stack_270_0 = stack_307_0 = stack_35B_0 = var_3_1EE:byte[]
            goto(Label_0172)
        }
        
        Label_0735:
        
        while (cmpne:boolean(and:int(var_0_1FE:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0497)
            }
            
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-240124509))
            var_5_1EF = add:int(var_5_1EF:int, ldc:int(-1))
            expr_307 = loadelement:byte(stack_307_0:byte[], var_5_1EF:int)
            storeelement:byte(var_3_1EE:byte[], var_5_1EF:int, xor:int(or:int(and:int(shl:int(expr_307:byte, and:int(ldc:int(10246), ldc:int(18013))), ldc:int(-16)), and:int(shr:int(expr_307:byte[expected:int], xor:int(ldc:int(8707), ldc:int(8711))), ldc:int(15))), ldc:int(19)))
            
            if (cmpne:boolean(var_5_1EF:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D3_0 = stack_D5_0 = stack_10C_0 = stack_10E_0 = stack_145_0 = stack_222_0 = stack_270_0 = stack_307_0 = stack_35B_0 = var_3_1EE:byte[]
            goto(Label_0218)
        }
        
        var_0_1FE = and:int(var_0_1FE:int, ldc:int(812316520))
        goto(Label_0593)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0277)
        }
        
        if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(262144)), ldc:int(0))) {
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-1523292583))
            goto(Label_0218)
        }
        
        if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(262144)), ldc:int(0))) {
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(756477301))
        }
        else {
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-255983657))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_1E9 = expr_A7:int
                var_3_1EE = newarray:byte[](byte.class, expr_A7:int)
                var_5_1EF = expr_A7:int
                goto(Label_0593)
            }
        }
        
        Label_0172:
        
        if (cmpne:boolean(and:int(var_0_1FE:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0277)
        }
        
        if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(32)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1FE:int, ldc:int(128)), ldc:int(0))) {
                var_0_1FE = and:int(var_0_1FE:int, ldc:int(1002125954))
                goto(Label_0115)
            }
            
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-692133902))
            expr_D5 = arraylength:int(stack_D5_0:byte[])
            
            if (cmpne:boolean(expr_D5:int, ldc:int(0))) {
                var_4_1E9 = expr_D5:int
                var_3_1EE = newarray:byte[](byte.class, expr_D5:int)
                var_5_1EF = expr_D5:int
                goto(Label_0735)
            }
        }
        
        Label_0218:
        
        if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(1024)), ldc:int(0))) {
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-598880907))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(32768)), ldc:int(0))) {
                var_0_1FE = and:int(var_0_1FE:int, ldc:int(192225582))
                goto(Label_0115)
            }
            
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-172110017))
            var_2_10C = stack_10C_0:byte[]
            expr_110 = add:int(arraylength:int(stack_10E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_110:int, ldc:int(0))) {
                var_3_349 = newarray:byte[](byte.class, expr_110:int)
                var_5_34A = expr_110:int
                
                loop {
                    var_0_1FE = and:int(var_0_1FE:int, ldc:int(-608182841))
                    var_5_34A = add:int(var_5_34A:int, ldc:int(-1))
                    storeelement:byte(var_3_349:byte[], var_5_34A:int, add:int(shl:int(loadelement:byte(stack_35B_0:byte[], var_5_34A:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_10C:byte[], add:int(var_5_34A:int, xor:int(ldc:int(16515), ldc:int(16514)))), ldc:int(5)), xor:int(ldc:int(672), ldc:int(679)))))
                    
                    if (cmpne:boolean(var_5_34A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D3_0 = stack_D5_0 = stack_10C_0 = stack_10E_0 = stack_145_0 = stack_222_0 = stack_270_0 = stack_307_0 = stack_35B_0 = var_3_349:byte[]
            }
        }
        
        Label_0277:
        
        if (cmpne:boolean(and:int(var_0_1FE:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_0218)
        }
        
        if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(32768)), ldc:int(0))) {
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(-423259741))
            goto(Label_0172)
        }
        
        if (cmpeq:boolean(and:int(var_0_1FE:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_1FE = and:int(var_0_1FE:int, ldc:int(1157055678))
            goto(Label_0115)
        }
        
        var_3_151 = initobject:String(String::<init>, stack_145_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1D5_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(517), ldc:int(4132)))
        expr_163 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(521), ldc:int(525)))
        storeelement:String(expr_163:String[], xor:int(ldc:int(20), ldc:int(22)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(20402), ldc:int(-28660)), and:int(ldc:int(16471), ldc:int(2315))))
        storeelement:String(expr_163:String[], and:int(ldc:int(16685), ldc:int(131)), invokevirtual:String[expected:String](String::substring, var_3_151:String, and:int(ldc:int(4179), ldc:int(18691)), and:int(ldc:int(6342), ldc:int(8471))))
        storeelement:String(expr_163:String[], xor:int(ldc:int(4420), ldc:int(4423)), invokevirtual:String[expected:String](String::substring, var_3_151:String, xor:int(ldc:int(-32639), ldc:int(-32633)), xor:int(ldc:int(1205), ldc:int(1189))))
        storeelement:String(expr_163:String[], and:int(ldc:int(-5755), ldc:int(5754)), invokevirtual:String[expected:String](String::substring, var_3_151:String, xor:int(ldc:int(359), ldc:int(375)), xor:int(ldc:int(6168), ldc:int(6157))))
        putstatic:String[](\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\u51fa\u40a9\u3dd3\u88c5\u3bc9\uc229, expr_163:String[])
        putstatic:\uc9f6\uc238\u51b2\uf94d\u99f7\uff55(\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::\u183a\u8640\uc238\u6cfe\u5db4\ub1b9, initobject:\uc9f6\uc238\u51b2\uf94d\u99f7\uff55(\uc9f6\uc238\u51b2\uf94d\u99f7\uff55::<init>, invokestatic:ImmutableList[expected:List<\u8308\u3a62\u8753\ud523\u16f6\uc2e8>](ImmutableList::of)))
    }
    
    public void \u3bc9\ud12e\u8cae\u516c\uf94d\u0c95(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_694 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_69F : int
        
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
        var_3_694 = and:int(ldc:int(958912414), ldc:int(-223021227))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc9f6\uc238\u51b2\uf94d\u99f7\uff55[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
            var_3_694 = and:int(var_3_694:int, ldc:int(-1446630657))
        }
        else {
            var_3_694 = and:int(var_3_694:int, ldc:int(-1289232594))
            var_5_8A = and:int(ldc:int(-23425), ldc:int(23296))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-2620), ldc:int(2619)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_694:int, ldc:int(1060437771))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(9345), ldc:int(529)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(13443), ldc:int(16421)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_694 = and:int(var_3_E3:int, ldc:int(-192952470))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(-12280), ldc:int(-12279)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-598611118))
                        goto(Label_1572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(69775323))
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(834139919))
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(407931788))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1778455487))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1219773286))
                    }
                    else {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-97005576))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0897)
                        }
                    }
                    
                    Label_0438:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1647413661))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-667535835))
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1671513488))
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(826055236))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-58177654))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-231944212))
                            var_11_F4 = and:int(ldc:int(-15084), ldc:int(14945))
                            goto(Label_1561)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0613:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1080804510))
                        goto(Label_1572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(585997013))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1792687439))
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(2006114106))
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1835967784))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(1899491139))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0897)
                        }
                    }
                    
                    Label_0747:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(693816399))
                        goto(Label_1572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(239543135))
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1373487492))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1991665815))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1201368439))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-60713811))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1125329011))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0897:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1470263887))
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1822510733))
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1184436449))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(8194), ldc:int(8195))
                                goto(Label_1151)
                            }
                        }
                    }
                    
                    Label_1003:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1179888937))
                        goto(Label_1572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(32)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-373995747))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(32)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1518432463))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1263679572))
                        var_11_F4 = and:int(ldc:int(13094), ldc:int(-15143))
                    }
                    
                    Label_1151:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1244210208))
                        goto(Label_1572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(838646338))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-382142838))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1003)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(32)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-606290137))
                            goto(Label_0897)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1558525663))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1067525178))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(2108610467))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1293:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1548672590))
                            goto(Label_1151)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-309719992))
                            goto(Label_1003)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0897)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1456045574))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(997117801))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1561)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1416:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(2111812080))
                        goto(Label_1572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1176640732))
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1486746696))
                        goto(Label_1003)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1044985981))
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-2006652129))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_694 = and:int(var_3_694:int, ldc:int(2061827927))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1561:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69F = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1572:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-410542474))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1293)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1151)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0897)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(253479367))
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-2036306704))
                        goto(Label_0438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(942462933))
                        var_17_69F = add:int(var_16_122:int, and:int(ldc:int(10469), ldc:int(17417)))
                        looporswitchbreak()
                    }
                    
                    var_3_694 = and:int(var_3_694:int, ldc:int(-1572297132))
                }
                
                var_3_694 = and:int(var_3_694:int, ldc:int(896460584))
                
                if (cmple:boolean(var_5_8A = var_17_69F:int, sub:int(var_6_91:int, xor:int(ldc:int(3840), ldc:int(3841))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(32768)), ldc:int(0))) {
            var_3_694 = and:int(var_3_694:int, ldc:int(-475874345))
            goto(Label_0108)
        }
    }
}
