public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a {
    public void \u5f50\u5f50\u8d98\ub18d\u5fe1\u527a(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ucef1\u759a\u40a9\u7c6b\u8258 p0) {
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
    
    public void \u72f1\u5f50\u51fa\ubcb0\u0b8e\uafe7() {
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
    
    public void \u760c\ud51e\u3e2a\uc910\uc7fe\u71ae() {
        var_3_78 : \u527a\u873d\u071d\u4f52\uc229\ud217
        
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
            invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u7bad\ub171\u61a4\ubff1\u6d69\u6cfe, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), and:int[expected:boolean](ldc:int(4286), ldc:int(-4287)))
            var_3_78 = invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a))
            
            if (cmpne:boolean(var_3_78:\u527a\u873d\u071d\u4f52\uc229\ud217, aconstnull:\u527a\u873d\u071d\u4f52\uc229\ud217())) {
                invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, var_3_78:\u527a\u873d\u071d\u4f52\uc229\ud217, initobject:\u3bc9\ucfaf\ub102\u74b1\ub19c[expected:\u946b\u6d99\u8df4\u12cb\u5d20<?>](\u3bc9\ucfaf\ub102\u74b1\ub19c::<init>, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\ucb79\u7873\ub7dc\u7043\u34df\uceb8, getfield:\ucef1\u759a\u40a9\u7c6b\u8258[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u6b5f\ucb79\u36d3\u718f\u9255\u600f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), loadelement:String(getfield:String[](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\uae87\u59ec\u4c2b\u7043\u946b\u16f6, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), and:int(ldc:int(-7560), ldc:int(7303))), loadelement:String(getfield:String[](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\uae87\u59ec\u4c2b\u7043\u946b\u16f6, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), xor:int(ldc:int(9730), ldc:int(9731))), loadelement:String(getfield:String[](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\uae87\u59ec\u4c2b\u7043\u946b\u16f6, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), xor:int(ldc:int(-31871), ldc:int(-31869))), loadelement:String(getfield:String[](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\uae87\u59ec\u4c2b\u7043\u946b\u16f6, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), xor:int(ldc:int(-32762), ldc:int(-32763)))))
            }
            
            invokevirtual:void(\ucef1\u759a\u40a9\u7c6b\u8258::\u8d90\u983f\u12cb\u3711\u927d\u6b0d, getfield:\ucef1\u759a\u40a9\u7c6b\u8258(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u6b5f\ucb79\u36d3\u718f\u9255\u600f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), and:int[expected:boolean](ldc:int(12673), ldc:int(16397)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u759a\uc87f\u5140\ud36e\u12cb\ubcb0() {
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
            putfield:int(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\uc246\u64f2\u98a4\uc229\uc87f\ub171, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a, add:int(getfield:int(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\uc246\u64f2\u98a4\uc229\uc87f\ub171, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), xor:int(ldc:int(17160), ldc:int(17161))))
            
            if (logicalnot:boolean(invokevirtual:boolean(\uc229\u8413\ufcaf\u99f7\u494c<T>::\u4bc8\u5140\u647c\u5245\u51fa\u5654, invokevirtual:\uc229\u8413\ufcaf\u99f7\u494c<?>(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u392e\u4179\u759a\u76bc\u8bb0\u36d3, getfield:\ucef1\u759a\u40a9\u7c6b\u8258[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u6b5f\ucb79\u36d3\u718f\u9255\u600f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e](\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u6ec6\u92ff\u8bb0\u071d\u7c6b\uafe7, getfield:\ucef1\u759a\u40a9\u7c6b\u8258[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u6b5f\ucb79\u36d3\u718f\u9255\u600f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)))))) {
                invokespecial:void(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u5f50\u3d4b\u3bc9\u6b0d\ub6ab\u5fe1, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u5f50\u3d4b\u3bc9\u6b0d\ub6ab\u5fe1() {
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
            invokevirtual:void(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u6d69\uc229\ubefe\ua3b4\u6c52\u5654, getfield:\ucef1\u759a\u40a9\u7c6b\u8258[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u6b5f\ucb79\u36d3\u718f\u9255\u600f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), checkcast:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006.class, aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ubb2b\ube23\u59ec\u61a4\u8753\uc4d2(char p0, int p1) {
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
            invokevirtual:boolean(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u71f1\u3504\u3bc9\uc2bd\u7c6b\ub19c, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8350\uae5d\u6c56\uc9f6\u8308\u718f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), p0:char)
            return:boolean(and:int[expected:boolean](ldc:int(14487), ldc:int(1)))
        }
        
        goto(Label_0006)
    }
    
    public void \ubf56\u64ab\u97e6\u7d52\ufe34\u6cfe() {
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
            invokespecial:void(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u5f50\u3d4b\u3bc9\u6b0d\ub6ab\u5fe1, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc229\u3a62\u12cb\ud51e\uafe7\u8308(int p0, int p1, int p2) {
        var_4_17B : int
        stack_19A_0 : int [generated]
        
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
        var_4_17B = and:int(ldc:int(1992591572), ldc:int(1709895166))
        
        if (cmpne:boolean(p0:int, xor:int(ldc:int(341), ldc:int(92)))) {
            loop {
                if (cmpeq:boolean(and:int(var_4_17B:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0344)
                }
                
                if (cmpeq:boolean(and:int(var_4_17B:int, ldc:int(128)), ldc:int(0))) {
                    var_4_17B = and:int(var_4_17B:int, ldc:int(-1414905965))
                }
                else {
                    var_4_17B = and:int(var_4_17B:int, ldc:int(1962014910))
                    
                    if (cmpne:boolean(p0:int, and:int(ldc:int(8584), ldc:int(5432)))) {
                        if (cmpne:boolean(p0:int, and:int(ldc:int(385), ldc:int(15681)))) {
                            if (cmpne:boolean(p0:int, xor:int(ldc:int(10315), ldc:int(10500)))) {
                                if (logicalnot:boolean(invokevirtual:boolean(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u12b2\u759a\uf94d\u7e3f\u67e9\u51fa, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8350\uae5d\u6c56\uc9f6\u8308\u718f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), p0:int))) {
                                    goto(Label_0344)
                                }
                                
                                stack_19A_0 = xor:int(ldc:int(8233), ldc:int(8232))
                                looporswitchbreak()
                            }
                        }
                    }
                }
                
                Label_0160:
                
                if (cmpeq:boolean(and:int(var_4_17B:int, ldc:int(16)), ldc:int(0))) {
                    var_4_17B = and:int(var_4_17B:int, ldc:int(1028548906))
                }
                else {
                    if (cmpeq:boolean(and:int(var_4_17B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_4_17B = and:int(var_4_17B:int, ldc:int(259991886))
                        loopcontinue()
                    }
                    
                    putfield:int(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8308\ud523\u6d69\u4f52\u4f4a\u6b5f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a, and:int(add:int(getfield:int(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8308\ud523\u6d69\u4f52\u4f4a\u6b5f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), and:int(ldc:int(8211), ldc:int(4289))), and:int(ldc:int(28679), ldc:int(731))))
                    invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u6435\ud158\u3776\u647c\u9937\u98a4, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8350\uae5d\u6c56\uc9f6\u8308\u718f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a))
                    return:boolean(xor:int[expected:boolean](ldc:int(4224), ldc:int(4225)))
                }
                
                Label_0344:
                
                if (cmpne:boolean(and:int(var_4_17B:int, ldc:int(256)), ldc:int(0))) {
                    var_4_17B = and:int(var_4_17B:int, ldc:int(-226115282))
                    goto(Label_0160)
                }
                
                if (cmpeq:boolean(and:int(var_4_17B:int, ldc:int(1048576)), ldc:int(0))) {
                    var_4_17B = and:int(var_4_17B:int, ldc:int(1172945302))
                    stack_19A_0 = invokespecial:boolean[expected:int](\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:int, p1:int, p2:int)
                    looporswitchbreak()
                }
            }
            
            return:boolean(stack_19A_0:int)
        }
        
        putfield:int(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8308\ud523\u6d69\u4f52\u4f4a\u6b5f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a, and:int(sub:int(getfield:int(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8308\ud523\u6d69\u4f52\u4f4a\u6b5f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), xor:int(ldc:int(12300), ldc:int(12301))), and:int(ldc:int(5199), ldc:int(8483))))
        invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u6435\ud158\u3776\u647c\u9937\u98a4, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8350\uae5d\u6c56\uc9f6\u8308\u718f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a))
        return:boolean(xor:int[expected:boolean](ldc:int(5138), ldc:int(5139)))
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_5_108 : int
        var_8_C5 : \u8413\u7e3f\uc910\uf94d\u5654\u6b0d
        var_9_CF : boolean
        stack_137_0 : int [generated]
        var_10_137 : int
        var_12_159 : \u61a4\u76bc\u0c95\u1833\u7043\u3711
        var_14_17A : \u6b0d\uf9c5\ucfaf\ud36e\ub102
        var_16_1C7 : int
        var_17_1D0 : int
        var_18_1D9 : int
        var_19_1F0 : int
        var_20_1F9 : \uc87f\u5f50\u16f6\ub113\u52d3\u12b2
        var_21_202 : int
        var_22_253 : String
        var_25_34B : int
        var_21_243 : int
        var_22_3D4 : String
        var_24_444 : int
        var_25_49D : int
        var_26_4A6 : int
        var_27_4D5 : int
        var_28_504 : int
        var_29_50D : int
        var_30_516 : int
        var_32_522 : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        
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
            var_5_108 = and:int(ldc:int(1511177165), ldc:int(519993037))
            invokestatic:void(\uf9c5\ucef1\u4daf\ud36e\uc246\u3776::\u9a18\u120d\uc31c\u6ec6\uc229\u183a)
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), getfield:ITextComponent(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\ud36e\uafe7\ubf56\uc229\u51b2\u8413, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), div:int(getfield:int(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), and:int(ldc:int(522), ldc:int(6195))), ldc:int(40), ldc:int(16777215))
            invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, i2d:double(div:int(getfield:int(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), xor:int(ldc:int(610), ldc:int(608)))), ldc:double(0.0), ldc:double(50.0))
            invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\uf94d\ub18d\u5654\ubff1\u624e\ua6bd, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, ldc:float(93.75f), ldc:float(-93.75f), ldc:float(93.75f))
            invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, ldc:double(0.0), ldc:double(-1.3125), ldc:double(0.0))
            var_8_C5 = invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\ub83f\uc9f6\u47c2\u67d0\u7ce1::\u6ec6\u92ff\u8bb0\u071d\u7c6b\uafe7, getfield:\ucef1\u759a\u40a9\u7c6b\u8258[expected:\ub83f\uc9f6\u47c2\u67d0\u7ce1](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u6b5f\ucb79\u36d3\u718f\u9255\u600f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a))
            var_9_CF = instanceof:boolean(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u3e75\u156b\u5140\ua61f\u61a4\ua3b4.class, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_8_C5:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e]))
            
            if (logicalnot:boolean(var_9_CF:boolean)) {
                invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, ldc:double(0.0), ldc:double(-0.3125), ldc:double(0.0))
            }
            
            do {
                if (cmpne:boolean(and:int(var_5_108:int, ldc:int(512)), ldc:int(0))) {
                    var_5_108 = and:int(var_5_108:int, ldc:int(1446477781))
                    
                    if (cmpne:boolean(rem:int(div:int(getfield:int(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\uc246\u64f2\u98a4\uc229\uc87f\ub171, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), ldc:int(6)), xor:int(ldc:int(16403), ldc:int(16401))), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_137_0 = xor:int(ldc:int(4166), ldc:int(4167))
                    Label_0303:
                    var_10_137 = stack_137_0:int
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9937\u7d52\u3e75\u98a4\u8aa5\u7006, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\uf94d\ub18d\u5654\ubff1\u624e\ua6bd, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, ldc:float(0.6666667f), ldc:float(-0.6666667f), ldc:float(-0.6666667f))
                    var_12_159 = invokevirtual:\u61a4\u76bc\u0c95\u1833\u7043\u3711(\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2::\u718f\u7af6\ud12e\u72f1\u62da\u51b2, invokevirtual:\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uc29a\u8308\u7006\u8aa5\u760c\ud12e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)))
                    var_14_17A = invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\ubcb0\ud171\u516c\u76bc\u8cae\u99f7::\ub113\uae87\uc910\u836c\u9033\u3711, invokestatic:\ubcb0\ud171\u516c\u76bc\u8cae\u99f7(\u183a\ufcaf\u839e\ubff1\u527a\uc84e::\u5fe1\u8350\u759a\u6d99\u4492\ud4fe, invokevirtual:\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a(\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e::\u7873\u69d9\u3776\u6bb9\u71ae\ub6ab, var_8_C5:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d[expected:\u7043\u8c8a\u8c8a\u4f4a\ufcaf\u839e])), var_12_159:\u61a4\u76bc\u0c95\u1833\u7043\u3711[expected:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa], invokedynamic:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \uf995\u4975\u1187\ubff1\u839e\u8389>(apply:(L\u59ec\u8413\u97e6\uc229\u3776/\u960f\u7873\uc2e8\u0c95\u12cb\u6198;)Ljava/util/function/Function;, getfield:\u960f\u7873\uc2e8\u0c95\u12cb\u6198[expected:\uc910\uc29a\u527a\u6c56\u34df\u6d69](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8413\ubcb0\u3e2a\u1833\uc29a\u2dcc, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)))
                    invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u839e\u6c52\u4e72\u927d\u3bc9\uc3e3, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u960f\u7873\uc2e8\u0c95\u12cb\u6198::\u960f\u8308\uae5d\u36d3\u71ae\u9937, getfield:\u960f\u7873\uc2e8\u0c95\u12cb\u6198(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8413\ubcb0\u3e2a\u1833\uc29a\u2dcc, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_14_17A:\u6b0d\uf9c5\ucfaf\ud36e\ub102, ldc:int(15728880), getstatic:int(\uf9c5\ud51e\ucfaf\u392e\u071d\u9937::\u624e\u516c\u6cfe\u4c04\u8753\u120d))
                    
                    if (var_9_CF:boolean) {
                        invokevirtual:void(\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e::\u839e\u6c52\u4e72\u927d\u3bc9\uc3e3, getfield:\u8d98\u5db4\uc910\u0b8e\ubf56\ud36e(\u960f\u7873\uc2e8\u0c95\u12cb\u6198::\u3bd6\u8389\u873d\u7049\ua562\u527a, getfield:\u960f\u7873\uc2e8\u0c95\u12cb\u6198(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8413\ubcb0\u3e2a\u1833\uc29a\u2dcc, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_14_17A:\u6b0d\uf9c5\ucfaf\ud36e\ub102, ldc:int(15728880), getstatic:int(\uf9c5\ud51e\ucfaf\u392e\u071d\u9937::\u624e\u516c\u6cfe\u4c04\u8753\u120d))
                    }
                    
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u4ab3\u839e\ub1b9\u1833\u4cd9\u2dcc, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u99f7\u4d85\u5bc4\u12cb\ub32d\u839e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, ldc:double(0.0), ldc:double(0.3333333432674408), ldc:double(0.046666666865348816))
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\uf94d\ub18d\u5654\ubff1\u624e\ua6bd, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, ldc:float(0.010416667f), ldc:float(-0.010416667f), ldc:float(0.010416667f))
                    var_16_1C7 = invokevirtual:int(\u8413\u92ee\u3504\u3a62\ud36e\ud36e::\u12cb\u52d3\u8df4\u927d\u4975\u5245, invokevirtual:\u8413\u92ee\u3504\u3a62\ud36e\ud36e(\ucef1\u759a\u40a9\u7c6b\u8258::\uc9f6\u9af2\u8709\u74b1\ud217\u3d64, getfield:\ucef1\u759a\u40a9\u7c6b\u8258(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u6b5f\ucb79\u36d3\u718f\u9255\u600f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)))
                    var_17_1D0 = invokevirtual:int(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u8709\u56bd\u7049\u392e\u67e9\ubefe, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8350\uae5d\u6c56\uc9f6\u8308\u718f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a))
                    var_18_1D9 = invokevirtual:int(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u12cb\uc2e8\ua3b4\u4f52\u56bd\u34df, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8350\uae5d\u6c56\uc9f6\u8308\u718f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a))
                    var_19_1F0 = sub:int(mul:int(getfield:int(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8308\ud523\u6d69\u4f52\u4f4a\u6b5f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), ldc:int(10)), mul:int(arraylength:int(getfield:String[](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\uae87\u59ec\u4c2b\u7043\u946b\u16f6, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), xor:int(ldc:int(8452), ldc:int(8449))))
                    var_20_1F9 = invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4))
                    var_21_202 = and:int(ldc:int(-29082), ldc:int(20888))
                    
                    while (cmplt:boolean(var_21_202:int, arraylength:int(getfield:String[](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\uae87\u59ec\u4c2b\u7043\u946b\u16f6, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)))) {
                        var_22_253 = loadelement:String(getfield:String[](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\uae87\u59ec\u4c2b\u7043\u946b\u16f6, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), var_21_202:int)
                        
                        if (cmpne:boolean(var_22_253:String, aconstnull:String())) {
                            if (invokevirtual:boolean(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u3dd3\uae87\u9255\u5654\uff55\u7873, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a))) {
                                var_22_253 = invokevirtual:String(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6b0d\u494c\ua3b4\ub8be\u8389\u718f, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), var_22_253:String)
                            }
                            
                            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u5d20\u8308\u4f52\u71ae\u59ec\u5d20, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), var_22_253:String, i2f:float(div:int(neg:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), var_22_253:String)), and:int(ldc:int(1027), ldc:int(21014)))), i2f:float(sub:int(mul:int(var_21_202:int, ldc:int(10)), mul:int(arraylength:int(getfield:String[](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\uae87\u59ec\u4c2b\u7043\u946b\u16f6, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), and:int(ldc:int(3117), ldc:int(24711))))), var_16_1C7:int, and:int[expected:boolean](ldc:int(-28682), ldc:int(28681)), var_20_1F9:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_12_159:\u61a4\u76bc\u0c95\u1833\u7043\u3711[expected:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa], and:int[expected:boolean](ldc:int(-1167), ldc:int(1166)), and:int(ldc:int(18864), ldc:int(-18865)), ldc:int(15728880), and:int[expected:boolean](ldc:int(-17835), ldc:int(17832)))
                            
                            if (cmpeq:boolean(var_21_202:int, getfield:int(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8308\ud523\u6d69\u4f52\u4f4a\u6b5f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a))) {
                                if (cmpge:boolean(var_17_1D0:int, ldc:int(0))) {
                                    if (cmpne:boolean(var_10_137:int, ldc:int(0))) {
                                        var_25_34B = sub:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), invokevirtual:String(String::substring, var_22_253:String, and:int(ldc:int(5506), ldc:int(-5507)), invokestatic:int(Math::max, invokestatic:int(Math::min, var_17_1D0:int, invokevirtual:int(String::length, var_22_253:String)), and:int(ldc:int(-13344), ldc:int(9247))))), div:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), var_22_253:String), and:int(ldc:int(6658), ldc:int(62))))
                                        
                                        if (cmpge:boolean(var_17_1D0:int, invokevirtual:int(String::length, var_22_253:String))) {
                                            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u5d20\u8308\u4f52\u71ae\u59ec\u5d20, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), loadelement:String(getstatic:String[](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u6b0d\ube23\u6cfe\ud12e\u960f\u1833), and:int(ldc:int(18945), ldc:int(4301))), i2f:float(var_25_34B:int), i2f:float(var_19_1F0:int), var_16_1C7:int, and:int[expected:boolean](ldc:int(19240), ldc:int(-20457)), var_20_1F9:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_12_159:\u61a4\u76bc\u0c95\u1833\u7043\u3711[expected:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa], and:int[expected:boolean](ldc:int(16706), ldc:int(-16707)), and:int(ldc:int(-31981), ldc:int(31976)), ldc:int(15728880), and:int[expected:boolean](ldc:int(8434), ldc:int(-12024)))
                                        }
                                    }
                                }
                            }
                        }
                        
                        inc:int(var_21_202, ldc:int(1))
                    }
                    
                    invokevirtual:void(\u61a4\u76bc\u0c95\u1833\u7043\u3711::\u52d3\ua3b4\uae87\u1833\u9a18\u51b2, var_12_159:\u61a4\u76bc\u0c95\u1833\u7043\u3711)
                    var_21_243 = and:int(ldc:int(12682), ldc:int(-12699))
                    
                    while (cmplt:boolean(var_21_243:int, arraylength:int(getfield:String[](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\uae87\u59ec\u4c2b\u7043\u946b\u16f6, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)))) {
                        var_22_3D4 = loadelement:String(getfield:String[](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\uae87\u59ec\u4c2b\u7043\u946b\u16f6, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), var_21_243:int)
                        
                        if (cmpne:boolean(var_22_3D4:String, aconstnull:String())) {
                            if (cmpeq:boolean(var_21_243:int, getfield:int(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8308\ud523\u6d69\u4f52\u4f4a\u6b5f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a))) {
                                if (cmpge:boolean(var_17_1D0:int, ldc:int(0))) {
                                    var_24_444 = sub:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), invokevirtual:String(String::substring, var_22_3D4:String, and:int(ldc:int(17812), ldc:int(-21909)), invokestatic:int(Math::max, invokestatic:int(Math::min, var_17_1D0:int, invokevirtual:int(String::length, var_22_3D4:String)), and:int(ldc:int(25262), ldc:int(-29423))))), div:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), var_22_3D4:String), and:int(ldc:int(12335), ldc:int(3330))))
                                    
                                    if (cmpne:boolean(var_10_137:int, ldc:int(0))) {
                                        if (cmplt:boolean(var_17_1D0:int, invokevirtual:int(String::length, var_22_3D4:String))) {
                                            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\uff55\u5245\uf995\u7049\u4179\u624e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_24_444:int, sub:int(var_19_1F0:int, xor:int(ldc:int(2050), ldc:int(2051))), add:int(var_24_444:int, and:int(ldc:int(2705), ldc:int(28995))), add:int(var_19_1F0:int, ldc:int(9)), or:int(ldc:int(-16777216), var_16_1C7:int))
                                        }
                                    }
                                    
                                    if (cmpne:boolean(var_18_1D9:int, var_17_1D0:int)) {
                                        var_25_49D = invokestatic:int(Math::min, var_17_1D0:int, var_18_1D9:int)
                                        var_26_4A6 = invokestatic:int(Math::max, var_17_1D0:int, var_18_1D9:int)
                                        var_27_4D5 = sub:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), invokevirtual:String(String::substring, var_22_3D4:String, and:int(ldc:int(-3727), ldc:int(3724)), var_25_49D:int)), div:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), var_22_3D4:String), xor:int(ldc:int(6157), ldc:int(6159))))
                                        var_28_504 = sub:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), invokevirtual:String(String::substring, var_22_3D4:String, and:int(ldc:int(1866), ldc:int(-1867)), var_26_4A6:int)), div:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), var_22_3D4:String), xor:int(ldc:int(12288), ldc:int(12290))))
                                        var_29_50D = invokestatic:int(Math::min, var_27_4D5:int, var_28_504:int)
                                        var_30_516 = invokestatic:int(Math::max, var_27_4D5:int, var_28_504:int)
                                        var_32_522 = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f))
                                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe)
                                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u74b1\uc2bd\ua61f\u12cb\u5245\ub6ab)
                                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2, getstatic:\ua61f\u92ee\ub8be\uafe7\u4e72(\ua61f\u92ee\ub8be\uafe7\u4e72::\u4f52\ube23\u69d9\u67e9\u8d98\u3d64))
                                        invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_32_522:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u40a9\u8709\ud523\ub171\u446c\u7e3f))
                                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_32_522:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_20_1F9:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, i2f:float(var_29_50D:int), i2f:float(add:int(var_19_1F0:int, ldc:int(9))), ldc:float(0.0f)), and:int(ldc:int(24486), ldc:int(-24511)), and:int(ldc:int(9363), ldc:int(-9364)), and:int(ldc:int(23807), ldc:int(767)), xor:int(ldc:int(8889), ldc:int(8774))))
                                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_32_522:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_20_1F9:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, i2f:float(var_30_516:int), i2f:float(add:int(var_19_1F0:int, ldc:int(9))), ldc:float(0.0f)), and:int(ldc:int(-6442), ldc:int(6441)), and:int(ldc:int(4142), ldc:int(-4143)), and:int(ldc:int(5375), ldc:int(2303)), xor:int(ldc:int(2330), ldc:int(2533))))
                                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_32_522:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_20_1F9:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, i2f:float(var_30_516:int), i2f:float(var_19_1F0:int), ldc:float(0.0f)), and:int(ldc:int(17761), ldc:int(-17762)), and:int(ldc:int(-8657), ldc:int(8656)), and:int(ldc:int(16895), ldc:int(255)), xor:int(ldc:int(31), ldc:int(224))))
                                        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_32_522:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_20_1F9:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, i2f:float(var_29_50D:int), i2f:float(var_19_1F0:int), ldc:float(0.0f)), and:int(ldc:int(21748), ldc:int(-22007)), and:int(ldc:int(-2415), ldc:int(2414)), xor:int(ldc:int(-29551), ldc:int(-29586)), and:int(ldc:int(255), ldc:int(20991))))
                                        invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\ua068\uc31c\u6bb9\u34df\uc3e3\u6d99, var_32_522:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
                                        invokestatic:void(\u446c\u7af6\u5bc4\ub83f\u8413\u600f::\u7c6b\ua562\u5db4\u7006\u1833\u516c, var_32_522:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab)
                                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\ubded\ud7e8\u4f52\uc229\u4d85)
                                        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u9255\u59ec\ube23\u64f2\ub32d)
                                    }
                                }
                            }
                        }
                        
                        inc:int(var_21_243, ldc:int(1))
                    }
                    
                    invokevirtual:void(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u4ab3\u839e\ub1b9\u1833\u4cd9\u2dcc, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                    invokestatic:void(\uf9c5\ucef1\u4daf\ud36e\uc246\u3776::\u6b0d\ua068\ud217\u600f\u3a62\u7c6b)
                    invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
                    return:void()
                }
            } while (cmpeq:boolean(and:int(var_5_108:int, ldc:int(512)), ldc:int(0)))
            
            var_5_108 = and:int(var_5_108:int, ldc:int(-1804126507))
            stack_137_0 = and:int(ldc:int(-6777), ldc:int(6776))
            goto(Label_0303)
        }
        
        goto(Label_0006)
    }
    
    private boolean lambda$\u4daf\u0800\ufcaf\u3c25\ua6bd\u156b$4(java.lang.String p0) {
        var_2_61 : int
        stack_93_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(292544011), ldc:int(1690160841))
            
            if (cmpgt:boolean(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u92ff\u4179\u3d64\ud217\ucb79, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)), p0:String), ldc:int(90))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1476535877))
                stack_93_0 = and:int(ldc:int(-12293), ldc:int(12292))
            }
            else {
                stack_93_0 = and:int(ldc:int(17433), ldc:int(37))
            }
            
            return:boolean(stack_93_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ub18d\u5140\u8413\u72f1\u88c5\u56bd$3(java.lang.String p0) {
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
            storeelement:String(getfield:String[](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\uae87\u59ec\u4c2b\u7043\u946b\u16f6, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), getfield:int(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8308\ud523\u6d69\u4f52\u4f4a\u6b5f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), p0:String)
            invokevirtual:void(\ucef1\u759a\u40a9\u7c6b\u8258::\uc29a\ua61f\ubff1\ub8be\u5db4\u62da, getfield:\ucef1\u759a\u40a9\u7c6b\u8258(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u6b5f\ucb79\u36d3\u718f\u9255\u600f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), getfield:int(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8308\ud523\u6d69\u4f52\u4f4a\u6b5f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, p0:String))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.lang.String lambda$\u5d20\u6d99\u600f\u4f52\u6ec6\u8bb0$2() {
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
            return:String(loadelement:String(getfield:String[](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\uae87\u59ec\u4c2b\u7043\u946b\u16f6, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a), getfield:int(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u8308\ud523\u6d69\u4f52\u4f4a\u6b5f, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u88c5\ub113\uf995\ub32d\u97e6\u6fb0$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u5f50\u3d4b\u3bc9\u6b0d\ub6ab\u5fe1, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String[] lambda$\u3bc9\u8709\u6ec6\u4f4a\u183a\u5654$0(int p0) {
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
            return:String[](newarray:String[](java.lang.String.class, p0:int))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2C6 : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_D0_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_109_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_1C7_0 : byte[] [generated]
        stack_205_0 : byte[] [generated]
        stack_274_0 : byte[] [generated]
        stack_2EA_0 : byte[] [generated]
        var_4_1A0 : int
        var_3_1A5 : byte[]
        var_5_1A6 : int
        expr_274 : byte [generated]
        var_0_2E0 : int
        expr_2EA : byte [generated]
        stack_31A_2 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_1F3 : byte[]
        var_5_1F4 : int
        expr_D0 : int [generated]
        expr_109 : int [generated]
        var_3_14B : String
        stack_199_0 : String[] [generated]
        expr_15D : String[] [generated]
        
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
        var_0_2C6 = and:int(ldc:int(-530806932), ldc:int(-721646688))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_CE_0 = stack_D0_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_1C7_0 = stack_205_0 = stack_274_0 = stack_2EA_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("06xK0MzdNJKMkrI=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_1A0 = expr_6E:int
        var_3_1A5 = newarray:byte[](byte.class, expr_6E:int)
        var_5_1A6 = expr_6E:int
        Label_0424:
        
        while (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0588)
            }
            
            var_0_2C6 = and:int(var_0_2C6:int, ldc:int(-2074167839))
            var_5_1A6 = add:int(var_5_1A6:int, ldc:int(-1))
            storeelement:byte(var_3_1A5:byte[], var_5_1A6:int, xor:byte(add:byte(loadelement:byte(stack_1C7_0:byte[], var_5_1A6:int), ldc:byte(59)), ldc:byte(13)))
            
            if (cmpne:boolean(var_5_1A6:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CE_0 = stack_D0_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_1C7_0 = stack_205_0 = stack_274_0 = stack_2EA_0 = var_3_1A5:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0697)
        Label_0588:
        
        while (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(128)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2C6:int, ldc:int(65536)), ldc:int(0))) {
                var_0_2C6 = and:int(var_0_2C6:int, ldc:int(-1695665377))
                goto(Label_0424)
            }
            
            var_0_2C6 = and:int(var_0_2C6:int, ldc:int(-144911366))
            var_5_1A6 = add:int(var_5_1A6:int, ldc:int(-1))
            expr_274 = loadelement:byte(stack_274_0:byte[], var_5_1A6:int)
            storeelement:byte(var_3_1A5:byte[], var_5_1A6:int, or:int(and:int(shl:int(expr_274:byte, xor:int(ldc:int(3456), ldc:int(3460))), ldc:int(-16)), and:int(shr:int(expr_274:byte[expected:int], xor:int(ldc:int(200), ldc:int(204))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1A6:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CE_0 = stack_D0_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_1C7_0 = stack_205_0 = stack_274_0 = stack_2EA_0 = var_3_1A5:byte[]
            goto(Label_0213)
        }
        
        Label_0697:
        
        while (cmpne:boolean(and:int(var_0_2C6:int, ldc:int(524288)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_2C6:int, ldc:int(128)), ldc:int(0))) {
                var_0_2C6 = and:int(var_0_2C6:int, ldc:int(-8812187))
                goto(Label_0424)
            }
            
            var_0_2E0 = and:int(var_0_2C6:int, ldc:int(-1569730570))
            var_5_1A6 = add:int(var_5_1A6:int, ldc:int(-1))
            expr_2EA = loadelement:byte(stack_2EA_0:byte[], var_5_1A6:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1A6:int, ldc:int(4)), neg:int(var_4_1A0:int)), ldc:int(0))) {
                var_0_2E0 = and:int(var_0_2E0:int, ldc:int(-867182146))
                stack_31A_2 = add:byte(expr_2EA:byte, ldc:byte(4))
            }
            else {
                stack_31A_2 = add:byte(expr_2EA:byte, loadelement:byte(var_3_1A5:byte[], add:int(var_5_1A6:int, ldc:int(4))))
            }
            
            var_0_2C6 = and:int(var_0_2E0:int, ldc:int(-789784082))
            storeelement:byte(var_3_1A5:byte[], var_5_1A6:int, stack_31A_2:byte)
            
            if (cmpne:boolean(var_5_1A6:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_CE_0 = stack_D0_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_1C7_0 = stack_205_0 = stack_274_0 = stack_2EA_0 = var_3_1A5:byte[]
            goto(Label_0270)
        }
        
        var_0_2C6 = and:int(var_0_2C6:int, ldc:int(1848172302))
        goto(Label_0588)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0270)
        }
        
        if (cmpne:boolean(and:int(var_0_2C6:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_0213)
        }
        
        if (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_2C6 = and:int(var_0_2C6:int, ldc:int(-1495430423))
        }
        else {
            var_0_2C6 = and:int(var_0_2C6:int, ldc:int(-135492768))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_1F3 = newarray:byte[](byte.class, expr_A0:int)
                var_5_1F4 = expr_A0:int
                
                loop {
                    var_0_2C6 = and:int(var_0_2C6:int, ldc:int(-1283655315))
                    var_5_1F4 = add:int(var_5_1F4:int, ldc:int(-1))
                    storeelement:byte(var_3_1F3:byte[], var_5_1F4:int, add:int(shl:int(loadelement:byte(stack_205_0:byte[], var_5_1F4:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_1F4:int, and:int(ldc:int(6157), ldc:int(8835)))), ldc:int(5)), xor:int(ldc:int(2), ldc:int(5)))))
                    
                    if (cmpne:boolean(var_5_1F4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CE_0 = stack_D0_0 = stack_107_0 = stack_109_0 = stack_13F_0 = stack_1C7_0 = stack_205_0 = stack_274_0 = stack_2EA_0 = var_3_1F3:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(32)), ldc:int(0))) {
            var_0_2C6 = and:int(var_0_2C6:int, ldc:int(-1662998229))
            goto(Label_0270)
        }
        
        if (cmpne:boolean(and:int(var_0_2C6:int, ldc:int(256)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2C6 = and:int(var_0_2C6:int, ldc:int(-210910351))
            expr_D0 = arraylength:int(stack_D0_0:byte[])
            
            if (cmpne:boolean(expr_D0:int, ldc:int(0))) {
                var_4_1A0 = expr_D0:int
                var_3_1A5 = newarray:byte[](byte.class, expr_D0:int)
                var_5_1A6 = expr_D0:int
                goto(Label_0588)
            }
        }
        
        Label_0213:
        
        if (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(32768)), ldc:int(0))) {
            var_0_2C6 = and:int(var_0_2C6:int, ldc:int(-1872391801))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(4194304)), ldc:int(0))) {
                var_0_2C6 = and:int(var_0_2C6:int, ldc:int(1386971065))
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2C6 = and:int(var_0_2C6:int, ldc:int(-1896047175))
            expr_109 = arraylength:int(stack_109_0:byte[])
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_4_1A0 = expr_109:int
                var_3_1A5 = newarray:byte[](byte.class, expr_109:int)
                var_5_1A6 = expr_109:int
                goto(Label_0697)
            }
        }
        
        Label_0270:
        
        if (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(32)), ldc:int(0))) {
            var_0_2C6 = and:int(var_0_2C6:int, ldc:int(376239158))
            goto(Label_0213)
        }
        
        if (cmpeq:boolean(and:int(var_0_2C6:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_2C6 = and:int(var_0_2C6:int, ldc:int(-1307827798))
            goto(Label_0165)
        }
        
        if (cmpne:boolean(and:int(var_0_2C6:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_14B = initobject:String(String::<init>, stack_13F_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_199_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-31710), ldc:int(-31712)))
            expr_15D = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-28653), ldc:int(-28655)))
            storeelement:String(expr_15D:String[], and:int(ldc:int(2083), ldc:int(17989)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(-14419), ldc:int(14418)), xor:int(ldc:int(384), ldc:int(385))))
            storeelement:String(expr_15D:String[], and:int(ldc:int(-19004), ldc:int(19000)), invokevirtual:String[expected:String](String::substring, var_3_14B:String, and:int(ldc:int(171), ldc:int(3393)), and:int(ldc:int(1066), ldc:int(20638))))
            putstatic:String[](\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a::\u6b0d\ube23\u6cfe\ud12e\u960f\u1833, expr_15D:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64E : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_659 : int
        
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
        var_3_64E = and:int(ldc:int(756247105), ldc:int(1068061311))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5f50\u5f50\u8d98\ub18d\u5fe1\u527a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
            var_3_64E = and:int(var_3_64E:int, ldc:int(-1242402205))
            var_5_81 = and:int(ldc:int(19196), ldc:int(-19198))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17044), ldc:int(-17045)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_64E:int, ldc:int(-1490554291))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(18765), ldc:int(8755)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(4611), ldc:int(33)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_64E = and:int(var_3_DA:int, ldc:int(-1480040709))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(2083), ldc:int(529)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(2143742176))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1397843533))
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0789)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(922214088))
                    }
                    else {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-178699531))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0550)
                            }
                            
                            goto(Label_0789)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1966619116))
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(246588964))
                        goto(Label_0789)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(495382107))
                            var_11_EB = and:int(ldc:int(27753), ldc:int(-27754))
                            goto(Label_1472)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0550:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1136900451))
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1059473261))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1242068912))
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-970887822))
                        goto(Label_0789)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1619963321))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0789)
                        }
                    }
                    
                    Label_0675:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1335)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1522619200))
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1454807389))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1204863733))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0789:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(772723210))
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1645768101))
                        goto(Label_1074)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1810658133))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1568661733))
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-1507418405))
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-577663900))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1209633801))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(16517), ldc:int(11337))
                                goto(Label_1074)
                            }
                        }
                    }
                    
                    Label_0932:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-187407778))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0789)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-2116650921))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-36450437))
                        var_11_EB = and:int(ldc:int(3612), ldc:int(-28573))
                    }
                    
                    Label_1074:
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(459316714))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1167843653))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0932)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1709491844))
                            goto(Label_0789)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(-327240814))
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(830936834))
                            goto(Label_0550)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1477814585))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1335)
                            }
                        }
                    }
                    
                    Label_1208:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1239391359))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1074)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(225009404))
                            goto(Label_0932)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0789)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0675)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0550)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_64E = and:int(var_3_64E:int, ldc:int(1012016731))
                            loopcontinue()
                        }
                        
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1968465865))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1472)
                    }
                    
                    Label_1335:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(726896490))
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1074)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0789)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(642448636))
                        goto(Label_0675)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(1898156169))
                        goto(Label_0550)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1962381284))
                        goto(Label_0402)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_64E = and:int(var_3_64E:int, ldc:int(503073627))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1472:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_659 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1483:
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1374089891))
                        goto(Label_1335)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1208)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-209940736))
                        goto(Label_1074)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(549940005))
                        goto(Label_0932)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0789)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-1827344958))
                        goto(Label_0675)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(923906040))
                        goto(Label_0550)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-113196960))
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_64E = and:int(var_3_64E:int, ldc:int(-137706799))
                        var_17_659 = add:int(var_16_119:int, xor:int(ldc:int(8332), ldc:int(8333)))
                        looporswitchbreak()
                    }
                }
                
                var_3_64E = and:int(var_3_64E:int, ldc:int(-42476975))
                
                if (cmple:boolean(var_5_81 = var_17_659:int, sub:int(var_6_88:int, and:int(ldc:int(81), ldc:int(20513))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_64E:int, ldc:int(2)), ldc:int(0))) {
            var_3_64E = and:int(var_3_64E:int, ldc:int(482547855))
            goto(Label_0108)
        }
    }
}
