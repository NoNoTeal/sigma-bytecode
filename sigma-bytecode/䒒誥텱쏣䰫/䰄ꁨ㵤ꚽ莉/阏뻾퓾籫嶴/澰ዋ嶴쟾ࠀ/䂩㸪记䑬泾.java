public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u40a9\u3e2a\u8bb0\u446c\u6cfe {
    public void \u40a9\u3e2a\u8bb0\u446c\u6cfe() {
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
            invokespecial:Object(Object::<init>, this:\u40a9\u3e2a\u8bb0\u446c\u6cfe)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static com.mojang.brigadier.suggestion.SuggestionProvider<S> \u97b7\u6ec6\u67e9\u9a18\u6c56\u3711(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, com.mojang.brigadier.suggestion.SuggestionProvider<\u36d3\u9033\u6b0d\u983f\u8d90.\u7e3f\uf94d\u446c\uc7fe\u7e3f> p1) {
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
        
        if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>>(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u965f\u5140\u9255\u2dcc\u647c\u600f), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]))) {
            invokeinterface:SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>>::put, getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>>(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u965f\u5140\u9255\u2dcc\u647c\u600f), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, p1:SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>)
            return:SuggestionProvider<S>(initobject:\u4c2b\uc2e8\ub171\ub113\u8308[expected:SuggestionProvider<S>](\u4c2b\uc2e8\ub171\ub113\u8308::<init>, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, p1:SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>))
        }
        
        athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0), and:int(ldc:int(14554), ldc:int(-14843)))), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]))))
    }
    
    public static com.mojang.brigadier.suggestion.SuggestionProvider<\u36d3\u9033\u6b0d\u983f\u8d90.\u7e3f\uf94d\u446c\uc7fe\u7e3f> \u5bc4\ua068\u120d\u51b2\uafe7\u3bc9(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>(checkcast:SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>(com.mojang.brigadier.suggestion.SuggestionProvider<\u36d3\u9033\u6b0d\u983f\u8d90.\u7e3f\uf94d\u446c\uc7fe\u7e3f>.class, invokeinterface:SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>>::getOrDefault, getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>>(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u965f\u5140\u9255\u2dcc\u647c\u600f), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object], getstatic:SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u6b5f\u7049\ucb79\u6c52\u3a62\u965f))))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 \u8d90\ucb79\u5654\u6c56\u3d4b\u516c(com.mojang.brigadier.suggestion.SuggestionProvider<\u36d3\u9033\u6b0d\u983f\u8d90.\u7e3f\uf94d\u446c\uc7fe\u7e3f> p0) {
        var_1_5F : int
        stack_82_0 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753 [generated]
        
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
            var_1_5F = and:int(ldc:int(1376277288), ldc:int(-731294402))
            
            if (logicalnot:boolean(instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u4c2b\uc2e8\ub171\ub113\u8308.class, p0:\u4c2b\uc2e8\ub171\ub113\u8308))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1835478603))
                stack_82_0 = getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u960f\ub7dc\ub8be\u385b\uc31c\u71f1)
            }
            else {
                stack_82_0 = invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4c2b\uc2e8\ub171\ub113\u8308::\u120d\u88c5\u8753\u72f1\u4c2b\ua562, checkcast:\u4c2b\uc2e8\ub171\ub113\u8308(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u4c2b\uc2e8\ub171\ub113\u8308.class, p0:\u4c2b\uc2e8\ub171\ub113\u8308))
            }
            
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(stack_82_0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
        }
        
        goto(Label_0006)
    }
    
    public static com.mojang.brigadier.suggestion.SuggestionProvider<\u36d3\u9033\u6b0d\u983f\u8d90.\u7e3f\uf94d\u446c\uc7fe\u7e3f> \u8d90\u183a\u4bc8\ud36e\uf9c5\ucef1(com.mojang.brigadier.suggestion.SuggestionProvider<\u36d3\u9033\u6b0d\u983f\u8d90.\u7e3f\uf94d\u446c\uc7fe\u7e3f> p0) {
        var_1_5F : int
        stack_7C_0 : SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f> [generated]
        
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
            var_1_5F = and:int(ldc:int(-225266093), ldc:int(-270813738))
            
            if (logicalnot:boolean(instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u4c2b\uc2e8\ub171\ub113\u8308.class, p0:SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1011696261))
                stack_7C_0 = getstatic:SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u6b5f\u7049\ucb79\u6c52\u3a62\u965f)
            }
            else {
                stack_7C_0 = p0:SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>
            }
            
            return:SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>(stack_7C_0:SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>)
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\u3d64\uc910\u6d69\u93a2\uc910\uf9c5$5(com.mojang.brigadier.context.CommandContext p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
    
    private static com.mojang.brigadier.Message lambda$\ube23\u51fa\u72f1\u8389\u6b5f\u385b$4(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c p0) {
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
            return:Message(initobject:TranslationTextComponent[expected:Message](TranslationTextComponent::<init>, invokestatic:String(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc238\u4daf\ufcaf\u983f\u6b0d\u4bc8, loadelement:String(getstatic:String[](\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0), and:int(ldc:int(14081), ldc:int(9))), invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9255\u0c95\u4cd9\ube23\u760c<T>::\u8d90\u56bd\u5db4\uf94d\u9af2\uc31c, p0:\u9255\u0c95\u4cd9\ube23\u760c<?>))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\u5245\u839e\ub32d\uc246\u6198\uc229$3(com.mojang.brigadier.context.CommandContext p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
            return:CompletableFuture(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u6cfe\u965f\uae5d\uc2e8\ud51e\u8cae, invokevirtual:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Iterable<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\u92ee\u4c04\u7c6b\u5db4\ud36e\u8389, invokevirtual:\u97e6\u3a62\uc29a\u16f6\u647c\u5db4<Object>[expected:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<Object>](\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f::\ucb79\ud36e\uc4d2\uc2e8\u3776\ub171, invokeinterface:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u392e\uc7fe\u7330\u36d3\u4ab3\u56bd, checkcast:\u7e3f\uf94d\u446c\uc7fe\u7e3f(\u36d3\u9033\u6b0d\u983f\u8d90.\u7e3f\uf94d\u446c\uc7fe\u7e3f.class, invokevirtual:Object[expected:\u7e3f\uf94d\u446c\uc7fe\u7e3f](CommandContext::getSource, p0:CommandContext))), getstatic:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc2e8\u9255\u647c\ud171\ubf56>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u4d85\u071d\u4c2b\ua6bd\uc238\u718f))), p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\u6435\u40a9\u9937\u6435\u64ab\u59ec$2(com.mojang.brigadier.context.CommandContext p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
            return:CompletableFuture(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u6cfe\u965f\uae5d\uc2e8\ud51e\u8cae, invokeinterface:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Iterable<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u4cd9\uc4d2\u8640\u3bc9\u0b8e\u40a9, checkcast:\u7e3f\uf94d\u446c\uc7fe\u7e3f(\u36d3\u9033\u6b0d\u983f\u8d90.\u7e3f\uf94d\u446c\uc7fe\u7e3f.class, invokevirtual:Object[expected:\u7e3f\uf94d\u446c\uc7fe\u7e3f](CommandContext::getSource, p0:CommandContext))), p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\u0b8e\u4daf\u516c\ud7e8\uafe7\ud171$1(com.mojang.brigadier.context.CommandContext p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
            return:CompletableFuture(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\uc87f\u6198\u5245\u7006\u97b7\ua6bd, invokeinterface:Stream<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u0b8e\u9033\ud12e\u446c\u67d0\u3711, checkcast:\u7e3f\uf94d\u446c\uc7fe\u7e3f(\u36d3\u9033\u6b0d\u983f\u8d90.\u7e3f\uf94d\u446c\uc7fe\u7e3f.class, invokevirtual:Object[expected:\u7e3f\uf94d\u446c\uc7fe\u7e3f](CommandContext::getSource, p0:CommandContext))), p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\u4975\uf995\u36d3\u3d4b\u416d\u873d$0(com.mojang.brigadier.context.CommandContext p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
            return:CompletableFuture(invokeinterface:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u6c56\u56bd\ud523\u8d98\u600f\uc910, checkcast:\u7e3f\uf94d\u446c\uc7fe\u7e3f(\u36d3\u9033\u6b0d\u983f\u8d90.\u7e3f\uf94d\u446c\uc7fe\u7e3f.class, invokevirtual:Object[expected:\u7e3f\uf94d\u446c\uc7fe\u7e3f](CommandContext::getSource, p0:CommandContext)), p0:CommandContext, p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2EA : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_105_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_148_0 : byte[] [generated]
        stack_2FD_0 : byte[] [generated]
        stack_361_0 : byte[] [generated]
        stack_401_0 : byte[] [generated]
        stack_43F_0 : byte[] [generated]
        var_4_2CD : int
        var_3_2D2 : byte[]
        var_5_2D3 : int
        expr_2FD : byte [generated]
        var_0_37B : int
        expr_361 : byte [generated]
        stack_3B3_2 : byte [generated]
        stack_387_0 : byte [generated]
        expr_9E : int [generated]
        expr_D7 : int [generated]
        var_2_105 : byte[]
        expr_109 : int [generated]
        var_3_42D : byte[]
        var_5_42E : int
        var_3_154 : String
        expr_15C : String[] [generated]
        expr_166 : String[] [generated]
        var_3_233 : String[]
        
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
        var_0_2EA = and:int(ldc:int(1399532383), ldc:int(1925061503))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D5_0 = stack_D7_0 = stack_105_0 = stack_107_0 = stack_148_0 = stack_2FD_0 = stack_361_0 = stack_401_0 = stack_43F_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("eSqPimOGDwaDoI0AgA0MbYcCjQAsiwaEbgkAaoKmCo0lj45pB4sOgCiIDQCKAmUKCYKIDgCPgGckC4mNAACEipAlCQ6GcYWECw8NlAUADoB6C4ACDogOAQAKihKIgYqA+wuHBIwGDoEACooSiAmJi32LAAOFC42NBo2PDoMHggqHgBOHDgoM/YMOgnLfVd/d4g==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2CD = expr_6E:int
        var_3_2D2 = newarray:byte[](byte.class, expr_6E:int)
        var_5_2D3 = expr_6E:int
        Label_0725:
        
        while (cmpeq:boolean(and:int(var_0_2EA:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2EA:int, ldc:int(16384)), ldc:int(0))) {
                var_0_2EA = and:int(var_0_2EA:int, ldc:int(692498355))
                goto(Label_0834)
            }
            
            var_0_2EA = and:int(var_0_2EA:int, ldc:int(929966207))
            var_5_2D3 = add:int(var_5_2D3:int, ldc:int(-1))
            expr_2FD = loadelement:byte(stack_2FD_0:byte[], var_5_2D3:int)
            storeelement:byte(var_3_2D2:byte[], var_5_2D3:int, or:int(and:int(shl:int(expr_2FD:byte, and:int(ldc:int(36), ldc:int(1036))), ldc:int(-16)), and:int(shr:int(expr_2FD:byte[expected:int], and:int(ldc:int(20782), ldc:int(9349))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_2D3:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_105_0 = stack_107_0 = stack_148_0 = stack_2FD_0 = stack_361_0 = stack_401_0 = stack_43F_0 = var_3_2D2:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0985)
        Label_0834:
        
        while (cmpne:boolean(and:int(var_0_2EA:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2EA:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0725)
            }
            
            var_0_37B = and:int(var_0_2EA:int, ldc:int(1363102807))
            var_5_2D3 = add:int(var_5_2D3:int, ldc:int(-1))
            expr_361 = stack_3B3_2 = loadelement(stack_361_0, var_5_2D3)
            
            if (cmplt:boolean(add:int(add:int(var_5_2D3:int, ldc:int(5)), neg:int(var_4_2CD:int)), ldc:int(0))) {
                stack_3B3_2 = stack_387_0 = add:byte(expr_361:byte, loadelement:byte(var_3_2D2:byte[], add:int(var_5_2D3:int, ldc:int(5))))
                goto(Label_0919)
            }
            
            Label_0878:
            
            if (cmpne:boolean(and:int(var_0_37B:int, ldc:int(4096)), ldc:int(0))) {
                var_0_37B = and:int(var_0_37B:int, ldc:int(1997798389))
            }
            else {
                var_0_37B = and:int(var_0_37B:int, ldc:int(1978366207))
                stack_3B3_2 = stack_387_0 = add:byte(expr_361:byte, ldc:byte(5))
            }
            
            Label_0919:
            
            if (cmpeq:boolean(and:int(var_0_37B:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_37B = and:int(var_0_37B:int, ldc:int(-655864604))
                goto(Label_0878)
            }
            
            var_0_2EA = and:int(var_0_37B:int, ldc:int(1357900767))
            storeelement:byte(var_3_2D2:byte[], var_5_2D3:int, stack_3B3_2:byte)
            
            if (cmpne:boolean(var_5_2D3:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_105_0 = stack_107_0 = stack_148_0 = stack_2FD_0 = stack_361_0 = stack_401_0 = stack_43F_0 = var_3_2D2:byte[]
            goto(Label_0163)
        }
        
        Label_0985:
        
        while (cmpne:boolean(and:int(var_0_2EA:int, ldc:int(2)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2EA:int, ldc:int(131072)), ldc:int(0))) {
                var_0_2EA = and:int(var_0_2EA:int, ldc:int(1040201840))
                goto(Label_0725)
            }
            
            var_0_2EA = and:int(var_0_2EA:int, ldc:int(-1859162921))
            var_5_2D3 = add:int(var_5_2D3:int, ldc:int(-1))
            storeelement:byte(var_3_2D2:byte[], var_5_2D3:int, xor:byte(add:byte(loadelement:byte(stack_401_0:byte[], var_5_2D3:int), ldc:byte(91)), ldc:byte(22)))
            
            if (cmpne:boolean(var_5_2D3:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_105_0 = stack_107_0 = stack_148_0 = stack_2FD_0 = stack_361_0 = stack_401_0 = stack_43F_0 = var_3_2D2:byte[]
            goto(Label_0220)
        }
        
        goto(Label_0834)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_2EA:int, ldc:int(1024)), ldc:int(0))) {
            var_0_2EA = and:int(var_0_2EA:int, ldc:int(-1691176335))
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_2EA:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0220)
        }
        
        if (cmpne:boolean(and:int(var_0_2EA:int, ldc:int(2)), ldc:int(0))) {
            var_0_2EA = and:int(var_0_2EA:int, ldc:int(519703263))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_2CD = expr_9E:int
                var_3_2D2 = newarray:byte[](byte.class, expr_9E:int)
                var_5_2D3 = expr_9E:int
                goto(Label_0834)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_2EA:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_2EA:int, ldc:int(4)), ldc:int(0))) {
            var_0_2EA = and:int(var_0_2EA:int, ldc:int(-1598984761))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_2EA:int, ldc:int(4)), ldc:int(0))) {
                var_0_2EA = and:int(var_0_2EA:int, ldc:int(-301068023))
                goto(Label_0115)
            }
            
            var_0_2EA = and:int(var_0_2EA:int, ldc:int(939518423))
            expr_D7 = arraylength:int(stack_D7_0:byte[])
            
            if (cmpne:boolean(expr_D7:int, ldc:int(0))) {
                var_4_2CD = expr_D7:int
                var_3_2D2 = newarray:byte[](byte.class, expr_D7:int)
                var_5_2D3 = expr_D7:int
                goto(Label_0985)
            }
        }
        
        Label_0220:
        
        if (cmpeq:boolean(and:int(var_0_2EA:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2EA:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_2EA:int, ldc:int(524288)), ldc:int(0))) {
                var_0_2EA = and:int(var_0_2EA:int, ldc:int(-127184277))
                goto(Label_0115)
            }
            
            var_0_2EA = and:int(var_0_2EA:int, ldc:int(825981047))
            var_2_105 = stack_105_0:byte[]
            expr_109 = add:int(arraylength:int(stack_107_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_3_42D = newarray:byte[](byte.class, expr_109:int)
                var_5_42E = expr_109:int
                
                loop {
                    var_0_2EA = and:int(var_0_2EA:int, ldc:int(-1338001065))
                    var_5_42E = add:int(var_5_42E:int, ldc:int(-1))
                    storeelement:byte(var_3_42D:byte[], var_5_42E:int, add:int(shl:int(loadelement:byte(stack_43F_0:byte[], var_5_42E:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_105:byte[], add:int(var_5_42E:int, xor:int(ldc:int(264), ldc:int(265)))), ldc:int(3)), xor:int(ldc:int(4318), ldc:int(4289)))))
                    
                    if (cmpne:boolean(var_5_42E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_105_0 = stack_107_0 = stack_148_0 = stack_2FD_0 = stack_361_0 = stack_401_0 = stack_43F_0 = var_3_42D:byte[]
            }
        }
        
        Label_0270:
        
        if (cmpne:boolean(and:int(var_0_2EA:int, ldc:int(16384)), ldc:int(0))) {
            var_0_2EA = and:int(var_0_2EA:int, ldc:int(343640291))
            goto(Label_0220)
        }
        
        if (cmpeq:boolean(and:int(var_0_2EA:int, ldc:int(1)), ldc:int(0))) {
            var_0_2EA = and:int(var_0_2EA:int, ldc:int(-958312581))
            goto(Label_0163)
        }
        
        if (cmpne:boolean(and:int(var_0_2EA:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_2EA = and:int(var_0_2EA:int, ldc:int(-507688937))
            goto(Label_0115)
        }
        
        var_3_154 = initobject:String(String::<init>, stack_148_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_15C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(11879), ldc:int(135)))
        expr_166 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-24313), ldc:int(-24320)))
        storeelement:String(expr_166:String[], and:int(ldc:int(2738), ldc:int(-2739)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(-19064), ldc:int(599)), and:int(ldc:int(1098), ldc:int(3026))))
        storeelement:String(expr_15C:String[], xor:int(ldc:int(4272), ldc:int(4275)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(164), ldc:int(230)), xor:int(ldc:int(18456), ldc:int(18517))))
        storeelement:String(expr_15C:String[], and:int(ldc:int(1098), ldc:int(6546)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(18797), ldc:int(589)), xor:int(ldc:int(1048), ldc:int(1103))))
        storeelement:String(expr_15C:String[], xor:int(ldc:int(1176), ldc:int(1181)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(-15312), ldc:int(-15257)), xor:int(ldc:int(231), ldc:int(128))))
        storeelement:String(expr_15C:String[], and:int(ldc:int(644), ldc:int(25877)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(2482), ldc:int(2517)), and:int(ldc:int(12407), ldc:int(19711))))
        storeelement:String(expr_166:String[], and:int(ldc:int(2985), ldc:int(1027)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(5751), ldc:int(16767)), xor:int(ldc:int(8264), ldc:int(8245))))
        storeelement:String(expr_15C:String[], and:int(ldc:int(16599), ldc:int(6438)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(686), ldc:int(723)), xor:int(ldc:int(966), ldc:int(854))))
        putstatic:String[](\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u3d4b\u64f2\u59ec\u97b7\ud12e\u6fb0, expr_166:String[])
        var_3_233 = expr_15C:String[]
        putstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>>(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u965f\u5140\u9255\u2dcc\u647c\u600f, invokestatic:HashMap[expected:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>>](Maps::newHashMap))
        putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u960f\ub7dc\ub8be\u385b\uc31c\u71f1, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_233:String[], xor:int(ldc:int(2057), ldc:int(2059)))))
        putstatic:SuggestionProvider<\u7e3f\uf94d\u446c\uc7fe\u7e3f>(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u6b5f\u7049\ucb79\u6c52\u3a62\u965f, invokestatic:SuggestionProvider(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u97b7\u6ec6\u67e9\u9a18\u6c56\u3711, getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u960f\ub7dc\ub8be\u385b\uc31c\u71f1), invokedynamic:SuggestionProvider(getSuggestions:()Lcom/mojang/brigadier/suggestion/SuggestionProvider;)))
        putstatic:SuggestionProvider<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u8d90\u62da\ubb2b\u8d98\u8258\u59ec, invokestatic:SuggestionProvider(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u97b7\u6ec6\u67e9\u9a18\u6c56\u3711, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_233:String[], xor:int(ldc:int(6785), ldc:int(6786)))), invokedynamic:SuggestionProvider(getSuggestions:()Lcom/mojang/brigadier/suggestion/SuggestionProvider;)))
        putstatic:SuggestionProvider<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u3711\ud523\ub19c\u3711\ucb79\u3d4b, invokestatic:SuggestionProvider(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u97b7\u6ec6\u67e9\u9a18\u6c56\u3711, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_233:String[], and:int(ldc:int(9357), ldc:int(4356)))), invokedynamic:SuggestionProvider(getSuggestions:()Lcom/mojang/brigadier/suggestion/SuggestionProvider;)))
        putstatic:SuggestionProvider<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u93a2\u1833\u6cfe\uc4d2\u4ab3\uc84e, invokestatic:SuggestionProvider(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u97b7\u6ec6\u67e9\u9a18\u6c56\u3711, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_233:String[], and:int(ldc:int(149), ldc:int(869)))), invokedynamic:SuggestionProvider(getSuggestions:()Lcom/mojang/brigadier/suggestion/SuggestionProvider;)))
        putstatic:SuggestionProvider<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u71ae\u5fe1\u0b8e\u5140\uf995\u927d, invokestatic:SuggestionProvider(\u40a9\u3e2a\u8bb0\u446c\u6cfe::\u97b7\u6ec6\u67e9\u9a18\u6c56\u3711, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_233:String[], xor:int(ldc:int(12290), ldc:int(12292)))), invokedynamic:SuggestionProvider(getSuggestions:()Lcom/mojang/brigadier/suggestion/SuggestionProvider;)))
    }
    
    public void \u5140\u12cb\ud36e\u7ce1\ubb2b\ud171(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6C3 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6CE : int
        
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
        var_3_6C3 = and:int(ldc:int(-415965001), ldc:int(2067262487))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u40a9\u3e2a\u8bb0\u446c\u6cfe[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-718097726))
        }
        else {
            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-141166458))
            var_5_8A = and:int(ldc:int(19020), ldc:int(-19279))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(897), ldc:int(-898)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6C3:int, ldc:int(-283121945))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(129), ldc:int(9491)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(291), ldc:int(2049)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6C3 = and:int(var_3_DA:int, ldc:int(1930750647))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(1097), ldc:int(5)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1317903444))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1813265751))
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-485060797))
                    }
                    else {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-82316209))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(849207650))
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1686733079))
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1473914287))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1368358348))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(571767164))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-642918786))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-81855690))
                        var_11_EB = and:int(ldc:int(-2084), ldc:int(2083))
                        goto(Label_1616)
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2120284531))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(936391860))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1711654103))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1421022154))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(878577550))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1073903992))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-14752865))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(54670843))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(412549555))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-440030948))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(397254817))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2136003434))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1419779242))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-470292657))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-971202030))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(246155815))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1078135988))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1379070288))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(297549777))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1742659775))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(8451), ldc:int(209))
                                goto(Label_1191)
                            }
                        }
                    }
                    
                    Label_1013:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1860564605))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1367990903))
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1682420196))
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1964454418))
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(752696792))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1363800355))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1941241006))
                        var_11_EB = and:int(ldc:int(25678), ldc:int(-25680))
                    }
                    
                    Label_1191:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(820309985))
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1369388438))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(260737486))
                            goto(Label_1013)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-6437584))
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-347876853))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1072283354))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-335742474))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1470)
                            }
                        }
                    }
                    
                    Label_1334:
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1971866224))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1191)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1013)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1021769459))
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(762818356))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-2068117820))
                            loopcontinue()
                        }
                        
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2140664462))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1616)
                    }
                    
                    Label_1470:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2126279870))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1334)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-167231055))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1013)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1847654793))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(2029883458))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1441821755))
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-278987498))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1616:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6CE = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1627:
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(186031666))
                        goto(Label_1334)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(1471467523))
                        goto(Label_1013)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-1376361937))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6C3:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-203497441))
                        var_17_6CE = add:int(var_16_119:int, and:int(ldc:int(13315), ldc:int(18625)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6C3 = and:int(var_3_6C3:int, ldc:int(-413861858))
                
                if (cmple:boolean(var_5_8A = var_17_6CE:int, sub:int(var_6_91:int, xor:int(ldc:int(16386), ldc:int(16387))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6C3:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
