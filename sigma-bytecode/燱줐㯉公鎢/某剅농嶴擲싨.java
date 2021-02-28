public abstract class \u71f1\uc910\u3bc9\u516c\u93a2.\u67d0\u5245\ub18d\u5db4\u64f2\uc2e8 {
    public void \u67d0\u5245\ub18d\u5db4\u64f2\uc2e8(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1) {
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
            invokespecial:DataFix(DataFix::<init>, this:\u67d0\u5245\ub18d\u5db4\u64f2\uc2e8, p0:Schema, and:int[expected:boolean](ldc:int(17497), ldc:int(-17502)))
            putfield:String(\u67d0\u5245\ub18d\u5db4\u64f2\uc2e8::\u6435\u983f\u6c52\u4d85\u516c\u12b2, this:\u67d0\u5245\ub18d\u5db4\u64f2\uc2e8, p1:String)
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
    
    public abstract java.lang.String \u385b\ud7e8\ub32d\u8709\ucfaf\u99f7(java.lang.String p0);
    
    public static com.mojang.datafixers.DataFix \u7d52\u4e72\u6b0d\u392e\u4e72\u72f1(com.mojang.datafixers.schemas.Schema p0, java.lang.String p1, java.util.function.Function<java.lang.String, java.lang.String> p2) {
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
            return:DataFix(initobject:\u7006\u64f2\u3504\u5d20\ub113\u527a[expected:DataFix](\u7006\u64f2\u3504\u5d20\ub113\u527a::<init>, p0:Schema, p1:String, p2:Function<String, String>))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.datafixers.Typed lambda$\u9af2\uc2e8\ub19c\uc9f6\u64ab\u4179$3(com.mojang.datafixers.Typed p0) {
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
    
    private com.mojang.serialization.Dynamic lambda$\uc4d2\u88c5\ua562\u36d3\u7330\ud36e$2(com.mojang.serialization.Dynamic p0) {
        var_2_5F : int
        var_4_6C : Optional
        stack_9E_0 : Dynamic [generated]
        
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
            var_2_5F = and:int(ldc:int(-1457649078), ldc:int(-821051571))
            var_4_6C = invokevirtual:Optional(DataResult::result, invokevirtual:DataResult(OptionalDynamic::asString, invokevirtual:OptionalDynamic(Dynamic::get, p0:Dynamic, ldc:String("Name"))))
            
            if (logicalnot:boolean(invokevirtual:boolean(Optional::isPresent, var_4_6C:Optional))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1123033646))
                stack_9E_0 = p0:Dynamic
            }
            else {
                stack_9E_0 = invokevirtual:Dynamic(Dynamic::set, p0:Dynamic, ldc:String("Name"), invokevirtual:Dynamic(Dynamic::createString, p0:Dynamic, invokevirtual:String(\u67d0\u5245\ub18d\u5db4\u64f2\uc2e8::\u385b\ud7e8\ub32d\u8709\ucfaf\u99f7, this:\u67d0\u5245\ub18d\u5db4\u64f2\uc2e8, checkcast:String(java.lang.String.class, invokevirtual:String(Optional<String>::get, var_4_6C:Optional<String>)))))
            }
            
            return:Dynamic(stack_9E_0:Dynamic)
        }
        
        goto(Label_0006)
    }
    
    private java.util.function.Function lambda$\u0a06\u64ab\u74b1\uc910\u836c\u6ec6$1(com.mojang.serialization.DynamicOps p0) {
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
    
    private com.mojang.datafixers.util.Pair lambda$\ubefe\ub18d\ub18d\ua3b4\uc3e3\ucfaf$0(com.mojang.datafixers.util.Pair p0) {
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
            return:Pair(invokevirtual:Pair(Pair::mapSecond, p0:Pair, invokedynamic:Function<String, String>(apply:(L\u71f1\uc910\u3bc9\u516c\u93a2/\u67d0\u5245\ub18d\u5db4\u64f2\uc2e8;)Ljava/util/function/Function;, this:\u67d0\u5245\ub18d\u5db4\u64f2\uc2e8)))
        }
        
        goto(Label_0006)
    }
    
    public void \u92ff\ubded\ubefe\ucef1\u759a\u8c8a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68B : int
        var_5_88 : int
        var_6_8F : int
        var_7_9E : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_696 : int
        
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
        var_3_68B = and:int(ldc:int(-1780843442), ldc:int(-1409294578))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u67d0\u5245\ub18d\u5db4\u64f2\uc2e8[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0178)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(32)), ldc:int(0))) {
            var_3_68B = and:int(var_3_68B:int, ldc:int(2004279644))
        }
        else {
            var_3_68B = and:int(var_3_68B:int, ldc:int(-1562387042))
            var_5_88 = and:int(ldc:int(3040), ldc:int(-3054))
            var_6_8F = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9E = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(27434), ldc:int(-31724)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_68B:int, ldc:int(-1583382865))
                    var_9_C6 = sub:double(var_7_9E:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_88:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_8F:int, and:int(ldc:int(131), ldc:int(2609)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, and:int(ldc:int(3185), ldc:int(16389)))), var_7_9E:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_68B = and:int(var_3_D8:int, ldc:int(-6564994))
                    var_14_113 = var_7_9E:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_88:int), xor:int(ldc:int(325), ldc:int(324)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_8F:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-999994036))
                        goto(Label_1405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(350509967))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(631011418))
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0718)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0584)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-781235670))
                    }
                    else {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1579525714))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_8F:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0584)
                            }
                            
                            goto(Label_0841)
                        }
                    }
                    
                    Label_0409:
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1680113563))
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-730569030))
                        goto(Label_1405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1589531077))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1506962653))
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1357072779))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(-167775026))
                            var_11_E9 = and:int(ldc:int(23113), ldc:int(-24138))
                            goto(Label_1551)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0584:
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1117868458))
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1686654865))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1833493966))
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1870442384))
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(1149609998))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-828713122))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0841)
                        }
                    }
                    
                    Label_0718:
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-2038472989))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-912769605))
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(1322357208))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-857809218))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0841:
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1169466275))
                        goto(Label_1405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(478509387))
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(1867953764))
                            goto(Label_0718)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(1555351891))
                            goto(Label_0584)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-587467730))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88:int), var_7_9E:double)) {
                                var_11_E9 = and:int(ldc:int(24081), ldc:int(107))
                                goto(Label_1117)
                            }
                        }
                    }
                    
                    Label_0966:
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(2046454332))
                        goto(Label_1405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0841)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(2011641064))
                            goto(Label_0718)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(1124283031))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1308732721))
                        var_11_E9 = and:int(ldc:int(20066), ldc:int(-24163))
                    }
                    
                    Label_1117:
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(697848475))
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-316119082))
                        goto(Label_1405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(-1315483640))
                            goto(Label_0966)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(236248263))
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(-1782061366))
                            goto(Label_0718)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0584)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(16)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(1685449857))
                            loopcontinue()
                        }
                        
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-486638337))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1405)
                            }
                        }
                    }
                    
                    Label_1260:
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(297716471))
                        goto(Label_1562)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(578821180))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1117)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0966)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(-1422652079))
                            goto(Label_0841)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0718)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(1485979167))
                            goto(Label_0584)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(435464571))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(32)), ldc:int(0))) {
                            var_3_68B = and:int(var_3_68B:int, ldc:int(-1965042498))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_88:int, var_16_117:int)
                            goto(Label_1551)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1405:
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1562)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(16)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1811038691))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(1769649835))
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-813335420))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1416330867))
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-978305319))
                        loopcontinue()
                    }
                    
                    var_3_68B = and:int(var_3_68B:int, ldc:int(-656450498))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1551:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_696 = var_5_88:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1562:
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(507113596))
                        goto(Label_1405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1260)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-1545338229))
                        goto(Label_0841)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0584)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(871702232))
                        goto(Label_0409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68B = and:int(var_3_68B:int, ldc:int(-251997857))
                        var_17_696 = add:int(var_16_117:int, and:int(ldc:int(1205), ldc:int(4169)))
                        looporswitchbreak()
                    }
                    
                    var_3_68B = and:int(var_3_68B:int, ldc:int(-1259606124))
                }
                
                var_3_68B = and:int(var_3_68B:int, ldc:int(-140574930))
                
                if (cmple:boolean(var_5_88 = var_17_696:int, sub:int(var_6_8F:int, and:int(ldc:int(17249), ldc:int(5125))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0178:
        
        if (cmpeq:boolean(and:int(var_3_68B:int, ldc:int(1)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
