public final class \u59ec\u8413\u97e6\uc229\u3776.\u64ab\u3504\ub7dc\u0800\u93a2\ub113 {
    private void \u64ab\u3504\ub7dc\u0800\u93a2\ub113(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0) {
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
    
    public boolean \u12cb\u8389\ud158\u88c5\ubcb0\u7006(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u40a9\u51b2\uae87\ud217\u69d9\u516c p1) {
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
            return:boolean(loadelement:boolean(getfield:boolean[](\u64ab\u3504\ub7dc\u0800\u93a2\ub113::\u392e\u6b5f\u3711\u759a\u34df\ua6bd, this:\u64ab\u3504\ub7dc\u0800\u93a2\ub113), invokestatic:int(\u64ab\u3504\ub7dc\u0800\u93a2\ub113::\u8709\u3504\u7c6b\u12cb\uc3e3\uc2e8, p0:\u760c\u4975\u4179\uc246\u8640\u64f2, p1:\u40a9\u51b2\uae87\ud217\u69d9\u516c)))
        }
        
        goto(Label_0006)
    }
    
    private static int \u8709\u3504\u7c6b\u12cb\uc3e3\uc2e8(\u927d\u92ff\u71ae\uafe7\u6bb9.\u760c\u4975\u4179\uc246\u8640\u64f2 p0, \u6cfe\u16f6\u4c04\u61a4\u8bb0.\u40a9\u51b2\uae87\ud217\u69d9\u516c p1) {
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
            return:int(add:int(mul:int(invokevirtual:int(Enum<E>::ordinal, p0:\u760c\u4975\u4179\uc246\u8640\u64f2[expected:Enum<\u760c\u4975\u4179\uc246\u8640\u64f2>]), getstatic:int(\u64ab\u3504\ub7dc\u0800\u93a2\ub113::\u071d\u7e3f\u4e72\u6435\u5bc4\u62da)), invokevirtual:int(Enum<E>::ordinal, p1:\u40a9\u51b2\uae87\ud217\u69d9\u516c[expected:Enum<\u40a9\u51b2\uae87\ud217\u69d9\u516c>])))
        }
        
