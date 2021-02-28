public class \u56bd\u8413\u647c\u5bc4\ud158.\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1 {
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52[] \u64f2\u759a\u9255\u0c95\ubded\u927d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p4) {
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
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 \u760c\u6b0d\uc2e8\ubded\u3776\ub83f(int p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p4, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p5) {
        var_6_91 : int
        var_8_64 : \u6c52\ubded\u4975\u71ae\u47c2\u7d52
        
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
            var_6_91 = and:int(ldc:int(-1440899743), ldc:int(-1696654505))
            var_8_64 = p1:\u6c52\ubded\u4975\u71ae\u47c2\u7d52
            
            if (cmpne:boolean(and:int(p0:int, xor:int(ldc:int(16976), ldc:int(16977))), ldc:int(0))) {
                var_8_64 = invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, p1:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, p2:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
            }
            
            loop {
                if (cmpne:boolean(and:int(var_6_91:int, ldc:int(8388608)), ldc:int(0))) {
                    var_6_91 = and:int(var_6_91:int, ldc:int(2133375454))
                    goto(Label_0224)
                }
                
                if (cmpeq:boolean(and:int(var_6_91:int, ldc:int(2048)), ldc:int(0))) {
                    var_6_91 = and:int(var_6_91:int, ldc:int(-1000446078))
                }
                else {
                    var_6_91 = and:int(var_6_91:int, ldc:int(-1674479247))
                    
                    if (cmpne:boolean(and:int(p0:int, xor:int(ldc:int(769), ldc:int(771))), ldc:int(0))) {
                        var_8_64 = invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, var_8_64:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, p3:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
                    }
                }
                
                Label_0169:
                
                if (cmpne:boolean(and:int(var_6_91:int, ldc:int(16)), ldc:int(0))) {
                    var_6_91 = and:int(var_6_91:int, ldc:int(388854206))
                }
                else {
                    if (cmpne:boolean(and:int(var_6_91:int, ldc:int(16777216)), ldc:int(0))) {
                        var_6_91 = and:int(var_6_91:int, ldc:int(-1822476530))
                        loopcontinue()
                    }
                    
                    var_6_91 = and:int(var_6_91:int, ldc:int(-1728595805))
                    
                    if (cmpne:boolean(and:int(p0:int, and:int(ldc:int(16662), ldc:int(3109))), ldc:int(0))) {
                        var_8_64 = invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, var_8_64:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, p4:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
                    }
                }
                
                Label_0224:
                
                if (cmpne:boolean(and:int(var_6_91:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0169)
                }
                
                if (cmpne:boolean(and:int(var_6_91:int, ldc:int(2048)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            if (cmpne:boolean(and:int(p0:int, ldc:int(8)), ldc:int(0))) {
                var_8_64 = invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\ufcaf\ud51e\u8389\uf94d\u71f1\uc84e, var_8_64:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, p5:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
            }
            
            return:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(var_8_64:\u6c52\ubded\u4975\u71ae\u47c2\u7d52)
        }
        
        goto(Label_0006)
    }
    
    public void \u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u47c2\ubded\u12cb\u3dd3\u12cb\u0800 p1) {
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
            invokespecial:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::<init>, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1, p1:\u47c2\ubded\u12cb\u3dd3\u12cb\u0800)
            invokevirtual:void(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u36d3\u624e\u4c2b\u56bd\u385b\u4c2b, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1[expected:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a], checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u5654\ub83f\u71f1\u7bad\ub1b9\u6b5f, getfield:\ubcb0\ud4fe\uff55\u965f\u5f50\u9937<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ufcaf\ub7dc\u16f6\u12b2\u4d85\ubff1, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1))), getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d90\u5bc4\u6435\u385b\u4d85\ub83f), getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uceb8\u839e\uae5d\u4c04\u446c\ub7dc))), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4daf\uc2bd\u40a9\u760c\ud4fe\u071d), getstatic:\u8640\u59ec\u960f\u9033\u8cae\ud4fe(\u8640\u59ec\u960f\u9033\u8cae\ud4fe::\u56bd\ub1b9\u7bad\ufcaf\u647c\u47c2))), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u516c\u92ff\u74b1\u97e6\ub171\u3711>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0), getstatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u516c\u92ff\u74b1\u97e6\ub171\u3711::\uc2e8\uf94d\ud4fe\u97e6\u5f50\u64f2))), getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4bc8\u51fa\uc246\u51b2\u983f\u416d), invokestatic:Boolean(Boolean::valueOf, and:int[expected:boolean](ldc:int(-18017), ldc:int(18016))))))
            putfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\u97b7\u0c95\u3776\u92ee\u8308, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))
            putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4d85\ua562\u6d69\u965f\u0800\ub1b9, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ua6bd\u3776\u7006\uc229\u3dd3\u946b(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(2049), ldc:int(9217)))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 \u6b5f\u5fe1\ua3b4\u873d\u71ae\ub113(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u494c\u4975\ua068\u0c95\uc84e.\ucfaf\u9255\u839e\u8258\uc31c\u983f p3) {
        var_5_61 : int
        stack_94_0 : \u6c52\ubded\u4975\u71ae\u47c2\u7d52[] [generated]
        
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
            var_5_61 = and:int(ldc:int(-154642580), ldc:int(-563355673))
            
            if (cmpne:boolean(invokevirtual:\u8640\u59ec\u960f\u9033\u8cae\ud4fe(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4daf\uc2bd\u40a9\u760c\ud4fe\u071d)), getstatic:\u8640\u59ec\u960f\u9033\u8cae\ud4fe(\u8640\u59ec\u960f\u9033\u8cae\ud4fe::\uafe7\u6cfe\ubf56\uc29a\u4ab3\u3d4b))) {
                var_5_61 = and:int(var_5_61:int, ldc:int(-210881691))
                stack_94_0 = getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4e72\u3bd6\u97b7\u839e\u8d90\u4cd9)
            }
            else {
                stack_94_0 = getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8413\u12cb\u6cfe\u8cae\ub171\ucfaf)
            }
            
            return:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(loadelement:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(stack_94_0:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[], loadelement:int(getstatic:int[](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u527a\ub7dc\u4e72\u56bd\u8389\u67e9), invokespecial:int(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u873d\u47c2\u1833\ud36e\u7af6\u6198, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d))))
        }
        
        goto(Label_0006)
    }
    
    private int \u873d\u47c2\u1833\ud36e\u7af6\u6198(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
            return:int(add:int(mul:int(invokevirtual:int(Enum<E>::ordinal, checkcast:\u516c\u92ff\u74b1\u97e6\ub171\u3711[expected:Enum<\u516c\u92ff\u74b1\u97e6\ub171\u3711>](\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u516c\u92ff\u74b1\u97e6\ub171\u3711.class, invokevirtual:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u516c\u92ff\u74b1\u97e6\ub171\u3711>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0)))), and:int(ldc:int(6918), ldc:int(16564))), invokevirtual:int(\u760c\u4975\u4179\uc246\u8640\u64f2::\u9937\u40a9\ucb79\uf94d\u7330\u960f, checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d90\u5bc4\u6435\u385b\u4d85\ub83f))))))
        }
        
        goto(Label_0006)
    }
    
    public void \u6d99\u156b\ud12e\ubff1\u3711\u74b1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, java.util.Random p3) {
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
            invokevirtual:void(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u6d99\u156b\ud12e\ubff1\u3711\u74b1, getfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\u97b7\u0c95\u3776\u92ee\u8308, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1), p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:Random)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8d98\u3d64\u9af2\u4492\u4c2b\u385b(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p3) {
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
            invokevirtual:void(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u4492\uc3e3\u8709\ud7e8\u59ec\u8709, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4d85\ua562\u6d69\u965f\u0800\ub1b9, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1), p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:\ua3b4\u8aa5\ub113\ubf56\u873d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u1187\u647c\u40a9\ub1b9\u4d85\u7049(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2) {
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
            invokevirtual:void(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u1187\u647c\u40a9\ub1b9\u4d85\u7049, getfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\u97b7\u0c95\u3776\u92ee\u8308, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1), p0:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public float \u8bb0\u4f4a\u156b\u8753\u92ee\ub7dc() {
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
            return:float(invokevirtual:float(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8bb0\u4f4a\u156b\u8753\u92ee\ub7dc, getfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\u97b7\u0c95\u3776\u92ee\u8308, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1)))
        }
        
        goto(Label_0006)
    }
    
    public void \u4ab3\u446c\ucfaf\u92ff\ub6ab\ub1b9(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p3, boolean p4) {
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
            
            if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])))) {
                invokevirtual:void(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u62da\u97b7\u759a\u4d85\u4f4a\uc87f, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4d85\ua562\u6d69\u965f\u0800\ub1b9, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1), p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, and:int[expected:boolean](ldc:int(10656), ldc:int(-10657)))
                invokevirtual:void(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\u4ab3\u446c\ucfaf\u92ff\ub6ab\ub1b9, getfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\u97b7\u0c95\u3776\u92ee\u8308, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1), getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4d85\ua562\u6d69\u965f\u0800\ub1b9, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1), p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, and:int[expected:boolean](ldc:int(-2427), ldc:int(362)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3c25\ube23\u836c\u7e3f\u8d98\u8350(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p3, boolean p4) {
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
            
            if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])))) {
                invokevirtual:void(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ufe34\u51b2\u527a\uafe7\u4ab3\u4f4a, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4d85\ua562\u6d69\u965f\u0800\ub1b9, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1), p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p4:boolean)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7049\u6d69\u4f52\u946b\uafe7\u6b5f(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p2) {
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
            invokevirtual:void(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u7049\u6d69\u4f52\u946b\uafe7\u6b5f, getfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\u97b7\u0c95\u3776\u92ee\u8308, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1), p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ub6ab\uf94d\ub19c\u3e75\u71f1\u6435(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
            return:boolean(invokevirtual:boolean(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\ub6ab\uf94d\ub19c\u3e75\u71f1\u6435, getfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\u97b7\u0c95\u3776\u92ee\u8308, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1), p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d))
        }
        
        goto(Label_0006)
    }
    
    public void \u6bb9\u0b8e\ub113\uc2bd\u5d20\u6bb9(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, java.util.Random p3) {
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
            invokevirtual:void(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\u6bb9\u0b8e\ub113\uc2bd\u5d20\u6bb9, getfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\u97b7\u0c95\u3776\u92ee\u8308, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1), p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\ube23\uc238\u5140\u4cd9\u8aa5, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:Random)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u120d\u6ec6\u98a4\u52d3\u7006\ufe34(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, java.util.Random p3) {
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
            invokevirtual:void(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\u120d\u6ec6\u98a4\u52d3\u7006\ufe34, getfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\u97b7\u0c95\u3776\u92ee\u8308, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1), p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\ube23\uc238\u5140\u4cd9\u8aa5, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:Random)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u9af2\ucef1\ub102\u16f6\u61a4\ud523 \u6bb9\u6435\uc31c\u3bd6\u7043\u9255(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\ub113\u6c56\u97e6\u51b2\u4c2b p4, \ub113\uc4d2\u183a\u527a\u6435.\ud4fe\u120d\u9a18\u385b\u4492\u5f50 p5) {
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
            return:\u9af2\ucef1\ub102\u16f6\u61a4\ud523(invokevirtual:\u9af2\ucef1\ub102\u16f6\u61a4\ud523(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7c6b\u836c\uff55\u5db4\uc31c\ucfaf, getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4d85\ua562\u6d69\u965f\u0800\ub1b9, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1), p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p3:\ua3b4\u8aa5\ub113\ubf56\u873d, p4:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b, p5:\ud4fe\u120d\u9a18\u385b\u4492\u5f50))
        }
        
        goto(Label_0006)
    }
    
    public void \u3dd3\uc229\u759a\u3d64\u5140\u6ec6(\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, \u392e\ud7e8\u3bc9\u88c5\ud51e.\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79 p2) {
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
            invokevirtual:void(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u3dd3\uc229\u759a\u3d64\u5140\u6ec6, getfield:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\u97b7\u0c95\u3776\u92ee\u8308, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1), p0:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \u983f\u3504\uc29a\ub113\uc238\u5fe1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2 p0) {
        var_2_A2 : int
        var_4_66 : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_5_6C : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_6_77 : \uf995\u8709\ua61f\ub32d\ubff1\u99f7
        stack_101_0 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d [generated]
        stack_101_1 : \u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u8640\u59ec\u960f\u9033\u8cae\ud4fe> [generated]
        var_2_11A : int
        stack_101_2 : \u8640\u59ec\u960f\u9033\u8cae\ud4fe [generated]
        stack_139_0 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d [generated]
        stack_139_1 : \u3c25\ua61f\uff55\u92ff\u6b0d\ucef1 [generated]
        stack_136_0 : int [generated]
        var_7_13F : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
            var_2_A2 = and:int(ldc:int(1815365434), ldc:int(-865230852))
            var_4_66 = invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f::\u3c25\u34df\u1187\u385b\u1833\u8413, p0:\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2[expected:\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f])
            var_5_6C = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2::\u3d64\u67e9\u5245\u4daf\u8d90\uafe7, p0:\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2)
            var_6_77 = invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u9033\u3711\u494c\u88c5\u69d9\u97b7, invokevirtual:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f::\uae5d\ud171\u6b5f\u8753\u8753\u5db4, p0:\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2[expected:\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f]), var_5_6C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            stack_101_0 = checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1[expected:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a]), getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d90\u5bc4\u6435\u385b\u4d85\ub83f), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f::\uff55\u7d52\u120d\u5db4\u6c56\u7330, p0:\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2[expected:\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f])))
            stack_101_1 = getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4daf\uc2bd\u40a9\u760c\ud4fe\u071d)
            
            if (cmpne:boolean(var_4_66:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u6d69\u7043\u6b5f\u36d3\u6bb9\u718f))) {
                if (cmpeq:boolean(var_4_66:\u760c\u4975\u4179\uc246\u8640\u64f2, getstatic:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\ubff1\u92ff\u0b8e\u59ec\uc84e\u927d))) {
                    goto(Label_0190)
                }
                
                if (cmple:boolean(sub:double(getfield:double(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u6bb9\uc29a\u99f7\u7e3f\u6b5f\u156b, invokevirtual:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f::\u6ec6\u6cfe\u8cae\u6d69\ucef1\u0c95, p0:\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2[expected:\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_5_6C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))), ldc:double(0.5))) {
                    goto(Label_0190)
                }
            }
            
            Label_0149:
            
            if (cmpne:boolean(and:int(var_2_A2:int, ldc:int(256)), ldc:int(0))) {
                var_2_11A = and:int(var_2_A2:int, ldc:int(-692660227))
                stack_101_2 = getstatic:\u8640\u59ec\u960f\u9033\u8cae\ud4fe(\u8640\u59ec\u960f\u9033\u8cae\ud4fe::\uafe7\u6cfe\ubf56\uc29a\u4ab3\u3d4b)
                goto(Label_0257)
            }
            
            var_2_A2 = and:int(var_2_A2:int, ldc:int(681511224))
            Label_0190:
            
            if (cmpne:boolean(and:int(var_2_A2:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_A2 = and:int(var_2_A2:int, ldc:int(1142210549))
                goto(Label_0149)
            }
            
            var_2_11A = and:int(var_2_A2:int, ldc:int(-1077137540))
            stack_101_2 = getstatic:\u8640\u59ec\u960f\u9033\u8cae\ud4fe(\u8640\u59ec\u960f\u9033\u8cae\ud4fe::\u56bd\ub1b9\u7bad\ufcaf\u647c\u47c2)
            Label_0257:
            stack_139_0 = checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, stack_101_0:\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, stack_101_1:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>, stack_101_2:\u8640\u59ec\u960f\u9033\u8cae\ud4fe))
            stack_139_1 = getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4bc8\u51fa\uc246\u51b2\u983f\u416d)
            
            if (cmpne:boolean(invokevirtual:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u156b\ubb2b\u4492\u647c\ud217\uc4d2, var_6_77:\uf995\u8709\ua61f\ub32d\ubff1\u99f7), getstatic:\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec[expected:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f](\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u7e3f\u3dd3\ua6bd\uae87\ubff1\uceb8))) {
                var_2_11A = and:int(var_2_11A:int, ldc:int(1819144049))
                stack_136_0 = and:int(ldc:int(-31241), ldc:int(31232))
            }
            else {
                stack_136_0 = and:int(ldc:int(16449), ldc:int(8731))
            }
            
            var_7_13F = checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, stack_139_0:\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, stack_139_1:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>, invokestatic:Boolean(Boolean::valueOf, stack_136_0:boolean)))
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, var_7_13F:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u516c\u92ff\u74b1\u97e6\ub171\u3711>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0), invokestatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ud4fe\u3d64\u92ff\u2dcc\u183a\u873d, var_7_13F:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, invokevirtual:\uf9c5\ud158\u4975\uf94d\ud523\uc31c[expected:\u718f\u6435\uc31c\u4ab3\u98a4](\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f::\uae5d\ud171\u6b5f\u8753\u8753\u5db4, p0:\u3bc9\u3776\u6d69\u7af6\ub32d\u64f2[expected:\ud158\u0c95\u9937\u2dcc\u4f4a\ub83f]), var_5_6C:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \u8258\u527a\u5db4\uc84e\u5bc4\u7c6b(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd p3, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p4, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p5) {
        var_7_9F : int
        stack_EF_0 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d [generated]
        
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
            var_7_9F = and:int(ldc:int(-44144570), ldc:int(-9458898))
            
            if (invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Boolean>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4bc8\u51fa\uc246\u51b2\u983f\u416d))))) {
                invokeinterface:void(\u8258\uc238\u7e3f\u36d3\uc238<\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec>::\u71ae\u4bc8\u74b1\u97b7\u67e9\ud217, invokeinterface:\u8258\uc238\u7e3f\u36d3\uc238<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u8cae\u4f4a\ud217\u8709\u4cd9\ud51e, p3:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd), p4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getstatic:\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec(\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u7e3f\u3dd3\ua6bd\uae87\ubff1\uceb8), invokevirtual:int(\u8cae\ucb79\ud7e8\ub8be\u156b\u960f::\u92ee\u8d98\ub171\u8753\u5f50\u4c04, getstatic:\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec[expected:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f](\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u7e3f\u3dd3\ua6bd\uae87\ubff1\uceb8), p3:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a]))
            }
            
            do {
                if (cmpeq:boolean(and:int(var_7_9F:int, ldc:int(1)), ldc:int(0))) {
                    var_7_9F = and:int(var_7_9F:int, ldc:int(-909345562))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\u12b2\u759a\u52d3\u74b1\u927d\ua3b4, invokevirtual:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uc84e\ub1b9\uc2e8\ud4fe\u3e2a\u3d4b, p1:\u760c\u4975\u4179\uc246\u8640\u64f2)))) {
                        loopcontinue()
                    }
                    
                    stack_EF_0 = checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u516c\u92ff\u74b1\u97e6\ub171\u3711>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0), invokestatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ud4fe\u3d64\u92ff\u2dcc\u183a\u873d, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p3:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)))
                    return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(stack_EF_0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
                }
            } while (cmpeq:boolean(and:int(var_7_9F:int, ldc:int(134217728)), ldc:int(0)))
            
            var_7_9F = and:int(var_7_9F:int, ldc:int(1238218755))
            stack_EF_0 = invokespecial:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\u8258\u527a\u5db4\uc84e\u5bc4\u7c6b, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f], p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\u760c\u4975\u4179\uc246\u8640\u64f2, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p3:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd, p4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p5:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(stack_EF_0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u516c\u92ff\u74b1\u97e6\ub171\u3711 \ud4fe\u3d64\u92ff\u2dcc\u183a\u873d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
        var_5_6C : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_6_7A : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_7_D5 : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_7_99 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_8_14F : \u760c\u4975\u4179\uc246\u8640\u64f2
        
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
            var_5_6C = checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d90\u5bc4\u6435\u385b\u4d85\ub83f)))
            var_6_7A = invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p1:\u718f\u6435\uc31c\u4ab3\u98a4, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_5_6C:\u760c\u4975\u4179\uc246\u8640\u64f2))
            
            if (invokestatic:boolean(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u93a2\u960f\u5245\ud171\u7ce1\u6c56, var_6_7A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
                if (cmpeq:boolean(invokevirtual:\u8640\u59ec\u960f\u9033\u8cae\ud4fe(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4daf\uc2bd\u40a9\u760c\ud4fe\u071d)), invokevirtual:\u8640\u59ec\u960f\u9033\u8cae\ud4fe(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, var_6_7A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4daf\uc2bd\u40a9\u760c\ud4fe\u071d)))) {
                    var_7_D5 = checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, var_6_7A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d90\u5bc4\u6435\u385b\u4d85\ub83f)))
                    
                    if (cmpne:boolean(invokevirtual:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uc84e\ub1b9\uc2e8\ud4fe\u3e2a\u3d4b, var_7_D5:\u760c\u4975\u4179\uc246\u8640\u64f2), invokevirtual:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uc84e\ub1b9\uc2e8\ud4fe\u3e2a\u3d4b, checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d90\u5bc4\u6435\u385b\u4d85\ub83f)))))) {
                        if (invokestatic:boolean(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u2dcc\u3711\u8709\u8258\u8258\ubded, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\u718f\u6435\uc31c\u4ab3\u98a4, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u759a\u4bc8\u873d\ud171\ub32d\u7873, var_7_D5:\u760c\u4975\u4179\uc246\u8640\u64f2))) {
                            if (cmpne:boolean(var_7_D5:\u760c\u4975\u4179\uc246\u8640\u64f2, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u873d\u3dd3\u6c56\u5d20\uc31c\ud523, var_5_6C:\u760c\u4975\u4179\uc246\u8640\u64f2))) {
                                return:\u516c\u92ff\u74b1\u97e6\ub171\u3711(getstatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u516c\u92ff\u74b1\u97e6\ub171\u3711::\ucfaf\u12b2\u4c04\u4ab3\u983f\u7e3f))
                            }
                            
                            return:\u516c\u92ff\u74b1\u97e6\ub171\u3711(getstatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u516c\u92ff\u74b1\u97e6\ub171\u3711::\u873d\u8d90\u7043\u4f52\ub113\u516c))
                        }
                    }
                }
            }
            
            var_7_99 = invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p1:\u718f\u6435\uc31c\u4ab3\u98a4, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u759a\u4bc8\u873d\ud171\ub32d\u7873, var_5_6C:\u760c\u4975\u4179\uc246\u8640\u64f2)))
            
            if (invokestatic:boolean(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u93a2\u960f\u5245\ud171\u7ce1\u6c56, var_7_99:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
                if (cmpeq:boolean(invokevirtual:\u8640\u59ec\u960f\u9033\u8cae\ud4fe(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4daf\uc2bd\u40a9\u760c\ud4fe\u071d)), invokevirtual:\u8640\u59ec\u960f\u9033\u8cae\ud4fe(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, var_7_99:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4daf\uc2bd\u40a9\u760c\ud4fe\u071d)))) {
                    var_8_14F = checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, var_7_99:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d90\u5bc4\u6435\u385b\u4d85\ub83f)))
                    
                    if (cmpne:boolean(invokevirtual:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uc84e\ub1b9\uc2e8\ud4fe\u3e2a\u3d4b, var_8_14F:\u760c\u4975\u4179\uc246\u8640\u64f2), invokevirtual:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uc84e\ub1b9\uc2e8\ud4fe\u3e2a\u3d4b, checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d90\u5bc4\u6435\u385b\u4d85\ub83f)))))) {
                        if (invokestatic:boolean(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u2dcc\u3711\u8709\u8258\u8258\ubded, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\u718f\u6435\uc31c\u4ab3\u98a4, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, var_8_14F:\u760c\u4975\u4179\uc246\u8640\u64f2)) {
                            if (cmpne:boolean(var_8_14F:\u760c\u4975\u4179\uc246\u8640\u64f2, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u760c\u4975\u4179\uc246\u8640\u64f2::\u873d\u3dd3\u6c56\u5d20\uc31c\ud523, var_5_6C:\u760c\u4975\u4179\uc246\u8640\u64f2))) {
                                return:\u516c\u92ff\u74b1\u97e6\ub171\u3711(getstatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u516c\u92ff\u74b1\u97e6\ub171\u3711::\u3e75\u873d\u6435\ufcaf\u8aa5\u6b0d))
                            }
                            
                            return:\u516c\u92ff\u74b1\u97e6\ub171\u3711(getstatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u516c\u92ff\u74b1\u97e6\ub171\u3711::\u51b2\uc2bd\u6bb9\ucfaf\u6435\u4bc8))
                        }
                    }
                }
            }
            
            return:\u516c\u92ff\u74b1\u97e6\ub171\u3711(getstatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u516c\u92ff\u74b1\u97e6\ub171\u3711::\uc2e8\uf94d\ud4fe\u97e6\u5f50\u64f2))
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u2dcc\u3711\u8709\u8258\u8258\ubded(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p3) {
        var_6_70 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        stack_D8_0 : int [generated]
        
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
            var_6_70 = invokeinterface:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u718f\u6435\uc31c\u4ab3\u98a4::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p1:\u718f\u6435\uc31c\u4ab3\u98a4, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc2e8\uc4d2\u8cae\u8350\ucef1\uc2bd, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:\u760c\u4975\u4179\uc246\u8640\u64f2))
            
            if (invokestatic:boolean(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u93a2\u960f\u5245\ud171\u7ce1\u6c56, var_6_70:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)) {
                if (cmpeq:boolean(invokevirtual:Comparable(\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, Object>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, var_6_70:\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, Object>, getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d90\u5bc4\u6435\u385b\u4d85\ub83f)), invokevirtual:Comparable(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d90\u5bc4\u6435\u385b\u4d85\ub83f)))) {
                    if (cmpeq:boolean(invokevirtual:\u8640\u59ec\u960f\u9033\u8cae\ud4fe(\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, Object>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, var_6_70:\uc31c\u74b1\u8389\u494c\u88c5\u446c<Object, Object>, getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4daf\uc2bd\u40a9\u760c\ud4fe\u071d)), invokevirtual:\u8640\u59ec\u960f\u9033\u8cae\ud4fe(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4daf\uc2bd\u40a9\u760c\ud4fe\u071d)))) {
                        stack_D8_0 = and:int[expected:boolean](ldc:int(16483), ldc:int(-16484))
                        return:boolean(stack_D8_0:boolean)
                    }
                }
            }
            
            stack_D8_0 = xor:int[expected:boolean](ldc:int(5129), ldc:int(5128))
            return:boolean(stack_D8_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u93a2\u960f\u5245\ud171\u7ce1\u6c56(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
            return:boolean(instanceof:boolean(\u56bd\u8413\u647c\u5bc4\ud158.\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \u6b5f\u9937\u5f50\u516c\ub32d\uceb8(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u7049\u52d3\u8640\u5654\u1833\ub18d p1) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Comparable>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d90\u5bc4\u6435\u385b\u4d85\ub83f), invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\u7049\u52d3\u8640\u5654\u1833\ub18d::\ua3b4\u56bd\u647c\uae87\u8389\u392e, p1:\u7049\u52d3\u8640\u5654\u1833\ub18d, checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d90\u5bc4\u6435\u385b\u4d85\ub83f)))))))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d \ub19c\u6ec6\u8640\uc2e8\u3bd6\ucef1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u56bd\u8413\u647c\u5bc4\ud158.\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5 p1) {
        var_3_67 : int
        var_5_72 : \u760c\u4975\u4179\uc246\u8640\u64f2
        var_3_9B : int
        var_6_84 : \u516c\u92ff\u74b1\u97e6\ub171\u3711
        
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
            var_3_67 = and:int(and:int(ldc:int(212318331), ldc:int(1789110385)), ldc:int(448523188))
            var_5_72 = checkcast:\u760c\u4975\u4179\uc246\u8640\u64f2(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2.class, invokevirtual:\u760c\u4975\u4179\uc246\u8640\u64f2(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u760c\u4975\u4179\uc246\u8640\u64f2>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d90\u5bc4\u6435\u385b\u4d85\ub83f)))
            var_3_9B = and:int(var_3_67:int, ldc:int(2142153460))
            var_6_84 = checkcast:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u516c\u92ff\u74b1\u97e6\ub171\u3711.class, invokevirtual:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u516c\u92ff\u74b1\u97e6\ub171\u3711>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0)))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_9B:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0487)
                }
                
                if (cmpne:boolean(and:int(var_3_9B:int, ldc:int(128)), ldc:int(0))) {
                    var_3_9B = and:int(var_3_9B:int, ldc:int(-622044216))
                    goto(Label_0278)
                }
                
                if (cmpne:boolean(and:int(var_3_9B:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_9B = and:int(var_3_9B:int, ldc:int(-1292872508))
                }
                else {
                    var_3_9B = and:int(var_3_9B:int, ldc:int(2079058036))
                    
                    switch (loadelement:int(getstatic:int[](\u64f2\u516c\ua61f\u92ff\u6198\u8d98::\u6d69\ud51e\uf995\u4daf\u6c56\u6d69), invokevirtual:int(Enum<E>::ordinal, p1:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5[expected:Enum<\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5>]))) {
                        case 1:
                            if (cmpeq:boolean(invokevirtual:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uc84e\ub1b9\uc2e8\ud4fe\u3e2a\u3d4b, var_5_72:\u760c\u4975\u4179\uc246\u8640\u64f2), getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\u6d69\ud523\ud51e\ube23\u7330\uc7fe))) {
                                looporswitchbreak()
                            }
                            
                            looporswitchbreak(Label_0688)
                        
                        case 2:
                            if (cmpeq:boolean(invokevirtual:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u760c\u4975\u4179\uc246\u8640\u64f2::\uc84e\ub1b9\uc2e8\ud4fe\u3e2a\u3d4b, var_5_72:\u760c\u4975\u4179\uc246\u8640\u64f2), getstatic:\u6c52\u156b\u4179\u5654\uceb8\u9af2(\u6c52\u156b\u4179\u5654\uceb8\u9af2::\ud217\u4c2b\uc238\uc84e\u392e\uae5d))) {
                                goto(Label_0487)
                            }
                            
                            looporswitchbreak(Label_0688)
                        
                        default:
                            looporswitchbreak(Label_0688)
                    }
                }
                
                Label_0231:
                
                if (cmpeq:boolean(and:int(var_3_9B:int, ldc:int(2097152)), ldc:int(0))) {
                    var_3_9B = and:int(var_3_9B:int, ldc:int(-232804406))
                    goto(Label_0487)
                }
                
                if (cmpne:boolean(and:int(var_3_9B:int, ldc:int(8388608)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_9B:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_9B = and:int(var_3_9B:int, ldc:int(506622999))
                        loopcontinue()
                    }
                    
                    var_3_9B = and:int(var_3_9B:int, ldc:int(-71585936))
                }
                
                Label_0278:
                
                if (cmpne:boolean(and:int(var_3_9B:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_9B = and:int(var_3_9B:int, ldc:int(1555196473))
                }
                else {
                    if (cmpeq:boolean(and:int(var_3_9B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0231)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_9B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_9B = and:int(var_3_9B:int, ldc:int(-1117859572))
                        loopcontinue()
                    }
                    
                    switch (loadelement:int(getstatic:int[](\u64f2\u516c\ua61f\u92ff\u6198\u8d98::\u156b\ud51e\u4d85\u51fa\ucef1\u6b5f), invokevirtual:int(Enum<E>::ordinal, var_6_84:\u516c\u92ff\u74b1\u97e6\ub171\u3711[expected:Enum<\u516c\u92ff\u74b1\u97e6\ub171\u3711>]))) {
                        case 1:
                            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u71f1\u6b0d\ud217\ua61f\u4bc8\u4bc8, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c)), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u516c\u92ff\u74b1\u97e6\ub171\u3711>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0), getstatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u516c\u92ff\u74b1\u97e6\ub171\u3711::\u3e75\u873d\u6435\ufcaf\u8aa5\u6b0d))))
                        
                        case 2:
                            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u71f1\u6b0d\ud217\ua61f\u4bc8\u4bc8, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c)), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u516c\u92ff\u74b1\u97e6\ub171\u3711>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0), getstatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u516c\u92ff\u74b1\u97e6\ub171\u3711::\u51b2\uc2bd\u6bb9\ucfaf\u6435\u4bc8))))
                        
                        case 3:
                            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u71f1\u6b0d\ud217\ua61f\u4bc8\u4bc8, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c)), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u516c\u92ff\u74b1\u97e6\ub171\u3711>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0), getstatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u516c\u92ff\u74b1\u97e6\ub171\u3711::\ucfaf\u12b2\u4c04\u4ab3\u983f\u7e3f))))
                        
                        case 4:
                            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u71f1\u6b0d\ud217\ua61f\u4bc8\u4bc8, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c)), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u516c\u92ff\u74b1\u97e6\ub171\u3711>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0), getstatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u516c\u92ff\u74b1\u97e6\ub171\u3711::\u873d\u8d90\u7043\u4f52\ub113\u516c))))
                        
                        default:
                            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u71f1\u6b0d\ud217\ua61f\u4bc8\u4bc8, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c)))
                    }
                }
                
                Label_0487:
                
                if (cmpne:boolean(and:int(var_3_9B:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0278)
                }
                
                if (cmpeq:boolean(and:int(var_3_9B:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_9B = and:int(var_3_9B:int, ldc:int(1379205870))
                    goto(Label_0231)
                }
                
                if (cmpeq:boolean(and:int(var_3_9B:int, ldc:int(8192)), ldc:int(0))) {
                    loopcontinue()
                }
                
                switch (loadelement:int(getstatic:int[](\u64f2\u516c\ua61f\u92ff\u6198\u8d98::\u156b\ud51e\u4d85\u51fa\ucef1\u6b5f), invokevirtual:int(Enum<E>::ordinal, var_6_84:\u516c\u92ff\u74b1\u97e6\ub171\u3711[expected:Enum<\u516c\u92ff\u74b1\u97e6\ub171\u3711>]))) {
                    case 1:
                        return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u71f1\u6b0d\ud217\ua61f\u4bc8\u4bc8, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c)), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u516c\u92ff\u74b1\u97e6\ub171\u3711>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0), getstatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u516c\u92ff\u74b1\u97e6\ub171\u3711::\u51b2\uc2bd\u6bb9\ucfaf\u6435\u4bc8))))
                    
                    case 2:
                        return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u71f1\u6b0d\ud217\ua61f\u4bc8\u4bc8, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c)), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u516c\u92ff\u74b1\u97e6\ub171\u3711>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0), getstatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u516c\u92ff\u74b1\u97e6\ub171\u3711::\u3e75\u873d\u6435\ufcaf\u8aa5\u6b0d))))
                    
                    case 3:
                        return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u71f1\u6b0d\ud217\ua61f\u4bc8\u4bc8, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c)), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u516c\u92ff\u74b1\u97e6\ub171\u3711>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0), getstatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u516c\u92ff\u74b1\u97e6\ub171\u3711::\ucfaf\u12b2\u4c04\u4ab3\u983f\u7e3f))))
                    
                    case 4:
                        return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(checkcast:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d.class, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u3d64\u4f4a\u8753\ua61f\ua6bd\ua61f, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>](\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u71f1\u6b0d\ud217\ua61f\u4bc8\u4bc8, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c)), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<\u516c\u92ff\u74b1\u97e6\ub171\u3711>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0), getstatic:\u516c\u92ff\u74b1\u97e6\ub171\u3711(\u516c\u92ff\u74b1\u97e6\ub171\u3711::\u873d\u8d90\u7043\u4f52\ub113\u516c))))
                    
                    case 5:
                        return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u71f1\u6b0d\ud217\ua61f\u4bc8\u4bc8, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], getstatic:\u7049\u52d3\u8640\u5654\u1833\ub18d(\u7049\u52d3\u8640\u5654\u1833\ub18d::\u873d\u72f1\ub102\ufcaf\ub113\u836c)))
                    
                    default:
                        looporswitchbreak(Label_0688)
                }
            }
            
            Label_0688:
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(invokespecial:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\ub19c\u6ec6\u8640\uc2e8\u3bd6\ucef1, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f], p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d, p1:\u6198\u4cd9\ub7dc\u4e72\u5d20\uf9c5))
        }
        
        goto(Label_0006)
    }
    
    public void \u69d9\u8640\u12cb\ua068\u7ce1\u61a4(\u71f1\uc910\u3bc9\u516c\u93a2.\u7049\u71ae\u51fa\u64ab\ubefe\ube23<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d> p0) {
        expr_6A : \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d[] [generated]
        
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
            expr_6A = newarray:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d[](\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d.class, and:int(ldc:int(2308), ldc:int(13862)))
            storeelement:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d(expr_6A:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d[], and:int(ldc:int(-9486), ldc:int(9485)), getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d90\u5bc4\u6435\u385b\u4d85\ub83f))
            storeelement:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d(expr_6A:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d[], and:int(ldc:int(26629), ldc:int(89)), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4daf\uc2bd\u40a9\u760c\ud4fe\u071d))
            storeelement:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d(expr_6A:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d[], and:int(ldc:int(18), ldc:int(1639)), getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0))
            storeelement:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d(expr_6A:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d[], and:int(ldc:int(6503), ldc:int(3)), getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4bc8\u51fa\uc246\u51b2\u983f\u416d))
            invokevirtual:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>(\u7049\u71ae\u51fa\u64ab\ubefe\ube23<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>::\u9af2\ua3b4\u3dd3\ub102\u3c25\uc31c, p0:\u7049\u71ae\u51fa\u64ab\ubefe\ube23<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>, expr_6A:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<?>[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 \u97b7\uf9c5\uc2e8\uc2e8\u7330\u71ae(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
        var_2_61 : int
        stack_97_0 : \uf995\u8709\ua61f\ub32d\ubff1\u99f7 [generated]
        
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
            var_2_61 = and:int(ldc:int(-581813677), ldc:int(-1625680661))
            
            if (logicalnot:boolean(invokevirtual:boolean(Boolean::booleanValue, checkcast:Boolean(java.lang.Boolean.class, invokevirtual:Boolean(\uc31c\u74b1\u8389\u494c\u88c5\u446c<O, S>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\uc31c\u74b1\u8389\u494c\u88c5\u446c<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, \u8413\u7e3f\uc910\uf94d\u5654\u6b0d>], getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<Boolean>](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4bc8\u51fa\uc246\u51b2\u983f\u416d)))))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-544510837))
                stack_97_0 = invokespecial:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\u071d\u69d9\u69d9\u8cae\ub8be\u600f::\u97b7\uf9c5\uc2e8\uc2e8\u7330\u71ae, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1[expected:\u071d\u69d9\u69d9\u8cae\ub8be\u600f], p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            }
            else {
                stack_97_0 = invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec::\uc29a\u0b8e\uceb8\u9937\u6bb9\u7873, getstatic:\ub102\u4f4a\u7bad\u3711\uc7fe\u59ec(\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u7e3f\u3dd3\ua6bd\uae87\ubff1\uceb8), and:int[expected:boolean](ldc:int(-17721), ldc:int(17720)))
            }
            
            return:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(stack_97_0:\uf995\u8709\ua61f\ub32d\ubff1\u99f7)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u7873\u1187\u71f1\u600f\ud51e\ub70c(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5d20\u97b7\u8753\u873d\u16f6.\u718f\u6435\uc31c\u4ab3\u98a4 p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, \u516c\u3d64\u718f\ub171\u6b5f.\uc4d2\ufcaf\u4f52\u120d\uc2e8\u7873 p3) {
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
            return:boolean(and:int[expected:boolean](ldc:int(-13111), ldc:int(4916)))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52[] lambda$\ub102\u183a\u92ee\uc3e3\u600f\uafe7$1(int p0) {
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
            return:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](newarray:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52.class, p0:int))
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 lambda$\ub171\u7c6b\u36d3\u416d\u7ce1\u385b$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p2, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p3, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52 p4, int p5) {
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
            return:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u760c\u6b0d\uc2e8\ubded\u3776\ub83f, p5:int, p0:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, p1:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, p2:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, p3:\u6c52\ubded\u4975\u71ae\u47c2\u7d52, p4:\u6c52\ubded\u4975\u71ae\u47c2\u7d52))
        }
        
        goto(Label_0006)
    }
    
    static {
        expr_15A : int[] [generated]
        
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
            putstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d90\u5bc4\u6435\u385b\u4d85\ub83f, getstatic:\ubefe\uae87\u3a62\u8413\u59ec\u4f4a(\u51fa\uc29a\ud51e\u71ae\u759a\ua6bd::\u8709\u6d69\u0b8e\ua068\uff55\u6fb0))
            putstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4daf\uc2bd\u40a9\u760c\ud4fe\u071d, getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u8640\u59ec\u960f\u9033\u8cae\ud4fe>(\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\u516c\uc7fe\uf94d\ua61f\u120d\u71ae))
            putstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ubff1\uf9c5\ufcaf\uc9f6\u8aa5\u6fb0, getstatic:\u1187\u62da\u718f\u3c25\u6ec6\u5d20<\u516c\u92ff\u74b1\u97e6\ub171\u3711>(\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\u59ec\ub1b9\u67e9\u6b5f\u64ab\u76bc))
            putstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4bc8\u51fa\uc246\u51b2\u983f\u416d, getstatic:\u3c25\ua61f\uff55\u92ff\u6b0d\ucef1(\u392e\u47c2\ud171\ub171\u4f4a\u64ab::\u156b\u385b\u8709\u839e\u71ae\ube23))
            putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\uc2e8\u3504\u61a4\ud4fe\u8bb0\u34df, getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u3d64\ubf56\u3dd3\ua3b4\uc229\u7af6::\u36d3\u64f2\ud12e\u946b\u4daf\ud36e))
            putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u34df\u5140\ub7dc\u0c95\uc31c\u3a62, getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u3d64\ubf56\u3dd3\ua3b4\uc229\u7af6::\u64f2\u5654\u760c\u6b5f\u52d3\u92ee))
            putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u183a\u5db4\u960f\ub6ab\u836c\uc238, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, ldc:double(0.0), ldc:double(0.0), ldc:double(0.0), ldc:double(8.0), ldc:double(8.0), ldc:double(8.0)))
            putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\uf94d\u7af6\u965f\u5fe1\u8bb0\u9937, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, ldc:double(0.0), ldc:double(0.0), ldc:double(8.0), ldc:double(8.0), ldc:double(8.0), ldc:double(16.0)))
            putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u7af6\u8709\u8aa5\u3a62\u74b1\ub8be, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, ldc:double(0.0), ldc:double(8.0), ldc:double(0.0), ldc:double(8.0), ldc:double(16.0), ldc:double(8.0)))
            putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u99f7\u36d3\u4179\u8308\u3504\u965f, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, ldc:double(0.0), ldc:double(8.0), ldc:double(8.0), ldc:double(8.0), ldc:double(16.0), ldc:double(16.0)))
            putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u7d52\u8bb0\uc31c\u4d85\ud523\ubded, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, ldc:double(8.0), ldc:double(0.0), ldc:double(0.0), ldc:double(16.0), ldc:double(8.0), ldc:double(8.0)))
            putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u34df\uc7fe\u392e\u7049\uc87f\u873d, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, ldc:double(8.0), ldc:double(0.0), ldc:double(8.0), ldc:double(16.0), ldc:double(8.0), ldc:double(16.0)))
            putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d98\uc87f\u8753\u76bc\u4c04\u8753, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, ldc:double(8.0), ldc:double(8.0), ldc:double(0.0), ldc:double(16.0), ldc:double(16.0), ldc:double(8.0)))
            putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ua068\u0a06\u72f1\u836c\uc4d2\u4daf, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u4179\u718f\u4bc8\ubff1\u4f4a\u4bc8, ldc:double(8.0), ldc:double(8.0), ldc:double(8.0), ldc:double(16.0), ldc:double(16.0), ldc:double(16.0)))
            putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8413\u12cb\u6cfe\u8cae\ub171\ucfaf, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u64f2\u759a\u9255\u0c95\ubded\u927d, getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\uc2e8\u3504\u61a4\ud4fe\u8bb0\u34df), getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u183a\u5db4\u960f\ub6ab\u836c\uc238), getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u7d52\u8bb0\uc31c\u4d85\ud523\ubded), getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\uf94d\u7af6\u965f\u5fe1\u8bb0\u9937), getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u34df\uc7fe\u392e\u7049\uc87f\u873d)))
            putstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u4e72\u3bd6\u97b7\u839e\u8d90\u4cd9, invokestatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u64f2\u759a\u9255\u0c95\ubded\u927d, getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u34df\u5140\ub7dc\u0c95\uc31c\u3a62), getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u7af6\u8709\u8aa5\u3a62\u74b1\ub8be), getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u8d98\uc87f\u8753\u76bc\u4c04\u8753), getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u99f7\u36d3\u4179\u8308\u3504\u965f), getstatic:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\ua068\u0a06\u72f1\u836c\uc4d2\u4daf)))
            expr_15A = newarray:int[](int.class, ldc:int(20))
            storeelement:int(expr_15A:int[], and:int(ldc:int(8202), ldc:int(-8203)), ldc:int(12))
            storeelement:int(expr_15A:int[], xor:int(ldc:int(1032), ldc:int(1033)), xor:int(ldc:int(274), ldc:int(279)))
            storeelement:int(expr_15A:int[], xor:int(ldc:int(-32249), ldc:int(-32251)), and:int(ldc:int(8227), ldc:int(19331)))
            storeelement:int(expr_15A:int[], xor:int(ldc:int(1064), ldc:int(1067)), ldc:int(10))
            storeelement:int(expr_15A:int[], and:int(ldc:int(2052), ldc:int(12356)), ldc:int(14))
            storeelement:int(expr_15A:int[], xor:int(ldc:int(-32238), ldc:int(-32233)), ldc:int(13))
            storeelement:int(expr_15A:int[], storeelement:int(expr_15A:int[], ldc:int(6), ldc:int(7)), ldc:int(11))
            storeelement:int(expr_15A:int[], ldc:int(8), ldc:int(13))
            storeelement:int(expr_15A:int[], ldc:int(9), ldc:int(7))
            storeelement:int(expr_15A:int[], storeelement:int(expr_15A:int[], ldc:int(10), ldc:int(11)), ldc:int(14))
            storeelement:int(expr_15A:int[], ldc:int(12), ldc:int(8))
            storeelement:int(expr_15A:int[], ldc:int(13), xor:int(ldc:int(-15865), ldc:int(-15869)))
            storeelement:int(expr_15A:int[], ldc:int(14), xor:int(ldc:int(5192), ldc:int(5193)))
            storeelement:int(expr_15A:int[], ldc:int(15), and:int(ldc:int(16455), ldc:int(11010)))
            storeelement:int(expr_15A:int[], ldc:int(16), and:int(ldc:int(23332), ldc:int(5)))
            storeelement:int(expr_15A:int[], ldc:int(17), and:int(ldc:int(6145), ldc:int(1537)))
            storeelement:int(expr_15A:int[], ldc:int(18), and:int(ldc:int(535), ldc:int(8362)))
            storeelement:int(expr_15A:int[], ldc:int(19), ldc:int(8))
            putstatic:int[](\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1::\u527a\ub7dc\u4e72\u56bd\u8389\u67e9, expr_15A:int[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9a18\u61a4\u8c8a\u5245\u1187\u7bad(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_666 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_671 : int
        
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
        var_3_666 = and:int(ldc:int(1640730742), ldc:int(-69290889))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u16f6\u40a9\u8bb0\u759a\u2dcc\u7ce1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8388608)), ldc:int(0))) {
            var_3_666 = and:int(var_3_666:int, ldc:int(-238311714))
            var_5_80 = and:int(ldc:int(23064), ldc:int(-23069))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12459), ldc:int(12458)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_666:int, ldc:int(-369376530))
                    var_9_C7 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_87:int, xor:int(ldc:int(8448), ldc:int(8449)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(10241), ldc:int(489)))), var_7_96:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_666 = and:int(var_3_D9:int, ldc:int(-909446145))
                    var_14_114 = var_7_96:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(24769), ldc:int(4885)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_87:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(53004))
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(188057029))
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0836)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0677)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0543)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-706825345))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0543)
                            }
                            
                            goto(Label_0836)
                        }
                    }
                    
                    Label_0388:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1229817361))
                        goto(Label_0836)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1694277290))
                        goto(Label_0677)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(570979915))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-908098841))
                        var_11_EA = and:int(ldc:int(-20273), ldc:int(20272))
                        goto(Label_1508)
                    }
                    
                    Label_0543:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(2140715224))
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(786142882))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(47150678))
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0836)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1514400917))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-2096472343))
                            goto(Label_0388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(2079322982))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0836)
                        }
                    }
                    
                    Label_0677:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1486060854))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1631297359))
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-886422836))
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1722176348))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1010842332))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0543)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(64)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1478183820))
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-752597950))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(905690214))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0836:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(64)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(762840719))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-2062007822))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1729540273))
                        goto(Label_1109)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-623970475))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0677)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0543)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-171016105))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_EA = and:int(ldc:int(8657), ldc:int(4643))
                                goto(Label_1109)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(64)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-695308379))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0836)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0677)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0543)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(2095912894))
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-1722523728))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(769576934))
                        var_11_EA = and:int(ldc:int(-14366), ldc:int(14365))
                    }
                    
                    Label_1109:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(128)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1079545547))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1382)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(517555195))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0836)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0677)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(1001379626))
                            goto(Label_0543)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(671072718))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1382)
                            }
                        }
                    }
                    
                    Label_1222:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(233935391))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-355439137))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-1872559654))
                            goto(Label_1109)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(701022240))
                            goto(Label_0836)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-560839860))
                            goto(Label_0677)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0543)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(-71688911))
                            goto(Label_0388)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_666 = and:int(var_3_666:int, ldc:int(622019309))
                            loopcontinue()
                        }
                        
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1108636057))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_80:int, var_16_118:int)
                        goto(Label_1508)
                    }
                    
                    Label_1382:
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(49344663))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(286359450))
                        goto(Label_0836)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0677)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1485754381))
                        goto(Label_0543)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_666 = and:int(var_3_666:int, ldc:int(-1681133825))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_671 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1968570793))
                        goto(Label_1382)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-939539827))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(1)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(409920244))
                        goto(Label_1109)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0836)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_666:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(1777955304))
                        goto(Label_0677)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0543)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0388)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(8)), ldc:int(0))) {
                        var_3_666 = and:int(var_3_666:int, ldc:int(-1342521369))
                        var_17_671 = add:int(var_16_118:int, and:int(ldc:int(8213), ldc:int(6305)))
                        looporswitchbreak()
                    }
                    
                    var_3_666 = and:int(var_3_666:int, ldc:int(-1063927347))
                }
                
                var_3_666 = and:int(var_3_666:int, ldc:int(1810812542))
                
                if (cmple:boolean(var_5_80 = var_17_671:int, sub:int(var_6_87:int, xor:int(ldc:int(1028), ldc:int(1029))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_666:int, ldc:int(2)), ldc:int(0))) {
            var_3_666 = and:int(var_3_666:int, ldc:int(1040117129))
            goto(Label_0108)
        }
    }
}
