public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u983f\u5140\u62da\u446c\u527a\u446c {
    public void \u983f\u5140\u62da\u446c\u527a\u446c(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u983f\u5140\u62da\u446c\u527a\u446c, p0:Schema, p1:boolean)
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
    
    private com.mojang.datafixers.Typed lambda$\u960f\u74b1\u494c\u7bad\uc3e3\ub8be$5(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.OpticFinder p3, com.mojang.datafixers.Typed p4) {
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
    
    private com.mojang.datafixers.Typed lambda$\u71f1\u92ff\ubded\u983f\u5f50\u759a$4(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.OpticFinder p2, com.mojang.datafixers.Typed p3) {
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
    
    private static com.mojang.datafixers.Typed lambda$null$3(com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p0, int p1, int p2, it.unimi.dsi.fastutil.ints.IntSet p3, com.mojang.datafixers.Typed p4) {
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
    
    private static com.mojang.datafixers.Typed lambda$\u6ec6\u7006\u74b1\u965f\u5f50\u5db4$2(int p0, int p1, it.unimi.dsi.fastutil.ints.IntSet p2, com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p3, com.mojang.datafixers.Typed p4) {
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
    
    private static com.mojang.datafixers.util.Pair lambda$null$1(com.mojang.datafixers.util.Pair p0) {
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
    
    private static java.lang.String lambda$\u960f\ub70c\u416d\ubf56\u5654\u4492$0(java.lang.String p0) {
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
            
            if (logicalnot:boolean(invokestatic:boolean(Objects::equals, p0:String[expected:Object], loadelement:String[expected:Object](getstatic:String[](\u983f\u5140\u62da\u446c\u527a\u446c::\u385b\u8753\ud51e\u3bd6\u92ff\u527a), xor:int(ldc:int(-32761), ldc:int(-32757)))))) {
                invokeinterface:void(Logger::warn, getstatic:Logger(\u983f\u5140\u62da\u446c\u527a\u446c::\u92ee\ub7dc\u52d3\u446c\uc238\u8aa5), loadelement:String(getstatic:String[](\u983f\u5140\u62da\u446c\u527a\u446c::\u385b\u8753\ud51e\u3bd6\u92ff\u527a), xor:int(ldc:int(3212), ldc:int(3201))))
            }
            
            return:String(loadelement:String(getstatic:String[](\u983f\u5140\u62da\u446c\u527a\u446c::\u385b\u8753\ud51e\u3bd6\u92ff\u527a), and:int(ldc:int(23439), ldc:int(8286))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_3CB : int
        expr_6E : int [generated]
        stack_93_0 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_100_0 : byte[] [generated]
        stack_136_0 : byte[] [generated]
        stack_323_0 : byte[] [generated]
        stack_377_0 : byte[] [generated]
        stack_3E6_0 : byte[] [generated]
        stack_434_0 : byte[] [generated]
        var_4_2FC : int
        var_3_301 : byte[]
        var_5_302 : int
        expr_326 : byte [generated]
        var_0_42A : int
        expr_434 : byte [generated]
        stack_464_2 : byte [generated]
        var_2_93 : byte[]
        expr_97 : int [generated]
        var_3_365 : byte[]
        var_5_366 : int
        expr_C7 : int [generated]
        expr_100 : int [generated]
        var_3_142 : String
        stack_2EF_0 : String[] [generated]
        expr_154 : String[] [generated]
        
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
        var_0_3CB = and:int(ldc:int(-1827541397), ldc:int(479841515))
        expr_6E = arraylength:int(stack_93_0 = stack_95_0 = stack_C5_0 = stack_C7_0 = stack_FE_0 = stack_100_0 = stack_136_0 = stack_323_0 = stack_377_0 = stack_3E6_0 = stack_434_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("Qe4WFp7h3s6XRnEG6c/e+LfOEa6OlL8Q4I5u4QWWcI5k/qMGH87pfuaE6eMNxlichmZ2IHYG6f9GAR/O6V62lvQGUO7hXoZeTvR26w3GWJyGZgY4Lg6Mr6A5ZtYXtunhXoZeTlfWoYbEZhDhjm7hBYa7jgfkRsOsjute9B9uBjguDh1us44HlOaIqYa3PuiObmb2PuZuHp7h3s6EbyhxBukd/jD5RvZ+jtYensbBz+YZdgbpvtZ+jtYensbBz2agF57h3s62Zj5+BuleTqemST4mft/WSc3tGg==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2FC = expr_6E:int
        var_3_301 = newarray:byte[](byte.class, expr_6E:int)
        var_5_302 = expr_6E:int
        Label_0772:
        
        while (cmpne:boolean(and:int(var_0_3CB:int, ldc:int(2147483647)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_3CB:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_0958)
            }
            
            var_0_3CB = and:int(var_0_3CB:int, ldc:int(1892200319))
            var_5_302 = add:int(var_5_302:int, ldc:int(-1))
            expr_326 = xor:byte(loadelement:byte(stack_323_0:byte[], var_5_302:int), ldc:byte(18))
            storeelement:byte(var_3_301:byte[], var_5_302:int, or:int(and:int(shl:int(expr_326:byte, xor:int(ldc:int(10515), ldc:int(10519))), ldc:int(-16)), and:int(shr:int(expr_326:byte[expected:int], xor:int(ldc:int(609), ldc:int(613))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_302:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_C5_0 = stack_C7_0 = stack_FE_0 = stack_100_0 = stack_136_0 = stack_323_0 = stack_377_0 = stack_3E6_0 = stack_434_0 = var_3_301:byte[]
            goto(Label_0115)
        }
        
        goto(Label_1045)
        Label_0958:
        
        while (cmpeq:boolean(and:int(var_0_3CB:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_3CB:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0772)
            }
            
            var_0_3CB = and:int(var_0_3CB:int, ldc:int(933137599))
            var_5_302 = add:int(var_5_302:int, ldc:int(-1))
            storeelement:byte(var_3_301:byte[], var_5_302:int, add:byte(loadelement:byte(stack_3E6_0:byte[], var_5_302:int), ldc:byte(114)))
            
            if (cmpne:boolean(var_5_302:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_C5_0 = stack_C7_0 = stack_FE_0 = stack_100_0 = stack_136_0 = stack_323_0 = stack_377_0 = stack_3E6_0 = stack_434_0 = var_3_301:byte[]
            goto(Label_0204)
        }
        
        var_0_3CB = and:int(var_0_3CB:int, ldc:int(778437940))
        Label_1045:
        
        while (cmpne:boolean(and:int(var_0_3CB:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_3CB:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0772)
            }
            
            var_0_42A = and:int(var_0_3CB:int, ldc:int(-553189845))
            var_5_302 = add:int(var_5_302:int, ldc:int(-1))
            expr_434 = loadelement:byte(stack_434_0:byte[], var_5_302:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_302:int, ldc:int(2)), neg:int(var_4_2FC:int)), ldc:int(0))) {
                var_0_42A = and:int(var_0_42A:int, ldc:int(-149487621))
                stack_464_2 = add:byte(expr_434:byte, ldc:byte(2))
            }
            else {
                stack_464_2 = add:byte(expr_434:byte, loadelement:byte(var_3_301:byte[], add:int(var_5_302:int, ldc:int(2))))
            }
            
            var_0_3CB = and:int(var_0_42A:int, ldc:int(1368108095))
            storeelement:byte(var_3_301:byte[], var_5_302:int, stack_464_2:byte)
            
            if (cmpne:boolean(var_5_302:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_C5_0 = stack_C7_0 = stack_FE_0 = stack_100_0 = stack_136_0 = stack_323_0 = stack_377_0 = stack_3E6_0 = stack_434_0 = var_3_301:byte[]
            goto(Label_0261)
        }
        
        goto(Label_0958)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_3CB:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0261)
        }
        
        if (cmpeq:boolean(and:int(var_0_3CB:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0204)
        }
        
        if (cmpne:boolean(and:int(var_0_3CB:int, ldc:int(1)), ldc:int(0))) {
            var_0_3CB = and:int(var_0_3CB:int, ldc:int(-10814273))
            var_2_93 = stack_93_0:byte[]
            expr_97 = add:int(arraylength:int(stack_95_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_97:int, ldc:int(0))) {
                var_3_365 = newarray:byte[](byte.class, expr_97:int)
                var_5_366 = expr_97:int
                
                loop {
                    var_0_3CB = and:int(var_0_3CB:int, ldc:int(-1739264085))
                    var_5_366 = add:int(var_5_366:int, ldc:int(-1))
                    storeelement:byte(var_3_365:byte[], var_5_366:int, add:int(shl:int(loadelement:byte(stack_377_0:byte[], var_5_366:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_93:byte[], add:int(var_5_366:int, xor:int(ldc:int(-32512), ldc:int(-32511)))), ldc:int(7)), xor:int(ldc:int(4418), ldc:int(4419)))))
                    
                    if (cmpne:boolean(var_5_366:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_C5_0 = stack_C7_0 = stack_FE_0 = stack_100_0 = stack_136_0 = stack_323_0 = stack_377_0 = stack_3E6_0 = stack_434_0 = var_3_365:byte[]
            }
        }
        
        Label_0156:
        
        if (cmpne:boolean(and:int(var_0_3CB:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0261)
        }
        
        if (cmpeq:boolean(and:int(var_0_3CB:int, ldc:int(1)), ldc:int(0))) {
            var_0_3CB = and:int(var_0_3CB:int, ldc:int(-1663299732))
        }
        else {
            if (cmpne:boolean(and:int(var_0_3CB:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_3CB = and:int(var_0_3CB:int, ldc:int(2086120623))
            expr_C7 = arraylength:int(stack_C7_0:byte[])
            
            if (cmpne:boolean(expr_C7:int, ldc:int(0))) {
                var_4_2FC = expr_C7:int
                var_3_301 = newarray:byte[](byte.class, expr_C7:int)
                var_5_302 = expr_C7:int
                goto(Label_0958)
            }
        }
        
        Label_0204:
        
        if (cmpeq:boolean(and:int(var_0_3CB:int, ldc:int(1024)), ldc:int(0))) {
            var_0_3CB = and:int(var_0_3CB:int, ldc:int(1200561884))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_3CB:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0156)
            }
            
            if (cmpeq:boolean(and:int(var_0_3CB:int, ldc:int(1024)), ldc:int(0))) {
                var_0_3CB = and:int(var_0_3CB:int, ldc:int(1671921128))
                goto(Label_0115)
            }
            
            var_0_3CB = and:int(var_0_3CB:int, ldc:int(918748847))
            expr_100 = arraylength:int(stack_100_0:byte[])
            
            if (cmpne:boolean(expr_100:int, ldc:int(0))) {
                var_4_2FC = expr_100:int
                var_3_301 = newarray:byte[](byte.class, expr_100:int)
                var_5_302 = expr_100:int
                goto(Label_1045)
            }
        }
        
        Label_0261:
        
        if (cmpeq:boolean(and:int(var_0_3CB:int, ldc:int(8)), ldc:int(0))) {
            var_0_3CB = and:int(var_0_3CB:int, ldc:int(1680287431))
            goto(Label_0204)
        }
        
        if (cmpne:boolean(and:int(var_0_3CB:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0156)
        }
        
        if (cmpeq:boolean(and:int(var_0_3CB:int, ldc:int(1024)), ldc:int(0))) {
            var_0_3CB = and:int(var_0_3CB:int, ldc:int(1797389449))
            goto(Label_0115)
        }
        
        var_3_142 = initobject:String(String::<init>, stack_136_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_2EF_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(111), ldc:int(14367)))
        expr_154 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(24846), ldc:int(24833)))
        storeelement:String(expr_154:String[], and:int(ldc:int(4357), ldc:int(25223)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(9318), ldc:int(-9319)), and:int(ldc:int(1083), ldc:int(16918))))
        storeelement:String(expr_154:String[], and:int(ldc:int(6669), ldc:int(17517)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(8338), ldc:int(2898)), and:int(ldc:int(6205), ldc:int(1209))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(-32229), ldc:int(-32225)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(17204), ldc:int(17165)), and:int(ldc:int(1371), ldc:int(16473))))
        storeelement:String(expr_154:String[], and:int(ldc:int(-24157), ldc:int(22096)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(9051), ldc:int(2141)), xor:int(ldc:int(4159), ldc:int(4193))))
        storeelement:String(expr_154:String[], and:int(ldc:int(24687), ldc:int(899)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(382), ldc:int(7262)), and:int(ldc:int(6254), ldc:int(102))))
        storeelement:String(expr_154:String[], and:int(ldc:int(16786), ldc:int(6247)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(12134), ldc:int(16614)), and:int(ldc:int(13290), ldc:int(2186))))
        storeelement:String(expr_154:String[], and:int(ldc:int(4177), ldc:int(16385)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(19), ldc:int(153)), xor:int(ldc:int(5196), ldc:int(5338))))
        storeelement:String(expr_154:String[], and:int(ldc:int(62), ldc:int(5318)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-32766), ldc:int(-32620)), and:int(ldc:int(183), ldc:int(18151))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(17482), ldc:int(17478)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(12349), ldc:int(12442)), and:int(ldc:int(8383), ldc:int(5302))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(16684), ldc:int(16674)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(14462), ldc:int(14536)), and:int(ldc:int(10445), ldc:int(221))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(16526), ldc:int(16519)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(16863), ldc:int(3309)), and:int(ldc:int(5839), ldc:int(18910))))
        storeelement:String(expr_154:String[], and:int(ldc:int(18631), ldc:int(4615)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(2248), ldc:int(2054)), and:int(ldc:int(5330), ldc:int(9170))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(2625), ldc:int(2635)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(2774), ldc:int(4315)), and:int(ldc:int(723), ldc:int(25043))))
        storeelement:String(expr_154:String[], and:int(ldc:int(12591), ldc:int(18443)), invokevirtual:String[expected:String](String::substring, var_3_142:String, and:int(ldc:int(503), ldc:int(4819)), xor:int(ldc:int(1233), ldc:int(1029))))
        storeelement:String(expr_154:String[], xor:int(ldc:int(16551), ldc:int(16559)), invokevirtual:String[expected:String](String::substring, var_3_142:String, xor:int(ldc:int(-7906), ldc:int(-7734)), and:int(ldc:int(1496), ldc:int(10488))))
        putstatic:String[](\u983f\u5140\u62da\u446c\u527a\u446c::\u385b\u8753\ud51e\u3bd6\u92ff\u527a, expr_154:String[])
        putstatic:Logger(\u983f\u5140\u62da\u446c\u527a\u446c::\u92ee\ub7dc\u52d3\u446c\uc238\u8aa5, invokestatic:Logger(LogManager::getLogger))
    }
    
    public void \u7049\ub7dc\u759a\uc229\u4e72\u4f4a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_684 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_68F : int
        
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
        var_3_684 = and:int(ldc:int(-881695913), ldc:int(-944123413))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u983f\u5140\u62da\u446c\u527a\u446c[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(-531413058))
        }
        else {
            var_3_684 = and:int(var_3_684:int, ldc:int(-48948465))
            var_5_8A = and:int(ldc:int(-25623), ldc:int(25622))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2466), ldc:int(-6563)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_684:int, ldc:int(-1015493633))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(9473), ldc:int(9472)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(24625), ldc:int(133)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_684 = and:int(var_3_E3:int, ldc:int(-606456405))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(4241), ldc:int(4240)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(2052357405))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(369449346))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(323403903))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1830406282))
                    }
                    else {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-685783145))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1910276723))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1061429074))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1985286291))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1050584176))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-851730513))
                        var_11_F4 = and:int(ldc:int(23121), ldc:int(-23382))
                        goto(Label_1535)
                    }
                    
                    Label_0586:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1455710021))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1539426))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(440867077))
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(30488325))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-736073566))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(762946447))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(2109880263))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-776696417))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-987761317))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-2083905498))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-646025389))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(161046812))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1597454581))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(660111853))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(315507562))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(309179854))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-887759877))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(3347), ldc:int(33))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1172229369))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1472687276))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-539736305))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-586136249))
                        var_11_F4 = and:int(ldc:int(29378), ldc:int(-29411))
                    }
                    
                    Label_1137:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1202162059))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(748625731))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-243749101))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1244:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(551174421))
                            goto(Label_1137)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(252381354))
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-980911346))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-213968227))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1301280897))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1621018101))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-740585137))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1535)
                    }
                    
                    Label_1398:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(287597933))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(978377990))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-352605905))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(412692557))
                        loopcontinue()
                    }
                    
                    var_3_684 = and:int(var_3_684:int, ldc:int(-46337261))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1535:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68F = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1546:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(114899446))
                        goto(Label_1244)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1276805608))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(661754752))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-879577783))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1548870154))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-308484269))
                        var_17_68F = add:int(var_16_122:int, xor:int(ldc:int(19457), ldc:int(19456)))
                        looporswitchbreak()
                    }
                }
                
                var_3_684 = and:int(var_3_684:int, ldc:int(-375397441))
                
                if (cmple:boolean(var_5_8A = var_17_68F:int, sub:int(var_6_91:int, and:int(ldc:int(9), ldc:int(24899))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(-1949190239))
            goto(Label_0108)
        }
    }
}
