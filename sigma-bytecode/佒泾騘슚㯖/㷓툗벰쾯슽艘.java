public class \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u3dd3\ud217\ubcb0\ucfaf\uc2bd\u8258 {
    public void \u3dd3\ud217\ubcb0\ucfaf\uc2bd\u8258(com.mojang.datafixers.schemas.Schema p0) {
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
            invokespecial:\u6b5f\u7af6\u64ab\u0c95\uc2e8\u4975(\u6b5f\u7af6\u64ab\u0c95\uc2e8\u4975::<init>, this:\u3dd3\ud217\ubcb0\ucfaf\uc2bd\u8258, p0:Schema, getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\ua562\ud4fe\u3dd3\u3711\u8753\u36d3))
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
    
    private static com.mojang.datafixers.Typed lambda$\u47c2\u4bc8\u3a62\u51fa\ua562\u8389$7(com.mojang.datafixers.Typed p0) {
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
    
    private static com.mojang.datafixers.Typed lambda$\u5fe1\ubb2b\ud51e\u8bb0\ube23\u8413$6(com.mojang.datafixers.Typed p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u51b2\u5d20\uf94d\u5d20\uc2e8\u760c$5(com.mojang.serialization.Dynamic p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u4f4a\ub32d\ub32d\ua068\ubefe\uf9c5$4(com.mojang.serialization.Dynamic p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$null$3(com.mojang.serialization.Dynamic p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u8df4\u8350\ua61f\u3504\uc9f6\u156b$2(com.mojang.serialization.Dynamic p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$null$1(com.mojang.serialization.Dynamic p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u839e\ubded\u760c\u3e2a\u0a06\u156b$0(com.mojang.serialization.Dynamic p0) {
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
            invokeinterface:void(Logger::warn, getstatic:Logger(\u3dd3\ud217\ubcb0\ucfaf\uc2bd\u8258::\ub6ab\u7330\ube23\u7bad\u759a\u0b8e), loadelement:String(getstatic:String[](\u3dd3\ud217\ubcb0\ucfaf\uc2bd\u8258::\ub7dc\u6b5f\u446c\u0800\uc87f\u5245), xor:int(ldc:int(963), ldc:int(965))))
            return:Dynamic(p0:Dynamic)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_212 : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_C3_0 : byte[] [generated]
        stack_F4_0 : byte[] [generated]
        stack_F6_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_225_0 : byte[] [generated]
        stack_263_0 : byte[] [generated]
        stack_2CA_0 : byte[] [generated]
        stack_33E_0 : byte[] [generated]
        var_4_1FE : int
        var_3_203 : byte[]
        var_5_204 : int
        var_0_2C0 : int
        expr_2CA : byte [generated]
        stack_309_2 : byte [generated]
        stack_2E7_0 : byte [generated]
        var_2_94 : byte[]
        expr_98 : int [generated]
        var_3_251 : byte[]
        var_5_252 : int
        expr_C3 : int [generated]
        expr_F6 : int [generated]
        var_3_32C : byte[]
        var_5_32D : int
        expr_33E : byte [generated]
        var_3_122 : String
        stack_1F7_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
        var_0_212 = and:int(ldc:int(-616031839), ldc:int(-594927689))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_225_0 = stack_263_0 = stack_2CA_0 = stack_33E_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("zGv94Cu94tv6M5/E3cHN//mXzGv94Cu94tv6M5/E3cHN/8lT1k3C3cHxz8PNQdRS3cPnx8V54h/17GuVvkbdzDXznj/T9ZH4d/m/n/Xxwjxv8b/1nfoCFN7bub/1n84EYtnxmDfPdVc=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1FE = expr_6B:int
        var_3_203 = newarray:byte[](byte.class, expr_6B:int)
        var_5_204 = expr_6B:int
        Label_0518:
        
        while (cmpne:boolean(and:int(var_0_212:int, ldc:int(2048)), ldc:int(0))) {
            var_0_212 = and:int(var_0_212:int, ldc:int(-1521509914))
            var_5_204 = add:int(var_5_204:int, ldc:int(-1))
            storeelement:byte(var_3_203:byte[], var_5_204:int, add:byte(xor:byte(loadelement:byte(stack_225_0:byte[], var_5_204:int), ldc:byte(95)), ldc:byte(120)))
            
            if (cmpne:boolean(var_5_204:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_225_0 = stack_263_0 = stack_2CA_0 = stack_33E_0 = var_3_203:byte[]
            goto(Label_0112)
        }
        
        var_0_212 = and:int(var_0_212:int, ldc:int(1013314273))
        Label_0682:
        
        while (cmpne:boolean(and:int(var_0_212:int, ldc:int(524288)), ldc:int(0))) {
            var_0_2C0 = and:int(var_0_212:int, ldc:int(-1893917249))
            var_5_204 = add:int(var_5_204:int, ldc:int(-1))
            expr_2CA = stack_309_2 = loadelement(stack_2CA_0, var_5_204)
            
            if (cmplt:boolean(add:int(add:int(var_5_204:int, ldc:int(2)), neg:int(var_4_1FE:int)), ldc:int(0))) {
                stack_309_2 = stack_2E7_0 = add:byte(expr_2CA:byte, loadelement:byte(var_3_203:byte[], add:int(var_5_204:int, ldc:int(2))))
                goto(Label_0759)
            }
            
            Label_0727:
            
            if (cmpne:boolean(and:int(var_0_2C0:int, ldc:int(256)), ldc:int(0))) {
                var_0_2C0 = and:int(var_0_2C0:int, ldc:int(-1803911261))
                stack_309_2 = stack_2E7_0 = add:byte(expr_2CA:byte, ldc:byte(2))
            }
            
            Label_0759:
            
            if (cmpne:boolean(and:int(var_0_2C0:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0727)
            }
            
            var_0_212 = and:int(var_0_2C0:int, ldc:int(-1091699790))
            storeelement:byte(var_3_203:byte[], var_5_204:int, stack_309_2:byte)
            
            if (cmpne:boolean(var_5_204:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_225_0 = stack_263_0 = stack_2CA_0 = stack_33E_0 = var_3_203:byte[]
            goto(Label_0200)
        }
        
        var_0_212 = and:int(var_0_212:int, ldc:int(769547070))
        goto(Label_0518)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(32)), ldc:int(0))) {
            var_0_212 = and:int(var_0_212:int, ldc:int(826343057))
            goto(Label_0200)
        }
        
        if (cmpne:boolean(and:int(var_0_212:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_212 = and:int(var_0_212:int, ldc:int(-574841365))
            var_2_94 = stack_94_0:byte[]
            expr_98 = add:int(arraylength:int(stack_96_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_98:int, ldc:int(0))) {
                var_3_251 = newarray:byte[](byte.class, expr_98:int)
                var_5_252 = expr_98:int
                
                loop {
                    var_0_212 = and:int(var_0_212:int, ldc:int(-1099293188))
                    var_5_252 = add:int(var_5_252:int, ldc:int(-1))
                    storeelement:byte(var_3_251:byte[], var_5_252:int, add:int(shl:int(loadelement:byte(stack_263_0:byte[], var_5_252:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_94:byte[], add:int(var_5_252:int, xor:int(ldc:int(368), ldc:int(369)))), ldc:int(5)), and:int(ldc:int(16655), ldc:int(5655)))))
                    
                    if (cmpne:boolean(var_5_252:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_225_0 = stack_263_0 = stack_2CA_0 = stack_33E_0 = var_3_251:byte[]
            }
        }
        
        Label_0157:
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(128)), ldc:int(0))) {
            var_0_212 = and:int(var_0_212:int, ldc:int(1954894047))
            goto(Label_0251)
        }
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(1048576)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_212 = and:int(var_0_212:int, ldc:int(-2094499338))
            expr_C3 = arraylength:int(stack_C3_0:byte[])
            
            if (cmpne:boolean(expr_C3:int, ldc:int(0))) {
                var_4_1FE = expr_C3:int
                var_3_203 = newarray:byte[](byte.class, expr_C3:int)
                var_5_204 = expr_C3:int
                goto(Label_0682)
            }
        }
        
        Label_0200:
        
        if (cmpne:boolean(and:int(var_0_212:int, ldc:int(8192)), ldc:int(0))) {
            var_0_212 = and:int(var_0_212:int, ldc:int(-1746983532))
        }
        else {
            if (cmpne:boolean(and:int(var_0_212:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0157)
            }
            
            if (cmpne:boolean(and:int(var_0_212:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_212 = and:int(var_0_212:int, ldc:int(1437775530))
                goto(Label_0112)
            }
            
            var_0_212 = and:int(var_0_212:int, ldc:int(-397631498))
            expr_F6 = arraylength:int(stack_F6_0:byte[])
            
            if (cmpne:boolean(expr_F6:int, ldc:int(0))) {
                var_3_32C = newarray:byte[](byte.class, expr_F6:int)
                var_5_32D = expr_F6:int
                
                loop {
                    var_0_212 = and:int(var_0_212:int, ldc:int(-446103583))
                    var_5_32D = add:int(var_5_32D:int, ldc:int(-1))
                    expr_33E = loadelement:byte(stack_33E_0:byte[], var_5_32D:int)
                    storeelement:byte(var_3_32C:byte[], var_5_32D:int, or:int(and:int(shl:int(expr_33E:byte, and:int(ldc:int(1180), ldc:int(10503))), ldc:int(-16)), and:int(shr:int(expr_33E:byte[expected:int], and:int(ldc:int(5126), ldc:int(8332))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_32D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C1_0 = stack_C3_0 = stack_F4_0 = stack_F6_0 = stack_116_0 = stack_225_0 = stack_263_0 = stack_2CA_0 = stack_33E_0 = var_3_32C:byte[]
            }
        }
        
        Label_0251:
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(128)), ldc:int(0))) {
            goto(Label_0200)
        }
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(2048)), ldc:int(0))) {
            goto(Label_0157)
        }
        
        if (cmpeq:boolean(and:int(var_0_212:int, ldc:int(16)), ldc:int(0))) {
            var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1F7_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-31709), ldc:int(-31708)))
            expr_134 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(24578), ldc:int(24581)))
            storeelement:String(expr_134:String[], and:int(ldc:int(275), ldc:int(7175)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(-32269), ldc:int(15884)), and:int(ldc:int(26), ldc:int(8498))))
            storeelement:String(expr_134:String[], and:int(ldc:int(19519), ldc:int(70)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(25178), ldc:int(2198)), and:int(ldc:int(25917), ldc:int(61))))
            storeelement:String(expr_134:String[], and:int(ldc:int(4102), ldc:int(10754)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(524), ldc:int(561)), xor:int(ldc:int(9289), ldc:int(9227))))
            storeelement:String(expr_134:String[], and:int(ldc:int(3752), ldc:int(-3754)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(6226), ldc:int(1858)), xor:int(ldc:int(-12266), ldc:int(-12220))))
            storeelement:String(expr_134:String[], and:int(ldc:int(1093), ldc:int(4637)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(605), ldc:int(527)), xor:int(ldc:int(6232), ldc:int(6147))))
            storeelement:String(expr_134:String[], and:int(ldc:int(19567), ldc:int(20)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(26626), ldc:int(26713)), xor:int(ldc:int(440), ldc:int(475))))
            storeelement:String(expr_134:String[], xor:int(ldc:int(33), ldc:int(32)), invokevirtual:String[expected:String](String::substring, var_3_122:String, xor:int(ldc:int(-16299), ldc:int(-16330)), and:int(ldc:int(615), ldc:int(26727))))
            putstatic:String[](\u3dd3\ud217\ubcb0\ucfaf\uc2bd\u8258::\ub7dc\u6b5f\u446c\u0800\uc87f\u5245, expr_134:String[])
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u1833\u5654\u12cb\u4ab3\ud217\u8aa5(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67F : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_68A : int
        
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
        var_3_67F = and:int(ldc:int(1878173882), ldc:int(-810145635))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3dd3\ud217\ubcb0\ucfaf\uc2bd\u8258[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1024)), ldc:int(0))) {
            var_3_67F = and:int(var_3_67F:int, ldc:int(476507684))
        }
        else {
            var_3_67F = and:int(var_3_67F:int, ldc:int(-1153814885))
            var_5_8A = and:int(ldc:int(31059), ldc:int(-31060))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-13112), ldc:int(13079)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_67F:int, ldc:int(-906940420))
                    var_9_C7 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_91:int, and:int(ldc:int(2595), ldc:int(8449)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, xor:int(ldc:int(12432), ldc:int(12433)))), var_7_A0:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_67F = and:int(var_3_D9:int, ldc:int(200473021))
                    var_14_114 = var_7_A0:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(5), ldc:int(4)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_91:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(2062183598))
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(503196489))
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-991510548))
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1449274746))
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1679296479))
                        goto(Label_0860)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(285301031))
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(889296576))
                    }
                    else {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(795905023))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0572)
                            }
                            
                            goto(Label_0860)
                        }
                    }
                    
                    Label_0434:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(19387697))
                        goto(Label_0991)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0860)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1716126052))
                            var_11_EA = and:int(ldc:int(4513), ldc:int(-4514))
                            goto(Label_1552)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0572:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(446949176))
                        goto(Label_1270)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-714382011))
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(651222095))
                        goto(Label_0860)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1813821876))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-322079490))
                            goto(Label_0434)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(740638969))
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(494455963))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0860)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1453843892))
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1855942739))
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-125866424))
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1584832115))
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1378216815))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0434)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-41166656))
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1035565977))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0860:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1555488346))
                        goto(Label_1563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-199053777))
                        goto(Label_1270)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-904797940))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1320433036))
                            goto(Label_0434)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1969373284))
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1073363100))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EA = xor:int(ldc:int(1040), ldc:int(1041))
                                goto(Label_1149)
                            }
                        }
                    }
                    
                    Label_0991:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1941447200))
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-627949752))
                        goto(Label_1270)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1064951420))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0860)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1770994921))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0434)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1418266438))
                        var_11_EA = and:int(ldc:int(-29812), ldc:int(21618))
                    }
                    
                    Label_1149:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-1006618039))
                        goto(Label_1415)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1067558483))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0991)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0860)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-57133193))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-695651550))
                            goto(Label_0434)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67F = and:int(var_3_67F:int, ldc:int(162601693))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1415)
                            }
                        }
                    }
                    
                    Label_1270:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-902644513))
                        goto(Label_1563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-896589015))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1149)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-885688040))
                            goto(Label_0991)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0860)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1288200476))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(-1240807615))
                            goto(Label_0434)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_67F = and:int(var_3_67F:int, ldc:int(1236883932))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_8A:int, var_16_118:int)
                            goto(Label_1552)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1415:
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1109846481))
                        goto(Label_1270)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(911403273))
                        goto(Label_1149)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0860)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1696547684))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(2046052774))
                        loopcontinue()
                    }
                    
                    var_3_67F = and:int(var_3_67F:int, ldc:int(-1988666726))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1552:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68A = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1563:
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1772061180))
                        goto(Label_1415)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1270)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(1254321946))
                        goto(Label_0860)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(976873846))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67F = and:int(var_3_67F:int, ldc:int(-650211332))
                        var_17_68A = add:int(var_16_118:int, and:int(ldc:int(2769), ldc:int(289)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67F = and:int(var_3_67F:int, ldc:int(-75679492))
                
                if (cmple:boolean(var_5_8A = var_17_68A:int, sub:int(var_6_91:int, and:int(ldc:int(20481), ldc:int(9219))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_67F:int, ldc:int(16)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
