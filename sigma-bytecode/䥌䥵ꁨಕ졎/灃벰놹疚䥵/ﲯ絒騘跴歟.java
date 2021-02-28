public class \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\ufcaf\u7d52\u9a18\u8df4\u6b5f {
    public void \ufcaf\u7d52\u9a18\u8df4\u6b5f() {
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
            invokespecial:Object(Object::<init>, this:\ufcaf\u7d52\u9a18\u8df4\u6b5f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u3a62\u2dcc\ua6bd\ua562\uc246\u3bc9(com.mojang.brigadier.CommandDispatcher<\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937> p0) {
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
    
    private static int \u946b\u839e\u36d3\ua562\u3776\u47c2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, com.mojang.datafixers.util.Pair<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, com.mojang.datafixers.util.Either<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u416d\u7006\u836c\u0800\u8308, \u12b2\u7049\u8df4\uc9f6\uae87.\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u416d\u7006\u836c\u0800\u8308>>> p1, int p2, boolean p3) {
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
    
    private static int \u4bc8\u8d98\ubff1\u385b\u927d\uceb8(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0, java.lang.String p1) {
        var_4_77 : int
        stack_B6_1 : String [generated]
        expr_9B : Object[] [generated]
        
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
        var_4_77 = invokevirtual:int(\u7873\u7ce1\u516c\u1833\ua6bd<T>::\ud4fe\u839e\u92ee\u6b0d\uf9c5\u4492, invokeinterface:\u7873\u7ce1\u516c\u1833\ua6bd<\u88c5\ud171\ub113\u6435\ud51e>(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\uc9f6\u0c95\u8640\u0b8e\u960f\u51fa, invokeinterface:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u6435\u5db4\uc31c\u7049\ubded\u3bc9, invokevirtual:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, p0:\u8413\u5140\u64f2\uc9f6\u9937)))), p1:String)
        
        if (cmpne:boolean(var_4_77:int, ldc:int(0))) {
            stack_B6_1 = loadelement:String(getstatic:String[](\ufcaf\u7d52\u9a18\u8df4\u6b5f::\ufe34\u183a\ub19c\u8709\u4c2b\u8258), and:int(ldc:int(16550), ldc:int(14662)))
            expr_9B = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(5132), ldc:int(5134)))
            storeelement:Object(expr_9B:Object[], and:int(ldc:int(-15669), ldc:int(3380)), invokestatic:Integer[expected:Object](Integer::valueOf, var_4_77:int))
            storeelement:Object(expr_9B:Object[], and:int(ldc:int(1069), ldc:int(24657)), p1:String[expected:Object])
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p0:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_B6_1:String, expr_9B:Object[]), xor:int[expected:boolean](ldc:int(-30144), ldc:int(-30143)))
            return:int(var_4_77:int)
        }
        
        athrow(invokevirtual:CommandSyntaxException(DynamicCommandExceptionType::create, getstatic:DynamicCommandExceptionType(\ufcaf\u7d52\u9a18\u8df4\u6b5f::\u4179\u3dd3\uceb8\uc31c\u7bad\u760c), p1:String[expected:Object]))
    }
    
    private static void lambda$\u69d9\u5654\u8389\u0b8e\uff55\u647c$8(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, boolean p1, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u7873\u7ce1\u516c\u1833\ua6bd p2, long p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p4, int p5, \u12b2\u7049\u8df4\uc9f6\uae87.\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3 p6) {
        var_10_84 : String
        stack_E1_1 : String [generated]
        expr_B9 : Object[] [generated]
        
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
            var_10_84 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ufcaf\u7d52\u9a18\u8df4\u6b5f::\ufe34\u183a\ub19c\u8709\u4c2b\u8258), and:int(ldc:int(11447), ldc:int(16911)))), invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
            
            if (p1:boolean) {
                invokevirtual:int(\u7873\u7ce1\u516c\u1833\ua6bd::\ud4fe\u839e\u92ee\u6b0d\uf9c5\u4492, p2:\u7873\u7ce1\u516c\u1833\ua6bd, var_10_84:String)
            }
            
            invokevirtual:void(\u7873\u7ce1\u516c\u1833\ua6bd::\u7049\ud4fe\ub171\u5fe1\u5140\u8350, p2:\u7873\u7ce1\u516c\u1833\ua6bd, var_10_84:String, p3:long, initobject:\u0800\u4d85\u3bc9\u6b0d\u59ec[expected:\u6ec6\ud7e8\u7043\u9255\u0800](\u0800\u4d85\u3bc9\u6b0d\u59ec::<init>, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))
            stack_E1_1 = loadelement:String(getstatic:String[](\ufcaf\u7d52\u9a18\u8df4\u6b5f::\ufe34\u183a\ub19c\u8709\u4c2b\u8258), and:int(ldc:int(9224), ldc:int(6152)))
            expr_B9 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(1299), ldc:int(6379)))
            storeelement:Object(expr_B9:Object[], and:int(ldc:int(-15584), ldc:int(15518)), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
            storeelement:Object(expr_B9:Object[], and:int(ldc:int(19509), ldc:int(905)), invokestatic:Integer[expected:Object](Integer::valueOf, p5:int))
            storeelement:Object(expr_B9:Object[], xor:int(ldc:int(19968), ldc:int(19970)), invokestatic:Long[expected:Object](Long::valueOf, p3:long))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p4:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_E1_1:String, expr_B9:Object[]), and:int[expected:boolean](ldc:int(28849), ldc:int(3073)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u3e2a\u8389\u0b8e\u4f4a\u6c52\u47c2$7(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, boolean p1, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u7873\u7ce1\u516c\u1833\ua6bd p2, long p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p4, int p5, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u416d\u7006\u836c\u0800\u8308 p6) {
        var_10_69 : String
        stack_C6_1 : String [generated]
        expr_9E : Object[] [generated]
        
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
            var_10_69 = invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)
            
            if (p1:boolean) {
                invokevirtual:int(\u7873\u7ce1\u516c\u1833\ua6bd::\ud4fe\u839e\u92ee\u6b0d\uf9c5\u4492, p2:\u7873\u7ce1\u516c\u1833\ua6bd, var_10_69:String)
            }
            
            invokevirtual:void(\u7873\u7ce1\u516c\u1833\ua6bd::\u7049\ud4fe\ub171\u5fe1\u5140\u8350, p2:\u7873\u7ce1\u516c\u1833\ua6bd, var_10_69:String, p3:long, initobject:\u647c\u759a\uf995\u7bad\u9937[expected:\u6ec6\ud7e8\u7043\u9255\u0800](\u647c\u759a\uf995\u7bad\u9937::<init>, p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))
            stack_C6_1 = loadelement:String(getstatic:String[](\ufcaf\u7d52\u9a18\u8df4\u6b5f::\ufe34\u183a\ub19c\u8709\u4c2b\u8258), xor:int(ldc:int(-28636), ldc:int(-28627)))
            expr_9E = newarray:Object[](java.lang.Object.class, and:int(ldc:int(16423), ldc:int(8987)))
            storeelement:Object(expr_9E:Object[], and:int(ldc:int(-7144), ldc:int(7047)), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
            storeelement:Object(expr_9E:Object[], and:int(ldc:int(17415), ldc:int(12841)), invokestatic:Integer[expected:Object](Integer::valueOf, p5:int))
            storeelement:Object(expr_9E:Object[], xor:int(ldc:int(21537), ldc:int(21539)), invokestatic:Long[expected:Object](Long::valueOf, p3:long))
            invokevirtual:void(\u8413\u5140\u64f2\uc9f6\u9937::\u72f1\ucb79\ua068\uceb8\u983f\u6cfe, p4:\u8413\u5140\u64f2\uc9f6\u9937, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_C6_1:String, expr_9E:Object[]), and:int[expected:boolean](ldc:int(77), ldc:int(16435)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ua562\ucfaf\u99f7\ub1b9\u71ae\u9a18$6(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ufcaf\u7d52\u9a18\u8df4\u6b5f::\u4bc8\u8d98\ubff1\u385b\u927d\uceb8, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:String(StringArgumentType::getString, p0:CommandContext, loadelement:String(getstatic:String[](\ufcaf\u7d52\u9a18\u8df4\u6b5f::\ufe34\u183a\ub19c\u8709\u4c2b\u8258), xor:int(ldc:int(-8176), ldc:int(-8175))))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u5bc4\uc84e\u8350\u7873\u9af2\u72f1$5(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ufcaf\u7d52\u9a18\u8df4\u6b5f::\u946b\u839e\u36d3\ua562\u3776\u47c2, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Pair<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, Either<\u416d\u7006\u836c\u0800\u8308, \u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u416d\u7006\u836c\u0800\u8308>>>(\u6c52\ucef1\ub19c\u960f\u0b8e::\uae87\u69d9\ufcaf\ud4fe\u92ff\u97e6, p0:CommandContext, loadelement:String(getstatic:String[](\ufcaf\u7d52\u9a18\u8df4\u6b5f::\ufe34\u183a\ub19c\u8709\u4c2b\u8258), xor:int(ldc:int(520), ldc:int(521)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\ufcaf\u7d52\u9a18\u8df4\u6b5f::\ufe34\u183a\ub19c\u8709\u4c2b\u8258), and:int(ldc:int(6275), ldc:int(258)))), and:int[expected:boolean](ldc:int(1603), ldc:int(8325))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uc229\uc87f\ucb79\u3a62\uc4d2\uc910$4(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ufcaf\u7d52\u9a18\u8df4\u6b5f::\u946b\u839e\u36d3\ua562\u3776\u47c2, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Pair<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, Either<\u416d\u7006\u836c\u0800\u8308, \u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u416d\u7006\u836c\u0800\u8308>>>(\u6c52\ucef1\ub19c\u960f\u0b8e::\uae87\u69d9\ufcaf\ud4fe\u92ff\u97e6, p0:CommandContext, loadelement:String(getstatic:String[](\ufcaf\u7d52\u9a18\u8df4\u6b5f::\ufe34\u183a\ub19c\u8709\u4c2b\u8258), xor:int(ldc:int(21508), ldc:int(21509)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\ufcaf\u7d52\u9a18\u8df4\u6b5f::\ufe34\u183a\ub19c\u8709\u4c2b\u8258), and:int(ldc:int(2), ldc:int(26891)))), and:int[expected:boolean](ldc:int(234), ldc:int(-8427))))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uae5d\ubff1\uc84e\ua6bd\u4bc8\uf995$3(com.mojang.brigadier.context.CommandContext p0) {
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
            return:int(invokestatic:int(\ufcaf\u7d52\u9a18\u8df4\u6b5f::\u946b\u839e\u36d3\ua562\u3776\u47c2, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext)), invokestatic:Pair<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, Either<\u416d\u7006\u836c\u0800\u8308, \u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\u416d\u7006\u836c\u0800\u8308>>>(\u6c52\ucef1\ub19c\u960f\u0b8e::\uae87\u69d9\ufcaf\ud4fe\u92ff\u97e6, p0:CommandContext, loadelement:String(getstatic:String[](\ufcaf\u7d52\u9a18\u8df4\u6b5f::\ufe34\u183a\ub19c\u8709\u4c2b\u8258), xor:int(ldc:int(-31672), ldc:int(-31671)))), invokestatic:int(IntegerArgumentType::getInteger, p0:CommandContext, loadelement:String(getstatic:String[](\ufcaf\u7d52\u9a18\u8df4\u6b5f::\ufe34\u183a\ub19c\u8709\u4c2b\u8258), xor:int(ldc:int(0), ldc:int(2)))), xor:int[expected:boolean](ldc:int(36), ldc:int(37))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u3e75\ub32d\u7043\ub18d\uc229\u5140$2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937 p0) {
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
            return:boolean(invokevirtual:boolean(\u8413\u5140\u64f2\uc9f6\u9937::\u873d\u7043\u385b\uceb8\u3a62\u6b0d, p0:\u8413\u5140\u64f2\uc9f6\u9937, and:int(ldc:int(1186), ldc:int(8282))))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\ubf56\u7e3f\u99f7\u600f\u873d\u600f$1(com.mojang.brigadier.context.CommandContext p0, com.mojang.brigadier.suggestion.SuggestionsBuilder p1) {
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
            return:CompletableFuture(invokestatic:CompletableFuture<Suggestions>(\u7e3f\uf94d\u446c\uc7fe\u7e3f::\u5245\u16f6\u3711\u64ab\u6d69\u647c, invokevirtual:Set<String>[expected:Iterable<String>](\u7873\u7ce1\u516c\u1833\ua6bd<T>::\u836c\u3dd3\u983f\u56bd\u600f\u4975, invokeinterface:\u7873\u7ce1\u516c\u1833\ua6bd<\u88c5\ud171\ub113\u6435\ud51e>(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\uc9f6\u0c95\u8640\u0b8e\u960f\u51fa, invokeinterface:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u6435\u5db4\uc31c\u7049\ubded\u3bc9, invokevirtual:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\u8413\u5140\u64f2\uc9f6\u9937::\u4bc8\u1833\ud171\u97b7\u9af2\u8aa5, checkcast:\u8413\u5140\u64f2\uc9f6\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u8413\u5140\u64f2\uc9f6\u9937.class, invokevirtual:Object[expected:\u8413\u5140\u64f2\uc9f6\u9937](CommandContext::getSource, p0:CommandContext))))))), p1:SuggestionsBuilder))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.brigadier.Message lambda$\u6ec6\ua61f\u6b0d\u76bc\u67e9\u52d3$0(java.lang.Object p0) {
        stack_85_1 : String [generated]
        expr_78 : Object[] [generated]
        
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
            stack_85_1 = loadelement:String(getstatic:String[](\ufcaf\u7d52\u9a18\u8df4\u6b5f::\ufe34\u183a\ub19c\u8709\u4c2b\u8258), and:int(ldc:int(1306), ldc:int(28778)))
            expr_78 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(8484), ldc:int(8485)))
            storeelement:Object(expr_78:Object[], and:int(ldc:int(12605), ldc:int(-12606)), p0:Object)
            return:Message(initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_85_1:String, expr_78:Object[]))
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
    
    public void \u5bc4\uc3e3\u8d98\u6c52\u8389\u4cd9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_669 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_674 : int
        
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
        var_3_669 = and:int(ldc:int(760060629), ldc:int(-1889593025))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ufcaf\u7d52\u9a18\u8df4\u6b5f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
            var_3_669 = and:int(var_3_669:int, ldc:int(-473048871))
            var_5_81 = and:int(ldc:int(5520), ldc:int(-21970))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-32682), ldc:int(5793)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_669:int, ldc:int(661508051))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(5643), ldc:int(149)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(8313), ldc:int(513)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_669 = and:int(var_3_DA:int, ldc:int(-1748223749))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-28672), ldc:int(-28671)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1554760209))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(518400031))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1533947469))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(611075995))
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1954182847))
                    }
                    else {
                        var_3_669 = and:int(var_3_669:int, ldc:int(267304637))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1828555657))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1139133208))
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-2089063837))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(644689015))
                            var_11_EB = and:int(ldc:int(21578), ldc:int(-23628))
                            goto(Label_1517)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(2140325707))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(650569858))
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1200838627))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0684:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1283274464))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-2086472045))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(31621158))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1113653880))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-457472654))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(1861139827))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1834681017))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(688841697))
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(2075090499))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(242549453))
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(64670076))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-2130802054))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-965760235))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(20501), ldc:int(3073))
                                goto(Label_1128)
                            }
                        }
                    }
                    
                    Label_0968:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1504417794))
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1405374391))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1300672623))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1086694157))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(1348365459))
                        var_11_EB = and:int(ldc:int(-9045), ldc:int(9044))
                    }
                    
                    Label_1128:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1979702220))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1375982806))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1810331458))
                            goto(Label_0968)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-429324418))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-386182358))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(1582194237))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1262:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(302568092))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1629790379))
                            goto(Label_1128)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0968)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(493273019))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0684)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1614797595))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1906353953))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1517)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1398:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(56245989))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-117228051))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_669 = and:int(var_3_669:int, ldc:int(921581659))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1517:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_674 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1528:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(148946757))
                        goto(Label_0968)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1596047544))
                        goto(Label_0684)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(922102203))
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1779627271))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1976532219))
                        var_17_674 = add:int(var_16_119:int, and:int(ldc:int(65), ldc:int(2065)))
                        looporswitchbreak()
                    }
                }
                
                var_3_669 = and:int(var_3_669:int, ldc:int(-1268958081))
                
                if (cmple:boolean(var_5_81 = var_17_674:int, sub:int(var_6_88:int, xor:int(ldc:int(14337), ldc:int(14336))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2)), ldc:int(0))) {
            var_3_669 = and:int(var_3_669:int, ldc:int(83539168))
            goto(Label_0108)
        }
    }
}
