public class \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f {
    public void \uceb8\u4e72\u1833\ud7e8\u9a18\ub83f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1, java.util.concurrent.Executor p2) {
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
    
    public \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ud12e\u97b7\u760c\u76bc\u1187\ubb2b \uc31c\u0800\u62da\u7d52\ud7e8\u67e9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0) {
        var_4_83 : \ud12e\u97b7\u760c\u76bc\u1187\ubb2b
        
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
        
        if (cmpeq:boolean(getfield:CompletableFuture<\ud12e\u97b7\u760c\u76bc\u1187\ubb2b>(\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f::\u9033\u4492\u76bc\uae87\ud158\u8d90, this:\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f), aconstnull:CompletableFuture<\ud12e\u97b7\u760c\u76bc\u1187\ubb2b>())) {
            return:\ud12e\u97b7\u760c\u76bc\u1187\ubb2b(invokestatic:\ud12e\u97b7\u760c\u76bc\u1187\ubb2b(\ud12e\u97b7\u760c\u76bc\u1187\ubb2b::\u647c\ud217\u6198\u97e6\u7043\ub113, p0:\u6c52\u52d3\u516c\uae87\uae5d, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f::\u4cd9\u6d69\u647c\u1187\ud523\uf995, this:\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f)))
        }
        
        var_4_83 = checkcast:\ud12e\u97b7\u760c\u76bc\u1187\ubb2b(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ud12e\u97b7\u760c\u76bc\u1187\ubb2b.class, invokevirtual:\ud12e\u97b7\u760c\u76bc\u1187\ubb2b(CompletableFuture<\ud12e\u97b7\u760c\u76bc\u1187\ubb2b>::join, getfield:CompletableFuture<\ud12e\u97b7\u760c\u76bc\u1187\ubb2b>(\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f::\u9033\u4492\u76bc\uae87\ud158\u8d90, this:\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f)))
        putfield:CompletableFuture<\ud12e\u97b7\u760c\u76bc\u1187\ubb2b>(\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f::\u9033\u4492\u76bc\uae87\ud158\u8d90, this:\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f, aconstnull:CompletableFuture<\ud12e\u97b7\u760c\u76bc\u1187\ubb2b>())
        return:\ud12e\u97b7\u760c\u76bc\u1187\ubb2b(var_4_83:\ud12e\u97b7\u760c\u76bc\u1187\ubb2b)
    }
    
    public java.util.concurrent.CompletableFuture<java.lang.Void> \u4d85\u67e9\u8c8a\u6d99\u4cd9\u4daf() {
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
    
    public void \u8308\u34df\ud7e8\u51fa\ubcb0\u74b1(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p2, java.util.concurrent.Executor p3) {
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
    
    private static java.util.concurrent.Executor \u3d4b\u7e3f\ub19c\u4bc8\ua3b4\u4f4a(java.util.concurrent.Executor p0) {
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
    
    private static void lambda$\ub83f\ua068\u5db4\u6d99\u9af2\u88c5$5(java.util.concurrent.Executor p0, java.lang.Runnable p1) {
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
    
    private static void lambda$\u97b7\u67d0\u34df\u183a\u8640\u5bc4$4(java.lang.Runnable p0) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u446c\ubcb0\u8d98\u6c56\uc7fe\ub19c, invokedynamic:\u6b5f\u8389\ub32d\ub83f\u71f1(\u12b2\ub32d\u92ff\ud217\u3d4b\u3776:(Ljava/lang/Runnable;)L\u3bc9\u67e9\uc87f\u47c2\u5f50/\u16f6\u40a9\u5f50\ub113\ud51e/\u836c\u67e9\u5d20\u5fe1\u7e3f/\u6b5f\u8389\ub32d\ub83f\u71f1;, p0:Runnable))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uceb8\u7d52\u7ce1\u9af2\ua068\u8aa5$3(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99 p0) {
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
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u51fa\u4f52\ub171\u8d90\u0b8e\uc910, p0:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f::\u4cd9\u6d69\u647c\u1187\ud523\uf995, this:\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f), this:\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f[expected:\u9937\u4cd9\u4ab3\u59ec\u64f2\uc29a])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ud12e\u97b7\u760c\u76bc\u1187\ubb2b lambda$\u3bd6\ub102\u12cb\u34df\u183a\uc3e3$2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0) {
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
            return:\ud12e\u97b7\u760c\u76bc\u1187\ubb2b(invokestatic:\ud12e\u97b7\u760c\u76bc\u1187\ubb2b(\ud12e\u97b7\u760c\u76bc\u1187\ubb2b::\u647c\ud217\u6198\u97e6\u7043\ub113, p0:\u6c52\u52d3\u516c\uae87\uae5d, getfield:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f::\u4cd9\u6d69\u647c\u1187\ud523\uf995, this:\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Void lambda$\u446c\ud12e\u6d69\u873d\u4daf\uc3e3$1(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ud12e\u97b7\u760c\u76bc\u1187\ubb2b p0) {
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
            return:Void(aconstnull:Void())
        }
        
        goto(Label_0006)
    }
    
    private static \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ud12e\u97b7\u760c\u76bc\u1187\ubb2b lambda$\u385b\u6fb0\u97b7\uc4d2\uf995\u0800$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1) {
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
            return:\ud12e\u97b7\u760c\u76bc\u1187\ubb2b(invokestatic:\ud12e\u97b7\u760c\u76bc\u1187\ubb2b(\ud12e\u97b7\u760c\u76bc\u1187\ubb2b::\u647c\ud217\u6198\u97e6\u7043\ub113, p0:\u6c52\u52d3\u516c\uae87\uae5d, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d99\u7043\u93a2\u416d\u9af2\u836c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6D5 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C4 : double
        var_3_D6 : int
        var_11_E7 : int
        var_14_111 : double
        var_16_115 : int
        var_12_10D : double
        var_17_6E0 : int
        
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
        var_3_6D5 = and:int(ldc:int(2132472662), ldc:int(925564551))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uceb8\u4e72\u1833\ud7e8\u9a18\ub83f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1411402241))
            var_5_7D = and:int(ldc:int(-13873), ldc:int(13872))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(9826), ldc:int(-9827)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C4 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D6 = and:int(var_3_6D5:int, ldc:int(-1160844690))
                    var_9_C4 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E7 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E7:int, sub:int(var_6_84:int, xor:int(ldc:int(516), ldc:int(517)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E7:int, xor:int(ldc:int(2121), ldc:int(2120)))), var_7_93:double))) {
                        inc:int(var_11_E7, ldc:int(1))
                    }
                    
                    var_3_6D5 = and:int(var_3_D6:int, ldc:int(-362025562))
                    var_14_111 = var_7_93:double
                    var_16_115 = var_11_E7:int
                }
                else {
                    var_11_E7 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(8537), ldc:int(3075)))
                    var_12_10D = var_14_111 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_115 = var_11_E7:int, var_6_84:int)) {
                        var_9_C4 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E7:int)
                        var_16_115 = var_11_E7:int
                        var_14_111 = var_12_10D:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1543567698))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-335077900))
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1970314997))
                        goto(Label_1345)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-520893910))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1927716770))
                        goto(Label_0918)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(758680479))
                        goto(Label_0761)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1920067884))
                        goto(Label_0627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1007373482))
                    }
                    else {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1369464043))
                        
                        if (cmplt:boolean(var_16_115:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0627)
                            }
                            
                            goto(Label_0918)
                        }
                    }
                    
                    Label_0443:
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1073704815))
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1345)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1501008143))
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1831916529))
                        goto(Label_1061)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0918)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1594056929))
                        goto(Label_0761)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1032173666))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-445646517))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1172313956))
                        var_11_E7 = and:int(ldc:int(2467), ldc:int(-2484))
                        goto(Label_1625)
                    }
                    
                    Label_0627:
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(67891438))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(112610732))
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1345)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0918)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-830257803))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-238116456))
                            goto(Label_0443)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(220999385))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1211122842))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_111 = var_9_C4:double
                            goto(Label_0918)
                        }
                    }
                    
                    Label_0761:
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1324254537))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1046894239))
                        goto(Label_1481)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1345)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(711017527))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(131838491))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1474791148))
                            goto(Label_0627)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1858254161))
                            goto(Label_0443)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-597534698))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1439778594))
                        var_14_111 = mul:double(ldc:double(0.5), add:double(var_9_C4:double, var_14_111:double))
                    }
                    
                    Label_0918:
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1875839488))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-591714587))
                        goto(Label_1345)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(896094795))
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(2108496199))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(901040229))
                            goto(Label_0761)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0627)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0443)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-711226707))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(2141893524))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E7 = xor:int(ldc:int(16712), ldc:int(16713))
                                goto(Label_1220)
                            }
                        }
                    }
                    
                    Label_1061:
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-494355608))
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1345)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-199507183))
                            goto(Label_0918)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0761)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0627)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1639943018))
                            goto(Label_0443)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-403944462))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-410323889))
                        var_11_E7 = and:int(ldc:int(-31030), ldc:int(14644))
                    }
                    
                    Label_1220:
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1846304240))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(813314694))
                            goto(Label_1061)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-635207590))
                            goto(Label_0918)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0761)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(330052237))
                            goto(Label_0627)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0443)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1059057581))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                                goto(Label_1481)
                            }
                        }
                    }
                    
                    Label_1345:
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-773330047))
                            goto(Label_1220)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1061)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0918)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0761)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(580028891))
                            goto(Label_0627)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1543378122))
                            goto(Label_0443)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(885984444))
                            loopcontinue()
                        }
                        
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-404757284))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_111:double, var_5_7D:int, var_16_115:int)
                        goto(Label_1625)
                    }
                    
                    Label_1481:
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1487281497))
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1345)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(65383371))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1729478543))
                        goto(Label_1061)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(165426063))
                        goto(Label_0918)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0761)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(1097094885))
                        goto(Label_0627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8388608)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6D5 = and:int(var_3_6D5:int, ldc:int(576454070))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_111:double, ldc:double(0.0))
                    Label_1625:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6E0 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E7:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1636:
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1481)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(770251190))
                        goto(Label_1345)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1257919217))
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1061)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0918)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0761)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6D5:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-1464989831))
                        goto(Label_0443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-209803995))
                        var_17_6E0 = add:int(var_16_115:int, and:int(ldc:int(11341), ldc:int(21153)))
                        looporswitchbreak()
                    }
                    
                    var_3_6D5 = and:int(var_3_6D5:int, ldc:int(180811903))
                }
                
                var_3_6D5 = and:int(var_3_6D5:int, ldc:int(647686191))
                
                if (cmple:boolean(var_5_7D = var_17_6E0:int, sub:int(var_6_84:int, xor:int(ldc:int(1124), ldc:int(1125))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_6D5:int, ldc:int(8)), ldc:int(0))) {
            var_3_6D5 = and:int(var_3_6D5:int, ldc:int(-668385200))
            goto(Label_0106)
        }
    }
}
