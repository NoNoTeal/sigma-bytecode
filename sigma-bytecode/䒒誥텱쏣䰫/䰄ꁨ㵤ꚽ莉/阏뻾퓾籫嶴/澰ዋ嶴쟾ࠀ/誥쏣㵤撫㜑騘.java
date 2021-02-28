public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u8aa5\uc3e3\u3d64\u64ab\u3711\u9a18 {
    public void \u8aa5\uc3e3\u3d64\u64ab\u3711\u9a18(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0) {
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
            invokespecial:Object(Object::<init>, this:\u8aa5\uc3e3\u3d64\u64ab\u3711\u9a18)
            putfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, CompletableFuture<\u4179\uc7fe\ub8be\u64f2\ua068\u8389>>(\u8aa5\uc3e3\u3d64\u64ab\u3711\u9a18::\ud171\u51fa\ub18d\uc31c\ua61f\uc87f, this:\u8aa5\uc3e3\u3d64\u64ab\u3711\u9a18, invokestatic:HashMap[expected:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, CompletableFuture<\u4179\uc7fe\ub8be\u64f2\ua068\u8389>>](Maps::newHashMap))
            putfield:\u6c52\u52d3\u516c\uae87\uae5d(\u8aa5\uc3e3\u3d64\u64ab\u3711\u9a18::\ub1b9\uc3e3\u9a18\uf94d\u47c2\uae5d, this:\u8aa5\uc3e3\u3d64\u64ab\u3711\u9a18, p0:\u6c52\u52d3\u516c\uae87\uae5d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<\u3d64\u7af6\uae87\uc238\u7d52.\u4179\uc7fe\ub8be\u64f2\ua068\u8389> \u0800\u4179\ua068\u4975\u4bc8\u6ec6(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
    
    public java.util.concurrent.CompletableFuture<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u3bd6\u120d\u4bc8\ub70c\u9033\u4c2b> \uc2bd\u0c95\u416d\u624e\u8389\u446c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, boolean p1) {
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
    
    public void \u9a18\uc87f\ub70c\u4ab3\u759a\u16f6() {
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
    
    public java.util.concurrent.CompletableFuture<?> \uc31c\u88c5\u7873\uc2bd\u6198\ucfaf(java.util.Collection<\u392e\ud7e8\u3bc9\u88c5\ud51e.\ud171\u93a2\u8640\u4492\u9a18\u8c8a> p0) {
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
    
    private static java.util.concurrent.CompletableFuture[] lambda$\u8389\u494c\u56bd\u4c2b\u8d98\ub18d$5(int p0) {
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
            return:CompletableFuture[](newarray:CompletableFuture[](java.util.concurrent.CompletableFuture.class, p0:int))
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletableFuture lambda$\u64ab\u40a9\u61a4\u5fe1\u92ee\u67d0$4(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ud171\u93a2\u8640\u4492\u9a18\u8c8a p0) {
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
            return:CompletableFuture(invokevirtual:CompletableFuture<\u4179\uc7fe\ub8be\u64f2\ua068\u8389>(\u8aa5\uc3e3\u3d64\u64ab\u3711\u9a18::\u0800\u4179\ua068\u4975\u4bc8\u6ec6, this:\u8aa5\uc3e3\u3d64\u64ab\u3711\u9a18, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud171\u93a2\u8640\u4492\u9a18\u8c8a::\u64ab\u71ae\ua068\u59ec\u446c\u64f2, p0:\ud171\u93a2\u8640\u4492\u9a18\u8c8a)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u385b\u8c8a\u72f1\u4492\u0800\u64ab$3(java.util.concurrent.CompletableFuture p0) {
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
            invokevirtual:CompletableFuture(CompletableFuture::thenAccept, p0:CompletableFuture, invokedynamic:Consumer<T>(accept:()Ljava/util/function/Consumer;))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u3bd6\u120d\u4bc8\ub70c\u9033\u4c2b lambda$\u3bd6\u4e72\u7873\ub83f\u4f52\ud523$2(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, boolean p1) {
        var_3_5F : int
        var_5_6F : \ufe34\u960f\ua6bd\u71f1\u516c
        var_6_7D : InputStream
        stack_C9_0 : \u3bd6\u120d\u4bc8\ub70c\u9033\u4c2b [generated]
        var_5_CE : IOException
        
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
        var_3_5F = and:int(ldc:int(-1470082023), ldc:int(1782602777))
        
        try {
            var_3_5F = and:int(var_3_5F:int, ldc:int(-1734549876))
            var_5_6F = invokeinterface:\ufe34\u960f\ua6bd\u71f1\u516c(\u6c52\u52d3\u516c\uae87\uae5d::\u5d20\uc2e8\ubff1\u120d\u965f\u36d3, getfield:\u6c52\u52d3\u516c\uae87\uae5d(\u8aa5\uc3e3\u3d64\u64ab\u3711\u9a18::\ub1b9\uc3e3\u9a18\uf94d\u47c2\uae5d, this:\u8aa5\uc3e3\u3d64\u64ab\u3711\u9a18), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            var_3_5F = and:int(var_3_5F:int, ldc:int(1718910441))
            var_6_7D = invokeinterface:InputStream(\ufe34\u960f\ua6bd\u71f1\u516c::\u494c\u9af2\u3a62\u67d0\uff55\uc9f6, var_5_6F:\ufe34\u960f\ua6bd\u71f1\u516c)
            
            loop {
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(1915744119))
                }
                else {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(1957428520))
                    
                    if (logicalnot:boolean(p1:boolean)) {
                        stack_C9_0 = initobject:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a[expected:\u3bd6\u120d\u4bc8\ub70c\u9033\u4c2b](\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::<init>, var_6_7D:InputStream)
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(4)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(580474136))
                    stack_C9_0 = initobject:\u6198\u4daf\ubefe\u5fe1\u416d\ub8be[expected:\u3bd6\u120d\u4bc8\ub70c\u9033\u4c2b](\u6198\u4daf\ubefe\u5fe1\u416d\ub8be::<init>, invokedynamic:\u946b\uf995\ufe34\u1833\ua61f\uc246(\u5f50\u7af6\u6c52\ub171\ud158\u4bc8:()L\u4f52\u6cfe\u9a18\uc29a\u3bd6/\u946b\uf995\ufe34\u1833\ua61f\uc246;), var_6_7D:InputStream)
                    looporswitchbreak()
                }
                
                var_3_5F = and:int(var_3_5F:int, ldc:int(1933088849))
            }
            
            return:\u3bd6\u120d\u4bc8\ub70c\u9033\u4c2b(stack_C9_0:\u3bd6\u120d\u4bc8\ub70c\u9033\u4c2b)
        }
        catch (java.io.IOException var_5_CE) {
            athrow(initobject:CompletionException(CompletionException::<init>, var_5_CE:IOException[expected:Throwable]))
        }
    }
    
    private java.util.concurrent.CompletableFuture lambda$\uc246\u759a\u5db4\ubcb0\u4d85\ufcaf$1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
    
    private \u3d64\u7af6\uae87\uc238\u7d52.\u4179\uc7fe\ub8be\u64f2\ua068\u8389 lambda$\ud12e\u6c56\u3bc9\u9a18\u8350\u3d64$0(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
        var_2_61 : int
        var_4_72 : \ufe34\u960f\ua6bd\u71f1\u516c
        var_5_7B : Throwable
        var_6_84 : InputStream
        var_7_87 : Throwable
        var_8_92 : \ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a
        var_9_95 : Throwable
        var_10_13A : Throwable
        var_14_15F : Throwable
        var_8_17B : Throwable
        var_16_1A0 : Throwable
        var_6_1BC : Throwable
        var_18_1E3 : Throwable
        var_4_201 : IOException
        
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
        var_2_61 = and:int(ldc:int(1438816408), ldc:int(1507257596))
        
        try {
            var_2_61 = and:int(var_2_61:int, ldc:int(1408675821))
            var_4_72 = invokeinterface:\ufe34\u960f\ua6bd\u71f1\u516c(\u6c52\u52d3\u516c\uae87\uae5d::\u5d20\uc2e8\ubff1\u120d\u965f\u36d3, getfield:\u6c52\u52d3\u516c\uae87\uae5d(\u8aa5\uc3e3\u3d64\u64ab\u3711\u9a18::\ub1b9\uc3e3\u9a18\uf94d\u47c2\uae5d, this:\u8aa5\uc3e3\u3d64\u64ab\u3711\u9a18), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            var_2_61 = and:int(var_2_61:int, ldc:int(-1308979507))
            var_5_7B = aconstnull:Throwable()
            
            try {
                var_6_84 = invokeinterface:InputStream(\ufe34\u960f\ua6bd\u71f1\u516c::\u494c\u9af2\u3a62\u67d0\uff55\uc9f6, var_4_72:\ufe34\u960f\ua6bd\u71f1\u516c)
                var_7_87 = aconstnull:Throwable()
                
                try {
                    var_8_92 = initobject:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::<init>, var_6_84:InputStream)
                    var_9_95 = aconstnull:Throwable()
                    
                    try {
                        return:\u4179\uc7fe\ub8be\u64f2\ua068\u8389(initobject:\u4179\uc7fe\ub8be\u64f2\ua068\u8389(\u4179\uc7fe\ub8be\u64f2\ua068\u8389::<init>, invokevirtual:ByteBuffer(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u3dd3\u071d\u62da\ub113\ubf56\u69d9, var_8_92:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a), invokevirtual:AudioFormat(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::\u4492\u2dcc\u4c04\u92ff\uf94d\u6198, var_8_92:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a)))
                    }
                    catch (java.lang.Throwable var_10_13A) {
                        var_9_95 = var_10_13A:Throwable
                        athrow(var_10_13A:Throwable)
                    }
                    finally {
                        if (cmpne:boolean(var_8_92:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a, aconstnull:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a())) {
                            if (cmpne:boolean(var_9_95:Throwable, aconstnull:Throwable())) {
                                try {
                                    invokevirtual:void(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::close, var_8_92:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a)
                                }
                                catch (java.lang.Throwable var_14_15F) {
                                    invokevirtual:void(Throwable::addSuppressed, var_9_95:Throwable, var_14_15F:Throwable)
                                }
                            }
                            else {
                                invokevirtual:void(\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a::close, var_8_92:\ua3b4\u36d3\u4975\u3d4b\uafe7\u3e2a)
                            }
                        }
                    }
                }
                catch (java.lang.Throwable var_8_17B) {
                    var_7_87 = var_8_17B:Throwable
                    athrow(var_8_17B:Throwable)
                }
                finally {
                    if (cmpne:boolean(var_6_84:InputStream, aconstnull:InputStream())) {
                        if (cmpne:boolean(var_7_87:Throwable, aconstnull:Throwable())) {
                            try {
                                invokevirtual:void(InputStream::close, var_6_84:InputStream)
                            }
                            catch (java.lang.Throwable var_16_1A0) {
                                invokevirtual:void(Throwable::addSuppressed, var_7_87:Throwable, var_16_1A0:Throwable)
                            }
                        }
                        else {
                            invokevirtual:void(InputStream::close, var_6_84:InputStream)
                        }
                    }
                }
            }
            catch (java.lang.Throwable var_6_1BC) {
                var_5_7B = var_6_1BC:Throwable
                athrow(var_6_1BC:Throwable)
            }
            finally {
                if (cmpne:boolean(var_4_72:\ufe34\u960f\ua6bd\u71f1\u516c, aconstnull:\ufe34\u960f\ua6bd\u71f1\u516c())) {
                    if (cmpne:boolean(var_5_7B:Throwable, aconstnull:Throwable())) {
                        try {
                            invokeinterface:void(Closeable::close, var_4_72:\ufe34\u960f\ua6bd\u71f1\u516c[expected:Closeable])
                        }
                        catch (java.lang.Throwable var_18_1E3) {
                            invokevirtual:void(Throwable::addSuppressed, var_5_7B:Throwable, var_18_1E3:Throwable)
                        }
                    }
                    else {
                        invokeinterface:void(Closeable::close, var_4_72:\ufe34\u960f\ua6bd\u71f1\u516c[expected:Closeable])
                    }
                }
            }
        }
        catch (java.io.IOException var_4_201) {
            athrow(initobject:CompletionException(CompletionException::<init>, var_4_201:IOException[expected:Throwable]))
        }
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
    
    public void \u74b1\u71f1\ucb79\ube23\u927d\ubb2b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_660 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_66B : int
        
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
        var_3_660 = and:int(ldc:int(-1663651528), ldc:int(2094734653))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8aa5\uc3e3\u3d64\u64ab\u3711\u9a18[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_660 = and:int(var_3_660:int, ldc:int(1000116531))
        }
        else {
            var_3_660 = and:int(var_3_660:int, ldc:int(-117719364))
            var_5_8A = and:int(ldc:int(-6530), ldc:int(6529))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(22754), ldc:int(-22756)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_660:int, ldc:int(-1644176645))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(3), ldc:int(2)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(219), ldc:int(2049)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_660 = and:int(var_3_DA:int, ldc:int(-1621148418))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(5121), ldc:int(9)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-363256254))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(297880105))
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0980)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1296822418))
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-727092301))
                    }
                    else {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1482322047))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0583)
                            }
                            
                            goto(Label_0828)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1922240424))
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1430542578))
                        goto(Label_0980)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(692981756))
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-304851622))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(982258116))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(433551037))
                        var_11_EB = and:int(ldc:int(-10125), ldc:int(10124))
                        goto(Label_1526)
                    }
                    
                    Label_0583:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1233559422))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1775825162))
                        goto(Label_0980)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-600084467))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-657708844))
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1526801808))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-621341445))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0828)
                        }
                    }
                    
                    Label_0716:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0980)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(324516394))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1636394223))
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(517108539))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0828:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1571547386))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-252666848))
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(840618073))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(518465669))
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1365887617))
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1815927465))
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(2137919481))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-111502275))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(10433), ldc:int(16913))
                                goto(Label_1131)
                            }
                        }
                    }
                    
                    Label_0980:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1905274927))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0828)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1204879015))
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1345759121))
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-92400708))
                        var_11_EB = and:int(ldc:int(17512), ldc:int(-19561))
                    }
                    
                    Label_1131:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(170021324))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1136912769))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0980)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(236785279))
                            goto(Label_0828)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1049459043))
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1483926821))
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1647168839))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1263:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(88250651))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(561848385))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(235499242))
                            goto(Label_1131)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0980)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0828)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(842499536))
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-545562949))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1526)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1398:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1263)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-321156637))
                        goto(Label_1131)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0980)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-917172101))
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-871182002))
                        goto(Label_0410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(1006615805))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1526:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66B = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1537:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1263)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1131)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0980)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0828)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(813308085))
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1548567779))
                        goto(Label_0410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1584617085))
                        var_17_66B = add:int(var_16_119:int, xor:int(ldc:int(18576), ldc:int(18577)))
                        looporswitchbreak()
                    }
                }
                
                var_3_660 = and:int(var_3_660:int, ldc:int(-1619378433))
                
                if (cmple:boolean(var_5_8A = var_17_66B:int, sub:int(var_6_91:int, and:int(ldc:int(1421), ldc:int(515))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4194304)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
