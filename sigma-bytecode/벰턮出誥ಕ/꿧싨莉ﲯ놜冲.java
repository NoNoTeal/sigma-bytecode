public class \ubcb0\ud12e\u51fa\u8aa5\u0c95.\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2 {
    public void \uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2() {
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
    
    private static void \u67d0\ub7dc\u4975\u76bc\ub18d\u446c(it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap<\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389, \u5d20\u7043\u88c5\u5db4\uf94d.\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab> p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p1) {
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
            invokevirtual:Object(Object2ObjectLinkedOpenHashMap::put, p0:Object2ObjectLinkedOpenHashMap<\uf995\u4975\u1187\ubff1\u839e\u8389, \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab>, p1:\uf995\u4975\u1187\ubff1\u839e\u8389[expected:Object], initobject:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:Object](\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::<init>, invokevirtual:int(\uf995\u4975\u1187\ubff1\u839e\u8389::\uc3e3\ub18d\u0b8e\u647c\u6bb9\u98a4, p1:\uf995\u4975\u1187\ubff1\u839e\u8389)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4bc8\u6198\uc9f6\u5245\u6435\ub32d \u759a\u1833\ubcb0\uc229\u6435\ud158() {
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
            return:\u4bc8\u6198\uc9f6\u5245\u6435\ub32d(getfield:\u4bc8\u6198\uc9f6\u5245\u6435\ub32d(\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2::\u6bb9\u965f\u52d3\u760c\u494c\u52d3, this:\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\u61a4\u76bc\u0c95\u1833\u7043\u3711 \u718f\u7af6\ud12e\u72f1\u62da\u51b2() {
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
            return:\u61a4\u76bc\u0c95\u1833\u7043\u3711(getfield:\u61a4\u76bc\u0c95\u1833\u7043\u3711(\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2::\u8350\u7e3f\u965f\uc910\u7ce1\ubefe, this:\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2))
        }
        
        goto(Label_0006)
    }
    
    public \u5d20\u97b7\u8753\u873d\u16f6.\u61a4\u76bc\u0c95\u1833\u7043\u3711 \u8413\u5f50\u071d\ub1b9\ua562\ub113() {
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
            return:\u61a4\u76bc\u0c95\u1833\u7043\u3711(getfield:\u61a4\u76bc\u0c95\u1833\u7043\u3711(\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2::\ud4fe\uc2bd\u3d4b\u88c5\u4179\u8c8a, this:\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2))
        }
        
        goto(Label_0006)
    }
    
    public \u6435\ub8be\u718f\u6b0d\u67e9.\u7006\uc31c\uc9f6\u624e\ub1b9\u6bb9 \u3e75\u9a18\u5245\ufe34\u12cb\u6cfe() {
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
            return:\u7006\uc31c\uc9f6\u624e\ub1b9\u6bb9(getfield:\u7006\uc31c\uc9f6\u624e\ub1b9\u6bb9(\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2::\u2dcc\ua6bd\u4f4a\ube23\u74b1\u67e9, this:\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ub6ab\u4f4a\u34df\u92ee\u4f4a\u6fb0$1(it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap p0) {
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
    
    private static void lambda$\u873d\u2dcc\ubefe\uc3e3\u9af2\ub83f$0(it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap p0, \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\uf995\u4975\u1187\ubff1\u839e\u8389 p1) {
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
            invokestatic:void(\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2::\u67d0\ub7dc\u4975\u76bc\ub18d\u446c, p0:Object2ObjectLinkedOpenHashMap, p1:\uf995\u4975\u1187\ubff1\u839e\u8389)
            return:void()
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
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubcb0\u927d\u5bc4\u600f\u416d\u8413(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A6 : int
        var_5_7F : int
        var_6_86 : int
        var_7_95 : double
        var_9_BD : double
        var_3_CF : int
        var_11_E0 : int
        var_14_10A : double
        var_16_10E : int
        var_12_106 : double
        var_17_6B1 : int
        
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
        var_3_6A6 = and:int(ldc:int(-1541542824), ldc:int(-1491292517))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\uafe7\uc2e8\u8389\ufcaf\ub19c\u51b2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0169)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(131072)), ldc:int(0))) {
            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1238515924))
            var_5_7F = and:int(ldc:int(-32341), ldc:int(15892))
            var_6_86 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_95 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(10892), ldc:int(-11917)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BD = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CF = and:int(var_3_6A6:int, ldc:int(-172049204))
                    var_9_BD = sub:double(var_7_95:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E0 = var_5_7F:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E0:int, sub:int(var_6_86:int, xor:int(ldc:int(21508), ldc:int(21509)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E0:int, and:int(ldc:int(883), ldc:int(20613)))), var_7_95:double))) {
                        inc:int(var_11_E0, ldc:int(1))
                    }
                    
                    var_3_6A6 = and:int(var_3_CF:int, ldc:int(-347280356))
                    var_14_10A = var_7_95:double
                    var_16_10E = var_11_E0:int
                }
                else {
                    var_11_E0 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7F:int), and:int(ldc:int(649), ldc:int(4467)))
                    var_12_106 = var_14_10A = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F)
                    
                    if (cmplt:boolean(var_16_10E = var_11_E0:int, var_6_86:int)) {
                        var_9_BD = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E0:int)
                        var_16_10E = var_11_E0:int
                        var_14_10A = var_12_106:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(2051882314))
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(182684408))
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-110879499))
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1373828350))
                        goto(Label_0575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1015244975))
                    }
                    else {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1339379860))
                        
                        if (cmplt:boolean(var_16_10E:int, var_6_86:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0575)
                            }
                            
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0409:
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1662675830))
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-259127904))
                        goto(Label_1423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(296386971))
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0718)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-236816695))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-388190610))
                            var_11_E0 = and:int(ldc:int(26389), ldc:int(-28446))
                            goto(Label_1578)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0575:
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-992641462))
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(819895884))
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1448045325))
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1226098880))
                        goto(Label_0850)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-514521383))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-589422110))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2048)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-524571156))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10A = var_9_BD:double
                            goto(Label_0850)
                        }
                    }
                    
                    Label_0718:
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1417563901))
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(707766796))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1563757990))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1599538748))
                            loopcontinue()
                        }
                        
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-150032772))
                        var_14_10A = mul:double(ldc:double(0.5), add:double(var_9_BD:double, var_14_10A:double))
                    }
                    
                    Label_0850:
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1465869760))
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1929602362))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0718)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1796901638))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-135528595))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7F:int), var_7_95:double)) {
                                var_11_E0 = and:int(ldc:int(1549), ldc:int(2209))
                                goto(Label_1153)
                            }
                        }
                    }
                    
                    Label_0966:
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(244153589))
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1668444644))
                        goto(Label_1423)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-567698868))
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1519801787))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0718)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1142890608))
                            goto(Label_0575)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(1)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1232933470))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1418371547))
                            loopcontinue()
                        }
                        
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1181877025))
                        var_11_E0 = and:int(ldc:int(10618), ldc:int(-10619))
                    }
                    
                    Label_1153:
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-718422257))
                            goto(Label_0966)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1474337694))
                            goto(Label_0850)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0718)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(397501462))
                            goto(Label_0409)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1592624937))
                            loopcontinue()
                        }
                        
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-245715176))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                                goto(Label_1423)
                            }
                        }
                    }
                    
                    Label_1278:
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1636968686))
                        goto(Label_1589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(2038015318))
                            goto(Label_1153)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1206425732))
                            goto(Label_0966)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0850)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0718)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1547073788))
                            goto(Label_0575)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1830266829))
                            goto(Label_0409)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1241862581))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10A:double, var_5_7F:int, var_16_10E:int)
                            goto(Label_1578)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1423:
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(817634189))
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-531347160))
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1376032104))
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(989868394))
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0718)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(377167023))
                        goto(Label_0575)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0409)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(2062020152))
                        loopcontinue()
                    }
                    
                    var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-274092712))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10A:double, ldc:double(0.0))
                    Label_1578:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B1 = var_5_7F:int
                        
                        if (cmpeq:boolean(var_11_E0:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1589:
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1423)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1029976133))
                        goto(Label_1153)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0966)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0850)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0718)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(823330697))
                        goto(Label_0575)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A6:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1736917993))
                        goto(Label_0409)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-1312231478))
                        var_17_6B1 = add:int(var_16_10E:int, and:int(ldc:int(17), ldc:int(12391)))
                        looporswitchbreak()
                    }
                    
                    var_3_6A6 = and:int(var_3_6A6:int, ldc:int(1667244173))
                }
                
                var_3_6A6 = and:int(var_3_6A6:int, ldc:int(-199573986))
                
                if (cmple:boolean(var_5_7F = var_17_6B1:int, sub:int(var_6_86:int, xor:int(ldc:int(4117), ldc:int(4116))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0169:
        
        if (cmpeq:boolean(and:int(var_3_6A6:int, ldc:int(16777216)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
