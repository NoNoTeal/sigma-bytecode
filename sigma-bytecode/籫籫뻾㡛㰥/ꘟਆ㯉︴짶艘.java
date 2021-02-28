public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258 {
    public void \ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258(\u71f1\uc910\u3bc9\u516c\u93a2.\u0b8e\u8709\u40a9\ud217\u960f\u99f7 p0, java.util.concurrent.Executor p1) {
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
            invokespecial:Object(Object::<init>, this:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258)
            putfield:Set<\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4>(\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258::\uc2e8\u47c2\u61a4\ud523\ud158\u960f, this:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokestatic:Set(Sets::newIdentityHashSet))
            putfield:\u0b8e\u8709\u40a9\ud217\u960f\u99f7(\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258::\uc29a\u1833\u3d4b\u4ab3\u74b1\ubcb0, this:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, p0:\u0b8e\u8709\u40a9\ud217\u960f\u99f7)
            putfield:Executor(\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258::\u6d99\u4e72\u965f\u927d\u97b7\u3e2a, this:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, p1:Executor)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4> \u8350\u4179\u71f1\ucef1\u8308\u760c(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u56bd\ube23\u99f7\ubf56\u64ab\ud12e p0) {
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
    
    public void \ub6ab\u1833\u71f1\u64ab\u8709\u5db4(java.util.function.Consumer<java.util.stream.Stream<\u56bd\u8413\u647c\u5bc4\ud158.\u392e\u7330\u4f52\u99f7\u7043\u647c>> p0) {
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
    
    public void \ud51e\u8cae\uf94d\u8aa5\u5245\u6435() {
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
    
    public void \ud4fe\u647c\ub102\u9033\u4daf\u3504() {
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
            invokeinterface:void(Iterable<Object>::forEach, getfield:Set<\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4>[expected:Iterable<Object>](\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258::\uc2e8\u47c2\u61a4\ud523\ud158\u960f, this:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258), invokedynamic:Consumer<? super Object>(accept:()Ljava/util/function/Consumer;))
            invokeinterface:void(Set<E>::clear, getfield:Set<\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4>(\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258::\uc2e8\u47c2\u61a4\ud523\ud158\u960f, this:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u9937\u40a9\ud523\u7d52\u624e\uc9f6$3() {
        var_1_5F : int
        var_3_69 : Iterator<\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4>
        var_1_75 : int
        var_4_A9 : \u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4
        
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
            var_1_5F = and:int(ldc:int(1888199032), ldc:int(-308058769))
            var_3_69 = invokeinterface:Iterator<\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4>(Set<\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4>::iterator, getfield:Set<\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4>(\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258::\uc2e8\u47c2\u61a4\ud523\ud158\u960f, this:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_5F:int, ldc:int(65536)), ldc:int(0))) {
                    var_1_75 = and:int(var_1_5F:int, ldc:int(-264786885))
                }
                else {
                    var_1_75 = and:int(var_1_5F:int, ldc:int(2125441000))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_69:Iterator)) {
                        var_4_A9 = checkcast:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4.class, invokeinterface:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4(Iterator<\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4>::next, var_3_69:Iterator<\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4>))
                        invokevirtual:void(\u392e\u7330\u4f52\u99f7\u7043\u647c::\u927d\ua3b4\u6c56\u516c\ud158\u92ff, invokestatic:\u392e\u7330\u4f52\u99f7\u7043\u647c(\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4::\u183a\u392e\ubf56\u3bc9\u69d9\uf94d, var_4_A9:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4))
                        
                        if (invokevirtual:boolean(\u392e\u7330\u4f52\u99f7\u7043\u647c::\uc246\u4975\u3bc9\u3d4b\u8bb0\u8308, invokestatic:\u392e\u7330\u4f52\u99f7\u7043\u647c(\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4::\u183a\u392e\ubf56\u3bc9\u69d9\uf94d, var_4_A9:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4))) {
                            invokevirtual:void(\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4::\uf995\u5bc4\u56bd\u4ab3\u8308\u7bad, var_4_A9:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4)
                            invokeinterface:void(Iterator::remove, var_3_69:Iterator)
                        }
                        
                        var_1_5F = and:int(var_1_75:int, ldc:int(-69764129))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_75:int, ldc:int(256)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_5F = and:int(var_1_75:int, ldc:int(-1387784213))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6435\u3504\u64ab\ua562\ube23\u64ab$2(java.util.function.Consumer p0) {
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
    
    private static \u56bd\u8413\u647c\u5bc4\ud158.\u392e\u7330\u4f52\u99f7\u7043\u647c lambda$\ucb79\u5fe1\u8308\uc3e3\uc4d2\u3504$1(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4 p0) {
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
            return:\u392e\u7330\u4f52\u99f7\u7043\u647c(invokestatic:\u392e\u7330\u4f52\u99f7\u7043\u647c(\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4::\u183a\u392e\ubf56\u3bc9\u69d9\uf94d, p0:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u51fa\u873d\u8d90\u8df4\u36d3\u5bc4$0(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u56bd\ube23\u99f7\ubf56\u64ab\ud12e p0, java.util.concurrent.CompletableFuture p1) {
        var_3_5F : int
        var_5_68 : \u392e\u7330\u4f52\u99f7\u7043\u647c
        var_6_8E : \u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4
        
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
            var_3_5F = and:int(ldc:int(1422652768), ldc:int(-505826705))
            var_5_68 = invokevirtual:\u392e\u7330\u4f52\u99f7\u7043\u647c(\u0b8e\u8709\u40a9\ud217\u960f\u99f7::\u3d4b\u8258\u8bb0\u8df4\u5fe1\ud36e, getfield:\u0b8e\u8709\u40a9\ud217\u960f\u99f7(\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258::\uc29a\u1833\u3d4b\u4ab3\u74b1\ubcb0, this:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258), p0:\u56bd\ube23\u99f7\ubf56\u64ab\ud12e)
            
            if (cmpeq:boolean(var_5_68:\u392e\u7330\u4f52\u99f7\u7043\u647c, aconstnull:\u392e\u7330\u4f52\u99f7\u7043\u647c())) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-1241586750))
                invokevirtual:boolean(CompletableFuture<\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4>::complete, p1:CompletableFuture<\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4>, checkcast:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4.class, aconstnull:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4()))
            }
            else {
                var_6_8E = initobject:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4(\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4::<init>, this:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, var_5_68:\u392e\u7330\u4f52\u99f7\u7043\u647c)
                invokeinterface:boolean(Set<\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4>::add, getfield:Set<\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4>(\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258::\uc2e8\u47c2\u61a4\ud523\ud158\u960f, this:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258), var_6_8E:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4)
                invokevirtual:boolean(CompletableFuture<\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4>::complete, p1:CompletableFuture<\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4>, var_6_8E:\u4492\u3d4b\u4daf\u9af2\u6b5f\u98a4)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.util.concurrent.Executor \u4492\u4c2b\uae5d\u98a4\u64f2\uc3e3(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258 p0) {
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
            return:Executor(getfield:Executor(\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258::\u6d99\u4e72\u965f\u927d\u97b7\u3e2a, p0:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258))
        }
        
        goto(Label_0006)
    }
    
    public static \u71f1\uc910\u3bc9\u516c\u93a2.\u0b8e\u8709\u40a9\ud217\u960f\u99f7 \u8753\u7c6b\ud523\ua562\u8413\u12b2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258 p0) {
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
            return:\u0b8e\u8709\u40a9\ud217\u960f\u99f7(getfield:\u0b8e\u8709\u40a9\ud217\u960f\u99f7(\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258::\uc29a\u1833\u3d4b\u4ab3\u74b1\ubcb0, p0:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258))
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
    
    public void \u97b7\u6198\ud7e8\u8bb0\u3d64\u36d3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_690 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_69B : int
        
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
        var_3_690 = and:int(ldc:int(1240114980), ldc:int(-578163023))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_690 = and:int(var_3_690:int, ldc:int(-538050649))
            var_5_81 = and:int(ldc:int(11097), ldc:int(-32606))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(1053), ldc:int(-1054)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_690:int, ldc:int(-305551555))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(553), ldc:int(2117)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(1066), ldc:int(1067)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_690 = and:int(var_3_DA:int, ldc:int(2106585001))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-15232), ldc:int(-15231)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-159143104))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1950323408))
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0984)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0851)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0737)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(299602565))
                    }
                    else {
                        var_3_690 = and:int(var_3_690:int, ldc:int(1809774369))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0594)
                            }
                            
                            goto(Label_0851)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1070618626))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1827480641))
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1610579732))
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-900798659))
                        goto(Label_0984)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-821666238))
                        goto(Label_0851)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0737)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(712197842))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-1739444884))
                            loopcontinue()
                        }
                        
                        var_3_690 = and:int(var_3_690:int, ldc:int(-376656265))
                        var_11_EB = and:int(ldc:int(-11665), ldc:int(11664))
                        goto(Label_1547)
                    }
                    
                    Label_0594:
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1041217066))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-675170666))
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1369952695))
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-581346036))
                        goto(Label_0984)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1826662036))
                        goto(Label_0851)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-362915353))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_690 = and:int(var_3_690:int, ldc:int(1235201900))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0851)
                        }
                    }
                    
                    Label_0737:
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1621352144))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(1296745865))
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0984)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_690 = and:int(var_3_690:int, ldc:int(-912396375))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0851:
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1954224273))
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-694518715))
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(1234522740))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0737)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(361578750))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(518501862))
                            loopcontinue()
                        }
                        
                        var_3_690 = and:int(var_3_690:int, ldc:int(-274729224))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(2056), ldc:int(2057))
                                goto(Label_1152)
                            }
                        }
                    }
                    
                    Label_0984:
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(2051611643))
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0851)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-423962343))
                            goto(Label_0737)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(338032796))
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(1438336194))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-1261558023))
                            loopcontinue()
                        }
                        
                        var_3_690 = and:int(var_3_690:int, ldc:int(2039349097))
                        var_11_EB = and:int(ldc:int(3698), ldc:int(-3699))
                    }
                    
                    Label_1152:
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(32)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(1862907288))
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-1700141847))
                            goto(Label_0984)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0851)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(32)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(88863547))
                            goto(Label_0737)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0594)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-2140139527))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(1221675982))
                            loopcontinue()
                        }
                        
                        var_3_690 = and:int(var_3_690:int, ldc:int(-36968854))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1420)
                            }
                        }
                    }
                    
                    Label_1285:
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-209446780))
                            goto(Label_1152)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0984)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-220943045))
                            goto(Label_0851)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(16)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(-14549045))
                            goto(Label_0737)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0594)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_690:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_690 = and:int(var_3_690:int, ldc:int(1720144207))
                            loopcontinue()
                        }
                        
                        var_3_690 = and:int(var_3_690:int, ldc:int(1806282665))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1547)
                    }
                    
                    Label_1420:
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-1743086610))
                        goto(Label_1558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-107903349))
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0984)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0851)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0737)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0594)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(32)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(1882669242))
                        loopcontinue()
                    }
                    
                    var_3_690 = and:int(var_3_690:int, ldc:int(-370495837))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1547:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_69B = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1558:
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(851097574))
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1152)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(1805364907))
                        goto(Label_0984)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(799459787))
                        goto(Label_0851)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(1779056666))
                        goto(Label_0737)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-97687300))
                        goto(Label_0594)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_690:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_690 = and:int(var_3_690:int, ldc:int(-370348424))
                        var_17_69B = add:int(var_16_119:int, and:int(ldc:int(20645), ldc:int(10241)))
                        looporswitchbreak()
                    }
                }
                
                var_3_690 = and:int(var_3_690:int, ldc:int(2147073699))
                
                if (cmple:boolean(var_5_81 = var_17_69B:int, sub:int(var_6_88:int, and:int(ldc:int(17411), ldc:int(4681))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_690:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_690 = and:int(var_3_690:int, ldc:int(779421331))
            goto(Label_0108)
        }
    }
}
