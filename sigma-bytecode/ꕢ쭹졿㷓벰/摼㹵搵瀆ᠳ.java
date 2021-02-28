public class \ua562\ucb79\uc87f\u3dd3\ubcb0.\u647c\u3e75\u6435\u7006\u1833 {
    public void \u647c\u3e75\u6435\u7006\u1833(long p0, int p1, \ub113\ufcaf\u3c25\u071d\u97b7.\u8cae\u71ae\u2dcc\u5db4\u4f52 p2, java.lang.Runnable p3) {
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
            invokespecial:\u99f7\u7006\u6198\u47c2\ub1b9\u12cb(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::<init>, this:\u647c\u3e75\u6435\u7006\u1833)
            putfield:List<\u527a\ucfaf\u34df\u4e72\u5fe1\u873d>(\u647c\u3e75\u6435\u7006\u1833::\uc246\u34df\u983f\uafe7\u8aa5\ubf56, this:\u647c\u3e75\u6435\u7006\u1833, invokestatic:ArrayList[expected:List<\u527a\ucfaf\u34df\u4e72\u5fe1\u873d>](Lists::newArrayList))
            putfield:int(\u647c\u3e75\u6435\u7006\u1833::\u7006\ub70c\ua068\u62da\u6c52\u8d98, this:\u647c\u3e75\u6435\u7006\u1833, ldc:int(-1))
            putfield:\u8cae\u71ae\u2dcc\u5db4\u4f52(\u647c\u3e75\u6435\u7006\u1833::\uf995\u6c52\u6d99\u9a18\u40a9, this:\u647c\u3e75\u6435\u7006\u1833, p2:\u8cae\u71ae\u2dcc\u5db4\u4f52)
            putfield:long(\u647c\u3e75\u6435\u7006\u1833::\u7873\u6d69\u8753\u52d3\uc229, this:\u647c\u3e75\u6435\u7006\u1833, p0:long)
            putfield:int(\u647c\u3e75\u6435\u7006\u1833::\uc229\uceb8\u8389\u7330\u8640, this:\u647c\u3e75\u6435\u7006\u1833, p1:int)
            putfield:Runnable(\u647c\u3e75\u6435\u7006\u1833::\u2dcc\u34df\ubf56\u8413\ube23\u718f, this:\u647c\u3e75\u6435\u7006\u1833, p3:Runnable)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u7bad\uc4d2\u3d64\u4e72\u8d90\u51fa() {
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
            invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u7bad\ub171\u61a4\ubff1\u6d69\u6cfe, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u647c\u3e75\u6435\u7006\u1833::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u647c\u3e75\u6435\u7006\u1833)), and:int[expected:boolean](ldc:int(-25151), ldc:int(25150)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ud217\uc31c\uc246\u3d4b\u494c\u6ec6() {
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
            
            if (cmpne:boolean(getfield:int(\u647c\u3e75\u6435\u7006\u1833::\u7006\ub70c\ua068\u62da\u6c52\u8d98, this:\u647c\u3e75\u6435\u7006\u1833), ldc:int(-1))) {
                if (logicalnot:boolean(invokevirtual:boolean(\u527a\ucfaf\u34df\u4e72\u5fe1\u873d::\ub7dc\u960f\u7d52\u71ae\u718f\ud523, checkcast:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d(\u51fa\u12cb\u7330\u74b1\u6c52.\u527a\ucfaf\u34df\u4e72\u5fe1\u873d.class, invokeinterface:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d(List<\u527a\ucfaf\u34df\u4e72\u5fe1\u873d>::get, getfield:List<\u527a\ucfaf\u34df\u4e72\u5fe1\u873d>(\u647c\u3e75\u6435\u7006\u1833::\uc246\u34df\u983f\uafe7\u8aa5\ubf56, this:\u647c\u3e75\u6435\u7006\u1833), getfield:int(\u647c\u3e75\u6435\u7006\u1833::\u7006\ub70c\ua068\u62da\u6c52\u8d98, this:\u647c\u3e75\u6435\u7006\u1833)))))) {
                    invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u647c\u3e75\u6435\u7006\u1833::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u647c\u3e75\u6435\u7006\u1833), initobject:\uae87\u4492\u5db4\u0b8e\u4c04[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\uae87\u4492\u5db4\u0b8e\u4c04::<init>, getfield:long(\u647c\u3e75\u6435\u7006\u1833::\u7873\u6d69\u8753\u52d3\uc229, this:\u647c\u3e75\u6435\u7006\u1833), getfield:int(\u647c\u3e75\u6435\u7006\u1833::\uc229\uceb8\u8389\u7330\u8640, this:\u647c\u3e75\u6435\u7006\u1833), getfield:\u8cae\u71ae\u2dcc\u5db4\u4f52(\u647c\u3e75\u6435\u7006\u1833::\uf995\u6c52\u6d99\u9a18\u40a9, this:\u647c\u3e75\u6435\u7006\u1833), checkcast:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d(\u51fa\u12cb\u7330\u74b1\u6c52.\u527a\ucfaf\u34df\u4e72\u5fe1\u873d.class, invokeinterface:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d(List<\u527a\ucfaf\u34df\u4e72\u5fe1\u873d>::get, getfield:List<\u527a\ucfaf\u34df\u4e72\u5fe1\u873d>(\u647c\u3e75\u6435\u7006\u1833::\uc246\u34df\u983f\uafe7\u8aa5\ubf56, this:\u647c\u3e75\u6435\u7006\u1833), getfield:int(\u647c\u3e75\u6435\u7006\u1833::\u7006\ub70c\ua068\u62da\u6c52\u8d98, this:\u647c\u3e75\u6435\u7006\u1833))), getfield:Runnable(\u647c\u3e75\u6435\u7006\u1833::\u2dcc\u34df\ubf56\u8413\ube23\u718f, this:\u647c\u3e75\u6435\u7006\u1833)))
                }
            }
            
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
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u647c\u3e75\u6435\u7006\u1833[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokevirtual:void(\uae87\ua3b4\u88c5\u8413\u7d52\u647c<E>::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, getfield:\ud158\ucef1\u600f\u8cae\u3dd3[expected:\uae87\ua3b4\u88c5\u8413\u7d52\u647c<\u61a4\u2dcc\u71ae\u8640\u8753>](\u647c\u3e75\u6435\u7006\u1833::\ud51e\u4bc8\uafe7\u3dd3\uc2e8\u98a4, this:\u647c\u3e75\u6435\u7006\u1833), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            invokevirtual:void(\u6c56\u647c\u97b7\u6d99\u5654\u385b::\u071d\ub8be\u1833\u120d\u3e75\u56bd, getfield:\u6c56\u647c\u97b7\u6d99\u5654\u385b(\u647c\u3e75\u6435\u7006\u1833::\uc7fe\u446c\u4daf\u8bb0\u8308\u1833, this:\u647c\u3e75\u6435\u7006\u1833), this:\u647c\u3e75\u6435\u7006\u1833[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokevirtual:void(\u6c56\u647c\u97b7\u6d99\u5654\u385b::\u071d\ub8be\u1833\u120d\u3e75\u56bd, getfield:\u6c56\u647c\u97b7\u6d99\u5654\u385b(\u647c\u3e75\u6435\u7006\u1833::\uc4d2\uc246\u64ab\u5f50\u6cfe\ua61f, this:\u647c\u3e75\u6435\u7006\u1833), this:\u647c\u3e75\u6435\u7006\u1833[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            
            if (cmpne:boolean(getfield:\u6c56\u647c\u97b7\u6d99\u5654\u385b(\u647c\u3e75\u6435\u7006\u1833::\ud217\u416d\u67e9\u16f6\ua61f\u3d4b, this:\u647c\u3e75\u6435\u7006\u1833), aconstnull:\u6c56\u647c\u97b7\u6d99\u5654\u385b())) {
                invokevirtual:void(\u6c56\u647c\u97b7\u6d99\u5654\u385b::\u071d\ub8be\u1833\u120d\u3e75\u56bd, getfield:\u6c56\u647c\u97b7\u6d99\u5654\u385b(\u647c\u3e75\u6435\u7006\u1833::\ud217\u416d\u67e9\u16f6\ua61f\u3d4b, this:\u647c\u3e75\u6435\u7006\u1833), this:\u647c\u3e75\u6435\u7006\u1833[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            }
            
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u647c\u3e75\u6435\u7006\u1833[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
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
        
        if (cmpne:boolean(p0:int, xor:int(ldc:int(420), ldc:int(164)))) {
            return:boolean(invokespecial:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\u647c\u3e75\u6435\u7006\u1833[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:int, p1:int, p2:int))
        }
        
        invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u647c\u3e75\u6435\u7006\u1833::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u647c\u3e75\u6435\u7006\u1833), getfield:\u8cae\u71ae\u2dcc\u5db4\u4f52[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u647c\u3e75\u6435\u7006\u1833::\uf995\u6c52\u6d99\u9a18\u40a9, this:\u647c\u3e75\u6435\u7006\u1833))
        return:boolean(xor:int[expected:boolean](ldc:int(18504), ldc:int(18505)))
    }
    
    private static net.minecraft.util.text.ITextComponent \u927d\u3dd3\u4d85\u7049\u51b2\ubefe(\u51fa\u12cb\u7330\u74b1\u6c52.\u527a\ucfaf\u34df\u4e72\u5fe1\u873d p0) {
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
            return:ITextComponent(invokevirtual:ITextComponent(\uf94d\u51b2\u1833\u34df\u1187::\u8258\u1187\u600f\u8aa5\ucb79\u6435, invokevirtual:\uf94d\u51b2\u1833\u34df\u1187(\u527a\ucfaf\u34df\u4e72\u5fe1\u873d::\u4e72\ucef1\u960f\ubefe\u59ec\u0800, p0:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.String \ub171\ub19c\u624e\u494c\u3e2a\u7006(\u51fa\u12cb\u7330\u74b1\u6c52.\u527a\ucfaf\u34df\u4e72\u5fe1\u873d p0) {
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
            return:String(invokevirtual:String(DateFormat::format, getstatic:DateFormat(\u647c\u3e75\u6435\u7006\u1833::\u4f52\u5654\ud36e\ubb2b\u446c), initobject:Date(Date::<init>, invokevirtual:long(\u527a\ucfaf\u34df\u4e72\u5fe1\u873d::\u47c2\ua3b4\u99f7\u4179\ud217\u0800, p0:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d))))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u8d98\u6198\u446c\u7049\u4f4a\u4cd9$2(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u647c\u3e75\u6435\u7006\u1833::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u647c\u3e75\u6435\u7006\u1833), getfield:\u8cae\u71ae\u2dcc\u5db4\u4f52[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006](\u647c\u3e75\u6435\u7006\u1833::\uf995\u6c52\u6d99\u9a18\u40a9, this:\u647c\u3e75\u6435\u7006\u1833))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4daf\u8aa5\ub171\u2dcc\u1187\u3776$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\u647c\u3e75\u6435\u7006\u1833::\ud217\uc31c\uc246\u3d4b\u494c\u6ec6, this:\u647c\u3e75\u6435\u7006\u1833)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u7bad\u3d4b\ub171\u983f\ud217\u8d90$0(\u51fa\u12cb\u7330\u74b1\u6c52.\u527a\ucfaf\u34df\u4e72\u5fe1\u873d p0, \u51fa\u12cb\u7330\u74b1\u6c52.\u527a\ucfaf\u34df\u4e72\u5fe1\u873d p1) {
        var_2_61 : int
        var_2_A6 : int
        stack_CF_0 : int [generated]
        
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
        var_2_61 = and:int(ldc:int(-909445523), ldc:int(-1227170050))
        
        if (cmpge:boolean(invokevirtual:long(\u527a\ucfaf\u34df\u4e72\u5fe1\u873d::\u47c2\ua3b4\u99f7\u4179\ud217\u0800, p0:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d), invokevirtual:long(\u527a\ucfaf\u34df\u4e72\u5fe1\u873d::\u47c2\ua3b4\u99f7\u4179\ud217\u0800, p1:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d))) {
            loop {
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_A6 = and:int(var_2_61:int, ldc:int(1016873537))
                }
                else {
                    var_2_A6 = and:int(var_2_61:int, ldc:int(-402667844))
                    
                    if (cmpgt:boolean(invokevirtual:long(\u527a\ucfaf\u34df\u4e72\u5fe1\u873d::\u47c2\ua3b4\u99f7\u4179\ud217\u0800, p0:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d), invokevirtual:long(\u527a\ucfaf\u34df\u4e72\u5fe1\u873d::\u47c2\ua3b4\u99f7\u4179\ud217\u0800, p1:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d))) {
                        stack_CF_0 = ldc:int(-1)
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_A6:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_A6 = and:int(var_2_A6:int, ldc:int(1845382077))
                    stack_CF_0 = invokevirtual:int(String::compareTo, invokevirtual:String(\u527a\ucfaf\u34df\u4e72\u5fe1\u873d::\u8c8a\u7330\ud7e8\u72f1\u946b\u760c, p0:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d), invokevirtual:String(\u527a\ucfaf\u34df\u4e72\u5fe1\u873d::\u8c8a\u7330\ud7e8\u72f1\u946b\u760c, p1:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d))
                    looporswitchbreak()
                }
                
                var_2_61 = and:int(var_2_A6:int, ldc:int(1464416847))
            }
            
            return:int(stack_CF_0:int)
        }
        
        return:int(xor:int(ldc:int(-32760), ldc:int(-32759)))
    }
    
    public static java.lang.String \u76bc\ubded\u527a\u6198\u4bc8\ua562(\u51fa\u12cb\u7330\u74b1\u6c52.\u527a\ucfaf\u34df\u4e72\u5fe1\u873d p0) {
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
            return:String(invokestatic:String(\u647c\u3e75\u6435\u7006\u1833::\ub171\ub19c\u624e\u494c\u3e2a\u7006, p0:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d))
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.ITextComponent \u98a4\uc87f\u12cb\u3bc9\u6d99\u8413() {
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
            return:ITextComponent(getstatic:ITextComponent(\u647c\u3e75\u6435\u7006\u1833::\u71f1\ub32d\ub6ab\u71ae\ua61f))
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.ITextComponent \u67d0\u5245\ub70c\u4ab3\u51b2\ua068() {
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
            return:ITextComponent(getstatic:ITextComponent(\u647c\u3e75\u6435\u7006\u1833::\u760c\u8df4\u960f\u3bc9\ud158))
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.ITextComponent \ubff1\u071d\ud523\u7049\ubb2b\uf9c5(\u51fa\u12cb\u7330\u74b1\u6c52.\u527a\ucfaf\u34df\u4e72\u5fe1\u873d p0) {
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
            return:ITextComponent(invokestatic:ITextComponent(\u647c\u3e75\u6435\u7006\u1833::\u927d\u3dd3\u4d85\u7049\u51b2\ubefe, p0:\u527a\ucfaf\u34df\u4e72\u5fe1\u873d))
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.ITextComponent \u74b1\u8bb0\ub32d\u8709\uc4d2\uc246() {
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
            return:ITextComponent(getstatic:ITextComponent(\u647c\u3e75\u6435\u7006\u1833::\u8cae\ubff1\u93a2\u7049\u516c))
        }
        
        goto(Label_0006)
    }
    
    public static java.util.List \u3e2a\uae5d\u1187\u34df\u92ee\u6cfe(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u647c\u3e75\u6435\u7006\u1833 p0) {
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
            return:List(getfield:List<\u527a\ucfaf\u34df\u4e72\u5fe1\u873d>(\u647c\u3e75\u6435\u7006\u1833::\uc246\u34df\u983f\uafe7\u8aa5\ubf56, p0:\u647c\u3e75\u6435\u7006\u1833))
        }
        
        goto(Label_0006)
    }
    
    public static \ua562\ucb79\uc87f\u3dd3\ubcb0.\ud158\ucef1\u600f\u8cae\u3dd3 \u6ec6\u8640\u5654\ub1b9\u446c\ua61f(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u647c\u3e75\u6435\u7006\u1833 p0) {
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
            return:\ud158\ucef1\u600f\u8cae\u3dd3(getfield:\ud158\ucef1\u600f\u8cae\u3dd3(\u647c\u3e75\u6435\u7006\u1833::\ud51e\u4bc8\uafe7\u3dd3\uc2e8\u98a4, p0:\u647c\u3e75\u6435\u7006\u1833))
        }
        
        goto(Label_0006)
    }
    
    public static net.minecraft.util.text.ITextComponent \u416d\ub32d\ua61f\u5f50\u3711\u6198() {
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
            return:ITextComponent(getstatic:ITextComponent(\u647c\u3e75\u6435\u7006\u1833::\ud7e8\u6198\ub83f\u983f\u6198))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 \u965f\u6435\u3e75\u9937\u7006\u4179(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u647c\u3e75\u6435\u7006\u1833 p0) {
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
            return:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u647c\u3e75\u6435\u7006\u1833::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, p0:\u647c\u3e75\u6435\u7006\u1833))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 \u64f2\u7c6b\u4daf\u965f\u51fa\ud171(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u647c\u3e75\u6435\u7006\u1833 p0) {
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
            return:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u647c\u3e75\u6435\u7006\u1833::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, p0:\u647c\u3e75\u6435\u7006\u1833))
        }
        
        goto(Label_0006)
    }
    
    public static \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 \u8d90\ua562\u4d85\ub19c\u873d\u4975(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u647c\u3e75\u6435\u7006\u1833 p0) {
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
            return:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u647c\u3e75\u6435\u7006\u1833::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, p0:\u647c\u3e75\u6435\u7006\u1833))
        }
        
        goto(Label_0006)
    }
    
    public static int \u4cd9\uff55\u624e\u5140\u183a\u34df(int p0) {
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
    
    public static int \ub70c\u839e\u416d\u5fe1\ub8be\u6c52(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u647c\u3e75\u6435\u7006\u1833 p0, int p1) {
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
            return:int(putfield:int(\u647c\u3e75\u6435\u7006\u1833::\u7006\ub70c\ua068\u62da\u6c52\u8d98, p0:\u647c\u3e75\u6435\u7006\u1833, p1:int))
        }
        
        goto(Label_0006)
    }
    
    public static \u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d \u93a2\u0b8e\u7bad\u9255\u983f\ubded(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u647c\u3e75\u6435\u7006\u1833 p0) {
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
            return:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u647c\u3e75\u6435\u7006\u1833::\u5bc4\u2dcc\u7049\u3504\u56bd, p0:\u647c\u3e75\u6435\u7006\u1833))
        }
        
        goto(Label_0006)
    }
    
    public static int \u8cae\u3d4b\u759a\ua61f\u6d99\ud217(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u647c\u3e75\u6435\u7006\u1833 p0) {
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
            return:int(getfield:int(\u647c\u3e75\u6435\u7006\u1833::\u7006\ub70c\ua068\u62da\u6c52\u8d98, p0:\u647c\u3e75\u6435\u7006\u1833))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_301 : int
        expr_6E : int [generated]
        stack_AC_0 : byte[] [generated]
        stack_AE_0 : byte[] [generated]
        stack_DA_0 : byte[] [generated]
        stack_DC_0 : byte[] [generated]
        stack_112_0 : byte[] [generated]
        stack_114_0 : byte[] [generated]
        stack_14A_0 : byte[] [generated]
        stack_31B_0 : byte[] [generated]
        stack_393_0 : byte[] [generated]
        stack_428_0 : byte[] [generated]
        stack_463_0 : byte[] [generated]
        var_4_2ED : int
        var_3_2F2 : byte[]
        var_5_2F3 : int
        expr_31E : byte [generated]
        var_0_389 : int
        expr_393 : byte [generated]
        stack_3D2_2 : byte [generated]
        stack_3AF_0 : byte [generated]
        expr_AE : int [generated]
        expr_DC : int [generated]
        var_2_112 : byte[]
        expr_116 : int [generated]
        var_3_451 : byte[]
        var_5_452 : int
        var_3_156 : String
        expr_15E : String[] [generated]
        expr_168 : String[] [generated]
        var_3_284 : String[]
        
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
        var_0_301 = and:int(ldc:int(-627793177), ldc:int(-1913539714))
        expr_6E = arraylength:int(stack_AC_0 = stack_AE_0 = stack_DA_0 = stack_DC_0 = stack_112_0 = stack_114_0 = stack_14A_0 = stack_31B_0 = stack_393_0 = stack_428_0 = stack_463_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("xOlz4YRz/l9zc2OQdQ7rhGGagNx1b1NhnOOYiuWEAlFldYx5nI78e3tXfQl/iIp97FnhZ4CQmvyO621fdWfyYYb3noyKfexZ4XdrmH3sdZJdin1z45SMin3sWeGAYYB57nUNjoqYYezncWF1f/5hdfOcjIp97FnhgGGAee51DY6KmGHs54J7aZD8eW1xaW1v+ZiMin3sWeGAYYB57nUNjoqYYezngmWCjOxxYWtjfXddf5qGXSNha2d9BpCMeYxZXXNdf5qGXSNha3WY6JKCe2mOfV1/aWd1XX+ahl0jgmOGgOyXe2t9gkI=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2ED = expr_6E:int
        var_3_2F2 = newarray:byte[](byte.class, expr_6E:int)
        var_5_2F3 = expr_6E:int
        Label_0757:
        
        while (cmpeq:boolean(and:int(var_0_301:int, ldc:int(2048)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_301:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0867)
            }
            
            var_0_301 = and:int(var_0_301:int, ldc:int(456178431))
            var_5_2F3 = add:int(var_5_2F3:int, ldc:int(-1))
            expr_31E = xor:byte(loadelement:byte(stack_31B_0:byte[], var_5_2F3:int), ldc:byte(115))
            storeelement:byte(var_3_2F2:byte[], var_5_2F3:int, or:int(and:int(shl:int(expr_31E:byte, and:int(ldc:int(13892), ldc:int(29))), ldc:int(-16)), and:int(shr:int(expr_31E:byte[expected:int], xor:int(ldc:int(17698), ldc:int(17702))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_2F3:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AE_0 = stack_AC_0 = stack_DA_0 = stack_DC_0 = stack_112_0 = stack_114_0 = stack_14A_0 = stack_31B_0 = stack_393_0 = stack_428_0 = stack_463_0 = var_3_2F2:byte[]
            goto(Label_0115)
        }
        
        var_0_301 = and:int(var_0_301:int, ldc:int(320533113))
        goto(Label_1016)
        Label_0867:
        
        while (cmpeq:boolean(and:int(var_0_301:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_301:int, ldc:int(536870912)), ldc:int(0))) {
                var_0_301 = and:int(var_0_301:int, ldc:int(-1072132444))
                goto(Label_0757)
            }
            
            var_0_389 = and:int(var_0_301:int, ldc:int(902159074))
            var_5_2F3 = add:int(var_5_2F3:int, ldc:int(-1))
            expr_393 = stack_3D2_2 = loadelement(stack_393_0, var_5_2F3)
            
            if (cmplt:boolean(add:int(add:int(var_5_2F3:int, ldc:int(5)), neg:int(var_4_2ED:int)), ldc:int(0))) {
                stack_3D2_2 = stack_3AF_0 = add:byte(expr_393:byte, loadelement:byte(var_3_2F2:byte[], add:int(var_5_2F3:int, ldc:int(5))))
                goto(Label_0959)
            }
            
            Label_0928:
            
            if (cmpne:boolean(and:int(var_0_389:int, ldc:int(2)), ldc:int(0))) {
                var_0_389 = and:int(var_0_389:int, ldc:int(97117938))
                stack_3D2_2 = stack_3AF_0 = add:byte(expr_393:byte, ldc:byte(5))
            }
            
            Label_0959:
            
            if (cmpeq:boolean(and:int(var_0_389:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0928)
            }
            
            var_0_301 = and:int(var_0_389:int, ldc:int(-971055245))
            storeelement:byte(var_3_2F2:byte[], var_5_2F3:int, stack_3D2_2:byte)
            
            if (cmpne:boolean(var_5_2F3:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AE_0 = stack_AC_0 = stack_DA_0 = stack_DC_0 = stack_112_0 = stack_114_0 = stack_14A_0 = stack_31B_0 = stack_393_0 = stack_428_0 = stack_463_0 = var_3_2F2:byte[]
            goto(Label_0179)
        }
        
        var_0_301 = and:int(var_0_301:int, ldc:int(1333930950))
        Label_1016:
        
        while (cmpne:boolean(and:int(var_0_301:int, ldc:int(32)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_301:int, ldc:int(2)), ldc:int(0))) {
                var_0_301 = and:int(var_0_301:int, ldc:int(-1325733482))
                goto(Label_0757)
            }
            
            var_0_301 = and:int(var_0_301:int, ldc:int(601544634))
            var_5_2F3 = add:int(var_5_2F3:int, ldc:int(-1))
            storeelement:byte(var_3_2F2:byte[], var_5_2F3:int, add:byte(loadelement:byte(stack_428_0:byte[], var_5_2F3:int), ldc:byte(104)))
            
            if (cmpne:boolean(var_5_2F3:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_AE_0 = stack_AC_0 = stack_DA_0 = stack_DC_0 = stack_112_0 = stack_114_0 = stack_14A_0 = stack_31B_0 = stack_393_0 = stack_428_0 = stack_463_0 = var_3_2F2:byte[]
            goto(Label_0225)
        }
        
        var_0_301 = and:int(var_0_301:int, ldc:int(949200930))
        goto(Label_0867)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_301:int, ldc:int(512)), ldc:int(0))) {
            var_0_301 = and:int(var_0_301:int, ldc:int(162046275))
            goto(Label_0283)
        }
        
        if (cmpne:boolean(and:int(var_0_301:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_301 = and:int(var_0_301:int, ldc:int(-1469430227))
            goto(Label_0225)
        }
        
        if (cmpne:boolean(and:int(var_0_301:int, ldc:int(131072)), ldc:int(0))) {
            var_0_301 = and:int(var_0_301:int, ldc:int(-1415469357))
        }
        else {
            var_0_301 = and:int(var_0_301:int, ldc:int(783479738))
            expr_AE = arraylength:int(stack_AE_0:byte[])
            
            if (cmpne:boolean(expr_AE:int, ldc:int(0))) {
                var_4_2ED = expr_AE:int
                var_3_2F2 = newarray:byte[](byte.class, expr_AE:int)
                var_5_2F3 = expr_AE:int
                goto(Label_0867)
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_0_301:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0283)
        }
        
        if (cmpne:boolean(and:int(var_0_301:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_301 = and:int(var_0_301:int, ldc:int(414827323))
        }
        else {
            if (cmpne:boolean(and:int(var_0_301:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_301 = and:int(var_0_301:int, ldc:int(-95713433))
            expr_DC = arraylength:int(stack_DC_0:byte[])
            
            if (cmpne:boolean(expr_DC:int, ldc:int(0))) {
                var_4_2ED = expr_DC:int
                var_3_2F2 = newarray:byte[](byte.class, expr_DC:int)
                var_5_2F3 = expr_DC:int
                goto(Label_1016)
            }
        }
        
        Label_0225:
        
        if (cmpeq:boolean(and:int(var_0_301:int, ldc:int(32)), ldc:int(0))) {
            var_0_301 = and:int(var_0_301:int, ldc:int(-1390905755))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_301:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0179)
            }
            
            if (cmpeq:boolean(and:int(var_0_301:int, ldc:int(32)), ldc:int(0))) {
                var_0_301 = and:int(var_0_301:int, ldc:int(-2075255103))
                goto(Label_0115)
            }
            
            var_0_301 = and:int(var_0_301:int, ldc:int(-905268697))
            var_2_112 = stack_112_0:byte[]
            expr_116 = add:int(arraylength:int(stack_114_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_116:int, ldc:int(0))) {
                var_3_451 = newarray:byte[](byte.class, expr_116:int)
                var_5_452 = expr_116:int
                
                loop {
                    var_0_301 = and:int(var_0_301:int, ldc:int(-1889689050))
                    var_5_452 = add:int(var_5_452:int, ldc:int(-1))
                    storeelement:byte(var_3_451:byte[], var_5_452:int, add:int(shl:int(loadelement:byte(stack_463_0:byte[], var_5_452:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_112:byte[], add:int(var_5_452:int, xor:int(ldc:int(8496), ldc:int(8497)))), ldc:int(5)), xor:int(ldc:int(15), ldc:int(8)))))
                    
                    if (cmpne:boolean(var_5_452:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_AE_0 = stack_AC_0 = stack_DA_0 = stack_DC_0 = stack_112_0 = stack_114_0 = stack_14A_0 = stack_31B_0 = stack_393_0 = stack_428_0 = stack_463_0 = var_3_451:byte[]
            }
        }
        
        Label_0283:
        
        if (cmpne:boolean(and:int(var_0_301:int, ldc:int(536870912)), ldc:int(0))) {
            var_0_301 = and:int(var_0_301:int, ldc:int(1405216129))
            goto(Label_0225)
        }
        
        if (cmpeq:boolean(and:int(var_0_301:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0179)
        }
        
        if (cmpne:boolean(and:int(var_0_301:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_301 = and:int(var_0_301:int, ldc:int(-340963925))
            goto(Label_0115)
        }
        
        var_3_156 = initobject:String(String::<init>, stack_14A_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        expr_15E = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16650), ldc:int(554)))
        expr_168 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16523), ldc:int(8734)))
        storeelement:String(expr_168:String[], and:int(ldc:int(-30469), ldc:int(30468)), invokevirtual:String[expected:String](String::substring, var_3_156:String, and:int(ldc:int(-27080), ldc:int(18695)), and:int(ldc:int(89), ldc:int(16920))))
        storeelement:String(expr_168:String[], xor:int(ldc:int(-28542), ldc:int(-28541)), invokevirtual:String[expected:String](String::substring, var_3_156:String, xor:int(ldc:int(284), ldc:int(260)), xor:int(ldc:int(1283), ldc:int(1326))))
        storeelement:String(expr_168:String[], and:int(ldc:int(6178), ldc:int(1603)), invokevirtual:String[expected:String](String::substring, var_3_156:String, and:int(ldc:int(6333), ldc:int(25199)), xor:int(ldc:int(12882), ldc:int(12817))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(18), ldc:int(26)), invokevirtual:String[expected:String](String::substring, var_3_156:String, and:int(ldc:int(75), ldc:int(4291)), xor:int(ldc:int(2984), ldc:int(3070))))
        storeelement:String(expr_168:String[], xor:int(ldc:int(11264), ldc:int(11269)), invokevirtual:String[expected:String](String::substring, var_3_156:String, xor:int(ldc:int(16396), ldc:int(16474)), and:int(ldc:int(16755), ldc:int(6902))))
        storeelement:String(expr_168:String[], and:int(ldc:int(2949), ldc:int(9220)), invokevirtual:String[expected:String](String::substring, var_3_156:String, xor:int(ldc:int(-28602), ldc:int(-28620)), xor:int(ldc:int(10269), ldc:int(10383))))
        storeelement:String(expr_168:String[], and:int(ldc:int(12867), ldc:int(135)), invokevirtual:String[expected:String](String::substring, var_3_156:String, xor:int(ldc:int(2240), ldc:int(2130)), xor:int(ldc:int(16457), ldc:int(16614))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(-31612), ldc:int(-31603)), invokevirtual:String[expected:String](String::substring, var_3_156:String, and:int(ldc:int(17135), ldc:int(5311)), and:int(ldc:int(8385), ldc:int(4065))))
        storeelement:String(expr_15E:String[], and:int(ldc:int(18439), ldc:int(343)), invokevirtual:String[expected:String](String::substring, var_3_156:String, xor:int(ldc:int(24691), ldc:int(24754)), xor:int(ldc:int(-32672), ldc:int(-32585))))
        storeelement:String(expr_15E:String[], xor:int(ldc:int(2196), ldc:int(2194)), invokevirtual:String[expected:String](String::substring, var_3_156:String, xor:int(ldc:int(4270), ldc:int(4217)), xor:int(ldc:int(2117), ldc:int(2221))))
        putstatic:String[](\u647c\u3e75\u6435\u7006\u1833::\u67d0\uc29a\u7c6b\u0800\ub70c, expr_168:String[])
        var_3_284 = expr_15E:String[]
        putstatic:Logger(\u647c\u3e75\u6435\u7006\u1833::\u7006\u7049\ub70c\u74b1\ud217, invokestatic:Logger(LogManager::getLogger))
        putstatic:ITextComponent(\u647c\u3e75\u6435\u7006\u1833::\ud7e8\u6198\ub83f\u983f\u6198, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_284:String[], xor:int(ldc:int(4873), ldc:int(4879)))))
        putstatic:ITextComponent(\u647c\u3e75\u6435\u7006\u1833::\u71f1\ub32d\ub6ab\u71ae\ua61f, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_284:String[], xor:int(ldc:int(-30710), ldc:int(-30707)))))
        putstatic:ITextComponent(\u647c\u3e75\u6435\u7006\u1833::\u760c\u8df4\u960f\u3bc9\ud158, invokevirtual:IFormattableTextComponent(IFormattableTextComponent::mergeStyle, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_284:String[], and:int(ldc:int(809), ldc:int(16472)))), getstatic:TextFormatting(TextFormatting::DARK_RED)))
        putstatic:ITextComponent(\u647c\u3e75\u6435\u7006\u1833::\u8cae\ubff1\u93a2\u7049\u516c, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_284:String[], xor:int(ldc:int(554), ldc:int(547)))))
        putstatic:DateFormat(\u647c\u3e75\u6435\u7006\u1833::\u4f52\u5654\ud36e\ubb2b\u446c, initobject:SimpleDateFormat[expected:DateFormat](SimpleDateFormat::<init>))
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64A : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_655 : int
        
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
        var_3_64A = and:int(ldc:int(198687544), ldc:int(-1690655012))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u647c\u3e75\u6435\u7006\u1833[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_64A = and:int(var_3_64A:int, ldc:int(1129386328))
        }
        else {
            var_3_64A = and:int(var_3_64A:int, ldc:int(-176770579))
            var_5_89 = and:int(ldc:int(25030), ldc:int(-26096))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10524), ldc:int(-14621)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_64A:int, ldc:int(1400857405))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, xor:int(ldc:int(-26616), ldc:int(-26615)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:int(16560), ldc:int(16561)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_64A = and:int(var_3_E2:int, ldc:int(1432256156))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(260), ldc:int(261)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1349)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-891463503))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1032999864))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(14354737))
                        goto(Label_0574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1858356001))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0574)
                            }
                            
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(214663859))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1349)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1343849379))
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(653623558))
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1462230690))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(107320833))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1416383025))
                            var_11_F3 = and:int(ldc:int(-20981), ldc:int(20948))
                            goto(Label_1490)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0574:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1447989751))
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1349)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1600908532))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(373691761))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(25711671))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-875366806))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0822)
                        }
                    }
                    
                    Label_0693:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1812596151))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1349)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(2050317123))
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1467260602))
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(1764724153))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1822756562))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0822:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-2124870447))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1872270509))
                        goto(Label_1349)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-390891271))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1108)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(759331787))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(475449676))
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1733721886))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = xor:int(ldc:int(22592), ldc:int(22593))
                                goto(Label_1108)
                            }
                        }
                    }
                    
                    Label_0953:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1777205538))
                        goto(Label_1349)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(85156073))
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1040360814))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(677076678))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1068660447))
                        var_11_F3 = and:int(ldc:int(-18474), ldc:int(18473))
                    }
                    
                    Label_1108:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1349)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0953)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(993669783))
                            goto(Label_0822)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1286263294))
                            goto(Label_0693)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-2071998385))
                            goto(Label_0574)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1107641395))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1349)
                            }
                        }
                    }
                    
                    Label_1220:
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1584032720))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1108)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0953)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0822)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1802475776))
                            goto(Label_0693)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(161680060))
                            goto(Label_0574)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_64A = and:int(var_3_64A:int, ldc:int(-1625203829))
                            loopcontinue()
                        }
                        
                        var_3_64A = and:int(var_3_64A:int, ldc:int(188366585))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                        goto(Label_1490)
                    }
                    
                    Label_1349:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(768740164))
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-717087053))
                        goto(Label_0953)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(639305411))
                        goto(Label_0822)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-206751198))
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1247312025))
                        goto(Label_0574)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_64A = and:int(var_3_64A:int, ldc:int(-482444193))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1490:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_655 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1501:
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-1075425275))
                        goto(Label_1349)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1220)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(-883481255))
                        goto(Label_1108)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1233773512))
                        goto(Label_0953)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0822)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0693)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(1198699679))
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64A:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64A = and:int(var_3_64A:int, ldc:int(433207742))
                        var_17_655 = add:int(var_16_121:int, and:int(ldc:int(8689), ldc:int(4109)))
                        looporswitchbreak()
                    }
                }
                
                var_3_64A = and:int(var_3_64A:int, ldc:int(-1277512823))
                
                if (cmple:boolean(var_5_89 = var_17_655:int, sub:int(var_6_90:int, and:int(ldc:int(9477), ldc:int(97))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_64A:int, ldc:int(524288)), ldc:int(0))) {
            var_3_64A = and:int(var_3_64A:int, ldc:int(457182547))
            goto(Label_0108)
        }
    }
}
