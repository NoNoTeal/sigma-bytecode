public class \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u4975\u67d0\u12b2\uc9f6\u9a18\u52d3 {
    public void \u4975\u67d0\u12b2\uc9f6\u9a18\u52d3(\u56bd\u8413\u647c\u5bc4\ud158.\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b p0, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6 p1) {
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
            putfield:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b(\u4975\u67d0\u12b2\uc9f6\u9a18\u52d3::\u6ec6\ud217\u7d52\u3dd3\u74b1\u4e72, this:\u4975\u67d0\u12b2\uc9f6\u9a18\u52d3, p0:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b)
            putfield:\u1833\ud171\u8350\ubded\u34df\uc9f6(\u4975\u67d0\u12b2\uc9f6\u9a18\u52d3::\u6fb0\uae5d\ub171\u72f1\u6d69\u7330, this:\u4975\u67d0\u12b2\uc9f6\u9a18\u52d3, p1:\u1833\ud171\u8350\ubded\u34df\uc9f6)
            invokespecial:\u5d20\u6bb9\ub113\u983f\u47c2\u718f(\u5d20\u6bb9\ub113\u983f\u47c2\u718f::<init>, this:\u4975\u67d0\u12b2\uc9f6\u9a18\u52d3)
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
    
    private void lambda$\u61a4\ube23\u74b1\u5d20\u983f\u47c2$0(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u1833\ud171\u8350\ubded\u34df\uc9f6 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4 p1) {
        var_3_5F : int
        var_5_75 : int
        var_6_7E : int
        var_3_14B : int
        var_7_161 : int
        var_8_16A : int
        
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
            var_3_5F = and:int(ldc:int(-1805761071), ldc:int(2144747987))
            invokevirtual:Boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8))
            var_5_75 = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1))))
            var_6_7E = and:int(ldc:int(-16773), ldc:int(16772))
            
            loop {
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(655989986))
                    goto(Label_0290)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0240)
                }
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(131072)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(1995326957))
                    
                    if (cmplt:boolean(var_6_7E:int, var_5_75:int)) {
                        invokevirtual:String(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<String>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u0c95\ube23\u12cb\u839e\ucb79\u56bd))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8)))))) {
                            goto(Label_0240)
                        }
                        
                        invokevirtual:String(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<String>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u0c95\ube23\u12cb\u839e\ucb79\u56bd))
                        goto(Label_0240)
                    }
                }
                
                Label_0169:
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(417393111))
                    goto(Label_0290)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(65536)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(1878600751))
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0240:
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(64)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(-1136056934))
                        goto(Label_0169)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8192)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-1074276375))
                    
                    if (invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Boolean>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uc4d2\ud4fe\u3dd3\uc910\u5d20\uceb8))))) {
                        invokevirtual:JsonElement(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<JsonElement>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uf9c5\ube23\u647c\u93a2\u36d3\u9033))
                        invokevirtual:JsonElement(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<JsonElement>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\uf9c5\ube23\u647c\u93a2\u36d3\u9033))
                        invokeinterface:void(\u0a06\u4daf\ub83f\uae5d\u16f6\u6bb9::\u99f7\u600f\u72f1\u6fb0\u67d0\uc238, invokestatic:\u0a06\u4daf\ub83f\uae5d\u16f6\u6bb9(\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b::\uc29a\u2dcc\u4f52\ub18d\u51fa\u5245, getfield:\u8aa5\u0a06\ud7e8\u7873\ucb79\u4c2b(\u4975\u67d0\u12b2\uc9f6\u9a18\u52d3::\u6ec6\ud217\u7d52\u3dd3\u74b1\u4e72, this:\u4975\u67d0\u12b2\uc9f6\u9a18\u52d3)), checkcast:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a.class, invokevirtual:\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, p0:\u1833\ud171\u8350\ubded\u34df\uc9f6<\u7d52\u69d9\uae87\ud4fe\uc910\u3e2a>)))
                        invokevirtual:Object(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1))
                        
                        if (cmpne:boolean(and:int(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u6198\u4975\ub83f\ub7dc\u3d64\u5140)))), and:int(ldc:int(14343), ldc:int(17185))), ldc:int(0))) {
                            invokevirtual:String(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<String>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u0c95\ube23\u12cb\u839e\ucb79\u56bd))
                        }
                        
                        var_3_5F = and:int(var_3_5F:int, ldc:int(517984743))
                        invokevirtual:Object(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u4ab3\ub32d\u72f1\u873d\u9a18\uf995[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ua61f\u5fe1\uc84e\u7049\u62da\u51fa))
                        invokevirtual:Object(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u4ab3\ub32d\u72f1\u873d\u9a18\uf995[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Object>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ua61f\u5fe1\uc84e\u7049\u62da\u51fa))
                    }
                }
                
                Label_0290:
                
                if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(8192)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(353705032))
                    goto(Label_0240)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0169)
                }
                
                if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(64)), ldc:int(0))) {
                    var_3_5F = and:int(var_3_5F:int, ldc:int(-944810839))
                }
                else {
                    var_3_14B = and:int(var_3_5F:int, ldc:int(2086586619))
                    invokevirtual:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<String[]>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u5bc4\uc84e\u36d3\ud158\u98a4\u983f))
                    var_7_161 = invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokevirtual:Integer(\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\uceb8\u4c2b\ub8be\u7049\u8308\u3a62[expected:\u1833\ud171\u8350\ubded\u34df\uc9f6<Integer>](\u1833\ud171\u8350\ubded\u34df\uc9f6::\ud523\u62da\u6c52\u7043\ud217\u72f1))))
                    var_8_16A = and:int(ldc:int(-3778), ldc:int(3777))
                    
                    while (cmplt:boolean(var_8_16A:int, var_7_161:int)) {
                        invokevirtual:String[](\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4::\u5bc4\u3a62\u983f\u960f\u516c\u8753, p1:\u59ec\uc29a\uc84e\u12b2\u5db4\u98a4, getstatic:\u1833\ud171\u8350\ubded\u34df\uc9f6<String[]>(\u1833\ud171\u8350\ubded\u34df\uc9f6::\u5bc4\uc84e\u36d3\ud158\u98a4\u983f))
                        inc:int(var_8_16A, ldc:int(1))
                    }
                    
                    var_3_5F = and:int(var_3_14B:int, ldc:int(2136425195))
                    inc:int(var_6_7E, ldc:int(1))
                }
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
        var_3_5F7 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_602 : int
        
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
        var_3_5F7 = and:int(ldc:int(-1897297963), ldc:int(-1090874119))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4975\u67d0\u12b2\uc9f6\u9a18\u52d3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8192)), ldc:int(0))) {
            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1882469563))
        }
        else {
            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1350637579))
            var_5_85 = and:int(ldc:int(-32591), ldc:int(15178))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18336), ldc:int(18203)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_5F7:int, ldc:int(-268761091))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(337), ldc:int(336)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(2176), ldc:int(2177)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_5F7 = and:int(var_3_DA:int, ldc:int(-1099160361))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(513), ldc:int(2455)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(861250306))
                        goto(Label_1171)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1649975913))
                        goto(Label_1037)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-926451476))
                        goto(Label_0886)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(470500965))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1064003786))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(2041777300))
                    }
                    else {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1937828641))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1971261513))
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1171)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1037)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1237935306))
                        goto(Label_0886)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-826090667))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(16)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1879270191))
                            var_11_EB = and:int(ldc:int(5741), ldc:int(-5998))
                            goto(Label_1411)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-816282084))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(2011598168))
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1171)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1037)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(1)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-255860657))
                        goto(Label_0886)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-2073080760))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-59185673))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0778)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-458060873))
                        goto(Label_1171)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1313336130))
                        goto(Label_1037)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0886)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1528616822))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1083635747))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0778:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1545811820))
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1171)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(32)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(801616921))
                        goto(Label_1037)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1905149905))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1614125611))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(928), ldc:int(929))
                                goto(Label_1037)
                            }
                        }
                    }
                    
                    Label_0886:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1290)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(80372090))
                        goto(Label_1171)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-715924979))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1004654987))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-892353582))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-303553067))
                        var_11_EB = and:int(ldc:int(1926), ldc:int(-18312))
                    }
                    
                    Label_1037:
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-552548902))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-357853168))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0886)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1840778123))
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(101536443))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(32)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-63972371))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1710070114))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1124514571))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1290)
                            }
                        }
                    }
                    
                    Label_1171:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-550361708))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(180530810))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_1037)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0886)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0778)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-911348025))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1645512747))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1411)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1290:
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1171)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1037)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1295878305))
                        goto(Label_0886)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1640035899))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1490938308))
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1350875429))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1411:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_602 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1422:
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1290)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(1116248645))
                        goto(Label_1171)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(64)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1224524281))
                        goto(Label_1037)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0886)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(2)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1917009875))
                        goto(Label_0778)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-782437918))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_5F7:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(128)), ldc:int(0))) {
                        var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1887590669))
                        var_17_602 = add:int(var_16_119:int, xor:int(ldc:int(18), ldc:int(19)))
                        looporswitchbreak()
                    }
                }
                
                var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-312914217))
                
                if (cmple:boolean(var_5_85 = var_17_602:int, sub:int(var_6_8C:int, and:int(ldc:int(16649), ldc:int(17))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_5F7:int, ldc:int(32)), ldc:int(0))) {
            var_3_5F7 = and:int(var_3_5F7:int, ldc:int(-1651591357))
            goto(Label_0106)
        }
    }
}
