public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\uc246\ud158\u99f7\u64f2\u5f50\u6c52 {
    public void \uc246\ud158\u99f7\u64f2\u5f50\u6c52(com.mojang.serialization.Codec<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3776\u8df4\u7af6\uc31c\u5f50\u47c2> p0) {
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
            invokespecial:\u93a2\u1187\u5654\u8413\u3a62\ua61f<\u3776\u8df4\u7af6\uc31c\u5f50\u47c2>(\u93a2\u1187\u5654\u8413\u3a62\ua61f<\u3776\u8df4\u7af6\uc31c\u5f50\u47c2>::<init>, this:\uc246\ud158\u99f7\u64f2\u5f50\u6c52[expected:\u93a2\u1187\u5654\u8413\u3a62\ua61f<\u3776\u8df4\u7af6\uc31c\u5f50\u47c2>], p0:Codec<\u3776\u8df4\u7af6\uc31c\u5f50\u47c2>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \ua6bd\ud51e\u0b8e\u0c95\u3c25\u718f(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u527a\u8aa5\u34df\u7d52\u7e3f p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
    
    private static boolean \u7e3f\u5bc4\u62da\u5bc4\u4bc8\u183a(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u527a\u8aa5\u34df\u7d52\u7e3f p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
    
    private static boolean \u416d\u8709\u600f\u8bb0\u0800\u6c52(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u527a\u8aa5\u34df\u7d52\u7e3f p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
    
    public static boolean \ub18d\u5db4\uf94d\u7bad\u965f\uf995(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u527a\u8aa5\u34df\u7d52\u7e3f p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
    
    private static boolean \u6c56\u34df\u97e6\u3c25\u64ab\uf995(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u527a\u8aa5\u34df\u7d52\u7e3f p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
    
    private static boolean \u67d0\u74b1\ub18d\u600f\u59ec\ud51e(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u527a\u8aa5\u34df\u7d52\u7e3f p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
    
    public static void \u6ec6\u71ae\u7e3f\u40a9\u0800\ubf56(\u5d20\u7043\u88c5\u5db4\uf94d.\u72f1\u7ce1\ucef1\ub83f\u516c p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2) {
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
            invokeinterface:boolean(\u72f1\u7ce1\ucef1\ub83f\u516c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, p0:\u72f1\u7ce1\ucef1\ub83f\u516c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, ldc:int(19))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u64ab\u5140\u6b5f\u98a4\u71f1\u946b(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u527a\u8aa5\u34df\u7d52\u7e3f p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
        stack_AC_0 : int [generated]
        
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
            
            if (logicalnot:boolean(invokestatic:boolean(\uc246\ud158\u99f7\u64f2\u5f50\u6c52::\ub18d\u5db4\uf94d\u7bad\u965f\uf995, p0:\u527a\u8aa5\u34df\u7d52\u7e3f, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                if (logicalnot:boolean(invokestatic:boolean(\uc246\ud158\u99f7\u64f2\u5f50\u6c52::\u67d0\u74b1\ub18d\u600f\u59ec\ud51e, p0:\u527a\u8aa5\u34df\u7d52\u7e3f, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                    if (logicalnot:boolean(invokestatic:boolean(\uc246\ud158\u99f7\u64f2\u5f50\u6c52::\u416d\u8709\u600f\u8bb0\u0800\u6c52, p0:\u527a\u8aa5\u34df\u7d52\u7e3f, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                        stack_AC_0 = and:int[expected:boolean](ldc:int(10416), ldc:int(-26801))
                        return:boolean(stack_AC_0:boolean)
                    }
                }
            }
            
            stack_AC_0 = and:int[expected:boolean](ldc:int(13017), ldc:int(1))
            return:boolean(stack_AC_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private boolean \u7006\u1833\u6c56\u8709\u624e\u6ec6(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u6d69\u946b\u97e6\u6b5f p0, java.util.Random p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, java.util.Set<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> p3, java.util.Set<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> p4, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p5, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3776\u8df4\u7af6\uc31c\u5f50\u47c2 p6) {
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
    
    private int \u624e\u34df\ucb79\u8aa5\uafe7\uc2e8(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u527a\u8aa5\u34df\u7d52\u7e3f p0, int p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3776\u8df4\u7af6\uc31c\u5f50\u47c2 p3) {
        var_5_10F : int
        var_7_6C : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        var_8_75 : int
        var_9_C2 : int
        var_10_C7 : int
        var_11_FE : int
        
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
        var_5_10F = and:int(ldc:int(2097381963), ldc:int(-4477073))
        var_7_6C = initobject:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::<init>)
        var_8_75 = and:int(ldc:int(-22615), ldc:int(22614))
        
        loop {
            Label_0119:
            
            if (cmpeq:boolean(and:int(var_5_10F:int, ldc:int(8388608)), ldc:int(0))) {
                var_5_10F = and:int(var_5_10F:int, ldc:int(1028603598))
                
                if (cmple:boolean(var_8_75:int, add:int(p1:int, xor:int(ldc:int(40), ldc:int(41))))) {
                    var_9_C2 = invokevirtual:int(\ubf56\u7e3f\u7049\ubff1\u0800::\u59ec\u88c5\u69d9\u839e\u6cfe\u7e3f, getfield:\ubf56\u7e3f\u7049\ubff1\u0800(\u3776\u8df4\u7af6\uc31c\u5f50\u47c2::\u12cb\u8308\ub70c\u8c8a\ufe34\u446c, p3:\u3776\u8df4\u7af6\uc31c\u5f50\u47c2), p1:int, var_8_75:int)
                    var_10_C7 = neg:int(var_9_C2:int)
                    
                    loop {
                        Label_0201:
                        
                        if (cmpne:boolean(and:int(var_5_10F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_5_10F = and:int(var_5_10F:int, ldc:int(2139303914))
                            
                            if (cmple:boolean(var_10_C7:int, var_9_C2:int)) {
                                var_11_FE = neg:int(var_9_C2:int)
                                
                                loop {
                                    if (cmpeq:boolean(and:int(var_5_10F:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_5_10F = and:int(var_5_10F:int, ldc:int(-563862251))
                                        goto(Label_0378)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_5_10F:int, ldc:int(67108864)), ldc:int(0))) {
                                        var_5_10F = and:int(var_5_10F:int, ldc:int(-953693480))
                                    }
                                    else {
                                        var_5_10F = and:int(var_5_10F:int, ldc:int(-40680886))
                                        
                                        if (cmple:boolean(var_11_FE:int, var_9_C2:int)) {
                                            invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u0a06\u12b2\uc2bd\ufe34\u760c\u47c2, var_7_6C:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], var_10_C7:int, var_8_75:int, var_11_FE:int)
                                            
                                            if (logicalnot:boolean(invokestatic:boolean(\uc246\ud158\u99f7\u64f2\u5f50\u6c52::\ua6bd\ud51e\u0b8e\u0c95\u3c25\u718f, p0:\u527a\u8aa5\u34df\u7d52\u7e3f, var_7_6C:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56]))) {
                                                goto(Label_0378)
                                            }
                                            
                                            if (logicaland:boolean(logicalnot:boolean(getfield:boolean(\u3776\u8df4\u7af6\uc31c\u5f50\u47c2::\u6198\u4cd9\ubcb0\u759a\ub8be\u34df, p3:\u3776\u8df4\u7af6\uc31c\u5f50\u47c2)), invokestatic:boolean(\uc246\ud158\u99f7\u64f2\u5f50\u6c52::\u7e3f\u5bc4\u62da\u5bc4\u4bc8\u183a, p0:\u527a\u8aa5\u34df\u7d52\u7e3f, var_7_6C:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56]))) {
                                                goto(Label_0378)
                                            }
                                            
                                            var_5_10F = and:int(var_5_10F:int, ldc:int(-1113861617))
                                            inc:int(var_11_FE, ldc:int(1))
                                            loopcontinue()
                                        }
                                    }
                                    
                                    Label_0311:
                                    
                                    if (cmpeq:boolean(and:int(var_5_10F:int, ldc:int(2)), ldc:int(0))) {
                                        var_5_10F = and:int(var_5_10F:int, ldc:int(1874110999))
                                    }
                                    else {
                                        if (cmpeq:boolean(and:int(var_5_10F:int, ldc:int(8388608)), ldc:int(0))) {
                                            var_5_10F = and:int(var_5_10F:int, ldc:int(1030199994))
                                            inc:int(var_10_C7, ldc:int(1))
                                            loopcontinue(Label_0201)
                                        }
                                        
                                        loopcontinue()
                                    }
                                    
                                    Label_0378:
                                    
                                    if (cmpeq:boolean(and:int(var_5_10F:int, ldc:int(536870912)), ldc:int(0))) {
                                        var_5_10F = and:int(var_5_10F:int, ldc:int(-701556136))
                                        goto(Label_0311)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_5_10F:int, ldc:int(2048)), ldc:int(0))) {
                                        return:int(sub:int(var_8_75:int, xor:int(ldc:int(17160), ldc:int(17162))))
                                    }
                                    
                                    var_5_10F = and:int(var_5_10F:int, ldc:int(1939462817))
                                }
                            }
                        }
                        
                        if (cmpeq:boolean(and:int(var_5_10F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_5_10F = and:int(var_5_10F:int, ldc:int(-3944774))
                            inc:int(var_8_75, ldc:int(1))
                            loopcontinue(Label_0119)
                        }
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_5_10F:int, ldc:int(8)), ldc:int(0))) {
                return:int(p1:int)
            }
            
            var_5_10F = and:int(var_5_10F:int, ldc:int(-351189180))
        }
    }
    
    public void \u8413\u7af6\u839e\u8308\ub18d\u6198(\u5d20\u7043\u88c5\u5db4\uf94d.\u72f1\u7ce1\ucef1\ub83f\u516c p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2) {
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
            invokestatic:void(\uc246\ud158\u99f7\u64f2\u5f50\u6c52::\u6ec6\u71ae\u7e3f\u40a9\u0800\ubf56, p0:\u72f1\u7ce1\ucef1\ub83f\u516c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public final boolean \uc7fe\u416d\u4179\ub7dc\u6fb0\u4f4a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u183a\uafe7\u74b1\u62da\u71f1\uc2bd p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.Random p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3776\u8df4\u7af6\uc31c\u5f50\u47c2 p4) {
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
    
    private \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u6bb9\u120d\u99f7\u3bd6\u4bc8\u836c \u6b0d\u527a\ub6ab\u16f6\uae87\u6cfe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd p0, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p1, java.util.Set<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> p2, java.util.Set<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56> p3) {
        var_5_63 : int
        var_7_68 : ArrayList
        var_8_7D : \u8cae\u071d\u4492\u5245\uc4d2\ufcaf
        var_10_8A : int
        var_5_FD : int
        var_10_BC : \u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a
        var_11_C6 : Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_12_119 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_5_1CE : int
        var_13_1D3 : \u760c\u4975\u4179\uc246\u8640\u64f2[]
        var_14_1D8 : int
        var_15_1E1 : int
        var_17_266 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_5_34B : int
        var_11_1A1 : int
        var_12_323 : HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_13_331 : HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>
        var_14_33A : Iterator<Object>
        var_15_37B : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_5_38C : int
        var_16_391 : \u760c\u4975\u4179\uc246\u8640\u64f2[]
        var_17_396 : int
        var_18_39F : int
        var_20_438 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
            var_5_63 = and:int(ldc:int(1332011577), ldc:int(-805479821))
            var_7_68 = invokestatic:ArrayList(Lists::newArrayList)
            var_8_7D = initobject:\u8cae\u071d\u4492\u5245\uc4d2\ufcaf(\u8cae\u071d\u4492\u5245\uc4d2\ufcaf::<init>, invokevirtual:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u4d85\u34df\u4bc8\u72f1\ubded\ub7dc, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), invokevirtual:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u64f2\ub1b9\uae5d\u3c25\uc4d2\u8389, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6), invokevirtual:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\uc9f6\ub83f\u7330\ufe34\u8258\ucfaf, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6))
            var_10_8A = and:int(ldc:int(4805), ldc:int(-4808))
            
            loop {
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(33554432)), ldc:int(0))) {
                    var_5_63 = and:int(var_5_63:int, ldc:int(1331445427))
                    
                    if (cmplt:boolean(var_10_8A:int, ldc:int(6))) {
                        invokeinterface:boolean(List<HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>>::add, var_7_68:ArrayList<HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>>[expected:List<HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>>], invokestatic:HashSet(Sets::newHashSet))
                        inc:int(var_10_8A, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_5_63:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_5_FD = and:int(var_5_63:int, ldc:int(-538538185))
            var_10_BC = initobject:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::<init>)
            var_11_C6 = invokevirtual:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(ArrayList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::iterator, invokestatic:ArrayList(Lists::newArrayList, p3:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Iterable]))
            
            loop {
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_11_C6:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)) {
                    var_12_119 = checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_11_C6:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\uc29a\u4f52\u93a2\u8753\u51b2\u16f6, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, var_12_119:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))) {
                        goto(Label_0292)
                    }
                    
                    invokevirtual:void(\u6bb9\u120d\u99f7\u3bd6\u4bc8\u836c::\u7e3f\u446c\u965f\u6435\u4c2b\u92ee, var_8_7D:\u8cae\u071d\u4492\u5245\uc4d2\ufcaf[expected:\u6bb9\u120d\u99f7\u3bd6\u4bc8\u836c], sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_12_119:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_12_119:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_12_119:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), xor:int[expected:boolean](ldc:int(5250), ldc:int(5251)), xor:int[expected:boolean](ldc:int(9234), ldc:int(9235)))
                    goto(Label_0292)
                }
                
                Label_0238:
                
                if (cmpne:boolean(and:int(var_5_FD:int, ldc:int(32)), ldc:int(0))) {
                    var_5_FD = and:int(var_5_FD:int, ldc:int(-553251205))
                    var_11_C6 = invokevirtual:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(ArrayList<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::iterator, invokestatic:ArrayList(Lists::newArrayList, p2:Set[expected:Iterable]))
                    goto(Label_0372)
                }
                
                goto(Label_0382)
                Label_0292:
                
                if (cmpne:boolean(and:int(var_5_FD:int, ldc:int(134217728)), ldc:int(0))) {
                    var_5_FD = and:int(var_5_FD:int, ldc:int(-808599949))
                    loopcontinue()
                }
                
                goto(Label_0447)
                Label_0372:
                
                if (invokeinterface:boolean(Iterator::hasNext, var_11_C6:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>)) {
                    var_12_119 = checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_11_C6:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\uc29a\u4f52\u93a2\u8753\u51b2\u16f6, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, var_12_119:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))) {
                        goto(Label_0447)
                    }
                    
                    invokevirtual:void(\u6bb9\u120d\u99f7\u3bd6\u4bc8\u836c::\u7e3f\u446c\u965f\u6435\u4c2b\u92ee, var_8_7D:\u8cae\u071d\u4492\u5245\uc4d2\ufcaf[expected:\u6bb9\u120d\u99f7\u3bd6\u4bc8\u836c], sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_12_119:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_12_119:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_12_119:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), xor:int[expected:boolean](ldc:int(33), ldc:int(32)), xor:int[expected:boolean](ldc:int(9216), ldc:int(9217)))
                    goto(Label_0447)
                }
                
                Label_0382:
                
                if (cmpeq:boolean(and:int(var_5_FD:int, ldc:int(134217728)), ldc:int(0))) {
                    var_5_FD = and:int(var_5_FD:int, ldc:int(-1603394901))
                    goto(Label_0238)
                }
                
                looporswitchbreak()
                Label_0447:
                
                if (cmpne:boolean(and:int(var_5_FD:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_5_1CE = and:int(var_5_FD:int, ldc:int(1594309311))
                    var_13_1D3 = invokestatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u760c\u4975\u4179\uc246\u8640\u64f2::values)
                    var_14_1D8 = arraylength:int(var_13_1D3:\u760c\u4975\u4179\uc246\u8640\u64f2[])
                    var_15_1E1 = and:int(ldc:int(-13480), ldc:int(9383))
                    
                    while (cmplt:boolean(var_15_1E1:int, var_14_1D8:int)) {
                        invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u873d\ub113\uff55\u16f6\u0800\ucb79, var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_12_119:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], loadelement:\u760c\u4975\u4179\uc246\u8640\u64f2(var_13_1D3:\u760c\u4975\u4179\uc246\u8640\u64f2[], var_15_1E1:int))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Set::contains, p2:Set, var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:Object]))) {
                            var_17_266 = invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p0:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4], var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])
                            
                            if (invokevirtual:boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, Object>::\ud158\u4179\u4492\u0800\u416d\u927d, var_17_266:\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, Object>, getstatic:\u4c04\u12b2\u6c56\uc2bd\u647c\uc84e[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\u0a06\u960f\uf94d\u64ab\ub102\u071d))) {
                                invokeinterface:boolean(Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, checkcast:HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>](java.util.HashSet<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>.class, invokeinterface:HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(List<HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>>::get, var_7_68:ArrayList<HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>>[expected:List<HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>>], and:int(ldc:int(2635), ldc:int(-3660)))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u183a\u647c\u71f1\u6435\u6c52\u8df4, var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a))
                                invokestatic:void(\uc246\ud158\u99f7\u64f2\u5f50\u6c52::\u6ec6\u71ae\u7e3f\u40a9\u0800\ubf56, p0:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u72f1\u7ce1\ucef1\ub83f\u516c], var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56], checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, var_17_266:\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, getstatic:\u4c04\u12b2\u6c56\uc2bd\u647c\uc84e[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\u0a06\u960f\uf94d\u64ab\ub102\u071d), invokestatic:Integer(Integer::valueOf, xor:int(ldc:int(66), ldc:int(67))))))
                                
                                if (invokevirtual:boolean(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\uc29a\u4f52\u93a2\u8753\u51b2\u16f6, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])) {
                                    invokevirtual:void(\u6bb9\u120d\u99f7\u3bd6\u4bc8\u836c::\u7e3f\u446c\u965f\u6435\u4c2b\u92ee, var_8_7D:\u8cae\u071d\u4492\u5245\uc4d2\ufcaf[expected:\u6bb9\u120d\u99f7\u3bd6\u4bc8\u836c], sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), xor:int[expected:boolean](ldc:int(8200), ldc:int(8201)), xor:int[expected:boolean](ldc:int(16521), ldc:int(16520)))
                                }
                            }
                        }
                        
                        inc:int(var_15_1E1, ldc:int(1))
                    }
                    
                    var_5_FD = and:int(var_5_1CE:int, ldc:int(-279609667))
                    goto(Label_0372)
                }
                
                goto(Label_0292)
            }
            
            var_5_34B = and:int(var_5_FD:int, ldc:int(2143068795))
            var_11_1A1 = and:int(ldc:int(24737), ldc:int(17))
            
            while (cmplt:boolean(var_11_1A1:int, ldc:int(6))) {
                var_12_323 = checkcast:HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(java.util.HashSet<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>.class, invokeinterface:HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(List<HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>>::get, var_7_68:ArrayList<HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>>[expected:List<HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>>], sub:int(var_11_1A1:int, and:int(ldc:int(3603), ldc:int(20493)))))
                var_13_331 = checkcast:HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(java.util.HashSet<\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>.class, invokeinterface:HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(List<HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>>::get, var_7_68:ArrayList<HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>>[expected:List<HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>>], var_11_1A1:int))
                var_14_33A = invokeinterface:Iterator<Object>(Set<Object>::iterator, var_12_323:Set<Object>)
                
                loop {
                    if (cmpne:boolean(and:int(var_5_34B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_5_34B = and:int(var_5_34B:int, ldc:int(-810778761))
                        
                        if (invokeinterface:boolean(Iterator::hasNext, var_14_33A:Iterator)) {
                            var_15_37B = checkcast:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56.class, invokeinterface:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::next, var_14_33A:Iterator<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>))
                            
                            if (invokevirtual:boolean(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\uc29a\u4f52\u93a2\u8753\u51b2\u16f6, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, var_15_37B:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])) {
                                invokevirtual:void(\u6bb9\u120d\u99f7\u3bd6\u4bc8\u836c::\u7e3f\u446c\u965f\u6435\u4c2b\u92ee, var_8_7D:\u8cae\u071d\u4492\u5245\uc4d2\ufcaf[expected:\u6bb9\u120d\u99f7\u3bd6\u4bc8\u836c], sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_15_37B:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_15_37B:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_15_37B:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), and:int[expected:boolean](ldc:int(291), ldc:int(8329)), xor:int[expected:boolean](ldc:int(1049), ldc:int(1048)))
                            }
                            
                            var_5_38C = and:int(var_5_34B:int, ldc:int(1326310327))
                            var_16_391 = invokestatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u760c\u4975\u4179\uc246\u8640\u64f2::values)
                            var_17_396 = arraylength:int(var_16_391:\u760c\u4975\u4179\uc246\u8640\u64f2[])
                            var_18_39F = and:int(ldc:int(-23078), ldc:int(6692))
                            
                            while (cmplt:boolean(var_18_39F:int, var_17_396:int)) {
                                invokevirtual:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u873d\ub113\uff55\u16f6\u0800\ucb79, var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a, var_15_37B:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], loadelement:\u760c\u4975\u4179\uc246\u8640\u64f2(var_16_391:\u760c\u4975\u4179\uc246\u8640\u64f2[], var_18_39F:int))
                                
                                if (logicalnot:boolean(invokeinterface:boolean(Set<E>::contains, var_12_323:HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>], var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:Object]))) {
                                    if (logicalnot:boolean(invokeinterface:boolean(Set<E>::contains, var_13_331:HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>], var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:Object]))) {
                                        var_20_438 = invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p0:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4], var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56])
                                        
                                        if (invokevirtual:boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, Object>::\ud158\u4179\u4492\u0800\u416d\u927d, var_20_438:\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, Object>, getstatic:\u4c04\u12b2\u6c56\uc2bd\u647c\uc84e[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\u0a06\u960f\uf94d\u64ab\ub102\u071d))) {
                                            if (cmpgt:boolean(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, var_20_438:\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, getstatic:\u4c04\u12b2\u6c56\uc2bd\u647c\uc84e[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Integer>](\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\u0a06\u960f\uf94d\u64ab\ub102\u071d)))), add:int(var_11_1A1:int, xor:int(ldc:int(2210), ldc:int(2211))))) {
                                                invokestatic:void(\uc246\ud158\u99f7\u64f2\u5f50\u6c52::\u6ec6\u71ae\u7e3f\u40a9\u0800\ubf56, p0:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u72f1\u7ce1\ucef1\ub83f\u516c], var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56], checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, var_20_438:\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, getstatic:\u4c04\u12b2\u6c56\uc2bd\u647c\uc84e[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\u0a06\u960f\uf94d\u64ab\ub102\u071d), invokestatic:Integer(Integer::valueOf, add:int(var_11_1A1:int, and:int(ldc:int(2699), ldc:int(1297)))))))
                                                
                                                if (invokevirtual:boolean(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\uc29a\u4f52\u93a2\u8753\u51b2\u16f6, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])) {
                                                    invokevirtual:void(\u6bb9\u120d\u99f7\u3bd6\u4bc8\u836c::\u7e3f\u446c\u965f\u6435\u4c2b\u92ee, var_8_7D:\u8cae\u071d\u4492\u5245\uc4d2\ufcaf[expected:\u6bb9\u120d\u99f7\u3bd6\u4bc8\u836c], sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u0800\ub18d\u64ab\u36d3\u8bb0\u2dcc, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u8bb0\u12b2\u8753\u7e3f\uceb8\ua6bd, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), getfield:int(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\u1833\u5f50\u93a2\uc246\u9255\u759a, p1:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)), and:int[expected:boolean](ldc:int(28819), ldc:int(1033)), and:int[expected:boolean](ldc:int(18465), ldc:int(9091)))
                                                }
                                                
                                                invokeinterface:boolean(Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>::add, var_13_331:HashSet<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>[expected:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a::\u183a\u647c\u71f1\u6435\u6c52\u8df4, var_10_BC:\u4492\u3e2a\u8df4\u7e3f\ud36e\u3e2a))
                                            }
                                        }
                                    }
                                }
                                
                                inc:int(var_18_39F, ldc:int(1))
                            }
                            
                            var_5_34B = and:int(var_5_38C:int, ldc:int(-819669451))
                            loopcontinue()
                        }
                    }
                    
                    if (cmpne:boolean(and:int(var_5_34B:int, ldc:int(1)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_5_34B = and:int(var_5_34B:int, ldc:int(1878844083))
                inc:int(var_11_1A1, ldc:int(1))
            }
            
            return:\u6bb9\u120d\u99f7\u3bd6\u4bc8\u836c(var_8_7D:\u8cae\u071d\u4492\u5245\uc4d2\ufcaf[expected:\u6bb9\u120d\u99f7\u3bd6\u4bc8\u836c])
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc7fe\u416d\u4179\ub7dc\u6fb0\u4f4a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u183a\uafe7\u74b1\u62da\u71f1\uc2bd p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p1, java.util.Random p2, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p3, \u6b0d\u12cb\u156b\u4179\u8bb0.\ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6 p4) {
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
            return:boolean(invokevirtual:boolean(\uc246\ud158\u99f7\u64f2\u5f50\u6c52::\uc7fe\u416d\u4179\ub7dc\u6fb0\u4f4a, this:\uc246\ud158\u99f7\u64f2\u5f50\u6c52, p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p1:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0, p2:Random, p3:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, checkcast:\u3776\u8df4\u7af6\uc31c\u5f50\u47c2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3776\u8df4\u7af6\uc31c\u5f50\u47c2.class, p4:\ub8be\u7e3f\uc29a\u9af2\u3bd6\u16f6[expected:\u3776\u8df4\u7af6\uc31c\u5f50\u47c2])))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u93a2\u8c8a\u59ec\u51fa\u8709\u9033$7(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u183a\uafe7\u74b1\u62da\u71f1\uc2bd p0, java.util.Random p1, java.util.List p2, java.util.List p3, java.util.Set p4, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p5, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u3e2a\u69d9\ub7dc\u446c\u97e6\u2dcc p6) {
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
            invokevirtual:void(\u3e2a\u69d9\ub7dc\u446c\u97e6\u2dcc::\ub32d\u6435\u7bad\u5654\u416d\ufe34, p6:\u3e2a\u69d9\ub7dc\u446c\u97e6\u2dcc, p0:\u183a\uafe7\u74b1\u62da\u71f1\uc2bd, p1:Random, p2:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>, p3:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>, p4:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>, p5:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u64ab\u74b1\uc29a\u1187\u7af6\u983f$6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3776\u8df4\u7af6\uc31c\u5f50\u47c2 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u6d69\u946b\u97e6\u6b5f p1, java.util.Random p2, int p3, int p4, int p5, java.util.Set p6, \u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p7, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u516c\u5fe1\u8c8a\u9255\ubb2b p8) {
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
            invokevirtual:void(\u4179\u4daf\u3d64\u56bd\u4975::\u120d\u92ee\u9937\u6c52\u93a2\u647c, getfield:\u4179\u4daf\u3d64\u56bd\u4975(\u3776\u8df4\u7af6\uc31c\u5f50\u47c2::\u983f\u6198\u624e\ub171\ua6bd\u6d99, p0:\u3776\u8df4\u7af6\uc31c\u5f50\u47c2), p1:\ucef1\u6d69\u946b\u97e6\u6b5f, p2:Random, p0:\u3776\u8df4\u7af6\uc31c\u5f50\u47c2, p3:int, p8:\u516c\u5fe1\u8c8a\u9255\ubb2b, p4:int, p5:int, p6:Set<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>, p7:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u62da\ub113\u12cb\ub19c\u5bc4\u12b2$5(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
        var_1_61 : int
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
            var_1_61 = and:int(ldc:int(1488278746), ldc:int(-717888033))
            
            if (cmpne:boolean(invokevirtual:\u4daf\u4f52\u8d98\u6435\u7bad\u9af2(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u6b5f\u4bc8\uae5d\u385b\u6d99\u6198, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]), getstatic:\u4daf\u4f52\u8d98\u6435\u7bad\u9af2(\u4daf\u4f52\u8d98\u6435\u7bad\u9af2::\u93a2\u5140\u2dcc\ud171\u836c\u6d69))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-755610114))
                stack_8F_0 = and:int(ldc:int(-4930), ldc:int(4929))
            }
            else {
                stack_8F_0 = and:int(ldc:int(23075), ldc:int(8321))
            }
            
            return:boolean(stack_8F_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u5fe1\u8709\u76bc\u47c2\ub102\u3c25$4(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
        var_3_66 : \ub1b9\u8cae\u7d52\u759a\u3e2a\u527a
        
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
            var_3_66 = invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])
            return:boolean(ternaryop:int(logicaland:boolean(logicalnot:boolean(invokestatic:boolean(\u93a2\u1187\u5654\u8413\u3a62\ua61f<FC>::\u76bc\u6d99\uc84e\u7af6\u6b5f\ud158, var_3_66:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)), cmpne:boolean(var_3_66:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u927d\u7049\u3711\u9033\uc31c\u64ab))), and:int(ldc:int(-4151), ldc:int(4150)), and:int(ldc:int(9033), ldc:int(16533))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ud51e\uc84e\u69d9\u3776\uf9c5\u7d52$3(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
            return:boolean(ternaryop:int[expected:boolean](logicalor:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]), invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>](\u69d9\u7bad\u8709\u9937\u446c\u67d0::\ub19c\uc2e8\u7af6\u4bc8\u7049\u3504))), xor:int(ldc:int(8448), ldc:int(8449)), and:int(ldc:int(-19473), ldc:int(19472))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uc31c\u071d\u0b8e\u5654\uf9c5\u52d3$2(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
            return:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8aa5\u4179\u946b\u4c04\uae5d\u8389)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u6cfe\u8389\u718f\u8c8a\u3dd3\ub83f$1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
            return:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8350\u88c5\ub8be\u1187\ua562\u600f)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u7bad\u5f50\u6fb0\u0a06\u2dcc\u120d$0(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
            return:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\uc29a\u8350\u8bb0\u4cd9\u51fa\u839e<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u99f7\u8d90\u97b7\uf94d\u392e\u3dd3<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>](\u69d9\u7bad\u8709\u9937\u446c\u67d0::\u5140\u62da\ud523\u4d85\uf9c5\ua068)))
        }
        
        goto(Label_0006)
    }
    
    public void \u5bc4\ub18d\u5140\ucfaf\u392e\u1833(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_653 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_65E : int
        
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
        var_3_653 = and:int(ldc:int(1295512834), ldc:int(-294130714))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc246\ud158\u99f7\u64f2\u5f50\u6c52[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
            var_3_653 = and:int(var_3_653:int, ldc:int(-21105593))
            var_5_80 = and:int(ldc:int(26697), ldc:int(-26698))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10255), ldc:int(-26640)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_653:int, ldc:int(-17827862))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, xor:int(ldc:int(4872), ldc:int(4873)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, xor:int(ldc:int(3140), ldc:int(3141)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_653 = and:int(var_3_D0:int, ldc:int(1579546951))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(16705), ldc:int(2201)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-206070728))
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1362339842))
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1141637275))
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-237121730))
                        goto(Label_0685)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0561)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1584381242))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0561)
                            }
                            
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0397:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1303117346))
                        goto(Label_1517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(357860904))
                        goto(Label_0685)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1634513212))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(576047574))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(1581232747))
                        var_11_E1 = and:int(ldc:int(-22264), ldc:int(22035))
                        goto(Label_1506)
                    }
                    
                    Label_0561:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1536085576))
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(173894927))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(309525020))
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1317114310))
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-563759825))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0685:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1418730265))
                        goto(Label_1517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1454640775))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-2123251726))
                        goto(Label_0938)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(95058697))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-851448289))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0815:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(250041975))
                        goto(Label_1517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-420560923))
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1303949281))
                            goto(Label_0561)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(370895657))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(1585426282))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = xor:int(ldc:int(24588), ldc:int(24589))
                                goto(Label_1094)
                            }
                        }
                    }
                    
                    Label_0938:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(715476851))
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1746826025))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0815)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(1010817650))
                            goto(Label_0561)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(23015609))
                            goto(Label_0397)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-843075181))
                        var_11_E1 = and:int(ldc:int(-31677), ldc:int(14780))
                    }
                    
                    Label_1094:
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1335024566))
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1005861258))
                            goto(Label_0938)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(2069741218))
                            goto(Label_0815)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-779621702))
                            goto(Label_0685)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0561)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(1705343052))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-281171821))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1370)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(175117082))
                        goto(Label_1517)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_1094)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1400909193))
                            goto(Label_0938)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0815)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(785406122))
                            goto(Label_0685)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0561)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-1871664711))
                            goto(Label_0397)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_653 = and:int(var_3_653:int, ldc:int(-714292740))
                            loopcontinue()
                        }
                        
                        var_3_653 = and:int(var_3_653:int, ldc:int(-588912993))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                        goto(Label_1506)
                    }
                    
                    Label_1370:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1517)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1987267924))
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-506742437))
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(2060742899))
                        goto(Label_0685)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1257355057))
                        goto(Label_0561)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_653 = and:int(var_3_653:int, ldc:int(1323675806))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1506:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_65E = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1517:
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1370)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(55750098))
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0938)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(-1540589679))
                        goto(Label_0685)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0561)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0397)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_653:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_653 = and:int(var_3_653:int, ldc:int(1588967830))
                        var_17_65E = add:int(var_16_10F:int, xor:int(ldc:int(16386), ldc:int(16387)))
                        looporswitchbreak()
                    }
                    
                    var_3_653 = and:int(var_3_653:int, ldc:int(-1541079646))
                }
                
                var_3_653 = and:int(var_3_653:int, ldc:int(1602091631))
                
                if (cmple:boolean(var_5_80 = var_17_65E:int, sub:int(var_6_87:int, and:int(ldc:int(16609), ldc:int(8713))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_653:int, ldc:int(33554432)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
