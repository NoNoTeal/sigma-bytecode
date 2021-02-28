public class \u6435\ub8be\u718f\u6b0d\u67e9.\u7ce1\ud158\u927d\u5f50\uc29a {
    public void \u7ce1\ud158\u927d\u5f50\uc29a(java.util.List<\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198<?>> p0, java.util.concurrent.Executor p1, int p2) {
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
    
    public static \u56bd\u8413\u647c\u5bc4\ud158.\u2dcc\u64ab\uf94d\ub18d\uff55<java.lang.Runnable> \ud523\u6198\ub18d\u9af2\uc31c\ua61f(java.lang.Runnable p0, long p1, java.util.function.IntSupplier p2) {
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
    
    public static \u56bd\u8413\u647c\u5bc4\ud158.\u2dcc\u64ab\uf94d\ub18d\uff55<java.lang.Runnable> \ub113\u7330\ucfaf\ub7dc\ub1b9\u927d(\u392e\ud7e8\u3bc9\u88c5\ud51e.\u8bb0\u4975\ub7dc\u47c2\u3e75 p0, java.lang.Runnable p1) {
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
            return:\u2dcc\u64ab\uf94d\ub18d\uff55<Runnable>(invokestatic:\u2dcc\u64ab\uf94d\ub18d\uff55<Runnable>(\u7ce1\ud158\u927d\u5f50\uc29a::\ud523\u6198\ub18d\u9af2\uc31c\ua61f, p1:Runnable, invokevirtual:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, invokevirtual:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u8bb0\u4975\ub7dc\u47c2\u3e75::\ua6bd\u93a2\ucfaf\u97b7\u61a4\u8709, p0:\u8bb0\u4975\ub7dc\u47c2\u3e75)), invokedynamic:IntSupplier(getAsInt:(L\u392e\ud7e8\u3bc9\u88c5\ud51e/\u8bb0\u4975\ub7dc\u47c2\u3e75;)Ljava/util/function/IntSupplier;, p0:\u8bb0\u4975\ub7dc\u47c2\u3e75)))
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u8413\u1833\u3dd3\u3a62\ufcaf \u494c\uc229\uc29a\u836c\u494c\u6ec6(java.lang.Runnable p0, long p1, boolean p2) {
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
            return:\u8413\u1833\u3dd3\u3a62\ufcaf(initobject:\u8413\u1833\u3dd3\u3a62\ufcaf(\u8413\u1833\u3dd3\u3a62\ufcaf::<init>, p0:Runnable, p1:long, p2:boolean, aconstnull:\ubded\u8df4\u6c56\ud217\uff55()))
        }
        
        goto(Label_0006)
    }
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u56bd\u8413\u647c\u5bc4\ud158.\u2dcc\u64ab\uf94d\ub18d\uff55<T>> \u3711\u3bd6\ufe34\ub32d\ub7dc\ub19c(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198<T> p0, boolean p1) {
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
    
    public \u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u8413\u1833\u3dd3\u3a62\ufcaf> \u9255\uff55\u88c5\ua562\u6435\ub70c(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198<java.lang.Runnable> p0) {
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
    
    public void \u3e75\u64ab\ua562\u40a9\u51b2\u4bc8(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p0, java.util.function.IntSupplier p1, int p2, java.util.function.IntConsumer p3) {
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
    
    private void \u93a2\u8c8a\u0a06\u5db4\ubff1\uf94d(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198<T> p0, long p1, java.lang.Runnable p2, boolean p3) {
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
    
    private void \u5140\ud171\u9a18\u52d3\u8389\u8413(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198<T> p0, java.util.function.Function<\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u59ec\u8413\u97e6\uc229\u3776.\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T> p1, long p2, java.util.function.IntSupplier p3, boolean p4) {
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
    
    private void \u8350\ufcaf\ub171\u76bc\ub171\u6c56(\ud36e\u6bb9\u960f\u4c04\u64ab.\u74b1\ufcaf\ubcb0\u3bd6\ubded<java.util.function.Function<\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u59ec\u8413\u97e6\uc229\u3776.\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>> p0, \u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198<T> p1) {
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
    
    private \ud36e\u6bb9\u960f\u4c04\u64ab.\u74b1\ufcaf\ubcb0\u3bd6\ubded<java.util.function.Function<\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u59ec\u8413\u97e6\uc229\u3776.\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>> \uc910\u72f1\u8753\u36d3\u6b0d\u51fa(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198<T> p0) {
        var_4_6F : \u74b1\ufcaf\ubcb0\u3bd6\ubded<? extends Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, ?>>
        
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
        var_4_6F = checkcast:\u74b1\ufcaf\ubcb0\u3bd6\ubded<? extends Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, ?>>(\ud36e\u6bb9\u960f\u4c04\u64ab.\u74b1\ufcaf\ubcb0\u3bd6\ubded<? extends java.util.function.Function<\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u59ec\u8413\u97e6\uc229\u3776.\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, ?>>.class, invokeinterface:\u74b1\ufcaf\ubcb0\u3bd6\ubded<? extends Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, ?>>(Map<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<?>, \u74b1\ufcaf\ubcb0\u3bd6\ubded<? extends Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, ?>>>::get, getfield:Map<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<?>, \u74b1\ufcaf\ubcb0\u3bd6\ubded<? extends Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, ?>>>(\u7ce1\ud158\u927d\u5f50\uc29a::\u7ce1\ud523\u965f\ufe34\u7bad\u97b7, this:\u7ce1\ud158\u927d\u5f50\uc29a), p0:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<T>[expected:Object]))
        
        if (cmpne:boolean(var_4_6F:\u74b1\ufcaf\ubcb0\u3bd6\ubded<? extends Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, ?>>, aconstnull:\u74b1\ufcaf\ubcb0\u3bd6\ubded<? extends Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, ?>>())) {
            return:\u74b1\ufcaf\ubcb0\u3bd6\ubded<Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>>(var_4_6F:\u74b1\ufcaf\ubcb0\u3bd6\ubded<? extends Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, ?>>)
        }
        
        athrow(checkcast:IllegalArgumentException(java.lang.IllegalArgumentException.class, invokestatic:IllegalArgumentException(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u8640\u36d3\ua3b4\u4ab3\uc238\u839e, initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7ce1\ud158\u927d\u5f50\uc29a::\ud12e\ud217\u8d98\u1833\ud36e\u071d), xor:int(ldc:int(4104), ldc:int(4105)))), p0:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<T>[expected:Object]))))))
    }
    
    public java.lang.String \u760c\u836c\ube23\ub1b9\u61a4\u98a4() {
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
    
    public void close() {
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
            invokeinterface:void(Iterable<Object>::forEach, invokeinterface:Set<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<?>>[expected:Iterable<Object>](Map<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<?>, \u74b1\ufcaf\ubcb0\u3bd6\ubded<? extends Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, ?>>>::keySet, getfield:Map<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<?>, \u74b1\ufcaf\ubcb0\u3bd6\ubded<? extends Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, ?>>>(\u7ce1\ud158\u927d\u5f50\uc29a::\u7ce1\ud523\u965f\ufe34\u7bad\u97b7, this:\u7ce1\ud158\u927d\u5f50\uc29a)), invokedynamic:Consumer<? super Object>(accept:()Ljava/util/function/Consumer;))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\uc87f\u759a\ud523\u36d3\u0c95\u8d90$18(java.util.Map.Entry p0) {
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
    
    private static java.lang.String lambda$\ub1b9\u69d9\uc2bd\u6ec6\u4cd9\ud51e$17(java.lang.Long p0) {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p0:Long[expected:Object]), loadelement:String(getstatic:String[](\u7ce1\ud158\u927d\u5f50\uc29a::\ud12e\ud217\u8d98\u1833\ud36e\u071d), xor:int(ldc:int(18503), ldc:int(18497)))), initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c[expected:Object](\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, invokevirtual:long(Long::longValue, p0:Long)))))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4e72\u4d85\uc87f\u1833\ud171\u4d85$16(\ud36e\u6bb9\u960f\u4c04\u64ab.\u74b1\ufcaf\ubcb0\u3bd6\ubded p0, \u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p1) {
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
    
    private void lambda$\uc246\u6198\u9af2\u8df4\u97e6\u99f7$15(\ud36e\u6bb9\u960f\u4c04\u64ab.\u74b1\ufcaf\ubcb0\u3bd6\ubded p0, \u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p1, java.util.List p2) {
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
            invokespecial:void(\u7ce1\ud158\u927d\u5f50\uc29a::\u8350\ufcaf\ub171\u76bc\ub171\u6c56, this:\u7ce1\ud158\u927d\u5f50\uc29a, p0:\u74b1\ufcaf\ubcb0\u3bd6\ubded<Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, Object>>, p1:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<Object>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.CompletableFuture lambda$\u6d69\u9af2\u4c2b\uafe7\u8d98\u3bc9$14(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p0, com.mojang.datafixers.util.Either p1) {
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
    
    private static java.util.concurrent.CompletableFuture lambda$\ub7dc\uf9c5\u8350\u7c6b\u5fe1\ufe34$13(java.lang.Runnable p0) {
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
            invokeinterface:void(Runnable::run, p0:Runnable)
            return:CompletableFuture(invokestatic:CompletableFuture<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(CompletableFuture<T>::completedFuture, getstatic:\u3bc9\u4492\u69d9\ud12e\uc238\u6c56(\u3bc9\u4492\u69d9\ud12e\uc238\u6c56::\u93a2\u4bc8\u5d20\ub32d\u836c\u72f1)))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uf94d\u76bc\u7043\u624e\u8bb0\u2dcc$12(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p0, java.util.function.IntSupplier p1, java.util.function.Function p2, long p3, boolean p4) {
        var_9_6A : \u74b1\ufcaf\ubcb0\u3bd6\ubded<Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>>
        var_10_72 : int
        
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
            var_9_6A = invokespecial:\u74b1\ufcaf\ubcb0\u3bd6\ubded<Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>>(\u7ce1\ud158\u927d\u5f50\uc29a::\uc910\u72f1\u8753\u36d3\u6b0d\u51fa, this:\u7ce1\ud158\u927d\u5f50\uc29a, p0:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<T>)
            var_10_72 = invokeinterface:int(IntSupplier::getAsInt, p1:IntSupplier)
            invokevirtual:void(\u74b1\ufcaf\ubcb0\u3bd6\ubded<Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>>::\u51b2\ua61f\u9255\ub70c\uae87\u67e9, var_9_6A:\u74b1\ufcaf\ubcb0\u3bd6\ubded<Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>>, invokestatic:Optional<Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>>(Optional<T>::of, p2:Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>), p3:long, var_10_72:int)
            
            if (p4:boolean) {
                invokevirtual:void(\u74b1\ufcaf\ubcb0\u3bd6\ubded<Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>>::\u51b2\ua61f\u9255\ub70c\uae87\u67e9, var_9_6A:\u74b1\ufcaf\ubcb0\u3bd6\ubded<Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>>, invokestatic:Optional<Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>>(Optional<T>::empty), p3:long, var_10_72:int)
            }
            
            if (invokeinterface:boolean(Set<E>::remove, getfield:Set<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<?>>(\u7ce1\ud158\u927d\u5f50\uc29a::\u8bb0\u3776\u4daf\ube23\uc9f6\u494c, this:\u7ce1\ud158\u927d\u5f50\uc29a), p0:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<T>[expected:Object])) {
                invokespecial:void(\u7ce1\ud158\u927d\u5f50\uc29a::\u8350\ufcaf\ub171\u76bc\ub171\u6c56, this:\u7ce1\ud158\u927d\u5f50\uc29a, var_9_6A:\u74b1\ufcaf\ubcb0\u3bd6\ubded<Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>>, p0:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<T>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u5245\u527a\uc2bd\ubff1\u6435\ubcb0$11(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p0, long p1, boolean p2, java.lang.Runnable p3) {
        var_8_6A : \u74b1\ufcaf\ubcb0\u3bd6\ubded<Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>>
        
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
            var_8_6A = invokespecial:\u74b1\ufcaf\ubcb0\u3bd6\ubded<Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>>(\u7ce1\ud158\u927d\u5f50\uc29a::\uc910\u72f1\u8753\u36d3\u6b0d\u51fa, this:\u7ce1\ud158\u927d\u5f50\uc29a, p0:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<T>)
            invokevirtual:void(\u74b1\ufcaf\ubcb0\u3bd6\ubded::\u92ff\u7af6\u34df\u8709\u8bb0\u8753, var_8_6A:\u74b1\ufcaf\ubcb0\u3bd6\ubded, p1:long, p2:boolean)
            
            if (invokeinterface:boolean(Set<E>::remove, getfield:Set<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<?>>(\u7ce1\ud158\u927d\u5f50\uc29a::\u8bb0\u3776\u4daf\ube23\uc9f6\u494c, this:\u7ce1\ud158\u927d\u5f50\uc29a), p0:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<T>[expected:Object])) {
                invokespecial:void(\u7ce1\ud158\u927d\u5f50\uc29a::\u8350\ufcaf\ub171\u76bc\ub171\u6c56, this:\u7ce1\ud158\u927d\u5f50\uc29a, var_8_6A:\u74b1\ufcaf\ubcb0\u3bd6\ubded<Function<\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, T>>, p0:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<T>)
            }
            
            invokeinterface:void(Runnable::run, p3:Runnable)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ub6ab\ufcaf\u156b\uafe7\u6c52\u99f7$10(java.util.function.IntSupplier p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p1, int p2, java.util.function.IntConsumer p3) {
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
    
    private static void lambda$\u983f\uff55\ubded\ub18d\uc910\u071d$9(int p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u120d\u2dcc\ubff1\uceb8\ube23\u647c p1, int p2, \ud36e\u6bb9\u960f\u4c04\u64ab.\u74b1\ufcaf\ubcb0\u3bd6\ubded p3) {
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
            invokevirtual:void(\u74b1\ufcaf\ubcb0\u3bd6\ubded::\ub1b9\ub7dc\u67d0\u97e6\u7043\ua6bd, p3:\u74b1\ufcaf\ubcb0\u3bd6\ubded, p0:int, p1:\u120d\u2dcc\ubff1\uceb8\ube23\u647c, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u873d\ud523\u983f\u8d98\u0b8e\u8c8a lambda$\ud7e8\ua3b4\u6cfe\ud51e\u760c\u927d$8(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p0, \u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p1) {
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
    
    private void lambda$\u8c8a\u4d85\u7c6b\uc84e\u9937\ud158$7(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p0, \u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p1) {
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
    
    private void lambda$\uc9f6\u62da\u72f1\u6ec6\u52d3\uff55$6(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u8413\u1833\u3dd3\u3a62\ufcaf p1) {
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
            invokespecial:void(\u7ce1\ud158\u927d\u5f50\uc29a::\u93a2\u8c8a\u0a06\u5db4\ubff1\uf94d, this:\u7ce1\ud158\u927d\u5f50\uc29a, p0:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<Object>, invokestatic:long(\u8413\u1833\u3dd3\u3a62\ufcaf::\u3504\u3bd6\ucef1\u873d\ub19c\ud36e, p1:\u8413\u1833\u3dd3\u3a62\ufcaf), invokestatic:Runnable(\u8413\u1833\u3dd3\u3a62\ufcaf::\u12b2\u7330\ua6bd\u8640\u7ce1\u927d, p1:\u8413\u1833\u3dd3\u3a62\ufcaf), invokestatic:boolean(\u8413\u1833\u3dd3\u3a62\ufcaf::\ub70c\u5140\u8c8a\uc910\u7c6b\ua6bd, p1:\u8413\u1833\u3dd3\u3a62\ufcaf))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u873d\ud523\u983f\u8d98\u0b8e\u8c8a lambda$\u8cae\u446c\ud171\uc31c\u8709\u600f$5(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p0, boolean p1, \u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p2) {
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
    
    private void lambda$\uf94d\u8350\uae5d\u8d98\ub8be\u5fe1$4(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p0, \u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p1, boolean p2) {
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
    
    private void lambda$\ubb2b\u3bc9\ud523\u6c56\ucb79\uc31c$3(\u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p0, boolean p1, \u56bd\u8413\u647c\u5bc4\ud158.\u2dcc\u64ab\uf94d\ub18d\uff55 p2) {
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
            invokespecial:void(\u7ce1\ud158\u927d\u5f50\uc29a::\u5140\ud171\u9a18\u52d3\u8389\u8413, this:\u7ce1\ud158\u927d\u5f50\uc29a, p0:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<Object>, invokestatic:Function(\u2dcc\u64ab\uf94d\ub18d\uff55<Object>::\u4c04\u839e\u8258\u36d3\u8d98\u4ab3, p2:\u2dcc\u64ab\uf94d\ub18d\uff55<Object>), invokestatic:long(\u2dcc\u64ab\uf94d\ub18d\uff55<Object>::\uc3e3\u7049\u71ae\u4d85\u64ab\uc3e3, p2:\u2dcc\u64ab\uf94d\ub18d\uff55<Object>), invokestatic:IntSupplier(\u2dcc\u64ab\uf94d\ub18d\uff55<Object>::\u3711\u8413\u0a06\u516c\ub1b9\u983f, p2:\u2dcc\u64ab\uf94d\ub18d\uff55<Object>), p1:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Runnable lambda$\ub83f\u98a4\u7873\u6198\u8389\u7c6b$2(java.lang.Runnable p0, \u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p1) {
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
    
    private static void lambda$\ucef1\u4492\ub102\u61a4\ud12e\ub83f$1(java.lang.Runnable p0, \u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p1) {
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
            invokeinterface:void(Runnable::run, p0:Runnable)
            invokeinterface:void(\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>::\ubb2b\ud4fe\ub18d\ub171\u98a4\u873d, p1:\u9a18\u62da\ucfaf\u92ee\u183a\u6198<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>, getstatic:\u3bc9\u4492\u69d9\ud12e\uc238\u6c56(\u3bc9\u4492\u69d9\ud12e\uc238\u6c56::\u93a2\u4bc8\u5d20\ub32d\u836c\u72f1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \ud36e\u6bb9\u960f\u4c04\u64ab.\u74b1\ufcaf\ubcb0\u3bd6\ubded lambda$\ua6bd\u99f7\uc238\uafe7\u6435\u4f52$0(int p0, \u494c\u4975\ua068\u0c95\uc84e.\u9a18\u62da\ucfaf\u92ee\u183a\u6198 p1) {
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
            return:\u74b1\ufcaf\ubcb0\u3bd6\ubded(initobject:\u74b1\ufcaf\ubcb0\u3bd6\ubded(\u74b1\ufcaf\ubcb0\u3bd6\ubded<T>::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokeinterface:String(\u9a18\u62da\ucfaf\u92ee\u183a\u6198::\uf9c5\u8389\u600f\u965f\u446c\ua3b4, p1:\u9a18\u62da\ucfaf\u92ee\u183a\u6198)), loadelement:String(getstatic:String[](\u7ce1\ud158\u927d\u5f50\uc29a::\ud12e\ud217\u8d98\u1833\ud36e\u071d), xor:int(ldc:int(-15803), ldc:int(-15795))))), p0:int))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_80 : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_110_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_148_0 : byte[] [generated]
        stack_28B_0 : byte[] [generated]
        stack_2EA_0 : byte[] [generated]
        stack_36E_0 : byte[] [generated]
        stack_3C4_0 : byte[] [generated]
        var_4_26C : int
        var_3_271 : byte[]
        var_5_272 : int
        expr_28B : byte [generated]
        var_0_304 : int
        expr_2EA : byte [generated]
        stack_33C_2 : byte [generated]
        stack_310_0 : byte [generated]
        expr_9E : int [generated]
        var_2_D5 : byte[]
        expr_D9 : int [generated]
        var_3_35C : byte[]
        var_5_35D : int
        expr_112 : int [generated]
        var_3_3B2 : byte[]
        var_5_3B3 : int
        var_3_154 : String
        stack_25F_0 : String[] [generated]
        expr_166 : String[] [generated]
        
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
        var_0_80 = and:int(ldc:int(-2020544279), ldc:int(-1223036331))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_28B_0 = stack_2EA_0 = stack_36E_0 = stack_3C4_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ycNDsRilxdZfxi/FZsLNQcNhOTOprtVYT0ZDxkzJaEDKRivKTc7KYUNJwKFGReZDwcOhxctlzUvLI0ZF5i4tpQ4=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_26C = expr_6E:int
        var_3_271 = newarray:byte[](byte.class, expr_6E:int)
        var_5_272 = expr_6E:int
        Label_0628:
        
        while (cmpeq:boolean(and:int(var_0_80:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_80 = and:int(var_0_80:int, ldc:int(-74319513))
            var_5_272 = add:int(var_5_272:int, ldc:int(-1))
            expr_28B = loadelement:byte(stack_28B_0:byte[], var_5_272:int)
            storeelement:byte(var_3_271:byte[], var_5_272:int, add:int(or:int(and:int(shl:int(expr_28B:byte, and:int(ldc:int(516), ldc:int(28679))), ldc:int(-16)), and:int(shr:int(expr_28B:byte[expected:int], xor:int(ldc:int(16645), ldc:int(16641))), ldc:int(15))), ldc:int(60)))
            
            if (cmpne:boolean(var_5_272:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_28B_0 = stack_2EA_0 = stack_36E_0 = stack_3C4_0 = var_3_271:byte[]
            goto(Label_0115)
        }
        
        Label_0723:
        
        while (cmpne:boolean(and:int(var_0_80:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_304 = and:int(var_0_80:int, ldc:int(-945359881))
            var_5_272 = add:int(var_5_272:int, ldc:int(-1))
            expr_2EA = stack_33C_2 = loadelement(stack_2EA_0, var_5_272)
            
            if (cmplt:boolean(add:int(add:int(var_5_272:int, ldc:int(4)), neg:int(var_4_26C:int)), ldc:int(0))) {
                stack_33C_2 = stack_310_0 = add:byte(expr_2EA:byte, loadelement:byte(var_3_271:byte[], add:int(var_5_272:int, ldc:int(4))))
                goto(Label_0800)
            }
            
            Label_0759:
            
            if (cmpeq:boolean(and:int(var_0_304:int, ldc:int(8192)), ldc:int(0))) {
                var_0_304 = and:int(var_0_304:int, ldc:int(-232051902))
            }
            else {
                var_0_304 = and:int(var_0_304:int, ldc:int(-485558071))
                stack_33C_2 = stack_310_0 = add:byte(expr_2EA:byte, ldc:byte(4))
            }
            
            Label_0800:
            
            if (cmpne:boolean(and:int(var_0_304:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_304 = and:int(var_0_304:int, ldc:int(1252035082))
                goto(Label_0759)
            }
            
            var_0_80 = and:int(var_0_304:int, ldc:int(-2818979))
            storeelement:byte(var_3_271:byte[], var_5_272:int, stack_33C_2:byte)
            
            if (cmpne:boolean(var_5_272:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_28B_0 = stack_2EA_0 = stack_36E_0 = stack_3C4_0 = var_3_271:byte[]
            goto(Label_0163)
        }
        
        goto(Label_0628)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(8192)), ldc:int(0))) {
            var_0_80 = and:int(var_0_80:int, ldc:int(1729382258))
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_80:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_80:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_80 = and:int(var_0_80:int, ldc:int(-205668617))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_26C = expr_9E:int
                var_3_271 = newarray:byte[](byte.class, expr_9E:int)
                var_5_272 = expr_9E:int
                goto(Label_0723)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_80:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0279)
        }
        
        if (cmpne:boolean(and:int(var_0_80:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_80 = and:int(var_0_80:int, ldc:int(131151502))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(32768)), ldc:int(0))) {
                var_0_80 = and:int(var_0_80:int, ldc:int(328362620))
                goto(Label_0115)
            }
            
            var_0_80 = and:int(var_0_80:int, ldc:int(-1619724953))
            var_2_D5 = stack_D5_0:byte[]
            expr_D9 = add:int(arraylength:int(stack_D7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_3_35C = newarray:byte[](byte.class, expr_D9:int)
                var_5_35D = expr_D9:int
                
                loop {
                    var_0_80 = and:int(var_0_80:int, ldc:int(-677269425))
                    var_5_35D = add:int(var_5_35D:int, ldc:int(-1))
                    storeelement:byte(var_3_35C:byte[], var_5_35D:int, add:int(shl:int(loadelement:byte(stack_36E_0:byte[], var_5_35D:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_D5:byte[], add:int(var_5_35D:int, xor:int(ldc:int(8544), ldc:int(8545)))), ldc:int(3)), xor:int(ldc:int(10645), ldc:int(10634)))))
                    
                    if (cmpne:boolean(var_5_35D:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_28B_0 = stack_2EA_0 = stack_36E_0 = stack_3C4_0 = var_3_35C:byte[]
            }
        }
        
        Label_0222:
        
        if (cmpne:boolean(and:int(var_0_80:int, ldc:int(131072)), ldc:int(0))) {
            var_0_80 = and:int(var_0_80:int, ldc:int(1926066755))
        }
        else {
            if (cmpne:boolean(and:int(var_0_80:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpne:boolean(and:int(var_0_80:int, ldc:int(65536)), ldc:int(0))) {
                var_0_80 = and:int(var_0_80:int, ldc:int(-1075848453))
                goto(Label_0115)
            }
            
            var_0_80 = and:int(var_0_80:int, ldc:int(-1683178555))
            expr_112 = arraylength:int(stack_112_0:byte[])
            
            if (cmpne:boolean(expr_112:int, ldc:int(0))) {
                var_3_3B2 = newarray:byte[](byte.class, expr_112:int)
                var_5_3B3 = expr_112:int
                
                loop {
                    var_0_80 = and:int(var_0_80:int, ldc:int(-541280681))
                    var_5_3B3 = add:int(var_5_3B3:int, ldc:int(-1))
                    storeelement:byte(var_3_3B2:byte[], var_5_3B3:int, xor:byte(loadelement:byte(stack_3C4_0:byte[], var_5_3B3:int), ldc:byte(54)))
                    
                    if (cmpne:boolean(var_5_3B3:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_D5_0 = stack_D7_0 = stack_110_0 = stack_112_0 = stack_148_0 = stack_28B_0 = stack_2EA_0 = stack_36E_0 = stack_3C4_0 = var_3_3B2:byte[]
            }
        }
        
        Label_0279:
        
        if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_80 = and:int(var_0_80:int, ldc:int(1803617888))
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_80:int, ldc:int(4096)), ldc:int(0))) {
            var_0_80 = and:int(var_0_80:int, ldc:int(1530367321))
            goto(Label_0115)
        }
        
        var_3_154 = initobject:String(String::<init>, stack_148_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_25F_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(443), ldc:int(16905)))
        expr_166 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(75), ldc:int(1289)))
        storeelement:String(expr_166:String[], and:int(ldc:int(8194), ldc:int(6230)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(-2533), ldc:int(2532)), xor:int(ldc:int(-32444), ldc:int(-32443))))
        storeelement:String(expr_166:String[], and:int(ldc:int(11399), ldc:int(4459)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(617), ldc:int(8193)), and:int(ldc:int(4485), ldc:int(17973))))
        storeelement:String(expr_166:String[], and:int(ldc:int(16470), ldc:int(1319)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(1287), ldc:int(1282)), and:int(ldc:int(17055), ldc:int(2054))))
        storeelement:String(expr_166:String[], and:int(ldc:int(18566), ldc:int(1029)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(76), ldc:int(74)), xor:int(ldc:int(8530), ldc:int(8538))))
        storeelement:String(expr_166:String[], and:int(ldc:int(23297), ldc:int(7)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(22984), ldc:int(1048)), xor:int(ldc:int(16449), ldc:int(16471))))
        storeelement:String(expr_166:String[], and:int(ldc:int(18693), ldc:int(525)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(830), ldc:int(2262)), xor:int(ldc:int(2642), ldc:int(2629))))
        storeelement:String(expr_166:String[], xor:int(ldc:int(2214), ldc:int(2222)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(17271), ldc:int(23)), xor:int(ldc:int(17165), ldc:int(17168))))
        storeelement:String(expr_166:String[], and:int(ldc:int(8199), ldc:int(4111)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(8349), ldc:int(6271)), and:int(ldc:int(18490), ldc:int(891))))
        storeelement:String(expr_166:String[], and:int(ldc:int(26398), ldc:int(-26399)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(13438), ldc:int(19130)), xor:int(ldc:int(2222), ldc:int(2286))))
        putstatic:String[](\u7ce1\ud158\u927d\u5f50\uc29a::\ud12e\ud217\u8d98\u1833\ud36e\u071d, expr_166:String[])
        putstatic:Logger(\u7ce1\ud158\u927d\u5f50\uc29a::\uf995\u98a4\ub32d\uf9c5\u3c25\u183a, invokestatic:Logger(LogManager::getLogger))
    }
    
    public void \u7330\ud217\u0c95\uc229\u494c\u416d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
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
        var_3_68D = and:int(ldc:int(-1231996839), ldc:int(-155587075))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7ce1\ud158\u927d\u5f50\uc29a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(2009022367))
            var_5_81 = and:int(ldc:int(19465), ldc:int(-19598))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(795), ldc:int(-1852)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_68D:int, ldc:int(-134387093))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(18481), ldc:int(129)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-23520), ldc:int(-23519)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_68D = and:int(var_3_DA:int, ldc:int(-137397715))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(24619), ldc:int(1349)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-140312877))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1625471970))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1564478755))
                    }
                    else {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1053948635))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1395031537))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1438944029))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1625562161))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1282417359))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(344592330))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(921385243))
                            var_11_EB = and:int(ldc:int(-19903), ldc:int(3516))
                            goto(Label_1544)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1878285111))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(907634281))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-695290831))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1176725004))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(239221070))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(918547371))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-774947268))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1921198818))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(393762658))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1055489049))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1983632339))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(527569200))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1320781832))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(800999855))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(2007444941))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(-30680), ldc:int(-30679))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1982209609))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1808843743))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1067507683))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-695616023))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1062904526))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(410413939))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1070575195))
                        var_11_EB = and:int(ldc:int(-1264), ldc:int(239))
                    }
                    
                    Label_1137:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1711701705))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-642104369))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-977618932))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1477205462))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-123529997))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1317402917))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1072148457))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_1137)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(105575484))
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-627890630))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1239023477))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-576417798))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1078219827))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1544)
                    }
                    
                    Label_1416:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-782306251))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(198124891))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(287481989))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_68D = and:int(var_3_68D:int, ldc:int(-137531713))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_698 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(120285526))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(232308356))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(50917628))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-622290686))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-135528993))
                        var_17_698 = add:int(var_16_119:int, xor:int(ldc:int(24705), ldc:int(24704)))
                        looporswitchbreak()
                    }
                    
                    var_3_68D = and:int(var_3_68D:int, ldc:int(-906651555))
                }
                
                var_3_68D = and:int(var_3_68D:int, ldc:int(2005789131))
                
                if (cmple:boolean(var_5_81 = var_17_698:int, sub:int(var_6_88:int, xor:int(ldc:int(46), ldc:int(47))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(323628276))
            goto(Label_0108)
        }
    }
}
