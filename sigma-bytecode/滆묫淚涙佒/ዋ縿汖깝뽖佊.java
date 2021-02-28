public class \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a {
    public void \u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a(int p0, com.mojang.datafixers.schemas.Schema p1) {
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
            invokespecial:Schema(Schema::<init>, this:\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a, p0:int, p1:Schema)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static com.mojang.datafixers.types.templates.TypeTemplate \u7873\u40a9\uc87f\u9937\u0c95\u5bc4(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(-3077), ldc:int(3076))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema))))
        }
        
        goto(Label_0006)
    }
    
    public static void \u3bc9\u16f6\u624e\u3776\u8aa5\u8d90(com.mojang.datafixers.schemas.Schema p0, java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> p1, java.lang.String p2) {
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
    
    public static void \ub70c\uc229\u9937\u3504\u5140\ub171(com.mojang.datafixers.schemas.Schema p0, java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> p1, java.lang.String p2) {
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
    
    public static void \u071d\u4ab3\u7bad\u7ce1\u624e\u0800(com.mojang.datafixers.schemas.Schema p0, java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> p1, java.lang.String p2) {
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
    
    public static void \u0800\u6fb0\uc29a\ubff1\uceb8\u92ee(com.mojang.datafixers.schemas.Schema p0, java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> p1, java.lang.String p2) {
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
    
    public java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> registerEntities(com.mojang.datafixers.schemas.Schema p0) {
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
    
    public java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> registerBlockEntities(com.mojang.datafixers.schemas.Schema p0) {
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
    
    public void registerTypes(com.mojang.datafixers.schemas.Schema p0, java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> p1, java.util.Map<java.lang.String, java.util.function.Supplier<com.mojang.datafixers.types.templates.TypeTemplate>> p2) {
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
    
    public static T \u416d\uc9f6\u4d85\u88c5\u5d20\u1187(com.mojang.serialization.Dynamic<T> p0, java.util.Map<java.lang.String, java.lang.String> p1, java.lang.String p2) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u97e6\uc3e3\ub102\u759a\u9033\u8753$35(com.mojang.serialization.Dynamic p0, java.util.Map p1, java.lang.String p2, com.mojang.serialization.Dynamic p3) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\uc238\ud4fe\u67e9\u494c\u56bd\ua068$34(com.mojang.serialization.Dynamic p0, java.lang.String p1, com.mojang.serialization.Dynamic p2) {
        var_3_61 : int
        stack_BF_0 : Dynamic [generated]
        
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
            var_3_61 = and:int(ldc:int(937974213), ldc:int(-1074082427))
            
            if (logicalnot:boolean(invokestatic:boolean(Objects::equals, invokestatic:String[expected:Object](\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::\ud12e\ud217\uc238\uc9f6\u4ab3\u0800, invokevirtual:String(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(2271), ldc:int(21597)))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(8793), ldc:int(8711))))), loadelement:String[expected:Object](getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(16474), ldc:int(16389)))))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-35070083))
                stack_BF_0 = p2:Dynamic
            }
            else {
                stack_BF_0 = invokevirtual:Dynamic(Dynamic::set, p2:Dynamic, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(9305), ldc:int(9220))), invokevirtual:Dynamic(Dynamic::createString, p0:Dynamic, p1:String))
            }
            
            return:Dynamic(stack_BF_0:Dynamic)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic lambda$\ubcb0\u88c5\u12b2\ua6bd\u1187\u839e$33(com.mojang.serialization.Dynamic p0, java.util.Map p1, com.mojang.serialization.Dynamic p2) {
        var_5_7F : String
        var_6_8F : String
        
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
        var_5_7F = invokevirtual:String(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(95), ldc:int(5085)))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(-24507), ldc:int(-24549))))
        var_6_8F = checkcast:String(java.lang.String.class, invokeinterface:String(Map<K, String>::get, p1:Map<K, String>, invokestatic:String[expected:Object](\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::\ud12e\ud217\uc238\uc9f6\u4ab3\u0800, var_5_7F:String)))
        
        if (cmpne:boolean(var_6_8F:String, aconstnull:String())) {
            return:Dynamic(invokevirtual:Dynamic(Dynamic::set, p2:Dynamic, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(1245), ldc:int(17279))), invokevirtual:Dynamic(Dynamic::createString, p0:Dynamic, var_6_8F:String)))
        }
        
        invokeinterface:void(Logger::warn, getstatic:Logger(\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u839e\u6fb0\ufcaf\uc246\uc4d2\u6bb9), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(-31726), ldc:int(-31630))), var_5_7F:String[expected:Object])
        return:Dynamic(p2:Dynamic)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u9a18\ud12e\u600f\u8350\u3d64\uc4d2$32(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(56), ldc:int(89))), invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(837), ldc:int(807))), invokestatic:TypeTemplate(DSL::compoundList, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4f52\u5140\u71ae\ud158\u385b\ua61f), p0:Schema)), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(4342), ldc:int(4245))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\ua6bd\u3711\u6d99\u5d20\ub6ab\u983f), p0:Schema)), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(16705), ldc:int(16677))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\ub1b9\u647c\u4daf\uc246\uc229\ud523), p0:Schema)))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u1187\ud36e\ucfaf\uc31c\u0b8e\ub32d$31() {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::constType, invokestatic:Type<String>(\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::\ub113\u3c25\u9a18\uc7fe\u8640\ud523)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\uc29a\u88c5\u8258\uc229\u6435\uc229$30() {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::or, invokestatic:TypeTemplate(DSL::constType, invokestatic:Type(DSL::intType)), invokestatic:TypeTemplate(DSL::constType, invokestatic:Type<String>(\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::\ub113\u3c25\u9a18\uc7fe\u8640\ud523))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u1833\ube23\ub70c\ucef1\u3776\u4c2b$29(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::hook, invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(2909), ldc:int(16607))), invokestatic:TypeTemplate(DSL::or, invokestatic:TypeTemplate(DSL::constType, invokestatic:Type(DSL::intType)), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u72f1\u516c\u67d0\u97b7\uc246\ub6ab), p0:Schema)), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(9307), ldc:int(4186))), invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(2077), ldc:int(2113))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u8640\u8df4\u7330\u8350\u6c56\ucfaf), p0:Schema), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(123), ldc:int(1115))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u72f1\u5fe1\u8640\u99f7\uc4d2\uc2bd), p0:Schema), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(101), ldc:int(2541))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema)), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(69), ldc:int(35))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema)))), getstatic:Hook$HookFunction(\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u67e9\uc7fe\uc910\u5db4\u183a\ua562), getstatic:Hook$HookFunction(Hook$HookFunction::IDENTITY)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\uceb8\uc229\u3504\u8753\u392e\u3d64$28(java.util.Map p0) {
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
            return:TypeTemplate(invokestatic:TaggedChoice[expected:TypeTemplate](DSL::taggedChoiceLazy, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(29789), ldc:int(605))), invokestatic:Type(DSL::string), p0:Map))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u72f1\u5654\ub1b9\u7330\u156b\u759a$27() {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::constType, invokestatic:Type<String>(\uae87\u927d\u4179\u6bb9\ufcaf\uceb8::\ub113\u3c25\u9a18\uc7fe\u8640\ud523)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u4492\ub32d\u7e3f\ua3b4\u8aa5\ubded$26(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(1647), ldc:int(22887))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u8640\u8df4\u7330\u8350\u6c56\ucfaf), p0:Schema), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\ua61f\u93a2\uc7fe\u7af6\u4492\u99f7), p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u1187\u4179\u64ab\ubcb0\u6ec6\u927d$25(java.util.Map p0) {
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
            return:TypeTemplate(invokestatic:TaggedChoice[expected:TypeTemplate](DSL::taggedChoiceLazy, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(9853), ldc:int(22621))), invokestatic:Type(DSL::string), p0:Map))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u7af6\u34df\ua562\ucb79\u40a9\u8258$24(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::fields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(25708), ldc:int(104))), invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(763), ldc:int(19561))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u8640\u8df4\u7330\u8350\u6c56\ucfaf), p0:Schema)), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(18682), ldc:int(14186))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u72f1\u5fe1\u8640\u99f7\uc4d2\uc2bd), p0:Schema)), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(8299), ldc:int(22635))), invokestatic:TypeTemplate(DSL::list, invokestatic:TypeTemplate(DSL::fields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(24813), ldc:int(894))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema))))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u156b\u946b\uf9c5\u3bc9\u0b8e\u3776$23(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(16751), ldc:int(5869))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(-12214), ldc:int(-12252))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u6b0d\u5654\uf995\u120d\ud158\u8df4$22(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(9827), ldc:int(22557))), invokestatic:TypeTemplate(DSL::or, invokestatic:TypeTemplate(DSL::constType, invokestatic:Type(DSL::intType)), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u72f1\u516c\u67d0\u97b7\uc246\ub6ab), p0:Schema))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u600f\u5f50\u8cae\u3e2a\u6fb0\u873d$21(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u3bc9\ub18d\u3e2a\uf9c5\ua61f\u8258), p0:Schema))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u0b8e\u59ec\u61a4\u927d\u6d99\u71f1$20(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(24687), ldc:int(7551))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u3711\u64f2\ud7e8\u2dcc\u4cd9\u5140$19(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(2574), ldc:int(2659))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(22132), ldc:int(112))), invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(24584), ldc:int(24697))), invokestatic:TypeTemplate(DSL::list, invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(-14837), ldc:int(-14727))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(-32648), ldc:int(-32757))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(2429), ldc:int(9844))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)))), invokestatic:TypeTemplate(\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u7873\u40a9\uc87f\u9937\u0c95\u5bc4, p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u51fa\uc246\u36d3\u385b\uf9c5\u8cae$18(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(16501), ldc:int(10879))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(118), ldc:int(5238))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(17014), ldc:int(16897))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema), invokestatic:TypeTemplate(\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u7873\u40a9\uc87f\u9937\u0c95\u5bc4, p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u3d4b\u446c\u4179\u72f1\ub171\u8413$17(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(2169), ldc:int(12792))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema), invokestatic:TypeTemplate(\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u7873\u40a9\uc87f\u9937\u0c95\u5bc4, p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\uc2bd\u527a\u8258\u72f1\u8d90\u6ec6$16(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(192), ldc:int(185))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(5245), ldc:int(17015))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\uae87\u61a4\u0c95\u624e\u9033\u71f1$15(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(12409), ldc:int(1401))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u3bc9\ub18d\u3e2a\uf9c5\ua61f\u8258), p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\ub171\ud4fe\ub8be\uae87\u8d90\uceb8$14(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(4217), ldc:int(8317))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(-24550), ldc:int(-24465))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u62da\u61a4\uf9c5\ub171\uc4d2\u3bc9$13(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(12623), ldc:int(12598))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(3189), ldc:int(8821))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\ub7dc\ub113\ub102\ub32d\u8640\u69d9$12(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(19830), ldc:int(19724))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u2dcc\u76bc\uafe7\ucfaf\u8d98\uceb8$11(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(5632), ldc:int(5755))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(17020), ldc:int(124))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u72f1\u5fe1\u8640\u99f7\uc4d2\uc2bd), p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u12cb\u4e72\u74b1\u3bc9\uc9f6\u6b0d$10(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(1283), ldc:int(24609))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u34df\u760c\u3504\u7e3f\uc84e\ubff1$9(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(26723), ldc:int(26654))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(12798), ldc:int(18046))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u12b2\uc84e\u6b0d\u56bd\u4f52\ubb2b$8(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(13437), ldc:int(2303))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u93a2\ua61f\u836c\u7ce1\u5654\ud4fe$7(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(4462), ldc:int(4371))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u120d\ufcaf\u4e72\ub171\u88c5\u946b$6(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(18045), ldc:int(125))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u3504\u52d3\ub83f\u3dd3\u392e\uceb8$5(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(8448), ldc:int(8449))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\ubded\u6d69\u8258\ud7e8\u7ce1\u64ab$4(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(6141), ldc:int(119))), invokestatic:TypeTemplate(DSL::list, invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\u4492\u385b\u59ec\u7e3f\u8d90\u120d), p0:Schema))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\uc910\ub19c\u67e9\u839e\u3776\ub6ab$3(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(381), ldc:int(2683))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\u98a4\u92ff\ucef1\uc87f\uceb8\u6fb0$2(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(DSL::optionalFields, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(125), ldc:int(16509))), invokeinterface:TypeTemplate(DSL$TypeReference::in, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\uff55\u4179\u3d64\uc87f\u64f2\u5140), p0:Schema)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.types.templates.TypeTemplate lambda$\uc910\u0c95\u071d\uae5d\ua3b4\ub6ab$1(com.mojang.datafixers.schemas.Schema p0) {
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
            return:TypeTemplate(invokestatic:TypeTemplate(\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u7873\u40a9\uc87f\u9937\u0c95\u5bc4, p0:Schema))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u9255\u9a18\u3d4b\u385b\u7d52\uc9f6$0(java.util.HashMap p0) {
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
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(-16139), ldc:int(-16246))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(586), ldc:int(521))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(70), ldc:int(198))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(967), ldc:int(4187))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(1161), ldc:int(1032))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(84), ldc:int(16965))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(24598), ldc:int(24724))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(274), ldc:int(342))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(12487), ldc:int(643))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(273), ldc:int(340))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(24964), ldc:int(2181))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(790), ldc:int(848))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(23429), ldc:int(215))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(17479), ldc:int(9183))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(1348), ldc:int(1474))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(4517), ldc:int(4589))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(8839), ldc:int(22759))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(17513), ldc:int(587))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(-32399), ldc:int(-32263))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(4417), ldc:int(4363))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(20937), ldc:int(1193))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(25707), ldc:int(4315))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(8350), ldc:int(2762))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(17661), ldc:int(12365))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(-15822), ldc:int(-15687))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(-22424), ldc:int(-22490))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(652), ldc:int(140))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(2189), ldc:int(143))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(-30716), ldc:int(-30582))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(43), ldc:int(122))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(15), ldc:int(128))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(8228), ldc:int(8310))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(1067), ldc:int(1211))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(4676), ldc:int(4631))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(661), ldc:int(4339))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(3830), ldc:int(16476))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(17555), ldc:int(14738))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(18551), ldc:int(9303))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(18103), ldc:int(2203))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(4154), ldc:int(4204))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(4254), ldc:int(1460))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(780), ldc:int(897))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(12323), ldc:int(12470))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(-32254), ldc:int(-32113))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(20514), ldc:int(20660))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(2133), ldc:int(2076))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(318), ldc:int(425))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(585), ldc:int(11337))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(16537), ldc:int(988))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(-20427), ldc:int(-20359))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(18460), ldc:int(18565))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(16500), ldc:int(16423))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(-32564), ldc:int(-32682))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(530), ldc:int(583))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(7839), ldc:int(16571))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(76), ldc:int(25))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(17443), ldc:int(17599))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(7007), ldc:int(215))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(4861), ldc:int(24733))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(607), ldc:int(6647))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(4255), ldc:int(8446))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(4216), ldc:int(2136))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), xor:int(ldc:int(18667), ldc:int(18548))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(16463), ldc:int(95))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(10481), ldc:int(160))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(89), ldc:int(9305))))
            invokevirtual:String(HashMap<String, String>::put, p0:HashMap<String, String>, loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(18081), ldc:int(4591))), loadelement:String(getstatic:String[](\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u5d20\uc87f\u927d\u624e\u3e75\ufe34), and:int(ldc:int(2263), ldc:int(4479))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Map \u960f\ubf56\u6b5f\ub6ab\u3a62\u99f7() {
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
            return:Map(getstatic:Map<String, String>(\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a::\u6ec6\u5140\u3e2a\ucef1\ub70c\u74b1))
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
    
    public void \ubf56\u56bd\u0b8e\u36d3\u600f\u64f2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68D : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_698 : int
        
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
        var_3_68D = and:int(ldc:int(577815482), ldc:int(1793436464))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u12cb\u7e3f\u6c56\uae5d\ubf56\u4f4a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(1643294053))
        }
        else {
            var_3_68D = and:int(var_3_68D:int, ldc:int(-814241989))
            var_5_8A = and:int(ldc:int(5597), ldc:int(-15838))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-19447), ldc:int(18834)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_68D:int, ldc:int(-964782288))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(10249), ldc:int(16865)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(4099), ldc:int(27169)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_68D = and:int(var_3_E3:int, ldc:int(-270009540))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(385), ldc:int(8809)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-2010075042))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1320625159))
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-106387668))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1501830368))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1762753677))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-538376139))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1562221748))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1113781226))
                            var_11_F4 = and:int(ldc:int(27650), ldc:int(-27651))
                            goto(Label_1517)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0568:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1196066389))
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1036388142))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1224500359))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-797852744))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(2136727157))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(2013111154))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(711301686))
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(976885492))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(912632810))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0816:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-277557105))
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1304555011))
                        goto(Label_1110)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-405429663))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(202541319))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-135336980))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(325), ldc:int(1))
                                goto(Label_1110)
                            }
                        }
                    }
                    
                    Label_0941:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1857131790))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1775219342))
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-379402913))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-129677616))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1045739127))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-738275465))
                        var_11_F4 = and:int(ldc:int(26500), ldc:int(-28629))
                    }
                    
                    Label_1110:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-407021061))
                            goto(Label_0941)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1665346346))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(737082273))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1371)
                            }
                        }
                    }
                    
                    Label_1217:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1105760135))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1679834189))
                            goto(Label_1110)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-574658033))
                            goto(Label_0941)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-153134107))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1750888514))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-635051139))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1166676107))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1517)
                    }
                    
                    Label_1371:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(242938810))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1701058215))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-397576120))
                        goto(Label_0816)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1754063725))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-709806117))
                        loopcontinue()
                    }
                    
                    var_3_68D = and:int(var_3_68D:int, ldc:int(-2014722057))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1517:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_698 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1528:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(995644763))
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1826696288))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(686120057))
                        goto(Label_1110)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1412919410))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-278262631))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(737535322))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-310068952))
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1613599502))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1820923914))
                        var_17_698 = add:int(var_16_122:int, and:int(ldc:int(9), ldc:int(18177)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68D = and:int(var_3_68D:int, ldc:int(1382585122))
                
                if (cmple:boolean(var_5_8A = var_17_698:int, sub:int(var_6_91:int, xor:int(ldc:int(804), ldc:int(805))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(-1497990677))
            goto(Label_0108)
        }
    }
}
