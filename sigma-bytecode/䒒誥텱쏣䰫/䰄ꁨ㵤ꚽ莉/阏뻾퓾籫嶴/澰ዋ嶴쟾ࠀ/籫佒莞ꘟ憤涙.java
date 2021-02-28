public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99 {
    public void \u7c6b\u4f52\u839e\ua61f\u61a4\u6d99(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.TypeRewriteRule makeRule() {
        var_3_70 : CompoundList$CompoundListType
        
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
            var_3_70 = invokestatic:CompoundList$CompoundListType(DSL::compoundList, invokestatic:Type(DSL::string), invokevirtual:Type(Schema::getType, invokevirtual:Schema(\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99::getInputSchema, this:\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99), getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4f52\u5140\u71ae\ud158\u385b\ua61f)))
            invokevirtual:OpticFinder(CompoundList$CompoundListType::finder, var_3_70:CompoundList$CompoundListType)
            return:TypeRewriteRule(invokespecial:TypeRewriteRule(\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99::\ucef1\u0a06\u64f2\u98a4\u51b2\ud51e, this:\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99, var_3_70:CompoundList$CompoundListType))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.datafixers.TypeRewriteRule \ucef1\u0a06\u64f2\u98a4\u51b2\ud51e(com.mojang.datafixers.types.templates.CompoundList$CompoundListType<java.lang.String, SF> p0) {
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
    
    private static com.mojang.datafixers.Typed lambda$\u7006\u67e9\u7ce1\u16f6\u9a18\u759a$13(com.mojang.datafixers.Typed p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\uf94d\u3504\u2dcc\u47c2\u8709\u4975$12(com.mojang.serialization.Dynamic p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u1187\u92ff\u8308\u0c95\u99f7\u5245$11(com.mojang.serialization.Dynamic p0) {
        var_1_5F : int
        stack_A4_0 : Dynamic [generated]
        
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
            var_1_5F = and:int(ldc:int(28832764), ldc:int(-1376259095))
            
            if (logicalnot:boolean(invokestatic:boolean(Objects::equals, invokestatic:String[expected:Object](\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::\ud12e\ud217\uc238\uc9f6\u4ab3\u0800, invokevirtual:String(Dynamic::asString, p0:Dynamic, loadelement:String(getstatic:String[](\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99::\u7af6\ub19c\ud171\u93a2\u983f\u416d), and:int(ldc:int(630), ldc:int(7))))), loadelement:String[expected:Object](getstatic:String[](\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99::\u7af6\ub19c\ud171\u93a2\u983f\u416d), and:int(ldc:int(4103), ldc:int(119)))))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-71828662))
                stack_A4_0 = p0:Dynamic
            }
            else {
                stack_A4_0 = invokevirtual:Dynamic(Dynamic::createString, p0:Dynamic, loadelement:String(getstatic:String[](\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99::\u7af6\ub19c\ud171\u93a2\u983f\u416d), and:int(ldc:int(18600), ldc:int(1368))))
            }
            
            return:Dynamic(stack_A4_0:Dynamic)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.Typed lambda$\u600f\uc7fe\u40a9\uc29a\u7873\uc31c$10(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.OpticFinder p3, com.mojang.datafixers.Typed p4) {
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
    
    private static com.mojang.datafixers.Typed lambda$\u120d\u4e72\u183a\u392e\u64f2\u4492$9(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.Typed p3) {
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
    
    private static com.mojang.datafixers.Typed lambda$\u4f4a\ub32d\u600f\u718f\u6b5f\u4c2b$8(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.Typed p2) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\uc2bd\ub113\u72f1\u97b7\uc2bd\u5654$7(com.mojang.serialization.Dynamic p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u16f6\uf94d\u64f2\u67e9\u6b0d\u12b2$6(com.mojang.serialization.Dynamic p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u0b8e\u5f50\ub1b9\u71ae\u4bc8\uc238$5(com.mojang.serialization.Dynamic p0, com.mojang.serialization.Dynamic p1) {
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
            return:Dynamic(invokevirtual:Dynamic(Dynamic::set, invokevirtual:Dynamic(Dynamic::remove, p0:Dynamic, loadelement:String(getstatic:String[](\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99::\u7af6\ub19c\ud171\u93a2\u983f\u416d), and:int(ldc:int(8330), ldc:int(4442)))), loadelement:String(getstatic:String[](\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99::\u7af6\ub19c\ud171\u93a2\u983f\u416d), and:int(ldc:int(1163), ldc:int(8491))), p1:Dynamic))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.Typed lambda$\ucb79\u4e72\u8350\u3776\u93a2\u62da$4(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.Typed p1) {
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
    
    private static java.util.List lambda$null$3(java.util.List p0) {
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
    
    private static com.mojang.datafixers.util.Pair lambda$\u392e\u16f6\u3711\u97e6\u62da\u5db4$2(com.mojang.datafixers.util.Pair p0) {
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
    
    private static java.lang.String lambda$null$1(java.lang.String p0) {
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
            return:String(ternaryop:String(invokevirtual:boolean(String::equals, p0:String, loadelement:String[expected:Object](getstatic:String[](\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99::\u7af6\ub19c\ud171\u93a2\u983f\u416d), and:int(ldc:int(16938), ldc:int(11338)))), loadelement:String(getstatic:String[](\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99::\u7af6\ub19c\ud171\u93a2\u983f\u416d), xor:int(ldc:int(-8184), ldc:int(-8189))), p0:String))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u0a06\u1187\u8389\u494c\uc246\u1833$0(com.mojang.datafixers.util.Pair p0) {
        var_1_61 : int
        stack_98_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-446249932), ldc:int(-1888107417))
            
            if (invokestatic:boolean(Objects::equals, invokevirtual:Object(Pair::getFirst, p0:Pair), loadelement:String[expected:Object](getstatic:String[](\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99::\u7af6\ub19c\ud171\u93a2\u983f\u416d), xor:int(ldc:int(5220), ldc:int(5231))))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(2012674774))
                stack_98_0 = and:int(ldc:int(16965), ldc:int(-23110))
            }
            else {
                stack_98_0 = xor:int(ldc:int(10760), ldc:int(10761))
            }
            
            return:boolean(stack_98_0:int)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_A2 : int
        expr_6E : int [generated]
        stack_AE_0 : byte[] [generated]
        stack_B0_0 : byte[] [generated]
        stack_F0_0 : byte[] [generated]
        stack_F2_0 : byte[] [generated]
        stack_129_0 : byte[] [generated]
        stack_12B_0 : byte[] [generated]
        stack_163_0 : byte[] [generated]
        stack_2F9_0 : byte[] [generated]
        stack_350_0 : byte[] [generated]
        stack_3DE_0 : byte[] [generated]
        stack_432_0 : byte[] [generated]
        var_4_2D2 : int
        var_3_2D7 : byte[]
        var_5_2D8 : int
        var_0_346 : int
        expr_350 : byte [generated]
        stack_390_2 : byte [generated]
        stack_36D_0 : byte [generated]
        expr_3E1 : byte [generated]
        expr_B0 : int [generated]
        expr_F2 : int [generated]
        var_2_129 : byte[]
        expr_12D : int [generated]
        var_3_420 : byte[]
        var_5_421 : int
        var_3_16F : String
        stack_2CB_0 : String[] [generated]
        expr_181 : String[] [generated]
        
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
        var_0_A2 = and:int(ldc:int(-1234138554), ldc:int(-1084715282))
        expr_6E = arraylength:int(stack_AE_0 = stack_B0_0 = stack_F0_0 = stack_F2_0 = stack_129_0 = stack_12B_0 = stack_163_0 = stack_2F9_0 = stack_350_0 = stack_3DE_0 = stack_432_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("d5TWpY2ClbmYp5WStJibqqWRfpW5mKeVkqSLoIGevaimqaWRfqysm5CnlZKknJ+MiqCetJyNqI2uf56Nu5ydfquem42unL+ZuZSnlZKUpaClnaOVg5mhmsuktVygjKybsKeVkpShq6SVg5mhmsuUrXirp5WS9AMJpw==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2D2 = expr_6E:int
        var_3_2D7 = newarray:byte[](byte.class, expr_6E:int)
        var_5_2D8 = expr_6E:int
        Label_0730:
        
        while (cmpne:boolean(and:int(var_0_A2:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_A2:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0808)
            }
            
            var_0_A2 = and:int(var_0_A2:int, ldc:int(753135447))
            var_5_2D8 = add:int(var_5_2D8:int, ldc:int(-1))
            storeelement:byte(var_3_2D7:byte[], var_5_2D8:int, add:byte(loadelement:byte(stack_2F9_0:byte[], var_5_2D8:int), ldc:byte(99)))
            
            if (cmpne:boolean(var_5_2D8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_F0_0 = stack_F2_0 = stack_129_0 = stack_12B_0 = stack_163_0 = stack_2F9_0 = stack_350_0 = stack_3DE_0 = stack_432_0 = var_3_2D7:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0950)
        Label_0808:
        
        while (cmpne:boolean(and:int(var_0_A2:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_A2:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_A2 = and:int(var_0_A2:int, ldc:int(-768767807))
                goto(Label_0730)
            }
            
            var_0_346 = and:int(var_0_A2:int, ldc:int(-136410623))
            var_5_2D8 = add:int(var_5_2D8:int, ldc:int(-1))
            expr_350 = stack_390_2 = loadelement(stack_350_0, var_5_2D8)
            
            if (cmplt:boolean(add:int(add:int(var_5_2D8:int, ldc:int(3)), neg:int(var_4_2D2:int)), ldc:int(0))) {
                stack_390_2 = stack_36D_0 = add:byte(expr_350:byte, loadelement:byte(var_3_2D7:byte[], add:int(var_5_2D8:int, ldc:int(3))))
                goto(Label_0893)
            }
            
            Label_0861:
            
            if (cmpne:boolean(and:int(var_0_346:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_346 = and:int(var_0_346:int, ldc:int(1834470395))
                stack_390_2 = stack_36D_0 = add:byte(expr_350:byte, ldc:byte(3))
            }
            
            Label_0893:
            
            if (cmpeq:boolean(and:int(var_0_346:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0861)
            }
            
            var_0_A2 = and:int(var_0_346:int, ldc:int(-1219833999))
            storeelement:byte(var_3_2D7:byte[], var_5_2D8:int, stack_390_2:byte)
            
            if (cmpne:boolean(var_5_2D8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_F0_0 = stack_F2_0 = stack_129_0 = stack_12B_0 = stack_163_0 = stack_2F9_0 = stack_350_0 = stack_3DE_0 = stack_432_0 = var_3_2D7:byte[]
            goto(Label_0181)
        }
        
        Label_0950:
        
        while (cmpne:boolean(and:int(var_0_A2:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_A2:int, ldc:int(1073741824)), ldc:int(0))) {
                var_0_A2 = and:int(var_0_A2:int, ldc:int(-1346065871))
                goto(Label_0730)
            }
            
            var_0_A2 = and:int(var_0_A2:int, ldc:int(1030343199))
            var_5_2D8 = add:int(var_5_2D8:int, ldc:int(-1))
            expr_3E1 = xor:byte(loadelement:byte(stack_3DE_0:byte[], var_5_2D8:int), ldc:byte(8))
            storeelement:byte(var_3_2D7:byte[], var_5_2D8:int, or:int(and:int(shl:int(expr_3E1:byte, and:int(ldc:int(3077), ldc:int(12454))), ldc:int(-16)), and:int(shr:int(expr_3E1:byte[expected:int], xor:int(ldc:int(0), ldc:int(4))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_2D8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_F0_0 = stack_F2_0 = stack_129_0 = stack_12B_0 = stack_163_0 = stack_2F9_0 = stack_350_0 = stack_3DE_0 = stack_432_0 = var_3_2D7:byte[]
            goto(Label_0247)
        }
        
        goto(Label_0808)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_A2:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_A2 = and:int(var_0_A2:int, ldc:int(-303131680))
            goto(Label_0306)
        }
        
        if (cmpne:boolean(and:int(var_0_A2:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_A2 = and:int(var_0_A2:int, ldc:int(1013990733))
            goto(Label_0247)
        }
        
        if (cmpne:boolean(and:int(var_0_A2:int, ldc:int(4096)), ldc:int(0))) {
            var_0_A2 = and:int(var_0_A2:int, ldc:int(-1725436327))
        }
        else {
            var_0_A2 = and:int(var_0_A2:int, ldc:int(1852346275))
            expr_B0 = arraylength:int(stack_B0_0:byte[])
            
            if (cmpne:boolean(expr_B0:int, ldc:int(0))) {
                var_4_2D2 = expr_B0:int
                var_3_2D7 = newarray:byte[](byte.class, expr_B0:int)
                var_5_2D8 = expr_B0:int
                goto(Label_0808)
            }
        }
        
        Label_0181:
        
        if (cmpeq:boolean(and:int(var_0_A2:int, ldc:int(2048)), ldc:int(0))) {
            var_0_A2 = and:int(var_0_A2:int, ldc:int(-625794905))
            goto(Label_0306)
        }
        
        if (cmpeq:boolean(and:int(var_0_A2:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_A2 = and:int(var_0_A2:int, ldc:int(1742600718))
        }
        else {
            if (cmpne:boolean(and:int(var_0_A2:int, ldc:int(4096)), ldc:int(0))) {
                var_0_A2 = and:int(var_0_A2:int, ldc:int(1390441154))
                goto(Label_0115)
            }
            
            var_0_A2 = and:int(var_0_A2:int, ldc:int(-35394643))
            expr_F2 = arraylength:int(stack_F2_0:byte[])
            
            if (cmpne:boolean(expr_F2:int, ldc:int(0))) {
                var_4_2D2 = expr_F2:int
                var_3_2D7 = newarray:byte[](byte.class, expr_F2:int)
                var_5_2D8 = expr_F2:int
                goto(Label_0950)
            }
        }
        
        Label_0247:
        
        if (cmpeq:boolean(and:int(var_0_A2:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_A2:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_A2 = and:int(var_0_A2:int, ldc:int(-1578547600))
                goto(Label_0181)
            }
            
            if (cmpeq:boolean(and:int(var_0_A2:int, ldc:int(512)), ldc:int(0))) {
                var_0_A2 = and:int(var_0_A2:int, ldc:int(1588855746))
                goto(Label_0115)
            }
            
            var_0_A2 = and:int(var_0_A2:int, ldc:int(929406602))
            var_2_129 = stack_129_0:byte[]
            expr_12D = add:int(arraylength:int(stack_12B_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_12D:int, ldc:int(0))) {
                var_3_420 = newarray:byte[](byte.class, expr_12D:int)
                var_5_421 = expr_12D:int
                
                loop {
                    var_0_A2 = and:int(var_0_A2:int, ldc:int(1828060739))
                    var_5_421 = add:int(var_5_421:int, ldc:int(-1))
                    storeelement:byte(var_3_420:byte[], var_5_421:int, add:int(shl:int(loadelement:byte(stack_432_0:byte[], var_5_421:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_129:byte[], add:int(var_5_421:int, xor:int(ldc:int(9284), ldc:int(9285)))), ldc:int(4)), xor:int(ldc:int(-11768), ldc:int(-11769)))))
                    
                    if (cmpne:boolean(var_5_421:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B0_0 = stack_AE_0 = stack_F0_0 = stack_F2_0 = stack_129_0 = stack_12B_0 = stack_163_0 = stack_2F9_0 = stack_350_0 = stack_3DE_0 = stack_432_0 = var_3_420:byte[]
            }
        }
        
        Label_0306:
        
        if (cmpeq:boolean(and:int(var_0_A2:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0247)
        }
        
        if (cmpne:boolean(and:int(var_0_A2:int, ldc:int(256)), ldc:int(0))) {
            var_0_A2 = and:int(var_0_A2:int, ldc:int(770706303))
            goto(Label_0181)
        }
        
        if (cmpne:boolean(and:int(var_0_A2:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_A2 = and:int(var_0_A2:int, ldc:int(1233370835))
            goto(Label_0115)
        }
        
        var_3_16F = initobject:String(String::<init>, stack_163_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_2CB_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(9994), ldc:int(9990)))
        expr_181 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4636), ldc:int(301)))
        storeelement:String(expr_181:String[], xor:int(ldc:int(-32246), ldc:int(-32244)), invokevirtual:String[expected:String](String::substring, var_3_16F:String, and:int(ldc:int(22941), ldc:int(-24030)), and:int(ldc:int(5280), ldc:int(-5281))))
        storeelement:String(expr_181:String[], and:int(ldc:int(4246), ldc:int(-5271)), invokevirtual:String[expected:String](String::substring, var_3_16F:String, and:int(ldc:int(-21635), ldc:int(21634)), xor:int(ldc:int(9289), ldc:int(9292))))
        storeelement:String(expr_181:String[], and:int(ldc:int(23563), ldc:int(647)), invokevirtual:String[expected:String](String::substring, var_3_16F:String, xor:int(ldc:int(-14335), ldc:int(-14332)), xor:int(ldc:int(-32563), ldc:int(-32545))))
        storeelement:String(expr_181:String[], and:int(ldc:int(1046), ldc:int(4173)), invokevirtual:String[expected:String](String::substring, var_3_16F:String, and:int(ldc:int(19474), ldc:int(466)), xor:int(ldc:int(5401), ldc:int(5437))))
        storeelement:String(expr_181:String[], xor:int(ldc:int(17942), ldc:int(17948)), invokevirtual:String[expected:String](String::substring, var_3_16F:String, and:int(ldc:int(612), ldc:int(300)), xor:int(ldc:int(11), ldc:int(36))))
        storeelement:String(expr_181:String[], and:int(ldc:int(8763), ldc:int(2057)), invokevirtual:String[expected:String](String::substring, var_3_16F:String, xor:int(ldc:int(2165), ldc:int(2138)), xor:int(ldc:int(529), ldc:int(552))))
        storeelement:String(expr_181:String[], xor:int(ldc:int(11267), ldc:int(11265)), invokevirtual:String[expected:String](String::substring, var_3_16F:String, xor:int(ldc:int(-32587), ldc:int(-32628)), xor:int(ldc:int(12486), ldc:int(12537))))
        storeelement:String(expr_181:String[], and:int(ldc:int(773), ldc:int(20675)), invokevirtual:String[expected:String](String::substring, var_3_16F:String, xor:int(ldc:int(2097), ldc:int(2062)), and:int(ldc:int(5193), ldc:int(2553))))
        storeelement:String(expr_181:String[], and:int(ldc:int(10507), ldc:int(17995)), invokevirtual:String[expected:String](String::substring, var_3_16F:String, xor:int(ldc:int(-32693), ldc:int(-32766)), xor:int(ldc:int(2207), ldc:int(2255))))
        storeelement:String(expr_181:String[], xor:int(ldc:int(21571), ldc:int(21574)), invokevirtual:String[expected:String](String::substring, var_3_16F:String, xor:int(ldc:int(-32453), ldc:int(-32405)), xor:int(ldc:int(28731), ldc:int(28777))))
        storeelement:String(expr_181:String[], and:int(ldc:int(24711), ldc:int(63)), invokevirtual:String[expected:String](String::substring, var_3_16F:String, xor:int(ldc:int(10777), ldc:int(10827)), xor:int(ldc:int(1308), ldc:int(1403))))
        storeelement:String(expr_181:String[], xor:int(ldc:int(16641), ldc:int(16649)), invokevirtual:String[expected:String](String::substring, var_3_16F:String, and:int(ldc:int(17791), ldc:int(10343)), and:int(ldc:int(1400), ldc:int(20603))))
        putstatic:String[](\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99::\u7af6\ub19c\ud171\u93a2\u983f\u416d, expr_181:String[])
    }
    
    public void \u3d4b\uafe7\u9af2\u385b\u7873\u8bb0(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
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
        var_3_672 = and:int(ldc:int(480492694), ldc:int(1526195294))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7c6b\u4f52\u839e\ua61f\u61a4\u6d99[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(318504102))
            var_5_81 = and:int(ldc:int(-20551), ldc:int(20550))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12905), ldc:int(12392)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_672:int, ldc:int(1605101462))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(6293), ldc:int(25923)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(4140), ldc:int(4141)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_DA:int, ldc:int(-1124098810))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(2151), ldc:int(8841)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2003227303))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-848090216))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2139742251))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2129780412))
                    }
                    else {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2121510430))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1728439092))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1696133114))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-410857230))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1139405417))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(848808065))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1387517951))
                            var_11_EB = and:int(ldc:int(-21962), ldc:int(17737))
                            goto(Label_1517)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(144572362))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1102629501))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-44056999))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1542273991))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1279205291))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-659321258))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-883388157))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(438809534))
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(986433462))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(196489897))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-758078867))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1108301372))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1226842286))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-417791186))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(903077719))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(5361), ldc:int(11015))
                                goto(Label_1128)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(792955577))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-195227416))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-976088577))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-888860693))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(952075439))
                        var_11_EB = and:int(ldc:int(10049), ldc:int(-10062))
                    }
                    
                    Label_1128:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1976662135))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1547919092))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0968)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-2082333283))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1617777205))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(782788490))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(847238551))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1389)
                            }
                        }
                    }
                    
                    Label_1262:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-477898152))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1128)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1756263248))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(2091106907))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1343487150))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1517)
                    }
                    
                    Label_1389:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1525321677))
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1034759852))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1146953748))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(-1732002178))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1517:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1528:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1890260876))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2038858535))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(92437250))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1207145998))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1963439758))
                        var_17_67D = add:int(var_16_119:int, xor:int(ldc:int(708), ldc:int(709)))
                        looporswitchbreak()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(1987004588))
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(1607445983))
                
                if (cmple:boolean(var_5_81 = var_17_67D:int, sub:int(var_6_88:int, xor:int(ldc:int(22560), ldc:int(22561))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(-1898137472))
            goto(Label_0108)
        }
    }
}
