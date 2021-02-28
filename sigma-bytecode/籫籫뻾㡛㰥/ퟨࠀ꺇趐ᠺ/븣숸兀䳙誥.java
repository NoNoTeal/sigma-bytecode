public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 {
    public void \ube23\uc238\u5140\u4cd9\u8aa5(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0, java.util.concurrent.Executor p1, \u51fa\u12cb\u7330\u74b1\u6c52.\uae87\ub19c\u9937\u836c\u34df\ub8be p2, \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\uc84e\u983f\u0a06\u3d64\u5d20\u4179 p3, \u56bd\u8413\u647c\u5bc4\ud158.\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c> p4, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u3d4b\u9937\u7af6\u7af6\u6198\uae87 p5, \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u647c\u8308\u446c\uc3e3\u69d9 p6, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufcaf\u97e6\u34df\u5245\u927d\ubcb0 p7, boolean p8, long p9, java.util.List<\u56bd\u8413\u647c\u5bc4\ud158.\u67d0\u61a4\u5f50\u647c\u836c\u71ae> p10, boolean p11) {
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
    
    public void \u0a06\u88c5\u74b1\u873d\u6c56\u946b(int p0, int p1, boolean p2, boolean p3) {
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
            invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\u93a2\u4c04\u4e72\u9255\u7049\ud217, getfield:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\ube23\uc238\u5140\u4cd9\u8aa5::\u76bc\u4492\ud51e\u8350\uf995\u74b1, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:int)
            invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\uc229\ud217\u760c\ufcaf\ua562\u8640, getfield:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\ube23\uc238\u5140\u4cd9\u8aa5::\u76bc\u4492\ud51e\u8350\uf995\u74b1, this:\ube23\uc238\u5140\u4cd9\u8aa5), p1:int)
            invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\uae5d\u9af2\uc229\u3711\uc238\u9af2, getfield:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\ube23\uc238\u5140\u4cd9\u8aa5::\u76bc\u4492\ud51e\u8350\uf995\u74b1, this:\ube23\uc238\u5140\u4cd9\u8aa5), p1:int)
            invokeinterface:void(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u3776\u6d69\u4ab3\ub18d\uc29a\u2dcc, getfield:\uc84e\u983f\u0a06\u3d64\u5d20\u4179[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\ube23\uc238\u5140\u4cd9\u8aa5::\u76bc\u4492\ud51e\u8350\uf995\u74b1, this:\ube23\uc238\u5140\u4cd9\u8aa5), p2:boolean)
            invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\uc2e8\u47c2\ub19c\ub32d\u40a9\u61a4, getfield:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\ube23\uc238\u5140\u4cd9\u8aa5::\u76bc\u4492\ud51e\u8350\uf995\u74b1, this:\ube23\uc238\u5140\u4cd9\u8aa5), p3:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 \uc29a\u6435\ub1b9\ub18d\u0800\u873d(int p0, int p1, int p2) {
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
            return:\uc2e8\u9255\u647c\ud171\ubf56(invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\uae5d\u7af6\u9033\ubcb0\u51fa::\u3bd6\uf995\ucef1\u8640\ub18d\u156b, invokevirtual:\u56bd\uc4d2\u61a4\u4ab3\u1187[expected:\uae5d\u7af6\u9033\ubcb0\u51fa](\ufcaf\u97e6\u34df\u5245\u927d\ubcb0::\ucef1\u8bb0\u34df\u97e6\u36d3\u1833, invokevirtual:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0(\u69d9\u759a\u64ab\ua3b4\u6b0d::\uf995\uc2e8\ua6bd\u7e3f\u4179\u61a4, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5))), p0:int, p1:int, p2:int))
        }
        
        goto(Label_0006)
    }
    
    public \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u8753\u4975\ubf56\u6b0d\u7e3f \ud51e\u4d85\u759a\u97b7\u4975\u836c() {
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
            return:\u8753\u4975\ubf56\u6b0d\u7e3f(getfield:\u8753\u4975\ubf56\u6b0d\u7e3f(\ube23\uc238\u5140\u4cd9\u8aa5::\u67e9\u9af2\u647c\ud217\ub6ab\u61a4, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    public void \u9255\ub113\uae5d\uf94d\ube23\u67d0(java.util.function.BooleanSupplier p0) {
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
    
    public void \ub7dc\u12cb\uae5d\ub171\ub8be\u51b2() {
        var_3_7F : long
        
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
            
            if (getfield:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\uafe7\ub102\uc229\ubb2b\u6cfe\u51b2, this:\ube23\uc238\u5140\u4cd9\u8aa5)) {
                var_3_7F = add:long(invokeinterface:long(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u93a2\u0b8e\u40a9\u8640\u93a2\u64ab, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\ube23\uc238\u5140\u4cd9\u8aa5::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\ube23\uc238\u5140\u4cd9\u8aa5)), ldc:long(1L))
                invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\u416d\u7ce1\u8350\u527a\u9033\ub70c, getfield:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\ube23\uc238\u5140\u4cd9\u8aa5::\u76bc\u4492\ud51e\u8350\uf995\u74b1, this:\ube23\uc238\u5140\u4cd9\u8aa5), var_3_7F:long)
                invokevirtual:void(\u7873\u7ce1\u516c\u1833\ua6bd<\u88c5\ud171\ub113\u6435\ud51e>::run, invokeinterface:\u7873\u7ce1\u516c\u1833\ua6bd<\u88c5\ud171\ub113\u6435\ud51e>(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\uc9f6\u0c95\u8640\u0b8e\u960f\u51fa, getfield:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\ube23\uc238\u5140\u4cd9\u8aa5::\u76bc\u4492\ud51e\u8350\uf995\u74b1, this:\ube23\uc238\u5140\u4cd9\u8aa5)), getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5), var_3_7F:long)
                
                if (invokevirtual:boolean(\u7e3f\ubff1\u718f\ub171\u72f1::\ub113\u718f\u8389\u071d\uc87f\u16f6, invokeinterface:\u7e3f\ubff1\u718f\ub171\u72f1(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\uf94d\u873d\u836c\u9a18\u718f\ud7e8, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\ube23\uc238\u5140\u4cd9\u8aa5::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\ube23\uc238\u5140\u4cd9\u8aa5)), getstatic:\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9<\u3d4b\u5654\u8d98\u4bc8\u5db4>(\u7e3f\ubff1\u718f\ub171\u72f1::\u5245\u965f\ubcb0\u4f52\ud217\uc3e3))) {
                    invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\uc229\u64ab\u3776\uceb8\uf94d\ufe34, this:\ube23\uc238\u5140\u4cd9\u8aa5, add:long(invokeinterface:long(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\ud523\ud523\u64f2\uc229\u071d\ud12e, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\ube23\uc238\u5140\u4cd9\u8aa5::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\ube23\uc238\u5140\u4cd9\u8aa5)), ldc:long(1L)))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc229\u64ab\u3776\uceb8\uf94d\ufe34(long p0) {
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
            invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\u527a\uc7fe\u6d99\ud4fe\u7049\u3e2a, getfield:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\ube23\uc238\u5140\u4cd9\u8aa5::\u76bc\u4492\ud51e\u8350\uf995\u74b1, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:long)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u62da\u392e\u4e72\u4d85\u8bb0\u9af2(boolean p0, boolean p1) {
        var_3_61 : int
        var_5_6B : Iterator<\u67d0\u61a4\u5f50\u647c\u836c\u71ae>
        
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
            var_3_61 = and:int(ldc:int(-458351018), ldc:int(-54543274))
            var_5_6B = invokeinterface:Iterator<\u67d0\u61a4\u5f50\u647c\u836c\u71ae>(List<\u67d0\u61a4\u5f50\u647c\u836c\u71ae>::iterator, getfield:List<\u67d0\u61a4\u5f50\u647c\u836c\u71ae>(\ube23\uc238\u5140\u4cd9\u8aa5::\u416d\u93a2\u97e6\uc246\u6435\uc229, this:\ube23\uc238\u5140\u4cd9\u8aa5))
            
            loop {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1381508630))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_6B:Iterator<\u67d0\u61a4\u5f50\u647c\u836c\u71ae>))) {
                    looporswitchbreak()
                }
                
                invokeinterface:int(\u67d0\u61a4\u5f50\u647c\u836c\u71ae::\u7d52\u5654\u52d3\u836c\ub1b9\u6b0d, checkcast:\u67d0\u61a4\u5f50\u647c\u836c\u71ae(\u56bd\u8413\u647c\u5bc4\ud158.\u67d0\u61a4\u5f50\u647c\u836c\u71ae.class, invokeinterface:\u67d0\u61a4\u5f50\u647c\u836c\u71ae(Iterator<\u67d0\u61a4\u5f50\u647c\u836c\u71ae>::next, var_5_6B:Iterator<\u67d0\u61a4\u5f50\u647c\u836c\u71ae>)), this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:boolean, p1:boolean)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc4d2\u67d0\u4e72\u6d69\u8389\ud523() {
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
    
    public void \u8640\u12b2\u3776\uafe7\u4c04\u5d20(\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e p0, int p1) {
        var_3_2AF : int
        var_5_66 : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        var_6_6C : boolean
        var_7_73 : int
        var_8_7A : int
        var_9_80 : \ubf56\u64f2\u392e\u98a4\u120d
        var_10_16D : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_11_185 : \u6d99\u6b0d\ubff1\uc246\u946b
        stack_1D1_0 : int [generated]
        var_3_1D0 : int
        var_12_1D1 : int
        var_13_213 : \u6435\u7ce1\u8258\u64ab\u600f
        var_13_1E8 : \u12cb\u946b\u4d85\u7d52\u47c2
        var_10_26A : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_11_271 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_12_279 : \uc2e8\u9255\u647c\ud171\ubf56
        var_3_293 : int
        var_10_32F : \uc29a\u6198\u6bb9\u4492\u965f[]
        var_11_334 : int
        var_12_33D : int
        var_13_358 : \uc29a\u6198\u6bb9\u4492\u965f
        var_14_380 : int
        var_15_389 : int
        var_16_3A4 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_17_3D5 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_18_3E4 : \uf995\u8709\ua61f\ub32d\ubff1\u99f7
        
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
            var_3_2AF = and:int(ldc:int(-2040276452), ldc:int(-101214945))
            var_5_66 = invokevirtual:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\ud523\u92ff\ubb2b\u759a\ud36e::\u4f52\u4daf\uc910\ud217\uc3e3\u8d98, p0:\ud523\u92ff\ubb2b\u759a\ud36e)
            var_6_6C = invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u74b1\u7af6\ua61f\u6c52\u7873\ub7dc, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])
            var_7_73 = invokevirtual:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u8640\u51fa\uc7fe\u5bc4\u6fb0\u1187, var_5_66:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)
            var_8_7A = invokevirtual:int(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u47c2\u965f\u4492\u61a4\u72f1\u3a62, var_5_66:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)
            var_9_80 = invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, var_9_80:\ubf56\u64f2\u392e\u98a4\u120d, loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(5128), ldc:int(5122))))
            
            if (var_6_6C:boolean) {
                if (invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u839e\u8c8a\uc238\ud36e\u4d85\u16f6, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])) {
                    if (cmpeq:boolean(invokevirtual:int(Random::nextInt, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, this:\ube23\uc238\u5140\u4cd9\u8aa5), ldc:int(100000)), ldc:int(0))) {
                        var_10_16D = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ube23\uc238\u5140\u4cd9\u8aa5::\u516c\u3776\u64ab\u97e6\u3776\u6d69, this:\ube23\uc238\u5140\u4cd9\u8aa5, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u71f1\u8350\u6cfe\u516c\u12b2\u67e9, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_7_73:int, and:int(ldc:int(-3211), ldc:int(3210)), var_8_7A:int, ldc:int(15)))
                        
                        if (invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u3bc9\u6ec6\u8709\u6c52\u4ab3\u4179, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_10_16D:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
                            var_11_185 = invokevirtual:\u6d99\u6b0d\ubff1\uc246\u946b(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7af6\u8350\u4179\ufe34\ub18d\ucfaf, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_10_16D:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                            
                            if (logicaland:boolean(invokevirtual:boolean(\u7e3f\ubff1\u718f\ub171\u72f1::\ub113\u718f\u8389\u071d\uc87f\u16f6, invokevirtual:\u7e3f\ubff1\u718f\ub171\u72f1(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8cae\u7330\u9937\ub83f\ube23\u6d69, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), getstatic:\uc4d2\u74b1\u8413\u67e9\u1833\u3bc9<\u3d4b\u5654\u8d98\u4bc8\u5db4>(\u7e3f\ubff1\u718f\ub171\u72f1::\u62da\u3776\u92ff\ud4fe\u4ab3\uc2e8)), cmplt:boolean(invokevirtual:double(Random::nextDouble, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, this:\ube23\uc238\u5140\u4cd9\u8aa5)), mul:double(f2d:double(invokevirtual:float(\u6d99\u6b0d\ubff1\uc246\u946b::\u836c\u6cfe\u67e9\u8bb0\u446c\u156b, var_11_185:\u6d99\u6b0d\ubff1\uc246\u946b)), ldc:double(0.01))))) {
                                stack_1D1_0 = and:int(ldc:int(10885), ldc:int(11))
                            }
                            else {
                                var_3_2AF = and:int(var_3_2AF:int, ldc:int(2078527608))
                                stack_1D1_0 = and:int(ldc:int(-18665), ldc:int(18664))
                            }
                            
                            var_3_1D0 = and:int(var_3_2AF:int, ldc:int(2099361753))
                            var_12_1D1 = stack_1D1_0:int
                            
                            if (cmpne:boolean(var_12_1D1:int, ldc:int(0))) {
                                var_13_213 = checkcast:\u6435\u7ce1\u8258\u64ab\u600f(\u6cfe\u16f6\u4c04\u61a4\u8bb0.\u6435\u7ce1\u8258\u64ab\u600f.class, invokevirtual:\u6435\u7ce1\u8258\u64ab\u600f(\u9255\u0c95\u4cd9\ube23\u760c<\u6435\u7ce1\u8258\u64ab\u600f>::\u7d52\u62da\uc29a\uc9f6\u51fa\u983f, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u6435\u7ce1\u8258\u64ab\u600f>(\u9255\u0c95\u4cd9\ube23\u760c::\u92ee\ud4fe\u34df\u4e72\u8258\u516c), this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))
                                invokevirtual:void(\u6435\u7ce1\u8258\u64ab\u600f::\u5d20\u156b\u8308\u4492\u416d\u6ec6, var_13_213:\u6435\u7ce1\u8258\u64ab\u600f, xor:int[expected:boolean](ldc:int(264), ldc:int(265)))
                                invokevirtual:void(\u8bb0\u40a9\u74b1\ube23\u76bc::\u98a4\ub102\uc7fe\u5654\u6cfe\ub171, var_13_213:\u6435\u7ce1\u8258\u64ab\u600f[expected:\u8bb0\u40a9\u74b1\ube23\u76bc], and:int(ldc:int(-23458), ldc:int(21409)))
                                invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\u6d99\u1187\ucb79\u7d52\u7e3f, var_13_213:\u6435\u7ce1\u8258\u64ab\u600f[expected:\u7d52\u718f\u3776\u6fb0\ub83f], i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_10_16D:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_10_16D:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_10_16D:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
                                invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\ua6bd\ubefe\u5f50\u12cb\uceb8\u718f, this:\ube23\uc238\u5140\u4cd9\u8aa5, var_13_213:\u6435\u7ce1\u8258\u64ab\u600f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
                            }
                            
                            var_3_2AF = and:int(var_3_1D0:int, ldc:int(-1280477424))
                            var_13_1E8 = checkcast:\u12cb\u946b\u4d85\u7d52\u47c2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u12cb\u946b\u4d85\u7d52\u47c2.class, invokevirtual:\u12cb\u946b\u4d85\u7d52\u47c2(\u9255\u0c95\u4cd9\ube23\u760c<\u12cb\u946b\u4d85\u7d52\u47c2>::\u7d52\u62da\uc29a\uc9f6\u51fa\u983f, getstatic:\u9255\u0c95\u4cd9\ube23\u760c<\u12cb\u946b\u4d85\u7d52\u47c2>(\u9255\u0c95\u4cd9\ube23\u760c::\u516c\ubefe\ucef1\u5db4\ua6bd\u8df4), this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))
                            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\ubf56\u071d\ud4fe\ua61f\u3d4b\u6ec6, var_13_1E8:\u12cb\u946b\u4d85\u7d52\u47c2[expected:\u7d52\u718f\u3776\u6fb0\ub83f], invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u494c\u47c2\u9255\u69d9\u8c8a\u624e, var_10_16D:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
                            invokevirtual:void(\u12cb\u946b\u4d85\u7d52\u47c2::\ud12e\ube23\ud36e\u12cb\u16f6\u3d64, var_13_1E8:\u12cb\u946b\u4d85\u7d52\u47c2, var_12_1D1:boolean)
                            invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\ua6bd\ubefe\u5f50\u12cb\uceb8\u718f, this:\ube23\uc238\u5140\u4cd9\u8aa5, var_13_1E8:\u12cb\u946b\u4d85\u7d52\u47c2[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
                        }
                    }
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_3_2AF:int, ldc:int(128)), ldc:int(0))) {
                    var_3_2AF = and:int(var_3_2AF:int, ldc:int(563705751))
                    goto(Label_0267)
                }
                
                if (cmpne:boolean(and:int(var_3_2AF:int, ldc:int(64)), ldc:int(0))) {
                    var_3_2AF = and:int(var_3_2AF:int, ldc:int(-1240211584))
                }
                else {
                    var_3_2AF = and:int(var_3_2AF:int, ldc:int(1014094385))
                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u3d4b\u64f2\u7d52\u3d4b\ua3b4\u385b, var_9_80:\ubf56\u64f2\u392e\u98a4\u120d, loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(331), ldc:int(17419))))
                    
                    if (cmpeq:boolean(invokevirtual:int(Random::nextInt, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, this:\ube23\uc238\u5140\u4cd9\u8aa5), ldc:int(16)), ldc:int(0))) {
                        var_10_26A = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7ce1\uc9f6\u61a4\u0a06\uff55::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u7ce1\uc9f6\u61a4\u0a06\uff55], getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\uceb8\ua3b4\u4975\u4179\uf94d\u6198), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u71f1\u8350\u6cfe\u516c\u12b2\u67e9, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_7_73:int, and:int(ldc:int(21661), ldc:int(-21662)), var_8_7A:int, ldc:int(15)))
                        var_11_271 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u5db4\u64f2\ub7dc\ud217\u56bd\u8c8a, var_10_26A:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                        var_12_279 = invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], var_10_26A:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                        
                        if (invokevirtual:boolean(\uc2e8\u9255\u647c\ud171\ubf56::\u8308\uceb8\u5245\u873d\u3bd6\uc229, var_12_279:\uc2e8\u9255\u647c\ud171\ubf56, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], var_11_271:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
                            invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_11_271:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u3711\u5d20\ubff1\u8c8a\u873d\ub7dc)))
                        }
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_3_2AF:int, ldc:int(2097152)), ldc:int(0))) {
                                var_3_293 = and:int(var_3_2AF:int, ldc:int(1630333497))
                            }
                            else {
                                var_3_293 = and:int(var_3_2AF:int, ldc:int(-67519945))
                                
                                if (var_6_6C:boolean) {
                                    if (invokevirtual:boolean(\uc2e8\u9255\u647c\ud171\ubf56::\ucef1\ufe34\u6c52\u624e\u3a62\u7330, var_12_279:\uc2e8\u9255\u647c\ud171\ubf56, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], var_10_26A:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)) {
                                        invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_10_26A:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u494c\u3dd3\u12cb\u56bd\uc238\u2dcc)))
                                    }
                                }
                            }
                            
                            if (cmpeq:boolean(and:int(var_3_293:int, ldc:int(262144)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                            
                            var_3_2AF = and:int(var_3_293:int, ldc:int(1077355997))
                        }
                        
                        var_3_2AF = and:int(var_3_293:int, ldc:int(-1375997292))
                        
                        if (var_6_6C:boolean) {
                            if (cmpeq:boolean(invokevirtual:\ud51e\u927d\u69d9\u8df4\u6cfe(\uc2e8\u9255\u647c\ud171\ubf56::\u99f7\ub113\ua562\u5db4\u760c\u3d4b, invokevirtual:\uc2e8\u9255\u647c\ud171\ubf56(\u97e6\uf995\ucef1\ubff1\u7049\u4f4a::\ub83f\uc9f6\u61a4\u8df4\uc2bd\u8709, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u97e6\uf995\ucef1\ubff1\u7049\u4f4a], var_11_271:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)), getstatic:\ud51e\u927d\u69d9\u8df4\u6cfe(\ud51e\u927d\u69d9\u8df4\u6cfe::\uae5d\uc246\uc31c\ufe34\ubded\u4daf))) {
                                invokevirtual:void(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u88c5\u7043\u7af6\u4179\u839e\u67e9, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_11_271:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)), this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_11_271:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                            }
                        }
                    }
                }
                
                Label_0223:
                
                if (cmpeq:boolean(and:int(var_3_2AF:int, ldc:int(262144)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_3_2AF:int, ldc:int(134217728)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_2AF = and:int(var_3_2AF:int, ldc:int(-1050427811))
                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u3d4b\u64f2\u7d52\u3d4b\ua3b4\u385b, var_9_80:\ubf56\u64f2\u392e\u98a4\u120d, loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(9), ldc:int(5))))
                    
                    if (cmpgt:boolean(p1:int, ldc:int(0))) {
                        var_10_32F = invokevirtual:\uc29a\u6198\u6bb9\u4492\u965f[](\ud523\u92ff\ubb2b\u759a\ud36e::\uc84e\u446c\u4f4a\uc910\u9a18\u416d, p0:\ud523\u92ff\ubb2b\u759a\ud36e)
                        var_11_334 = arraylength:int(var_10_32F:\uc29a\u6198\u6bb9\u4492\u965f[])
                        var_12_33D = and:int(ldc:int(-12693), ldc:int(12692))
                        
                        loop {
                            var_3_2AF = and:int(var_3_2AF:int, ldc:int(1139522746))
                            
                            if (cmpge:boolean(var_12_33D:int, var_11_334:int)) {
                                looporswitchbreak()
                            }
                            
                            var_13_358 = loadelement:\uc29a\u6198\u6bb9\u4492\u965f(var_10_32F:\uc29a\u6198\u6bb9\u4492\u965f[], var_12_33D:int)
                            
                            if (cmpne:boolean(var_13_358:\uc29a\u6198\u6bb9\u4492\u965f, getstatic:\uc29a\u6198\u6bb9\u4492\u965f(\ud523\u92ff\ubb2b\u759a\ud36e::\ua6bd\u8d90\ub8be\u71ae\u8413\ub8be))) {
                                if (invokevirtual:boolean(\uc29a\u6198\u6bb9\u4492\u965f::\ua068\ubded\u624e\ua6bd\ua562\ud217, var_13_358:\uc29a\u6198\u6bb9\u4492\u965f)) {
                                    var_14_380 = invokevirtual:int(\uc29a\u6198\u6bb9\u4492\u965f::\u3e2a\u983f\u8350\u98a4\u6fb0\ub70c, var_13_358:\uc29a\u6198\u6bb9\u4492\u965f)
                                    var_15_389 = and:int(ldc:int(-8630), ldc:int(8629))
                                    
                                    while (cmplt:boolean(var_15_389:int, p1:int)) {
                                        var_16_3A4 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u71f1\u8350\u6cfe\u516c\u12b2\u67e9, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_7_73:int, var_14_380:int, var_8_7A:int, ldc:int(15))
                                        invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, var_9_80:\ubf56\u64f2\u392e\u98a4\u120d, loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(4631), ldc:int(4634))))
                                        var_17_3D5 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uc29a\u6198\u6bb9\u4492\u965f::\ud158\u4179\u8df4\u59ec\u64ab\u67d0, var_13_358:\uc29a\u6198\u6bb9\u4492\u965f, sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_16_3A4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), var_7_73:int), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_16_3A4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), var_14_380:int), sub:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_16_3A4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]), var_8_7A:int))
                                        
                                        if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u5245\ub70c\ubcb0\ud51e\u99f7\u1187, var_17_3D5:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])) {
                                            invokevirtual:void(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u6c52\u7ce1\u2dcc\u8d98\u7d52\uc246, var_17_3D5:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\ube23\uc238\u5140\u4cd9\u8aa5, var_16_3A4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, this:\ube23\uc238\u5140\u4cd9\u8aa5))
                                        }
                                        
                                        var_18_3E4 = invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ub171\u3bc9\u67d0\u516c\u9937\ub102, var_17_3D5:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])
                                        
                                        if (invokevirtual:boolean(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u8350\ud158\u6b5f\u9a18\ub6ab\ub19c, var_18_3E4:\uf995\u8709\ua61f\ub32d\ubff1\u99f7)) {
                                            invokevirtual:void(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u99f7\u7c6b\u7330\u446c\u5d20\ud7e8, var_18_3E4:\uf995\u8709\ua61f\ub32d\ubff1\u99f7, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_16_3A4:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, this:\ube23\uc238\u5140\u4cd9\u8aa5))
                                        }
                                        
                                        invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, var_9_80:\ubf56\u64f2\u392e\u98a4\u120d)
                                        inc:int(var_15_389, ldc:int(1))
                                    }
                                }
                            }
                            
                            inc:int(var_12_33D, ldc:int(1))
                        }
                    }
                }
                
                Label_0267:
                
                if (cmpeq:boolean(and:int(var_3_2AF:int, ldc:int(2097152)), ldc:int(0))) {
                    var_3_2AF = and:int(var_3_2AF:int, ldc:int(804289574))
                    goto(Label_0223)
                }
                
                if (cmpeq:boolean(and:int(var_3_2AF:int, ldc:int(128)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, var_9_80:\ubf56\u64f2\u392e\u98a4\u120d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u516c\u3776\u64ab\u97e6\u3776\u6d69(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
    
    public boolean \u6b0d\u718f\u760c\uc246\u4975\u836c() {
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
            return:boolean(getfield:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u8640\u5db4\u5d20\u67d0\u7049\u8258, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    public void \u8753\u5db4\ufe34\u071d\u8640\u759a() {
        var_1_101 : int
        var_3_8B : int
        var_4_93 : int
        var_5_9E : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_6_EA : \u51fa\u6c52\u7330\u7330\u960f
        var_1_C5 : int
        stack_157_1 : int [generated]
        
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
            var_1_101 = and:int(ldc:int(-2093789791), ldc:int(-1812762330))
            putfield:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u0b8e\u61a4\u8d90\u6d69\ub18d\u62da, this:\ube23\uc238\u5140\u4cd9\u8aa5, and:int[expected:boolean](ldc:int(-5458), ldc:int(5457)))
            
            if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\u4d85\u3776\u5140\u6fb0\u6ec6\uceb8, this:\ube23\uc238\u5140\u4cd9\u8aa5)))) {
                var_3_8B = and:int(ldc:int(-6690), ldc:int(6689))
                var_4_93 = and:int(ldc:int(13455), ldc:int(-13520))
                var_5_9E = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(List<\u51fa\u6c52\u7330\u7330\u960f>::iterator, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\u4d85\u3776\u5140\u6fb0\u6ec6\uceb8, this:\ube23\uc238\u5140\u4cd9\u8aa5))
                
                loop {
                    if (cmpne:boolean(and:int(var_1_101:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_1_101 = and:int(var_1_101:int, ldc:int(-1683262181))
                        
                        if (invokeinterface:boolean(Iterator::hasNext, var_5_9E:Iterator)) {
                            var_6_EA = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_5_9E:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                            
                            if (invokevirtual:boolean(\u51fa\u6c52\u7330\u7330\u960f::\u5db4\u3d64\u97e6\u8d98\ucb79\u3711, var_6_EA:\u51fa\u6c52\u7330\u7330\u960f)) {
                                inc:int(var_3_8B, ldc:int(1))
                                goto(Label_0266)
                            }
                            
                            Label_0244:
                            
                            if (cmpne:boolean(and:int(var_1_101:int, ldc:int(16384)), ldc:int(0))) {
                                var_1_101 = and:int(var_1_101:int, ldc:int(-1011880040))
                                
                                if (invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u983f\u927d\u7006\ub19c\u4bc8\u4daf, var_6_EA:\u51fa\u6c52\u7330\u7330\u960f[expected:\ube23\u67d0\u64f2\u839e\u76bc])) {
                                    inc:int(var_4_93, ldc:int(1))
                                }
                            }
                            
                            Label_0266:
                            
                            if (cmpeq:boolean(and:int(var_1_101:int, ldc:int(8)), ldc:int(0))) {
                                var_1_101 = and:int(var_1_101:int, ldc:int(-433596989))
                                loopcontinue()
                            }
                            
                            goto(Label_0244)
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_101:int, ldc:int(1073741824)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_1_C5 = and:int(var_1_101:int, ldc:int(-1208005301))
                
                if (logicaland:boolean(cmpgt:boolean(var_4_93:int, ldc:int(0)), cmpge:boolean(var_4_93:int, sub:int(invokeinterface:int(List<E>::size, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\u4d85\u3776\u5140\u6fb0\u6ec6\uceb8, this:\ube23\uc238\u5140\u4cd9\u8aa5)), var_3_8B:int)))) {
                    stack_157_1 = xor:int[expected:boolean](ldc:int(14352), ldc:int(14353))
                }
                else {
                    var_1_C5 = and:int(var_1_C5:int, ldc:int(-1275102248))
                    stack_157_1 = and:int[expected:boolean](ldc:int(2330), ldc:int(-2395))
                }
                
                var_1_101 = and:int(var_1_C5:int, ldc:int(-1208263223))
                putfield:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u0b8e\u61a4\u8d90\u6d69\ub18d\u62da, this:\ube23\uc238\u5140\u4cd9\u8aa5, stack_157_1:boolean)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u9033\uc2e8\u72f1\u8d98\u6d69 \u8df4\ub113\u9937\u4cd9\u4c04\u6d69() {
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
            return:\u9033\uc2e8\u72f1\u8d98\u6d69(invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69(\u88c5\ud171\ub113\u6435\ud51e::\u494c\u7043\ub7dc\u0b8e\uceb8\ucb79, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5)))
        }
        
        goto(Label_0006)
    }
    
    private void \u3bd6\uae87\u4975\u4f52\u67d0\u97b7() {
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
            invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\uc229\ud217\u760c\ufcaf\ua562\u8640, getfield:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\ube23\uc238\u5140\u4cd9\u8aa5::\u76bc\u4492\ud51e\u8350\uf995\u74b1, this:\ube23\uc238\u5140\u4cd9\u8aa5), and:int(ldc:int(15512), ldc:int(-16026)))
            invokeinterface:void(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u3776\u6d69\u4ab3\ub18d\uc29a\u2dcc, getfield:\uc84e\u983f\u0a06\u3d64\u5d20\u4179[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\ube23\uc238\u5140\u4cd9\u8aa5::\u76bc\u4492\ud51e\u8350\uf995\u74b1, this:\ube23\uc238\u5140\u4cd9\u8aa5), and:int[expected:boolean](ldc:int(876), ldc:int(-877)))
            invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\uae5d\u9af2\uc229\u3711\uc238\u9af2, getfield:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\ube23\uc238\u5140\u4cd9\u8aa5::\u76bc\u4492\ud51e\u8350\uf995\u74b1, this:\ube23\uc238\u5140\u4cd9\u8aa5), and:int(ldc:int(17242), ldc:int(-17275)))
            invokeinterface:void(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\uc2e8\u47c2\ub19c\ub32d\u40a9\u61a4, getfield:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\ube23\uc238\u5140\u4cd9\u8aa5::\u76bc\u4492\ud51e\u8350\uf995\u74b1, this:\ube23\uc238\u5140\u4cd9\u8aa5), and:int[expected:boolean](ldc:int(26729), ldc:int(-26730)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7330\uafe7\ubff1\ub83f\ud4fe\u156b() {
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
            putfield:int(\ube23\uc238\u5140\u4cd9\u8aa5::\u0b8e\u3c25\uc9f6\u88c5\u88c5\ud36e, this:\ube23\uc238\u5140\u4cd9\u8aa5, and:int(ldc:int(-5889), ldc:int(5888)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u97e6\u946b\u8c8a\uc31c\u52d3\u52d3(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f> p0) {
        var_4_6A : \uf995\u8709\ua61f\ub32d\ubff1\u99f7
        
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
            var_4_6A = invokevirtual:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u9033\u3711\u494c\u88c5\u69d9\u97b7, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u156b\u69d9\u3dd3\uc910\uf9c5\u183a, p0:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>))
            
            if (cmpeq:boolean(invokevirtual:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u156b\ubb2b\u4492\u647c\ud217\uc4d2, var_4_6A:\uf995\u8709\ua61f\ub32d\ubff1\u99f7), invokevirtual:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>::\u7af6\u4492\u718f\uc31c\u4c2b\u97b7, p0:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>))) {
                invokevirtual:void(\uf995\u8709\ua61f\ub32d\ubff1\u99f7::\u8709\u7330\ua3b4\ud12e\u0c95\u3a62, var_4_6A:\uf995\u8709\ua61f\ub32d\ubff1\u99f7, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u156b\u69d9\u3dd3\uc910\uf9c5\u183a, p0:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u7330\u4c2b\u71f1\u8aa5\u4975\ua6bd(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p0) {
        var_4_6A : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        
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
            var_4_6A = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u156b\u69d9\u3dd3\uc910\uf9c5\u183a, p0:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>))
            
            if (invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_4_6A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], checkcast:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>::\u7af6\u4492\u718f\uc31c\u4c2b\u97b7, p0:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>)))) {
                invokevirtual:void(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u4f4a\uc29a\u69d9\u0800\u960f\u8cae, var_4_6A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\ube23\uc238\u5140\u4cd9\u8aa5, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b5f\ud158\u3a62\u0a06\ua068\u7bad::\u156b\u69d9\u3dd3\uc910\uf9c5\u183a, p0:\u6b5f\ud158\u3a62\u0a06\ua068\u7bad<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>), getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, this:\ube23\uc238\u5140\u4cd9\u8aa5))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u74b1\ua562\u494c\ub18d\ua61f\u7049(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
    
    public void \u3776\u51fa\u6c56\u88c5\u760c\u8d98(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1) {
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
    
    public void \u4f52\u8709\u8308\u4c04\u6ec6\u927d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_2_FA : int
        var_4_93 : int
        var_5_A0 : int
        var_6_AD : int
        var_2_CB : int
        
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
            var_2_FA = and:int(ldc:int(-1954569957), ldc:int(-547641398))
            
            if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u5140\u8d90\u0b8e\u6198\ub8be\u8bb0, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(-32765), ldc:int(-32749))))
                var_4_93 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0)))
                var_5_A0 = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p0:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0)))
                var_6_AD = invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0)))
                
                if (getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u8d90\ud36e\u7e3f\u3dd3\uc9f6\uc238, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                    if (cmpeq:boolean(getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8bb0\u7006\u965f\u8709\u74b1\u72f1, p0:\u7d52\u718f\u3776\u6fb0\ub83f), var_4_93:int)) {
                        if (cmpeq:boolean(getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\ubf56\u7af6\ua068\u7873\u71f1\u3711, p0:\u7d52\u718f\u3776\u6fb0\ub83f), var_5_A0:int)) {
                            if (cmpeq:boolean(getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8308\u3bc9\u3711\uc246\ud4fe\ub171, p0:\u7d52\u718f\u3776\u6fb0\ub83f), var_6_AD:int)) {
                                goto(Label_0400)
                            }
                        }
                    }
                }
                
                Label_0182:
                
                if (cmpne:boolean(and:int(var_2_FA:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0400)
                }
                
                if (cmpeq:boolean(and:int(var_2_FA:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_CB = and:int(var_2_FA:int, ldc:int(309720005))
                    goto(Label_0292)
                }
                
                if (cmpeq:boolean(and:int(var_2_FA:int, ldc:int(2)), ldc:int(0))) {
                    var_2_CB = and:int(var_2_FA:int, ldc:int(527197123))
                }
                else {
                    var_2_CB = and:int(var_2_FA:int, ldc:int(-1286952633))
                    
                    if (getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u8d90\ud36e\u7e3f\u3dd3\uc9f6\uc238, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                        if (invokevirtual:boolean(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd], getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8bb0\u7006\u965f\u8709\u74b1\u72f1, p0:\u7d52\u718f\u3776\u6fb0\ub83f), getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8308\u3bc9\u3711\uc246\ud4fe\ub171, p0:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                            invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u3e75\u76bc\u6fb0\u5d20\uc3e3\uae87, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8bb0\u7006\u965f\u8709\u74b1\u72f1, p0:\u7d52\u718f\u3776\u6fb0\ub83f), getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8308\u3bc9\u3711\uc246\ud4fe\ub171, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), p0:\u7d52\u718f\u3776\u6fb0\ub83f, getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\ubf56\u7af6\ua068\u7873\u71f1\u3711, p0:\u7d52\u718f\u3776\u6fb0\ub83f))
                        }
                    }
                }
                
                Label_0237:
                
                if (cmpne:boolean(and:int(var_2_CB:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_FA = and:int(var_2_CB:int, ldc:int(-567205333))
                    goto(Label_0400)
                }
                
                if (cmpne:boolean(and:int(var_2_CB:int, ldc:int(16777216)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_CB:int, ldc:int(256)), ldc:int(0))) {
                        var_2_FA = and:int(var_2_CB:int, ldc:int(1836021585))
                        goto(Label_0182)
                    }
                    
                    var_2_CB = and:int(var_2_CB:int, ldc:int(-1476678750))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u7873\u9af2\u7af6\ubcb0\u416d\ub6ab, p0:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                        if (logicalnot:boolean(invokevirtual:boolean(\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd::\u3d64\ucef1\u69d9\u8d98\u3d64\u5bc4, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uc4d2\ubefe\ube23\ubded\uc9f6\uc2bd], var_4_93:int, var_6_AD:int))) {
                            if (getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u8d90\ud36e\u7e3f\u3dd3\uc9f6\uc238, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                                invokeinterface:void(Logger::warn, getstatic:Logger(\ube23\uc238\u5140\u4cd9\u8aa5::\u416d\u1187\u52d3\u071d\uc238\uc246), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(2065), ldc:int(179))), p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:Object])
                            }
                            
                            var_2_FA = and:int(var_2_CB:int, ldc:int(-2024100917))
                            putfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u8d90\ud36e\u7e3f\u3dd3\uc9f6\uc238, p0:\u7d52\u718f\u3776\u6fb0\ub83f, and:int[expected:boolean](ldc:int(19080), ldc:int(-19097)))
                            goto(Label_0400)
                        }
                    }
                }
                
                Label_0292:
                
                if (cmpne:boolean(and:int(var_2_CB:int, ldc:int(512)), ldc:int(0))) {
                    var_2_FA = and:int(var_2_CB:int, ldc:int(-1114786607))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_CB:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0237)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_CB:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_FA = and:int(var_2_CB:int, ldc:int(885008167))
                        goto(Label_0182)
                    }
                    
                    var_2_FA = and:int(var_2_CB:int, ldc:int(-815095346))
                    invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20, invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_4_93:int, var_6_AD:int), p0:\u7d52\u718f\u3776\u6fb0\ub83f)
                }
                
                Label_0400:
                
                if (cmpeq:boolean(and:int(var_2_FA:int, ldc:int(256)), ldc:int(0))) {
                    var_2_CB = and:int(var_2_FA:int, ldc:int(-1962417906))
                    goto(Label_0292)
                }
                
                if (cmpeq:boolean(and:int(var_2_FA:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_CB = and:int(var_2_FA:int, ldc:int(-84672872))
                    goto(Label_0237)
                }
                
                if (cmpeq:boolean(and:int(var_2_FA:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_FA = and:int(var_2_FA:int, ldc:int(1768639786))
                    goto(Label_0182)
                }
                
                var_2_FA = and:int(var_2_FA:int, ldc:int(-817975542))
                invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, invokevirtual:\ubf56\u64f2\u392e\u98a4\u120d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u8d90\uae5d\u7049\u61a4\uceb8\u8df4, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u836c\u67d0\u6435\u4bc8\ud217\u12b2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
        var_3_61 : int
        stack_A2_0 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(-4233956), ldc:int(804250579))
            
            if (logicaland:boolean(logicalnot:boolean(invokevirtual:boolean(\u88c5\ud171\ub113\u6435\ud51e::\u516c\u64ab\u3e75\u8350\u946b\u3e75, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5), this:\ube23\uc238\u5140\u4cd9\u8aa5, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p0:\ua3b4\u8aa5\ub113\ubf56\u873d)), invokevirtual:boolean(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u59ec\uc2e8\u0c95\u8d90\uc7fe\u927d, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                stack_A2_0 = and:int(ldc:int(18985), ldc:int(275))
            }
            else {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1367382722))
                stack_A2_0 = and:int(ldc:int(-29147), ldc:int(8658))
            }
            
            return:boolean(stack_A2_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u9a18\u7d52\ud171\u4daf\ub6ab\ubf56(\u4f52\u6cfe\u9a18\uc29a\u3bd6.\u8389\u8413\u3a62\u8cae\uc31c\u6d69 p0, boolean p1, boolean p2) {
        var_4_63 : int
        var_6_69 : \u69d9\u759a\u64ab\ua3b4\u6b0d
        var_4_A3 : int
        
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
        var_4_63 = and:int(ldc:int(731416130), ldc:int(1787804507))
        var_6_69 = invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5)
        
        if (logicalnot:boolean(p2:boolean)) {
            if (cmpeq:boolean(p0:\u8389\u8413\u3a62\u8cae\uc31c\u6d69, aconstnull:\u8389\u8413\u3a62\u8cae\uc31c\u6d69())) {
                goto(Label_0137)
            }
            
            invokeinterface:void(\u8389\u8413\u3a62\u8cae\uc31c\u6d69::\u156b\u946b\ua562\u5d20\u47c2\u7ce1, p0:\u8389\u8413\u3a62\u8cae\uc31c\u6d69, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(2523), ldc:int(534)))))
            goto(Label_0137)
        }
        
        Label_0111:
        
        if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        Label_0137:
        
        if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
            var_4_63 = and:int(var_4_63:int, ldc:int(-1934341637))
            goto(Label_0111)
        }
        
        var_4_A3 = and:int(var_4_63:int, ldc:int(999999960))
        invokespecial:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u8258\u40a9\ubff1\u9033\u7873\ub18d, this:\ube23\uc238\u5140\u4cd9\u8aa5)
        
        if (cmpne:boolean(p0:\u8389\u8413\u3a62\u8cae\uc31c\u6d69, aconstnull:\u8389\u8413\u3a62\u8cae\uc31c\u6d69())) {
            invokeinterface:void(\u8389\u8413\u3a62\u8cae\uc31c\u6d69::\ucef1\u7af6\u3711\u4f4a\ub113\ub171, p0:\u8389\u8413\u3a62\u8cae\uc31c\u6d69, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(10502), ldc:int(10517)))))
        }
        
        var_4_63 = and:int(var_4_A3:int, ldc:int(587780605))
        invokevirtual:void(\u69d9\u759a\u64ab\ua3b4\u6b0d::\uf94d\u7049\u12cb\u7006\uafe7\u494c, var_6_69:\u69d9\u759a\u64ab\ua3b4\u6b0d, p1:boolean)
        goto(Label_0111)
    }
    
    private void \u8258\u40a9\ubff1\u9033\u7873\ub18d() {
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
            
            if (cmpne:boolean(getfield:\u4ab3\u839e\u0c95\u4c04\u64ab(\ube23\uc238\u5140\u4cd9\u8aa5::\uc2bd\u494c\u1833\uc9f6\u7d52\u9a18, this:\ube23\uc238\u5140\u4cd9\u8aa5), aconstnull:\u4ab3\u839e\u0c95\u4c04\u64ab())) {
                invokeinterface:void(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\u0b8e\uc84e\u4f4a\ubcb0\u5f50\ubff1, invokevirtual:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5)), invokevirtual:\uc31c\uc87f\uc246\u3776\ub7dc(\u4ab3\u839e\u0c95\u4c04\u64ab::\u71f1\u4179\ud51e\u4492\uc87f\u960f, getfield:\u4ab3\u839e\u0c95\u4c04\u64ab(\ube23\uc238\u5140\u4cd9\u8aa5::\uc2bd\u494c\u1833\uc9f6\u7d52\u9a18, this:\ube23\uc238\u5140\u4cd9\u8aa5)))
            }
            
            invokevirtual:void(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\ua3b4\uc87f\uafe7\ufe34\u6b5f\ud171, invokevirtual:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113(\u69d9\u759a\u64ab\ua3b4\u6b0d::\u3d64\uc246\uc229\u120d\u5140\uc87f, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> \u97e6\ud171\u6d99\u8cae\u6c56\u98a4(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c<?> p0, java.util.function.Predicate<? super \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> p1) {
        var_3_C8 : int
        var_5_65 : ArrayList
        var_6_6B : \u69d9\u759a\u64ab\ua3b4\u6b0d
        var_7_7B : ObjectIterator
        var_8_BD : \u7d52\u718f\u3776\u6fb0\ub83f
        
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
            var_3_C8 = and:int(ldc:int(1158698784), ldc:int(-713570580))
            var_5_65 = invokestatic:ArrayList(Lists::newArrayList)
            var_6_6B = invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5)
            var_7_7B = invokeinterface:ObjectIterator(ObjectCollection::iterator, invokeinterface:ObjectCollection(Int2ObjectMap::values, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\uc2e8\u69d9\ud36e\u647c\ub83f\u6ec6, this:\ube23\uc238\u5140\u4cd9\u8aa5)))
            
            loop {
                if (cmpeq:boolean(and:int(var_3_C8:int, ldc:int(33554432)), ldc:int(0))) {
                    var_3_C8 = and:int(var_3_C8:int, ldc:int(1727207393))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_7_7B:ObjectIterator)) {
                        var_8_BD = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_7_7B:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>))
                        
                        if (logicalor:boolean(cmpeq:boolean(p0:\u9255\u0c95\u4cd9\ube23\u760c<?>, aconstnull:\u9255\u0c95\u4cd9\ube23\u760c<?>()), cmpeq:boolean(invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, var_8_BD:\u7d52\u718f\u3776\u6fb0\ub83f), p0:\u9255\u0c95\u4cd9\ube23\u760c<?>))) {
                            var_3_C8 = and:int(var_3_C8:int, ldc:int(-1198315721))
                            
                            if (invokevirtual:boolean(\u69d9\u759a\u64ab\ua3b4\u6b0d::\uc910\u3776\u718f\u8413\ucb79\u4492, var_6_6B:\u69d9\u759a\u64ab\ua3b4\u6b0d, shr:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, var_8_BD:\u7d52\u718f\u3776\u6fb0\ub83f)), and:int(ldc:int(5190), ldc:int(2564))), shr:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, var_8_BD:\u7d52\u718f\u3776\u6fb0\ub83f)), xor:int(ldc:int(18439), ldc:int(18435))))) {
                                if (invokeinterface:boolean(Predicate<\u7d52\u718f\u3776\u6fb0\ub83f>::test, p1:Predicate<\u7d52\u718f\u3776\u6fb0\ub83f>, var_8_BD:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                                    invokeinterface:boolean(List<\u7d52\u718f\u3776\u6fb0\ub83f>::add, var_5_65:ArrayList<\u7d52\u718f\u3776\u6fb0\ub83f>[expected:List<\u7d52\u718f\u3776\u6fb0\ub83f>], var_8_BD:\u7d52\u718f\u3776\u6fb0\ub83f)
                                }
                            }
                        }
                        
                        var_3_C8 = and:int(var_3_C8:int, ldc:int(144205419))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_C8:int, ldc:int(1)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_C8 = and:int(var_3_C8:int, ldc:int(-1991599481))
            }
            
            return:List<\u7d52\u718f\u3776\u6fb0\ub83f>(var_5_65:ArrayList<\u7d52\u718f\u3776\u6fb0\ub83f>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u47c2\u2dcc\u12cb\ud171\u8c8a.\ua3b4\u9a18\ufcaf\ubff1\u3c25> \u3504\uc9f6\ub1b9\u6b5f\u64f2\u67e9() {
        var_1_61 : int
        var_3_65 : ArrayList
        var_4_74 : ObjectIterator
        var_1_83 : int
        var_5_BE : \u7d52\u718f\u3776\u6fb0\ub83f
        
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
            var_1_61 = and:int(ldc:int(-277645358), ldc:int(1072905689))
            var_3_65 = invokestatic:ArrayList(Lists::newArrayList)
            var_4_74 = invokeinterface:ObjectIterator(ObjectCollection::iterator, invokeinterface:ObjectCollection(Int2ObjectMap::values, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\uc2e8\u69d9\ud36e\u647c\ub83f\u6ec6, this:\ube23\uc238\u5140\u4cd9\u8aa5)))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(8192)), ldc:int(0))) {
                    var_1_83 = and:int(var_1_61:int, ldc:int(-501044734))
                }
                else {
                    var_1_83 = and:int(var_1_61:int, ldc:int(1872229850))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_4_74:Iterator)) {
                        var_5_BE = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_4_74:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>))
                        
                        if (instanceof:boolean(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ua3b4\u9a18\ufcaf\ubff1\u3c25.class, var_5_BE:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                            if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, var_5_BE:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                                invokeinterface:boolean(List<\ua3b4\u9a18\ufcaf\ubff1\u3c25>::add, var_3_65:ArrayList<\ua3b4\u9a18\ufcaf\ubff1\u3c25>[expected:List<\ua3b4\u9a18\ufcaf\ubff1\u3c25>], checkcast:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ua3b4\u9a18\ufcaf\ubff1\u3c25.class, var_5_BE:\ua3b4\u9a18\ufcaf\ubff1\u3c25[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
                            }
                        }
                        
                        var_1_61 = and:int(var_1_83:int, ldc:int(-1352780071))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_83:int, ldc:int(8)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_61 = and:int(var_1_83:int, ldc:int(1629247235))
            }
            
            return:List<\ua3b4\u9a18\ufcaf\ubff1\u3c25>(var_3_65:ArrayList<\ua3b4\u9a18\ufcaf\ubff1\u3c25>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f> \uc3e3\u7043\u12b2\u56bd\uf94d\u3e2a(java.util.function.Predicate<? super \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f> p0) {
        var_2_61 : int
        var_4_65 : ArrayList
        var_5_70 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_2_7F : int
        var_6_BB : \u51fa\u6c52\u7330\u7330\u960f
        
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
            var_2_61 = and:int(ldc:int(1480024547), ldc:int(1496498931))
            var_4_65 = invokestatic:ArrayList(Lists::newArrayList)
            var_5_70 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(List<\u51fa\u6c52\u7330\u7330\u960f>::iterator, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\u4d85\u3776\u5140\u6fb0\u6ec6\uceb8, this:\ube23\uc238\u5140\u4cd9\u8aa5))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
                    var_2_7F = and:int(var_2_61:int, ldc:int(84783725))
                }
                else {
                    var_2_7F = and:int(var_2_61:int, ldc:int(989582319))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_70:Iterator<\u51fa\u6c52\u7330\u7330\u960f>)) {
                        var_6_BB = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_5_70:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                        
                        if (invokeinterface:boolean(Predicate<\u51fa\u6c52\u7330\u7330\u960f>::test, p0:Predicate<\u51fa\u6c52\u7330\u7330\u960f>, var_6_BB:\u51fa\u6c52\u7330\u7330\u960f)) {
                            invokeinterface:boolean(List<\u51fa\u6c52\u7330\u7330\u960f>::add, var_4_65:ArrayList<\u51fa\u6c52\u7330\u7330\u960f>[expected:List<\u51fa\u6c52\u7330\u7330\u960f>], var_6_BB:\u51fa\u6c52\u7330\u7330\u960f)
                        }
                        
                        var_2_61 = and:int(var_2_7F:int, ldc:int(-629409799))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_7F:int, ldc:int(128)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_61 = and:int(var_2_7F:int, ldc:int(1144603801))
            }
            
            return:List<\u51fa\u6c52\u7330\u7330\u960f>(var_4_65:ArrayList<\u51fa\u6c52\u7330\u7330\u960f>)
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f \u4daf\u960f\u67d0\u0c95\uc9f6\u7043() {
        var_3_6B : List<\u51fa\u6c52\u7330\u7330\u960f>
        
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
            var_3_6B = invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\uc3e3\u7043\u12b2\u56bd\uf94d\u3e2a, this:\ube23\uc238\u5140\u4cd9\u8aa5, invokedynamic:Predicate<? super \u51fa\u6c52\u7330\u7330\u960f>(test:()Ljava/util/function/Predicate;))
            return:\u51fa\u6c52\u7330\u7330\u960f(ternaryop:\u51fa\u6c52\u7330\u7330\u960f(invokeinterface:boolean(List<E>::isEmpty, var_3_6B:List<\u51fa\u6c52\u7330\u7330\u960f>), aconstnull:\u51fa\u6c52\u7330\u7330\u960f(), checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(List<\u51fa\u6c52\u7330\u7330\u960f>::get, var_3_6B:List<\u51fa\u6c52\u7330\u7330\u960f>, invokevirtual:int(Random::nextInt, getfield:Random(\ube23\uc238\u5140\u4cd9\u8aa5::\u3776\ub113\u8c8a\u8709\ub18d\uc2bd, this:\ube23\uc238\u5140\u4cd9\u8aa5), invokeinterface:int(List<E>::size, var_3_6B:List<\u51fa\u6c52\u7330\u7330\u960f>))))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ua6bd\ubefe\u5f50\u12cb\uceb8\u718f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            return:boolean(invokespecial:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u0c95\u839e\u1833\uc229\uc2bd\uc229, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u7d52\u718f\u3776\u6fb0\ub83f))
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc31c\u6cfe\u4e72\uc238\u0800\u6ec6(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            return:boolean(invokespecial:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u0c95\u839e\u1833\uc229\uc2bd\uc229, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u7d52\u718f\u3776\u6fb0\ub83f))
        }
        
        goto(Label_0006)
    }
    
    public void \ud4fe\u6b0d\u99f7\u0c95\u965f\u72f1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_4_66 : boolean
        
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
            var_4_66 = getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u16f6\u3d64\u0c95\u8258\u5f50\u69d9, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            putfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u16f6\u3d64\u0c95\u8258\u5f50\u69d9, p0:\u7d52\u718f\u3776\u6fb0\ub83f, xor:int[expected:boolean](ldc:int(8584), ldc:int(8585)))
            invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\uc31c\u6cfe\u4e72\uc238\u0800\u6ec6, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            putfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u16f6\u3d64\u0c95\u8258\u5f50\u69d9, p0:\u7d52\u718f\u3776\u6fb0\ub83f, var_4_66:boolean)
            invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u4f52\u8709\u8308\u4c04\u6ec6\u927d, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ub19c\u3dd3\u8350\u4975\u97b7\u4c2b(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
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
            invokespecial:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u3bc9\u56bd\ub102\u8709\ub32d\u3bd6, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u51fa\u6c52\u7330\u7330\u960f)
            invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u4f52\u8709\u8308\u4c04\u6ec6\u927d, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3504\u76bc\u64f2\u76bc\ub18d\u516c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
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
            invokespecial:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u3bc9\u56bd\ub102\u8709\ub32d\u3bd6, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u51fa\u6c52\u7330\u7330\u960f)
            invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u4f52\u8709\u8308\u4c04\u6ec6\u927d, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u74b1\u92ee\ucfaf\u446c\u4f52\u5140(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
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
            invokespecial:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u3bc9\u56bd\ub102\u8709\ub32d\u3bd6, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u51fa\u6c52\u7330\u7330\u960f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0b8e\uc87f\u4179\u983f\u7d52\u7bad(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
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
            invokespecial:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u3bc9\u56bd\ub102\u8709\ub32d\u3bd6, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u51fa\u6c52\u7330\u7330\u960f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3bc9\u56bd\ub102\u8709\ub32d\u3bd6(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
        var_4_72 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_5_B2 : \u8aa5\ubded\ub18d\u4f4a\u4f52
        
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
            var_4_72 = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Map<UUID, \u7d52\u718f\u3776\u6fb0\ub83f>::get, getfield:Map<UUID, \u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\ub6ab\u759a\uceb8\u071d\uc2e8\u0800, this:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:UUID[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))
            
            if (cmpne:boolean(var_4_72:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
                invokeinterface:void(Logger::warn, getstatic:Logger(\ube23\uc238\u5140\u4cd9\u8aa5::\u416d\u1187\u52d3\u071d\uc238\uc246), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(320), ldc:int(340))), invokevirtual:String[expected:Object](UUID::toString, invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))
                invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u836c\u5654\u3e2a\u7af6\uae87\ub8be, var_4_72:\u7d52\u718f\u3776\u6fb0\ub83f)
                invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u4c04\u8258\u5d20\u97e6\ud158\u600f, this:\ube23\uc238\u5140\u4cd9\u8aa5, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, var_4_72:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
            }
            
            invokeinterface:boolean(List<\u51fa\u6c52\u7330\u7330\u960f>::add, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\u4d85\u3776\u5140\u6fb0\u6ec6\uceb8, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:\u51fa\u6c52\u7330\u7330\u960f)
            invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u8753\u5db4\ufe34\u071d\u8640\u759a, this:\ube23\uc238\u5140\u4cd9\u8aa5)
            var_5_B2 = invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), ldc:double(16.0))), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), ldc:double(16.0))), getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u6b0d\u5fe1\ua068\u946b\u9255\ua068), and:int[expected:boolean](ldc:int(8833), ldc:int(259)))
            
            if (instanceof:boolean(\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e.class, var_5_B2:\u8aa5\ubded\ub18d\u4f4a\u4f52)) {
                invokeinterface:void(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20, var_5_B2:\u8aa5\ubded\ub18d\u4f4a\u4f52, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            }
            
            invokespecial:void(\ube23\uc238\u5140\u4cd9\u8aa5::\uc87f\u7043\u946b\uc910\u4179\u7873, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \u0c95\u839e\u1833\uc229\uc2bd\uc229(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_2_76 : int
        var_4_B7 : \u8aa5\ubded\ub18d\u4f4a\u4f52
        
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
        var_2_76 = and:int(ldc:int(1516747482), ldc:int(-144197692))
        
        if (getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ua6bd\u3a62\ua61f\u12b2\u3e2a\ub19c, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
            invokeinterface:void(Logger::warn, getstatic:Logger(\ube23\uc238\u5140\u4cd9\u8aa5::\u416d\u1187\u52d3\u071d\uc238\uc246), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(17931), ldc:int(17950))), invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u9255\u0c95\u4cd9\ube23\u760c<T>::\u8d90\u56bd\u5db4\uf94d\u9af2\uc31c, invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p0:\u7d52\u718f\u3776\u6fb0\ub83f)))
            return:boolean(and:int[expected:boolean](ldc:int(11877), ldc:int(-15974)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_76:int, ldc:int(262144)), ldc:int(0))) {
                var_2_76 = and:int(var_2_76:int, ldc:int(1458020298))
                
                if (invokespecial:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u4daf\ud51e\u5f50\u8640\u5db4\u624e, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                    return:boolean(and:int[expected:boolean](ldc:int(-22040), ldc:int(5653)))
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_76:int, ldc:int(4194304)), ldc:int(0))) {
                var_2_76 = and:int(var_2_76:int, ldc:int(1333088721))
            }
            else {
                var_4_B7 = invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0))), invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\ub19c\u0a06\ub32d\u3d64\u67d0\u839e, div:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\u7d52\u718f\u3776\u6fb0\ub83f), ldc:double(16.0))), getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u6b0d\u5fe1\ua068\u946b\u9255\ua068), getfield:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u16f6\u3d64\u0c95\u8258\u5f50\u69d9, p0:\u7d52\u718f\u3776\u6fb0\ub83f))
                
                if (instanceof:boolean(\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e.class, var_4_B7:\u8aa5\ubded\ub18d\u4f4a\u4f52)) {
                    invokeinterface:void(\u8aa5\ubded\ub18d\u4f4a\u4f52::\u56bd\ub7dc\u5bc4\u67d0\ud523\u5d20, var_4_B7:\u8aa5\ubded\ub18d\u4f4a\u4f52, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
                    invokespecial:void(\ube23\uc238\u5140\u4cd9\u8aa5::\uc87f\u7043\u946b\uc910\u4179\u7873, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
                    return:boolean(and:int[expected:boolean](ldc:int(5335), ldc:int(2089)))
                }
                
                return:boolean(and:int[expected:boolean](ldc:int(16990), ldc:int(-16991)))
            }
        }
    }
    
    public boolean \u4cd9\u7e3f\ub18d\uc87f\u8bb0\u516c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
        
        if (logicalnot:boolean(invokespecial:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u4daf\ud51e\u5f50\u8640\u5db4\u624e, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u7d52\u718f\u3776\u6fb0\ub83f))) {
            invokespecial:void(\ube23\uc238\u5140\u4cd9\u8aa5::\uc87f\u7043\u946b\uc910\u4179\u7873, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:boolean(xor:int[expected:boolean](ldc:int(12801), ldc:int(12800)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(20549), ldc:int(-20550)))
    }
    
    private boolean \u4daf\ud51e\u5f50\u8640\u5db4\u624e(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_4_66 : UUID
        var_5_6E : \u7d52\u718f\u3776\u6fb0\ub83f
        
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
        var_4_66 = invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
        var_5_6E = invokespecial:\u7d52\u718f\u3776\u6fb0\ub83f(\ube23\uc238\u5140\u4cd9\u8aa5::\u92ee\uff55\u7c6b\u7af6\uf995\u839e, this:\ube23\uc238\u5140\u4cd9\u8aa5, var_4_66:UUID)
        
        if (cmpne:boolean(var_5_6E:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
            invokeinterface:void(Logger::warn, getstatic:Logger(\ube23\uc238\u5140\u4cd9\u8aa5::\u416d\u1187\u52d3\u071d\uc238\uc246), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(17426), ldc:int(17412))), var_4_66:UUID[expected:Object], invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u9255\u0c95\u4cd9\ube23\u760c<T>::\u8d90\u56bd\u5db4\uf94d\u9af2\uc31c, invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, var_5_6E:\u7d52\u718f\u3776\u6fb0\ub83f)), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uc84e\u2dcc\u873d\u8389\ufcaf, var_5_6E:\u7d52\u718f\u3776\u6fb0\ub83f)), invokestatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\u9255\u0c95\u4cd9\ube23\u760c<T>::\u8d90\u56bd\u5db4\uf94d\u9af2\uc31c, invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p0:\u7d52\u718f\u3776\u6fb0\ub83f)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uc84e\u2dcc\u873d\u8389\ufcaf, p0:\u7d52\u718f\u3776\u6fb0\ub83f)))
            return:boolean(xor:int[expected:boolean](ldc:int(1280), ldc:int(1281)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(1354), ldc:int(-1355)))
    }
    
    private \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f \u92ee\uff55\u7c6b\u7af6\uf995\u839e(java.util.UUID p0) {
        var_2_F1 : int
        var_4_6F : \u7d52\u718f\u3776\u6fb0\ub83f
        var_5_BB : Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>
        var_6_DE : \u7d52\u718f\u3776\u6fb0\ub83f
        
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
        var_2_F1 = and:int(ldc:int(1107562876), ldc:int(-616042144))
        var_4_6F = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Map<UUID, \u7d52\u718f\u3776\u6fb0\ub83f>::get, getfield:Map<UUID, \u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\ub6ab\u759a\uceb8\u071d\uc2e8\u0800, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:UUID[expected:Object]))
        
        if (cmpne:boolean(var_4_6F:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
            return:\u7d52\u718f\u3776\u6fb0\ub83f(var_4_6F:\u7d52\u718f\u3776\u6fb0\ub83f)
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_F1:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_F1 = and:int(var_2_F1:int, ldc:int(1192377727))
                
                if (getfield:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\ub19c\u494c\u7c6b\u8cae\u6c52\u4c2b, this:\ube23\uc238\u5140\u4cd9\u8aa5)) {
                    var_5_BB = invokeinterface:Iterator<Object>(Collection<Object>::iterator, getfield:Queue<\u7d52\u718f\u3776\u6fb0\ub83f>[expected:Collection<Object>](\ube23\uc238\u5140\u4cd9\u8aa5::\u1833\u718f\u3504\u718f\ucef1\u6435, this:\ube23\uc238\u5140\u4cd9\u8aa5))
                    
                    loop {
                        var_2_F1 = and:int(var_2_F1:int, ldc:int(-1490447874))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_BB:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>))) {
                            looporswitchbreak()
                        }
                        
                        var_6_DE = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_5_BB:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>))
                        
                        if (invokevirtual:boolean(UUID::equals, invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, var_6_DE:\u7d52\u718f\u3776\u6fb0\ub83f), p0:UUID[expected:Object])) {
                            return:\u7d52\u718f\u3776\u6fb0\ub83f(var_6_DE:\u7d52\u718f\u3776\u6fb0\ub83f)
                        }
                        
                        var_2_F1 = and:int(var_2_F1:int, ldc:int(252322282))
                    }
                }
            }
            
            if (cmpeq:boolean(and:int(var_2_F1:int, ldc:int(65536)), ldc:int(0))) {
                return:\u7d52\u718f\u3776\u6fb0\ub83f(aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())
            }
            
            var_2_F1 = and:int(var_2_F1:int, ldc:int(1022695603))
        }
    }
    
    public boolean \u6b0d\u3776\u5f50\uff55\u8bb0\u98a4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
        
        if (logicalnot:boolean(invokeinterface:boolean(Stream<\u7d52\u718f\u3776\u6fb0\ub83f>::anyMatch, invokevirtual:Stream<\u7d52\u718f\u3776\u6fb0\ub83f>(\u7d52\u718f\u3776\u6fb0\ub83f::\ua3b4\u839e\u9937\u5140\u6d69\u946b, p0:\u7d52\u718f\u3776\u6fb0\ub83f), invokedynamic:Predicate<\u7d52\u718f\u3776\u6fb0\ub83f>(test:(L\u7c6b\u7c6b\ubefe\u385b\u3c25/\ud7e8\u0800\uae87\u8d90\u183a/\ube23\uc238\u5140\u4cd9\u8aa5;)Ljava/util/function/Predicate;, this:\ube23\uc238\u5140\u4cd9\u8aa5)))) {
            invokevirtual:void(\ua6bd\u8d98\u6ec6\uc246\uc238::\u624e\ub113\u3a62\u93a2\u6cfe\u6fb0, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\ua6bd\u8d98\u6ec6\uc246\uc238], p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:boolean(and:int[expected:boolean](ldc:int(8257), ldc:int(1331)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(15020), ldc:int(-15037)))
    }
    
    public void \u62da\u760c\u965f\u385b\u8308\u40a9(\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e p0) {
        var_2_12A : int
        var_4_79 : \u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[]
        var_5_7E : int
        var_6_87 : int
        var_7_C2 : Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>
        var_8_107 : \u7d52\u718f\u3776\u6fb0\ub83f
        
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
        var_2_12A = and:int(ldc:int(856168048), ldc:int(1004140155))
        invokeinterface:boolean(List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>::addAll, getfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\ube23\uc238\u5140\u4cd9\u8aa5::\u3c25\u8258\u8aa5\ub70c\u5654\uc2bd, this:\ube23\uc238\u5140\u4cd9\u8aa5), invokeinterface:Collection<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>::values, invokevirtual:Map<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, \ub83f\uc9f6\u47c2\u67d0\u7ce1>(\ud523\u92ff\ubb2b\u759a\ud36e::\u69d9\u62da\ubb2b\ua6bd\u99f7\u99f7, p0:\ud523\u92ff\ubb2b\u759a\ud36e)))
        var_4_79 = invokevirtual:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[](\ud523\u92ff\ubb2b\u759a\ud36e::\u6cfe\u7af6\u3bc9\u6c52\u183a\u760c, p0:\ud523\u92ff\ubb2b\u759a\ud36e)
        var_5_7E = arraylength:int(var_4_79:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[])
        var_6_87 = and:int(ldc:int(17618), ldc:int(-21719))
        
        loop {
            Label_0137:
            
            if (cmpeq:boolean(and:int(var_2_12A:int, ldc:int(128)), ldc:int(0))) {
                var_2_12A = and:int(var_2_12A:int, ldc:int(-27583829))
                
                if (cmplt:boolean(var_6_87:int, var_5_7E:int)) {
                    var_7_C2 = invokevirtual:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>(\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>::iterator, loadelement:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>(var_4_79:\u9255\ubf56\u4d85\u873d\u3711\u6198<\u7d52\u718f\u3776\u6fb0\ub83f>[], var_6_87:int))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_2_12A:int, ldc:int(4)), ldc:int(0))) {
                            var_2_12A = and:int(var_2_12A:int, ldc:int(-1270456058))
                        }
                        else {
                            var_2_12A = and:int(var_2_12A:int, ldc:int(-1170434489))
                            
                            if (invokeinterface:boolean(Iterator::hasNext, var_7_C2:Iterator)) {
                                var_8_107 = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_7_C2:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>))
                                
                                if (logicalnot:boolean(instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, var_8_107:\u7d52\u718f\u3776\u6fb0\ub83f))) {
                                    if (getfield:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\ub19c\u494c\u7c6b\u8cae\u6c52\u4c2b, this:\ube23\uc238\u5140\u4cd9\u8aa5)) {
                                        athrow(checkcast:IllegalStateException(java.lang.IllegalStateException.class, invokestatic:IllegalStateException(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u8640\u36d3\ua3b4\u4ab3\uc238\u839e, initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(-31694), ldc:int(-31707)))))))
                                    }
                                    
                                    var_2_12A = and:int(var_2_12A:int, ldc:int(-1710541258))
                                    invokeinterface:Object(Int2ObjectMap::remove, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\uc2e8\u69d9\ud36e\u647c\ub83f\u6ec6, this:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uc84e\u2dcc\u873d\u8389\ufcaf, var_8_107:\u7d52\u718f\u3776\u6fb0\ub83f))
                                    invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u9255\u72f1\u0c95\u5d20\u5654\ua068, this:\ube23\uc238\u5140\u4cd9\u8aa5, var_8_107:\u7d52\u718f\u3776\u6fb0\ub83f)
                                }
                                
                                var_2_12A = and:int(var_2_12A:int, ldc:int(1998543859))
                                loopcontinue()
                            }
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_12A:int, ldc:int(256)), ldc:int(0))) {
                            var_2_12A = and:int(var_2_12A:int, ldc:int(-1172467162))
                            inc:int(var_6_87, ldc:int(1))
                            loopcontinue(Label_0137)
                        }
                    }
                }
            }
            
            if (cmpne:boolean(and:int(var_2_12A:int, ldc:int(2147483647)), ldc:int(0))) {
                return:void()
            }
            
            var_2_12A = and:int(var_2_12A:int, ldc:int(126165055))
        }
    }
    
    public void \u9255\u72f1\u0c95\u5d20\u5654\ua068(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_2_A9 : int
        var_4_FE : \ub171\u0800\u071d\ubb2b\u9937[]
        var_5_103 : int
        var_6_10C : int
        
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
            var_2_A9 = and:int(ldc:int(-1762725924), ldc:int(-939530799))
            
            if (instanceof:boolean(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ua3b4\u9a18\ufcaf\ubff1\u3c25.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                var_4_FE = invokevirtual:\ub171\u0800\u071d\ubb2b\u9937[](\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u0b8e\ud36e\u7049\uc7fe\uc2bd\u8d98, checkcast:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ua3b4\u9a18\ufcaf\ubff1\u3c25.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\ua3b4\u9a18\ufcaf\ubff1\u3c25]))
                var_5_103 = arraylength:int(var_4_FE:\ub171\u0800\u071d\ubb2b\u9937[])
                var_6_10C = and:int(ldc:int(1865), ldc:int(-3946))
                
                loop {
                    var_2_A9 = and:int(var_2_A9:int, ldc:int(-1495335989))
                    
                    if (cmpge:boolean(var_6_10C:int, var_5_103:int)) {
                        looporswitchbreak()
                    }
                    
                    invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u760c\ud12e\u3d64\u6bb9\u67d0\u0c95, loadelement:\ub171\u0800\u071d\ubb2b\u9937(var_4_FE:\ub171\u0800\u071d\ubb2b\u9937[], var_6_10C:int))
                    inc:int(var_6_10C, ldc:int(1))
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_2_A9:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0202)
                }
                
                if (cmpeq:boolean(and:int(var_2_A9:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_A9 = and:int(var_2_A9:int, ldc:int(-16850216))
                    invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Map<UUID, \u7d52\u718f\u3776\u6fb0\ub83f>::remove, getfield:Map<UUID, \u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\ub6ab\u759a\uceb8\u071d\uc2e8\u0800, this:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:UUID[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\u7d52\u718f\u3776\u6fb0\ub83f))
                    invokevirtual:void(\u69d9\u759a\u64ab\ua3b4\u6b0d::\u7c6b\u3bc9\u3dd3\u71f1\u67e9\u64f2, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:\u7d52\u718f\u3776\u6fb0\ub83f)
                    
                    if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                        invokeinterface:boolean(List<E>::remove, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\u4d85\u3776\u5140\u6fb0\u6ec6\uceb8, this:\ube23\uc238\u5140\u4cd9\u8aa5), checkcast:\u51fa\u6c52\u7330\u7330\u960f[expected:Object](\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\u51fa\u6c52\u7330\u7330\u960f]))
                    }
                }
                
                Label_0156:
                
                if (cmpne:boolean(and:int(var_2_A9:int, ldc:int(2)), ldc:int(0))) {
                    var_2_A9 = and:int(var_2_A9:int, ldc:int(-1473156027))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_A9:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_A9 = and:int(var_2_A9:int, ldc:int(-16791860))
                    invokevirtual:void(\u7c6b\ud36e\u8d90\u0800\ua6bd::\ud12e\ub83f\uc31c\u67e9\u5140\u385b, invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd](\ube23\uc238\u5140\u4cd9\u8aa5::\u8df4\ub113\u9937\u4cd9\u4c04\u6d69, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:\u7d52\u718f\u3776\u6fb0\ub83f)
                    
                    if (instanceof:boolean(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                        invokeinterface:boolean(Set<E>::remove, getfield:Set<\uae5d\u9033\u8c8a\u5db4\u0800\u9af2>(\ube23\uc238\u5140\u4cd9\u8aa5::\ud158\uf94d\uae87\u56bd\uf995\u92ff, this:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2[expected:Object](\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, checkcast:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\u4f4a\uafe7\u76bc\u392e\ub8be])))
                    }
                }
                
                Label_0202:
                
                if (cmpeq:boolean(and:int(var_2_A9:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_A9 = and:int(var_2_A9:int, ldc:int(-509205249))
                    goto(Label_0156)
                }
                
                if (cmpeq:boolean(and:int(var_2_A9:int, ldc:int(536870912)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_A9 = and:int(var_2_A9:int, ldc:int(-1532672138))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uc87f\u7043\u946b\uc910\u4179\u7873(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_2_61 : int
        var_2_7E : int
        var_4_121 : \ub171\u0800\u071d\ubb2b\u9937[]
        var_5_126 : int
        var_6_12F : int
        var_7_14A : \ub171\u0800\u071d\ubb2b\u9937
        
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
        var_2_61 = and:int(ldc:int(1126126240), ldc:int(1064827475))
        
        if (getfield:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\ub19c\u494c\u7c6b\u8cae\u6c52\u4c2b, this:\ube23\uc238\u5140\u4cd9\u8aa5)) {
            invokeinterface:boolean(Queue<\u7d52\u718f\u3776\u6fb0\ub83f>::add, getfield:Queue<\u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\u1833\u718f\u3504\u718f\ucef1\u6435, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            goto(Label_0228)
        }
        
        Label_0105:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0228)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2048)), ldc:int(0))) {
            var_2_7E = and:int(var_2_61:int, ldc:int(1779655978))
        }
        else {
            var_2_7E = and:int(var_2_61:int, ldc:int(-1724263351))
            invokeinterface:Object(Int2ObjectMap::put, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\uc2e8\u69d9\ud36e\u647c\ub83f\u6ec6, this:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uc84e\u2dcc\u873d\u8389\ufcaf, p0:\u7d52\u718f\u3776\u6fb0\ub83f), p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:Object])
            
            if (instanceof:boolean(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ua3b4\u9a18\ufcaf\ubff1\u3c25.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                var_4_121 = invokevirtual:\ub171\u0800\u071d\ubb2b\u9937[](\ua3b4\u9a18\ufcaf\ubff1\u3c25::\u0b8e\ud36e\u7049\uc7fe\uc2bd\u8d98, checkcast:\ua3b4\u9a18\ufcaf\ubff1\u3c25(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ua3b4\u9a18\ufcaf\ubff1\u3c25.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\ua3b4\u9a18\ufcaf\ubff1\u3c25]))
                var_5_126 = arraylength:int(var_4_121:\ub171\u0800\u071d\ubb2b\u9937[])
                var_6_12F = and:int(ldc:int(-27897), ldc:int(27736))
                
                loop {
                    var_2_7E = and:int(var_2_7E:int, ldc:int(-552208153))
                    
                    if (cmpge:boolean(var_6_12F:int, var_5_126:int)) {
                        looporswitchbreak()
                    }
                    
                    var_7_14A = loadelement:\ub171\u0800\u071d\ubb2b\u9937(var_4_121:\ub171\u0800\u071d\ubb2b\u9937[], var_6_12F:int)
                    invokeinterface:Object(Int2ObjectMap::put, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\uc2e8\u69d9\ud36e\u647c\ub83f\u6ec6, this:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uc84e\u2dcc\u873d\u8389\ufcaf, var_7_14A:\ub171\u0800\u071d\ubb2b\u9937[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), var_7_14A:\ub171\u0800\u071d\ubb2b\u9937[expected:Object])
                    inc:int(var_6_12F, ldc:int(1))
                }
            }
        }
        
        Label_0158:
        
        if (cmpeq:boolean(and:int(var_2_7E:int, ldc:int(16384)), ldc:int(0))) {
            var_2_61 = and:int(var_2_7E:int, ldc:int(1958508942))
        }
        else {
            if (cmpne:boolean(and:int(var_2_7E:int, ldc:int(4)), ldc:int(0))) {
                var_2_61 = and:int(var_2_7E:int, ldc:int(-471175335))
                goto(Label_0105)
            }
            
            var_2_61 = and:int(var_2_7E:int, ldc:int(-1680646714))
            invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Map<UUID, \u7d52\u718f\u3776\u6fb0\ub83f>::put, getfield:Map<UUID, \u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\ub6ab\u759a\uceb8\u071d\uc2e8\u0800, this:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:UUID(\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, p0:\u7d52\u718f\u3776\u6fb0\ub83f), p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            invokevirtual:void(\u69d9\u759a\u64ab\ua3b4\u6b0d::\u47c2\u4ab3\u836c\u5fe1\u0a06\u6cfe, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            
            if (instanceof:boolean(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f)) {
                invokeinterface:boolean(Set<\uae5d\u9033\u8c8a\u5db4\u0800\u9af2>::add, getfield:Set<\uae5d\u9033\u8c8a\u5db4\u0800\u9af2>(\ube23\uc238\u5140\u4cd9\u8aa5::\ud158\uf94d\uae87\u56bd\uf995\u92ff, this:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u4f4a\uafe7\u76bc\u392e\ub8be::\u51fa\ub171\ua3b4\u7873\u16f6\u3504, checkcast:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be.class, p0:\u7d52\u718f\u3776\u6fb0\ub83f[expected:\u4f4a\uafe7\u76bc\u392e\ub8be])))
            }
        }
        
        Label_0228:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            var_2_7E = and:int(var_2_61:int, ldc:int(-1180483222))
            goto(Label_0158)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0105)
    }
    
    public void \uc87f\ub1b9\u98a4\u71f1\u7c6b\uae87(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
        
        if (logicalnot:boolean(getfield:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\ub19c\u494c\u7c6b\u8cae\u6c52\u4c2b, this:\ube23\uc238\u5140\u4cd9\u8aa5))) {
            invokespecial:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u3c25\u8258\ubf56\ua6bd\u873d\ub113, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            invokeinterface:Object(Int2ObjectMap::remove, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\uc2e8\u69d9\ud36e\u647c\ub83f\u6ec6, this:\ube23\uc238\u5140\u4cd9\u8aa5), invokevirtual:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uc84e\u2dcc\u873d\u8389\ufcaf, p0:\u7d52\u718f\u3776\u6fb0\ub83f))
            invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u9255\u72f1\u0c95\u5d20\u5654\ua068, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:void()
        }
        
        athrow(checkcast:IllegalStateException(java.lang.IllegalStateException.class, invokestatic:IllegalStateException(\ud217\u3504\u760c\uc29a\u97e6\ube23::\u8640\u36d3\ua3b4\u4ab3\uc238\u839e, initobject:IllegalStateException(IllegalStateException::<init>, loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(-31613), ldc:int(-31596)))))))
    }
    
    private void \u3c25\u8258\ubf56\ua6bd\u873d\ub113(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_4_78 : \u8aa5\ubded\ub18d\u4f4a\u4f52
        
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
            var_4_78 = invokevirtual:\u8aa5\ubded\ub18d\u4f4a\u4f52(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8bb0\u7006\u965f\u8709\u74b1\u72f1, p0:\u7d52\u718f\u3776\u6fb0\ub83f), getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u8308\u3bc9\u3711\uc246\ud4fe\ub171, p0:\u7d52\u718f\u3776\u6fb0\ub83f), getstatic:\ucb79\u7ce1\ubded\u3d64\ub171(\ucb79\u7ce1\ubded\u3d64\ub171::\u6b0d\u5fe1\ua068\u946b\u9255\ua068), and:int[expected:boolean](ldc:int(4969), ldc:int(-16234)))
            
            if (instanceof:boolean(\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e.class, var_4_78:\u8aa5\ubded\ub18d\u4f4a\u4f52)) {
                invokevirtual:void(\ud523\u92ff\ubb2b\u759a\ud36e::\u8413\u759a\ub19c\ubb2b\ubcb0\u6bb9, checkcast:\ud523\u92ff\ubb2b\u759a\ud36e(\u5d20\u97b7\u8753\u873d\u16f6.\ud523\u92ff\ubb2b\u759a\ud36e.class, var_4_78:\ud523\u92ff\ubb2b\u759a\ud36e[expected:\u8aa5\ubded\ub18d\u4f4a\u4f52]), p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4c04\u8258\u5d20\u97e6\ud158\u600f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
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
            invokevirtual:void(\ua3b4\u8aa5\ub113\ubf56\u873d::\u760c\ud12e\u3d64\u6bb9\u67d0\u0c95, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])
            invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\uc87f\ub1b9\u98a4\u71f1\u7c6b\uae87, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
            invokevirtual:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u8753\u5db4\ufe34\u071d\u8640\u759a, this:\ube23\uc238\u5140\u4cd9\u8aa5)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u392e\u8d98\u156b\ufe34\u51b2\u8640(int p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, int p2) {
        var_4_63 : int
        var_6_74 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_7_BC : \u51fa\u6c52\u7330\u7330\u960f
        var_8_FD : double
        var_10_10A : double
        var_12_117 : double
        
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
            var_4_63 = and:int(ldc:int(-1921461447), ldc:int(-472877633))
            var_6_74 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(List<\u51fa\u6c52\u7330\u7330\u960f>::iterator, invokevirtual:List<\u51fa\u6c52\u7330\u7330\u960f>(\ucb79\u8350\u7bad\u392e\u51fa::\u7330\u40a9\u5654\u3d4b\ua6bd\ua562, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5))))
            
            loop {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1715037038))
                }
                else {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-865053377))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_6_74:Iterator<\u51fa\u6c52\u7330\u7330\u960f>)) {
                        var_7_BC = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_6_74:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                        
                        if (cmpne:boolean(var_7_BC:\u51fa\u6c52\u7330\u7330\u960f, aconstnull:\u51fa\u6c52\u7330\u7330\u960f())) {
                            if (cmpeq:boolean(getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u51fa\u6c52\u7330\u7330\u960f::\u12cb\ubf56\u647c\u7330\u446c\u836c, var_7_BC:\u51fa\u6c52\u7330\u7330\u960f), this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])) {
                                if (cmpne:boolean(invokevirtual:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uc84e\u2dcc\u873d\u8389\ufcaf, var_7_BC:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), p0:int)) {
                                    var_8_FD = sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, var_7_BC:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
                                    var_10_10A = sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, var_7_BC:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
                                    var_12_117 = sub:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, var_7_BC:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))
                                    
                                    if (cmplt:boolean(add:double(add:double(mul:double(var_8_FD:double, var_8_FD:double), mul:double(var_10_10A:double, var_10_10A:double)), mul:double(var_12_117:double, var_12_117:double)), ldc:double(1024.0))) {
                                        invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_7_BC:\u51fa\u6c52\u7330\u7330\u960f), initobject:\u4179\u960f\ucb79\uc229\ucb79[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u4179\u960f\ucb79\uc229\ucb79::<init>, p0:int, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:int))
                                    }
                                }
                            }
                        }
                        
                        var_4_63 = and:int(var_4_63:int, ldc:int(-447481669))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u34df\u0c95\u8c8a\u3d64\ufcaf\ud36e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, double p1, double p2, double p3, \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 p4, \u36d3\u9033\u6b0d\u983f\u8d90.\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8 p5, float p6, float p7) {
        var_12_63 : int
        stack_B2_0 : \ucb79\u8350\u7bad\u392e\u51fa [generated]
        stack_B2_8 : double [generated]
        
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
            var_12_63 = and:int(ldc:int(1327646531), ldc:int(175095356))
            stack_B2_0 = invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5))
            
            if (cmple:boolean(p6:float, ldc:float(1.0f))) {
                var_12_63 = and:int(var_12_63:int, ldc:int(-872728862))
                stack_B2_8 = ldc:double(16.0)
            }
            else {
                stack_B2_8 = f2d:double(mul:float(ldc:float(16.0f), p6:float))
            }
            
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u9255\u1833\u927d\ud523\u5245\ud171, stack_B2_0:\ucb79\u8350\u7bad\u392e\u51fa, p0:\ua3b4\u8aa5\ub113\ubf56\u873d, p1:double, p2:double, p3:double, stack_B2_8:double, invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), initobject:\u759a\u3504\u6b0d\u5245\ucb79[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u759a\u3504\u6b0d\u5245\ucb79::<init>, p4:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937, p5:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8, p1:double, p2:double, p3:double, p6:float, p7:float))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8308\u67e9\u965f\uc7fe\u9255\u51fa(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1, \u927d\u92ff\u71ae\uafe7\u6bb9.\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937 p2, \u36d3\u9033\u6b0d\u983f\u8d90.\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8 p3, float p4, float p5) {
        var_7_63 : int
        stack_B4_0 : \ucb79\u8350\u7bad\u392e\u51fa [generated]
        expr_6E : double [generated]
        expr_72 : double [generated]
        expr_76 : double [generated]
        stack_B4_8 : double [generated]
        
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
            var_7_63 = and:int(ldc:int(-1129271865), ldc:int(1992179535))
            stack_B4_0 = invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5))
            expr_6E = invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
            expr_72 = invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
            expr_76 = invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
            
            if (cmple:boolean(p4:float, ldc:float(1.0f))) {
                var_7_63 = and:int(var_7_63:int, ldc:int(-63443977))
                stack_B4_8 = ldc:double(16.0)
            }
            else {
                stack_B4_8 = f2d:double(mul:float(ldc:float(16.0f), p4:float))
            }
            
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u9255\u1833\u927d\ud523\u5245\ud171, stack_B4_0:\ucb79\u8350\u7bad\u392e\u51fa, p0:\ua3b4\u8aa5\ub113\ubf56\u873d, expr_6E:double, expr_72:double, expr_76:double, stack_B4_8:double, invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), initobject:\uf9c5\u71ae\u647c\u8df4\ub32d[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\uf9c5\u71ae\u647c\u8df4\ub32d::<init>, p2:\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937, p3:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8, p1:\u7d52\u718f\u3776\u6fb0\ub83f, p4:float, p5:float))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u64ab\ub1b9\u12b2\ub6ab\u718f\u51b2(int p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, int p2) {
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
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\uafe7\u8389\u76bc\u4975\ucb79\u3c25, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5)), initobject:\u6ec6\u59ec\u0c95\u0b8e\u3dd3[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u6ec6\u59ec\u0c95\u0b8e\u3dd3::<init>, p0:int, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:int, and:int[expected:boolean](ldc:int(2049), ldc:int(809))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4f4a\u76bc\ub6ab\u5654\uc4d2\ub7dc(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, int p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2, int p3) {
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
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u9255\u1833\u927d\ud523\u5245\ud171, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5)), p0:\ua3b4\u8aa5\ub113\ubf56\u873d, i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(64.0), invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), initobject:\u6ec6\u59ec\u0c95\u0b8e\u3dd3[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u6ec6\u59ec\u0c95\u0b8e\u3dd3::<init>, p1:int, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p3:int, and:int[expected:boolean](ldc:int(-32564), ldc:int(11056))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u92ee\uceb8\u2dcc\u51b2\u5245\u34df(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2, int p3) {
        var_5_D5 : int
        var_9_A0 : Iterator<\uae5d\u9033\u8c8a\u5db4\u0800\u9af2>
        var_10_C5 : \uae5d\u9033\u8c8a\u5db4\u0800\u9af2
        
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
            var_5_D5 = and:int(ldc:int(-966741565), ldc:int(2069662151))
            invokevirtual:void(\u69d9\u759a\u64ab\ua3b4\u6b0d::\ufe34\ua068\u3dd3\u8640\u34df\u7ce1, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            
            if (invokestatic:boolean(\u4c04\uc9f6\u62da\u0c95\u6b0d\ub83f::\u8c8a\u385b\u51b2\u67d0\u62da\u99f7, invokevirtual:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\uc87f\uf94d\ucb79\u120d\u836c\ubb2b, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), invokevirtual:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\uc87f\uf94d\ucb79\u120d\u836c\ubb2b, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u718f\u6435\uc31c\u4ab3\u98a4], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), getstatic:\u8413\u839e\u839e\u8308\uc246\ubefe(\u8413\u839e\u839e\u8308\uc246\ubefe::\ub102\u5bc4\u12b2\u9a18\u76bc\uc910))) {
                var_9_A0 = invokeinterface:Iterator<\uae5d\u9033\u8c8a\u5db4\u0800\u9af2>(Set<\uae5d\u9033\u8c8a\u5db4\u0800\u9af2>::iterator, getfield:Set<\uae5d\u9033\u8c8a\u5db4\u0800\u9af2>(\ube23\uc238\u5140\u4cd9\u8aa5::\ud158\uf94d\uae87\u56bd\uf995\u92ff, this:\ube23\uc238\u5140\u4cd9\u8aa5))
                
                loop {
                    var_5_D5 = and:int(var_5_D5:int, ldc:int(1407612294))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_9_A0:Iterator<\uae5d\u9033\u8c8a\u5db4\u0800\u9af2>))) {
                        looporswitchbreak()
                    }
                    
                    var_10_C5 = checkcast:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(\u927d\u92ff\u71ae\uafe7\u6bb9.\uae5d\u9033\u8c8a\u5db4\u0800\u9af2.class, invokeinterface:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2(Iterator<\uae5d\u9033\u8c8a\u5db4\u0800\u9af2>::next, var_9_A0:Iterator<\uae5d\u9033\u8c8a\u5db4\u0800\u9af2>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\u6b5f\u76bc\u494c\uc2e8\u4daf\u156b, var_10_C5:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2))) {
                        invokevirtual:void(\uae5d\u9033\u8c8a\u5db4\u0800\u9af2::\ubcb0\u624e\u946b\u6c52\u9255\u120d, var_10_C5:\uae5d\u9033\u8c8a\u5db4\u0800\u9af2, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
                    }
                    
                    var_5_D5 = and:int(var_5_D5:int, ldc:int(1801077667))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ua3b4\ub8be\uf995\u8bb0\u64f2\uc246(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, byte p1) {
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
            invokevirtual:void(\u69d9\u759a\u64ab\ua3b4\u6b0d::\ud217\u7330\ua068\u760c\ub6ab\u2dcc, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:\u7d52\u718f\u3776\u6fb0\ub83f, initobject:\u8640\u3bd6\uafe7\u3d64\u52d3[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u8640\u3bd6\uafe7\u3d64\u52d3::<init>, p0:\u7d52\u718f\u3776\u6fb0\ub83f, p1:byte))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u69d9\u759a\u64ab\ua3b4\u6b0d \u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1() {
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
            return:\u69d9\u759a\u64ab\ua3b4\u6b0d(getfield:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u3e2a\u9a18\u64ab\ucef1\ua61f\u92ff, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79 \ubcb0\u416d\u8aa5\u5bc4\u7d52\ucfaf(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u64f2\u718f\ub6ab\u9033\u8d90\u9033 p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\uf9c5\u16f6\ub102\u3c25\u4c2b p2, double p3, double p4, double p5, float p6, boolean p7, \ud36e\u6bb9\u960f\u4c04\u64ab.\u5245\u8d90\ufcaf\u494c\u9937 p8) {
        var_13_63 : int
        var_15_7C : \u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79
        var_13_9D : int
        var_16_A8 : Iterator<\u51fa\u6c52\u7330\u7330\u960f>
        var_17_E0 : \u51fa\u6c52\u7330\u7330\u960f
        
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
            var_13_63 = and:int(ldc:int(-54904824), ldc:int(-319713138))
            var_15_7C = initobject:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79(\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79::<init>, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p0:\u7d52\u718f\u3776\u6fb0\ub83f, p1:\u64f2\u718f\ub6ab\u9033\u8d90\u9033, p2:\uf9c5\u16f6\ub102\u3c25\u4c2b, p3:double, p4:double, p5:double, p6:float, p7:boolean, p8:\u5245\u8d90\ufcaf\u494c\u9937)
            invokevirtual:void(\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79::\u69d9\u74b1\u7043\u6b5f\u120d\ud217, var_15_7C:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79)
            invokevirtual:void(\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79::\ucb79\u8cae\u7c6b\u6d99\uc84e\u56bd, var_15_7C:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79, and:int[expected:boolean](ldc:int(-3792), ldc:int(2764)))
            
            if (cmpeq:boolean(p8:\u5245\u8d90\ufcaf\u494c\u9937, getstatic:\u5245\u8d90\ufcaf\u494c\u9937(\u5245\u8d90\ufcaf\u494c\u9937::\u2dcc\u47c2\ud7e8\ud523\u527a\u6435))) {
                invokevirtual:void(\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79::\u47c2\u9937\u7043\u69d9\u8d90\u7ce1, var_15_7C:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79)
            }
            
            var_13_9D = and:int(var_13_63:int, ldc:int(-302359345))
            var_16_A8 = invokeinterface:Iterator<\u51fa\u6c52\u7330\u7330\u960f>(List<\u51fa\u6c52\u7330\u7330\u960f>::iterator, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\u4d85\u3776\u5140\u6fb0\u6ec6\uceb8, this:\ube23\uc238\u5140\u4cd9\u8aa5))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_16_A8:Iterator<\u51fa\u6c52\u7330\u7330\u960f>)) {
                var_17_E0 = checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(Iterator<\u51fa\u6c52\u7330\u7330\u960f>::next, var_16_A8:Iterator<\u51fa\u6c52\u7330\u7330\u960f>))
                
                if (cmplt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, var_17_E0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p3:double, p4:double, p5:double), ldc:double(4096.0))) {
                    invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, var_17_E0:\u51fa\u6c52\u7330\u7330\u960f), initobject:\u624e\u6b5f\u3776\u8350\u8cae(\u624e\u6b5f\u3776\u8350\u8cae::<init>, p3:double, p4:double, p5:double, p6:float, invokevirtual:List<\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56>(\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79::\u1833\u62da\u836c\u5f50\u873d\u16f6, var_15_7C:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79), checkcast:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8.class, invokeinterface:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(Map<\ua3b4\u8aa5\ub113\ubf56\u873d, \u3a62\u5d20\u4f52\uc229\u8308\ud7e8>::get, invokevirtual:Map<\ua3b4\u8aa5\ub113\ubf56\u873d, \u3a62\u5d20\u4f52\uc229\u8308\ud7e8>(\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79::\uc87f\ud4fe\uc87f\u8258\u6c56\ubf56, var_15_7C:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79), var_17_E0:\u51fa\u6c52\u7330\u7330\u960f[expected:Object]))))
                }
                
                var_13_9D = and:int(var_13_9D:int, ldc:int(-270336125))
            }
            
            return:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79(var_15_7C:\u74b1\u72f1\u12b2\u6b0d\ubefe\ucb79)
        }
        
        goto(Label_0006)
    }
    
    public void \u1187\u3e75\u183a\u7e3f\ub113\u836c(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p1, int p2, int p3) {
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
            invokevirtual:boolean(ObjectLinkedOpenHashSet::add, getfield:ObjectLinkedOpenHashSet<\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8>(\ube23\uc238\u5140\u4cd9\u8aa5::\u3711\uc87f\u71ae\u76bc\u3711\uc84e, this:\ube23\uc238\u5140\u4cd9\u8aa5), initobject:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8[expected:Object](\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8::<init>, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, p2:int, p3:int))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6b5f\uff55\uc910\u4179\u7d52\u6c56() {
        var_1_61 : int
        var_3_97 : \u6198\u93a2\uc2bd\u4daf\ua068\ud7e8
        
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
            var_1_61 = and:int(ldc:int(1577660878), ldc:int(-547512834))
            
            loop {
                if (cmpne:boolean(and:int(var_1_61:int, ldc:int(2)), ldc:int(0))) {
                    var_1_61 = and:int(var_1_61:int, ldc:int(1562755019))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(ObjectLinkedOpenHashSet::isEmpty, getfield:ObjectLinkedOpenHashSet<\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8>(\ube23\uc238\u5140\u4cd9\u8aa5::\u3711\uc87f\u71ae\u76bc\u3711\uc84e, this:\ube23\uc238\u5140\u4cd9\u8aa5)))) {
                        var_3_97 = checkcast:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8.class, invokevirtual:Object[expected:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8](ObjectLinkedOpenHashSet::removeFirst, getfield:ObjectLinkedOpenHashSet<\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8>(\ube23\uc238\u5140\u4cd9\u8aa5::\u3711\uc87f\u71ae\u76bc\u3711\uc84e, this:\ube23\uc238\u5140\u4cd9\u8aa5)))
                        
                        if (invokespecial:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u600f\u4f52\u647c\u97e6\u92ff\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5, var_3_97:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8)) {
                            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\u9255\u1833\u927d\ud523\u5245\ud171, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5)), checkcast:\ua3b4\u8aa5\ub113\ubf56\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, aconstnull:\ua3b4\u8aa5\ub113\ubf56\u873d()), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8::\u946b\u92ff\u6198\u6b5f\u4bc8\u6cfe, var_3_97:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8))), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8::\u946b\u92ff\u6198\u6b5f\u4bc8\u6cfe, var_3_97:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8))), i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8::\u946b\u92ff\u6198\u6b5f\u4bc8\u6cfe, var_3_97:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8))), ldc:double(64.0), invokevirtual:\u64f2\ub8be\u760c\u5245\u6c52\u7af6<\uf9c5\ud158\u4975\uf94d\ud523\uc31c>(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u7049\u64f2\uc9f6\u92ee\ud158\uc87f, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), initobject:\ua61f\u56bd\ub113\u4daf\ud12e(\ua61f\u56bd\ub113\u4daf\ud12e::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8::\u946b\u92ff\u6198\u6b5f\u4bc8\u6cfe, var_3_97:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8), invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8::\ud171\ub70c\u7c6b\u6435\u3776\u600f, var_3_97:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8), invokevirtual:int(\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8::\u67d0\u4c04\u527a\uc3e3\ub113\u92ee, var_3_97:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8), invokevirtual:int(\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8::\u120d\ubefe\u7af6\uc2e8\ud36e\ubb2b, var_3_97:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8)))
                        }
                        
                        var_1_61 = and:int(var_1_61:int, ldc:int(-1099326065))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_61:int, ldc:int(16)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \u600f\u4f52\u647c\u97e6\u92ff\u5fe1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8 p0) {
        var_2_61 : int
        var_4_6A : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        stack_A4_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(2014349726), ldc:int(1442629084))
            var_4_6A = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8::\u946b\u92ff\u6198\u6b5f\u4bc8\u6cfe, p0:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u8d90\u3e2a\ua61f\ua61f\ud51e\u0b8e, var_4_6A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8::\ud171\ub70c\u7c6b\u6435\u3776\u600f, p0:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8)))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1494343614))
                stack_A4_0 = and:int(ldc:int(-8060), ldc:int(7032))
            }
            else {
                stack_A4_0 = invokevirtual:boolean[expected:int](\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\ucb79\uc2bd\u6c52\ub32d\u9255\ubf56, var_4_6A:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e], this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8::\u946b\u92ff\u6198\u6b5f\u4bc8\u6cfe, p0:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8), invokevirtual:int(\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8::\u67d0\u4c04\u527a\uc3e3\ub113\u92ee, p0:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8), invokevirtual:int(\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8::\u120d\ubefe\u7af6\uc2e8\ud36e\ubb2b, p0:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8))
            }
            
            return:boolean(stack_A4_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u6435\ub8be\u718f\u6b0d\u67e9.\u4f4a\u92ff\u5bc4\u3776\u4c04<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> \u8413\uff55\ub8be\u385b\u92ee\u7330() {
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
            return:\u4f4a\u92ff\u5bc4\u3776\u4c04<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(getfield:\u4f4a\u92ff\u5bc4\u3776\u4c04<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ube23\uc238\u5140\u4cd9\u8aa5::\u67e9\u839e\u4bc8\u40a9\u8753\u416d, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    public \u6435\ub8be\u718f\u6b0d\u67e9.\u4f4a\u92ff\u5bc4\u3776\u4c04<\u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f> \u8cae\u4f4a\ud217\u8709\u4cd9\ud51e() {
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
            return:\u4f4a\u92ff\u5bc4\u3776\u4c04<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(getfield:\u4f4a\u92ff\u5bc4\u3776\u4c04<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\u759a\ub171\u62da\u8308\uae87\ub32d, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    public \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e \u98a4\uc2bd\u88c5\u51fa\ub32d\u8d90() {
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
            return:\u88c5\ud171\ub113\u6435\ud51e(getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    public \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u5140\u6bb9\ua3b4\ubf56\u6b5f \u4179\u6d99\u836c\u718f\ub32d\ua068() {
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
            return:\u5140\u6bb9\ua3b4\ubf56\u6b5f(getfield:\u5140\u6bb9\ua3b4\ubf56\u6b5f(\ube23\uc238\u5140\u4cd9\u8aa5::\ua6bd\ud36e\ub18d\u0a06\u9033\u92ff, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    public \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1 \ube23\u5bc4\u5140\u16f6\u0800\u416d() {
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
            return:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(invokevirtual:\u0a06\ufe34\u64ab\ub83f\ub18d\u74b1(\u88c5\ud171\ub113\u6435\ud51e::\u12cb\ud7e8\u071d\u5f50\ud158\u9a18, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5)))
        }
        
        goto(Label_0006)
    }
    
    public int \u3776\u392e\u6ec6\ua61f\u97b7\u1187(T extends \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p0, double p1, double p2, double p3, int p4, double p5, double p6, double p7, double p8) {
        var_17_63 : int
        var_19_87 : \u4c2b\u8640\u9af2\u183a\ub18d
        var_20_90 : int
        var_21_99 : int
        
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
            var_17_63 = and:int(ldc:int(582242630), ldc:int(-1017972888))
            var_19_87 = initobject:\u4c2b\u8640\u9af2\u183a\ub18d(\u4c2b\u8640\u9af2\u183a\ub18d::<init>, p0:T extends \u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, and:int[expected:boolean](ldc:int(24081), ldc:int(-24114)), p1:double, p2:double, p3:double, d2f:float(p5:double), d2f:float(p6:double), d2f:float(p7:double), d2f:float(p8:double), p4:int)
            var_20_90 = and:int(ldc:int(-20025), ldc:int(20024))
            var_21_99 = and:int(ldc:int(-11227), ldc:int(11098))
            
            loop {
                if (cmpeq:boolean(and:int(var_17_63:int, ldc:int(32)), ldc:int(0))) {
                    var_17_63 = and:int(var_17_63:int, ldc:int(1189027967))
                    
                    if (cmplt:boolean(var_21_99:int, invokeinterface:int(List<E>::size, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\u4d85\u3776\u5140\u6fb0\u6ec6\uceb8, this:\ube23\uc238\u5140\u4cd9\u8aa5)))) {
                        if (invokespecial:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\uc9f6\ucef1\uc7fe\u946b\u8d90\u34df, this:\ube23\uc238\u5140\u4cd9\u8aa5, checkcast:\u51fa\u6c52\u7330\u7330\u960f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f.class, invokeinterface:\u51fa\u6c52\u7330\u7330\u960f(List<\u51fa\u6c52\u7330\u7330\u960f>::get, getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\u4d85\u3776\u5140\u6fb0\u6ec6\uceb8, this:\ube23\uc238\u5140\u4cd9\u8aa5), var_21_99:int)), and:int[expected:boolean](ldc:int(-22790), ldc:int(22789)), p1:double, p2:double, p3:double, var_19_87:\u4c2b\u8640\u9af2\u183a\ub18d[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>])) {
                            inc:int(var_20_90, ldc:int(1))
                        }
                        
                        var_17_63 = and:int(var_17_63:int, ldc:int(-1559038528))
                        inc:int(var_21_99, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_17_63:int, ldc:int(512)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:int(var_20_90:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3776\u392e\u6ec6\ua61f\u97b7\u1187(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0, T extends \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a p1, boolean p2, double p3, double p4, double p5, int p6, double p7, double p8, double p9, double p10) {
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
            return:boolean(invokespecial:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\uc9f6\ucef1\uc7fe\u946b\u8d90\u34df, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u51fa\u6c52\u7330\u7330\u960f, p2:boolean, p3:double, p4:double, p5:double, initobject:\u4c2b\u8640\u9af2\u183a\ub18d[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u4c2b\u8640\u9af2\u183a\ub18d::<init>, p1:T extends \u8df4\u97e6\u93a2\u760c\u6fb0\u8c8a, p2:boolean, p3:double, p4:double, p5:double, d2f:float(p7:double), d2f:float(p8:double), d2f:float(p9:double), d2f:float(p10:double), p6:int)))
        }
        
        goto(Label_0006)
    }
    
    private boolean \uc9f6\ucef1\uc7fe\u946b\u8d90\u34df(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0, boolean p1, double p2, double p3, double p4, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u946b\u6d99\u8df4\u12cb\u5d20<?> p5) {
        var_10_63 : int
        var_10_73 : int
        stack_B9_0 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 [generated]
        expr_7D : \u3a62\u5d20\u4f52\uc229\u8308\ud7e8 [generated]
        stack_B9_2 : double [generated]
        
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
        var_10_63 = and:int(ldc:int(1656913104), ldc:int(1993243094))
        
        if (cmpne:boolean(invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u51fa\u6c52\u7330\u7330\u960f::\u120d\u3d4b\u3a62\u965f\ua6bd\ubcb0, p0:\u51fa\u6c52\u7330\u7330\u960f), this:\ube23\uc238\u5140\u4cd9\u8aa5)) {
            return:boolean(and:int[expected:boolean](ldc:int(8738), ldc:int(-8739)))
        }
        
        var_10_73 = and:int(var_10_63:int, ldc:int(-153125429))
        stack_B9_0 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
        expr_7D = initobject:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::<init>, p2:double, p3:double, p4:double)
        
        if (logicalnot:boolean(p1:boolean)) {
            var_10_73 = and:int(var_10_73:int, ldc:int(-287113731))
            stack_B9_2 = ldc:double(32.0)
        }
        else {
            stack_B9_2 = ldc:double(512.0)
        }
        
        if (logicalnot:boolean(invokevirtual:boolean(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u92ee\ua3b4\u3c25\u7330\u3711\uc2e8, stack_B9_0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df], expr_7D:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8[expected:\u071d\u69d9\u3bc9\u983f\u3c25\u64ab], stack_B9_2:double))) {
            return:boolean(and:int[expected:boolean](ldc:int(-7553), ldc:int(7552)))
        }
        
        invokevirtual:void(\u0a06\ub83f\u34df\u7873\u5bc4::\u3dd3\u6c52\u7e3f\u6d99\ud4fe\u8258, getfield:\u0a06\ub83f\u34df\u7873\u5bc4(\u51fa\u6c52\u7330\u7330\u960f::\ud4fe\u760c\uc910\ubefe\u69d9\ub1b9, p0:\u51fa\u6c52\u7330\u7330\u960f), p5:\u946b\u6d99\u8df4\u12cb\u5d20<?>)
        return:boolean(xor:int[expected:boolean](ldc:int(2098), ldc:int(2099)))
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f \u5f50\uc910\u5140\u7330\u8709\uc2bd(int p0) {
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
            return:\u7d52\u718f\u3776\u6fb0\ub83f(checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:Object[expected:\u7d52\u718f\u3776\u6fb0\ub83f](Int2ObjectMap::get, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\uc2e8\u69d9\ud36e\u647c\ub83f\u6ec6, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:int)))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f \u3d64\u4daf\ud36e\u8d98\u927d\u6ec6(java.util.UUID p0) {
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
            return:\u7d52\u718f\u3776\u6fb0\ub83f(checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Map<UUID, \u7d52\u718f\u3776\u6fb0\ub83f>::get, getfield:Map<UUID, \u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\ub6ab\u759a\uceb8\u071d\uc2e8\u0800, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:UUID[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u40a9\u16f6\u927d\u6cfe\ub18d\u6b0d(\u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, int p2, boolean p3) {
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
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(ternaryop:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\ua6bd\u8258\u0b8e\ua61f\uc31c\ud51e, invokeinterface:\u7043\u40a9\u4975\u0800\u385b(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\ub32d\u446c\uf9c5\u3504\u4c04\u7ce1, invokevirtual:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5)))), invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ufcaf\u97e6\u34df\u5245\u927d\ubcb0::\ua562\u98a4\u836c\ud4fe\ubff1\ud4fe, invokevirtual:\ufcaf\u97e6\u34df\u5245\u927d\ubcb0(\u69d9\u759a\u64ab\ua3b4\u6b0d::\uf995\uc2e8\ua6bd\u7e3f\u4179\u61a4, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5)), this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u5654\u9937\u72f1\ud4fe\u0c95<?>, p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p2:int, p3:boolean), aconstnull:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56()))
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u8d98\u5fe1\u7ce1\uc2bd\u3bc9\uc2bd(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1, int p2, int p3) {
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
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u8350\u76bc\u67e9\uff55\u8bb0\u385b \u516c\uafe7\u8df4\u92ff\ub32d\u9937() {
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
            return:\u8350\u76bc\u67e9\uff55\u8bb0\u385b(invokevirtual:\u8350\u76bc\u67e9\uff55\u8bb0\u385b(\u88c5\ud171\ub113\u6435\ud51e::\uc229\u6c56\u5fe1\u3e75\u67d0\u516c, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5)))
        }
        
        goto(Label_0006)
    }
    
    public \u59ec\u8413\u97e6\uc229\u3776.\u88c5\uc2bd\u1833\u960f\u5db4\u4d85 \u6b5f\u8709\u36d3\ubb2b\ua3b4\ud36e() {
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
            return:\u88c5\uc2bd\u1833\u960f\u5db4\u4d85(invokevirtual:\u88c5\uc2bd\u1833\u960f\u5db4\u4d85(\u88c5\ud171\ub113\u6435\ud51e::\u3e2a\u6d99\u92ee\ua3b4\u4c04\u7e3f, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \ucb79\ub83f\ubded\u97b7\u3d64\ub8be() {
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
            return:boolean(getfield:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\uc29a\u61a4\u64f2\u88c5\u516c\u5db4, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f \u4bc8\ubff1\u76bc\u718f\uc238\u6d69() {
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
            return:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f(invokevirtual:\u3bd6\u527a\uc2bd\u8cae\u7330\ua61f(\u88c5\ud171\ub113\u6435\ud51e::\u64ab\u3711\ub1b9\u3e75\u0800\u7bad, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5)))
        }
        
        goto(Label_0006)
    }
    
    public \u5245\u8aa5\u61a4\u7049\u4cd9.\ub1b9\u4f52\ubff1\u8709\u36d3\ub113 \u4c2b\u40a9\u88c5\uc84e\u600f\ubded() {
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
            return:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113(invokevirtual:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113(\u69d9\u759a\u64ab\ua3b4\u6b0d::\u3d64\uc246\uc229\u120d\u5140\uc87f, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5)))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7c6b\u839e\u5245\u12cb\u7873\ud171 \u9033\u67d0\ud217\u946b\u51fa\u624e(java.lang.String p0) {
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
    
    public void \u760c\u7e3f\u7bad\u16f6\u56bd\u1833(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7c6b\u839e\u5245\u12cb\u7873\ud171 p0) {
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
            invokevirtual:void(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u62da\uc910\u8d90\u760c\u40a9\u67d0, invokevirtual:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113(\ube23\uc238\u5140\u4cd9\u8aa5::\u4c2b\u40a9\u88c5\uc84e\u600f\ubded, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u88c5\ud171\ub113\u6435\ud51e::\u6b0d\uf94d\u47c2\u72f1\u8aa5\uae5d, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u98a4\uc2bd\u88c5\u51fa\ub32d\u8d90, this:\ube23\uc238\u5140\u4cd9\u8aa5))), p0:\u7c6b\u839e\u5245\u12cb\u7873\ud171[expected:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u4bc8\u9033\u4f4a\u3c25\u9af2\u7e3f() {
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
            return:int(invokevirtual:int(\u2dcc\ud51e\u72f1\uc29a\uae87\u5bc4::\u93a2\u6c56\u0800\u51fa\u4975\u4bc8, checkcast:\u2dcc\ud51e\u72f1\uc29a\uae87\u5bc4(\u12b2\u9a18\uc7fe\u4c2b\u6c52.\u2dcc\ud51e\u72f1\uc29a\uae87\u5bc4.class, invokevirtual:\u2dcc\ud51e\u72f1\uc29a\uae87\u5bc4(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\ube23\ud523\u1833\u9af2\ud12e\ua3b4, invokevirtual:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113(\ube23\uc238\u5140\u4cd9\u8aa5::\u4c2b\u40a9\u88c5\uc84e\u600f\ubded, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u88c5\ud171\ub113\u6435\ud51e::\u6b0d\uf94d\u47c2\u72f1\u8aa5\uae5d, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u98a4\uc2bd\u88c5\u51fa\ub32d\u8d90, this:\ube23\uc238\u5140\u4cd9\u8aa5))), invokedynamic:Supplier<\u2dcc\ud51e\u72f1\uc29a\uae87\u5bc4>(get:()Ljava/util/function/Supplier;), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(4231), ldc:int(4255)))))))
        }
        
        goto(Label_0006)
    }
    
    public void \u4492\uc29a\uafe7\u3c25\u8389\u7049(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, float p1) {
        var_5_89 : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        
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
            var_5_89 = initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokeinterface:int(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\uc910\u3d64\u62da\u62da\u7c6b\u8d90, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\ube23\uc238\u5140\u4cd9\u8aa5::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\ube23\uc238\u5140\u4cd9\u8aa5)), and:int(ldc:int(12752), ldc:int(-12761)), invokeinterface:int(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u1187\ub171\ub70c\ufcaf\u69d9\u4d85, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\ube23\uc238\u5140\u4cd9\u8aa5::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\ube23\uc238\u5140\u4cd9\u8aa5))))
            invokeinterface:void(\u7873\u7006\u960f\ua6bd\u839e\u7873::\u647c\u7006\u7006\u69d9\u759a\u718f, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873(\ube23\uc238\u5140\u4cd9\u8aa5::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:float)
            invokevirtual:void(\u69d9\u759a\u64ab\ua3b4\u6b0d::\u527a\ud217\u965f\ub1b9\u1187\u64f2, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5), getstatic:\u7ce1\u3bd6\ud51e\u0800\u3d64<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(\u7ce1\u3bd6\ud51e\u0800\u3d64::\uc31c\ubefe\uae87\ud7e8\ubcb0\u6c56), var_5_89:\u120d\u2dcc\ubff1\uceb8\ube23\u647c, ldc:int(11), getstatic:\u3bc9\u4492\u69d9\ud12e\uc238\u6c56(\u3bc9\u4492\u69d9\ud12e\uc238\u6c56::\u93a2\u4bc8\u5d20\ub32d\u836c\u72f1))
            invokevirtual:void(\u69d9\u759a\u64ab\ua3b4\u6b0d::\uceb8\u156b\uc246\u1187\u92ff\u67e9, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5), getstatic:\u7ce1\u3bd6\ud51e\u0800\u3d64<\u3bc9\u4492\u69d9\ud12e\uc238\u6c56>(\u7ce1\u3bd6\ud51e\u0800\u3d64::\uc31c\ubefe\uae87\ud7e8\ubcb0\u6c56), initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), ldc:int(11), getstatic:\u3bc9\u4492\u69d9\ud12e\uc238\u6c56(\u3bc9\u4492\u69d9\ud12e\uc238\u6c56::\u93a2\u4bc8\u5d20\ub32d\u836c\u72f1))
            invokevirtual:void(\ucb79\u8350\u7bad\u392e\u51fa::\uafe7\u8389\u76bc\u4975\ucb79\u3c25, invokevirtual:\ucb79\u8350\u7bad\u392e\u51fa(\u88c5\ud171\ub113\u6435\ud51e::\uc84e\u8cae\ucb79\u8df4\uae5d\ub83f, invokevirtual:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u98a4\uc2bd\u88c5\u51fa\ub32d\u8d90, this:\ube23\uc238\u5140\u4cd9\u8aa5)), initobject:\ud12e\u4975\u64ab\ubded\u8df4[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\ud12e\u4975\u64ab\ubded\u8df4::<init>, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:float))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u873d\u6435\u5245\ud12e\uae87\u64f2() {
        var_3_84 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
            var_3_84 = initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokeinterface:int(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\uc910\u3d64\u62da\u62da\u7c6b\u8d90, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\ube23\uc238\u5140\u4cd9\u8aa5::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\ube23\uc238\u5140\u4cd9\u8aa5)), invokeinterface:int(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u1833\ub83f\uc29a\u3e2a\u5f50\u3711, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\ube23\uc238\u5140\u4cd9\u8aa5::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\ube23\uc238\u5140\u4cd9\u8aa5)), invokeinterface:int(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\u1187\ub171\ub70c\ufcaf\u69d9\u4d85, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\ube23\uc238\u5140\u4cd9\u8aa5::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\ube23\uc238\u5140\u4cd9\u8aa5)))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u59ec\uc2e8\u0c95\u8d90\uc7fe\u927d, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]), var_3_84:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                var_3_84 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7ce1\uc9f6\u61a4\u0a06\uff55::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u7ce1\uc9f6\u61a4\u0a06\uff55], getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\uceb8\ua3b4\u4975\u4179\uf94d\u6198), initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\u759a\u51fa\ud7e8\ub18d\u40a9\u4daf, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c])), ldc:double(0.0), invokevirtual:double(\u34df\u4492\u71ae\uc238\u7873\uafe7::\uc84e\u6ec6\u56bd\u4c04\u759a\u69d9, invokevirtual:\u34df\u4492\u71ae\uc238\u7873\uafe7(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u40a9\ubded\u6cfe\ub1b9\u6ec6\u7330, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))))
            }
            
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(var_3_84:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
        }
        
        goto(Label_0006)
    }
    
    public float \u600f\uc7fe\u9033\u3e2a\uf995\ucfaf() {
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
            return:float(invokeinterface:float(\u4492\u92ee\u9255\uc29a\u3e75\u7043::\ub18d\u9937\uf995\u7ce1\u983f\u9033, getfield:\u7873\u7006\u960f\ua6bd\u839e\u7873[expected:\u4492\u92ee\u9255\uc29a\u3e75\u7043](\ube23\uc238\u5140\u4cd9\u8aa5::\u527a\u3d64\ud171\u59ec\u836c\u6b0d, this:\ube23\uc238\u5140\u4cd9\u8aa5)))
        }
        
        goto(Label_0006)
    }
    
    public it.unimi.dsi.fastutil.longs.LongSet \uceb8\u8640\u4975\ub18d\ud158\u56bd() {
        var_3_7C : \ua562\u965f\u8350\u16f6\u59ec
        
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
            var_3_7C = checkcast:\ua562\u965f\u8350\u16f6\u59ec(\u5245\u8aa5\u61a4\u7049\u4cd9.\ua562\u965f\u8350\u16f6\u59ec.class, invokevirtual:\ua562\u965f\u8350\u16f6\u59ec(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\u527a\u839e\uc246\u624e\u759a\ua562, invokevirtual:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113(\ube23\uc238\u5140\u4cd9\u8aa5::\u4c2b\u40a9\u88c5\uc84e\u600f\ubded, this:\ube23\uc238\u5140\u4cd9\u8aa5), invokedynamic:Supplier<\ua562\u965f\u8350\u16f6\u59ec>(get:()Ljava/util/function/Supplier;), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(8913), ldc:int(8904)))))
            return:LongSet(ternaryop:Object(cmpeq:boolean(var_3_7C:\ua562\u965f\u8350\u16f6\u59ec, aconstnull:\ua562\u965f\u8350\u16f6\u59ec()), getstatic:LongSets$EmptySet[expected:Object](LongSets::EMPTY_SET), invokestatic:LongSet(LongSets::unmodifiable, invokevirtual:LongSet(\ua562\u965f\u8350\u16f6\u59ec::\u965f\u56bd\u0a06\u7e3f\u40a9\u8df4, var_3_7C:\ua562\u965f\u8350\u16f6\u59ec))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u6d99\ud51e\uc87f\u4d85\u760c\ube23(int p0, int p1, boolean p2) {
        var_4_63 : int
        var_6_7F : \ua562\u965f\u8350\u16f6\u59ec
        var_7_8A : \u120d\u2dcc\ubff1\uceb8\ube23\u647c
        var_8_91 : long
        var_10_AB : boolean
        
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
            var_4_63 = and:int(ldc:int(1008753179), ldc:int(-1615908124))
            var_6_7F = checkcast:\ua562\u965f\u8350\u16f6\u59ec(\u5245\u8aa5\u61a4\u7049\u4cd9.\ua562\u965f\u8350\u16f6\u59ec.class, invokevirtual:\ua562\u965f\u8350\u16f6\u59ec(\ub1b9\u4f52\ubff1\u8709\u36d3\ub113::\ube23\ud523\u1833\u9af2\ud12e\ua3b4, invokevirtual:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113(\ube23\uc238\u5140\u4cd9\u8aa5::\u4c2b\u40a9\u88c5\uc84e\u600f\ubded, this:\ube23\uc238\u5140\u4cd9\u8aa5), invokedynamic:Supplier<\ua562\u965f\u8350\u16f6\u59ec>(get:()Ljava/util/function/Supplier;), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(-32732), ldc:int(-32707)))))
            var_7_8A = initobject:\u120d\u2dcc\ubff1\uceb8\ube23\u647c(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::<init>, p0:int, p1:int)
            var_8_91 = invokevirtual:long(\u120d\u2dcc\ubff1\uceb8\ube23\u647c::\u69d9\uf9c5\u97e6\u873d\u5245\uc7fe, var_7_8A:\u120d\u2dcc\ubff1\uceb8\ube23\u647c)
            
            if (logicalnot:boolean(p2:boolean)) {
                var_4_63 = and:int(var_4_63:int, ldc:int(2116295305))
                var_10_AB = invokeinterface:boolean(LongSet::remove, invokevirtual:LongSet(\ua562\u965f\u8350\u16f6\u59ec::\u965f\u56bd\u0a06\u7e3f\u40a9\u8df4, var_6_7F:\ua562\u965f\u8350\u16f6\u59ec), var_8_91:long)
            }
            else {
                var_10_AB = invokeinterface:boolean(LongSet::add, invokevirtual:LongSet(\ua562\u965f\u8350\u16f6\u59ec::\u965f\u56bd\u0a06\u7e3f\u40a9\u8df4, var_6_7F:\ua562\u965f\u8350\u16f6\u59ec), var_8_91:long)
                
                if (var_10_AB:boolean) {
                    invokevirtual:\ud523\u92ff\ubb2b\u759a\ud36e(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\ub113\u12b2\u3711\uc7fe\u1187\u5f50, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p0:int, p1:int)
                }
            }
            
            invokevirtual:void(\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217::\u3bd6\u8d90\uc910\u92ee\u7d52\u4e72, var_6_7F:\ua562\u965f\u8350\u16f6\u59ec[expected:\uc4d2\u5d20\ud51e\u965f\ucfaf\ud217], var_10_AB:boolean)
            
            if (var_10_AB:boolean) {
                invokevirtual:void(\u69d9\u759a\u64ab\ua3b4\u6b0d::\u61a4\u385b\ub19c\u98a4\ua6bd\u4c04, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5), var_7_8A:\u120d\u2dcc\ubff1\uceb8\ube23\u647c, p2:boolean)
            }
            
            return:boolean(var_10_AB:boolean)
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f> \uc3e3\u7043\u12b2\u56bd\uf94d\u3e2a() {
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
            return:List<\u51fa\u6c52\u7330\u7330\u960f>(getfield:List<\u51fa\u6c52\u7330\u7330\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\u4d85\u3776\u5140\u6fb0\u6ec6\uceb8, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    public void \u8308\u69d9\uc2e8\ub32d\ud51e\u6ec6(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2) {
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
    
    public \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u6c52\u9a18\u3504\u718f\u64f2\u6ec6 \u3e2a\uc4d2\u4d85\ud7e8\u5245\u71f1() {
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
            return:\u6c52\u9a18\u3504\u718f\u64f2\u6ec6(invokevirtual:\u6c52\u9a18\u3504\u718f\u64f2\u6ec6(\u69d9\u759a\u64ab\ua3b4\u6b0d::\ub8be\uae5d\u74b1\u7043\u9033\u8d98, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8413\ub7dc\u873d\u6b0d\u4ab3\u6fb0(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:boolean(invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u8bb0\u69d9\ubf56\u839e\u392e\u92ee, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, xor:int(ldc:int(20), ldc:int(21))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8413\ub7dc\u873d\u6b0d\u4ab3\u6fb0(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ubefe\u8640\u183a\u6ec6\u93a2 p0) {
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
            return:boolean(invokevirtual:boolean(\ube23\uc238\u5140\u4cd9\u8aa5::\u8413\ub7dc\u873d\u6b0d\u4ab3\u6fb0, this:\ube23\uc238\u5140\u4cd9\u8aa5, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\ube23\u392e\uf94d\u5bc4\u183a\u69d9, p0:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u8bb0\u69d9\ubf56\u839e\u392e\u92ee(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, int p1) {
        var_3_61 : int
        var_3_A1 : int
        stack_CC_0 : int [generated]
        
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
        var_3_61 = and:int(ldc:int(-541206269), ldc:int(-643896561))
        
        if (cmple:boolean(p1:int, ldc:int(6))) {
            loop {
                if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(8388608)), ldc:int(0))) {
                    var_3_A1 = and:int(var_3_61:int, ldc:int(1023168358))
                }
                else {
                    var_3_A1 = and:int(var_3_61:int, ldc:int(-336673294))
                    
                    if (cmple:boolean(invokevirtual:int(\ube23\uc238\u5140\u4cd9\u8aa5::\u92ff\u8c8a\u183a\uc9f6\ub18d\u61a4, this:\ube23\uc238\u5140\u4cd9\u8aa5, invokestatic:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2(\u5d20\ubefe\u8640\u183a\u6ec6\u93a2::\uc910\u4975\ub7dc\u8258\u839e\u99f7, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)), p1:int)) {
                        stack_CC_0 = and:int(ldc:int(33), ldc:int(17431))
                        looporswitchbreak()
                    }
                }
                
                if (cmpne:boolean(and:int(var_3_A1:int, ldc:int(2)), ldc:int(0))) {
                    var_3_A1 = and:int(var_3_A1:int, ldc:int(-68231665))
                    stack_CC_0 = and:int(ldc:int(-15504), ldc:int(13455))
                    looporswitchbreak()
                }
                
                var_3_61 = and:int(var_3_A1:int, ldc:int(1932947765))
            }
            
            return:boolean(stack_CC_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(12631), ldc:int(-29016)))
    }
    
    public int \u92ff\u8c8a\u183a\uc9f6\ub18d\u61a4(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ubefe\u8640\u183a\u6ec6\u93a2 p0) {
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
            return:int(invokevirtual:int(\u6c52\u9a18\u3504\u718f\u64f2\u6ec6::\u4cd9\uae5d\u6bb9\u67e9\uc84e\u7873, invokevirtual:\u6c52\u9a18\u3504\u718f\u64f2\u6ec6(\ube23\uc238\u5140\u4cd9\u8aa5::\u3e2a\uc4d2\u4d85\ud7e8\u5245\u71f1, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2))
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\uafe7\ua61f\u4f4a\u9af2\uae5d \u647c\u8413\uceb8\ub18d\u527a\ub19c() {
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
            return:\uafe7\ua61f\u4f4a\u9af2\uae5d(getfield:\uafe7\ua61f\u4f4a\u9af2\uae5d(\ube23\uc238\u5140\u4cd9\u8aa5::\ufcaf\u40a9\u9033\u5bc4\u76bc\uf995, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    public \u8cae\u8bb0\ucef1\u8c8a\u3a62.\ub83f\uc910\u4c2b\u446c\u71ae \u40a9\u9a18\uc246\u6bb9\u839e\u983f(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            return:\ub83f\uc910\u4c2b\u446c\u71ae(invokevirtual:\ub83f\uc910\u4c2b\u446c\u71ae(\uafe7\ua61f\u4f4a\u9af2\uae5d::\u59ec\u7d52\ub83f\u3d4b\u624e\u7043, getfield:\uafe7\ua61f\u4f4a\u9af2\uae5d(\ube23\uc238\u5140\u4cd9\u8aa5::\ufcaf\u40a9\u9033\u5bc4\u76bc\uf995, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, xor:int(ldc:int(8030), ldc:int(15198))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u67e9\u8d98\u8258\u4c2b\u8308\u5f50(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
        var_2_61 : int
        stack_8B_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-898433293), ldc:int(-210571533))
            
            if (cmpeq:boolean(invokevirtual:\ub83f\uc910\u4c2b\u446c\u71ae(\ube23\uc238\u5140\u4cd9\u8aa5::\u40a9\u9a18\uc246\u6bb9\u839e\u983f, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), aconstnull:\ub83f\uc910\u4c2b\u446c\u71ae())) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-629932318))
                stack_8B_0 = and:int(ldc:int(-3386), ldc:int(3385))
            }
            else {
                stack_8B_0 = and:int(ldc:int(20251), ldc:int(129))
            }
            
            return:boolean(stack_8B_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u946b\uc229\ufcaf\u960f\u4c2b\u6ec6(\ud36e\u6bb9\u960f\u4c04\u64ab.\u7ce1\u8753\u946b\u56bd\u385b p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1, \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\uc2e8\u0800\uc2e8\uc29a\u5245 p2) {
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
            invokeinterface:void(\uc2e8\u0800\uc2e8\uc29a\u5245::\ua068\u7873\u71f1\u8d90\u9a18\u47c2, p2:\uc2e8\u0800\uc2e8\uc29a\u5245, p0:\u7ce1\u8753\u946b\u56bd\u385b, p1:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u600f\ud12e\ud4fe\u6c56\u5654\ud7e8(java.nio.file.Path p0) {
        var_4_6F : \uc246\u156b\u7ce1\u3d64\u7873
        var_5_95 : BufferedWriter
        var_6_98 : Throwable
        stack_C8_0 : BufferedWriter [generated]
        stack_C5_0 : String [generated]
        expr_AE : Object[] [generated]
        var_7_D2 : \ub1b9\ub8be\u9af2\ud523\ub113\u71ae
        var_8_E8 : ObjectIterator
        var_9_FE : Object2IntMap$Entry
        stack_143_0 : BufferedWriter [generated]
        stack_140_0 : String [generated]
        expr_114 : Object[] [generated]
        stack_17C_0 : BufferedWriter [generated]
        stack_179_0 : String [generated]
        expr_161 : Object[] [generated]
        stack_1AE_0 : BufferedWriter [generated]
        stack_1AB_0 : String [generated]
        expr_193 : Object[] [generated]
        stack_1DE_0 : BufferedWriter [generated]
        stack_1DB_0 : String [generated]
        expr_1C5 : Object[] [generated]
        stack_20E_0 : BufferedWriter [generated]
        stack_20B_0 : String [generated]
        expr_1F5 : Object[] [generated]
        stack_274_0 : BufferedWriter [generated]
        stack_271_0 : String [generated]
        expr_25B : Object[] [generated]
        var_7_2A9 : Throwable
        var_11_2CE : Throwable
        var_5_30E : \u1833\u88c5\u0b8e\uc9f6\u960f\u839e
        var_6_335 : BufferedWriter
        var_7_338 : Throwable
        var_8_376 : Throwable
        var_13_39B : Throwable
        var_7_3D9 : BufferedWriter
        var_8_3DC : Throwable
        var_9_417 : Throwable
        var_15_43C : Throwable
        var_8_47A : BufferedWriter
        var_9_47D : Throwable
        var_10_4BF : Throwable
        var_17_4E4 : Throwable
        var_9_522 : BufferedWriter
        var_10_525 : Throwable
        var_11_55F : Throwable
        var_19_584 : Throwable
        
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
            var_4_6F = getfield:\uc246\u156b\u7ce1\u3d64\u7873(\u69d9\u759a\u64ab\ua3b4\u6b0d::\u6d69\ub113\u8640\u67d0\u4bc8\u2dcc, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5))
            var_5_95 = invokestatic:BufferedWriter(Files::newBufferedWriter, invokeinterface:Path(Path::resolve, p0:Path, loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(1050), ldc:int(17214)))), newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(-19323), ldc:int(19274))))
            var_6_98 = aconstnull:Throwable()
            
            try {
                stack_C8_0 = var_5_95:BufferedWriter
                stack_C5_0 = loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(315), ldc:int(10267)))
                expr_AE = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-32244), ldc:int(-32243)))
                storeelement:Object(expr_AE:Object[], and:int(ldc:int(-11556), ldc:int(3331)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u1187\u4f52\u983f\uc2e8\u527a::\u8308\u64f2\ub32d\u6d99\u6b0d\ud12e, invokevirtual:\ud171\u5d20\ub171\uc31c\ud36e[expected:\u1187\u4f52\u983f\uc2e8\u527a](\uc246\u156b\u7ce1\u3d64\u7873::\ud7e8\u7d52\u416d\u6b0d\u0a06\u7ce1, var_4_6F:\uc246\u156b\u7ce1\u3d64\u7873))))
                invokevirtual:void(Writer::write, stack_C8_0:BufferedWriter[expected:Writer], invokestatic:String(String::format, stack_C5_0:String, expr_AE:Object[]))
                var_7_D2 = invokevirtual:\ub1b9\ub8be\u9af2\ud523\ub113\u71ae(\u69d9\u759a\u64ab\ua3b4\u6b0d::\u516c\ud217\ub7dc\u7bad\u4f4a\uc87f, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5))
                
                if (cmpne:boolean(var_7_D2:\ub1b9\ub8be\u9af2\ud523\ub113\u71ae, aconstnull:\ub1b9\ub8be\u9af2\ud523\ub113\u71ae())) {
                    var_8_E8 = invokeinterface:ObjectIterator(ObjectSet::iterator, invokeinterface:ObjectSet(Object2IntMap::object2IntEntrySet, invokevirtual:Object2IntMap<\u51b2\u8640\u446c\ufcaf\u2dcc>(\ub1b9\ub8be\u9af2\ud523\ub113\u71ae::\u647c\u5fe1\u600f\u624e\u5d20\u183a, var_7_D2:\ub1b9\ub8be\u9af2\ud523\ub113\u71ae)))
                    
                    while (invokeinterface:boolean(Iterator::hasNext, var_8_E8:ObjectIterator)) {
                        var_9_FE = checkcast:Object2IntMap$Entry(it.unimi.dsi.fastutil.objects.Object2IntMap$Entry.class, invokeinterface:Object2IntMap$Entry(Iterator<Object2IntMap$Entry>::next, var_8_E8:Iterator<Object2IntMap$Entry>))
                        stack_143_0 = var_5_95:BufferedWriter
                        stack_140_0 = loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(4670), ldc:int(8477)))
                        expr_114 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(9350), ldc:int(2642)))
                        storeelement:Object(expr_114:Object[], and:int(ldc:int(-12785), ldc:int(4592)), invokevirtual:String[expected:Object](\u51b2\u8640\u446c\ufcaf\u2dcc::\u6cfe\u6bb9\u4f52\u8aa5\ub18d\u99f7, checkcast:\u51b2\u8640\u446c\ufcaf\u2dcc(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u51b2\u8640\u446c\ufcaf\u2dcc.class, invokeinterface:Object[expected:\u51b2\u8640\u446c\ufcaf\u2dcc](Object2IntMap$Entry::getKey, var_9_FE:Object2IntMap$Entry))))
                        storeelement:Object(expr_114:Object[], and:int(ldc:int(137), ldc:int(9521)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Object2IntMap$Entry::getIntValue, var_9_FE:Object2IntMap$Entry)))
                        invokevirtual:void(Writer::write, stack_143_0:BufferedWriter[expected:Writer], invokestatic:String(String::format, stack_140_0:String, expr_114:Object[]))
                    }
                }
                
                stack_17C_0 = var_5_95:BufferedWriter
                stack_179_0 = loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(8861), ldc:int(16765)))
                expr_161 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(4109), ldc:int(1217)))
                storeelement:Object(expr_161:Object[], and:int(ldc:int(-5736), ldc:int(5734)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(Int2ObjectMap::size, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\uc2e8\u69d9\ud36e\u647c\ub83f\u6ec6, this:\ube23\uc238\u5140\u4cd9\u8aa5))))
                invokevirtual:void(Writer::write, stack_17C_0:BufferedWriter[expected:Writer], invokestatic:String(String::format, stack_179_0:String, expr_161:Object[]))
                stack_1AE_0 = var_5_95:BufferedWriter
                stack_1AB_0 = loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(545), ldc:int(575)))
                expr_193 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(-15856), ldc:int(-15855)))
                storeelement:Object(expr_193:Object[], and:int(ldc:int(-13213), ldc:int(13084)), invokestatic:Integer[expected:Object](Integer::valueOf, invokeinterface:int(List<E>::size, getfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\ube23\uc238\u5140\u4cd9\u8aa5::\u8df4\u718f\u3c25\u36d3\u647c\u836c, this:\ube23\uc238\u5140\u4cd9\u8aa5))))
                invokevirtual:void(Writer::write, stack_1AE_0:BufferedWriter[expected:Writer], invokestatic:String(String::format, stack_1AB_0:String, expr_193:Object[]))
                stack_1DE_0 = var_5_95:BufferedWriter
                stack_1DB_0 = loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(26), ldc:int(5)))
                expr_1C5 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(96), ldc:int(97)))
                storeelement:Object(expr_1C5:Object[], and:int(ldc:int(19064), ldc:int(-19065)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u4f4a\u92ff\u5bc4\u3776\u4c04<T>::\u8c8a\u839e\uc7fe\u36d3\u9033\u16f6, invokevirtual:\u4f4a\u92ff\u5bc4\u3776\u4c04<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\ube23\uc238\u5140\u4cd9\u8aa5::\u8413\uff55\ub8be\u385b\u92ee\u7330, this:\ube23\uc238\u5140\u4cd9\u8aa5))))
                invokevirtual:void(Writer::write, stack_1DE_0:BufferedWriter[expected:Writer], invokestatic:String(String::format, stack_1DB_0:String, expr_1C5:Object[]))
                stack_20E_0 = var_5_95:BufferedWriter
                stack_20B_0 = loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(16384), ldc:int(16416)))
                expr_1F5 = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(4177), ldc:int(4176)))
                storeelement:Object(expr_1F5:Object[], and:int(ldc:int(1641), ldc:int(-5994)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u4f4a\u92ff\u5bc4\u3776\u4c04<T>::\u8c8a\u839e\uc7fe\u36d3\u9033\u16f6, invokevirtual:\u4f4a\u92ff\u5bc4\u3776\u4c04<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>(\ube23\uc238\u5140\u4cd9\u8aa5::\u8cae\u4f4a\ud217\u8709\u4cd9\ud51e, this:\ube23\uc238\u5140\u4cd9\u8aa5))))
                invokevirtual:void(Writer::write, stack_20E_0:BufferedWriter[expected:Writer], invokestatic:String(String::format, stack_20B_0:String, expr_1F5:Object[]))
                invokevirtual:void(Writer::write, var_5_95:BufferedWriter[expected:Writer], invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(33), ldc:int(13877)))), invokevirtual:String(\u1187\u4f52\u983f\uc2e8\u527a::\uf94d\u7049\u156b\u61a4\ub1b9\ub8be, invokevirtual:\ud171\u5d20\ub171\uc31c\ud36e[expected:\u1187\u4f52\u983f\uc2e8\u527a](\uc246\u156b\u7ce1\u3d64\u7873::\ud7e8\u7d52\u416d\u6b0d\u0a06\u7ce1, var_4_6F:\uc246\u156b\u7ce1\u3d64\u7873))), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(-7647), ldc:int(-7677))))))
                stack_274_0 = var_5_95:BufferedWriter
                stack_271_0 = loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(16739), ldc:int(8235)))
                expr_25B = newarray:Object[](java.lang.Object.class, and:int(ldc:int(129), ldc:int(9793)))
                storeelement:Object(expr_25B:Object[], and:int(ldc:int(-25455), ldc:int(25134)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u69d9\u759a\u64ab\ua3b4\u6b0d::\u4975\u4f4a\u4cd9\ub102\u5654\uafe7, invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d(\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5))))
                invokevirtual:void(Writer::write, stack_274_0:BufferedWriter[expected:Writer], invokestatic:String(String::format, stack_271_0:String, expr_25B:Object[]))
            }
            catch (java.lang.Throwable var_7_2A9) {
                var_6_98 = var_7_2A9:Throwable
                athrow(var_7_2A9:Throwable)
            }
            finally {
                if (cmpne:boolean(var_5_95:BufferedWriter, aconstnull:BufferedWriter())) {
                    if (cmpne:boolean(var_6_98:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(Writer::close, var_5_95:BufferedWriter[expected:Writer])
                        }
                        catch (java.lang.Throwable var_11_2CE) {
                            invokevirtual:void(Throwable::addSuppressed, var_6_98:Throwable, var_11_2CE:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(Writer::close, var_5_95:BufferedWriter[expected:Writer])
                    }
                }
            }
            
            var_5_30E = initobject:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::<init>, loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(686), ldc:int(3380))), initobject:Exception[expected:Throwable](Exception::<init>, loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(14373), ldc:int(125)))))
            invokevirtual:\u446c\u67d0\ua562\u97b7\u6c56\u59ec(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u3504\u8413\u5fe1\ub8be\u0b8e\u3e2a, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], var_5_30E:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e)
            var_6_335 = invokestatic:BufferedWriter(Files::newBufferedWriter, invokeinterface:Path(Path::resolve, p0:Path, loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(39), ldc:int(4710)))), newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(13705), ldc:int(-13770))))
            var_7_338 = aconstnull:Throwable()
            
            try {
                invokevirtual:void(Writer::write, var_6_335:BufferedWriter[expected:Writer], invokevirtual:String(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\ubded\uc238\u0b8e\u2dcc\u69d9\u4cd9, var_5_30E:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e))
            }
            catch (java.lang.Throwable var_8_376) {
                var_7_338 = var_8_376:Throwable
                athrow(var_8_376:Throwable)
            }
            finally {
                if (cmpne:boolean(var_6_335:BufferedWriter, aconstnull:BufferedWriter())) {
                    if (cmpne:boolean(var_7_338:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(Writer::close, var_6_335:BufferedWriter[expected:Writer])
                        }
                        catch (java.lang.Throwable var_13_39B) {
                            invokevirtual:void(Throwable::addSuppressed, var_7_338:Throwable, var_13_39B:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(Writer::close, var_6_335:BufferedWriter[expected:Writer])
                    }
                }
            }
            
            var_7_3D9 = invokestatic:BufferedWriter(Files::newBufferedWriter, invokeinterface:Path(Path::resolve, p0:Path, loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(565), ldc:int(530)))), newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(-24727), ldc:int(24722))))
            var_8_3DC = aconstnull:Throwable()
            
            try {
                invokevirtual:void(\uc246\u156b\u7ce1\u3d64\u7873::\ud171\u6435\u92ee\u34df\u8d90\u9255, var_4_6F:\uc246\u156b\u7ce1\u3d64\u7873, var_7_3D9:BufferedWriter[expected:Writer])
            }
            catch (java.lang.Throwable var_9_417) {
                var_8_3DC = var_9_417:Throwable
                athrow(var_9_417:Throwable)
            }
            finally {
                if (cmpne:boolean(var_7_3D9:BufferedWriter, aconstnull:BufferedWriter())) {
                    if (cmpne:boolean(var_8_3DC:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(Writer::close, var_7_3D9:BufferedWriter[expected:Writer])
                        }
                        catch (java.lang.Throwable var_15_43C) {
                            invokevirtual:void(Throwable::addSuppressed, var_8_3DC:Throwable, var_15_43C:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(Writer::close, var_7_3D9:BufferedWriter[expected:Writer])
                    }
                }
            }
            
            var_8_47A = invokestatic:BufferedWriter(Files::newBufferedWriter, invokeinterface:Path(Path::resolve, p0:Path, loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(168), ldc:int(24620)))), newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(3267), ldc:int(-3284))))
            var_9_47D = aconstnull:Throwable()
            
            try {
                invokestatic:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u1187\ub171\u59ec\u12b2\u7c6b\u6198, var_8_47A:BufferedWriter[expected:Writer], invokeinterface:ObjectCollection[expected:Iterable<\u7d52\u718f\u3776\u6fb0\ub83f>](Int2ObjectMap::values, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\uc2e8\u69d9\ud36e\u647c\ub83f\u6ec6, this:\ube23\uc238\u5140\u4cd9\u8aa5)))
            }
            catch (java.lang.Throwable var_10_4BF) {
                var_9_47D = var_10_4BF:Throwable
                athrow(var_10_4BF:Throwable)
            }
            finally {
                if (cmpne:boolean(var_8_47A:BufferedWriter, aconstnull:BufferedWriter())) {
                    if (cmpne:boolean(var_9_47D:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(Writer::close, var_8_47A:BufferedWriter[expected:Writer])
                        }
                        catch (java.lang.Throwable var_17_4E4) {
                            invokevirtual:void(Throwable::addSuppressed, var_9_47D:Throwable, var_17_4E4:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(Writer::close, var_8_47A:BufferedWriter[expected:Writer])
                    }
                }
            }
            
            var_9_522 = invokestatic:BufferedWriter(Files::newBufferedWriter, invokeinterface:Path(Path::resolve, p0:Path, loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(4647), ldc:int(4622)))), newarray:OpenOption[](java.nio.file.OpenOption.class, and:int(ldc:int(-12274), ldc:int(10096))))
            var_10_525 = aconstnull:Throwable()
            
            try {
                invokespecial:void(\ube23\uc238\u5140\u4cd9\u8aa5::\u392e\u8709\u34df\uc246\u34df\u600f, this:\ube23\uc238\u5140\u4cd9\u8aa5, var_9_522:BufferedWriter[expected:Writer])
            }
            catch (java.lang.Throwable var_11_55F) {
                var_10_525 = var_11_55F:Throwable
                athrow(var_11_55F:Throwable)
            }
            finally {
                if (cmpne:boolean(var_9_522:BufferedWriter, aconstnull:BufferedWriter())) {
                    if (cmpne:boolean(var_10_525:Throwable, aconstnull:Throwable())) {
                        try {
                            invokevirtual:void(Writer::close, var_9_522:BufferedWriter[expected:Writer])
                        }
                        catch (java.lang.Throwable var_19_584) {
                            invokevirtual:void(Throwable::addSuppressed, var_10_525:Throwable, var_19_584:Throwable)
                        }
                    }
                    else {
                        invokevirtual:void(Writer::close, var_9_522:BufferedWriter[expected:Writer])
                    }
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void \u1187\ub171\u59ec\u12b2\u7c6b\u6198(java.io.Writer p0, java.lang.Iterable<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> p1) {
        var_2_61 : int
        var_4_D9 : \u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4
        var_5_E1 : Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>
        var_6_121 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_7_128 : ITextComponent
        var_8_12F : ITextComponent
        stack_1C7_0 : \u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4 [generated]
        expr_135 : Object[] [generated]
        stack_1C6_1 : int [generated]
        stack_1C6_2 : Object [generated]
        
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
            var_2_61 = and:int(ldc:int(1487072233), ldc:int(81932236))
            var_4_D9 = invokevirtual:\u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4(\ucef1\u120d\u8df4\u88c5\ube23\ud217::\uff55\u5654\u59ec\u8cae\u8c8a\u8d98, invokevirtual:\ucef1\u120d\u8df4\u88c5\ube23\ud217(\ucef1\u120d\u8df4\u88c5\ube23\ud217::\u98a4\u34df\u446c\u9255\u0800\u1187, invokevirtual:\ucef1\u120d\u8df4\u88c5\ube23\ud217(\ucef1\u120d\u8df4\u88c5\ube23\ud217::\u98a4\u34df\u446c\u9255\u0800\u1187, invokevirtual:\ucef1\u120d\u8df4\u88c5\ube23\ud217(\ucef1\u120d\u8df4\u88c5\ube23\ud217::\u98a4\u34df\u446c\u9255\u0800\u1187, invokevirtual:\ucef1\u120d\u8df4\u88c5\ube23\ud217(\ucef1\u120d\u8df4\u88c5\ube23\ud217::\u98a4\u34df\u446c\u9255\u0800\u1187, invokevirtual:\ucef1\u120d\u8df4\u88c5\ube23\ud217(\ucef1\u120d\u8df4\u88c5\ube23\ud217::\u98a4\u34df\u446c\u9255\u0800\u1187, invokevirtual:\ucef1\u120d\u8df4\u88c5\ube23\ud217(\ucef1\u120d\u8df4\u88c5\ube23\ud217::\u98a4\u34df\u446c\u9255\u0800\u1187, invokevirtual:\ucef1\u120d\u8df4\u88c5\ube23\ud217(\ucef1\u120d\u8df4\u88c5\ube23\ud217::\u98a4\u34df\u446c\u9255\u0800\u1187, invokevirtual:\ucef1\u120d\u8df4\u88c5\ube23\ud217(\ucef1\u120d\u8df4\u88c5\ube23\ud217::\u98a4\u34df\u446c\u9255\u0800\u1187, invokestatic:\ucef1\u120d\u8df4\u88c5\ube23\ud217(\u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4::\u4bc8\u64f2\u120d\u0800\u873d\u156b), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(1180), ldc:int(1206)))), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(8747), ldc:int(6447)))), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(-12211), ldc:int(-12191)))), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(4679), ldc:int(4714)))), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(2316), ldc:int(2338)))), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(2077), ldc:int(2098)))), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(12336), ldc:int(188)))), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(1551), ldc:int(1598)))), p0:Writer)
            var_5_E1 = invokeinterface:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>(Iterable<\u7d52\u718f\u3776\u6fb0\ub83f>::iterator, p1:Iterable<\u7d52\u718f\u3776\u6fb0\ub83f>)
            
            loop {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(375736364))
                }
                else {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-122979336))
                    
                    if (invokeinterface:boolean(Iterator::hasNext, var_5_E1:Iterator)) {
                        var_6_121 = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_5_E1:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>))
                        var_7_128 = invokevirtual:ITextComponent(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uf9c5\uf94d\u64f2\u624e\u7ce1, var_6_121:\u7d52\u718f\u3776\u6fb0\ub83f)
                        var_8_12F = invokevirtual:ITextComponent(\u7d52\u718f\u3776\u6fb0\ub83f::\u8258\u4e72\u40a9\u93a2\u3a62\ud36e, var_6_121:\u7d52\u718f\u3776\u6fb0\ub83f)
                        stack_1C7_0 = var_4_D9:\u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4
                        expr_135 = newarray:Object[](java.lang.Object.class, ldc:int(8))
                        storeelement:Object(expr_135:Object[], and:int(ldc:int(3298), ldc:int(-31983)), invokestatic:Double[expected:Object](Double::valueOf, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, var_6_121:\u7d52\u718f\u3776\u6fb0\ub83f)))
                        storeelement:Object(expr_135:Object[], xor:int(ldc:int(17), ldc:int(16)), invokestatic:Double[expected:Object](Double::valueOf, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, var_6_121:\u7d52\u718f\u3776\u6fb0\ub83f)))
                        storeelement:Object(expr_135:Object[], and:int(ldc:int(1163), ldc:int(12338)), invokestatic:Double[expected:Object](Double::valueOf, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, var_6_121:\u7d52\u718f\u3776\u6fb0\ub83f)))
                        storeelement:Object(expr_135:Object[], and:int(ldc:int(67), ldc:int(16651)), invokevirtual:UUID[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\u40a9\u9255\u7af6\u64f2\u5245\uc7fe, var_6_121:\u7d52\u718f\u3776\u6fb0\ub83f))
                        storeelement:Object(expr_135:Object[], and:int(ldc:int(36), ldc:int(17029)), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u6d69\u64f2\uc2bd\ub6ab\ub7dc\u7873), invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, var_6_121:\u7d52\u718f\u3776\u6fb0\ub83f)))
                        storeelement:Object(expr_135:Object[], xor:int(ldc:int(1074), ldc:int(1079)), invokestatic:Boolean[expected:Object](Boolean::valueOf, invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, var_6_121:\u7d52\u718f\u3776\u6fb0\ub83f)))
                        storeelement:Object(expr_135:Object[], ldc:int(6), invokeinterface:String[expected:Object](ITextComponent::getString, var_8_12F:ITextComponent))
                        stack_1C6_1 = ldc:int(7)
                        
                        if (cmpeq:boolean(var_7_128:ITextComponent, aconstnull:ITextComponent())) {
                            var_2_61 = and:int(var_2_61:int, ldc:int(-1263009945))
                            stack_1C6_2 = aconstnull:Object()
                        }
                        else {
                            stack_1C6_2 = invokeinterface:String[expected:Object](ITextComponent::getString, var_7_128:ITextComponent)
                        }
                        
                        storeelement:Object(expr_135:Object[], stack_1C6_1:int, stack_1C6_2:Object)
                        invokevirtual:void(\u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4::\u8389\u3711\u4f52\u4f4a\u6c56\u1187, stack_1C7_0:\u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4, expr_135:Object[])
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u392e\u8709\u34df\uc246\u34df\u600f(java.io.Writer p0) {
        var_2_61 : int
        var_4_A1 : \u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4
        var_5_AC : Iterator<\ub83f\uc9f6\u47c2\u67d0\u7ce1>
        var_6_D3 : \ub83f\uc9f6\u47c2\u67d0\u7ce1
        var_7_DA : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        stack_12F_0 : \u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4 [generated]
        expr_E5 : Object[] [generated]
        
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
            var_2_61 = and:int(ldc:int(-1928917878), ldc:int(-417924085))
            var_4_A1 = invokevirtual:\u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4(\ucef1\u120d\u8df4\u88c5\ube23\ud217::\uff55\u5654\u59ec\u8cae\u8c8a\u8d98, invokevirtual:\ucef1\u120d\u8df4\u88c5\ube23\ud217(\ucef1\u120d\u8df4\u88c5\ube23\ud217::\u98a4\u34df\u446c\u9255\u0800\u1187, invokevirtual:\ucef1\u120d\u8df4\u88c5\ube23\ud217(\ucef1\u120d\u8df4\u88c5\ube23\ud217::\u98a4\u34df\u446c\u9255\u0800\u1187, invokevirtual:\ucef1\u120d\u8df4\u88c5\ube23\ud217(\ucef1\u120d\u8df4\u88c5\ube23\ud217::\u98a4\u34df\u446c\u9255\u0800\u1187, invokevirtual:\ucef1\u120d\u8df4\u88c5\ube23\ud217(\ucef1\u120d\u8df4\u88c5\ube23\ud217::\u98a4\u34df\u446c\u9255\u0800\u1187, invokestatic:\ucef1\u120d\u8df4\u88c5\ube23\ud217(\u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4::\u4bc8\u64f2\u120d\u0800\u873d\u156b), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(16934), ldc:int(16908)))), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(1323), ldc:int(2283)))), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(18478), ldc:int(8301)))), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(19471), ldc:int(19489)))), p0:Writer)
            var_5_AC = invokeinterface:Iterator<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>::iterator, getfield:List<\ub83f\uc9f6\u47c2\u67d0\u7ce1>(\ube23\uc238\u5140\u4cd9\u8aa5::\u8df4\u718f\u3c25\u36d3\u647c\u836c, this:\ube23\uc238\u5140\u4cd9\u8aa5))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1784783798))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_5_AC:Iterator))) {
                    looporswitchbreak()
                }
                
                var_6_D3 = checkcast:\ub83f\uc9f6\u47c2\u67d0\u7ce1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1.class, invokeinterface:\ub83f\uc9f6\u47c2\u67d0\u7ce1(Iterator<\ub83f\uc9f6\u47c2\u67d0\u7ce1>::next, var_5_AC:Iterator<\ub83f\uc9f6\u47c2\u67d0\u7ce1>))
                var_7_DA = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ucb79\u7873\ub7dc\u7043\u34df\uceb8, var_6_D3:\ub83f\uc9f6\u47c2\u67d0\u7ce1)
                stack_12F_0 = var_4_A1:\u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4
                expr_E5 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(17412), ldc:int(9191)))
                storeelement:Object(expr_E5:Object[], and:int(ldc:int(-6025), ldc:int(5000)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, var_7_DA:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
                storeelement:Object(expr_E5:Object[], and:int(ldc:int(81), ldc:int(14883)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, var_7_DA:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
                storeelement:Object(expr_E5:Object[], xor:int(ldc:int(17449), ldc:int(17451)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, var_7_DA:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])))
                storeelement:Object(expr_E5:Object[], and:int(ldc:int(3), ldc:int(16391)), invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object](\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc229\u8413\ufcaf\u99f7\u494c<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc229\u8413\ufcaf\u99f7\u494c<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u7043\u6c52\u6d99\u4492\ud36e\u0a06), invokevirtual:\uc229\u8413\ufcaf\u99f7\u494c<?>(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u392e\u4179\u759a\u76bc\u8bb0\u36d3, var_6_D3:\ub83f\uc9f6\u47c2\u67d0\u7ce1)))
                invokevirtual:void(\u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4::\u8389\u3711\u4f52\u4f4a\u6c56\u1187, stack_12F_0:\u6cfe\ub8be\u5db4\ub1b9\u416d\u61a4, expr_E5:Object[])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u839e\u6b0d\ubefe\ucef1\u0800\u5f50(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p0) {
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
    
    public void \uc3e3\u8aa5\uc910\ud217\u5db4\uafe7(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p1) {
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
            
            if (logicalnot:boolean(invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u5bc4\u6b5f\ua6bd\u52d3\u36d3\u392e, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c]))) {
                invokevirtual:void(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u51fa\u64ab\ufcaf\u47c2\u960f\u3bc9, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public float \u72f1\u8d90\ud36e\uc9f6\ubff1\ubff1(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p0, boolean p1) {
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
            return:float(ldc:float(1.0f))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Iterable<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> \u92ff\u97b7\ud4fe\u59ec\u965f\u9033() {
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
            return:Iterable<\u7d52\u718f\u3776\u6fb0\ub83f>(invokestatic:Iterable(Iterables::unmodifiableIterable, invokeinterface:ObjectCollection[expected:Iterable](Int2ObjectMap::values, getfield:Int2ObjectMap<\u7d52\u718f\u3776\u6fb0\ub83f>(\ube23\uc238\u5140\u4cd9\u8aa5::\uc2e8\u69d9\ud36e\u647c\ub83f\u6ec6, this:\ube23\uc238\u5140\u4cd9\u8aa5))))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(9394), ldc:int(6450)))), invokeinterface:String(\uc84e\u983f\u0a06\u3d64\u5d20\u4179::\u51b2\u67e9\ua068\u4e72\u4f4a\u1187, getfield:\uc84e\u983f\u0a06\u3d64\u5d20\u4179(\ube23\uc238\u5140\u4cd9\u8aa5::\u76bc\u4492\ud51e\u8350\uf995\u74b1, this:\ube23\uc238\u5140\u4cd9\u8aa5))), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), and:int(ldc:int(563), ldc:int(8251))))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u9033\u92ff\ud171\u416d\u7330\u61a4() {
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
            return:boolean(invokevirtual:boolean(\u7043\u40a9\u4975\u0800\u385b::\u4f52\u927d\u61a4\ub1b9\u3e2a\ud51e, invokeinterface:\u7043\u40a9\u4975\u0800\u385b(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\ub32d\u446c\uf9c5\u3504\u4c04\u7ce1, invokevirtual:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5)))))
        }
        
        goto(Label_0006)
    }
    
    public long \ud12e\ubded\u6b5f\u4cd9\u64ab\ud36e() {
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
            return:long(invokevirtual:long(\u7043\u40a9\u4975\u0800\u385b::\ubf56\u071d\u873d\u4c04\u0800\uc29a, invokeinterface:\u7043\u40a9\u4975\u0800\u385b(\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec::\ub32d\u446c\uf9c5\u3504\u4c04\u7ce1, invokevirtual:\u960f\u76bc\u8c8a\u5654\u4c2b\u59ec(\u88c5\ud171\ub113\u6435\ud51e::\uafe7\u47c2\uff55\ub19c\uc9f6\u61a4, getfield:\u88c5\ud171\ub113\u6435\ud51e(\ube23\uc238\u5140\u4cd9\u8aa5::\u5d20\u5245\u56bd\u36d3\uc31c\u5d20, this:\ube23\uc238\u5140\u4cd9\u8aa5)))))
        }
        
        goto(Label_0006)
    }
    
    public \u3d64\u7af6\uae87\uc238\u7d52.\u4ab3\u839e\u0c95\u4c04\u64ab \u624e\u5140\u8640\ucb79\u3bc9\u6b5f() {
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
            return:\u4ab3\u839e\u0c95\u4c04\u64ab(getfield:\u4ab3\u839e\u0c95\u4c04\u64ab(\ube23\uc238\u5140\u4cd9\u8aa5::\uc2bd\u494c\u1833\uc9f6\u7d52\u9a18, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    public java.util.stream.Stream<? extends \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\uceb8\u34df\u8640\u1187<?>> \u12b2\u7d52\u3dd3\u4cd9\u5bc4\u516c(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5d20\ubefe\u8640\u183a\u6ec6\u93a2 p0, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u5654\u9937\u72f1\ud4fe\u0c95<?> p1) {
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
            return:Stream<? extends \u34df\uceb8\u34df\u8640\u1187<?>>(invokevirtual:Stream<? extends \u34df\uceb8\u34df\u8640\u1187<?>>(\u8753\u4975\ubf56\u6b0d\u7e3f::\u6bb9\u4daf\u88c5\ub1b9\u92ff\u6bb9, invokevirtual:\u8753\u4975\ubf56\u6b0d\u7e3f(\ube23\uc238\u5140\u4cd9\u8aa5::\ud51e\u4d85\u759a\u97b7\u4975\u836c, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:\u5d20\ubefe\u8640\u183a\u6ec6\u93a2, p1:\u5654\u9937\u72f1\ud4fe\u0c95<?>))
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 \u3711\u4492\ub8be\u7330\uc9f6\u8640() {
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
            return:\ube23\uc238\u5140\u4cd9\u8aa5(this:\ube23\uc238\u5140\u4cd9\u8aa5)
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u3bd6\u5245\u4c04\u67e9\u8cae\ua6bd() {
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
    
    private static java.lang.String \u6c56\u5f50\u1833\ua3b4\u36d3\u6c56(java.util.Collection<T> p0, java.util.function.Function<T, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> p1) {
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
    
    public static void \uc4d2\ud4fe\u67e9\u99f7\u392e\u47c2(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0) {
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
    
    public \u392e\ud7e8\u3bc9\u88c5\ud51e.\u7c6b\ud36e\u8d90\u0800\ua6bd \u8df4\ub113\u9937\u4cd9\u4c04\u6d69() {
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
            return:\u7c6b\ud36e\u8d90\u0800\ua6bd(invokevirtual:\u9033\uc2e8\u72f1\u8d98\u6d69[expected:\u7c6b\ud36e\u8d90\u0800\ua6bd](\ube23\uc238\u5140\u4cd9\u8aa5::\u8df4\ub113\u9937\u4cd9\u4c04\u6d69, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    public \u4f52\u6cfe\u9a18\uc29a\u3bd6.\u34df\ua068\u72f1\u527a\u0b8e \u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1() {
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
            return:\u34df\ua068\u72f1\u527a\u0b8e(invokevirtual:\u69d9\u759a\u64ab\ua3b4\u6b0d[expected:\u34df\ua068\u72f1\u527a\u0b8e](\ube23\uc238\u5140\u4cd9\u8aa5::\u97e6\u7043\ub8be\u72f1\ud7e8\u5fe1, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238 \u8cae\u4f4a\ud217\u8709\u4cd9\ud51e() {
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
            return:\u8258\uc238\u7e3f\u36d3\uc238(invokevirtual:\u4f4a\u92ff\u5bc4\u3776\u4c04<\u8cae\ucb79\ud7e8\ub8be\u156b\u960f>[expected:\u8258\uc238\u7e3f\u36d3\uc238](\ube23\uc238\u5140\u4cd9\u8aa5::\u8cae\u4f4a\ud217\u8709\u4cd9\ud51e, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    public \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u8258\uc238\u7e3f\u36d3\uc238 \u8413\uff55\ub8be\u385b\u92ee\u7330() {
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
            return:\u8258\uc238\u7e3f\u36d3\uc238(invokevirtual:\u4f4a\u92ff\u5bc4\u3776\u4c04<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>[expected:\u8258\uc238\u7e3f\u36d3\uc238](\ube23\uc238\u5140\u4cd9\u8aa5::\u8413\uff55\ub8be\u385b\u92ee\u7330, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u61a4\u34df\u3e2a\ub1b9\u4492\u67d0$20(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
            invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u7e3f\ubb2b\ubefe\u9033\uc246\u5db4)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u72f1\u7049\u6b0d\u3bd6\ua3b4\u6b5f$19(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p1) {
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
            invokevirtual:boolean(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc31c\u8709\u5db4\u97b7\u5d20\u9af2, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c], p1:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, getstatic:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u960f\u7043\uf9c5\u4f52\u4cd9\ubefe::\u8d98\u392e\u7006\ud171\u7bad\ua6bd)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u76bc\ud12e\u527a\u8d90\u8df4\ubefe$18(it.unimi.dsi.fastutil.objects.Object2IntMap$Entry p0) {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokeinterface:Object(Object2IntMap$Entry::getKey, p0:Object2IntMap$Entry)), loadelement:String(getstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e), xor:int(ldc:int(44), ldc:int(27)))), invokeinterface:int(Object2IntMap$Entry::getIntValue, p0:Object2IntMap$Entry))))
        }
        
        goto(Label_0006)
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 lambda$\u56bd\u6b0d\u3d64\u624e\uae87\u3504$17(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\ub83f\uc9f6\u47c2\u67d0\u7ce1 p0) {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc229\u8413\ufcaf\u99f7\u494c<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\uc229\u8413\ufcaf\u99f7\u494c<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u7043\u6c52\u6d99\u4492\ud36e\u0a06), invokevirtual:\uc229\u8413\ufcaf\u99f7\u494c<?>(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u392e\u4179\u759a\u76bc\u8bb0\u36d3, p0:\ub83f\uc9f6\u47c2\u67d0\u7ce1)))
        }
        
        goto(Label_0006)
    }
    
    private static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 lambda$\u9a18\u446c\uc246\ud4fe\ub113\u120d$16(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            return:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u6d69\u64f2\uc2bd\ub6ab\ub7dc\u7873), invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p0:\u7d52\u718f\u3776\u6fb0\ub83f)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u7006\u74b1\u759a\uf9c5\u946b\u92ee$15(\u47c2\u2dcc\u12cb\ud171\u8c8a.\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8 p1) {
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
            return:boolean(invokevirtual:boolean(\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6::\uc29a\u4f52\u93a2\u8753\u51b2\u16f6, p0:\ud7e8\u7e3f\u4cd9\u5f50\u6bb9\u6ec6, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8::\u946b\u92ff\u6198\u6b5f\u4bc8\u6cfe, p1:\u6198\u93a2\uc2bd\u4daf\ua068\ud7e8)))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ud7e8\u3776\u8640\u873d\u40a9\u3e2a$14(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \ub113\uc4d2\u183a\u527a\u6435.\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0 p1) {
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
    
    private void lambda$\u5fe1\uc87f\uc246\u99f7\ubefe\ubefe$13(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \ub113\uc4d2\u183a\u527a\u6435.\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0 p1) {
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
            invokevirtual:void(\u6c52\u9a18\u3504\u718f\u64f2\u6ec6::\uc2bd\u97b7\u9033\u759a\ua562\ub102, invokevirtual:\u6c52\u9a18\u3504\u718f\u64f2\u6ec6(\ube23\uc238\u5140\u4cd9\u8aa5::\u3e2a\uc4d2\u4d85\ud7e8\u5245\u71f1, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0)
            invokestatic:void(\u759a\u8df4\u2dcc\u5db4\u0a06::\ub7dc\u1187\u88c5\u5245\u8d90\u7873, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uc238\u839e\u3bc9\u446c\u9af2\uf995$12(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \ub113\uc4d2\u183a\u527a\u6435.\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0 p1) {
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
    
    private void lambda$\ub18d\u839e\uc910\u7043\u59ec\u839e$11(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0) {
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
            invokevirtual:void(\u6c52\u9a18\u3504\u718f\u64f2\u6ec6::\u7006\u3bd6\u7d52\ub70c\u120d\u446c, invokevirtual:\u6c52\u9a18\u3504\u718f\u64f2\u6ec6(\ube23\uc238\u5140\u4cd9\u8aa5::\u3e2a\uc4d2\u4d85\ud7e8\u5245\u71f1, this:\ube23\uc238\u5140\u4cd9\u8aa5), p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            invokestatic:void(\u759a\u8df4\u2dcc\u5db4\u0a06::\ub83f\u6c56\ube23\u61a4\ua3b4\u88c5, this:\ube23\uc238\u5140\u4cd9\u8aa5, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u7c6b\u839e\u5245\u12cb\u7873\ud171 lambda$\ud217\ud523\u4daf\uf995\u47c2\uc87f$10(java.lang.String p0) {
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
            return:\u7c6b\u839e\u5245\u12cb\u7873\ud171(initobject:\u7c6b\u839e\u5245\u12cb\u7873\ud171(\u7c6b\u839e\u5245\u12cb\u7873\ud171::<init>, p0:String))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ud171\u4cd9\ud4fe\u8bb0\uc84e\ud7e8$9(\u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\uc2e8\u9255\u647c\ud171\ubf56 p1) {
        var_2_61 : int
        stack_88_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(1958131443), ldc:int(2092668391))
            
            if (cmpne:boolean(p1:\uc2e8\u9255\u647c\ud171\ubf56, p0:\uc2e8\u9255\u647c\ud171\ubf56)) {
                var_2_61 = and:int(var_2_61:int, ldc:int(2105008083))
                stack_88_0 = and:int(ldc:int(569), ldc:int(-2618))
            }
            else {
                stack_88_0 = xor:int(ldc:int(16512), ldc:int(16513))
            }
            
            return:boolean(stack_88_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\u6c56\ub7dc\u759a\u3dd3\ud171\ubefe$8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            return:String(invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u6d69\u64f2\uc2bd\ub6ab\ub7dc\u7873), invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p0:\u7d52\u718f\u3776\u6fb0\ub83f))))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String lambda$\uceb8\u34df\ucb79\u446c\u99f7\uc29a$7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            return:String(invokevirtual:String(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::toString, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>::\u8df4\ua068\u9af2\u8350\uc29a\u392e, getstatic:\uc9f6\u839e\u0b8e\u960f\u3a62\u51fa<\u9255\u0c95\u4cd9\ube23\u760c<?>>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\u6d69\u64f2\uc2bd\ub6ab\ub7dc\u7873), invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>(\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p0:\u7d52\u718f\u3776\u6fb0\ub83f))))
        }
        
        goto(Label_0006)
    }
    
    private boolean lambda$\u3776\u8709\u67e9\u6fb0\uff55\u97e6$6(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
        var_2_61 : int
        stack_A7_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(1283540867), ldc:int(1129073627))
            
            if (cmpne:boolean(p0:\ube23\u67d0\u64f2\u839e\u76bc, aconstnull:\ube23\u67d0\u64f2\u839e\u76bc())) {
                if (invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, p0:\ube23\u67d0\u64f2\u839e\u76bc)) {
                    if (invokevirtual:boolean(\u8bb0\u759a\u3bc9\u527a\ube23\u5140::\u8df4\u71f1\u12b2\u9af2\u1833\ub1b9, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                        stack_A7_0 = and:int[expected:boolean](ldc:int(1097), ldc:int(563))
                        return:boolean(stack_A7_0:boolean)
                    }
                }
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-1210716269))
            stack_A7_0 = and:int[expected:boolean](ldc:int(-16135), ldc:int(7942))
            return:boolean(stack_A7_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\uc3e3\uc910\u64f2\u34df\u7af6\ub19c$5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
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
            invokevirtual:void(\u51fa\u6c52\u7330\u7330\u960f::\ub70c\u965f\u6d99\u839e\ub171\u836c, p0:\u51fa\u6c52\u7330\u7330\u960f, and:int[expected:boolean](ldc:int(-20211), ldc:int(20210)), and:int[expected:boolean](ldc:int(-32707), ldc:int(4034)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u7ce1\ub171\u3776\u56bd\u7bad\uceb8$4(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\u51fa\u6c52\u7330\u7330\u960f p0) {
        var_1_61 : int
        stack_98_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-982973188), ldc:int(-42081796))
            
            if (logicalnot:boolean(logicalor:boolean(invokevirtual:boolean(\u51fa\u6c52\u7330\u7330\u960f::\u5db4\u3d64\u97e6\u8d98\ucb79\u3711, p0:\u51fa\u6c52\u7330\u7330\u960f), invokevirtual:boolean(\ua3b4\u8aa5\ub113\ubf56\u873d::\ua6bd\uc87f\uc229\u67d0\ua6bd\u6c52, p0:\u51fa\u6c52\u7330\u7330\u960f[expected:\ua3b4\u8aa5\ub113\ubf56\u873d])))) {
                stack_98_0 = and:int(ldc:int(13521), ldc:int(16941))
            }
            else {
                var_1_61 = and:int(var_1_61:int, ldc:int(2109523198))
                stack_98_0 = and:int(ldc:int(26933), ldc:int(-28022))
            }
            
            return:boolean(stack_98_0:int)
        }
        
        goto(Label_0006)
    }
    
    private \u71f1\uc910\u3bc9\u516c\u93a2.\uafe7\ua61f\u4f4a\u9af2\uae5d lambda$\u92ff\uc31c\uafe7\ubf56\u392e\ua6bd$3() {
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
            return:\uafe7\ua61f\u4f4a\u9af2\uae5d(initobject:\uafe7\ua61f\u4f4a\u9af2\uae5d(\uafe7\ua61f\u4f4a\u9af2\uae5d::<init>, this:\ube23\uc238\u5140\u4cd9\u8aa5))
        }
        
        goto(Label_0006)
    }
    
    private static \u5245\u8aa5\u61a4\u7049\u4cd9.\ub1b9\u4f52\ubff1\u8709\u36d3\ub113 lambda$\u72f1\ud36e\u5654\uafe7\ub19c\u8308$2(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u88c5\ud171\ub113\u6435\ud51e p0) {
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
            return:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113(invokevirtual:\ub1b9\u4f52\ubff1\u8709\u36d3\ub113(\ube23\uc238\u5140\u4cd9\u8aa5::\u4c2b\u40a9\u88c5\uc84e\u600f\ubded, invokevirtual:\ube23\uc238\u5140\u4cd9\u8aa5(\u88c5\ud171\ub113\u6435\ud51e::\u6b0d\uf94d\u47c2\u72f1\u8aa5\uae5d, p0:\u88c5\ud171\ub113\u6435\ud51e)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u7330\u647c\u16f6\ubcb0\ud12e\u6b0d$1(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8cae\ucb79\ud7e8\ub8be\u156b\u960f p0) {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(cmpne:boolean(p0:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f, aconstnull:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f()), cmpne:boolean(p0:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f, getstatic:\u8cae\ucb79\ud7e8\ub8be\u156b\u960f(\u69d9\ud12e\uae5d\u8258\ub18d\ub32d::\u718f\u8753\ua61f\u67d0\ud51e\uc87f))), and:int(ldc:int(10390), ldc:int(-10487)), and:int(ldc:int(17), ldc:int(2593))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u7330\u760c\ud51e\uc29a\u8c8a\u3d4b$0(\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a p0) {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(cmpne:boolean(p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a, aconstnull:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a()), logicalnot:boolean(invokevirtual:boolean(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u3504\u99f7\ud523\ud171\u9937\u873d, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a::\u8350\u8bb0\u839e\ub113\u7bad\u56bd, p0:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a)))), and:int(ldc:int(-29562), ldc:int(16665)), xor:int(ldc:int(-24444), ldc:int(-24443))))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_810 : int
        expr_6E : int [generated]
        stack_BF_0 : byte[] [generated]
        stack_C1_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_10B_0 : byte[] [generated]
        stack_15C_0 : byte[] [generated]
        stack_15E_0 : byte[] [generated]
        stack_196_0 : byte[] [generated]
        stack_198_0 : byte[] [generated]
        stack_1CD_0 : byte[] [generated]
        stack_834_0 : byte[] [generated]
        stack_8A1_0 : byte[] [generated]
        stack_938_0 : byte[] [generated]
        stack_973_0 : byte[] [generated]
        stack_9C9_0 : byte[] [generated]
        var_4_7FB : int
        var_3_800 : byte[]
        var_5_801 : int
        expr_834 : byte [generated]
        var_0_8BB : int
        expr_8A1 : byte [generated]
        stack_8EA_2 : byte [generated]
        stack_8BE_0 : byte [generated]
        expr_C1 : int [generated]
        expr_10B : int [generated]
        var_2_15C : byte[]
        expr_160 : int [generated]
        var_3_961 : byte[]
        var_5_962 : int
        expr_198 : int [generated]
        var_3_9B7 : byte[]
        var_5_9B8 : int
        var_3_1D9 : String
        stack_7D9_0 : String[] [generated]
        expr_1EB : String[] [generated]
        
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
        var_0_810 = and:int(ldc:int(1481197840), ldc:int(1540267816))
        expr_6E = arraylength:int(stack_BF_0 = stack_C1_0 = stack_109_0 = stack_10B_0 = stack_15C_0 = stack_15E_0 = stack_196_0 = stack_198_0 = stack_1CD_0 = stack_834_0 = stack_8A1_0 = stack_938_0 = stack_973_0 = stack_9C9_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("3O/U0wML/1AMtVkVwgH1Qx63DxEFBEAPzvcOEkoGsQ4UL/DRHBRDBssLBw1A/ssc/AkESQ/IBQ1TDLvwHBsFB/cBVBzfERQj2rY5EdcGEEoPtwEFHxXw+v0ZFghCBsn5Awv/UAzBGA4ETPPCFQ8GAg9CE8vj+hEDLBvSBhAaGufyEQNP/r9fHM0ERwzM+QML/1AMtVkVtPBWH7BEC8INTBPF/AUeA0kPuEMDyhH6/RkSQg/I+wEVD/IYAOgRFwVC9bxfHM0ERwzM+QML/1AMwQUNUwy78BwbBQf3ARRAH9wRFCPatllf5rbnBPofEgZC9bNZCLFWUcbN8D1VyLRZCLEmHvMD9wYcDPoBFyz95hD38hka+AEXDAwG+gMLABD8Thm/+B8b+QEXDAwG+gMLABD8PlUdyiQFqfUBFwz7CRYP9TBbHcokBa4CDgsqAdX+HwoHHQz9DhIqCewOCwoA/A4SGvjjDh8SAwD2DhL5CRj0DhL5SR+/+B8A/gADHBUAAQ4PBAvz/hsZ/AkSBQ4PBAvz/h8aBgYHDAgOAQAN8zdV0b0BFfcMGPQDCwAQ/A4Q9gMLABD8Thm/+B8e9wMLABD8PlUdyiQFnAIc8AMTAQPxDwoFW/a7DhAa9w8ZA/kAFg/1MFsdyiQFoA0MCgn2CQb7HRYN/foeC/IZFQ7wQADBAw8YCCIJ0A4S+QkeDvBAAMEDDxgIIgLZBhD5DxUKAwsGAvQNDg8OMFsdyiT0qxb8CQT4QlgdugNbzMT5AwsAEPw+VR3KBB8H4NdYOcbB+wEXDAwG+gMLABD8PlUdygQfB+DXWDnGwfsBFwz7CRYP9TBbHcoES8vF+w8ZA/kAFg/1MFsdygRLy8b3DhIK9PcADh8SM0MfurIdGgf2CRkM9gUlBfsP9QsW+v0ZAvAfCgcdCPj/HgtDULz4VR3KJPSeGgoHHQ4AAgUM+A4S+TlbHcok9J4eCv9WBrAOABwEDRID9vkTFw/1ARoPJgvQARf7/xkSDyb24yAB4vIWHgcG9vYTFw8WDeHyFh4HBvb2ExcPFg31CgMLBvH5DhwM8BAU8gId9QMb/PUGARcdRgS5/hAV8vkHBw5vbg==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_7FB = expr_6E:int
        var_3_800 = newarray:byte[](byte.class, expr_6E:int)
        var_5_801 = expr_6E:int
        Label_2051:
        
        while (cmpeq:boolean(and:int(var_0_810:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_810:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_810 = and:int(var_0_810:int, ldc:int(-2051005655))
                goto(Label_2169)
            }
            
            var_0_810 = and:int(var_0_810:int, ldc:int(2017106472))
            var_5_801 = add:int(var_5_801:int, ldc:int(-1))
            expr_834 = loadelement:byte(stack_834_0:byte[], var_5_801:int)
            storeelement:byte(var_3_800:byte[], var_5_801:int, or:int(and:int(shl:int(expr_834:byte, xor:int(ldc:int(1035), ldc:int(1039))), ldc:int(-16)), and:int(shr:int(expr_834:byte[expected:int], xor:int(ldc:int(640), ldc:int(644))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_801:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_C1_0 = stack_BF_0 = stack_109_0 = stack_10B_0 = stack_15C_0 = stack_15E_0 = stack_196_0 = stack_198_0 = stack_1CD_0 = stack_834_0 = stack_8A1_0 = stack_938_0 = stack_973_0 = stack_9C9_0 = var_3_800:byte[]
            goto(Label_0115)
        }
        
        var_0_810 = and:int(var_0_810:int, ldc:int(-1420891215))
        goto(Label_2320)
        Label_2169:
        
        while (cmpne:boolean(and:int(var_0_810:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_810:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_810 = and:int(var_0_810:int, ldc:int(-1286087106))
                goto(Label_2051)
            }
            
            var_0_8BB = and:int(var_0_810:int, ldc:int(-1200836858))
            var_5_801 = add:int(var_5_801:int, ldc:int(-1))
            expr_8A1 = stack_8EA_2 = loadelement(stack_8A1_0, var_5_801)
            
            if (cmplt:boolean(add:int(add:int(var_5_801:int, ldc:int(2)), neg:int(var_4_7FB:int)), ldc:int(0))) {
                stack_8EA_2 = stack_8BE_0 = add:byte(expr_8A1:byte, loadelement:byte(var_3_800:byte[], add:int(var_5_801:int, ldc:int(2))))
                goto(Label_2254)
            }
            
            Label_2222:
            
            if (cmpeq:boolean(and:int(var_0_8BB:int, ldc:int(32)), ldc:int(0))) {
                var_0_8BB = and:int(var_0_8BB:int, ldc:int(-103159388))
                stack_8EA_2 = stack_8BE_0 = add:byte(expr_8A1:byte, ldc:byte(2))
            }
            
            Label_2254:
            
            if (cmpne:boolean(and:int(var_0_8BB:int, ldc:int(4096)), ldc:int(0))) {
                var_0_8BB = and:int(var_0_8BB:int, ldc:int(-1924130395))
                goto(Label_2222)
            }
            
            var_0_810 = and:int(var_0_8BB:int, ldc:int(-1110467053))
            storeelement:byte(var_3_800:byte[], var_5_801:int, stack_8EA_2:byte)
            
            if (cmpne:boolean(var_5_801:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_C1_0 = stack_BF_0 = stack_109_0 = stack_10B_0 = stack_15C_0 = stack_15E_0 = stack_196_0 = stack_198_0 = stack_1CD_0 = stack_834_0 = stack_8A1_0 = stack_938_0 = stack_973_0 = stack_9C9_0 = var_3_800:byte[]
            goto(Label_0198)
        }
        
        Label_2320:
        
        while (cmpeq:boolean(and:int(var_0_810:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_810:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_2051)
            }
            
            var_0_810 = and:int(var_0_810:int, ldc:int(1566215173))
            var_5_801 = add:int(var_5_801:int, ldc:int(-1))
            storeelement:byte(var_3_800:byte[], var_5_801:int, xor:byte(loadelement:byte(stack_938_0:byte[], var_5_801:int), ldc:byte(88)))
            
            if (cmpne:boolean(var_5_801:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_C1_0 = stack_BF_0 = stack_109_0 = stack_10B_0 = stack_15C_0 = stack_15E_0 = stack_196_0 = stack_198_0 = stack_1CD_0 = stack_834_0 = stack_8A1_0 = stack_938_0 = stack_973_0 = stack_9C9_0 = var_3_800:byte[]
            goto(Label_0272)
        }
        
        var_0_810 = and:int(var_0_810:int, ldc:int(1107570433))
        goto(Label_2169)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_810:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_810 = and:int(var_0_810:int, ldc:int(-687107368))
            goto(Label_0413)
        }
        
        if (cmpne:boolean(and:int(var_0_810:int, ldc:int(32768)), ldc:int(0))) {
            var_0_810 = and:int(var_0_810:int, ldc:int(-1151918624))
            goto(Label_0357)
        }
        
        if (cmpne:boolean(and:int(var_0_810:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_810 = and:int(var_0_810:int, ldc:int(-1784141477))
            goto(Label_0272)
        }
        
        if (cmpne:boolean(and:int(var_0_810:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_810 = and:int(var_0_810:int, ldc:int(-1091077344))
        }
        else {
            var_0_810 = and:int(var_0_810:int, ldc:int(418212372))
            expr_C1 = arraylength:int(stack_C1_0:byte[])
            
            if (cmpne:boolean(expr_C1:int, ldc:int(0))) {
                var_4_7FB = expr_C1:int
                var_3_800 = newarray:byte[](byte.class, expr_C1:int)
                var_5_801 = expr_C1:int
                goto(Label_2169)
            }
        }
        
        Label_0198:
        
        if (cmpeq:boolean(and:int(var_0_810:int, ldc:int(2048)), ldc:int(0))) {
            var_0_810 = and:int(var_0_810:int, ldc:int(1178016720))
            goto(Label_0413)
        }
        
        if (cmpne:boolean(and:int(var_0_810:int, ldc:int(32)), ldc:int(0))) {
            var_0_810 = and:int(var_0_810:int, ldc:int(-1747074967))
            goto(Label_0357)
        }
        
        if (cmpeq:boolean(and:int(var_0_810:int, ldc:int(32768)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_810:int, ldc:int(67108864)), ldc:int(0))) {
                var_0_810 = and:int(var_0_810:int, ldc:int(1681607713))
                goto(Label_0115)
            }
            
            var_0_810 = and:int(var_0_810:int, ldc:int(-108460026))
            expr_10B = arraylength:int(stack_10B_0:byte[])
            
            if (cmpne:boolean(expr_10B:int, ldc:int(0))) {
                var_4_7FB = expr_10B:int
                var_3_800 = newarray:byte[](byte.class, expr_10B:int)
                var_5_801 = expr_10B:int
                goto(Label_2320)
            }
        }
        
        Label_0272:
        
        if (cmpne:boolean(and:int(var_0_810:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_810 = and:int(var_0_810:int, ldc:int(-1344652241))
            goto(Label_0413)
        }
        
        if (cmpeq:boolean(and:int(var_0_810:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_810 = and:int(var_0_810:int, ldc:int(-933338384))
        }
        else {
            if (cmpne:boolean(and:int(var_0_810:int, ldc:int(8388608)), ldc:int(0))) {
                var_0_810 = and:int(var_0_810:int, ldc:int(1894677215))
                goto(Label_0198)
            }
            
            if (cmpne:boolean(and:int(var_0_810:int, ldc:int(32768)), ldc:int(0))) {
                var_0_810 = and:int(var_0_810:int, ldc:int(1447994624))
                goto(Label_0115)
            }
            
            var_0_810 = and:int(var_0_810:int, ldc:int(-1112700761))
            var_2_15C = stack_15C_0:byte[]
            expr_160 = add:int(arraylength:int(stack_15E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_160:int, ldc:int(0))) {
                var_3_961 = newarray:byte[](byte.class, expr_160:int)
                var_5_962 = expr_160:int
                
                loop {
                    var_0_810 = and:int(var_0_810:int, ldc:int(-1163203593))
                    var_5_962 = add:int(var_5_962:int, ldc:int(-1))
                    storeelement:byte(var_3_961:byte[], var_5_962:int, add:int(shl:int(loadelement:byte(stack_973_0:byte[], var_5_962:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_15C:byte[], add:int(var_5_962:int, xor:int(ldc:int(8992), ldc:int(8993)))), ldc:int(4)), xor:int(ldc:int(-30708), ldc:int(-30717)))))
                    
                    if (cmpne:boolean(var_5_962:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_C1_0 = stack_BF_0 = stack_109_0 = stack_10B_0 = stack_15C_0 = stack_15E_0 = stack_196_0 = stack_198_0 = stack_1CD_0 = stack_834_0 = stack_8A1_0 = stack_938_0 = stack_973_0 = stack_9C9_0 = var_3_961:byte[]
            }
        }
        
        Label_0357:
        
        if (cmpne:boolean(and:int(var_0_810:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_810:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_810 = and:int(var_0_810:int, ldc:int(1719108972))
                goto(Label_0272)
            }
            
            if (cmpeq:boolean(and:int(var_0_810:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0198)
            }
            
            if (cmpne:boolean(and:int(var_0_810:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_810 = and:int(var_0_810:int, ldc:int(1035812198))
            expr_198 = arraylength:int(stack_198_0:byte[])
            
            if (cmpne:boolean(expr_198:int, ldc:int(0))) {
                var_3_9B7 = newarray:byte[](byte.class, expr_198:int)
                var_5_9B8 = expr_198:int
                
                loop {
                    var_0_810 = and:int(var_0_810:int, ldc:int(-1121161786))
                    var_5_9B8 = add:int(var_5_9B8:int, ldc:int(-1))
                    storeelement:byte(var_3_9B7:byte[], var_5_9B8:int, add:byte(loadelement:byte(stack_9C9_0:byte[], var_5_9B8:int), ldc:byte(111)))
                    
                    if (cmpne:boolean(var_5_9B8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_C1_0 = stack_BF_0 = stack_109_0 = stack_10B_0 = stack_15C_0 = stack_15E_0 = stack_196_0 = stack_198_0 = stack_1CD_0 = stack_834_0 = stack_8A1_0 = stack_938_0 = stack_973_0 = stack_9C9_0 = var_3_9B7:byte[]
            }
        }
        
        Label_0413:
        
        if (cmpne:boolean(and:int(var_0_810:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0357)
        }
        
        if (cmpne:boolean(and:int(var_0_810:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_810 = and:int(var_0_810:int, ldc:int(2052595312))
            goto(Label_0272)
        }
        
        if (cmpne:boolean(and:int(var_0_810:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0198)
        }
        
        if (cmpne:boolean(and:int(var_0_810:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_1D9 = initobject:String(String::<init>, stack_1CD_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_7D9_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32227), ldc:int(-32219)))
            expr_1EB = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(814), ldc:int(790)))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(29238), ldc:int(1142)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(1380), ldc:int(-1381)), and:int(ldc:int(16405), ldc:int(-16406))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(946), ldc:int(21611)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(15657), ldc:int(-15658)), and:int(ldc:int(4241), ldc:int(515))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(-30685), ldc:int(-30698)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(6849), ldc:int(1301)), and:int(ldc:int(1035), ldc:int(24614))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(191), ldc:int(31799)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(8458), ldc:int(19042)), and:int(ldc:int(7299), ldc:int(8467))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(4369), ldc:int(18451)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(17415), ldc:int(12547)), xor:int(ldc:int(73), ldc:int(106))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(8222), ldc:int(597)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(1911), ldc:int(10275)), and:int(ldc:int(205), ldc:int(8812))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(16940), ldc:int(4534)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(1116), ldc:int(16492)), xor:int(ldc:int(54), ldc:int(96))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(2199), ldc:int(1591)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(3360), ldc:int(3446)), xor:int(ldc:int(17466), ldc:int(17486))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(1194), ldc:int(1176)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(24696), ldc:int(24588)), xor:int(ldc:int(8475), ldc:int(8603))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(1228), ldc:int(1241)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(13441), ldc:int(656)), and:int(ldc:int(8443), ldc:int(699))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(4542), ldc:int(534)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(24827), ldc:int(447)), xor:int(ldc:int(615), ldc:int(868))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(16476), ldc:int(16495)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(455), ldc:int(9995)), xor:int(ldc:int(1665), ldc:int(1925))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(431), ldc:int(12351)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(9988), ldc:int(16668)), and:int(ldc:int(3439), ldc:int(4361))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(16512), ldc:int(16517)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(16596), ldc:int(16861)), xor:int(ldc:int(505), ldc:int(237))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(10301), ldc:int(1579)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(3476), ldc:int(9020)), xor:int(ldc:int(1837), ldc:int(1547))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(30), ldc:int(6846)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(806), ldc:int(6454)), xor:int(ldc:int(17941), ldc:int(18220))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(16501), ldc:int(16490)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(3832), ldc:int(4033)), xor:int(ldc:int(9512), ldc:int(9313))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(8227), ldc:int(8228)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(8537), ldc:int(2505)), and:int(ldc:int(4949), ldc:int(10613))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(9236), ldc:int(21040)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(-25523), ldc:int(-25320)), and:int(ldc:int(6623), ldc:int(8543))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(1), ldc:int(3)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(438), ldc:int(233)), and:int(ldc:int(16746), ldc:int(4586))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(303), ldc:int(310)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(2414), ldc:int(24954)), and:int(ldc:int(16891), ldc:int(9072))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(6183), ldc:int(24943)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(8570), ldc:int(3440)), and:int(ldc:int(17790), ldc:int(11131))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(1075), ldc:int(10873)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(18810), ldc:int(9082)), xor:int(ldc:int(17711), ldc:int(17578))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(716), ldc:int(764)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(4493), ldc:int(10629)), and:int(ldc:int(1489), ldc:int(411))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(4122), ldc:int(4155)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(4474), ldc:int(4331)), and:int(ldc:int(1967), ldc:int(435))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(117), ldc:int(165)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(931), ldc:int(8699)), and:int(ldc:int(29114), ldc:int(936))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(161), ldc:int(167)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(1183), ldc:int(1335)), and:int(ldc:int(956), ldc:int(4592))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(25622), ldc:int(25662)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(232), ldc:int(344)), and:int(ldc:int(20988), ldc:int(9662))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(33), ldc:int(60)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(1467), ldc:int(1031)), xor:int(ldc:int(376), ldc:int(177))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(17), ldc:int(55)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(796), ldc:int(725)), xor:int(ldc:int(8608), ldc:int(8314))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(24736), ldc:int(2087)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(6320), ldc:int(6506)), and:int(ldc:int(27119), ldc:int(490))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(4118), ldc:int(4125)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(571), ldc:int(977)), and:int(ldc:int(8692), ldc:int(6644))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(17690), ldc:int(2077)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(16813), ldc:int(16473)), and:int(ldc:int(16894), ldc:int(509))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(723), ldc:int(2067)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(423), ldc:int(91)), and:int(ldc:int(2829), ldc:int(525))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(139), ldc:int(153)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(-32589), ldc:int(-32066)), and:int(ldc:int(16925), ldc:int(4925))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(1031), ldc:int(1060)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(16925), ldc:int(4861)), and:int(ldc:int(11055), ldc:int(18031))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(8308), ldc:int(7479)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(2863), ldc:int(17983)), xor:int(ldc:int(19533), ldc:int(20183))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(-30574), ldc:int(-30570)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(666), ldc:int(23195)), xor:int(ldc:int(1379), ldc:int(2045))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(9242), ldc:int(9239)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(734), ldc:int(17054)), and:int(ldc:int(17134), ldc:int(5800))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(9), ldc:int(21193)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(1001), ldc:int(2748)), xor:int(ldc:int(8744), ldc:int(8326))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(318), ldc:int(157)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(25032), ldc:int(25446)), and:int(ldc:int(721), ldc:int(27591))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(16447), ldc:int(8219)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(1409), ldc:int(1856)), xor:int(ldc:int(-31481), ldc:int(-30766))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(22042), ldc:int(2234)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(-30030), ldc:int(-30617)), xor:int(ldc:int(12838), ldc:int(12536))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(-16379), ldc:int(-16369)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(8695), ldc:int(9001)), and:int(ldc:int(997), ldc:int(8943))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(21192), ldc:int(58)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(8327), ldc:int(8802)), xor:int(ldc:int(17452), ldc:int(18117))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(4111), ldc:int(11436)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(-23720), ldc:int(-24143)), xor:int(ldc:int(671), ldc:int(108))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(16526), ldc:int(16512)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(4129), ldc:int(4818)), xor:int(ldc:int(4188), ldc:int(4959))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(4767), ldc:int(79)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(10960), ldc:int(10707)), and:int(ldc:int(18296), ldc:int(11028))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(-28032), ldc:int(-28029)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(8884), ldc:int(8612)), and:int(ldc:int(25375), ldc:int(827))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(8239), ldc:int(430)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(17179), ldc:int(4891)), and:int(ldc:int(2847), ldc:int(991))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(2746), ldc:int(2711)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(18207), ldc:int(959)), xor:int(ldc:int(14), ldc:int(813))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(72), ldc:int(73)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(266), ldc:int(553)), and:int(ldc:int(13098), ldc:int(2922))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(17325), ldc:int(-17328)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, xor:int(ldc:int(762), ldc:int(464)), xor:int(ldc:int(193), ldc:int(1015))))
            storeelement:String(expr_1EB:String[], xor:int(ldc:int(1300), ldc:int(1342)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(10046), ldc:int(822)), and:int(ldc:int(823), ldc:int(10047))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(2219), ldc:int(5695)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(17215), ldc:int(2871)), and:int(ldc:int(17400), ldc:int(11067))))
            storeelement:String(expr_1EB:String[], and:int(ldc:int(8623), ldc:int(124)), invokevirtual:String[expected:String](String::substring, var_3_1D9:String, and:int(ldc:int(11192), ldc:int(4922)), and:int(ldc:int(2937), ldc:int(5949))))
            putstatic:String[](\ube23\uc238\u5140\u4cd9\u8aa5::\u3504\u4f52\u64ab\ud36e\u76bc\u0b8e, expr_1EB:String[])
            putstatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ube23\uc238\u5140\u4cd9\u8aa5::\u4f52\u624e\ubded\u3711\ub6ab\u8aa5, initobject:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::<init>, ldc:int(100), ldc:int(50), and:int(ldc:int(-25824), ldc:int(17541))))
            putstatic:Logger(\ube23\uc238\u5140\u4cd9\u8aa5::\u416d\u1187\u52d3\u071d\uc238\uc246, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u3a62\ucef1\u718f\ub70c\u71ae\u6bb9(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_67B : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_686 : int
        
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
        var_3_67B = and:int(ldc:int(887683091), ldc:int(580776919))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ube23\uc238\u5140\u4cd9\u8aa5[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-803215788))
        }
        else {
            var_3_67B = and:int(var_3_67B:int, ldc:int(-1550918753))
            var_5_8A = and:int(ldc:int(9740), ldc:int(-9741))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-4061), ldc:int(1756)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_67B:int, ldc:int(-174981222))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(8448), ldc:int(8449)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(5120), ldc:int(5121)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_67B = and:int(var_3_E3:int, ldc:int(2128073230))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(769), ldc:int(9331)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(346288977))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2120137844))
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-7671046))
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1435851440))
                    }
                    else {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1598171102))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(930481465))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1222594705))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1363108148))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(933624227))
                        var_11_F4 = and:int(ldc:int(-6197), ldc:int(6196))
                        goto(Label_1535)
                    }
                    
                    Label_0577:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-599224443))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(195923636))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-621039765))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1564255962))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(954061366))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(68376982))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1304514185))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(378776221))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1639642499))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1564313598))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-101141366))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1158621581))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-2099027373))
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1764743288))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(24624862))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2063771040))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(767653220))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1043296027))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1230718578))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = xor:int(ldc:int(18976), ldc:int(18977))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(804209367))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1804200890))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(633653366))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1074401842))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(699832738))
                        var_11_F4 = and:int(ldc:int(8941), ldc:int(-8942))
                    }
                    
                    Label_1155:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-1914428053))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(595213152))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-372464651))
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-437522157))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1425)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(2065543361))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_1155)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(-1899298743))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1468494603))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(1327346211))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(2135279629))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_67B = and:int(var_3_67B:int, ldc:int(104055513))
                            loopcontinue()
                        }
                        
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-74211770))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1535)
                    }
                    
                    Label_1425:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-547900047))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(128)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_67B = and:int(var_3_67B:int, ldc:int(-1566067526))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1535:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_686 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1546:
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1425)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(301907179))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(1641518198))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-489361427))
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_67B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(4329723))
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_67B = and:int(var_3_67B:int, ldc:int(-437862614))
                        var_17_686 = add:int(var_16_122:int, xor:int(ldc:int(2560), ldc:int(2561)))
                        looporswitchbreak()
                    }
                }
                
                var_3_67B = and:int(var_3_67B:int, ldc:int(-7799198))
                
                if (cmple:boolean(var_5_8A = var_17_686:int, sub:int(var_6_91:int, xor:int(ldc:int(12), ldc:int(13))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_67B:int, ldc:int(32768)), ldc:int(0))) {
            var_3_67B = and:int(var_3_67B:int, ldc:int(1537388964))
            goto(Label_0108)
        }
    }
}
