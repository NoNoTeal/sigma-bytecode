public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u2dcc\u760c\ua6bd\uf9c5\u9a18 {
    private void \u2dcc\u760c\ua6bd\uf9c5\u9a18(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p0, java.util.List<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8350\u6c52\uc2e8\u873d\u7006> p1) {
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
            invokespecial:Object(Object::<init>, this:\u2dcc\u760c\ua6bd\uf9c5\u9a18)
            putfield:Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\u2dcc\u760c\ua6bd\uf9c5\u9a18::\ub70c\u67d0\u92ee\uc87f\u3bd6\u7d52, this:\u2dcc\u760c\ua6bd\uf9c5\u9a18, invokestatic:HashSet[expected:Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>](Sets::newHashSet))
            putfield:List<\u3a62\u6d99\u836c\ubb2b\u6b5f>(\u2dcc\u760c\ua6bd\uf9c5\u9a18::\uafe7\uc229\u3711\u4bc8\ud4fe\ufe34, this:\u2dcc\u760c\ua6bd\uf9c5\u9a18, invokestatic:ArrayList[expected:List<\u3a62\u6d99\u836c\ubb2b\u6b5f>](Lists::newArrayList))
            putfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u2dcc\u760c\ua6bd\uf9c5\u9a18::\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2, this:\u2dcc\u760c\ua6bd\uf9c5\u9a18, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)
            putfield:List<\u8350\u6c52\uc2e8\u873d\u7006>(\u2dcc\u760c\ua6bd\uf9c5\u9a18::\u69d9\uc229\u6ec6\u71f1\u2dcc\ud7e8, this:\u2dcc\u760c\ua6bd\uf9c5\u9a18, p1:List<\u8350\u6c52\uc2e8\u873d\u7006>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u2dcc\u760c\ua6bd\uf9c5\u9a18 \ua562\ua562\u624e\u385b\u5654\ub171(\u3504\ufe34\u600f\u6b0d\u69d9.\u3a62\u6d99\u836c\ubb2b\u6b5f p0) {
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
    
    public com.google.gson.JsonElement get() {
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
    
    private static java.util.List<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8350\u6c52\uc2e8\u873d\u7006> \ubb2b\ub70c\u69d9\u8308\uc29a\u5f50(java.util.List<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8350\u6c52\uc2e8\u873d\u7006> p0, java.util.List<\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8350\u6c52\uc2e8\u873d\u7006> p1) {
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
    
    public \u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a \u1833\u718f\u3504\u718f\ucef1\u6435() {
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
            return:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(getfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u2dcc\u760c\ua6bd\uf9c5\u9a18::\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2, this:\u2dcc\u760c\ua6bd\uf9c5\u9a18))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u2dcc\u760c\ua6bd\uf9c5\u9a18 \u64f2\u71f1\u4bc8\u16f6\u4c04\uc246(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p0) {
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
            return:\u2dcc\u760c\ua6bd\uf9c5\u9a18(initobject:\u2dcc\u760c\ua6bd\uf9c5\u9a18(\u2dcc\u760c\ua6bd\uf9c5\u9a18::<init>, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, invokestatic:ImmutableList[expected:List<\u8350\u6c52\uc2e8\u873d\u7006>](ImmutableList::of, invokestatic:\u8350\u6c52\uc2e8\u873d\u7006[expected:Object](\u8350\u6c52\uc2e8\u873d\u7006::\u624e\u8cae\uf9c5\u6bb9\u3dd3\u6b0d))))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u2dcc\u760c\ua6bd\uf9c5\u9a18 \u56bd\u8c8a\u4cd9\u3a62\u8cae\u62da(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8350\u6c52\uc2e8\u873d\u7006 p1) {
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
            return:\u2dcc\u760c\ua6bd\uf9c5\u9a18(initobject:\u2dcc\u760c\ua6bd\uf9c5\u9a18(\u2dcc\u760c\ua6bd\uf9c5\u9a18::<init>, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, invokestatic:ImmutableList[expected:List<\u8350\u6c52\uc2e8\u873d\u7006>](ImmutableList::of, p1:\u8350\u6c52\uc2e8\u873d\u7006[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u2dcc\u760c\ua6bd\uf9c5\u9a18 \u9a18\uc9f6\ucef1\u5db4\ub19c\u7873(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8350\u6c52\uc2e8\u873d\u7006[] p1) {
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
            return:\u2dcc\u760c\ua6bd\uf9c5\u9a18(initobject:\u2dcc\u760c\ua6bd\uf9c5\u9a18(\u2dcc\u760c\ua6bd\uf9c5\u9a18::<init>, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, invokestatic:ImmutableList[expected:List<\u8350\u6c52\uc2e8\u873d\u7006>](ImmutableList::copyOf, p1:\u8350\u6c52\uc2e8\u873d\u7006[][expected:Object[]])))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object get() {
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
            return:Object(invokevirtual:JsonElement[expected:Object](\u2dcc\u760c\ua6bd\uf9c5\u9a18::get, this:\u2dcc\u760c\ua6bd\uf9c5\u9a18))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uc29a\uc2e8\ub19c\u3bd6\u7006\u6d69$6(java.util.List p0, com.google.common.collect.ImmutableList$Builder p1, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8350\u6c52\uc2e8\u873d\u7006 p2) {
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
    
    private static void lambda$\u97b7\u960f\u8413\ub1b9\u3a62\u6cfe$5(com.google.common.collect.ImmutableList$Builder p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8350\u6c52\uc2e8\u873d\u7006 p1, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8350\u6c52\uc2e8\u873d\u7006 p2) {
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
            invokevirtual:ImmutableList$Builder(ImmutableList$Builder::add, p0:ImmutableList$Builder, invokestatic:\u8350\u6c52\uc2e8\u873d\u7006[expected:Object](\u8350\u6c52\uc2e8\u873d\u7006::\u8bb0\u8c8a\u0a06\u9937\u7c6b\u51fa, p1:\u8350\u6c52\uc2e8\u873d\u7006, p2:\u8350\u6c52\uc2e8\u873d\u7006))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u98a4\u5140\u61a4\u624e\u7330\ud217$4(java.util.Map p0, com.google.gson.JsonObject p1) {
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
            invokeinterface:void(Map::forEach, p0:Map, invokedynamic:BiConsumer<String, JsonElement>(accept:(Lcom/google/gson/JsonObject;)Ljava/util/function/BiConsumer;, p1:JsonObject))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u9937\ud158\u12cb\u946b\ub102\u9a18$3(java.util.Map p0, com.mojang.datafixers.util.Pair p1) {
        var_4_7F : JsonElement
        
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
            var_4_7F = checkcast:JsonElement(com.google.gson.JsonElement.class, invokeinterface:JsonElement(Map<String, JsonElement>::put, p0:Map<String, JsonElement>, invokevirtual:String(\u5d20\u71f1\u071d\ub171\ufcaf::\uc87f\u34df\u5fe1\ubb2b\u6c56\ud523, checkcast:\u5d20\u71f1\u071d\ub171\ufcaf(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u5d20\u71f1\u071d\ub171\ufcaf.class, invokevirtual:Object[expected:\u5d20\u71f1\u071d\ub171\ufcaf](Pair::getFirst, p1:Pair))), invokestatic:JsonElement(\u8350\u6c52\uc2e8\u873d\u7006::\u494c\u7e3f\u8bb0\u7af6\u960f\ucfaf, checkcast:List(java.util.List.class, invokevirtual:Object[expected:List<\u8350\u6c52\uc2e8\u873d\u7006>](Pair::getSecond, p1:Pair)))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.stream.Stream lambda$\u3776\u760c\u2dcc\ucb79\uf94d\u6ec6$2(java.util.Map p0, com.mojang.datafixers.util.Pair p1) {
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
    
    private static com.mojang.datafixers.util.Pair lambda$\ud158\u2dcc\u4c04\uafe7\ub113\uc229$1(com.mojang.datafixers.util.Pair p0, java.util.Map.Entry p1) {
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
            return:Pair(invokestatic:Pair(Pair::of, invokevirtual:\u5d20\u71f1\u071d\ub171\ufcaf[expected:Object](\u5d20\u71f1\u071d\ub171\ufcaf::\uc2bd\u52d3\u7049\u7bad\u6d99\u120d, checkcast:\u5d20\u71f1\u071d\ub171\ufcaf(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u5d20\u71f1\u071d\ub171\ufcaf.class, invokevirtual:Object[expected:\u5d20\u71f1\u071d\ub171\ufcaf](Pair::getFirst, p0:Pair)), checkcast:\u5d20\u71f1\u071d\ub171\ufcaf(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u5d20\u71f1\u071d\ub171\ufcaf.class, invokeinterface:\u5d20\u71f1\u071d\ub171\ufcaf(Entry<\u5d20\u71f1\u071d\ub171\ufcaf, V>::getKey, p1:Entry<\u5d20\u71f1\u071d\ub171\ufcaf, V>))), invokestatic:List<\u8350\u6c52\uc2e8\u873d\u7006>[expected:Object](\u2dcc\u760c\ua6bd\uf9c5\u9a18::\ubb2b\ub70c\u69d9\u8308\uc29a\u5f50, checkcast:List(java.util.List.class, invokevirtual:Object[expected:List<\u8350\u6c52\uc2e8\u873d\u7006>](Pair::getSecond, p0:Pair)), checkcast:List(java.util.List.class, invokeinterface:V[expected:List<\u8350\u6c52\uc2e8\u873d\u7006>](Entry<K, V>::getValue, p1:Entry<\u5d20\u71f1\u071d\ub171\ufcaf, V>)))))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u1187\u99f7\u3e2a\ucb79\u56bd\u927d$0(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d p0) {
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
        
        if (cmpne:boolean(invokevirtual:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<O, S>::\u8753\u927d\u51b2\ub102\u4ab3\u1833, invokevirtual:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u51b2\u72f1\ubcb0\uc87f\u2dcc\u92ee, getfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u2dcc\u760c\ua6bd\uf9c5\u9a18::\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2, this:\u2dcc\u760c\ua6bd\uf9c5\u9a18)), invokevirtual:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1, p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>)), p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>)) {
            athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u2dcc\u760c\ua6bd\uf9c5\u9a18::\ub171\u392e\u3bc9\u6cfe\u3c25\u6b0d), and:int(ldc:int(20611), ldc:int(3077)))), p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>[expected:Object]), loadelement:String(getstatic:String[](\u2dcc\u760c\ua6bd\uf9c5\u9a18::\ub171\u392e\u3bc9\u6cfe\u3c25\u6b0d), and:int(ldc:int(3978), ldc:int(28738)))), getfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:Object](\u2dcc\u760c\ua6bd\uf9c5\u9a18::\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2, this:\u2dcc\u760c\ua6bd\uf9c5\u9a18)))))
        }
        
        if (invokeinterface:boolean(Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>::add, getfield:Set<\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>>(\u2dcc\u760c\ua6bd\uf9c5\u9a18::\ub70c\u67d0\u92ee\uc87f\u3bd6\u7d52, this:\u2dcc\u760c\ua6bd\uf9c5\u9a18), p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>)) {
            return:void()
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u2dcc\u760c\ua6bd\uf9c5\u9a18::\ub171\u392e\u3bc9\u6cfe\u3c25\u6b0d), xor:int(ldc:int(339), ldc:int(336)))), p0:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>[expected:Object]), loadelement:String(getstatic:String[](\u2dcc\u760c\ua6bd\uf9c5\u9a18::\ub171\u392e\u3bc9\u6cfe\u3c25\u6b0d), and:int(ldc:int(4108), ldc:int(16807)))), getfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:Object](\u2dcc\u760c\ua6bd\uf9c5\u9a18::\u71f1\ub7dc\u98a4\ub19c\ud7e8\u51b2, this:\u2dcc\u760c\ua6bd\uf9c5\u9a18)))))
    }
    
    static {
        var_0_61 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_8D_0 : byte[] [generated]
        stack_8F_0 : byte[] [generated]
        stack_B5_0 : byte[] [generated]
        stack_B7_0 : byte[] [generated]
        stack_D3_0 : byte[] [generated]
        stack_1F7_0 : byte[] [generated]
        stack_259_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_187 : byte[]
        var_4_188 : int
        expr_8F : int [generated]
        var_5_1D8 : int
        var_3_1DD : byte[]
        var_4_1DE : int
        expr_1FD : byte [generated]
        var_0_24F : int
        expr_259 : byte [generated]
        stack_289_2 : byte [generated]
        expr_B7 : int [generated]
        var_3_DF : String
        stack_17E_0 : String[] [generated]
        expr_F1 : String[] [generated]
        
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
            var_0_61 = and:int(ldc:int(1731466670), ldc:int(-1610848350))
            expr_68 = var_2_6C = stack_8D_0 = stack_8F_0 = stack_B5_0 = stack_B7_0 = stack_D3_0 = stack_1F7_0 = stack_259_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("A1B09KgsdX7D03N0dXaqqEzXdHFC1vR0LfXKL1bxwNN1cEPTc3R1dqqoTNd0cULW9HQt9coDAat1qXL1dsUIcHdyIPHCVq9J0vGrdaly9XbE2KN+ril08qkw"))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_187 = newarray:byte[](byte.class, expr_70:int)
                var_4_188 = expr_70:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-820007512))
                    var_4_188 = add:int(var_4_188:int, ldc:int(-1))
                    storeelement:byte(var_3_187:byte[], var_4_188:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_188:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_188:int, and:int(ldc:int(2435), ldc:int(17017)))), ldc:int(3)), and:int(ldc:int(8223), ldc:int(3359)))))
                    
                    if (cmpne:boolean(var_4_188:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_8F_0 = stack_8D_0 = stack_B5_0 = stack_B7_0 = stack_D3_0 = stack_1F7_0 = stack_259_0 = var_3_187:byte[]
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0188)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0148)
                }
                
                var_0_61 = and:int(var_0_61:int, ldc:int(123181041))
                expr_8F = arraylength:int(stack_8F_0:byte[])
                
                if (cmpeq:boolean(expr_8F:int, ldc:int(0))) {
                    goto(Label_0148)
                }
                
                var_5_1D8 = expr_8F:int
                var_3_1DD = newarray:byte[](byte.class, expr_8F:int)
                var_4_1DE = expr_8F:int
                Label_0480:
                
                while (cmpne:boolean(and:int(var_0_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(1610072996))
                    var_4_1DE = add:int(var_4_1DE:int, ldc:int(-1))
                    expr_1FD = xor:byte(add:byte(loadelement:byte(stack_1F7_0:byte[], var_4_1DE:int), ldc:byte(38)), ldc:byte(107))
                    storeelement:byte(var_3_1DD:byte[], var_4_1DE:int, or:int(and:int(shl:int(expr_1FD:byte, xor:int(ldc:int(-31992), ldc:int(-31988))), ldc:int(-16)), and:int(shr:int(expr_1FD:byte[expected:int], and:int(ldc:int(12343), ldc:int(260))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_4_1DE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_8F_0 = stack_8D_0 = stack_B5_0 = stack_B7_0 = stack_D3_0 = stack_1F7_0 = stack_259_0 = var_3_1DD:byte[]
                    goto(Label_0148)
                }
                
                Label_0578:
                
                while (cmpne:boolean(and:int(var_0_61:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_24F = and:int(var_0_61:int, ldc:int(-277748318))
                    var_4_1DE = add:int(var_4_1DE:int, ldc:int(-1))
                    expr_259 = loadelement:byte(stack_259_0:byte[], var_4_1DE:int)
                    
                    if (cmpge:boolean(add:int(add:int(var_4_1DE:int, ldc:int(1)), neg:int(var_5_1D8:int)), ldc:int(0))) {
                        var_0_24F = and:int(var_0_24F:int, ldc:int(-1213149251))
                        stack_289_2 = add:byte(expr_259:byte, ldc:byte(1))
                    }
                    else {
                        stack_289_2 = add:byte(expr_259:byte, loadelement:byte(var_3_1DD:byte[], add:int(var_4_1DE:int, ldc:int(1))))
                    }
                    
                    var_0_61 = and:int(var_0_24F:int, ldc:int(-279176713))
                    storeelement:byte(var_3_1DD:byte[], var_4_1DE:int, stack_289_2:byte)
                    
                    if (cmpne:boolean(var_4_1DE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_8F_0 = stack_8D_0 = stack_B5_0 = stack_B7_0 = stack_D3_0 = stack_1F7_0 = stack_259_0 = var_3_1DD:byte[]
                    goto(Label_0188)
                }
                
                goto(Label_0480)
                Label_0148:
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(32)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-811762432))
                }
                else {
                    if (cmpne:boolean(and:int(var_0_61:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_61 = and:int(var_0_61:int, ldc:int(1997544889))
                    expr_B7 = arraylength:int(stack_B7_0:byte[])
                    
                    if (cmpne:boolean(expr_B7:int, ldc:int(0))) {
                        var_5_1D8 = expr_B7:int
                        var_3_1DD = newarray:byte[](byte.class, expr_B7:int)
                        var_4_1DE = expr_B7:int
                        goto(Label_0578)
                    }
                }
                
                Label_0188:
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_0148)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_DF = initobject:String(String::<init>, stack_D3_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_17E_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(2080), ldc:int(2085)))
            expr_F1 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1285), ldc:int(8263)))
            storeelement:String(expr_F1:String[], xor:int(ldc:int(16976), ldc:int(16980)), invokevirtual:String[expected:String](String::substring, var_3_DF:String, and:int(ldc:int(-22151), ldc:int(22150)), and:int(ldc:int(1051), ldc:int(4383))))
            storeelement:String(expr_F1:String[], xor:int(ldc:int(1046), ldc:int(1044)), invokevirtual:String[expected:String](String::substring, var_3_DF:String, xor:int(ldc:int(-23549), ldc:int(-23528)), xor:int(ldc:int(115), ldc:int(70))))
            storeelement:String(expr_F1:String[], xor:int(ldc:int(16640), ldc:int(16641)), invokevirtual:String[expected:String](String::substring, var_3_DF:String, and:int(ldc:int(1589), ldc:int(26935)), and:int(ldc:int(21054), ldc:int(10366))))
            storeelement:String(expr_F1:String[], and:int(ldc:int(1571), ldc:int(24855)), invokevirtual:String[expected:String](String::substring, var_3_DF:String, and:int(ldc:int(12862), ldc:int(446)), and:int(ldc:int(16465), ldc:int(4437))))
            storeelement:String(expr_F1:String[], and:int(ldc:int(26651), ldc:int(-26652)), invokevirtual:String[expected:String](String::substring, var_3_DF:String, xor:int(ldc:int(17439), ldc:int(17486)), xor:int(ldc:int(9247), ldc:int(9286))))
            putstatic:String[](\u2dcc\u760c\ua6bd\uf9c5\u9a18::\ub171\u392e\u3bc9\u6cfe\u3c25\u6b0d, expr_F1:String[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5140\u4f52\ubcb0\u5fe1\ub1b9\uc910(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_67D : int
        
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
        var_3_672 = and:int(ldc:int(1640786215), ldc:int(-167880257))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u2dcc\u760c\ua6bd\uf9c5\u9a18[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(-1477547675))
            var_5_81 = and:int(ldc:int(-3466), ldc:int(3465))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3226), ldc:int(3225)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_672:int, ldc:int(768494063))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(3085), ldc:int(113)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(301), ldc:int(2243)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_D1:int, ldc:int(-64094233))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-14334), ldc:int(-14333)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-886786388))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1604500164))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(342188839))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(640182559))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2061003537))
                    }
                    else {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1115759305))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-669608570))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-475993600))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1791027968))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-979292808))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-525513281))
                        var_11_E2 = and:int(ldc:int(30082), ldc:int(-30599))
                        goto(Label_1508)
                    }
                    
                    Label_0577:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-252615227))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1369175197))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1695648572))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1814357647))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1975312231))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(646217118))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1211939555))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(202025068))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1496377086))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-825886273))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1855815087))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-405226205))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1262761357))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(370219559))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1759313855))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(260), ldc:int(261))
                                goto(Label_1128)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2081708309))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1206678722))
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-347852249))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1589184673))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1868043250))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1233322075))
                        var_11_E2 = and:int(ldc:int(26707), ldc:int(-30936))
                    }
                    
                    Label_1128:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(378731626))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-766233808))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(89587165))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(2009485415))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1969191213))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1380)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(556908182))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1128)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(512)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-2001645777))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(689351939))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(816708599))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1508)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1380:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(500731073))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2066541252))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1492665386))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(-1553999387))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1721864726))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-2042303467))
                        goto(Label_1128)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-422597190))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(219066550))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(569444000))
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(845016359))
                        var_17_67D = add:int(var_16_110:int, xor:int(ldc:int(4104), ldc:int(4105)))
                        looporswitchbreak()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(356091507))
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(-1537320665))
                
                if (cmple:boolean(var_5_81 = var_17_67D:int, sub:int(var_6_88:int, xor:int(ldc:int(-32472), ldc:int(-32471))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
