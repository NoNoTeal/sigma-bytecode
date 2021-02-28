public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u8bb0\u5f50\u760c\u7af6\u760c {
    public void \u8bb0\u5f50\u760c\u7af6\u760c() {
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
            invokespecial:Object(Object::<init>, this:\u8bb0\u5f50\u760c\u7af6\u760c)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u8bb0\u5f50\u760c\u7af6\u760c \ua562\u3d4b\ub19c\u16f6\u927d\u0a06() {
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
            return:\u8bb0\u5f50\u760c\u7af6\u760c(initobject:\u8bb0\u5f50\u760c\u7af6\u760c(\u8bb0\u5f50\u760c\u7af6\u760c::<init>))
        }
        
        goto(Label_0006)
    }
    
    public \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uafe7\uc229\ubefe\u64ab\ub102 parse(com.mojang.brigadier.StringReader p0) {
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
    
    public static java.util.function.Predicate<\u927d\u92ff\u71ae\uafe7\u6bb9.\u839e\u8389\ua562\uc7fe\u76bc\ube23> \uae87\u92ff\u624e\u8aa5\ud158\ua61f(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, java.lang.String p1) {
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
            return:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(invokeinterface:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(\uafe7\uc229\ubefe\u64ab\ub102::\u156b\u36d3\u4ab3\u71f1\u64f2\u40a9, checkcast:\uafe7\uc229\ubefe\u64ab\ub102(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uafe7\uc229\ubefe\u64ab\ub102.class, invokevirtual:Object[expected:\uafe7\uc229\ubefe\u64ab\ub102](CommandContext::getArgument, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, p1:String, ldc:Class<\uafe7\uc229\ubefe\u64ab\ub102>(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uafe7\uc229\ubefe\u64ab\ub102.class))), invokevirtual:\u88c5\uc2bd\u1833\u960f\u5db4\u4d85(\u88c5\ud171\ub113\u6435\ud51e::\u3e2a\u6d99\u92ee\ua3b4\u4c04\u7e3f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>))))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> listSuggestions(com.mojang.brigadier.context.CommandContext<S> p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
        var_3_7D : int
        var_5_70 : StringReader
        var_3_E1 : int
        var_6_AB : \uc2bd\u6435\u3711\u6cfe\u40a9
        
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
            var_3_7D = and:int(and:int(ldc:int(1148693635), ldc:int(-13373653)), ldc:int(1287581515))
            var_5_70 = initobject:StringReader(StringReader::<init>, invokevirtual:String(SuggestionsBuilder::getInput, p1:SuggestionsBuilder))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_7D:int, ldc:int(8)), ldc:int(0))) {
                    var_3_7D = and:int(var_3_7D:int, ldc:int(1949478197))
                    invokevirtual:void(StringReader::setCursor, var_5_70:StringReader, invokevirtual:int(SuggestionsBuilder::getStart, p1:SuggestionsBuilder))
                }
                
                if (cmpeq:boolean(and:int(var_3_7D:int, ldc:int(16)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_7D = and:int(var_3_7D:int, ldc:int(-622319960))
            }
            
            var_3_E1 = and:int(var_3_7D:int, ldc:int(1962147701))
            var_6_AB = initobject:\uc2bd\u6435\u3711\u6cfe\u40a9(\uc2bd\u6435\u3711\u6cfe\u40a9::<init>, var_5_70:StringReader, xor:int[expected:boolean](ldc:int(2880), ldc:int(2881)))
            
            try {
                loop {
                    if (cmpeq:boolean(and:int(var_3_E1:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_E1 = and:int(var_3_E1:int, ldc:int(-400399019))
                    }
                    else {
                        var_3_E1 = and:int(var_3_E1:int, ldc:int(-301994115))
                        invokevirtual:\uc2bd\u6435\u3711\u6cfe\u40a9(\uc2bd\u6435\u3711\u6cfe\u40a9::\u983f\u6435\uc229\ub1b9\u3bc9\u965f, var_6_AB:\uc2bd\u6435\u3711\u6cfe\u40a9, and:int[expected:boolean](ldc:int(8453), ldc:int(16625)))
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_E1:int, ldc:int(4)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_3_E1 = and:int(var_3_E1:int, ldc:int(-922313339))
                }
                
                var_3_E1 = and:int(var_3_E1:int, ldc:int(1421278615))
            }
            catch (com.mojang.brigadier.exceptions.CommandSyntaxException stack_E9_0) {
            }
            
            return:CompletableFuture<Suggestions>(invokevirtual:CompletableFuture<Suggestions>(\uc2bd\u6435\u3711\u6cfe\u40a9::\ub6ab\uc2e8\u1187\u8308\u2dcc\u56bd, var_6_AB:\uc2bd\u6435\u3711\u6cfe\u40a9, p1:SuggestionsBuilder, invokestatic:\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u69d9\u7bad\u8709\u9937\u446c\u67d0::\u446c\u7873\ufe34\u7043\ub1b9\u5140)))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<java.lang.String> getExamples() {
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
            return:Collection<String>(getstatic:Collection<String>(\u8bb0\u5f50\u760c\u7af6\u760c::\ubf56\u6435\u156b\u3e2a\ub19c\u51b2))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object parse(com.mojang.brigadier.StringReader p0) {
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
            return:Object(invokevirtual:\uafe7\uc229\ubefe\u64ab\ub102[expected:Object](\u8bb0\u5f50\u760c\u7af6\u760c::parse, this:\u8bb0\u5f50\u760c\u7af6\u760c, p0:StringReader))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.function.Predicate lambda$\uae5d\uc4d2\u647c\u92ff\u8308\u5fe1$2(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, \u59ec\u8413\u97e6\uc229\u3776.\uc2bd\u6435\u3711\u6cfe\u40a9 p1, \u59ec\u8413\u97e6\uc229\u3776.\u88c5\uc2bd\u1833\u960f\u5db4\u4d85 p2) {
        var_5_6C : \u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>
        
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
        var_5_6C = invokeinterface:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u1187\uc87f\u071d\u494c\u61a4\ub171, invokeinterface:\u8d90\u183a\ub171\u59ec\u836c\u8413<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u88c5\uc2bd\u1833\u960f\u5db4\u4d85::\ud171\u9937\u6bb9\u6bb9\uc4d2\u6d69, p2:\u88c5\uc2bd\u1833\u960f\u5db4\u4d85), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
        
        if (cmpne:boolean(var_5_6C:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, aconstnull:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>())) {
            return:Predicate(initobject:\u9a18\u494c\uc9f6\u839e\ub7dc(\u9a18\u494c\uc9f6\u839e\ub7dc::<init>, var_5_6C:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>, invokevirtual:Map<String, String>(\uc2bd\u6435\u3711\u6cfe\u40a9::\u385b\u67d0\ub18d\u0a06\ub1b9\ubcb0, p1:\uc2bd\u6435\u3711\u6cfe\u40a9), invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\uc2bd\u6435\u3711\u6cfe\u40a9::\u516c\u3dd3\u16f6\u3d64\u8aa5\u59ec, p1:\uc2bd\u6435\u3711\u6cfe\u40a9), aconstnull:\u1187\u4bc8\u61a4\u839e\ubff1()))
        }
        
        athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u8bb0\u5f50\u760c\u7af6\u760c::\u72f1\u0b8e\u4492\u12cb\u8709\u4f4a), invokevirtual:String[expected:Object](\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
    }
    
    private static java.util.function.Predicate lambda$\u67e9\u8cae\uc84e\ua3b4\u8413\uf9c5$1(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u6bb9\ufe34\u8389\u3c25\u446c p0, \u59ec\u8413\u97e6\uc229\u3776.\u88c5\uc2bd\u1833\u960f\u5db4\u4d85 p1) {
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
            return:Predicate(p0:\u6bb9\ufe34\u8389\u3c25\u446c[expected:Predicate])
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\ucfaf\u34df\ud158\u624e\uc3e3\u7af6$0(java.lang.Object p0) {
        stack_84_1 : String [generated]
        expr_77 : Object[] [generated]
        
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
            stack_84_1 = loadelement:String(getstatic:String[](\u8bb0\u5f50\u760c\u7af6\u760c::\u93a2\ud523\u7af6\ubff1\u64ab\ud217), and:int(ldc:int(6538), ldc:int(-24031)))
            expr_77 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(19505), ldc:int(4683)))
            storeelement:Object(expr_77:Object[], and:int(ldc:int(-28402), ldc:int(27808)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_84_1:String, expr_77:Object[]))
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
    
    public void \u9937\uc238\u59ec\u62da\ubf56\u3e2a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_67D : int
        
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
        var_3_672 = and:int(ldc:int(1612919965), ldc:int(-558788611))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8bb0\u5f50\u760c\u7af6\u760c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(1219799943))
            var_5_81 = and:int(ldc:int(8650), ldc:int(-10699))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-27198), ldc:int(27160)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_672:int, ldc:int(1252843349))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(28707), ldc:int(1097)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(18451), ldc:int(553)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_D1:int, ldc:int(-1045507779))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(24), ldc:int(25)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1030596009))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(237157659))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1466425592))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2099538367))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1717882029))
                    }
                    else {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1726977931))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(260803324))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(747980511))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(837760763))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-678908602))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1761331973))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1516360931))
                        var_11_E2 = and:int(ldc:int(19474), ldc:int(-23571))
                        goto(Label_1535)
                    }
                    
                    Label_0586:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2005141964))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-502558087))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1527449783))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2067758367))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1324992281))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-667607029))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1535125319))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1068514970))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1116022716))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1382567285))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-199651078))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(107690624))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1000829817))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1105890596))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-589673711))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-245143817))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(4865), ldc:int(4864))
                                goto(Label_1110)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-166113098))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-704859297))
                        var_11_E2 = and:int(ldc:int(689), ldc:int(-690))
                    }
                    
                    Label_1110:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1292991090))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-300917626))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(798200928))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(706304120))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1806518830))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-504189875))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1244:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1456112148))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-2106996897))
                            goto(Label_1110)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(272677431))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1140200342))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1752629781))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1469161648))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(2050814719))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1535)
                    }
                    
                    Label_1398:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(341072676))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-724377040))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-310092687))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1272856038))
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(2050125119))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1535:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1546:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(370396049))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1064349422))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1515553481))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-697450745))
                        var_17_67D = add:int(var_16_110:int, xor:int(ldc:int(4752), ldc:int(4753)))
                        looporswitchbreak()
                    }
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(1794482869))
                
                if (cmple:boolean(var_5_81 = var_17_67D:int, sub:int(var_6_88:int, and:int(ldc:int(43), ldc:int(257))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