        goto(Label_0006)
    }
    
    private boolean lambda$\u7873\u516c\u9937\u8258\ud36e\u8350$0(\u36d3\u9033\u6b0d\u983f\u8d90.\u6c52\u156b\u4179\u5654\uceb8\u9af2 p0) {
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
            return:boolean(ternaryop:int[expected:boolean](logicaland:boolean(cmpge:boolean(invokevirtual:double(\u6c52\ubded\u4975\u71ae\u47c2\u7d52::\u12cb\uf9c5\u071d\ucb79\ubff1\u1833, getfield:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u64ab\u3504\ub7dc\u0800\u93a2\ub113::\ub18d\uafe7\u76bc\u6c56\u0c95\u4ab3, this:\u64ab\u3504\ub7dc\u0800\u93a2\ub113), p0:\u6c52\u156b\u4179\u5654\uceb8\u9af2), ldc:double(0.0)), cmple:boolean(invokevirtual:double(\u6c52\ubded\u4975\u71ae\u47c2\u7d52::\u7c6b\ud12e\u3d4b\u8d98\u3d64\u64f2, getfield:\u6c52\ubded\u4975\u71ae\u47c2\u7d52(\u64ab\u3504\ub7dc\u0800\u93a2\ub113::\ub18d\uafe7\u76bc\u6c56\u0c95\u4ab3, this:\u64ab\u3504\ub7dc\u0800\u93a2\ub113), p0:\u6c52\u156b\u4179\u5654\uceb8\u9af2), ldc:double(1.0))), and:int(ldc:int(17811), ldc:int(-24020)), and:int(ldc:int(3491), ldc:int(28681))))
        }
        
        goto(Label_0006)
    }
    
    public void \u64ab\u3504\ub7dc\u0800\u93a2\ub113(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u51b2\u6fb0\ufcaf\u61a4\u0800.\uc7fe\ua61f\ub18d\u64ab\u4f4a.\ube23\ud36e\ubded\u516c\ud51e\u8413 p1) {
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
            invokespecial:\u64ab\u3504\ub7dc\u0800\u93a2\ub113(\u64ab\u3504\ub7dc\u0800\u93a2\ub113::<init>, this:\u64ab\u3504\ub7dc\u0800\u93a2\ub113, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static boolean \ubcb0\u74b1\u600f\u3776\uc910\u61a4(\u59ec\u8413\u97e6\uc229\u3776.\u64ab\u3504\ub7dc\u0800\u93a2\ub113 p0) {
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
            return:boolean(getfield:boolean(\u64ab\u3504\ub7dc\u0800\u93a2\ub113::\ud217\u960f\u836c\uae5d\ub171\ub1b9, p0:\u64ab\u3504\ub7dc\u0800\u93a2\ub113))
        }
        
        goto(Label_0006)
    }
    
    public static int \uc3e3\u647c\u9937\ua61f\ufe34\u4f4a(\u59ec\u8413\u97e6\uc229\u3776.\u64ab\u3504\ub7dc\u0800\u93a2\ub113 p0) {
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
            return:int(getfield:int(\u64ab\u3504\ub7dc\u0800\u93a2\ub113::\u64f2\ub7dc\u8709\u071d\ud7e8\u5bc4, p0:\u64ab\u3504\ub7dc\u0800\u93a2\ub113))
        }
        
        goto(Label_0006)
    }
    
    public static \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\ubded\u4975\u71ae\u47c2\u7d52[] \u0c95\uc238\uff55\ud523\u624e\u6435(\u59ec\u8413\u97e6\uc229\u3776.\u64ab\u3504\ub7dc\u0800\u93a2\ub113 p0) {
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
            return:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](getfield:\u6c52\ubded\u4975\u71ae\u47c2\u7d52[](\u64ab\u3504\ub7dc\u0800\u93a2\ub113::\u7d52\u071d\u385b\u8709\u385b\u759a, p0:\u64ab\u3504\ub7dc\u0800\u93a2\ub113))
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
            putstatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u64ab\u3504\ub7dc\u0800\u93a2\ub113::\u8d98\u3711\u76bc\u527a\u3d64\u69d9, invokestatic:\u760c\u4975\u4179\uc246\u8640\u64f2[](\u760c\u4975\u4179\uc246\u8640\u64f2::values))
            putstatic:int(\u64ab\u3504\ub7dc\u0800\u93a2\ub113::\u071d\u7e3f\u4e72\u6435\u5bc4\u62da, arraylength:int(invokestatic:\u40a9\u51b2\uae87\ud217\u69d9\u516c[](\u40a9\u51b2\uae87\ud217\u69d9\u516c::values)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0800\u5d20\u4e72\u6fb0\u927d\uc4d2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A7 : int
        var_5_87 : int
        var_6_8E : int
        var_7_9D : double
        var_9_CE : double
        var_3_E0 : int
        var_11_F1 : int
        var_14_11B : double
        var_16_11F : int
        var_12_117 : double
        var_17_6B2 : int
        
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
        var_3_6A7 = and:int(ldc:int(-818713496), ldc:int(-952108680))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u64ab\u3504\ub7dc\u0800\u93a2\ub113[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0177)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4096)), ldc:int(0))) {
            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(279164700))
        }
        else {
            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-700482394))
            var_5_87 = and:int(ldc:int(20548), ldc:int(-20549))
            var_6_8E = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9D = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-32459), ldc:int(24256)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E0 = and:int(var_3_6A7:int, ldc:int(-406980060))
                    var_9_CE = sub:double(var_7_9D:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F1 = var_5_87:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F1:int, sub:int(var_6_8E:int, and:int(ldc:int(321), ldc:int(1065)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F1:int, and:int(ldc:int(1041), ldc:int(2351)))), var_7_9D:double))) {
                        inc:int(var_11_F1, ldc:int(1))
                    }
                    
                    var_3_6A7 = and:int(var_3_E0:int, ldc:int(-809650131))
                    var_14_11B = var_7_9D:double
                    var_16_11F = var_11_F1:int
                }
                else {
                    var_11_F1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_87:int), xor:int(ldc:int(18976), ldc:int(18977)))
                    var_12_117 = var_14_11B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_87)
                    
                    if (cmplt:boolean(var_16_11F = var_11_F1:int, var_6_8E:int)) {
                        var_9_CE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F1:int)
                        var_16_11F = var_11_F1:int
                        var_14_11B = var_12_117:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1286675573))
                        goto(Label_1592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(609344665))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0980)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1777390085))
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1019836704))
                    }
                    else {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-9099033))
                        
                        if (cmplt:boolean(var_16_11F:int, var_6_8E:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0583)
                            }
                            
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0417:
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-754408134))
                        goto(Label_1592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0980)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(879737671))
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-274218096))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1539805822))
                            loopcontinue()
                        }
                        
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-671614301))
                        var_11_F1 = and:int(ldc:int(22864), ldc:int(-22865))
                        goto(Label_1581)
                    }
                    
                    Label_0583:
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1406689651))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(2082967596))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1971619640))
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0980)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0846)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(987726583))
                            loopcontinue()
                        }
                        
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-826971725))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11B = var_9_CE:double
                            goto(Label_0846)
                        }
                    }
                    
                    Label_0707:
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1948736177))
                        goto(Label_1592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1315285032))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-348133597))
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0980)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(395542346))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1682330331))
                            loopcontinue()
                        }
                        
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-567149391))
                        var_14_11B = mul:double(ldc:double(0.5), add:double(var_9_CE:double, var_14_11B:double))
                    }
                    
                    Label_0846:
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1660177601))
                        goto(Label_1592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1156363363))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(811667953))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-813213813))
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1828705260))
                            loopcontinue()
                        }
                        
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-948077903))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_87:int), var_7_9D:double)) {
                                var_11_F1 = and:int(ldc:int(17705), ldc:int(2179))
                                goto(Label_1140)
                            }
                        }
                    }
                    
                    Label_0980:
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-58448829))
                        goto(Label_1592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1919264919))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1900880923))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0707)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(593019011))
                            loopcontinue()
                        }
                        
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-537707276))
                        var_11_F1 = and:int(ldc:int(-23766), ldc:int(7361))
                    }
                    
                    Label_1140:
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1485873776))
                        goto(Label_1592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1330371052))
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1896979131))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(32)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-2041277645))
                            goto(Label_0980)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-2032402785))
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(749905195))
                            goto(Label_0417)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-29905742))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F1:int, ldc:int(0))) {
                                goto(Label_1427)
                            }
                        }
                    }
                    
                    Label_1283:
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1592)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1961122547))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(2047632631))
                            goto(Label_1140)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0980)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1025602527))
                            goto(Label_0846)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1488588344))
                            goto(Label_0707)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-935228144))
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0417)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-700710982))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11B:double, var_5_87:int, var_16_11F:int)
                            goto(Label_1581)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1427:
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-1773071089))
                        goto(Label_1592)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(118419747))
                        goto(Label_1283)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0980)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(704532950))
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1537707548))
                        goto(Label_0707)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-25200433))
                        goto(Label_0417)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1915686417))
                        loopcontinue()
                    }
                    
                    var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-289441030))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11B:double, ldc:double(0.0))
                    Label_1581:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B2 = var_5_87:int
                        
                        if (cmpeq:boolean(var_11_F1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1592:
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-548172903))
                        goto(Label_1283)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1140)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1524356357))
                        goto(Label_0980)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1126954735))
                        goto(Label_0846)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0707)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(992511044))
                        goto(Label_0417)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A7:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-537020043))
                        var_17_6B2 = add:int(var_16_11F:int, xor:int(ldc:int(-32509), ldc:int(-32510)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6A7 = and:int(var_3_6A7:int, ldc:int(-419692873))
                
                if (cmple:boolean(var_5_87 = var_17_6B2:int, sub:int(var_6_8E:int, and:int(ldc:int(13327), ldc:int(16401))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0177:
        
        if (cmpeq:boolean(and:int(var_3_6A7:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_6A7 = and:int(var_3_6A7:int, ldc:int(1462459428))
            goto(Label_0106)
        }
    }
}
