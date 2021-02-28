public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u839e\ud158\u527a\u385b\u16f6 {
    public void \u839e\ud158\u527a\u385b\u16f6(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u3d4b\u9af2\u71f1\u67d0\u99f7 p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ud12e\u946b\u97b7\u51b2\u3d64 p2) {
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
            invokespecial:\u99f7\u7006\u6198\u47c2\ub1b9\u12cb(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::<init>, this:\u839e\ud158\u527a\u385b\u16f6)
            putfield:String(\u839e\ud158\u527a\u385b\u16f6::\u92ee\u446c\u8389\u7006\u7049\u6bb9, this:\u839e\ud158\u527a\u385b\u16f6, loadelement:String(getstatic:String[](\u839e\ud158\u527a\u385b\u16f6::\u64f2\ubefe\u3711\u74b1\u1187\u3711), and:int(ldc:int(9650), ldc:int(-26099))))
            putfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u839e\ud158\u527a\u385b\u16f6::\u6b5f\u6d69\u183a\u120d\u516c\u8308, this:\u839e\ud158\u527a\u385b\u16f6, p0:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
            putfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u839e\ud158\u527a\u385b\u16f6::\u8df4\u8c8a\uae5d\u494c\ub6ab\u64f2, this:\u839e\ud158\u527a\u385b\u16f6, p1:\u3d4b\u9af2\u71f1\u67d0\u99f7)
            putfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u839e\ud158\u527a\u385b\u16f6::\u3a62\u8d98\uc238\u97b7\u0b8e\u5d20, this:\u839e\ud158\u527a\u385b\u16f6, p2:\ud12e\u946b\u97b7\u51b2\u3d64)
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
            invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u7bad\ub171\u61a4\ubff1\u6d69\u6cfe, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u839e\ud158\u527a\u385b\u16f6::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u839e\ud158\u527a\u385b\u16f6)), and:int[expected:boolean](ldc:int(24838), ldc:int(-24855)))
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
        
        if (cmpne:boolean(p0:int, and:int(ldc:int(1944), ldc:int(31072)))) {
            return:boolean(invokespecial:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\u839e\ud158\u527a\u385b\u16f6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:int, p1:int, p2:int))
        }
        
        invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u839e\ud158\u527a\u385b\u16f6::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u839e\ud158\u527a\u385b\u16f6), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u839e\ud158\u527a\u385b\u16f6::\u6b5f\u6d69\u183a\u120d\u516c\u8308, this:\u839e\ud158\u527a\u385b\u16f6))
        return:boolean(and:int[expected:boolean](ldc:int(105), ldc:int(16391)))
    }
    
    private void \u36d3\u16f6\uc229\u4179\ub32d\u64ab() {
        var_1_F7 : int
        var_3_68 : \u61a4\u8aa5\uff55\u718f\ub8be
        
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
            var_1_F7 = and:int(and:int(ldc:int(-1267800749), ldc:int(-1641853601)), ldc:int(-1662294281))
            var_3_68 = invokestatic:\u61a4\u8aa5\uff55\u718f\ub8be(\u61a4\u8aa5\uff55\u718f\ub8be::\u8350\ubf56\u4f52\u9937\u8350\ub83f)
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_1_F7:int, ldc:int(8)), ldc:int(0))) {
                        var_1_F7 = and:int(var_1_F7:int, ldc:int(-189418517))
                        goto(Label_0207)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_F7:int, ldc:int(131072)), ldc:int(0))) {
                        var_1_F7 = and:int(var_1_F7:int, ldc:int(-1620583305))
                        invokevirtual:void(\u61a4\u8aa5\uff55\u718f\ub8be::\u946b\u5d20\u718f\uae5d\u960f\u7049, var_3_68:\u61a4\u8aa5\uff55\u718f\ub8be)
                    }
                    
                    Label_0136:
                    
                    if (cmpne:boolean(and:int(var_1_F7:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_1_F7:int, ldc:int(67108864)), ldc:int(0))) {
                            var_1_F7 = and:int(var_1_F7:int, ldc:int(311436756))
                            loopcontinue()
                        }
                        
                        var_1_F7 = and:int(var_1_F7:int, ldc:int(-559417358))
                        invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u839e\ud158\u527a\u385b\u16f6::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u839e\ud158\u527a\u385b\u16f6), initobject:\u6c52\u93a2\u8709\ub102\u4bc8[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u6c52\u93a2\u8709\ub102\u4bc8::<init>, getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u839e\ud158\u527a\u385b\u16f6::\u6b5f\u6d69\u183a\u120d\u516c\u8308, this:\u839e\ud158\u527a\u385b\u16f6), initobject:\u7873\u960f\u69d9\u59ec\ubcb0\u5db4[expected:\u9033\u4179\ube23\u5f50\ucfaf](\u7873\u960f\u69d9\u59ec\ubcb0\u5db4::<init>, getfield:\u3d4b\u9af2\u71f1\u67d0\u99f7(\u839e\ud158\u527a\u385b\u16f6::\u8df4\u8c8a\uae5d\u494c\ub6ab\u64f2, this:\u839e\ud158\u527a\u385b\u16f6), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u839e\ud158\u527a\u385b\u16f6::\u6b5f\u6d69\u183a\u120d\u516c\u8308, this:\u839e\ud158\u527a\u385b\u16f6), getfield:\ud12e\u946b\u97b7\u51b2\u3d64(\u839e\ud158\u527a\u385b\u16f6::\u3a62\u8d98\uc238\u97b7\u0b8e\u5d20, this:\u839e\ud158\u527a\u385b\u16f6), initobject:ReentrantLock(ReentrantLock::<init>))))
                    }
                    
                    Label_0207:
                    
                    if (cmpeq:boolean(and:int(var_1_F7:int, ldc:int(64)), ldc:int(0))) {
                        var_1_F7 = and:int(var_1_F7:int, ldc:int(-2089877797))
                        goto(Label_0136)
                    }
                    
                    if (cmpne:boolean(and:int(var_1_F7:int, ldc:int(131072)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_1_F7 = and:int(var_1_F7:int, ldc:int(-1757459114))
            }
            catch (\u516c\u3d64\u718f\ub171\u6b5f.\uae5d\u5654\uc910\ub18d\u7d52 var_4_F1) {
                var_1_F7 = and:int(var_1_F7:int, ldc:int(-1624281265))
                invokeinterface:void(Logger::error, getstatic:Logger(\u839e\ud158\u527a\u385b\u16f6::\u0c95\u6b5f\ud158\u4f4a\u51fa\u88c5), loadelement:String(getstatic:String[](\u839e\ud158\u527a\u385b\u16f6::\u64f2\ubefe\u3711\u74b1\u1187\u3711), and:int(ldc:int(8259), ldc:int(6819))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u183a\ud36e\u1187\u88c5\u7bad\u5bc4(double p0, double p1, int p2) {
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
        
        if (logicalnot:boolean(getfield:boolean(\u839e\ud158\u527a\u385b\u16f6::\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe, this:\u839e\ud158\u527a\u385b\u16f6))) {
            return:boolean(invokespecial:boolean(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u183a\ud36e\u1187\u88c5\u7bad\u5bc4, this:\u839e\ud158\u527a\u385b\u16f6[expected:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9], p0:double, p1:double, p2:int))
        }
        
        invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u16f6\u8d98\u3711\u6d69\u98a4\u946b, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u839e\ud158\u527a\u385b\u16f6::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u839e\ud158\u527a\u385b\u16f6)), loadelement:String(getstatic:String[](\u839e\ud158\u527a\u385b\u16f6::\u64f2\ubefe\u3711\u74b1\u1187\u3711), and:int(ldc:int(-3187), ldc:int(3186))))
        invokevirtual:void(\u36d3\u8640\u92ff\ub113\u12b2\ud158::\ub6ab\u92ff\u8350\u624e\ub102\u5f50, invokestatic:\u36d3\u8640\u92ff\ub113\u12b2\ud158(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc910\u4f4a\uc29a\u61a4\uc87f\u516c), loadelement:String(getstatic:String[](\u839e\ud158\u527a\u385b\u16f6::\u64f2\ubefe\u3711\u74b1\u1187\u3711), and:int(ldc:int(24698), ldc:int(-24704))))
        return:boolean(xor:int[expected:boolean](ldc:int(12324), ldc:int(12325)))
    }
    
    public java.lang.String \u8df4\u960f\uc9f6\uf94d\u5fe1\u3e75() {
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
            return:String(invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokespecial:String(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u8df4\u960f\uc9f6\uf94d\u5fe1\u3e75, this:\u839e\ud158\u527a\u385b\u16f6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])), loadelement:String(getstatic:String[](\u839e\ud158\u527a\u385b\u16f6::\u64f2\ubefe\u3711\u74b1\u1187\u3711), xor:int(ldc:int(-16371), ldc:int(-16375)))), invokeinterface:String(ITextComponent::getString, getstatic:ITextComponent(\u839e\ud158\u527a\u385b\u16f6::\u3711\ube23\u6198\ub171\u3504\ud36e))), loadelement:String(getstatic:String[](\u839e\ud158\u527a\u385b\u16f6::\u64f2\ubefe\u3711\u74b1\u1187\u3711), and:int(ldc:int(1069), ldc:int(4101)))), invokeinterface:String(ITextComponent::getString, getstatic:ITextComponent(\u839e\ud158\u527a\u385b\u16f6::\u93a2\ufe34\u67e9\u759a\u718f\u7873)))))
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_5_61 : int
        var_7_B8 : int
        var_8_CC : int
        var_9_D8 : int
        var_10_EF : int
        var_11_FE : int
        stack_153_1 : int [generated]
        var_5_151 : int
        stack_1A0_0 : \ucef1\u99f7\u4e72\u7873\u0800\u72f1 [generated]
        stack_1A0_2 : ITextComponent [generated]
        stack_1A0_3 : float [generated]
        stack_1A0_4 : float [generated]
        stack_1A0_5 : int [generated]
        
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
            var_5_61 = and:int(ldc:int(1731602092), ldc:int(-404167729))
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u839e\ud158\u527a\u385b\u16f6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u839e\ud158\u527a\u385b\u16f6::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u839e\ud158\u527a\u385b\u16f6), getstatic:ITextComponent(\u839e\ud158\u527a\u385b\u16f6::\uc2e8\ub8be\u839e\u8cae\u7af6\u927d), div:int(getfield:int(\u839e\ud158\u527a\u385b\u16f6::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u839e\ud158\u527a\u385b\u16f6), and:int(ldc:int(10342), ldc:int(1794))), ldc:int(17), ldc:int(16777215))
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u839e\ud158\u527a\u385b\u16f6::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u839e\ud158\u527a\u385b\u16f6), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getstatic:ITextComponent(\u839e\ud158\u527a\u385b\u16f6::\u3711\ube23\u6198\ub171\u3504\ud36e), i2f:float(sub:int(div:int(getfield:int(\u839e\ud158\u527a\u385b\u16f6::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u839e\ud158\u527a\u385b\u16f6), and:int(ldc:int(1027), ldc:int(590))), ldc:int(120))), i2f:float(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and:int(ldc:int(28685), ldc:int(469)))), ldc:int(16777215))
            var_7_B8 = invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ucb79\ua3b4\u946b\uc246\ua068\u36d3, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u839e\ud158\u527a\u385b\u16f6::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u839e\ud158\u527a\u385b\u16f6), getstatic:ITextComponent[expected:ITextProperties](\u839e\ud158\u527a\u385b\u16f6::\u3711\ube23\u6198\ub171\u3504\ud36e))
            var_8_CC = add:int(sub:int(div:int(getfield:int(\u839e\ud158\u527a\u385b\u16f6::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u839e\ud158\u527a\u385b\u16f6), xor:int(ldc:int(17411), ldc:int(17409))), ldc:int(121)), var_7_B8:int)
            var_9_D8 = invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and:int(ldc:int(7), ldc:int(37)))
            var_10_EF = add:int(add:int(var_8_CC:int, invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ucb79\ua3b4\u946b\uc246\ua068\u36d3, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u839e\ud158\u527a\u385b\u16f6::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u839e\ud158\u527a\u385b\u16f6), getstatic:ITextComponent[expected:ITextProperties](\u839e\ud158\u527a\u385b\u16f6::\u93a2\ufe34\u67e9\u759a\u718f\u7873))), and:int(ldc:int(4521), ldc:int(26707)))
            var_11_FE = add:int(add:int(var_9_D8:int, and:int(ldc:int(65), ldc:int(12307))), ldc:int(9))
            
            if (cmple:boolean(var_8_CC:int, p1:int)) {
                if (cmple:boolean(p1:int, var_10_EF:int)) {
                    if (cmple:boolean(var_9_D8:int, p2:int)) {
                        if (cmple:boolean(p2:int, var_11_FE:int)) {
                            stack_153_1 = xor:int[expected:boolean](ldc:int(9216), ldc:int(9217))
                            goto(Label_0331)
                        }
                    }
                }
            }
            
            var_5_61 = and:int(var_5_61:int, ldc:int(-1750651418))
            stack_153_1 = and:int[expected:boolean](ldc:int(20700), ldc:int(-30941))
            Label_0331:
            var_5_151 = and:int(var_5_61:int, ldc:int(-1212515891))
            putfield:boolean(\u839e\ud158\u527a\u385b\u16f6::\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe, this:\u839e\ud158\u527a\u385b\u16f6, stack_153_1:boolean)
            stack_1A0_0 = getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u839e\ud158\u527a\u385b\u16f6::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u839e\ud158\u527a\u385b\u16f6)
            stack_1A0_2 = getstatic:ITextComponent(\u839e\ud158\u527a\u385b\u16f6::\u93a2\ufe34\u67e9\u759a\u718f\u7873)
            stack_1A0_3 = i2f:float(add:int(sub:int(div:int(getfield:int(\u839e\ud158\u527a\u385b\u16f6::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u839e\ud158\u527a\u385b\u16f6), and:int(ldc:int(24594), ldc:int(6698))), ldc:int(120)), var_7_B8:int))
            stack_1A0_4 = i2f:float(invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and:int(ldc:int(901), ldc:int(5157))))
            
            if (logicalnot:boolean(getfield:boolean(\u839e\ud158\u527a\u385b\u16f6::\uc4d2\u8258\u1833\uc2bd\u99f7\uc7fe, this:\u839e\ud158\u527a\u385b\u16f6))) {
                var_5_151 = and:int(var_5_151:int, ldc:int(-1625033217))
                stack_1A0_5 = ldc:int(3368635)
            }
            else {
                stack_1A0_5 = ldc:int(7107012)
            }
            
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, stack_1A0_0:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, stack_1A0_2:ITextComponent, stack_1A0_3:float, stack_1A0_4:float, stack_1A0_5:int)
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u839e\ud158\u527a\u385b\u16f6[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ub18d\u960f\u3d4b\ubff1\u120d\u647c$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u839e\ud158\u527a\u385b\u16f6::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u839e\ud158\u527a\u385b\u16f6), getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u839e\ud158\u527a\u385b\u16f6::\u6b5f\u6d69\u183a\u120d\u516c\u8308, this:\u839e\ud158\u527a\u385b\u16f6))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u0b8e\u76bc\u71ae\u2dcc\uc2bd\u4f52$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\u839e\ud158\u527a\u385b\u16f6::\u36d3\u16f6\uc229\u4179\ub32d\u64ab, this:\u839e\ud158\u527a\u385b\u16f6)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_3A5 : int
        expr_6E : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_ED_0 : byte[] [generated]
        stack_EF_0 : byte[] [generated]
        stack_12D_0 : byte[] [generated]
        stack_12F_0 : byte[] [generated]
        stack_16F_0 : byte[] [generated]
        stack_171_0 : byte[] [generated]
        stack_1AF_0 : byte[] [generated]
        stack_361_0 : byte[] [generated]
        stack_3B8_0 : byte[] [generated]
        stack_446_0 : byte[] [generated]
        stack_481_0 : byte[] [generated]
        stack_4D7_0 : byte[] [generated]
        var_4_33A : int
        var_3_33F : byte[]
        var_5_340 : int
        var_0_3AE : int
        expr_3B8 : byte [generated]
        stack_401_2 : byte [generated]
        stack_3DE_0 : byte [generated]
        expr_A6 : int [generated]
        expr_EF : int [generated]
        var_2_12D : byte[]
        expr_131 : int [generated]
        var_3_46F : byte[]
        var_5_470 : int
        expr_171 : int [generated]
        var_3_4C5 : byte[]
        var_5_4C6 : int
        expr_4D7 : byte [generated]
        var_3_1BB : String
        expr_1C3 : String[] [generated]
        expr_1CD : String[] [generated]
        var_3_2CC : String[]
        
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
        var_0_3A5 = and:int(ldc:int(-1766163631), ldc:int(-1749061172))
        expr_6E = arraylength:int(stack_A4_0 = stack_A6_0 = stack_ED_0 = stack_EF_0 = stack_12D_0 = stack_12F_0 = stack_16F_0 = stack_171_0 = stack_1AF_0 = stack_361_0 = stack_3B8_0 = stack_446_0 = stack_481_0 = stack_4D7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("s12lMK+u1qFe+wByB1gt0ljEidXEudSvIKJYpSbE0l2BX6P7P6hzqLff21oj39ujVSCg2t+tyiMp16lXoFr/gtMp16j0hSLaodLcKPUHWC3Spl+gWv+C0ynXqPSFItqh0two94TZo19YLdKmX6Ba/4LTKdeo9A1Z36LZ3CWh/Si3oFr/gtMp16j0DVnfotncJaH8qTegWv+C0ynXqPeM0C5W2Mg=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_33A = expr_6E:int
        var_3_33F = newarray:byte[](byte.class, expr_6E:int)
        var_5_340 = expr_6E:int
        Label_0834:
        
        while (cmpeq:boolean(and:int(var_0_3A5:int, ldc:int(262144)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_3A5:int, ldc:int(1048576)), ldc:int(0))) {
                goto(Label_0912)
            }
            
            var_0_3A5 = and:int(var_0_3A5:int, ldc:int(-16867473))
            var_5_340 = add:int(var_5_340:int, ldc:int(-1))
            storeelement:byte(var_3_33F:byte[], var_5_340:int, xor:byte(loadelement:byte(stack_361_0:byte[], var_5_340:int), ldc:byte(90)))
            
            if (cmpne:boolean(var_5_340:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_ED_0 = stack_EF_0 = stack_12D_0 = stack_12F_0 = stack_16F_0 = stack_171_0 = stack_1AF_0 = stack_361_0 = stack_3B8_0 = stack_446_0 = stack_481_0 = stack_4D7_0 = var_3_33F:byte[]
            goto(Label_0115)
        }
        
        goto(Label_1063)
        Label_0912:
        
        while (cmpeq:boolean(and:int(var_0_3A5:int, ldc:int(134217728)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_3A5:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_3A5 = and:int(var_0_3A5:int, ldc:int(-983243023))
                goto(Label_0834)
            }
            
            var_0_3AE = and:int(var_0_3A5:int, ldc:int(-1225337864))
            var_5_340 = add:int(var_5_340:int, ldc:int(-1))
            expr_3B8 = stack_401_2 = loadelement(stack_3B8_0, var_5_340)
            
            if (cmplt:boolean(add:int(add:int(var_5_340:int, ldc:int(1)), neg:int(var_4_33A:int)), ldc:int(0))) {
                stack_401_2 = stack_3DE_0 = add:byte(expr_3B8:byte, loadelement:byte(var_3_33F:byte[], add:int(var_5_340:int, ldc:int(1))))
                goto(Label_1006)
            }
            
            Label_0965:
            
            if (cmpeq:boolean(and:int(var_0_3AE:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_3AE = and:int(var_0_3AE:int, ldc:int(2017809232))
            }
            else {
                var_0_3AE = and:int(var_0_3AE:int, ldc:int(-557909671))
                stack_401_2 = stack_3DE_0 = add:byte(expr_3B8:byte, ldc:byte(1))
            }
            
            Label_1006:
            
            if (cmpeq:boolean(and:int(var_0_3AE:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0965)
            }
            
            var_0_3A5 = and:int(var_0_3AE:int, ldc:int(-1627735095))
            storeelement:byte(var_3_33F:byte[], var_5_340:int, stack_401_2:byte)
            
            if (cmpne:boolean(var_5_340:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_ED_0 = stack_EF_0 = stack_12D_0 = stack_12F_0 = stack_16F_0 = stack_171_0 = stack_1AF_0 = stack_361_0 = stack_3B8_0 = stack_446_0 = stack_481_0 = stack_4D7_0 = var_3_33F:byte[]
            goto(Label_0171)
        }
        
        Label_1063:
        
        while (cmpne:boolean(and:int(var_0_3A5:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_3A5:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0834)
            }
            
            var_0_3A5 = and:int(var_0_3A5:int, ldc:int(-1073832986))
            var_5_340 = add:int(var_5_340:int, ldc:int(-1))
            storeelement:byte(var_3_33F:byte[], var_5_340:int, add:byte(loadelement:byte(stack_446_0:byte[], var_5_340:int), ldc:byte(29)))
            
            if (cmpne:boolean(var_5_340:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_ED_0 = stack_EF_0 = stack_12D_0 = stack_12F_0 = stack_16F_0 = stack_171_0 = stack_1AF_0 = stack_361_0 = stack_3B8_0 = stack_446_0 = stack_481_0 = stack_4D7_0 = var_3_33F:byte[]
            goto(Label_0244)
        }
        
        goto(Label_0912)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_3A5:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0374)
        }
        
        if (cmpne:boolean(and:int(var_0_3A5:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0310)
        }
        
        if (cmpeq:boolean(and:int(var_0_3A5:int, ldc:int(256)), ldc:int(0))) {
            var_0_3A5 = and:int(var_0_3A5:int, ldc:int(1820261988))
            goto(Label_0244)
        }
        
        if (cmpeq:boolean(and:int(var_0_3A5:int, ldc:int(65536)), ldc:int(0))) {
            var_0_3A5 = and:int(var_0_3A5:int, ldc:int(-558483511))
            expr_A6 = arraylength:int(stack_A6_0:byte[])
            
            if (cmpne:boolean(expr_A6:int, ldc:int(0))) {
                var_4_33A = expr_A6:int
                var_3_33F = newarray:byte[](byte.class, expr_A6:int)
                var_5_340 = expr_A6:int
                goto(Label_0912)
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_0_3A5:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_3A5 = and:int(var_0_3A5:int, ldc:int(-661995833))
            goto(Label_0374)
        }
        
        if (cmpne:boolean(and:int(var_0_3A5:int, ldc:int(65536)), ldc:int(0))) {
            var_0_3A5 = and:int(var_0_3A5:int, ldc:int(1777292329))
            goto(Label_0310)
        }
        
        if (cmpeq:boolean(and:int(var_0_3A5:int, ldc:int(131072)), ldc:int(0))) {
            var_0_3A5 = and:int(var_0_3A5:int, ldc:int(-3097594))
        }
        else {
            if (cmpne:boolean(and:int(var_0_3A5:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_3A5 = and:int(var_0_3A5:int, ldc:int(-671106110))
            expr_EF = arraylength:int(stack_EF_0:byte[])
            
            if (cmpne:boolean(expr_EF:int, ldc:int(0))) {
                var_4_33A = expr_EF:int
                var_3_33F = newarray:byte[](byte.class, expr_EF:int)
                var_5_340 = expr_EF:int
                goto(Label_1063)
            }
        }
        
        Label_0244:
        
        if (cmpne:boolean(and:int(var_0_3A5:int, ldc:int(32)), ldc:int(0))) {
            var_0_3A5 = and:int(var_0_3A5:int, ldc:int(1617301549))
            goto(Label_0374)
        }
        
        if (cmpeq:boolean(and:int(var_0_3A5:int, ldc:int(2)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_3A5:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_3A5 = and:int(var_0_3A5:int, ldc:int(-811702030))
                goto(Label_0171)
            }
            
            if (cmpne:boolean(and:int(var_0_3A5:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_3A5 = and:int(var_0_3A5:int, ldc:int(-155507752))
            var_2_12D = stack_12D_0:byte[]
            expr_131 = add:int(arraylength:int(stack_12F_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_131:int, ldc:int(0))) {
                var_3_46F = newarray:byte[](byte.class, expr_131:int)
                var_5_470 = expr_131:int
                
                loop {
                    var_0_3A5 = and:int(var_0_3A5:int, ldc:int(-1762242696))
                    var_5_470 = add:int(var_5_470:int, ldc:int(-1))
                    storeelement:byte(var_3_46F:byte[], var_5_470:int, add:int(shl:int(loadelement:byte(stack_481_0:byte[], var_5_470:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_12D:byte[], add:int(var_5_470:int, and:int(ldc:int(2181), ldc:int(1545)))), ldc:int(3)), and:int(ldc:int(31), ldc:int(13151)))))
                    
                    if (cmpne:boolean(var_5_470:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_ED_0 = stack_EF_0 = stack_12D_0 = stack_12F_0 = stack_16F_0 = stack_171_0 = stack_1AF_0 = stack_361_0 = stack_3B8_0 = stack_446_0 = stack_481_0 = stack_4D7_0 = var_3_46F:byte[]
            }
        }
        
        Label_0310:
        
        if (cmpne:boolean(and:int(var_0_3A5:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_3A5:int, ldc:int(1024)), ldc:int(0))) {
                var_0_3A5 = and:int(var_0_3A5:int, ldc:int(1605967949))
                goto(Label_0244)
            }
            
            if (cmpeq:boolean(and:int(var_0_3A5:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0171)
            }
            
            if (cmpeq:boolean(and:int(var_0_3A5:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_3A5 = and:int(var_0_3A5:int, ldc:int(242035357))
                goto(Label_0115)
            }
            
            var_0_3A5 = and:int(var_0_3A5:int, ldc:int(-537403937))
            expr_171 = arraylength:int(stack_171_0:byte[])
            
            if (cmpne:boolean(expr_171:int, ldc:int(0))) {
                var_3_4C5 = newarray:byte[](byte.class, expr_171:int)
                var_5_4C6 = expr_171:int
                
                loop {
                    var_0_3A5 = and:int(var_0_3A5:int, ldc:int(-151066143))
                    var_5_4C6 = add:int(var_5_4C6:int, ldc:int(-1))
                    expr_4D7 = loadelement:byte(stack_4D7_0:byte[], var_5_4C6:int)
                    storeelement:byte(var_3_4C5:byte[], var_5_4C6:int, or:int(and:int(shl:int(expr_4D7:byte, xor:int(ldc:int(18505), ldc:int(18509))), ldc:int(-16)), and:int(shr:int(expr_4D7:byte[expected:int], and:int(ldc:int(20484), ldc:int(9102))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_4C6:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_ED_0 = stack_EF_0 = stack_12D_0 = stack_12F_0 = stack_16F_0 = stack_171_0 = stack_1AF_0 = stack_361_0 = stack_3B8_0 = stack_446_0 = stack_481_0 = stack_4D7_0 = var_3_4C5:byte[]
            }
        }
        
        Label_0374:
        
        if (cmpeq:boolean(and:int(var_0_3A5:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0310)
        }
        
        if (cmpne:boolean(and:int(var_0_3A5:int, ldc:int(32)), ldc:int(0))) {
            var_0_3A5 = and:int(var_0_3A5:int, ldc:int(2063627251))
            goto(Label_0244)
        }
        
        if (cmpeq:boolean(and:int(var_0_3A5:int, ldc:int(1048576)), ldc:int(0))) {
            goto(Label_0171)
        }
        
        if (cmpne:boolean(and:int(var_0_3A5:int, ldc:int(32)), ldc:int(0))) {
            var_0_3A5 = and:int(var_0_3A5:int, ldc:int(1534638051))
            goto(Label_0115)
        }
        
        var_3_1BB = initobject:String(String::<init>, stack_1AF_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_1C3 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(265), ldc:int(8265)))
        expr_1CD = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32468), ldc:int(-32475)))
        storeelement:String(expr_1CD:String[], and:int(ldc:int(2069), ldc:int(4293)), invokevirtual:String[expected:String](String::substring, var_3_1BB:String, and:int(ldc:int(-20119), ldc:int(20118)), xor:int(ldc:int(5125), ldc:int(5124))))
        storeelement:String(expr_1CD:String[], and:int(ldc:int(4100), ldc:int(16484)), invokevirtual:String[expected:String](String::substring, var_3_1BB:String, and:int(ldc:int(131), ldc:int(20553)), and:int(ldc:int(2055), ldc:int(4731))))
        storeelement:String(expr_1CD:String[], xor:int(ldc:int(82), ldc:int(81)), invokevirtual:String[expected:String](String::substring, var_3_1BB:String, and:int(ldc:int(4627), ldc:int(1039)), xor:int(ldc:int(4172), ldc:int(4180))))
        storeelement:String(expr_1CD:String[], and:int(ldc:int(-4811), ldc:int(4810)), invokevirtual:String[expected:String](String::substring, var_3_1BB:String, xor:int(ldc:int(16395), ldc:int(16403)), xor:int(ldc:int(9226), ldc:int(9265))))
        storeelement:String(expr_1CD:String[], xor:int(ldc:int(-32757), ldc:int(-32758)), invokevirtual:String[expected:String](String::substring, var_3_1BB:String, and:int(ldc:int(2555), ldc:int(59)), and:int(ldc:int(5714), ldc:int(18778))))
        storeelement:String(expr_1CD:String[], xor:int(ldc:int(21), ldc:int(23)), invokevirtual:String[expected:String](String::substring, var_3_1BB:String, and:int(ldc:int(20818), ldc:int(8274)), and:int(ldc:int(24940), ldc:int(636))))
        storeelement:String(expr_1C3:String[], xor:int(ldc:int(8725), ldc:int(8722)), invokevirtual:String[expected:String](String::substring, var_3_1BB:String, and:int(ldc:int(111), ldc:int(2412)), and:int(ldc:int(1216), ldc:int(20626))))
        storeelement:String(expr_1C3:String[], and:int(ldc:int(29199), ldc:int(3112)), invokevirtual:String[expected:String](String::substring, var_3_1BB:String, xor:int(ldc:int(9332), ldc:int(9460)), and:int(ldc:int(17876), ldc:int(10391))))
        storeelement:String(expr_1C3:String[], and:int(ldc:int(550), ldc:int(30)), invokevirtual:String[expected:String](String::substring, var_3_1BB:String, and:int(ldc:int(6326), ldc:int(24724)), and:int(ldc:int(4519), ldc:int(20131))))
        putstatic:String[](\u839e\ud158\u527a\u385b\u16f6::\u64f2\ubefe\u3711\u74b1\u1187\u3711, expr_1CD:String[])
        var_3_2CC = expr_1C3:String[]
        putstatic:Logger(\u839e\ud158\u527a\u385b\u16f6::\u0c95\u6b5f\ud158\u4f4a\u51fa\u88c5, invokestatic:Logger(LogManager::getLogger))
        putstatic:ITextComponent(\u839e\ud158\u527a\u385b\u16f6::\uc2e8\ub8be\u839e\u8cae\u7af6\u927d, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_2CC:String[], and:int(ldc:int(12390), ldc:int(31)))))
        putstatic:ITextComponent(\u839e\ud158\u527a\u385b\u16f6::\u3711\ube23\u6198\ub171\u3504\ud36e, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_2CC:String[], and:int(ldc:int(10383), ldc:int(17959)))))
        putstatic:ITextComponent(\u839e\ud158\u527a\u385b\u16f6::\u93a2\ufe34\u67e9\u759a\u718f\u7873, invokevirtual:IFormattableTextComponent(TextComponent::append, initobject:StringTextComponent[expected:TextComponent](StringTextComponent::<init>, loadelement:String(getstatic:String[](\u839e\ud158\u527a\u385b\u16f6::\u64f2\ubefe\u3711\u74b1\u1187\u3711), and:int(ldc:int(16389), ldc:int(3853)))), invokevirtual:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_2CC:String[], xor:int(ldc:int(-30667), ldc:int(-30659)))), invokevirtual:Style(Style::func_244282_c, getstatic:Style(Style::EMPTY), invokestatic:Boolean(Boolean::valueOf, and:int[expected:boolean](ldc:int(141), ldc:int(11331)))))))
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_658 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_663 : int
        
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
        var_3_658 = and:int(ldc:int(-1175385265), ldc:int(329754574))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u839e\ud158\u527a\u385b\u16f6[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(2)), ldc:int(0))) {
            var_3_658 = and:int(var_3_658:int, ldc:int(-67688449))
            var_5_80 = and:int(ldc:int(24597), ldc:int(-24598))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-6806), ldc:int(6677)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_658:int, ldc:int(498941775))
                    var_9_C7 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_87:int, and:int(ldc:int(21), ldc:int(27201)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(8225), ldc:int(281)))), var_7_96:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_658 = and:int(var_3_D9:int, ldc:int(-704936098))
                    var_14_114 = var_7_96:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(805), ldc:int(27713)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_87:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(32)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1185714181))
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0819)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(551978553))
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(128)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1615020162))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0582)
                            }
                            
                            goto(Label_0819)
                        }
                    }
                    
                    Label_0390:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(16)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(576979035))
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-3298756))
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(64)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1905871537))
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(269824880))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-2026842223))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0819)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(302919607))
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(512)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(1667655091))
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(901256174))
                        var_11_EA = and:int(ldc:int(-11266), ldc:int(11265))
                        goto(Label_1492)
                    }
                    
                    Label_0582:
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1431803689))
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-643252460))
                        goto(Label_0819)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-995940748))
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(-106092577))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0819)
                        }
                    }
                    
                    Label_0697:
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1012317768))
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(569901298))
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(249528172))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1713371170))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0819:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(707270689))
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1012394485))
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(445811951))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(34602908))
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(2140480862))
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(1002291167))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_EA = and:int(ldc:int(233), ldc:int(28933))
                                goto(Label_1103)
                            }
                        }
                    }
                    
                    Label_0953:
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(256)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1866603441))
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1619629742))
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-830636728))
                            goto(Label_0819)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(968378319))
                        var_11_EA = and:int(ldc:int(-25371), ldc:int(25362))
                    }
                    
                    Label_1103:
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1600016035))
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(64)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-625299377))
                            goto(Label_0953)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0819)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(128)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(362528018))
                            goto(Label_0390)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(512)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(524985004))
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(502524783))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1357)
                            }
                        }
                    }
                    
                    Label_1223:
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-504296480))
                            goto(Label_1103)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(-1670994896))
                            goto(Label_0953)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0819)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0697)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0582)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(1538211910))
                            goto(Label_0390)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_658:int, ldc:int(16)), ldc:int(0))) {
                            var_3_658 = and:int(var_3_658:int, ldc:int(152328495))
                            loopcontinue()
                        }
                        
                        var_3_658 = and:int(var_3_658:int, ldc:int(1374611310))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_80:int, var_16_118:int)
                        goto(Label_1492)
                    }
                    
                    Label_1357:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(285053455))
                        goto(Label_1503)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1223)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(935547486))
                        goto(Label_0819)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0697)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1973686428))
                        goto(Label_0582)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1907478317))
                        goto(Label_0390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_658 = and:int(var_3_658:int, ldc:int(-638386209))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1492:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_663 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1503:
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1357)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1581006048))
                        goto(Label_1223)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(1668780242))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(973616051))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0819)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1541590933))
                        goto(Label_0697)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_658:int, ldc:int(128)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(-1411631560))
                        goto(Label_0582)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0390)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_658 = and:int(var_3_658:int, ldc:int(968313854))
                        var_17_663 = add:int(var_16_118:int, and:int(ldc:int(4417), ldc:int(16903)))
                        looporswitchbreak()
                    }
                }
                
                var_3_658 = and:int(var_3_658:int, ldc:int(901181406))
                
                if (cmple:boolean(var_5_80 = var_17_663:int, sub:int(var_6_87:int, and:int(ldc:int(17477), ldc:int(35))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_658:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_658 = and:int(var_3_658:int, ldc:int(1421028037))
            goto(Label_0108)
        }
    }
}
