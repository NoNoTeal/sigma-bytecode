public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u5f50\u6198\u0b8e\ud51e\ubff1\u8709 {
    public void \u5f50\u6198\u0b8e\ud51e\ubff1\u8709(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0, it.unimi.dsi.fastutil.booleans.BooleanConsumer p1, \u12b2\u7049\u8df4\uc9f6\uae87.\ub8be\u071d\u527a\u3711\ubff1\u759a p2) {
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
            invokevirtual:void(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\ub6ab\u51fa\u3c25\u183a\u9a18\u6ec6, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u071d\u47c2\u624e\u97e6\ufe34\u7d52, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709))
            invokevirtual:void(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\ub6ab\u51fa\u3c25\u183a\u9a18\u6ec6, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u927d\u4e72\ua068\u946b\u99f7\u8413, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709))
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
    
    private static net.minecraft.util.text.ITextComponent \u4e72\ub19c\ud51e\ubded\uc29a\u983f(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u9937\u5d20\u9af2\u3dd3\u3c25\u416d p0) {
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
            return:ITextComponent(invokeinterface:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::append, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::appendString, initobject:TranslationTextComponent[expected:IFormattableTextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\uc87f\ubefe\u4bc8\u67d0\ubff1\u5bc4), xor:int(ldc:int(4098), ldc:int(4102)))), loadelement:String(getstatic:String[](\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\uc87f\ubefe\u4bc8\u67d0\ubff1\u5bc4), and:int(ldc:int(15893), ldc:int(295)))), invokevirtual:ITextComponent(\u9937\u5d20\u9af2\u3dd3\u3c25\u416d::\u4d85\u7049\uf9c5\u5245\u72f1\ub102, p0:\u9937\u5d20\u9af2\u3dd3\u3c25\u416d)))
        }
        
        goto(Label_0006)
    }
    
    public void \u1187\u5245\u67e9\u839e\u494c\uc229(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0, int p1, int p2) {
        var_6_6B : String
        var_7_74 : String
        
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
            var_6_6B = invokevirtual:String(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\ubefe\ucfaf\ud36e\u71ae\uafe7\u47c2, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u927d\u4e72\ua068\u946b\u99f7\u8413, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709))
            var_7_74 = invokevirtual:String(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\ubefe\ucfaf\ud36e\u71ae\uafe7\u47c2, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u071d\u47c2\u624e\u97e6\ufe34\u7d52, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709))
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u72f1\u5f50\u51fa\ubcb0\u0b8e\uafe7, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p1:int, p2:int)
            invokevirtual:void(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\u47c2\u0800\u6435\u97b7\ud12e\u72f1, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u927d\u4e72\ua068\u946b\u99f7\u8413, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), var_6_6B:String)
            invokevirtual:void(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\u47c2\u0800\u6435\u97b7\ud12e\u72f1, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u071d\u47c2\u624e\u97e6\ufe34\u7d52, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), var_7_74:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3d4b\uf94d\ub83f\ub113\ua3b4\u965f(java.lang.String p0) {
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
            invokespecial:void(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u3711\uc2e8\u67d0\u873d\u67d0\u3bc9, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709)
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
            invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u7bad\ub171\u61a4\ubff1\u6d69\u6cfe, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709)), and:int[expected:boolean](ldc:int(-15265), ldc:int(14752)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3a62\u5140\u92ff\ud7e8\uc29a\u52d3() {
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
            putfield:String(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u71ae\u3e2a\u4d85\u8bb0\u6d99\u3d64, getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u8cae\u4975\ucfaf\ufe34\ud12e\u4d85, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), invokevirtual:String(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\ubefe\ucfaf\ud36e\u71ae\uafe7\u47c2, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u071d\u47c2\u624e\u97e6\ufe34\u7d52, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709)))
            putfield:String(\ub8be\u071d\u527a\u3711\ubff1\u759a::\u4975\u600f\u92ee\u071d\u3bc9\u51b2, getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u8cae\u4975\ucfaf\ufe34\ud12e\u4d85, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), invokevirtual:String(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\ubefe\ucfaf\ud36e\u71ae\uafe7\u47c2, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u927d\u4e72\ua068\u946b\u99f7\u8413, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709)))
            invokeinterface:void(BooleanConsumer::accept, getfield:BooleanConsumer(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\uf9c5\u1187\u0a06\u34df\u3504\u3bc9, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), and:int[expected:boolean](ldc:int(18953), ldc:int(4113)))
            return:void()
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
            invokespecial:void(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u3711\uc2e8\u67d0\u873d\u67d0\u3bc9, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709)
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\uae5d\uc9f6\u4c04\u98a4\uc87f\ub70c, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u3711\uc2e8\u67d0\u873d\u67d0\u3bc9() {
        var_1_61 : int
        var_3_69 : String
        stack_BD_0 : int [generated]
        var_1_BC : int
        var_4_BD : int
        stack_FD_0 : \u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d [generated]
        stack_FD_1 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-1516321260), ldc:int(-1212195357))
            var_3_69 = invokevirtual:String(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\ubefe\ucfaf\ud36e\u71ae\uafe7\u47c2, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u927d\u4e72\ua068\u946b\u99f7\u8413, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709))
            
            if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, var_3_69:String))) {
                if (cmpgt:boolean(arraylength:int(invokevirtual:String[](String::split, var_3_69:String, loadelement:String(getstatic:String[](\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\uc87f\ubefe\u4bc8\u67d0\ubff1\u5bc4), xor:int(ldc:int(4136), ldc:int(4142))))), ldc:int(0))) {
                    if (cmpeq:boolean(invokevirtual:int(String::indexOf, var_3_69:String, ldc:int(32)), ldc:int(-1))) {
                        stack_BD_0 = and:int(ldc:int(17815), ldc:int(10825))
                        goto(Label_0183)
                    }
                }
            }
            
            var_1_61 = and:int(var_1_61:int, ldc:int(-1214294482))
            stack_BD_0 = and:int(ldc:int(23905), ldc:int(-32116))
            Label_0183:
            var_1_BC = and:int(var_1_61:int, ldc:int(-1476624473))
            var_4_BD = stack_BD_0:int
            stack_FD_0 = getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u74b1\u6b0d\u927d\u9033\u92ff\u4179, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709)
            
            if (logicaland:boolean(cmpne:boolean(var_4_BD:int, ldc:int(0)), logicalnot:boolean(invokevirtual:boolean(String::isEmpty, invokevirtual:String(\ua61f\u40a9\u3776\u946b\u8389\u98a4::\ubefe\ucfaf\ud36e\u71ae\uafe7\u47c2, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u071d\u47c2\u624e\u97e6\ufe34\u7d52, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709)))))) {
                stack_FD_1 = xor:int[expected:boolean](ldc:int(-32620), ldc:int(-32619))
            }
            else {
                var_1_BC = and:int(var_1_BC:int, ldc:int(-1078242181))
                stack_FD_1 = and:int[expected:boolean](ldc:int(205), ldc:int(-206))
            }
            
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, stack_FD_0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, stack_FD_1:boolean)
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
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), getfield:ITextComponent(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\ud36e\uafe7\ubf56\uc229\u51b2\u8413, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), div:int(getfield:int(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), and:int(ldc:int(2727), ldc:int(24578))), ldc:int(17), ldc:int(16777215))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub32d\u3e75\uc7fe\u92ff\u9937\u5f50, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), getstatic:ITextComponent(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u7043\u88c5\u6cfe\u8753\u8640\ubcb0), sub:int(div:int(getfield:int(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), xor:int(ldc:int(18), ldc:int(16))), ldc:int(100)), ldc:int(53), ldc:int(10526880))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub32d\u3e75\uc7fe\u92ff\u9937\u5f50, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), getstatic:ITextComponent(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\ub8be\u5fe1\ubff1\uc238\u183a\u8d98), sub:int(div:int(getfield:int(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), xor:int(ldc:int(12353), ldc:int(12355))), ldc:int(100)), ldc:int(94), ldc:int(10526880))
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u071d\u47c2\u624e\u97e6\ufe34\u7d52, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\ua61f\u40a9\u3776\u946b\u8389\u98a4[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u927d\u4e72\ua068\u946b\u99f7\u8413, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6bb9\u92ff\u51b2\u960f\u416d\u0c95$3(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokeinterface:void(BooleanConsumer::accept, getfield:BooleanConsumer(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\uf9c5\u1187\u0a06\u34df\u3504\u3bc9, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), and:int[expected:boolean](ldc:int(-28219), ldc:int(28176)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uc9f6\ub113\u88c5\u51b2\u624e\u99f7$2(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u3a62\u5140\u92ff\ud7e8\uc29a\u52d3, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u97b7\u71f1\uc7fe\u1833\u946b\uc4d2$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\ub8be\u071d\u527a\u3711\ubff1\u759a::\ub32d\u8389\u392e\u4ab3\uceb8\uc4d2, getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u8cae\u4975\ucfaf\ufe34\ud12e\u4d85, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), loadelement:\u9937\u5d20\u9af2\u3dd3\u3c25\u416d(invokestatic:\u9937\u5d20\u9af2\u3dd3\u3c25\u416d[](\u9937\u5d20\u9af2\u3dd3\u3c25\u416d::values), rem:int(add:int(invokevirtual:int(Enum<E>::ordinal, invokevirtual:\u9937\u5d20\u9af2\u3dd3\u3c25\u416d[expected:Enum<\u9937\u5d20\u9af2\u3dd3\u3c25\u416d>](\ub8be\u071d\u527a\u3711\ubff1\u759a::\uc238\u965f\u8640\u4bc8\u51b2\u1833, getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u8cae\u4975\ucfaf\ufe34\ud12e\u4d85, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709))), xor:int(ldc:int(2052), ldc:int(2053))), arraylength:int(invokestatic:\u9937\u5d20\u9af2\u3dd3\u3c25\u416d[](\u9937\u5d20\u9af2\u3dd3\u3c25\u416d::values)))))
            invokevirtual:void(\u5654\u3e75\u92ff\u97e6\u8c8a\uf995::\u8350\u51b2\u3c25\u71ae\ube23\u6fb0, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d[expected:\u5654\u3e75\u92ff\u97e6\u8c8a\uf995](\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u1833\u6d99\ua068\u7006\u8d98\uc4d2, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709), invokestatic:ITextComponent(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u4e72\ub19c\ud51e\ubded\uc29a\u983f, invokevirtual:\u9937\u5d20\u9af2\u3dd3\u3c25\u416d(\ub8be\u071d\u527a\u3711\ubff1\u759a::\uc238\u965f\u8640\u4bc8\u51b2\u1833, getfield:\ub8be\u071d\u527a\u3711\ubff1\u759a(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u8cae\u4975\ucfaf\ufe34\ud12e\u4d85, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ud217\u120d\u9033\uafe7\u6d69\ubded$0(java.lang.String p0) {
        var_1_15A : int
        var_3_E1 : String[]
        stack_168_0 : int [generated]
        
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
        var_1_15A = and:int(ldc:int(-2009051365), ldc:int(-1958609346))
        
        loop {
            if (cmpne:boolean(and:int(var_1_15A:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0167)
            }
            
            if (cmpne:boolean(and:int(var_1_15A:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_15A = and:int(var_1_15A:int, ldc:int(-119069303))
            }
            else {
                var_1_15A = and:int(var_1_15A:int, ldc:int(2146233934))
                
                if (logicalnot:boolean(invokestatic:boolean(\uc84e\u40a9\uc9f6\u4492\u3776\u4c04::\u56bd\u0800\ub171\uc31c\u99f7\uc9f6, p0:String))) {
                    var_3_E1 = invokevirtual:String[](String::split, p0:String, loadelement:String(getstatic:String[](\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\uc87f\ubefe\u4bc8\u67d0\ubff1\u5bc4), xor:int(ldc:int(4378), ldc:int(4380))))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_1_15A:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0284)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_15A:int, ldc:int(134217728)), ldc:int(0))) {
                            var_1_15A = and:int(var_1_15A:int, ldc:int(1585270574))
                            
                            if (cmpne:boolean(arraylength:int(var_3_E1:String[]), ldc:int(0))) {
                                try {
                                    invokestatic:String(IDN::toASCII, loadelement:String(var_3_E1:String[], and:int(ldc:int(-7554), ldc:int(5505))))
                                    var_1_15A = and:int(var_1_15A:int, ldc:int(-287183238))
                                    stack_168_0 = xor:int(ldc:int(16416), ldc:int(16417))
                                    var_1_15A = and:int(var_1_15A:int, ldc:int(1792372299))
                                    return:boolean(stack_168_0:int)
                                }
                                catch (java.lang.IllegalArgumentException var_4_16D) {
                                    return:boolean(and:int[expected:boolean](ldc:int(-15145), ldc:int(14632)))
                                }
                            }
                        }
                        
                        Label_0253:
                        
                        if (cmpeq:boolean(and:int(var_1_15A:int, ldc:int(512)), ldc:int(0))) {
                            var_1_15A = and:int(var_1_15A:int, ldc:int(1623060065))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_1_15A:int, ldc:int(2)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_1_15A = and:int(var_1_15A:int, ldc:int(-546185525))
                        }
                        
                        Label_0284:
                        
                        if (cmpeq:boolean(and:int(var_1_15A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_1_15A = and:int(var_1_15A:int, ldc:int(1525879055))
                            goto(Label_0253)
                        }
                        
                        if (cmpne:boolean(and:int(var_1_15A:int, ldc:int(134217728)), ldc:int(0))) {
                            return:boolean(xor:int[expected:boolean](ldc:int(-32246), ldc:int(-32245)))
                        }
                    }
                }
            }
            
            Label_0136:
            
            if (cmpeq:boolean(and:int(var_1_15A:int, ldc:int(134217728)), ldc:int(0))) {
                var_1_15A = and:int(var_1_15A:int, ldc:int(-1542302808))
            }
            else {
                if (cmpeq:boolean(and:int(var_1_15A:int, ldc:int(16384)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_1_15A = and:int(var_1_15A:int, ldc:int(1827860171))
            }
            
            Label_0167:
            
            if (cmpne:boolean(and:int(var_1_15A:int, ldc:int(4)), ldc:int(0))) {
                var_1_15A = and:int(var_1_15A:int, ldc:int(1259169537))
                goto(Label_0136)
            }
            
            if (cmpeq:boolean(and:int(var_1_15A:int, ldc:int(524288)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(28225), ldc:int(307)))
            }
        }
    }
    
    static {
        var_0_91 : int
        expr_6E : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_21F_0 : byte[] [generated]
        stack_281_0 : byte[] [generated]
        stack_2FC_0 : byte[] [generated]
        var_4_200 : int
        var_3_205 : byte[]
        var_5_206 : int
        expr_225 : byte [generated]
        var_0_29B : int
        expr_281 : byte [generated]
        stack_2CA_2 : byte [generated]
        stack_29E_0 : byte [generated]
        expr_96 : int [generated]
        var_2_C5 : byte[]
        expr_C9 : int [generated]
        var_3_2EA : byte[]
        var_5_2EB : int
        var_3_FA : String
        stack_1CF_0 : String[] [generated]
        expr_10C : String[] [generated]
        
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
        var_0_91 = and:int(ldc:int(1426168764), ldc:int(-442718305))
        expr_6E = arraylength:int(stack_94_0 = stack_96_0 = stack_C5_0 = stack_C7_0 = stack_EE_0 = stack_21F_0 = stack_281_0 = stack_2FC_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("B8+a6+uoK4x0bKhsQ598rOvrqCuMZEz3XJIQp3i0XI9Y6+uoK4xkTPdckgBkTLRgw58cqPfrqCuMtGDzuIqssFgYBGCLsOenbLDv66grjJtY47xP/XEtAWHT")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_200 = expr_6E:int
        var_3_205 = newarray:byte[](byte.class, expr_6E:int)
        var_5_206 = expr_6E:int
        Label_0520:
        
        while (cmpeq:boolean(and:int(var_0_91:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_91 = and:int(var_0_91:int, ldc:int(1835392959))
            var_5_206 = add:int(var_5_206:int, ldc:int(-1))
            expr_225 = add:byte(xor:byte(loadelement:byte(stack_21F_0:byte[], var_5_206:int), ldc:byte(68)), ldc:byte(28))
            storeelement:byte(var_3_205:byte[], var_5_206:int, or:int(and:int(shl:int(expr_225:byte, xor:int(ldc:int(5504), ldc:int(5508))), ldc:int(-16)), and:int(shr:int(expr_225:byte[expected:int], and:int(ldc:int(6294), ldc:int(36))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_206:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C5_0 = stack_C7_0 = stack_EE_0 = stack_21F_0 = stack_281_0 = stack_2FC_0 = var_3_205:byte[]
            goto(Label_0115)
        }
        
        Label_0618:
        
        while (cmpeq:boolean(and:int(var_0_91:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_29B = and:int(var_0_91:int, ldc:int(1332601757))
            var_5_206 = add:int(var_5_206:int, ldc:int(-1))
            expr_281 = stack_2CA_2 = loadelement(stack_281_0, var_5_206)
            
            if (cmplt:boolean(add:int(add:int(var_5_206:int, ldc:int(5)), neg:int(var_4_200:int)), ldc:int(0))) {
                stack_2CA_2 = stack_29E_0 = add:byte(expr_281:byte, loadelement:byte(var_3_205:byte[], add:int(var_5_206:int, ldc:int(5))))
                goto(Label_0686)
            }
            
            Label_0654:
            
            if (cmpne:boolean(and:int(var_0_29B:int, ldc:int(4)), ldc:int(0))) {
                var_0_29B = and:int(var_0_29B:int, ldc:int(489678301))
                stack_2CA_2 = stack_29E_0 = add:byte(expr_281:byte, ldc:byte(5))
            }
            
            Label_0686:
            
            if (cmpne:boolean(and:int(var_0_29B:int, ldc:int(524288)), ldc:int(0))) {
                var_0_29B = and:int(var_0_29B:int, ldc:int(-1806746419))
                goto(Label_0654)
            }
            
            var_0_91 = and:int(var_0_29B:int, ldc:int(-1244678764))
            storeelement:byte(var_3_205:byte[], var_5_206:int, stack_2CA_2:byte)
            
            if (cmpne:boolean(var_5_206:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C5_0 = stack_C7_0 = stack_EE_0 = stack_21F_0 = stack_281_0 = stack_2FC_0 = var_3_205:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0520)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_91:int, ldc:int(67108864)), ldc:int(0))) {
            var_0_91 = and:int(var_0_91:int, ldc:int(953550486))
            goto(Label_0206)
        }
        
        if (cmpeq:boolean(and:int(var_0_91:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_91 = and:int(var_0_91:int, ldc:int(1207546300))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_200 = expr_96:int
                var_3_205 = newarray:byte[](byte.class, expr_96:int)
                var_5_206 = expr_96:int
                goto(Label_0618)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_91:int, ldc:int(8192)), ldc:int(0))) {
            var_0_91 = and:int(var_0_91:int, ldc:int(-622138047))
        }
        else {
            if (cmpne:boolean(and:int(var_0_91:int, ldc:int(8192)), ldc:int(0))) {
                var_0_91 = and:int(var_0_91:int, ldc:int(-682783028))
                goto(Label_0115)
            }
            
            var_0_91 = and:int(var_0_91:int, ldc:int(1604751324))
            var_2_C5 = stack_C5_0:byte[]
            expr_C9 = add:int(arraylength:int(stack_C7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C9:int, ldc:int(0))) {
                var_3_2EA = newarray:byte[](byte.class, expr_C9:int)
                var_5_2EB = expr_C9:int
                
                loop {
                    var_0_91 = and:int(var_0_91:int, ldc:int(-1253524042))
                    var_5_2EB = add:int(var_5_2EB:int, ldc:int(-1))
                    storeelement:byte(var_3_2EA:byte[], var_5_2EB:int, add:int(shl:int(loadelement:byte(stack_2FC_0:byte[], var_5_2EB:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_C5:byte[], add:int(var_5_2EB:int, xor:int(ldc:int(20864), ldc:int(20865)))), ldc:int(6)), and:int(ldc:int(28179), ldc:int(4483)))))
                    
                    if (cmpne:boolean(var_5_2EB:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C5_0 = stack_C7_0 = stack_EE_0 = stack_21F_0 = stack_281_0 = stack_2FC_0 = var_3_2EA:byte[]
            }
        }
        
        Label_0206:
        
        if (cmpne:boolean(and:int(var_0_91:int, ldc:int(8192)), ldc:int(0))) {
            var_0_91 = and:int(var_0_91:int, ldc:int(465811584))
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_91:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_FA = initobject:String(String::<init>, stack_EE_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_1CF_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32756), ldc:int(-32757)))
            expr_10C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(35), ldc:int(36)))
            storeelement:String(expr_10C:String[], and:int(ldc:int(4271), ldc:int(17414)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(8644), ldc:int(-8645)), and:int(ldc:int(4137), ldc:int(8273))))
            storeelement:String(expr_10C:String[], xor:int(ldc:int(396), ldc:int(393)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(839), ldc:int(1161)), and:int(ldc:int(18023), ldc:int(11))))
            storeelement:String(expr_10C:String[], and:int(ldc:int(323), ldc:int(8371)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(687), ldc:int(23619)), xor:int(ldc:int(4173), ldc:int(4189))))
            storeelement:String(expr_10C:String[], and:int(ldc:int(1810), ldc:int(11)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(3600), ldc:int(312)), and:int(ldc:int(16417), ldc:int(10149))))
            storeelement:String(expr_10C:String[], xor:int(ldc:int(5), ldc:int(4)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(801), ldc:int(233)), and:int(ldc:int(566), ldc:int(2100))))
            storeelement:String(expr_10C:String[], and:int(ldc:int(20997), ldc:int(1420)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(4404), ldc:int(694)), and:int(ldc:int(8651), ldc:int(22602))))
            storeelement:String(expr_10C:String[], and:int(ldc:int(2898), ldc:int(-3923)), invokevirtual:String[expected:String](String::substring, var_3_FA:String, and:int(ldc:int(2506), ldc:int(17487)), and:int(ldc:int(89), ldc:int(1625))))
            putstatic:String[](\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\uc87f\ubefe\u4bc8\u67d0\ubff1\u5bc4, expr_10C:String[])
            putstatic:ITextComponent(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\u7043\u88c5\u6cfe\u8753\u8640\ubcb0, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\uc87f\ubefe\u4bc8\u67d0\ubff1\u5bc4), xor:int(ldc:int(293), ldc:int(292)))))
            putstatic:ITextComponent(\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\ub8be\u5fe1\ubff1\uc238\u183a\u8d98, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u5f50\u6198\u0b8e\ud51e\ubff1\u8709::\uc87f\ubefe\u4bc8\u67d0\ubff1\u5bc4), xor:int(ldc:int(2325), ldc:int(2327)))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_672 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_67D : int
        
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
        var_3_672 = and:int(ldc:int(879040419), ldc:int(770744317))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u5f50\u6198\u0b8e\ud51e\ubff1\u8709[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
            var_3_672 = and:int(var_3_672:int, ldc:int(-413195686))
        }
        else {
            var_3_672 = and:int(var_3_672:int, ldc:int(746306533))
            var_5_8A = and:int(ldc:int(6681), ldc:int(-6714))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(74), ldc:int(-75)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_672:int, ldc:int(1987492257))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(17433), ldc:int(195)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(8465), ldc:int(18127)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_672 = and:int(var_3_DA:int, ldc:int(-1241910861))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(781), ldc:int(65)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1835462737))
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1451976948))
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1654137200))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1407773014))
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-143525718))
                    }
                    else {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1501817616))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0568)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0420:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-342390994))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-551765618))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1828027825))
                            var_11_EB = and:int(ldc:int(-753), ldc:int(752))
                            goto(Label_1517)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0568:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1910186321))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1296312663))
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1035358597))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2043016147))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1110915373))
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(803935999))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(28959154))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(211179451))
                        goto(Label_0941)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(886230822))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(2141622735))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-328894555))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-509212317))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-2035636924))
                            goto(Label_0420)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-285846862))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(11617), ldc:int(537))
                                goto(Label_1101)
                            }
                        }
                    }
                    
                    Label_0941:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(2108931498))
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1157896842))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(785919260))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-1707309284))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(1701853374))
                        var_11_EB = and:int(ldc:int(-24139), ldc:int(24074))
                    }
                    
                    Label_1101:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_0941)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1868430578))
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-181577752))
                            goto(Label_0568)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1471811242))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1519437650))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1371)
                            }
                        }
                    }
                    
                    Label_1217:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-983347410))
                        goto(Label_1528)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-771563332))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(32475279))
                            goto(Label_1101)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0941)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1804226507))
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(1952935232))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_672:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0568)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0420)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_672 = and:int(var_3_672:int, ldc:int(-814795150))
                            loopcontinue()
                        }
                        
                        var_3_672 = and:int(var_3_672:int, ldc:int(-461884254))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                        goto(Label_1517)
                    }
                    
                    Label_1371:
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1528)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1374145137))
                        goto(Label_1217)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1318369676))
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(64)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-14458322))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1616850557))
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-710722225))
                        goto(Label_0568)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0420)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(67108864)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_672 = and:int(var_3_672:int, ldc:int(-1369369872))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1517:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_67D = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1528:
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1371)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-161388127))
                        goto(Label_1217)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1101)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(32)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(732884297))
                        goto(Label_0941)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1550484018))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1182028579))
                        goto(Label_0568)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(-1751309155))
                        goto(Label_0420)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_672:int, ldc:int(128)), ldc:int(0))) {
                        var_3_672 = and:int(var_3_672:int, ldc:int(1851873001))
                        var_17_67D = add:int(var_16_119:int, and:int(ldc:int(3), ldc:int(18497)))
                        looporswitchbreak()
                    }
                }
                
                var_3_672 = and:int(var_3_672:int, ldc:int(-1520307230))
                
                if (cmple:boolean(var_5_8A = var_17_67D:int, sub:int(var_6_91:int, xor:int(ldc:int(17408), ldc:int(17409))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_672:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
