public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u4c2b\uc2e8\u4492\ubefe\u99f7 {
    public void \u4c2b\uc2e8\u4492\ubefe\u99f7() {
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
            invokespecial:Object(Object::<init>, this:\u4c2b\uc2e8\u4492\ubefe\u99f7)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u9a18\u6cfe\uc84e\u69d9\u6bb9\u120d(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, float p2) {
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
            invokestatic:void(\u4c2b\uc2e8\u4492\ubefe\u99f7::\u51b2\uafe7\u3bc9\u8cae\ud171\u8753, p0:\ube23\u67d0\u64f2\u839e\u76bc, p1:\ube23\u67d0\u64f2\u839e\u76bc)
            invokestatic:void(\u4c2b\uc2e8\u4492\ubefe\u99f7::\ub8be\u8cae\u3776\ua562\u4d85\u6b5f, p0:\ube23\u67d0\u64f2\u839e\u76bc, p1:\ube23\u67d0\u64f2\u839e\u76bc, p2:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u385b\u4c2b\u4d85\u6b5f\ud171\uc9f6(\u36d3\u9033\u6b0d\u983f\u8d90.\ub32d\u92ff\uc2bd\ud36e\ud36e<?> p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
    
    public static boolean \u965f\u36d3\ub1b9\u71ae\u8308\uc29a(\u36d3\u9033\u6b0d\u983f\u8d90.\ub32d\u92ff\uc2bd\ud36e\ud36e<?> p0, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\ud36e\u4bc8\u6d69\u92ee\ubb2b<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> p1, \ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c<?> p2) {
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
    
    private static boolean \ucb79\u69d9\ud171\u7af6\u9a18\uc29a(\u36d3\u9033\u6b0d\u983f\u8d90.\ub32d\u92ff\uc2bd\ud36e\ud36e<?> p0, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\ud36e\u4bc8\u6d69\u92ee\ubb2b<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> p1, java.util.function.Predicate<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> p2) {
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
    
    private static void \u51b2\uafe7\u3bc9\u8cae\ud171\u8753(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
            invokestatic:void(\u4c2b\uc2e8\u4492\ubefe\u99f7::\u0800\u120d\u52d3\u0a06\u4e72\u67e9, p0:\ube23\u67d0\u64f2\u839e\u76bc, p1:\ube23\u67d0\u64f2\u839e\u76bc)
            invokestatic:void(\u4c2b\uc2e8\u4492\ubefe\u99f7::\u0800\u120d\u52d3\u0a06\u4e72\u67e9, p1:\ube23\u67d0\u64f2\u839e\u76bc, p0:\ube23\u67d0\u64f2\u839e\u76bc)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u0800\u120d\u52d3\u0a06\u4e72\u67e9(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\ud36e\uc7fe\u7043\u965f\u92ee\u98a4, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:\ube23\u67d0\u64f2\u839e\u76bc), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u7ce1\u6b5f\u071d\u873d\ubf56\u74b1>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ua3b4\u4daf\u98a4\u527a\uc4d2\u36d3), initobject:\ubded\u4d85\u4e72\ud523\uf94d\u8df4(\ubded\u4d85\u4e72\ud523\uf94d\u8df4::<init>, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], and:int[expected:boolean](ldc:int(9), ldc:int(12801))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \ub8be\u8cae\u3776\ua562\u4d85\u6b5f(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, float p2) {
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
            invokestatic:void(\u4c2b\uc2e8\u4492\ubefe\u99f7::\u61a4\u392e\uf94d\ufcaf\u99f7\u74b1, p0:\ube23\u67d0\u64f2\u839e\u76bc, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p2:float, and:int(ldc:int(8203), ldc:int(18)))
            invokestatic:void(\u4c2b\uc2e8\u4492\ubefe\u99f7::\u61a4\u392e\uf94d\ufcaf\u99f7\u74b1, p1:\ube23\u67d0\u64f2\u839e\u76bc, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p2:float, xor:int(ldc:int(4288), ldc:int(4290)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u61a4\u392e\uf94d\ufcaf\u99f7\u74b1(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1, float p2, int p3) {
        var_6_7B : \uc87f\ubcb0\uafe7\u64f2\u74b1
        
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
            var_6_7B = initobject:\uc87f\ubcb0\uafe7\u64f2\u74b1(\uc87f\ubcb0\uafe7\u64f2\u74b1::<init>, initobject:\ubded\u4d85\u4e72\ud523\uf94d\u8df4[expected:\u7ce1\u6b5f\u071d\u873d\ubf56\u74b1](\ubded\u4d85\u4e72\ud523\uf94d\u8df4::<init>, p1:\u7d52\u718f\u3776\u6fb0\ub83f, and:int[expected:boolean](ldc:int(5936), ldc:int(-8057))), p2:float, p3:int)
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\ud36e\uc7fe\u7043\u965f\u92ee\u98a4, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:\ube23\u67d0\u64f2\u839e\u76bc), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u7ce1\u6b5f\u071d\u873d\ubf56\u74b1>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ua3b4\u4daf\u98a4\u527a\uc4d2\u36d3), initobject:\ubded\u4d85\u4e72\ud523\uf94d\u8df4(\ubded\u4d85\u4e72\ud523\uf94d\u8df4::<init>, p1:\u7d52\u718f\u3776\u6fb0\ub83f, xor:int[expected:boolean](ldc:int(-32724), ldc:int(-32723))))
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\ud36e\uc7fe\u7043\u965f\u92ee\u98a4, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:\ube23\u67d0\u64f2\u839e\u76bc), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\uc87f\ubcb0\uafe7\u64f2\u74b1>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\uceb8\u51b2\ud523\ud523\u3a62\u3c25), var_6_7B:\uc87f\ubcb0\uafe7\u64f2\u74b1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ub32d\u6b5f\u8413\u8413\uc29a\ua6bd(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, float p2, int p3) {
        var_6_74 : \uc87f\ubcb0\uafe7\u64f2\u74b1
        
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
            var_6_74 = initobject:\uc87f\ubcb0\uafe7\u64f2\u74b1(\uc87f\ubcb0\uafe7\u64f2\u74b1::<init>, initobject:\u0800\ube23\ubb2b\u88c5\ufcaf\u5654[expected:\u7ce1\u6b5f\u071d\u873d\ubf56\u74b1](\u0800\ube23\ubb2b\u88c5\ufcaf\u5654::<init>, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), p2:float, p3:int)
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\ud36e\uc7fe\u7043\u965f\u92ee\u98a4, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:\ube23\u67d0\u64f2\u839e\u76bc), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u7ce1\u6b5f\u071d\u873d\ubf56\u74b1>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ua3b4\u4daf\u98a4\u527a\uc4d2\u36d3), initobject:\u0800\ube23\ubb2b\u88c5\ufcaf\u5654(\u0800\ube23\ubb2b\u88c5\ufcaf\u5654::<init>, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\ud36e\uc7fe\u7043\u965f\u92ee\u98a4, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:\ube23\u67d0\u64f2\u839e\u76bc), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\uc87f\ubcb0\uafe7\u64f2\u74b1>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\uceb8\u51b2\ud523\ud523\u3a62\u3c25), var_6_74:\uc87f\ubcb0\uafe7\u64f2\u74b1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u6435\ub171\u759a\u071d\uae5d\ub1b9(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p2) {
        var_7_80 : \u120d\u8bb0\u836c\u64f2\u3504
        
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
            var_7_80 = initobject:\u120d\u8bb0\u836c\u64f2\u3504(\u120d\u8bb0\u836c\u64f2\u3504::<init>, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ube23\u67d0\u64f2\u839e\u76bc::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:\ube23\u67d0\u64f2\u839e\u76bc), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u6bb9\u3c25\u7043\ud217\u76bc\u6c52, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), ldc:double(0.30000001192092896)), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), p1:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\ub102\u5bc4\u624e\ua3b4\u7d52\u5140, var_7_80:\u120d\u8bb0\u836c\u64f2\u3504[expected:\u7d52\u718f\u3776\u6fb0\ub83f], invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u76bc\uc229\u3d64\ud12e\u385b\ud158, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\ud51e\u5f50\u92ff\u99f7\ucef1\u7d52, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u5db4\ubb2b\ube23\uc2e8\u873d\ub32d, p2:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))), ldc:double(0.30000001192092896)))
            invokevirtual:void(\u120d\u8bb0\u836c\u64f2\u3504::\u8bb0\u5245\u5fe1\u759a\u3e2a\u392e, var_7_80:\u120d\u8bb0\u836c\u64f2\u3504)
            invokevirtual:boolean(\u72f1\u7ce1\ucef1\ub83f\u516c::\ua6bd\ubefe\u5f50\u12cb\uceb8\u718f, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u72f1\u7ce1\ucef1\ub83f\u516c](\ube23\u67d0\u64f2\u839e\u76bc::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:\ube23\u67d0\u64f2\u839e\u76bc), var_7_80:\u120d\u8bb0\u836c\u64f2\u3504[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ubefe\u8640\u183a\u6ec6\u93a2 \u927d\ub6ab\u8df4\u7e3f\u56bd\u40a9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ubefe\u8640\u183a\u6ec6\u93a2 p1, int p2) {
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
    
    public static boolean \u59ec\u4c04\u0800\u88c5\u4975\uc4d2(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, int p2) {
        var_5_69 : \u9af2\u1833\u156b\u12cb\u7d52\u6c52
        
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
        var_5_69 = invokevirtual:\u9af2\u1833\u156b\u12cb\u7d52\u6c52(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u51fa\u3bc9\u6cfe\u8c8a\u7c6b\u4c2b, invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\ube23\u67d0\u64f2\u839e\u76bc::\u6b5f\u6b5f\u3e75\ub83f\u4c2b\u5245, p0:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\ube23\u67d0\u64f2\u839e\u76bc]))
        
        if (logicaland:boolean(instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u5245\ube23\u647c\u4daf\ubcb0\u72f1.class, var_5_69:\u5245\ube23\u647c\u4daf\ubcb0\u72f1[expected:\u9af2\u1833\u156b\u12cb\u7d52\u6c52]), invokevirtual:boolean(\u4f4a\uafe7\u76bc\u392e\ub8be::\u759a\ucfaf\u3d64\u983f\u7ce1\uc29a, p0:\u4f4a\uafe7\u76bc\u392e\ub8be, checkcast:\u5245\ube23\u647c\u4daf\ubcb0\u72f1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u5245\ube23\u647c\u4daf\ubcb0\u72f1.class, var_5_69:\u5245\ube23\u647c\u4daf\ubcb0\u72f1[expected:\u9af2\u1833\u156b\u12cb\u7d52\u6c52])))) {
            return:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ubded\u120d\u600f\ua068\u4f52\u8308, p0:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], i2d:double(sub:int(invokevirtual:int(\u5245\ube23\u647c\u4daf\ubcb0\u72f1::\u7af6\uc4d2\uc910\u183a\u3776\ube23, checkcast:\u5245\ube23\u647c\u4daf\ubcb0\u72f1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u5245\ube23\u647c\u4daf\ubcb0\u72f1.class, var_5_69:\u5245\ube23\u647c\u4daf\ubcb0\u72f1[expected:\u9af2\u1833\u156b\u12cb\u7d52\u6c52])), p2:int))))
        }
        
        return:boolean(invokestatic:boolean(\u4c2b\uc2e8\u4492\ubefe\u99f7::\u946b\u0800\u7049\u3bc9\u3bc9\u9a18, p0:\u4f4a\uafe7\u76bc\u392e\ub8be[expected:\ube23\u67d0\u64f2\u839e\u76bc], p1:\ube23\u67d0\u64f2\u839e\u76bc))
    }
    
    public static boolean \u946b\u0800\u7049\u3bc9\u3bc9\u9a18(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_2_61 : int
        stack_B2_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-1250960577), ldc:int(-1250992193))
            
            if (cmpgt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])), f2d:double(add:float(mul:float(mul:float(mul:float(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u36d3\u4c2b\u839e\u071d\ua068\ud217, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), ldc:float(2.0f)), invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u36d3\u4c2b\u839e\u071d\ua068\ud217, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])), ldc:float(2.0f)), invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u36d3\u4c2b\u839e\u071d\ua068\ud217, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(896367550))
                stack_B2_0 = and:int(ldc:int(25609), ldc:int(-25610))
            }
            else {
                stack_B2_0 = and:int(ldc:int(8465), ldc:int(4165))
            }
            
            return:boolean(stack_B2_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static boolean \ube23\ua562\ubff1\uf94d\ufcaf\uc87f(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, double p2) {
        var_4_63 : int
        var_6_6F : Optional<\ube23\u67d0\u64f2\u839e\u76bc>
        var_4_7F : int
        stack_DC_0 : int [generated]
        
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
        var_4_63 = and:int(ldc:int(-1932068082), ldc:int(-2108523935))
        var_6_6F = invokevirtual:Optional<\ube23\u67d0\u64f2\u839e\u76bc>(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u836c\u8753\ub102\u9a18\uc910\u6fb0, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:\ube23\u67d0\u64f2\u839e\u76bc), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u9a18\ubf56\u9033\u759a\u4bc8\u6cfe))
        
        if (invokevirtual:boolean(Optional::isPresent, var_6_6F:Optional)) {
            var_4_7F = and:int(var_4_63:int, ldc:int(-166204919))
            
            if (cmple:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, invokevirtual:\ube23\u67d0\u64f2\u839e\u76bc(Optional<\ube23\u67d0\u64f2\u839e\u76bc>::get, var_6_6F:Optional<\ube23\u67d0\u64f2\u839e\u76bc>)))), mul:double(p2:double, p2:double)))) {
                var_4_7F = and:int(var_4_7F:int, ldc:int(-289625402))
                stack_DC_0 = and:int(ldc:int(-17928), ldc:int(17927))
            }
            else {
                stack_DC_0 = and:int(ldc:int(1153), ldc:int(18803))
            }
            
            return:boolean(stack_DC_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-15863), ldc:int(14534)))
    }
    
    public static boolean \u385b\ub32d\u71ae\u88c5\ub171\ub32d(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_2_61 : int
        var_4_66 : \ub32d\u92ff\uc2bd\ud36e\ud36e<?>
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
            var_2_61 = and:int(ldc:int(255089903), ldc:int(-272753059))
            var_4_66 = invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:\ube23\u67d0\u64f2\u839e\u76bc)
            
            if (invokevirtual:boolean(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\u6fb0\ud171\u67d0\u8aa5\uc2bd\u88c5, var_4_66:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<List<\ube23\u67d0\u64f2\u839e\u76bc>>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u759a\ub7dc\u4ab3\u8753\ufe34\u56bd))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-411648275))
                stack_A1_0 = invokeinterface:boolean[expected:int](List<E>::contains, checkcast:List<\ube23\u67d0\u64f2\u839e\u76bc>(java.util.List<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc>.class, invokevirtual:List<\ube23\u67d0\u64f2\u839e\u76bc>(Optional<List<\ube23\u67d0\u64f2\u839e\u76bc>>::get, invokevirtual:Optional<List<\ube23\u67d0\u64f2\u839e\u76bc>>(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u836c\u8753\ub102\u9a18\uc910\u6fb0, var_4_66:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<List<\ube23\u67d0\u64f2\u839e\u76bc>>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u759a\ub7dc\u4ab3\u8753\ufe34\u56bd)))), p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:Object])
            }
            else {
                stack_A1_0 = and:int(ldc:int(18861), ldc:int(-18862))
            }
            
            return:boolean(stack_A1_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc \uc2bd\u4179\u983f\u59ec\u9033\u0a06(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, java.util.Optional<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> p1, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p2) {
        var_3_61 : int
        stack_89_0 : \ube23\u67d0\u64f2\u839e\u76bc [generated]
        
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
            var_3_61 = and:int(ldc:int(733182633), ldc:int(808693753))
            
            if (invokevirtual:boolean(Optional::isPresent, p1:Optional)) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-14437490))
                stack_89_0 = invokestatic:\ube23\u67d0\u64f2\u839e\u76bc(\u4c2b\uc2e8\u4492\ubefe\u99f7::\u6ec6\uf995\u4d85\u7006\ub32d\ub32d, p0:\ube23\u67d0\u64f2\u839e\u76bc, checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, invokevirtual:\ube23\u67d0\u64f2\u839e\u76bc(Optional<\ube23\u67d0\u64f2\u839e\u76bc>::get, p1:Optional<\ube23\u67d0\u64f2\u839e\u76bc>)), p2:\ube23\u67d0\u64f2\u839e\u76bc)
            }
            else {
                stack_89_0 = p2:\ube23\u67d0\u64f2\u839e\u76bc
            }
            
            return:\ube23\u67d0\u64f2\u839e\u76bc(stack_89_0:\ube23\u67d0\u64f2\u839e\u76bc)
        }
        
        goto(Label_0006)
    }
    
    public static \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc \u6ec6\uf995\u4d85\u7006\ub32d\ub32d(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p2) {
        var_3_61 : int
        stack_93_0 : \ube23\u67d0\u64f2\u839e\u76bc [generated]
        
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
            var_3_61 = and:int(ldc:int(-1689851391), ldc:int(-621282477))
            
            if (cmpge:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7d52\u718f\u3776\u6fb0\ub83f::\u1187\uc9f6\u8258\u5bc4\u4cd9\u67e9, p2:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1675691439))
                stack_93_0 = p2:\ube23\u67d0\u64f2\u839e\u76bc
            }
            else {
                stack_93_0 = p1:\ube23\u67d0\u64f2\u839e\u76bc
            }
            
            return:\ube23\u67d0\u64f2\u839e\u76bc(stack_93_0:\ube23\u67d0\u64f2\u839e\u76bc)
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Optional<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> \u3bc9\u6bb9\u4ab3\ucfaf\u47c2\u8413(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\ud36e\u4bc8\u6d69\u92ee\ubb2b<java.util.UUID> p1) {
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
    
    public static java.util.stream.Stream<\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb> \u760c\ucef1\u3dd3\u3bd6\ub113\u0c95(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p0, java.util.function.Predicate<\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb> p1) {
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
    
    private static java.util.stream.Stream lambda$\u8413\u3a62\u8c8a\u40a9\u7e3f\u8c8a$7(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p0, java.util.function.Predicate p1, java.util.List p2) {
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
    
    private static \ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb lambda$\u3e75\ub171\u7330\u6b0d\u759a\u965f$6(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:\u8d90\u927d\u7d52\uf94d\u12cb(checkcast:\u8d90\u927d\u7d52\uf94d\u12cb(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb.class, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u8d90\u927d\u7d52\uf94d\u12cb]))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ua61f\u120d\ub171\u7bad\u927d\u4492$5(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_2_61 : int
        stack_96_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(1047474048), ldc:int(-1216414054))
            
            if (logicaland:boolean(instanceof:boolean(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb.class, p1:\ube23\u67d0\u64f2\u839e\u76bc), cmpne:boolean(p1:\ube23\u67d0\u64f2\u839e\u76bc, p0:\u8d90\u927d\u7d52\uf94d\u12cb[expected:\ube23\u67d0\u64f2\u839e\u76bc]))) {
                stack_96_0 = and:int(ldc:int(17), ldc:int(2721))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(1023098827))
                stack_96_0 = and:int(ldc:int(-26885), ldc:int(26884))
            }
            
            return:boolean(stack_96_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc lambda$\ua562\u946b\u983f\ub1b9\uc2e8\u76bc$4(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, java.util.UUID p1) {
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
            return:\ube23\u67d0\u64f2\u839e\u76bc(checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\ube23\u67d0\u64f2\u839e\u76bc](\ube23\uc238\u5140\u4cd9\u8aa5::\u3d64\u4daf\ud36e\u8d98\u927d\u6ec6, checkcast:\ube23\uc238\u5140\u4cd9\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5.class, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\ube23\uc238\u5140\u4cd9\u8aa5](\ube23\u67d0\u64f2\u839e\u76bc::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:\ube23\u67d0\u64f2\u839e\u76bc)), p1:UUID)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u385b\u8308\u5140\u4ab3\uc2bd\u59ec$3(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, int p1, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ubefe\u8640\u183a\u6ec6\u93a2 p2) {
        var_3_61 : int
        stack_8C_0 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(1581722202), ldc:int(-270068897))
            
            if (cmpge:boolean(invokevirtual:int(\ube23\uc238\u5140\u4cd9\u8aa5::\u92ff\u8c8a\u183a\uc9f6\ub18d\u61a4, p0:\ube23\uc238\u5140\u4cd9\u8aa5, p2:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2), p1:int)) {
                var_3_61 = and:int(var_3_61:int, ldc:int(2126768721))
                stack_8C_0 = and:int(ldc:int(3470), ldc:int(-28080))
            }
            else {
                stack_8C_0 = and:int(ldc:int(10241), ldc:int(5125))
            }
            
            return:boolean(stack_8C_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u600f\ubf56\u527a\ud217\u3711\u97b7$2(\u36d3\u9033\u6b0d\u983f\u8d90.\ub32d\u92ff\uc2bd\ud36e\ud36e p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
            return:boolean(invokestatic:boolean(\u4c2b\uc2e8\u4492\ubefe\u99f7::\u385b\u4c2b\u4d85\u6b5f\ud171\uc9f6, p0:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>, p1:\ube23\u67d0\u64f2\u839e\u76bc))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u4f4a\uc238\u64f2\u72f1\u4c04\u836c$1(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_2_61 : int
        stack_8B_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-1727296395), ldc:int(-896580163))
            
            if (cmpne:boolean(invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), p0:\u9255\u0c95\u4cd9\ube23\u760c<?>)) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1908775451))
                stack_8B_0 = and:int(ldc:int(-24693), ldc:int(24692))
            }
            else {
                stack_8B_0 = xor:int(ldc:int(-24556), ldc:int(-24555))
            }
            
            return:boolean(stack_8B_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8df4\u2dcc\u4975\u6d99\u2dcc\u9af2$0(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, java.util.List p1) {
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
            return:boolean(invokeinterface:boolean(List::contains, p1:List, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:Object]))
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
    
    public void \ud523\u0c95\u7330\uae87\ub8be\u392e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6F0 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6FB : int
        
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
        var_3_6F0 = and:int(ldc:int(-18662958), ldc:int(-1074119816))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4c2b\uc2e8\u4492\ubefe\u99f7[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(64)), ldc:int(0))) {
            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1717227121))
        }
        else {
            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1159564322))
            var_5_8A = and:int(ldc:int(-3244), ldc:int(2219))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-22051), ldc:int(22050)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6F0:int, ldc:int(-72941577))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(-32256), ldc:int(-32255)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(5891), ldc:int(45)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6F0 = and:int(var_3_E3:int, ldc:int(-557942951))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(8329), ldc:int(8328)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(981829631))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1676547408))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(619568997))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1579578308))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(878836401))
                    }
                    else {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1618741900))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-912329029))
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1783485331))
                        goto(Label_1479)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1769302311))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-217851886))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(16384)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-538742286))
                            var_11_F4 = and:int(ldc:int(-21713), ldc:int(5328))
                            goto(Label_1625)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0595:
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1927154697))
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1068300098))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(725954306))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1631327777))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-728281497))
                            loopcontinue()
                        }
                        
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1095829542))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1018814893))
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1283009704))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-65155961))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1165609517))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1889294397))
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1908112589))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1067777737))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(2140766208))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(117946511))
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1481597557))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-21236905))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(513), ldc:int(512))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1402800622))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(541687613))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1312892641))
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1620459140))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1075397761))
                        var_11_F4 = and:int(ldc:int(249), ldc:int(-250))
                    }
                    
                    Label_1155:
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1129710335))
                        goto(Label_1636)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1992443103))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-382404315))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-275004234))
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(283732854))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-871708648))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1072144895))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1807306101))
                            loopcontinue()
                        }
                        
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1632487437))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1479)
                            }
                        }
                    }
                    
                    Label_1316:
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(865226128))
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1300703909))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-2086501345))
                            goto(Label_1155)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1843791562))
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-87182300))
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-2025783290))
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-534845478))
                            loopcontinue()
                        }
                        
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1394346))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1625)
                    }
                    
                    Label_1479:
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1636)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-204335072))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(433907824))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-902726758))
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-2091464301))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-76556365))
                        loopcontinue()
                    }
                    
                    var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1695583779))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1625:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6FB = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1636:
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-806594806))
                        goto(Label_1479)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-427721789))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(2137416037))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1096285600))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(1471792923))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1861243209))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6F0:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1145372847))
                        var_17_6FB = add:int(var_16_122:int, xor:int(ldc:int(-21504), ldc:int(-21503)))
                        looporswitchbreak()
                    }
                    
                    var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1906116872))
                }
                
                var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1092128271))
                
                if (cmple:boolean(var_5_8A = var_17_6FB:int, sub:int(var_6_91:int, and:int(ldc:int(8243), ldc:int(641))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6F0:int, ldc:int(16)), ldc:int(0))) {
            var_3_6F0 = and:int(var_3_6F0:int, ldc:int(-1159522579))
            goto(Label_0108)
        }
    }
}
