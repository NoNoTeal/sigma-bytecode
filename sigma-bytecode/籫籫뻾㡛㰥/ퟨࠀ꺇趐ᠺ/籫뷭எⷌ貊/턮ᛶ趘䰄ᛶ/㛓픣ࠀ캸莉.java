public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u36d3\ud523\u0800\uceb8\u8389 {
    public void \u36d3\ud523\u0800\uceb8\u8389(\u59ec\u8413\u97e6\uc229\u3776.\u6d69\u69d9\u6d99\u64f2\u3776 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud12e\u946b\u97b7\u51b2\u3d64 p1) {
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
            invokespecial:\u99f7\u7006\u6198\u47c2\ub1b9\u12cb(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::<init>, this:\u36d3\ud523\u0800\uceb8\u8389)
            putfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u7330\u71f1\u494c\u8413\ub32d\ubf56, this:\u36d3\ud523\u0800\uceb8\u8389, ldc:int(-1))
            putfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u071d\ub6ab\u4492\u4f52\u76bc\u7d52, this:\u36d3\ud523\u0800\uceb8\u8389, ldc:int(-1))
            putfield:\u873d\u446c\u6c56\u836c\u4975(\u36d3\ud523\u0800\uceb8\u8389::\u0800\u946b\ud4fe\u7873\ud7e8\u4bc8, this:\u36d3\ud523\u0800\uceb8\u8389, getstatic:\u873d\u446c\u6c56\u836c\u4975(\u873d\u446c\u6c56\u836c\u4975::\ud7e8\u8709\u983f\u40a9\u6198))
            putfield:\u6d69\u69d9\u6d99\u64f2\u3776(\u36d3\ud523\u0800\uceb8\u8389::\u3c25\ud523\u51fa\ubf56\ud171\u516c, this:\u36d3\ud523\u0800\uceb8\u8389, p0:\u6d69\u69d9\u6d99\u64f2\u3776)
            putfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389, p1:\ud12e\u946b\u97b7\u51b2\u3d64)
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
    
    private void \u6d69\u62da\u4179\u3d64\u7ce1\u40a9() {
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
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u36d3\ud523\u0800\uceb8\u8389::\u0c95\ua3b4\u8cae\u92ee\u88c5\ud12e, this:\u36d3\ud523\u0800\uceb8\u8389), invokespecial:boolean(\u36d3\ud523\u0800\uceb8\u8389::\u64f2\uc29a\uf94d\uc9f6\u946b\u8709, this:\u36d3\ud523\u0800\uceb8\u8389, getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u071d\ub6ab\u4492\u4f52\u76bc\u7d52, this:\u36d3\ud523\u0800\uceb8\u8389)))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u36d3\ud523\u0800\uceb8\u8389::\u071d\u69d9\u3bc9\u983f\u3c25\u64ab, this:\u36d3\ud523\u0800\uceb8\u8389), invokespecial:boolean(\u36d3\ud523\u0800\uceb8\u8389::\u64f2\uc29a\uf94d\uc9f6\u946b\u8709, this:\u36d3\ud523\u0800\uceb8\u8389, getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u071d\ub6ab\u4492\u4f52\u76bc\u7d52, this:\u36d3\ud523\u0800\uceb8\u8389)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \u64f2\uc29a\uf94d\uc9f6\u946b\u8709(int p0) {
        var_2_5F : int
        stack_84_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(1568682616), ldc:int(-1674182035))
            
            if (cmpeq:boolean(p0:int, ldc:int(-1))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-995815572))
                stack_84_0 = and:int(ldc:int(-21179), ldc:int(4778))
            }
            else {
                stack_84_0 = xor:int(ldc:int(4386), ldc:int(4387))
            }
            
            return:boolean(stack_84_0:int)
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
            invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u7bad\ub171\u61a4\ubff1\u6d69\u6cfe, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u36d3\ud523\u0800\uceb8\u8389::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u36d3\ud523\u0800\uceb8\u8389)), and:int[expected:boolean](ldc:int(18437), ldc:int(-18438)))
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
        
        if (cmpne:boolean(p0:int, and:int(ldc:int(384), ldc:int(10520)))) {
            return:boolean(invokespecial:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\u36d3\ud523\u0800\uceb8\u8389[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:int, p1:int, p2:int))
        }
        
        invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\ud171\u8d98\ucb79\u7049\u7bad\u3776, this:\u36d3\ud523\u0800\uceb8\u8389)
        return:boolean(and:int[expected:boolean](ldc:int(4145), ldc:int(28163)))
    }
    
    private void \ud171\u8d98\ucb79\u7049\u7bad\u3776() {
        var_1_61 : int
        
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
            var_1_61 = and:int(ldc:int(280304451), ldc:int(1356849999))
            
            if (logicalnot:boolean(getfield:boolean(\u36d3\ud523\u0800\uceb8\u8389::\u64ab\ubf56\u67e9\u8aa5\u1187\u4bc8, this:\u36d3\ud523\u0800\uceb8\u8389))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1358519167))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u36d3\ud523\u0800\uceb8\u8389::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u36d3\ud523\u0800\uceb8\u8389), getfield:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u36d3\ud523\u0800\uceb8\u8389::\u3c25\ud523\u51fa\ubf56\ud171\u516c, this:\u36d3\ud523\u0800\uceb8\u8389))
            }
            else {
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u36d3\ud523\u0800\uceb8\u8389::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u36d3\ud523\u0800\uceb8\u8389), invokevirtual:\u6d69\u69d9\u6d99\u64f2\u3776[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6d69\u69d9\u6d99\u64f2\u3776::\u0a06\u071d\u6d99\u98a4\u40a9\u647c, getfield:\u6d69\u69d9\u6d99\u64f2\u3776(\u36d3\ud523\u0800\uceb8\u8389::\u3c25\ud523\u51fa\ubf56\ud171\u516c, this:\u36d3\ud523\u0800\uceb8\u8389)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ud4fe\u647c\u3e2a\ud7e8\u71ae\ua3b4(int p0) {
        var_2_61 : int
        var_2_6F : int
        var_2_93 : int
        var_4_97 : \u61a4\u8aa5\uff55\u718f\ub8be
        var_2_F0 : int
        var_5_B2 : String
        
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
            var_2_61 = and:int(ldc:int(101955951), ldc:int(-1216762579))
            
            loop {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_6F = and:int(var_2_61:int, ldc:int(314287739))
                }
                else {
                    var_2_6F = and:int(var_2_61:int, ldc:int(-172217987))
                    invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\u6d69\u62da\u4179\u3d64\u7ce1\u40a9, this:\u36d3\ud523\u0800\uceb8\u8389)
                }
                
                if (cmpne:boolean(and:int(var_2_6F:int, ldc:int(256)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_61 = and:int(var_2_6F:int, ldc:int(1099621314))
            }
            
            var_2_93 = and:int(var_2_6F:int, ldc:int(-1810105479))
            var_4_97 = invokestatic:\u61a4\u8aa5\uff55\u718f\ub8be(\u61a4\u8aa5\uff55\u718f\ub8be::\u8350\ubf56\u4f52\u9937\u8350\ub83f)
            var_2_F0 = and:int(var_2_93:int, ldc:int(-450441925))
            var_5_B2 = invokevirtual:String(\u6c52\u3dd3\ucfaf\u7e3f\u600f::\u9937\u7043\u47c2\u97b7\u64f2\u4d85, checkcast:\u6c52\u3dd3\ucfaf\u7e3f\u600f(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u6c52\u3dd3\ucfaf\u7e3f\u600f.class, invokeinterface:\u6c52\u3dd3\ucfaf\u7e3f\u600f(List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>::get, getfield:List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>(\ud12e\u946b\u97b7\u51b2\u3d64::\ufe34\u1187\u5fe1\ud217\ub1b9\u839e, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389)), p0:int)))
            
            try {
                do {
                    if (cmpne:boolean(and:int(var_2_F0:int, ldc:int(1)), ldc:int(0))) {
                        var_2_F0 = and:int(var_2_F0:int, ldc:int(1436225533))
                        invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\uf9c5\ub102\u983f\u8df4\ub70c\u9937, this:\u36d3\ud523\u0800\uceb8\u8389, invokevirtual:\u392e\u3bc9\u8640\u385b\ub18d(\u61a4\u8aa5\uff55\u718f\ub8be::\uc910\uc29a\u527a\u6c56\u34df\u6d69, var_4_97:\u61a4\u8aa5\uff55\u718f\ub8be, getfield:long(\ud12e\u946b\u97b7\u51b2\u3d64::\uc910\u7049\u4975\u97b7\u8c8a\u960f, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389)), var_5_B2:String))
                    }
                } while (cmpeq:boolean(and:int(var_2_F0:int, ldc:int(32)), ldc:int(0)))
                
                var_2_F0 = and:int(var_2_F0:int, ldc:int(-1080504325))
            }
            catch (\u516c\u3d64\u718f\ub171\u6b5f.\uae5d\u5654\uc910\ub18d\u7d52 var_6_E9) {
                var_2_F0 = and:int(var_2_F0:int, ldc:int(-543175687))
                invokeinterface:void(Logger::error, getstatic:Logger(\u36d3\ud523\u0800\uceb8\u8389::\u34df\u4492\u71ae\uc238\u7873\uafe7), loadelement:String(getstatic:String[](\u36d3\ud523\u0800\uceb8\u8389::\u5654\u5654\ud158\u3776\u3d64\u7d52), xor:int(ldc:int(4100), ldc:int(4096))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4975\ua61f\u8413\ubefe\u494c\u385b(int p0) {
        var_2_61 : int
        var_2_6F : int
        var_2_93 : int
        var_4_97 : \u61a4\u8aa5\uff55\u718f\ub8be
        var_2_102 : int
        var_5_B2 : String
        
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
            var_2_61 = and:int(ldc:int(-351272089), ldc:int(-308871189))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                    var_2_6F = and:int(var_2_61:int, ldc:int(1778715904))
                }
                else {
                    var_2_6F = and:int(var_2_61:int, ldc:int(-41724946))
                    invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\u6d69\u62da\u4179\u3d64\u7ce1\u40a9, this:\u36d3\ud523\u0800\uceb8\u8389)
                }
                
                if (cmpeq:boolean(and:int(var_2_6F:int, ldc:int(8192)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_61 = and:int(var_2_6F:int, ldc:int(1002708151))
            }
            
            var_2_93 = and:int(var_2_6F:int, ldc:int(-35566685))
            var_4_97 = invokestatic:\u61a4\u8aa5\uff55\u718f\ub8be(\u61a4\u8aa5\uff55\u718f\ub8be::\u8350\ubf56\u4f52\u9937\u8350\ub83f)
            var_2_102 = and:int(var_2_93:int, ldc:int(-1006964946))
            var_5_B2 = invokevirtual:String(\u6c52\u3dd3\ucfaf\u7e3f\u600f::\u9937\u7043\u47c2\u97b7\u64f2\u4d85, checkcast:\u6c52\u3dd3\ucfaf\u7e3f\u600f(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u6c52\u3dd3\ucfaf\u7e3f\u600f.class, invokeinterface:\u6c52\u3dd3\ucfaf\u7e3f\u600f(List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>::get, getfield:List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>(\ud12e\u946b\u97b7\u51b2\u3d64::\ufe34\u1187\u5fe1\ud217\ub1b9\u839e, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389)), p0:int)))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_2_102:int, ldc:int(65536)), ldc:int(0))) {
                        var_2_102 = and:int(var_2_102:int, ldc:int(249340102))
                    }
                    else {
                        var_2_102 = and:int(var_2_102:int, ldc:int(-550076613))
                        invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\uf9c5\ub102\u983f\u8df4\ub70c\u9937, this:\u36d3\ud523\u0800\uceb8\u8389, invokevirtual:\u392e\u3bc9\u8640\u385b\ub18d(\u61a4\u8aa5\uff55\u718f\ub8be::\u3711\uf995\u7d52\u7043\u72f1\u12b2, var_4_97:\u61a4\u8aa5\uff55\u718f\ub8be, getfield:long(\ud12e\u946b\u97b7\u51b2\u3d64::\uc910\u7049\u4975\u97b7\u8c8a\u960f, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389)), var_5_B2:String))
                    }
                    
                    if (cmpne:boolean(and:int(var_2_102:int, ldc:int(2)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_2_102 = and:int(var_2_102:int, ldc:int(393986538))
                }
                
                var_2_102 = and:int(var_2_102:int, ldc:int(-306744410))
            }
            catch (\u516c\u3d64\u718f\ub171\u6b5f.\uae5d\u5654\uc910\ub18d\u7d52 var_6_FB) {
                var_2_102 = and:int(var_2_102:int, ldc:int(-504884310))
                invokeinterface:void(Logger::error, getstatic:Logger(\u36d3\ud523\u0800\uceb8\u8389::\u34df\u4492\u71ae\uc238\u7873\uafe7), loadelement:String(getstatic:String[](\u36d3\ud523\u0800\uceb8\u8389::\u5654\u5654\ud158\u3776\u3d64\u7d52), and:int(ldc:int(5125), ldc:int(8207))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uf9c5\ub102\u983f\u8df4\ub70c\u9937(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u392e\u3bc9\u8640\u385b\ub18d p0) {
        var_2_61 : int
        var_4_6E : Iterator<\u6c52\u3dd3\ucfaf\u7e3f\u600f>
        var_5_95 : \u6c52\u3dd3\ucfaf\u7e3f\u600f
        
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
            var_2_61 = and:int(ldc:int(-675220557), ldc:int(2129738686))
            var_4_6E = invokeinterface:Iterator<\u6c52\u3dd3\ucfaf\u7e3f\u600f>(List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>::iterator, getfield:List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>(\ud12e\u946b\u97b7\u51b2\u3d64::\ufe34\u1187\u5fe1\ud217\ub1b9\u839e, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389)))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1610762310))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_4_6E:Iterator<\u6c52\u3dd3\ucfaf\u7e3f\u600f>))) {
                    looporswitchbreak()
                }
                
                var_5_95 = checkcast:\u6c52\u3dd3\ucfaf\u7e3f\u600f(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u6c52\u3dd3\ucfaf\u7e3f\u600f.class, invokeinterface:\u6c52\u3dd3\ucfaf\u7e3f\u600f(Iterator<\u6c52\u3dd3\ucfaf\u7e3f\u600f>::next, var_4_6E:Iterator<\u6c52\u3dd3\ucfaf\u7e3f\u600f>))
                invokevirtual:void(\u6c52\u3dd3\ucfaf\u7e3f\u600f::\u7006\u5140\u4e72\u494c\u4c2b\u6c56, var_5_95:\u6c52\u3dd3\ucfaf\u7e3f\u600f, invokeinterface:boolean(Set<E>::contains, getfield:Set<String>(\u392e\u3bc9\u8640\u385b\ub18d::\u516c\u92ff\u74b1\u97e6\ub171\u3711, p0:\u392e\u3bc9\u8640\u385b\ub18d), invokevirtual:String(\u6c52\u3dd3\ucfaf\u7e3f\u600f::\u59ec\u92ee\ud7e8\u946b\u98a4\ud36e, var_5_95:\u6c52\u3dd3\ucfaf\u7e3f\u600f)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u760c\u72f1\ubefe\u5245\u8413\u385b(int p0) {
        var_4_9C : \u6c52\u3dd3\ucfaf\u7e3f\u600f
        
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
            invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\u6d69\u62da\u4179\u3d64\u7ce1\u40a9, this:\u36d3\ud523\u0800\uceb8\u8389)
            
            if (cmpge:boolean(p0:int, ldc:int(0))) {
                if (cmplt:boolean(p0:int, invokeinterface:int(List<E>::size, getfield:List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>(\ud12e\u946b\u97b7\u51b2\u3d64::\ufe34\u1187\u5fe1\ud217\ub1b9\u839e, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389))))) {
                    var_4_9C = checkcast:\u6c52\u3dd3\ucfaf\u7e3f\u600f(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u6c52\u3dd3\ucfaf\u7e3f\u600f.class, invokeinterface:\u6c52\u3dd3\ucfaf\u7e3f\u600f(List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>::get, getfield:List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>(\ud12e\u946b\u97b7\u51b2\u3d64::\ufe34\u1187\u5fe1\ud217\ub1b9\u839e, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389)), p0:int))
                    putfield:String(\u36d3\ud523\u0800\uceb8\u8389::\u120d\u183a\u1187\ubff1\u9af2\u0c95, this:\u36d3\ud523\u0800\uceb8\u8389, invokevirtual:String(\u6c52\u3dd3\ucfaf\u7e3f\u600f::\u9937\u7043\u47c2\u97b7\u64f2\u4d85, var_4_9C:\u6c52\u3dd3\ucfaf\u7e3f\u600f))
                    putfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u7330\u71f1\u494c\u8413\ub32d\ubf56, this:\u36d3\ud523\u0800\uceb8\u8389, p0:int)
                    invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u36d3\ud523\u0800\uceb8\u8389::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u36d3\ud523\u0800\uceb8\u8389), initobject:\u72f1\ud4fe\u983f\u8753\u8350(\u72f1\ud4fe\u983f\u8753\u8350::<init>, invokedynamic:BooleanConsumer(accept:(L\u7c6b\u7c6b\ubefe\u385b\u3c25/\ud7e8\u0800\uae87\u8d90\u183a/\u7c6b\ubded\u0b8e\u2dcc\u8c8a/\ud12e\u16f6\u8d98\u4c04\u16f6/\u36d3\ud523\u0800\uceb8\u8389;)Lit/unimi/dsi/fastutil/booleans/BooleanConsumer;, this:\u36d3\ud523\u0800\uceb8\u8389), initobject:StringTextComponent[expected:ITextComponent](StringTextComponent::<init>, loadelement:String(getstatic:String[](\u36d3\ud523\u0800\uceb8\u8389::\u5654\u5654\ud158\u3776\u3d64\u7d52), and:int(ldc:int(647), ldc:int(70)))), invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::appendString, initobject:TranslationTextComponent[expected:IFormattableTextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u36d3\ud523\u0800\uceb8\u8389::\u5654\u5654\ud158\u3776\u3d64\u7d52), xor:int(ldc:int(-30715), ldc:int(-30718)))), loadelement:String(getstatic:String[](\u36d3\ud523\u0800\uceb8\u8389::\u5654\u5654\ud158\u3776\u3d64\u7d52), xor:int(ldc:int(27), ldc:int(19)))), invokevirtual:String(\u6c52\u3dd3\ucfaf\u7e3f\u600f::\u59ec\u92ee\ud7e8\u946b\u98a4\ud36e, var_4_9C:\u6c52\u3dd3\ucfaf\u7e3f\u600f)), loadelement:String(getstatic:String[](\u36d3\ud523\u0800\uceb8\u8389::\u5654\u5654\ud158\u3776\u3d64\u7d52), xor:int(ldc:int(3340), ldc:int(3333))))))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u99f7\uc2e8\uc7fe\u5140\ud158\u071d(int p0) {
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
            invokeinterface:\u6c52\u3dd3\ucfaf\u7e3f\u600f(List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>::remove, getfield:List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>(\ud12e\u946b\u97b7\u51b2\u3d64::\ufe34\u1187\u5fe1\ud217\ub1b9\u839e, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389)), p0:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_5_63 : int
        var_5_83 : int
        var_7_8D : int
        var_8_92 : \ub6ab\u8cae\u64ab\u5245\ubff1\u3711
        var_9_99 : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        
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
        var_5_63 = and:int(ldc:int(910474234), ldc:int(-19456004))
        putfield:ITextComponent(\u36d3\ud523\u0800\uceb8\u8389::\uafe7\u5245\u4492\u36d3\u527a\ub83f, this:\u36d3\ud523\u0800\uceb8\u8389, aconstnull:ITextComponent())
        putfield:\u873d\u446c\u6c56\u836c\u4975(\u36d3\ud523\u0800\uceb8\u8389::\u0800\u946b\ud4fe\u7873\ud7e8\u4bc8, this:\u36d3\ud523\u0800\uceb8\u8389, getstatic:\u873d\u446c\u6c56\u836c\u4975(\u873d\u446c\u6c56\u836c\u4975::\ud7e8\u8709\u983f\u40a9\u6198))
        invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u36d3\ud523\u0800\uceb8\u8389[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
        
        if (cmpne:boolean(getfield:\u34df\u527a\u5245\u8258\uf995(\u36d3\ud523\u0800\uceb8\u8389::\u8c8a\u34df\u51b2\u4bc8\u3e75\uc87f, this:\u36d3\ud523\u0800\uceb8\u8389), aconstnull:\u34df\u527a\u5245\u8258\uf995())) {
            invokevirtual:void(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<E>::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\u34df\u527a\u5245\u8258\uf995[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\uf995\u92ff\uc31c\u12b2\u62da>](\u36d3\ud523\u0800\uceb8\u8389::\u8c8a\u34df\u51b2\u4bc8\u3e75\uc87f, this:\u36d3\ud523\u0800\uceb8\u8389), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
        }
        
        var_5_83 = and:int(var_5_63:int, ldc:int(-1099595908))
        var_7_8D = add:int(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, ldc:int(12)), ldc:int(20))
        var_8_92 = invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f)
        var_9_99 = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, var_8_92:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
        invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u36d3\ud523\u0800\uceb8\u8389::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u36d3\ud523\u0800\uceb8\u8389)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u36d3\ud523\u0800\uceb8\u8389::\u3bd6\u4179\u3a62\u8d90\u071d\u183a))
        invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
        invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_9_99:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\ubb2b\u98a4\u4e72\ubded\u64f2\uae5d))
        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_9_99:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.0), i2d:double(getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u36d3\ud523\u0800\uceb8\u8389)), ldc:double(0.0)), ldc:float(0.0f), add:float(div:float(i2f:float(sub:int(getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u36d3\ud523\u0800\uceb8\u8389), var_7_8D:int)), ldc:float(32.0f)), ldc:float(0.0f))), ldc:int(64), ldc:int(64), ldc:int(64), and:int(ldc:int(17151), ldc:int(255))))
        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_9_99:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u36d3\ud523\u0800\uceb8\u8389)), i2d:double(getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u36d3\ud523\u0800\uceb8\u8389)), ldc:double(0.0)), div:float(i2f:float(getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u36d3\ud523\u0800\uceb8\u8389)), ldc:float(32.0f)), add:float(div:float(i2f:float(sub:int(getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u6d69\ud12e\u4bc8\ubded\u120d\u0800, this:\u36d3\ud523\u0800\uceb8\u8389), var_7_8D:int)), ldc:float(32.0f)), ldc:float(0.0f))), ldc:int(64), ldc:int(64), ldc:int(64), and:int(ldc:int(11519), ldc:int(16639))))
        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_9_99:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u36d3\ud523\u0800\uceb8\u8389)), i2d:double(var_7_8D:int), ldc:double(0.0)), div:float(i2f:float(getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u36d3\ud523\u0800\uceb8\u8389)), ldc:float(32.0f)), ldc:float(0.0f)), ldc:int(64), ldc:int(64), ldc:int(64), xor:int(ldc:int(-30593), ldc:int(-30592))))
        invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ub70c\u600f\u93a2\uc910\u9937\u946b, invokeinterface:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u946b\uf995\ufe34\u1833\ua61f\uc246, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_9_99:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], ldc:double(0.0), i2d:double(var_7_8D:int), ldc:double(0.0)), ldc:float(0.0f), ldc:float(0.0f)), ldc:int(64), ldc:int(64), ldc:int(64), xor:int(ldc:int(-16370), ldc:int(-16143))))
        invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_8_92:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
        invokevirtual:void(\u6c56\u647c\u97b7\u6d99\u5654\u385b::\u071d\ub8be\u1833\u120d\u3e75\u56bd, getfield:\u6c56\u647c\u97b7\u6d99\u5654\u385b(\u36d3\ud523\u0800\uceb8\u8389::\u92ee\u67e9\u759a\u760c\u8753\u7d52, this:\u36d3\ud523\u0800\uceb8\u8389), this:\u36d3\ud523\u0800\uceb8\u8389[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
        
        if (cmpne:boolean(getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389), aconstnull:\ud12e\u946b\u97b7\u51b2\u3d64())) {
            if (cmpne:boolean(getfield:List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>(\ud12e\u946b\u97b7\u51b2\u3d64::\ufe34\u1187\u5fe1\ud217\ub1b9\u839e, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389)), aconstnull:List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>())) {
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u36d3\ud523\u0800\uceb8\u8389::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u36d3\ud523\u0800\uceb8\u8389), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokeinterface:IFormattableTextComponent[expected:ITextComponent](IFormattableTextComponent::appendString, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, invokeinterface:IFormattableTextComponent(IFormattableTextComponent::appendString, invokevirtual:IFormattableTextComponent(TextComponent::append, initobject:StringTextComponent[expected:TextComponent](StringTextComponent::<init>, loadelement:String(getstatic:String[](\u36d3\ud523\u0800\uceb8\u8389::\u5654\u5654\ud158\u3776\u3d64\u7d52), and:int(ldc:int(1290), ldc:int(8779)))), getstatic:ITextComponent(\u36d3\ud523\u0800\uceb8\u8389::\u1833\u88c5\u0b8e\uc9f6\u960f\u839e)), loadelement:String(getstatic:String[](\u36d3\ud523\u0800\uceb8\u8389::\u5654\u5654\ud158\u3776\u3d64\u7d52), xor:int(ldc:int(2572), ldc:int(2567)))), invokestatic:String(Integer::toString, invokeinterface:int(List<E>::size, getfield:List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>(\ud12e\u946b\u97b7\u51b2\u3d64::\ufe34\u1187\u5fe1\ud217\ub1b9\u839e, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389))))), loadelement:String(getstatic:String[](\u36d3\ud523\u0800\uceb8\u8389::\u5654\u5654\ud158\u3776\u3d64\u7d52), and:int(ldc:int(9501), ldc:int(78)))), i2f:float(getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u8413\uc31c\u071d\u6198\u4e72\u873d, this:\u36d3\ud523\u0800\uceb8\u8389)), i2f:float(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and:int(ldc:int(25265), ldc:int(-25266)))), ldc:int(10526880))
                goto(Label_0620)
            }
        }
        
        Label_0425:
        
        if (cmpeq:boolean(and:int(var_5_83:int, ldc:int(524288)), ldc:int(0))) {
            var_5_83 = and:int(var_5_83:int, ldc:int(-1620796483))
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u36d3\ud523\u0800\uceb8\u8389::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u36d3\ud523\u0800\uceb8\u8389), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getstatic:ITextComponent(\u36d3\ud523\u0800\uceb8\u8389::\u1833\u88c5\u0b8e\uc9f6\u960f\u839e), i2f:float(getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u8413\uc31c\u071d\u6198\u4e72\u873d, this:\u36d3\ud523\u0800\uceb8\u8389)), i2f:float(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and:int(ldc:int(21924), ldc:int(-21933)))), ldc:int(10526880))
        }
        
        Label_0620:
        
        if (cmpeq:boolean(and:int(var_5_83:int, ldc:int(8388608)), ldc:int(0))) {
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u36d3\ud523\u0800\uceb8\u8389[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            
            if (cmpne:boolean(getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389), aconstnull:\ud12e\u946b\u97b7\u51b2\u3d64())) {
                invokevirtual:void(\u36d3\ud523\u0800\uceb8\u8389::\u8d98\u527a\uf94d\uc2bd\ubb2b\u9033, this:\u36d3\ud523\u0800\uceb8\u8389, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:ITextComponent(\u36d3\ud523\u0800\uceb8\u8389::\uafe7\u5245\u4492\u36d3\u527a\ub83f, this:\u36d3\ud523\u0800\uceb8\u8389), p1:int, p2:int)
            }
            
            return:void()
        }
        
        goto(Label_0425)
    }
    
    public void \u8d98\u527a\uf94d\uc2bd\ubb2b\u9033(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, net.minecraft.util.text.ITextComponent p1, int p2, int p3) {
        var_7_7A : int
        var_8_81 : int
        
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
            
            if (cmpne:boolean(p1:ITextComponent, aconstnull:ITextComponent())) {
                var_7_7A = add:int(p2:int, ldc:int(12))
                var_8_81 = sub:int(p3:int, ldc:int(12))
                invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u8d98\u120d\u7ce1\u647c\u416d\uc238, this:\u36d3\ud523\u0800\uceb8\u8389[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, sub:int(var_7_7A:int, xor:int(ldc:int(-31486), ldc:int(-31487))), sub:int(var_8_81:int, and:int(ldc:int(2515), ldc:int(25647))), add:int(add:int(var_7_7A:int, invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ucb79\ua3b4\u946b\uc246\ua068\u36d3, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u36d3\ud523\u0800\uceb8\u8389::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u36d3\ud523\u0800\uceb8\u8389), p1:ITextComponent[expected:ITextProperties])), and:int(ldc:int(12403), ldc:int(7))), add:int(add:int(var_8_81:int, ldc:int(8)), and:int(ldc:int(4147), ldc:int(17667))), ldc:int(-1073741824), ldc:int(-1073741824))
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6bb9\u67e9\u8df4\u8413\u624e\ucb79, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u36d3\ud523\u0800\uceb8\u8389::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u36d3\ud523\u0800\uceb8\u8389), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:ITextComponent, i2f:float(var_7_7A:int), i2f:float(var_8_81:int), ldc:int(16777215))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u64f2\uf995\u8258\ub102\u983f\u1833(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, int p3, int p4) {
        var_6_63 : int
        stack_E7_0 : int [generated]
        var_6_E5 : int
        var_8_E7 : int
        stack_11D_0 : float [generated]
        
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
            var_6_63 = and:int(ldc:int(216019508), ldc:int(-860705027))
            
            if (cmpge:boolean(p3:int, p1:int)) {
                if (cmple:boolean(p3:int, add:int(p1:int, ldc:int(9)))) {
                    if (cmpge:boolean(p4:int, p2:int)) {
                        if (cmple:boolean(p4:int, add:int(p2:int, ldc:int(9)))) {
                            if (cmplt:boolean(p4:int, add:int(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, ldc:int(12)), ldc:int(20)))) {
                                if (cmpgt:boolean(p4:int, invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and:int(ldc:int(3081), ldc:int(4689))))) {
                                    stack_E7_0 = xor:int(ldc:int(3152), ldc:int(3153))
                                    goto(Label_0223)
                                }
                            }
                        }
                    }
                }
            }
            
            var_6_63 = and:int(var_6_63:int, ldc:int(-1897441547))
            stack_E7_0 = and:int(ldc:int(2589), ldc:int(-2590))
            Label_0223:
            var_6_E5 = and:int(var_6_63:int, ldc:int(-844715403))
            var_8_E7 = stack_E7_0:int
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u36d3\ud523\u0800\uceb8\u8389::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u36d3\ud523\u0800\uceb8\u8389)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u36d3\ud523\u0800\uceb8\u8389::\u4e72\u156b\u8350\u8bb0\u67d0\u120d))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            
            if (cmpeq:boolean(var_8_E7:int, ldc:int(0))) {
                var_6_E5 = and:int(var_6_E5:int, ldc:int(1336265278))
                stack_11D_0 = ldc:float(0.0f)
            }
            else {
                stack_11D_0 = ldc:float(7.0f)
            }
            
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, ldc:float(0.0f), stack_11D_0:float, ldc:int(8), ldc:int(7), ldc:int(8), ldc:int(14))
            
            if (cmpne:boolean(var_8_E7:int, ldc:int(0))) {
                putfield:ITextComponent(\u36d3\ud523\u0800\uceb8\u8389::\uafe7\u5245\u4492\u36d3\u527a\ub83f, this:\u36d3\ud523\u0800\uceb8\u8389, getstatic:ITextComponent(\u36d3\ud523\u0800\uceb8\u8389::\uceb8\u8258\uf9c5\uc229\u7330\ucfaf))
                putfield:\u873d\u446c\u6c56\u836c\u4975(\u36d3\ud523\u0800\uceb8\u8389::\u0800\u946b\ud4fe\u7873\ud7e8\u4bc8, this:\u36d3\ud523\u0800\uceb8\u8389, getstatic:\u873d\u446c\u6c56\u836c\u4975(\u873d\u446c\u6c56\u836c\u4975::\u6435\u5140\ub102\u12b2\u71ae))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ube23\u3c25\u071d\u6bb9\ubefe\u4c04(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, int p3, int p4) {
        var_6_63 : int
        stack_E7_0 : int [generated]
        var_6_E5 : int
        var_8_E7 : int
        stack_11D_0 : float [generated]
        
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
            var_6_63 = and:int(ldc:int(1912138065), ldc:int(1811737413))
            
            if (cmpge:boolean(p3:int, p1:int)) {
                if (cmple:boolean(p3:int, add:int(p1:int, ldc:int(9)))) {
                    if (cmpge:boolean(p4:int, p2:int)) {
                        if (cmple:boolean(p4:int, add:int(p2:int, ldc:int(9)))) {
                            if (cmplt:boolean(p4:int, add:int(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, ldc:int(12)), ldc:int(20)))) {
                                if (cmpgt:boolean(p4:int, invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and:int(ldc:int(8195), ldc:int(16905))))) {
                                    stack_E7_0 = and:int(ldc:int(20693), ldc:int(545))
                                    goto(Label_0223)
                                }
                            }
                        }
                    }
                }
            }
            
            var_6_63 = and:int(var_6_63:int, ldc:int(-537334794))
            stack_E7_0 = and:int(ldc:int(-2695), ldc:int(2694))
            Label_0223:
            var_6_E5 = and:int(var_6_63:int, ldc:int(1778318959))
            var_8_E7 = stack_E7_0:int
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u36d3\ud523\u0800\uceb8\u8389::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u36d3\ud523\u0800\uceb8\u8389)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u36d3\ud523\u0800\uceb8\u8389::\u36d3\u4e72\ubcb0\u93a2\uc238\u67e9))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            
            if (cmpeq:boolean(var_8_E7:int, ldc:int(0))) {
                var_6_E5 = and:int(var_6_E5:int, ldc:int(2113797886))
                stack_11D_0 = ldc:float(0.0f)
            }
            else {
                stack_11D_0 = ldc:float(8.0f)
            }
            
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, ldc:float(0.0f), stack_11D_0:float, ldc:int(8), ldc:int(8), ldc:int(8), ldc:int(16))
            
            if (cmpne:boolean(var_8_E7:int, ldc:int(0))) {
                putfield:ITextComponent(\u36d3\ud523\u0800\uceb8\u8389::\uafe7\u5245\u4492\u36d3\u527a\ub83f, this:\u36d3\ud523\u0800\uceb8\u8389, getstatic:ITextComponent(\u36d3\ud523\u0800\uceb8\u8389::\u8c8a\ub8be\uff55\u97b7\ud171\u12b2))
                putfield:\u873d\u446c\u6c56\u836c\u4975(\u36d3\ud523\u0800\uceb8\u8389::\u0800\u946b\ud4fe\u7873\ud7e8\u4bc8, this:\u36d3\ud523\u0800\uceb8\u8389, getstatic:\u873d\u446c\u6c56\u836c\u4975(\u873d\u446c\u6c56\u836c\u4975::\u183a\u4f52\ufe34\u6b0d\uc246))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u9a18\ub7dc\ua6bd\u92ff\u71ae\uc84e(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, int p3, int p4) {
        var_6_63 : int
        stack_E7_0 : int [generated]
        var_6_E5 : int
        var_8_E7 : int
        stack_11D_0 : float [generated]
        
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
            var_6_63 = and:int(ldc:int(821690836), ldc:int(1773616867))
            
            if (cmpge:boolean(p3:int, p1:int)) {
                if (cmple:boolean(p3:int, add:int(p1:int, ldc:int(9)))) {
                    if (cmpge:boolean(p4:int, p2:int)) {
                        if (cmple:boolean(p4:int, add:int(p2:int, ldc:int(9)))) {
                            if (cmplt:boolean(p4:int, add:int(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, ldc:int(12)), ldc:int(20)))) {
                                if (cmpgt:boolean(p4:int, invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and:int(ldc:int(24605), ldc:int(515))))) {
                                    stack_E7_0 = xor:int(ldc:int(4370), ldc:int(4371))
                                    goto(Label_0223)
                                }
                            }
                        }
                    }
                }
            }
            
            var_6_63 = and:int(var_6_63:int, ldc:int(-281137752))
            stack_E7_0 = and:int(ldc:int(-26185), ldc:int(25672))
            Label_0223:
            var_6_E5 = and:int(var_6_63:int, ldc:int(-436796737))
            var_8_E7 = stack_E7_0:int
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u36d3\ud523\u0800\uceb8\u8389::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u36d3\ud523\u0800\uceb8\u8389)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u36d3\ud523\u0800\uceb8\u8389::\u8709\ub1b9\u836c\u8709\ube23\ube23))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            
            if (cmpeq:boolean(var_8_E7:int, ldc:int(0))) {
                var_6_E5 = and:int(var_6_E5:int, ldc:int(1067393016))
                stack_11D_0 = ldc:float(0.0f)
            }
            else {
                stack_11D_0 = ldc:float(8.0f)
            }
            
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, ldc:float(0.0f), stack_11D_0:float, ldc:int(8), ldc:int(8), ldc:int(8), ldc:int(16))
            
            if (cmpne:boolean(var_8_E7:int, ldc:int(0))) {
                putfield:ITextComponent(\u36d3\ud523\u0800\uceb8\u8389::\uafe7\u5245\u4492\u36d3\u527a\ub83f, this:\u36d3\ud523\u0800\uceb8\u8389, getstatic:ITextComponent(\u36d3\ud523\u0800\uceb8\u8389::\u446c\u67d0\ua562\u97b7\u6c56\u59ec))
                putfield:\u873d\u446c\u6c56\u836c\u4975(\u36d3\ud523\u0800\uceb8\u8389::\u0800\u946b\ud4fe\u7873\ud7e8\u4bc8, this:\u36d3\ud523\u0800\uceb8\u8389, getstatic:\u873d\u446c\u6c56\u836c\u4975(\u873d\u446c\u6c56\u836c\u4975::\u183a\u4f52\ufe34\u6b0d\uc246))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4f52\ub32d\u8308\u71f1\ud36e\u6d99$4(boolean p0) {
        var_2_257 : int
        var_2_F2 : int
        var_4_F6 : \u61a4\u8aa5\uff55\u718f\ub8be
        
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
            var_2_257 = and:int(ldc:int(2015893939), ldc:int(200358894))
            
            loop {
                if (cmpne:boolean(and:int(var_2_257:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0662)
                }
                
                if (cmpne:boolean(and:int(var_2_257:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0586)
                }
                
                if (cmpne:boolean(and:int(var_2_257:int, ldc:int(16384)), ldc:int(0))) {
                    goto(Label_0196)
                }
                
                if (cmpne:boolean(and:int(var_2_257:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_257 = and:int(var_2_257:int, ldc:int(-1818226647))
                }
                else {
                    var_2_257 = and:int(var_2_257:int, ldc:int(-1289613149))
                    
                    if (logicalnot:boolean(p0:boolean)) {
                        goto(Label_0586)
                    }
                }
                
                Label_0149:
                
                if (cmpne:boolean(and:int(var_2_257:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0662)
                }
                
                if (cmpne:boolean(and:int(var_2_257:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_0586)
                }
                
                if (cmpeq:boolean(and:int(var_2_257:int, ldc:int(32)), ldc:int(0))) {
                    var_2_257 = and:int(var_2_257:int, ldc:int(878476685))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_257:int, ldc:int(16384)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_257 = and:int(var_2_257:int, ldc:int(1773228542))
                }
                
                Label_0196:
                
                if (cmpne:boolean(and:int(var_2_257:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_0662)
                }
                
                if (cmpne:boolean(and:int(var_2_257:int, ldc:int(32)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_257:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0149)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_257:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_257 = and:int(var_2_257:int, ldc:int(-1865310054))
                        loopcontinue()
                    }
                    
                    var_2_F2 = and:int(var_2_257:int, ldc:int(518400931))
                    var_4_F6 = invokestatic:\u61a4\u8aa5\uff55\u718f\ub8be(\u61a4\u8aa5\uff55\u718f\ub8be::\u8350\ubf56\u4f52\u9937\u8350\ub83f)
                    
                    loop {
                        try {
                            while (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(4194304)), ldc:int(0))) {
                                if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(262144)), ldc:int(0))) {
                                    var_2_F2 = and:int(var_2_F2:int, ldc:int(-960550080))
                                    goto(Label_0483)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(4)), ldc:int(0))) {
                                    var_2_F2 = and:int(var_2_F2:int, ldc:int(-489498639))
                                    goto(Label_0428)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(2)), ldc:int(0))) {
                                    var_2_F2 = and:int(var_2_F2:int, ldc:int(-1088688972))
                                }
                                else {
                                    var_2_F2 = and:int(var_2_F2:int, ldc:int(-223523594))
                                    invokevirtual:void(\u61a4\u8aa5\uff55\u718f\ub8be::\u67d0\u4ab3\ua6bd\u3a62\u839e\uf9c5, var_4_F6:\u61a4\u8aa5\uff55\u718f\ub8be, getfield:long(\ud12e\u946b\u97b7\u51b2\u3d64::\uc910\u7049\u4975\u97b7\u8c8a\u960f, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389)), getfield:String(\u36d3\ud523\u0800\uceb8\u8389::\u120d\u183a\u1187\ubff1\u9af2\u0c95, this:\u36d3\ud523\u0800\uceb8\u8389))
                                }
                                
                                Label_0338:
                                
                                if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_2_F2 = and:int(var_2_F2:int, ldc:int(-39600809))
                                    goto(Label_0544)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(4)), ldc:int(0))) {
                                    goto(Label_0483)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(2)), ldc:int(0))) {
                                    var_2_F2 = and:int(var_2_F2:int, ldc:int(-1007220966))
                                    goto(Label_0428)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(64)), ldc:int(0))) {
                                    var_2_F2 = and:int(var_2_F2:int, ldc:int(1052661479))
                                    goto(Label_0428)
                                }
                            }
                            
                            var_2_F2 = and:int(var_2_F2:int, ldc:int(-885835304))
                            goto(Label_0544)
                        }
                        catch (\u516c\u3d64\u718f\ub171\u6b5f.\uae5d\u5654\uc910\ub18d\u7d52 var_5_191) {
                            var_2_F2 = and:int(var_2_F2:int, ldc:int(-1036160793))
                            invokeinterface:void(Logger::error, getstatic:Logger(\u36d3\ud523\u0800\uceb8\u8389::\u34df\u4492\u71ae\uc238\u7873\uafe7), loadelement:String(getstatic:String[](\u36d3\ud523\u0800\uceb8\u8389::\u5654\u5654\ud158\u3776\u3d64\u7d52), xor:int(ldc:int(8196), ldc:int(8201))))
                        }
                        
                        Label_0428:
                        
                        if (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0544)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(8)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(16384)), ldc:int(0))) {
                                var_2_F2 = and:int(var_2_F2:int, ldc:int(1644897727))
                                goto(Label_0338)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(2)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_F2 = and:int(var_2_F2:int, ldc:int(1944073643))
                            invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\u99f7\uc2e8\uc7fe\u5140\ud158\u071d, this:\u36d3\ud523\u0800\uceb8\u8389, getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u7330\u71f1\u494c\u8413\ub32d\ubf56, this:\u36d3\ud523\u0800\uceb8\u8389))
                        }
                        
                        Label_0483:
                        
                        if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(32)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(8)), ldc:int(0))) {
                                goto(Label_0428)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_2_F2 = and:int(var_2_F2:int, ldc:int(1016075541))
                                goto(Label_0338)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(67108864)), ldc:int(0))) {
                                var_2_F2 = and:int(var_2_F2:int, ldc:int(-2046002982))
                                loopcontinue()
                            }
                            
                            var_2_F2 = and:int(var_2_F2:int, ldc:int(2080332199))
                            putfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u071d\ub6ab\u4492\u4f52\u76bc\u7d52, this:\u36d3\ud523\u0800\uceb8\u8389, ldc:int(-1))
                        }
                        
                        Label_0544:
                        
                        if (cmpne:boolean(and:int(var_2_F2:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0483)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0338)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_F2:int, ldc:int(4194304)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    var_2_257 = and:int(var_2_F2:int, ldc:int(1696708771))
                    invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\u6d69\u62da\u4179\u3d64\u7ce1\u40a9, this:\u36d3\ud523\u0800\uceb8\u8389)
                }
                
                Label_0586:
                
                if (cmpne:boolean(and:int(var_2_257:int, ldc:int(8)), ldc:int(0))) {
                    var_2_257 = and:int(var_2_257:int, ldc:int(-1969716941))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_257:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0196)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_257:int, ldc:int(8388608)), ldc:int(0))) {
                        var_2_257 = and:int(var_2_257:int, ldc:int(60911977))
                        goto(Label_0149)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_257:int, ldc:int(67108864)), ldc:int(0))) {
                        var_2_257 = and:int(var_2_257:int, ldc:int(397302648))
                        loopcontinue()
                    }
                    
                    var_2_257 = and:int(var_2_257:int, ldc:int(1056512503))
                    putfield:boolean(\u36d3\ud523\u0800\uceb8\u8389::\u64ab\ubf56\u67e9\u8aa5\u1187\u4bc8, this:\u36d3\ud523\u0800\uceb8\u8389, xor:int[expected:boolean](ldc:int(18432), ldc:int(18433)))
                }
                
                Label_0662:
                
                if (cmpeq:boolean(and:int(var_2_257:int, ldc:int(32)), ldc:int(0))) {
                    var_2_257 = and:int(var_2_257:int, ldc:int(485628295))
                    goto(Label_0586)
                }
                
                if (cmpeq:boolean(and:int(var_2_257:int, ldc:int(128)), ldc:int(0))) {
                    var_2_257 = and:int(var_2_257:int, ldc:int(-1624062602))
                    goto(Label_0196)
                }
                
                if (cmpne:boolean(and:int(var_2_257:int, ldc:int(64)), ldc:int(0))) {
                    var_2_257 = and:int(var_2_257:int, ldc:int(1058062914))
                    goto(Label_0149)
                }
                
                if (cmpeq:boolean(and:int(var_2_257:int, ldc:int(1048576)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_257 = and:int(var_2_257:int, ldc:int(-83958561))
            }
            
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u36d3\ud523\u0800\uceb8\u8389::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u36d3\ud523\u0800\uceb8\u8389), this:\u36d3\ud523\u0800\uceb8\u8389[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6435\u56bd\ubded\u416d\u8c8a\u8aa5$3(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\ud171\u8d98\ucb79\u7049\u7bad\u3776, this:\u36d3\ud523\u0800\uceb8\u8389)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4d85\u3bc9\u8413\u8308\u3711\ub70c$2(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
        var_2_61 : int
        
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
            var_2_61 = and:int(ldc:int(-2140287182), ldc:int(-1202204689))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u6c52\u3dd3\ucfaf\u7e3f\u600f::\u494c\uc84e\u8753\u93a2\u9033\uc7fe, checkcast:\u6c52\u3dd3\ucfaf\u7e3f\u600f(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u6c52\u3dd3\ucfaf\u7e3f\u600f.class, invokeinterface:\u6c52\u3dd3\ucfaf\u7e3f\u600f(List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>::get, getfield:List<\u6c52\u3dd3\ucfaf\u7e3f\u600f>(\ud12e\u946b\u97b7\u51b2\u3d64::\ufe34\u1187\u5fe1\ud217\ub1b9\u839e, getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389)), getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u071d\ub6ab\u4492\u4f52\u76bc\u7d52, this:\u36d3\ud523\u0800\uceb8\u8389)))))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(596031407))
                invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\ud4fe\u647c\u3e2a\ud7e8\u71ae\ua3b4, this:\u36d3\ud523\u0800\uceb8\u8389, getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u071d\ub6ab\u4492\u4f52\u76bc\u7d52, this:\u36d3\ud523\u0800\uceb8\u8389))
            }
            else {
                invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\u4975\ua61f\u8413\ubefe\u494c\u385b, this:\u36d3\ud523\u0800\uceb8\u8389, getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u071d\ub6ab\u4492\u4f52\u76bc\u7d52, this:\u36d3\ud523\u0800\uceb8\u8389))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uc7fe\u6cfe\u3dd3\u156b\u4daf\u8c8a$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\u760c\u72f1\ubefe\u5245\u8413\u385b, this:\u36d3\ud523\u0800\uceb8\u8389, getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u071d\ub6ab\u4492\u4f52\u76bc\u7d52, this:\u36d3\ud523\u0800\uceb8\u8389))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u99f7\uf9c5\u4cd9\u64f2\ube23\u446c$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u36d3\ud523\u0800\uceb8\u8389::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u36d3\ud523\u0800\uceb8\u8389), initobject:\u9255\u0b8e\u4ab3\u34df\u9255[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u9255\u0b8e\u4ab3\u34df\u9255::<init>, getfield:\u6d69\u69d9\u6d99\u64f2\u3776(\u36d3\ud523\u0800\uceb8\u8389::\u3c25\ud523\u51fa\ubf56\ud171\u516c, this:\u36d3\ud523\u0800\uceb8\u8389), this:\u36d3\ud523\u0800\uceb8\u8389[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, this:\u36d3\ud523\u0800\uceb8\u8389)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u64ab\uae5d\u0800\u3dd3\u183a\uc87f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u36d3\ud523\u0800\uceb8\u8389 p0) {
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
            return:int(getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u8413\uc31c\u071d\u6198\u4e72\u873d, p0:\u36d3\ud523\u0800\uceb8\u8389))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 \u3dd3\ua562\u8413\u3776\uc3e3\u8c8a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u36d3\ud523\u0800\uceb8\u8389 p0) {
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
            return:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u36d3\ud523\u0800\uceb8\u8389::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, p0:\u36d3\ud523\u0800\uceb8\u8389))
        }
        
        goto(Label_0006)
    }
    
    public static int \u6fb0\u99f7\u6b5f\ub171\uc910\u6c52(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u36d3\ud523\u0800\uceb8\u8389 p0) {
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
            return:int(getfield:int(\u36d3\ud523\u0800\uceb8\u8389::\ud7e8\u3776\u97e6\u8d98\ufcaf\u56bd, p0:\u36d3\ud523\u0800\uceb8\u8389))
        }
        
        goto(Label_0006)
    }
    
    public static void \ubded\u6198\u8bb0\uc4d2\u071d\ubcb0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u36d3\ud523\u0800\uceb8\u8389 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p1, int p2, int p3, int p4, int p5) {
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
            invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\ube23\u3c25\u071d\u6bb9\ubefe\u4c04, p0:\u36d3\ud523\u0800\uceb8\u8389, p1:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p2:int, p3:int, p4:int, p5:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u8389\u4d85\u718f\u6b5f\ud523\ubefe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u36d3\ud523\u0800\uceb8\u8389 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p1, int p2, int p3, int p4, int p5) {
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
            invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\u9a18\ub7dc\ua6bd\u92ff\u71ae\uc84e, p0:\u36d3\ud523\u0800\uceb8\u8389, p1:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p2:int, p3:int, p4:int, p5:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \uc2bd\u6b0d\ub70c\u0a06\u446c\uceb8(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u36d3\ud523\u0800\uceb8\u8389 p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p1, int p2, int p3, int p4, int p5) {
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
            invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\u64f2\uf995\u8258\ub102\u983f\u1833, p0:\u36d3\ud523\u0800\uceb8\u8389, p1:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p2:int, p3:int, p4:int, p5:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u8d98\u3504\u36d3\u3a62\u516c\ub1b9(int p0) {
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
            return:int(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, p0:int))
        }
        
        goto(Label_0006)
    }
    
    public static int \u6b5f\uc7fe\u6c52\u839e\u97e6\u88c5(int p0) {
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
            return:int(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, p0:int))
        }
        
        goto(Label_0006)
    }
    
    public static int \u3c25\ub102\ubcb0\u4179\u51b2\u3a62(int p0) {
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
            return:int(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, p0:int))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud12e\u946b\u97b7\u51b2\u3d64 \u385b\u6fb0\uc246\u97b7\uc9f6\uc238(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u36d3\ud523\u0800\uceb8\u8389 p0) {
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
            return:\ud12e\u946b\u97b7\u51b2\u3d64(getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u36d3\ud523\u0800\uceb8\u8389::\u8709\u6d99\u7e3f\ud36e\u51fa\u7bad, p0:\u36d3\ud523\u0800\uceb8\u8389))
        }
        
        goto(Label_0006)
    }
    
    public static \u3d64\u7af6\uae87\uc238\u7d52.\u873d\u446c\u6c56\u836c\u4975 \u6b5f\u0800\u183a\u88c5\u76bc\u59ec(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u36d3\ud523\u0800\uceb8\u8389 p0) {
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
            return:\u873d\u446c\u6c56\u836c\u4975(getfield:\u873d\u446c\u6c56\u836c\u4975(\u36d3\ud523\u0800\uceb8\u8389::\u0800\u946b\ud4fe\u7873\ud7e8\u4bc8, p0:\u36d3\ud523\u0800\uceb8\u8389))
        }
        
        goto(Label_0006)
    }
    
    public static void \uc4d2\u385b\ub1b9\uc2e8\u7c6b\u6c56(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u36d3\ud523\u0800\uceb8\u8389 p0, int p1) {
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
            invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\u4975\ua61f\u8413\ubefe\u494c\u385b, p0:\u36d3\ud523\u0800\uceb8\u8389, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ud7e8\u1833\uceb8\u3776\ubff1\uc84e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u36d3\ud523\u0800\uceb8\u8389 p0, int p1) {
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
            invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\ud4fe\u647c\u3e2a\ud7e8\u71ae\ua3b4, p0:\u36d3\ud523\u0800\uceb8\u8389, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ub32d\u6b5f\u7049\u8753\u34df\u64ab(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u36d3\ud523\u0800\uceb8\u8389 p0, int p1) {
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
            invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\u760c\u72f1\ubefe\u5245\u8413\u385b, p0:\u36d3\ud523\u0800\uceb8\u8389, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static int \u9af2\ub19c\u6435\ubefe\ua61f\u7e3f(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u36d3\ud523\u0800\uceb8\u8389 p0, int p1) {
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
            return:int(putfield:int(\u36d3\ud523\u0800\uceb8\u8389::\u071d\ub6ab\u4492\u4f52\u76bc\u7d52, p0:\u36d3\ud523\u0800\uceb8\u8389, p1:int))
        }
        
        goto(Label_0006)
    }
    
    public static void \uc7fe\u8389\ub102\uc238\u3711\ucfaf(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u36d3\ud523\u0800\uceb8\u8389 p0) {
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
            invokespecial:void(\u36d3\ud523\u0800\uceb8\u8389::\u6d69\u62da\u4179\u3d64\u7ce1\u40a9, p0:\u36d3\ud523\u0800\uceb8\u8389)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_547 : int
        expr_6E : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C5_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_100_0 : byte[] [generated]
        stack_12D_0 : byte[] [generated]
        stack_49F_0 : byte[] [generated]
        stack_4F3_0 : byte[] [generated]
        stack_55A_0 : byte[] [generated]
        stack_5E1_0 : byte[] [generated]
        var_4_480 : int
        var_3_485 : byte[]
        var_5_486 : int
        expr_49F : byte [generated]
        var_0_574 : int
        expr_55A : byte [generated]
        stack_5AC_2 : byte [generated]
        stack_580_0 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_4E1 : byte[]
        var_5_4E2 : int
        expr_C7 : int [generated]
        expr_100 : int [generated]
        var_3_5CF : byte[]
        var_5_5D0 : int
        var_3_139 : String
        expr_141 : String[] [generated]
        expr_14B : String[] [generated]
        var_3_3B3 : String[]
        
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
        var_0_547 = and:int(ldc:int(-718309992), ldc:int(-632684773))
        expr_6E = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C5_0 = stack_C7_0 = stack_FE_0 = stack_100_0 = stack_12D_0 = stack_49F_0 = stack_4F3_0 = stack_55A_0 = stack_5E1_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("EeL+NbLC7vMqGV3m6fYJXfPOxiTu8yE80qNVEZUZLhld5un2CQ3XIO7zITzSo1URlRkuGV3m6fYJ7t8pEdINFQlA0qNVEUXiphHaNQn2HTnuySXjzjUF5s7CVQCi6w0VLekZ+6YZBQXqEDEa0g0VCQEd6skl4841BebOwlUAousNFS3p+h7SDRUJUfIR5skl4841BebOwlUAousNFS3p+h7SDRUJEcUN5+4RWRXV/uMNFf4dDeIh5skl4841BebOwlUAousNFS3p+h7SDRUJEcUN4+oQ6u8NFf4dDeIh5skl4841BebOwlUAousNFS3p+h7SDRUJEcUdNgXGyj040ucNFf4dDeIh5skl4841BebOwlUAousNFS3pyhIp3u4B3gjiDhXiJe4d6skl4841BebOwlUAousNFS3pqh4hEdINFQkAyvMlEdo1CfYdCeYNMd4dKaLGIV32xvL2JerSFR1Z4s0p8+oI+uv+DQ327iFd5urO6vL24hVVFMISMfYZ6tIVHVnizSnz6gjKPln2xvLlWePG4u5BEd4t3u4BDTnm8soU5hox9hnq0hUdWeLNKfPqCMo+WfbG8uUJ410B7vLKFOYaMfYZ6tIVHVnizSnz6gjKPln2xvLl6utREQU55vLKFOYaMQUdEQ==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_480 = expr_6E:int
        var_3_485 = newarray:byte[](byte.class, expr_6E:int)
        var_5_486 = expr_6E:int
        Label_1160:
        
        while (cmpne:boolean(and:int(var_0_547:int, ldc:int(8)), ldc:int(0))) {
            var_0_547 = and:int(var_0_547:int, ldc:int(-75535012))
            var_5_486 = add:int(var_5_486:int, ldc:int(-1))
            expr_49F = loadelement:byte(stack_49F_0:byte[], var_5_486:int)
            storeelement:byte(var_3_485:byte[], var_5_486:int, xor:int(or:int(and:int(shl:int(expr_49F:byte, xor:int(ldc:int(3235), ldc:int(3239))), ldc:int(-16)), and:int(shr:int(expr_49F:byte[expected:int], and:int(ldc:int(70), ldc:int(149))), ldc:int(15))), ldc:int(17)))
            
            if (cmpne:boolean(var_5_486:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C5_0 = stack_C7_0 = stack_FE_0 = stack_100_0 = stack_12D_0 = stack_49F_0 = stack_4F3_0 = stack_55A_0 = stack_5E1_0 = var_3_485:byte[]
            goto(Label_0115)
        }
        
        Label_1338:
        
        while (cmpne:boolean(and:int(var_0_547:int, ldc:int(524288)), ldc:int(0))) {
            var_0_574 = and:int(var_0_547:int, ldc:int(-61213268))
            var_5_486 = add:int(var_5_486:int, ldc:int(-1))
            expr_55A = stack_5AC_2 = loadelement(stack_55A_0, var_5_486)
            
            if (cmplt:boolean(add:int(add:int(var_5_486:int, ldc:int(2)), neg:int(var_4_480:int)), ldc:int(0))) {
                stack_5AC_2 = stack_580_0 = add:byte(expr_55A:byte, loadelement:byte(var_3_485:byte[], add:int(var_5_486:int, ldc:int(2))))
                goto(Label_1424)
            }
            
            Label_1383:
            
            if (cmpeq:boolean(and:int(var_0_574:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_574 = and:int(var_0_574:int, ldc:int(2013508170))
            }
            else {
                var_0_574 = and:int(var_0_574:int, ldc:int(-1632897586))
                stack_5AC_2 = stack_580_0 = add:byte(expr_55A:byte, ldc:byte(2))
            }
            
            Label_1424:
            
            if (cmpeq:boolean(and:int(var_0_574:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_574 = and:int(var_0_574:int, ldc:int(-1005901474))
                goto(Label_1383)
            }
            
            var_0_547 = and:int(var_0_574:int, ldc:int(-1659244550))
            storeelement:byte(var_3_485:byte[], var_5_486:int, stack_5AC_2:byte)
            
            if (cmpne:boolean(var_5_486:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C5_0 = stack_C7_0 = stack_FE_0 = stack_100_0 = stack_12D_0 = stack_49F_0 = stack_4F3_0 = stack_55A_0 = stack_5E1_0 = var_3_485:byte[]
            goto(Label_0204)
        }
        
        var_0_547 = and:int(var_0_547:int, ldc:int(-2085563783))
        goto(Label_1160)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_547:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_547 = and:int(var_0_547:int, ldc:int(-384833937))
            goto(Label_0261)
        }
        
        if (cmpne:boolean(and:int(var_0_547:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0204)
        }
        
        if (cmpeq:boolean(and:int(var_0_547:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_547 = and:int(var_0_547:int, ldc:int(-1188304950))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_4E1 = newarray:byte[](byte.class, expr_A0:int)
                var_5_4E2 = expr_A0:int
                
                loop {
                    var_0_547 = and:int(var_0_547:int, ldc:int(-624171185))
                    var_5_4E2 = add:int(var_5_4E2:int, ldc:int(-1))
                    storeelement:byte(var_3_4E1:byte[], var_5_4E2:int, add:int(shl:int(loadelement:byte(stack_4F3_0:byte[], var_5_4E2:int), ldc:int(2)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_4E2:int, and:int(ldc:int(6305), ldc:int(24585)))), ldc:int(6)), and:int(ldc:int(39), ldc:int(1035)))))
                    
                    if (cmpne:boolean(var_5_4E2:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C5_0 = stack_C7_0 = stack_FE_0 = stack_100_0 = stack_12D_0 = stack_49F_0 = stack_4F3_0 = stack_55A_0 = stack_5E1_0 = var_3_4E1:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpne:boolean(and:int(var_0_547:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0261)
        }
        
        if (cmpeq:boolean(and:int(var_0_547:int, ldc:int(32)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_547:int, ldc:int(524288)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_547 = and:int(var_0_547:int, ldc:int(-1647611969))
            expr_C7 = arraylength:int(stack_C7_0:byte[])
            
            if (cmpne:boolean(expr_C7:int, ldc:int(0))) {
                var_4_480 = expr_C7:int
                var_3_485 = newarray:byte[](byte.class, expr_C7:int)
                var_5_486 = expr_C7:int
                goto(Label_1338)
            }
        }
        
        Label_0204:
        
        if (cmpeq:boolean(and:int(var_0_547:int, ldc:int(8192)), ldc:int(0))) {
            var_0_547 = and:int(var_0_547:int, ldc:int(1804074707))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_547:int, ldc:int(8192)), ldc:int(0))) {
                var_0_547 = and:int(var_0_547:int, ldc:int(1199554867))
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_547:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_547 = and:int(var_0_547:int, ldc:int(-718307474))
            expr_100 = arraylength:int(stack_100_0:byte[])
            
            if (cmpne:boolean(expr_100:int, ldc:int(0))) {
                var_3_5CF = newarray:byte[](byte.class, expr_100:int)
                var_5_5D0 = expr_100:int
                
                loop {
                    var_0_547 = and:int(var_0_547:int, ldc:int(-800328327))
                    var_5_5D0 = add:int(var_5_5D0:int, ldc:int(-1))
                    storeelement:byte(var_3_5CF:byte[], var_5_5D0:int, add:byte(loadelement:byte(stack_5E1_0:byte[], var_5_5D0:int), ldc:byte(101)))
                    
                    if (cmpne:boolean(var_5_5D0:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C5_0 = stack_C7_0 = stack_FE_0 = stack_100_0 = stack_12D_0 = stack_49F_0 = stack_4F3_0 = stack_55A_0 = stack_5E1_0 = var_3_5CF:byte[]
            }
        }
        
        Label_0261:
        
        if (cmpeq:boolean(and:int(var_0_547:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0204)
        }
        
        if (cmpne:boolean(and:int(var_0_547:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0165)
        }
        
        if (cmpeq:boolean(and:int(var_0_547:int, ldc:int(524288)), ldc:int(0))) {
            var_0_547 = and:int(var_0_547:int, ldc:int(-2023405107))
            goto(Label_0115)
        }
        
        var_3_139 = initobject:String(String::<init>, stack_12D_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_141 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(5142), ldc:int(535)))
        expr_14B = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(17430), ldc:int(8279)))
        storeelement:String(expr_14B:String[], xor:int(ldc:int(8371), ldc:int(8377)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(21218), ldc:int(-22259)), and:int(ldc:int(20712), ldc:int(-22763))))
        storeelement:String(expr_14B:String[], xor:int(ldc:int(16611), ldc:int(16619)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(4143), ldc:int(-4272)), xor:int(ldc:int(3), ldc:int(1))))
        storeelement:String(expr_14B:String[], and:int(ldc:int(527), ldc:int(4395)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(286), ldc:int(15042)), xor:int(ldc:int(1152), ldc:int(1156))))
        storeelement:String(expr_14B:String[], and:int(ldc:int(6345), ldc:int(9)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(19463), ldc:int(19459)), xor:int(ldc:int(-24554), ldc:int(-24559))))
        storeelement:String(expr_14B:String[], and:int(ldc:int(2588), ldc:int(204)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(927), ldc:int(16391)), and:int(ldc:int(396), ldc:int(1064))))
        storeelement:String(expr_14B:String[], xor:int(ldc:int(2347), ldc:int(2350)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(6223), ldc:int(6215)), xor:int(ldc:int(4609), ldc:int(4639))))
        storeelement:String(expr_14B:String[], and:int(ldc:int(14764), ldc:int(1604)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(4671), ldc:int(9374)), xor:int(ldc:int(-28270), ldc:int(-28256))))
        storeelement:String(expr_14B:String[], and:int(ldc:int(18445), ldc:int(4237)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(18615), ldc:int(8250)), and:int(ldc:int(16620), ldc:int(10312))))
        storeelement:String(expr_14B:String[], and:int(ldc:int(18391), ldc:int(46)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(10440), ldc:int(17769)), and:int(ldc:int(720), ldc:int(4187))))
        storeelement:String(expr_14B:String[], and:int(ldc:int(30742), ldc:int(-31703)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(-28349), ldc:int(-28397)), and:int(ldc:int(3442), ldc:int(8311))))
        storeelement:String(expr_141:String[], xor:int(ldc:int(1294), ldc:int(1307)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(532), ldc:int(614)), xor:int(ldc:int(-31657), ldc:int(-31526))))
        storeelement:String(expr_141:String[], xor:int(ldc:int(16807), ldc:int(16819)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(397), ldc:int(9949)), and:int(ldc:int(3255), ldc:int(24759))))
        storeelement:String(expr_14B:String[], and:int(ldc:int(16386), ldc:int(8278)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(18111), ldc:int(14583)), xor:int(ldc:int(-28527), ldc:int(-28593))))
        storeelement:String(expr_14B:String[], xor:int(ldc:int(4872), ldc:int(4873)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(24659), ldc:int(24717)), xor:int(ldc:int(8654), ldc:int(8390))))
        storeelement:String(expr_14B:String[], and:int(ldc:int(8483), ldc:int(4099)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(2435), ldc:int(2187)), xor:int(ldc:int(-24393), ldc:int(-24162))))
        storeelement:String(expr_14B:String[], xor:int(ldc:int(2085), ldc:int(2082)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(4525), ldc:int(17259)), and:int(ldc:int(11086), ldc:int(334))))
        storeelement:String(expr_141:String[], and:int(ldc:int(5714), ldc:int(8214)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(974), ldc:int(9567)), xor:int(ldc:int(187), ldc:int(492))))
        storeelement:String(expr_141:String[], and:int(ldc:int(270), ldc:int(14479)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(375), ldc:int(17247)), xor:int(ldc:int(18603), ldc:int(18934))))
        storeelement:String(expr_141:String[], and:int(ldc:int(3731), ldc:int(20599)), invokevirtual:String[expected:String](String::substring, var_3_139:String, and:int(ldc:int(21469), ldc:int(383)), and:int(ldc:int(896), ldc:int(9696))))
        storeelement:String(expr_141:String[], and:int(ldc:int(25), ldc:int(26641)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(2019), ldc:int(1635)), and:int(ldc:int(8633), ldc:int(16813))))
        storeelement:String(expr_141:String[], xor:int(ldc:int(-32511), ldc:int(-32498)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(2851), ldc:int(2698)), and:int(ldc:int(8664), ldc:int(4552))))
        storeelement:String(expr_141:String[], and:int(ldc:int(4624), ldc:int(60)), invokevirtual:String[expected:String](String::substring, var_3_139:String, xor:int(ldc:int(4520), ldc:int(4192)), and:int(ldc:int(20971), ldc:int(11245))))
        putstatic:String[](\u36d3\ud523\u0800\uceb8\u8389::\u5654\u5654\ud158\u3776\u3d64\u7d52, expr_14B:String[])
        var_3_3B3 = expr_141:String[]
        putstatic:Logger(\u36d3\ud523\u0800\uceb8\u8389::\u34df\u4492\u71ae\uc238\u7873\uafe7, invokestatic:Logger(LogManager::getLogger))
        putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u36d3\ud523\u0800\uceb8\u8389::\u36d3\u4e72\ubcb0\u93a2\uc238\u67e9, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_3B3:String[], xor:int(ldc:int(2433), ldc:int(2447))), loadelement:String(var_3_3B3:String[], xor:int(ldc:int(-31738), ldc:int(-31735)))))
        putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u36d3\ud523\u0800\uceb8\u8389::\u8709\ub1b9\u836c\u8709\ube23\ube23, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_3B3:String[], and:int(ldc:int(15), ldc:int(18446))), loadelement:String(var_3_3B3:String[], and:int(ldc:int(1428), ldc:int(48)))))
        putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u36d3\ud523\u0800\uceb8\u8389::\u4e72\u156b\u8350\u8bb0\u67d0\u120d, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_3B3:String[], xor:int(ldc:int(1030), ldc:int(1032))), loadelement:String(var_3_3B3:String[], and:int(ldc:int(49), ldc:int(16785)))))
        putstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u36d3\ud523\u0800\uceb8\u8389::\u3bd6\u4179\u3a62\u8d90\u071d\u183a, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, loadelement:String(var_3_3B3:String[], xor:int(ldc:int(4113), ldc:int(4099))), loadelement:String(var_3_3B3:String[], and:int(ldc:int(3671), ldc:int(12691)))))
        putstatic:ITextComponent(\u36d3\ud523\u0800\uceb8\u8389::\u446c\u67d0\ua562\u97b7\u6c56\u59ec, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3B3:String[], and:int(ldc:int(4156), ldc:int(1876)))))
        putstatic:ITextComponent(\u36d3\ud523\u0800\uceb8\u8389::\u8c8a\ub8be\uff55\u97b7\ud171\u12b2, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u36d3\ud523\u0800\uceb8\u8389::\u5654\u5654\ud158\u3776\u3d64\u7d52), xor:int(ldc:int(5505), ldc:int(5507)))))
        putstatic:ITextComponent(\u36d3\ud523\u0800\uceb8\u8389::\uceb8\u8258\uf9c5\uc229\u7330\ucfaf, initobject:TranslationTextComponent[expected:ITextComponent](TranslationTextComponent::<init>, loadelement:String(getstatic:String[](\u36d3\ud523\u0800\uceb8\u8389::\u5654\u5654\ud158\u3776\u3d64\u7d52), and:int(ldc:int(357), ldc:int(12297)))))
        putstatic:ITextComponent(\u36d3\ud523\u0800\uceb8\u8389::\u1833\u88c5\u0b8e\uc9f6\u960f\u839e, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_3B3:String[], xor:int(ldc:int(4140), ldc:int(4153)))))
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B1 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6BC : int
        
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
        var_3_6B1 = and:int(ldc:int(-1261488046), ldc:int(-453117930))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u36d3\ud523\u0800\uceb8\u8389[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-341963993))
        }
        else {
            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-671252614))
            var_5_8A = and:int(ldc:int(9730), ldc:int(-9731))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-21167), ldc:int(21162)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6B1:int, ldc:int(-486572544))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(22589), ldc:int(641)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(387), ldc:int(386)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6B1 = and:int(var_3_DA:int, ldc:int(-1880131041))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(1572), ldc:int(1573)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1411521710))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(85897234))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1710753214))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1647428375))
                        goto(Label_0747)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-747960689))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-256700559))
                    }
                    else {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(149909872))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(161868727))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2062244473))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(102033443))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(285608968))
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(842449744))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-173365181))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2016413889))
                        var_11_EB = and:int(ldc:int(5018), ldc:int(-5020))
                        goto(Label_1589)
                    }
                    
                    Label_0613:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1421606367))
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(65420302))
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1486864789))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2127929292))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1880859310))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-304122250))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0747:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1416806874))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1244663660))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-460747515))
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1510015233))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-2005998987))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1681211813))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-465440601))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1537971459))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(97366623))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(-32488), ldc:int(-32487))
                                goto(Label_1146)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1106705943))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1540715991))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-924007100))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(654145408))
                        var_11_EB = and:int(ldc:int(24870), ldc:int(-24871))
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2026281582))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(296889129))
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0747)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1475109756))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1737773635))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1880139648))
                            loopcontinue()
                        }
                        
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-606242199))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1416)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1600)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-809260471))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1146)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1765962377))
                            goto(Label_0995)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(346529223))
                            goto(Label_0747)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(283927797))
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1776235323))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1589)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1416:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1686834783))
                        goto(Label_1600)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-869262175))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-949086067))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1054460534))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(269108791))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1925158186))
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(2105220525))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-203253277))
                        loopcontinue()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1395821235))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1589:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BC = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1600:
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1416)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(835236333))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B1:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1513901026))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0747)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(60585713))
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-1761627413))
                        var_17_6BC = add:int(var_16_119:int, xor:int(ldc:int(2752), ldc:int(2753)))
                        looporswitchbreak()
                    }
                    
                    var_3_6B1 = and:int(var_3_6B1:int, ldc:int(1985450453))
                }
                
                var_3_6B1 = and:int(var_3_6B1:int, ldc:int(-370166328))
                
                if (cmple:boolean(var_5_8A = var_17_6BC:int, sub:int(var_6_91:int, xor:int(ldc:int(6144), ldc:int(6145))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6B1:int, ldc:int(1048576)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
