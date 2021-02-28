public class \u5d20\u97b7\u8753\u873d\u16f6.\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9 {
    public void \u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0) {
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
            invokespecial:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::<init>, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u64ab\u5fe1\u92ee\u7e3f\ub19c\uc910), and:int(ldc:int(13608), ldc:int(-13613)))))
            putfield:String(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ub19c\u6fb0\u69d9\uc7fe\u5fe1\u8413, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9, loadelement:String(getstatic:String[](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u64ab\u5fe1\u92ee\u7e3f\ub19c\uc910), xor:int(ldc:int(1546), ldc:int(1547))))
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ucb79\u0b8e\ube23\u52d3\u3e75\u873d, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            return:void()
        }
        
        goto(Label_0006)
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
    
    private void \ud171\u6ec6\u36d3\u156b\u6bb9\u6d69() {
        stack_BB_0 : \u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d [generated]
        stack_B8_1 : String [generated]
        expr_7A : Object[] [generated]
        
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
            stack_BB_0 = getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u16f6\ub19c\u62da\u8cae\u12b2\uc910, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9)
            stack_B8_1 = loadelement:String(getstatic:String[](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u64ab\u5fe1\u92ee\u7e3f\ub19c\uc910), xor:int(ldc:int(274), ldc:int(273)))
            expr_7A = newarray:Object[](java.lang.Object.class, and:int(ldc:int(3078), ldc:int(4363)))
            storeelement:Object(expr_7A:Object[], and:int(ldc:int(-4574), ldc:int(4572)), getstatic:ITextComponent[expected:Object](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u7ce1\u759a\ud51e\u4daf\ub6ab\u4e72))
            storeelement:Object(expr_7A:Object[], xor:int(ldc:int(8608), ldc:int(8609)), initobject:TranslationTextComponent[expected:Object](TranslationTextComponent::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u64ab\u5fe1\u92ee\u7e3f\ub19c\uc910), xor:int(ldc:int(-32765), ldc:int(-32761)))), getfield:String(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ub19c\u6fb0\u69d9\uc7fe\u5fe1\u8413, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9)))))
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u8350\u51b2\u3c25\u71ae\ube23\u6fb0, stack_BB_0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995], initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_B8_1:String, expr_7A:Object[]))
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u8350\u51b2\u3c25\u71ae\ube23\u6fb0, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u8258\ubefe\u8d98\u97b7\ua3b4\u12cb, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9), invokestatic:IFormattableTextComponent[expected:ITextComponent](\u98a4\u8d98\u64f2\u72f1\u6c52\uc9f6::\u8308\ud36e\ubcb0\ucb79\u8cae\u946b, getstatic:ITextComponent(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u56bd\ub1b9\u40a9\u8308\u8350\uc4d2), getfield:boolean(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u40a9\u6fb0\uf995\uc910\u9033\u8d90, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
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
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9), getfield:ITextComponent(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ud36e\uafe7\ubf56\uc229\u51b2\u8413, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9), div:int(getfield:int(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9), and:int(ldc:int(2), ldc:int(1746))), ldc:int(50), ldc:int(16777215))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9), getstatic:ITextComponent(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u3c25\u56bd\u494c\u3bc9\u51fa\u72f1), div:int(getfield:int(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9), xor:int(ldc:int(-23535), ldc:int(-23533))), ldc:int(82), ldc:int(16777215))
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6435\u6198\u7af6\u873d\uf94d\u61a4$3(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
        var_2_5F : int
        stack_87_1 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(-800022225), ldc:int(-1594235641))
            
            if (getfield:boolean(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u40a9\u6fb0\uf995\uc910\u9033\u8d90, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9)) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-2116670835))
                stack_87_1 = and:int[expected:boolean](ldc:int(-12581), ldc:int(12580))
            }
            else {
                stack_87_1 = xor:int[expected:boolean](ldc:int(2560), ldc:int(2561))
            }
            
            putfield:boolean(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u40a9\u6fb0\uf995\uc910\u9033\u8d90, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9, stack_87_1:boolean)
            invokespecial:void(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ud171\u6ec6\u36d3\u156b\u6bb9\u6d69, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u8d90\u52d3\ub102\u9af2\u4e72\u7330$2(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
        var_2_DF : int
        
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
            var_2_DF = and:int(ldc:int(1527421135), ldc:int(-1653732981))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u64ab\u5fe1\u92ee\u7e3f\ub19c\uc910), and:int(ldc:int(4877), ldc:int(10279))), getfield:String[expected:Object](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ub19c\u6fb0\u69d9\uc7fe\u5fe1\u8413, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9)))) {
                loop {
                    if (cmpeq:boolean(and:int(var_2_DF:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_DF:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_DF = and:int(var_2_DF:int, ldc:int(-60631619))
                    }
                    else {
                        var_2_DF = and:int(var_2_DF:int, ldc:int(-1720153173))
                        
                        if (invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u64ab\u5fe1\u92ee\u7e3f\ub19c\uc910), xor:int(ldc:int(16413), ldc:int(16411))), getfield:String[expected:Object](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ub19c\u6fb0\u69d9\uc7fe\u5fe1\u8413, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9))) {
                            putfield:String(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ub19c\u6fb0\u69d9\uc7fe\u5fe1\u8413, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9, loadelement:String(getstatic:String[](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u64ab\u5fe1\u92ee\u7e3f\ub19c\uc910), and:int(ldc:int(39), ldc:int(22599))))
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0165:
                    
                    if (cmpeq:boolean(and:int(var_2_DF:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_DF:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_DF = and:int(var_2_DF:int, ldc:int(488410107))
                        
                        if (invokevirtual:boolean(String::equals, loadelement:String(getstatic:String[](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u64ab\u5fe1\u92ee\u7e3f\ub19c\uc910), xor:int(ldc:int(291), ldc:int(292))), getfield:String[expected:Object](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ub19c\u6fb0\u69d9\uc7fe\u5fe1\u8413, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9))) {
                            putfield:String(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ub19c\u6fb0\u69d9\uc7fe\u5fe1\u8413, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9, loadelement:String(getstatic:String[](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u64ab\u5fe1\u92ee\u7e3f\ub19c\uc910), and:int(ldc:int(24649), ldc:int(2067))))
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0205:
                    
                    if (cmpne:boolean(and:int(var_2_DF:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0165)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_DF:int, ldc:int(16)), ldc:int(0))) {
                        var_2_DF = and:int(var_2_DF:int, ldc:int(-5444385))
                        putfield:String(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ub19c\u6fb0\u69d9\uc7fe\u5fe1\u8413, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9, loadelement:String(getstatic:String[](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u64ab\u5fe1\u92ee\u7e3f\ub19c\uc910), and:int(ldc:int(7), ldc:int(12749))))
                        looporswitchbreak()
                    }
                }
            }
            else {
                putfield:String(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ub19c\u6fb0\u69d9\uc7fe\u5fe1\u8413, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9, loadelement:String(getstatic:String[](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u64ab\u5fe1\u92ee\u7e3f\ub19c\uc910), xor:int(ldc:int(1553), ldc:int(1559))))
            }
            
            invokespecial:void(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ud171\u6ec6\u36d3\u156b\u6bb9\u6d69, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u64ab\u8308\u8753\u446c\ubcb0\u6435$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ucb79\u0b8e\ube23\u52d3\u3e75\u873d, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uf995\u5bc4\ub171\u156b\u51b2\u071d$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
        var_2_5F : int
        var_4_6E : int
        var_5_A1 : TranslationTextComponent
        stack_D1_1 : String [generated]
        expr_C0 : Object[] [generated]
        
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
            var_2_5F = and:int(ldc:int(904141627), ldc:int(-35183761))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9), checkcast:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006.class, aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()))
            var_4_6E = invokestatic:int(\u647c\u8753\ub171\u6cfe\ua562\u3d4b::\uc910\u5245\ud171\u69d9\u9255\u6b5f)
            
            if (logicalnot:boolean(invokevirtual:boolean(\uf995\u64f2\u3711\uc2e8\u927d::\ucb79\ua3b4\u4ab3\u62da\uc87f\ua562, invokevirtual:\uf995\u64f2\u3711\uc2e8\u927d(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u5bc4\uc87f\ua562\u6b5f\ud36e\u6198, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9)), invokestatic:\uf94d\u51b2\u1833\u34df\u1187(\uf94d\u51b2\u1833\u34df\u1187::\u8413\u3d64\u2dcc\u6b0d\u960f\u56bd, getfield:String(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\ub19c\u6fb0\u69d9\uc7fe\u5fe1\u8413, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9)), getfield:boolean(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u40a9\u6fb0\uf995\uc910\u9033\u8d90, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9), var_4_6E:int))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(901240443))
                var_5_A1 = initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u64ab\u5fe1\u92ee\u7e3f\ub19c\uc910), xor:int(ldc:int(-22523), ldc:int(-22516))))
            }
            else {
                stack_D1_1 = loadelement:String(getstatic:String[](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u64ab\u5fe1\u92ee\u7e3f\ub19c\uc910), and:int(ldc:int(171), ldc:int(4424)))
                expr_C0 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(16515), ldc:int(10025)))
                storeelement:Object(expr_C0:Object[], and:int(ldc:int(427), ldc:int(-27052)), invokestatic:Integer[expected:Object](Integer::valueOf, var_4_6E:int))
                var_5_A1 = initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_D1_1:String, expr_C0:Object[])
            }
            
            invokevirtual:void(\u4d85\u3e2a\u5654\u7d52\u718f\u7e3f::\u9937\u8d98\ud158\u4c04\u600f\u7e3f, invokevirtual:\u4d85\u3e2a\u5654\u7d52\u718f\u7e3f(\u120d\u446c\uff55\u3d64\u494c\u69d9::\ub8be\u6c56\u494c\ud51e\u7330\u3bc9, getfield:\u120d\u446c\uff55\u3d64\u494c\u69d9(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u76bc\u873d\uc238\u0a06\uceb8\u92ee, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9))), var_5_A1:TranslationTextComponent[expected:ITextComponent])
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u6c52\u8753\ua61f\u8709\u385b\ub171, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_312 : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_CC_0 : byte[] [generated]
        stack_CE_0 : byte[] [generated]
        stack_105_0 : byte[] [generated]
        stack_107_0 : byte[] [generated]
        stack_12C_0 : byte[] [generated]
        stack_325_0 : byte[] [generated]
        stack_385_0 : byte[] [generated]
        stack_41C_0 : byte[] [generated]
        stack_470_0 : byte[] [generated]
        var_4_2F5 : int
        var_3_2FA : byte[]
        var_5_2FB : int
        var_0_39F : int
        expr_385 : byte [generated]
        stack_3CE_2 : byte [generated]
        stack_3A2_0 : byte [generated]
        expr_41C : byte [generated]
        expr_A7 : int [generated]
        expr_CE : int [generated]
        var_2_105 : byte[]
        expr_109 : int [generated]
        var_3_45E : byte[]
        var_5_45F : int
        var_3_138 : String
        expr_140 : String[] [generated]
        expr_14A : String[] [generated]
        var_3_2B5 : String[]
        
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
        var_0_312 = and:int(ldc:int(275578948), ldc:int(-25693580))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_CC_0 = stack_CE_0 = stack_105_0 = stack_107_0 = stack_12C_0 = stack_325_0 = stack_385_0 = stack_41C_0 = stack_470_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("xbu7Pjy5vshOPkdKEby1sD1ovkKrxj84yeK4PcMxQ8C9R0oRvLWwPWi+QqvGsLfF1zHLxMM8Sz40wcI8R0WyvTwxukidQL09Q2oivMi/OlrDsEfAsEPLMbpInUBDPT7cMUhFtkNLMbpInUDDSrXvuL6xPL03TaLPPck86zLDLbu0REPLwb3CPMQ9rDuytkA0ScvPPFanw7JDzddHSjExwj1DxKw7srZANEnIRENTvDBDOMU4TkM9rDuytkA0SchEQ1O8MEMYUDG8Q90xxcI3tbw6PUFIQ8YfgnSCeKU=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2F5 = expr_6E:int
        var_3_2FA = newarray:byte[](byte.class, expr_6E:int)
        var_5_2FB = expr_6E:int
        Label_0765:
        
        while (cmpeq:boolean(and:int(var_0_312:int, ldc:int(536870912)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_312:int, ldc:int(4)), ldc:int(0))) {
                var_0_312 = and:int(var_0_312:int, ldc:int(1690522005))
                goto(Label_0852)
            }
            
            var_0_312 = and:int(var_0_312:int, ldc:int(1543495789))
            var_5_2FB = add:int(var_5_2FB:int, ldc:int(-1))
            storeelement:byte(var_3_2FA:byte[], var_5_2FB:int, xor:byte(loadelement:byte(stack_325_0:byte[], var_5_2FB:int), ldc:byte(60)))
            
            if (cmpne:boolean(var_5_2FB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_CC_0 = stack_CE_0 = stack_105_0 = stack_107_0 = stack_12C_0 = stack_325_0 = stack_385_0 = stack_41C_0 = stack_470_0 = var_3_2FA:byte[]
            goto(Label_0115)
        }
        
        goto(Label_1012)
        Label_0852:
        
        while (cmpeq:boolean(and:int(var_0_312:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_312:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_312 = and:int(var_0_312:int, ldc:int(1733212892))
                goto(Label_0765)
            }
            
            var_0_39F = and:int(var_0_312:int, ldc:int(-144304267))
            var_5_2FB = add:int(var_5_2FB:int, ldc:int(-1))
            expr_385 = stack_3CE_2 = loadelement(stack_385_0, var_5_2FB)
            
            if (cmplt:boolean(add:int(add:int(var_5_2FB:int, ldc:int(5)), neg:int(var_4_2F5:int)), ldc:int(0))) {
                stack_3CE_2 = stack_3A2_0 = add:byte(expr_385:byte, loadelement:byte(var_3_2FA:byte[], add:int(var_5_2FB:int, ldc:int(5))))
                goto(Label_0946)
            }
            
            Label_0914:
            
            if (cmpne:boolean(and:int(var_0_39F:int, ldc:int(4)), ldc:int(0))) {
                var_0_39F = and:int(var_0_39F:int, ldc:int(863240516))
                stack_3CE_2 = stack_3A2_0 = add:byte(expr_385:byte, ldc:byte(5))
            }
            
            Label_0946:
            
            if (cmpne:boolean(and:int(var_0_39F:int, ldc:int(2048)), ldc:int(0))) {
                var_0_39F = and:int(var_0_39F:int, ldc:int(-655370441))
                goto(Label_0914)
            }
            
            var_0_312 = and:int(var_0_39F:int, ldc:int(-1703834681))
            storeelement:byte(var_3_2FA:byte[], var_5_2FB:int, stack_3CE_2:byte)
            
            if (cmpne:boolean(var_5_2FB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_CC_0 = stack_CE_0 = stack_105_0 = stack_107_0 = stack_12C_0 = stack_325_0 = stack_385_0 = stack_41C_0 = stack_470_0 = var_3_2FA:byte[]
            goto(Label_0172)
        }
        
        var_0_312 = and:int(var_0_312:int, ldc:int(1333364458))
        Label_1012:
        
        while (cmpeq:boolean(and:int(var_0_312:int, ldc:int(1073741824)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_312:int, ldc:int(1024)), ldc:int(0))) {
                var_0_312 = and:int(var_0_312:int, ldc:int(-1838625288))
                goto(Label_0765)
            }
            
            var_0_312 = and:int(var_0_312:int, ldc:int(2071727303))
            var_5_2FB = add:int(var_5_2FB:int, ldc:int(-1))
            expr_41C = loadelement:byte(stack_41C_0:byte[], var_5_2FB:int)
            storeelement:byte(var_3_2FA:byte[], var_5_2FB:int, add:int(or:int(and:int(shl:int(expr_41C:byte, xor:int(ldc:int(5188), ldc:int(5184))), ldc:int(-16)), and:int(shr:int(expr_41C:byte[expected:int], xor:int(ldc:int(9265), ldc:int(9269))), ldc:int(15))), ldc:int(119)))
            
            if (cmpne:boolean(var_5_2FB:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_CC_0 = stack_CE_0 = stack_105_0 = stack_107_0 = stack_12C_0 = stack_325_0 = stack_385_0 = stack_41C_0 = stack_470_0 = var_3_2FA:byte[]
            goto(Label_0211)
        }
        
        goto(Label_0852)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_312:int, ldc:int(16384)), ldc:int(0))) {
            var_0_312 = and:int(var_0_312:int, ldc:int(512191566))
            goto(Label_0270)
        }
        
        if (cmpeq:boolean(and:int(var_0_312:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_312 = and:int(var_0_312:int, ldc:int(-492397408))
            goto(Label_0211)
        }
        
        if (cmpne:boolean(and:int(var_0_312:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_312 = and:int(var_0_312:int, ldc:int(-1218294801))
            expr_A7 = arraylength:int(stack_A7_0:byte[])
            
            if (cmpne:boolean(expr_A7:int, ldc:int(0))) {
                var_4_2F5 = expr_A7:int
                var_3_2FA = newarray:byte[](byte.class, expr_A7:int)
                var_5_2FB = expr_A7:int
                goto(Label_0852)
            }
        }
        
        Label_0172:
        
        if (cmpeq:boolean(and:int(var_0_312:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0270)
        }
        
        if (cmpne:boolean(and:int(var_0_312:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_312:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_312 = and:int(var_0_312:int, ldc:int(426041159))
            expr_CE = arraylength:int(stack_CE_0:byte[])
            
            if (cmpne:boolean(expr_CE:int, ldc:int(0))) {
                var_4_2F5 = expr_CE:int
                var_3_2FA = newarray:byte[](byte.class, expr_CE:int)
                var_5_2FB = expr_CE:int
                goto(Label_1012)
            }
        }
        
        Label_0211:
        
        if (cmpne:boolean(and:int(var_0_312:int, ldc:int(2048)), ldc:int(0))) {
            var_0_312 = and:int(var_0_312:int, ldc:int(-1424220746))
        }
        else {
            if (cmpne:boolean(and:int(var_0_312:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0172)
            }
            
            if (cmpne:boolean(and:int(var_0_312:int, ldc:int(32768)), ldc:int(0))) {
                var_0_312 = and:int(var_0_312:int, ldc:int(-1119113273))
                goto(Label_0115)
            }
            
            var_0_312 = and:int(var_0_312:int, ldc:int(-1326089523))
            var_2_105 = stack_105_0:byte[]
            expr_109 = add:int(arraylength:int(stack_107_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_109:int, ldc:int(0))) {
                var_3_45E = newarray:byte[](byte.class, expr_109:int)
                var_5_45F = expr_109:int
                
                loop {
                    var_0_312 = and:int(var_0_312:int, ldc:int(-1108203802))
                    var_5_45F = add:int(var_5_45F:int, ldc:int(-1))
                    storeelement:byte(var_3_45E:byte[], var_5_45F:int, add:int(shl:int(loadelement:byte(stack_470_0:byte[], var_5_45F:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_105:byte[], add:int(var_5_45F:int, and:int(ldc:int(9281), ldc:int(21009)))), ldc:int(3)), and:int(ldc:int(13855), ldc:int(127)))))
                    
                    if (cmpne:boolean(var_5_45F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_CC_0 = stack_CE_0 = stack_105_0 = stack_107_0 = stack_12C_0 = stack_325_0 = stack_385_0 = stack_41C_0 = stack_470_0 = var_3_45E:byte[]
            }
        }
        
        Label_0270:
        
        if (cmpne:boolean(and:int(var_0_312:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_0211)
        }
        
        if (cmpeq:boolean(and:int(var_0_312:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_0172)
        }
        
        if (cmpne:boolean(and:int(var_0_312:int, ldc:int(64)), ldc:int(0))) {
            var_3_138 = initobject:String(String::<init>, stack_12C_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_140 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(1165), ldc:int(18957)))
            expr_14A = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(24651), ldc:int(24646)))
            storeelement:String(expr_14A:String[], xor:int(ldc:int(-24570), ldc:int(-24575)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(3977), ldc:int(-4042)), and:int(ldc:int(1967), ldc:int(25))))
            storeelement:String(expr_14A:String[], xor:int(ldc:int(4167), ldc:int(4174)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(397), ldc:int(24587)), xor:int(ldc:int(4437), ldc:int(4469))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(1039), ldc:int(8552)), invokevirtual:String[expected:String](String::substring, var_3_138:String, xor:int(ldc:int(4482), ldc:int(4514)), xor:int(ldc:int(460), ldc:int(500))))
            storeelement:String(expr_14A:String[], xor:int(ldc:int(11329), ldc:int(11335)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(56), ldc:int(22716)), xor:int(ldc:int(4), ldc:int(68))))
            storeelement:String(expr_140:String[], xor:int(ldc:int(-14839), ldc:int(-14843)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(2368), ldc:int(72)), xor:int(ldc:int(-28645), ldc:int(-28595))))
            storeelement:String(expr_14A:String[], xor:int(ldc:int(9257), ldc:int(9259)), invokevirtual:String[expected:String](String::substring, var_3_138:String, xor:int(ldc:int(531), ldc:int(581)), xor:int(ldc:int(8595), ldc:int(8694))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(29361), ldc:int(-29426)), invokevirtual:String[expected:String](String::substring, var_3_138:String, xor:int(ldc:int(93), ldc:int(56)), xor:int(ldc:int(24), ldc:int(108))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(8583), ldc:int(16451)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(20732), ldc:int(887)), xor:int(ldc:int(12365), ldc:int(12484))))
            storeelement:String(expr_140:String[], xor:int(ldc:int(9732), ldc:int(9742)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(13225), ldc:int(19657)), and:int(ldc:int(163), ldc:int(5282))))
            storeelement:String(expr_140:String[], and:int(ldc:int(13323), ldc:int(843)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(163), ldc:int(25838)), and:int(ldc:int(18615), ldc:int(5822))))
            storeelement:String(expr_14A:String[], xor:int(ldc:int(2114), ldc:int(2118)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(8375), ldc:int(21182)), xor:int(ldc:int(10618), ldc:int(10673))))
            storeelement:String(expr_14A:String[], xor:int(ldc:int(12808), ldc:int(12813)), invokevirtual:String[expected:String](String::substring, var_3_138:String, and:int(ldc:int(22731), ldc:int(507)), and:int(ldc:int(213), ldc:int(1492))))
            storeelement:String(expr_14A:String[], and:int(ldc:int(291), ldc:int(16585)), invokevirtual:String[expected:String](String::substring, var_3_138:String, xor:int(ldc:int(17787), ldc:int(17839)), and:int(ldc:int(10495), ldc:int(1244))))
            putstatic:String[](\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u64ab\u5fe1\u92ee\u7e3f\ub19c\uc910, expr_14A:String[])
            var_3_2B5 = expr_140:String[]
            putstatic:ITextComponent(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u56bd\ub1b9\u40a9\u8308\u8350\uc4d2, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_2B5:String[], xor:int(ldc:int(4112), ldc:int(4122)))))
            putstatic:ITextComponent(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u7ce1\u759a\ud51e\u4daf\ub6ab\u4e72, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_2B5:String[], and:int(ldc:int(107), ldc:int(523)))))
            putstatic:ITextComponent(\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9::\u3c25\u56bd\u494c\u3bc9\u51fa\u72f1, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_2B5:String[], and:int(ldc:int(16653), ldc:int(2172)))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_695 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_6A0 : int
        
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
        var_3_695 = and:int(ldc:int(1925223280), ldc:int(-4130894))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3e2a\u92ee\uae87\u4e72\u6cfe\u67e9[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_695 = and:int(var_3_695:int, ldc:int(1927651242))
            var_5_80 = and:int(ldc:int(-27799), ldc:int(27782))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12604), ldc:int(8491)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_695:int, ldc:int(-76492881))
                    var_9_BD = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_87:int, xor:int(ldc:int(2560), ldc:int(2561)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, xor:int(ldc:int(-28536), ldc:int(-28535)))), var_7_96:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_695 = and:int(var_3_CF:int, ldc:int(2120402737))
                    var_14_10A = var_7_96:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(18176), ldc:int(18177)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_87:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(32)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-53046313))
                        goto(Label_1272)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1241290815))
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(2)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(702772135))
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0699)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(54241730))
                        goto(Label_0592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(128)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-143933650))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0592)
                            }
                            
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0399:
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1834481457))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(256)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1604465989))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(256)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1523701174))
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1707816566))
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1482536771))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(4)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(564922699))
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-290869721))
                        goto(Label_0699)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(32)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-68365400))
                            var_11_E0 = and:int(ldc:int(-5759), ldc:int(636))
                            goto(Label_1553)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0592:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(4)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-557816204))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1985868384))
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(-210988051))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0699:
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(256)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(29886732))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1158742496))
                        goto(Label_0961)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(192824545))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(2012995568))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0822:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(2077261415))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(512)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-2000893177))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-907547767))
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(512)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(1083975537))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(950272801))
                            goto(Label_0699)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1883889261))
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(-77735947))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E0 = xor:int(ldc:int(72), ldc:int(73))
                                goto(Label_1129)
                            }
                        }
                    }
                    
                    Label_0961:
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(128)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1017278549))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(512)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(396939007))
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(128)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1534134433))
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0699)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-1384400948))
                            goto(Label_0592)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1774812552))
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(-161093852))
                        var_11_E0 = and:int(ldc:int(-4382), ldc:int(4377))
                    }
                    
                    Label_1129:
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(128)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-119489866))
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(2009491717))
                            goto(Label_0961)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1235922727))
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(2)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(1082459682))
                            goto(Label_0699)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(128)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(986032839))
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-14291304))
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(-19290120))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1272:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(2)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(2137927351))
                            goto(Label_1129)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0961)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-1193843225))
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0699)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0592)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0399)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(128)), ldc:int(0))) {
                            var_3_695 = and:int(var_3_695:int, ldc:int(-241737346))
                            loopcontinue()
                        }
                        
                        var_3_695 = and:int(var_3_695:int, ldc:int(2067897250))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_80:int, var_16_10E:int)
                        goto(Label_1553)
                    }
                    
                    Label_1398:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1564)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(500537910))
                        goto(Label_1272)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-637954212))
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1214367206))
                        goto(Label_0699)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1561113081))
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(956421717))
                        goto(Label_0399)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-1006139993))
                        loopcontinue()
                    }
                    
                    var_3_695 = and:int(var_3_695:int, ldc:int(-9464014))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1553:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A0 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1564:
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(256)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-542589326))
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-308109471))
                        goto(Label_1129)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0961)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(-361111298))
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(512)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(852334482))
                        goto(Label_0699)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(256186543))
                        goto(Label_0592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_695:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0399)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_695:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_695 = and:int(var_3_695:int, ldc:int(2078014386))
                        var_17_6A0 = add:int(var_16_10E:int, and:int(ldc:int(401), ldc:int(5153)))
                        looporswitchbreak()
                    }
                }
                
                var_3_695 = and:int(var_3_695:int, ldc:int(1985448870))
                
                if (cmple:boolean(var_5_80 = var_17_6A0:int, sub:int(var_6_87:int, xor:int(ldc:int(326), ldc:int(327))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_695:int, ldc:int(512)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
