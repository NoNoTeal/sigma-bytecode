public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\uae87\u4492\u5db4\u0b8e\u4c04 {
    public void \uae87\u4492\u5db4\u0b8e\u4c04(long p0, int p1, \ub113\ufcaf\u3c25\u071d\u97b7.\u8cae\u71ae\u2dcc\u5db4\u4f52 p2, \u51fa\u12cb\u7330\u74b1\u6c52.\u527a\ucfaf\u34df\u4e72\u5fe1\u873d p3, java.lang.Runnable p4) {
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
            invokespecial:\u99f7\u7006\u6198\u47c2\ub1b9\u12cb(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::<init>, this:\uae87\u4492\u5db4\u0b8e\u4c04)
            putfield:ITextComponent(\uae87\u4492\u5db4\u0b8e\u4c04::\u4975\uc3e3\u385b\u3dd3\u8cae\u836c, this:\uae87\u4492\u5db4\u0b8e\u4c04, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873), and:int(ldc:int(-32072), ldc:int(27972)))))
            putfield:boolean(\uae87\u4492\u5db4\u0b8e\u4c04::\uc2bd\uc9f6\uafe7\uc4d2\uc7fe\ud217, this:\uae87\u4492\u5db4\u0b8e\u4c04, and:int[expected:boolean](ldc:int(97), ldc:int(1177)))
            putfield:long(\uae87\u4492\u5db4\u0b8e\u4c04::\u74b1\u6b5f\u67d0\ubded\u8aa5\u3504, this:\uae87\u4492\u5db4\u0b8e\u4c04, p0:long)
            putfield:int(\uae87\u4492\u5db4\u0b8e\u4c04::\u97e6\ucfaf\u839e\u6c52\ufcaf\u759a, this:\uae87\u4492\u5db4\u0b8e\u4c04, p1:int)
            putfield:\u8cae\u71ae\u2dcc\u5db4\u4f52(\uae87\u4492\u5db4\u0b8e\u4c04::\u0a06\u8753\ua3b4\u0c95\u4f52\u983f, this:\uae87\u4492\u5db4\u0b8e\u4c04, p2:\u8cae\u71ae\u2dcc\u5db4\u4f52)
            putfield:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d(\uae87\u4492\u5db4\u0b8e\u4c04::\u8413\u4179\u3504\uc31c\uc238\u67d0, this:\uae87\u4492\u5db4\u0b8e\u4c04, p3:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d)
            putfield:\uc246\ud171\u8709\u6435\u416d(\uae87\u4492\u5db4\u0b8e\u4c04::\u8350\u759a\ufe34\ubff1\uc238\u40a9, this:\uae87\u4492\u5db4\u0b8e\u4c04, initobject:\uc246\ud171\u8709\u6435\u416d(\uc246\ud171\u8709\u6435\u416d::<init>))
            putfield:RateLimiter(\uae87\u4492\u5db4\u0b8e\u4c04::\uc246\ud158\u99f7\u64f2\u5f50\u6c52, this:\uae87\u4492\u5db4\u0b8e\u4c04, invokestatic:RateLimiter(RateLimiter::create, ldc:double(0.10000000149011612)))
            putfield:Runnable(\uae87\u4492\u5db4\u0b8e\u4c04::\ud4fe\u647c\ucfaf\u839e\u67d0\u7bad, this:\uae87\u4492\u5db4\u0b8e\u4c04, p4:Runnable)
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
    
    public void \u760c\ud51e\u3e2a\uc910\uc7fe\u71ae() {
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
            invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u7bad\ub171\u61a4\ubff1\u6d69\u6cfe, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uae87\u4492\u5db4\u0b8e\u4c04::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\uae87\u4492\u5db4\u0b8e\u4c04)), and:int[expected:boolean](ldc:int(-4566), ldc:int(4561)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ub83f\ubefe\u3d64\u99f7\u071d\uc31c() {
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
            invokeinterface:void(Runnable::run, getfield:Runnable(\uae87\u4492\u5db4\u0b8e\u4c04::\ud4fe\u647c\ucfaf\u839e\u67d0\u7bad, this:\uae87\u4492\u5db4\u0b8e\u4c04))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ub70c\u97b7\u7049\ubded\u3a62\uc7fe() {
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
            putfield:boolean(\uae87\u4492\u5db4\u0b8e\u4c04::\u4cd9\u36d3\u7330\u416d\ub18d\ua61f, this:\uae87\u4492\u5db4\u0b8e\u4c04, and:int[expected:boolean](ldc:int(2401), ldc:int(1035)))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uae87\u4492\u5db4\u0b8e\u4c04::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\uae87\u4492\u5db4\u0b8e\u4c04), getfield:\u8cae\u71ae\u2dcc\u5db4\u4f52[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\uae87\u4492\u5db4\u0b8e\u4c04::\u0a06\u8753\ua3b4\u0c95\u4f52\u983f, this:\uae87\u4492\u5db4\u0b8e\u4c04))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc229\u3a62\u12cb\ud51e\uafe7\u8308(int p0, int p1, int p2) {
        var_4_B1 : int
        
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
            var_4_B1 = and:int(ldc:int(-77691227), ldc:int(2067723893))
            
            if (cmpeq:boolean(p0:int, and:int(ldc:int(6400), ldc:int(328)))) {
                if (logicalnot:boolean(getfield:boolean(\uae87\u4492\u5db4\u0b8e\u4c04::\uc2bd\uc9f6\uafe7\uc4d2\uc7fe\ud217, this:\uae87\u4492\u5db4\u0b8e\u4c04))) {
                    goto(Label_0154)
                }
                
                invokespecial:void(\uae87\u4492\u5db4\u0b8e\u4c04::\ub70c\u97b7\u7049\ubded\u3a62\uc7fe, this:\uae87\u4492\u5db4\u0b8e\u4c04)
                return:boolean(xor:int[expected:boolean](ldc:int(4121), ldc:int(4120)))
            }
            
            Label_0110:
            
            if (cmpeq:boolean(and:int(var_4_B1:int, ldc:int(67108864)), ldc:int(0))) {
                return:boolean(invokespecial:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\uae87\u4492\u5db4\u0b8e\u4c04[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:int, p1:int, p2:int))
            }
            
            var_4_B1 = and:int(var_4_B1:int, ldc:int(-1579535871))
            Label_0154:
            
            if (cmpeq:boolean(and:int(var_4_B1:int, ldc:int(262144)), ldc:int(0))) {
                var_4_B1 = and:int(var_4_B1:int, ldc:int(913793005))
                goto(Label_0110)
            }
            
            var_4_B1 = and:int(var_4_B1:int, ldc:int(-603994271))
            invokespecial:void(\uae87\u4492\u5db4\u0b8e\u4c04::\ub83f\ubefe\u3d64\u99f7\u071d\uc31c, this:\uae87\u4492\u5db4\u0b8e\u4c04)
            return:boolean(xor:int[expected:boolean](ldc:int(4121), ldc:int(4120)))
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_5_61 : int
        var_7_1E6 : int
        
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
            var_5_61 = and:int(ldc:int(777627770), ldc:int(-1495650692))
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\uae87\u4492\u5db4\u0b8e\u4c04[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            
            if (logicalnot:boolean(getfield:boolean(\uae87\u4492\u5db4\u0b8e\u4c04::\ud158\u8308\u927d\u5f50\u51b2\u6c56, this:\uae87\u4492\u5db4\u0b8e\u4c04))) {
                if (cmpne:boolean(getfield:long(\uc246\ud171\u8709\u6435\u416d::\uc2bd\u120d\u4e72\ub8be\u12b2\u5245, getfield:\uc246\ud171\u8709\u6435\u416d(\uae87\u4492\u5db4\u0b8e\u4c04::\u8350\u759a\ufe34\ubff1\uc238\u40a9, this:\uae87\u4492\u5db4\u0b8e\u4c04)), ldc:long(0L))) {
                    if (cmpeq:boolean(getfield:long(\uc246\ud171\u8709\u6435\u416d::\uc2bd\u120d\u4e72\ub8be\u12b2\u5245, getfield:\uc246\ud171\u8709\u6435\u416d(\uae87\u4492\u5db4\u0b8e\u4c04::\u8350\u759a\ufe34\ubff1\uc238\u40a9, this:\uae87\u4492\u5db4\u0b8e\u4c04)), getfield:long(\uc246\ud171\u8709\u6435\u416d::\u6d99\u4179\u718f\ua562\uc2e8\u6198, getfield:\uc246\ud171\u8709\u6435\u416d(\uae87\u4492\u5db4\u0b8e\u4c04::\u8350\u759a\ufe34\ubff1\uc238\u40a9, this:\uae87\u4492\u5db4\u0b8e\u4c04)))) {
                        putfield:ITextComponent(\uae87\u4492\u5db4\u0b8e\u4c04::\u4975\uc3e3\u385b\u3dd3\u8cae\u836c, this:\uae87\u4492\u5db4\u0b8e\u4c04, getstatic:ITextComponent(\uae87\u4492\u5db4\u0b8e\u4c04::\u836c\u9033\u120d\u8640\ub18d\ud523))
                        putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\uae87\u4492\u5db4\u0b8e\u4c04::\u0800\u8753\ub6ab\ua068\u4e72\ud4fe, this:\uae87\u4492\u5db4\u0b8e\u4c04), and:int[expected:boolean](ldc:int(-9736), ldc:int(9735)))
                    }
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0315)
                }
                
                if (cmpne:boolean(and:int(var_5_61:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0251)
                }
                
                if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(256)), ldc:int(0))) {
                    var_5_61 = and:int(var_5_61:int, ldc:int(654158687))
                    invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uae87\u4492\u5db4\u0b8e\u4c04::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\uae87\u4492\u5db4\u0b8e\u4c04), getfield:ITextComponent(\uae87\u4492\u5db4\u0b8e\u4c04::\u4975\uc3e3\u385b\u3dd3\u8cae\u836c, this:\uae87\u4492\u5db4\u0b8e\u4c04), div:int(getfield:int(\uae87\u4492\u5db4\u0b8e\u4c04::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\uae87\u4492\u5db4\u0b8e\u4c04), xor:int(ldc:int(2581), ldc:int(2583))), ldc:int(50), ldc:int(16777215))
                    
                    if (getfield:boolean(\uae87\u4492\u5db4\u0b8e\u4c04::\uc2bd\uc9f6\uafe7\uc4d2\uc7fe\ud217, this:\uae87\u4492\u5db4\u0b8e\u4c04)) {
                        invokespecial:void(\uae87\u4492\u5db4\u0b8e\u4c04::\u4179\uae87\uae87\u64f2\u1833\uc31c, this:\uae87\u4492\u5db4\u0b8e\u4c04, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                    }
                }
                
                Label_0182:
                
                if (cmpne:boolean(and:int(var_5_61:int, ldc:int(1073741824)), ldc:int(0))) {
                    goto(Label_0315)
                }
                
                if (cmpne:boolean(and:int(var_5_61:int, ldc:int(512)), ldc:int(0))) {
                    var_5_61 = and:int(var_5_61:int, ldc:int(-1852597072))
                }
                else {
                    if (cmpne:boolean(and:int(var_5_61:int, ldc:int(256)), ldc:int(0))) {
                        var_5_61 = and:int(var_5_61:int, ldc:int(-839530110))
                        loopcontinue()
                    }
                    
                    var_5_61 = and:int(var_5_61:int, ldc:int(-403015173))
                    
                    if (cmpne:boolean(getfield:long(\uc246\ud171\u8709\u6435\u416d::\uc2bd\u120d\u4e72\ub8be\u12b2\u5245, getfield:\uc246\ud171\u8709\u6435\u416d(\uae87\u4492\u5db4\u0b8e\u4c04::\u8350\u759a\ufe34\ubff1\uc238\u40a9, this:\uae87\u4492\u5db4\u0b8e\u4c04)), ldc:long(0L))) {
                        if (logicalnot:boolean(getfield:boolean(\uae87\u4492\u5db4\u0b8e\u4c04::\u4cd9\u36d3\u7330\u416d\ub18d\ua61f, this:\uae87\u4492\u5db4\u0b8e\u4c04))) {
                            invokespecial:void(\uae87\u4492\u5db4\u0b8e\u4c04::\u7873\u3dd3\u8c8a\uafe7\uc87f\u3e75, this:\uae87\u4492\u5db4\u0b8e\u4c04, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                            invokespecial:void(\uae87\u4492\u5db4\u0b8e\u4c04::\ube23\ud36e\ubded\u516c\ud51e\u8413, this:\uae87\u4492\u5db4\u0b8e\u4c04, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
                        }
                    }
                }
                
                Label_0251:
                
                if (cmpne:boolean(and:int(var_5_61:int, ldc:int(131072)), ldc:int(0))) {
                    var_5_61 = and:int(var_5_61:int, ldc:int(69243478))
                }
                else {
                    if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(2048)), ldc:int(0))) {
                        var_5_61 = and:int(var_5_61:int, ldc:int(1302489891))
                        goto(Label_0182)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_5_61 = and:int(var_5_61:int, ldc:int(2004483804))
                    
                    if (cmpne:boolean(getfield:ITextComponent[](\uae87\u4492\u5db4\u0b8e\u4c04::\u6bb9\u3c25\u7e3f\u0a06\ufe34\u873d, this:\uae87\u4492\u5db4\u0b8e\u4c04), aconstnull:ITextComponent[]())) {
                        var_7_1E6 = and:int(ldc:int(-30227), ldc:int(30226))
                        
                        loop {
                            var_5_61 = and:int(var_5_61:int, ldc:int(939366621))
                            
                            if (cmpge:boolean(var_7_1E6:int, arraylength:int(getfield:ITextComponent[](\uae87\u4492\u5db4\u0b8e\u4c04::\u6bb9\u3c25\u7e3f\u0a06\ufe34\u873d, this:\uae87\u4492\u5db4\u0b8e\u4c04)))) {
                                looporswitchbreak()
                            }
                            
                            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uae87\u4492\u5db4\u0b8e\u4c04::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\uae87\u4492\u5db4\u0b8e\u4c04), loadelement:ITextComponent(getfield:ITextComponent[](\uae87\u4492\u5db4\u0b8e\u4c04::\u6bb9\u3c25\u7e3f\u0a06\ufe34\u873d, this:\uae87\u4492\u5db4\u0b8e\u4c04), var_7_1E6:int), div:int(getfield:int(\uae87\u4492\u5db4\u0b8e\u4c04::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\uae87\u4492\u5db4\u0b8e\u4c04), and:int(ldc:int(7170), ldc:int(715))), add:int(ldc:int(110), mul:int(ldc:int(12), var_7_1E6:int)), ldc:int(16711680))
                            inc:int(var_7_1E6, ldc:int(1))
                        }
                    }
                }
                
                Label_0315:
                
                if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0251)
                }
                
                if (cmpne:boolean(and:int(var_5_61:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_0182)
                }
                
                if (cmpeq:boolean(and:int(var_5_61:int, ldc:int(256)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\uae87\u4492\u5db4\u0b8e\u4c04[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4179\uae87\uae87\u64f2\u1833\uc31c(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0) {
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
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u071d\u6198\ud12e\uc229\u93a2\ua6bd, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uae87\u4492\u5db4\u0b8e\u4c04::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\uae87\u4492\u5db4\u0b8e\u4c04), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u3504\ud158\ub8be\uc3e3\u4daf\ud523), rem:int(div:int(getfield:int(\uae87\u4492\u5db4\u0b8e\u4c04::\u8aa5\uc229\u873d\u88c5\u97e6\u3e75, this:\uae87\u4492\u5db4\u0b8e\u4c04), ldc:int(10)), arraylength:int(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u3504\ud158\ub8be\uc3e3\u4daf\ud523)))), i2f:float(add:int(add:int(div:int(getfield:int(\uae87\u4492\u5db4\u0b8e\u4c04::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\uae87\u4492\u5db4\u0b8e\u4c04), xor:int(ldc:int(-31230), ldc:int(-31232))), div:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ucb79\ua3b4\u946b\uc246\ua068\u36d3, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uae87\u4492\u5db4\u0b8e\u4c04::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\uae87\u4492\u5db4\u0b8e\u4c04), getfield:ITextComponent[expected:ITextProperties](\uae87\u4492\u5db4\u0b8e\u4c04::\u4975\uc3e3\u385b\u3dd3\u8cae\u836c, this:\uae87\u4492\u5db4\u0b8e\u4c04)), xor:int(ldc:int(-28479), ldc:int(-28477)))), xor:int(ldc:int(2179), ldc:int(2182)))), ldc:float(50.0f), ldc:int(16777215))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u7873\u3dd3\u8c8a\uafe7\uc87f\u3e75(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0) {
        var_4_77 : double
        stack_A4_0 : Locale [generated]
        stack_A4_1 : String [generated]
        expr_8F : Object[] [generated]
        var_6_C4 : double
        var_10_CE : \ub6ab\u8cae\u64ab\u5245\ubff1\u3711
        var_11_D5 : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        
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
            var_4_77 = invokestatic:double(Math::min, div:double(l2d:double(getfield:long(\uc246\ud171\u8709\u6435\u416d::\uc2bd\u120d\u4e72\ub8be\u12b2\u5245, getfield:\uc246\ud171\u8709\u6435\u416d(\uae87\u4492\u5db4\u0b8e\u4c04::\u8350\u759a\ufe34\ubff1\uc238\u40a9, this:\uae87\u4492\u5db4\u0b8e\u4c04))), l2d:double(getfield:long(\uc246\ud171\u8709\u6435\u416d::\u6d99\u4179\u718f\ua562\uc2e8\u6198, getfield:\uc246\ud171\u8709\u6435\u416d(\uae87\u4492\u5db4\u0b8e\u4c04::\u8350\u759a\ufe34\ubff1\uc238\u40a9, this:\uae87\u4492\u5db4\u0b8e\u4c04)))), ldc:double(1.0))
            stack_A4_0 = getstatic:Locale(Locale::ROOT)
            stack_A4_1 = loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873), xor:int(ldc:int(9732), ldc:int(9733)))
            expr_8F = newarray:Object[](java.lang.Object.class, and:int(ldc:int(8321), ldc:int(4371)))
            storeelement:Object(expr_8F:Object[], and:int(ldc:int(20424), ldc:int(-20425)), invokestatic:Double[expected:Object](Double::valueOf, mul:double(var_4_77:double, ldc:double(100.0))))
            putfield:String(\uae87\u4492\u5db4\u0b8e\u4c04::\uc29a\u12b2\u7c6b\ub1b9\u62da\u4d85, this:\uae87\u4492\u5db4\u0b8e\u4c04, invokestatic:String(String::format, stack_A4_0:Locale, stack_A4_1:String, expr_8F:Object[]))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe)
            var_6_C4 = i2d:double(sub:int(div:int(getfield:int(\uae87\u4492\u5db4\u0b8e\u4c04::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\uae87\u4492\u5db4\u0b8e\u4c04), xor:int(ldc:int(8256), ldc:int(8258))), ldc:int(100)))
            var_10_CE = invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f)
            var_11_D5 = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, var_10_CE:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
            invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_11_D5:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u40a9\u8709\ud523\ub171\u446c\u7e3f))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_11_D5:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], sub:double(var_6_C4:double, ldc:double(0.5)), ldc:double(95.5), ldc:double(0.0)), and:int(ldc:int(505), ldc:int(18139)), and:int(ldc:int(31959), ldc:int(978)), xor:int(ldc:int(4609), ldc:int(4819)), xor:int(ldc:int(-23923), ldc:int(-23950))))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_11_D5:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], add:double(add:double(var_6_C4:double, mul:double(ldc:double(200.0), var_4_77:double)), ldc:double(0.5)), ldc:double(95.5), ldc:double(0.0)), and:int(ldc:int(735), ldc:int(29913)), and:int(ldc:int(211), ldc:int(22738)), xor:int(ldc:int(8313), ldc:int(8363)), and:int(ldc:int(255), ldc:int(16639))))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_11_D5:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], add:double(add:double(var_6_C4:double, mul:double(ldc:double(200.0), var_4_77:double)), ldc:double(0.5)), ldc:double(79.5), ldc:double(0.0)), xor:int(ldc:int(2057), ldc:int(2256)), xor:int(ldc:int(934), ldc:int(884)), and:int(ldc:int(25822), ldc:int(5106)), xor:int(ldc:int(8473), ldc:int(8678))))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_11_D5:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], sub:double(var_6_C4:double, ldc:double(0.5)), ldc:double(79.5), ldc:double(0.0)), and:int(ldc:int(24795), ldc:int(3545)), xor:int(ldc:int(683), ldc:int(633)), and:int(ldc:int(1746), ldc:int(4574)), xor:int(ldc:int(13393), ldc:int(13486))))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_11_D5:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_6_C4:double, ldc:double(95.0), ldc:double(0.0)), and:int(ldc:int(5017), ldc:int(2178)), and:int(ldc:int(24704), ldc:int(3714)), xor:int(ldc:int(5669), ldc:int(5797)), xor:int(ldc:int(147), ldc:int(108))))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_11_D5:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], add:double(var_6_C4:double, mul:double(ldc:double(200.0), var_4_77:double)), ldc:double(95.0), ldc:double(0.0)), xor:int(ldc:int(2318), ldc:int(2446)), and:int(ldc:int(19585), ldc:int(412)), and:int(ldc:int(9360), ldc:int(130)), xor:int(ldc:int(16), ldc:int(239))))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_11_D5:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], add:double(var_6_C4:double, mul:double(ldc:double(200.0), var_4_77:double)), ldc:double(80.0), ldc:double(0.0)), and:int(ldc:int(2432), ldc:int(662)), xor:int(ldc:int(4636), ldc:int(4764)), xor:int(ldc:int(-31704), ldc:int(-31576)), xor:int(ldc:int(16970), ldc:int(17077))))
            invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_11_D5:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], var_6_C4:double, ldc:double(80.0), ldc:double(0.0)), and:int(ldc:int(16528), ldc:int(3520)), and:int(ldc:int(10432), ldc:int(17824)), xor:int(ldc:int(3150), ldc:int(3278)), xor:int(ldc:int(8252), ldc:int(8387))))
            invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_10_CE:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u9255\u59ec\ube23\u64f2\ub32d)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uae87\u4492\u5db4\u0b8e\u4c04::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\uae87\u4492\u5db4\u0b8e\u4c04), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\uae87\u4492\u5db4\u0b8e\u4c04::\uc29a\u12b2\u7c6b\ub1b9\u62da\u4d85, this:\uae87\u4492\u5db4\u0b8e\u4c04)), loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873), and:int(ldc:int(8466), ldc:int(1027))))), div:int(getfield:int(\uae87\u4492\u5db4\u0b8e\u4c04::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\uae87\u4492\u5db4\u0b8e\u4c04), xor:int(ldc:int(10784), ldc:int(10786))), ldc:int(84), ldc:int(16777215))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ube23\ud36e\ubded\u516c\ud51e\u8413(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0) {
        var_2_E0 : int
        var_4_D2 : long
        
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
            var_2_E0 = and:int(ldc:int(-1896292324), ldc:int(-269571414))
            
            if (cmpeq:boolean(rem:int(getfield:int(\uae87\u4492\u5db4\u0b8e\u4c04::\u8aa5\uc229\u873d\u88c5\u97e6\u3e75, this:\uae87\u4492\u5db4\u0b8e\u4c04), ldc:int(20)), ldc:int(0))) {
                if (cmpeq:boolean(getfield:Long(\uae87\u4492\u5db4\u0b8e\u4c04::\ud171\u4179\u4975\ub102\u8709\u8350, this:\uae87\u4492\u5db4\u0b8e\u4c04), aconstnull:Long())) {
                    goto(Label_0145)
                }
                
                var_4_D2 = sub:long(invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52), invokevirtual:long(Long::longValue, getfield:Long(\uae87\u4492\u5db4\u0b8e\u4c04::\uf995\u071d\u47c2\u92ee\u56bd\u76bc, this:\uae87\u4492\u5db4\u0b8e\u4c04)))
                
                if (cmpeq:boolean(var_4_D2:long, ldc:long(0L))) {
                    var_4_D2 = ldc:long(1L)
                }
                
                var_2_E0 = and:int(var_2_E0:int, ldc:int(-320309818))
                invokespecial:void(\uae87\u4492\u5db4\u0b8e\u4c04::\u3bc9\ub102\u69d9\uf995\u4f4a\uf9c5, this:\uae87\u4492\u5db4\u0b8e\u4c04, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, putfield:long(\uae87\u4492\u5db4\u0b8e\u4c04::\u74b1\u6b5f\ub8be\u0800\ucfaf\uceb8, this:\uae87\u4492\u5db4\u0b8e\u4c04, div:long(mul:long(ldc:long(1000L), sub:long(getfield:long(\uc246\ud171\u8709\u6435\u416d::\uc2bd\u120d\u4e72\ub8be\u12b2\u5245, getfield:\uc246\ud171\u8709\u6435\u416d(\uae87\u4492\u5db4\u0b8e\u4c04::\u8350\u759a\ufe34\ubff1\uc238\u40a9, this:\uae87\u4492\u5db4\u0b8e\u4c04)), invokevirtual:long(Long::longValue, getfield:Long(\uae87\u4492\u5db4\u0b8e\u4c04::\ud171\u4179\u4975\ub102\u8709\u8350, this:\uae87\u4492\u5db4\u0b8e\u4c04)))), var_4_D2:long)))
                goto(Label_0145)
            }
            
            Label_0108:
            
            if (cmpne:boolean(and:int(var_2_E0:int, ldc:int(8388608)), ldc:int(0))) {
                invokespecial:void(\uae87\u4492\u5db4\u0b8e\u4c04::\u3bc9\ub102\u69d9\uf995\u4f4a\uf9c5, this:\uae87\u4492\u5db4\u0b8e\u4c04, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:long(\uae87\u4492\u5db4\u0b8e\u4c04::\u74b1\u6b5f\ub8be\u0800\ucfaf\uceb8, this:\uae87\u4492\u5db4\u0b8e\u4c04))
                return:void()
            }
            
            Label_0145:
            
            if (cmpeq:boolean(and:int(var_2_E0:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_E0 = and:int(var_2_E0:int, ldc:int(795052206))
                goto(Label_0108)
            }
            
            putfield:Long(\uae87\u4492\u5db4\u0b8e\u4c04::\ud171\u4179\u4975\ub102\u8709\u8350, this:\uae87\u4492\u5db4\u0b8e\u4c04, invokestatic:Long(Long::valueOf, getfield:long(\uc246\ud171\u8709\u6435\u416d::\uc2bd\u120d\u4e72\ub8be\u12b2\u5245, getfield:\uc246\ud171\u8709\u6435\u416d(\uae87\u4492\u5db4\u0b8e\u4c04::\u8350\u759a\ufe34\ubff1\uc238\u40a9, this:\uae87\u4492\u5db4\u0b8e\u4c04))))
            putfield:Long(\uae87\u4492\u5db4\u0b8e\u4c04::\uf995\u071d\u47c2\u92ee\u56bd\u76bc, this:\uae87\u4492\u5db4\u0b8e\u4c04, invokestatic:Long(Long::valueOf, invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3bc9\ub102\u69d9\uf995\u4f4a\uf9c5(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, long p1) {
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
            
            if (cmpgt:boolean(p1:long, ldc:long(0L))) {
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u071d\u6198\ud12e\uc229\u93a2\ua6bd, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uae87\u4492\u5db4\u0b8e\u4c04::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\uae87\u4492\u5db4\u0b8e\u4c04), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873), and:int(ldc:int(6299), ldc:int(24611)))), invokestatic:String(\u51fa\ubb2b\u97b7\u99f7\u3c25\ub83f::\ubb2b\u3c25\u12cb\ud36e\u0b8e\u8413, p1:long)), loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873), and:int(ldc:int(16646), ldc:int(3268))))), i2f:float(add:int(add:int(div:int(getfield:int(\uae87\u4492\u5db4\u0b8e\u4c04::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\uae87\u4492\u5db4\u0b8e\u4c04), xor:int(ldc:int(-30686), ldc:int(-30688))), div:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6435\u516c\u873d\u88c5\u3d4b\u1187, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uae87\u4492\u5db4\u0b8e\u4c04::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\uae87\u4492\u5db4\u0b8e\u4c04), getfield:String(\uae87\u4492\u5db4\u0b8e\u4c04::\uc29a\u12b2\u7c6b\ub1b9\u62da\u4d85, this:\uae87\u4492\u5db4\u0b8e\u4c04)), and:int(ldc:int(162), ldc:int(3866)))), ldc:int(15))), ldc:float(84.0f), ldc:int(16777215))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u759a\uc87f\u5140\ud36e\u12cb\ubcb0() {
        var_1_61 : int
        var_3_A3 : ArrayList
        var_1_C0 : int
        
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
            var_1_61 = and:int(ldc:int(1022727195), ldc:int(1607943237))
            invokespecial:void(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\u759a\uc87f\u5140\ud36e\u12cb\ubcb0, this:\uae87\u4492\u5db4\u0b8e\u4c04[expected:\u99f7\u7006\u6198\u47c2\ub1b9\u12cb])
            putfield:int(\uae87\u4492\u5db4\u0b8e\u4c04::\u8aa5\uc229\u873d\u88c5\u97e6\u3e75, this:\uae87\u4492\u5db4\u0b8e\u4c04, add:int(getfield:int(\uae87\u4492\u5db4\u0b8e\u4c04::\u8aa5\uc229\u873d\u88c5\u97e6\u3e75, this:\uae87\u4492\u5db4\u0b8e\u4c04), xor:int(ldc:int(16901), ldc:int(16900))))
            
            if (cmpne:boolean(getfield:ITextComponent(\uae87\u4492\u5db4\u0b8e\u4c04::\u4975\uc3e3\u385b\u3dd3\u8cae\u836c, this:\uae87\u4492\u5db4\u0b8e\u4c04), aconstnull:ITextComponent())) {
                if (invokevirtual:boolean(RateLimiter::tryAcquire, getfield:RateLimiter(\uae87\u4492\u5db4\u0b8e\u4c04::\uc246\ud158\u99f7\u64f2\u5f50\u6c52, this:\uae87\u4492\u5db4\u0b8e\u4c04), and:int(ldc:int(257), ldc:int(1089)))) {
                    var_3_A3 = invokestatic:ArrayList(Lists::newArrayList)
                    invokeinterface:boolean(List<String>::add, var_3_A3:ArrayList<String>[expected:List<String>], invokeinterface:String(ITextComponent::getString, getfield:ITextComponent(\uae87\u4492\u5db4\u0b8e\u4c04::\u4975\uc3e3\u385b\u3dd3\u8cae\u836c, this:\uae87\u4492\u5db4\u0b8e\u4c04)))
                    
                    if (cmpne:boolean(getfield:String(\uae87\u4492\u5db4\u0b8e\u4c04::\uc29a\u12b2\u7c6b\ub1b9\u62da\u4d85, this:\uae87\u4492\u5db4\u0b8e\u4c04), aconstnull:String())) {
                        invokeinterface:boolean(List<String>::add, var_3_A3:ArrayList<String>[expected:List<String>], invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), getfield:String(\uae87\u4492\u5db4\u0b8e\u4c04::\uc29a\u12b2\u7c6b\ub1b9\u62da\u4d85, this:\uae87\u4492\u5db4\u0b8e\u4c04)), loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873), xor:int(ldc:int(50), ldc:int(55))))))
                    }
                    
                    var_1_C0 = and:int(var_1_61:int, ldc:int(-48444209))
                    
                    if (cmpne:boolean(getfield:ITextComponent[](\uae87\u4492\u5db4\u0b8e\u4c04::\u6bb9\u3c25\u7e3f\u0a06\ufe34\u873d, this:\uae87\u4492\u5db4\u0b8e\u4c04), aconstnull:ITextComponent[]())) {
                        invokeinterface:void(Stream<Object>::forEach, invokeinterface:Stream<Object>(Stream<ITextComponent>::map, invokestatic:Stream<ITextComponent>(Stream<T>::of, getfield:ITextComponent[](\uae87\u4492\u5db4\u0b8e\u4c04::\u6bb9\u3c25\u7e3f\u0a06\ufe34\u873d, this:\uae87\u4492\u5db4\u0b8e\u4c04)), invokedynamic:Function<? super ITextComponent, String>(apply:()Ljava/util/function/Function;)), invokedynamic:Consumer<Object>(accept:(Ljava/util/List;)Ljava/util/function/Consumer;, var_3_A3:ArrayList<? extends CharSequence>))
                    }
                    
                    var_1_61 = and:int(var_1_C0:int, ldc:int(-1651188831))
                    invokestatic:void(\u494c\u5d20\u759a\ua61f\u7006\u7049::\u071d\u59ec\u88c5\u74b1\u98a4\ud523, invokestatic:String(String::join, invokestatic:String[expected:CharSequence](System::lineSeparator), var_3_A3:ArrayList<? extends CharSequence>[expected:Iterable<? extends CharSequence>]))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u5fe1\u071d\u34df\u9937\u3bd6\u69d9() {
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
    
    private void \uc910\u4179\u4daf\u3776\u7c6b\uf94d(net.minecraft.util.text.ITextComponent[] p0) {
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
            putfield:ITextComponent[](\uae87\u4492\u5db4\u0b8e\u4c04::\u6bb9\u3c25\u7e3f\u0a06\ufe34\u873d, this:\uae87\u4492\u5db4\u0b8e\u4c04, p0:ITextComponent[])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uf94d\u071d\u760c\u9937\u0800\ua6bd() {
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
            putfield:ITextComponent(\uae87\u4492\u5db4\u0b8e\u4c04::\u4975\uc3e3\u385b\u3dd3\u8cae\u836c, this:\uae87\u4492\u5db4\u0b8e\u4c04, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873), and:int(ldc:int(4102), ldc:int(646)))))
            invokeinterface:void(Logger::debug, getstatic:Logger(\uae87\u4492\u5db4\u0b8e\u4c04::\ubcb0\u836c\u3c25\u0a06\u0b8e\u946b), loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873), xor:int(ldc:int(18052), ldc:int(18051))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \u6435\u5d20\u071d\u5fe1\ubded\ud171(java.io.File p0) {
        var_2_61 : int
        stack_8E_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(1416236044), ldc:int(1559714357))
            
            if (cmpge:boolean(invokevirtual:long(File::length, p0:File), ldc:long(5368709120L))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1525030592))
                stack_8E_0 = and:int(ldc:int(21573), ldc:int(-21598))
            }
            else {
                stack_8E_0 = xor:int(ldc:int(-32383), ldc:int(-32384))
            }
            
            return:boolean(stack_8E_0:int)
        }
        
        goto(Label_0006)
    }
    
    private java.io.File \u7ce1\u97e6\ud7e8\u4179\u6d69\uc2bd(java.io.File p0) {
        var_2_67 : int
        var_4_69 : TarArchiveOutputStream
        var_5_84 : File
        var_2_180 : int
        var_6_183 : File
        var_2_192 : int
        
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
            var_2_67 = and:int(and:int(ldc:int(-692481499), ldc:int(1497212533)), ldc:int(2105137639))
            var_4_69 = aconstnull:TarArchiveOutputStream()
            
            try {
                var_5_84 = invokestatic:File(File::createTempFile, loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873), and:int(ldc:int(6924), ldc:int(16457))), loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873), and:int(ldc:int(12409), ldc:int(17421))))
                var_4_69 = initobject:TarArchiveOutputStream(TarArchiveOutputStream::<init>, initobject:GZIPOutputStream(GZIPOutputStream::<init>, initobject:FileOutputStream(FileOutputStream::<init>, var_5_84:File)))
                
                loop {
                    if (cmpne:boolean(and:int(var_2_67:int, ldc:int(134217728)), ldc:int(0))) {
                        var_2_67 = and:int(var_2_67:int, ldc:int(-2049547692))
                        goto(Label_0337)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_67:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0286)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(2)), ldc:int(0))) {
                        var_2_67 = and:int(var_2_67:int, ldc:int(964404393))
                        invokevirtual:void(TarArchiveOutputStream::setLongFileMode, var_4_69:TarArchiveOutputStream, xor:int(ldc:int(4512), ldc:int(4515)))
                    }
                    
                    Label_0210:
                    
                    if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0337)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(524288)), ldc:int(0))) {
                        var_2_67 = and:int(var_2_67:int, ldc:int(1178330289))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(1)), ldc:int(0))) {
                            var_2_67 = and:int(var_2_67:int, ldc:int(1822663246))
                            loopcontinue()
                        }
                        
                        var_2_67 = and:int(var_2_67:int, ldc:int(1400758957))
                        invokespecial:void(\uae87\u4492\u5db4\u0b8e\u4c04::\u385b\u64ab\ud171\u5654\u494c\u8258, this:\uae87\u4492\u5db4\u0b8e\u4c04, var_4_69:TarArchiveOutputStream, invokevirtual:String(File::getAbsolutePath, p0:File), loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873), and:int(ldc:int(4170), ldc:int(8219))), xor:int[expected:boolean](ldc:int(786), ldc:int(787)))
                    }
                    
                    Label_0286:
                    
                    if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_67:int, ldc:int(536870912)), ldc:int(0))) {
                            var_2_67 = and:int(var_2_67:int, ldc:int(2063175371))
                            goto(Label_0210)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_67:int, ldc:int(262144)), ldc:int(0))) {
                            var_2_67 = and:int(var_2_67:int, ldc:int(2089097569))
                            loopcontinue()
                        }
                        
                        var_2_67 = and:int(var_2_67:int, ldc:int(-1723992073))
                        invokevirtual:void(TarArchiveOutputStream::finish, var_4_69:TarArchiveOutputStream)
                    }
                    
                    Label_0337:
                    
                    if (cmpne:boolean(and:int(var_2_67:int, ldc:int(16384)), ldc:int(0))) {
                        var_2_67 = and:int(var_2_67:int, ldc:int(1365611705))
                        goto(Label_0286)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(32768)), ldc:int(0))) {
                        var_2_67 = and:int(var_2_67:int, ldc:int(-1322946163))
                        goto(Label_0210)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_67:int, ldc:int(16777216)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_2_180 = and:int(var_2_67:int, ldc:int(-662858195))
                var_6_183 = var_5_84:File
                
                loop {
                    if (cmpne:boolean(and:int(var_2_180:int, ldc:int(131072)), ldc:int(0))) {
                        var_2_192 = and:int(var_2_180:int, ldc:int(2120984302))
                    }
                    else {
                        var_2_192 = and:int(var_2_180:int, ldc:int(-1686382469))
                        
                        if (cmpeq:boolean(var_4_69:TarArchiveOutputStream, aconstnull:TarArchiveOutputStream())) {
                            return:File(var_6_183:File)
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_192:int, ldc:int(131072)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_2_180 = and:int(var_2_192:int, ldc:int(-2009817695))
                }
                
                invokevirtual:void(TarArchiveOutputStream::close, var_4_69:TarArchiveOutputStream)
            }
            finally {
                if (cmpne:boolean(var_4_69:TarArchiveOutputStream, aconstnull:TarArchiveOutputStream())) {
                    invokevirtual:void(TarArchiveOutputStream::close, var_4_69:TarArchiveOutputStream)
                }
            }
            
            return:File(var_6_183:File)
        }
        
        goto(Label_0006)
    }
    
    private void \u385b\u64ab\ud171\u5654\u494c\u8258(org.apache.commons.compress.archivers.tar.TarArchiveOutputStream p0, java.lang.String p1, java.lang.String p2, boolean p3) {
        var_5_8E : int
        var_7_81 : File
        stack_B6_0 : String [generated]
        var_8_B6 : String
        var_10_E4 : File[]
        var_11_10D : File[]
        var_12_112 : int
        var_13_11B : int
        
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
            var_5_8E = and:int(ldc:int(-733167877), ldc:int(-556220437))
            
            if (logicalnot:boolean(getfield:boolean(\uae87\u4492\u5db4\u0b8e\u4c04::\u4cd9\u36d3\u7330\u416d\ub18d\ua61f, this:\uae87\u4492\u5db4\u0b8e\u4c04))) {
                var_7_81 = initobject:File(File::<init>, p1:String)
                
                if (logicalnot:boolean(p3:boolean)) {
                    var_5_8E = and:int(var_5_8E:int, ldc:int(-682819647))
                    stack_B6_0 = invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), p2:String), invokevirtual:String(File::getName, var_7_81:File)))
                }
                else {
                    stack_B6_0 = p2:String
                }
                
                var_5_8E = and:int(var_5_8E:int, ldc:int(-681904649))
                var_8_B6 = stack_B6_0:String
                invokevirtual:void(TarArchiveOutputStream::putArchiveEntry, p0:TarArchiveOutputStream, initobject:TarArchiveEntry(TarArchiveEntry::<init>, var_7_81:File, var_8_B6:String))
                
                if (logicalnot:boolean(invokevirtual:boolean(File::isFile, var_7_81:File))) {
                    var_5_8E = and:int(var_5_8E:int, ldc:int(-135285259))
                    invokevirtual:void(TarArchiveOutputStream::closeArchiveEntry, p0:TarArchiveOutputStream)
                    var_10_E4 = invokevirtual:File[](File::listFiles, var_7_81:File)
                    
                    if (cmpne:boolean(var_10_E4:File[], aconstnull:File[]())) {
                        var_11_10D = var_10_E4:File[]
                        var_12_112 = arraylength:int(var_11_10D:File[])
                        var_13_11B = and:int(ldc:int(-9671), ldc:int(9670))
                        
                        loop {
                            var_5_8E = and:int(var_5_8E:int, ldc:int(-587399199))
                            
                            if (cmpge:boolean(var_13_11B:int, var_12_112:int)) {
                                looporswitchbreak()
                            }
                            
                            invokespecial:void(\uae87\u4492\u5db4\u0b8e\u4c04::\u385b\u64ab\ud171\u5654\u494c\u8258, this:\uae87\u4492\u5db4\u0b8e\u4c04, p0:TarArchiveOutputStream, invokevirtual:String(File::getAbsolutePath, loadelement:File(var_11_10D:File[], var_13_11B:int)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), var_8_B6:String), loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873), xor:int(ldc:int(12311), ldc:int(12316))))), and:int[expected:boolean](ldc:int(-14904), ldc:int(14881)))
                            inc:int(var_13_11B, ldc:int(1))
                        }
                    }
                }
                else {
                    invokestatic:long(IOUtils::copy, initobject:FileInputStream(FileInputStream::<init>, var_7_81:File), p0:TarArchiveOutputStream[expected:OutputStream])
                    invokevirtual:void(TarArchiveOutputStream::closeArchiveEntry, p0:TarArchiveOutputStream)
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ucef1\u4c04\u93a2\u4975\ucfaf\u120d$4() {
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
    
    private void lambda$\u927d\ud36e\uae5d\u5db4\u16f6\u97b7$3(long p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u3e75\u9af2\uf9c5\uc29a\u7af6 p1) {
        var_4_AC : int
        expr_159 : ITextComponent[] [generated]
        stack_18D_1 : int [generated]
        stack_18A_1 : String [generated]
        expr_17A : Object[] [generated]
        expr_B6 : ITextComponent[] [generated]
        stack_ED_1 : int [generated]
        stack_EA_1 : String [generated]
        expr_D7 : Object[] [generated]
        
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
            var_4_AC = and:int(ldc:int(53329532), ldc:int(-1122648067))
            
            if (cmpge:boolean(getfield:int(\u3e75\u9af2\uf9c5\uc29a\u7af6::\u9a18\ud158\u93a2\u9a18\u983f\u416d, p1:\u3e75\u9af2\uf9c5\uc29a\u7af6), and:int(ldc:int(16584), ldc:int(1791)))) {
                if (cmplt:boolean(getfield:int(\u3e75\u9af2\uf9c5\uc29a\u7af6::\u9a18\ud158\u93a2\u9a18\u983f\u416d, p1:\u3e75\u9af2\uf9c5\uc29a\u7af6), and:int(ldc:int(365), ldc:int(8492)))) {
                    putfield:boolean(\uae87\u4492\u5db4\u0b8e\u4c04::\ud158\u8308\u927d\u5f50\u51b2\u6c56, this:\uae87\u4492\u5db4\u0b8e\u4c04, xor:int[expected:boolean](ldc:int(1025), ldc:int(1024)))
                    putfield:ITextComponent(\uae87\u4492\u5db4\u0b8e\u4c04::\u4975\uc3e3\u385b\u3dd3\u8cae\u836c, this:\uae87\u4492\u5db4\u0b8e\u4c04, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873), xor:int(ldc:int(-28145), ldc:int(-28134)))))
                    invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u8350\u51b2\u3c25\u71ae\ube23\u6fb0, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\uae87\u4492\u5db4\u0b8e\u4c04::\u76bc\u97e6\uc3e3\ud36e\u5f50\u59ec, this:\uae87\u4492\u5db4\u0b8e\u4c04), getstatic:ITextComponent(\u98a4\u8d98\u64f2\u72f1\u6c52\uc9f6::\u965f\u3711\u6d99\ube23\uc9f6\u51fa))
                    invokestatic:void(\u7ce1\u8258\u16f6\u5d20\ud7e8::\u0a06\uae87\u47c2\u8c8a\u946b\u516c, p0:long)
                    return:void()
                }
            }
            
            loop {
                if (cmpne:boolean(and:int(var_4_AC:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_AC = and:int(var_4_AC:int, ldc:int(1708506869))
                    
                    if (cmpeq:boolean(getfield:int(\u3e75\u9af2\uf9c5\uc29a\u7af6::\u9a18\ud158\u93a2\u9a18\u983f\u416d, p1:\u3e75\u9af2\uf9c5\uc29a\u7af6), and:int(ldc:int(18866), ldc:int(400)))) {
                        if (cmpne:boolean(getfield:String(\u3e75\u9af2\uf9c5\uc29a\u7af6::\ud523\u6198\u5db4\uc9f6\ub6ab\u4975, p1:\u3e75\u9af2\uf9c5\uc29a\u7af6), aconstnull:String())) {
                            expr_159 = newarray:ITextComponent[](net.minecraft.util.text.ITextComponent.class, xor:int(ldc:int(1056), ldc:int(1057)))
                            stack_18D_1 = and:int(ldc:int(-29471), ldc:int(13086))
                            stack_18A_1 = loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873), xor:int(ldc:int(2109), ldc:int(2094)))
                            expr_17A = newarray:Object[](java.lang.Object.class, xor:int(ldc:int(14848), ldc:int(14849)))
                            storeelement:Object(expr_17A:Object[], and:int(ldc:int(14362), ldc:int(-15451)), getfield:String[expected:Object](\u3e75\u9af2\uf9c5\uc29a\u7af6::\ud523\u6198\u5db4\uc9f6\ub6ab\u4975, p1:\u3e75\u9af2\uf9c5\uc29a\u7af6))
                            storeelement:ITextComponent(expr_159:ITextComponent[], stack_18D_1:int, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_18A_1:String, expr_17A:Object[]))
                            invokespecial:void(\uae87\u4492\u5db4\u0b8e\u4c04::\uc910\u4179\u4daf\u3776\u7c6b\uf94d, this:\uae87\u4492\u5db4\u0b8e\u4c04, expr_159:ITextComponent[])
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_4_AC:int, ldc:int(8192)), ldc:int(0))) {
                    var_4_AC = and:int(var_4_AC:int, ldc:int(1975889466))
                    expr_B6 = newarray:ITextComponent[](net.minecraft.util.text.ITextComponent.class, and:int(ldc:int(2625), ldc:int(183)))
                    stack_ED_1 = and:int(ldc:int(10293), ldc:int(-10814))
                    stack_EA_1 = loadelement:String(getstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873), and:int(ldc:int(16499), ldc:int(3863)))
                    expr_D7 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(33), ldc:int(899)))
                    storeelement:Object(expr_D7:Object[], and:int(ldc:int(1351), ldc:int(-1352)), invokestatic:Integer[expected:Object](Integer::valueOf, getfield:int(\u3e75\u9af2\uf9c5\uc29a\u7af6::\u9a18\ud158\u93a2\u9a18\u983f\u416d, p1:\u3e75\u9af2\uf9c5\uc29a\u7af6)))
                    storeelement:ITextComponent(expr_B6:ITextComponent[], stack_ED_1:int, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_EA_1:String, expr_D7:Object[]))
                    invokespecial:void(\uae87\u4492\u5db4\u0b8e\u4c04::\uc910\u4179\u4daf\u3776\u7c6b\uf94d, this:\uae87\u4492\u5db4\u0b8e\u4c04, expr_B6:ITextComponent[])
                    looporswitchbreak()
                }
                
                var_4_AC = and:int(var_4_AC:int, ldc:int(-1271838648))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u51b2\u983f\u5f50\u839e\u4c04\u36d3$2() {
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
            
            if (logicalnot:boolean(getfield:boolean(\uae87\u4492\u5db4\u0b8e\u4c04::\u0800\u61a4\uafe7\uc229\u392e\u7c6b, this:\uae87\u4492\u5db4\u0b8e\u4c04))) {
                putfield:boolean(\uae87\u4492\u5db4\u0b8e\u4c04::\u0800\u61a4\uafe7\uc229\u392e\u7c6b, this:\uae87\u4492\u5db4\u0b8e\u4c04, xor:int[expected:boolean](ldc:int(-24540), ldc:int(-24539)))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uae87\u4492\u5db4\u0b8e\u4c04::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\uae87\u4492\u5db4\u0b8e\u4c04), this:\uae87\u4492\u5db4\u0b8e\u4c04[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
                invokespecial:void(\uae87\u4492\u5db4\u0b8e\u4c04::\u5fe1\u071d\u34df\u9937\u3bd6\u69d9, this:\uae87\u4492\u5db4\u0b8e\u4c04)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uc3e3\ud171\u12b2\u36d3\u8aa5\ucb79$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\uae87\u4492\u5db4\u0b8e\u4c04::\ub70c\u97b7\u7049\ubded\u3a62\uc7fe, this:\uae87\u4492\u5db4\u0b8e\u4c04)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6d99\u5bc4\uc7fe\u3504\ubded\u8bb0$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\uae87\u4492\u5db4\u0b8e\u4c04::\ub83f\ubefe\u3d64\u99f7\u071d\uc31c, this:\uae87\u4492\u5db4\u0b8e\u4c04)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_4EC : int
        expr_6E : int [generated]
        stack_A5_0 : byte[] [generated]
        stack_A7_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_EB_0 : byte[] [generated]
        stack_119_0 : byte[] [generated]
        stack_11B_0 : byte[] [generated]
        stack_151_0 : byte[] [generated]
        stack_506_0 : byte[] [generated]
        stack_557_0 : byte[] [generated]
        stack_5C6_0 : byte[] [generated]
        stack_617_0 : byte[] [generated]
        var_4_4D7 : int
        var_3_4DC : byte[]
        var_5_4DD : int
        expr_506 : byte [generated]
        var_0_60D : int
        expr_617 : byte [generated]
        stack_647_2 : byte [generated]
        var_0_99 : int
        var_2_A5 : byte[]
        expr_A9 : int [generated]
        var_3_545 : byte[]
        var_5_546 : int
        expr_EB : int [generated]
        expr_11B : int [generated]
        var_3_15D : String
        expr_165 : String[] [generated]
        expr_16F : String[] [generated]
        var_3_458 : String[]
        expr_470 : String[] [generated]
        
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
        var_0_4EC = and:int(ldc:int(-1901629925), ldc:int(-896219387))
        expr_6E = arraylength:int(stack_A5_0 = stack_A7_0 = stack_E9_0 = stack_EB_0 = stack_119_0 = stack_11B_0 = stack_151_0 = stack_506_0 = stack_557_0 = stack_5C6_0 = stack_617_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("ECJh4uIl96KmoCUskBLQoRzWs3cs4Hev1RLn5GZroHCl12FhItUtseehZ2Hnl4Frp2GlM5jhoCbsICsxpeDlYXbmKmegoJCxL20ypSCR4WSnoGTnp+IRfSzgoqCG2+0jYWGXgWthoiVt3H0pp2N3q/RjYuWxYFDgZiEVo+KhJiMgcSGso2CjFTbmZeVgIdAg4qEmIyBxIayjYKMVNuZloKAt4KBh5SfmnKFgoydx5mFjYKMVNualYWCh0uVzYGJjYKMVNuYm5Sdj0CZiITIhrKNgoxU25qAiJmzXoeanIech9+Fi4mCjFTbmYedjsROmJKAlnKFw42Hn5nWTYGYyoJxgYKMVNuZh52OxE6YkoCWcoXDjYefmddNgZjKgnCBgoxU25uGh5yzXJqUgZyAhc+Fi4mCjFTbmIuZhohFjZeLl4nCqYWCzZ6xsoCEUdqYm5+ehXKWsp2Itp+wmQE1MTo0PCQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_4D7 = expr_6E:int
        var_3_4DC = newarray:byte[](byte.class, expr_6E:int)
        var_5_4DD = expr_6E:int
        Label_1247:
        
        while (cmpeq:boolean(and:int(var_0_4EC:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_4EC:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_1438)
            }
            
            var_0_4EC = and:int(var_0_4EC:int, ldc:int(-760780617))
            var_5_4DD = add:int(var_5_4DD:int, ldc:int(-1))
            expr_506 = loadelement:byte(stack_506_0:byte[], var_5_4DD:int)
            storeelement:byte(var_3_4DC:byte[], var_5_4DD:int, or:int(and:int(shl:int(expr_506:byte, and:int(ldc:int(21788), ldc:int(2055))), ldc:int(-16)), and:int(shr:int(expr_506:byte[expected:int], xor:int(ldc:int(-30698), ldc:int(-30702))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_4DD:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_E9_0 = stack_EB_0 = stack_119_0 = stack_11B_0 = stack_151_0 = stack_506_0 = stack_557_0 = stack_5C6_0 = stack_617_0 = var_3_4DC:byte[]
            goto(Label_0115)
        }
        
        var_0_4EC = and:int(var_0_4EC:int, ldc:int(-999604296))
        goto(Label_1528)
        Label_1438:
        
        while (cmpne:boolean(and:int(var_0_4EC:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_4EC:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_1247)
            }
            
            var_0_4EC = and:int(var_0_4EC:int, ldc:int(-1679303513))
            var_5_4DD = add:int(var_5_4DD:int, ldc:int(-1))
            storeelement:byte(var_3_4DC:byte[], var_5_4DD:int, add:byte(xor:byte(loadelement:byte(stack_5C6_0:byte[], var_5_4DD:int), ldc:byte(47)), ldc:byte(83)))
            
            if (cmpne:boolean(var_5_4DD:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_E9_0 = stack_EB_0 = stack_119_0 = stack_11B_0 = stack_151_0 = stack_506_0 = stack_557_0 = stack_5C6_0 = stack_617_0 = var_3_4DC:byte[]
            goto(Label_0240)
        }
        
        var_0_4EC = and:int(var_0_4EC:int, ldc:int(549003753))
        Label_1528:
        
        while (cmpeq:boolean(and:int(var_0_4EC:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_4EC:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_1247)
            }
            
            var_0_60D = and:int(var_0_4EC:int, ldc:int(-1092104215))
            var_5_4DD = add:int(var_5_4DD:int, ldc:int(-1))
            expr_617 = loadelement:byte(stack_617_0:byte[], var_5_4DD:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_4DD:int, ldc:int(6)), neg:int(var_4_4D7:int)), ldc:int(0))) {
                var_0_60D = and:int(var_0_60D:int, ldc:int(-219394629))
                stack_647_2 = add:byte(expr_617:byte, ldc:byte(6))
            }
            else {
                stack_647_2 = add:byte(expr_617:byte, loadelement:byte(var_3_4DC:byte[], add:int(var_5_4DD:int, ldc:int(6))))
            }
            
            var_0_4EC = and:int(var_0_60D:int, ldc:int(-1483259121))
            storeelement:byte(var_3_4DC:byte[], var_5_4DD:int, stack_647_2:byte)
            
            if (cmpne:boolean(var_5_4DD:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A7_0 = stack_A5_0 = stack_E9_0 = stack_EB_0 = stack_119_0 = stack_11B_0 = stack_151_0 = stack_506_0 = stack_557_0 = stack_5C6_0 = stack_617_0 = var_3_4DC:byte[]
            goto(Label_0288)
        }
        
        goto(Label_1438)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_4EC:int, ldc:int(1)), ldc:int(0))) {
            var_0_4EC = and:int(var_0_4EC:int, ldc:int(-1024736965))
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_0_4EC:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0240)
        }
        
        if (cmpne:boolean(and:int(var_0_4EC:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_99 = and:int(var_0_4EC:int, ldc:int(-952066190))
        }
        else {
            var_0_99 = and:int(var_0_4EC:int, ldc:int(-1499173771))
            var_2_A5 = stack_A5_0:byte[]
            expr_A9 = add:int(arraylength:int(stack_A7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A9:int, ldc:int(0))) {
                var_3_545 = newarray:byte[](byte.class, expr_A9:int)
                var_5_546 = expr_A9:int
                
                loop {
                    var_0_99 = and:int(var_0_99:int, ldc:int(-1493876221))
                    var_5_546 = add:int(var_5_546:int, ldc:int(-1))
                    storeelement:byte(var_3_545:byte[], var_5_546:int, add:int(shl:int(loadelement:byte(stack_557_0:byte[], var_5_546:int), ldc:int(6)), and:int(shr:int(loadelement:byte(var_2_A5:byte[], add:int(var_5_546:int, xor:int(ldc:int(106), ldc:int(107)))), ldc:int(2)), xor:int(ldc:int(2125), ldc:int(2162)))))
                    
                    if (cmpne:boolean(var_5_546:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A7_0 = stack_A5_0 = stack_E9_0 = stack_EB_0 = stack_119_0 = stack_11B_0 = stack_151_0 = stack_506_0 = stack_557_0 = stack_5C6_0 = stack_617_0 = var_3_545:byte[]
            }
        }
        
        Label_0174:
        
        if (cmpeq:boolean(and:int(var_0_99:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_4EC = and:int(var_0_99:int, ldc:int(-1419625299))
            goto(Label_0288)
        }
        
        if (cmpne:boolean(and:int(var_0_99:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_4EC = and:int(var_0_99:int, ldc:int(547121197))
        }
        else {
            if (cmpne:boolean(and:int(var_0_99:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_4EC = and:int(var_0_99:int, ldc:int(-764746285))
                goto(Label_0115)
            }
            
            var_0_4EC = and:int(var_0_99:int, ldc:int(-1899202201))
            expr_EB = arraylength:int(stack_EB_0:byte[])
            
            if (cmpne:boolean(expr_EB:int, ldc:int(0))) {
                var_4_4D7 = expr_EB:int
                var_3_4DC = newarray:byte[](byte.class, expr_EB:int)
                var_5_4DD = expr_EB:int
                goto(Label_1438)
            }
        }
        
        Label_0240:
        
        if (cmpne:boolean(and:int(var_0_4EC:int, ldc:int(1)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_4EC:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_99 = and:int(var_0_4EC:int, ldc:int(664749894))
                goto(Label_0174)
            }
            
            if (cmpne:boolean(and:int(var_0_4EC:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_4EC = and:int(var_0_4EC:int, ldc:int(-1161837153))
            expr_11B = arraylength:int(stack_11B_0:byte[])
            
            if (cmpne:boolean(expr_11B:int, ldc:int(0))) {
                var_4_4D7 = expr_11B:int
                var_3_4DC = newarray:byte[](byte.class, expr_11B:int)
                var_5_4DD = expr_11B:int
                goto(Label_1528)
            }
        }
        
        Label_0288:
        
        if (cmpne:boolean(and:int(var_0_4EC:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0240)
        }
        
        if (cmpeq:boolean(and:int(var_0_4EC:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_99 = and:int(var_0_4EC:int, ldc:int(-1413678060))
            goto(Label_0174)
        }
        
        if (cmpne:boolean(and:int(var_0_4EC:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_4EC = and:int(var_0_4EC:int, ldc:int(-1221399574))
            goto(Label_0115)
        }
        
        var_3_15D = initobject:String(String::<init>, stack_151_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_165 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-28467), ldc:int(-28458)))
        expr_16F = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(10423), ldc:int(10412)))
        storeelement:String(expr_165:String[], and:int(ldc:int(3798), ldc:int(20758)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(-20530), ldc:int(20529)), and:int(ldc:int(1002), ldc:int(-2043))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(5248), ldc:int(5250)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(4862), ldc:int(-6911)), and:int(ldc:int(1735), ldc:int(22530))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(64), ldc:int(69)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(16518), ldc:int(6474)), and:int(ldc:int(555), ldc:int(8467))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(4107), ldc:int(11617)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(9280), ldc:int(9283)), and:int(ldc:int(2055), ldc:int(8967))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(12811), ldc:int(16611)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(8208), ldc:int(8215)), xor:int(ldc:int(3347), ldc:int(3355))))
        storeelement:String(expr_165:String[], xor:int(ldc:int(2196), ldc:int(2179)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(22826), ldc:int(12)), xor:int(ldc:int(16554), ldc:int(16547))))
        storeelement:String(expr_165:String[], and:int(ldc:int(20760), ldc:int(8344)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(275), ldc:int(282)), and:int(ldc:int(4190), ldc:int(2348))))
        storeelement:String(expr_165:String[], xor:int(ldc:int(5706), ldc:int(5715)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(4126), ldc:int(16428)), and:int(ldc:int(1297), ldc:int(8241))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(19), ldc:int(26)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(20889), ldc:int(597)), xor:int(ldc:int(-24047), ldc:int(-24055))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(-19964), ldc:int(-19953)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(4353), ldc:int(4377)), xor:int(ldc:int(2055), ldc:int(2078))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(135), ldc:int(25620)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(1113), ldc:int(4633)), xor:int(ldc:int(8275), ldc:int(8271))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(8395), ldc:int(8415)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(177), ldc:int(173)), and:int(ldc:int(3705), ldc:int(4411))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(7436), ldc:int(140)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(43), ldc:int(18)), xor:int(ldc:int(1591), ldc:int(1648))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(13108), ldc:int(16)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(4652), ldc:int(4715)), xor:int(ldc:int(328), ldc:int(312))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(7), ldc:int(11271)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(8824), ldc:int(497)), xor:int(ldc:int(8817), ldc:int(8949))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(24900), ldc:int(24898)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(16677), ldc:int(16801)), xor:int(ldc:int(2161), ldc:int(2281))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(29087), ldc:int(13)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(5151), ldc:int(5255)), xor:int(ldc:int(-24047), ldc:int(-23903))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(21), ldc:int(15293)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(2201), ldc:int(2089)), xor:int(ldc:int(-24250), ldc:int(-24071))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(1043), ldc:int(595)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(151), ldc:int(40)), and:int(ldc:int(2779), ldc:int(20720))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(10325), ldc:int(-14422)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(20952), ldc:int(1746)), xor:int(ldc:int(-28505), ldc:int(-28605))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(30139), ldc:int(2133)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(244), ldc:int(5358)), and:int(ldc:int(3363), ldc:int(4877))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(1562), ldc:int(8242)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(16743), ldc:int(2305)), xor:int(ldc:int(16830), ldc:int(16544))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(20895), ldc:int(10255)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(10817), ldc:int(11103)), and:int(ldc:int(8506), ldc:int(371))))
        storeelement:String(expr_165:String[], and:int(ldc:int(539), ldc:int(21978)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(4429), ldc:int(4223)), and:int(ldc:int(8518), ldc:int(879))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(18520), ldc:int(9738)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(18945), ldc:int(19271)), xor:int(ldc:int(-32513), ldc:int(-32345))))
        storeelement:String(expr_16F:String[], xor:int(ldc:int(-32696), ldc:int(-32698)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, xor:int(ldc:int(5120), ldc:int(5464)), and:int(ldc:int(4573), ldc:int(26975))))
        storeelement:String(expr_16F:String[], and:int(ldc:int(830), ldc:int(139)), invokevirtual:String[expected:String](String::substring, var_3_15D:String, and:int(ldc:int(27997), ldc:int(479)), xor:int(ldc:int(-31135), ldc:int(-30973))))
        putstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u0c95\u3bc9\u3711\u760c\u16f6\u7873, expr_16F:String[])
        var_3_458 = expr_165:String[]
        putstatic:Logger(\uae87\u4492\u5db4\u0b8e\u4c04::\ubcb0\u836c\u3c25\u0a06\u0b8e\u946b, invokestatic:Logger(LogManager::getLogger))
        putstatic:ReentrantLock(\uae87\u4492\u5db4\u0b8e\u4c04::\u8aa5\u1187\u3776\u946b\u385b\u759a, initobject:ReentrantLock(ReentrantLock::<init>))
        expr_470 = newarray:String[](java.lang.String.class, xor:int(ldc:int(18470), ldc:int(18466)))
        storeelement:String(expr_470:String[], and:int(ldc:int(3437), ldc:int(-24046)), loadelement:String[expected:String](var_3_458:String[], xor:int(ldc:int(18437), ldc:int(18451))))
        storeelement:String(expr_470:String[], and:int(ldc:int(455), ldc:int(3073)), loadelement:String[expected:String](var_3_458:String[], xor:int(ldc:int(8260), ldc:int(8275))))
        storeelement:String(expr_470:String[], and:int(ldc:int(1626), ldc:int(20515)), loadelement:String[expected:String](var_3_458:String[], and:int(ldc:int(8222), ldc:int(20120))))
        storeelement:String(expr_470:String[], and:int(ldc:int(4183), ldc:int(16643)), loadelement:String[expected:String](var_3_458:String[], xor:int(ldc:int(3), ldc:int(26))))
        putstatic:String[](\uae87\u4492\u5db4\u0b8e\u4c04::\u3504\ud158\ub8be\uc3e3\u4daf\ud523, expr_470:String[])
        putstatic:ITextComponent(\uae87\u4492\u5db4\u0b8e\u4c04::\u836c\u9033\u120d\u8640\ub18d\ud523, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_458:String[], xor:int(ldc:int(22), ldc:int(12)))))
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_66B : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_676 : int
        
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
        var_3_66B = and:int(ldc:int(745975887), ldc:int(-1636380966))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uae87\u4492\u5db4\u0b8e\u4c04[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_66B = and:int(var_3_66B:int, ldc:int(-1646884150))
            var_5_80 = and:int(ldc:int(-32693), ldc:int(25520))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(20707), ldc:int(-23796)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_66B:int, ldc:int(-270873382))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, and:int(ldc:int(11273), ldc:int(16385)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(2053), ldc:int(26219)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_66B = and:int(var_3_D0:int, ldc:int(1574369387))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(25273), ldc:int(1027)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-667890090))
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(495688936))
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1101518309))
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1844858949))
                        goto(Label_0726)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-337370385))
                        goto(Label_0593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1748166059))
                    }
                    else {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-822433926))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0593)
                            }
                            
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0418:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-722374150))
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1313415284))
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-620902256))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-353502029))
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0726)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1954684692))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1663323702))
                        var_11_E1 = and:int(ldc:int(-15921), ldc:int(13872))
                        goto(Label_1510)
                    }
                    
                    Label_0593:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1027213728))
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1348714666))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-485192948))
                        goto(Label_0848)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(849320621))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(599970759))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1608167806))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0848)
                        }
                    }
                    
                    Label_0726:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1398760303))
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(512746566))
                        goto(Label_0963)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1932125669))
                            goto(Label_0418)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1862199419))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0848:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1531740235))
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1937651078))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(703903004))
                            goto(Label_0726)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1333778558))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = xor:int(ldc:int(2050), ldc:int(2051))
                                goto(Label_1140)
                            }
                        }
                    }
                    
                    Label_0963:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1707631350))
                        goto(Label_1521)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1339150296))
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(886408324))
                        goto(Label_1265)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1286507011))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0848)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1335960038))
                            goto(Label_0726)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-535121470))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1932075414))
                        var_11_E1 = and:int(ldc:int(-5157), ldc:int(5156))
                    }
                    
                    Label_1140:
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1392)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0963)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(127832780))
                            goto(Label_0848)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(1393115370))
                            goto(Label_0726)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(743783234))
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1556421862))
                            loopcontinue()
                        }
                        
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1861924827))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1392)
                            }
                        }
                    }
                    
                    Label_1265:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1192492143))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_1140)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0963)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0848)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-1179093000))
                            goto(Label_0726)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-266061945))
                            goto(Label_0418)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                            var_3_66B = and:int(var_3_66B:int, ldc:int(-562389558))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                            goto(Label_1510)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1392:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1668409730))
                        goto(Label_1521)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(256)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-1051228695))
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(131072)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66B = and:int(var_3_66B:int, ldc:int(-53234485))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1510:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_676 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1521:
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(683704740))
                        goto(Label_1392)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1265)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-160700923))
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0963)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(1310968992))
                        goto(Label_0848)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(-35698633))
                        goto(Label_0726)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0418)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66B:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_66B = and:int(var_3_66B:int, ldc:int(796047434))
                        var_17_676 = add:int(var_16_10F:int, xor:int(ldc:int(8465), ldc:int(8464)))
                        looporswitchbreak()
                    }
                    
                    var_3_66B = and:int(var_3_66B:int, ldc:int(-1582950889))
                }
                
                var_3_66B = and:int(var_3_66B:int, ldc:int(-1654658853))
                
                if (cmple:boolean(var_5_80 = var_17_676:int, sub:int(var_6_87:int, and:int(ldc:int(2385), ldc:int(1059))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_66B:int, ldc:int(134217728)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
