public abstract class \u47c2\u2dcc\u12cb\ud171\u8c8a.\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3 {
    public void \uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3() {
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
            invokespecial:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::<init>, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3, getstatic:ITextComponent(\u74b1\u516c\u7330\ud523\u8df4\uc87f::\u7bad\u3e75\u0b8e\u16f6\u6ec6\ua3b4))
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
            invokevirtual:void(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\ub6ab\u51fa\u3c25\u183a\u9a18\u6ec6, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u718f\u7af6\u718f\u4e72\uc2e8\ub7dc, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u93a2\u67d0\ubb2b\u16f6\uc29a \uc29a\u62da\u64ab\u600f\u946b\u7e3f();
    
    public abstract int \ub32d\u6fb0\u3504\ud217\u59ec\u6d69();
    
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
    
    public void \u1187\u5245\u67e9\u839e\u494c\uc229(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0, int p1, int p2) {
        var_6_6A : String
        
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
            var_6_6A = invokevirtual:String(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\ubefe\ucfaf\ud36e\u71ae\uafe7\u47c2, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u718f\u7af6\u718f\u4e72\uc2e8\ub7dc, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3))
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u72f1\u5f50\u51fa\ubcb0\u0b8e\uafe7, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p1:int, p2:int)
            invokevirtual:void(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\u47c2\u0800\u6435\u97b7\ud12e\u72f1, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u718f\u7af6\u718f\u4e72\uc2e8\ub7dc, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), var_6_6A:String)
            invokevirtual:void(\u9033\u36d3\u8bb0\ucef1\u8350\u12b2::\u6c52\u836c\uff55\uc29a\u624e\u3c25, getfield:\u9033\u36d3\u8bb0\ucef1\u8350\u12b2(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u965f\u4492\u9937\u59ec\u98a4\u839e, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6d69\uc2bd\uc246\u99f7\ucb79\u2dcc() {
        var_1_5F : int
        
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
            var_1_5F = and:int(ldc:int(-1976348863), ldc:int(-1281143985))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u93a2\u67d0\ubb2b\u16f6\uc29a::\u839e\u960f\u67e9\u8cae\u4c2b\ub102, invokevirtual:\u93a2\u67d0\ubb2b\u16f6\uc29a(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\uc29a\u62da\u64ab\u600f\u946b\u7e3f, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3)))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-9962))
                invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u8350\u51b2\u3c25\u71ae\ube23\u6fb0, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u40a9\ud4fe\u3bc9\ub171\uff55\u51fa, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, ldc:String("X")))
                invokevirtual:void(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\u47c2\u0800\u6435\u97b7\ud12e\u72f1, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u6c56\ub70c\u6bb9\ud158\u1833\u8d98, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), ldc:String("-"))
            }
            else {
                invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u8350\u51b2\u3c25\u71ae\ube23\u6fb0, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u40a9\ud4fe\u3bc9\ub171\uff55\u51fa, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, ldc:String("O")))
                invokevirtual:void(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\u47c2\u0800\u6435\u97b7\ud12e\u72f1, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u6c56\ub70c\u6bb9\ud158\u1833\u8d98, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), invokeinterface:String(ITextComponent::getString, invokevirtual:ITextComponent(\u93a2\u67d0\ubb2b\u16f6\uc29a::\uae87\uc31c\ub70c\u2dcc\u4c2b\u3bc9, invokevirtual:\u93a2\u67d0\ubb2b\u16f6\uc29a(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\uc29a\u62da\u64ab\u600f\u946b\u7e3f, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u5f50\u4e72\u416d\u92ff\ub32d\u516c() {
        var_3_66 : \u93a2\u67d0\ubb2b\u16f6\uc29a
        
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
            var_3_66 = invokevirtual:\u93a2\u67d0\ubb2b\u16f6\uc29a(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\uc29a\u62da\u64ab\u600f\u946b\u7e3f, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3)
            invokevirtual:void(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u71ae\u4c04\u51fa\u3711\u51b2\u3d64, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3, var_3_66:\u93a2\u67d0\ubb2b\u16f6\uc29a)
            
            if (logicalnot:boolean(invokevirtual:boolean(\u93a2\u67d0\ubb2b\u16f6\uc29a::\u839e\u960f\u67e9\u8cae\u4c2b\ub102, var_3_66:\u93a2\u67d0\ubb2b\u16f6\uc29a))) {
                invokevirtual:void(\u93a2\u67d0\ubb2b\u16f6\uc29a::\u7c6b\u3c25\u51fa\u9937\ud51e\u8413, var_3_66:\u93a2\u67d0\ubb2b\u16f6\uc29a, checkcast:ITextComponent(net.minecraft.util.text.ITextComponent.class, aconstnull:ITextComponent()))
            }
            
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), checkcast:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006.class, aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()))
            return:void()
        }
        
        goto(Label_0006)
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
            invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u7bad\ub171\u61a4\ubff1\u6d69\u6cfe, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3)), and:int[expected:boolean](ldc:int(5200), ldc:int(-5201)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract void \u71ae\u4c04\u51fa\u3711\u51b2\u3d64(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u93a2\u67d0\ubb2b\u16f6\uc29a p0);
    
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
            invokevirtual:void(\u93a2\u67d0\ubb2b\u16f6\uc29a::\ua562\u93a2\ubcb0\u7c6b\u99f7\ud36e, invokevirtual:\u93a2\u67d0\ubb2b\u16f6\uc29a(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\uc29a\u62da\u64ab\u600f\u946b\u7e3f, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), getfield:boolean(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u416d\uc229\u4f4a\u6d99\u3776\uc7fe, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3))
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), checkcast:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006.class, aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u8308\u4daf\u34df\u9a18\u839e\ub113(java.lang.String p0) {
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
            invokevirtual:void(\u9033\u36d3\u8bb0\ucef1\u8350\u12b2::\u6c52\u836c\uff55\uc29a\u624e\u3c25, getfield:\u9033\u36d3\u8bb0\ucef1\u8350\u12b2(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u965f\u4492\u9937\u59ec\u98a4\u839e, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc229\u3a62\u12cb\ud51e\uafe7\u8308(int p0, int p1, int p2) {
        var_4_63 : int
        
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
        var_4_63 = and:int(ldc:int(-1342530741), ldc:int(-1250304390))
        
        if (invokevirtual:boolean(\u9033\u36d3\u8bb0\ucef1\u8350\u12b2::\u4e72\u516c\u98a4\u7d52\ub1b9\u5140, getfield:\u9033\u36d3\u8bb0\ucef1\u8350\u12b2(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u965f\u4492\u9937\u59ec\u98a4\u839e, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), p0:int, p1:int, p2:int)) {
            return:boolean(and:int[expected:boolean](ldc:int(3333), ldc:int(29283)))
        }
        
        do {
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(32768)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-436289846))
                
                if (logicalnot:boolean(invokespecial:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:int, p1:int, p2:int))) {
                    loopcontinue()
                }
                
                return:boolean(xor:int[expected:boolean](ldc:int(24612), ldc:int(24613)))
            }
        } while (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16777216)), ldc:int(0)))
        
        if (logicaland:boolean(cmpne:boolean(p0:int, and:int(ldc:int(17677), ldc:int(771))), cmpne:boolean(p0:int, xor:int(ldc:int(13544), ldc:int(13735))))) {
            return:boolean(and:int[expected:boolean](ldc:int(6339), ldc:int(-15068)))
        }
        
        invokevirtual:void(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u5f50\u4e72\u416d\u92ff\ub32d\u516c, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3)
        return:boolean(xor:int[expected:boolean](ldc:int(130), ldc:int(131)))
    }
    
    public boolean \u385b\ub1b9\u9255\u8c8a\u16f6\u61a4(double p0, double p1, double p2) {
        var_7_63 : int
        stack_97_0 : int [generated]
        
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
            var_7_63 = and:int(ldc:int(526847131), ldc:int(1599074203))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u9033\u36d3\u8bb0\ucef1\u8350\u12b2::\uc910\u4e72\uf9c5\u3e75\u6bb9\u4c2b, getfield:\u9033\u36d3\u8bb0\ucef1\u8350\u12b2(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u965f\u4492\u9937\u59ec\u98a4\u839e, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), p2:double))) {
                var_7_63 = and:int(var_7_63:int, ldc:int(1073686223))
                stack_97_0 = invokespecial:boolean[expected:int](\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u385b\ub1b9\u9255\u8c8a\u16f6\u61a4, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3[expected:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9], p0:double, p1:double, p2:double)
            }
            else {
                stack_97_0 = and:int(ldc:int(11297), ldc:int(345))
            }
            
            return:boolean(stack_97_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u183a\ud36e\u1187\u88c5\u7bad\u5bc4(double p0, double p1, int p2) {
        var_6_63 : int
        stack_99_0 : int [generated]
        
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
            var_6_63 = and:int(ldc:int(1983830254), ldc:int(2108644991))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u9033\u36d3\u8bb0\ucef1\u8350\u12b2::\u92ee\u3504\ubcb0\u071d\u16f6\ubff1, getfield:\u9033\u36d3\u8bb0\ucef1\u8350\u12b2(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u965f\u4492\u9937\u59ec\u98a4\u839e, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), p0:double, p1:double, p2:int))) {
                var_6_63 = and:int(var_6_63:int, ldc:int(-520171674))
                stack_99_0 = invokespecial:boolean[expected:int](\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u183a\ud36e\u1187\u88c5\u7bad\u5bc4, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3[expected:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9], p0:double, p1:double, p2:int)
            }
            else {
                stack_99_0 = xor:int(ldc:int(19008), ldc:int(19009))
            }
            
            return:boolean(stack_99_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_7_B8 : int
        
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
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), getstatic:ITextComponent(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u5db4\u47c2\u1187\u071d\u5245\u839e), div:int(getfield:int(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), and:int(ldc:int(20486), ldc:int(51))), ldc:int(20), ldc:int(16777215))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub32d\u3e75\uc7fe\u92ff\u9937\u5f50, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), getstatic:ITextComponent(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u946b\u9033\uc31c\u7873\u983f\u4492), sub:int(div:int(getfield:int(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), and:int(ldc:int(4110), ldc:int(25907))), xor:int(ldc:int(-29161), ldc:int(-29055))), ldc:int(40), ldc:int(10526880))
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u718f\u7af6\u718f\u4e72\uc2e8\ub7dc, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            var_7_B8 = ldc:int(75)
            
            if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, invokevirtual:String(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\ubefe\ucfaf\ud36e\u71ae\uafe7\u47c2, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u6c56\ub70c\u6bb9\ud158\u1833\u8d98, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3))))) {
                invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub32d\u3e75\uc7fe\u92ff\u9937\u5f50, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), getstatic:ITextComponent(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u4ab3\u8640\u0a06\u4d85\u0c95\u1187), sub:int(div:int(getfield:int(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), and:int(ldc:int(1154), ldc:int(18))), and:int(ldc:int(8406), ldc:int(6334))), add:int(add:int(var_7_B8:int, sub:int(add:int(ldc:int(46), invokevirtual:int(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\ub32d\u6fb0\u3504\ud217\u59ec\u6d69, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3)), and:int(ldc:int(647), ldc:int(247)))), and:int(ldc:int(4172), ldc:int(17924))), ldc:int(10526880))
                invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u6c56\ub70c\u6bb9\ud158\u1833\u8d98, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            }
            
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            invokevirtual:void(\u9033\u36d3\u8bb0\ucef1\u8350\u12b2::\u8c8a\ub18d\u9255\ua61f\u5fe1\u8709, getfield:\u9033\u36d3\u8bb0\ucef1\u8350\u12b2(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u965f\u4492\u9937\u59ec\u98a4\u839e, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u927d\u3d4b\u8389\u836c\u97b7\u0b8e$2(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
        var_2_61 : int
        stack_93_0 : \u93a2\u67d0\ubb2b\u16f6\uc29a [generated]
        stack_93_1 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(107613244), ldc:int(175298713))
            
            if (invokevirtual:boolean(\u93a2\u67d0\ubb2b\u16f6\uc29a::\u839e\u960f\u67e9\u8cae\u4c2b\ub102, stack_93_0 = invokevirtual:\u93a2\u67d0\ubb2b\u16f6\uc29a(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\uc29a\u62da\u64ab\u600f\u946b\u7e3f, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-805889145))
                stack_93_1 = and:int[expected:boolean](ldc:int(13008), ldc:int(-15059))
            }
            else {
                stack_93_1 = xor:int[expected:boolean](ldc:int(8962), ldc:int(8963))
            }
            
            invokevirtual:void(\u93a2\u67d0\ubb2b\u16f6\uc29a::\ua562\u93a2\ubcb0\u7c6b\u99f7\ud36e, stack_93_0:\u93a2\u67d0\ubb2b\u16f6\uc29a, stack_93_1:boolean)
            invokevirtual:void(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u6d69\uc2bd\uc246\u99f7\ucb79\u2dcc, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u7049\ubb2b\ua3b4\ub8be\u6ec6\u4492$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\ubf56\u64ab\u97e6\u7d52\ufe34\u6cfe, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uf94d\u3711\u9255\u3776\u8df4\ub6ab$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u5f50\u4e72\u416d\u92ff\ub32d\u516c, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u9033\u36d3\u8bb0\ucef1\u8350\u12b2 \u3c25\u5fe1\u3a62\ucef1\u4c04\uc229(\u47c2\u2dcc\u12cb\ud171\u8c8a.\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3 p0) {
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
            return:\u9033\u36d3\u8bb0\ucef1\u8350\u12b2(getfield:\u9033\u36d3\u8bb0\ucef1\u8350\u12b2(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u965f\u4492\u9937\u59ec\u98a4\u839e, p0:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3))
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
            putstatic:ITextComponent(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u5db4\u47c2\u1187\u071d\u5245\u839e, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, ldc:String("advMode.setCommand")))
            putstatic:ITextComponent(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u946b\u9033\uc31c\u7873\u983f\u4492, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, ldc:String("advMode.command")))
            putstatic:ITextComponent(\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3::\u4ab3\u8640\u0a06\u4d85\u0c95\u1187, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, ldc:String("advMode.previousOutput")))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
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
        var_3_68D = and:int(ldc:int(-1308126463), ldc:int(-2092437255))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uae5d\u3dd3\u47c2\uc2bd\u6d99\u36d3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(-1952468405))
            var_5_81 = and:int(ldc:int(-29549), ldc:int(29032))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-15631), ldc:int(13326)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_68D:int, ldc:int(-1761750113))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(8528), ldc:int(8529)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(10512), ldc:int(10513)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_68D = and:int(var_3_DA:int, ldc:int(1722670803))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(2832), ldc:int(2833)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(2013965293))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1870003065))
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-184812605))
                        goto(Label_0586)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(644571582))
                    }
                    else {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1655151821))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0586)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1902746622))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1067499095))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1585958921))
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-250110472))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-411144216))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1239556857))
                        var_11_EB = and:int(ldc:int(-9532), ldc:int(8506))
                        goto(Label_1535)
                    }
                    
                    Label_0586:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1195826868))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-279349582))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(233609731))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1502082550))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(443397331))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-953451489))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-320847623))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1207088319))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(381136999))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1505763498))
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(656857026))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(598448365))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-969262080))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-195502181))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-78763631))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-619332619))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = xor:int(ldc:int(21506), ldc:int(21507))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1075594308))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1593487971))
                        goto(Label_1271)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-118030249))
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1230017212))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(132625331))
                        var_11_EB = and:int(ldc:int(-21584), ldc:int(5198))
                    }
                    
                    Label_1137:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1873288589))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1560290013))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-910479811))
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1258803702))
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0586)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1250691012))
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-813721859))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1271:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(2130388353))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(374595633))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1137)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-892774803))
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(792507267))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1678796858))
                            goto(Label_0586)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1462760269))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1535)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1416:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-2111045887))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(498711894))
                        loopcontinue()
                    }
                    
                    var_3_68D = and:int(var_3_68D:int, ldc:int(1404015915))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1535:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_698 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1546:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-964547197))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1358109406))
                        goto(Label_1271)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(817354309))
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1852096371))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1133152155))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0586)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1994760297))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1047525041))
                        var_17_698 = add:int(var_16_119:int, xor:int(ldc:int(-28639), ldc:int(-28640)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68D = and:int(var_3_68D:int, ldc:int(1730648159))
                
                if (cmple:boolean(var_5_81 = var_17_698:int, sub:int(var_6_88:int, xor:int(ldc:int(53), ldc:int(52))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(991099573))
            goto(Label_0108)
        }
    }
}
