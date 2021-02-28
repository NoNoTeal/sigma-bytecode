public abstract class \u12b2\u4e72\u8df4\u67e9\u67e9.\ubb2b\ua61f\u8350\uf9c5\ub1b9\ufcaf {
    public void \ubb2b\ua61f\u8350\uf9c5\ub1b9\ufcaf(java.lang.String p0, com.mojang.datafixers.schemas.Schema p1, boolean p2) {
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
            invokespecial:DataFix(DataFix::<init>, this:\ubb2b\ua61f\u8350\uf9c5\ub1b9\ufcaf, p1:Schema, p2:boolean)
            putfield:String(\ubb2b\ua61f\u8350\uf9c5\ub1b9\ufcaf::\ub32d\ub32d\u3dd3\u494c\u72f1\u12b2, this:\ubb2b\ua61f\u8350\uf9c5\ub1b9\ufcaf, p0:String)
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
    
    private com.mojang.datafixers.Typed<A> \ud523\u8389\u98a4\u527a\u40a9\uafe7(java.lang.Object p0, com.mojang.serialization.DynamicOps<?> p1, com.mojang.datafixers.types.Type<A> p2) {
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
            return:Typed<A>(initobject:Typed(Typed::<init>, p2:Type<A>, p1:DynamicOps<?>, p0:Object))
        }
        
        goto(Label_0006)
    }
    
    public abstract com.mojang.datafixers.util.Pair<java.lang.String, com.mojang.datafixers.Typed<?>> \uc910\u7006\uf9c5\u74b1\ub18d\u6c52(java.lang.String p0, com.mojang.datafixers.Typed<?> p1);
    
    private java.util.function.Function lambda$\u67e9\u7bad\uff55\uff55\u12cb\u6b0d$1(com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p0, com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p1, com.mojang.serialization.DynamicOps p2) {
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
    
    private com.mojang.datafixers.util.Pair lambda$\u7bad\u183a\u8c8a\u624e\uc2bd\u12cb$0(com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p0, com.mojang.serialization.DynamicOps p1, com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType p2, com.mojang.datafixers.util.Pair p3) {
        var_7_6B : String
        var_9_8F : Pair<String, Typed<?>>
        var_10_A2 : Type
        stack_113_0 : String [generated]
        expr_F1 : Object[] [generated]
        
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
        var_7_6B = checkcast:String(java.lang.String.class, invokevirtual:Object[expected:String](Pair::getFirst, p3:Pair))
        var_9_8F = invokevirtual:Pair<String, Typed<?>>(\ubb2b\ua61f\u8350\uf9c5\ub1b9\ufcaf::\uc910\u7006\uf9c5\u74b1\ub18d\u6c52, this:\ubb2b\ua61f\u8350\uf9c5\ub1b9\ufcaf, var_7_6B:String, invokespecial:Typed(\ubb2b\ua61f\u8350\uf9c5\ub1b9\ufcaf::\ud523\u8389\u98a4\u527a\u40a9\uafe7, this:\ubb2b\ua61f\u8350\uf9c5\ub1b9\ufcaf, invokevirtual:Object(Pair::getSecond, p3:Pair), p1:DynamicOps, checkcast:Type(com.mojang.datafixers.types.Type.class, invokeinterface:Type(Map<K, Type>::get, invokevirtual:Map(TaggedChoice$TaggedChoiceType::types, p0:TaggedChoice$TaggedChoiceType), var_7_6B:String[expected:Object]))))
        var_10_A2 = checkcast:Type(com.mojang.datafixers.types.Type.class, invokeinterface:Type(Map<K, Type>::get, invokevirtual:Map(TaggedChoice$TaggedChoiceType::types, p2:TaggedChoice$TaggedChoiceType), invokevirtual:Object(Pair::getFirst, var_9_8F:Pair<String, Typed<?>>)))
        
        if (invokevirtual:boolean(Type::equals, var_10_A2:Type, invokevirtual:Type[expected:Object](Typed::getType, checkcast:Typed(com.mojang.datafixers.Typed.class, invokevirtual:Object[expected:Typed](Pair::getSecond, var_9_8F:Pair<String, Typed<?>>))), xor:int[expected:boolean](ldc:int(8194), ldc:int(8195)), and:int[expected:boolean](ldc:int(7), ldc:int(1513)))) {
            return:Pair(invokestatic:Pair(Pair::of, invokevirtual:Object(Pair::getFirst, var_9_8F:Pair<String, Typed<?>>), invokevirtual:Object(Typed::getValue, checkcast:Typed(com.mojang.datafixers.Typed.class, invokevirtual:Object(Pair::getSecond, var_9_8F:Pair<String, Typed<?>>)))))
        }
        
        stack_113_0 = ldc:String("Dynamic type check failed: %s not equal to %s")
        expr_F1 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(26250), ldc:int(291)))
        storeelement:Object(expr_F1:Object[], and:int(ldc:int(-5450), ldc:int(5449)), var_10_A2:Type[expected:Object])
        storeelement:Object(expr_F1:Object[], and:int(ldc:int(659), ldc:int(14369)), invokevirtual:Type[expected:Object](Typed::getType, checkcast:Typed(com.mojang.datafixers.Typed.class, invokevirtual:Object[expected:Typed](Pair::getSecond, var_9_8F:Pair<String, Typed<?>>))))
        athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokestatic:String(String::format, stack_113_0:String, expr_F1:Object[])))
    }
    
    public void \u7c6b\u6c56\u8350\u5f50\uafe7\u3d64(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_604 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_60F : int
        
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
        var_3_604 = and:int(ldc:int(875020201), ldc:int(1473715599))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubb2b\ua61f\u8350\uf9c5\ub1b9\ufcaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8)), ldc:int(0))) {
            var_3_604 = and:int(var_3_604:int, ldc:int(-1384085591))
        }
        else {
            var_3_604 = and:int(var_3_604:int, ldc:int(999788505))
            var_5_85 = and:int(ldc:int(-25902), ldc:int(25645))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-8692), ldc:int(8433)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_604:int, ldc:int(449793513))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, xor:int(ldc:int(4481), ldc:int(4480)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(10264), ldc:int(10265)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_604 = and:int(var_3_D2:int, ldc:int(-120639489))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(3811), ldc:int(8209)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1457866251))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1042)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(808349823))
                        goto(Label_0862)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0734)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1995431375))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0525)
                            }
                            
                            goto(Label_0734)
                        }
                    }
                    
                    Label_0373:
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1755414848))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1042)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1568161760))
                        goto(Label_0862)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1446819503))
                        goto(Label_0734)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-1030134618))
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1838695155))
                        var_11_E3 = and:int(ldc:int(5352), ldc:int(-5353))
                        goto(Label_1423)
                    }
                    
                    Label_0525:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(716975691))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1042)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0734)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(160821270))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(-254836743))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0734)
                        }
                    }
                    
                    Label_0627:
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(928882109))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1042)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0862)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-1777003749))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(-559981207))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0734:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-943076484))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1395559193))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1042)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-352371410))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(360246641))
                            goto(Label_0627)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(1900455677))
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(-637014647))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(279), ldc:int(6689))
                                goto(Label_1042)
                            }
                        }
                    }
                    
                    Label_0862:
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(64)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1888361469))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1529913733))
                        goto(Label_1172)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1512718781))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0734)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(256)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-1968775285))
                            goto(Label_0627)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-2103030871))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(1139356475))
                            goto(Label_0373)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-948527908))
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(-775966757))
                        var_11_E3 = and:int(ldc:int(-30514), ldc:int(18225))
                    }
                    
                    Label_1042:
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(369038029))
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1130523481))
                        goto(Label_1292)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0862)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-95555439))
                            goto(Label_0734)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0627)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-903357655))
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(183584806))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_604 = and:int(var_3_604:int, ldc:int(-154194583))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1292)
                            }
                        }
                    }
                    
                    Label_1172:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1434)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(1217255078))
                            goto(Label_1042)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0862)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0734)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-698437104))
                            goto(Label_0627)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_604:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0525)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(256)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(873161895))
                            goto(Label_0373)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_604 = and:int(var_3_604:int, ldc:int(-1166053479))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1423)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1292:
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(473819125))
                        goto(Label_1434)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1766108959))
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1042)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1654898904))
                        goto(Label_0862)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0734)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1503980829))
                        goto(Label_0627)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_604 = and:int(var_3_604:int, ldc:int(-260088423))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1423:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_60F = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1434:
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1292)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1172)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1042)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0862)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1093415983))
                        goto(Label_0734)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0627)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(256)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(-1221919981))
                        goto(Label_0525)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(8)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(1156172303))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_604:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_604 = and:int(var_3_604:int, ldc:int(351772047))
                        var_17_60F = add:int(var_16_111:int, xor:int(ldc:int(6180), ldc:int(6181)))
                        looporswitchbreak()
                    }
                    
                    var_3_604 = and:int(var_3_604:int, ldc:int(-1005750037))
                }
                
                var_3_604 = and:int(var_3_604:int, ldc:int(-1834545719))
                
                if (cmple:boolean(var_5_85 = var_17_60F:int, sub:int(var_6_8C:int, and:int(ldc:int(2305), ldc:int(17525))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_604:int, ldc:int(1048576)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
