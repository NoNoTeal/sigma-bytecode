public class \u51fa\u12cb\u7330\u74b1\u6c52.\u983f\u4f4a\u873d\u6bb9\u873d {
    public void \u983f\u4f4a\u873d\u6bb9\u873d(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u3dd3\u76bc\u8753\u071d\u56bd p1) {
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
            invokespecial:\u99f7\u7006\u6198\u47c2\ub1b9\u12cb(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::<init>, this:\u983f\u4f4a\u873d\u6bb9\u873d)
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u983f\u4f4a\u873d\u6bb9\u873d::\u946b\u47c2\u8cae\u8df4\u72f1, this:\u983f\u4f4a\u873d\u6bb9\u873d, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            putfield:\u3dd3\u76bc\u8753\u071d\u56bd(\u983f\u4f4a\u873d\u6bb9\u873d::\u7043\u6d69\u416d\u0a06\ud36e, this:\u983f\u4f4a\u873d\u6bb9\u873d, p1:\u3dd3\u76bc\u8753\u071d\u56bd)
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
            invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u7bad\ub171\u61a4\ubff1\u6d69\u6cfe, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u983f\u4f4a\u873d\u6bb9\u873d::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u983f\u4f4a\u873d\u6bb9\u873d)), and:int[expected:boolean](ldc:int(5388), ldc:int(-5389)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc229\u3a62\u12cb\ud51e\uafe7\u8308(int p0, int p1, int p2) {
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
        
        if (cmpne:boolean(p0:int, xor:int(ldc:int(7306), ldc:int(7562)))) {
            return:boolean(invokespecial:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\u983f\u4f4a\u873d\u6bb9\u873d[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:int, p1:int, p2:int))
        }
        
        invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u983f\u4f4a\u873d\u6bb9\u873d::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u983f\u4f4a\u873d\u6bb9\u873d), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u983f\u4f4a\u873d\u6bb9\u873d::\u946b\u47c2\u8cae\u8df4\u72f1, this:\u983f\u4f4a\u873d\u6bb9\u873d))
        return:boolean(and:int[expected:boolean](ldc:int(1185), ldc:int(273)))
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
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u983f\u4f4a\u873d\u6bb9\u873d[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u983f\u4f4a\u873d\u6bb9\u873d::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u983f\u4f4a\u873d\u6bb9\u873d), loadelement:String(getstatic:String[](\u983f\u4f4a\u873d\u6bb9\u873d::\u34df\ua3b4\u6c52\u8258\u0c95), and:int(ldc:int(-32522), ldc:int(27913))), div:int(getfield:int(\u983f\u4f4a\u873d\u6bb9\u873d::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u983f\u4f4a\u873d\u6bb9\u873d), xor:int(ldc:int(18529), ldc:int(18531))), ldc:int(10), ldc:int(16777215))
            invokevirtual:void(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<E>::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\uc2e8\u4f4a\u4e72\uc2bd\u839e[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u3dd3\u3c25\u6d99\u527a\u7330>](\u983f\u4f4a\u873d\u6bb9\u873d::\u718f\u4d85\u71ae\u88c5\ub102, this:\u983f\u4f4a\u873d\u6bb9\u873d), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u983f\u4f4a\u873d\u6bb9\u873d[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private net.minecraft.util.text.ITextComponent \u3e2a\u8753\u873d\ubded\u6d99\ub18d(java.lang.String p0, java.lang.String p1) {
        var_5_67 : String
        
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
        var_5_67 = invokevirtual:String(String::toLowerCase, p0:String, getstatic:Locale(Locale::ROOT))
        
        if (logicaland:boolean(invokevirtual:boolean(String::contains, var_5_67:String, loadelement:String[expected:CharSequence](getstatic:String[](\u983f\u4f4a\u873d\u6bb9\u873d::\u34df\ua3b4\u6c52\u8258\u0c95), and:int(ldc:int(37), ldc:int(4105)))), invokevirtual:boolean(String::contains, var_5_67:String, loadelement:String[expected:CharSequence](getstatic:String[](\u983f\u4f4a\u873d\u6bb9\u873d::\u34df\ua3b4\u6c52\u8258\u0c95), and:int(ldc:int(16451), ldc:int(2218)))))) {
            return:ITextComponent(invokespecial:ITextComponent(\u983f\u4f4a\u873d\u6bb9\u873d::\ud36e\u5245\u8cae\ub7dc\u59ec\u7049, this:\u983f\u4f4a\u873d\u6bb9\u873d, p1:String))
        }
        
        return:ITextComponent(ternaryop:ITextComponent(logicaland:boolean(invokevirtual:boolean(String::contains, var_5_67:String, loadelement:String[expected:CharSequence](getstatic:String[](\u983f\u4f4a\u873d\u6bb9\u873d::\u34df\ua3b4\u6c52\u8258\u0c95), xor:int(ldc:int(2052), ldc:int(2053)))), invokevirtual:boolean(String::contains, var_5_67:String, loadelement:String[expected:CharSequence](getstatic:String[](\u983f\u4f4a\u873d\u6bb9\u873d::\u34df\ua3b4\u6c52\u8258\u0c95), and:int(ldc:int(4163), ldc:int(8711))))), invokespecial:ITextComponent(\u983f\u4f4a\u873d\u6bb9\u873d::\ufcaf\u5fe1\u120d\ub7dc\u3504\u760c, this:\u983f\u4f4a\u873d\u6bb9\u873d, p1:String), initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, p1:String)))
    }
    
    private net.minecraft.util.text.ITextComponent \ufcaf\u5fe1\u120d\ub7dc\u3504\u760c(java.lang.String p0) {
        var_2_5F : int
        
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
        var_2_5F = and:int(ldc:int(-815297484), ldc:int(-931418151))
        
        try {
            var_2_5F = and:int(var_2_5F:int, ldc:int(2065995513))
            return:ITextComponent(loadelement:ITextComponent(getstatic:ITextComponent[](\u3776\ua6bd\u3711\uceb8\u88c5::\ubff1\u92ee\u5db4\u647c\uc7fe), invokestatic:int(Integer::parseInt, p0:String)))
        }
        catch (java.lang.Exception var_4_72) {
            return:ITextComponent(initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, loadelement:String(getstatic:String[](\u983f\u4f4a\u873d\u6bb9\u873d::\u34df\ua3b4\u6c52\u8258\u0c95), and:int(ldc:int(8517), ldc:int(16516)))))
        }
    }
    
    private net.minecraft.util.text.ITextComponent \ud36e\u5245\u8cae\ub7dc\u59ec\u7049(java.lang.String p0) {
        var_2_5F : int
        
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
        var_2_5F = and:int(ldc:int(1522844801), ldc:int(-640986699))
        
        try {
            var_2_5F = and:int(var_2_5F:int, ldc:int(1274303977))
            return:ITextComponent(loadelement:ITextComponent(getstatic:ITextComponent[](\u3776\ua6bd\u3711\uceb8\u88c5::\u965f\u4c2b\u5fe1\uc238\uc2e8), invokestatic:int(Integer::parseInt, p0:String)))
        }
        catch (java.lang.Exception var_4_72) {
            return:ITextComponent(initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, loadelement:String(getstatic:String[](\u983f\u4f4a\u873d\u6bb9\u873d::\u34df\ua3b4\u6c52\u8258\u0c95), xor:int(ldc:int(280), ldc:int(284)))))
        }
    }
    
    private void lambda$\u7ce1\uc84e\u97e6\uc3e3\u7043\u6c52$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u983f\u4f4a\u873d\u6bb9\u873d::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u983f\u4f4a\u873d\u6bb9\u873d), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u983f\u4f4a\u873d\u6bb9\u873d::\u946b\u47c2\u8cae\u8df4\u72f1, this:\u983f\u4f4a\u873d\u6bb9\u873d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 \ucfaf\u446c\u67e9\u52d3\u3776\ud523(\u51fa\u12cb\u7330\u74b1\u6c52.\u983f\u4f4a\u873d\u6bb9\u873d p0) {
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
            return:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u983f\u4f4a\u873d\u6bb9\u873d::\u647c\u8709\u7c6b\uc246\u9033\u5245, p0:\u983f\u4f4a\u873d\u6bb9\u873d))
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.ITextComponent \u8df4\u071d\ud217\u6ec6\u4c2b\u72f1(\u51fa\u12cb\u7330\u74b1\u6c52.\u983f\u4f4a\u873d\u6bb9\u873d p0, java.lang.String p1, java.lang.String p2) {
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
            return:ITextComponent(invokespecial:ITextComponent(\u983f\u4f4a\u873d\u6bb9\u873d::\u3e2a\u8753\u873d\ubded\u6d99\ub18d, p0:\u983f\u4f4a\u873d\u6bb9\u873d, p1:String, p2:String))
        }
        
        goto(Label_0006)
    }
    
    public static \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\u3dd3\u76bc\u8753\u071d\u56bd \u5fe1\u873d\u946b\u8753\u99f7\uc238(\u51fa\u12cb\u7330\u74b1\u6c52.\u983f\u4f4a\u873d\u6bb9\u873d p0) {
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
            return:\u3dd3\u76bc\u8753\u071d\u56bd(getfield:\u3dd3\u76bc\u8753\u071d\u56bd(\u983f\u4f4a\u873d\u6bb9\u873d::\u7043\u6d69\u416d\u0a06\ud36e, p0:\u983f\u4f4a\u873d\u6bb9\u873d))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_203 : int
        expr_6B : int [generated]
        stack_99_0 : byte[] [generated]
        stack_9B_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_CD_0 : byte[] [generated]
        stack_104_0 : byte[] [generated]
        stack_106_0 : byte[] [generated]
        stack_13C_0 : byte[] [generated]
        stack_21E_0 : byte[] [generated]
        stack_259_0 : byte[] [generated]
        stack_2BF_0 : byte[] [generated]
        stack_338_0 : byte[] [generated]
        var_4_1EE : int
        var_3_1F3 : byte[]
        var_5_1F4 : int
        expr_2C2 : byte [generated]
        var_0_32E : int
        expr_338 : byte [generated]
        stack_368_2 : byte [generated]
        var_2_99 : byte[]
        expr_9D : int [generated]
        var_3_247 : byte[]
        var_5_248 : int
        expr_CD : int [generated]
        expr_106 : int [generated]
        var_3_148 : String
        stack_1E7_0 : String[] [generated]
        expr_15A : String[] [generated]
        
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
        var_0_203 = and:int(ldc:int(1843231557), ldc:int(1997143902))
        expr_6B = arraylength:int(stack_99_0 = stack_9B_0 = stack_CB_0 = stack_CD_0 = stack_104_0 = stack_106_0 = stack_13C_0 = stack_21E_0 = stack_259_0 = stack_2BF_0 = stack_338_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("zI8ISXPuXe7ZeQkAbM2GURMa6jJpCyGxufZqYDgyZD5Z8mBaYEn/9/0gUGP1Az81My4=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1EE = expr_6B:int
        var_3_1F3 = newarray:byte[](byte.class, expr_6B:int)
        var_5_1F4 = expr_6B:int
        Label_0502:
        
        while (cmpne:boolean(and:int(var_0_203:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_203:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0672)
            }
            
            var_0_203 = and:int(var_0_203:int, ldc:int(-1083184217))
            var_5_1F4 = add:int(var_5_1F4:int, ldc:int(-1))
            storeelement:byte(var_3_1F3:byte[], var_5_1F4:int, add:byte(loadelement:byte(stack_21E_0:byte[], var_5_1F4:int), ldc:byte(82)))
            
            if (cmpne:boolean(var_5_1F4:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9B_0 = stack_99_0 = stack_CB_0 = stack_CD_0 = stack_104_0 = stack_106_0 = stack_13C_0 = stack_21E_0 = stack_259_0 = stack_2BF_0 = stack_338_0 = var_3_1F3:byte[]
            goto(Label_0112)
        }
        
        var_0_203 = and:int(var_0_203:int, ldc:int(1855847075))
        goto(Label_0775)
        Label_0672:
        
        while (cmpne:boolean(and:int(var_0_203:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_203:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0502)
            }
            
            var_0_203 = and:int(var_0_203:int, ldc:int(-1588864811))
            var_5_1F4 = add:int(var_5_1F4:int, ldc:int(-1))
            expr_2C2 = xor:byte(loadelement:byte(stack_2BF_0:byte[], var_5_1F4:int), ldc:byte(58))
            storeelement:byte(var_3_1F3:byte[], var_5_1F4:int, or:int(and:int(shl:int(expr_2C2:byte, xor:int(ldc:int(35), ldc:int(39))), ldc:int(-16)), and:int(shr:int(expr_2C2:byte[expected:int], and:int(ldc:int(596), ldc:int(2060))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_1F4:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9B_0 = stack_99_0 = stack_CB_0 = stack_CD_0 = stack_104_0 = stack_106_0 = stack_13C_0 = stack_21E_0 = stack_259_0 = stack_2BF_0 = stack_338_0 = var_3_1F3:byte[]
            goto(Label_0210)
        }
        
        Label_0775:
        
        while (cmpne:boolean(and:int(var_0_203:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_203:int, ldc:int(4)), ldc:int(0))) {
                var_0_203 = and:int(var_0_203:int, ldc:int(916595076))
                goto(Label_0502)
            }
            
            var_0_32E = and:int(var_0_203:int, ldc:int(-507646298))
            var_5_1F4 = add:int(var_5_1F4:int, ldc:int(-1))
            expr_338 = loadelement:byte(stack_338_0:byte[], var_5_1F4:int)
            
            if (cmpge:boolean(add:int(add:int(var_5_1F4:int, ldc:int(4)), neg:int(var_4_1EE:int)), ldc:int(0))) {
                var_0_32E = and:int(var_0_32E:int, ldc:int(-146941401))
                stack_368_2 = add:byte(expr_338:byte, ldc:byte(4))
            }
            else {
                stack_368_2 = add:byte(expr_338:byte, loadelement:byte(var_3_1F3:byte[], add:int(var_5_1F4:int, ldc:int(4))))
            }
            
            var_0_203 = and:int(var_0_32E:int, ldc:int(897579493))
            storeelement:byte(var_3_1F3:byte[], var_5_1F4:int, stack_368_2:byte)
            
            if (cmpne:boolean(var_5_1F4:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9B_0 = stack_99_0 = stack_CB_0 = stack_CD_0 = stack_104_0 = stack_106_0 = stack_13C_0 = stack_21E_0 = stack_259_0 = stack_2BF_0 = stack_338_0 = var_3_1F3:byte[]
            goto(Label_0267)
        }
        
        var_0_203 = and:int(var_0_203:int, ldc:int(1987292703))
        goto(Label_0672)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_203:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpeq:boolean(and:int(var_0_203:int, ldc:int(16384)), ldc:int(0))) {
            var_0_203 = and:int(var_0_203:int, ldc:int(1660626921))
            goto(Label_0210)
        }
        
        if (cmpne:boolean(and:int(var_0_203:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_203 = and:int(var_0_203:int, ldc:int(1001381317))
            var_2_99 = stack_99_0:byte[]
            expr_9D = add:int(arraylength:int(stack_9B_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_9D:int, ldc:int(0))) {
                var_3_247 = newarray:byte[](byte.class, expr_9D:int)
                var_5_248 = expr_9D:int
                
                loop {
                    var_0_203 = and:int(var_0_203:int, ldc:int(858512758))
                    var_5_248 = add:int(var_5_248:int, ldc:int(-1))
                    storeelement:byte(var_3_247:byte[], var_5_248:int, add:int(shl:int(loadelement:byte(stack_259_0:byte[], var_5_248:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_99:byte[], add:int(var_5_248:int, xor:int(ldc:int(192), ldc:int(193)))), ldc:int(5)), and:int(ldc:int(5071), ldc:int(25623)))))
                    
                    if (cmpne:boolean(var_5_248:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9B_0 = stack_99_0 = stack_CB_0 = stack_CD_0 = stack_104_0 = stack_106_0 = stack_13C_0 = stack_21E_0 = stack_259_0 = stack_2BF_0 = stack_338_0 = var_3_247:byte[]
            }
        }
        
        Label_0162:
        
        if (cmpeq:boolean(and:int(var_0_203:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0267)
        }
        
        if (cmpne:boolean(and:int(var_0_203:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_203:int, ldc:int(8)), ldc:int(0))) {
                var_0_203 = and:int(var_0_203:int, ldc:int(-1895913053))
                goto(Label_0112)
            }
            
            var_0_203 = and:int(var_0_203:int, ldc:int(623476628))
            expr_CD = arraylength:int(stack_CD_0:byte[])
            
            if (cmpne:boolean(expr_CD:int, ldc:int(0))) {
                var_4_1EE = expr_CD:int
                var_3_1F3 = newarray:byte[](byte.class, expr_CD:int)
                var_5_1F4 = expr_CD:int
                goto(Label_0672)
            }
        }
        
        Label_0210:
        
        if (cmpne:boolean(and:int(var_0_203:int, ldc:int(65536)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_203:int, ldc:int(65536)), ldc:int(0))) {
                var_0_203 = and:int(var_0_203:int, ldc:int(-1494507863))
                goto(Label_0162)
            }
            
            if (cmpne:boolean(and:int(var_0_203:int, ldc:int(8)), ldc:int(0))) {
                var_0_203 = and:int(var_0_203:int, ldc:int(-2098921258))
                goto(Label_0112)
            }
            
            var_0_203 = and:int(var_0_203:int, ldc:int(-1448220113))
            expr_106 = arraylength:int(stack_106_0:byte[])
            
            if (cmpne:boolean(expr_106:int, ldc:int(0))) {
                var_4_1EE = expr_106:int
                var_3_1F3 = newarray:byte[](byte.class, expr_106:int)
                var_5_1F4 = expr_106:int
                goto(Label_0775)
            }
        }
        
        Label_0267:
        
        if (cmpne:boolean(and:int(var_0_203:int, ldc:int(8)), ldc:int(0))) {
            var_0_203 = and:int(var_0_203:int, ldc:int(-1867460053))
            goto(Label_0210)
        }
        
        if (cmpeq:boolean(and:int(var_0_203:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0162)
        }
        
        if (cmpeq:boolean(and:int(var_0_203:int, ldc:int(4)), ldc:int(0))) {
            var_0_203 = and:int(var_0_203:int, ldc:int(-1977637133))
            goto(Label_0112)
        }
        
        var_3_148 = initobject:String(String::<init>, stack_13C_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1E7_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1035), ldc:int(1038)))
        expr_15A = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(527), ldc:int(1029)))
        storeelement:String(expr_15A:String[], and:int(ldc:int(-23160), ldc:int(20565)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(-14694), ldc:int(12613)), and:int(ldc:int(1564), ldc:int(25))))
        storeelement:String(expr_15A:String[], xor:int(ldc:int(1089), ldc:int(1093)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(3149), ldc:int(3157)), and:int(ldc:int(927), ldc:int(4159))))
        storeelement:String(expr_15A:String[], xor:int(ldc:int(9734), ldc:int(9733)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(28191), ldc:int(159)), and:int(ldc:int(105), ldc:int(11325))))
        storeelement:String(expr_15A:String[], xor:int(ldc:int(-32247), ldc:int(-32248)), invokevirtual:String[expected:String](String::substring, var_3_148:String, and:int(ldc:int(2347), ldc:int(25721)), and:int(ldc:int(2157), ldc:int(8877))))
        storeelement:String(expr_15A:String[], and:int(ldc:int(1074), ldc:int(10762)), invokevirtual:String[expected:String](String::substring, var_3_148:String, xor:int(ldc:int(4138), ldc:int(4103)), and:int(ldc:int(8881), ldc:int(19505))))
        putstatic:String[](\u983f\u4f4a\u873d\u6bb9\u873d::\u34df\ua3b4\u6c52\u8258\u0c95, expr_15A:String[])
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_660 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_66B : int
        
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
        var_3_660 = and:int(ldc:int(773441923), ldc:int(1067412934))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u983f\u4f4a\u873d\u6bb9\u873d[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_660 = and:int(var_3_660:int, ldc:int(-1074181262))
            var_5_81 = and:int(ldc:int(3043), ldc:int(-23524))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-16958), ldc:int(16925)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_660:int, ldc:int(2094881039))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(8721), ldc:int(2117)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(513), ldc:int(3105)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_660 = and:int(var_3_D1:int, ldc:int(253617934))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(1067), ldc:int(28929)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1040079186))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-102678773))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-349415439))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-565316509))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1346503354))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0402:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-245673899))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-978530854))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1731888162))
                        goto(Label_0702)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1741340455))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1460420083))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(1583345566))
                        var_11_E2 = and:int(ldc:int(22662), ldc:int(-23687))
                        goto(Label_1526)
                    }
                    
                    Label_0577:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1824567986))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1226857113))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-941578459))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1357926294))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-566500565))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0843)
                        }
                    }
                    
                    Label_0702:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1081314378))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-320515130))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1763953383))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1915781554))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-2033390287))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(211645843))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0843:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(76761808))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(2035345839))
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-886985591))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(903841786))
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-605425902))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-308428029))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = and:int(ldc:int(4553), ldc:int(5))
                                goto(Label_1137)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1340871641))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(812410218))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1238792499))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-821482307))
                            goto(Label_0402)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1352830061))
                        var_11_E2 = and:int(ldc:int(18332), ldc:int(-20381))
                    }
                    
                    Label_1137:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1480592443))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-421868184))
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-669029548))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-2090722581))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(496596459))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1398)
                            }
                        }
                    }
                    
                    Label_1262:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-512362258))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_1137)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1823653737))
                            goto(Label_0977)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1178598975))
                            goto(Label_0843)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1798068364))
                            goto(Label_0702)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0402)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1918903317))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                            goto(Label_1526)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1398:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1707483262))
                        goto(Label_1262)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1705225651))
                        goto(Label_0843)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1928662286))
                        loopcontinue()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(-1912648309))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1526:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66B = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1537:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1398)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(305140467))
                        goto(Label_1262)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1137)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0843)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0702)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0402)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-830782706))
                        var_17_66B = add:int(var_16_110:int, and:int(ldc:int(24321), ldc:int(163)))
                        looporswitchbreak()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(-929439018))
                }
                
                var_3_660 = and:int(var_3_660:int, ldc:int(1585282994))
                
                if (cmple:boolean(var_5_81 = var_17_66B:int, sub:int(var_6_88:int, xor:int(ldc:int(396), ldc:int(397))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
