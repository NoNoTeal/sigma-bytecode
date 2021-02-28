public class \u51b2\u6fb0\ufcaf\u61a4\u0800.\u61a4\u600f\uae87\ube23\u927d\u4179 {
    public void \u61a4\u600f\uae87\ube23\u927d\u4179(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99 p0) {
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
    
    public void \u8709\u8258\u6ec6\u9033\uff55\u8d98(java.util.Map<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p0) {
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
            putfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u61a4\u600f\uae87\ube23\u927d\u4179::\u3504\ucb79\u960f\u69d9\u836c\u0800, this:\u61a4\u600f\uae87\ube23\u927d\u4179, p0:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 \u40a9\u99f7\ud523\u4cd9\u8640\u40a9() {
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
    
    public \u3504\ufe34\u600f\u6b0d\u69d9.\ube23\ua562\ud12e\u3d64\ufcaf \u5245\ub1b9\uc229\u4492\u7e3f\u5db4() {
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
            return:\ube23\ua562\ud12e\u3d64\ufcaf(getfield:\ube23\ua562\ud12e\u3d64\ufcaf(\u61a4\u600f\uae87\ube23\u927d\u4179::\uf94d\u5245\u8308\u8413\u4c2b\uc4d2, this:\u61a4\u600f\uae87\ube23\u927d\u4179))
        }
        
        goto(Label_0006)
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
            invokeinterface:void(Iterable<Object>::forEach, invokeinterface:Collection<\ufcaf\ud7e8\ud158\u6435\u759a\u6435>[expected:Iterable<Object>](Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ufcaf\ud7e8\ud158\u6435\u759a\u6435>::values, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ufcaf\ud7e8\ud158\u6435\u759a\u6435>(\u61a4\u600f\uae87\ube23\u927d\u4179::\u71ae\u4cd9\ud217\ubefe\ub32d\u93a2, this:\u61a4\u600f\uae87\ube23\u927d\u4179)), invokedynamic:Consumer<? super Object>(accept:()Ljava/util/function/Consumer;))
            invokevirtual:void(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::close, getfield:\ufcaf\ud7e8\ud158\u6435\u759a\u6435(\u61a4\u600f\uae87\ube23\u927d\u4179::\u67d0\ubcb0\u965f\u8258\u4ab3\ud217, this:\u61a4\u600f\uae87\ube23\u927d\u4179))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ufcaf\ud7e8\ud158\u6435\u759a\u6435 lambda$\uceb8\u8c8a\u8389\u4e72\u4cd9\u9255$1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:\ufcaf\ud7e8\ud158\u6435\u759a\u6435(checkcast:\ufcaf\ud7e8\ud158\u6435\u759a\u6435(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ufcaf\ud7e8\ud158\u6435\u759a\u6435.class, invokeinterface:\ufcaf\ud7e8\ud158\u6435\u759a\u6435(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ufcaf\ud7e8\ud158\u6435\u759a\u6435>::getOrDefault, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ufcaf\ud7e8\ud158\u6435\u759a\u6435>(\u61a4\u600f\uae87\ube23\u927d\u4179::\u71ae\u4cd9\ud217\ubefe\ub32d\u93a2, this:\u61a4\u600f\uae87\ube23\u927d\u4179), invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::getOrDefault, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(\u61a4\u600f\uae87\ube23\u927d\u4179::\u3504\ucb79\u960f\u69d9\u836c\u0800, this:\u61a4\u600f\uae87\ube23\u927d\u4179), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object], p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753), getfield:\ufcaf\ud7e8\ud158\u6435\u759a\u6435(\u61a4\u600f\uae87\ube23\u927d\u4179::\u67d0\ubcb0\u965f\u8258\u4ab3\ud217, this:\u61a4\u600f\uae87\ube23\u927d\u4179))))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u3e75\u93a2\u120d\u56bd\uc2bd\u7049$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ufcaf\ud7e8\ud158\u6435\u759a\u6435 p0) {
        expr_68 : \ub113\u9af2\u64f2\u5f50\u4179\u7bad[] [generated]
        
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
            expr_68 = newarray:\ub113\u9af2\u64f2\u5f50\u4179\u7bad[](\u12b2\u9a18\uc7fe\u4c2b\u6c52.\ub113\u9af2\u64f2\u5f50\u4179\u7bad.class, xor:int(ldc:int(24848), ldc:int(24849)))
            storeelement:\ub113\u9af2\u64f2\u5f50\u4179\u7bad(expr_68:\ub113\u9af2\u64f2\u5f50\u4179\u7bad[], and:int(ldc:int(-6084), ldc:int(5057)), initobject:\uc4d2\u1833\u9255\u92ff\uc246\u4cd9[expected:\ub113\u9af2\u64f2\u5f50\u4179\u7bad](\uc4d2\u1833\u9255\u92ff\uc246\u4cd9::<init>))
            invokevirtual:void(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\ubff1\u62da\u67e9\u120d\u8308\u6bb9, p0:\ufcaf\ud7e8\ud158\u6435\u759a\u6435, invokestatic:ArrayList(Lists::newArrayList, expr_68:\ub113\u9af2\u64f2\u5f50\u4179\u7bad[][expected:Object[]]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static org.apache.logging.log4j.Logger \u5f50\ud523\u59ec\u8df4\u59ec\ub83f() {
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
            return:Logger(getstatic:Logger(\u61a4\u600f\uae87\ube23\u927d\u4179::\u5654\uae5d\u647c\u99f7\u6d99\ub102))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.Map \u9033\u98a4\u6198\u9255\ubff1\u385b(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u61a4\u600f\uae87\ube23\u927d\u4179 p0) {
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
            return:Map(getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ufcaf\ud7e8\ud158\u6435\u759a\u6435>(\u61a4\u600f\uae87\ube23\u927d\u4179::\u71ae\u4cd9\ud217\ubefe\ub32d\u93a2, p0:\u61a4\u600f\uae87\ube23\u927d\u4179))
        }
        
        goto(Label_0006)
    }
    
    public static \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99 \u4e72\uae87\u3711\u4179\ud158\u5245(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u61a4\u600f\uae87\ube23\u927d\u4179 p0) {
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
            return:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(getfield:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u61a4\u600f\uae87\ube23\u927d\u4179::\uc4d2\u4179\u718f\u3a62\u64f2\u7d52, p0:\u61a4\u600f\uae87\ube23\u927d\u4179))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_25C : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_CF_0 : byte[] [generated]
        stack_D1_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_13E_0 : byte[] [generated]
        stack_1E3_0 : byte[] [generated]
        stack_26F_0 : byte[] [generated]
        stack_2AA_0 : byte[] [generated]
        stack_300_0 : byte[] [generated]
        var_4_1C5 : int
        var_3_1CA : byte[]
        var_5_1CB : int
        var_0_1FC : int
        expr_1E3 : byte [generated]
        stack_22A_2 : byte [generated]
        stack_1FF_0 : byte [generated]
        expr_9E : int [generated]
        var_2_CF : byte[]
        expr_D3 : int [generated]
        var_3_298 : byte[]
        var_5_299 : int
        expr_106 : int [generated]
        var_3_2EE : byte[]
        var_5_2EF : int
        expr_300 : byte [generated]
        var_3_14A : String
        expr_152 : String[] [generated]
        expr_15C : String[] [generated]
        var_3_19C : String[]
        
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
        var_0_25C = and:int(ldc:int(-854297946), ldc:int(-340432468))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_CF_0 = stack_D1_0 = stack_104_0 = stack_106_0 = stack_13E_0 = stack_1E3_0 = stack_26F_0 = stack_2AA_0 = stack_300_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("VPEC+AIRBg/+/gH6+gj/Bgc=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1C5 = expr_6B:int
        var_3_1CA = newarray:byte[](byte.class, expr_6B:int)
        var_5_1CB = expr_6B:int
        Label_0461:
        
        while (cmpeq:boolean(and:int(var_0_25C:int, ldc:int(8)), ldc:int(0))) {
            var_0_1FC = and:int(var_0_25C:int, ldc:int(-1080221460))
            var_5_1CB = add:int(var_5_1CB:int, ldc:int(-1))
            expr_1E3 = stack_22A_2 = loadelement(stack_1E3_0, var_5_1CB)
            
            if (cmplt:boolean(add:int(add:int(var_5_1CB:int, ldc:int(6)), neg:int(var_4_1C5:int)), ldc:int(0))) {
                stack_22A_2 = stack_1FF_0 = add:byte(expr_1E3:byte, loadelement:byte(var_3_1CA:byte[], add:int(var_5_1CB:int, ldc:int(6))))
                goto(Label_0527)
            }
            
            Label_0496:
            
            if (cmpne:boolean(and:int(var_0_1FC:int, ldc:int(4)), ldc:int(0))) {
                var_0_1FC = and:int(var_0_1FC:int, ldc:int(-646467091))
                stack_22A_2 = stack_1FF_0 = add:byte(expr_1E3:byte, ldc:byte(6))
            }
            
            Label_0527:
            
            if (cmpeq:boolean(and:int(var_0_1FC:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_1FC = and:int(var_0_1FC:int, ldc:int(-377493091))
                goto(Label_0496)
            }
            
            var_0_25C = and:int(var_0_1FC:int, ldc:int(-1992416020))
            storeelement:byte(var_3_1CA:byte[], var_5_1CB:int, stack_22A_2:byte)
            
            if (cmpne:boolean(var_5_1CB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_104_0 = stack_106_0 = stack_13E_0 = stack_1E3_0 = stack_26F_0 = stack_2AA_0 = stack_300_0 = var_3_1CA:byte[]
            goto(Label_0112)
        }
        
        Label_0592:
        
        while (cmpeq:boolean(and:int(var_0_25C:int, ldc:int(8)), ldc:int(0))) {
            var_0_25C = and:int(var_0_25C:int, ldc:int(-1611288860))
            var_5_1CB = add:int(var_5_1CB:int, ldc:int(-1))
            storeelement:byte(var_3_1CA:byte[], var_5_1CB:int, xor:byte(loadelement:byte(stack_26F_0:byte[], var_5_1CB:int), ldc:byte(93)))
            
            if (cmpne:boolean(var_5_1CB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_104_0 = stack_106_0 = stack_13E_0 = stack_1E3_0 = stack_26F_0 = stack_2AA_0 = stack_300_0 = var_3_1CA:byte[]
            goto(Label_0163)
        }
        
        var_0_25C = and:int(var_0_25C:int, ldc:int(115381399))
        goto(Label_0461)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_25C:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_25C = and:int(var_0_25C:int, ldc:int(513154008))
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_25C:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0216)
        }
        
        if (cmpeq:boolean(and:int(var_0_25C:int, ldc:int(4)), ldc:int(0))) {
            var_0_25C = and:int(var_0_25C:int, ldc:int(647890245))
        }
        else {
            var_0_25C = and:int(var_0_25C:int, ldc:int(-652433435))
            expr_9E = arraylength:int(stack_9E_0:byte[])
            
            if (cmpne:boolean(expr_9E:int, ldc:int(0))) {
                var_4_1C5 = expr_9E:int
                var_3_1CA = newarray:byte[](byte.class, expr_9E:int)
                var_5_1CB = expr_9E:int
                goto(Label_0592)
            }
        }
        
        Label_0163:
        
        if (cmpne:boolean(and:int(var_0_25C:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpne:boolean(and:int(var_0_25C:int, ldc:int(8)), ldc:int(0))) {
            var_0_25C = and:int(var_0_25C:int, ldc:int(-1850824115))
        }
        else {
            if (cmpne:boolean(and:int(var_0_25C:int, ldc:int(524288)), ldc:int(0))) {
                var_0_25C = and:int(var_0_25C:int, ldc:int(1826480134))
                goto(Label_0112)
            }
            
            var_0_25C = and:int(var_0_25C:int, ldc:int(-304139521))
            var_2_CF = stack_CF_0:byte[]
            expr_D3 = add:int(arraylength:int(stack_D1_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D3:int, ldc:int(0))) {
                var_3_298 = newarray:byte[](byte.class, expr_D3:int)
                var_5_299 = expr_D3:int
                
                loop {
                    var_0_25C = and:int(var_0_25C:int, ldc:int(-1984450833))
                    var_5_299 = add:int(var_5_299:int, ldc:int(-1))
                    storeelement:byte(var_3_298:byte[], var_5_299:int, add:int(shl:int(loadelement:byte(stack_2AA_0:byte[], var_5_299:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_CF:byte[], add:int(var_5_299:int, and:int(ldc:int(16393), ldc:int(2499)))), ldc:int(4)), and:int(ldc:int(527), ldc:int(8239)))))
                    
                    if (cmpne:boolean(var_5_299:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_104_0 = stack_106_0 = stack_13E_0 = stack_1E3_0 = stack_26F_0 = stack_2AA_0 = stack_300_0 = var_3_298:byte[]
            }
        }
        
        Label_0216:
        
        if (cmpeq:boolean(and:int(var_0_25C:int, ldc:int(32)), ldc:int(0))) {
            var_0_25C = and:int(var_0_25C:int, ldc:int(-1270001145))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_25C:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0163)
            }
            
            if (cmpeq:boolean(and:int(var_0_25C:int, ldc:int(32)), ldc:int(0))) {
                var_0_25C = and:int(var_0_25C:int, ldc:int(-1381339038))
                goto(Label_0112)
            }
            
            var_0_25C = and:int(var_0_25C:int, ldc:int(-1451857932))
            expr_106 = arraylength:int(stack_106_0:byte[])
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_3_2EE = newarray:byte[](byte.class, expr_106:int)
                var_5_2EF = expr_106:int
                
                loop {
                    var_0_25C = and:int(var_0_25C:int, ldc:int(-1720275012))
                    var_5_2EF = add:int(var_5_2EF:int, ldc:int(-1))
                    expr_300 = loadelement:byte(stack_300_0:byte[], var_5_2EF:int)
                    storeelement:byte(var_3_2EE:byte[], var_5_2EF:int, add:int(or:int(and:int(shl:int(expr_300:byte, and:int(ldc:int(25812), ldc:int(268))), ldc:int(-16)), and:int(shr:int(expr_300:byte[expected:int], xor:int(ldc:int(13312), ldc:int(13316))), ldc:int(15))), ldc:int(22)))
                    
                    if (cmpne:boolean(var_5_2EF:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CF_0 = stack_D1_0 = stack_104_0 = stack_106_0 = stack_13E_0 = stack_1E3_0 = stack_26F_0 = stack_2AA_0 = stack_300_0 = var_3_2EE:byte[]
            }
        }
        
        Label_0267:
        
        if (cmpeq:boolean(and:int(var_0_25C:int, ldc:int(4)), ldc:int(0))) {
            var_0_25C = and:int(var_0_25C:int, ldc:int(39244551))
            goto(Label_0216)
        }
        
        if (cmpne:boolean(and:int(var_0_25C:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_25C = and:int(var_0_25C:int, ldc:int(-1424177736))
            goto(Label_0163)
        }
        
        if (cmpeq:boolean(and:int(var_0_25C:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_25C = and:int(var_0_25C:int, ldc:int(1845237770))
            goto(Label_0112)
        }
        
        var_3_14A = initobject:String(String::<init>, stack_13E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_152 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-29664), ldc:int(-29662)))
        expr_15C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16754), ldc:int(10)))
        storeelement:String(expr_152:String[], and:int(ldc:int(24812), ldc:int(-25071)), invokevirtual:String[expected:String](String::substring, var_3_14A:String, and:int(ldc:int(-7799), ldc:int(7780)), and:int(ldc:int(8233), ldc:int(267))))
        storeelement:String(expr_152:String[], xor:int(ldc:int(-32223), ldc:int(-32224)), invokevirtual:String[expected:String](String::substring, var_3_14A:String, and:int(ldc:int(11503), ldc:int(4105)), and:int(ldc:int(20), ldc:int(6675))))
        putstatic:String[](\u61a4\u600f\uae87\ube23\u927d\u4179::\u0c95\u4cd9\u4975\u6d99\u4ab3\u8308, expr_15C:String[])
        var_3_19C = expr_152:String[]
        putstatic:Logger(\u61a4\u600f\uae87\ube23\u927d\u4179::\u5654\uae5d\u647c\u99f7\u6d99\ub102, invokestatic:Logger(LogManager::getLogger))
        putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u61a4\u600f\uae87\ube23\u927d\u4179::\ub113\uc246\u6fb0\ub70c\u392e\ub7dc, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_19C:String[], and:int(ldc:int(2349), ldc:int(-2350))), loadelement:String(var_3_19C:String[], xor:int(ldc:int(2210), ldc:int(2211)))))
    }
    
    public void \u4bc8\u4d85\uc87f\u836c\u4179\u7873(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A0 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6AB : int
        
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
        var_3_6A0 = and:int(ldc:int(1822538186), ldc:int(-674841645))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u61a4\u600f\uae87\ube23\u927d\u4179[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(256)), ldc:int(0))) {
            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-446946277))
        }
        else {
            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(2029493206))
            var_5_8A = and:int(ldc:int(6968), ldc:int(-6969))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-20058), ldc:int(20056)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6A0:int, ldc:int(1509408227))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(5281), ldc:int(593)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(801), ldc:int(10313)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6A0 = and:int(var_3_E3:int, ldc:int(1132772823))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(8218), ldc:int(8219)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-1107723681))
                        goto(Label_1601)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-1014046259))
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(1033162970))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(1607068191))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-2131961733))
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(2078531527))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0604)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1601)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-456368018))
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-138174735))
                        goto(Label_1312)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-456131460))
                        goto(Label_1179)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(348571057))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(833123305))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-661471745))
                            var_11_F4 = and:int(ldc:int(6964), ldc:int(-7093))
                            goto(Label_1590)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0604:
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(449381397))
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(241091778))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-667873923))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-1446981016))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(28908548))
                            loopcontinue()
                        }
                        
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-1014326317))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(1414741898))
                        goto(Label_1601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(2094928708))
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(1668370149))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(837924969))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-593895105))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-862389253))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1601)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(1534996881))
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(1162621672))
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1179)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-1610295064))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(260831029))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-75178529))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(-32716), ldc:int(-32715))
                                goto(Label_1179)
                            }
                        }
                    }
                    
                    Label_1003:
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-1500815304))
                        goto(Label_1601)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(463230883))
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(1390627633))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-693092010))
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-1345690979))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(1013260126))
                            loopcontinue()
                        }
                        
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(1572405246))
                        var_11_F4 = and:int(ldc:int(5163), ldc:int(-22080))
                    }
                    
                    Label_1179:
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-955570671))
                        goto(Label_1601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-1390166040))
                            goto(Label_1003)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-1852783586))
                            goto(Label_0879)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(1419137653))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-1884248440))
                            loopcontinue()
                        }
                        
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(1793317866))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1473)
                            }
                        }
                    }
                    
                    Label_1312:
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(1988947594))
                            goto(Label_1179)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(1540908601))
                            goto(Label_1003)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-462896688))
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(349469554))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-267070857))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-1303431643))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(1243384596))
                            loopcontinue()
                        }
                        
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-759047717))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1590)
                    }
                    
                    Label_1473:
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(830652902))
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1179)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1003)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-1615484375))
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-476594706))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1590:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AB = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1601:
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1473)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1312)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(129889235))
                        goto(Label_1179)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-916417969))
                        goto(Label_1003)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A0:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-119105049))
                        var_17_6AB = add:int(var_16_122:int, xor:int(ldc:int(785), ldc:int(784)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-326247953))
                
                if (cmple:boolean(var_5_8A = var_17_6AB:int, sub:int(var_6_91:int, and:int(ldc:int(1281), ldc:int(4113))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6A0:int, ldc:int(16384)), ldc:int(0))) {
            var_3_6A0 = and:int(var_3_6A0:int, ldc:int(-1244818130))
            goto(Label_0108)
        }
    }
}
