public abstract class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\ub7dc\u51fa\u3bc9\u8258\ub7dc\u93a2 {
    public void \ub7dc\u51fa\u3bc9\u8258\ub7dc\u93a2(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\ub7dc\u51fa\u3bc9\u8258\ub7dc\u93a2, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.TypeRewriteRule makeRule() {
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
    
    private com.mojang.serialization.Dynamic<T> \u446c\u836c\uafe7\u446c\u516c\u64ab(com.mojang.serialization.Dynamic<T> p0) {
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
    
    private java.util.Optional<com.mojang.serialization.Dynamic<T>> \u8350\ucb79\uc87f\u5245\u527a\u3c25(com.mojang.serialization.Dynamic<T> p0) {
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
    
    public abstract java.lang.String \u983f\ub6ab\u88c5\ub32d\u76bc\u6d99(java.lang.String p0);
    
    private com.mojang.serialization.Dynamic lambda$\u839e\u3bc9\u8cae\u9a18\u5bc4\u64f2$8(com.mojang.serialization.Dynamic p0, java.util.stream.Stream p1) {
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
    
    private com.mojang.serialization.Dynamic lambda$\u8413\u3711\ud171\u7ce1\u56bd\u965f$7(com.mojang.serialization.Dynamic p0) {
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
    
    private com.mojang.serialization.Dynamic lambda$\uc4d2\u6b5f\uc3e3\u3504\u0a06\u0b8e$6(com.mojang.serialization.Dynamic p0) {
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
            return:Dynamic(checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokestatic:Object[expected:Dynamic](DataFixUtils::orElse, invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(DataResult::map, invokevirtual:DataResult(DataResult::map, invokevirtual:DataResult(Dynamic::asString, p0:Dynamic), invokedynamic:Function<String, String>(apply:(L\u4f52\u6cfe\u9a18\uc29a\u3bd6/\ub7dc\u51fa\u3bc9\u8258\ub7dc\u93a2;)Ljava/util/function/Function;, this:\ub7dc\u51fa\u3bc9\u8258\ub7dc\u93a2)), invokedynamic:Function<String, Dynamic>(apply:(Lcom/mojang/serialization/Dynamic;)Ljava/util/function/Function;, p0:Dynamic[expected:DynamicLike]))), p0:Dynamic[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.serialization.Dynamic lambda$\u7d52\uafe7\u4e72\ufe34\ub6ab\u6ec6$5(com.mojang.serialization.Dynamic p0) {
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
    
    private com.mojang.datafixers.util.Pair lambda$\u7d52\ub19c\uc29a\u4f52\u62da\u4d85$4(com.mojang.datafixers.util.Pair p0) {
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
    
    private com.mojang.serialization.Dynamic lambda$null$3(com.mojang.serialization.Dynamic p0) {
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
    
    private com.mojang.serialization.Dynamic lambda$\u72f1\u12cb\u64f2\uc238\ud36e\uc4d2$2(com.mojang.serialization.Dynamic p0) {
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
            return:Dynamic(checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokestatic:Object[expected:Dynamic](DataFixUtils::orElse, invokespecial:Optional<Dynamic>(\ub7dc\u51fa\u3bc9\u8258\ub7dc\u93a2::\u8350\ucb79\uc87f\u5245\u527a\u3c25, this:\ub7dc\u51fa\u3bc9\u8258\ub7dc\u93a2, p0:Dynamic), p0:Dynamic[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    private java.util.function.Function lambda$\u9033\u6b5f\u4492\ub18d\u3776\u62da$1(com.mojang.serialization.DynamicOps p0) {
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
    
    private com.mojang.datafixers.util.Pair lambda$\u99f7\u527a\uc229\u1187\u0b8e\u5f50$0(com.mojang.datafixers.util.Pair p0) {
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
            return:Pair(invokevirtual:Pair(Pair::mapSecond, p0:Pair, invokedynamic:Function<Dynamic, Dynamic>(apply:(L\u4f52\u6cfe\u9a18\uc29a\u3bd6/\ub7dc\u51fa\u3bc9\u8258\ub7dc\u93a2;)Ljava/util/function/Function;, this:\ub7dc\u51fa\u3bc9\u8258\ub7dc\u93a2)))
        }
        
        goto(Label_0006)
    }
    
    public void \uc9f6\ua068\u3bd6\u76bc\u5f50\u4daf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A8 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6B3 : int
        
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
        var_3_6A8 = and:int(ldc:int(1113535570), ldc:int(1273459192))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub7dc\u51fa\u3bc9\u8258\ub7dc\u93a2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1667333264))
            var_5_81 = and:int(ldc:int(1364), ldc:int(-1365))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-30411), ldc:int(13514)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6A8:int, ldc:int(1727527412))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(265), ldc:int(8769)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(6801), ldc:int(8261)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6A8 = and:int(var_3_D1:int, ldc:int(1650573186))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(18851), ldc:int(1549)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-298690451))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1655945792))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1102647080))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1706835743))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1314730710))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-714549348))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-584180588))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1800525168))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1950645234))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-575133896))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1677180870))
                            var_11_E2 = and:int(ldc:int(3186), ldc:int(-3187))
                            goto(Label_1571)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(668592730))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(130249651))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1877920458))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-450215998))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(564769844))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-502430787))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-674966586))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-17189135))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1582815507))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(236533401))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1633708809))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1459044197))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-606540308))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1388467222))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1658475))
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(2128819986))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(1105), ldc:int(1104))
                                goto(Label_1146)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(98853973))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(826706967))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1099858438))
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1619941163))
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(459936427))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-711317080))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-79332765))
                        var_11_E2 = and:int(ldc:int(12826), ldc:int(-13851))
                    }
                    
                    Label_1146:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(455579542))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1865624201))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1284066843))
                            goto(Label_0968)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1531403751))
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1200695602))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1858941141))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1272441147))
                        goto(Label_1582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_1146)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(884143305))
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1768367287))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1909304682))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1128396655))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1571)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1416:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1900539679))
                        goto(Label_1582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1042095471))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-937232010))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(638558974))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1465980946))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1081878444))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-364120974))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1571:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B3 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1582:
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1513661449))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(82298335))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(-1985978492))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(752620767))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(319860710))
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A8:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1274935651))
                        var_17_6B3 = add:int(var_16_110:int, xor:int(ldc:int(-32727), ldc:int(-32728)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6A8 = and:int(var_3_6A8:int, ldc:int(1533016166))
                
                if (cmple:boolean(var_5_81 = var_17_6B3:int, sub:int(var_6_88:int, and:int(ldc:int(5201), ldc:int(2729))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6A8:int, ldc:int(4194304)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
