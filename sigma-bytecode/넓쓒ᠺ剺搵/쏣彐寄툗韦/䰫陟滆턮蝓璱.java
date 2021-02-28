public class \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u4c2b\u965f\u6ec6\ud12e\u8753\u74b1 {
    public void \u4c2b\u965f\u6ec6\ud12e\u8753\u74b1(\u56bd\u8413\u647c\u5bc4\ud158.\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6 p1) {
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
            putfield:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b(\u4c2b\u965f\u6ec6\ud12e\u8753\u74b1::\ubded\u760c\u6d99\u6b5f\u3a62\ud158, this:\u4c2b\u965f\u6ec6\ud12e\u8753\u74b1, p0:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b)
            putfield:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u4c2b\u965f\u6ec6\ud12e\u8753\u74b1::\ud171\u7d52\u7e3f\u6198\u97b7\u9a18, this:\u4c2b\u965f\u6ec6\ud12e\u8753\u74b1, p1:\u1833\ud171\u8350\ubded\u34df\uc9f6)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u4c2b\u965f\u6ec6\ud12e\u8753\u74b1)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0a06\u93a2\ud7e8\u6198\u156b\u8640() {
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
    
    private void lambda$\u3a62\u8389\u6bb9\u93a2\uf995\u47c2$0(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p1) {
        var_3_8B : int
        var_5_75 : short
        var_6_7E : int
        
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
            var_3_8B = and:int(ldc:int(-1416574905), ldc:int(-640154377))
            invokevirtual:Object(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1))
            var_5_75 = invokevirtual:short(Short::shortValue, checkcast:Short(java.lang.Short.class, invokevirtual:Short(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Short>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u7006\u6c52\ub6ab\u93a2\u69d9\ub7dc))))
            var_6_7E = and:int(ldc:int(310), ldc:int(-1335))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_8B:int, ldc:int(32)), ldc:int(0))) {
                    var_3_8B = and:int(var_3_8B:int, ldc:int(-862464409))
                    
                    if (cmplt:boolean(var_6_7E:short, var_5_75:short)) {
                        invokeinterface:void(\u0a06\u4daf\ub83f\uae5d\u16f6\u6bb9::\u99f7\u600f\u72f1\u6fb0\u67d0\uc238, invokestatic:\u0a06\u4daf\ub83f\uae5d\u16f6\u6bb9(\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b::\uc29a\u2dcc\u4f52\ub18d\u51fa\u5245, getfield:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b(\u4c2b\u965f\u6ec6\ud12e\u8753\u74b1::\ubded\u760c\u6d99\u6b5f\u3a62\ud158, this:\u4c2b\u965f\u6ec6\ud12e\u8753\u74b1)), checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>)))
                        invokeinterface:void(\u0a06\u4daf\ub83f\uae5d\u16f6\u6bb9::\u99f7\u600f\u72f1\u6fb0\u67d0\uc238, invokestatic:\u0a06\u4daf\ub83f\uae5d\u16f6\u6bb9(\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b::\uc29a\u2dcc\u4f52\ub18d\u51fa\u5245, getfield:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b(\u4c2b\u965f\u6ec6\ud12e\u8753\u74b1::\ubded\u760c\u6d99\u6b5f\u3a62\ud158, this:\u4c2b\u965f\u6ec6\ud12e\u8753\u74b1)), checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>)))
                        
                        if (invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8))))) {
                            invokeinterface:void(\u0a06\u4daf\ub83f\uae5d\u16f6\u6bb9::\u99f7\u600f\u72f1\u6fb0\u67d0\uc238, invokestatic:\u0a06\u4daf\ub83f\uae5d\u16f6\u6bb9(\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b::\uc29a\u2dcc\u4f52\ub18d\u51fa\u5245, getfield:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b(\u4c2b\u965f\u6ec6\ud12e\u8753\u74b1::\ubded\u760c\u6d99\u6b5f\u3a62\ud158, this:\u4c2b\u965f\u6ec6\ud12e\u8753\u74b1)), checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>)))
                        }
                        
                        var_3_8B = and:int(var_3_8B:int, ldc:int(-36534841))
                        invokevirtual:Boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8))
                        invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140))
                        invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140))
                        invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140))
                        invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140))
                        invokevirtual:Object(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u4ab3\ub32d\u72f1\u873d\u9a18\uf995[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ua61f\u5fe1\uc84e\u7049\u62da\u51fa))
                        invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140))
                        inc:short(var_6_7E, ldc:short(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_8B:int, ldc:int(32)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_8B = and:int(var_3_8B:int, ldc:int(-1617000355))
            }
            
            return:void()
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
    
    public void \u6cfe\u3e75\uf94d\u071d\u3776\u74b1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_645 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_650 : int
        
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
        var_3_645 = and:int(ldc:int(833653539), ldc:int(2142300067))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4c2b\u965f\u6ec6\ud12e\u8753\u74b1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_645 = and:int(var_3_645:int, ldc:int(1700154673))
        }
        else {
            var_3_645 = and:int(var_3_645:int, ldc:int(-1079377933))
            var_5_85 = and:int(ldc:int(-15854), ldc:int(15813))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-1615), ldc:int(590)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_645:int, ldc:int(-173101641))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(46), ldc:int(47)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(225), ldc:int(224)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_645 = and:int(var_3_DA:int, ldc:int(905958323))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(-32507), ldc:int(-32508)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(2072507162))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-977970819))
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(545425657))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1035112628))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-401105521))
                    }
                    else {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1006340003))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1332976337))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-2095563559))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1935685030))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(2008517995))
                            var_11_EB = and:int(ldc:int(5161), ldc:int(-6058))
                            goto(Label_1471)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0549:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-545582671))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-195367861))
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(32)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(768971767))
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(856788870))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1328494366))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-928405053))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(933529403))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0810)
                        }
                    }
                    
                    Label_0676:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1737838875))
                        goto(Label_1482)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1285353802))
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(376342793))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-261274149))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1211778885))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1444724186))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(2108751655))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0810:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1333)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1140161865))
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-378857524))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1783655988))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(1100470012))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-912506424))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1242589257))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(-12256), ldc:int(-12255))
                                goto(Label_1080)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-645120447))
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1583314584))
                        goto(Label_1196)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-965760254))
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1636313018))
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-206532689))
                        var_11_EB = and:int(ldc:int(-14055), ldc:int(9952))
                    }
                    
                    Label_1080:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(32)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1566171959))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1699807026))
                        goto(Label_1333)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1726519616))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(548125643))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(-5991453))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1333)
                            }
                        }
                    }
                    
                    Label_1196:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(1929925714))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-894133884))
                            goto(Label_1080)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0810)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(-1530064398))
                            goto(Label_0676)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(32)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(385804027))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_645 = and:int(var_3_645:int, ldc:int(735582176))
                            loopcontinue()
                        }
                        
                        var_3_645 = and:int(var_3_645:int, ldc:int(2079041467))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1471)
                    }
                    
                    Label_1333:
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(128)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-606402083))
                        goto(Label_1482)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(4)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-236268470))
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(296747119))
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-183832523))
                        goto(Label_0810)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1656455143))
                        goto(Label_0549)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_645 = and:int(var_3_645:int, ldc:int(-1281236117))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1471:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_650 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1482:
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1908420742))
                        goto(Label_1333)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-1527630341))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(256)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(-408321366))
                        goto(Label_0810)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0676)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(701748226))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_645:int, ldc:int(2)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(498462079))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_645:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_645 = and:int(var_3_645:int, ldc:int(899742515))
                        var_17_650 = add:int(var_16_119:int, xor:int(ldc:int(424), ldc:int(425)))
                        looporswitchbreak()
                    }
                    
                    var_3_645 = and:int(var_3_645:int, ldc:int(-1410100766))
                }
                
                var_3_645 = and:int(var_3_645:int, ldc:int(-101003805))
                
                if (cmple:boolean(var_5_85 = var_17_650:int, sub:int(var_6_8C:int, and:int(ldc:int(3345), ldc:int(1))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_645:int, ldc:int(16)), ldc:int(0))) {
            var_3_645 = and:int(var_3_645:int, ldc:int(192565195))
            goto(Label_0106)
        }
    }
}
