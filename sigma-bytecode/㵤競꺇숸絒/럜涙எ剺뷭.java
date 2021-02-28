public class \u3d64\u7af6\uae87\uc238\u7d52.\ub7dc\u6d99\u0b8e\u527a\ubded {
    public void \ub7dc\u6d99\u0b8e\u527a\ubded(java.io.File p0, boolean p1, java.lang.String p2) {
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
            invokespecial:Object(Object::<init>, this:\ub7dc\u6d99\u0b8e\u527a\ubded)
            putfield:AtomicBoolean(\ub7dc\u6d99\u0b8e\u527a\ubded::\ud217\u6b5f\u647c\u960f\u9937\u64ab, this:\ub7dc\u6d99\u0b8e\u527a\ubded, initobject:AtomicBoolean(AtomicBoolean::<init>))
            putfield:Map<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>(\ub7dc\u6d99\u0b8e\u527a\ubded::\ucb79\u1833\uc910\u8c8a\u4c04\uae87, this:\ub7dc\u6d99\u0b8e\u527a\ubded, invokestatic:LinkedHashMap[expected:Map<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>](Maps::newLinkedHashMap))
            putfield:\ub8be\u4ab3\u4f52\u4cd9\ub1b9(\ub7dc\u6d99\u0b8e\u527a\ubded::\u64ab\ubcb0\u98a4\ud217\u4ab3\u7873, this:\ub7dc\u6d99\u0b8e\u527a\ubded, initobject:\ub8be\u4ab3\u4f52\u4cd9\ub1b9(\ub8be\u4ab3\u4f52\u4cd9\ub1b9::<init>, p0:File, p1:boolean))
            putfield:\ua562\u759a\u7043\ubefe\u516c\ucef1<\u873d\ud523\u983f\u8d98\u0b8e\u8c8a>(\ub7dc\u6d99\u0b8e\u527a\ubded::\u3c25\u6c56\u3d64\uc3e3\ua6bd\u4ab3, this:\ub7dc\u6d99\u0b8e\u527a\ubded, initobject:\ua562\u759a\u7043\ubefe\u516c\ucef1<\u873d\ud523\u983f\u8d98\u0b8e\u8c8a>(\ua562\u759a\u7043\ubefe\u516c\ucef1<\u873d\ud523\u983f\u8d98\u0b8e\u8c8a>::<init>, initobject:\u8389\u61a4\u3776\ud4fe\u8aa5\u72f1[expected:\ua3b4\u8d98\u4f4a\uc84e\u72f1\u6fb0<? super \u873d\ud523\u983f\u8d98\u0b8e\u8c8a, ? extends Runnable>](\u8389\u61a4\u3776\ud4fe\u8aa5\u72f1::<init>, arraylength:int(invokestatic:\u62da\uae87\ubff1\ud523\u4975[](\u62da\uae87\ubff1\ud523\u4975::values))), invokestatic:Executor(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u59ec\u9a18\u7873\ufe34\u8413\u7ce1), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ub7dc\u6d99\u0b8e\u527a\ubded::\u3bd6\u494c\u8640\ud4fe\u8c8a\u12b2), and:int(ldc:int(-31159), ldc:int(31110)))), p2:String))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<java.lang.Void> \u9af2\u516c\u516c\u156b\u7049\u12cb(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1) {
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
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc \u5f50\uc3e3\u8cae\u5245\ua3b4\u6435(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0) {
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
    
    public java.util.concurrent.CompletableFuture<java.lang.Void> \u5140\u120d\u12b2\uff55\u5654\ub7dc() {
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
    
    private java.util.concurrent.CompletableFuture<T> \ua068\u5654\u9af2\u97b7\ub171\u0800(java.util.function.Supplier<com.mojang.datafixers.util.Either<T, java.lang.Exception>> p0) {
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
    
    private void \u5140\u385b\u76bc\u4975\u6ec6\ud4fe() {
        var_3_6E : Iterator<Entry<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>>
        var_4_8B : Entry<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>
        
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
            var_3_6E = invokeinterface:Iterator<Entry<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>>(Set<Entry<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>>::iterator, invokeinterface:Set<Entry<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>>(Map<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>::entrySet, getfield:Map<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>(\ub7dc\u6d99\u0b8e\u527a\ubded::\ucb79\u1833\uc910\u8c8a\u4c04\uae87, this:\ub7dc\u6d99\u0b8e\u527a\ubded)))
            
            if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_6E:Iterator)) {
                var_4_8B = checkcast:Entry<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>(java.util.Map.Entry<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\uc29a\uc31c\u392e\u6d69\u3bc9>.class, invokeinterface:Entry<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>(Iterator<Entry<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>>::next, var_3_6E:Iterator<Entry<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>>))
                invokeinterface:void(Iterator::remove, var_3_6E:Iterator)
                invokespecial:void(\ub7dc\u6d99\u0b8e\u527a\ubded::\u8753\u4492\u92ee\ua562\u6fb0\u64ab, this:\ub7dc\u6d99\u0b8e\u527a\ubded, checkcast:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c.class, invokeinterface:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(Entry<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>::getKey, var_4_8B:Entry<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>)), checkcast:\uc29a\uc31c\u392e\u6d69\u3bc9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\uc29a\uc31c\u392e\u6d69\u3bc9.class, invokeinterface:\uc29a\uc31c\u392e\u6d69\u3bc9(Entry<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>::getValue, var_4_8B:Entry<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>)))
                invokespecial:void(\ub7dc\u6d99\u0b8e\u527a\ubded::\u9255\u6d69\u946b\uc87f\u7bad\u3a62, this:\ub7dc\u6d99\u0b8e\u527a\ubded)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u9255\u6d69\u946b\uc87f\u7bad\u3a62() {
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
            invokevirtual:void(\ua562\u759a\u7043\ubefe\u516c\ucef1<\u873d\ud523\u983f\u8d98\u0b8e\u8c8a>::\ubb2b\ud4fe\ub18d\ub171\u98a4\u873d, getfield:\ua562\u759a\u7043\ubefe\u516c\ucef1<\u873d\ud523\u983f\u8d98\u0b8e\u8c8a>(\ub7dc\u6d99\u0b8e\u527a\ubded::\u3c25\u6c56\u3d64\uc3e3\ua6bd\u4ab3, this:\ub7dc\u6d99\u0b8e\u527a\ubded), initobject:\u873d\ud523\u983f\u8d98\u0b8e\u8c8a(\u873d\ud523\u983f\u8d98\u0b8e\u8c8a::<init>, invokevirtual:int(Enum<E>::ordinal, getstatic:\u62da\uae87\ubff1\ud523\u4975[expected:Enum<\u62da\uae87\ubff1\ud523\u4975>](\u62da\uae87\ubff1\ud523\u4975::\u6435\uc910\u8389\u7ce1\u9af2\u71f1)), invokedynamic:Runnable(run:(L\u3d64\u7af6\uae87\uc238\u7d52/\ub7dc\u6d99\u0b8e\u527a\ubded;)Ljava/lang/Runnable;, this:\ub7dc\u6d99\u0b8e\u527a\ubded)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u8753\u4492\u92ee\ua562\u6fb0\u64ab(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\uc29a\uc31c\u392e\u6d69\u3bc9 p1) {
        var_3_108 : int
        var_5_D5 : Exception
        
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
            var_3_108 = and:int(ldc:int(-903032639), ldc:int(-19118625))
            
            try {
                loop {
                    if (cmpeq:boolean(and:int(var_3_108:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0184)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_108:int, ldc:int(2)), ldc:int(0))) {
                        var_3_108 = and:int(var_3_108:int, ldc:int(-94084039))
                    }
                    else {
                        var_3_108 = and:int(var_3_108:int, ldc:int(-829721489))
                        invokevirtual:void(\ub8be\u4ab3\u4f52\u4cd9\ub1b9::\u5654\ubf56\u59ec\u3504\u52d3\u92ee, getfield:\ub8be\u4ab3\u4f52\u4cd9\ub1b9(\ub7dc\u6d99\u0b8e\u527a\ubded::\u64ab\ubcb0\u98a4\ud217\u4ab3\u7873, this:\ub7dc\u6d99\u0b8e\u527a\ubded), p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c, invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\uc29a\uc31c\u392e\u6d69\u3bc9::\uc238\u36d3\ub171\ubded\ucef1\u93a2, p1:\uc29a\uc31c\u392e\u6d69\u3bc9))
                    }
                    
                    Label_0141:
                    
                    if (cmpeq:boolean(and:int(var_3_108:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_108:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_108 = and:int(var_3_108:int, ldc:int(1298856435))
                            loopcontinue()
                        }
                        
                        var_3_108 = and:int(var_3_108:int, ldc:int(-818361099))
                        invokevirtual:boolean(CompletableFuture<Void>::complete, invokestatic:CompletableFuture(\uc29a\uc31c\u392e\u6d69\u3bc9::\ud36e\u74b1\u7330\u8d98\u8cae\u3c25, p1:\uc29a\uc31c\u392e\u6d69\u3bc9), checkcast:Void(java.lang.Void.class, aconstnull:Void()))
                    }
                    
                    Label_0184:
                    
                    if (cmpeq:boolean(and:int(var_3_108:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0141)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_108:int, ldc:int(524288)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_3_108 = and:int(var_3_108:int, ldc:int(-645337895))
            }
            catch (java.lang.Exception var_5_D5) {
                do {
                    if (cmpeq:boolean(and:int(var_3_108:int, ldc:int(512)), ldc:int(0))) {
                        var_3_108 = and:int(var_3_108:int, ldc:int(-906050329))
                        invokeinterface:void(Logger::error, getstatic:Logger(\ub7dc\u6d99\u0b8e\u527a\ubded::\uf995\u8bb0\ud51e\ud12e\uc31c\uf995), loadelement:String(getstatic:String[](\ub7dc\u6d99\u0b8e\u527a\ubded::\u3bd6\u494c\u8640\ud4fe\u8c8a\u12b2), xor:int(ldc:int(8205), ldc:int(8204))), p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object], var_5_D5:Exception[expected:Object])
                    }
                } while (cmpeq:boolean(and:int(var_3_108:int, ldc:int(1)), ldc:int(0)))
                
                var_3_108 = and:int(var_3_108:int, ldc:int(-902051077))
                invokevirtual:boolean(CompletableFuture::completeExceptionally, invokestatic:CompletableFuture(\uc29a\uc31c\u392e\u6d69\u3bc9::\ud36e\u74b1\u7330\u8d98\u8cae\u3c25, p1:\uc29a\uc31c\u392e\u6d69\u3bc9), var_5_D5:Exception[expected:Throwable])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void close() {
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
    
    private static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u873d\ud523\u983f\u8d98\u0b8e\u8c8a lambda$\u5fe1\ua562\u12b2\u4cd9\u88c5\u98a4$11(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p0) {
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
    
    private static void lambda$\u6c52\ub6ab\uf9c5\u4d85\u4f52\u47c2$10(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p0) {
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
            invokeinterface:void(\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>::\ubb2b\ud4fe\ub18d\ub171\u98a4\u873d, p0:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, getstatic:\u3bc9\u4492\u69d9\ud12e\uc238\u6c56(\u3bc9\u4492\u69d9\ud12e\uc238\u6c56::\u93a2\u4bc8\u5d20\ub32d\u836c\u72f1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u873d\ud523\u983f\u8d98\u0b8e\u8c8a lambda$\u600f\u759a\uafe7\u67e9\u64ab\ubded$9(java.util.function.Supplier p0, \u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p1) {
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
    
    private void lambda$\uc238\u71f1\ua3b4\u3504\u3776\u74b1$8(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p0, java.util.function.Supplier p1) {
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
            
            if (logicalnot:boolean(invokevirtual:boolean(AtomicBoolean::get, getfield:AtomicBoolean(\ub7dc\u6d99\u0b8e\u527a\ubded::\ud217\u6b5f\u647c\u960f\u9937\u64ab, this:\ub7dc\u6d99\u0b8e\u527a\ubded)))) {
                invokeinterface:void(\u9a18\u62da\ucfaf\u92ee\u183a\u6198<Object>::\ubb2b\ud4fe\ub18d\ub171\u98a4\u873d, p0:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<Object>, invokeinterface:Object(Supplier<Object>::get, p1:Supplier<Object>))
            }
            
            invokespecial:void(\ub7dc\u6d99\u0b8e\u527a\ubded::\u9255\u6d69\u946b\uc87f\u7bad\u3a62, this:\ub7dc\u6d99\u0b8e\u527a\ubded)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletionStage lambda$\u4f52\u4f4a\u8df4\u183a\u6d99\ud36e$7(java.lang.Void p0) {
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
    
    private com.mojang.datafixers.util.Either lambda$\ud51e\u9a18\ub113\u67d0\u946b\u6b5f$6() {
        var_1_8D : int
        stack_9B_0 : Either [generated]
        var_3_A0 : Exception
        
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
        var_1_8D = and:int(ldc:int(213382249), ldc:int(1966587371))
        
        try {
            do {
                if (cmpeq:boolean(and:int(var_1_8D:int, ldc:int(64)), ldc:int(0))) {
                    var_1_8D = and:int(var_1_8D:int, ldc:int(1739055513))
                }
                else {
                    var_1_8D = and:int(var_1_8D:int, ldc:int(1723645036))
                    invokevirtual:void(\ub8be\u4ab3\u4f52\u4cd9\ub1b9::\uc238\uc3e3\u4c2b\uc84e\uc29a\ua068, getfield:\ub8be\u4ab3\u4f52\u4cd9\ub1b9(\ub7dc\u6d99\u0b8e\u527a\ubded::\u64ab\ubcb0\u98a4\ud217\u4ab3\u7873, this:\ub7dc\u6d99\u0b8e\u527a\ubded))
                }
            } while (cmpeq:boolean(and:int(var_1_8D:int, ldc:int(32)), ldc:int(0)))
            
            var_1_8D = and:int(var_1_8D:int, ldc:int(548912874))
            stack_9B_0 = invokestatic:Either(Either::left, checkcast:Void[expected:Object](java.lang.Void.class, aconstnull:Void()))
            var_1_8D = and:int(var_1_8D:int, ldc:int(-230903944))
            return:Either(stack_9B_0:Either)
        }
        catch (java.lang.Exception var_3_A0) {
            invokeinterface:void(Logger::warn, getstatic:Logger(\ub7dc\u6d99\u0b8e\u527a\ubded::\uf995\u8bb0\ud51e\ud12e\uc31c\uf995), loadelement:String(getstatic:String[](\ub7dc\u6d99\u0b8e\u527a\ubded::\u3bd6\u494c\u8640\ud4fe\u8c8a\u12b2), xor:int(ldc:int(162), ldc:int(161))), var_3_A0:Exception[expected:Throwable])
            return:Either(invokestatic:Either(Either::right, var_3_A0:Exception[expected:Object]))
        }
    }
    
    private com.mojang.datafixers.util.Either lambda$\u873d\u9033\uc2bd\u4c04\ucef1\u3d4b$5() {
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
    
    private static java.util.concurrent.CompletableFuture[] lambda$\u99f7\ud171\uc3e3\u61a4\u8258\u4d85$4(int p0) {
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
            return:CompletableFuture[](newarray:CompletableFuture[](java.util.concurrent.CompletableFuture.class, p0:int))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\u8aa5\uceb8\ub1b9\u3d64\uf995\u8640$3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\uc29a\uc31c\u392e\u6d69\u3bc9 p0) {
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
            return:CompletableFuture(invokestatic:CompletableFuture(\uc29a\uc31c\u392e\u6d69\u3bc9::\ud36e\u74b1\u7330\u8d98\u8cae\u3c25, p0:\uc29a\uc31c\u392e\u6d69\u3bc9))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.datafixers.util.Either lambda$\u946b\ua068\ubff1\u40a9\ud4fe\uff55$2(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0) {
        var_2_EC : int
        var_4_75 : \uc29a\uc31c\u392e\u6d69\u3bc9
        var_5_E5 : \uc31c\uc87f\uc246\u3776\ub7dc
        stack_F8_0 : Either [generated]
        var_5_FD : Exception
        
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
        var_2_EC = and:int(and:int(ldc:int(-1199202149), ldc:int(766767240)), ldc:int(-1464189715))
        var_4_75 = checkcast:\uc29a\uc31c\u392e\u6d69\u3bc9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\uc29a\uc31c\u392e\u6d69\u3bc9.class, invokeinterface:\uc29a\uc31c\u392e\u6d69\u3bc9(Map<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>::get, getfield:Map<\u120d\u2dcc\ubff1\uceb8\ube23\u647c, \uc29a\uc31c\u392e\u6d69\u3bc9>(\ub7dc\u6d99\u0b8e\u527a\ubded::\ucb79\u1833\uc910\u8c8a\u4c04\uae87, this:\ub7dc\u6d99\u0b8e\u527a\ubded), p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object]))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_EC:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0168)
            }
            
            if (cmpeq:boolean(and:int(var_2_EC:int, ldc:int(16384)), ldc:int(0))) {
                var_2_EC = and:int(var_2_EC:int, ldc:int(-84990005))
                
                if (cmpeq:boolean(var_4_75:\uc29a\uc31c\u392e\u6d69\u3bc9, aconstnull:\uc29a\uc31c\u392e\u6d69\u3bc9())) {
                    try {
                        var_5_E5 = invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\ub8be\u4ab3\u4f52\u4cd9\ub1b9::\ua068\u88c5\ub1b9\u5bc4\u3e2a\uff55, getfield:\ub8be\u4ab3\u4f52\u4cd9\ub1b9(\ub7dc\u6d99\u0b8e\u527a\ubded::\u64ab\ubcb0\u98a4\ud217\u4ab3\u7873, this:\ub7dc\u6d99\u0b8e\u527a\ubded), p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)
                        var_2_EC = and:int(var_2_EC:int, ldc:int(965881259))
                        stack_F8_0 = invokestatic:Either(Either::left, var_5_E5:\uc31c\uc87f\uc246\u3776\ub7dc[expected:Object])
                        var_2_EC = and:int(var_2_EC:int, ldc:int(-21289747))
                        return:Either(stack_F8_0:Either)
                    }
                    catch (java.lang.Exception var_5_FD) {
                        invokeinterface:void(Logger::warn, getstatic:Logger(\ub7dc\u6d99\u0b8e\u527a\ubded::\uf995\u8bb0\ud51e\ud12e\uc31c\uf995), loadelement:String(getstatic:String[](\ub7dc\u6d99\u0b8e\u527a\ubded::\u3bd6\u494c\u8640\ud4fe\u8c8a\u12b2), xor:int(ldc:int(1170), ldc:int(1174))), p0:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object], var_5_FD:Exception[expected:Object])
                        return:Either(invokestatic:Either(Either::right, var_5_FD:Exception[expected:Object]))
                    }
                }
            }
            
            Label_0146:
            
            if (cmpne:boolean(and:int(var_2_EC:int, ldc:int(8)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_EC:int, ldc:int(536870912)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_EC = and:int(var_2_EC:int, ldc:int(2029137820))
            }
            
            Label_0168:
            
            if (cmpeq:boolean(and:int(var_2_EC:int, ldc:int(134217728)), ldc:int(0))) {
                var_2_EC = and:int(var_2_EC:int, ldc:int(-1282500807))
                goto(Label_0146)
            }
            
            if (cmpeq:boolean(and:int(var_2_EC:int, ldc:int(64)), ldc:int(0))) {
                return:Either(invokestatic:Either(Either::left, invokestatic:\uc31c\uc87f\uc246\u3776\ub7dc(\uc29a\uc31c\u392e\u6d69\u3bc9::\uc238\u36d3\ub171\ubded\ucef1\u93a2, var_4_75:\uc29a\uc31c\u392e\u6d69\u3bc9)))
            }
            
            var_2_EC = and:int(var_2_EC:int, ldc:int(462659697))
        }
    }
    
    private com.mojang.datafixers.util.Either lambda$\u5140\uf94d\u74b1\u7bad\u4d85\u873d$1(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p1) {
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
    
    private static \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\uc29a\uc31c\u392e\u6d69\u3bc9 lambda$\u8d90\u3c25\u7049\u960f\uff55\ud171$0(\u392e\ud7e8\u3bc9\u88c5\ud51e.\uc31c\uc87f\uc246\u3776\ub7dc p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p1) {
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
            return:\uc29a\uc31c\u392e\u6d69\u3bc9(initobject:\uc29a\uc31c\u392e\u6d69\u3bc9(\uc29a\uc31c\u392e\u6d69\u3bc9::<init>, p0:\uc31c\uc87f\uc246\u3776\ub7dc))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_281 : int
        expr_6E : int [generated]
        stack_9D_0 : byte[] [generated]
        stack_9F_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_F7_0 : byte[] [generated]
        stack_1D7_0 : byte[] [generated]
        stack_22E_0 : byte[] [generated]
        stack_294_0 : byte[] [generated]
        var_4_1AF : int
        var_3_1B4 : byte[]
        var_5_1B5 : int
        expr_1DA : byte [generated]
        var_0_1C4 : int
        var_0_28A : int
        expr_294 : byte [generated]
        stack_2C4_2 : byte [generated]
        var_2_9D : byte[]
        expr_A1 : int [generated]
        var_3_21C : byte[]
        var_5_21D : int
        expr_C9 : int [generated]
        var_3_103 : String
        stack_1A2_0 : String[] [generated]
        expr_115 : String[] [generated]
        
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
        var_0_281 = and:int(ldc:int(-1302157552), ldc:int(-250137325))
        expr_6E = arraylength:int(stack_9D_0 = stack_9F_0 = stack_C7_0 = stack_C9_0 = stack_F7_0 = stack_1D7_0 = stack_22E_0 = stack_294_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("4TpYRt46sfBGuTgoQPI2hVZWQkomllDpOlhG3jqx8CirdFDQUKMALELCPJG0aOk6WEbeOrHwKIlWVkLyUqUALELCPJG0aOk6WEbeOrHwKJlceFo8IlBWPFZ22lijACxCJJSSOBQQWEYqoDGOVA==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1AF = expr_6E:int
        var_3_1B4 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1B5 = expr_6E:int
        Label_0439:
        
        while (cmpne:boolean(and:int(var_0_281:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_281 = and:int(var_0_281:int, ldc:int(-1538837518))
            var_5_1B5 = add:int(var_5_1B5:int, ldc:int(-1))
            expr_1DA = xor:byte(loadelement:byte(stack_1D7_0:byte[], var_5_1B5:int), ldc:byte(17))
            storeelement:byte(var_3_1B4:byte[], var_5_1B5:int, add:int(or:int(and:int(shl:int(expr_1DA:byte, xor:int(ldc:int(12295), ldc:int(12291))), ldc:int(-16)), and:int(shr:int(expr_1DA:byte[expected:int], xor:int(ldc:int(640), ldc:int(644))), ldc:int(15))), ldc:int(12)))
            
            if (cmpne:boolean(var_5_1B5:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9F_0 = stack_9D_0 = stack_C7_0 = stack_C9_0 = stack_F7_0 = stack_1D7_0 = stack_22E_0 = stack_294_0 = var_3_1B4:byte[]
            goto(Label_0115)
        }
        
        var_0_1C4 = and:int(var_0_281:int, ldc:int(-23354475))
        Label_0629:
        
        while (cmpeq:boolean(and:int(var_0_1C4:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_28A = and:int(var_0_1C4:int, ldc:int(-1249464418))
            var_5_1B5 = add:int(var_5_1B5:int, ldc:int(-1))
            expr_294 = loadelement:byte(stack_294_0:byte[], var_5_1B5:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1B5:int, ldc:int(2)), neg:int(var_4_1AF:int)), ldc:int(0))) {
                var_0_28A = and:int(var_0_28A:int, ldc:int(-1532235503))
                stack_2C4_2 = add:byte(expr_294:byte, ldc:byte(2))
            }
            else {
                stack_2C4_2 = add:byte(expr_294:byte, loadelement:byte(var_3_1B4:byte[], add:int(var_5_1B5:int, ldc:int(2))))
            }
            
            var_0_1C4 = and:int(var_0_28A:int, ldc:int(-367545062))
            storeelement:byte(var_3_1B4:byte[], var_5_1B5:int, stack_2C4_2:byte)
            
            if (cmpne:boolean(var_5_1B5:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9F_0 = stack_9D_0 = stack_C7_0 = stack_C9_0 = stack_F7_0 = stack_1D7_0 = stack_22E_0 = stack_294_0 = var_3_1B4:byte[]
            goto(Label_0206)
        }
        
        var_0_281 = and:int(var_0_1C4:int, ldc:int(-1753134804))
        goto(Label_0439)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_281:int, ldc:int(2048)), ldc:int(0))) {
            var_0_1C4 = and:int(var_0_281:int, ldc:int(1113235256))
            goto(Label_0206)
        }
        
        if (cmpne:boolean(and:int(var_0_281:int, ldc:int(524288)), ldc:int(0))) {
            var_0_1C4 = and:int(var_0_281:int, ldc:int(-748393579))
        }
        else {
            var_0_1C4 = and:int(var_0_281:int, ldc:int(-1231130794))
            var_2_9D = stack_9D_0:byte[]
            expr_A1 = add:int(arraylength:int(stack_9F_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A1:int, ldc:int(0))) {
                var_3_21C = newarray:byte[](byte.class, expr_A1:int)
                var_5_21D = expr_A1:int
                
                loop {
                    var_0_1C4 = and:int(var_0_1C4:int, ldc:int(-1251791591))
                    var_5_21D = add:int(var_5_21D:int, ldc:int(-1))
                    storeelement:byte(var_3_21C:byte[], var_5_21D:int, add:int(shl:int(loadelement:byte(stack_22E_0:byte[], var_5_21D:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_9D:byte[], add:int(var_5_21D:int, xor:int(ldc:int(6164), ldc:int(6165)))), ldc:int(5)), xor:int(ldc:int(2330), ldc:int(2333)))))
                    
                    if (cmpne:boolean(var_5_21D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9F_0 = stack_9D_0 = stack_C7_0 = stack_C9_0 = stack_F7_0 = stack_1D7_0 = stack_22E_0 = stack_294_0 = var_3_21C:byte[]
            }
        }
        
        Label_0166:
        
        if (cmpne:boolean(and:int(var_0_1C4:int, ldc:int(256)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_1C4:int, ldc:int(524288)), ldc:int(0))) {
                var_0_281 = and:int(var_0_1C4:int, ldc:int(1091896623))
                goto(Label_0115)
            }
            
            var_0_1C4 = and:int(var_0_1C4:int, ldc:int(-293933676))
            expr_C9 = arraylength:int(stack_C9_0:byte[])
            
            if (cmpne:boolean(expr_C9:int, ldc:int(0))) {
                var_4_1AF = expr_C9:int
                var_3_1B4 = newarray:byte[](byte.class, expr_C9:int)
                var_5_1B5 = expr_C9:int
                goto(Label_0629)
            }
        }
        
        Label_0206:
        
        if (cmpeq:boolean(and:int(var_0_1C4:int, ldc:int(8192)), ldc:int(0))) {
            var_0_1C4 = and:int(var_0_1C4:int, ldc:int(-1412157195))
            goto(Label_0166)
        }
        
        if (cmpeq:boolean(and:int(var_0_1C4:int, ldc:int(131072)), ldc:int(0))) {
            var_0_281 = and:int(var_0_1C4:int, ldc:int(1554777667))
            goto(Label_0115)
        }
        
        var_3_103 = initobject:String(String::<init>, stack_F7_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1A2_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(19461), ldc:int(15)))
        expr_115 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(18439), ldc:int(4757)))
        storeelement:String(expr_115:String[], xor:int(ldc:int(8322), ldc:int(8320)), invokevirtual:String[expected:String](String::substring, var_3_103:String, and:int(ldc:int(-3517), ldc:int(2348)), xor:int(ldc:int(8277), ldc:int(8258))))
        storeelement:String(expr_115:String[], and:int(ldc:int(16901), ldc:int(8454)), invokevirtual:String[expected:String](String::substring, var_3_103:String, and:int(ldc:int(2455), ldc:int(20567)), xor:int(ldc:int(26661), ldc:int(26635))))
        storeelement:String(expr_115:String[], and:int(ldc:int(521), ldc:int(26881)), invokevirtual:String[expected:String](String::substring, var_3_103:String, xor:int(ldc:int(1286), ldc:int(1320)), and:int(ldc:int(70), ldc:int(1150))))
        storeelement:String(expr_115:String[], xor:int(ldc:int(-24562), ldc:int(-24563)), invokevirtual:String[expected:String](String::substring, var_3_103:String, and:int(ldc:int(2118), ldc:int(5215)), xor:int(ldc:int(74), ldc:int(41))))
        storeelement:String(expr_115:String[], and:int(ldc:int(-22024), ldc:int(5639)), invokevirtual:String[expected:String](String::substring, var_3_103:String, xor:int(ldc:int(175), ldc:int(204)), and:int(ldc:int(16748), ldc:int(11884))))
        putstatic:String[](\ub7dc\u6d99\u0b8e\u527a\ubded::\u3bd6\u494c\u8640\ud4fe\u8c8a\u12b2, expr_115:String[])
        putstatic:Logger(\ub7dc\u6d99\u0b8e\u527a\ubded::\uf995\u8bb0\ud51e\ud12e\uc31c\uf995, invokestatic:Logger(LogManager::getLogger))
    }
    
    public void \u873d\u61a4\ubff1\u8389\u3a62\u71f1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BA : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6C5 : int
        
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
        var_3_6BA = and:int(ldc:int(1859188292), ldc:int(167132542))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub7dc\u6d99\u0b8e\u527a\ubded[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-999991325))
        }
        else {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1720633625))
            var_5_8A = and:int(ldc:int(-9242), ldc:int(9241))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(3972), ldc:int(-4053)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6BA:int, ldc:int(-1913423298))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(25241), ldc:int(69)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(9216), ldc:int(9217)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6BA = and:int(var_3_DA:int, ldc:int(-127435681))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(23107), ldc:int(257)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-987902170))
                        goto(Label_1593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1669675684))
                        goto(Label_1437)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1267155973))
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1143)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(611169024))
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(994508101))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1285791876))
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1545357528))
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(987688095))
                        goto(Label_1143)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1938686270))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-285542348))
                            var_11_EB = and:int(ldc:int(5985), ldc:int(-14180))
                            goto(Label_1582)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(565843142))
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(399251196))
                        goto(Label_1143)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2066553313))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(383369547))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-344493305))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(57695916))
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-921304571))
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1699436886))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1358917818))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1062106692))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1141458025))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1352731))
                        goto(Label_1437)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(439230850))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2095981133))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-488147004))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1931970884))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(-32494), ldc:int(-32493))
                                goto(Label_1143)
                            }
                        }
                    }
                    
                    Label_0966:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1896345385))
                        goto(Label_1593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1437)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1821908781))
                        goto(Label_1275)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1390370004))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(2051139603))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1997706776))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1499488576))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1644987537))
                        var_11_EB = and:int(ldc:int(-9608), ldc:int(9479))
                    }
                    
                    Label_1143:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1156589695))
                        goto(Label_1593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1437)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-605861974))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0966)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-946046999))
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1247117315))
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(30748968))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1768290964))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1437)
                            }
                        }
                    }
                    
                    Label_1275:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(772066970))
                        goto(Label_1593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(834983533))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-621227057))
                            goto(Label_1143)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1582108439))
                            goto(Label_0966)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1574949998))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(607297271))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2014137550))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(2046688245))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1582)
                    }
                    
                    Label_1437:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1046162546))
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-721107699))
                        goto(Label_0966)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(317541632))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-691389783))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-756321565))
                        loopcontinue()
                    }
                    
                    var_3_6BA = and:int(var_3_6BA:int, ldc:int(787837950))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1582:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C5 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1593:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(773863956))
                        goto(Label_1437)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(15081880))
                        goto(Label_1275)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1167723871))
                        goto(Label_1143)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2040739811))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(19574346))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1438158162))
                        var_17_6C5 = add:int(var_16_119:int, and:int(ldc:int(17681), ldc:int(8193)))
                        looporswitchbreak()
                    }
                    
                    var_3_6BA = and:int(var_3_6BA:int, ldc:int(1394079694))
                }
                
                var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1084434))
                
                if (cmple:boolean(var_5_8A = var_17_6C5:int, sub:int(var_6_91:int, and:int(ldc:int(21517), ldc:int(8963))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
