public class \u6435\ub8be\u718f\u6b0d\u67e9.\u836c\u9033\u120d\u8640\ub18d\ud523 {
    public void \u836c\u9033\u120d\u8640\ub18d\ud523(java.util.List<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u7c6b\u34df\uf995\u4179\ub70c\u8c8a> p0, \u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?> p1) {
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
    
    private void \u836c\u9033\u120d\u8640\ub18d\ud523(java.util.List<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u7c6b\u34df\uf995\u4179\ub70c\u8c8a> p0, java.util.function.Supplier<\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>> p1) {
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
            invokespecial:Object(Object::<init>, this:\u836c\u9033\u120d\u8640\ub18d\ud523)
            putfield:List<\u7c6b\u34df\uf995\u4179\ub70c\u8c8a>(\u836c\u9033\u120d\u8640\ub18d\ud523::\uf94d\u4cd9\uc9f6\u6ec6\u718f\uc4d2, this:\u836c\u9033\u120d\u8640\ub18d\ud523, p0:List<\u7c6b\u34df\uf995\u4179\ub70c\u8c8a>)
            putfield:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\u836c\u9033\u120d\u8640\ub18d\ud523::\u8413\u0800\uc2e8\u392e\u392e\u74b1, this:\u836c\u9033\u120d\u8640\ub18d\ud523, p1:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.stream.Stream<\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>> \u4975\u3dd3\u9a18\u7043\u64f2\u97b7() {
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
    
    private static java.util.stream.Stream lambda$\u965f\uc229\u718f\u97e6\u4975\ufe34$4(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u7c6b\u34df\uf995\u4179\ub70c\u8c8a p0) {
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
            return:Stream(invokevirtual:Stream<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<FC, F>::\u6c56\u647c\u516c\u4e72\u88c5\u6435, checkcast:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>.class, invokeinterface:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>(Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>::get, getfield:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\u7c6b\u34df\uf995\u4179\ub70c\u8c8a::\u4c04\ub171\u4c2b\ub171\ucb79\uc2e8, p0:\u7c6b\u34df\uf995\u4179\ub70c\u8c8a)))))
        }
        
        goto(Label_0006)
    }
    
    private static \u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a lambda$\u51b2\u6b5f\u392e\u7af6\u4cd9\ub171$3(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a p0) {
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
            return:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a(p0:\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a)
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u416d\u120d\u927d\u4daf\u8df4\u1187$2(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.util.function.Supplier lambda$\uc4d2\u8640\u64f2\u5f50\u647c\ubcb0$1(\u6435\ub8be\u718f\u6b0d\u67e9.\u836c\u9033\u120d\u8640\ub18d\ud523 p0) {
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
            return:Supplier(getfield:Supplier<\ub8be\u56bd\u4c04\u8cae\u6cfe\u4f4a<?, ?>>(\u836c\u9033\u120d\u8640\ub18d\ud523::\u8413\u0800\uc2e8\u392e\u392e\u74b1, p0:\u836c\u9033\u120d\u8640\ub18d\ud523))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.List lambda$\u93a2\u56bd\ufe34\ua6bd\ube23\u1833$0(\u6435\ub8be\u718f\u6b0d\u67e9.\u836c\u9033\u120d\u8640\ub18d\ud523 p0) {
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
            return:List(getfield:List<\u7c6b\u34df\uf995\u4179\ub70c\u8c8a>(\u836c\u9033\u120d\u8640\ub18d\ud523::\uf94d\u4cd9\uc9f6\u6ec6\u718f\uc4d2, p0:\u836c\u9033\u120d\u8640\ub18d\ud523))
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
    
    public void \u5140\u8bb0\u6cfe\u4d85\u960f\u4d85(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63E : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_649 : int
        
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
        var_3_63E = and:int(ldc:int(-1622673040), ldc:int(-19153415))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u836c\u9033\u120d\u8640\ub18d\ud523[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(32)), ldc:int(0))) {
            var_3_63E = and:int(var_3_63E:int, ldc:int(1038318706))
            var_5_81 = and:int(ldc:int(8481), ldc:int(-8482))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18119), ldc:int(17094)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_63E:int, ldc:int(-1091076750))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(2052), ldc:int(2053)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(1029), ldc:int(4617)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_63E = and:int(var_3_DA:int, ldc:int(-1637123855))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(16451), ldc:int(1)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(40272722))
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(986998523))
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1242238551))
                        goto(Label_0960)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-164896075))
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1102350350))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0567)
                            }
                            
                            goto(Label_0830)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(44128105))
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(383212763))
                        goto(Label_0960)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(502319470))
                        goto(Label_0830)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(1054831229))
                            var_11_EB = and:int(ldc:int(8749), ldc:int(-10094))
                            goto(Label_1474)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0567:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1942533028))
                        goto(Label_1485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1796696136))
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(736853987))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1771845075))
                        goto(Label_0960)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1354991893))
                        goto(Label_0830)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1858042840))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(2003794294))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0830)
                        }
                    }
                    
                    Label_0709:
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(92368445))
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(534254369))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0960)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(579444660))
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-688426244))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0830:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-846744087))
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1438068833))
                        goto(Label_1100)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(346174324))
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-706613470))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(1233362253))
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1550024560))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(9473), ldc:int(19061))
                                goto(Label_1100)
                            }
                        }
                    }
                    
                    Label_0960:
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-3701681))
                        goto(Label_1347)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-1060424837))
                            goto(Label_0830)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-713818124))
                        var_11_EB = and:int(ldc:int(-13172), ldc:int(13170))
                    }
                    
                    Label_1100:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(915590363))
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1778013800))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0960)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0830)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(28061527))
                            loopcontinue()
                        }
                        
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-34376586))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1347)
                            }
                        }
                    }
                    
                    Label_1212:
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1892478118))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_1100)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0960)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-1243588116))
                            goto(Label_0830)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-904560034))
                            goto(Label_0709)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(-566877441))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_63E = and:int(var_3_63E:int, ldc:int(2144812798))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1474)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1347:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1485)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(763121026))
                        goto(Label_0960)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0830)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1867167919))
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-1343345006))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4096)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_63E = and:int(var_3_63E:int, ldc:int(-732728591))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1474:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_649 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1485:
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1347)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1212)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(1406423397))
                        goto(Label_1100)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0960)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(619979394))
                        goto(Label_0830)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0709)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-977775451))
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63E = and:int(var_3_63E:int, ldc:int(-680529285))
                        var_17_649 = add:int(var_16_119:int, xor:int(ldc:int(16929), ldc:int(16928)))
                        looporswitchbreak()
                    }
                    
                    var_3_63E = and:int(var_3_63E:int, ldc:int(1774933248))
                }
                
                var_3_63E = and:int(var_3_63E:int, ldc:int(2135129982))
                
                if (cmple:boolean(var_5_81 = var_17_649:int, sub:int(var_6_88:int, and:int(ldc:int(6229), ldc:int(16513))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_63E:int, ldc:int(65536)), ldc:int(0))) {
            var_3_63E = and:int(var_3_63E:int, ldc:int(-199015901))
            goto(Label_0108)
        }
    }
}
