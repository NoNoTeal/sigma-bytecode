public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u9af2\ua3b4\u4f52\u7bad\u4d85 {
    public void \u9af2\ua3b4\u4f52\u7bad\u4d85(\u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p0, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p1, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p2, \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d p3, boolean p4) {
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
            invokespecial:Object(Object::<init>, this:\u9af2\ua3b4\u4f52\u7bad\u4d85)
            putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u9af2\ua3b4\u4f52\u7bad\u4d85::\ucb79\u99f7\u92ee\u946b\u92ee\u392e, this:\u9af2\ua3b4\u4f52\u7bad\u4d85, p0:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u9af2\ua3b4\u4f52\u7bad\u4d85::\u5654\u6d99\u99f7\u8d90\ub6ab\u6d99, this:\u9af2\ua3b4\u4f52\u7bad\u4d85, p1:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u9af2\ua3b4\u4f52\u7bad\u4d85::\ub19c\u7ce1\u7330\uc2e8\uc29a\u6cfe, this:\u9af2\ua3b4\u4f52\u7bad\u4d85, p2:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            putfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u9af2\ua3b4\u4f52\u7bad\u4d85::\u98a4\u527a\ufcaf\u983f\u62da\uc229, this:\u9af2\ua3b4\u4f52\u7bad\u4d85, p3:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d)
            putfield:boolean(\u9af2\ua3b4\u4f52\u7bad\u4d85::\u4975\u92ee\ucb79\u6d69\u7e3f\ud36e, this:\u9af2\ua3b4\u4f52\u7bad\u4d85, p4:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\ubff1\u9255\u7d52\u7873\u47c2\u8258$5(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.lang.Boolean lambda$\u3776\u12cb\u62da\u927d\u494c\u7ce1$4(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u9af2\ua3b4\u4f52\u7bad\u4d85 p0) {
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
            return:Boolean(invokestatic:Boolean(Boolean::valueOf, getfield:boolean(\u9af2\ua3b4\u4f52\u7bad\u4d85::\u4975\u92ee\ucb79\u6d69\u7e3f\ud36e, p0:\u9af2\ua3b4\u4f52\u7bad\u4d85)))
        }
        
        goto(Label_0006)
    }
    
    private static \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d lambda$\u8aa5\u8413\u5f50\ufe34\u8bb0\u7ce1$3(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u9af2\ua3b4\u4f52\u7bad\u4d85 p0) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u9af2\ua3b4\u4f52\u7bad\u4d85::\u98a4\u527a\ufcaf\u983f\u62da\uc229, p0:\u9af2\ua3b4\u4f52\u7bad\u4d85))
        }
        
        goto(Label_0006)
    }
    
    private static \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d lambda$\u9033\ufe34\ud7e8\ud4fe\u71f1\u71ae$2(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u9af2\ua3b4\u4f52\u7bad\u4d85 p0) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u9af2\ua3b4\u4f52\u7bad\u4d85::\ub19c\u7ce1\u7330\uc2e8\uc29a\u6cfe, p0:\u9af2\ua3b4\u4f52\u7bad\u4d85))
        }
        
        goto(Label_0006)
    }
    
    private static \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d lambda$\uc910\u4ab3\u8c8a\uc87f\u6bb9\ud171$1(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u9af2\ua3b4\u4f52\u7bad\u4d85 p0) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u9af2\ua3b4\u4f52\u7bad\u4d85::\u5654\u6d99\u99f7\u8d90\ub6ab\u6d99, p0:\u9af2\ua3b4\u4f52\u7bad\u4d85))
        }
        
        goto(Label_0006)
    }
    
    private static \u5245\u8aa5\u61a4\u7049\u4cd9.\u8413\u7e3f\uc910\uf94d\u5654\u6b0d lambda$\ub102\uc9f6\u16f6\u8753\uff55\u983f$0(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u9af2\ua3b4\u4f52\u7bad\u4d85 p0) {
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
            return:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(getfield:\u8413\u7e3f\uc910\uf94d\u5654\u6b0d(\u9af2\ua3b4\u4f52\u7bad\u4d85::\ucb79\u99f7\u92ee\u946b\u92ee\u392e, p0:\u9af2\ua3b4\u4f52\u7bad\u4d85))
        }
        
        goto(Label_0006)
    }
    
    static {
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
    
    public void \ufcaf\u3711\ua6bd\u34df\u983f\u873d(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_621 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_62C : int
        
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
        var_3_621 = and:int(ldc:int(1161098095), ldc:int(1157998959))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9af2\ua3b4\u4f52\u7bad\u4d85[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
            var_3_621 = and:int(var_3_621:int, ldc:int(1297392093))
            var_5_80 = and:int(ldc:int(817), ldc:int(-25460))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-25249), ldc:int(25248)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_621:int, ldc:int(-319834803))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, xor:int(ldc:int(-32760), ldc:int(-32759)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, xor:int(ldc:int(2050), ldc:int(2051)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_621 = and:int(var_3_D0:int, ldc:int(1843715439))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(10), ldc:int(11)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1466163761))
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(64)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(460850245))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0535)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-946675012))
                    }
                    else {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1154862077))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0535)
                            }
                            
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(812628200))
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1518877459))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-843597313))
                            var_11_E1 = and:int(ldc:int(761), ldc:int(-764))
                            goto(Label_1465)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0535:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(2116536031))
                        goto(Label_1476)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(535193548))
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1154044679))
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-2109631944))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1803664271))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1535906554))
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(1411231615))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0816)
                        }
                    }
                    
                    Label_0678:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1003601373))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(782295207))
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-2108173368))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0535)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1849800698))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-312858217))
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(1471145341))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0816:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(64)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-2126633296))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(2002614989))
                            goto(Label_0535)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(64)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(-192047779))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = xor:int(ldc:int(2584), ldc:int(2585))
                                goto(Label_1085)
                            }
                        }
                    }
                    
                    Label_0920:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-167083995))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1714427374))
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1729508770))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(304797666))
                            goto(Label_0535)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1585256240))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(2131151311))
                        var_11_E1 = and:int(ldc:int(-5223), ldc:int(5158))
                    }
                    
                    Label_1085:
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(1638994556))
                        goto(Label_1339)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0920)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(311813513))
                            goto(Label_0816)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0678)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0535)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(1173781563))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-1664084135))
                            loopcontinue()
                        }
                        
                        var_3_621 = and:int(var_3_621:int, ldc:int(1165345229))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1339)
                            }
                        }
                    }
                    
                    Label_1207:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1544179880))
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1085)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(1484832172))
                            goto(Label_0920)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0816)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-84870621))
                            goto(Label_0678)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-255471240))
                            goto(Label_0535)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_621 = and:int(var_3_621:int, ldc:int(-411793953))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                            goto(Label_1465)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1339:
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1476)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(925342175))
                        goto(Label_1207)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-1874385453))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-53815847))
                        loopcontinue()
                    }
                    
                    var_3_621 = and:int(var_3_621:int, ldc:int(1953795919))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1465:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_62C = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1476:
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1339)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1207)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0920)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-505485628))
                        goto(Label_0816)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0678)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(8)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(767597484))
                        goto(Label_0535)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_621:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_621:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_621 = and:int(var_3_621:int, ldc:int(-601561235))
                        var_17_62C = add:int(var_16_10F:int, xor:int(ldc:boolean(0), ldc:boolean(1)))
                        looporswitchbreak()
                    }
                }
                
                var_3_621 = and:int(var_3_621:int, ldc:int(-959666737))
                
                if (cmple:boolean(var_5_80 = var_17_62C:int, sub:int(var_6_87:int, xor:int(ldc:int(520), ldc:int(521))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpne:boolean(and:int(var_3_621:int, ldc:int(64)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
