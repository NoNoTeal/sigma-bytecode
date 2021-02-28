public class \u5d20\u97b7\u8753\u873d\u16f6.\uae5d\u8d98\u7d52\u4f52\u51b2 {
    private void \uae5d\u8d98\u7d52\u4f52\u51b2(java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u64ab\ua6bd\u8413\u93a2\u88c5<?>> p0, java.util.Map<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\uc910\u98a4\u120d\u3bc9\ubcb0, java.util.List<java.util.function.Supplier<\u59ec\u8413\u97e6\uc229\u3776.\u760c\ubded\uff55\u6d69\u4179<?>>>> p1, java.util.List<java.util.List<java.util.function.Supplier<\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>> p2, java.util.List<java.util.function.Supplier<\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?>>> p3) {
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
    
    public java.util.List<java.util.function.Supplier<\u59ec\u8413\u97e6\uc229\u3776.\u760c\ubded\uff55\u6d69\u4179<?>>> \uc246\u960f\u71f1\u873d\uceb8\ud158(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\uc910\u98a4\u120d\u3bc9\ubcb0 p0) {
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
            return:List<Supplier<\u760c\ubded\uff55\u6d69\u4179<?>>>(checkcast:List<Supplier<\u760c\ubded\uff55\u6d69\u4179<?>>>(java.util.List<java.util.function.Supplier<\u59ec\u8413\u97e6\uc229\u3776.\u760c\ubded\uff55\u6d69\u4179<?>>>.class, invokeinterface:List<Supplier<\u760c\ubded\uff55\u6d69\u4179<?>>>(Map<\uc910\u98a4\u120d\u3bc9\ubcb0, List<Supplier<\u760c\ubded\uff55\u6d69\u4179<?>>>>::getOrDefault, getfield:Map<\uc910\u98a4\u120d\u3bc9\ubcb0, List<Supplier<\u760c\ubded\uff55\u6d69\u4179<?>>>>(\uae5d\u8d98\u7d52\u4f52\u51b2::\u59ec\u47c2\uc246\u6435\u76bc\ub32d, this:\uae5d\u8d98\u7d52\u4f52\u51b2), p0:\uc910\u98a4\u120d\u3bc9\ubcb0[expected:Object], invokestatic:ImmutableList[expected:List<Supplier<\u760c\ubded\uff55\u6d69\u4179<?>>>](ImmutableList::of))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4975\u516c\ub70c\u4e72\u7330\ub7dc(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> p0) {
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
    
    public java.util.Collection<java.util.function.Supplier<\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?>>> \uc4d2\u5245\u51fa\u624e\u9033\ubefe() {
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
            return:Collection<Supplier<\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?>>>(getfield:List<Supplier<\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?>>>[expected:Collection<Supplier<\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?>>>](\uae5d\u8d98\u7d52\u4f52\u51b2::\u8df4\u5db4\ub32d\ud36e\u8258\u3776, this:\uae5d\u8d98\u7d52\u4f52\u51b2))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?> \u69d9\u6d69\u3bd6\u960f\u5d20\u6cfe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?> p0) {
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
    
    public java.util.List<\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>> \u836c\u6198\u5245\ubf56\u7e3f\u4d85() {
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
            return:List<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(getfield:List<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\uae5d\u8d98\u7d52\u4f52\u51b2::\u4bc8\u8350\ud523\u4bc8\u385b\u8640, this:\uae5d\u8d98\u7d52\u4f52\u51b2))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<java.util.List<java.util.function.Supplier<\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>> \ubcb0\ub1b9\u416d\uc3e3\u71f1\u93a2() {
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
            return:List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>(getfield:List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>(\uae5d\u8d98\u7d52\u4f52\u51b2::\u71ae\u36d3\u8413\ub18d\ubcb0\u4ab3, this:\uae5d\u8d98\u7d52\u4f52\u51b2))
        }
        
        goto(Label_0006)
    }
    
    public java.util.function.Supplier<\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u64ab\ua6bd\u8413\u93a2\u88c5<?>> \ud523\ub113\u8640\u40a9\u4d85\u6cfe() {
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
            return:Supplier<\u64ab\ua6bd\u8413\u93a2\u88c5<?>>(getfield:Supplier<\u64ab\ua6bd\u8413\u93a2\u88c5<?>>(\uae5d\u8d98\u7d52\u4f52\u51b2::\ua61f\ud171\ub1b9\u516c\u8308\u0a06, this:\uae5d\u8d98\u7d52\u4f52\u51b2))
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u3a62\u47c2\u946b\u6c56\u51b2 \u6ec6\ua068\u6d69\u7c6b\u7ce1\ufe34() {
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
            return:\u3a62\u47c2\u946b\u6c56\u51b2(invokevirtual:?[expected:\u3a62\u47c2\u946b\u6c56\u51b2](\u64ab\ua6bd\u8413\u93a2\u88c5<?>::\ud36e\uc7fe\u6c56\uae87\u3d4b\u494c, checkcast:\u64ab\ua6bd\u8413\u93a2\u88c5<?>(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u64ab\ua6bd\u8413\u93a2\u88c5<?>.class, invokeinterface:\u64ab\ua6bd\u8413\u93a2\u88c5<?>(Supplier<\u64ab\ua6bd\u8413\u93a2\u88c5<?>>::get, getfield:Supplier<\u64ab\ua6bd\u8413\u93a2\u88c5<?>>(\uae5d\u8d98\u7d52\u4f52\u51b2::\ua61f\ud171\ub1b9\u516c\u8308\u0a06, this:\uae5d\u8d98\u7d52\u4f52\u51b2)))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u92ff\u718f\u51fa\u34df\uf9c5\u5f50$8(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d p1) {
        var_2_5F : int
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
            var_2_5F = and:int(ldc:int(1727460244), ldc:int(-68888658))
            
            if (cmpne:boolean(getfield:F extends \u5654\u9937\u72f1\ud4fe\u0c95<FC>(\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d::\u960f\ud171\u12cb\uc2bd\u446c\u7bad, p1:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d), getfield:F extends \u5654\u9937\u72f1\ud4fe\u0c95<FC>(\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d::\u960f\ud171\u12cb\uc2bd\u446c\u7bad, p0:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-18346424))
                stack_8A_0 = and:int(ldc:int(-22199), ldc:int(5300))
            }
            else {
                stack_8A_0 = xor:int(ldc:int(17032), ldc:int(17033))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\uae5d\u392e\ud4fe\u516c\u8d90\u7ce1$7(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95 p0, java.util.function.Supplier p1) {
        var_2_5F : int
        stack_91_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(605487676), ldc:int(849211004))
            
            if (cmpne:boolean(getfield:F extends \u5654\u9937\u72f1\ud4fe\u0c95<FC>[expected:\u5654\u9937\u72f1\ud4fe\u0c95<FC>](\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d::\u960f\ud171\u12cb\uc2bd\u446c\u7bad, checkcast:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d.class, invokeinterface:\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d(Supplier<\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d>::get, p1:Supplier<\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d>))), p0:\u5654\u9937\u72f1\ud4fe\u0c95<FC>)) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(2096574398))
                stack_91_0 = and:int(ldc:int(-11217), ldc:int(3024))
            }
            else {
                stack_91_0 = and:int(ldc:int(1169), ldc:int(269))
            }
            
            return:boolean(stack_91_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u97b7\ubded\ud523\u8aa5\u759a\u47c2$6(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a p0) {
        var_1_61 : int
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
            var_1_61 = and:int(ldc:int(-316171192), ldc:int(-1176520582))
            
            if (cmpne:boolean(getfield:F extends \u93a2\u1187\u5654\u8413\u3a62\ua61f<FC>[expected:Object](\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a::\uc246\u51fa\u7330\u8258\u8640\u8aa5, p0:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a), getstatic:\ub102\ub102\u59ec\u8d98\u71ae<\u6d99\uafe7\ud7e8\u527a\u5bc4\u6ec6>[expected:Object](\u93a2\u1187\u5654\u8413\u3a62\ua61f::\u6bb9\ufe34\u6ec6\u8350\u7e3f\u3bc9))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-1222115750))
                stack_8D_0 = and:int(ldc:int(17382), ldc:int(-21479))
            }
            else {
                stack_8D_0 = and:int(ldc:int(4265), ldc:int(25091))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u4179\uc246\ud4fe\u494c\u3d64\uf94d$5(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.util.List lambda$\u64ab\u4975\u7330\u6cfe\u59ec\ub83f$4(\u5d20\u97b7\u8753\u873d\u16f6.\uae5d\u8d98\u7d52\u4f52\u51b2 p0) {
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
            return:List(getfield:List<Supplier<\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?>>>(\uae5d\u8d98\u7d52\u4f52\u51b2::\u8df4\u5db4\ub32d\ud36e\u8258\u3776, p0:\uae5d\u8d98\u7d52\u4f52\u51b2))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List lambda$\u2dcc\u4f52\u4f4a\u5d20\uc2bd\u1187$3(\u5d20\u97b7\u8753\u873d\u16f6.\uae5d\u8d98\u7d52\u4f52\u51b2 p0) {
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
            return:List(getfield:List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>(\uae5d\u8d98\u7d52\u4f52\u51b2::\u71ae\u36d3\u8413\ub18d\ubcb0\u4ab3, p0:\uae5d\u8d98\u7d52\u4f52\u51b2))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.Map lambda$\ucef1\u527a\u6435\u92ff\ub1b9\ud171$2(\u5d20\u97b7\u8753\u873d\u16f6.\uae5d\u8d98\u7d52\u4f52\u51b2 p0) {
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
            return:Map(getfield:Map<\uc910\u98a4\u120d\u3bc9\ubcb0, List<Supplier<\u760c\ubded\uff55\u6d69\u4179<?>>>>(\uae5d\u8d98\u7d52\u4f52\u51b2::\u59ec\u47c2\uc246\u6435\u76bc\ub32d, p0:\uae5d\u8d98\u7d52\u4f52\u51b2))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.function.Supplier lambda$\u8350\uc246\u92ff\u64f2\u69d9\u67d0$1(\u5d20\u97b7\u8753\u873d\u16f6.\uae5d\u8d98\u7d52\u4f52\u51b2 p0) {
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
            return:Supplier(getfield:Supplier<\u64ab\ua6bd\u8413\u93a2\u88c5<?>>(\uae5d\u8d98\u7d52\u4f52\u51b2::\ua61f\ud171\ub1b9\u516c\u8308\u0a06, p0:\uae5d\u8d98\u7d52\u4f52\u51b2))
        }
        
        goto(Label_0006)
    }
    
    private static \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u64ab\ua6bd\u8413\u93a2\u88c5 lambda$\u51b2\ud36e\u718f\uc910\u8aa5\u8709$0() {
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
            return:\u64ab\ua6bd\u8413\u93a2\u88c5(getstatic:\u64ab\ua6bd\u8413\u93a2\u88c5<\u836c\u6b0d\uc3e3\u71f1\u4daf>(\u8c8a\ubefe\ucef1\u9033\u71f1::\ud171\ufcaf\u516c\ub70c\ud4fe\u836c))
        }
        
        goto(Label_0006)
    }
    
    public void \uae5d\u8d98\u7d52\u4f52\u51b2(java.util.function.Supplier p0, java.util.Map p1, java.util.List p2, java.util.List p3, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ubefe\u416d\u4bc8\u647c\uc29a p4) {
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
            invokespecial:\uae5d\u8d98\u7d52\u4f52\u51b2(\uae5d\u8d98\u7d52\u4f52\u51b2::<init>, this:\uae5d\u8d98\u7d52\u4f52\u51b2, p0:Supplier<\u64ab\ua6bd\u8413\u93a2\u88c5<?>>, p1:Map<\uc910\u98a4\u120d\u3bc9\ubcb0, List<Supplier<\u760c\ubded\uff55\u6d69\u4179<?>>>>, p2:List<List<Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>>>, p3:List<Supplier<\uc238\u98a4\ucfaf\u4bc8\ud12e\u6b0d<?, ?>>>)
            return:void()
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
    
    public void \u7873\u47c2\u8d90\u965f\u5bc4\u3e2a(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69F : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6AA : int
        
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
        var_3_69F = and:int(ldc:int(1510658081), ldc:int(1573845949))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uae5d\u8d98\u7d52\u4f52\u51b2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(-860195607))
            var_5_81 = and:int(ldc:int(10254), ldc:int(-10255))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-9906), ldc:int(9905)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_69F:int, ldc:int(-81176403))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(19712), ldc:int(19713)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(4352), ldc:int(4353)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_69F = and:int(var_3_DA:int, ldc:int(-585173513))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-31999), ldc:int(-32000)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1850266359))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(472628978))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1324848992))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1709683446))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(383071771))
                    }
                    else {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-84944156))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-618642393))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(432753268))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(178646935))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-289850299))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-50781639))
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1285063466))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1208094586))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-63283276))
                        var_11_EB = and:int(ldc:int(10026), ldc:int(-12139))
                        goto(Label_1562)
                    }
                    
                    Label_0613:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(629185508))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(348271748))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2079118661))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1724066206))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(714519669))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1550342446))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0747:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1066461462))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1851946613))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-548072388))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-346474692))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-811894546))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1526021727))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1614523482))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-915215379))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-856066268))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(-24384), ldc:int(-24383))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-245132339))
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(654629669))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-310379849))
                        var_11_EB = and:int(ldc:int(13977), ldc:int(-16026))
                    }
                    
                    Label_1137:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-90373770))
                        goto(Label_1573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-687179280))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(748890087))
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-31851272))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(14084898))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-828157234))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-822955540))
                            goto(Label_1137)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(151990892))
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-173247035))
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-711103954))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1095495737))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-924166662))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1562)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1416:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-426892420))
                        goto(Label_1573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-627099276))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1436166584))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1557935947))
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(620886261))
                        loopcontinue()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(-896805724))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1562:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AA = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1573:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1631574995))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-84080759))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1211343831))
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1696578266))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-293769154))
                        var_17_6AA = add:int(var_16_119:int, and:int(ldc:int(4289), ldc:int(8205)))
                        looporswitchbreak()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(334798255))
                }
                
                var_3_69F = and:int(var_3_69F:int, ldc:int(-618703435))
                
                if (cmple:boolean(var_5_81 = var_17_6AA:int, sub:int(var_6_88:int, and:int(ldc:int(8257), ldc:int(17813))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(2061126975))
            goto(Label_0108)
        }
    }
}
