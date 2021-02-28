public class \u5d20\u7043\u88c5\u5db4\uf94d.\u61a4\u527a\u4c2b\u0b8e\ud12e\u7bad {
    public void \u61a4\u527a\u4c2b\u0b8e\ud12e\u7bad(com.mojang.datafixers.schemas.Schema p0, boolean p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u61a4\u527a\u4c2b\u0b8e\ud12e\u7bad, p0:Schema, p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.datafixers.TypeRewriteRule makeRule() {
        var_4_7A : Type
        var_5_8C : Type
        
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
        var_4_7A = invokevirtual:Type(Type::findFieldType, invokevirtual:Type(Schema::getType, invokevirtual:Schema(\u61a4\u527a\u4c2b\u0b8e\ud12e\u7bad::getOutputSchema, this:\u61a4\u527a\u4c2b\u0b8e\ud12e\u7bad), getstatic:DSL$TypeReference(\uff55\u7e3f\ub1b9\ua6bd\uc238\u385b::\ubefe\u8709\ucfaf\u69d9\ub32d\ud51e)), loadelement:String(getstatic:String[](\u61a4\u527a\u4c2b\u0b8e\ud12e\u7bad::\u759a\uc2bd\ud171\ubb2b\u8c8a\u4ab3), and:int(ldc:int(24144), ldc:int(-24149))))
        var_5_8C = invokevirtual:Type(Type::findFieldType, var_4_7A:Type<?>, loadelement:String(getstatic:String[](\u61a4\u527a\u4c2b\u0b8e\ud12e\u7bad::\u759a\uc2bd\ud171\ubb2b\u8c8a\u4ab3), and:int(ldc:int(3083), ldc:int(1))))
        
        if (instanceof:boolean(com.mojang.datafixers.types.templates.List$ListType.class, var_5_8C:Type)) {
            return:TypeRewriteRule(invokespecial:TypeRewriteRule(\u61a4\u527a\u4c2b\u0b8e\ud12e\u7bad::\u946b\u34df\u4f4a\ub8be\u0b8e\u759a, this:\u61a4\u527a\u4c2b\u0b8e\ud12e\u7bad, var_4_7A:Type<?>, checkcast:List$ListType(com.mojang.datafixers.types.templates.List$ListType.class, var_5_8C:Type[expected:List$ListType])))
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u61a4\u527a\u4c2b\u0b8e\ud12e\u7bad::\u759a\uc2bd\ud171\ubb2b\u8c8a\u4ab3), and:int(ldc:int(28675), ldc:int(1174)))))
    }
    
    private com.mojang.datafixers.TypeRewriteRule \u946b\u34df\u4f4a\ub8be\u0b8e\u759a(com.mojang.datafixers.types.Type<?> p0, com.mojang.datafixers.types.templates.List$ListType<TE> p1) {
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
    
    private static com.mojang.datafixers.Typed lambda$\u071d\u960f\u4bc8\u4f52\u5f50\ud523$4(com.mojang.datafixers.OpticFinder p0, com.mojang.datafixers.OpticFinder p1, com.mojang.datafixers.types.Type p2, com.mojang.datafixers.Typed p3) {
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
            return:IllegalStateException(initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\u61a4\u527a\u4c2b\u0b8e\ud12e\u7bad::\u759a\uc2bd\ud171\ubb2b\u8c8a\u4ab3), xor:int(ldc:int(-24434), ldc:int(-24418)))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\uc229\uc9f6\u494c\u5fe1\u8413\uc2bd$2(com.mojang.serialization.Dynamic p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, invokevirtual:int(Dynamic::asInt, p0:Dynamic, and:int(ldc:int(2828), ldc:int(-27472)))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.function.Function lambda$\u97e6\ucfaf\ub7dc\u56bd\ua61f\u839e$1(com.mojang.serialization.DynamicOps p0) {
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
    
    private static com.mojang.datafixers.util.Pair lambda$\u8350\u4179\ubf56\u71f1\uc2e8\u3a62$0(com.mojang.datafixers.util.Pair p0) {
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
            return:Pair(p0:Pair)
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_AE_0 : byte[] [generated]
        stack_B0_0 : byte[] [generated]
        stack_E7_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_118_0 : byte[] [generated]
        stack_14D_0 : byte[] [generated]
        stack_3BD_0 : byte[] [generated]
        stack_424_0 : byte[] [generated]
        stack_4A2_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_345 : byte[]
        var_4_346 : int
        var_0_3AA : int
        expr_B0 : int [generated]
        var_5_396 : int
        var_3_39B : byte[]
        var_4_39C : int
        expr_3BD : byte [generated]
        var_0_43E : int
        expr_424 : byte [generated]
        stack_46D_2 : byte [generated]
        stack_441_0 : byte [generated]
        expr_E9 : int [generated]
        expr_118 : int [generated]
        var_3_490 : byte[]
        var_4_491 : int
        var_3_159 : String
        stack_33C_0 : String[] [generated]
        expr_16B : String[] [generated]
        
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
            var_0_61 = and:int(ldc:int(-726894491), ldc:int(-680579003))
            expr_68 = var_2_6C = stack_AE_0 = stack_B0_0 = stack_E7_0 = stack_E9_0 = stack_116_0 = stack_118_0 = stack_14D_0 = stack_3BD_0 = stack_424_0 = stack_4A2_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("B82GUcmUZ72BmGxwelJxoYgrkZpNh4eDjZeWftPYemDxhwGBhnh8YY+WYbhuf5xOcm8HnN5hmFL8cR+ca5hjhY+Nl5c2EjRnhnRNFmp0fjeSZ82GUcmUZ72bk5BwaDBF0FB8V7x8YYOTvYZuY4xk5HWznnuXMu2Pi4Zq1xpq3HWBKvxYfHR6YTrhP4uEdOHuYm54Ofm4aYGZr45UcmOVmnmHnH56YnR9gH5tjjpiY4Whjb+dj6WFmHh4ZObm8jDo4A=="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_345 = newarray:byte[](byte.class, expr_70:int)
                var_4_346 = expr_70:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-974188043))
                    var_4_346 = add:int(var_4_346:int, ldc:int(-1))
                    storeelement:byte(var_3_345:byte[], var_4_346:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_346:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_346:int, xor:int(ldc:int(24960), ldc:int(24961)))), ldc:int(5)), xor:int(ldc:int(147), ldc:int(148)))))
                    
                    if (cmpne:boolean(var_4_346:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_116_0 = stack_118_0 = stack_14D_0 = stack_3BD_0 = stack_424_0 = stack_4A2_0 = var_3_345:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_3AA = and:int(var_0_61:int, ldc:int(-1459015636))
                    goto(Label_0285)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(134217728)), ldc:int(0))) {
                    var_0_3AA = and:int(var_0_61:int, ldc:int(256853094))
                    goto(Label_0238)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(1048576)), ldc:int(0))) {
                    var_0_3AA = and:int(var_0_61:int, ldc:int(1466655380))
                    goto(Label_0181)
                }
                
                var_0_3AA = and:int(var_0_61:int, ldc:int(-43283755))
                expr_B0 = arraylength:int(stack_B0_0:byte[])
                
                if (cmpeq:boolean(expr_B0:int, ldc:int(0))) {
                    goto(Label_0181)
                }
                
                var_5_396 = expr_B0:int
                var_3_39B = newarray:byte[](byte.class, expr_B0:int)
                var_4_39C = expr_B0:int
                Label_0926:
                
                while (cmpne:boolean(and:int(var_0_3AA:int, ldc:int(1)), ldc:int(0))) {
                    var_0_3AA = and:int(var_0_3AA:int, ldc:int(-299255443))
                    var_4_39C = add:int(var_4_39C:int, ldc:int(-1))
                    expr_3BD = loadelement:byte(stack_3BD_0:byte[], var_4_39C:int)
                    storeelement:byte(var_3_39B:byte[], var_4_39C:int, xor:int(or:int(and:int(shl:int(expr_3BD:byte, and:int(ldc:int(12364), ldc:int(16806))), ldc:int(-16)), and:int(shr:int(expr_3BD:byte[expected:int], xor:int(ldc:int(1542), ldc:int(1538))), ldc:int(15))), ldc:int(60)))
                    
                    if (cmpne:boolean(var_4_39C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_116_0 = stack_118_0 = stack_14D_0 = stack_3BD_0 = stack_424_0 = stack_4A2_0 = var_3_39B:byte[]
                    goto(Label_0181)
                }
                
                var_0_3AA = and:int(var_0_3AA:int, ldc:int(1597554665))
                Label_1029:
                
                while (cmpne:boolean(and:int(var_0_3AA:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_0_43E = and:int(var_0_3AA:int, ldc:int(-713430445))
                    var_4_39C = add:int(var_4_39C:int, ldc:int(-1))
                    expr_424 = stack_46D_2 = loadelement(stack_424_0, var_4_39C)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_39C:int, ldc:int(6)), neg:int(var_5_396:int)), ldc:int(0))) {
                        stack_46D_2 = stack_441_0 = add:byte(expr_424:byte, loadelement:byte(var_3_39B:byte[], add:int(var_4_39C:int, ldc:int(6))))
                        goto(Label_1105)
                    }
                    
                    Label_1073:
                    
                    if (cmpeq:boolean(and:int(var_0_43E:int, ldc:int(16)), ldc:int(0))) {
                        var_0_43E = and:int(var_0_43E:int, ldc:int(-956337441))
                        stack_46D_2 = stack_441_0 = add:byte(expr_424:byte, ldc:byte(6))
                    }
                    
                    Label_1105:
                    
                    if (cmpne:boolean(and:int(var_0_43E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_0_43E = and:int(var_0_43E:int, ldc:int(1688164244))
                        goto(Label_1073)
                    }
                    
                    var_0_3AA = and:int(var_0_43E:int, ldc:int(-181637287))
                    storeelement:byte(var_3_39B:byte[], var_4_39C:int, stack_46D_2:byte)
                    
                    if (cmpne:boolean(var_4_39C:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_116_0 = stack_118_0 = stack_14D_0 = stack_3BD_0 = stack_424_0 = stack_4A2_0 = var_3_39B:byte[]
                    goto(Label_0238)
                }
                
                var_0_3AA = and:int(var_0_3AA:int, ldc:int(-1861414345))
                goto(Label_0926)
                Label_0181:
                
                if (cmpne:boolean(and:int(var_0_3AA:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0285)
                }
                
                if (cmpne:boolean(and:int(var_0_3AA:int, ldc:int(16)), ldc:int(0))) {
                    var_0_3AA = and:int(var_0_3AA:int, ldc:int(-916878133))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_3AA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_0_61 = and:int(var_0_3AA:int, ldc:int(1327387510))
                        loopcontinue()
                    }
                    
                    var_0_3AA = and:int(var_0_3AA:int, ldc:int(-847703865))
                    expr_E9 = arraylength:int(stack_E9_0:byte[])
                    
                    if (cmpne:boolean(expr_E9:int, ldc:int(0))) {
                        var_5_396 = expr_E9:int
                        var_3_39B = newarray:byte[](byte.class, expr_E9:int)
                        var_4_39C = expr_E9:int
                        goto(Label_1029)
                    }
                }
                
                Label_0238:
                
                if (cmpeq:boolean(and:int(var_0_3AA:int, ldc:int(16)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_0_3AA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0181)
                    }
                    
                    if (cmpne:boolean(and:int(var_0_3AA:int, ldc:int(256)), ldc:int(0))) {
                        var_0_61 = and:int(var_0_3AA:int, ldc:int(-1592287558))
                        loopcontinue()
                    }
                    
                    var_0_3AA = and:int(var_0_3AA:int, ldc:int(-600161941))
                    expr_118 = arraylength:int(stack_118_0:byte[])
                    
                    if (cmpne:boolean(expr_118:int, ldc:int(0))) {
                        var_3_490 = newarray:byte[](byte.class, expr_118:int)
                        var_4_491 = expr_118:int
                        
                        loop {
                            var_0_3AA = and:int(var_0_3AA:int, ldc:int(-843389215))
                            var_4_491 = add:int(var_4_491:int, ldc:int(-1))
                            storeelement:byte(var_3_490:byte[], var_4_491:int, add:byte(loadelement:byte(stack_4A2_0:byte[], var_4_491:int), ldc:byte(37)))
                            
                            if (cmpne:boolean(var_4_491:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_116_0 = stack_118_0 = stack_14D_0 = stack_3BD_0 = stack_424_0 = stack_4A2_0 = var_3_490:byte[]
                    }
                }
                
                Label_0285:
                
                if (cmpne:boolean(and:int(var_0_3AA:int, ldc:int(16)), ldc:int(0))) {
                    var_0_3AA = and:int(var_0_3AA:int, ldc:int(1330613605))
                    goto(Label_0238)
                }
                
                if (cmpne:boolean(and:int(var_0_3AA:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_0181)
                }
                
                if (cmpeq:boolean(and:int(var_0_3AA:int, ldc:int(1048576)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_0_61 = and:int(var_0_3AA:int, ldc:int(1506975458))
            }
            
            var_3_159 = initobject:String(String::<init>, stack_14D_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_33C_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3219), ldc:int(629)))
            expr_16B = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(24586), ldc:int(24603)))
            storeelement:String(expr_16B:String[], and:int(ldc:int(14806), ldc:int(13)), invokevirtual:String[expected:String](String::substring, var_3_159:String, and:int(ldc:int(25345), ldc:int(-25348)), xor:int(ldc:int(9473), ldc:int(9495))))
            storeelement:String(expr_16B:String[], xor:int(ldc:int(3367), ldc:int(3374)), invokevirtual:String[expected:String](String::substring, var_3_159:String, xor:int(ldc:int(285), ldc:int(267)), and:int(ldc:int(12413), ldc:int(2332))))
            storeelement:String(expr_16B:String[], xor:int(ldc:int(76), ldc:int(92)), invokevirtual:String[expected:String](String::substring, var_3_159:String, xor:int(ldc:int(16406), ldc:int(16394)), and:int(ldc:int(24651), ldc:int(971))))
            storeelement:String(expr_16B:String[], xor:int(ldc:int(1031), ldc:int(1028)), invokevirtual:String[expected:String](String::substring, var_3_159:String, and:int(ldc:int(11595), ldc:int(623)), and:int(ldc:int(9315), ldc:int(4595))))
            storeelement:String(expr_16B:String[], and:int(ldc:int(11281), ldc:int(-11282)), invokevirtual:String[expected:String](String::substring, var_3_159:String, and:int(ldc:int(355), ldc:int(17519)), xor:int(ldc:int(-14293), ldc:int(-14269))))
            storeelement:String(expr_16B:String[], and:int(ldc:int(17415), ldc:int(455)), invokevirtual:String[expected:String](String::substring, var_3_159:String, xor:int(ldc:int(83), ldc:int(59)), xor:int(ldc:int(-32661), ldc:int(-32741))))
            storeelement:String(expr_16B:String[], xor:int(ldc:int(4744), ldc:int(4746)), invokevirtual:String[expected:String](String::substring, var_3_159:String, xor:int(ldc:int(-32538), ldc:int(-32618)), xor:int(ldc:int(77), ldc:int(217))))
            storeelement:String(expr_16B:String[], xor:int(ldc:int(1068), ldc:int(1069)), invokevirtual:String[expected:String](String::substring, var_3_159:String, and:int(ldc:int(693), ldc:int(9366)), and:int(ldc:int(8380), ldc:int(24224))))
            storeelement:String(expr_16B:String[], xor:int(ldc:int(-31710), ldc:int(-31702)), invokevirtual:String[expected:String](String::substring, var_3_159:String, and:int(ldc:int(4268), ldc:int(1442)), and:int(ldc:int(681), ldc:int(3553))))
            storeelement:String(expr_16B:String[], and:int(ldc:int(8271), ldc:int(4127)), invokevirtual:String[expected:String](String::substring, var_3_159:String, xor:int(ldc:int(1416), ldc:int(1321)), and:int(ldc:int(16622), ldc:int(2742))))
            storeelement:String(expr_16B:String[], xor:int(ldc:int(17408), ldc:int(17418)), invokevirtual:String[expected:String](String::substring, var_3_159:String, and:int(ldc:int(4783), ldc:int(8358)), and:int(ldc:int(16808), ldc:int(1774))))
            storeelement:String(expr_16B:String[], and:int(ldc:int(12987), ldc:int(3407)), invokevirtual:String[expected:String](String::substring, var_3_159:String, and:int(ldc:int(488), ldc:int(9402)), xor:int(ldc:int(0), ldc:int(181))))
            storeelement:String(expr_16B:String[], xor:int(ldc:int(4620), ldc:int(4608)), invokevirtual:String[expected:String](String::substring, var_3_159:String, xor:int(ldc:int(4270), ldc:int(4123)), xor:int(ldc:int(1106), ldc:int(1252))))
            storeelement:String(expr_16B:String[], xor:int(ldc:int(16540), ldc:int(16537)), invokevirtual:String[expected:String](String::substring, var_3_159:String, and:int(ldc:int(17590), ldc:int(2231)), xor:int(ldc:int(24819), ldc:int(24649))))
            storeelement:String(expr_16B:String[], and:int(ldc:int(2525), ldc:int(1039)), invokevirtual:String[expected:String](String::substring, var_3_159:String, and:int(ldc:int(23227), ldc:int(8634)), xor:int(ldc:int(18132), ldc:int(18031))))
            storeelement:String(expr_16B:String[], and:int(ldc:int(16399), ldc:int(3118)), invokevirtual:String[expected:String](String::substring, var_3_159:String, and:int(ldc:int(8379), ldc:int(1279)), xor:int(ldc:int(13325), ldc:int(13489))))
            storeelement:String(expr_16B:String[], and:int(ldc:int(30982), ldc:int(1038)), invokevirtual:String[expected:String](String::substring, var_3_159:String, xor:int(ldc:int(108), ldc:int(208)), xor:int(ldc:int(4235), ldc:int(4171))))
            putstatic:String[](\u61a4\u527a\u4c2b\u0b8e\ud12e\u7bad::\u759a\uc2bd\ud171\ubb2b\u8c8a\u4ab3, expr_16B:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d69\ub83f\ucb79\u0c95\u5140\u156b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_685 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_690 : int
        
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
        var_3_685 = and:int(ldc:int(1062900339), ldc:int(2129813363))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u61a4\u527a\u4c2b\u0b8e\ud12e\u7bad[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4096)), ldc:int(0))) {
            var_3_685 = and:int(var_3_685:int, ldc:int(1466899094))
            var_5_80 = and:int(ldc:int(18081), ldc:int(-26274))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-15025), ldc:int(15024)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_685:int, ldc:int(2143483419))
                    var_9_C6 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_87:int, xor:int(ldc:int(-27904), ldc:int(-27903)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, xor:int(ldc:int(4100), ldc:int(4101)))), var_7_96:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_685 = and:int(var_3_D8:int, ldc:int(930559762))
                    var_14_113 = var_7_96:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(-32704), ldc:int(-32703)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_87:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1044244130))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-672275491))
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0991)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(871244945))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(839953588))
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-416557413))
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1792090599))
                    }
                    else {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1055085179))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0581)
                            }
                            
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0424:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(2063658585))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-41644058))
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(128)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(805174900))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(512)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(1993832210))
                            var_11_E9 = and:int(ldc:int(2693), ldc:int(-2694))
                            goto(Label_1564)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0581:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-895015498))
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1791217273))
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-740345571))
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0991)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1366677682))
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1906949477))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(1860129335))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0858)
                        }
                    }
                    
                    Label_0709:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(703357401))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1067230573))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(128)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1221532001))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-756281290))
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1719781677))
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(128)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-241031073))
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-2041954758))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0858:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1470301694))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(270826967))
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1543679112))
                        goto(Label_1284)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-2081635119))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(927022473))
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1497229637))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E9 = xor:int(ldc:int(-15232), ldc:int(-15231))
                                goto(Label_1150)
                            }
                        }
                    }
                    
                    Label_0991:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(128)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-728481851))
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(2101055390))
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-541791893))
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(535872440))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1504969029))
                        var_11_E9 = and:int(ldc:int(8844), ldc:int(-8846))
                    }
                    
                    Label_1150:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1909056137))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(18490907))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1970667717))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0991)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(90224954))
                            goto(Label_0858)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-1786639247))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-557090242))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1427)
                            }
                        }
                    }
                    
                    Label_1284:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1150)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(1908969960))
                            goto(Label_0991)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(512)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(500924840))
                            goto(Label_0858)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(2016149503))
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0581)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(1425302502))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_685 = and:int(var_3_685:int, ldc:int(-915796774))
                            loopcontinue()
                        }
                        
                        var_3_685 = and:int(var_3_685:int, ldc:int(-1217921286))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_80:int, var_16_117:int)
                        goto(Label_1564)
                    }
                    
                    Label_1427:
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(256)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(462542402))
                        goto(Label_1575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1005164722))
                        goto(Label_1150)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0991)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0858)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-466311386))
                        goto(Label_0581)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(512)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(101036251))
                        loopcontinue()
                    }
                    
                    var_3_685 = and:int(var_3_685:int, ldc:int(-1090817346))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1564:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_690 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1575:
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1284)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1912526551))
                        goto(Label_1150)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0991)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(-759108538))
                        goto(Label_0858)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0581)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0424)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_685:int, ldc:int(16)), ldc:int(0))) {
                        var_3_685 = and:int(var_3_685:int, ldc:int(1717990106))
                        var_17_690 = add:int(var_16_117:int, and:int(ldc:int(18949), ldc:int(1283)))
                        looporswitchbreak()
                    }
                }
                
                var_3_685 = and:int(var_3_685:int, ldc:int(-1621935149))
                
                if (cmple:boolean(var_5_80 = var_17_690:int, sub:int(var_6_87:int, xor:int(ldc:int(1040), ldc:int(1041))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_685:int, ldc:int(4096)), ldc:int(0))) {
            var_3_685 = and:int(var_3_685:int, ldc:int(-198997084))
            goto(Label_0108)
        }
    }
}
