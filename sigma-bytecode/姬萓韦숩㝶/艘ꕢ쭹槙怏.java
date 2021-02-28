public class \u59ec\u8413\u97e6\uc229\u3776.\u8258\ua562\ucb79\u69d9\u600f {
    public void \u8258\ua562\ucb79\u69d9\u600f() {
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
            invokespecial:Object(Object::<init>, this:\u8258\ua562\ucb79\u69d9\u600f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ub113\u67e9\ube23\u7873\ua562\u71ae(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static com.mojang.brigadier.builder.ArgumentBuilder<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937, ?> \u69d9\u983f\u4ab3\u120d\u071d\u4e72(com.mojang.brigadier.tree.LiteralCommandNode<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, com.mojang.brigadier.builder.LiteralArgumentBuilder<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p1, boolean p2) {
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
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 \u3711\u7873\u12b2\u3e2a\u3711\u927d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.util.Collection<java.lang.String> p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c p2, boolean p3) {
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
            return:\u8413\u5140\u64f2\uc9f6\u9937(invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\u8709\u873d\u624e\u516c\ubefe\u97b7, p0:\u8413\u5140\u64f2\uc9f6\u9937, invokedynamic:ResultConsumer(onCommandComplete:(Ljava/util/Collection;L\u392e\ud7e8\u3bc9\u88c5\ud51e/\u7c6b\ud36e\u8d90\u0800\ua6bd;L\u5d20\u7043\u88c5\u5db4\uf94d/\u4c04\u34df\ua3b4\uc29a\ub70c;Z)Lcom/mojang/brigadier/ResultConsumer;, p1:Collection<String>, invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)), p2:\u4c04\u34df\ua3b4\uc29a\ub70c, p3:boolean), getstatic:BinaryOperator<ResultConsumer<\u8413\u5140\u64f2\uc9f6\u9937>>(\u8258\ua562\ucb79\u69d9\u600f::\u600f\u718f\u61a4\u4f4a\u3e75\ud7e8)))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 \u5245\u3504\uc31c\ubefe\u4f4a\u6c56(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u59ec\u8413\u97e6\uc229\u3776.\u88c5\u3d4b\u7ce1\u4975\u61a4 p1, boolean p2, boolean p3) {
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
            return:\u8413\u5140\u64f2\uc9f6\u9937(invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\u8709\u873d\u624e\u516c\ubefe\u97b7, p0:\u8413\u5140\u64f2\uc9f6\u9937, invokedynamic:ResultConsumer(onCommandComplete:(ZZL\u59ec\u8413\u97e6\uc229\u3776/\u88c5\u3d4b\u7ce1\u4975\u61a4;)Lcom/mojang/brigadier/ResultConsumer;, p3:boolean, p2:boolean, p1:\u88c5\u3d4b\u7ce1\u4975\u61a4), getstatic:BinaryOperator<ResultConsumer<\u8413\u5140\u64f2\uc9f6\u9937>>(\u8258\ua562\ucb79\u69d9\u600f::\u600f\u718f\u61a4\u4f4a\u3e75\ud7e8)))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 \u88c5\u446c\u6bb9\u6198\ubcb0\u64ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u3e2a\u76bc\u16f6\uc229\ua6bd p1, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p2, java.util.function.IntFunction<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab> p3, boolean p4) {
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
            return:\u8413\u5140\u64f2\uc9f6\u9937(invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\u8709\u873d\u624e\u516c\ubefe\u97b7, p0:\u8413\u5140\u64f2\uc9f6\u9937, invokedynamic:ResultConsumer(onCommandComplete:(L\u4492\u8aa5\ud171\uc3e3\u4c2b/\u3e2a\u76bc\u16f6\uc229\ua6bd;ZL\u6b0d\u12cb\u156b\u4179\u8bb0/\ub171\u47c2\u3bd6\u3776\u59ec;Ljava/util/function/IntFunction;)Lcom/mojang/brigadier/ResultConsumer;, p1:\u3e2a\u76bc\u16f6\uc229\ua6bd, p4:boolean, p2:\ub171\u47c2\u3bd6\u3776\u59ec, p3:IntFunction<\u93a2\u97b7\u647c\ud36e\u64ab>), getstatic:BinaryOperator<ResultConsumer<\u8413\u5140\u64f2\uc9f6\u9937>>(\u8258\ua562\ucb79\u69d9\u600f::\u600f\u718f\u61a4\u4f4a\u3e75\ud7e8)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.builder.ArgumentBuilder<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937, ?> \u4cd9\u4179\u5fe1\u4179\u6c56\u7c6b(com.mojang.brigadier.tree.CommandNode<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, com.mojang.brigadier.builder.LiteralArgumentBuilder<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p1, boolean p2) {
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
    
    private static com.mojang.brigadier.Command<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> \u9af2\u4179\u4c04\u16f6\u600f\u516c(boolean p0, \ua562\ucb79\uc87f\u3dd3\ubcb0.\u5bc4\ub113\uc2e8\u7e3f\ub18d p1) {
        var_2_61 : int
        stack_85_0 : Command [generated]
        
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
            var_2_61 = and:int(ldc:int(404810040), ldc:int(2015415865))
            
            if (logicalnot:boolean(p0:boolean)) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1479071103))
                stack_85_0 = invokedynamic:Command(run:(L\ua562\ucb79\uc87f\u3dd3\ubcb0/\u5bc4\ub113\uc2e8\u7e3f\ub18d;)Lcom/mojang/brigadier/Command;, p1:\u5bc4\ub113\uc2e8\u7e3f\ub18d)
            }
            else {
                stack_85_0 = invokedynamic:Command(run:(L\ua562\ucb79\uc87f\u3dd3\ubcb0/\u5bc4\ub113\uc2e8\u7e3f\ub18d;)Lcom/mojang/brigadier/Command;, p1:\u5bc4\ub113\uc2e8\u7e3f\ub18d)
            }
            
            return:Command<\u8413\u5140\u64f2\uc9f6\u9937>(stack_85_0:Command)
        }
        
        goto(Label_0006)
    }
    
    private static int \u8389\u624e\u61a4\ub113\u76bc\u7006(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u3e2a\u76bc\u16f6\uc229\ua6bd p0, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p1) {
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
            return:int(invokevirtual:int(\ub171\u47c2\u3bd6\u3776\u59ec::\u1187\u3c25\ua3b4\u6d99\uc9f6\u6d99, p1:\ub171\u47c2\u3bd6\u3776\u59ec, invokeinterface:\uc31c\uc87f\uc246\u3776\ub7dc[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\u3e2a\u76bc\u16f6\uc229\ua6bd::\ub171\uc3e3\ubff1\ud158\u3711\u0b8e, p0:\u3e2a\u76bc\u16f6\uc229\ua6bd)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean \ua61f\u0800\u3e2a\u71ae\u6d99\ub102(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, java.util.function.BiPredicate<java.lang.Integer, java.lang.Integer> p1) {
        var_4_71 : String
        var_5_82 : \u4c04\u34df\ua3b4\uc29a\ub70c
        var_6_93 : String
        var_7_A4 : \u4c04\u34df\ua3b4\uc29a\ub70c
        var_8_B3 : \u9033\uc2e8\u72f1\u8d98\u6d69
        
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
        var_4_71 = invokestatic:String(\uc2e8\u40a9\u0c95\u9937\ud36e::\u8258\u4d85\u120d\u759a\ud36e\u8aa5, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(1066), ldc:int(1079))))
        var_5_82 = invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u36d3\ubf56\u4d85\u416d\ub102\u52d3, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(12353), ldc:int(12383))))
        var_6_93 = invokestatic:String(\uc2e8\u40a9\u0c95\u9937\ud36e::\u8258\u4d85\u120d\u759a\ud36e\u8aa5, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(18438), ldc:int(18470))))
        var_7_A4 = invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u36d3\ubf56\u4d85\u416d\ub102\u52d3, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(6195), ldc:int(293))))
        var_8_B3 = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>))))
        
        if (logicaland:boolean(invokevirtual:boolean(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u9a18\u62da\u3e2a\u7d52\ucb79\u6b0d, var_8_B3:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], var_4_71:String, var_5_82:\u4c04\u34df\ua3b4\uc29a\ub70c), invokevirtual:boolean(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u9a18\u62da\u3e2a\u7d52\ucb79\u6b0d, var_8_B3:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], var_6_93:String, var_7_A4:\u4c04\u34df\ua3b4\uc29a\ub70c))) {
            return:boolean(invokeinterface:boolean(BiPredicate<Integer, Integer>::test, p1:BiPredicate<Integer, Integer>, invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u9a18\u6cfe\u7d52\u76bc\u4d85\uf995, invokevirtual:\u4c04\ub102\ufcaf\u8d90\u8aa5(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u7e3f\u718f\u7af6\u9033\ud158\u446c, var_8_B3:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], var_4_71:String, var_5_82:\u4c04\u34df\ua3b4\uc29a\ub70c))), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u9a18\u6cfe\u7d52\u76bc\u4d85\uf995, invokevirtual:\u4c04\ub102\ufcaf\u8d90\u8aa5(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u7e3f\u718f\u7af6\u9033\ud158\u446c, var_8_B3:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], var_6_93:String, var_7_A4:\u4c04\u34df\ua3b4\uc29a\ub70c)))))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(12944), ldc:int(-12945)))
    }
    
    private static boolean \ub19c\ubff1\u56bd\u12b2\u6ec6\u1833(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ub83f\u0800\u183a\u3dd3\u647c\uc4d2 p1) {
        var_2_61 : int
        var_4_71 : String
        var_5_82 : \u4c04\u34df\ua3b4\uc29a\ub70c
        var_6_91 : \u9033\uc2e8\u72f1\u8d98\u6d69
        stack_C9_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(494069883), ldc:int(-1846150019))
            var_4_71 = invokestatic:String(\uc2e8\u40a9\u0c95\u9937\ud36e::\u8258\u4d85\u120d\u759a\ud36e\u8aa5, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(381), ldc:int(10269))))
            var_5_82 = invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u36d3\ubf56\u4d85\u416d\ub102\u52d3, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(4926), ldc:int(17438))))
            var_6_91 = invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>))))
            
            if (invokevirtual:boolean(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u9a18\u62da\u3e2a\u7d52\ucb79\u6b0d, var_6_91:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], var_4_71:String, var_5_82:\u4c04\u34df\ua3b4\uc29a\ub70c)) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-78320523))
                stack_C9_0 = invokevirtual:boolean[expected:int](\ub83f\u0800\u183a\u3dd3\u647c\uc4d2::\uc3e3\u6ec6\u4bc8\ube23\u64f2\uc84e, p1:\ub83f\u0800\u183a\u3dd3\u647c\uc4d2, invokevirtual:int(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u9a18\u6cfe\u7d52\u76bc\u4d85\uf995, invokevirtual:\u4c04\ub102\ufcaf\u8d90\u8aa5(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u7e3f\u718f\u7af6\u9033\ud158\u446c, var_6_91:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd], var_4_71:String, var_5_82:\u4c04\u34df\ua3b4\uc29a\ub70c)))
            }
            else {
                stack_C9_0 = and:int(ldc:int(29204), ldc:int(-29206))
            }
            
            return:boolean(stack_C9_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u6435\u8709\u516c\ub1b9\ua6bd\uafe7(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u67d0\u36d3\uae5d\u99f7\u9a18 p1) {
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
            return:boolean(invokeinterface:boolean(Predicate<\uf9c5\u7043\u0c95\u76bc\u8389>::test, p1:\u67d0\u36d3\uae5d\u99f7\u9a18[expected:Predicate<\uf9c5\u7043\u0c95\u76bc\u8389>], invokevirtual:\uf9c5\u7043\u0c95\u76bc\u8389(\u6c52\ucfaf\uc910\u527a\uc9f6::\u2dcc\u494c\uf995\u6bb9\ud217\ub32d, invokevirtual:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::\u3e2a\u7ce1\u6b0d\u7049\u3e75\u98a4, invokevirtual:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::\u4c2b\u927d\ubf56\u1833\u6d99\ube23, initobject:\u6c52\ucfaf\uc910\u527a\uc9f6(\u6c52\ucfaf\uc910\u527a\uc9f6::<init>, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, p0:\u8413\u5140\u64f2\uc9f6\u9937)), getstatic:\u93a2\u64f2\ud217\u69d9\u4bc8<\u3a62\u5d20\u4f52\uc229\u8308\ud7e8>(\ub1b9\uc29a\u74b1\uae87\u36d3::\u759a\u3a62\uc229\uc84e\u61a4\u718f), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u8413\u5140\u64f2\uc9f6\u9937::\u59ec\ubf56\ucef1\ubcb0\ubb2b\u6435, p0:\u8413\u5140\u64f2\uc9f6\u9937)), getstatic:\u93a2\u64f2\ud217\u69d9\u4bc8<\u7d52\u718f\u3776\u6fb0\ub83f>(\ub1b9\uc29a\u74b1\uae87\u36d3::\u8413\u64f2\u600f\u965f\u62da\ud171), invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u8413\u5140\u64f2\uc9f6\u9937::\ud171\uf94d\ub6ab\u6b0d\uae5d\u6d99, p0:\u8413\u5140\u64f2\uc9f6\u9937)), getstatic:\u4bc8\uf9c5\u6b5f\u7006\ub171(\ubf56\u4d85\u8aa5\ub102\u56bd::\u7c6b\ub32d\u647c\u71f1\u6fb0\u98a4))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Collection<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> \u392e\u72f1\u4f52\ua562\uc87f\u52d3(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, boolean p1, boolean p2) {
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
            return:Collection<\u8413\u5140\u64f2\uc9f6\u9937>(ternaryop:Object[expected:Collection<\u8413\u5140\u64f2\uc9f6\u9937>](cmpne:boolean(p2:boolean, p1:boolean), invokestatic:List<Object>[expected:Object](Collections::emptyList), invokestatic:Set<Object>[expected:Object](Collections::singleton, invokevirtual:Object(CommandContext::getSource, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.builder.ArgumentBuilder<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937, ?> \ub70c\u7043\u600f\u4179\u12b2\u5fe1(com.mojang.brigadier.tree.CommandNode<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, com.mojang.brigadier.builder.ArgumentBuilder<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937, ?> p1, boolean p2, \u4f52\u6cfe\u9a18\uc29a\u3bd6.\ua3b4\u51b2\uc2bd\ua562\u51fa p3) {
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
            return:ArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937, ?>(invokevirtual:ArgumentBuilder(ArgumentBuilder::executes, invokevirtual:ArgumentBuilder(ArgumentBuilder::fork, p1:ArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937, ?>, p0:CommandNode<\u8413\u5140\u64f2\uc9f6\u9937>, invokedynamic:RedirectModifier(apply:(ZL\u4f52\u6cfe\u9a18\uc29a\u3bd6/\ua3b4\u51b2\uc2bd\ua562\u51fa;)Lcom/mojang/brigadier/RedirectModifier;, p2:boolean, p3:\ua3b4\u51b2\uc2bd\ua562\u51fa)), invokedynamic:Command(run:(ZL\u4f52\u6cfe\u9a18\uc29a\u3bd6/\ua3b4\u51b2\uc2bd\ua562\u51fa;)Lcom/mojang/brigadier/Command;, p2:boolean, p3:\ua3b4\u51b2\uc2bd\ua562\u51fa)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.builder.ArgumentBuilder<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937, ?> \u965f\u7043\u983f\u156b\ua61f\uc84e(com.mojang.brigadier.tree.CommandNode<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, com.mojang.brigadier.builder.ArgumentBuilder<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937, ?> p1, boolean p2, boolean p3) {
        var_4_63 : int
        stack_98_0 : ArgumentBuilder [generated]
        stack_98_1 : Command [generated]
        
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
            var_4_63 = and:int(ldc:int(1823747505), ldc:int(747809243))
            stack_98_0 = invokevirtual:ArgumentBuilder(ArgumentBuilder::fork, p1:ArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937, ?>, p0:CommandNode<\u8413\u5140\u64f2\uc9f6\u9937>, invokedynamic:RedirectModifier(apply:(ZZ)Lcom/mojang/brigadier/RedirectModifier;, p2:boolean, p3:int))
            
            if (logicalnot:boolean(p2:boolean)) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-325378679))
                stack_98_1 = invokedynamic:Command(run:(Z)Lcom/mojang/brigadier/Command;, p3:int)
            }
            else {
                stack_98_1 = invokedynamic:Command(run:(Z)Lcom/mojang/brigadier/Command;, p3:int)
            }
            
            return:ArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937, ?>(invokevirtual:ArgumentBuilder(ArgumentBuilder::executes, stack_98_0:ArgumentBuilder, stack_98_1:Command))
        }
        
        goto(Label_0006)
    }
    
    private static int \u927d\ua3b4\u7330\u8df4\u99f7\u0a06(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, boolean p1) {
        var_4_67 : OptionalInt
        stack_BD_0 : \u8413\u5140\u64f2\uc9f6\u9937 [generated]
        stack_B3_1 : String [generated]
        expr_9F : Object[] [generated]
        
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
        var_4_67 = invokestatic:OptionalInt(\u8258\ua562\ucb79\u69d9\u600f::\ub1b9\ud171\u7e3f\ub1b9\u6bb9\uae5d, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, p1:boolean)
        
        if (logicalnot:boolean(invokevirtual:boolean(OptionalInt::isPresent, var_4_67:OptionalInt))) {
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u8258\ua562\ucb79\u69d9\u600f::\uf9c5\ub171\u12b2\uf995\u5d20\ub32d)))
        }
        
        stack_BD_0 = checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>))
        stack_B3_1 = loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(2483), ldc:int(1589)))
        expr_9F = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(291), ldc:int(290)))
        storeelement:Object(expr_9F:Object[], and:int(ldc:int(4111), ldc:int(-4112)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(OptionalInt::getAsInt, var_4_67:OptionalInt)))
        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, stack_BD_0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_B3_1:String, expr_9F:Object[]), and:int[expected:boolean](ldc:int(27676), ldc:int(-27677)))
        return:int(invokevirtual:int(OptionalInt::getAsInt, var_4_67:OptionalInt))
    }
    
    private static int \ud12e\ub18d\ud158\ud36e\ub8be\u56bd(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, boolean p1) {
        var_4_67 : OptionalInt
        
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
        var_4_67 = invokestatic:OptionalInt(\u8258\ua562\ucb79\u69d9\u600f::\ub1b9\ud171\u7e3f\ub1b9\u6bb9\uae5d, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, p1:boolean)
        
        if (logicalnot:boolean(invokevirtual:boolean(OptionalInt::isPresent, var_4_67:OptionalInt))) {
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>)), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(-29605), ldc:int(-29591)))), and:int[expected:boolean](ldc:int(17286), ldc:int(-17287)))
            return:int(xor:int(ldc:int(4104), ldc:int(4105)))
        }
        
        athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u8258\ua562\ucb79\u69d9\u600f::\uf9c5\u4c04\uafe7\uc3e3\u88c5\u7049), invokestatic:Integer(Integer::valueOf, invokevirtual:int(OptionalInt::getAsInt, var_4_67:OptionalInt))))
    }
    
    private static java.util.OptionalInt \ub1b9\ud171\u7e3f\ub1b9\u6bb9\uae5d(com.mojang.brigadier.context.CommandContext<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0, boolean p1) {
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
            return:OptionalInt(invokestatic:OptionalInt(\u8258\ua562\ucb79\u69d9\u600f::\ub1b9\ud171\u7e3f\ub1b9\u6bb9\uae5d, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(12348), ldc:int(12309)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(18469), ldc:int(18447)))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext<\u8413\u5140\u64f2\uc9f6\u9937>, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(5611), ldc:int(555)))), p1:boolean))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.OptionalInt \ub1b9\ud171\u7e3f\ub1b9\u6bb9\uae5d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3, boolean p4) {
        var_5_63 : int
        var_7_6E : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        var_8_81 : \ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6
        var_9_AB : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_10_BE : int
        var_5_158 : int
        var_11_D7 : int
        var_12_DE : int
        var_13_121 : int
        var_5_1AB : int
        var_14_174 : int
        var_5_1FF : int
        var_15_1CF : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_16_1D8 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_17_1E0 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_5_224 : int
        var_18_22C : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        var_19_234 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        var_20_2B2 : \uc31c\uc87f\uc246\u3776\ub7dc
        var_21_2F0 : \uc31c\uc87f\uc246\u3776\ub7dc
        
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
        var_5_63 = and:int(ldc:int(56958118), ldc:int(-1901007563))
        var_7_6E = initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
        var_8_81 = initobject:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::<init>, p3:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, p3:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u3a62\uc9f6\u3776\u4f52\ua068\u34df(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\uf9c5\u6b0d\u4bc8\u3e2a\ud36e\u40a9, var_7_6E:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)))
        var_9_AB = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, sub:int(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, var_8_81:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, var_7_6E:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), sub:int(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, var_8_81:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, var_7_6E:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), sub:int(getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, var_8_81:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, var_7_6E:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)))
        var_10_BE = mul:int(mul:int(invokevirtual:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4d85\u34df\u4bc8\u72f1\ubded\ub7dc, var_7_6E:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), invokevirtual:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u64f2\ub1b9\uae5d\u3c25\uc4d2\u8389, var_7_6E:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), invokevirtual:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\uc9f6\ub83f\u7330\ufe34\u8258\ucfaf, var_7_6E:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))
        
        if (cmple:boolean(var_10_BE:int, ldc:int(32768))) {
            var_5_158 = and:int(var_5_63:int, ldc:int(1940052926))
            var_11_D7 = and:int(ldc:int(29058), ldc:int(-29063))
            var_12_DE = getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, var_7_6E:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
            
            while (cmple:boolean(var_12_DE:int, getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4daf\u3bc9\u98a4\u6ec6\u16f6\u3d64, var_7_6E:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))) {
                var_13_121 = getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, var_7_6E:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
                
                loop {
                    Label_0291:
                    
                    if (cmpeq:boolean(and:int(var_5_158:int, ldc:int(4)), ldc:int(0))) {
                        var_5_1AB = and:int(var_5_158:int, ldc:int(1582641691))
                    }
                    else {
                        var_5_1AB = and:int(var_5_158:int, ldc:int(-1099900241))
                        
                        if (cmple:boolean(var_13_121:int, getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4e72\uc238\u5245\ud217\u3d64\ub8be, var_7_6E:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))) {
                            var_14_174 = getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, var_7_6E:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
                            
                            loop {
                                if (cmpne:boolean(and:int(var_5_1AB:int, ldc:int(8192)), ldc:int(0))) {
                                    var_5_1FF = and:int(var_5_1AB:int, ldc:int(-985351606))
                                }
                                else {
                                    var_5_1FF = and:int(var_5_1AB:int, ldc:int(-2098542602))
                                    
                                    if (cmple:boolean(var_14_174:int, getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\ube23\uc7fe\u927d\u873d\ud36e\u8cae, var_7_6E:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))) {
                                        var_15_1CF = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, var_14_174:int, var_13_121:int, var_12_DE:int)
                                        var_16_1D8 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, var_15_1CF:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_9_AB:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])
                                        var_17_1E0 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_15_1CF:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                                        
                                        if (p4:boolean) {
                                            if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_17_1E0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd))) {
                                                goto(Label_0600)
                                            }
                                        }
                                        
                                        Label_0487:
                                        
                                        if (cmpne:boolean(and:int(var_5_1FF:int, ldc:int(8)), ldc:int(0))) {
                                            goto(Label_0600)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_5_1FF:int, ldc:int(536870912)), ldc:int(0))) {
                                            var_5_1FF = and:int(var_5_1FF:int, ldc:int(1579692287))
                                            
                                            if (cmpne:boolean(var_17_1E0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_16_1D8:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                                                return:OptionalInt(invokestatic:OptionalInt(OptionalInt::empty))
                                            }
                                        }
                                        
                                        Label_0524:
                                        
                                        if (cmpeq:boolean(and:int(var_5_1FF:int, ldc:int(8192)), ldc:int(0))) {
                                            if (cmpne:boolean(and:int(var_5_1FF:int, ldc:int(512)), ldc:int(0))) {
                                                goto(Label_0487)
                                            }
                                            
                                            var_5_224 = and:int(var_5_1FF:int, ldc:int(2113715508))
                                            var_18_22C = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_15_1CF:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                                            var_19_234 = invokevirtual:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc2e8\u5db4\u3e2a\uc3e3\u5f50\ud158, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_16_1D8:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                                            
                                            if (cmpne:boolean(var_18_22C:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                                                if (cmpeq:boolean(var_19_234:\ub83f\uc9f6\u47c2\u67d0\u7ce1, aconstnull:\ub83f\uc9f6\u47c2\u67d0\u7ce1())) {
                                                    return:OptionalInt(invokestatic:OptionalInt(OptionalInt::empty))
                                                }
                                                
                                                var_5_224 = and:int(var_5_224:int, ldc:int(-856846019))
                                                var_20_2B2 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u7e3f\uc229\u34df\u61a4\ud7e8\u6b0d, var_18_22C:\ub83f\uc9f6\u47c2\u67d0\u7ce1, initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>))
                                                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u8350\ubded\u5d20\u071d\u946b\u4f4a, var_20_2B2:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(55), ldc:int(1331))))
                                                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u8350\ubded\u5d20\u071d\u946b\u4f4a, var_20_2B2:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(1660), ldc:int(18484))))
                                                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u8350\ubded\u5d20\u071d\u946b\u4f4a, var_20_2B2:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(4215), ldc:int(16693))))
                                                var_21_2F0 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u7e3f\uc229\u34df\u61a4\ud7e8\u6b0d, var_19_234:\ub83f\uc9f6\u47c2\u67d0\u7ce1, initobject:\uc31c\uc87f\uc246\u3776\ub7dc(\uc31c\uc87f\uc246\u3776\ub7dc::<init>))
                                                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u8350\ubded\u5d20\u071d\u946b\u4f4a, var_21_2F0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(8247), ldc:int(21435))))
                                                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u8350\ubded\u5d20\u071d\u946b\u4f4a, var_21_2F0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(163), ldc:int(151))))
                                                invokevirtual:void(\uc31c\uc87f\uc246\u3776\ub7dc::\u8350\ubded\u5d20\u071d\u946b\u4f4a, var_21_2F0:\uc31c\uc87f\uc246\u3776\ub7dc, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(53), ldc:int(19509))))
                                                
                                                if (logicalnot:boolean(invokevirtual:boolean(\uc31c\uc87f\uc246\u3776\ub7dc::equals, var_20_2B2:\uc31c\uc87f\uc246\u3776\ub7dc, var_21_2F0:\uc31c\uc87f\uc246\u3776\ub7dc[expected:Object]))) {
                                                    return:OptionalInt(invokestatic:OptionalInt(OptionalInt::empty))
                                                }
                                            }
                                            
                                            var_5_1FF = and:int(var_5_224:int, ldc:int(-1967794138))
                                            inc:int(var_11_D7, ldc:int(1))
                                        }
                                        
                                        Label_0600:
                                        
                                        if (cmpne:boolean(and:int(var_5_1FF:int, ldc:int(8192)), ldc:int(0))) {
                                            var_5_1FF = and:int(var_5_1FF:int, ldc:int(-1319464601))
                                            goto(Label_0524)
                                        }
                                        
                                        if (cmpeq:boolean(and:int(var_5_1FF:int, ldc:int(512)), ldc:int(0))) {
                                            var_5_1AB = and:int(var_5_1FF:int, ldc:int(719939380))
                                            inc:int(var_14_174, ldc:int(1))
                                            loopcontinue()
                                        }
                                        
                                        goto(Label_0487)
                                    }
                                }
                                
                                if (cmpeq:boolean(and:int(var_5_1FF:int, ldc:int(16)), ldc:int(0))) {
                                    var_5_158 = and:int(var_5_1FF:int, ldc:int(154761068))
                                    inc:int(var_13_121, ldc:int(1))
                                    loopcontinue(Label_0291)
                                }
                                
                                var_5_1AB = and:int(var_5_1FF:int, ldc:int(-144369151))
                            }
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_5_1AB:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_5_158 = and:int(var_5_1AB:int, ldc:int(-130696707))
                        inc:int(var_12_DE, ldc:int(1))
                        looporswitchbreak()
                    }
                    
                    var_5_158 = and:int(var_5_1AB:int, ldc:int(-84261030))
                }
            }
            
            return:OptionalInt(invokestatic:OptionalInt(OptionalInt::of, var_11_D7:int))
        }
        
        athrow(invokevirtual:CommandSyntaxException(Dynamic2CommandExceptionType::create, getstatic:Dynamic2CommandExceptionType(\u8258\ua562\ucb79\u69d9\u600f::\u5fe1\u946b\u97b7\u67d0\u446c\ufcaf), invokestatic:Integer[expected:Object](Integer::valueOf, ldc:int(32768)), invokestatic:Integer(Integer::valueOf, var_10_BE:int)))
    }
    
    private static int lambda$\u67e9\u4f4a\ub102\ub18d\u3a62\u0b8e$61(boolean p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u8258\ua562\ucb79\u69d9\u600f::\ud12e\ub18d\ud158\ud36e\ub8be\u56bd, p1:CommandContext, p0:boolean))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u6fb0\u4daf\u97e6\ub8be\u8258\u6fb0$60(boolean p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u8258\ua562\ucb79\u69d9\u600f::\u927d\ua3b4\u7330\u8df4\u99f7\u0a06, p1:CommandContext, p0:boolean))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Collection lambda$\ub32d\u7e3f\u8640\u76bc\u12b2\u51fa$59(boolean p0, boolean p1, com.mojang.brigadier.context.CommandContext p2) {
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
            return:Collection(invokestatic:Collection<\u8413\u5140\u64f2\uc9f6\u9937>(\u8258\ua562\ucb79\u69d9\u600f::\u392e\u72f1\u4f52\ua562\uc87f\u52d3, p2:CommandContext, p0:boolean, invokevirtual:boolean(OptionalInt::isPresent, invokestatic:OptionalInt(\u8258\ua562\ucb79\u69d9\u600f::\ub1b9\ud171\u7e3f\ub1b9\u6bb9\uae5d, p2:CommandContext, p1:boolean))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u3504\u600f\u527a\u16f6\u34df\u8709$58(boolean p0, \u4f52\u6cfe\u9a18\uc29a\u3bd6.\ua3b4\u51b2\uc2bd\ua562\u51fa p1, com.mojang.brigadier.context.CommandContext p2) {
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
        
        if (cmpne:boolean(p0:boolean, invokeinterface:boolean(\ua3b4\u51b2\uc2bd\ua562\u51fa::\u7043\u67d0\u446c\u965f\u51b2\u6ec6, p1:\ua3b4\u51b2\uc2bd\ua562\u51fa, p2:CommandContext))) {
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u8258\ua562\ucb79\u69d9\u600f::\uf9c5\ub171\u12b2\uf995\u5d20\ub32d)))
        }
        
        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p2:CommandContext)), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(4099), ldc:int(4145)))), and:int[expected:boolean](ldc:int(4912), ldc:int(-29617)))
        return:int(xor:int(ldc:int(808), ldc:int(809)))
    }
    
    private static java.util.Collection lambda$\u6d99\ub83f\uc2bd\u9937\u494c\ucb79$57(boolean p0, \u4f52\u6cfe\u9a18\uc29a\u3bd6.\ua3b4\u51b2\uc2bd\ua562\u51fa p1, com.mojang.brigadier.context.CommandContext p2) {
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
            return:Collection(invokestatic:Collection<\u8413\u5140\u64f2\uc9f6\u9937>(\u8258\ua562\ucb79\u69d9\u600f::\u392e\u72f1\u4f52\ua562\uc87f\u52d3, p2:CommandContext, p0:boolean, invokeinterface:boolean(\ua3b4\u51b2\uc2bd\ua562\u51fa::\u7043\u67d0\u446c\u965f\u51b2\u6ec6, p1:\ua3b4\u51b2\uc2bd\ua562\u51fa, p2:CommandContext)))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u7330\ub1b9\u7330\ud7e8\u4cd9\uc29a$56(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u5bc4\ub113\uc2e8\u7e3f\ub18d p0, com.mojang.brigadier.context.CommandContext p1) {
        var_4_69 : int
        
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
        var_4_69 = invokeinterface:int(\u5bc4\ub113\uc2e8\u7e3f\ub18d::\ucef1\u99f7\ube23\ua562\u74b1\uff55, p0:\u5bc4\ub113\uc2e8\u7e3f\ub18d, p1:CommandContext)
        
        if (cmpne:boolean(var_4_69:int, ldc:int(0))) {
            athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\u8258\ua562\ucb79\u69d9\u600f::\uf9c5\u4c04\uafe7\uc3e3\u88c5\u7049), invokestatic:Integer(Integer::valueOf, var_4_69:int)))
        }
        
        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(17975), ldc:int(242)))), and:int[expected:boolean](ldc:int(23128), ldc:int(-23257)))
        return:int(xor:int(ldc:int(6240), ldc:int(6241)))
    }
    
    private static int lambda$\uc246\u3d4b\uc2e8\u600f\uc87f\u7af6$55(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u5bc4\ub113\uc2e8\u7e3f\ub18d p0, com.mojang.brigadier.context.CommandContext p1) {
        var_4_69 : int
        stack_B9_0 : \u8413\u5140\u64f2\uc9f6\u9937 [generated]
        stack_AF_1 : String [generated]
        expr_9E : Object[] [generated]
        
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
        var_4_69 = invokeinterface:int(\u5bc4\ub113\uc2e8\u7e3f\ub18d::\ucef1\u99f7\ube23\ua562\u74b1\uff55, p0:\u5bc4\ub113\uc2e8\u7e3f\ub18d, p1:CommandContext)
        
        if (cmple:boolean(var_4_69:int, ldc:int(0))) {
            athrow(invokevirtual:CommandSyntaxException(SimpleCommandExceptionType::create, getstatic:SimpleCommandExceptionType(\u8258\ua562\ucb79\u69d9\u600f::\uf9c5\ub171\u12b2\uf995\u5d20\ub32d)))
        }
        
        stack_B9_0 = checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext))
        stack_AF_1 = loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(-19941), ldc:int(-19926)))
        expr_9E = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1089), ldc:int(18849)))
        storeelement:Object(expr_9E:Object[], and:int(ldc:int(-31725), ldc:int(15304)), invokestatic:Integer[expected:Object](Integer::valueOf, var_4_69:int))
        invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, stack_B9_0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_AF_1:String, expr_9E:Object[]), and:int[expected:boolean](ldc:int(18721), ldc:int(-22834)))
        return:int(var_4_69:int)
    }
    
    private static com.mojang.brigadier.builder.ArgumentBuilder lambda$\u5db4\ufe34\uf995\u97e6\u8bb0\uc7fe$54(com.mojang.brigadier.tree.CommandNode p0, boolean p1, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p2, com.mojang.brigadier.builder.ArgumentBuilder p3) {
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
    
    private static int lambda$\u5f50\u0c95\u0800\ubcb0\ubefe\u8258$53(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:int(invokestatic:int(\u8258\ua562\ucb79\u69d9\u600f::\u8389\u624e\u61a4\ub113\u76bc\u7006, invokeinterface:\u3e2a\u76bc\u16f6\uc229\ua6bd(\u0a06\u1833\u64f2\ud217\u183a::\u88c5\uf995\ud51e\ube23\u40a9\u97b7, p0:\u0a06\u1833\u64f2\ud217\u183a, p1:CommandContext), invokestatic:\ub171\u47c2\u3bd6\u3776\u59ec(\u64ab\u7d52\u5f50\uc3e3\ubb2b::\u16f6\ufe34\ub102\u16f6\u760c\ud51e, p1:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(1058), ldc:int(1044))))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Collection lambda$\u183a\u71ae\ubf56\u6d69\u4e72\u3d4b$52(boolean p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p1, com.mojang.brigadier.context.CommandContext p2) {
        var_3_61 : int
        stack_A1_2 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(-1348583394), ldc:int(1609008029))
            
            if (cmple:boolean(invokestatic:int(\u8258\ua562\ucb79\u69d9\u600f::\u8389\u624e\u61a4\ub113\u76bc\u7006, invokeinterface:\u3e2a\u76bc\u16f6\uc229\ua6bd(\u0a06\u1833\u64f2\ud217\u183a::\u88c5\uf995\ud51e\ube23\u40a9\u97b7, p1:\u0a06\u1833\u64f2\ud217\u183a, p2:CommandContext), invokestatic:\ub171\u47c2\u3bd6\u3776\u59ec(\u64ab\u7d52\u5f50\uc3e3\ubb2b::\u16f6\ufe34\ub102\u16f6\u760c\ud51e, p2:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(1334), ldc:int(190))))), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(1070883807))
                stack_A1_2 = and:int(ldc:int(-5770), ldc:int(5769))
            }
            else {
                stack_A1_2 = and:int(ldc:int(5705), ldc:int(16389))
            }
            
            return:Collection(invokestatic:Collection<\u8413\u5140\u64f2\uc9f6\u9937>(\u8258\ua562\ucb79\u69d9\u600f::\u392e\u72f1\u4f52\ua562\uc87f\u52d3, p2:CommandContext, p0:boolean, stack_A1_2:boolean))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ubded\u071d\u56bd\ua61f\u64f2\u0800$51(com.mojang.brigadier.context.CommandContext p0) {
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
            return:boolean(invokestatic:boolean(\u8258\ua562\ucb79\u69d9\u600f::\u6435\u8709\u516c\ub1b9\ua6bd\uafe7, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u67d0\u36d3\uae5d\u99f7\u9a18(\u59ec\u92ee\u7c6b\u34df\u8d98::\u416d\u965f\u99f7\u9a18\u9255\u183a, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(5200), ldc:int(5247))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ud158\u527a\u0800\u4f4a\u61a4\u4f52$50(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokeinterface:int(Collection<E>::size, invokestatic:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u600f\u9937\ub8be\ud171\u624e::\u72f1\u946b\u67d0\u5db4\ub70c\u4179, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(16392), ldc:int(16422))))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Collection lambda$\u99f7\ubcb0\u97e6\u67e9\u51b2\u8709$49(boolean p0, com.mojang.brigadier.context.CommandContext p1) {
        var_2_61 : int
        stack_9C_2 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-430647935), ldc:int(-407586878))
            
            if (invokeinterface:boolean(Collection<E>::isEmpty, invokestatic:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u600f\u9937\ub8be\ud171\u624e::\u72f1\u946b\u67d0\u5db4\ub70c\u4179, p1:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(47), ldc:int(6830)))))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-4858367))
                stack_9C_2 = and:int(ldc:int(-29353), ldc:int(29352))
            }
            else {
                stack_9C_2 = xor:int(ldc:int(18432), ldc:int(18433))
            }
            
            return:Collection(invokestatic:Collection<\u8413\u5140\u64f2\uc9f6\u9937>(\u8258\ua562\ucb79\u69d9\u600f::\u392e\u72f1\u4f52\ua562\uc87f\u52d3, p1:CommandContext, p0:boolean, stack_9C_2:boolean))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u6198\uceb8\ud12e\u839e\u071d\ub6ab$48(com.mojang.brigadier.context.CommandContext p0) {
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
            return:boolean(invokestatic:boolean(\u8258\ua562\ucb79\u69d9\u600f::\ub19c\ubff1\u56bd\u12b2\u6ec6\u1833, p0:CommandContext, invokestatic:\ub83f\u0800\u183a\u3dd3\u647c\uc4d2(\u6c52\ub1b9\uc7fe\ucfaf\u5d20::\u2dcc\u4f4a\u718f\u4975\ud158\ub32d, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(10855), ldc:int(1199))))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8640\u1833\u0c95\ufcaf\u4e72\ucef1$47(com.mojang.brigadier.context.CommandContext p0) {
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
    
    private static boolean lambda$\u836c\u6198\u98a4\u8df4\u983f\u3d64$46(java.lang.Integer p0, java.lang.Integer p1) {
        var_2_61 : int
        stack_8E_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(1012811671), ldc:int(-84279313))
            
            if (cmplt:boolean(invokevirtual:int(Integer::intValue, p0:Integer), invokevirtual:int(Integer::intValue, p1:Integer))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-17244187))
                stack_8E_0 = and:int(ldc:int(-17816), ldc:int(16787))
            }
            else {
                stack_8E_0 = and:int(ldc:int(9827), ldc:int(18461))
            }
            
            return:boolean(stack_8E_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uc910\u71ae\u8258\ufcaf\u7d52\u3dd3$45(com.mojang.brigadier.context.CommandContext p0) {
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
    
    private static boolean lambda$\uc3e3\u4daf\u3c25\u516c\u3a62\u56bd$44(java.lang.Integer p0, java.lang.Integer p1) {
        var_2_61 : int
        stack_8E_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(547614025), ldc:int(-1169993913))
            
            if (cmple:boolean(invokevirtual:int(Integer::intValue, p0:Integer), invokevirtual:int(Integer::intValue, p1:Integer))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(613633361))
                stack_8E_0 = and:int(ldc:int(18833), ldc:int(-27026))
            }
            else {
                stack_8E_0 = xor:int(ldc:int(2304), ldc:int(2305))
            }
            
            return:boolean(stack_8E_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u34df\u76bc\u7e3f\u446c\u4975\u4bc8$43(com.mojang.brigadier.context.CommandContext p0) {
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
    
    private static boolean lambda$\u6b5f\uc84e\u7bad\u8258\u8cae\u3bd6$42(java.lang.Integer p0, java.lang.Integer p1) {
        var_2_61 : int
        stack_8E_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-450094269), ldc:int(-8451189))
            
            if (cmpgt:boolean(invokevirtual:int(Integer::intValue, p0:Integer), invokevirtual:int(Integer::intValue, p1:Integer))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1217504405))
                stack_8E_0 = and:int(ldc:int(2741), ldc:int(-2750))
            }
            else {
                stack_8E_0 = xor:int(ldc:int(8448), ldc:int(8449))
            }
            
            return:boolean(stack_8E_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u6bb9\u9033\u16f6\u4cd9\u392e\u6c56$41(com.mojang.brigadier.context.CommandContext p0) {
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
    
    private static boolean lambda$\u8389\u494c\u527a\u8753\ub1b9\u8640$40(java.lang.Integer p0, java.lang.Integer p1) {
        var_2_61 : int
        stack_8E_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-84098392), ldc:int(-236040591))
            
            if (cmpge:boolean(invokevirtual:int(Integer::intValue, p0:Integer), invokevirtual:int(Integer::intValue, p1:Integer))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-704872836))
                stack_8E_0 = and:int(ldc:int(-1573), ldc:int(1572))
            }
            else {
                stack_8E_0 = xor:int(ldc:int(9296), ldc:int(9297))
            }
            
            return:boolean(stack_8E_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u4cd9\u5d20\u8350\ub8be\u76bc\u8709$39(com.mojang.brigadier.context.CommandContext p0) {
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
            return:boolean(invokestatic:boolean(\u8258\ua562\ucb79\u69d9\u600f::\ua61f\u0800\u3e2a\u71ae\u6d99\ub102, p0:CommandContext, invokedynamic:BiPredicate<Integer, Integer>(test:()Ljava/util/function/BiPredicate;)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u9033\uc87f\u8df4\u836c\u8709\u92ee$38(com.mojang.brigadier.context.CommandContext p0) {
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
            return:boolean(invokeinterface:boolean(Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>::test, invokestatic:Predicate<\u839e\u8389\ua562\uc7fe\u76bc\ube23>(\u8bb0\u5f50\u760c\u7af6\u760c::\uae87\u92ff\u624e\u8aa5\ud158\ua61f, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(-31846), ldc:int(-31866)))), initobject:\u839e\u8389\ua562\uc7fe\u76bc\ube23(\u839e\u8389\ua562\uc7fe\u76bc\ube23::<init>, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a](\u8413\u5140\u64f2\uc9f6\u9937::\ube23\u7043\ubded\u759a\u74b1\u5f50, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))), invokestatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u8413\uc2e8\u3e2a\u7043\uc9f6::\u59ec\ubff1\u8709\uff55\uc29a\uc3e3, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(-16255), ldc:int(-16246)))), and:int[expected:boolean](ldc:int(11777), ldc:int(57)))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ub8be\ub70c\u8308\u8350\u3bc9\ua61f$37(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u3e2a\u76bc\u16f6\uc229\ua6bd p0, boolean p1, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub171\u47c2\u3bd6\u3776\u59ec p2, java.util.function.IntFunction p3, com.mojang.brigadier.context.CommandContext p4, boolean p5, int p6) {
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
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab lambda$\u8bb0\u6ec6\ua61f\ub32d\u4492\u6d69$36(java.util.function.IntFunction p0, int p1) {
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
            return:\u93a2\u97b7\u647c\ud36e\u64ab(checkcast:\u93a2\u97b7\u647c\ud36e\u64ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab.class, invokeinterface:\u93a2\u97b7\u647c\ud36e\u64ab(IntFunction<\u93a2\u97b7\u647c\ud36e\u64ab>::apply, p0:IntFunction<\u93a2\u97b7\u647c\ud36e\u64ab>, p1:int)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ucfaf\uc2e8\u67d0\u4f4a\u6d99\u71f1$35(boolean p0, boolean p1, \u59ec\u8413\u97e6\uc229\u3776.\u88c5\u3d4b\u7ce1\u4975\u61a4 p2, com.mojang.brigadier.context.CommandContext p3, boolean p4, int p5) {
        var_6_99 : int
        stack_C1_0 : int [generated]
        var_6_BF : int
        var_8_C1 : int
        
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
            var_6_99 = and:int(ldc:int(618500408), ldc:int(-1212350529))
            
            if (logicalnot:boolean(p0:boolean)) {
                loop {
                    if (cmpeq:boolean(and:int(var_6_99:int, ldc:int(2097152)), ldc:int(0))) {
                        var_6_99 = and:int(var_6_99:int, ldc:int(1188878515))
                        
                        if (p4:boolean) {
                            stack_C1_0 = and:int(ldc:int(8717), ldc:int(321))
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_6_99:int, ldc:int(32)), ldc:int(0))) {
                        var_6_99 = and:int(var_6_99:int, ldc:int(-975767255))
                        stack_C1_0 = and:int(ldc:int(4875), ldc:int(-4960))
                        looporswitchbreak()
                    }
                    
                    var_6_99 = and:int(var_6_99:int, ldc:int(1529351585))
                }
            }
            else {
                stack_C1_0 = p5:int
            }
            
            var_6_BF = and:int(var_6_99:int, ldc:int(-946357323))
            var_8_C1 = stack_C1_0:int
            
            if (logicalnot:boolean(p1:boolean)) {
                var_6_BF = and:int(var_6_BF:int, ldc:int(-554246931))
                invokevirtual:void(\u88c5\u3d4b\u7ce1\u4975\u61a4::\u6fb0\u1187\u12b2\ua068\u5245\u67e9, p2:\u88c5\u3d4b\u7ce1\u4975\u61a4, var_8_C1:int)
            }
            else {
                invokevirtual:void(\u88c5\u3d4b\u7ce1\u4975\u61a4::\uc2e8\ucef1\u64ab\u3776\u71f1\u56bd, p2:\u88c5\u3d4b\u7ce1\u4975\u61a4, var_8_C1:int)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ub171\u156b\uc2bd\u8350\u7006\uafe7$34(java.util.Collection p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u7c6b\ud36e\u8d90\u0800\ua6bd p1, \u5d20\u7043\u88c5\u5db4\uf94d.\u4c04\u34df\ua3b4\uc29a\ub70c p2, boolean p3, com.mojang.brigadier.context.CommandContext p4, boolean p5, int p6) {
        var_7_E7 : int
        var_9_6B : Iterator<String>
        var_11_B1 : \u4c04\ub102\ufcaf\u8d90\u8aa5
        stack_10F_0 : int [generated]
        
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
            var_7_E7 = and:int(ldc:int(-1762380962), ldc:int(-1098914360))
            var_9_6B = invokeinterface:Iterator<String>(Collection<String>::iterator, p0:Collection<String>)
            
            loop {
                if (cmpeq:boolean(and:int(var_7_E7:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_7_E7 = and:int(var_7_E7:int, ldc:int(-183991))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_9_6B:Iterator)) {
                        var_11_B1 = invokevirtual:\u4c04\ub102\ufcaf\u8d90\u8aa5(\u7c6b\ud36e\u8d90\u0800\ua6bd::\u7e3f\u718f\u7af6\u9033\ud158\u446c, p1:\u7c6b\ud36e\u8d90\u0800\ua6bd, checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_9_6B:Iterator<String>)), p2:\u4c04\u34df\ua3b4\uc29a\ub70c)
                        
                        if (logicalnot:boolean(p3:boolean)) {
                            do {
                                if (cmpne:boolean(and:int(var_7_E7:int, ldc:int(2048)), ldc:int(0))) {
                                    var_7_E7 = and:int(var_7_E7:int, ldc:int(-1606848516))
                                }
                                else {
                                    var_7_E7 = and:int(var_7_E7:int, ldc:int(-1770149046))
                                    
                                    if (logicalnot:boolean(p5:boolean)) {
                                        loopcontinue()
                                    }
                                    
                                    stack_10F_0 = xor:int(ldc:int(9), ldc:int(8))
                                    goto(Label_0263)
                                }
                            } while (cmpeq:boolean(and:int(var_7_E7:int, ldc:int(64)), ldc:int(0)))
                            
                            var_7_E7 = and:int(var_7_E7:int, ldc:int(527875034))
                            stack_10F_0 = and:int(ldc:int(-30165), ldc:int(9556))
                        }
                        else {
                            stack_10F_0 = p6:int
                        }
                        
                        Label_0263:
                        var_7_E7 = and:int(var_7_E7:int, ldc:int(536770027))
                        invokevirtual:void(\u4c04\ub102\ufcaf\u8d90\u8aa5::\u7043\u965f\u4f52\uf94d\u5db4\u52d3, var_11_B1:\u4c04\ub102\ufcaf\u8d90\u8aa5, stack_10F_0:int)
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_7_E7:int, ldc:int(131072)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.builder.ArgumentBuilder lambda$\u7e3f\u0c95\u6fb0\u839e\u4f4a\u600f$33(com.mojang.brigadier.tree.LiteralCommandNode p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p1, boolean p2, com.mojang.brigadier.builder.ArgumentBuilder p3) {
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
            return:ArgumentBuilder(invokevirtual:ArgumentBuilder(ArgumentBuilder::then, p3:ArgumentBuilder, invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::then, checkcast:RequiredArgumentBuilder(com.mojang.brigadier.builder.RequiredArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:RequiredArgumentBuilder](RequiredArgumentBuilder::then, checkcast:RequiredArgumentBuilder(com.mojang.brigadier.builder.RequiredArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:RequiredArgumentBuilder](RequiredArgumentBuilder::then, checkcast:RequiredArgumentBuilder(com.mojang.brigadier.builder.RequiredArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:RequiredArgumentBuilder](RequiredArgumentBuilder::then, checkcast:RequiredArgumentBuilder(com.mojang.brigadier.builder.RequiredArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:RequiredArgumentBuilder](RequiredArgumentBuilder::then, checkcast:RequiredArgumentBuilder(com.mojang.brigadier.builder.RequiredArgumentBuilder.class, invokevirtual:ArgumentBuilder[expected:RequiredArgumentBuilder](RequiredArgumentBuilder::then, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(1086), ldc:int(16759))), invokestatic:\u64ab\u7d52\u5f50\uc3e3\ubb2b[expected:ArgumentType](\u64ab\u7d52\u5f50\uc3e3\ubb2b::\u7006\u6b0d\u4d85\ud523\u071d\u5db4)), invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::then, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(8612), ldc:int(8595)))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::redirect, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(12435), ldc:int(12459))), invokestatic:DoubleArgumentType[expected:ArgumentType](DoubleArgumentType::doubleArg)), p0:LiteralCommandNode[expected:CommandNode], invokedynamic:SingleRedirectModifier(apply:(L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;Z)Lcom/mojang/brigadier/SingleRedirectModifier;, p1:\u0a06\u1833\u64f2\ud217\u183a, p2:boolean))))), invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::then, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(8315), ldc:int(57)))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::redirect, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(378), ldc:int(25656))), invokestatic:DoubleArgumentType[expected:ArgumentType](DoubleArgumentType::doubleArg)), p0:LiteralCommandNode[expected:CommandNode], invokedynamic:SingleRedirectModifier(apply:(L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;Z)Lcom/mojang/brigadier/SingleRedirectModifier;, p1:\u0a06\u1833\u64f2\ud217\u183a, p2:boolean))))), invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::then, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(16392), ldc:int(16434)))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::redirect, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(2112), ldc:int(2168))), invokestatic:DoubleArgumentType[expected:ArgumentType](DoubleArgumentType::doubleArg)), p0:LiteralCommandNode[expected:CommandNode], invokedynamic:SingleRedirectModifier(apply:(L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;Z)Lcom/mojang/brigadier/SingleRedirectModifier;, p1:\u0a06\u1833\u64f2\ud217\u183a, p2:boolean))))), invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::then, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(2619), ldc:int(13435)))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::redirect, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(63), ldc:int(248))), invokestatic:DoubleArgumentType[expected:ArgumentType](DoubleArgumentType::doubleArg)), p0:LiteralCommandNode[expected:CommandNode], invokedynamic:SingleRedirectModifier(apply:(L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;Z)Lcom/mojang/brigadier/SingleRedirectModifier;, p1:\u0a06\u1833\u64f2\ud217\u183a, p2:boolean))))), invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::then, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(4134), ldc:int(4122)))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::redirect, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(2360), ldc:int(634))), invokestatic:DoubleArgumentType[expected:ArgumentType](DoubleArgumentType::doubleArg)), p0:LiteralCommandNode[expected:CommandNode], invokedynamic:SingleRedirectModifier(apply:(L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;Z)Lcom/mojang/brigadier/SingleRedirectModifier;, p1:\u0a06\u1833\u64f2\ud217\u183a, p2:boolean))))), invokevirtual:ArgumentBuilder(LiteralArgumentBuilder::then, invokestatic:LiteralArgumentBuilder<\u8413\u5140\u64f2\uc9f6\u9937>(\u40a9\ud51e\ua562\ucef1\u873d::\u3bc9\u3e75\u3e2a\uc87f\uc238\u965f, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(189), ldc:int(829)))), invokevirtual:ArgumentBuilder(RequiredArgumentBuilder::redirect, invokestatic:RequiredArgumentBuilder(\u40a9\ud51e\ua562\ucef1\u873d::\u494c\u67d0\u5d20\uc4d2\u516c\u3bd6, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(13753), ldc:int(16504))), invokestatic:DoubleArgumentType[expected:ArgumentType](DoubleArgumentType::doubleArg)), p0:LiteralCommandNode[expected:CommandNode], invokedynamic:SingleRedirectModifier(apply:(L\u6cfe\u16f6\u4c04\u61a4\u8bb0/\u0a06\u1833\u64f2\ud217\u183a;Z)Lcom/mojang/brigadier/SingleRedirectModifier;, p1:\u0a06\u1833\u64f2\ud217\u183a, p2:boolean))))))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 lambda$\u4492\uc229\u6cfe\u5fe1\u98a4\u8753$32(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, boolean p1, com.mojang.brigadier.context.CommandContext p2) {
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
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab lambda$\u98a4\u647c\uafe7\u759a\u71f1\ua562$31(com.mojang.brigadier.context.CommandContext p0, int p1) {
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
            return:\u93a2\u97b7\u647c\ud36e\u64ab(invokestatic:\u64f2\u9255\uc7fe\u51b2\u3e75[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\u64f2\u9255\uc7fe\u51b2\u3e75::\u4c2b\ud217\u3776\u9af2\uc31c\ud217, i2b:byte(d2i:int(mul:double(i2d:double(p1:int), invokestatic:double(DoubleArgumentType::getDouble, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(8340), ldc:int(8364)))))))))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 lambda$\u5f50\u3d4b\u7043\ubded\u4c2b\uc84e$30(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, boolean p1, com.mojang.brigadier.context.CommandContext p2) {
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
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab lambda$\ua068\u600f\ud523\ub8be\uae87\u5db4$29(com.mojang.brigadier.context.CommandContext p0, int p1) {
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
            return:\u93a2\u97b7\u647c\ud36e\u64ab(invokestatic:\u3504\u12cb\ub19c\u69d9\u9937[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\u3504\u12cb\ub19c\u69d9\u9937::\ub19c\u8389\u2dcc\u416d\ua3b4\u6bb9, mul:double(i2d:double(p1:int), invokestatic:double(DoubleArgumentType::getDouble, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(12344), ldc:int(1208)))))))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 lambda$\u51b2\uc3e3\u0800\u4d85\ufcaf\u0b8e$28(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, boolean p1, com.mojang.brigadier.context.CommandContext p2) {
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
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab lambda$\u946b\uc87f\u718f\u3d4b\u647c\u600f$27(com.mojang.brigadier.context.CommandContext p0, int p1) {
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
            return:\u93a2\u97b7\u647c\ud36e\u64ab(invokestatic:\u6198\u59ec\u0a06\u624e\u8df4[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\u6198\u59ec\u0a06\u624e\u8df4::\u6b0d\u92ee\u3504\ub113\u4179\u74b1, d2l:long(mul:double(i2d:double(p1:int), invokestatic:double(DoubleArgumentType::getDouble, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(12855), ldc:int(12815))))))))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 lambda$\u52d3\ucfaf\ub8be\ub83f\u3a62\u71ae$26(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, boolean p1, com.mojang.brigadier.context.CommandContext p2) {
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
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab lambda$\u527a\ub83f\u071d\u6435\u3d64\u4cd9$25(com.mojang.brigadier.context.CommandContext p0, int p1) {
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
            return:\u93a2\u97b7\u647c\ud36e\u64ab(invokestatic:\u7043\uc87f\u4f52\u64ab\u8350[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\u7043\uc87f\u4f52\u64ab\u8350::\u47c2\u8709\u494c\ub7dc\uc7fe\u4ab3, i2s:short(d2i:int(mul:double(i2d:double(p1:int), invokestatic:double(DoubleArgumentType::getDouble, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(16764), ldc:int(15418)))))))))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 lambda$\u4ab3\ub32d\u72f1\u873d\u9a18\uf995$24(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, boolean p1, com.mojang.brigadier.context.CommandContext p2) {
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
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab lambda$\ufcaf\ua61f\u8753\uf995\u6bb9\ub18d$23(com.mojang.brigadier.context.CommandContext p0, int p1) {
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
            return:\u93a2\u97b7\u647c\ud36e\u64ab(invokestatic:\u4492\u4bc8\ub113\u3bc9\u74b1[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\u4492\u4bc8\ub113\u3bc9\u74b1::\ud7e8\ud7e8\u7ce1\ubcb0\u7043\ufe34, d2f:float(mul:double(i2d:double(p1:int), invokestatic:double(DoubleArgumentType::getDouble, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(5049), ldc:int(27772))))))))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 lambda$\u6c56\uc7fe\u416d\u51fa\ub18d\u6ec6$22(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u0a06\u1833\u64f2\ud217\u183a p0, boolean p1, com.mojang.brigadier.context.CommandContext p2) {
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
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u93a2\u97b7\u647c\ud36e\u64ab lambda$\u61a4\u4c04\ub102\ufcaf\uc29a\u6435$21(com.mojang.brigadier.context.CommandContext p0, int p1) {
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
            return:\u93a2\u97b7\u647c\ud36e\u64ab(invokestatic:\uc246\u52d3\u873d\u6c52\u7049[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\uc246\u52d3\u873d\u6c52\u7049::\u62da\ucef1\u51b2\ucef1\u16f6\u8308, d2i:int(mul:double(i2d:double(p1:int), invokestatic:double(DoubleArgumentType::getDouble, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(890), ldc:int(10300))))))))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 lambda$\u7049\ub113\u1833\u516c\u416d\u759a$20(boolean p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:\u8413\u5140\u64f2\uc9f6\u9937(invokestatic:\u8413\u5140\u64f2\uc9f6\u9937(\u8258\ua562\ucb79\u69d9\u600f::\u5245\u3504\uc31c\ubefe\u4f4a\u6c56, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), invokestatic:\u88c5\u3d4b\u7ce1\u4975\u61a4(\u8d90\u927d\uae5d\u67d0\u5654::\u927d\u6ec6\u3776\ubefe\ub7dc\u74b1, p1:CommandContext), and:int[expected:boolean](ldc:int(12852), ldc:int(-12990)), p0:boolean))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 lambda$\u494c\u40a9\u8cae\u8c8a\u6198\u64f2$19(boolean p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:\u8413\u5140\u64f2\uc9f6\u9937(invokestatic:\u8413\u5140\u64f2\uc9f6\u9937(\u8258\ua562\ucb79\u69d9\u600f::\u5245\u3504\uc31c\ubefe\u4f4a\u6c56, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), invokestatic:\u88c5\u3d4b\u7ce1\u4975\u61a4(\u8d90\u927d\uae5d\u67d0\u5654::\u927d\u6ec6\u3776\ubefe\ub7dc\u74b1, p1:CommandContext), and:int[expected:boolean](ldc:int(145), ldc:int(4103)), p0:boolean))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 lambda$\u7c6b\ua3b4\uc2bd\u647c\ub19c\uc7fe$18(boolean p0, com.mojang.brigadier.context.CommandContext p1) {
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
            return:\u8413\u5140\u64f2\uc9f6\u9937(invokestatic:\u8413\u5140\u64f2\uc9f6\u9937(\u8258\ua562\ucb79\u69d9\u600f::\u3711\u7873\u12b2\u3e2a\u3711\u927d, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p1:CommandContext)), invokestatic:Collection<String>(\uc2e8\u40a9\u0c95\u9937\ud36e::\uf9c5\u5bc4\u4492\u4c04\uc29a\u7af6, p1:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(11141), ldc:int(101)))), invokestatic:\u4c04\u34df\ua3b4\uc29a\ub70c(\u6cfe\uc4d2\u3711\ubf56\ubf56::\u36d3\ubf56\u4d85\u416d\ub102\u52d3, p1:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(5271), ldc:int(26935)))), p0:boolean))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 lambda$\u7bad\u40a9\u8d98\u7049\ub113\ubf56$17(com.mojang.brigadier.context.CommandContext p0) {
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
            return:\u8413\u5140\u64f2\uc9f6\u9937(invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\ubf56\u5d20\u760c\u7bad\u4e72\u9a18, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\ube23\uc238\u5140\u4cd9\u8aa5(\ub1b9\u7330\u3e2a\ud171\u0800::\ub7dc\uc7fe\u0a06\u7ce1\u6bb9\ucb79, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(8471), ldc:int(2709))))))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 lambda$\uf94d\u718f\u4d85\u4c2b\u5fe1\u5f50$16(com.mojang.brigadier.context.CommandContext p0) {
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
            return:\u8413\u5140\u64f2\uc9f6\u9937(invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\u759a\u3776\u7d52\ud523\ufe34\u6d99, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u5d20\ub8be\u99f7\ud217\ubcb0(\u67d0\u98a4\uc910\u4f4a\u8c8a::\u3a62\ud217\u92ff\ub8be\u7006\u6fb0, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(-4087), ldc:int(-4071))))))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 lambda$\u3a62\ub70c\uf9c5\u927d\u3d64\u3d64$15(com.mojang.brigadier.context.CommandContext p0) {
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
            return:\u8413\u5140\u64f2\uc9f6\u9937(invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\u71ae\u3d4b\ufe34\u98a4\ud523\uc87f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ucfaf\u3776\u0b8e\u6198\ua6bd\u98a4, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u8413\u5140\u64f2\uc9f6\u9937::\u59ec\ubf56\ucef1\ubcb0\ubb2b\u6435, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))), invokestatic:EnumSet<\u6c52\u156b\u4179\u5654\uceb8\u9af2>(\u4d85\u6435\u7bad\u3dd3\u9937::\ub18d\u3711\u67e9\u88c5\u0a06\u8753, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(25750), ldc:int(90)))))))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 lambda$\u4ab3\u071d\u7c6b\u5fe1\u7bad\u2dcc$14(com.mojang.brigadier.context.CommandContext p0) {
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
            return:\u8413\u5140\u64f2\uc9f6\u9937(invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\uafe7\uc910\uc29a\u9a18\u8d90\uc2bd, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(8337), ldc:int(8346))))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Collection lambda$\u4c04\u3dd3\ud36e\u183a\u93a2\u7043$13(com.mojang.brigadier.context.CommandContext p0) {
        var_1_61 : int
        var_3_65 : ArrayList
        var_4_75 : \u5d20\ub8be\u99f7\ud217\ubcb0
        var_5_8B : Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>
        
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
            var_1_61 = and:int(ldc:int(-353576883), ldc:int(-497364499))
            var_3_65 = invokestatic:ArrayList(Lists::newArrayList)
            var_4_75 = invokestatic:\u5d20\ub8be\u99f7\ud217\ubcb0(\u67d0\u98a4\uc910\u4f4a\u8c8a::\u3a62\ud217\u92ff\ub8be\u7006\u6fb0, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(3337), ldc:int(3353))))
            var_5_8B = invokeinterface:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::iterator, invokestatic:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u600f\u9937\ub8be\ud171\u624e::\u72f1\u946b\u67d0\u5db4\ub70c\u4179, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(-28651), ldc:int(-28656)))))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1142952849))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_8B:Iterator))) {
                    looporswitchbreak()
                }
                
                invokeinterface:boolean(List<\u8413\u5140\u64f2\uc9f6\u9937>::add, var_3_65:ArrayList<\u8413\u5140\u64f2\uc9f6\u9937>[expected:List<\u8413\u5140\u64f2\uc9f6\u9937>], invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\uafe7\uc910\uc29a\u9a18\u8d90\uc2bd, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_5_8B:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)), var_4_75:\u5d20\ub8be\u99f7\ud217\ubcb0))
            }
            
            return:Collection(var_3_65:ArrayList<\u8413\u5140\u64f2\uc9f6\u9937>)
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Collection lambda$\u4975\uf94d\u98a4\uc238\ub171\u8d98$12(com.mojang.brigadier.context.CommandContext p0) {
        var_1_61 : int
        var_3_65 : ArrayList
        var_4_7A : Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>
        
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
            var_1_61 = and:int(ldc:int(-1553412843), ldc:int(-1430529218))
            var_3_65 = invokestatic:ArrayList(Lists::newArrayList)
            var_4_7A = invokeinterface:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::iterator, invokestatic:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u600f\u9937\ub8be\ud171\u624e::\u72f1\u946b\u67d0\u5db4\ub70c\u4179, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(-27639), ldc:int(-27636)))))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(2008534299))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_7A:Iterator))) {
                    looporswitchbreak()
                }
                
                invokeinterface:boolean(List<\u8413\u5140\u64f2\uc9f6\u9937>::add, var_3_65:ArrayList<\u8413\u5140\u64f2\uc9f6\u9937>[expected:List<\u8413\u5140\u64f2\uc9f6\u9937>], invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\uafe7\uc910\uc29a\u9a18\u8d90\uc2bd, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokevirtual:\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2(\u7d52\u718f\u3776\u6fb0\ub83f::\u0a06\ube23\uc31c\u3c25\ua61f\u40a9, checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_4_7A:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)))))
            }
            
            return:Collection(var_3_65:ArrayList<\u8413\u5140\u64f2\uc9f6\u9937>)
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 lambda$\u3776\uc910\u62da\uc31c\u51fa\u99f7$11(com.mojang.brigadier.context.CommandContext p0) {
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
            return:\u8413\u5140\u64f2\uc9f6\u9937(invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\uafe7\uc910\uc29a\u9a18\u8d90\uc2bd, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokeinterface:\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2(\u3c25\u8d98\u7330\uf94d\u8bb0::\u5140\uc84e\ud158\u8413\ub171\ub32d, invokestatic:\u3c25\u8d98\u7330\uf94d\u8bb0(\ubff1\u5140\u8d98\u92ff\u718f::\uc229\u8c8a\u4f4a\u5654\u64ab\ubefe, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(13), ldc:int(4237)))), checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Collection lambda$\ube23\u4daf\u965f\u5654\u7330\u8df4$10(com.mojang.brigadier.context.CommandContext p0) {
        var_1_61 : int
        var_3_65 : ArrayList
        var_4_7A : Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>
        
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
            var_1_61 = and:int(ldc:int(-1777795314), ldc:int(-1978046497))
            var_3_65 = invokestatic:ArrayList(Lists::newArrayList)
            var_4_7A = invokeinterface:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::iterator, invokestatic:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u600f\u9937\ub8be\ud171\u624e::\u72f1\u946b\u67d0\u5db4\ub70c\u4179, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(4117), ldc:int(16389)))))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-500963474))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_7A:Iterator))) {
                    looporswitchbreak()
                }
                
                invokeinterface:boolean(List<\u8413\u5140\u64f2\uc9f6\u9937>::add, var_3_65:ArrayList<\u8413\u5140\u64f2\uc9f6\u9937>[expected:List<\u8413\u5140\u64f2\uc9f6\u9937>], invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\u71ae\u3d4b\ufe34\u98a4\ud523\uc87f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_4_7A:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)))))
            }
            
            return:Collection(var_3_65:ArrayList<\u8413\u5140\u64f2\uc9f6\u9937>)
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 lambda$\u3e2a\u4bc8\u59ec\u4f52\ub83f\u385b$9(com.mojang.brigadier.context.CommandContext p0) {
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
            return:\u8413\u5140\u64f2\uc9f6\u9937(invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\u759a\u3776\u7d52\ud523\ufe34\u6d99, invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\u71ae\u3d4b\ufe34\u98a4\ud523\uc87f, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u4f52\u873d\u5bc4\u647c\u4c2b::\uff55\u97e6\u8640\uae87\u5f50\u3e2a, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(5291), ldc:int(2059))))), getstatic:\u5d20\ub8be\u99f7\ud217\ubcb0(\u5d20\ub8be\u99f7\ud217\ubcb0::\u6ec6\u8d98\u6c56\u647c\u9255\u7043)))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Collection lambda$\uceb8\u4c2b\ub8be\u7049\u8308\u3a62$8(com.mojang.brigadier.context.CommandContext p0) {
        var_1_61 : int
        var_3_65 : ArrayList
        var_4_7A : Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>
        var_5_A2 : \u7d52\u718f\u3776\u6fb0\ub83f
        
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
            var_1_61 = and:int(ldc:int(836482097), ldc:int(2010905813))
            var_3_65 = invokestatic:ArrayList(Lists::newArrayList)
            var_4_7A = invokeinterface:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::iterator, invokestatic:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u600f\u9937\ub8be\ud171\u624e::\u72f1\u946b\u67d0\u5db4\ub70c\u4179, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), and:int(ldc:int(8317), ldc:int(17159)))))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1241844427))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_7A:Iterator))) {
                    looporswitchbreak()
                }
                
                var_5_A2 = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_4_7A:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>))
                invokeinterface:boolean(List<\u8413\u5140\u64f2\uc9f6\u9937>::add, var_3_65:ArrayList<\u8413\u5140\u64f2\uc9f6\u9937>[expected:List<\u8413\u5140\u64f2\uc9f6\u9937>], invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\uafe7\uc910\uc29a\u9a18\u8d90\uc2bd, invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\u71ae\u3d4b\ufe34\u98a4\ud523\uc87f, invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\ubf56\u5d20\u760c\u7bad\u4e72\u9a18, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u7d52\u718f\u3776\u6fb0\ub83f::\u12cb\ubf56\u647c\u7330\u446c\u836c, var_5_A2:\u7d52\u718f\u3776\u6fb0\ub83f))), invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, var_5_A2:\u7d52\u718f\u3776\u6fb0\ub83f)), invokevirtual:\ub19c\ua6bd\ubf56\u97b7\u4d85\u47c2(\u7d52\u718f\u3776\u6fb0\ub83f::\u0a06\ube23\uc31c\u3c25\ua61f\u40a9, var_5_A2:\u7d52\u718f\u3776\u6fb0\ub83f)))
            }
            
            return:Collection(var_3_65:ArrayList<\u8413\u5140\u64f2\uc9f6\u9937>)
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Collection lambda$\u6bb9\ub171\u64ab\u12cb\u93a2\u47c2$7(com.mojang.brigadier.context.CommandContext p0) {
        var_1_61 : int
        var_3_65 : ArrayList
        var_4_7A : Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>
        
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
            var_1_61 = and:int(ldc:int(84597300), ldc:int(2001993138))
            var_3_65 = invokestatic:ArrayList(Lists::newArrayList)
            var_4_7A = invokeinterface:Iterator<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>::iterator, invokestatic:Collection<? extends \u7d52\u718f\u3776\u6fb0\ub83f>(\u600f\u9937\ub8be\ud171\u624e::\u72f1\u946b\u67d0\u5db4\ub70c\u4179, p0:CommandContext, loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(9248), ldc:int(9253)))))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1350665794))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_7A:Iterator))) {
                    looporswitchbreak()
                }
                
                invokeinterface:boolean(List<\u8413\u5140\u64f2\uc9f6\u9937>::add, var_3_65:ArrayList<\u8413\u5140\u64f2\uc9f6\u9937>[expected:List<\u8413\u5140\u64f2\uc9f6\u9937>], invokevirtual:\u8413\u5140\u64f2\uc9f6\u9937(\u8413\u5140\u64f2\uc9f6\u9937::\u946b\u3711\ud523\ub8be\u946b\u3d4b, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_4_7A:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>))))
            }
            
            return:Collection(var_3_65:ArrayList<\u8413\u5140\u64f2\uc9f6\u9937>)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u4daf\u8308\uc238\u3711\u4179\ucfaf$6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(4618), ldc:int(8194))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u156b\u9033\u76bc\ub113\u983f\u8aa5$5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(24619), ldc:int(1666))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\u4daf\ub19c\ua562\u3c25\u12cb\ubded$4(com.mojang.brigadier.context.CommandContext p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
            return:CompletableFuture(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u6cfe\u965f\uae5d\uc2e8\ud51e\u8cae, invokevirtual:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Iterable<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](\uae5d\u7af6\u52d3\u6c52\u839e::\u61a4\ub6ab\uc2e8\u4e72\ud7e8\u64ab, invokevirtual:\uae5d\u7af6\u52d3\u6c52\u839e(\u88c5\ud171\ub113\u6435\ud51e::\u3504\u624e\u0b8e\u965f\ubf56\uc4d2, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))), p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.ResultConsumer lambda$\u67d0\u69d9\u3bd6\uf9c5\u3bd6\u12cb$3(com.mojang.brigadier.ResultConsumer p0, com.mojang.brigadier.ResultConsumer p1) {
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
            return:ResultConsumer(invokedynamic:ResultConsumer(onCommandComplete:(Lcom/mojang/brigadier/ResultConsumer;Lcom/mojang/brigadier/ResultConsumer;)Lcom/mojang/brigadier/ResultConsumer;, p0:ResultConsumer, p1:ResultConsumer))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\ud523\u5d20\u183a\u62da\u6d99\u836c$2(com.mojang.brigadier.ResultConsumer p0, com.mojang.brigadier.ResultConsumer p1, com.mojang.brigadier.context.CommandContext p2, boolean p3, int p4) {
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
            invokeinterface:void(ResultConsumer::onCommandComplete, p0:ResultConsumer, p2:CommandContext, p3:boolean, p4:int)
            invokeinterface:void(ResultConsumer::onCommandComplete, p1:ResultConsumer, p2:CommandContext, p3:boolean, p4:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u1833\ud171\u8350\ubded\u34df\uc9f6$1(java.lang.Object p0) {
        stack_85_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_85_1 = loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(12332), ldc:int(12306)))
            expr_78 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(4833), ldc:int(16651)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(25866), ldc:int(-25871)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u0800\u8d98\u7873\u16f6\u7ce1\ua6bd$0(java.lang.Object p0, java.lang.Object p1) {
        stack_8F_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_8F_1 = loadelement:String(getstatic:String[](\u8258\ua562\ucb79\u69d9\u600f::\u1833\ubb2b\u6435\u183a\u4e72\uc3e3), xor:int(ldc:int(29723), ldc:int(29732)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(5184), ldc:int(5186)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(5568), ldc:int(-5577)), p0:Object)
            storeelement:Object(expr_78:Object[], and:int(ldc:int(4107), ldc:int(85)), p1:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_8F_1:String, expr_78:Object[]))
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
    
    public void \u647c\ubff1\u3e75\ub83f\u7bad\ud51e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
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
        var_3_672 = and:int(ldc:int(-1483736092), ldc:int(-1347837957))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8258\ua562\ucb79\u69d9\u600f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(-9617432))
            var_5_81 = and:int(ldc:int(-31246), ldc:int(10765))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(21255), ldc:int(-21256)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_672:int, ldc:int(664502249))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(-24571), ldc:int(-24572)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(19458), ldc:int(19459)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_DA:int, ldc:int(-1546797076))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(779), ldc:int(2049)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1742873196))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2137719524))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-78837721))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-458123182))
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(803160042))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0604)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-606201887))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-821414888))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2145764199))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(171762531))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-669833257))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1999858750))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(2110712371))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(593313791))
                        var_11_EB = and:int(ldc:int(-23303), ldc:int(23298))
                        goto(Label_1517)
                    }
                    
                    Label_0604:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1728204121))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(452783641))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(932956751))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(2007605222))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1058138780))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2140958546))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-987062503))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-214719603))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1543921692))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1186451984))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(270548174))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(643965692))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1490215959))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(7200), ldc:int(7201))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1040691684))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1629231686))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(135491844))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1840427115))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1005287730))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-215253020))
                        var_11_EB = and:int(ldc:int(-25100), ldc:int(25099))
                    }
                    
                    Label_1137:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-863618183))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-2064859750))
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-581116066))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1599078856))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1740234738))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1389)
                            }
                        }
                    }
                    
                    Label_1262:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1137)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1384026040))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-2055920674))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-231189698))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-412541974))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1517)
                    }
                    
                    Label_1389:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1151510160))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2076237596))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1992771819))
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(2138930160))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1517:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1528:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(128858557))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1950178116))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1793008263))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(256326616))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1752232110))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1289004038))
                        var_17_67D = add:int(var_16_119:int, and:int(ldc:int(12995), ldc:int(257)))
                        looporswitchbreak()
                    }
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(-1482039308))
                
                if (cmple:boolean(var_5_81 = var_17_67D:int, sub:int(var_6_88:int, and:int(ldc:int(515), ldc:int(385))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(570109697))
            goto(Label_0108)
        }
    }
}
