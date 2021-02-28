public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u4f52\u52d3\u516c\ud7e8\ubf56\u6198 {
    public void \u4f52\u52d3\u516c\ud7e8\ubf56\u6198(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u4f52\u52d3\u516c\ud7e8\ubf56\u6198, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.TypeRewriteRule makeRule() {
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
            return:TypeRewriteRule(invokespecial:TypeRewriteRule(\u4f52\u52d3\u516c\ud7e8\ubf56\u6198::\u99f7\u4f52\uf9c5\ua6bd\ubcb0\ubb2b, this:\u4f52\u52d3\u516c\ud7e8\ubf56\u6198, invokevirtual:Type(Schema::getTypeRaw, invokevirtual:Schema(\u4f52\u52d3\u516c\ud7e8\ubf56\u6198::getOutputSchema, this:\u4f52\u52d3\u516c\ud7e8\ubf56\u6198), getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u92ff\ub171\u4c04\u8df4\u64ab\u6bb9))))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.datafixers.TypeRewriteRule \u99f7\u4f52\uf9c5\ua6bd\ubcb0\ubb2b(com.mojang.datafixers.types.Type<R> p0) {
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
    
    private com.mojang.datafixers.Typed<?> \uceb8\u52d3\u67d0\u4179\u7873\u600f(com.mojang.datafixers.types.Type<R> p0, com.mojang.datafixers.types.Type<com.mojang.datafixers.util.Pair<com.mojang.datafixers.util.Either<com.mojang.datafixers.util.Pair<java.util.List<com.mojang.datafixers.util.Pair<R, java.lang.Integer>>, com.mojang.serialization.Dynamic<?>>, com.mojang.datafixers.util.Unit>, com.mojang.serialization.Dynamic<?>>> p1, com.mojang.datafixers.Typed<?> p2) {
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
    
    private static void lambda$\u7049\u071d\uc238\u3bc9\ub83f\u983f$5(com.mojang.datafixers.types.Type p0, java.util.List p1, int p2, com.mojang.serialization.Dynamic p3) {
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
    
    private static void lambda$\u9033\u718f\uf9c5\u3d4b\uc7fe\uafe7$4(java.util.List p0, int p1, com.mojang.datafixers.util.Pair p2) {
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
            invokeinterface:boolean(List<Pair>::add, p0:List<Pair>, invokestatic:Pair(Pair::of, invokevirtual:Object(Pair::getFirst, p2:Pair), invokestatic:Integer[expected:Object](Integer::valueOf, p1:int)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.datafixers.Typed lambda$\u6b0d\u71ae\u3d4b\u8308\u4f4a\u9033$3(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.types.Type p1, com.mojang.datafixers.types.Type p2, com.mojang.datafixers.types.Type p3, com.mojang.datafixers.OpticFinder p4, com.mojang.datafixers.types.Type p5, com.mojang.datafixers.OpticFinder p6, com.mojang.datafixers.types.Type p7, com.mojang.datafixers.Typed p8) {
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
    
    private com.mojang.datafixers.Typed lambda$\u3e75\u5654\ud171\u4cd9\uc3e3\ucb79$2(com.mojang.datafixers.types.Type p0, com.mojang.datafixers.types.Type p1, com.mojang.datafixers.Typed p2) {
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
            return:Typed(invokespecial:Typed<?>(\u4f52\u52d3\u516c\ud7e8\ubf56\u6198::\uceb8\u52d3\u67d0\u4179\u7873\u600f, this:\u4f52\u52d3\u516c\ud7e8\ubf56\u6198, p0:Type, p1:Type, p2:Typed))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.datafixers.Typed lambda$null$1(com.mojang.datafixers.types.Type p0, com.mojang.datafixers.types.Type p1, com.mojang.datafixers.Typed p2) {
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
            return:Typed(invokespecial:Typed<?>(\u4f52\u52d3\u516c\ud7e8\ubf56\u6198::\uceb8\u52d3\u67d0\u4179\u7873\u600f, this:\u4f52\u52d3\u516c\ud7e8\ubf56\u6198, p0:Type, p1:Type, p2:Typed))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.datafixers.Typed lambda$\uc2bd\uc7fe\uc229\u600f\ub19c\u071d$0(com.mojang.datafixers.types.Type p0, com.mojang.datafixers.types.Type p1, com.mojang.datafixers.Typed p2) {
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
            return:Typed(invokespecial:Typed<?>(\u4f52\u52d3\u516c\ud7e8\ubf56\u6198::\uceb8\u52d3\u67d0\u4179\u7873\u600f, this:\u4f52\u52d3\u516c\ud7e8\ubf56\u6198, p0:Type, p1:Type, p2:Typed))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2ED : int
        expr_6E : int [generated]
        stack_B6_0 : byte[] [generated]
        stack_B8_0 : byte[] [generated]
        stack_102_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_14C_0 : byte[] [generated]
        stack_14E_0 : byte[] [generated]
        stack_184_0 : byte[] [generated]
        stack_186_0 : byte[] [generated]
        stack_1C4_0 : byte[] [generated]
        stack_300_0 : byte[] [generated]
        stack_351_0 : byte[] [generated]
        stack_3C9_0 : byte[] [generated]
        stack_420_0 : byte[] [generated]
        stack_49E_0 : byte[] [generated]
        var_4_2C7 : int
        var_3_2CC : byte[]
        var_5_2CD : int
        expr_300 : byte [generated]
        var_0_416 : int
        expr_420 : byte [generated]
        stack_469_2 : byte [generated]
        stack_446_0 : byte [generated]
        var_2_B6 : byte[]
        expr_BA : int [generated]
        var_3_33F : byte[]
        var_5_340 : int
        expr_104 : int [generated]
        expr_14E : int [generated]
        expr_186 : int [generated]
        var_3_48C : byte[]
        var_5_48D : int
        var_3_1D0 : String
        stack_2C0_0 : String[] [generated]
        expr_1E2 : String[] [generated]
        
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
        var_0_2ED = and:int(ldc:int(1395512516), ldc:int(900714669))
        expr_6E = arraylength:int(stack_B6_0 = stack_B8_0 = stack_102_0 = stack_104_0 = stack_14C_0 = stack_14E_0 = stack_184_0 = stack_186_0 = stack_1C4_0 = stack_300_0 = stack_351_0 = stack_3C9_0 = stack_420_0 = stack_49E_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("MIJGw3WIw7d8uEu2yEA1BEJzfLhLhny5M4nHx4B0fLhLhr46zTR8ifZJwPV8uEu2yIO3i0RzeHy4S7bIg7eLRDN5wYb0uEiGdUsHtMyMMwT3+cyCND2KRsN1uDq4SIZ1Swe0zIw09opGw3W4OrhIhnVLB7TMjPfEhgc12dAN")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2C7 = expr_6E:int
        var_3_2CC = newarray:byte[](byte.class, expr_6E:int)
        var_5_2CD = expr_6E:int
        Label_0719:
        
        while (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(128)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(512)), ldc:int(0))) {
                var_0_2ED = and:int(var_0_2ED:int, ldc:int(-1506764005))
                goto(Label_0920)
            }
            
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(-71579692))
            var_5_2CD = add:int(var_5_2CD:int, ldc:int(-1))
            expr_300 = loadelement:byte(stack_300_0:byte[], var_5_2CD:int)
            storeelement:byte(var_3_2CC:byte[], var_5_2CD:int, or:int(and:int(shl:int(expr_300:byte, and:int(ldc:int(28740), ldc:int(1053))), ldc:int(-16)), and:int(shr:int(expr_300:byte[expected:int], xor:int(ldc:int(1056), ldc:int(1060))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_2CD:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B8_0 = stack_B6_0 = stack_102_0 = stack_104_0 = stack_14C_0 = stack_14E_0 = stack_184_0 = stack_186_0 = stack_1C4_0 = stack_300_0 = stack_351_0 = stack_3C9_0 = stack_420_0 = stack_49E_0 = var_3_2CC:byte[]
            goto(Label_0115)
        }
        
        var_0_2ED = and:int(var_0_2ED:int, ldc:int(1748423430))
        goto(Label_1016)
        Label_0920:
        
        while (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(1048576)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(128)), ldc:int(0))) {
                var_0_2ED = and:int(var_0_2ED:int, ldc:int(180025743))
                goto(Label_0719)
            }
            
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(1399833476))
            var_5_2CD = add:int(var_5_2CD:int, ldc:int(-1))
            storeelement:byte(var_3_2CC:byte[], var_5_2CD:int, xor:byte(loadelement:byte(stack_3C9_0:byte[], var_5_2CD:int), ldc:byte(30)))
            
            if (cmpne:boolean(var_5_2CD:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B8_0 = stack_B6_0 = stack_102_0 = stack_104_0 = stack_14C_0 = stack_14E_0 = stack_184_0 = stack_186_0 = stack_1C4_0 = stack_300_0 = stack_351_0 = stack_3C9_0 = stack_420_0 = stack_49E_0 = var_3_2CC:byte[]
            goto(Label_0265)
        }
        
        var_0_2ED = and:int(var_0_2ED:int, ldc:int(58441475))
        Label_1016:
        
        while (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0719)
            }
            
            var_0_416 = and:int(var_0_2ED:int, ldc:int(360439286))
            var_5_2CD = add:int(var_5_2CD:int, ldc:int(-1))
            expr_420 = stack_469_2 = loadelement(stack_420_0, var_5_2CD)
            
            if (cmplt:boolean(add:int(add:int(var_5_2CD:int, ldc:int(2)), neg:int(var_4_2C7:int)), ldc:int(0))) {
                stack_469_2 = stack_446_0 = add:byte(expr_420:byte, loadelement:byte(var_3_2CC:byte[], add:int(var_5_2CD:int, ldc:int(2))))
                goto(Label_1110)
            }
            
            Label_1069:
            
            if (cmpeq:boolean(and:int(var_0_416:int, ldc:int(4)), ldc:int(0))) {
                var_0_416 = and:int(var_0_416:int, ldc:int(1980753837))
            }
            else {
                var_0_416 = and:int(var_0_416:int, ldc:int(-1245775132))
                stack_469_2 = stack_446_0 = add:byte(expr_420:byte, ldc:byte(2))
            }
            
            Label_1110:
            
            if (cmpeq:boolean(and:int(var_0_416:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_1069)
            }
            
            var_0_2ED = and:int(var_0_416:int, ldc:int(367975151))
            storeelement:byte(var_3_2CC:byte[], var_5_2CD:int, stack_469_2:byte)
            
            if (cmpne:boolean(var_5_2CD:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B8_0 = stack_B6_0 = stack_102_0 = stack_104_0 = stack_14C_0 = stack_14E_0 = stack_184_0 = stack_186_0 = stack_1C4_0 = stack_300_0 = stack_351_0 = stack_3C9_0 = stack_420_0 = stack_49E_0 = var_3_2CC:byte[]
            goto(Label_0339)
        }
        
        var_0_2ED = and:int(var_0_2ED:int, ldc:int(882517519))
        goto(Label_0920)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(32)), ldc:int(0))) {
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(-1181111424))
            goto(Label_0395)
        }
        
        if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0339)
        }
        
        if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(576063737))
            goto(Label_0265)
        }
        
        if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(32)), ldc:int(0))) {
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(-941946126))
        }
        else {
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(-1824528913))
            var_2_B6 = stack_B6_0:byte[]
            expr_BA = add:int(arraylength:int(stack_B8_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_BA:int, ldc:int(0))) {
                var_3_33F = newarray:byte[](byte.class, expr_BA:int)
                var_5_340 = expr_BA:int
                
                loop {
                    var_0_2ED = and:int(var_0_2ED:int, ldc:int(-1724331340))
                    var_5_340 = add:int(var_5_340:int, ldc:int(-1))
                    storeelement:byte(var_3_33F:byte[], var_5_340:int, add:int(shl:int(loadelement:byte(stack_351_0:byte[], var_5_340:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_B6:byte[], add:int(var_5_340:int, and:int(ldc:int(9219), ldc:int(985)))), ldc:int(2)), xor:int(ldc:int(16410), ldc:int(16421)))))
                    
                    if (cmpne:boolean(var_5_340:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B8_0 = stack_B6_0 = stack_102_0 = stack_104_0 = stack_14C_0 = stack_14E_0 = stack_184_0 = stack_186_0 = stack_1C4_0 = stack_300_0 = stack_351_0 = stack_3C9_0 = stack_420_0 = stack_49E_0 = var_3_33F:byte[]
            }
        }
        
        Label_0191:
        
        if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0395)
        }
        
        if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(524288)), ldc:int(0))) {
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(543818193))
            goto(Label_0339)
        }
        
        if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(256)), ldc:int(0))) {
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(361054499))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(32768)), ldc:int(0))) {
                var_0_2ED = and:int(var_0_2ED:int, ldc:int(-1521398467))
                goto(Label_0115)
            }
            
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(-1854285436))
            expr_104 = arraylength:int(stack_104_0:byte[])
            
            if (cmpne:boolean(expr_104:int, ldc:int(0))) {
                var_4_2C7 = expr_104:int
                var_3_2CC = newarray:byte[](byte.class, expr_104:int)
                var_5_2CD = expr_104:int
                goto(Label_0920)
            }
        }
        
        Label_0265:
        
        if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(131072)), ldc:int(0))) {
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(1101735543))
            goto(Label_0395)
        }
        
        if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(8)), ldc:int(0))) {
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(-371155320))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_2ED = and:int(var_0_2ED:int, ldc:int(-1355449255))
                goto(Label_0191)
            }
            
            if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(-1719669537))
            expr_14E = arraylength:int(stack_14E_0:byte[])
            
            if (cmpne:boolean(expr_14E:int, ldc:int(0))) {
                var_4_2C7 = expr_14E:int
                var_3_2CC = newarray:byte[](byte.class, expr_14E:int)
                var_5_2CD = expr_14E:int
                goto(Label_1016)
            }
        }
        
        Label_0339:
        
        if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(512)), ldc:int(0))) {
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(-1883389860))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0265)
            }
            
            if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0191)
            }
            
            if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(2146036396))
            expr_186 = arraylength:int(stack_186_0:byte[])
            
            if (cmpne:boolean(expr_186:int, ldc:int(0))) {
                var_3_48C = newarray:byte[](byte.class, expr_186:int)
                var_5_48D = expr_186:int
                
                loop {
                    var_0_2ED = and:int(var_0_2ED:int, ldc:int(-1115960170))
                    var_5_48D = add:int(var_5_48D:int, ldc:int(-1))
                    storeelement:byte(var_3_48C:byte[], var_5_48D:int, add:byte(loadelement:byte(stack_49E_0:byte[], var_5_48D:int), ldc:byte(6)))
                    
                    if (cmpne:boolean(var_5_48D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B8_0 = stack_B6_0 = stack_102_0 = stack_104_0 = stack_14C_0 = stack_14E_0 = stack_184_0 = stack_186_0 = stack_1C4_0 = stack_300_0 = stack_351_0 = stack_3C9_0 = stack_420_0 = stack_49E_0 = var_3_48C:byte[]
            }
        }
        
        Label_0395:
        
        if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(32768)), ldc:int(0))) {
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(-1970367170))
            goto(Label_0339)
        }
        
        if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_0265)
        }
        
        if (cmpne:boolean(and:int(var_0_2ED:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0191)
        }
        
        if (cmpeq:boolean(and:int(var_0_2ED:int, ldc:int(524288)), ldc:int(0))) {
            var_0_2ED = and:int(var_0_2ED:int, ldc:int(1477269406))
            goto(Label_0115)
        }
        
        var_3_1D0 = initobject:String(String::<init>, stack_1C4_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_2C0_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(71), ldc:int(79)))
        expr_1E2 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(792), ldc:int(1032)))
        storeelement:String(expr_1E2:String[], and:int(ldc:int(10414), ldc:int(581)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, and:int(ldc:int(4291), ldc:int(-4292)), and:int(ldc:int(13585), ldc:int(533))))
        storeelement:String(expr_1E2:String[], and:int(ldc:int(23), ldc:int(6703)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, and:int(ldc:int(4185), ldc:int(529)), xor:int(ldc:int(221), ldc:int(192))))
        storeelement:String(expr_1E2:String[], xor:int(ldc:int(-32352), ldc:int(-32346)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, and:int(ldc:int(61), ldc:int(25631)), and:int(ldc:int(28203), ldc:int(303))))
        storeelement:String(expr_1E2:String[], and:int(ldc:int(15206), ldc:int(-15207)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, xor:int(ldc:int(1323), ldc:int(1280)), and:int(ldc:int(18614), ldc:int(9783))))
        storeelement:String(expr_1E2:String[], and:int(ldc:int(18053), ldc:int(14407)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, xor:int(ldc:int(2842), ldc:int(2860)), xor:int(ldc:int(8208), ldc:int(8277))))
        storeelement:String(expr_1E2:String[], and:int(ldc:int(22122), ldc:int(279)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, xor:int(ldc:int(17408), ldc:int(17477)), and:int(ldc:int(11132), ldc:int(16604))))
        storeelement:String(expr_1E2:String[], xor:int(ldc:int(1602), ldc:int(1603)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, xor:int(ldc:int(3912), ldc:int(3860)), xor:int(ldc:int(4147), ldc:int(4190))))
        storeelement:String(expr_1E2:String[], xor:int(ldc:int(12326), ldc:int(12325)), invokevirtual:String[expected:String](String::substring, var_3_1D0:String, xor:int(ldc:int(81), ldc:int(60)), and:int(ldc:int(12669), ldc:int(16637))))
        putstatic:String[](\u4f52\u52d3\u516c\ud7e8\ubf56\u6198::\u5d20\u62da\u88c5\uc31c\ub32d\ud158, expr_1E2:String[])
    }
    
    public void \u839e\u8753\u9937\u76bc\ud217\u7e3f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66B : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_676 : int
        
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
        var_3_66B = and:int(ldc:int(-39118743), ldc:int(1834814898))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4f52\u52d3\u516c\ud7e8\ubf56\u6198[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
            var_3_66B = and:int(var_3_66B:int, ldc:int(1765575244))
        }
        else {
            var_3_66B = and:int(var_3_66B:int, ldc:int(1058997224))
            var_5_8A = and:int(ldc:int(-5219), ldc:int(5218))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16561), ldc:int(16560)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_66B:int, ldc:int(794534077))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(8472), ldc:int(8473)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(24612), ldc:int(24613)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_66B = and:int(var_3_DA:int, ldc:int(1843125815))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(6), ldc:int(7)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-562362897))
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(907315960))
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-2114738734))
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-9586904))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0548)
                            }
                            
                            goto(Label_0812)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1239010720))
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-335588692))
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(2134503395))
                            var_11_EB = and:int(ldc:int(-3433), ldc:int(3432))
                            goto(Label_1520)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0548:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1017356402))
                        goto(Label_1531)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-188009276))
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1784729080))
                        goto(Label_1257)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(393336543))
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(572622345))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1484966150))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1385593369))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0812)
                        }
                    }
                    
                    Label_0690:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1531)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-257990318))
                        goto(Label_1257)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1673563564))
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(129689379))
                        goto(Label_0945)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0548)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-318146188))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0812:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(989334491))
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1562423144))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(502492865))
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1584484364))
                            goto(Label_0548)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(405642469))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-280385625))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(73), ldc:int(2837))
                                goto(Label_1132)
                            }
                        }
                    }
                    
                    Label_0945:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-640465756))
                        goto(Label_1531)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1224345335))
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-299492841))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(2083448300))
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(2129220158))
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0548)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1202825940))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-408933907))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1836922354))
                        var_11_EB = and:int(ldc:int(-21464), ldc:int(21331))
                    }
                    
                    Label_1132:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-2145682558))
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1955888572))
                            goto(Label_0945)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1132968989))
                            goto(Label_0812)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0548)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-826239355))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-271856516))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1392)
                            }
                        }
                    }
                    
                    Label_1257:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1968356144))
                            goto(Label_1132)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0945)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(2111603406))
                            goto(Label_0812)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0690)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0548)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1673627481))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1953969832))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(2098028276))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1520)
                    }
                    
                    Label_1392:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1067318567))
                        goto(Label_1531)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1132)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1604995675))
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0548)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-7915522))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66B = and:int(var_3_66B:int, ldc:int(-1381027084))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1520:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_676 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1531:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1903415174))
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1257)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(326105679))
                        goto(Label_1132)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0945)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1124769993))
                        goto(Label_0812)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0690)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1899393180))
                        goto(Label_0548)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1845069494))
                        var_17_676 = add:int(var_16_119:int, xor:int(ldc:int(20490), ldc:int(20491)))
                        looporswitchbreak()
                    }
                }
                
                var_3_66B = and:int(var_3_66B:int, ldc:int(-315683728))
                
                if (cmple:boolean(var_5_8A = var_17_676:int, sub:int(var_6_91:int, and:int(ldc:int(3721), ldc:int(4437))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
