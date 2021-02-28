public class \ud36e\u6bb9\u960f\u4c04\u64ab.\u9937\ub83f\u40a9\u4d85\ua61f {
    public void \u9937\ub83f\u40a9\u4d85\ua61f(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c<?> p0, int p1, java.util.function.Predicate<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> p2, java.util.function.Predicate<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> p3) {
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
            invokespecial:\u67e9\u7330\u62da\u3c25\u624e(\u67e9\u7330\u62da\u3c25\u624e::<init>, this:\u9937\ub83f\u40a9\u4d85\ua61f, invokestatic:ImmutableMap[expected:Map](ImmutableMap::of, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u7ce1\u6b5f\u071d\u873d\ubf56\u74b1>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ua3b4\u4daf\u98a4\u527a\uc4d2\u36d3), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u52d3\uf94d\u7006\uc910\uf995\u6b0d), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u6d69\u8aa5\u983f\ud158\ub171\u718f), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u51fa\ud7e8\u4179\u64f2\u5bc4\u61a4), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<List<\ube23\u67d0\u64f2\u839e\u76bc>>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u759a\ub7dc\u4ab3\u8753\ufe34\u56bd), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u59ec\u7330\ucb79\u40a9\u6bb9\uff55)))
            putfield:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u9937\ub83f\u40a9\u4d85\ua61f::\u4492\u1833\ubcb0\u16f6\u69d9\ud158, this:\u9937\ub83f\u40a9\u4d85\ua61f, p0:\u9255\u0c95\u4cd9\ube23\u760c<?>)
            putfield:int(\u9937\ub83f\u40a9\u4d85\ua61f::\ua61f\ud523\u8258\ubb2b\uafe7\u0c95, this:\u9937\ub83f\u40a9\u4d85\ua61f, mul:int(p1:int, p1:int))
            putfield:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>(\u9937\ub83f\u40a9\u4d85\ua61f::\ua6bd\u120d\u416d\ub7dc\u99f7\u3e75, this:\u9937\ub83f\u40a9\u4d85\ua61f, p3:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>)
            putfield:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>(\u9937\ub83f\u40a9\u4d85\ua61f::\u64f2\uae87\u965f\uc84e\uc7fe\u72f1, this:\u9937\ub83f\u40a9\u4d85\ua61f, p2:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9937\ub83f\u40a9\u4d85\ua61f(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c<?> p0, int p1) {
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
    
    public boolean \u4ab3\uafe7\u8709\ub171\ubefe\u759a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_3_5F : int
        stack_AB_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(-1699159093), ldc:int(-564595771))
            
            if (logicaland:boolean(invokeinterface:boolean(Predicate<\ube23\u67d0\u64f2\u839e\u76bc>::test, getfield:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>(\u9937\ub83f\u40a9\u4d85\ua61f::\u64f2\uae87\u965f\uc84e\uc7fe\u72f1, this:\u9937\ub83f\u40a9\u4d85\ua61f), p1:\ube23\u67d0\u64f2\u839e\u76bc), invokeinterface:boolean(Stream<Object>::anyMatch, invokeinterface:Stream<Object>(Collection<Object>::stream, invokespecial:List<\ube23\u67d0\u64f2\u839e\u76bc>[expected:Collection<Object>](\u9937\ub83f\u40a9\u4d85\ua61f::\u97e6\u4ab3\u6d99\ud7e8\ud523\u7af6, this:\u9937\ub83f\u40a9\u4d85\ua61f, p1:\ube23\u67d0\u64f2\u839e\u76bc)), invokedynamic:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>(test:(L\ud36e\u6bb9\u960f\u4c04\u64ab/\u9937\ub83f\u40a9\u4d85\ua61f;)Ljava/util/function/Predicate;, this:\u9937\ub83f\u40a9\u4d85\ua61f)))) {
                stack_AB_0 = xor:int(ldc:int(-31480), ldc:int(-31479))
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-760223805))
                stack_AB_0 = and:int(ldc:int(17294), ldc:int(-17295))
            }
            
            return:boolean(stack_AB_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u7873\uc7fe\u99f7\ubb2b\u1833\ua562(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, long p2) {
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
    
    private boolean \uc4d2\u69d9\u72f1\u12cb\u839e\u3a62(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
        var_2_5F : int
        stack_A1_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(-47391712), ldc:int(-853552914))
            
            if (logicaland:boolean(invokevirtual:boolean(Object::equals, getfield:\u9255\u0c95\u4cd9\ube23\u760c<?>[expected:Object](\u9937\ub83f\u40a9\u4d85\ua61f::\u4492\u1833\ubcb0\u16f6\u69d9\ud158, this:\u9937\ub83f\u40a9\u4d85\ua61f), invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])), invokeinterface:boolean(Predicate<\ube23\u67d0\u64f2\u839e\u76bc>::test, getfield:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>(\u9937\ub83f\u40a9\u4d85\ua61f::\ua6bd\u120d\u416d\ub7dc\u99f7\u3e75, this:\u9937\ub83f\u40a9\u4d85\ua61f), p0:\ube23\u67d0\u64f2\u839e\u76bc))) {
                stack_A1_0 = and:int(ldc:int(4353), ldc:int(9881))
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1719655267))
                stack_A1_0 = and:int(ldc:int(-20152), ldc:int(18067))
            }
            
            return:boolean(stack_A1_0:int)
        }
        
        goto(Label_0006)
    }
    
    private java.util.List<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> \u97e6\u4ab3\u6d99\ud7e8\ud523\u7af6(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:List<\ube23\u67d0\u64f2\u839e\u76bc>(checkcast:List<\ube23\u67d0\u64f2\u839e\u76bc>(java.util.List<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc>.class, invokevirtual:List<\ube23\u67d0\u64f2\u839e\u76bc>(Optional<List<\ube23\u67d0\u64f2\u839e\u76bc>>::get, invokevirtual:Optional<List<\ube23\u67d0\u64f2\u839e\u76bc>>(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u836c\u8753\ub102\u9a18\uc910\u6fb0, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:\ube23\u67d0\u64f2\u839e\u76bc), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<List<\ube23\u67d0\u64f2\u839e\u76bc>>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u759a\ub7dc\u4ab3\u8753\ufe34\u56bd)))))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u3c25\u600f\u8308\u3d4b\uff55\u836c$4(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u36d3\u9033\u6b0d\u983f\u8d90.\ub32d\u92ff\uc2bd\ud36e\ud36e p1, java.util.List p2) {
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
    
    private static void lambda$\uf94d\ub19c\u7330\u7873\u8350\u6c52$3(\u36d3\u9033\u6b0d\u983f\u8d90.\ub32d\u92ff\uc2bd\ud36e\ud36e p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\ud36e\uc7fe\u7043\u965f\u92ee\u98a4, p0:\ub32d\u92ff\uc2bd\ud36e\ud36e, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u6d69\u8aa5\u983f\ud158\ub171\u718f), p1:\ube23\u67d0\u64f2\u839e\u76bc)
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\ud36e\uc7fe\u7043\u965f\u92ee\u98a4, p0:\ub32d\u92ff\uc2bd\ud36e\ud36e, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u7ce1\u6b5f\u071d\u873d\ubf56\u74b1>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ua3b4\u4daf\u98a4\u527a\uc4d2\u36d3), initobject:\ubded\u4d85\u4e72\ud523\uf94d\u8df4(\ubded\u4d85\u4e72\ud523\uf94d\u8df4::<init>, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], xor:int[expected:boolean](ldc:int(24), ldc:int(25))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean lambda$\u8389\u3bd6\u6b5f\u71f1\u4f52\u624e$2(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_3_5F : int
        stack_8F_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(1367174241), ldc:int(1174079970))
            
            if (cmpgt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), i2d:double(getfield:int(\u9937\ub83f\u40a9\u4d85\ua61f::\ua61f\ud523\u8258\ubb2b\uafe7\u0c95, this:\u9937\ub83f\u40a9\u4d85\ua61f)))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1130007141))
                stack_8F_0 = and:int(ldc:int(-14463), ldc:int(6246))
            }
            else {
                stack_8F_0 = and:int(ldc:int(77), ldc:int(19329))
            }
            
            return:boolean(stack_8F_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u3504\u5fe1\uc229\u6b0d\u92ff\u67d0$1(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(8253), ldc:int(2689)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u72f1\u120d\ub102\uc87f\u8cae\u7873$0(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(24937), ldc:int(4245)))
        }
        
        goto(Label_0006)
    }
    
    static {
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6fb0\u8413\u8389\ub1b9\ub83f\u8258(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68D : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
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
        var_3_68D = and:int(ldc:int(2028826319), ldc:int(-67114081))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9937\ub83f\u40a9\u4d85\ua61f[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(-4195))
            var_5_81 = and:int(ldc:int(1303), ldc:int(-1304))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-17180), ldc:int(17163)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_68D:int, ldc:int(-54567747))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(24589), ldc:int(4641)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(12297), ldc:int(1281)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_68D = and:int(var_3_DA:int, ldc:int(2004869119))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(9348), ldc:int(9349)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1306249898))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1656878569))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-483231927))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(5386399))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1845302185))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-122847745))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1526491800))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1852144183))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1762222683))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-354131301))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1571139083))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(2004712429))
                        var_11_EB = and:int(ldc:int(3190), ldc:int(-3191))
                        goto(Label_1544)
                    }
                    
                    Label_0595:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-2026166712))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1209784458))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-535910502))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-205567857))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(986421361))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1435362362))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-864918921))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-700555098))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1837686019))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1709240315))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1017670284))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1957514911))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0870:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1368969010))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-382618778))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1877170236))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1452228389))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(358039921))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(2017451167))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(24579), ldc:int(24578))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_1004:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-519331443))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1125489690))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1545490480))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-2122366780))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-131248963))
                        var_11_EB = and:int(ldc:int(-10890), ldc:int(10889))
                    }
                    
                    Label_1164:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1058567328))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1986740217))
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1737860396))
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-205688913))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1407)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1164)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(649599287))
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1107514863))
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1814604527))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(2063466381))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1544)
                    }
                    
                    Label_1407:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-2070992079))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-217347725))
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(173856900))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-933766068))
                        loopcontinue()
                    }
                    
                    var_3_68D = and:int(var_3_68D:int, ldc:int(1953365405))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_698 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(596067470))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-118709764))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(990427141))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1271713168))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1908275407))
                        var_17_698 = add:int(var_16_119:int, and:int(ldc:int(19207), ldc:int(65)))
                        looporswitchbreak()
                    }
                    
                    var_3_68D = and:int(var_3_68D:int, ldc:int(-605944581))
                }
                
                var_3_68D = and:int(var_3_68D:int, ldc:int(-29393489))
                
                if (cmple:boolean(var_5_81 = var_17_698:int, sub:int(var_6_88:int, xor:int(ldc:int(1542), ldc:int(1543))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(-391769918))
            goto(Label_0108)
        }
    }
}
