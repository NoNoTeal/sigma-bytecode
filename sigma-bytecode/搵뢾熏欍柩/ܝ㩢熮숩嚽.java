public class \u6435\ub8be\u718f\u6b0d\u67e9.\u071d\u3a62\u71ae\uc229\u56bd {
    public void \u071d\u3a62\u71ae\uc229\u56bd() {
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
            invokespecial:\u67e9\u7330\u62da\u3c25\u624e(\u67e9\u7330\u62da\u3c25\u624e::<init>, this:\u071d\u3a62\u71ae\uc229\u56bd, invokestatic:ImmutableMap[expected:Map](ImmutableMap::of, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\uc87f\ubcb0\uafe7\u64f2\u74b1>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\uceb8\u51b2\ud523\ud523\u3a62\u3c25), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u52d3\uf94d\u7006\uc910\uf995\u6b0d), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u7ce1\u6b5f\u071d\u873d\ubf56\u74b1>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ua3b4\u4daf\u98a4\u527a\uc4d2\u36d3), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u52d3\uf94d\u7006\uc910\uf995\u6b0d), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u47c2\ubded\u600f\u120d\ubf56\u3776), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u59ec\u7330\ucb79\u40a9\u6bb9\uff55), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<List<\ube23\u67d0\u64f2\u839e\u76bc>>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u759a\ub7dc\u4ab3\u8753\ufe34\u56bd), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u59ec\u7330\ucb79\u40a9\u6bb9\uff55), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u6d69\u8aa5\u983f\ud158\ub171\u718f), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u51fa\ud7e8\u4179\u64f2\u5bc4\u61a4)))
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
    
    private static void lambda$\u527a\u3c25\u8308\u8753\ud4fe\u67e9$4(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u36d3\u9033\u6b0d\u983f\u8d90.\ub32d\u92ff\uc2bd\ud36e\ud36e p1, java.util.List p2) {
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
    
    private static void lambda$\ubefe\u3c25\u92ee\u8aa5\u62da\ub18d$3(\u36d3\u9033\u6b0d\u983f\u8d90.\ub32d\u92ff\uc2bd\ud36e\ud36e p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\ud36e\uc7fe\u7043\u965f\u92ee\u98a4, p0:\ub32d\u92ff\uc2bd\ud36e\ud36e, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u7ce1\u6b5f\u071d\u873d\ubf56\u74b1>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ua3b4\u4daf\u98a4\u527a\uc4d2\u36d3), initobject:\ubded\u4d85\u4e72\ud523\uf94d\u8df4(\ubded\u4d85\u4e72\ud523\uf94d\u8df4::<init>, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], xor:int[expected:boolean](ldc:int(-32733), ldc:int(-32734))))
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\ud36e\uc7fe\u7043\u965f\u92ee\u98a4, p0:\ub32d\u92ff\uc2bd\ud36e\ud36e, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\uc87f\ubcb0\uafe7\u64f2\u74b1>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\uceb8\u51b2\ud523\ud523\u3a62\u3c25), initobject:\uc87f\ubcb0\uafe7\u64f2\u74b1(\uc87f\ubcb0\uafe7\u64f2\u74b1::<init>, initobject:\ubded\u4d85\u4e72\ud523\uf94d\u8df4[expected:\u7ce1\u6b5f\u071d\u873d\ubf56\u74b1](\ubded\u4d85\u4e72\ud523\uf94d\u8df4::<init>, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], and:int[expected:boolean](ldc:int(-7233), ldc:int(7232))), ldc:float(0.3f), xor:int(ldc:int(-28624), ldc:int(-28623))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u6fb0\u4bc8\u3d64\u5140\u071d\uc229$2(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_2_5F : int
        stack_8D_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(-1318058874), ldc:int(-1076183010))
            
            if (cmpgt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), ldc:double(32.0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1141606110))
                stack_8D_0 = and:int(ldc:int(667), ldc:int(-668))
            }
            else {
                stack_8D_0 = xor:int(ldc:int(2056), ldc:int(2057))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uc9f6\u51fa\uc3e3\ubb2b\u446c\u8c8a$1(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:boolean(invokevirtual:boolean(Object::equals, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u8d90\u927d\u7d52\uf94d\u12cb>[expected:Object](\u9255\u0c95\u4cd9\ube23\u760c::\u12cb\ub19c\u34df\u120d\ud7e8\u2dcc), invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8bb0\u92ee\u92ff\ua6bd\u98a4\u7af6$0(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:boolean(invokevirtual:boolean(Object::equals, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u8d90\u927d\u7d52\uf94d\u12cb>[expected:Object](\u9255\u0c95\u4cd9\ube23\u760c::\u12cb\ub19c\u34df\u120d\ud7e8\u2dcc), invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))
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
        var_3_68D = and:int(ldc:int(2056643808), ldc:int(-1761618330))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u071d\u3a62\u71ae\uc229\u56bd[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(-1231570225))
            var_5_81 = and:int(ldc:int(-3925), ldc:int(3924))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(14860), ldc:int(-31565)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_68D:int, ldc:int(-153754779))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(12399), ldc:int(657)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(1025), ldc:int(8837)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_68D = and:int(var_3_DA:int, ldc:int(-686701099))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(4115), ldc:int(4114)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1593120877))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-355881833))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-124992878))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-807745810))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1359406208))
                        goto(Label_0622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(747448235))
                    }
                    else {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-671531))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0622)
                            }
                            
                            goto(Label_0888)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1336609131))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(159414281))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-940804156))
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-881276236))
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(719037042))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-517599327))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(300746337))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-95034149))
                        var_11_EB = and:int(ldc:int(4803), ldc:int(-4812))
                        goto(Label_1562)
                    }
                    
                    Label_0622:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1231778476))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(2002120641))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(31541661))
                        goto(Label_0888)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-98573203))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0888)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1614221680))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1943961721))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(324401251))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(519893266))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1511619313))
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1556915056))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(400146519))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0888:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(627682691))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1335895651))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-602633676))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(965018286))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(2031797884))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(95695622))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(2121528517))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(529), ldc:int(8453))
                                goto(Label_1191)
                            }
                        }
                    }
                    
                    Label_1031:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1442310111))
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-688486075))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-147959102))
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1716688940))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1400484984))
                        var_11_EB = and:int(ldc:int(-13136), ldc:int(8527))
                    }
                    
                    Label_1191:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1031)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(530286208))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(673931297))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-231624330))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1425)
                            }
                        }
                    }
                    
                    Label_1298:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1191)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(807063537))
                            goto(Label_1031)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1612506095))
                            goto(Label_0888)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(128324186))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0622)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(2048894295))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1425:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1286971520))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(172467721))
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(332889751))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(123365394))
                        goto(Label_0622)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_68D = and:int(var_3_68D:int, ldc:int(2052309341))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_698 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1285477529))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1191)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(477938950))
                        goto(Label_0888)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1747378848))
                        goto(Label_0622)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(327012288))
                        var_17_698 = add:int(var_16_119:int, xor:int(ldc:int(16410), ldc:int(16411)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68D = and:int(var_3_68D:int, ldc:int(-1638284961))
                
                if (cmple:boolean(var_5_81 = var_17_698:int, sub:int(var_6_88:int, and:int(ldc:int(193), ldc:int(8727))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(-346217567))
            goto(Label_0108)
        }
    }
}
