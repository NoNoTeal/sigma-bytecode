public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u760c\ua61f\ub7dc\u12b2\u12cb {
    public void \u760c\ua61f\ub7dc\u12b2\u12cb() {
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
            invokespecial:Object(Object::<init>, this:\u760c\ua61f\ub7dc\u12b2\u12cb)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u760c\ua61f\ub7dc\u12b2\u12cb \u56bd\u4975\ube23\u62da\u8aa5\u0800() {
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
            return:\u760c\ua61f\ub7dc\u12b2\u12cb(initobject:\u760c\ua61f\ub7dc\u12b2\u12cb(\u760c\ua61f\ub7dc\u12b2\u12cb::<init>))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u5bc4\uf9c5\u5140\u759a\u156b parse(com.mojang.brigadier.StringReader p0) {
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
    
    public static java.util.function.Predicate<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56> \u52d3\u494c\u5140\u446c\u47c2\u51b2(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, java.lang.String p1) {
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
            return:Predicate<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(invokeinterface:Predicate<\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56>(\u5bc4\uf9c5\u5140\u759a\u156b::\ua562\u8413\u3d64\u4f52\u51fa\uafe7, checkcast:\u5bc4\uf9c5\u5140\u759a\u156b(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u5bc4\uf9c5\u5140\u759a\u156b.class, invokevirtual:Object[expected:\u5bc4\uf9c5\u5140\u759a\u156b](CommandContext::getArgument, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, p1:String, ldc:Class<\u5bc4\uf9c5\u5140\u759a\u156b>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u5bc4\uf9c5\u5140\u759a\u156b.class))), p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>))
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<com.mojang.brigadier.suggestion.Suggestions> listSuggestions(com.mojang.brigadier.context.CommandContext<S> p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
        var_3_64 : int
        var_5_70 : StringReader
        var_3_7D : int
        var_3_D2 : int
        var_6_B3 : \u74b1\u8cae\u3d4b\u873d\uc910
        
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
            var_3_64 = and:int(and:int(ldc:int(1131727292), ldc:int(1526524840)), ldc:int(1807147001))
            var_5_70 = initobject:StringReader(StringReader::<init>, invokevirtual:String(SuggestionsBuilder::getInput, p1:SuggestionsBuilder))
            
            loop {
                if (cmpne:boolean(and:int(var_3_64:int, ldc:int(4096)), ldc:int(0))) {
                    var_3_7D = and:int(var_3_64:int, ldc:int(960489886))
                }
                else {
                    var_3_7D = and:int(var_3_64:int, ldc:int(1197277107))
                    invokevirtual:void(StringReader::setCursor, var_5_70:StringReader, invokevirtual:int(SuggestionsBuilder::getStart, p1:SuggestionsBuilder))
                }
                
                if (cmpne:boolean(and:int(var_3_7D:int, ldc:int(32768)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_64 = and:int(var_3_7D:int, ldc:int(-950202038))
            }
            
            var_3_D2 = and:int(var_3_7D:int, ldc:int(1786567097))
            var_6_B3 = initobject:\u74b1\u8cae\u3d4b\u873d\uc910(\u74b1\u8cae\u3d4b\u873d\uc910::<init>, var_5_70:StringReader, xor:int[expected:boolean](ldc:int(11265), ldc:int(11264)))
            
            try {
                do {
                    if (cmpne:boolean(and:int(var_3_D2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_D2 = and:int(var_3_D2:int, ldc:int(-814351707))
                        invokevirtual:\u74b1\u8cae\u3d4b\u873d\uc910(\u74b1\u8cae\u3d4b\u873d\uc910::\u4179\uc7fe\u6b5f\u98a4\u516c\u5db4, var_6_B3:\u74b1\u8cae\u3d4b\u873d\uc910)
                    }
                } while (cmpeq:boolean(and:int(var_3_D2:int, ldc:int(32)), ldc:int(0)))
                
                var_3_D2 = and:int(var_3_D2:int, ldc:int(2000542386))
            }
            catch (com.mojang.brigadier.exceptions.CommandSyntaxException stack_DA_0) {
            }
            
            return:CompletableFuture<Suggestions>(invokevirtual:CompletableFuture<Suggestions>(\u74b1\u8cae\u3d4b\u873d\uc910::\ubded\u8258\u12b2\u3a62\u120d\u8df4, var_6_B3:\u74b1\u8cae\u3d4b\u873d\uc910, p1:SuggestionsBuilder, invokestatic:\u8d90\u183a\ub171\u59ec\u836c\u8413<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>(\u6198\u5db4\uc31c\u5f50\uf94d\u97e6::\uc246\u5140\ub171\u5fe1\ubf56\ub8be)))
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
            return:Collection<String>(getstatic:Collection<String>(\u760c\ua61f\ub7dc\u12b2\u12cb::\uc2bd\u67d0\uae87\u6ec6\u59ec\u5d20))
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
            return:Object(invokevirtual:\u5bc4\uf9c5\u5140\u759a\u156b[expected:Object](\u760c\ua61f\ub7dc\u12b2\u12cb::parse, this:\u760c\ua61f\ub7dc\u12b2\u12cb, p0:StringReader))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.function.Predicate lambda$\uc2e8\u6b5f\u3711\ud51e\u7006\u4ab3$2(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u74b1\u8cae\u3d4b\u873d\uc910 p1, com.mojang.brigadier.context.CommandContext p2) {
        var_5_78 : \u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>
        
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
        var_5_78 = invokeinterface:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>(\u8d90\u183a\ub171\u59ec\u836c\u8413<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>::\u1187\uc87f\u071d\u494c\u61a4\ub171, invokeinterface:\u8d90\u183a\ub171\u59ec\u836c\u8413<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>(\u88c5\uc2bd\u1833\u960f\u5db4\u4d85::\u071d\u3504\u36d3\u62da\u6fb0\u3bc9, invokevirtual:\u88c5\uc2bd\u1833\u960f\u5db4\u4d85(\u88c5\ud171\ub113\u6435\ud51e::\u3e2a\u6d99\u92ee\ua3b4\u4c04\u7e3f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p2:CommandContext))))), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
        
        if (cmpne:boolean(var_5_78:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>, aconstnull:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>())) {
            return:Predicate(initobject:\u156b\u51fa\u8df4\u92ff\u92ee(\u156b\u51fa\u8df4\u92ff\u92ee::<init>, var_5_78:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u9af2\u1833\u156b\u12cb\u7d52\u6c52>, invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\u74b1\u8cae\u3d4b\u873d\uc910::\u983f\u97e6\uff55\uc229\uc9f6\uc4d2, p1:\u74b1\u8cae\u3d4b\u873d\uc910)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u760c\ua61f\ub7dc\u12b2\u12cb::\uc84e\u8709\u67e9\ua6bd\u4d85\uc246), invokevirtual:String[expected:Object](\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
    }
    
    private static java.util.function.Predicate lambda$\u6b5f\u624e\u4179\u120d\u183a\u6fb0$1(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u3e2a\ub1b9\u5140\u61a4\u8389 p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:Predicate(p0:\u3e2a\ub1b9\u5140\u61a4\u8389[expected:Predicate])
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u4f4a\u34df\ud523\u52d3\u6198\ubefe$0(java.lang.Object p0) {
        stack_83_1 : String [generated]
        expr_76 : Object[] [generated]
        
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
            stack_83_1 = loadelement:String(getstatic:String[](\u760c\ua61f\ub7dc\u12b2\u12cb::\u8df4\uf9c5\u183a\u52d3\u4bc8\ub113), and:int(ldc:int(-2812), ldc:int(2793)))
            expr_76 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(4224), ldc:int(4225)))
            storeelement:Object(expr_76:Object[], and:int(ldc:int(-24867), ldc:int(24866)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_83_1:String, expr_76:Object[]))
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
    
    public void \u527a\u2dcc\u624e\u3bc9\u9a18\u3bd6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_657 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_662 : int
        
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
        var_3_657 = and:int(ldc:int(-1034373378), ldc:int(-1870938369))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u760c\ua61f\ub7dc\u12b2\u12cb[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(32)), ldc:int(0))) {
            var_3_657 = and:int(var_3_657:int, ldc:int(-564906004))
            var_5_80 = and:int(ldc:int(32512), ldc:int(-32641))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-29216), ldc:int(29215)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_657:int, ldc:int(-522913794))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, xor:int(ldc:int(5186), ldc:int(5187)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, xor:int(ldc:int(-24543), ldc:int(-24544)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_657 = and:int(var_3_D0:int, ldc:int(-1177063698))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(4369), ldc:int(17601)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1548781768))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-432037936))
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1976333367))
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1910078732))
                    }
                    else {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-715393044))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0793)
                        }
                    }
                    
                    Label_0401:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(2044505912))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(161809281))
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1713781586))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-312678402))
                            var_11_E1 = and:int(ldc:int(17043), ldc:int(-27284))
                            goto(Label_1499)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1138073845))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-251788741))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1658208595))
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1734117028))
                        goto(Label_0793)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(373538038))
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-556337171))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0793)
                        }
                    }
                    
                    Label_0690:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(435311518))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-252200963))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0793:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1499387312))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1000731327))
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-525329951))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1362173182))
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1477209808))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-674076689))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = and:int(ldc:int(11825), ldc:int(4169))
                                goto(Label_1104)
                            }
                        }
                    }
                    
                    Label_0927:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(417983287))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1046138012))
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1887683768))
                        goto(Label_1210)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0793)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-869122574))
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1577085296))
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-907500372))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1496291330))
                        var_11_E1 = and:int(ldc:int(5697), ldc:int(-5714))
                    }
                    
                    Label_1104:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1543652814))
                        goto(Label_1354)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0927)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0793)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-939423794))
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-505612564))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1354)
                            }
                        }
                    }
                    
                    Label_1210:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(762001318))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1520156416))
                            goto(Label_1104)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(128)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(756656184))
                            goto(Label_0927)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1968516143))
                            goto(Label_0793)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(325846389))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0401)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-805933060))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                            goto(Label_1499)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1354:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1062070440))
                        goto(Label_1510)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1338288705))
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(2007013831))
                        goto(Label_1104)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0793)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(798282434))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0401)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(637076216))
                        loopcontinue()
                    }
                    
                    var_3_657 = and:int(var_3_657:int, ldc:int(-705218564))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1499:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_662 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1510:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1354)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1104)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-939167104))
                        goto(Label_0927)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1779518739))
                        goto(Label_0793)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1136485477))
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1133990480))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0401)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-151378194))
                        var_17_662 = add:int(var_16_10F:int, xor:int(ldc:int(-31992), ldc:int(-31991)))
                        looporswitchbreak()
                    }
                }
                
                var_3_657 = and:int(var_3_657:int, ldc:int(-143399185))
                
                if (cmple:boolean(var_5_80 = var_17_662:int, sub:int(var_6_87:int, xor:int(ldc:int(2596), ldc:int(2597))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
