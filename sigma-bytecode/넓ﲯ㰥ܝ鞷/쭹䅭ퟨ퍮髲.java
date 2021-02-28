public class \ub113\ufcaf\u3c25\u071d\u97b7.\ucb79\u416d\ud7e8\ud36e\u9af2 {
    public void \ucb79\u416d\ud7e8\ud36e\u9af2(int p0, float p1, int p2) {
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
            invokespecial:\u67e9\u7330\u62da\u3c25\u624e(\u67e9\u7330\u62da\u3c25\u624e::<init>, this:\ucb79\u416d\ud7e8\ud36e\u9af2, invokestatic:ImmutableMap[expected:Map](ImmutableMap::of, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\uc87f\ubcb0\uafe7\u64f2\u74b1>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\uceb8\u51b2\ud523\ud523\u3a62\u3c25), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u51fa\ud7e8\u4179\u64f2\u5bc4\u61a4), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u6cfe\u59ec\ub7dc\ub32d\u98a4\u5f50), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u52d3\uf94d\u7006\uc910\uf995\u6b0d), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u3a62\u47c2\ua3b4\ub83f\ud523\u7049), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u52d3\uf94d\u7006\uc910\uf995\u6b0d)))
            putfield:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\ucb79\u416d\ud7e8\ud36e\u9af2::\ub32d\u93a2\u8640\u156b\u52d3\uc84e, this:\ucb79\u416d\ud7e8\ud36e\u9af2, invokestatic:Optional<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(Optional<T>::empty))
            putfield:int(\ucb79\u416d\ud7e8\ud36e\u9af2::\u8389\uf94d\u51fa\u5654\u74b1\ub83f, this:\ucb79\u416d\ud7e8\ud36e\u9af2, p0:int)
            putfield:float(\ucb79\u416d\ud7e8\ud36e\u9af2::\u1187\u527a\u516c\uff55\u3504\ua068, this:\ucb79\u416d\ud7e8\ud36e\u9af2, p1:float)
            putfield:int(\ucb79\u416d\ud7e8\ud36e\u9af2::\u67e9\u7330\u6c52\uceb8\u3c25\u6cfe, this:\ucb79\u416d\ud7e8\ud36e\u9af2, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4ab3\uafe7\u8709\ub171\ubefe\u759a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
    
    private static boolean lambda$\u9a18\ucb79\ua562\u3776\u494c\u9033$3(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:boolean(xor:int[expected:boolean](ldc:int(1290), ldc:int(1291)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u40a9\u3a62\u3d64\u62da\uae5d\u5140$2(\ub113\uc4d2\u183a\u527a\u6435.\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0 p0) {
        var_1_5F : int
        stack_86_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(1996787984), ldc:int(471799101))
            
            if (cmpne:boolean(p0:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0, getstatic:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0(\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0::\u76bc\ua6bd\u8c8a\u494c\u839e\u8308))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-173713584))
                stack_86_0 = and:int(ldc:int(-24803), ldc:int(24738))
            }
            else {
                stack_86_0 = xor:int(ldc:int(17474), ldc:int(17475))
            }
            
            return:boolean(stack_86_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ub7dc\u3e2a\u99f7\u3e2a\u8640\u960f$1(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(105), ldc:int(5269)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u7330\u6435\u7e3f\u40a9\ub7dc\ud158$0(\ub113\uc4d2\u183a\u527a\u6435.\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0 p0) {
        var_1_61 : int
        stack_8A_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-233260257), ldc:int(-2103592202))
            
            if (cmpne:boolean(p0:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0, getstatic:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0(\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0::\u76bc\ua6bd\u8c8a\u494c\u839e\u8308))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1749419457))
                stack_8A_0 = and:int(ldc:int(-9654), ldc:int(9652))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(24656), ldc:int(24657))
            }
            
            return:boolean(stack_8A_0:int)
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
        var_3_657 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_662 : int
        
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
        var_3_657 = and:int(ldc:int(81095472), ldc:int(1904191475))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucb79\u416d\ud7e8\ud36e\u9af2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
            var_3_657 = and:int(var_3_657:int, ldc:int(-603622248))
        }
        else {
            var_3_657 = and:int(var_3_657:int, ldc:int(671043516))
            var_5_8A = and:int(ldc:int(8647), ldc:int(-12744))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-4957), ldc:int(4948)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_657:int, ldc:int(-755532751))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(16939), ldc:int(9617)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(31), ldc:int(12897)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_657 = and:int(var_3_DA:int, ldc:int(-1839266697))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(1), ldc:int(14377)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(2118051285))
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1052602144))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-680581274))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1871598021))
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-619029753))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1244163274))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-436543223))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1513375202))
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1677363763))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(909702094))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1216895364))
                        var_11_EB = and:int(ldc:int(201), ldc:int(-202))
                        goto(Label_1481)
                    }
                    
                    Label_0586:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(672661885))
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-33550059))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1436374707))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1646928519))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0825)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1735171135))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1706155316))
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1424973051))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1848274445))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0825:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-568125564))
                        goto(Label_1492)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-44834708))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1515157457))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1256815373))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(1534931519))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(36), ldc:int(37))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0950:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1959323662))
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-305373135))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-74268642))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1333353665))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(16)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-503602274))
                            goto(Label_0825)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1738727240))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1428731462))
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(1440042355))
                        var_11_EB = and:int(ldc:int(18502), ldc:int(-18504))
                    }
                    
                    Label_1137:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(426821320))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-306358005))
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-274804557))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1854587144))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1362)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1137)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0950)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0825)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(-1271449052))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                            var_3_657 = and:int(var_3_657:int, ldc:int(1459092209))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1481)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1362:
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1492)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1230259115))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1571642202))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(536870912)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_657 = and:int(var_3_657:int, ldc:int(1851116216))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1481:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_662 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1492:
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(1105430457))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(64)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-828495389))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0950)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-232330714))
                        goto(Label_0825)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-472226827))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_657:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-1294582207))
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_657:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_657 = and:int(var_3_657:int, ldc:int(-218166217))
                        var_17_662 = add:int(var_16_119:int, and:int(ldc:int(145), ldc:int(8257)))
                        looporswitchbreak()
                    }
                    
                    var_3_657 = and:int(var_3_657:int, ldc:int(-1217088360))
                }
                
                var_3_657 = and:int(var_3_657:int, ldc:int(1893170430))
                
                if (cmple:boolean(var_5_8A = var_17_662:int, sub:int(var_6_91:int, xor:int(ldc:int(39), ldc:int(38))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_657:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
