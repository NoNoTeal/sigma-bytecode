public class \u59ec\u8413\u97e6\uc229\u3776.\ubcb0\u960f\u983f\u72f1\ud12e\u839e {
    public void \ubcb0\u960f\u983f\u72f1\ud12e\u839e(int p0, com.mojang.datafixers.schemas.Schema p1) {
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
            invokespecial:Schema(Schema::<init>, this:\ubcb0\u960f\u983f\u72f1\ud12e\u839e, p0:int, p1:Schema)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static com.mojang.datafixers.types.templates.TypeTemplate \u2dcc\u0c95\u3e75\ub1b9\u836c\u6ec6(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), and:int(ldc:int(-2472), ldc:int(2469))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)), loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), and:int(ldc:int(4097), ldc:int(25027))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema))))
        }
        
        goto(Label_0006)
    }
    
    public static void \ub70c\ube23\u6cfe\u51fa\u4975\uceb8(com.mojang.datafixers.schemas.Schema p0, java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> p1, java.lang.String p2) {
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
    
    public java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> registerEntities(com.mojang.datafixers.schemas.Schema p0) {
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
    
    public void registerTypes(com.mojang.datafixers.schemas.Schema p0, java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> p1, java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> p2) {
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
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u624e\u4f4a\u527a\u385b\u183a\u51b2$4(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), and:int(ldc:int(3774), ldc:int(16422))), invokestatic:TypeTemplate(DSL::list, invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), and:int(ldc:int(15399), ldc:int(16695))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u8640\u8df4\u7330\u8350\u6c56\ucfaf), p0:Schema))), loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), xor:int(ldc:int(16905), ldc:int(16929))), invokestatic:TypeTemplate(DSL::list, invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), and:int(ldc:int(1207), ldc:int(4655))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u72f1\u5fe1\u8640\u99f7\uc4d2\uc2bd), p0:Schema))), loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), and:int(ldc:int(2169), ldc:int(553))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\ub102\u120d\u7d52\u7006\uc2bd\u8d90), p0:Schema))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u69d9\uafe7\u3d64\uc910\ua068\ud217$3(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), and:int(ldc:int(1070), ldc:int(250))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)), loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), and:int(ldc:int(43), ldc:int(16943))), invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), xor:int(ldc:int(2439), ldc:int(2475))), invokestatic:TypeTemplate(DSL::list, invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), and:int(ldc:int(687), ldc:int(16509))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema), loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), and:int(ldc:int(4270), ldc:int(16687))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema), loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), xor:int(ldc:int(13), ldc:int(34))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)))), invokestatic:TypeTemplate(\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\u2dcc\u0c95\u3e75\ub1b9\u836c\u6ec6, p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u61a4\u6bb9\uae5d\ud523\u8cae\ubcb0$2(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), xor:int(ldc:int(2152), ldc:int(2136))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)), loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), and:int(ldc:int(1073), ldc:int(9009))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema), loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), and:int(ldc:int(1202), ldc:int(13106))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema), invokestatic:TypeTemplate(\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\u2dcc\u0c95\u3e75\ub1b9\u836c\u6ec6, p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u416d\u92ee\u392e\ub32d\ud217\u4f52$1(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b), xor:int(ldc:int(12555), ldc:int(12600))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema), invokestatic:TypeTemplate(\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\u2dcc\u0c95\u3e75\ub1b9\u836c\u6ec6, p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u2dcc\uf9c5\u8d90\uc229\u3dd3\ud158$0(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\u2dcc\u0c95\u3e75\ub1b9\u836c\u6ec6, p0:Schema))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_71A : int
        expr_65 : byte[] [generated]
        var_2_69 : byte[]
        stack_96_0 : byte[] [generated]
        stack_98_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_10E_0 : byte[] [generated]
        stack_72C_0 : byte[] [generated]
        stack_78B_0 : byte[] [generated]
        stack_809_0 : byte[] [generated]
        expr_6D : int [generated]
        var_3_6B7 : byte[]
        var_4_6B8 : int
        expr_98 : int [generated]
        var_5_707 : int
        var_3_70C : byte[]
        var_4_70D : int
        expr_72F : byte [generated]
        var_0_781 : int
        expr_78B : byte [generated]
        stack_7D4_2 : byte [generated]
        stack_7B1_0 : byte [generated]
        expr_C3 : int [generated]
        expr_EE : int [generated]
        var_3_7F7 : byte[]
        var_4_7F8 : int
        var_3_11A : String
        stack_6AE_0 : String[] [generated]
        expr_12C : String[] [generated]
        
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
            var_0_71A = and:int(ldc:int(-112135042), ldc:int(-739527490))
            expr_65 = var_2_69 = stack_96_0 = stack_98_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_10E_0 = stack_72C_0 = stack_78B_0 = stack_809_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("BMvO2uTE3V3cXWDL0d3WbM/UU1lnzMja5M/UU1lnzMjZ3eTP1FNcZMbWWlXty13gStBnze5KXdX2yNfU1mRazNBQ2FBaZ0je5dPM32LOY1jKVNZj3lXSUN1ZYMpU1mfTVllgylTWZ9bfXMzoydrXWl1hw1zUS+TI09zTXElWWdteV1RcSllWX+jGWlJvzMjZ2eLA3dBZ39NZXOfMyNnYYsJf0+jGW1FQ6U3a197U3dnnSNjhxN1eZNbn18lb0l7oxlBwxlNyvdrRX1Z1xNTZX13rvdnZWs3k7kPU2NjS78zI2erG1N9jYsZZ1VhWZGLGWdVYVmTjydTY1WVqQ9fd1mNLX9rXaUBRWNVn1VpoxltRVffE0NnjRlpuyNfU1mRmS1NX0+vD1NrSVd5i48PU2tJV3mJZTljQ3+xHXdJdbEdbVtZk5src2uFGWFLyvdrRX1Zf29NQ2N3TWtjLWthcxdxc2ddVXNBZ2tda11Xn01Pe3M9Y1WTczeRJXN6Q"))
            expr_6D = add:int(arraylength:int(expr_65:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_6D:int, ldc:int(0))) {
                var_3_6B7 = newarray:byte[](byte.class, expr_6D:int)
                var_4_6B8 = expr_6D:int
                
                loop {
                    var_0_71A = and:int(var_0_71A:int, ldc:int(-213648209))
                    var_4_6B8 = add:int(var_4_6B8:int, ldc:int(-1))
                    storeelement:byte(var_3_6B7:byte[], var_4_6B8:int, add:int(shl:int(loadelement:byte(expr_65:byte[], var_4_6B8:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_69:byte[], add:int(var_4_6B8:int, xor:int(ldc:int(516), ldc:int(517)))), ldc:int(3)), and:int(ldc:int(16415), ldc:int(2079)))))
                    
                    if (cmpne:boolean(var_4_6B8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_10E_0 = stack_72C_0 = stack_78B_0 = stack_809_0 = var_3_6B7:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_71A:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0243)
                }
                
                if (cmpne:boolean(and:int(var_0_71A:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0200)
                }
                
                if (cmpeq:boolean(and:int(var_0_71A:int, ldc:int(4096)), ldc:int(0))) {
                    var_0_71A = and:int(var_0_71A:int, ldc:int(1534402780))
                    goto(Label_0157)
                }
                
                var_0_71A = and:int(var_0_71A:int, ldc:int(-605882394))
                expr_98 = arraylength:int(stack_98_0:byte[])
                
                if (cmpeq:boolean(expr_98:int, ldc:int(0))) {
                    goto(Label_0157)
                }
                
                var_5_707 = expr_98:int
                var_3_70C = newarray:byte[](byte.class, expr_98:int)
                var_4_70D = expr_98:int
                Label_1807:
                
                while (cmpne:boolean(and:int(var_0_71A:int, ldc:int(268435456)), ldc:int(0))) {
                    var_0_71A = and:int(var_0_71A:int, ldc:int(-749341073))
                    var_4_70D = add:int(var_4_70D:int, ldc:int(-1))
                    expr_72F = add:byte(loadelement:byte(stack_72C_0:byte[], var_4_70D:int), ldc:byte(101))
                    storeelement:byte(var_3_70C:byte[], var_4_70D:int, or:int(and:int(shl:int(expr_72F:byte, xor:int(ldc:int(-30175), ldc:int(-30171))), ldc:int(-16)), and:int(shr:int(expr_72F:byte[expected:int], and:int(ldc:int(5191), ldc:int(9004))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_70D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_10E_0 = stack_72C_0 = stack_78B_0 = stack_809_0 = var_3_70C:byte[]
                    goto(Label_0157)
                }
                
                var_0_71A = and:int(var_0_71A:int, ldc:int(738206116))
                Label_1908:
                
                while (cmpne:boolean(and:int(var_0_71A:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_781 = and:int(var_0_71A:int, ldc:int(-638077778))
                    var_4_70D = add:int(var_4_70D:int, ldc:int(-1))
                    expr_78B = stack_7D4_2 = loadelement(stack_78B_0, var_4_70D)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_70D:int, ldc:int(1)), neg:int(var_5_707:int)), ldc:int(0))) {
                        stack_7D4_2 = stack_7B1_0 = add:byte(expr_78B:byte, loadelement:byte(var_3_70C:byte[], add:int(var_4_70D:int, ldc:int(1))))
                        goto(Label_1985)
                    }
                    
                    Label_1944:
                    
                    if (cmpeq:boolean(and:int(var_0_781:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_0_781 = and:int(var_0_781:int, ldc:int(-206221341))
                    }
                    else {
                        var_0_781 = and:int(var_0_781:int, ldc:int(-44911452))
                        stack_7D4_2 = stack_7B1_0 = add:byte(expr_78B:byte, ldc:byte(1))
                    }
                    
                    Label_1985:
                    
                    if (cmpne:boolean(and:int(var_0_781:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1944)
                    }
                    
                    var_0_71A = and:int(var_0_781:int, ldc:int(-171524753))
                    storeelement:byte(var_3_70C:byte[], var_4_70D:int, stack_7D4_2:byte)
                    
                    if (cmpne:boolean(var_4_70D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_10E_0 = stack_72C_0 = stack_78B_0 = stack_809_0 = var_3_70C:byte[]
                    goto(Label_0200)
                }
                
                goto(Label_1807)
                Label_0157:
                
                if (cmpne:boolean(and:int(var_0_71A:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0243)
                }
                
                if (cmpeq:boolean(and:int(var_0_71A:int, ldc:int(8192)), ldc:int(0))) {
                    var_0_71A = and:int(var_0_71A:int, ldc:int(-2051541947))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_71A:int, ldc:int(2097152)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_71A = and:int(var_0_71A:int, ldc:int(-247333714))
                    expr_C3 = arraylength:int(stack_C3_0:byte[])
                    
                    if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                        var_5_707 = expr_C3:int
                        var_3_70C = newarray:byte[](byte.class, expr_C3:int)
                        var_4_70D = expr_C3:int
                        goto(Label_1908)
                    }
                }
                
                Label_0200:
                
                if (cmpne:boolean(and:int(var_0_71A:int, ldc:int(512)), ldc:int(0))) {
                    var_0_71A = and:int(var_0_71A:int, ldc:int(960825940))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_71A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0157)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_71A:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_71A = and:int(var_0_71A:int, ldc:int(-738806404))
                    expr_EE = arraylength:int(stack_EE_0:byte[])
                    
                    if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                        var_3_7F7 = newarray:byte[](byte.class, expr_EE:int)
                        var_4_7F8 = expr_EE:int
                        
                        loop {
                            var_0_71A = and:int(var_0_71A:int, ldc:int(-740756050))
                            var_4_7F8 = add:int(var_4_7F8:int, ldc:int(-1))
                            storeelement:byte(var_3_7F7:byte[], var_4_7F8:int, xor:byte(loadelement:byte(stack_809_0:byte[], var_4_7F8:int), ldc:byte(24)))
                            
                            if (cmpne:boolean(var_4_7F8:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_98_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_EC_0 = stack_EE_0 = stack_10E_0 = stack_72C_0 = stack_78B_0 = stack_809_0 = var_3_7F7:byte[]
                    }
                }
                
                Label_0243:
                
                if (cmpeq:boolean(and:int(var_0_71A:int, ldc:int(8192)), ldc:int(0))) {
                    goto(Label_0200)
                }
                
                if (cmpne:boolean(and:int(var_0_71A:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0157)
                }
                
                if (cmpne:boolean(and:int(var_0_71A:int, ldc:int(1024)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_11A = initobject:String(String::<init>, stack_10E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_6AE_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1335), ldc:int(1283)))
            expr_12C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(308), ldc:int(15413)))
            storeelement:String(expr_12C:String[], and:int(ldc:int(5156), ldc:int(2660)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(-25960), ldc:int(17766)), xor:int(ldc:int(16395), ldc:int(16388))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(16913), ldc:int(16928)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(8207), ldc:int(3119)), and:int(ldc:int(16408), ldc:int(1880))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(22538), ldc:int(-22539)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(3089), ldc:int(3081)), and:int(ldc:int(12322), ldc:int(16938))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(1034), ldc:int(1032)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(8909), ldc:int(8943)), and:int(ldc:int(16493), ldc:int(1084))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(16402), ldc:int(14866)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(8749), ldc:int(108)), and:int(ldc:int(1215), ldc:int(21039))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(9036), ldc:int(9026)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(-32306), ldc:int(-32287)), xor:int(ldc:int(-32630), ldc:int(-32578))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(4780), ldc:int(25692)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(-23494), ldc:int(-23538)), xor:int(ldc:int(-26539), ldc:int(-26517))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(-32542), ldc:int(-32517)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(-31470), ldc:int(-31444)), and:int(ldc:int(4813), ldc:int(1093))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(3097), ldc:int(58)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(8413), ldc:int(21831)), xor:int(ldc:int(8317), ldc:int(8245))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(577), ldc:int(578)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(8213), ldc:int(8285)), xor:int(ldc:int(246), ldc:int(185))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(25424), ldc:int(6192)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(152), ldc:int(215)), xor:int(ldc:int(-24122), ldc:int(-24164))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(-12270), ldc:int(-12263)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(543), ldc:int(581)), and:int(ldc:int(17514), ldc:int(10866))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(-31700), ldc:int(-31688)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(5234), ldc:int(10722)), and:int(ldc:int(19055), ldc:int(4331))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(1056), ldc:int(1024)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(379), ldc:int(4843)), and:int(ldc:int(246), ldc:int(2166))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(6208), ldc:int(6217)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(-30690), ldc:int(-30616)), xor:int(ldc:int(-31578), ldc:int(-31523))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(25094), ldc:int(4302)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(6271), ldc:int(379)), xor:int(ldc:int(-32713), ldc:int(-32585))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(10549), ldc:int(5149)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(137), ldc:int(21730)), and:int(ldc:int(3722), ldc:int(8600))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(9225), ldc:int(2081)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(10247), ldc:int(10383)), and:int(ldc:int(2297), ldc:int(16533))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(-31466), ldc:int(-31428)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(409), ldc:int(147)), and:int(ldc:int(10394), ldc:int(255))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(-32693), ldc:int(-32645)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(239), ldc:int(117)), and:int(ldc:int(10911), ldc:int(21695))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(21023), ldc:int(8559)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(16543), ldc:int(5279)), xor:int(ldc:int(17415), ldc:int(17583))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(8216), ldc:int(8196)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(7592), ldc:int(248)), and:int(ldc:int(179), ldc:int(6139))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(8221), ldc:int(8246)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(20481), ldc:int(20658)), and:int(ldc:int(5373), ldc:int(2489))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(2527), ldc:int(21534)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(6841), ldc:int(16635)), xor:int(ldc:int(4786), ldc:int(4621))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(5395), ldc:int(5381)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(2239), ldc:int(21183)), and:int(ldc:int(230), ldc:int(194))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(-32383), ldc:int(-32373)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(8258), ldc:int(8320)), xor:int(ldc:int(12806), ldc:int(13005))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(2225), ldc:int(8293)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(105), ldc:int(162)), xor:int(ldc:int(17130), ldc:int(16955))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(-32639), ldc:int(-32595)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(4339), ldc:int(24797)), and:int(ldc:int(248), ldc:int(13022))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(2367), ldc:int(2317)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(16600), ldc:int(4570)), xor:int(ldc:int(21708), ldc:int(21550))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(4639), ldc:int(2327)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(17394), ldc:int(2282)), and:int(ldc:int(24823), ldc:int(4847))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(163), ldc:int(18467)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(-7988), ldc:int(-8149)), and:int(ldc:int(14319), ldc:int(254))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(563), ldc:int(534)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(8686), ldc:int(2798)), xor:int(ldc:int(1236), ldc:int(1071))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(13901), ldc:int(2061)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(2815), ldc:int(9723)), xor:int(ldc:int(16497), ldc:int(16756))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(16), ldc:int(20)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(18693), ldc:int(8469)), xor:int(ldc:int(295), ldc:int(42))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(24966), ldc:int(24974)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(-30395), ldc:int(-30648)), xor:int(ldc:int(15), ldc:int(285))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(159), ldc:int(6173)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(8337), ldc:int(8579)), and:int(ldc:int(4539), ldc:int(3421))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(15493), ldc:int(773)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(21134), ldc:int(21399)), xor:int(ldc:int(17559), ldc:int(17800))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(20531), ldc:int(20521)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(415), ldc:int(10079)), xor:int(ldc:int(-31315), ldc:int(-31607))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(17442), ldc:int(8994)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(805), ldc:int(10534)), xor:int(ldc:int(46), ldc:int(258))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(8478), ldc:int(8449)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(11628), ldc:int(4399)), xor:int(ldc:int(16526), ldc:int(16823))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(-30656), ldc:int(-30637)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(953), ldc:int(16699)), and:int(ldc:int(9023), ldc:int(18750))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(1281), ldc:int(1296)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(2494), ldc:int(1343)), xor:int(ldc:int(236), ldc:int(420))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(5179), ldc:int(19035)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(18889), ldc:int(330)), and:int(ldc:int(16718), ldc:int(4429))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(261), ldc:int(258)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(-24396), ldc:int(-24072)), xor:int(ldc:int(-27252), ldc:int(-27426))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(2181), ldc:int(2221)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(26994), ldc:int(478)), xor:int(ldc:int(2445), ldc:int(2261))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(17482), ldc:int(17511)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(1499), ldc:int(24952)), xor:int(ldc:int(-24450), ldc:int(-24283))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(2196), ldc:int(2234)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(1499), ldc:int(2431)), xor:int(ldc:int(162), ldc:int(509))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(13875), ldc:int(18487)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(351), ldc:int(17759)), xor:int(ldc:int(16722), ldc:int(16436))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(310), ldc:int(1198)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(1235), ldc:int(1461)), xor:int(ldc:int(8366), ldc:int(8640))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(4327), ldc:int(1327)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(1563), ldc:int(1909)), and:int(ldc:int(16757), ldc:int(2553))))
            storeelement:String(expr_12C:String[], xor:int(ldc:int(342), ldc:int(383)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, xor:int(ldc:int(1403), ldc:int(1034)), and:int(ldc:int(1404), ldc:int(888))))
            storeelement:String(expr_12C:String[], and:int(ldc:int(2159), ldc:int(21551)), invokevirtual:String[expected:String](String::substring, var_3_11A:String, and:int(ldc:int(888), ldc:int(28152)), and:int(ldc:int(1916), ldc:int(20990))))
            putstatic:String[](\ubcb0\u960f\u983f\u72f1\ud12e\u839e::\ud171\u6cfe\u0800\u946b\u5bc4\u4c2b, expr_12C:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uf94d\u3dd3\uc87f\u4c2b\u4bc8\u88c5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_666 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_671 : int
        
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
        var_3_666 = and:int(ldc:int(176694073), ldc:int(-18143629))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubcb0\u960f\u983f\u72f1\ud12e\u839e[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
            var_3_666 = and:int(var_3_666:int, ldc:int(1789735763))
            var_5_81 = and:int(ldc:int(16536), ldc:int(-16537))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(8911), ldc:int(-13040)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_666:int, ldc:int(-360041839))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(2339), ldc:int(25605)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(4881), ldc:int(26689)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_666 = and:int(var_3_DA:int, ldc:int(-28739641))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-32755), ldc:int(-32756)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1647670386))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-547449421))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-2123765658))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1143147560))
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-912987874))
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1479184158))
                        goto(Label_0712)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-752367171))
                        goto(Label_0599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(2116559689))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0599)
                            }
                            
                            goto(Label_0841)
                        }
                    }
                    
                    Label_0436:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(19732999))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1623897838))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1126543667))
                        goto(Label_0712)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-1628294273))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(463151715))
                        var_11_EB = and:int(ldc:int(-8090), ldc:int(6529))
                        goto(Label_1508)
                    }
                    
                    Label_0599:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1899917191))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-327527591))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(512)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-769087432))
                            goto(Label_0436)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1360254341))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0841)
                        }
                    }
                    
                    Label_0712:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1353768388))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-673429857))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-637197293))
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0436)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1340532628))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(1050275375))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0841:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(920121669))
                            goto(Label_0712)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-582831784))
                            goto(Label_0599)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(864428129))
                            goto(Label_0436)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(524555006))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(254685141))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(4105), ldc:int(25315))
                                goto(Label_1140)
                            }
                        }
                    }
                    
                    Label_0963:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1967285258))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(244332426))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(512)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(673721212))
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0712)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1368858191))
                            goto(Label_0599)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-836844877))
                            goto(Label_0436)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1072298278))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-560438497))
                        var_11_EB = and:int(ldc:int(23062), ldc:int(-23063))
                    }
                    
                    Label_1140:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1445301018))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(586811804))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0963)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0712)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0599)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-2073756352))
                            goto(Label_0436)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1890784369))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1376)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-527349570))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-562299797))
                            goto(Label_1140)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(838531149))
                            goto(Label_0963)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0712)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0599)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0436)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(466336693))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1508)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1376:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1543466868))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1620159701))
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0712)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(2044881862))
                        goto(Label_0599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1960699775))
                        loopcontinue()
                    }
                    
                    var_3_666 = and:int(var_3_666:int, ldc:int(-632756299))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_671 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(324341959))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-2014540640))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(314172568))
                        goto(Label_0712)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-2012046174))
                        goto(Label_0599)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0436)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1247412089))
                        var_17_671 = add:int(var_16_119:int, xor:int(ldc:int(10), ldc:int(11)))
                        looporswitchbreak()
                    }
                    
                    var_3_666 = and:int(var_3_666:int, ldc:int(-1686334510))
                }
                
                var_3_666 = and:int(var_3_666:int, ldc:int(-1946635433))
                
                if (cmple:boolean(var_5_81 = var_17_671:int, sub:int(var_6_88:int, and:int(ldc:int(17413), ldc:int(10761))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_666 = and:int(var_3_666:int, ldc:int(2094716352))
            goto(Label_0108)
        }
    }
}
