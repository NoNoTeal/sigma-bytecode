public class \u3d64\u7af6\uae87\uc238\u7d52.\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8 {
    public void \ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8(int p0, com.mojang.datafixers.schemas.Schema p1) {
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
            invokespecial:Schema(Schema::<init>, this:\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8, p0:int, p1:Schema)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u7e3f\u8df4\u6fb0\u6435\uf9c5\u97e6(com.mojang.datafixers.schemas.Schema p0, java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> p1, java.lang.String p2) {
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
    
    public com.mojang.datafixers.types.Type<?> getChoiceType(com.mojang.datafixers.DSL$TypeReference p0, java.lang.String p1) {
        var_3_5F : int
        stack_94_0 : Type [generated]
        
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
            var_3_5F = and:int(ldc:int(1344356898), ldc:int(1562467904))
            
            if (logicalnot:boolean(invokestatic:boolean(Objects::equals, invokeinterface:String[expected:Object](DSL$TypeReference::typeName, p0:DSL$TypeReference), invokeinterface:String[expected:Object](DSL$TypeReference::typeName, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u72f1\u5fe1\u8640\u99f7\uc4d2\uc2bd))))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-823401895))
                stack_94_0 = invokespecial:Type(Schema::getChoiceType, this:\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8[expected:Schema], p0:DSL$TypeReference, p1:String)
            }
            else {
                stack_94_0 = invokespecial:Type(Schema::getChoiceType, this:\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8[expected:Schema], p0:DSL$TypeReference, invokestatic:String(\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::\ud12e\ud217\uc238\uc9f6\u4ab3\u0800, p1:String))
            }
            
            return:Type<?>(stack_94_0:Type)
        }
        
        goto(Label_0006)
    }
    
    public java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> registerBlockEntities(com.mojang.datafixers.schemas.Schema p0) {
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
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\uc31c\u52d3\u5140\u624e\u6198\uf94d$6(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::hook, invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(16415), ldc:int(6167))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u72f1\u516c\u67d0\u97b7\uc246\ub6ab), p0:Schema), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(2762), ldc:int(2770))), invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(17543), ldc:int(17566))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u8640\u8df4\u7330\u8350\u6c56\ucfaf), p0:Schema), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(158), ldc:int(22074))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u72f1\u5fe1\u8640\u99f7\uc4d2\uc2bd), p0:Schema), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(16703), ldc:int(2139))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema)), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(28700), ldc:int(3260))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema)))), getstatic:Hook$HookFunction(\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u93a2\u8d90\u67e9\u8350\u36d3\u4cd9), getstatic:Hook$HookFunction(Hook$HookFunction::IDENTITY)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u67d0\uc2e8\ub8be\ube23\u93a2\ucef1$5(java.util.Map p0) {
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
            return:TypeTemplate(invokestatic:TaggedChoice[expected:TypeTemplate](DSL::taggedChoiceLazy, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(18007), ldc:int(6295))), invokestatic:Type<String>(\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::\ub113\u3c25\u9a18\uc7fe\u8640\ud523), p0:Map))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u1187\ub7dc\u8709\ub7dc\ua562\ubb2b$4(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(2571), ldc:int(2582))), invokestatic:TypeTemplate(DSL::or, invokestatic:TypeTemplate(DSL::constType, invokestatic:Type(DSL::intType)), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u72f1\u516c\u67d0\u97b7\uc246\ub6ab), p0:Schema))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u647c\u5140\ub6ab\u6d99\u8709\u3dd3$3(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u3bc9\ub18d\u3e2a\uf9c5\ua61f\u8258), p0:Schema))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\ub19c\u9937\ubb2b\uc2e8\u839e\u6bb9$2(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(2054), ldc:int(2072))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u36d3\u927d\uc229\u4c04\u624e\u4f52$1(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(4639), ldc:int(10271))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ube23\u965f\u62da\u7af6\u965f\u71ae$0(java.util.HashMap p0) {
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
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(-18672), ldc:int(18479))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(21346), ldc:int(-22375))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(16400), ldc:int(16432))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(-12930), ldc:int(12929))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(130), ldc:int(131))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(132), ldc:int(133))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(24625), ldc:int(24592))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(17409), ldc:int(6429))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(2051), ldc:int(12738))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(17545), ldc:int(17547))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(22791), ldc:int(1547))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(10272), ldc:int(10275))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(21525), ldc:int(172))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(4), ldc:int(14213))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(389), ldc:int(3159))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-30586), ldc:int(-30589))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(20578), ldc:int(20580))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(17478), ldc:int(8206))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-32636), ldc:int(-32637))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-28667), ldc:int(-28670))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(1237), ldc:int(1245))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(3644), ldc:int(8649))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(8710), ldc:int(8716))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(5255), ldc:int(5261))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(16419), ldc:int(8494))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(609), ldc:int(618))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(23), ldc:int(1))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(279), ldc:int(4150))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(6162), ldc:int(6175))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-32753), ldc:int(-32766))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(4910), ldc:int(2142))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(8207), ldc:int(2078))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(408), ldc:int(407))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(2183), ldc:int(2184))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(10364), ldc:int(17936))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-28128), ldc:int(-28112))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(4115), ldc:int(19483))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(17806), ldc:int(17821))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(1541), ldc:int(1559))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(1037), ldc:int(1055))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(2083), ldc:int(5347))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-16363), ldc:int(-16381))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(3387), ldc:int(3359))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(223), ldc:int(3606))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(13339), ldc:int(13374))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(15461), ldc:int(16549))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(695), ldc:int(657))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-32599), ldc:int(-32628))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(1959), ldc:int(8303))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(4013), ldc:int(8231))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(940), ldc:int(59))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(655), ldc:int(682))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(57), ldc:int(17193))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(615), ldc:int(4389))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(16427), ldc:int(5178))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(3679), ldc:int(3706))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(16491), ldc:int(13103))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(26758), ldc:int(26787))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(1044), ldc:int(1080))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(4155), ldc:int(4126))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-16254), ldc:int(-16209))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(415), ldc:int(442))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(691), ldc:int(669))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(1209), ldc:int(1180))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(8631), ldc:int(8600))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(797), ldc:int(824))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(48), ldc:int(17072))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(117), ldc:int(37))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(697), ldc:int(18549))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(28223), ldc:int(293))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-16336), ldc:int(-16382))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(17957), ldc:int(117))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-32419), ldc:int(-32402))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(223), ldc:int(250))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(23604), ldc:int(8244))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(1317), ldc:int(4263))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(565), ldc:int(4597))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(21506), ldc:int(21543))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(204), ldc:int(250))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(16895), ldc:int(8246))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-30171), ldc:int(-30190))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(18981), ldc:int(53))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(55), ldc:int(16403))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(2319), ldc:int(2332))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(1554), ldc:int(1578))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(115), ldc:int(8215))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(3347), ldc:int(3370))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(4761), ldc:int(4746))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(20858), ldc:int(1086))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(26755), ldc:int(26768))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(187), ldc:int(3451))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(4110), ldc:int(4125))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(8408), ldc:int(8420))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(552), ldc:int(571))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(8962), ldc:int(9023))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(37), ldc:int(54))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(9317), ldc:int(9307))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(2257), ldc:int(2242))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(17190), ldc:int(17177))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(18971), ldc:int(1427))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(24648), ldc:int(243))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-31462), ldc:int(-31479))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(24779), ldc:int(2149))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(339), ldc:int(6163))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(354), ldc:int(7755))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-32423), ldc:int(-32438))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(24643), ldc:int(7239))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(4108), ldc:int(4127))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(8789), ldc:int(8721))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(8196), ldc:int(8215))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-16204), ldc:int(-16143))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(29367), ldc:int(1363))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(16788), ldc:int(16850))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(5907), ldc:int(59))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(1067), ldc:int(1132))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(9472), ldc:int(9491))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(2124), ldc:int(5832))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(9102), ldc:int(102))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(1989), ldc:int(1932))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-12272), ldc:int(-12266))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-31666), ldc:int(-31740))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(2185), ldc:int(21533))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(6146), ldc:int(6217))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(-15323), ldc:int(-15318))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(18489), ldc:int(18549))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(1686), ldc:int(1671))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(0), ldc:int(77))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(18513), ldc:int(14233))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(12622), ldc:int(638))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(2359), ldc:int(21075))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(577), ldc:int(526))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(8709), ldc:int(8726))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(8852), ldc:int(21526))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(8265), ldc:int(8285))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(28746), ldc:int(28742))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(17549), ldc:int(6220))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(524), ldc:int(537))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(6679), ldc:int(17685))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(6148), ldc:int(6146))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(83), ldc:int(85))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), xor:int(ldc:int(5014), ldc:int(5062))), loadelement:String(getstatic:String[](\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8::\u59ec\u8753\u51fa\u760c\uc7fe\u4d85), and:int(ldc:int(19), ldc:int(12447))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \u0b8e\u600f\u7330\u6d99\ubf56\u0a06(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BA : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6C5 : int
        
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
        var_3_6BA = and:int(ldc:int(-1544018872), ldc:int(-402969511))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ud4fe\u97e6\u97b7\uc29a\u12b2\uc2e8[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1063985615))
            var_5_81 = and:int(ldc:int(18457), ldc:int(-18458))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(5672), ldc:int(-5673)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6BA:int, ldc:int(258898810))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(5), ldc:int(4)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(17189), ldc:int(3289)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6BA = and:int(var_3_D1:int, ldc:int(-546804785))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(20899), ldc:int(513)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1708874495))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1748135329))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(2142939354))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(348366153))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1770839537))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1936554858))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1897469413))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(274611889))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-380022936))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(708895239))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1039313072))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(192473677))
                        var_11_E2 = and:int(ldc:int(-15406), ldc:int(15373))
                        goto(Label_1580)
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1195781528))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1311969325))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1246523958))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1332471771))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(287506691))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1171766194))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1343718339))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1476995456))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1861256687))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1054741127))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1512100))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2053044563))
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1198558333))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(949947344))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(920226860))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(325595903))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(68), ldc:int(69))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(922832934))
                        goto(Label_1591)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2023552196))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1102006607))
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1591309546))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(2125498646))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1941964074))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-143657731))
                        var_11_E2 = and:int(ldc:int(-19668), ldc:int(3155))
                    }
                    
                    Label_1155:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(645343950))
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-469764980))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-717009658))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1599742918))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1033278641))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-598967872))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-131419696))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-201645843))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1452)
                            }
                        }
                    }
                    
                    Label_1307:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(2062750273))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1164764148))
                            goto(Label_1155)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(2140905826))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1378406641))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-647092227))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1610495966))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1580)
                    }
                    
                    Label_1452:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1591)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(323843518))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-213219466))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-150630551))
                        loopcontinue()
                    }
                    
                    var_3_6BA = and:int(var_3_6BA:int, ldc:int(-948194455))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1580:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C5 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1591:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1019470535))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1307)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-278270090))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-490844844))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1791396845))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-957559820))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-546330131))
                        var_17_6C5 = add:int(var_16_110:int, and:int(ldc:int(8473), ldc:int(2149)))
                        looporswitchbreak()
                    }
                    
                    var_3_6BA = and:int(var_3_6BA:int, ldc:int(1280267390))
                }
                
                var_3_6BA = and:int(var_3_6BA:int, ldc:int(737718248))
                
                if (cmple:boolean(var_5_81 = var_17_6C5:int, sub:int(var_6_88:int, xor:int(ldc:int(16548), ldc:int(16549))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
