public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179 {
    public void \u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179(java.lang.Runnable p0, java.util.function.Function<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p1, \ub113\uc4d2\u183a\u527a\u6435.\u4f52\ua068\u4f52\u47c2\u4492 p2, java.util.function.Consumer<\ub113\uc4d2\u183a\u527a\u6435.\u4f52\ua068\u4f52\u47c2\u4492> p3) {
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
            invokespecial:Object(Object::<init>, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179)
            putfield:Runnable(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u47c2\uc87f\u5654\ufe34\uc3e3\u5140, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179, p0:Runnable)
            putfield:Function<\ua61f\uae87\u36d3\u647c\u3d64, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u647c\u4179\u98a4\u156b\u0800\u5d20, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179, p1:Function<\ua61f\uae87\u36d3\u647c\u3d64, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>)
            putfield:\u4f52\ua068\u4f52\u47c2\u4492(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u5140\u8709\ud158\u3bc9\u5654\u5fe1, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179, p2:\u4f52\ua068\u4f52\u47c2\u4492)
            invokestatic:void(Collections::reverse, putfield:List<\ua61f\uae87\u36d3\u647c\u3d64>(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u6435\u839e\u5245\ubefe\u5d20\u7330, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179, invokestatic:ArrayList[expected:List<\ua61f\uae87\u36d3\u647c\u3d64>](Lists::newArrayList, invokevirtual:Collection<\ua61f\uae87\u36d3\u647c\u3d64>[expected:Iterable](\u4f52\ua068\u4f52\u47c2\u4492::\u527a\u5fe1\u8c8a\u600f\ubefe\u4bc8, p2:\u4f52\ua068\u4f52\u47c2\u4492))))
            invokeinterface:boolean(List<E>::removeAll, putfield:List<\ua61f\uae87\u36d3\u647c\u3d64>(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u9255\ubcb0\u61a4\u16f6\u760c\u4bc8, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179, invokestatic:ArrayList[expected:List<\ua61f\uae87\u36d3\u647c\u3d64>](Lists::newArrayList, invokevirtual:Collection<\ua61f\uae87\u36d3\u647c\u3d64>[expected:Iterable](\u4f52\ua068\u4f52\u47c2\u4492::\u0c95\u6b5f\u1187\u12b2\ub1b9\u6435, p2:\u4f52\ua068\u4f52\u47c2\u4492))), getfield:List<\ua61f\uae87\u36d3\u647c\u3d64>[expected:Collection<?>](\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u6435\u839e\u5245\ubefe\u5d20\u7330, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179))
            putfield:Consumer<\u4f52\ua068\u4f52\u47c2\u4492>(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u873d\u4cd9\u5654\u8d90\u4c2b\u516c, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179, p3:Consumer<\u4f52\ua068\u4f52\u47c2\u4492>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.stream.Stream<\u6435\ub8be\u718f\u6b0d\u67e9.\ub7dc\u72f1\u8413\ub6ab\u392e\u62da> \u836c\u59ec\u4179\u98a4\u3711\u40a9() {
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
    
    public java.util.stream.Stream<\u6435\ub8be\u718f\u6b0d\u67e9.\ub7dc\u72f1\u8413\ub6ab\u392e\u62da> \u7330\u839e\u4975\u1187\u600f\u97e6() {
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
    
    public void \u64f2\ua3b4\u59ec\u392e\ud12e\u93a2() {
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
            invokevirtual:void(\u4f52\ua068\u4f52\u47c2\u4492::\u16f6\u392e\u3776\u64f2\u9937\u47c2, getfield:\u4f52\ua068\u4f52\u47c2\u4492(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u5140\u8709\ud158\u3bc9\u5654\u5fe1, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179), checkcast:Collection(java.util.Collection.class, invokeinterface:Object[expected:Collection<String>](Stream::collect, invokeinterface:Stream(Stream::map, invokeinterface:Stream(Collection::stream, invokestatic:List[expected:Collection<Object>](Lists::reverse, getfield:List<\ua61f\uae87\u36d3\u647c\u3d64>(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u6435\u839e\u5245\ubefe\u5d20\u7330, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179))), invokedynamic:Function<T, String>(apply:()Ljava/util/function/Function;)), invokestatic:Collector(ImmutableList::toImmutableList))))
            invokeinterface:void(Consumer<\u4f52\ua068\u4f52\u47c2\u4492>::accept, getfield:Consumer<\u4f52\ua068\u4f52\u47c2\u4492>(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u873d\u4cd9\u5654\u8d90\u4c2b\u516c, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179), getfield:\u4f52\ua068\u4f52\u47c2\u4492(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u5140\u8709\ud158\u3bc9\u5654\u5fe1, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud36e\u494c\ub102\ua6bd\uc29a\u9a18() {
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
            invokevirtual:void(\u4f52\ua068\u4f52\u47c2\u4492::\ub83f\u72f1\u8aa5\u64f2\ud158\ub171, getfield:\u4f52\ua068\u4f52\u47c2\u4492(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u5140\u8709\ud158\u3bc9\u5654\u5fe1, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179))
            invokeinterface:boolean(List<E>::retainAll, getfield:List<\ua61f\uae87\u36d3\u647c\u3d64>(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u6435\u839e\u5245\ubefe\u5d20\u7330, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179), invokevirtual:Collection<\ua61f\uae87\u36d3\u647c\u3d64>(\u4f52\ua068\u4f52\u47c2\u4492::\u0c95\u6b5f\u1187\u12b2\ub1b9\u6435, getfield:\u4f52\ua068\u4f52\u47c2\u4492(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u5140\u8709\ud158\u3bc9\u5654\u5fe1, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179)))
            invokeinterface:void(List<E>::clear, getfield:List<\ua61f\uae87\u36d3\u647c\u3d64>(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u9255\ubcb0\u61a4\u16f6\u760c\u4bc8, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179))
            invokeinterface:boolean(List<\ua61f\uae87\u36d3\u647c\u3d64>::addAll, getfield:List<\ua61f\uae87\u36d3\u647c\u3d64>(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u9255\ubcb0\u61a4\u16f6\u760c\u4bc8, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179), invokevirtual:Collection<\ua61f\uae87\u36d3\u647c\u3d64>(\u4f52\ua068\u4f52\u47c2\u4492::\u0c95\u6b5f\u1187\u12b2\ub1b9\u6435, getfield:\u4f52\ua068\u4f52\u47c2\u4492(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u5140\u8709\ud158\u3bc9\u5654\u5fe1, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179)))
            invokeinterface:boolean(List<E>::removeAll, getfield:List<\ua61f\uae87\u36d3\u647c\u3d64>(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u9255\ubcb0\u61a4\u16f6\u760c\u4bc8, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179), getfield:List<\ua61f\uae87\u36d3\u647c\u3d64>[expected:Collection<?>](\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u6435\u839e\u5245\ubefe\u5d20\u7330, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u6435\ub8be\u718f\u6b0d\u67e9.\ub7dc\u72f1\u8413\ub6ab\u392e\u62da lambda$\ucb79\u8aa5\u51fa\u946b\u0a06\u5d20$1(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64 p0) {
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
            return:\ub7dc\u72f1\u8413\ub6ab\u392e\u62da(initobject:\u5140\u92ee\u3d64\u92ff\u8258\u8389[expected:\ub7dc\u72f1\u8413\ub6ab\u392e\u62da](\u5140\u92ee\u3d64\u92ff\u8258\u8389::<init>, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179, p0:\ua61f\uae87\u36d3\u647c\u3d64))
        }
        
        goto(Label_0006)
    }
    
    private \u6435\ub8be\u718f\u6b0d\u67e9.\ub7dc\u72f1\u8413\ub6ab\u392e\u62da lambda$\u8389\u8640\ub113\u9af2\u7873\u47c2$0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ua61f\uae87\u36d3\u647c\u3d64 p0) {
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
            return:\ub7dc\u72f1\u8413\ub6ab\u392e\u62da(initobject:\u12b2\ub32d\u92ff\ud217\u3d4b\u3776[expected:\ub7dc\u72f1\u8413\ub6ab\u392e\u62da](\u12b2\ub32d\u92ff\ud217\u3d4b\u3776::<init>, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179, p0:\ua61f\uae87\u36d3\u647c\u3d64))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.function.Function \uc9f6\u9255\ub32d\u7043\u56bd\uceb8(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179 p0) {
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
            return:Function(getfield:Function<\ua61f\uae87\u36d3\u647c\u3d64, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u647c\u4179\u98a4\u156b\u0800\u5d20, p0:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.Runnable \ub19c\u6d69\u0800\u8389\ubcb0\u6ec6(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179 p0) {
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
            return:Runnable(getfield:Runnable(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u47c2\uc87f\u5654\ufe34\uc3e3\u5140, p0:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List \u718f\u64ab\u8709\u965f\u3e75\u5245(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179 p0) {
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
            return:List(getfield:List<\ua61f\uae87\u36d3\u647c\u3d64>(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u9255\ubcb0\u61a4\u16f6\u760c\u4bc8, p0:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List \u836c\u3504\ud12e\u61a4\ua61f\u5245(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179 p0) {
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
            return:List(getfield:List<\ua61f\uae87\u36d3\u647c\u3d64>(\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179::\u6435\u839e\u5245\ubefe\u5d20\u7330, p0:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179))
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
    
    public void \uae5d\u8bb0\ud36e\u4cd9\u5140\u7c6b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_69E : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_BB : double
        var_3_CD : int
        var_11_DE : int
        var_14_108 : double
        var_16_10C : int
        var_12_104 : double
        var_17_6A9 : int
        
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
        var_3_69E = and:int(ldc:int(-970728885), ldc:int(-134390154))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u6c52\u8c8a\u7bad\u8bb0\ubf56\u4179[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(2)), ldc:int(0))) {
            var_3_69E = and:int(var_3_69E:int, ldc:int(-844104874))
            var_5_7D = and:int(ldc:int(3920), ldc:int(-12113))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(22552), ldc:int(-22553)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BB = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CD = and:int(var_3_69E:int, ldc:int(-26090550))
                    var_9_BB = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DE = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DE:int, sub:int(var_6_84:int, xor:int(ldc:int(24864), ldc:int(24865)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DE:int, xor:int(ldc:int(86), ldc:int(87)))), var_7_93:double))) {
                        inc:int(var_11_DE, ldc:int(1))
                    }
                    
                    var_3_69E = and:int(var_3_CD:int, ldc:int(-702289186))
                    var_14_108 = var_7_93:double
                    var_16_10C = var_11_DE:int
                }
                else {
                    var_11_DE = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(4105), ldc:int(8337)))
                    var_12_104 = var_14_108 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_10C = var_11_DE:int, var_6_84:int)) {
                        var_9_BB = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DE:int)
                        var_16_10C = var_11_DE:int
                        var_14_108 = var_12_104:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-136754978))
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-443046487))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1549450906))
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-1804144150))
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(915658397))
                        goto(Label_0759)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-1085579029))
                        goto(Label_0617)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-128694035))
                    }
                    else {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-295317545))
                        
                        if (cmplt:boolean(var_16_10C:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0617)
                            }
                            
                            goto(Label_0907)
                        }
                    }
                    
                    Label_0424:
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1453825835))
                        goto(Label_1590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-645795426))
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-1710408397))
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1287891763))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-87459121))
                        goto(Label_1031)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-301479844))
                        goto(Label_0759)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-65573437))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(-979146030))
                            var_11_DE = and:int(ldc:int(-24740), ldc:int(24739))
                            goto(Label_1579)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0617:
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-2000034126))
                        goto(Label_1590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1254741411))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-877823510))
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-593637342))
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(2133720450))
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(2132694845))
                            loopcontinue()
                        }
                        
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-315369757))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_108 = var_9_BB:double
                            goto(Label_0907)
                        }
                    }
                    
                    Label_0759:
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-316404408))
                        goto(Label_1590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(357608839))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-1531613967))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-680571821))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(5277061))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0617)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(1935346831))
                            loopcontinue()
                        }
                        
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-1842482))
                        var_14_108 = mul:double(ldc:double(0.5), add:double(var_9_BB:double, var_14_108:double))
                    }
                    
                    Label_0907:
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1618560372))
                        goto(Label_1590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(76729587))
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-677034129))
                        goto(Label_1190)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(-40287204))
                            goto(Label_0759)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0617)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-987145649))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DE = xor:int(ldc:int(16448), ldc:int(16449))
                                goto(Label_1190)
                            }
                        }
                    }
                    
                    Label_1031:
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-1435582457))
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(2109307638))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(-1090867489))
                            goto(Label_0907)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0759)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0617)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(-920732392))
                            loopcontinue()
                        }
                        
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-324410518))
                        var_11_DE = and:int(ldc:int(-9294), ldc:int(9293))
                    }
                    
                    Label_1190:
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1751726411))
                        goto(Label_1590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1031)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0907)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0759)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(-1095868470))
                            goto(Label_0617)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-734536070))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                                goto(Label_1442)
                            }
                        }
                    }
                    
                    Label_1297:
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-1552004536))
                        goto(Label_1590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1190)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1031)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(32)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(-1688386539))
                            goto(Label_0907)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(512)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(1486672595))
                            goto(Label_0759)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(2108481555))
                            goto(Label_0617)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0424)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(128)), ldc:int(0))) {
                            var_3_69E = and:int(var_3_69E:int, ldc:int(-1994111718))
                            loopcontinue()
                        }
                        
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-34903449))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_108:double, var_5_7D:int, var_16_10C:int)
                        goto(Label_1579)
                    }
                    
                    Label_1442:
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1045298539))
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-479156183))
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0759)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-1173259365))
                        goto(Label_0617)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1077542143))
                        goto(Label_0424)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_69E = and:int(var_3_69E:int, ldc:int(-964867369))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_108:double, ldc:double(0.0))
                    Label_1579:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A9 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DE:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1590:
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1442)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1297)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(512)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(1688471197))
                        goto(Label_1190)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1031)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0907)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(502461044))
                        goto(Label_0759)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0617)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-302792901))
                        goto(Label_0424)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69E = and:int(var_3_69E:int, ldc:int(-718962986))
                        var_17_6A9 = add:int(var_16_10C:int, xor:int(ldc:int(16976), ldc:int(16977)))
                        looporswitchbreak()
                    }
                }
                
                var_3_69E = and:int(var_3_69E:int, ldc:int(-700887086))
                
                if (cmple:boolean(var_5_7D = var_17_6A9:int, sub:int(var_6_84:int, and:int(ldc:int(577), ldc:int(28977))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_69E:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
