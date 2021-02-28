public abstract class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\uc7fe\u71f1\u6c52\u946b\u64ab {
    public abstract boolean \u67d0\u5db4\ud4fe\u6cfe\u960f\u8350(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, boolean p1);
    
    public abstract \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 \u12cb\u64ab\u3d4b\u97b7\uc84e\u3e2a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1);
    
    public abstract boolean \u8709\ubded\u4ab3\ud36e\u946b\u12b2(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0);
    
    public void \uc7fe\u71f1\u6c52\u946b\u64ab(\u51fa\u12cb\u7330\u74b1\u6c52.\u6198\u8df4\u647c\u47c2\u98a4<?> p0, int p1, \ub113\ufcaf\u3c25\u071d\u97b7.\u0b8e\ud4fe\uc229\u92ee\ud4fe p2, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ufe34\u1187\u5fe1\ud217\ub1b9\u839e p3) {
        var_7_F0 : int
        var_8_11D : int
        var_7_10D : int
        
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
            invokespecial:\ub1b9\u62da\u9af2\u92ee\u64f2(\ub1b9\u62da\u9af2\u92ee\u64f2::<init>, this:\uc7fe\u71f1\u6c52\u946b\u64ab, p0:\u6198\u8df4\u647c\u47c2\u98a4<?>, p1:int)
            putfield:\u62da\uc87f\u67e9\u6c56\u4c2b(\uc7fe\u71f1\u6c52\u946b\u64ab::\u3a62\uceb8\ub32d\u7873\u4c2b\u92ff, this:\uc7fe\u71f1\u6c52\u946b\u64ab, initobject:\u62da\uc87f\u67e9\u6c56\u4c2b(\u62da\uc87f\u67e9\u6c56\u4c2b::<init>))
            putfield:\ua61f\uae87\u6b5f\uc31c\ud12e(\uc7fe\u71f1\u6c52\u946b\u64ab::\u6fb0\u8df4\u3a62\u67d0\u965f\u69d9, this:\uc7fe\u71f1\u6c52\u946b\u64ab, initobject:\u6c56\ucb79\u9a18\u51fa\u69d9[expected:\ua61f\uae87\u6b5f\uc31c\ud12e](\u6c56\ucb79\u9a18\u51fa\u69d9::<init>, this:\uc7fe\u71f1\u6c52\u946b\u64ab, xor:int(ldc:int(-31703), ldc:int(-31701))))
            putfield:\ufe34\u1187\u5fe1\ud217\ub1b9\u839e(\uc7fe\u71f1\u6c52\u946b\u64ab::\uc238\u1187\ub8be\u4492\uafe7\u7e3f, this:\uc7fe\u71f1\u6c52\u946b\u64ab, p3:\ufe34\u1187\u5fe1\ud217\ub1b9\u839e)
            putfield:\ua3b4\u8aa5\ub113\ubf56\u873d(\uc7fe\u71f1\u6c52\u946b\u64ab::\u392e\u3e2a\u5f50\u4179\ub1b9\ud51e, this:\uc7fe\u71f1\u6c52\u946b\u64ab, getfield:\ua3b4\u8aa5\ub113\ubf56\u873d(\u0b8e\ud4fe\uc229\u92ee\ud4fe::\u3bd6\u983f\uf9c5\u5db4\u3711\u600f, p2:\u0b8e\ud4fe\uc229\u92ee\ud4fe))
            invokevirtual:\u92ff\ubded\u0c95\u446c\u67d0(\ub1b9\u62da\u9af2\u92ee\u64f2::\u92ff\u72f1\u7873\u64ab\u67d0\u1187, this:\uc7fe\u71f1\u6c52\u946b\u64ab[expected:\ub1b9\u62da\u9af2\u92ee\u64f2], initobject:\u92ff\ubded\u0c95\u446c\u67d0(\u92ff\ubded\u0c95\u446c\u67d0::<init>, getfield:\ua61f\uae87\u6b5f\uc31c\ud12e(\uc7fe\u71f1\u6c52\u946b\u64ab::\u6fb0\u8df4\u3a62\u67d0\u965f\u69d9, this:\uc7fe\u71f1\u6c52\u946b\u64ab), and:int(ldc:int(6677), ldc:int(-6678)), ldc:int(27), ldc:int(47)))
            invokevirtual:\u92ff\ubded\u0c95\u446c\u67d0(\ub1b9\u62da\u9af2\u92ee\u64f2::\u92ff\u72f1\u7873\u64ab\u67d0\u1187, this:\uc7fe\u71f1\u6c52\u946b\u64ab[expected:\ub1b9\u62da\u9af2\u92ee\u64f2], initobject:\u92ff\ubded\u0c95\u446c\u67d0(\u92ff\ubded\u0c95\u446c\u67d0::<init>, getfield:\ua61f\uae87\u6b5f\uc31c\ud12e(\uc7fe\u71f1\u6c52\u946b\u64ab::\u6fb0\u8df4\u3a62\u67d0\u965f\u69d9, this:\uc7fe\u71f1\u6c52\u946b\u64ab), and:int(ldc:int(10249), ldc:int(5139)), ldc:int(76), ldc:int(47)))
            invokevirtual:\u92ff\ubded\u0c95\u446c\u67d0(\ub1b9\u62da\u9af2\u92ee\u64f2::\u92ff\u72f1\u7873\u64ab\u67d0\u1187, this:\uc7fe\u71f1\u6c52\u946b\u64ab[expected:\ub1b9\u62da\u9af2\u92ee\u64f2], initobject:\u9937\u3d64\u8bb0\u3d4b\uc84e[expected:\u92ff\ubded\u0c95\u446c\u67d0](\u9937\u3d64\u8bb0\u3d4b\uc84e::<init>, this:\uc7fe\u71f1\u6c52\u946b\u64ab, getfield:\u62da\uc87f\u67e9\u6c56\u4c2b[expected:\ua61f\uae87\u6b5f\uc31c\ud12e](\uc7fe\u71f1\u6c52\u946b\u64ab::\u3a62\uceb8\ub32d\u7873\u4c2b\u92ff, this:\uc7fe\u71f1\u6c52\u946b\u64ab), and:int(ldc:int(7), ldc:int(10754)), xor:int(ldc:int(10), ldc:int(140)), ldc:int(47)))
            var_7_F0 = and:int(ldc:int(-28863), ldc:int(24604))
            
            while (cmplt:boolean(var_7_F0:int, and:int(ldc:int(39), ldc:int(29971)))) {
                var_8_11D = and:int(ldc:int(12348), ldc:int(-16381))
                
                while (cmplt:boolean(var_8_11D:int, ldc:int(9))) {
                    invokevirtual:\u92ff\ubded\u0c95\u446c\u67d0(\ub1b9\u62da\u9af2\u92ee\u64f2::\u92ff\u72f1\u7873\u64ab\u67d0\u1187, this:\uc7fe\u71f1\u6c52\u946b\u64ab[expected:\ub1b9\u62da\u9af2\u92ee\u64f2], initobject:\u92ff\ubded\u0c95\u446c\u67d0(\u92ff\ubded\u0c95\u446c\u67d0::<init>, p2:\u0b8e\ud4fe\uc229\u92ee\ud4fe[expected:\ua61f\uae87\u6b5f\uc31c\ud12e], add:int(add:int(var_8_11D:int, mul:int(var_7_F0:int, ldc:int(9))), ldc:int(9)), add:int(ldc:int(8), mul:int(var_8_11D:int, ldc:int(18))), add:int(ldc:int(84), mul:int(var_7_F0:int, ldc:int(18)))))
                    inc:int(var_8_11D, ldc:int(1))
                }
                
                inc:int(var_7_F0, ldc:int(1))
            }
            
            var_7_10D = and:int(ldc:int(-12856), ldc:int(12817))
            
            while (cmplt:boolean(var_7_10D:int, ldc:int(9))) {
                invokevirtual:\u92ff\ubded\u0c95\u446c\u67d0(\ub1b9\u62da\u9af2\u92ee\u64f2::\u92ff\u72f1\u7873\u64ab\u67d0\u1187, this:\uc7fe\u71f1\u6c52\u946b\u64ab[expected:\ub1b9\u62da\u9af2\u92ee\u64f2], initobject:\u92ff\ubded\u0c95\u446c\u67d0(\u92ff\ubded\u0c95\u446c\u67d0::<init>, p2:\u0b8e\ud4fe\uc229\u92ee\ud4fe[expected:\ua61f\uae87\u6b5f\uc31c\ud12e], var_7_10D:int, add:int(ldc:int(8), mul:int(var_7_10D:int, ldc:int(18))), and:int(ldc:int(5582), ldc:int(18574))))
                inc:int(var_7_10D, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract void \uae87\uafe7\u99f7\ub6ab\u3504\u4f4a();
    
    public void \u5d20\u983f\u4975\u7330\u3a62\u8709(\u5d20\u7043\u88c5\u5db4\uf94d.\ua61f\uae87\u6b5f\uc31c\ud12e p0) {
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
            invokespecial:void(\ub1b9\u62da\u9af2\u92ee\u64f2::\u5d20\u983f\u4975\u7330\u3a62\u8709, this:\uc7fe\u71f1\u6c52\u946b\u64ab[expected:\ub1b9\u62da\u9af2\u92ee\u64f2], p0:\ua61f\uae87\u6b5f\uc31c\ud12e)
            
            if (cmpeq:boolean(p0:\ua61f\uae87\u6b5f\uc31c\ud12e, getfield:\ua61f\uae87\u6b5f\uc31c\ud12e(\uc7fe\u71f1\u6c52\u946b\u64ab::\u6fb0\u8df4\u3a62\u67d0\u965f\u69d9, this:\uc7fe\u71f1\u6c52\u946b\u64ab))) {
                invokevirtual:void(\uc7fe\u71f1\u6c52\u946b\u64ab::\uae87\uafe7\u99f7\ub6ab\u3504\u4f4a, this:\uc7fe\u71f1\u6c52\u946b\u64ab)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc238\ua068\u4c2b\u9937\u600f\uc238(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0) {
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
    
    public boolean \ubefe\ube23\uf995\ubb2b\ucfaf\u97b7(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0) {
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
    
    public boolean \u7043\u647c\ub19c\ub8be\u5fe1\uc229(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(28866), ldc:int(-30919)))
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 \u7330\u92ff\u071d\u1833\u7873\uc238(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, int p1) {
        var_3_331 : int
        var_5_63 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        var_6_72 : \u92ff\ubded\u0c95\u446c\u67d0
        var_7_99 : \u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56
        stack_34D_0 : int [generated]
        var_3_34C : int
        var_3_3E6 : int
        
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
            var_3_331 = and:int(ldc:int(-1468791616), ldc:int(-873489187))
            var_5_63 = getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2)
            var_6_72 = checkcast:\u92ff\ubded\u0c95\u446c\u67d0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u92ff\ubded\u0c95\u446c\u67d0.class, invokeinterface:\u92ff\ubded\u0c95\u446c\u67d0(List<\u92ff\ubded\u0c95\u446c\u67d0>::get, getfield:List<\u92ff\ubded\u0c95\u446c\u67d0>(\uc7fe\u71f1\u6c52\u946b\u64ab::\u99f7\u4ab3\u0c95\ub113\u4f52\ub32d, this:\uc7fe\u71f1\u6c52\u946b\u64ab), p1:int))
            
            if (cmpne:boolean(var_6_72:\u92ff\ubded\u0c95\u446c\u67d0, aconstnull:\u92ff\ubded\u0c95\u446c\u67d0())) {
                if (invokevirtual:boolean(\u92ff\ubded\u0c95\u446c\u67d0::\u3bd6\u873d\u98a4\ub70c\u34df\u7873, var_6_72:\u92ff\ubded\u0c95\u446c\u67d0)) {
                    var_7_99 = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u92ff\ubded\u0c95\u446c\u67d0::\ub102\u7af6\uc9f6\u8709\u6198\u946b, var_6_72:\u92ff\ubded\u0c95\u446c\u67d0)
                    var_5_63 = invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\ud36e\u51b2\uf94d\uf995\ub32d\ubff1, var_7_99:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                    
                    if (cmpeq:boolean(p1:int, and:int(ldc:int(650), ldc:int(24578)))) {
                        if (invokevirtual:boolean(\ub1b9\u62da\u9af2\u92ee\u64f2::\u6cfe\ubf56\u4c2b\u8cae\u960f\u8753, this:\uc7fe\u71f1\u6c52\u946b\u64ab[expected:\ub1b9\u62da\u9af2\u92ee\u64f2], var_7_99:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, xor:int(ldc:int(648), ldc:int(651)), ldc:int(39), and:int[expected:boolean](ldc:int(5155), ldc:int(5)))) {
                            goto(Label_0563)
                        }
                        
                        return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2))
                    }
                    
                    Label_0173:
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(1048434201))
                        goto(Label_0915)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(1)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(1228342232))
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(1278652854))
                        goto(Label_0563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(1)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(1406902434))
                        goto(Label_0455)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(16)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(-2085626806))
                        goto(Label_0368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(256)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(898236246))
                    }
                    else {
                        var_3_331 = and:int(var_3_331:int, ldc:int(-1703121504))
                        
                        if (cmpne:boolean(p1:int, ldc:int(0))) {
                            if (cmpne:boolean(p1:int, xor:int(ldc:int(-32704), ldc:int(-32703)))) {
                                if (cmplt:boolean(p1:int, xor:int(ldc:int(1536), ldc:int(1539)))) {
                                    goto(Label_0368)
                                }
                                
                                if (cmpge:boolean(p1:int, ldc:int(39))) {
                                    goto(Label_0368)
                                }
                                
                                if (logicalnot:boolean(invokevirtual:boolean(\uc7fe\u71f1\u6c52\u946b\u64ab::\u7043\u647c\ub19c\ub8be\u5fe1\uc229, this:\uc7fe\u71f1\u6c52\u946b\u64ab, var_5_63:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                                    goto(Label_0724)
                                }
                                
                                stack_34D_0 = xor:int(ldc:int(16433), ldc:int(16432))
                                goto(Label_0839)
                            }
                        }
                    }
                    
                    Label_0272:
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_331:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(-1542084770))
                        goto(Label_0724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_331:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(16)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(-1142679197))
                        goto(Label_0455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_331:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_331:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_331 = and:int(var_3_331:int, ldc:int(139147014))
                            goto(Label_0173)
                        }
                        
                        var_3_331 = and:int(var_3_331:int, ldc:int(-1141978651))
                        
                        if (logicalnot:boolean(invokevirtual:boolean(\ub1b9\u62da\u9af2\u92ee\u64f2::\u6cfe\ubf56\u4c2b\u8cae\u960f\u8753, this:\uc7fe\u71f1\u6c52\u946b\u64ab[expected:\ub1b9\u62da\u9af2\u92ee\u64f2], var_7_99:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, and:int(ldc:int(12303), ldc:int(2291)), ldc:int(39), and:int[expected:boolean](ldc:int(-13204), ldc:int(13187))))) {
                            return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2))
                        }
                    }
                    
                    Label_0368:
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(2)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(-946074554))
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_331:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(-269512748))
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0563)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_331:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_331:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_331 = and:int(var_3_331:int, ldc:int(-1796841285))
                            goto(Label_0272)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_331:int, ldc:int(128)), ldc:int(0))) {
                            var_3_331 = and:int(var_3_331:int, ldc:int(-322246609))
                            goto(Label_0173)
                        }
                        
                        var_3_331 = and:int(var_3_331:int, ldc:int(-312157279))
                        
                        if (invokevirtual:boolean(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u69d9\ub8be\u3a62\ud171\u64f2\ua562, var_7_99:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)) {
                            invokevirtual:void(\u92ff\ubded\u0c95\u446c\u67d0::\u5db4\u4c04\ub83f\u8df4\uf94d\u6fb0, var_6_72:\u92ff\ubded\u0c95\u446c\u67d0, getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2))
                            goto(Label_0915)
                        }
                    }
                    
                    Label_0455:
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(2083145301))
                        goto(Label_0915)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_331:int, ldc:int(128)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(-1279340920))
                        goto(Label_0724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_331:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_331:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_331 = and:int(var_3_331:int, ldc:int(531602089))
                            goto(Label_0368)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_331:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0272)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_331:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_331 = and:int(var_3_331:int, ldc:int(-1729867123))
                            invokevirtual:void(\u92ff\ubded\u0c95\u446c\u67d0::\u4c04\u960f\uae5d\uc87f\u2dcc\ud36e, var_6_72:\u92ff\ubded\u0c95\u446c\u67d0)
                            goto(Label_0915)
                        }
                        
                        goto(Label_0173)
                    }
                    
                    Label_0563:
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(-684090853))
                        goto(Label_0915)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(8)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(-254884489))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_331:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0455)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_331:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0368)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_331:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_331 = and:int(var_3_331:int, ldc:int(-203664036))
                            goto(Label_0272)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_331:int, ldc:int(256)), ldc:int(0))) {
                            var_3_331 = and:int(var_3_331:int, ldc:int(-1116220463))
                            invokevirtual:void(\u92ff\ubded\u0c95\u446c\u67d0::\u3e2a\u5db4\uc2bd\u6cfe\u6b5f\u8640, var_6_72:\u92ff\ubded\u0c95\u446c\u67d0, var_7_99:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, var_5_63:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                            goto(Label_0368)
                        }
                        
                        goto(Label_0173)
                    }
                    
                    Label_0724:
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0915)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(2140614834))
                        goto(Label_0563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(-1775789092))
                        goto(Label_0455)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(1249152627))
                        goto(Label_0368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(1)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(-1479079591))
                        goto(Label_0272)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(-1648491056))
                        goto(Label_0173)
                    }
                    
                    var_3_331 = and:int(var_3_331:int, ldc:int(-76571242))
                    stack_34D_0 = and:int(ldc:int(16794), ldc:int(-29084))
                    Label_0839:
                    var_3_34C = and:int(var_3_331:int, ldc:int(-545297465))
                    
                    if (invokevirtual:boolean(\ub1b9\u62da\u9af2\u92ee\u64f2::\u6cfe\ubf56\u4c2b\u8cae\u960f\u8753, this:\uc7fe\u71f1\u6c52\u946b\u64ab[expected:\ub1b9\u62da\u9af2\u92ee\u64f2], var_7_99:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56, stack_34D_0:int, and:int(ldc:int(11090), ldc:int(5130)), and:int[expected:boolean](ldc:int(-20388), ldc:int(20131)))) {
                        var_3_331 = and:int(var_3_34C:int, ldc:int(-647682315))
                        goto(Label_0368)
                    }
                    
                    return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2))
                    Label_0915:
                    
                    if (cmpeq:boolean(and:int(var_3_331:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(91153142))
                        goto(Label_0563)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(-826491905))
                        goto(Label_0455)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_331:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0368)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_331:int, ldc:int(2)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(1305172944))
                        goto(Label_0272)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_331:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_331 = and:int(var_3_331:int, ldc:int(-1355214095))
                        goto(Label_0173)
                    }
                    
                    var_3_3E6 = and:int(var_3_331:int, ldc:int(-865779218))
                    
                    if (cmpeq:boolean(invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, var_7_99:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56), invokevirtual:int(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u927d\ufcaf\ub8be\u6bb9\u74b1\u3e75, var_5_63:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56))) {
                        return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(getstatic:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u9033\uff55\u52d3\u8709\uae87\uc4d2))
                    }
                    
                    var_3_331 = and:int(var_3_3E6:int, ldc:int(-1091184457))
                    invokevirtual:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u92ff\ubded\u0c95\u446c\u67d0::\u8df4\ud51e\uc2bd\u72f1\ub171\uf995, var_6_72:\u92ff\ubded\u0c95\u446c\u67d0, p0:\ua3b4\u8aa5\ub113\ubf56\u873d, var_7_99:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
                }
            }
            
            return:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(var_5_63:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56)
        }
        
        goto(Label_0006)
    }
    
    private java.lang.Boolean lambda$\u718f\u4d85\u67d0\u946b\u3c25\u8aa5$1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
        var_4_C0 : int
        stack_ED_0 : int [generated]
        
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
            var_4_C0 = and:int(ldc:int(-1861257639), ldc:int(-380645695))
            
            if (invokevirtual:boolean(\uc7fe\u71f1\u6c52\u946b\u64ab::\u8709\ubded\u4ab3\ud36e\u946b\u12b2, this:\uc7fe\u71f1\u6c52\u946b\u64ab, invokevirtual:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\uc238\uc31c\ua61f\u92ee\u51b2\u527a, p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                do {
                    if (cmpne:boolean(and:int(var_4_C0:int, ldc:int(256)), ldc:int(0))) {
                        var_4_C0 = and:int(var_4_C0:int, ldc:int(939632568))
                    }
                    else {
                        var_4_C0 = and:int(var_4_C0:int, ldc:int(-1960947983))
                        
                        if (cmpgt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, p0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f], add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u8aa5\u97b7\u4daf\u72f1\u600f\u8cae, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5)), add:double(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u3e75\uc29a\u071d\u4d85\ubded\ub70c, p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df])), ldc:double(0.5))), ldc:double(64.0))) {
                            loopcontinue()
                        }
                        
                        stack_ED_0 = and:int(ldc:int(16865), ldc:int(6157))
                        return:Boolean(invokestatic:Boolean(Boolean::valueOf, stack_ED_0:boolean[expected:int]))
                    }
                } while (cmpne:boolean(and:int(var_4_C0:int, ldc:int(256)), ldc:int(0)))
                
                var_4_C0 = and:int(var_4_C0:int, ldc:int(-336180105))
                stack_ED_0 = and:int[expected:boolean](ldc:int(1877), ldc:int(-1880))
            }
            else {
                stack_ED_0 = and:int[expected:boolean](ldc:int(-27819), ldc:int(27818))
            }
            
            return:Boolean(invokestatic:Boolean(Boolean::valueOf, stack_ED_0:boolean[expected:int]))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uafe7\u960f\u69d9\u7006\u34df\ud158$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, \u56bd\u8413\u647c\u5bc4\ud158.\uf9c5\ud158\u4975\uf94d\ud523\uc31c p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
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
            invokevirtual:void(\ub1b9\u62da\u9af2\u92ee\u64f2::\ud217\u7e3f\u494c\uc229\ua068\u8aa5, this:\uc7fe\u71f1\u6c52\u946b\u64ab[expected:\ub1b9\u62da\u9af2\u92ee\u64f2], p0:\ua3b4\u8aa5\ub113\ubf56\u873d, p1:\uf9c5\ud158\u4975\uf94d\ud523\uc31c, getfield:\ua61f\uae87\u6b5f\uc31c\ud12e(\uc7fe\u71f1\u6c52\u946b\u64ab::\u6fb0\u8df4\u3a62\u67d0\u965f\u69d9, this:\uc7fe\u71f1\u6c52\u946b\u64ab))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uf995\u960f\ub70c\u8709\u64ab\u56bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_636 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_C6 : double
        var_3_D8 : int
        var_11_E9 : int
        var_14_113 : double
        var_16_117 : int
        var_12_10F : double
        var_17_641 : int
        
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
        var_3_636 = and:int(ldc:int(915036542), ldc:int(-470312081))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uc7fe\u71f1\u6c52\u946b\u64ab[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(512)), ldc:int(0))) {
            var_3_636 = and:int(var_3_636:int, ldc:int(1610441421))
        }
        else {
            var_3_636 = and:int(var_3_636:int, ldc:int(1949817311))
            var_5_89 = and:int(ldc:int(-27238), ldc:int(27233))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(31252), ldc:int(-31253)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C6 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D8 = and:int(var_3_636:int, ldc:int(985573830))
                    var_9_C6 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E9 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E9:int, sub:int(var_6_90:int, xor:int(ldc:int(6), ldc:int(7)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E9:int, and:int(ldc:int(113), ldc:int(1295)))), var_7_9F:double))) {
                        inc:int(var_11_E9, ldc:int(1))
                    }
                    
                    var_3_636 = and:int(var_3_D8:int, ldc:int(-1546712722))
                    var_14_113 = var_7_9F:double
                    var_16_117 = var_11_E9:int
                }
                else {
                    var_11_E9 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), and:int(ldc:int(47), ldc:int(17)))
                    var_12_10F = var_14_113 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_117 = var_11_E9:int, var_6_90:int)) {
                        var_9_C6 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E9:int)
                        var_16_117 = var_11_E9:int
                        var_14_113 = var_12_10F:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(698815192))
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(472008288))
                    }
                    else {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-466629681))
                        
                        if (cmplt:boolean(var_16_117:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0572)
                            }
                            
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0385:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1802211314))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(262019482))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(190139971))
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-178914160))
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-426651922))
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-242527180))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(100577750))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(1899891190))
                        var_11_E9 = and:int(ldc:int(23896), ldc:int(-23929))
                        goto(Label_1472)
                    }
                    
                    Label_0572:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1229315928))
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1549893222))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(128)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-156626481))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1350876765))
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(564583391))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_113 = var_9_C6:double
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0694:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1107462910))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-618835239))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1705644471))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(693328222))
                        var_14_113 = mul:double(ldc:double(0.5), add:double(var_9_C6:double, var_14_113:double))
                    }
                    
                    Label_0815:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1307339138))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1345534633))
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-2110608746))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(512)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1648296558))
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1936112917))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-65634986))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_E9 = and:int(ldc:int(2581), ldc:int(323))
                                goto(Label_1108)
                            }
                        }
                    }
                    
                    Label_0943:
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-2120606339))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-913618296))
                            goto(Label_0815)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1412474537))
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(83241957))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1122084401))
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1295378049))
                        var_11_E9 = and:int(ldc:int(-22142), ldc:int(22076))
                    }
                    
                    Label_1108:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(256)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1544821304))
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(128)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-1299780005))
                        goto(Label_1348)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0943)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(1471044030))
                            goto(Label_0815)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(512)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1060960361))
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_636 = and:int(var_3_636:int, ldc:int(750516551))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                                goto(Label_1348)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(847991035))
                        goto(Label_1483)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1108)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0943)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0815)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0694)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-996169557))
                            goto(Label_0572)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1829085517))
                            goto(Label_0385)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_636 = and:int(var_3_636:int, ldc:int(-1234800674))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_113:double, var_5_89:int, var_16_117:int)
                            goto(Label_1472)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1348:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1483)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(64)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1296416997))
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1291753944))
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0385)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(128)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-797390424))
                        loopcontinue()
                    }
                    
                    var_3_636 = and:int(var_3_636:int, ldc:int(-99882538))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_113:double, ldc:double(0.0))
                    Label_1472:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_641 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_E9:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1483:
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1418504746))
                        goto(Label_1348)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(808844161))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0943)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0694)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_636:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1192795765))
                        goto(Label_0572)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(-416095174))
                        goto(Label_0385)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_636:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_636 = and:int(var_3_636:int, ldc:int(1916964846))
                        var_17_641 = add:int(var_16_117:int, xor:int(ldc:int(9856), ldc:int(9857)))
                        looporswitchbreak()
                    }
                }
                
                var_3_636 = and:int(var_3_636:int, ldc:int(-1197474489))
                
                if (cmple:boolean(var_5_89 = var_17_641:int, sub:int(var_6_90:int, xor:int(ldc:int(8388), ldc:int(8389))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_636:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
