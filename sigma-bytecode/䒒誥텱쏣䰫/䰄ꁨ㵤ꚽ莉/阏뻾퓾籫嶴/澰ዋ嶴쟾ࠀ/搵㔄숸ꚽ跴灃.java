public abstract class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u6435\u3504\uc238\ua6bd\u8df4\u7043 {
    public void \u6435\u3504\uc238\ua6bd\u8df4\u7043(java.lang.String p0, com.mojang.datafixers.schemas.Schema p1, boolean p2) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u6435\u3504\uc238\ua6bd\u8df4\u7043, p1:Schema, p2:boolean)
            putfield:String(\u6435\u3504\uc238\ua6bd\u8df4\u7043::\ud158\u7006\uc3e3\u8aa5\u4daf\u9937, this:\u6435\u3504\uc238\ua6bd\u8df4\u7043, p0:String)
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
    
    public abstract java.lang.String \u7ce1\u8413\u99f7\u3c25\u5bc4\u4e72(java.lang.String p0);
    
    private java.util.function.Function lambda$\u4daf\u0b8e\u392e\u69d9\u52d3\u74b1$4(com.mojang.serialization.DynamicOps p0) {
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
    
    private com.mojang.datafixers.util.Pair lambda$null$3(com.mojang.datafixers.util.Pair p0) {
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
            return:Pair(invokevirtual:Pair(Pair::mapSecond, p0:Pair, invokedynamic:Function<String, String>(apply:(L\u4492\u8aa5\ud171\uc3e3\u4c2b/\u4c04\ua068\u3d64\ua6bd\u8389/\u960f\ubefe\ud4fe\u7c6b\u5db4/\u6fb0\u12cb\u5db4\uc7fe\u0800/\u6435\u3504\uc238\ua6bd\u8df4\u7043;)Ljava/util/function/Function;, this:\u6435\u3504\uc238\ua6bd\u8df4\u7043)))
        }
        
        goto(Label_0006)
    }
    
    private java.util.function.Function lambda$\u446c\u1833\u97b7\u12cb\u873d\uae5d$2(com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p0, com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p1, com.mojang.serialization.DynamicOps p2) {
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
    
    private com.mojang.datafixers.util.Pair lambda$null$1(com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p0, com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p1, com.mojang.datafixers.util.Pair p2) {
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
    
    private java.lang.String lambda$\u7049\u3776\u69d9\u960f\u8bb0\u071d$0(com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p0, com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p1, java.lang.String p2) {
        var_6_68 : String
        var_7_77 : Type
        var_8_87 : Type
        stack_D5_0 : String [generated]
        expr_BC : Object[] [generated]
        
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
        var_6_68 = invokevirtual:String(\u6435\u3504\uc238\ua6bd\u8df4\u7043::\u7ce1\u8413\u99f7\u3c25\u5bc4\u4e72, this:\u6435\u3504\uc238\ua6bd\u8df4\u7043, p2:String)
        var_7_77 = checkcast:Type(com.mojang.datafixers.types.Type.class, invokeinterface:Type(Map<K, Type>::get, invokevirtual:Map(TaggedChoice$TaggedChoiceType::types, p0:TaggedChoice$TaggedChoiceType), p2:String[expected:Object]))
        var_8_87 = checkcast:Type(com.mojang.datafixers.types.Type.class, invokeinterface:Type(Map<K, Type>::get, invokevirtual:Map(TaggedChoice$TaggedChoiceType::types, p1:TaggedChoice$TaggedChoiceType), var_6_68:String[expected:Object]))
        
        if (invokevirtual:boolean(Type::equals, var_8_87:Type, var_7_77:Type[expected:Object], and:int[expected:boolean](ldc:int(6681), ldc:int(67)), xor:int[expected:boolean](ldc:int(12), ldc:int(13)))) {
            return:String(var_6_68:String)
        }
        
        stack_D5_0 = ldc:String("Dynamic type check failed: %s not equal to %s")
        expr_BC = newarray:Object[](java.lang.Object.class, and:int(ldc:int(8195), ldc:int(20034)))
        storeelement:Object(expr_BC:Object[], and:int(ldc:int(16244), ldc:int(-32629)), var_8_87:Type[expected:Object])
        storeelement:Object(expr_BC:Object[], and:int(ldc:int(261), ldc:int(3137)), var_7_77:Type[expected:Object])
        athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokestatic:String(String::format, stack_D5_0:String, expr_BC:Object[])))
    }
    
    public void \u7e3f\u9255\u6bb9\uc7fe\u8753\u47c2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6EC : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_CB : double
        var_3_DD : int
        var_11_EE : int
        var_14_118 : double
        var_16_11C : int
        var_12_114 : double
        var_17_6F7 : int
        
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
        var_3_6EC = and:int(ldc:int(1420507510), ldc:int(1894189394))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6435\u3504\uc238\ua6bd\u8df4\u7043[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(32768)), ldc:int(0))) {
            var_3_6EC = and:int(var_3_6EC:int, ldc:int(-103784901))
        }
        else {
            var_3_6EC = and:int(var_3_6EC:int, ldc:int(1686776248))
            var_5_85 = and:int(ldc:int(-26322), ldc:int(18129))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-19221), ldc:int(19220)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CB = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DD = and:int(var_3_6EC:int, ldc:int(1878931994))
                    var_9_CB = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EE = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EE:int, sub:int(var_6_8C:int, xor:int(ldc:int(16465), ldc:int(16464)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EE:int, xor:int(ldc:int(8227), ldc:int(8226)))), var_7_9B:double))) {
                        inc:int(var_11_EE, ldc:int(1))
                    }
                    
                    var_3_6EC = and:int(var_3_DD:int, ldc:int(1306704786))
                    var_14_118 = var_7_9B:double
                    var_16_11C = var_11_EE:int
                }
                else {
                    var_11_EE = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(9792), ldc:int(9793)))
                    var_12_114 = var_14_118 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_11C = var_11_EE:int, var_6_8C:int)) {
                        var_9_CB = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EE:int)
                        var_16_11C = var_11_EE:int
                        var_14_118 = var_12_114:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(1578508283))
                        goto(Label_1661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(514491904))
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-1547828573))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(1968783484))
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-1715308699))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-2014965959))
                        goto(Label_0587)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(1943964795))
                        
                        if (cmplt:boolean(var_16_11C:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0587)
                            }
                            
                            goto(Label_0878)
                        }
                    }
                    
                    Label_0432:
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(1201824693))
                        goto(Label_1661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(1362829908))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-1597190433))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(1335793982))
                            var_11_EE = and:int(ldc:int(-26348), ldc:int(26347))
                            goto(Label_1650)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0587:
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1661)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(1855646439))
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(556308511))
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(99351703))
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(1956345224))
                        goto(Label_0878)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(1725202222))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(-689521182))
                            goto(Label_0432)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(1455189961))
                            loopcontinue()
                        }
                        
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(1736608277))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_118 = var_9_CB:double
                            goto(Label_0878)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(1316411925))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(1365162670))
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-157957240))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0587)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(-2082058826))
                            goto(Label_0432)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(-2072596217))
                            loopcontinue()
                        }
                        
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-896119312))
                        var_14_118 = mul:double(ldc:double(0.5), add:double(var_9_CB:double, var_14_118:double))
                    }
                    
                    Label_0878:
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(1636385418))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-1744734984))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-1831604054))
                        goto(Label_1189)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(416240335))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0587)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(-693435006))
                            goto(Label_0432)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(-148189320))
                            loopcontinue()
                        }
                        
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-593556521))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EE = xor:int(ldc:int(-31726), ldc:int(-31725))
                                goto(Label_1189)
                            }
                        }
                    }
                    
                    Label_1020:
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(471685302))
                        goto(Label_1486)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(220380627))
                        goto(Label_1332)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(-92126065))
                            goto(Label_0878)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(-1041185424))
                            goto(Label_0587)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0432)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(1583347278))
                            loopcontinue()
                        }
                        
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(2039148304))
                        var_11_EE = and:int(ldc:int(8298), ldc:int(-9835))
                    }
                    
                    Label_1189:
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-442491426))
                        goto(Label_1661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(1229578155))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(1391787993))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1020)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(410687757))
                            goto(Label_0878)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(-248132747))
                            goto(Label_0587)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0432)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(-1515979764))
                            loopcontinue()
                        }
                        
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(1169325149))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EE:int, ldc:int(0))) {
                                goto(Label_1486)
                            }
                        }
                    }
                    
                    Label_1332:
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(53038868))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(1065136041))
                            goto(Label_1189)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(395891930))
                            goto(Label_1020)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0878)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(-1894396846))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(1137982712))
                            goto(Label_0587)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(1743182800))
                            goto(Label_0432)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_6EC = and:int(var_3_6EC:int, ldc:int(-491892931))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_118:double, var_5_85:int, var_16_11C:int)
                            goto(Label_1650)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1486:
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1661)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-1541584855))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(738814143))
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(810346654))
                        goto(Label_1020)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(374186281))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-561296270))
                        goto(Label_0587)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-745940504))
                        goto(Label_0432)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-152526310))
                        loopcontinue()
                    }
                    
                    var_3_6EC = and:int(var_3_6EC:int, ldc:int(-621348206))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_118:double, ldc:double(0.0))
                    Label_1650:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6F7 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EE:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1661:
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(137324868))
                        goto(Label_1486)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-32138714))
                        goto(Label_1332)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-1902773527))
                        goto(Label_1189)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-335518573))
                        goto(Label_1020)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0878)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6EC:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0587)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6EC = and:int(var_3_6EC:int, ldc:int(-609525871))
                        var_17_6F7 = add:int(var_16_11C:int, and:int(ldc:int(4289), ldc:int(8199)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6EC = and:int(var_3_6EC:int, ldc:int(1660157715))
                
                if (cmple:boolean(var_5_85 = var_17_6F7:int, sub:int(var_6_8C:int, xor:int(ldc:int(9), ldc:int(8))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_6EC:int, ldc:int(32768)), ldc:int(0))) {
            var_3_6EC = and:int(var_3_6EC:int, ldc:int(-1670923093))
            goto(Label_0106)
        }
    }
}
