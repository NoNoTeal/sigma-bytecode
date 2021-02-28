public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1 {
    public void \u71ae\u51fa\u6fb0\u8d90\ubded\ucef1(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1, p0:Schema, p1:boolean)
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
    
    private static java.lang.String \u8d98\u3dd3\ucef1\u5d20\u62da\uafe7(java.lang.String p0) {
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
            return:String(ternaryop:String(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1::\u6c52\u71ae\u6c56\ubff1\u1833\u8aa5), and:int(ldc:int(2217), ldc:int(24577))), p0:String[expected:Object]), loadelement:String(getstatic:String[](\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1::\u6c52\u71ae\u6c56\ubff1\u1833\u8aa5), xor:int(ldc:int(-31200), ldc:int(-31198))), loadelement:String(getstatic:String[](\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1::\u6c52\u71ae\u6c56\ubff1\u1833\u8aa5), and:int(ldc:int(9539), ldc:int(4775)))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic<T> \u7c6b\u8413\u965f\u1187\ub83f\u0b8e(com.mojang.serialization.Dynamic<T> p0, java.lang.String p1) {
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
    
    private static com.mojang.serialization.Dynamic<T> \u836c\ub18d\u92ee\u47c2\u183a\ucef1(com.mojang.serialization.Dynamic<T> p0) {
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
    
    private static com.mojang.serialization.Dynamic lambda$\u156b\u8709\u6bb9\u7006\u3a62\u4daf$2(com.mojang.serialization.Dynamic p0) {
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
            return:Dynamic(invokestatic:Dynamic(\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1::\u7c6b\u8413\u965f\u1187\ub83f\u0b8e, invokestatic:Dynamic(\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1::\u7c6b\u8413\u965f\u1187\ub83f\u0b8e, invokestatic:Dynamic(\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1::\u7c6b\u8413\u965f\u1187\ub83f\u0b8e, invokestatic:Dynamic(\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1::\u7c6b\u8413\u965f\u1187\ub83f\u0b8e, p0:Dynamic, loadelement:String(getstatic:String[](\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1::\u6c52\u71ae\u6c56\ubff1\u1833\u8aa5), and:int(ldc:int(4102), ldc:int(1239)))), loadelement:String(getstatic:String[](\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1::\u6c52\u71ae\u6c56\ubff1\u1833\u8aa5), xor:int(ldc:int(20483), ldc:int(20484)))), loadelement:String(getstatic:String[](\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1::\u6c52\u71ae\u6c56\ubff1\u1833\u8aa5), and:int(ldc:int(412), ldc:int(5672)))), loadelement:String(getstatic:String[](\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1::\u6c52\u71ae\u6c56\ubff1\u1833\u8aa5), xor:int(ldc:int(291), ldc:int(298)))))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.serialization.Dynamic lambda$\u8d90\u92ee\u183a\u416d\ube23\u3c25$1(com.mojang.serialization.Dynamic p0) {
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
            return:Dynamic(checkcast:Dynamic(com.mojang.serialization.Dynamic.class, invokestatic:Object[expected:Dynamic](DataFixUtils::orElse, invokevirtual:Optional(Optional::map, invokevirtual:Optional(Optional::map, invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(Dynamic::asString, p0:Dynamic)), invokedynamic:Function<String, String>(apply:()Ljava/util/function/Function;)), invokedynamic:Function<String, Dynamic>(apply:(Lcom/mojang/serialization/Dynamic;)Ljava/util/function/Function;, p0:Dynamic[expected:DynamicLike])), p0:Dynamic[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.Typed lambda$\u5db4\ua562\ua562\ubb2b\u9033\u624e$0(com.mojang.datafixers.Typed p0) {
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
            return:Typed(invokevirtual:Typed(Typed::update, p0:Typed, invokestatic:OpticFinder(DSL::remainderFinder), invokedynamic:Function<Dynamic, Dynamic>(apply:()Ljava/util/function/Function;)))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_82 : int
        expr_65 : byte[] [generated]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_BC_0 : byte[] [generated]
        stack_BE_0 : byte[] [generated]
        stack_DA_0 : byte[] [generated]
        stack_50B_0 : byte[] [generated]
        stack_561_0 : byte[] [generated]
        expr_6B : int [generated]
        var_4_470 : int
        var_3_475 : byte[]
        var_5_476 : int
        var_0_4A1 : int
        expr_487 : byte [generated]
        stack_4D9_2 : byte [generated]
        stack_4AD_0 : byte [generated]
        var_2_8D : byte[]
        expr_91 : int [generated]
        var_3_4F9 : byte[]
        var_5_4FA : int
        expr_BE : int [generated]
        var_3_54F : byte[]
        var_5_550 : int
        expr_561 : byte [generated]
        var_3_E6 : String
        expr_EE : String[] [generated]
        expr_F8 : String[] [generated]
        var_3_3A2 : String[]
        stack_464_0 : String [generated]
        stack_464_1 : String [generated]
        stack_464_2 : String [generated]
        stack_464_3 : String [generated]
        stack_464_4 : String [generated]
        stack_464_5 : String [generated]
        expr_3DB : String[] [generated]
        
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
            var_0_82 = and:int(ldc:int(-1397749493), ldc:int(1694006779))
            expr_65 = stack_8D_0 = stack_8F_0 = stack_BC_0 = stack_BE_0 = stack_DA_0 = stack_50B_0 = stack_561_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("yDQqAPxMHObUJrbKEia6NCgO3EwcBKjzHtDWWinMJBwG3BTY5vAQ4jGi1iT+z5AU/uwI8PDyJCzWLuLm8BDiMaDeKvLfVgbw/g4kLNYu4ubwEOIxntQY9M2MCAwWHAD42gzk8iQs1i7i5vAQ4jGs8O4UA2AYAObw8PIkLNYu4ubwEOIxqtYk6s+CHuw0+NTqGtQY9gbw/g4kLNYu4ubwEOIxpt4a7ANmKtQO8PDyJCzWLuLm8BDiMZr0FhIDfOjYAs7mLAgMFhwA+NoM5PIkLNYu4ubwEOIxmvQWEgN86A745hT41Ooa1Bj2BvD+DiQs1i7i5vAQ4jGYCAQI+2js9OwI/vj2BvD+DiQs1i7i5vAQ4jGk/iry637gAPoQ1AbwBPIkLNYu4ubwEOIxoAgE6smK4gg0COz07Aj++PYG8P4OJCzWLuLm8BDiMaAIBOrPgs4gCC70IP742gzk8iQs1i7i5vAQ4jGeAPAgz470IP742gzk8iQs1i7i5vAQ4jGeCg4M+1jU6hrUGPYG8P4OIhD2Ltz+ChTqJgAKAAAOCgD+8v7eAggnAy8B+w=="))
            expr_6B = arraylength:int(expr_65:byte[])
            
            if (cmpne:boolean(expr_6B:int, ldc:int(0))) {
                var_4_470 = expr_6B:int
                var_3_475 = newarray:byte[](byte.class, expr_6B:int)
                var_5_476 = expr_6B:int
                
                loop {
                    var_0_4A1 = and:int(var_0_82:int, ldc:int(-1208464905))
                    var_5_476 = add:int(var_5_476:int, ldc:int(-1))
                    expr_487 = stack_4D9_2 = loadelement(expr_65, var_5_476)
                    
                    if (cmplt:boolean(add:int(add:int(var_5_476:int, ldc:int(5)), neg:int(var_4_470:int)), ldc:int(0))) {
                        stack_4D9_2 = stack_4AD_0 = add:byte(expr_487:byte, loadelement:byte(var_3_475:byte[], add:int(var_5_476:int, ldc:int(5))))
                        goto(Label_1213)
                    }
                    
                    Label_1172:
                    
                    if (cmpne:boolean(and:int(var_0_4A1:int, ldc:int(512)), ldc:int(0))) {
                        var_0_4A1 = and:int(var_0_4A1:int, ldc:int(-502649984))
                    }
                    else {
                        var_0_4A1 = and:int(var_0_4A1:int, ldc:int(-1661974149))
                        stack_4D9_2 = stack_4AD_0 = add:byte(expr_487:byte, ldc:byte(5))
                    }
                    
                    Label_1213:
                    
                    if (cmpne:boolean(and:int(var_0_4A1:int, ldc:int(65536)), ldc:int(0))) {
                        var_0_4A1 = and:int(var_0_4A1:int, ldc:int(1847384946))
                        goto(Label_1172)
                    }
                    
                    var_0_82 = and:int(var_0_4A1:int, ldc:int(263756257))
                    storeelement:byte(var_3_475:byte[], var_5_476:int, stack_4D9_2:byte)
                    
                    if (cmpne:boolean(var_5_476:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_BC_0 = stack_BE_0 = stack_DA_0 = stack_50B_0 = stack_561_0 = var_3_475:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_82:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0195)
                }
                
                if (cmpeq:boolean(and:int(var_0_82:int, ldc:int(1)), ldc:int(0))) {
                    var_0_82 = and:int(var_0_82:int, ldc:int(-706270655))
                }
                else {
                    var_0_82 = and:int(var_0_82:int, ldc:int(766820219))
                    var_2_8D = stack_8D_0:byte[]
                    expr_91 = add:int(arraylength:int(stack_8F_0:byte[]), ldc:int(-1))
                    
                    if (cmpne:boolean(expr_91:int, ldc:int(0))) {
                        var_3_4F9 = newarray:byte[](byte.class, expr_91:int)
                        var_5_4FA = expr_91:int
                        
                        loop {
                            var_0_82 = and:int(var_0_82:int, ldc:int(888925543))
                            var_5_4FA = add:int(var_5_4FA:int, ldc:int(-1))
                            storeelement:byte(var_3_4F9:byte[], var_5_4FA:int, add:int(shl:int(loadelement:byte(stack_50B_0:byte[], var_5_4FA:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_8D:byte[], add:int(var_5_4FA:int, and:int(ldc:int(8457), ldc:int(20995)))), ldc:int(5)), and:int(ldc:int(423), ldc:int(21023)))))
                            
                            if (cmpne:boolean(var_5_4FA:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_BC_0 = stack_BE_0 = stack_DA_0 = stack_50B_0 = stack_561_0 = var_3_4F9:byte[]
                    }
                }
                
                Label_0150:
                
                if (cmpne:boolean(and:int(var_0_82:int, ldc:int(128)), ldc:int(0))) {
                    var_0_82 = and:int(var_0_82:int, ldc:int(-1830752725))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_82:int, ldc:int(2048)), ldc:int(0))) {
                        var_0_82 = and:int(var_0_82:int, ldc:int(265069946))
                        loopcontinue()
                    }
                    
                    var_0_82 = and:int(var_0_82:int, ldc:int(246886341))
                    expr_BE = arraylength:int(stack_BE_0:byte[])
                    
                    if (cmpne:boolean(expr_BE:int, ldc:int(0))) {
                        var_3_54F = newarray:byte[](byte.class, expr_BE:int)
                        var_5_550 = expr_BE:int
                        
                        loop {
                            var_0_82 = and:int(var_0_82:int, ldc:int(884617195))
                            var_5_550 = add:int(var_5_550:int, ldc:int(-1))
                            expr_561 = loadelement:byte(stack_561_0:byte[], var_5_550:int)
                            storeelement:byte(var_3_54F:byte[], var_5_550:int, xor:int(add:int(or:int(and:int(shl:int(expr_561:byte, xor:int(ldc:int(16518), ldc:int(16514))), ldc:int(-16)), and:int(shr:int(expr_561:byte[expected:int], xor:int(ldc:int(17), ldc:int(21))), ldc:int(15))), ldc:int(69)), ldc:int(60)))
                            
                            if (cmpne:boolean(var_5_550:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_8F_0 = stack_8D_0 = stack_BC_0 = stack_BE_0 = stack_DA_0 = stack_50B_0 = stack_561_0 = var_3_54F:byte[]
                    }
                }
                
                Label_0195:
                
                if (cmpne:boolean(and:int(var_0_82:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0150)
                }
                
                if (cmpne:boolean(and:int(var_0_82:int, ldc:int(1048576)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_E6 = initobject:String(String::<init>, stack_DA_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_EE = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(4410), ldc:int(2584)))
            expr_F8 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(24), ldc:int(1726)))
            storeelement:String(expr_F8:String[], xor:int(ldc:int(17539), ldc:int(17543)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(-27701), ldc:int(11316)), xor:int(ldc:int(8450), ldc:int(8454))))
            storeelement:String(expr_F8:String[], and:int(ldc:int(12551), ldc:int(1125)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(3310), ldc:int(4869)), and:int(ldc:int(21007), ldc:int(30))))
            storeelement:String(expr_F8:String[], and:int(ldc:int(13573), ldc:int(-13574)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(16921), ldc:int(16919)), and:int(ldc:int(27679), ldc:int(4125))))
            storeelement:String(expr_F8:String[], and:int(ldc:int(4102), ldc:int(16670)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(-32737), ldc:int(-32766)), xor:int(ldc:int(1751), ldc:int(1782))))
            storeelement:String(expr_F8:String[], and:int(ldc:int(515), ldc:int(326)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(18723), ldc:int(9441)), and:int(ldc:int(380), ldc:int(1188))))
            storeelement:String(expr_EE:String[], xor:int(ldc:int(4111), ldc:int(4101)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(4140), ldc:int(2086)), and:int(ldc:int(315), ldc:int(28799))))
            storeelement:String(expr_EE:String[], xor:int(ldc:int(1545), ldc:int(1538)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(2107), ldc:int(9275)), and:int(ldc:int(16495), ldc:int(4175))))
            storeelement:String(expr_EE:String[], xor:int(ldc:int(10369), ldc:int(10381)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(1359), ldc:int(4687)), and:int(ldc:int(24701), ldc:int(7787))))
            storeelement:String(expr_EE:String[], and:int(ldc:int(141), ldc:int(21069)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(-31546), ldc:int(-31569)), xor:int(ldc:int(58), ldc:int(69))))
            storeelement:String(expr_EE:String[], and:int(ldc:int(16415), ldc:int(494)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(20607), ldc:int(8319)), xor:int(ldc:int(-29902), ldc:int(-29777))))
            storeelement:String(expr_EE:String[], and:int(ldc:int(1295), ldc:int(10447)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(669), ldc:int(4285)), and:int(ldc:int(10483), ldc:int(447))))
            storeelement:String(expr_EE:String[], xor:int(ldc:int(1345), ldc:int(1361)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(2739), ldc:int(25023)), xor:int(ldc:int(19074), ldc:int(19025))))
            storeelement:String(expr_EE:String[], and:int(ldc:int(21521), ldc:int(2193)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(755), ldc:int(10715)), xor:int(ldc:int(60), ldc:int(207))))
            storeelement:String(expr_EE:String[], and:int(ldc:int(62), ldc:int(9235)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(9240), ldc:int(9451)), xor:int(ldc:int(-27627), ldc:int(-27365))))
            storeelement:String(expr_EE:String[], and:int(ldc:int(4115), ldc:int(2259)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(318), ldc:int(48)), and:int(ldc:int(8503), ldc:int(16687))))
            storeelement:String(expr_EE:String[], xor:int(ldc:int(-28650), ldc:int(-28670)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(16679), ldc:int(2343)), xor:int(ldc:int(2351), ldc:int(2153))))
            storeelement:String(expr_EE:String[], xor:int(ldc:int(-31482), ldc:int(-31469)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(2022), ldc:int(2390)), and:int(ldc:int(29027), ldc:int(354))))
            storeelement:String(expr_EE:String[], xor:int(ldc:int(9295), ldc:int(9305)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(-32037), ldc:int(-31815)), xor:int(ldc:int(2168), ldc:int(2306))))
            storeelement:String(expr_EE:String[], xor:int(ldc:int(-32309), ldc:int(-32292)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(2426), ldc:int(20862)), and:int(ldc:int(17333), ldc:int(4508))))
            storeelement:String(expr_F8:String[], xor:int(ldc:int(520), ldc:int(523)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(6548), ldc:int(1525)), xor:int(ldc:int(12463), ldc:int(12599))))
            storeelement:String(expr_F8:String[], and:int(ldc:int(9225), ldc:int(4168)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(9150), ldc:int(17880)), xor:int(ldc:int(140), ldc:int(273))))
            storeelement:String(expr_F8:String[], xor:int(ldc:int(19460), ldc:int(19469)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(3485), ldc:int(445)), xor:int(ldc:int(9440), ldc:int(9538))))
            storeelement:String(expr_F8:String[], xor:int(ldc:int(1032), ldc:int(1033)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, xor:int(ldc:int(16803), ldc:int(16385)), and:int(ldc:int(9639), ldc:int(16878))))
            storeelement:String(expr_F8:String[], and:int(ldc:int(25319), ldc:int(7)), invokevirtual:String[expected:String](String::substring, var_3_E6:String, and:int(ldc:int(20910), ldc:int(9206)), and:int(ldc:int(8682), ldc:int(1978))))
            putstatic:String[](\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1::\u6c52\u71ae\u6c56\ubff1\u1833\u8aa5, expr_F8:String[])
            var_3_3A2 = expr_EE:String[]
            stack_464_0 = loadelement:String(var_3_3A2:String[], and:int(ldc:int(14), ldc:int(19130)))
            stack_464_1 = loadelement:String(var_3_3A2:String[], xor:int(ldc:int(17192), ldc:int(17187)))
            stack_464_2 = loadelement:String(var_3_3A2:String[], xor:int(ldc:int(2051), ldc:int(2063)))
            stack_464_3 = loadelement:String(var_3_3A2:String[], and:int(ldc:int(1149), ldc:int(23181)))
            stack_464_4 = loadelement:String(var_3_3A2:String[], xor:int(ldc:int(253), ldc:int(243)))
            stack_464_5 = loadelement:String(var_3_3A2:String[], and:int(ldc:int(16719), ldc:int(15)))
            expr_3DB = newarray:String[](java.lang.String.class, ldc:int(8))
            storeelement:String(expr_3DB:String[], and:int(ldc:int(19712), ldc:int(-19713)), loadelement:String[expected:String](var_3_3A2:String[], and:int(ldc:int(4112), ldc:int(601))))
            storeelement:String(expr_3DB:String[], xor:int(ldc:int(10308), ldc:int(10309)), loadelement:String[expected:String](var_3_3A2:String[], and:int(ldc:int(21), ldc:int(9747))))
            storeelement:String(expr_3DB:String[], and:int(ldc:int(5123), ldc:int(27194)), loadelement:String[expected:String](var_3_3A2:String[], and:int(ldc:int(8275), ldc:int(7442))))
            storeelement:String(expr_3DB:String[], xor:int(ldc:int(24848), ldc:int(24851)), loadelement:String[expected:String](var_3_3A2:String[], xor:int(ldc:int(391), ldc:int(404))))
            storeelement:String(expr_3DB:String[], and:int(ldc:int(16804), ldc:int(1551)), loadelement:String[expected:String](var_3_3A2:String[], and:int(ldc:int(13109), ldc:int(3220))))
            storeelement:String(expr_3DB:String[], and:int(ldc:int(30069), ldc:int(655)), loadelement:String[expected:String](var_3_3A2:String[], xor:int(ldc:int(134), ldc:int(147))))
            storeelement:String(expr_3DB:String[], ldc:int(6), loadelement:String[expected:String](var_3_3A2:String[], and:int(ldc:int(1183), ldc:int(18966))))
            storeelement:String(expr_3DB:String[], ldc:int(7), loadelement:String[expected:String](var_3_3A2:String[], xor:int(ldc:int(18721), ldc:int(18742))))
            putstatic:Set<String>(\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1::\u5f50\uceb8\u7e3f\u0c95\u59ec\ua562, invokestatic:ImmutableSet(ImmutableSet::of, stack_464_0:String[expected:Object], stack_464_1:String[expected:Object], stack_464_2:String[expected:Object], stack_464_3:String[expected:Object], stack_464_4:String[expected:Object], stack_464_5:String[expected:Object], expr_3DB:String[][expected:Object[]]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u516c\u7e3f\u97b7\ud4fe\u6fb0\u718f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_694 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_69F : int
        
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
        var_3_694 = and:int(ldc:int(-2076623198), ldc:int(-979784066))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u71ae\u51fa\u6fb0\u8d90\ubded\ucef1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
            var_3_694 = and:int(var_3_694:int, ldc:int(-715572613))
            var_5_81 = and:int(ldc:int(-12327), ldc:int(12326))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16722), ldc:int(-16723)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_694:int, ldc:int(-1765803374))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(514), ldc:int(515)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(157), ldc:int(29697)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_694 = and:int(var_3_DA:int, ldc:int(-1510261661))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(8993), ldc:int(5323)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1838693186))
                        goto(Label_1399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-879071989))
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0954)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-2035840628))
                        goto(Label_0585)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1161631060))
                    }
                    else {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1493172603))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0585)
                            }
                            
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0410:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1212834314))
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0954)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(692889023))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1816174556))
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1611413157))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1198068982))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-954374017))
                        var_11_EB = and:int(ldc:int(-14281), ldc:int(14280))
                        goto(Label_1551)
                    }
                    
                    Label_0585:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(2113224302))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0954)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1091361776))
                        goto(Label_0839)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-47264537))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(819863750))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-996442773))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0839)
                        }
                    }
                    
                    Label_0707:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-79160456))
                        goto(Label_1399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1727105719))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(347914092))
                        goto(Label_0954)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0585)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-205272566))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-587487016))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0839:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(790049227))
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(2017061595))
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0707)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1824376231))
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1619019502))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(528), ldc:int(529))
                                goto(Label_1123)
                            }
                        }
                    }
                    
                    Label_0954:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(750963333))
                        goto(Label_1399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(489521244))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-711820697))
                            goto(Label_0707)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1807868192))
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-2112217824))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-965084922))
                        var_11_EB = and:int(ldc:int(-21044), ldc:int(21043))
                    }
                    
                    Label_1123:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-90384116))
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1957149480))
                        goto(Label_1399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-1582665578))
                            goto(Label_0954)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(2098115871))
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(1450166238))
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-886939478))
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-941884115))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1399)
                            }
                        }
                    }
                    
                    Label_1266:
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(164867662))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1123)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-110458226))
                            goto(Label_0954)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0839)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0707)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(-564225151))
                            goto(Label_0585)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0410)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(64)), ldc:int(0))) {
                            var_3_694 = and:int(var_3_694:int, ldc:int(750237290))
                            loopcontinue()
                        }
                        
                        var_3_694 = and:int(var_3_694:int, ldc:int(-677429822))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1551)
                    }
                    
                    Label_1399:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1266)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1320779375))
                        goto(Label_1123)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1569616642))
                        goto(Label_0954)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1071773508))
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(1401069060))
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1386594030))
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-860053151))
                        goto(Label_0410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_694 = and:int(var_3_694:int, ldc:int(-1096996147))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1551:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69F = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1562:
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(328788454))
                        goto(Label_1399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-173423451))
                        goto(Label_1266)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(256)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(2137181145))
                        goto(Label_1123)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0954)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0839)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_694:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-1423405316))
                        goto(Label_0707)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0585)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_694:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_694 = and:int(var_3_694:int, ldc:int(-153241380))
                        var_17_69F = add:int(var_16_119:int, and:int(ldc:int(16897), ldc:int(395)))
                        looporswitchbreak()
                    }
                    
                    var_3_694 = and:int(var_3_694:int, ldc:int(735046700))
                }
                
                var_3_694 = and:int(var_3_694:int, ldc:int(-189027505))
                
                if (cmple:boolean(var_5_81 = var_17_69F:int, sub:int(var_6_88:int, and:int(ldc:int(577), ldc:int(1187))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_694:int, ldc:int(16)), ldc:int(0))) {
            var_3_694 = and:int(var_3_694:int, ldc:int(1415962950))
            goto(Label_0108)
        }
    }
}
