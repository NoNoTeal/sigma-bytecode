public class \ub113\uc4d2\u183a\u527a\u6435.\u1187\ua562\u8308\u8bb0\ube23\ubded {
    public void \u1187\ua562\u8308\u8bb0\ube23\ubded(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u1187\ua562\u8308\u8bb0\ube23\ubded, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.TypeRewriteRule makeRule() {
        var_3_64 : Schema
        var_4_69 : Schema
        
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
            var_3_64 = invokevirtual:Schema(\u1187\ua562\u8308\u8bb0\ube23\ubded::getInputSchema, this:\u1187\ua562\u8308\u8bb0\ube23\ubded)
            var_4_69 = invokevirtual:Schema(\u1187\ua562\u8308\u8bb0\ube23\ubded::getOutputSchema, this:\u1187\ua562\u8308\u8bb0\ube23\ubded)
            return:TypeRewriteRule(invokespecial:TypeRewriteRule(\u1187\ua562\u8308\u8bb0\ube23\ubded::\ua61f\u5bc4\u67d0\u5fe1\ub102\u9033, this:\u1187\ua562\u8308\u8bb0\ube23\ubded, var_3_64:Schema, var_4_69:Schema, invokevirtual:Type(Schema::getTypeRaw, var_3_64:Schema, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u8640\u8df4\u7330\u8350\u6c56\ucfaf)), invokevirtual:Type(Schema::getTypeRaw, var_4_69:Schema, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u8640\u8df4\u7330\u8350\u6c56\ucfaf)), invokevirtual:Type(Schema::getTypeRaw, var_3_64:Schema, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\ua61f\u93a2\uc7fe\u7af6\u4492\u99f7))))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.datafixers.TypeRewriteRule \ua61f\u5bc4\u67d0\u5fe1\ub102\u9033(com.mojang.datafixers.schemas.Schema p0, com.mojang.datafixers.schemas.Schema p1, com.mojang.datafixers.types.Type<OldEntityTree> p2, com.mojang.datafixers.types.Type<NewEntityTree> p3, com.mojang.datafixers.types.Type<Entity> p4) {
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
    
    private static java.util.function.Function lambda$\u5db4\u9255\u97e6\u47c2\u4975\ud51e$6(com.mojang.datafixers.types.Type p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.types.Type p3, com.mojang.datafixers.OpticFinder p4, com.mojang.serialization.DynamicOps p5) {
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
    
    private static com.mojang.datafixers.util.Pair lambda$\u5140\u4e72\ufe34\ucb79\u71f1\u759a$5(com.mojang.datafixers.types.Type p0, com.mojang.serialization.DynamicOps p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.OpticFinder p3, com.mojang.datafixers.types.Type p4, com.mojang.datafixers.OpticFinder p5, com.mojang.datafixers.util.Pair p6) {
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
    
    private static java.lang.IllegalStateException lambda$\u6d69\u4f4a\u3504\ub32d\u6b5f\u960f$4() {
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
            return:IllegalStateException(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u1187\ua562\u8308\u8bb0\ube23\ubded::\uf94d\u6d69\ua562\ubb2b\u4d85\u0800), and:int(ldc:int(1655), ldc:int(20742)))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.IllegalStateException lambda$null$3() {
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
            return:IllegalStateException(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u1187\ua562\u8308\u8bb0\ube23\ubded::\uf94d\u6d69\ua562\ubb2b\u4d85\u0800), xor:int(ldc:int(10245), ldc:int(10242)))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.util.Either lambda$\u3776\u392e\u62da\u4492\ud4fe\ub1b9$2(com.mojang.datafixers.types.Type p0, com.mojang.serialization.DynamicOps p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.OpticFinder p3, com.mojang.datafixers.util.Pair p4) {
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
    
    private static java.lang.IllegalStateException lambda$null$1() {
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
            return:IllegalStateException(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u1187\ua562\u8308\u8bb0\ube23\ubded::\uf94d\u6d69\ua562\ubb2b\u4d85\u0800), xor:int(ldc:int(678), ldc:int(673)))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.IllegalStateException lambda$\u3c25\u946b\ub102\u4c04\uc84e\u3776$0() {
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
            return:IllegalStateException(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u1187\ua562\u8308\u8bb0\ube23\ubded::\uf94d\u6d69\ua562\ubb2b\u4d85\u0800), xor:int(ldc:int(4188), ldc:int(4180)))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_37A : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_D9_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_284_0 : byte[] [generated]
        stack_2D5_0 : byte[] [generated]
        stack_33B_0 : byte[] [generated]
        stack_39E_0 : byte[] [generated]
        var_4_25D : int
        var_3_262 : byte[]
        var_5_263 : int
        expr_284 : byte [generated]
        var_0_394 : int
        expr_39E : byte [generated]
        stack_3CE_2 : byte [generated]
        var_2_A5 : byte[]
        expr_A9 : int [generated]
        var_3_2C3 : byte[]
        var_5_2C4 : int
        expr_D9 : int [generated]
        expr_109 : int [generated]
        var_3_14B : String
        stack_256_0 : String[] [generated]
        expr_15D : String[] [generated]
        
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
        var_0_37A = and:int(ldc:int(-1878458724), ldc:int(-1109721157))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_284_0 = stack_2D5_0 = stack_33B_0 = stack_39E_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("8LhVU9EoRb73yKpjW6hr3ypVov0+tr5Vtrr3IkllSwHwvlW2uheeU7q2V2+WC66uTWG8X0+kJ4iqE5Si/T62vlW2uvciuFdT1zq+7SZFvvcYY1+u+xhzrO02pltRR6RvTzOMjlfROLa+Vba69yK4V1PXOr7tJkW+9xhjX677GHOs7TamW1FHpG9PM4ysrk1hvF9PpEcPklO6tld/mLayVVPRyL66e5xR7TZRnmfTyq7nPLa+Vba69zJBpmdrlLayVVPRyL66e5xR7TZRnmfTyq7nPLa+Vba69yJJZUvROkGmZ7pbWZZxqOfkjEewB6xDS1+8X986vldZS6RvrqcC")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_25D = expr_6E:int
        var_3_262 = newarray:byte[](byte.class, expr_6E:int)
        var_5_263 = expr_6E:int
        Label_0613:
        
        while (cmpne:boolean(and:int(var_0_37A:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_37A:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_0796)
            }
            
            var_0_37A = and:int(var_0_37A:int, ldc:int(-1845559391))
            var_5_263 = add:int(var_5_263:int, ldc:int(-1))
            expr_284 = loadelement:byte(stack_284_0:byte[], var_5_263:int)
            storeelement:byte(var_3_262:byte[], var_5_263:int, or:int(and:int(shl:int(expr_284:byte, and:int(ldc:int(8196), ldc:int(4103))), ldc:int(-16)), and:int(shr:int(expr_284:byte[expected:int], xor:int(ldc:int(265), ldc:int(269))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_263:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_284_0 = stack_2D5_0 = stack_33B_0 = stack_39E_0 = var_3_262:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0877)
        Label_0796:
        
        while (cmpne:boolean(and:int(var_0_37A:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_37A:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0613)
            }
            
            var_0_37A = and:int(var_0_37A:int, ldc:int(-1821523979))
            var_5_263 = add:int(var_5_263:int, ldc:int(-1))
            storeelement:byte(var_3_262:byte[], var_5_263:int, add:byte(xor:byte(loadelement:byte(stack_33B_0:byte[], var_5_263:int), ldc:byte(36)), ldc:byte(124)))
            
            if (cmpne:boolean(var_5_263:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_284_0 = stack_2D5_0 = stack_33B_0 = stack_39E_0 = var_3_262:byte[]
            goto(Label_0222)
        }
        
        Label_0877:
        
        while (cmpeq:boolean(and:int(var_0_37A:int, ldc:int(1)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_37A:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_37A = and:int(var_0_37A:int, ldc:int(1305774790))
                goto(Label_0613)
            }
            
            var_0_394 = and:int(var_0_37A:int, ldc:int(-612761932))
            var_5_263 = add:int(var_5_263:int, ldc:int(-1))
            expr_39E = loadelement:byte(stack_39E_0:byte[], var_5_263:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_263:int, ldc:int(1)), neg:int(var_4_25D:int)), ldc:int(0))) {
                var_0_394 = and:int(var_0_394:int, ldc:int(-237191434))
                stack_3CE_2 = add:byte(expr_39E:byte, ldc:byte(1))
            }
            else {
                stack_3CE_2 = add:byte(expr_39E:byte, loadelement:byte(var_3_262:byte[], add:int(var_5_263:int, ldc:int(1))))
            }
            
            var_0_37A = and:int(var_0_394:int, ldc:int(-147079208))
            storeelement:byte(var_3_262:byte[], var_5_263:int, stack_3CE_2:byte)
            
            if (cmpne:boolean(var_5_263:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_284_0 = stack_2D5_0 = stack_33B_0 = stack_39E_0 = var_3_262:byte[]
            goto(Label_0270)
        }
        
        var_0_37A = and:int(var_0_37A:int, ldc:int(-2081710065))
        goto(Label_0796)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_37A:int, ldc:int(524288)), ldc:int(0))) {
            var_0_37A = and:int(var_0_37A:int, ldc:int(-1488115365))
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_37A:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_37A:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_37A = and:int(var_0_37A:int, ldc:int(-749672743))
        }
        else {
            var_0_37A = and:int(var_0_37A:int, ldc:int(-134349141))
            var_2_A5 = stack_A5_0:byte[]
            expr_A9 = add:int(arraylength:int(stack_A7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A9:int, ldc:int(0))) {
                var_3_2C3 = newarray:byte[](byte.class, expr_A9:int)
                var_5_2C4 = expr_A9:int
                
                loop {
                    var_0_37A = and:int(var_0_37A:int, ldc:int(-1797537793))
                    var_5_2C4 = add:int(var_5_2C4:int, ldc:int(-1))
                    storeelement:byte(var_3_2C3:byte[], var_5_2C4:int, add:int(shl:int(loadelement:byte(stack_2D5_0:byte[], var_5_2C4:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_A5:byte[], add:int(var_5_2C4:int, xor:int(ldc:int(16385), ldc:int(16384)))), ldc:int(5)), and:int(ldc:int(12559), ldc:int(759)))))
                    
                    if (cmpne:boolean(var_5_2C4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_D7_0 = stack_D9_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_284_0 = stack_2D5_0 = stack_33B_0 = stack_39E_0 = var_3_2C3:byte[]
            }
        }
        
        Label_0174:
        
        if (cmpne:boolean(and:int(var_0_37A:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_37A = and:int(var_0_37A:int, ldc:int(2139543603))
            goto(Label_0270)
        }
        
        if (cmpne:boolean(and:int(var_0_37A:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_37A:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_37A = and:int(var_0_37A:int, ldc:int(-1826767158))
            expr_D9 = arraylength:int(stack_D9_0:byte[])
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_4_25D = expr_D9:int
                var_3_262 = newarray:byte[](byte.class, expr_D9:int)
                var_5_263 = expr_D9:int
                goto(Label_0796)
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_37A:int, ldc:int(1)), ldc:int(0))) {
            var_0_37A = and:int(var_0_37A:int, ldc:int(438602931))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_37A:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0174)
            }
            
            if (cmpeq:boolean(and:int(var_0_37A:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_37A = and:int(var_0_37A:int, ldc:int(-224723311))
            expr_109 = arraylength:int(stack_109_0:byte[])
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_4_25D = expr_109:int
                var_3_262 = newarray:byte[](byte.class, expr_109:int)
                var_5_263 = expr_109:int
                goto(Label_0877)
            }
        }
        
        Label_0270:
        
        if (cmpeq:boolean(and:int(var_0_37A:int, ldc:int(1024)), ldc:int(0))) {
            var_0_37A = and:int(var_0_37A:int, ldc:int(-1484689365))
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_37A:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_37A = and:int(var_0_37A:int, ldc:int(2076046827))
            goto(Label_0174)
        }
        
        if (cmpeq:boolean(and:int(var_0_37A:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_256_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8756), ldc:int(8765)))
            expr_15D = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(5161), ldc:int(24843)))
            storeelement:String(expr_15D:String[], and:int(ldc:int(395), ldc:int(5192)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(-307), ldc:int(306)), xor:int(ldc:int(10256), ldc:int(10288))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(3205), ldc:int(3201)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(2074), ldc:int(2106)), and:int(ldc:int(2110), ldc:int(4410))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(4111), ldc:int(2227)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(4666), ldc:int(16702)), xor:int(ldc:int(10050), ldc:int(10017))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(8705), ldc:int(8707)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(6499), ldc:int(26215)), and:int(ldc:int(7372), ldc:int(8364))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(12289), ldc:int(2081)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(8910), ldc:int(16797)), and:int(ldc:int(190), ldc:int(17046))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(-10133), ldc:int(10132)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(21142), ldc:int(2238)), and:int(ldc:int(16862), ldc:int(4252))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(7), ldc:int(16710)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(246), ldc:int(106)), xor:int(ldc:int(10294), ldc:int(10379))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(17217), ldc:int(17222)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(2171), ldc:int(2246)), and:int(ldc:int(12519), ldc:int(483))))
            storeelement:String(expr_15D:String[], xor:int(ldc:int(2114), ldc:int(2119)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, xor:int(ldc:int(16658), ldc:int(16881)), xor:int(ldc:int(-32633), ldc:int(-32647))))
            putstatic:String[](\u1187\ua562\u8308\u8bb0\ube23\ubded::\uf94d\u6d69\ua562\ubb2b\u4d85\u0800, expr_15D:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ub102\ud4fe\u6fb0\u6d69\uc31c\u8c8a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6CC : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_6D7 : int
        
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
        var_3_6CC = and:int(ldc:int(-1142846582), ldc:int(738049911))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u1187\ua562\u8308\u8bb0\ube23\ubded[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1359892598))
            var_5_81 = and:int(ldc:int(22788), ldc:int(-22853))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-9078), ldc:int(8821)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_6CC:int, ldc:int(-69088530))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, xor:int(ldc:int(18696), ldc:int(18697)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, xor:int(ldc:int(18624), ldc:int(18625)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_6CC = and:int(var_3_D1:int, ldc:int(-1343504477))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(258), ldc:int(259)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1799500007))
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1603159524))
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1665159905))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1999044474))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1292206577))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1533298161))
                    }
                    else {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(712571883))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-578944121))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-242079738))
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-510200705))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1952120500))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(737803134))
                            var_11_E2 = and:int(ldc:int(-31685), ldc:int(31680))
                            goto(Label_1616)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-2082046979))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-555111129))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1439077658))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1444816730))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1890995374))
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-281584503))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-823813397))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(2010880099))
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1229160673))
                        goto(Label_1470)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(132502732))
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-338902658))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-972627383))
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1141588278))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0870:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-544067216))
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1512783767))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1397026288))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(2102505644))
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1120069080))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-435952953))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-747630465))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(726898754))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-270292026))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(-15358), ldc:int(-15357))
                                goto(Label_1182)
                            }
                        }
                    }
                    
                    Label_1031:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-99944703))
                        goto(Label_1325)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1735383804))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(87609270))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(780069482))
                        var_11_E2 = and:int(ldc:int(-2003), ldc:int(2000))
                    }
                    
                    Label_1182:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-577042907))
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(909203188))
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1654412219))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(87043763))
                            goto(Label_1031)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(1442281392))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-616585587))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(2129234471))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1470)
                            }
                        }
                    }
                    
                    Label_1325:
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1487785385))
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1925587371))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_1182)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1262645778))
                            goto(Label_1031)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(-575900148))
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(657828066))
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6CC = and:int(var_3_6CC:int, ldc:int(250129239))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1616)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1470:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1813501634))
                        goto(Label_1627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-276411454))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(1528532079))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-547952560))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(333352909))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1629229478))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1616:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6D7 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1627:
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1470)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(543157073))
                        goto(Label_1325)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1441351374))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1736654797))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6CC:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6CC = and:int(var_3_6CC:int, ldc:int(-1151206550))
                        var_17_6D7 = add:int(var_16_110:int, and:int(ldc:int(12353), ldc:int(16401)))
                        looporswitchbreak()
                    }
                    
                    var_3_6CC = and:int(var_3_6CC:int, ldc:int(-423101852))
                }
                
                var_3_6CC = and:int(var_3_6CC:int, ldc:int(-336621625))
                
                if (cmple:boolean(var_5_81 = var_17_6D7:int, sub:int(var_6_88:int, and:int(ldc:int(3385), ldc:int(20481))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_6CC:int, ldc:int(32768)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
