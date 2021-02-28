public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u7043\u446c\u76bc\u92ff\u7d52 {
    public void \u7043\u446c\u76bc\u92ff\u7d52() {
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
    
    public void \ub6ab\ube23\uae87\uc84e\u1833() {
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
            putfield:double(\u7043\u446c\u76bc\u92ff\u7d52::\ube23\u93a2\uc246\uae87\ua61f, this:\u7043\u446c\u76bc\u92ff\u7d52, ldc:double(0.0))
            putfield:\u8d98\ua068\u4492\u9af2\u5f50(\u7043\u446c\u76bc\u92ff\u7d52::\u34df\uc4d2\u759a\u3bd6\u7049, this:\u7043\u446c\u76bc\u92ff\u7d52, initobject:\u8d98\ua068\u4492\u9af2\u5f50(\u8d98\ua068\u4492\u9af2\u5f50::<init>, and:int(ldc:int(6124), ldc:int(9192)), ldc:int(100000), getstatic:\u3711\u71f1\u7006\u92ee\ucef1(\u3711\u71f1\u7006\u92ee\ucef1::\uf9c5\u5140\ud158\u4492\u3dd3)))
            putfield:float(\u7043\u446c\u76bc\u92ff\u7d52::\u156b\uc2bd\u4179\u600f\u9255, this:\u7043\u446c\u76bc\u92ff\u7d52, invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u9255\uae87\u7330\u8308\u88c5\u965f, getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u7d52\u8709\ubefe\u7af6\u0b8e\ua61f, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)))))
            putfield:float(\u7043\u446c\u76bc\u92ff\u7d52::\u156b\uc2bd\u4179\u600f\u9255, this:\u7043\u446c\u76bc\u92ff\u7d52, ldc:float(39.0f))
            putfield:float(\u7043\u446c\u76bc\u92ff\u7d52::\u6d69\ua6bd\u718f\uae87\u5f50, this:\u7043\u446c\u76bc\u92ff\u7d52, getfield:float(\uf995\u72f1\u8389\ucb79\ub6ab\u8d98::\u4d85\u71ae\u494c\u839e\uf9c5\u93a2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b))))
            invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)))
            invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)))
            invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)))
            putfield:boolean(\u7043\u446c\u76bc\u92ff\u7d52::\ud171\u4daf\u6bb9\u8d98\u8bb0, this:\u7043\u446c\u76bc\u92ff\u7d52, and:int[expected:boolean](ldc:int(15104), ldc:int(-15137)))
            putfield:double(\u7043\u446c\u76bc\u92ff\u7d52::\u120d\ud7e8\u12b2\u97b7\uc3e3, this:\u7043\u446c\u76bc\u92ff\u7d52, ldc:double(0.0))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ufe34\u6bb9\u392e\u7043\u67d0() {
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
            putfield:float(\u4c04\uae87\u56bd\u4c2b\u97e6\u7049::\u3d4b\u5140\ub8be\uae87\u1833\u4c2b, getfield:\u4c04\uae87\u56bd\u4c2b\u97e6\u7049(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u839e\u6b0d\uceb8\u8aa5\u98a4\ub32d, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)), ldc:float(1.0f))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7e3f\uf94d\u446c\uc7fe\u7e3f(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ub83f\u36d3\u62da\u3a62\u8d90 p0) {
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
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u7043\u446c\u76bc\u92ff\u7d52[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            invokestatic:double(Math::sqrt, add:double(mul:double(invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\u9033\ud217\uae87\u1833\u3776, p0:\ub83f\u36d3\u62da\u3a62\u8d90), invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\u9033\ud217\uae87\u1833\u3776, p0:\ub83f\u36d3\u62da\u3a62\u8d90)), mul:double(invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\uae5d\uafe7\u8258\ucfaf\u8709, p0:\ub83f\u36d3\u62da\u3a62\u8d90), invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\uae5d\uafe7\u8258\ucfaf\u8709, p0:\ub83f\u36d3\u62da\u3a62\u8d90))))
            invokestatic:double(\u3bd6\u6d99\ub113\u4d85\u71f1::\u7c6b\u3504\ub171\u647c\u56bd, invokevirtual:double(\ub83f\u36d3\u62da\u3a62\u8d90::\u8350\ubcb0\u416d\ubf56\ua068, p0:\ub83f\u36d3\u62da\u3a62\u8d90))
        }
    }
    
    public void \u8c8a\u3c25\u600f\u61a4\u7873(\ub113\uc4d2\u183a\u527a\u6435.\u8df4\ubff1\u759a\u4c2b\u8308 p0) {
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
        
        if (logicaland:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u7043\u446c\u76bc\u92ff\u7d52[expected:\ud158\u839e\u7006\uc3e3\u446c]), invokevirtual:boolean(\u8df4\ubff1\u759a\u4c2b\u8308::\ua562\ud171\ud12e\u624e\u97b7, p0:\u8df4\ubff1\u759a\u4c2b\u8308))) {
            return:void()
        }
    }
    
    public void \u647c\u759a\uf995\u7bad\u9937(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u983f\u7ce1\uceb8\ubded\u3a62 p0) {
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
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u7043\u446c\u76bc\u92ff\u7d52[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            return:void()
        }
    }
    
    public void \u647c\u759a\uf995\u7bad\u9937(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u647c\u8389\u92ee\u9033\uc31c p0) {
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
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u7043\u446c\u76bc\u92ff\u7d52[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            return:void()
        }
    }
    
    public void \u647c\u759a\uf995\u7bad\u9937(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ufe34\u40a9\ub6ab\u5fe1\u7330 p0) {
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
    
    public void \u4179\ud36e\u4bc8\u446c\u3504(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ubcb0\u4ab3\u4c04\uae5d\uc238 p0) {
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
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u7043\u446c\u76bc\u92ff\u7d52[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            return:void()
        }
    }
    
    public void \u8c8a\u836c\u183a\u3e2a\u3c25(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u97b7\uc87f\u839e\u6d69\u5654 p0) {
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
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u7043\u446c\u76bc\u92ff\u7d52[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            return:void()
        }
    }
    
    public void \u4cd9\u74b1\u6fb0\u93a2\ufcaf(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\u9937\u416d\ub171\uae87\ub8be p0) {
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
    
    public void \u4cd9\u74b1\u6fb0\u93a2\ufcaf(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u5245\ufcaf\ufcaf\u8bb0\u8753 p0) {
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
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u7043\u446c\u76bc\u92ff\u7d52[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            return:void()
        }
    }
    
    public void \ud7e8\u3504\ubf56\u4bc8\ud4fe(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u51b2\u9033\ubff1\uf9c5\ufe34 p0) {
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
        
        if (logicaland:boolean(invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u7043\u446c\u76bc\u92ff\u7d52[expected:\ud158\u839e\u7006\uc3e3\u446c]), cmpeq:boolean(getfield:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ubefe\u0b8e\u56bd\u183a\ub1b9\ub19c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)), aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()))) {
            return:void()
        }
    }
    
    public void \uc87f\u88c5\ud7e8\ub8be\u3dd3(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ufe34\u40a9\ub6ab\u5fe1\u7330 p0) {
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
    
    public void \u6ec6\ud7e8\u7043\u9255\u0800(\u516c\u3d64\u718f\ub171\u6b5f.\u8389\u5654\u4179\ud523\u67e9 p0) {
        var_2_61 : int
        var_4_66 : \u946b\u6d99\u8df4\u12cb\u5d20
        var_5_CD7 : \u494c\uc238\u4179\u36d3\ub70c
        var_6_CE4 : \u7d52\u718f\u3776\u6fb0\ub83f
        stack_D0D_0 : String [generated]
        var_5_D2D : \u7c6b\ud7e8\u600f\u7330\u5fe1
        var_8_D35 : double
        stack_D62_0 : String [generated]
        var_5_D87 : \ub6ab\u5fe1\u6d69\u92ee\ubefe
        var_5_DC2 : \u8df4\ubefe\ubcb0\uc2bd\ua3b4
        var_5_E25 : \uc9f6\u34df\u5fe1\uf995\uf995
        var_5_E33 : \u3d64\ua3b4\ufcaf\u97b7\u7ce1
        var_5_E48 : \u6d69\u64ab\u9937\u59ec\uc87f
        
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
        var_2_61 = and:int(ldc:int(198043936), ldc:int(194892393))
        var_4_66 = invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20(\u8389\u5654\u4179\ud523\u67e9::\uc2bd\u93a2\u6cfe\u0800\u760c, p0:\u8389\u5654\u4179\ud523\u67e9)
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u7043\u446c\u76bc\u92ff\u7d52[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            if (cmpne:boolean(getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)), aconstnull:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98())) {
                goto(Label_0305)
            }
        }
        
        Label_0111:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1021350542))
            goto(Label_3072)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_2848)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_2669)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_2463)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_2266)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_2060)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_1872)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_1675)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-100327842))
            goto(Label_1478)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_1281)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_1066)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1071289153))
            goto(Label_0878)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1617268796))
            goto(Label_0681)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(847011809))
            goto(Label_0520)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        var_2_61 = and:int(var_2_61:int, ldc:int(-927880021))
        Label_0305:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_3072)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1380739912))
            goto(Label_2848)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1368379528))
            goto(Label_2669)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_2463)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_2266)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_2060)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(741884515))
            goto(Label_1872)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_1675)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(252415181))
            goto(Label_1478)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1290984152))
            goto(Label_1281)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-527991403))
            goto(Label_1066)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(808737051))
            goto(Label_0878)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_0681)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-748398782))
        }
        else {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-2094223590))
                goto(Label_0111)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-67765507))
            
            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u494c\uc238\u4179\u36d3\ub70c.class, var_4_66:\u946b\u6d99\u8df4\u12cb\u5d20)) {
                var_5_CD7 = checkcast:\u494c\uc238\u4179\u36d3\ub70c(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u494c\uc238\u4179\u36d3\ub70c.class, var_4_66:\u494c\uc238\u4179\u36d3\ub70c)
                var_6_CE4 = invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u494c\uc238\u4179\u36d3\ub70c::\ub8be\uc246\u3c25\u9255\u36d3\u4cd9, var_5_CD7:\u494c\uc238\u4179\u36d3\ub70c, getfield:\u16f6\u61a4\u5db4\u4c04\u64ab\u9255[expected:\uf9c5\ud158\u4975\uf94d\ud523\uc31c](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u946b\u98a4\u8709\u7043\ubf56\u5f50, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)))
                
                if (cmpne:boolean(var_6_CE4:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1538705449))
                    invokeinterface:String(ITextComponent::getString, invokevirtual:ITextComponent(\u7d52\u718f\u3776\u6fb0\ub83f::\uf94d\u7c6b\u92ff\u071d\u7e3f\u69d9, var_6_CE4:\u7d52\u718f\u3776\u6fb0\ub83f))
                }
                else {
                    stack_D0D_0 = loadelement:String(getstatic:String[](\u7043\u446c\u76bc\u92ff\u7d52::\u6cfe\u4f4a\u718f\u6b0d\u9af2), xor:int(ldc:int(16401), ldc:int(16415)))
                }
                
                if (cmpne:boolean(invokevirtual:\u4c2b\u7049\u120d\u4d85\u3711(\u494c\uc238\u4179\u36d3\ub70c::\uc84e\uf94d\u52d3\u92ee\ufe34\u3bd6, var_5_CD7:\u494c\uc238\u4179\u36d3\ub70c), getstatic:\u4c2b\u7049\u120d\u4d85\u3711(\u4c2b\u7049\u120d\u4d85\u3711::\ub70c\u8709\u88c5\uc229\u0800\uae87))) {
                }
                
                goto(Label_2848)
            }
        }
        
        Label_0520:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_3072)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_2848)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(763304598))
            goto(Label_2669)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_2463)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_2266)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_2060)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-754627486))
            goto(Label_1872)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1328921579))
            goto(Label_1675)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_1478)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_1281)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_1066)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_0878)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0305)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0111)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-807543957))
            
            if (instanceof:boolean(\u12b2\u7049\u8df4\uc9f6\uae87.\u7c6b\ud7e8\u600f\u7330\u5fe1.class, var_4_66:\u494c\uc238\u4179\u36d3\ub70c[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                var_5_D2D = checkcast:\u7c6b\ud7e8\u600f\u7330\u5fe1(\u12b2\u7049\u8df4\uc9f6\uae87.\u7c6b\ud7e8\u600f\u7330\u5fe1.class, var_4_66:\u7c6b\ud7e8\u600f\u7330\u5fe1)
                var_8_D35 = invokevirtual:double(\u7c6b\ud7e8\u600f\u7330\u5fe1::\uc3e3\u4c2b\u36d3\uc246\u647c\u7873, var_5_D2D:\u7c6b\ud7e8\u600f\u7330\u5fe1, ldc:double(0.0))
                
                if (logicalnot:boolean(invokevirtual:boolean(\u7c6b\ud7e8\u600f\u7330\u5fe1::\u6d99\ube23\u7bad\u839e\u8389\u4daf, var_5_D2D:\u7c6b\ud7e8\u600f\u7330\u5fe1))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1606280312))
                    stack_D62_0 = loadelement:String(getstatic:String[](\u7043\u446c\u76bc\u92ff\u7d52::\u6cfe\u4f4a\u718f\u6b0d\u9af2), and:int(ldc:int(23600), ldc:int(8978)))
                }
                else {
                    stack_D62_0 = loadelement:String(getstatic:String[](\u7043\u446c\u76bc\u92ff\u7d52::\u6cfe\u4f4a\u718f\u6b0d\u9af2), xor:int(ldc:int(3081), ldc:int(3078)))
                }
                
                invokestatic:void(\ub83f\u2dcc\u927d\u647c\u3dd3::\u0a06\uc7fe\uc238\ucb79\u8709, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), stack_D62_0:String), var_8_D35:double)))
                goto(Label_2848)
            }
        }
        
        Label_0681:
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_3072)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1877869044))
            goto(Label_2848)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_2669)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-2037371168))
            goto(Label_2463)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1026893673))
            goto(Label_2266)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_2060)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1264012862))
            goto(Label_1872)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_1675)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
            goto(Label_1478)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_1281)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-2014997607))
            goto(Label_1066)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(531005681))
                goto(Label_0520)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1624560344))
                goto(Label_0305)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0111)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-273824214))
            
            if (instanceof:boolean(\u494c\u4975\ua068\u0c95\uc84e.\ub6ab\u5fe1\u6d69\u92ee\ubefe.class, var_4_66:\u7c6b\ud7e8\u600f\u7330\u5fe1[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                var_5_D87 = checkcast:\ub6ab\u5fe1\u6d69\u92ee\ubefe(\u494c\u4975\ua068\u0c95\uc84e.\ub6ab\u5fe1\u6d69\u92ee\ubefe.class, var_4_66:\ub6ab\u5fe1\u6d69\u92ee\ubefe)
                goto(Label_2848)
            }
        }
        
        Label_0878:
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_3072)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
            goto(Label_2848)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1676339592))
            goto(Label_2669)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1893621052))
            goto(Label_2463)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_2266)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_2060)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(688126))
            goto(Label_1872)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-701673931))
            goto(Label_1675)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-490200092))
            goto(Label_1478)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-567761226))
            goto(Label_1281)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0681)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0520)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0305)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0111)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(198690923))
            
            if (instanceof:boolean(\ud36e\u6bb9\u960f\u4c04\u64ab.\u0a06\ub32d\uc84e\u6b5f\uc2e8.class, var_4_66:\ub6ab\u5fe1\u6d69\u92ee\ubefe[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                if (cmpne:boolean(invokevirtual:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u0a06\ub32d\uc84e\u6b5f\uc2e8::\uc3e3\uceb8\u4f52\u927d\ub1b9\u71ae, checkcast:\u0a06\ub32d\uc84e\u6b5f\uc2e8(\ud36e\u6bb9\u960f\u4c04\u64ab.\u0a06\ub32d\uc84e\u6b5f\uc2e8.class, var_4_66:\u0a06\ub32d\uc84e\u6b5f\uc2e8[expected:\u946b\u6d99\u8df4\u12cb\u5d20])), getstatic:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u34df\ub113\u6c56\u97e6\u51b2\u4c2b::\u6b0d\u97b7\u67e9\u416d\ub32d\u9af2))) {
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(-1342183556))
                goto(Label_2848)
            }
        }
        
        Label_1066:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_3072)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_2848)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1991145284))
            goto(Label_2669)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1919845883))
            goto(Label_2463)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(467499659))
            goto(Label_2266)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
            goto(Label_2060)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-847084034))
            goto(Label_1872)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-865719560))
            goto(Label_1675)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1493330933))
            goto(Label_1478)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1403296508))
                goto(Label_0878)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(2026562132))
                goto(Label_0681)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1981053507))
                goto(Label_0520)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0305)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0111)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(467660077))
            
            if (instanceof:boolean(\u36d3\u9033\u6b0d\u983f\u8d90.\ucef1\u51b2\u7330\uafe7\u3dd3.class, var_4_66:\u0a06\ub32d\uc84e\u6b5f\uc2e8[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                goto(Label_2848)
            }
        }
        
        Label_1281:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-884990427))
            goto(Label_3072)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_2848)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
            goto(Label_2669)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1082224226))
            goto(Label_2463)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-597612555))
            goto(Label_2266)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_2060)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1566877840))
            goto(Label_1872)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(929550465))
            goto(Label_1675)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1291092642))
        }
        else {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(242569532))
                goto(Label_1066)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0878)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0681)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0520)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_0305)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0111)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(1811799459))
            
            if (instanceof:boolean(\u494c\u4975\ua068\u0c95\uc84e.\u8df4\ubefe\ubcb0\uc2bd\ua3b4.class, var_4_66:\u0a06\ub32d\uc84e\u6b5f\uc2e8[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                var_5_DC2 = checkcast:\u8df4\ubefe\ubcb0\uc2bd\ua3b4(\u494c\u4975\ua068\u0c95\uc84e.\u8df4\ubefe\ubcb0\uc2bd\ua3b4.class, var_4_66:\u8df4\ubefe\ubcb0\uc2bd\ua3b4)
                goto(Label_2848)
            }
        }
        
        Label_1478:
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_3072)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1919570669))
            goto(Label_2848)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1144430002))
            goto(Label_2669)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1081856479))
            goto(Label_2463)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1694065319))
            goto(Label_2266)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1242403696))
            goto(Label_2060)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(2006662707))
            goto(Label_1872)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_1281)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_1066)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0878)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0681)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0520)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0305)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(359700121))
                goto(Label_0111)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(263505141))
            
            if (instanceof:boolean(\u5d20\u7043\u88c5\u5db4\uf94d.\ubded\u9255\u92ff\u5d20\u97b7.class, var_4_66:\u8df4\ubefe\ubcb0\uc2bd\ua3b4[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                if (cmpne:boolean(invokevirtual:\ub19c\uc229\u416d\ub18d\u7873(\ubded\u9255\u92ff\u5d20\u97b7::\ubded\u7ce1\u5fe1\uc246\ua562\u61a4, checkcast:\ubded\u9255\u92ff\u5d20\u97b7(\u5d20\u7043\u88c5\u5db4\uf94d.\ubded\u9255\u92ff\u5d20\u97b7.class, var_4_66:\ubded\u9255\u92ff\u5d20\u97b7[expected:\u946b\u6d99\u8df4\u12cb\u5d20])), getstatic:\ub19c\uc229\u416d\ub18d\u7873(\ub19c\uc229\u416d\ub18d\u7873::\u983f\uafe7\ufe34\u4975\ua6bd\uc31c))) {
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(1070062906))
                goto(Label_2848)
            }
        }
        
        Label_1675:
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_3072)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_2848)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-277870767))
            goto(Label_2669)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_2463)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_2266)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1075724526))
            goto(Label_2060)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1033514167))
                goto(Label_1478)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_1281)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_1066)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1225653006))
                goto(Label_0878)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0681)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1241451225))
                goto(Label_0520)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-882376847))
                goto(Label_0305)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(703417))
                goto(Label_0111)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(730331682))
            
            if (instanceof:boolean(\u3d64\u7af6\uae87\uc238\u7d52.\u8350\u3bc9\u7d52\u51b2\ub70c.class, var_4_66:\ubded\u9255\u92ff\u5d20\u97b7[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                goto(Label_2848)
            }
        }
        
        Label_1872:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(2026810556))
            goto(Label_3072)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_2848)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1399085893))
            goto(Label_2669)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-2113945162))
            goto(Label_2463)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_2266)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1028318225))
                goto(Label_1675)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                goto(Label_1478)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_1281)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_1066)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-439134223))
                goto(Label_0878)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0681)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0520)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0305)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-980505932))
                goto(Label_0111)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(198506912))
            
            if (instanceof:boolean(\u3504\ufe34\u600f\u6b0d\u69d9.\ud7e8\u836c\u61a4\uc9f6\ub83f.class, var_4_66:\ubded\u9255\u92ff\u5d20\u97b7[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                if (cmpne:boolean(invokevirtual:\ub113\uc2bd\uc84e\u6fb0\u8350(\ud7e8\u836c\u61a4\uc9f6\ub83f::\u5db4\u5f50\ub6ab\u156b\u98a4\u71f1, checkcast:\ud7e8\u836c\u61a4\uc9f6\ub83f(\u3504\ufe34\u600f\u6b0d\u69d9.\ud7e8\u836c\u61a4\uc9f6\ub83f.class, var_4_66:\ud7e8\u836c\u61a4\uc9f6\ub83f[expected:\u946b\u6d99\u8df4\u12cb\u5d20])), getstatic:\ub113\uc2bd\uc84e\u6fb0\u8350(\ub113\uc2bd\uc84e\u6fb0\u8350::\u6c52\u51b2\ubb2b\u0b8e\u3d4b\u6ec6))) {
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(1874322608))
                goto(Label_2848)
            }
        }
        
        Label_2060:
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_3072)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_2848)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-796887929))
            goto(Label_2669)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_2463)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1613252531))
        }
        else {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(331423833))
                goto(Label_1872)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(320467235))
                goto(Label_1675)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_1478)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(942745882))
                goto(Label_1281)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_1066)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1857315682))
                goto(Label_0878)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                goto(Label_0681)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-906114284))
                goto(Label_0520)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_0305)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1115414174))
                goto(Label_0111)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-1682113158))
            
            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\uc9f6\u34df\u5fe1\uf995\uf995.class, var_4_66:\ud7e8\u836c\u61a4\uc9f6\ub83f[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                var_5_E25 = initobject:\uc9f6\u34df\u5fe1\uf995\uf995(\uc9f6\u34df\u5fe1\uf995\uf995::<init>)
                goto(Label_2848)
            }
        }
        
        Label_2266:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
            goto(Label_3072)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
            goto(Label_2848)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            goto(Label_2669)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1244308458))
                goto(Label_2060)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_1872)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-2037638567))
                goto(Label_1675)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1999789718))
                goto(Label_1478)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(553815135))
                goto(Label_1281)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_1066)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-437494186))
                goto(Label_0878)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0681)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1940897619))
                goto(Label_0520)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0305)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-438103758))
                goto(Label_0111)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-271133982))
            
            if (instanceof:boolean(\u56bd\u8413\u647c\u5bc4\ud158.\u3d64\ua3b4\ufcaf\u97b7\u7ce1.class, var_4_66:\ud7e8\u836c\u61a4\uc9f6\ub83f[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                var_5_E33 = checkcast:\u3d64\ua3b4\ufcaf\u97b7\u7ce1(\u56bd\u8413\u647c\u5bc4\ud158.\u3d64\ua3b4\ufcaf\u97b7\u7ce1.class, var_4_66:\u3d64\ua3b4\ufcaf\u97b7\u7ce1)
                goto(Label_2848)
            }
        }
        
        Label_2463:
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1141167526))
            goto(Label_3072)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1612716095))
            goto(Label_2848)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_2266)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_2060)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_1872)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1613317784))
                goto(Label_1675)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-720616152))
                goto(Label_1478)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(27426183))
                goto(Label_1281)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1417190100))
                goto(Label_1066)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0878)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0681)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-494001311))
                goto(Label_0520)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0305)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(509674677))
                goto(Label_0111)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(-1612192158))
            
            if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u40a9\u71ae\u0a06\u7330\u71ae.class, var_4_66:\u3d64\ua3b4\ufcaf\u97b7\u7ce1[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                goto(Label_2848)
            }
        }
        
        Label_2669:
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1156518003))
            goto(Label_3072)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_2463)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_2266)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_2060)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_1872)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_1675)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_1478)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1006481879))
                goto(Label_1281)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_1066)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1583524710))
                goto(Label_0878)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(230010600))
                goto(Label_0681)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0520)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1040861103))
                goto(Label_0305)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_0111)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(266661416))
            
            if (instanceof:boolean(\u494c\u4975\ua068\u0c95\uc84e.\u6d69\u64ab\u9937\u59ec\uc87f.class, var_4_66:\u3d64\ua3b4\ufcaf\u97b7\u7ce1[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                var_5_E48 = checkcast:\u6d69\u64ab\u9937\u59ec\uc87f(\u494c\u4975\ua068\u0c95\uc84e.\u6d69\u64ab\u9937\u59ec\uc87f.class, var_4_66:\u6d69\u64ab\u9937\u59ec\uc87f)
            }
        }
        
        Label_2848:
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-328078951))
        }
        else {
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1882606814))
                goto(Label_2669)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1878989791))
                goto(Label_2463)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-992150766))
                goto(Label_2266)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_2060)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1349051499))
                goto(Label_1872)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(591307628))
                goto(Label_1675)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(961438759))
                goto(Label_1478)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(67108864)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1193807704))
                goto(Label_1281)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                goto(Label_1066)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0878)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_0681)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0520)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(1859980845))
                goto(Label_0305)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1933154805))
                goto(Label_0111)
            }
            
            var_2_61 = and:int(var_2_61:int, ldc:int(803530786))
            
            if (logicalnot:boolean(instanceof:boolean(\u12b2\u7049\u8df4\uc9f6\uae87.\u7c6b\ud7e8\u600f\u7330\u5fe1.class, var_4_66:\u6d69\u64ab\u9937\u59ec\uc87f[expected:\u946b\u6d99\u8df4\u12cb\u5d20]))) {
                if (logicalnot:boolean(instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u40a9\u71ae\u0a06\u7330\u71ae.class, var_4_66:\u6d69\u64ab\u9937\u59ec\uc87f[expected:\u946b\u6d99\u8df4\u12cb\u5d20]))) {
                    if (instanceof:boolean(\u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\u4f52\u7e3f\u40a9\u5f50\u59ec.class, var_4_66:\u6d69\u64ab\u9937\u59ec\uc87f[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                    }
                }
            }
        }
        
        Label_3072:
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_2848)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1073741824)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1043872878))
            goto(Label_2669)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_2463)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_2266)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(33554432)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-339862327))
            goto(Label_2060)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_1872)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(-1894427920))
            goto(Label_1675)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1237874346))
            goto(Label_1478)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_1281)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_1066)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4096)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(696789484))
            goto(Label_0878)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(134217728)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(181812692))
            goto(Label_0681)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(32768)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(1578756397))
            goto(Label_0520)
        }
        
        if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
            var_2_61 = and:int(var_2_61:int, ldc:int(300695863))
            goto(Label_0305)
        }
        
        if (cmpne:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0111)
    }
    
    public void \u7873\u7ce1\u516c\u1833\ua6bd(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u4cd9\ubff1\ub18d\u99f7\u97e6 p0) {
        var_2_61 : int
        var_4_66 : \u946b\u6d99\u8df4\u12cb\u5d20
        var_5_606 : \u7c6b\u494c\ucef1\u97b7\u446c
        var_5_614 : \ucfaf\ub18d\u4e72\u4c04\u92ff
        var_5_622 : \ub113\u1187\uc229\ub1b9\uc238
        var_5_630 : \u839e\u9a18\u9937\u36d3\ud12e
        var_5_63E : \ud158\u6b5f\ufcaf\u759a\ub18d
        var_5_64C : \u6fb0\u4bc8\u3bd6\u516c\u40a9
        var_2_669 : int
        var_6_674 : Iterator<String>
        var_7_6A5 : String
        var_5_732 : \u624e\u6b5f\u3776\u8350\u8cae
        var_2_545 : int
        expr_54C : Class[] [generated]
        
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
        var_2_61 = and:int(ldc:int(-512574781), ldc:int(-547992289))
        var_4_66 = invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20(\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6)
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u7043\u446c\u76bc\u92ff\u7d52[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            loop {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                    goto(Label_1263)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(809123007))
                    goto(Label_1132)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1141697908))
                    goto(Label_1028)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_0906)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(2053761491))
                    goto(Label_0757)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0635)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0504)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-685815976))
                    goto(Label_0373)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1944146533))
                }
                else {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1155581301))
                    
                    if (logicalnot:boolean(instanceof:boolean(\u47c2\u2dcc\u12cb\ud171\u8c8a.\u67e9\ud217\u5f50\u446c\u760c.class, var_4_66:\u946b\u6d99\u8df4\u12cb\u5d20))) {
                    }
                }
                
                Label_0242:
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-2083937716))
                    goto(Label_1263)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1715397226))
                    goto(Label_1132)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_1028)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(457150144))
                    goto(Label_0906)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(2074282163))
                    goto(Label_0757)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1736831791))
                    goto(Label_0635)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0504)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1245774009))
                    
                    if (instanceof:boolean(\u12b2\u7049\u8df4\uc9f6\uae87.\u7c6b\u494c\ucef1\u97b7\u446c.class, var_4_66:\u946b\u6d99\u8df4\u12cb\u5d20)) {
                        var_5_606 = checkcast:\u7c6b\u494c\ucef1\u97b7\u446c(\u12b2\u7049\u8df4\uc9f6\uae87.\u7c6b\u494c\ucef1\u97b7\u446c.class, var_4_66:\u7c6b\u494c\ucef1\u97b7\u446c)
                        goto(Label_1263)
                    }
                }
                
                Label_0373:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(61123317))
                    goto(Label_1263)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1806642582))
                    goto(Label_1132)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_1028)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(2094213045))
                    goto(Label_0906)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-78222591))
                    goto(Label_0757)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1780069762))
                    goto(Label_0635)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0242)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1724700393))
                    
                    if (instanceof:boolean(\u3bc9\u67e9\uc87f\u47c2\u5f50.\ucfaf\ub18d\u4e72\u4c04\u92ff.class, var_4_66:\u7c6b\u494c\ucef1\u97b7\u446c[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                        var_5_614 = checkcast:\ucfaf\ub18d\u4e72\u4c04\u92ff(\u3bc9\u67e9\uc87f\u47c2\u5f50.\ucfaf\ub18d\u4e72\u4c04\u92ff.class, var_4_66:\ucfaf\ub18d\u4e72\u4c04\u92ff)
                        goto(Label_1263)
                    }
                }
                
                Label_0504:
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1833327922))
                    goto(Label_1263)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-109107887))
                    goto(Label_1132)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_1028)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1491318192))
                    goto(Label_0906)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0757)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(115585878))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(1934316380))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0242)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(1706487219))
                    
                    if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\ub113\u1187\uc229\ub1b9\uc238.class, var_4_66:\ucfaf\ub18d\u4e72\u4c04\u92ff[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                        var_5_622 = checkcast:\ub113\u1187\uc229\ub1b9\uc238(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\ub113\u1187\uc229\ub1b9\uc238.class, var_4_66:\ub113\u1187\uc229\ub1b9\uc238)
                        goto(Label_1263)
                    }
                }
                
                Label_0635:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_1263)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1138354278))
                    goto(Label_1132)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1363083184))
                    goto(Label_1028)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0906)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0504)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(-931367396))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(1497749728))
                        goto(Label_0242)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1923431149))
                    
                    if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u839e\u9a18\u9937\u36d3\ud12e.class, var_4_66:\ub113\u1187\uc229\ub1b9\uc238[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                        var_5_630 = checkcast:\u839e\u9a18\u9937\u36d3\ud12e(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u839e\u9a18\u9937\u36d3\ud12e.class, var_4_66:\u839e\u9a18\u9937\u36d3\ud12e)
                        goto(Label_1263)
                    }
                }
                
                Label_0757:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1960536173))
                    goto(Label_1263)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(758930942))
                    goto(Label_1132)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(524288)), ldc:int(0))) {
                    goto(Label_1028)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(2106236064))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(2031423334))
                        goto(Label_0635)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0504)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(247693615))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(1443521818))
                        goto(Label_0242)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(524288)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(-1579540525))
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1583939189))
                    
                    if (instanceof:boolean(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ud158\u6b5f\ufcaf\u759a\ub18d.class, var_4_66:\u839e\u9a18\u9937\u36d3\ud12e[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                        var_5_63E = checkcast:\ud158\u6b5f\ufcaf\u759a\ub18d(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\ud158\u6b5f\ufcaf\u759a\ub18d.class, var_4_66:\ud158\u6b5f\ufcaf\u759a\ub18d)
                        goto(Label_1263)
                    }
                }
                
                Label_0906:
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1691196395))
                    goto(Label_1263)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(135946972))
                    goto(Label_1132)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(1666108798))
                }
                else {
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0757)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0635)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0504)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(93432800))
                        goto(Label_0242)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(-2406097))
                    
                    if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u6fb0\u4bc8\u3bd6\u516c\u40a9.class, var_4_66:\ud158\u6b5f\ufcaf\u759a\ub18d[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                        var_5_64C = checkcast:\u6fb0\u4bc8\u3bd6\u516c\u40a9(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u6fb0\u4bc8\u3bd6\u516c\u40a9.class, var_4_66:\u6fb0\u4bc8\u3bd6\u516c\u40a9)
                        
                        if (invokevirtual:boolean(String::startsWith, invokevirtual:String(\u6fb0\u4bc8\u3bd6\u516c\u40a9::\u3e75\u7e3f\ub83f\u4f4a\ub6ab\u3e75, var_5_64C:\u6fb0\u4bc8\u3bd6\u516c\u40a9), loadelement:String(getstatic:String[](\u7043\u446c\u76bc\u92ff\u7d52::\u6cfe\u4f4a\u718f\u6b0d\u9af2), xor:int(ldc:int(-16241), ldc:int(-16226))))) {
                        }
                        
                        var_2_669 = and:int(var_2_61:int, ldc:int(-380374533))
                        var_6_674 = invokeinterface:Iterator<String>(Collection<String>::iterator, invokevirtual:Collection<String>(\u6fb0\u4bc8\u3bd6\u516c\u40a9::\uc246\u99f7\ubff1\u8709\u4179\u3d4b, var_5_64C:\u6fb0\u4bc8\u3bd6\u516c\u40a9))
                        
                        while (invokeinterface:boolean(Iterator<E>::hasNext, var_6_674:Iterator<String>)) {
                            var_7_6A5 = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_6_674:Iterator<String>))
                            
                            if (logicalnot:boolean(invokevirtual:boolean(String::contains, var_7_6A5:String, loadelement:String[expected:CharSequence](getstatic:String[](\u7043\u446c\u76bc\u92ff\u7d52::\u6cfe\u4f4a\u718f\u6b0d\u9af2), and:int(ldc:int(146), ldc:int(17426)))))) {
                                if (cmplt:boolean(invokevirtual:int(String::length, var_7_6A5:String), xor:int(ldc:int(-28415), ldc:int(-28413)))) {
                                }
                            }
                            
                            var_2_669 = and:int(var_2_669:int, ldc:int(-1849755985))
                        }
                        
                        var_2_61 = and:int(var_2_669:int, ldc:int(-751118401))
                        goto(Label_1263)
                    }
                }
                
                Label_1028:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_1263)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(927510792))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0906)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0757)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1048576)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(1814265552))
                        goto(Label_0635)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0504)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0242)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1179408665))
                    
                    if (instanceof:boolean(\u927d\u92ff\u71ae\uafe7\u6bb9.\ub8be\ub7dc\u3bc9\u6fb0\u51b2.class, var_4_66:\u6fb0\u4bc8\u3bd6\u516c\u40a9[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                        if (cmpne:boolean(invokevirtual:int(\ub8be\ub7dc\u3bc9\u6fb0\u51b2::\u7006\u8bb0\u71ae\uae87\u3504\u4d85, checkcast:\ub8be\ub7dc\u3bc9\u6fb0\u51b2(\u927d\u92ff\u71ae\uafe7\u6bb9.\ub8be\ub7dc\u3bc9\u6fb0\u51b2.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20[expected:\ub8be\ub7dc\u3bc9\u6fb0\u51b2](\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6))), invokevirtual:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u93a2\uc84e\u2dcc\u873d\u8389\ufcaf, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b))))) {
                        }
                        
                        var_2_61 = and:int(var_2_61:int, ldc:int(2077439551))
                        goto(Label_1263)
                    }
                }
                
                Label_1132:
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-308020340))
                }
                else {
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(-1788389965))
                        goto(Label_1028)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0906)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0757)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0635)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(-332882365))
                        goto(Label_0504)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(256)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(1283193529))
                        goto(Label_0373)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                        var_2_61 = and:int(var_2_61:int, ldc:int(-1693914205))
                        goto(Label_0242)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_61 = and:int(var_2_61:int, ldc:int(427494819))
                    
                    if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u624e\u6b5f\u3776\u8350\u8cae.class, var_4_66:\u6fb0\u4bc8\u3bd6\u516c\u40a9[expected:\u946b\u6d99\u8df4\u12cb\u5d20])) {
                        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u7bad\u71ae\ua61f\ub102\u8413, this:\u7043\u446c\u76bc\u92ff\u7d52[expected:\ud158\u839e\u7006\uc3e3\u446c], loadelement:String(getstatic:String[](\u7043\u446c\u76bc\u92ff\u7d52::\u6cfe\u4f4a\u718f\u6b0d\u9af2), and:int(ldc:int(27795), ldc:int(23))))) {
                            var_5_732 = checkcast:\u624e\u6b5f\u3776\u8350\u8cae(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u624e\u6b5f\u3776\u8350\u8cae.class, invokevirtual:\u946b\u6d99\u8df4\u12cb\u5d20[expected:\u624e\u6b5f\u3776\u8350\u8cae](\u4cd9\ubff1\ub18d\u99f7\u97e6::\u4cd9\ubff1\ub18d\u99f7\u97e6, p0:\u4cd9\ubff1\ub18d\u99f7\u97e6))
                        }
                    }
                }
                
                Label_1263:
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_1132)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(1048576)), ldc:int(0))) {
                    goto(Label_1028)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-965136182))
                    goto(Label_0906)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0757)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0635)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0504)
                }
                
                if (cmpne:boolean(and:int(var_2_61:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0373)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                    goto(Label_0242)
                }
                
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_2_545 = and:int(var_2_61:int, ldc:int(-1623576069))
            expr_54C = newarray:Class[](java.lang.Class.class, ldc:int(9))
            storeelement:Class(expr_54C:Class[], and:int(ldc:int(16734), ldc:int(-16895)), ldc:Class<\u7c6b\u494c\ucef1\u97b7\u446c>(\u12b2\u7049\u8df4\uc9f6\uae87.\u7c6b\u494c\ucef1\u97b7\u446c.class))
            storeelement:Class(expr_54C:Class[], xor:int(ldc:int(2080), ldc:int(2081)), ldc:Class<\ucfaf\ub18d\u4e72\u4c04\u92ff>(\u3bc9\u67e9\uc87f\u47c2\u5f50.\ucfaf\ub18d\u4e72\u4c04\u92ff.class))
            storeelement:Class(expr_54C:Class[], and:int(ldc:int(8478), ldc:int(34)), ldc:Class<\ub113\u1187\uc229\ub1b9\uc238>(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\ub113\u1187\uc229\ub1b9\uc238.class))
            storeelement:Class(expr_54C:Class[], xor:int(ldc:int(1350), ldc:int(1349)), ldc:Class<\uafe7\u960f\u71f1\ub19c\u99f7>(\ua562\ucb79\uc87f\u3dd3\ubcb0.\uafe7\u960f\u71f1\ub19c\u99f7.class))
            storeelement:Class(expr_54C:Class[], and:int(ldc:int(25644), ldc:int(516)), ldc:Class<\u4c2b\u8640\u9af2\u183a\ub18d>(\u6435\ub8be\u718f\u6b0d\u67e9.\u4c2b\u8640\u9af2\u183a\ub18d.class))
            storeelement:Class(expr_54C:Class[], xor:int(ldc:int(-32762), ldc:int(-32765)), ldc:Class<\u8709\u7ce1\ub6ab\ubcb0\u8cae>(\u516c\u3d64\u718f\ub171\u6b5f.\u8709\u7ce1\ub6ab\ubcb0\u8cae.class))
            storeelement:Class(expr_54C:Class[], ldc:int(6), ldc:Class<\ubff1\ub70c\uae5d\u52d3\u8308>(\u12b2\u7049\u8df4\uc9f6\uae87.\ubff1\ub70c\uae5d\u52d3\u8308.class))
            storeelement:Class(expr_54C:Class[], ldc:int(7), ldc:Class<\u3e75\u3e75\ub70c\u64f2\u5d20>(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u3e75\u3e75\ub70c\u64f2\u5d20.class))
            storeelement:Class(expr_54C:Class[], ldc:int(8), ldc:Class<\ub8be\ub7dc\u3bc9\u6fb0\u51b2>(\u927d\u92ff\u71ae\uafe7\u6bb9.\ub8be\ub7dc\u3bc9\u6fb0\u51b2.class))
            
            if (invokeinterface:boolean(List::contains, initobject:ArrayList<E>(ArrayList<Object>::<init>, invokestatic:List<Class>(Arrays::asList, expr_54C:Class[])), invokevirtual:Class<? extends \u7c6b\u494c\ucef1\u97b7\u446c>[expected:Object](\u7c6b\u494c\ucef1\u97b7\u446c::getClass, var_4_66:\u7c6b\u494c\ucef1\u97b7\u446c))) {
            }
            
            loop {
                if (cmpne:boolean(and:int(var_2_545:int, ldc:int(524288)), ldc:int(0))) {
                    var_2_545 = and:int(var_2_545:int, ldc:int(1584115260))
                }
                else {
                    var_2_545 = and:int(var_2_545:int, ldc:int(1732186687))
                    
                    if (logicalnot:boolean(instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u16f6\uf94d\u156b\uc29a\ub7dc.class, var_4_66:\u7c6b\u494c\ucef1\u97b7\u446c[expected:\u946b\u6d99\u8df4\u12cb\u5d20]))) {
                    }
                }
                
                if (cmpne:boolean(and:int(var_2_545:int, ldc:int(16777216)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
        }
    }
    
    public java.util.List<\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> \u4492\ua562\ufe34\u647c\u3bc9(float p0) {
        var_2_4E0 : int
        var_4_65 : List<\u7d52\u718f\u3776\u6fb0\ub83f>
        var_5_6E : Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>
        var_6_BD : \u7d52\u718f\u3776\u6fb0\ub83f
        
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
            var_2_4E0 = and:int(ldc:int(-555710151), ldc:int(-638657801))
            var_4_65 = invokestatic:List<\u7d52\u718f\u3776\u6fb0\ub83f>(\u3bd6\u6d99\ub113\u4d85\u71f1::\uf9c5\u7043\u0c95\u76bc\u8389)
            var_5_6E = invokeinterface:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>(List<\u7d52\u718f\u3776\u6fb0\ub83f>::iterator, var_4_65:List<\u7d52\u718f\u3776\u6fb0\ub83f>)
            
            loop {
                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(16)), ldc:int(0))) {
                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-604677007))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_5_6E:Iterator)) {
                        var_6_BD = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_5_6E:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>))
                        
                        if (cmpne:boolean(var_6_BD:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)))) {
                            loop {
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-830662876))
                                    goto(Label_1776)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(128)), ldc:int(0))) {
                                    goto(Label_1637)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_1485)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(524288)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(2145732384))
                                    goto(Label_1355)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(16384)), ldc:int(0))) {
                                    goto(Label_1100)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(1048576)), ldc:int(0))) {
                                    goto(Label_0934)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(268435456)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(519870575))
                                    goto(Label_0795)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(1)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(1312871812))
                                    goto(Label_0630)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2048)), ldc:int(0))) {
                                    goto(Label_0468)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(1024)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-538845255))
                                    
                                    if (invokevirtual:boolean(\u7873\u4d85\u836c\ubff1\ubf56::\u4f4a\u4492\ubefe\u4c04\u4daf, invokevirtual:\u7873\u4d85\u836c\ubff1\ubf56(\u6b0d\ua068\uc4d2\u5245\u4d85::\u760c\u98a4\u7c6b\u0b8e\u983f, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_6_BD:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                                        invokeinterface:void(Iterator::remove, var_5_6E:Iterator)
                                        looporswitchbreak()
                                    }
                                }
                                
                                Label_0338:
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(1)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(403168934))
                                    goto(Label_1776)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(4096)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(457010476))
                                    goto(Label_1637)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2097152)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-16769255))
                                    goto(Label_1485)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(524288)), ldc:int(0))) {
                                    goto(Label_1355)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(1048576)), ldc:int(0))) {
                                    goto(Label_1100)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(8192)), ldc:int(0))) {
                                    goto(Label_0934)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(268435456)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(164486721))
                                    goto(Label_0795)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(16)), ldc:int(0))) {
                                    goto(Label_0630)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(64)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(32)), ldc:int(0))) {
                                        loopcontinue()
                                    }
                                    
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-56500743))
                                    
                                    if (logicalnot:boolean(instanceof:boolean(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, var_6_BD:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                                        invokeinterface:void(Iterator<E>::remove, var_5_6E:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                                        looporswitchbreak()
                                    }
                                }
                                
                                Label_0468:
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(64)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-110334865))
                                    goto(Label_1776)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(16384)), ldc:int(0))) {
                                    goto(Label_1637)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(1073741824)), ldc:int(0))) {
                                    goto(Label_1485)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(268435456)), ldc:int(0))) {
                                    goto(Label_1355)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(128)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-1626101698))
                                    goto(Label_1100)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(8192)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(647666061))
                                    goto(Label_0934)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(1024)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-2120969686))
                                    goto(Label_0795)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(8388608)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-153898029))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(4096)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(691855439))
                                        goto(Label_0338)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(4)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(125246648))
                                        loopcontinue()
                                    }
                                    
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-54617669))
                                    
                                    if (cmpeq:boolean(invokevirtual:float(\ube23\u67d0\u64f2\u839e\u76bc::\u120d\u51fa\u6d69\ubded\u97e6\u0a06, checkcast:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u72f1\u8389\ucb79\ub6ab\u8d98.class, var_6_BD:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f])), ldc:float(0.0f))) {
                                        invokeinterface:void(Iterator<E>::remove, var_5_6E:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                                        looporswitchbreak()
                                    }
                                }
                                
                                Label_0630:
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_1776)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(268435456)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-1685373619))
                                    goto(Label_1637)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(64)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(1688039890))
                                    goto(Label_1485)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(1)), ldc:int(0))) {
                                    goto(Label_1355)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(1048576)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-1979558937))
                                    goto(Label_1100)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(1)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-1136110375))
                                    goto(Label_0934)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2048)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-212830095))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(128)), ldc:int(0))) {
                                        goto(Label_0468)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(134217728)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-1531532213))
                                        goto(Label_0338)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(268435456)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-258222048))
                                        loopcontinue()
                                    }
                                    
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-641855885))
                                    
                                    if (cmpgt:boolean(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u98a4\ufe34\u6cfe\u3e75\u965f\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)), var_6_BD:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), p0:float)) {
                                        invokeinterface:void(Iterator<E>::remove, var_5_6E:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                                        looporswitchbreak()
                                    }
                                }
                                
                                Label_0795:
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(524288)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(1514609959))
                                    goto(Label_1776)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(1073741824)), ldc:int(0))) {
                                    goto(Label_1637)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(268435456)), ldc:int(0))) {
                                    goto(Label_1485)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(268435456)), ldc:int(0))) {
                                    goto(Label_1355)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(64)), ldc:int(0))) {
                                    goto(Label_1100)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(131072)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(673766963))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(1048576)), ldc:int(0))) {
                                        goto(Label_0630)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(16)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(1554021963))
                                        goto(Label_0468)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_0338)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2048)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(687063944))
                                        loopcontinue()
                                    }
                                    
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-23045577))
                                    
                                    if (logicalnot:boolean(invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\uafe7\ufe34\uc2bd\u983f\u6d99\u527a, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)), checkcast:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u72f1\u8389\ucb79\ub6ab\u8d98.class, var_6_BD:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))) {
                                        invokeinterface:void(Iterator<E>::remove, var_5_6E:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                                        looporswitchbreak()
                                    }
                                }
                                
                                Label_0934:
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(4)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-2049965269))
                                    goto(Label_1776)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2147483647)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(387036889))
                                    goto(Label_1637)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2147483647)), ldc:int(0))) {
                                    goto(Label_1485)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(16)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-1070716543))
                                    goto(Label_1355)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(32)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(1689847205))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2048)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-923520327))
                                        goto(Label_0795)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(268435456)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-1842190658))
                                        goto(Label_0630)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(16384)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-1192650786))
                                        goto(Label_0468)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(4)), ldc:int(0))) {
                                        goto(Label_0338)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(32)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-1220398263))
                                        loopcontinue()
                                    }
                                    
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-123601607))
                                    
                                    if (logicalnot:boolean(instanceof:boolean(\u3d64\u7af6\uae87\uc238\u7d52.\u59ec\ubf56\u8640\u759a\u0800.class, var_6_BD:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                                        if (logicalnot:boolean(instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, var_6_BD:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                                            goto(Label_1355)
                                        }
                                    }
                                }
                                
                                Label_1100:
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2048)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-912412737))
                                    goto(Label_1776)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(4096)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-1267900535))
                                    goto(Label_1637)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(1984236990))
                                    goto(Label_1485)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(2048)), ldc:int(0))) {
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(8388608)), ldc:int(0))) {
                                        goto(Label_0934)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(4096)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(1130511532))
                                        goto(Label_0795)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(16)), ldc:int(0))) {
                                        goto(Label_0630)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(32)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(1076866283))
                                        goto(Label_0468)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2048)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(349132578))
                                        goto(Label_0338)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(4096)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-880727991))
                                        loopcontinue()
                                    }
                                    
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-642164423))
                                    invokeinterface:void(Iterator<E>::remove, var_5_6E:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                                    looporswitchbreak()
                                }
                                
                                Label_1355:
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(134217728)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(410610134))
                                    goto(Label_1776)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(131072)), ldc:int(0))) {
                                    goto(Label_1637)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(1073741824)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(1001869775))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(4)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(849990991))
                                        goto(Label_1100)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_0934)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(4096)), ldc:int(0))) {
                                        goto(Label_0795)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_0630)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(8388608)), ldc:int(0))) {
                                        goto(Label_0468)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(1)), ldc:int(0))) {
                                        goto(Label_0338)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(131072)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-547842722))
                                        loopcontinue()
                                    }
                                    
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-71906501))
                                    
                                    if (instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, var_6_BD:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                                        if (invokevirtual:boolean(\u5fe1\ufcaf\u64f2\uc246\u97b7::\ud7e8\u0800\uae87\u8d90\u183a, invokevirtual:\u5fe1\ufcaf\u64f2\uc246\u97b7(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4daf\ud51e\ubb2b\uc2e8\u8c8a, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_6_BD:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                                            invokeinterface:void(Iterator<E>::remove, var_5_6E:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                                            looporswitchbreak()
                                        }
                                    }
                                }
                                
                                Label_1485:
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(134217728)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-100502549))
                                    goto(Label_1776)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(4096)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-832584948))
                                }
                                else {
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(8388608)), ldc:int(0))) {
                                        goto(Label_1355)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(8388608)), ldc:int(0))) {
                                        goto(Label_1100)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(8388608)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-429549936))
                                        goto(Label_0934)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(1024)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-709231377))
                                        goto(Label_0795)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(524288)), ldc:int(0))) {
                                        goto(Label_0630)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(1)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(813007878))
                                        goto(Label_0468)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(8388608)), ldc:int(0))) {
                                        goto(Label_0338)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(268435456)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(124844919))
                                        loopcontinue()
                                    }
                                    
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-54687621))
                                    
                                    if (cmpne:boolean(invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u7d52\u718f\u3776\u6fb0\ub83f::\u183a\u36d3\u6bb9\u647c\u7873\uceb8, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b))), aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f())) {
                                        if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::equals, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u7d52\u718f\u3776\u6fb0\ub83f::\u183a\u36d3\u6bb9\u647c\u7873\uceb8, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b))), var_6_BD:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:Object])) {
                                            invokeinterface:void(Iterator<E>::remove, var_5_6E:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                                            looporswitchbreak()
                                        }
                                    }
                                }
                                
                                Label_1637:
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(1024)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(110981012))
                                }
                                else {
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(1048576)), ldc:int(0))) {
                                        goto(Label_1485)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(32)), ldc:int(0))) {
                                        goto(Label_1355)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(1024)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-1424290400))
                                        goto(Label_1100)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(16384)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-963278273))
                                        goto(Label_0934)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(16)), ldc:int(0))) {
                                        goto(Label_0795)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(1073741824)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(370908529))
                                        goto(Label_0630)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_0468)
                                    }
                                    
                                    if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2147483647)), ldc:int(0))) {
                                        goto(Label_0338)
                                    }
                                    
                                    if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(131072)), ldc:int(0))) {
                                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(561773396))
                                        loopcontinue()
                                    }
                                    
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-118916739))
                                    
                                    if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u4c04\u3711\u7ce1\u3d64\u836c\uc238, var_6_BD:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                                        invokeinterface:void(Iterator<E>::remove, var_5_6E:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                                        looporswitchbreak()
                                    }
                                }
                                
                                Label_1776:
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(4)), ldc:int(0))) {
                                    goto(Label_1637)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(134217728)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(1621970355))
                                    goto(Label_1485)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(268435456)), ldc:int(0))) {
                                    goto(Label_1355)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(1)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(322868348))
                                    goto(Label_1100)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(32)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-1769112311))
                                    goto(Label_0934)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(8192)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(838529181))
                                    goto(Label_0795)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(128)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-1037541742))
                                    goto(Label_0630)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(134217728)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-875255456))
                                    goto(Label_0468)
                                }
                                
                                if (cmpne:boolean(and:int(var_2_4E0:int, ldc:int(131072)), ldc:int(0))) {
                                    var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-136069536))
                                    goto(Label_0338)
                                }
                                
                                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(2048)), ldc:int(0))) {
                                    loopcontinue()
                                }
                                
                                var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-655684227))
                                
                                if (logicalnot:boolean(instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, var_6_BD:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                                    looporswitchbreak()
                                }
                                
                                if (logicalnot:boolean(invokestatic:boolean(\ud523\u7e3f\u3a62\u183a\u3e75::\u8c8a\u446c\u92ee\u3dd3\u5bc4, checkcast:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u72f1\u8389\ucb79\ub6ab\u8d98.class, var_6_BD:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))) {
                                    looporswitchbreak()
                                }
                                
                                invokeinterface:void(Iterator<E>::remove, var_5_6E:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                                looporswitchbreak()
                            }
                        }
                        else {
                            invokeinterface:void(Iterator<E>::remove, var_5_6E:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                        }
                        
                        var_2_4E0 = and:int(var_2_4E0:int, ldc:int(-608454215))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_4E0:int, ldc:int(128)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_4E0 = and:int(var_2_4E0:int, ldc:int(596005480))
            }
            
            invokestatic:void(Collections::sort, var_4_65:List<Object>, initobject:\u183a\u12b2\u759a\u4179\u8413[expected:Comparator<? super Object>](\u183a\u12b2\u759a\u4179\u8413::<init>, this:\u7043\u446c\u76bc\u92ff\u7d52))
            return:List<\u7d52\u718f\u3776\u6fb0\ub83f>(var_4_65:List<\u7d52\u718f\u3776\u6fb0\ub83f>)
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f \u4d85\ub8be\u7af6\u7bad\u69d9(float p0) {
        var_4_65 : List<\u7d52\u718f\u3776\u6fb0\ub83f>
        var_5_68 : \u7d52\u718f\u3776\u6fb0\ub83f
        var_6_71 : Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>
        var_7_8E : \u7d52\u718f\u3776\u6fb0\ub83f
        
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
            var_4_65 = invokestatic:List<\u7d52\u718f\u3776\u6fb0\ub83f>(\u3bd6\u6d99\ub113\u4d85\u71f1::\uf9c5\u7043\u0c95\u76bc\u8389)
            var_5_68 = aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f()
            var_6_71 = invokeinterface:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>(List<\u7d52\u718f\u3776\u6fb0\ub83f>::iterator, var_4_65:List<\u7d52\u718f\u3776\u6fb0\ub83f>)
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_6_71:Iterator)) {
                var_7_8E = checkcast:\u7d52\u718f\u3776\u6fb0\ub83f(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class, invokeinterface:\u7d52\u718f\u3776\u6fb0\ub83f(Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>::next, var_6_71:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>))
                
                if (cmpne:boolean(var_7_8E:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)))) {
                    if (logicalnot:boolean(invokevirtual:boolean(\u7873\u4d85\u836c\ubff1\ubf56::\u4f4a\u4492\ubefe\u4c04\u4daf, invokevirtual:\u7873\u4d85\u836c\ubff1\ubf56(\u6b0d\ua068\uc4d2\u5245\u4d85::\u760c\u98a4\u7c6b\u0b8e\u983f, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_7_8E:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                        if (instanceof:boolean(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, var_7_8E:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f])) {
                            if (cmpne:boolean(invokevirtual:float(\ube23\u67d0\u64f2\u839e\u76bc::\u120d\u51fa\u6d69\ubded\u97e6\u0a06, checkcast:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u72f1\u8389\ucb79\ub6ab\u8d98.class, var_7_8E:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f])), ldc:float(0.0f))) {
                                if (cmple:boolean(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u98a4\ufe34\u6cfe\u3e75\u965f\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)), var_7_8E:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), p0:float)) {
                                    if (invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\uafe7\ufe34\uc2bd\u983f\u6d99\u527a, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\ube23\u67d0\u64f2\u839e\u76bc](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)), checkcast:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98(\u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u72f1\u8389\ucb79\ub6ab\u8d98.class, var_7_8E:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                                        if (logicalnot:boolean(instanceof:boolean(\u3d64\u7af6\uae87\uc238\u7d52.\u59ec\ubf56\u8640\u759a\u0800.class, var_7_8E:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                                            if (logicaland:boolean(instanceof:boolean(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, var_7_8E:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:boolean(\u5fe1\ufcaf\u64f2\uc246\u97b7::\ud7e8\u0800\uae87\u8d90\u183a, invokevirtual:\u5fe1\ufcaf\u64f2\uc246\u97b7(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4daf\ud51e\ubb2b\uc2e8\u8c8a, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_7_8E:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                                                invokeinterface:void(Iterator::remove, var_6_71:Iterator)
                                            }
                                            else {
                                                if (logicaland:boolean(cmpne:boolean(invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u7d52\u718f\u3776\u6fb0\ub83f::\u183a\u36d3\u6bb9\u647c\u7873\uceb8, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b))), aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f()), invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::equals, invokevirtual:\u7d52\u718f\u3776\u6fb0\ub83f(\u7d52\u718f\u3776\u6fb0\ub83f::\u183a\u36d3\u6bb9\u647c\u7873\uceb8, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b))), var_7_8E:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:Object]))) {
                                                    invokeinterface:void(Iterator<E>::remove, var_6_71:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                                                }
                                                else {
                                                    if (logicalnot:boolean(invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\u4c04\u3711\u7ce1\u3d64\u836c\uc238, var_7_8E:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                                                        if (logicaland:boolean(cmpne:boolean(var_5_68:\u7d52\u718f\u3776\u6fb0\ub83f, aconstnull:\u7d52\u718f\u3776\u6fb0\ub83f()), cmpge:boolean(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u98a4\ufe34\u6cfe\u3e75\u965f\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)), var_7_8E:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\u98a4\ufe34\u6cfe\u3e75\u965f\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)), var_5_68:\u7d52\u718f\u3776\u6fb0\ub83f)))) {
                                                            loopcontinue()
                                                        }
                                                        
                                                        var_5_68 = var_7_8E:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f]
                                                    }
                                                    else {
                                                        invokeinterface:void(Iterator<E>::remove, var_6_71:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                                                    }
                                                }
                                            }
                                        }
                                        else {
                                            invokeinterface:void(Iterator<E>::remove, var_6_71:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                                        }
                                    }
                                    else {
                                        invokeinterface:void(Iterator<E>::remove, var_6_71:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                                    }
                                }
                                else {
                                    invokeinterface:void(Iterator<E>::remove, var_6_71:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                                }
                            }
                            else {
                                invokeinterface:void(Iterator<E>::remove, var_6_71:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                            }
                        }
                        else {
                            invokeinterface:void(Iterator<E>::remove, var_6_71:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                        }
                    }
                    else {
                        invokeinterface:void(Iterator<E>::remove, var_6_71:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                    }
                }
                else {
                    invokeinterface:void(Iterator<E>::remove, var_6_71:Iterator<\u7d52\u718f\u3776\u6fb0\ub83f>)
                }
            }
            
            return:\u7d52\u718f\u3776\u6fb0\ub83f(var_5_68:\u7d52\u718f\u3776\u6fb0\ub83f)
        }
        
        goto(Label_0006)
    }
    
    public static float[] \u0a06\uc4d2\u64ab\ufcaf\u99f7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
        var_3_70 : double
        var_5_7F : double
        var_7_A0 : double
        var_9_B0 : float
        var_12_D2 : float
        expr_DB : float[] [generated]
        
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
            var_3_70 = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p0:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b))))
            var_5_7F = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p0:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b))))
            var_7_A0 = sub:double(add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b))), f2d:double(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\uae87\ua6bd\uc238\u7049\u6c52\u4492, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b))))), add:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p0:\u7d52\u718f\u3776\u6fb0\ub83f), f2d:double(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\uae87\ua6bd\uc238\u7049\u6c52\u4492, p0:\u7d52\u718f\u3776\u6fb0\ub83f))))
            var_9_B0 = sub:float(d2f:float(invokestatic:double(Math::toDegrees, invokestatic:double(Math::atan2, var_5_7F:double, var_3_70:double))), ldc:float(90.0f))
            var_12_D2 = d2f:float(neg:double(div:double(mul:double(invokestatic:double(Math::atan2, var_7_A0:double, f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7d52\u8258\u61a4\u7049\uc3e3\u4c2b, add:double(mul:double(var_3_70:double, var_3_70:double), mul:double(var_5_7F:double, var_5_7F:double))))), ldc:double(180.0)), ldc:double(3.141592653589793))))
            expr_DB = newarray:float[](float.class, xor:int(ldc:int(-12256), ldc:int(-12254)))
            storeelement:float(expr_DB:float[], and:int(ldc:int(-26511), ldc:int(25230)), var_9_B0:float)
            storeelement:float(expr_DB:float[], xor:int(ldc:int(4236), ldc:int(4237)), neg:float(var_12_D2:float))
            return:float[](expr_DB:float[])
        }
        
        goto(Label_0006)
    }
    
    public static float \u7e3f\ubefe\uc87f\ub102\u92ff(float p0, double p1, double p2) {
        var_5_C6 : int
        var_7_70 : double
        var_9_7D : double
        var_11_80 : double
        
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
            var_5_C6 = and:int(ldc:int(-756150078), ldc:int(-755847729))
            var_7_70 = sub:double(p1:double, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b))))
            var_9_7D = sub:double(p2:double, invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b))))
            var_11_80 = ldc:double(0.0)
            
            if (cmplt:boolean(var_9_7D:double, ldc:double(0.0))) {
                if (cmplt:boolean(var_7_70:double, ldc:double(0.0))) {
                    if (cmpeq:boolean(var_7_70:double, ldc:double(0.0))) {
                        return:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u9255\uae87\u7330\u8308\u88c5\u965f, neg:float(sub:float(p0:float, d2f:float(var_11_80:double)))))
                    }
                    
                    var_11_80 = add:double(ldc:double(90.0), invokestatic:double(Math::toDegrees, invokestatic:double(Math::atan, div:double(var_9_7D:double, var_7_70:double))))
                    return:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u9255\uae87\u7330\u8308\u88c5\u965f, neg:float(sub:float(p0:float, d2f:float(var_11_80:double)))))
                }
            }
            
            loop {
                if (cmpeq:boolean(and:int(var_5_C6:int, ldc:int(33554432)), ldc:int(0))) {
                    var_5_C6 = and:int(var_5_C6:int, ldc:int(-905614023))
                }
                else {
                    var_5_C6 = and:int(var_5_C6:int, ldc:int(-85589888))
                    
                    if (cmplt:boolean(var_9_7D:double, ldc:double(0.0))) {
                        if (cmpgt:boolean(var_7_70:double, ldc:double(0.0))) {
                            if (cmpeq:boolean(var_7_70:double, ldc:double(0.0))) {
                                looporswitchbreak()
                            }
                            
                            var_11_80 = add:double(ldc:double(-90.0), invokestatic:double(Math::toDegrees, invokestatic:double(Math::atan, div:double(var_9_7D:double, var_7_70:double))))
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpne:boolean(and:int(var_5_C6:int, ldc:int(32)), ldc:int(0))) {
                    var_5_C6 = and:int(var_5_C6:int, ldc:int(-1581520360))
                }
                else {
                    var_5_C6 = and:int(var_5_C6:int, ldc:int(-690351685))
                    
                    if (cmpeq:boolean(var_9_7D:double, ldc:double(0.0))) {
                        looporswitchbreak()
                    }
                    
                    var_11_80 = invokestatic:double(Math::toDegrees, neg:double(invokestatic:double(Math::atan, div:double(var_7_70:double, var_9_7D:double))))
                    looporswitchbreak()
                }
            }
            
            return:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u9255\uae87\u7330\u8308\u88c5\u965f, neg:float(sub:float(p0:float, d2f:float(var_11_80:double)))))
        }
        
        goto(Label_0006)
    }
    
    private double \u61a4\u5fe1\u5db4\u4492\uc910(double p0, double p1) {
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
            return:double(add:double(p0:double, mul:double(invokestatic:double(Math::random), sub:double(p1:double, p0:double))))
        }
        
        goto(Label_0006)
    }
    
    public static float \ub70c\u392e\u0800\u8cae\u760c(float p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p1, double p2) {
        var_6_73 : double
        var_8_83 : double
        
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
            var_6_73 = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, p1:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ub8be\u8d98\u34df\u12b2\u071d\u12b2, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b))))
            var_8_83 = sub:double(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, p1:\u7d52\u718f\u3776\u6fb0\ub83f), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ubcb0\ub83f\u92ff\u946b\u7ce1\u8df4, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b))))
            return:float(sub:float(neg:float(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u9255\uae87\u7330\u8308\u88c5\u965f, sub:float(p0:float, d2f:float(neg:double(invokestatic:double(Math::toDegrees, invokestatic:double(Math::atan, div:double(sub:double(add:double(sub:double(p2:double, ldc:double(2.2)), f2d:double(invokevirtual:float(\u7d52\u718f\u3776\u6fb0\ub83f::\uae87\ua6bd\uc238\u7049\u6c52\u4492, p1:\u7d52\u718f\u3776\u6fb0\ub83f))), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, getfield:\uf995\u72f1\u8389\ucb79\ub6ab\u8d98[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\ud12e\u5245\ud51e\u3d64\u8bb0\u647c, getstatic:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u7043\u446c\u76bc\u92ff\u7d52::\u64f2\u8350\u0b8e\u64f2\u946b)))), f2d:double(invokestatic:float(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u7d52\u8258\u61a4\u7049\uc3e3\u4c2b, add:double(mul:double(var_6_73:double, var_6_73:double), mul:double(var_8_83:double, var_8_83:double)))))))))))), ldc:float(2.5f)))
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u5bc4\ub113\uc2e8\u7e3f\ub18d$2(\u3504\ufe34\u600f\u6b0d\u69d9.\uc246\u71f1\ua068\u59ec\u516c p0) {
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
            invokeinterface:void(\u624e\u4f4a\u59ec\uae87\uc29a::\u67d0\u5140\u6198\u3e75\ub83f, invokevirtual:\u624e\u4f4a\u59ec\uae87\uc29a(\u6b0d\ua068\uc4d2\u5245\u4d85::\u156b\u7e3f\u51fa\u927d\u8bb0, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7043\u446c\u76bc\u92ff\u7d52::\u6cfe\u4f4a\u718f\u6b0d\u9af2), xor:int(ldc:int(1413), ldc:int(1425)))), invokevirtual:Object(\uc246\u71f1\ua068\u59ec\u516c<Object>::\ucb79\u5245\u36d3\u5bc4\u3d4b, p0:\uc246\u71f1\ua068\u59ec\u516c<Object>))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u6c52\uceb8\uafe7\u36d3\uc2bd$1(\u3504\ufe34\u600f\u6b0d\u69d9.\uc246\u71f1\ua068\u59ec\u516c p0) {
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
            invokeinterface:void(\u624e\u4f4a\u59ec\uae87\uc29a::\u67d0\u5140\u6198\u3e75\ub83f, invokevirtual:\u624e\u4f4a\u59ec\uae87\uc29a(\u6b0d\ua068\uc4d2\u5245\u4d85::\u156b\u7e3f\u51fa\u927d\u8bb0, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7043\u446c\u76bc\u92ff\u7d52::\u6cfe\u4f4a\u718f\u6b0d\u9af2), and:int(ldc:int(181), ldc:int(19549)))), invokevirtual:Object(\uc246\u71f1\ua068\u59ec\u516c<Object>::\ucb79\u5245\u36d3\u5bc4\u3d4b, p0:\uc246\u71f1\ua068\u59ec\u516c<Object>))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u3504\u67d0\u927d\u64f2\u0800$0(\u3504\ufe34\u600f\u6b0d\u69d9.\uc246\u71f1\ua068\u59ec\u516c p0) {
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
            invokeinterface:void(\u624e\u4f4a\u59ec\uae87\uc29a::\u67d0\u5140\u6198\u3e75\ub83f, invokevirtual:\u624e\u4f4a\u59ec\uae87\uc29a(\u6b0d\ua068\uc4d2\u5245\u4d85::\u156b\u7e3f\u51fa\u927d\u8bb0, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7043\u446c\u76bc\u92ff\u7d52::\u6cfe\u4f4a\u718f\u6b0d\u9af2), xor:int(ldc:int(-22514), ldc:int(-22504)))), invokevirtual:Object(\uc246\u71f1\ua068\u59ec\u516c<Object>::\ucb79\u5245\u36d3\u5bc4\u3d4b, p0:\uc246\u71f1\ua068\u59ec\u516c<Object>))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_407 : int
        expr_6E : int [generated]
        stack_AE_0 : byte[] [generated]
        stack_B0_0 : byte[] [generated]
        stack_E7_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_12B_0 : byte[] [generated]
        stack_12D_0 : byte[] [generated]
        stack_15A_0 : byte[] [generated]
        stack_41A_0 : byte[] [generated]
        stack_4A9_0 : byte[] [generated]
        stack_4FD_0 : byte[] [generated]
        stack_553_0 : byte[] [generated]
        var_4_3F2 : int
        var_3_3F7 : byte[]
        var_5_3F8 : int
        var_0_410 : int
        expr_41A : byte [generated]
        stack_463_2 : byte [generated]
        stack_440_0 : byte [generated]
        expr_4A9 : byte [generated]
        var_0_91 : int
        expr_B0 : int [generated]
        var_2_E7 : byte[]
        expr_EB : int [generated]
        var_3_4EB : byte[]
        var_5_4EC : int
        expr_12D : int [generated]
        var_3_541 : byte[]
        var_5_542 : int
        var_3_166 : String
        stack_3EB_0 : String[] [generated]
        expr_178 : String[] [generated]
        
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
        var_0_407 = and:int(ldc:int(-1819402987), ldc:int(-683258289))
        expr_6E = arraylength:int(stack_AE_0 = stack_B0_0 = stack_E7_0 = stack_E9_0 = stack_12B_0 = stack_12D_0 = stack_15A_0 = stack_41A_0 = stack_4A9_0 = stack_4FD_0 = stack_553_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("JL/9/km8AulTshTx+hUF8UmtFAQB8fksIq8U8fpVvP8J/foI9+09Ga8U8fpVrA/9DfvxKSOvFPH6Vaz/FvntBRQF8h8nrxTx+lWsBAUHRbvuB/8Q9x/k9xED7CnhCfn5CQI/vP8J/foI9+1NDtrfCfn5CQI/rA/9DfvxORja3wn5+QkCP6wEBQc1EdrVAwj87xQK8u8l9fH6JfDx+lXc3wn9+gj37S3s8fpVzO/9DfvxGfbx+lXM3xb57QUUBfLvJfXx+lXM5AUHBfAU+vgACeob/AP99wD/7xv38BgB/AyNI+UbRp0dRlxp")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_3F2 = expr_6E:int
        var_3_3F7 = newarray:byte[](byte.class, expr_6E:int)
        var_5_3F8 = expr_6E:int
        Label_1018:
        
        while (cmpeq:boolean(and:int(var_0_407:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_410 = and:int(var_0_407:int, ldc:int(-214602723))
            var_5_3F8 = add:int(var_5_3F8:int, ldc:int(-1))
            expr_41A = stack_463_2 = loadelement(stack_41A_0, var_5_3F8)
            
            if (cmplt:boolean(add:int(add:int(var_5_3F8:int, ldc:int(1)), neg:int(var_4_3F2:int)), ldc:int(0))) {
                stack_463_2 = stack_440_0 = add:byte(expr_41A:byte, loadelement:byte(var_3_3F7:byte[], add:int(var_5_3F8:int, ldc:int(1))))
                goto(Label_1104)
            }
            
            Label_1063:
            
            if (cmpeq:boolean(and:int(var_0_410:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_410 = and:int(var_0_410:int, ldc:int(-1864488613))
            }
            else {
                var_0_410 = and:int(var_0_410:int, ldc:int(-1687332059))
                stack_463_2 = stack_440_0 = add:byte(expr_41A:byte, ldc:byte(1))
            }
            
            Label_1104:
            
            if (cmpeq:boolean(and:int(var_0_410:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_1063)
            }
            
            var_0_407 = and:int(var_0_410:int, ldc:int(-541302788))
            storeelement:byte(var_3_3F7:byte[], var_5_3F8:int, stack_463_2:byte)
            
            if (cmpne:boolean(var_5_3F8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_12B_0 = stack_12D_0 = stack_15A_0 = stack_41A_0 = stack_4A9_0 = stack_4FD_0 = stack_553_0 = var_3_3F7:byte[]
            goto(Label_0115)
        }
        
        var_0_407 = and:int(var_0_407:int, ldc:int(-960358533))
        Label_1161:
        
        while (cmpeq:boolean(and:int(var_0_407:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_407 = and:int(var_0_407:int, ldc:int(-1214911740))
            var_5_3F8 = add:int(var_5_3F8:int, ldc:int(-1))
            expr_4A9 = loadelement:byte(stack_4A9_0:byte[], var_5_3F8:int)
            storeelement:byte(var_3_3F7:byte[], var_5_3F8:int, add:int(or:int(and:int(shl:int(expr_4A9:byte, xor:int(ldc:int(1137), ldc:int(1141))), ldc:int(-16)), and:int(shr:int(expr_4A9:byte[expected:int], and:int(ldc:int(17420), ldc:int(4484))), ldc:int(15))), ldc:int(58)))
            
            if (cmpne:boolean(var_5_3F8:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_12B_0 = stack_12D_0 = stack_15A_0 = stack_41A_0 = stack_4A9_0 = stack_4FD_0 = stack_553_0 = var_3_3F7:byte[]
            goto(Label_0181)
        }
        
        var_0_407 = and:int(var_0_407:int, ldc:int(-1643968619))
        goto(Label_1018)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_407:int, ldc:int(8)), ldc:int(0))) {
            var_0_407 = and:int(var_0_407:int, ldc:int(2027886521))
            goto(Label_0306)
        }
        
        if (cmpeq:boolean(and:int(var_0_407:int, ldc:int(33554432)), ldc:int(0))) {
            var_0_91 = and:int(var_0_407:int, ldc:int(49841835))
            goto(Label_0240)
        }
        
        if (cmpeq:boolean(and:int(var_0_407:int, ldc:int(262144)), ldc:int(0))) {
            var_0_407 = and:int(var_0_407:int, ldc:int(1147151742))
        }
        else {
            var_0_407 = and:int(var_0_407:int, ldc:int(-1145198418))
            expr_B0 = arraylength:int(stack_B0_0:byte[])
            
            if (cmpne:boolean(expr_B0:int, ldc:int(0))) {
                var_4_3F2 = expr_B0:int
                var_3_3F7 = newarray:byte[](byte.class, expr_B0:int)
                var_5_3F8 = expr_B0:int
                goto(Label_1161)
            }
        }
        
        Label_0181:
        
        if (cmpne:boolean(and:int(var_0_407:int, ldc:int(536870912)), ldc:int(0))) {
            goto(Label_0306)
        }
        
        if (cmpne:boolean(and:int(var_0_407:int, ldc:int(16384)), ldc:int(0))) {
            var_0_91 = and:int(var_0_407:int, ldc:int(-1956725394))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_407:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_407 = and:int(var_0_407:int, ldc:int(1231647540))
                goto(Label_0115)
            }
            
            var_0_91 = and:int(var_0_407:int, ldc:int(-753448354))
            var_2_E7 = stack_E7_0:byte[]
            expr_EB = add:int(arraylength:int(stack_E9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_EB:int, ldc:int(0))) {
                var_3_4EB = newarray:byte[](byte.class, expr_EB:int)
                var_5_4EC = expr_EB:int
                
                loop {
                    var_0_91 = and:int(var_0_91:int, ldc:int(-619788163))
                    var_5_4EC = add:int(var_5_4EC:int, ldc:int(-1))
                    storeelement:byte(var_3_4EB:byte[], var_5_4EC:int, add:int(shl:int(loadelement:byte(stack_4FD_0:byte[], var_5_4EC:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_E7:byte[], add:int(var_5_4EC:int, and:int(ldc:int(81), ldc:int(11781)))), ldc:int(4)), xor:int(ldc:int(12834), ldc:int(12845)))))
                    
                    if (cmpne:boolean(var_5_4EC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_12B_0 = stack_12D_0 = stack_15A_0 = stack_41A_0 = stack_4A9_0 = stack_4FD_0 = stack_553_0 = var_3_4EB:byte[]
            }
        }
        
        Label_0240:
        
        if (cmpeq:boolean(and:int(var_0_91:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_407 = and:int(var_0_91:int, ldc:int(527054990))
        }
        else {
            if (cmpne:boolean(and:int(var_0_91:int, ldc:int(134217728)), ldc:int(0))) {
                var_0_407 = and:int(var_0_91:int, ldc:int(310782585))
                goto(Label_0181)
            }
            
            if (cmpeq:boolean(and:int(var_0_91:int, ldc:int(2048)), ldc:int(0))) {
                var_0_407 = and:int(var_0_91:int, ldc:int(-421335188))
                goto(Label_0115)
            }
            
            var_0_407 = and:int(var_0_91:int, ldc:int(-138552962))
            expr_12D = arraylength:int(stack_12D_0:byte[])
            
            if (cmpne:boolean(expr_12D:int, ldc:int(0))) {
                var_3_541 = newarray:byte[](byte.class, expr_12D:int)
                var_5_542 = expr_12D:int
                
                loop {
                    var_0_407 = and:int(var_0_407:int, ldc:int(-208666705))
                    var_5_542 = add:int(var_5_542:int, ldc:int(-1))
                    storeelement:byte(var_3_541:byte[], var_5_542:int, xor:byte(loadelement:byte(stack_553_0:byte[], var_5_542:int), ldc:byte(13)))
                    
                    if (cmpne:boolean(var_5_542:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B0_0 = stack_AE_0 = stack_E7_0 = stack_E9_0 = stack_12B_0 = stack_12D_0 = stack_15A_0 = stack_41A_0 = stack_4A9_0 = stack_4FD_0 = stack_553_0 = var_3_541:byte[]
            }
        }
        
        Label_0306:
        
        if (cmpne:boolean(and:int(var_0_407:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_91 = and:int(var_0_407:int, ldc:int(-613022241))
            goto(Label_0240)
        }
        
        if (cmpeq:boolean(and:int(var_0_407:int, ldc:int(4)), ldc:int(0))) {
            goto(Label_0181)
        }
        
        if (cmpne:boolean(and:int(var_0_407:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_166 = initobject:String(String::<init>, stack_15A_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_3EB_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-20460), ldc:int(-20477)))
            expr_178 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16599), ldc:int(11295)))
            storeelement:String(expr_178:String[], and:int(ldc:int(2179), ldc:int(13845)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(-5093), ldc:int(5028)), xor:int(ldc:int(-20345), ldc:int(-20321))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(-8063), ldc:int(-8060)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(4097), ldc:int(4121)), xor:int(ldc:int(4539), ldc:int(4508))))
            storeelement:String(expr_178:String[], and:int(ldc:int(8199), ldc:int(17255)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(17290), ldc:int(17325)), xor:int(ldc:int(4791), ldc:int(4739))))
            storeelement:String(expr_178:String[], and:int(ldc:int(10349), ldc:int(17421)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(6324), ldc:int(17204)), xor:int(ldc:int(2234), ldc:int(2302))))
            storeelement:String(expr_178:String[], and:int(ldc:int(8217), ldc:int(8041)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(8198), ldc:int(8258)), and:int(ldc:int(222), ldc:int(19543))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(-32695), ldc:int(-32693)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(10799), ldc:int(10873)), and:int(ldc:int(21725), ldc:int(348))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(355), ldc:int(373)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(4734), ldc:int(220)), xor:int(ldc:int(4226), ldc:int(4332))))
            storeelement:String(expr_178:String[], and:int(ldc:int(533), ldc:int(14517)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(6910), ldc:int(366)), xor:int(ldc:int(1627), ldc:int(1573))))
            storeelement:String(expr_178:String[], and:int(ldc:int(21), ldc:int(23164)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(3120), ldc:int(3150)), xor:int(ldc:int(20566), ldc:int(20698))))
            storeelement:String(expr_178:String[], and:int(ldc:int(2071), ldc:int(21339)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(-27627), ldc:int(-27495)), and:int(ldc:int(22166), ldc:int(510))))
            storeelement:String(expr_178:String[], and:int(ldc:int(-27527), ldc:int(11142)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(4799), ldc:int(8406)), xor:int(ldc:int(23104), ldc:int(23258))))
            storeelement:String(expr_178:String[], and:int(ldc:int(9734), ldc:int(4165)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(187), ldc:int(5278)), and:int(ldc:int(9127), ldc:int(4279))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(769), ldc:int(775)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(3831), ldc:int(20655)), xor:int(ldc:int(2586), ldc:int(2728))))
            storeelement:String(expr_178:String[], and:int(ldc:int(47), ldc:int(716)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(1211), ldc:int(178)), xor:int(ldc:int(16), ldc:int(209))))
            storeelement:String(expr_178:String[], and:int(ldc:int(8202), ldc:int(777)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(-30017), ldc:int(-30082)), xor:int(ldc:int(8359), ldc:int(8301))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(-22511), ldc:int(-22510)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(4905), ldc:int(5091)), xor:int(ldc:int(192), ldc:int(12))))
            storeelement:String(expr_178:String[], and:int(ldc:int(4123), ldc:int(1291)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(-16355), ldc:int(-16175)), xor:int(ldc:int(-24404), ldc:int(-24449))))
            storeelement:String(expr_178:String[], and:int(ldc:int(1067), ldc:int(16398)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(4751), ldc:int(4700)), and:int(ldc:int(218), ldc:int(6104))))
            storeelement:String(expr_178:String[], and:int(ldc:int(239), ldc:int(8206)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(16428), ldc:int(16628)), xor:int(ldc:int(9224), ldc:int(9428))))
            storeelement:String(expr_178:String[], and:int(ldc:int(25617), ldc:int(2589)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(134), ldc:int(90)), xor:int(ldc:int(759), ldc:int(534))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(-28537), ldc:int(-28523)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(14819), ldc:int(16633)), xor:int(ldc:int(9347), ldc:int(9313))))
            storeelement:String(expr_178:String[], xor:int(ldc:int(18440), ldc:int(18439)), invokevirtual:String[expected:String](String::substring, var_3_166:String, xor:int(ldc:int(183), ldc:int(85)), and:int(ldc:int(487), ldc:int(4332))))
            storeelement:String(expr_178:String[], and:int(ldc:int(8472), ldc:int(3637)), invokevirtual:String[expected:String](String::substring, var_3_166:String, and:int(ldc:int(252), ldc:int(231)), and:int(ldc:int(1783), ldc:int(8430))))
            putstatic:String[](\u7043\u446c\u76bc\u92ff\u7d52::\u6cfe\u4f4a\u718f\u6b0d\u9af2, expr_178:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \ub19c\u51b2\ud12e\u0b8e\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_68D : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
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
        var_3_68D = and:int(ldc:int(-1311980213), ldc:int(-1881025459))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7043\u446c\u76bc\u92ff\u7d52[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(412643064))
        }
        else {
            var_3_68D = and:int(var_3_68D:int, ldc:int(-1546598455))
            var_5_8A = and:int(ldc:int(-24481), ldc:int(20384))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(26676), ldc:int(-27773)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_68D:int, ldc:int(-1243098897))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(6688), ldc:int(6689)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(2052), ldc:int(2053)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_68D = and:int(var_3_E3:int, ldc:int(-909116469))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(133), ldc:int(2075)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1000304040))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1271551243))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1842058852))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(420950731))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-757514332))
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-339545383))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(637537918))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0711)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(174937731))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-607071249))
                        var_11_F4 = and:int(ldc:int(-27013), ldc:int(27012))
                        goto(Label_1544)
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-379248166))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1715787972))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1522829393))
                        goto(Label_0852)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-361538811))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(791866716))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-236718753))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0852)
                        }
                    }
                    
                    Label_0711:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-2037315080))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1570073499))
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-757018378))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(113052375))
                        goto(Label_0977)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1036186727))
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1982737797))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0852:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(336543087))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1769126086))
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1199021998))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-1239629805))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-2236549))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(1029), ldc:int(81))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_0977:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(670776316))
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(49955478))
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(728631182))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1658660798))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(526943878))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(561873929))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1613108263))
                        var_11_F4 = and:int(ldc:int(-32080), ldc:int(29965))
                    }
                    
                    Label_1155:
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-127097403))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-2081363859))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1380)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(1894141540))
                            goto(Label_1155)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0977)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0852)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0711)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(909763859))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_68D = and:int(var_3_68D:int, ldc:int(-182371201))
                            loopcontinue()
                        }
                        
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-170468759))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1544)
                    }
                    
                    Label_1380:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1757997132))
                        goto(Label_1555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1205754209))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-162729589))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(573570391))
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1884058153))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1289121658))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1504005503))
                        loopcontinue()
                    }
                    
                    var_3_68D = and:int(var_3_68D:int, ldc:int(-1378946465))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1544:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_698 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1555:
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1380)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1021560881))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-1752279273))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-196202309))
                        goto(Label_0977)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0852)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1859751249))
                        goto(Label_0711)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_68D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(1590279042))
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(512)), ldc:int(0))) {
                        var_3_68D = and:int(var_3_68D:int, ldc:int(-774381367))
                        var_17_698 = add:int(var_16_122:int, xor:int(ldc:int(788), ldc:int(789)))
                        looporswitchbreak()
                    }
                }
                
                var_3_68D = and:int(var_3_68D:int, ldc:int(-671945267))
                
                if (cmple:boolean(var_5_8A = var_17_698:int, sub:int(var_6_91:int, and:int(ldc:int(16899), ldc:int(149))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_68D:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_68D = and:int(var_3_68D:int, ldc:int(1467914053))
            goto(Label_0108)
        }
    }
}
