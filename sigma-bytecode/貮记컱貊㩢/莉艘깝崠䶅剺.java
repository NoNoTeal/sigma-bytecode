public class \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8389\u8258\uae5d\u5d20\u4d85\u527a {
    public void \u8389\u8258\uae5d\u5d20\u4d85\u527a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u34df\ub113\u6c56\u97e6\u51b2\u4c2b p2) {
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
    
    private void \u59ec\u16f6\u99f7\ud4fe\u7d52\u99f7(java.lang.String p0) {
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
            
            if (cmpne:boolean(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), aconstnull:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1())) {
                invokestatic:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u183a\u3dd3\u59ec\u6b0d\ud217\u7e3f, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), p0:String)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.lang.String \uc2e8\u72f1\u5db4\uff55\ubded\u9937() {
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
            return:String(ternaryop:String(cmpeq:boolean(getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), aconstnull:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1()), loadelement:String(getstatic:String[](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6b5f\u3dd3\u927d\u4c2b\u516c\u3dd3), and:int(ldc:int(-2812), ldc:int(2793))), invokestatic:String(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u071d\uceb8\u3a62\u47c2\ua61f\u3dd3, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))))
        }
        
        goto(Label_0006)
    }
    
    private int \u9a18\u51fa\u3d64\u16f6\u52d3\u8389() {
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
            return:int(invokeinterface:int(List<E>::size, getfield:List<String>(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u494c\u74b1\uc229\u0b8e\u6b0d\u647c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)))
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
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u759a\uc87f\u5140\ud36e\u12cb\ubcb0, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006])
            putfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u965f\u3776\u92ff\u97b7\u3dd3\u8258, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, add:int(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u965f\u3776\u92ff\u97b7\u3dd3\u8258, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), xor:int(ldc:int(1100), ldc:int(1101))))
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
    
    private void \ud523\u7006\u5140\u446c\u74b1\u71ae() {
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
            
            if (cmpgt:boolean(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), ldc:int(0))) {
                putfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, sub:int(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), and:int(ldc:int(10891), ldc:int(1125))))
            }
            
            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u67d0\u3a62\ua562\u6ec6\ud171\uc29a, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u4ab3\uff55\u71f1\u516c\u120d\u3504, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ubb2b\u759a\u56bd\ub6ab\ua3b4\uafe7() {
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
            var_1_61 = and:int(ldc:int(-1907307260), ldc:int(1928718204))
            
            if (cmpge:boolean(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), sub:int(invokespecial:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u9a18\u51fa\u3d64\u16f6\u52d3\u8389, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), and:int(ldc:int(2049), ldc:int(67))))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(1918539524))
                invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u392e\uc7fe\u8753\u12b2\u3776\u836c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
                
                if (cmplt:boolean(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), sub:int(invokespecial:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u9a18\u51fa\u3d64\u16f6\u52d3\u8389, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), xor:int(ldc:int(16400), ldc:int(16401))))) {
                    putfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, add:int(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), and:int(ldc:int(16385), ldc:int(13331))))
                }
            }
            else {
                putfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, add:int(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), and:int(ldc:int(8209), ldc:int(18785))))
            }
            
            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u67d0\u3a62\ua562\u6ec6\ud171\uc29a, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u4ab3\uff55\u71f1\u516c\u120d\u3504, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
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
            invokevirtual:void(\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe::\u7bad\ub171\u61a4\ubff1\u6d69\u6cfe, getfield:\ube23\u3bc9\u6ec6\u0a06\ua61f\uc7fe(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u760c\u156b\u6435\u76bc\u9033\u392e, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)), and:int[expected:boolean](ldc:int(22041), ldc:int(-24222)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u67d0\u3a62\ua562\u6ec6\ud171\uc29a() {
        var_1_7A : int
        stack_F4_0 : \u72f1\uc229\u98a4\uc87f\u0b8e\u52d3 [generated]
        stack_AC_0 : \u72f1\uc229\u98a4\uc87f\u0b8e\u52d3 [generated]
        stack_F4_1 : int [generated]
        stack_AC_1 : int [generated]
        var_1_129 : int
        stack_19D_0 : \u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d [generated]
        stack_14D_0 : \u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d [generated]
        stack_20A_0 : \u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d [generated]
        stack_19D_1 : int [generated]
        stack_14D_1 : int [generated]
        var_1_1EE : int
        stack_20A_1 : int [generated]
        
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
        var_1_7A = and:int(ldc:int(-1955404571), ldc:int(-1387892107))
        stack_F4_0 = stack_AC_0 = getfield(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u3d4b\u3776\u9a18\u1187\u92ff\u8640, this)
        
        if (logicalnot:boolean(getfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8d98\u983f\ud158\u3d64\u873d\uc229, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))) {
            if (cmpgt:boolean(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), ldc:int(0))) {
                stack_F4_1 = stack_AC_1 = and(ldc(20481), ldc(11665))
                goto(Label_0158)
            }
        }
        
        Label_0109:
        
        if (cmpeq:boolean(and:int(var_1_7A:int, ldc:int(134217728)), ldc:int(0))) {
            goto(Label_0186)
        }
        
        var_1_7A = and:int(var_1_7A:int, ldc:int(-81383563))
        stack_F4_1 = stack_AC_1 = and(ldc(-4517), ldc(4516))
        Label_0158:
        
        if (cmpeq:boolean(and:int(var_1_7A:int, ldc:int(2147483647)), ldc:int(0))) {
            goto(Label_0230)
        }
        
        var_1_7A = and:int(var_1_7A:int, ldc:int(-1121678943))
        putfield:boolean(\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, stack_AC_0:\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3, stack_AC_1:boolean)
        stack_F4_0 = stack_AC_0 = getfield(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ucef1\uceb8\u8389\u6fb0\u7c6b\u6198, this)
        
        if (logicalnot:boolean(getfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8d98\u983f\ud158\u3d64\u873d\uc229, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))) {
            stack_F4_1 = stack_AC_1 = and(ldc(4105), ldc(25219))
            goto(Label_0230)
        }
        
        Label_0186:
        
        if (cmpne:boolean(and:int(var_1_7A:int, ldc:int(268435456)), ldc:int(0))) {
            var_1_7A = and:int(var_1_7A:int, ldc:int(-1389114834))
            goto(Label_0109)
        }
        
        var_1_7A = and:int(var_1_7A:int, ldc:int(-1183212939))
        stack_F4_1 = stack_AC_1 = and(ldc(-2672), ldc(2607))
        Label_0230:
        
        if (cmpeq:boolean(and:int(var_1_7A:int, ldc:int(67108864)), ldc:int(0))) {
            var_1_129 = and:int(var_1_7A:int, ldc:int(-1645988751))
            putfield:boolean(\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, stack_F4_0:\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3, stack_F4_1:boolean)
            stack_19D_0 = stack_14D_0 = stack_20A_0 = getfield(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u7bad\u9033\u7e3f\uc2bd\ufe34\ub6ab, this)
            
            if (logicalnot:boolean(getfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8d98\u983f\ud158\u3d64\u873d\uc229, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))) {
                stack_19D_1 = stack_14D_1 = xor(ldc(10528), ldc(10529))
                goto(Label_0319)
            }
            
            Label_0258:
            
            if (cmpne:boolean(and:int(var_1_129:int, ldc:int(67108864)), ldc:int(0))) {
                var_1_1EE = and:int(var_1_129:int, ldc:int(-229802968))
                goto(Label_0455)
            }
            
            if (cmpne:boolean(and:int(var_1_129:int, ldc:int(1073741824)), ldc:int(0))) {
                var_1_129 = and:int(var_1_129:int, ldc:int(-1773292484))
                goto(Label_0347)
            }
            
            var_1_129 = and:int(var_1_129:int, ldc:int(-1356013769))
            stack_19D_1 = stack_14D_1 = and(ldc(11748), ldc(-28160))
            Label_0319:
            
            if (cmpne:boolean(and:int(var_1_129:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0399)
            }
            
            var_1_129 = and:int(var_1_129:int, ldc:int(-1390492309))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, stack_14D_0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, stack_14D_1:boolean)
            stack_19D_0 = stack_14D_0 = stack_20A_0 = getfield(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ua61f\u8d98\u88c5\u88c5\u12b2\ucef1, this)
            
            if (logicalnot:boolean(getfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8d98\u983f\ud158\u3d64\u873d\uc229, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))) {
                stack_19D_1 = stack_14D_1 = and(ldc(6609), ldc(8739))
                goto(Label_0399)
            }
            
            Label_0347:
            
            if (cmpeq:boolean(and:int(var_1_129:int, ldc:int(134217728)), ldc:int(0))) {
                var_1_1EE = and:int(var_1_129:int, ldc:int(-1701224221))
                goto(Label_0455)
            }
            
            if (cmpeq:boolean(and:int(var_1_129:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_0258)
            }
            
            var_1_129 = and:int(var_1_129:int, ldc:int(-1107555359))
            stack_19D_1 = stack_14D_1 = and(ldc(3373), ldc(-3568))
            Label_0399:
            
            if (cmpne:boolean(and:int(var_1_129:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0319)
            }
            
            var_1_1EE = and:int(var_1_129:int, ldc:int(-1684011991))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, stack_19D_0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, stack_19D_1:boolean)
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u36d3\u8c8a\u3e2a\u839e\u6c56\u72f1, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), getfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8d98\u983f\ud158\u3d64\u873d\uc229, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\u92ee\u5654\u5f50\u6c56\u6b0d\uf94d, getfield:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8308\ua068\uc910\uf9c5\ubf56\u965f, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), getfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8d98\u983f\ud158\u3d64\u873d\uc229, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))
            stack_19D_0 = stack_14D_0 = stack_20A_0 = getfield(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8308\ua068\uc910\uf9c5\ubf56\u965f, this)
            
            if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, invokevirtual:String(String::trim, getfield:String(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u5140\u600f\u5fe1\u416d\u9af2\ud36e, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))))) {
                stack_20A_1 = xor:int[expected:boolean](ldc:int(18452), ldc:int(18453))
                goto(Label_0516)
            }
            
            Label_0455:
            
            if (cmpne:boolean(and:int(var_1_1EE:int, ldc:int(512)), ldc:int(0))) {
                var_1_129 = and:int(var_1_1EE:int, ldc:int(1866347809))
                goto(Label_0347)
            }
            
            if (cmpne:boolean(and:int(var_1_1EE:int, ldc:int(8)), ldc:int(0))) {
                var_1_129 = and:int(var_1_1EE:int, ldc:int(962868825))
                goto(Label_0258)
            }
            
            var_1_1EE = and:int(var_1_1EE:int, ldc:int(-1950009375))
            stack_20A_1 = and:int[expected:boolean](ldc:int(-18423), ldc:int(18242))
            Label_0516:
            putfield:boolean(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uf995\ub102\u9255\ucfaf\ucfaf\u7330, stack_20A_0:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d, stack_20A_1:boolean)
            return:void()
        }
        
        goto(Label_0158)
    }
    
    private void \u120d\u47c2\u120d\uc29a\u8753\u8413() {
        var_1_61 : int
        var_3_74 : ListIterator<String>
        
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
            var_1_61 = and:int(ldc:int(-1483200420), ldc:int(-273109250))
            var_3_74 = invokeinterface:ListIterator<String>(List<String>::listIterator, getfield:List<String>(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u494c\u74b1\uc229\u0b8e\u6b0d\u647c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), invokeinterface:int(List<E>::size, getfield:List<String>(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u494c\u74b1\uc229\u0b8e\u6b0d\u647c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(-23717635))
                
                if (logicalnot:boolean(logicaland:boolean(invokeinterface:boolean(ListIterator<E>::hasPrevious, var_3_74:ListIterator<String>), invokevirtual:boolean(String::isEmpty, checkcast:String(java.lang.String.class, invokeinterface:String(ListIterator<String>::previous, var_3_74:ListIterator<String>)))))) {
                    looporswitchbreak()
                }
                
                invokeinterface:void(ListIterator<E>::remove, var_3_74:ListIterator<String>)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \uae5d\u960f\u3e2a\uc4d2\u3bd6\u983f(boolean p0) {
        var_2_112 : int
        var_4_7F : \ud158\u8308\u76bc\u0a06\ud36e
        stack_189_0 : int [generated]
        
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
            var_2_112 = and:int(ldc:int(896797434), ldc:int(842325745))
            
            if (getfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u516c\u392e\u62da\uc229\ud7e8\ucb79, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)) {
                invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u120d\u47c2\u120d\uc29a\u8753\u8413, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
                var_4_7F = initobject:\ud158\u8308\u76bc\u0a06\ud36e(\ud158\u8308\u76bc\u0a06\ud36e::<init>)
                invokeinterface:void(Stream<Object>::forEach, invokeinterface:Stream<Object>(Stream<Object>::map, invokeinterface:Stream<Object>(Collection<Object>::stream, getfield:List<String>[expected:Collection<Object>](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u494c\u74b1\uc229\u0b8e\u6b0d\u647c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)), invokedynamic:Function<String, \u9033\ucef1\u12b2\ua3b4\u6cfe>(apply:()Ljava/util/function/Function;)), invokedynamic:Consumer<Object>(accept:(L\u36d3\u9033\u6b0d\u983f\u8d90/\ud158\u8308\u76bc\u0a06\ud36e;)Ljava/util/function/Consumer;, var_4_7F:\ud158\u8308\u76bc\u0a06\ud36e))
                
                if (logicalnot:boolean(invokeinterface:boolean(List<E>::isEmpty, getfield:List<String>(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u494c\u74b1\uc229\u0b8e\u6b0d\u647c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)))) {
                    invokevirtual:void(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u6b0d\uc2bd\u0800\u71ae\ub19c\u5654, getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ua562\u34df\u7873\ub102\u9a18\uc9f6, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), loadelement:String(getstatic:String[](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6b5f\u3dd3\u927d\u4c2b\u516c\u3dd3), xor:int(ldc:int(16584), ldc:int(16585))), var_4_7F:\ud158\u8308\u76bc\u0a06\ud36e[expected:\u93a2\u97b7\u647c\ud36e\u64ab])
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_2_112:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0244)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_112:int, ldc:int(268435456)), ldc:int(0))) {
                        var_2_112 = and:int(var_2_112:int, ldc:int(2046192366))
                        
                        if (p0:boolean) {
                            invokevirtual:void(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u6b0d\uc2bd\u0800\u71ae\ub19c\u5654, getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ua562\u34df\u7873\ub102\u9a18\uc9f6, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), loadelement:String(getstatic:String[](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6b5f\u3dd3\u927d\u4c2b\u516c\u3dd3), xor:int(ldc:int(4129), ldc:int(4132))), invokestatic:\u9033\ucef1\u12b2\ua3b4\u6cfe[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\u9033\ucef1\u12b2\ua3b4\u6cfe::\ud171\u5f50\ud158\uc229\u6fb0\u7006, invokevirtual:String(GameProfile::getName, invokevirtual:GameProfile(\ua3b4\u8aa5\ub113\ubf56\u873d::\ud158\u385b\u3dd3\u4e72\ud171\ub102, getfield:\ua3b4\u8aa5\ub113\ubf56\u873d(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u3e75\u52d3\u836c\u97b7\u8aa5\u93a2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)))))
                            invokevirtual:void(\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56::\u6b0d\uc2bd\u0800\u71ae\ub19c\u5654, getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ua562\u34df\u7873\ub102\u9a18\uc9f6, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), loadelement:String(getstatic:String[](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6b5f\u3dd3\u927d\u4c2b\u516c\u3dd3), xor:int(ldc:int(12297), ldc:int(12303))), invokestatic:\u9033\ucef1\u12b2\ua3b4\u6cfe[expected:\u93a2\u97b7\u647c\ud36e\u64ab](\u9033\ucef1\u12b2\ua3b4\u6cfe::\ud171\u5f50\ud158\uc229\u6fb0\u7006, invokevirtual:String(String::trim, getfield:String(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u5140\u600f\u5fe1\u416d\u9af2\ud36e, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))))
                        }
                    }
                    
                    Label_0203:
                    
                    if (cmpne:boolean(and:int(var_2_112:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_112 = and:int(var_2_112:int, ldc:int(918771737))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_112:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_112 = and:int(var_2_112:int, ldc:int(-1799409679))
                        
                        if (cmpeq:boolean(getfield:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u97e6\u4492\u446c\uc31c\u3e75\u946b, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), getstatic:\u34df\ub113\u6c56\u97e6\u51b2\u4c2b(\u34df\ub113\u6c56\u97e6\u51b2\u4c2b::\uc238\u120d\u516c\u446c\u51fa\u40a9))) {
                            stack_189_0 = getfield:int(\u0b8e\ud4fe\uc229\u92ee\ud4fe::\u0800\u946b\u4c04\u494c\u4c04\u527a, getfield:\u0b8e\ud4fe\uc229\u92ee\ud4fe(\ua3b4\u8aa5\ub113\ubf56\u873d::\u64f2\u93a2\ub70c\uafe7\u5f50\u5bc4, getfield:\ua3b4\u8aa5\ub113\ubf56\u873d(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u3e75\u52d3\u836c\u97b7\u8aa5\u93a2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)))
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0244:
                    
                    if (cmpeq:boolean(and:int(var_2_112:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_112 = and:int(var_2_112:int, ldc:int(-611920017))
                        goto(Label_0203)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_112:int, ldc:int(2048)), ldc:int(0))) {
                        var_2_112 = and:int(var_2_112:int, ldc:int(-1682051345))
                        stack_189_0 = ldc:int(40)
                        looporswitchbreak()
                    }
                }
                
                var_2_112 = and:int(var_2_112:int, ldc:int(283574264))
                invokevirtual:void(\u527a\u873d\u071d\u4f52\uc229\ud217::\u88c5\u4975\u6d69\u0b8e\u516c\uc246, invokevirtual:\u527a\u873d\u071d\u4f52\uc229\ud217(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u983f\u4492\u600f\u6bb9\uafe7\u183a, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)), initobject:\u97e6\u92ee\u0800\u7873\u8bb0(\u97e6\u92ee\u0800\u7873\u8bb0::<init>, getfield:\u5fe1\u34df\u7d52\ubefe\uc7fe\ubf56(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ua562\u34df\u7873\ub102\u9a18\uc9f6, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), p0:boolean, stack_189_0:int))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u392e\uc7fe\u8753\u12b2\u3776\u836c() {
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
            
            if (cmplt:boolean(invokespecial:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u9a18\u51fa\u3d64\u16f6\u52d3\u8389, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), ldc:int(100))) {
                invokeinterface:boolean(List<String>::add, getfield:List<String>(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u494c\u74b1\uc229\u0b8e\u6b0d\u647c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), loadelement:String(getstatic:String[](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6b5f\u3dd3\u927d\u4c2b\u516c\u3dd3), and:int(ldc:int(-642), ldc:int(641))))
                putfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u516c\u392e\u62da\uc229\ud7e8\ucb79, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, xor:int[expected:boolean](ldc:int(4098), ldc:int(4099)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \uc229\u3a62\u12cb\ud51e\uafe7\u8308(int p0, int p1, int p2) {
        var_4_7E : int
        
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
        var_4_7E = and:int(ldc:int(1571137850), ldc:int(1698438611))
        
        if (invokespecial:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:int, p1:int, p2:int)) {
            return:boolean(xor:int[expected:boolean](ldc:int(16712), ldc:int(16713)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_4_7E:int, ldc:int(256)), ldc:int(0))) {
                var_4_7E = and:int(var_4_7E:int, ldc:int(-152260314))
                
                if (getfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8d98\u983f\ud158\u3d64\u873d\uc229, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)) {
                    return:boolean(invokespecial:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\uff55\ubff1\uc3e3\u7006\ud158\u9255, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, p0:int, p1:int, p2:int))
                }
            }
            
            if (cmpne:boolean(and:int(var_4_7E:int, ldc:int(524288)), ldc:int(0))) {
                var_4_7E = and:int(var_4_7E:int, ldc:int(-1674445215))
            }
            else {
                if (logicalnot:boolean(invokespecial:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u416d\u120d\ua61f\ud523\u8258\u7043, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, p0:int, p1:int, p2:int))) {
                    return:boolean(and:int[expected:boolean](ldc:int(9397), ldc:int(-29888)))
                }
                
                invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u3c25\u3e2a\u7873\u9a18\u8cae\u9a18, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
                return:boolean(and:int[expected:boolean](ldc:int(2305), ldc:int(16425)))
            }
        }
    }
    
    public boolean \ubb2b\ube23\u59ec\u61a4\u8753\uc4d2(char p0, int p1) {
        var_3_61 : int
        
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
        var_3_61 = and:int(ldc:int(-1659476527), ldc:int(-682170131))
        
        if (invokespecial:boolean(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\ubb2b\ube23\u59ec\u61a4\u8753\uc4d2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a[expected:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9], p0:char, p1:int)) {
            return:boolean(xor:int[expected:boolean](ldc:int(792), ldc:int(793)))
        }
        
        loop {
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(32768)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(25316987))
                goto(Label_0192)
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(262144)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(182086048))
            }
            else {
                var_3_61 = and:int(var_3_61:int, ldc:int(1073147101))
                
                if (getfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8d98\u983f\ud158\u3d64\u873d\uc229, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)) {
                    if (logicalnot:boolean(invokevirtual:boolean(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u71f1\u3504\u3bc9\uc2bd\u7c6b\ub19c, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u40a9\u76bc\u183a\uf94d\u0a06\u97e6, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), p0:char))) {
                        return:boolean(and:int[expected:boolean](ldc:int(-8478), ldc:int(8477)))
                    }
                    
                    invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u67d0\u3a62\ua562\u6ec6\ud171\uc29a, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
                    putfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u516c\u392e\u62da\uc229\ud7e8\ucb79, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, and:int[expected:boolean](ldc:int(29345), ldc:int(1301)))
                    return:boolean(and:int[expected:boolean](ldc:int(453), ldc:int(8195)))
                }
            }
            
            Label_0154:
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_3_61:int, ldc:int(8)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_61:int, ldc:int(-2115200697))
                    loopcontinue()
                }
                
                var_3_61 = and:int(var_3_61:int, ldc:int(14609635))
                
                if (invokestatic:boolean(\u527a\u8bb0\ud12e\u3c25\u6fb0\u6435::\u92ee\u36d3\u8389\u8d98\u92ff\u52d3, p0:char)) {
                    invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u1187\u3bd6\u0b8e\u4bc8\u385b\ucef1, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), invokestatic:String(Character::toString, p0:char))
                    invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u3c25\u3e2a\u7873\u9a18\u8cae\u9a18, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
                    return:boolean(xor:int[expected:boolean](ldc:int(16640), ldc:int(16641)))
                }
            }
            
            Label_0192:
            
            if (cmpne:boolean(and:int(var_3_61:int, ldc:int(4)), ldc:int(0))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-868886359))
                goto(Label_0154)
            }
            
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(32768)), ldc:int(0))) {
                return:boolean(and:int[expected:boolean](ldc:int(26886), ldc:int(-26887)))
            }
        }
    }
    
    private boolean \u416d\u120d\ua61f\ud523\u8258\u7043(int p0, int p1, int p2) {
        var_4_63 : int
        
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
        var_4_63 = and:int(ldc:int(-1527089157), ldc:int(-1526980614))
        
        loop {
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1647623904))
                goto(Label_7690)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_7336)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_6957)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1274827211))
                goto(Label_6622)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_6279)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-782478173))
                goto(Label_5936)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_5553)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-641108241))
                goto(Label_5219)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(806435889))
                goto(Label_4921)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_4574)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_4084)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_3717)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1236703683))
                goto(Label_3379)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-667298744))
                goto(Label_3022)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(218323622))
                goto(Label_2666)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(49249394))
                goto(Label_2372)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1940448540))
                goto(Label_2048)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1462398779))
                goto(Label_1725)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_1420)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_1096)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1116205463))
                goto(Label_0740)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(2130219007))
                
                if (logicalnot:boolean(invokestatic:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u36d3\uae5d\u1833\u3bc9\u392e\u9a18, p0:int))) {
                    if (invokestatic:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u624e\u3a62\u6ec6\u8d90\ube23\u4daf, p0:int)) {
                        goto(Label_1420)
                    }
                    
                    if (invokestatic:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u12b2\u4ab3\u7330\uf94d\u8aa5\u4bc8, p0:int)) {
                        goto(Label_2372)
                    }
                    
                    if (invokestatic:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uceb8\u67d0\ua6bd\u76bc\u120d\ubded, p0:int)) {
                        goto(Label_3379)
                    }
                    
                    switch (p0:int) {
                        case 257:
                        case 335:
                            invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u1187\u3bd6\u0b8e\u4bc8\u385b\ucef1, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), loadelement:String(getstatic:String[](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6b5f\u3dd3\u927d\u4c2b\u516c\u3dd3), and:int(ldc:int(5895), ldc:int(2247))))
                            goto(Label_4574)
                        
                        case 259:
                            invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\uc229\u62da\ubefe\uc29a\uf9c5\u392e, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), ldc:int(-1))
                            goto(Label_4921)
                        
                        case 261:
                            invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\uc229\u62da\ubefe\uc29a\uf9c5\u392e, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), xor:int(ldc:int(-32622), ldc:int(-32621)))
                            goto(Label_5219)
                        
                        case 262:
                            invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\ubefe\u8aa5\u7bad\uc7fe\u7043\u8df4, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), xor:int(ldc:int(10260), ldc:int(10261)), invokestatic:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u40a9\u8350\ud12e\u8258\u0a06\ub7dc))
                            goto(Label_5553)
                        
                        case 263:
                            invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\ubefe\u8aa5\u7bad\uc7fe\u7043\u8df4, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), ldc:int(-1), invokestatic:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u40a9\u8350\ud12e\u8258\u0a06\ub7dc))
                            goto(Label_5936)
                        
                        case 264:
                            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u4f52\ub32d\ud51e\u527a\u8d90\u5d20, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
                            goto(Label_6279)
                        
                        case 265:
                            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u36d3\u7049\u4ab3\uc3e3\ua068\u5fe1, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
                            goto(Label_6622)
                        
                        case 266:
                            invokevirtual:void(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uafe7\u47c2\u6c56\u4bc8\uc84e\u8709, getfield:\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3[expected:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u3d4b\u3776\u9a18\u1187\u92ff\u8640, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))
                            goto(Label_6957)
                        
                        case 267:
                            invokevirtual:void(\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d::\uafe7\u47c2\u6c56\u4bc8\uc84e\u8709, getfield:\u72f1\uc229\u98a4\uc87f\u0b8e\u52d3[expected:\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ucef1\uceb8\u8389\u6fb0\u7c6b\u6198, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))
                            goto(Label_7336)
                        
                        case 268:
                            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u156b\u56bd\u8d98\u8413\u647c\u9033, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
                            goto(Label_7690)
                        
                        case 269:
                            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ua3b4\u7873\u624e\u8bb0\u3776\uf94d, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
                            return:boolean(and:int[expected:boolean](ldc:int(16385), ldc:int(13)))
                        
                        default:
                            return:boolean(and:int[expected:boolean](ldc:int(-2721), ldc:int(2720)))
                    }
                }
            }
            
            Label_0446:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1373688907))
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_7336)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(2114202673))
                goto(Label_6957)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-548707084))
                goto(Label_6622)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_6279)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_5936)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_5553)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_5219)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(797096827))
                goto(Label_4921)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1919330668))
                goto(Label_4574)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_4084)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_3717)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_3379)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_3022)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(616765456))
                goto(Label_2666)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_2372)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-496637894))
                goto(Label_2048)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_1725)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1384980563))
                goto(Label_1420)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_1096)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(-1090824197))
            }
            
            Label_0740:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(853504443))
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_7336)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-415229368))
                goto(Label_6957)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1793746287))
                goto(Label_6622)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_6279)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_5936)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_5553)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-215376353))
                goto(Label_5219)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1119733858))
                goto(Label_4921)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(586312259))
                goto(Label_4574)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_4084)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_3717)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(60057685))
                goto(Label_3379)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1196531865))
                goto(Label_3022)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(386479520))
                goto(Label_2666)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1385129847))
                goto(Label_2372)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_2048)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_1725)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(15747746))
                goto(Label_1420)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1987038572))
            }
            else {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0446)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1254608277))
                    loopcontinue()
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(-1494026249))
                invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\uc4d2\u6c56\u3c25\u965f\u446c\ub8be, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))
            }
            
            Label_1096:
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(525505230))
                goto(Label_7336)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_6957)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-842238829))
                goto(Label_6622)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_6279)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_5936)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(705018810))
                goto(Label_5553)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(313618009))
                goto(Label_5219)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_4921)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_4574)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(2022500277))
                goto(Label_4084)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(880047172))
                goto(Label_3717)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_3379)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_3022)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1005299156))
                goto(Label_2666)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1454481729))
                goto(Label_2372)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_2048)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_1725)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(674583435))
                    goto(Label_0740)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0446)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    return:boolean(xor:int[expected:boolean](ldc:int(258), ldc:int(259)))
                }
                
                loopcontinue()
            }
            
            Label_1420:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(18917778))
                goto(Label_7336)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-519790349))
                goto(Label_6957)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_6622)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_6279)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_5936)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_5553)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_5219)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(821812381))
                goto(Label_4921)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(640640591))
                goto(Label_4574)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_4084)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1576427277))
                goto(Label_3717)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_3379)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1068328130))
                goto(Label_3022)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_2666)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1766283553))
                goto(Label_2372)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_2048)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1540305312))
                    goto(Label_1096)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0740)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0446)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(2070438059))
                    loopcontinue()
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(-320776202))
            }
            
            Label_1725:
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(966752742))
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(627349277))
                goto(Label_7336)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1154712472))
                goto(Label_6957)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(264983113))
                goto(Label_6622)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_6279)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_5936)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(611962138))
                goto(Label_5553)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_5219)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1961179792))
                goto(Label_4921)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1547197799))
                goto(Label_4574)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_4084)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_3717)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-179469307))
                goto(Label_3379)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-212489335))
                goto(Label_3022)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_2666)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_2372)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_1420)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1096)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_0740)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(708530971))
                    goto(Label_0446)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(-1125414926))
                invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u8bb0\ub18d\ua6bd\uc84e\u927d\u6c52, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))
            }
            
            Label_2048:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_7690)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_7336)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_6957)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_6622)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(394173585))
                goto(Label_6279)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_5936)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-416991727))
                goto(Label_5553)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_5219)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(329230685))
                goto(Label_4921)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(492358924))
                goto(Label_4574)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(2005437798))
                goto(Label_4084)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_3717)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_3379)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-894293640))
                goto(Label_3022)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_2666)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1612500045))
            }
            else {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_1725)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_1420)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1226172098))
                    goto(Label_1096)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(740840824))
                    goto(Label_0740)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_0446)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                    return:boolean(and:int[expected:boolean](ldc:int(4225), ldc:int(19035)))
                }
                
                loopcontinue()
            }
            
            Label_2372:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1740585153))
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(518220954))
                goto(Label_7336)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_6957)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_6622)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-128413792))
                goto(Label_6279)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_5936)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_5553)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_5219)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_4921)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(16560378))
                goto(Label_4574)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_4084)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_3717)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_3379)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1416171005))
                goto(Label_3022)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1287951061))
                    goto(Label_2048)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1273133571))
                    goto(Label_1725)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_1420)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_1096)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0740)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0446)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1353934788))
                    loopcontinue()
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(2147065846))
            }
            
            Label_2666:
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_7336)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(530366244))
                goto(Label_6957)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1915353224))
                goto(Label_6622)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1901795331))
                goto(Label_6279)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_5936)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_5553)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_5219)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1302369955))
                goto(Label_4921)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-316679013))
                goto(Label_4574)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1169257519))
                goto(Label_4084)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_3717)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_3379)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-767576254))
            }
            else {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_2372)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(34179523))
                    goto(Label_2048)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-797408462))
                    goto(Label_1725)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(2108817573))
                    goto(Label_1420)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-460491961))
                    goto(Label_1096)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0740)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1323732346))
                    goto(Label_0446)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(2033391099))
                    loopcontinue()
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(-1477046274))
                invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\uc7fe\ub171\ub6ab\u7bad\ub18d\ub8be, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))
            }
            
            Label_3022:
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_7336)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_6957)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1980940976))
                goto(Label_6622)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(657797257))
                goto(Label_6279)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1342750571))
                goto(Label_5936)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_5553)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1467920256))
                goto(Label_5219)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1535851998))
                goto(Label_4921)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1733856230))
                goto(Label_4574)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_4084)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-224696235))
                goto(Label_3717)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-889906546))
            }
            else {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-422421521))
                    goto(Label_2666)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(257979685))
                    goto(Label_2372)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_2048)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1725)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1749325832))
                    goto(Label_1420)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_1096)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_0740)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(718188601))
                    goto(Label_0446)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    return:boolean(xor:int[expected:boolean](ldc:int(8992), ldc:int(8993)))
                }
                
                loopcontinue()
            }
            
            Label_3379:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_7336)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_6957)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_6622)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-689813806))
                goto(Label_6279)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(988578242))
                goto(Label_5936)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(736851972))
                goto(Label_5553)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_5219)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_4921)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-812619264))
                goto(Label_4574)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-443894725))
                goto(Label_4084)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-2077987193))
            }
            else {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_3022)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_2666)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1231870476))
                    goto(Label_2372)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(668665805))
                    goto(Label_2048)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-538045748))
                    goto(Label_1725)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_1420)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_1096)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1025092770))
                    goto(Label_0740)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1063607923))
                    goto(Label_0446)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(101639281))
                    loopcontinue()
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(1996253171))
            }
            
            Label_3717:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1738067978))
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1903614648))
                goto(Label_7336)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_6957)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-683762141))
                goto(Label_6622)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_6279)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_5936)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1222632187))
                goto(Label_5553)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1227433020))
                goto(Label_5219)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_4921)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_4574)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1354105261))
            }
            else {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1093276724))
                    goto(Label_3379)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(598121066))
                    goto(Label_3022)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(853979069))
                    goto(Label_2666)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(398830784))
                    goto(Label_2372)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_2048)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1483543785))
                    goto(Label_1725)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1631405767))
                    goto(Label_1420)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_1096)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0740)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1192093084))
                    goto(Label_0446)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-291966782))
                    loopcontinue()
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(-403124234))
                invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u3d64\ua6bd\u98a4\ubf56\u12cb\ud12e, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))
            }
            
            Label_4084:
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(225903183))
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_7336)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_6957)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1390494864))
                goto(Label_6622)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(522643938))
                goto(Label_6279)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(211349976))
                goto(Label_5936)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1758634941))
                goto(Label_5553)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-996559891))
                goto(Label_5219)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(327567902))
                goto(Label_4921)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_3717)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1510725653))
                    goto(Label_3379)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(335653113))
                    goto(Label_3022)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_2666)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-361766191))
                    goto(Label_2372)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-344138677))
                    goto(Label_2048)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_1725)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1868409544))
                    goto(Label_1420)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_1096)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1583232811))
                    goto(Label_0740)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0446)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                    return:boolean(xor:int[expected:boolean](ldc:int(3), ldc:int(2)))
                }
                
                loopcontinue()
            }
            
            Label_4574:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1296818976))
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-992636721))
                goto(Label_7336)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1591830278))
                goto(Label_6957)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_6622)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(531991476))
                goto(Label_6279)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_5936)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_5553)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_5219)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1263299932))
                    goto(Label_4084)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_3717)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1266436295))
                    goto(Label_3379)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_3022)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(523104205))
                    goto(Label_2666)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_2372)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(539753922))
                    goto(Label_2048)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_1725)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_1420)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1971436328))
                    goto(Label_1096)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_0740)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-270644392))
                    goto(Label_0446)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(762693534))
                    loopcontinue()
                }
                
                return:boolean(xor:int[expected:boolean](ldc:int(17), ldc:int(16)))
            }
            
            Label_4921:
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_7336)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                goto(Label_6957)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_6622)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-629862433))
                goto(Label_6279)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_5936)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_5553)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-900545581))
                    goto(Label_4574)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_4084)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_3717)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1432519912))
                    goto(Label_3379)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1346787664))
                    goto(Label_3022)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-230412514))
                    goto(Label_2666)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_2372)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_2048)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_1725)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(2009095778))
                    goto(Label_1420)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_1096)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_0740)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0446)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                    return:boolean(and:int[expected:boolean](ldc:int(1217), ldc:int(12807)))
                }
                
                loopcontinue()
            }
            
            Label_5219:
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1561316580))
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(234730453))
                goto(Label_7336)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1316417958))
                goto(Label_6957)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_6622)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(486515848))
                goto(Label_6279)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                goto(Label_5936)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_4921)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_4574)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_4084)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_3717)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_3379)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(830268380))
                    goto(Label_3022)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1438899974))
                    goto(Label_2666)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1496624929))
                    goto(Label_2372)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_2048)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_1725)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1773482098))
                    goto(Label_1420)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_1096)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0740)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(276485729))
                    goto(Label_0446)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                    return:boolean(xor:int[expected:boolean](ldc:int(8224), ldc:int(8225)))
                }
                
                loopcontinue()
            }
            
            Label_5553:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_7690)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1162316540))
                goto(Label_7336)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_6957)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1024234858))
                goto(Label_6622)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-500209860))
                goto(Label_6279)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(724514199))
                    goto(Label_5219)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_4921)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1853947430))
                    goto(Label_4574)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1324707204))
                    goto(Label_4084)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1639053156))
                    goto(Label_3717)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1690690405))
                    goto(Label_3379)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-423028482))
                    goto(Label_3022)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_2666)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1226479646))
                    goto(Label_2372)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1332136546))
                    goto(Label_2048)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(624722360))
                    goto(Label_1725)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-862492832))
                    goto(Label_1420)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1096)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-192682338))
                    goto(Label_0740)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0446)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    return:boolean(and:int[expected:boolean](ldc:int(65), ldc:int(21637)))
                }
                
                loopcontinue()
            }
            
            Label_5936:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_7690)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(2116354223))
                goto(Label_7336)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(629236159))
                goto(Label_6957)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(272286759))
                goto(Label_6622)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_5553)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_5219)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1491811306))
                    goto(Label_4921)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(230845366))
                    goto(Label_4574)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(296444653))
                    goto(Label_4084)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-182335291))
                    goto(Label_3717)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_3379)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1329069101))
                    goto(Label_3022)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_2666)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(84837232))
                    goto(Label_2372)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_2048)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_1725)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1575995486))
                    goto(Label_1420)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_1096)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(686413815))
                    goto(Label_0740)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_0446)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    return:boolean(and:int[expected:boolean](ldc:int(513), ldc:int(4249)))
                }
                
                loopcontinue()
            }
            
            Label_6279:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_7336)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_6957)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_5936)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-593370395))
                    goto(Label_5553)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1914025616))
                    goto(Label_5219)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1861825701))
                    goto(Label_4921)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_4574)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_4084)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-962370656))
                    goto(Label_3717)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_3379)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                    goto(Label_3022)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-158639711))
                    goto(Label_2666)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-555910419))
                    goto(Label_2372)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1835256516))
                    goto(Label_2048)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(507331881))
                    goto(Label_1725)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                    goto(Label_1420)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(384252824))
                    goto(Label_1096)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(924365422))
                    goto(Label_0740)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    goto(Label_0446)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1494668491))
                    loopcontinue()
                }
                
                return:boolean(xor:int[expected:boolean](ldc:int(8208), ldc:int(8209)))
            }
            
            Label_6622:
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-332276227))
                goto(Label_7690)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1329639112))
                goto(Label_7336)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_6279)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(854712677))
                    goto(Label_5936)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_5553)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_5219)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(856785908))
                    goto(Label_4921)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                    goto(Label_4574)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_4084)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1571257495))
                    goto(Label_3717)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(115303804))
                    goto(Label_3379)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    goto(Label_3022)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1427175987))
                    goto(Label_2666)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_2372)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_2048)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_1725)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(672713874))
                    goto(Label_1420)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-312891226))
                    goto(Label_1096)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0740)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                    goto(Label_0446)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-101453362))
                    loopcontinue()
                }
                
                return:boolean(xor:int[expected:boolean](ldc:int(20576), ldc:int(20577)))
            }
            
            Label_6957:
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                goto(Label_7690)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1786316724))
                    goto(Label_6622)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1775665419))
                    goto(Label_6279)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1097994074))
                    goto(Label_5936)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    goto(Label_5553)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-23802245))
                    goto(Label_5219)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1150758954))
                    goto(Label_4921)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1851229369))
                    goto(Label_4574)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                    goto(Label_4084)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_3717)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(373572085))
                    goto(Label_3379)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2)), ldc:int(0))) {
                    goto(Label_3022)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1795788596))
                    goto(Label_2666)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_2372)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(795813743))
                    goto(Label_2048)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1962098718))
                    goto(Label_1725)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(438837681))
                    goto(Label_1420)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-663138639))
                    goto(Label_1096)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1388712568))
                    goto(Label_0740)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-280202873))
                    goto(Label_0446)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    return:boolean(and:int[expected:boolean](ldc:int(1537), ldc:int(181)))
                }
                
                loopcontinue()
            }
            
            Label_7336:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1073066780))
            }
            else {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_6957)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(854788589))
                    goto(Label_6622)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_6279)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_5936)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(2061931896))
                    goto(Label_5553)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1944957634))
                    goto(Label_5219)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                    goto(Label_4921)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(286087062))
                    goto(Label_4574)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(36007542))
                    goto(Label_4084)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_3717)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_3379)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                    goto(Label_3022)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_2666)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                    goto(Label_2372)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1830694774))
                    goto(Label_2048)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1871533774))
                    goto(Label_1725)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-104242883))
                    goto(Label_1420)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2097152)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1290214693))
                    goto(Label_1096)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-94075476))
                    goto(Label_0740)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1170495268))
                    goto(Label_0446)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                    return:boolean(xor:int[expected:boolean](ldc:int(801), ldc:int(800)))
                }
                
                loopcontinue()
            }
            
            Label_7690:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                goto(Label_7336)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_6957)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_6622)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_6279)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_5936)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_5553)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_5219)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1910410761))
                goto(Label_4921)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_4574)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1624789890))
                goto(Label_4084)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_3717)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1303470394))
                goto(Label_3379)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(927979047))
                goto(Label_3022)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_2666)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1527745290))
                goto(Label_2372)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(33554432)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-2031047593))
                goto(Label_2048)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(512)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-360769840))
                goto(Label_1725)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                goto(Label_1420)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(65536)), ldc:int(0))) {
                goto(Label_1096)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0740)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1771307627))
                goto(Label_0446)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                return:boolean(xor:int[expected:boolean](ldc:int(16448), ldc:int(16449)))
            }
            
            var_4_63 = and:int(var_4_63:int, ldc:int(619980447))
        }
    }
    
    private void \u36d3\u7049\u4ab3\uc3e3\ua068\u5fe1() {
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
            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8640\ud12e\uc87f\u983f\u6b5f\ub6ab, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, ldc:int(-1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4f52\ub32d\ud51e\u527a\u8d90\u5d20() {
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
            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8640\ud12e\uc87f\u983f\u6b5f\ub6ab, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, and:int(ldc:int(16919), ldc:int(257)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u8640\ud12e\uc87f\u983f\u6b5f\ub6ab(int p0) {
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
            invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u7330\u0a06\u4c2b\u8753\u8bb0\u3e2a, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), invokevirtual:int(\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9::\u3dd3\u7006\uc910\u16f6\u9033\u8d98, invokespecial:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u416d\ubf56\u51fa\uafe7\u965f\ub32d, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), invokevirtual:int(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u8709\u56bd\u7049\u392e\u67e9\ubefe, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)), p0:int), invokestatic:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u40a9\u8350\ud12e\u8258\u0a06\ub7dc))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u156b\u56bd\u8d98\u8413\u647c\u9033() {
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
            invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u7330\u0a06\u4c2b\u8753\u8bb0\u3e2a, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), invokevirtual:int(\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9::\u64f2\u7330\u72f1\u6d99\u494c\u4492, invokespecial:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u416d\ubf56\u51fa\uafe7\u965f\ub32d, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), invokevirtual:int(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u8709\u56bd\u7049\u392e\u67e9\ubefe, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))), invokestatic:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u40a9\u8350\ud12e\u8258\u0a06\ub7dc))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ua3b4\u7873\u624e\u8bb0\u3776\uf94d() {
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
            invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u7330\u0a06\u4c2b\u8753\u8bb0\u3e2a, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), invokevirtual:int(\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9::\ud4fe\uc4d2\u4bc8\ub6ab\u59ec\ud4fe, invokespecial:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u416d\ubf56\u51fa\uafe7\u965f\ub32d, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), invokevirtual:int(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u8709\u56bd\u7049\u392e\u67e9\ubefe, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))), invokestatic:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u40a9\u8350\ud12e\u8258\u0a06\ub7dc))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \uff55\ubff1\uc3e3\u7006\ud158\u9255(int p0, int p1, int p2) {
        var_4_63 : int
        
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
        var_4_63 = and:int(ldc:int(-1457307557), ldc:int(195335165))
        
        loop {
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-739676664))
                goto(Label_0801)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0680)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-413055218))
                goto(Label_0576)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-761285553))
                goto(Label_0470)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(1073741824)), ldc:int(0))) {
                goto(Label_0353)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1862922963))
            }
            else {
                var_4_63 = and:int(var_4_63:int, ldc:int(-369059842))
                
                switch (p0:int) {
                    case 257:
                    case 335:
                        if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, getfield:String(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u5140\u600f\u5fe1\u416d\u9af2\ud36e, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)))) {
                            looporswitchbreak()
                        }
                        
                        goto(Label_0576)
                    
                    case 259:
                        invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\uc229\u62da\ubefe\uc29a\uf9c5\u392e, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u40a9\u76bc\u183a\uf94d\u0a06\u97e6, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), ldc:int(-1))
                        goto(Label_0680)
                    
                    default:
                        return:boolean(and:int[expected:boolean](ldc:int(-7463), ldc:int(3366)))
                }
            }
            
            Label_0258:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8)), ldc:int(0))) {
                goto(Label_0801)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0680)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(67108864)), ldc:int(0))) {
                goto(Label_0576)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-2065160741))
                goto(Label_0470)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(238781651))
            }
            else {
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(8)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-198543929))
                    loopcontinue()
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(-1099029025))
            }
            
            Label_0353:
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(32768)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-788566945))
                goto(Label_0801)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(412784124))
                goto(Label_0680)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(2147483647)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(358961524))
                goto(Label_0576)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(524288)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1307563935))
                    goto(Label_0258)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(-1401755781))
                invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\uae5d\u960f\u3e2a\uc4d2\u3bd6\u983f, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, and:int[expected:boolean](ldc:int(3713), ldc:int(16673)))
            }
            
            Label_0470:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(127780544))
                goto(Label_0801)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(266614650))
                goto(Label_0680)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(134217728)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                    goto(Label_0353)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(32)), ldc:int(0))) {
                    goto(Label_0258)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-35802614))
                    loopcontinue()
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(1236663645))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), checkcast:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006.class, aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()))
            }
            
            Label_0576:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0801)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(64)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1405786614))
            }
            else {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0470)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(32768)), ldc:int(0))) {
                    goto(Label_0353)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-1789301384))
                    goto(Label_0258)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(268435456)), ldc:int(0))) {
                    return:boolean(and:int[expected:boolean](ldc:int(773), ldc:int(24587)))
                }
                
                loopcontinue()
            }
            
            Label_0680:
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(683136106))
            }
            else {
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-199310161))
                    goto(Label_0576)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(1024)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(1402850305))
                    goto(Label_0470)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0353)
                }
                
                if (cmpne:boolean(and:int(var_4_63:int, ldc:int(524288)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(710961483))
                    goto(Label_0258)
                }
                
                if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(16)), ldc:int(0))) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(575374241))
                    loopcontinue()
                }
                
                var_4_63 = and:int(var_4_63:int, ldc:int(-667766660))
                invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u67d0\u3a62\ua562\u6ec6\ud171\uc29a, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
            }
            
            Label_0801:
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(1073741824)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(1955531294))
                goto(Label_0680)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(1048576)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1637582801))
                goto(Label_0576)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0470)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(4194304)), ldc:int(0))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-459846012))
                goto(Label_0353)
            }
            
            if (cmpne:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                goto(Label_0258)
            }
            
            if (cmpeq:boolean(and:int(var_4_63:int, ldc:int(128)), ldc:int(0))) {
                putfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u516c\u392e\u62da\uc229\ud7e8\ucb79, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, xor:int[expected:boolean](ldc:int(610), ldc:int(611)))
                return:boolean(xor:int[expected:boolean](ldc:int(-32628), ldc:int(-32627)))
            }
        }
    }
    
    private java.lang.String \u40a9\u8258\ud7e8\u156b\uff55\u3504() {
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
            return:String(ternaryop:String(logicaland:boolean(cmpge:boolean(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), ldc:int(0)), cmplt:boolean(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), invokeinterface:int(List<E>::size, getfield:List<String>(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u494c\u74b1\uc229\u0b8e\u6b0d\u647c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)))), checkcast:String(java.lang.String.class, invokeinterface:String(List<String>::get, getfield:List<String>(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u494c\u74b1\uc229\u0b8e\u6b0d\u647c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))), loadelement:String(getstatic:String[](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6b5f\u3dd3\u927d\u4c2b\u516c\u3dd3), and:int(ldc:int(3034), ldc:int(-3035)))))
        }
        
        goto(Label_0006)
    }
    
    private void \u4bc8\u6d99\u1833\u392e\u64f2\u4975(java.lang.String p0) {
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
            
            if (cmpge:boolean(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), ldc:int(0))) {
                if (cmplt:boolean(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), invokeinterface:int(List<E>::size, getfield:List<String>(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u494c\u74b1\uc229\u0b8e\u6b0d\u647c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)))) {
                    invokeinterface:String(List<String>::set, getfield:List<String>(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u494c\u74b1\uc229\u0b8e\u6b0d\u647c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), p0:String)
                    putfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u516c\u392e\u62da\uc229\ud7e8\ucb79, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, xor:int[expected:boolean](ldc:int(-31744), ldc:int(-31743)))
                    invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u3c25\u3e2a\u7873\u9a18\u8cae\u9a18, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, int p1, int p2, float p3) {
        var_5_16A : int
        var_7_9A : int
        stack_189_0 : int [generated]
        var_10_120 : \u4179\uae87\ub6ab\ub7dc\u983f\u4cd9
        var_11_127 : \u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7[]
        var_12_12C : int
        var_13_135 : int
        var_14_2B2 : \u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7
        var_5_187 : int
        var_9_189 : int
        stack_1B7_0 : \u718f\u8413\u1833\u72f1\u5fe1\u927d [generated]
        stack_1B7_1 : \u718f\u8413\u1833\u72f1\u5fe1\u927d [generated]
        var_10_1BA : \u718f\u8413\u1833\u72f1\u5fe1\u927d
        
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
            var_5_16A = and:int(ldc:int(1431163067), ldc:int(-444607842))
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokevirtual:void(\u36d3\u97b7\u6ec6\u4c04\ud171\u5245::\u3504\u494c\u983f\u7c6b\u4f4a\u385b, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a[expected:\u36d3\u97b7\u6ec6\u4c04\ud171\u5245], checkcast:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u3e75\ub8be\u88c5\ub7dc\uc246\u8753.class, aconstnull:\u3e75\ub8be\u88c5\ub7dc\uc246\u8753()))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f), ldc:float(1.0f))
            invokevirtual:void(\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99::\u6ec6\u9a18\u92ff\u2dcc\ud12e\u7ce1, invokevirtual:\u4f52\ub7dc\u7bad\ud217\u76bc\u6d99(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\uf94d\u6d69\u4492\u6c56\u98a4\u3d64, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)), getstatic:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u960f\u7ce1\u98a4\uc238\u98a4\u4f52::\uc3e3\u93a2\u4f52\uae5d\ud171\u836c))
            var_7_9A = div:int(sub:int(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), and:int(ldc:int(5332), ldc:int(233))), xor:int(ldc:int(4353), ldc:int(4355)))
            invokevirtual:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\u6ec6\u8709\u61a4\u6435\u6d99\u6c56, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a[expected:\ube23\u624e\u2dcc\u3a62\uf9c5\u8389], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_7_9A:int, xor:int(ldc:int(16643), ldc:int(16641)), and:int(ldc:int(17533), ldc:int(-17536)), and:int(ldc:int(23686), ldc:int(-31968)), and:int(ldc:int(208), ldc:int(4552)), and:int(ldc:int(1236), ldc:int(4544)))
            
            if (getfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8d98\u983f\ud158\u3d64\u873d\uc229, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)) {
                if (cmpne:boolean(rem:int(div:int(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u965f\u3776\u92ff\u97b7\u3dd3\u8258, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), ldc:int(6)), xor:int(ldc:int(3139), ldc:int(3137))), ldc:int(0))) {
                    goto(Label_0336)
                }
                
                stack_189_0 = xor:int(ldc:int(58), ldc:int(59))
                goto(Label_0385)
            }
            
            Label_0214:
            
            if (cmpeq:boolean(and:int(var_5_16A:int, ldc:int(1048576)), ldc:int(0))) {
                invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:ITextComponent(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u7043\u7bad\ucfaf\u67d0\ubff1\u516c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), i2f:float(sub:int(add:int(sub:int(var_7_9A:int, invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ucb79\ua3b4\u946b\uc246\ua068\u36d3, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), getfield:ITextComponent[expected:ITextProperties](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u7043\u7bad\ucfaf\u67d0\ubff1\u516c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))), and:int(ldc:int(4288), ldc:int(1510))), ldc:int(44))), ldc:float(18.0f), and:int(ldc:int(17579), ldc:int(-18352)))
                var_10_120 = invokespecial:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u416d\ubf56\u51fa\uafe7\u965f\ub32d, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
                var_11_127 = invokestatic:\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7[](\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9::\u183a\ub8be\uc2e8\ub102\u4daf\u0b8e, var_10_120:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9)
                var_12_12C = arraylength:int(var_11_127:\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7[])
                var_13_135 = and:int(ldc:int(-9054), ldc:int(9045))
                
                while (cmplt:boolean(var_13_135:int, var_12_12C:int)) {
                    var_14_2B2 = loadelement:\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7(var_11_127:\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7[], var_13_135:int)
                    invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokestatic:ITextComponent(\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7::\u4c2b\u3e2a\uafe7\u8d90\u446c\u67e9, var_14_2B2:\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7), i2f:float(invokestatic:int(\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7::\u36d3\uc2e8\ubded\u16f6\ud523\u9033, var_14_2B2:\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7)), i2f:float(invokestatic:int(\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7::\uae87\ua61f\uae5d\u6b5f\u8aa5\u51b2, var_14_2B2:\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7)), ldc:int(-16777216))
                    inc:int(var_13_135, ldc:int(1))
                }
                
                invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6ec6\uc238\u5654\u4492\u7bad\u527a, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, invokestatic:\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69[](\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9::\uc238\u5fe1\u9a18\ubf56\u98a4\ub1b9, var_10_120:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9))
                invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ub70c\u4492\u9937\u965f\u8350\u8413, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, invokestatic:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9::\u97b7\u97e6\uc910\u61a4\u5f50\uc2e8, var_10_120:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9), invokestatic:boolean(\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9::\u61a4\u51fa\u6d99\u2dcc\u92ff\ud4fe, var_10_120:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9))
                goto(Label_0731)
            }
            
            Label_0336:
            
            if (cmpeq:boolean(and:int(var_5_16A:int, ldc:int(2)), ldc:int(0))) {
                var_5_16A = and:int(var_5_16A:int, ldc:int(1591714630))
                goto(Label_0214)
            }
            
            var_5_16A = and:int(var_5_16A:int, ldc:int(1542312594))
            stack_189_0 = and:int(ldc:int(30752), ldc:int(-31841))
            Label_0385:
            var_5_187 = and:int(var_5_16A:int, ldc:int(-580919618))
            var_9_189 = stack_189_0:int
            stack_1B7_0 = invokestatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u718f\u8413\u1833\u72f1\u5fe1\u927d::\u071d\u9937\ud523\uae5d\u759a\uc238, getfield:String(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u5140\u600f\u5fe1\u416d\u9af2\ud36e, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), getstatic:Style(Style::EMPTY))
            
            if (cmpeq:boolean(var_9_189:int, ldc:int(0))) {
                var_5_187 = and:int(var_5_187:int, ldc:int(-171051589))
                stack_1B7_1 = getstatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ud217\ubf56\u8df4\u7043\ufe34\u7af6)
            }
            else {
                stack_1B7_1 = getstatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u64ab\uf9c5\uc246\u3711\u960f\ubb2b)
            }
            
            var_10_1BA = invokestatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u718f\u8413\u1833\u72f1\u5fe1\u927d::\u7e3f\ua068\u6bb9\u494c\u8350\u6c56, stack_1B7_0:\u718f\u8413\u1833\u72f1\u5fe1\u927d, stack_1B7_1:\u718f\u8413\u1833\u72f1\u5fe1\u927d)
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getstatic:ITextComponent(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8308\u8413\ua3b4\u72f1\u9255\u92ee), i2f:float(add:int(add:int(var_7_9A:int, ldc:int(36)), div:int(sub:int(ldc:int(114), invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ucb79\ua3b4\u946b\uc246\ua068\u36d3, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), getstatic:ITextComponent[expected:ITextProperties](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8308\u8413\ua3b4\u72f1\u9255\u92ee))), and:int(ldc:int(25154), ldc:int(1282))))), ldc:float(34.0f), and:int(ldc:int(-6532), ldc:int(6531)))
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u8709\ub19c\ub8be\u52d3\u3dd3\u183a, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, var_10_1BA:\u718f\u8413\u1833\u72f1\u5fe1\u927d, i2f:float(add:int(add:int(var_7_9A:int, ldc:int(36)), div:int(sub:int(ldc:int(114), invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u4bc8\uc7fe\u3dd3\u3d64\u7043\u4c04, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), var_10_1BA:\u718f\u8413\u1833\u72f1\u5fe1\u927d)), and:int(ldc:int(1578), ldc:int(8471))))), ldc:float(50.0f), and:int(ldc:int(11287), ldc:int(-11288)))
            invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ub18d\u99f7\uc910\u97e6\u5245\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:ITextComponent(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u3c25\u647c\u5654\u3d4b\uc229\ud7e8, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), i2f:float(add:int(add:int(var_7_9A:int, ldc:int(36)), div:int(sub:int(ldc:int(114), invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ucb79\ua3b4\u946b\uc246\ua068\u36d3, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), getfield:ITextComponent[expected:ITextProperties](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u3c25\u647c\u5654\u3d4b\uc229\ud7e8, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))), xor:int(ldc:int(-32765), ldc:int(-32767))))), ldc:float(60.0f), and:int(ldc:int(4319), ldc:int(-14560)))
            invokevirtual:void(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u3bc9\u9255\u156b\u836c\ubb2b\u960f, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), getstatic:ITextComponent[expected:ITextProperties](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u9255\u0800\u9255\u8bb0\u34df\u527a), add:int(var_7_9A:int, ldc:int(36)), ldc:int(82), ldc:int(114), and:int(ldc:int(-24702), ldc:int(24693)))
            Label_0731:
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \ub70c\u4492\u9937\u965f\u8350\u8413(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\uc2bd\u965f\u6435\u4c04\uff55\u12cb p1, boolean p2) {
        var_4_63 : int
        
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
            var_4_63 = and:int(ldc:int(-554140128), ldc:int(-21210187))
            
            if (cmpeq:boolean(rem:int(div:int(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u965f\u3776\u92ff\u97b7\u3dd3\u8258, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), ldc:int(6)), and:int(ldc:int(8742), ldc:int(3402))), ldc:int(0))) {
                p1 = invokespecial:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u7c6b\ucb79\u8258\u3e75\ua068\u7873, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, p1:\uc2bd\u965f\u6435\u4c04\uff55\u12cb)
                
                if (p2:boolean) {
                    var_4_63 = and:int(var_4_63:int, ldc:int(-21209423))
                    invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u071d\u6198\ud12e\uc229\u93a2\ua6bd, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, loadelement:String(getstatic:String[](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6b5f\u3dd3\u927d\u4c2b\u516c\u3dd3), and:int(ldc:int(8), ldc:int(3355))), i2f:float(getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\u647c\u960f\u51fa\u8308\u6435\u8308, p1:\uc2bd\u965f\u6435\u4c04\uff55\u12cb)), i2f:float(getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\uc246\ube23\u5d20\u71ae\u600f\ud12e, p1:\uc2bd\u965f\u6435\u4c04\uff55\u12cb)), and:int(ldc:int(10633), ldc:int(-10636)))
                }
                else {
                    invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\uff55\u5245\uf995\u7049\u4179\u624e, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\u647c\u960f\u51fa\u8308\u6435\u8308, p1:\uc2bd\u965f\u6435\u4c04\uff55\u12cb), sub:int(getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\uc246\ube23\u5d20\u71ae\u600f\ud12e, p1:\uc2bd\u965f\u6435\u4c04\uff55\u12cb), xor:int(ldc:int(1076), ldc:int(1077))), add:int(getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\u647c\u960f\u51fa\u8308\u6435\u8308, p1:\uc2bd\u965f\u6435\u4c04\uff55\u12cb), and:int(ldc:int(24833), ldc:int(709))), add:int(getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\uc246\ube23\u5d20\u71ae\u600f\ud12e, p1:\uc2bd\u965f\u6435\u4c04\uff55\u12cb), ldc:int(9)), ldc:int(-16777216))
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u6ec6\uc238\u5654\u4492\u7bad\u527a(\u59ec\u8413\u97e6\uc229\u3776.\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69[] p0) {
        var_2_61 : int
        var_4_65 : \ub6ab\u8cae\u64ab\u5245\ubff1\u3711
        var_5_6C : \u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab
        var_7_95 : int
        var_8_9E : int
        var_9_C8 : \u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69
        var_10_CF : int
        var_11_D6 : int
        var_12_E0 : int
        var_13_EA : int
        
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
            var_2_61 = and:int(ldc:int(1098346976), ldc:int(-2106229319))
            var_4_65 = invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f)
            var_5_6C = invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, var_4_65:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8d90\u92ff\uc84e\u3dd3\uf9c5\u8308, ldc:float(0.0f), ldc:float(0.0f), ldc:float(255.0f), ldc:float(255.0f))
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8389\ua3b4\u3d4b\ud36e\u67e9\ubefe)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u74b1\uc2bd\ua61f\u12cb\u5245\ub6ab)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u416d\u3e75\u2dcc\ud51e\ubcb0\u51b2, getstatic:\ua61f\u92ee\ub8be\uafe7\u4e72(\ua61f\u92ee\ub8be\uafe7\u4e72::\u4f52\ube23\u69d9\u67e9\u8d98\u3d64))
            invokevirtual:void(\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab::\u12cb\u9937\uc246\u5fe1\ubefe\u494c, var_5_6C:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab, ldc:int(7), getstatic:\u74b1\u6d69\ud4fe\u4179\u8c8a\u965f(\u6d69\u4c04\ub113\u92ff\u3e75\u12b2::\u983f\u3e2a\u7e3f\u4ab3\u99f7\u7bad))
            var_7_95 = arraylength:int(p0:\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69[])
            var_8_9E = and:int(ldc:int(28809), ldc:int(-28842))
            
            loop {
                var_2_61 = and:int(var_2_61:int, ldc:int(872249067))
                
                if (cmpge:boolean(var_8_9E:int, var_7_95:int)) {
                    looporswitchbreak()
                }
                
                var_9_C8 = loadelement:\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69(p0:\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69[], var_8_9E:int)
                var_10_CF = invokevirtual:int(\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69::\u3dd3\u3a62\u8640\ua3b4\u8753\u67d0, var_9_C8:\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69)
                var_11_D6 = invokevirtual:int(\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69::\u8709\u759a\uc2bd\u759a\u7d52\ud51e, var_9_C8:\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69)
                var_12_E0 = add:int(var_10_CF:int, invokevirtual:int(\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69::\u5245\u1187\u6fb0\ua068\ub83f\u3504, var_9_C8:\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69))
                var_13_EA = add:int(var_11_D6:int, invokevirtual:int(\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69::\u7049\u760c\u7ce1\u6bb9\u8258\u2dcc, var_9_C8:\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69))
                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_5_6C:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(var_10_CF:int), i2d:double(var_13_EA:int), ldc:double(0.0)))
                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_5_6C:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(var_12_E0:int), i2d:double(var_13_EA:int), ldc:double(0.0)))
                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_5_6C:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(var_12_E0:int), i2d:double(var_11_D6:int), ldc:double(0.0)))
                invokeinterface:void(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\ua61f\u0a06\u3bc9\ufe34\uc9f6\u8258, invokevirtual:\u6b0d\uf9c5\ucfaf\ud36e\ub102(\u6b0d\uf9c5\ucfaf\ud36e\ub102::\u8d90\u9255\u3bd6\u5d20\ub83f\u1187, var_5_6C:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab[expected:\u6b0d\uf9c5\ucfaf\ud36e\ub102], i2d:double(var_10_CF:int), i2d:double(var_11_D6:int), ldc:double(0.0)))
                inc:int(var_8_9E, ldc:int(1))
            }
            
            invokevirtual:void(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\uc229\u12b2\u6cfe\u4492\u36d3\u5f50, var_4_65:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\uc9f6\ubded\ud7e8\u4f52\uc229\u4d85)
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u97e6\u9255\u59ec\ube23\u64f2\ub32d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u6ec6\ubb2b\uf94d\u6d99\u4f52.\uc2bd\u965f\u6435\u4c04\uff55\u12cb \u7043\u4cd9\u16f6\u5245\u7d52\u4d85(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uc2bd\u965f\u6435\u4c04\uff55\u12cb p0) {
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
            return:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(initobject:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::<init>, sub:int(sub:int(getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\u647c\u960f\u51fa\u8308\u6435\u8308, p0:\uc2bd\u965f\u6435\u4c04\uff55\u12cb), div:int(sub:int(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), and:int(ldc:int(18626), ldc:int(6080))), xor:int(ldc:int(1293), ldc:int(1295)))), ldc:int(36)), sub:int(getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\uc246\ube23\u5d20\u71ae\u600f\ud12e, p0:\uc2bd\u965f\u6435\u4c04\uff55\u12cb), ldc:int(32))))
        }
        
        goto(Label_0006)
    }
    
    private \u6ec6\ubb2b\uf94d\u6d99\u4f52.\uc2bd\u965f\u6435\u4c04\uff55\u12cb \u7c6b\ucb79\u8258\u3e75\ua068\u7873(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uc2bd\u965f\u6435\u4c04\uff55\u12cb p0) {
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
            return:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(initobject:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::<init>, add:int(add:int(getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\u647c\u960f\u51fa\u8308\u6435\u8308, p0:\uc2bd\u965f\u6435\u4c04\uff55\u12cb), div:int(sub:int(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), and:int(ldc:int(7392), ldc:int(16849))), and:int(ldc:int(16642), ldc:int(10774)))), ldc:int(36)), add:int(getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\uc246\ube23\u5d20\u71ae\u600f\ud12e, p0:\uc2bd\u965f\u6435\u4c04\uff55\u12cb), ldc:int(32))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u183a\ud36e\u1187\u88c5\u7bad\u5bc4(double p0, double p1, int p2) {
        var_6_156 : int
        var_8_C0 : long
        var_11_E0 : int
        
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
        var_6_156 = and:int(ldc:int(1692012136), ldc:int(-239890791))
        
        if (logicalnot:boolean(invokespecial:boolean(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u183a\ud36e\u1187\u88c5\u7bad\u5bc4, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a[expected:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9], p0:double, p1:double, p2:int))) {
            loop {
                if (cmpne:boolean(and:int(var_6_156:int, ldc:int(4)), ldc:int(0))) {
                    var_6_156 = and:int(var_6_156:int, ldc:int(1341327645))
                }
                else {
                    var_6_156 = and:int(var_6_156:int, ldc:int(1908374546))
                    
                    if (cmpeq:boolean(p2:int, ldc:int(0))) {
                        var_8_C0 = invokestatic:long(\ud217\u3504\u760c\uc29a\u97e6\ube23::\uc3e3\u99f7\u4c2b\u7af6\u8d90\u7d52)
                        var_11_E0 = invokevirtual:int(\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9::\u93a2\u8d98\ucef1\u6c52\u71ae\u6b0d, invokespecial:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u416d\ubf56\u51fa\uafe7\u965f\ub32d, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), invokespecial:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u7043\u4cd9\u16f6\u5245\u7d52\u4d85, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, initobject:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::<init>, d2i:int(p0:double), d2i:int(p1:double))))
                        
                        if (cmpge:boolean(var_11_E0:int, ldc:int(0))) {
                            if (cmpne:boolean(var_11_E0:int, getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u0c95\u5d20\uc910\u36d3\u9033\u183a, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))) {
                                goto(Label_0296)
                            }
                            
                            if (cmpge:boolean(sub:long(var_8_C0:long, getfield:long(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ud158\uc87f\u0c95\uae87\u1187\u446c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)), ldc:long(250L))) {
                                goto(Label_0296)
                            }
                            
                            if (invokevirtual:boolean(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u4ab3\ua61f\u98a4\ud4fe\uc4d2\uc3e3, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))) {
                                goto(Label_0394)
                            }
                            
                            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ucb79\u836c\u64ab\ube23\ub18d\u4cd9, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, var_11_E0:int)
                            goto(Label_0440)
                        }
                        
                        Label_0231:
                        
                        if (cmpeq:boolean(and:int(var_6_156:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_6_156:int, ldc:int(4)), ldc:int(0))) {
                            var_6_156 = and:int(var_6_156:int, ldc:int(1623674633))
                            putfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u0c95\u5d20\uc910\u36d3\u9033\u183a, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, var_11_E0:int)
                            putfield:long(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ud158\uc87f\u0c95\uae87\u1187\u446c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, var_8_C0:long)
                            goto(Label_0145)
                        }
                        
                        var_6_156 = and:int(var_6_156:int, ldc:int(-787156236))
                        Label_0296:
                        
                        if (cmpne:boolean(and:int(var_6_156:int, ldc:int(4)), ldc:int(0))) {
                            var_6_156 = and:int(var_6_156:int, ldc:int(1143203945))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_6_156:int, ldc:int(8192)), ldc:int(0))) {
                                var_6_156 = and:int(var_6_156:int, ldc:int(37420272))
                                goto(Label_0231)
                            }
                            
                            var_6_156 = and:int(var_6_156:int, ldc:int(-342647606))
                            invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u7330\u0a06\u4c2b\u8753\u8bb0\u3e2a, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), var_11_E0:int, invokestatic:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u40a9\u8350\ud12e\u8258\u0a06\ub7dc))
                            goto(Label_0440)
                        }
                        
                        Label_0394:
                        
                        if (cmpne:boolean(and:int(var_6_156:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0296)
                        }
                        
                        if (cmpne:boolean(and:int(var_6_156:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0231)
                        }
                        
                        var_6_156 = and:int(var_6_156:int, ldc:int(2056400035))
                        invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\uc4d2\u6c56\u3c25\u965f\u446c\ub8be, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))
                        Label_0440:
                        var_6_156 = and:int(var_6_156:int, ldc:int(-439186026))
                        invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u3c25\u3e2a\u7873\u9a18\u8cae\u9a18, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
                        goto(Label_0231)
                    }
                }
                
                Label_0145:
                
                if (cmpne:boolean(and:int(var_6_156:int, ldc:int(131072)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            return:boolean(and:int[expected:boolean](ldc:int(25089), ldc:int(1059)))
        }
        
        return:boolean(xor:int[expected:boolean](ldc:int(4608), ldc:int(4609)))
    }
    
    private void \ucb79\u836c\u64ab\ube23\ub18d\u4cd9(int p0) {
        var_4_66 : String
        
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
            var_4_66 = invokespecial:String(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u40a9\u8258\ud7e8\u156b\uff55\u3504, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
            invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u071d\u9255\u4e72\ud523\u516c\u92ee, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), invokestatic:int(CharacterManager::func_238351_a_, var_4_66:String, ldc:int(-1), p0:int, and:int[expected:boolean](ldc:int(12553), ldc:int(-12586))), invokestatic:int(CharacterManager::func_238351_a_, var_4_66:String, and:int(ldc:int(1), ldc:int(14593)), p0:int, and:int[expected:boolean](ldc:int(-9220), ldc:int(9219))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3776\uae87\ud171\ubb2b\u3bc9\uafe7(double p0, double p1, int p2, double p3, double p4) {
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
        
        if (logicalnot:boolean(invokespecial:boolean(\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9::\u3776\uae87\ud171\ubb2b\u3bc9\uafe7, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a[expected:\u6b5f\ua3b4\ua61f\ub70c\u5140\u6bb9], p0:double, p1:double, p2:int, p3:double, p4:double))) {
            if (cmpeq:boolean(p2:int, ldc:int(0))) {
                invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u7330\u0a06\u4c2b\u8753\u8bb0\u3e2a, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), invokevirtual:int(\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9::\u93a2\u8d98\ucef1\u6c52\u71ae\u6b0d, invokespecial:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u416d\ubf56\u51fa\uafe7\u965f\ub32d, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), invokespecial:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u7043\u4cd9\u16f6\u5245\u7d52\u4d85, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, initobject:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::<init>, d2i:int(p0:double), d2i:int(p1:double)))), and:int[expected:boolean](ldc:int(10627), ldc:int(1085)))
                invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u3c25\u3e2a\u7873\u9a18\u8cae\u9a18, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
            }
            
            return:boolean(xor:int[expected:boolean](ldc:int(1056), ldc:int(1057)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(11011), ldc:int(201)))
    }
    
    private \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9 \u416d\ubf56\u51fa\uafe7\u965f\ub32d() {
        stack_C2_1 : String [generated]
        expr_97 : Object[] [generated]
        
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
            
            if (cmpeq:boolean(getfield:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ua61f\u5fe1\u3bd6\u8258\u760c\u67e9, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), aconstnull:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9())) {
                putfield:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ua61f\u5fe1\u3bd6\u8258\u760c\u67e9, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, invokespecial:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u759a\u873d\u93a2\u1833\u392e\u4bc8, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))
                stack_C2_1 = loadelement:String(getstatic:String[](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6b5f\u3dd3\u927d\u4c2b\u516c\u3dd3), xor:int(ldc:int(34), ldc:int(43)))
                expr_97 = newarray:Object[](java.lang.Object.class, and:int(ldc:int(4546), ldc:int(18955)))
                storeelement:Object(expr_97:Object[], and:int(ldc:int(32282), ldc:int(-32411)), invokestatic:Integer[expected:Object](Integer::valueOf, add:int(getfield:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6fb0\u7873\u6d99\u3d4b\uf9c5\u3711, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), xor:int(ldc:int(576), ldc:int(577)))))
                storeelement:Object(expr_97:Object[], xor:int(ldc:int(4100), ldc:int(4101)), invokestatic:Integer[expected:Object](Integer::valueOf, invokespecial:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u9a18\u51fa\u3d64\u16f6\u52d3\u8389, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)))
                putfield:ITextComponent(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u7043\u7bad\ucfaf\u67d0\ubff1\u516c, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, initobject:TranslationTextComponent(TranslationTextComponent::<init>, stack_C2_1:String, expr_97:Object[]))
            }
            
            return:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9(getfield:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ua61f\u5fe1\u3bd6\u8258\u760c\u67e9, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))
        }
        
        goto(Label_0006)
    }
    
    private void \u3c25\u3e2a\u7873\u9a18\u8cae\u9a18() {
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
            putfield:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ua61f\u5fe1\u3bd6\u8258\u760c\u67e9, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, aconstnull:\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9())
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u4ab3\uff55\u71f1\u516c\u120d\u3504() {
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
            invokevirtual:void(\ub32d\uc29a\ub32d\uae87\ud4fe\ua068::\u6435\ud158\u3776\u647c\u9937\u98a4, getfield:\ub32d\uc29a\ub32d\uae87\ud4fe\ua068(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u1833\u4ab3\u12b2\ud7e8\u6fb0\u3dd3, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))
            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u3c25\u3e2a\u7873\u9a18\u8cae\u9a18, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u4179\uae87\ub6ab\ub7dc\u983f\u4cd9 \u759a\u873d\u93a2\u1833\u392e\u4bc8() {
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
    
    private static int \u385b\ub7dc\u7873\u88c5\u7873\u927d(int[] p0, int p1) {
        var_2_61 : int
        var_4_67 : int
        stack_8E_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(58331044), ldc:int(-1621352518))
            var_4_67 = invokestatic:int(Arrays::binarySearch, p0:int[], p1:int)
            
            if (cmpge:boolean(var_4_67:int, ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-2021998683))
                stack_8E_0 = var_4_67:int
            }
            else {
                stack_8E_0 = neg:int(add:int(var_4_67:int, xor:int(ldc:int(25), ldc:int(27))))
            }
            
            return:int(stack_8E_0:int)
        }
        
        goto(Label_0006)
    }
    
    private \u59ec\u8413\u97e6\uc229\u3776.\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69 \u97b7\ud51e\uceb8\ub171\u3c25\u4cd9(java.lang.String p0, net.minecraft.util.text.CharacterManager p1, int p2, int p3, int p4, int p5) {
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
            return:\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69(invokespecial:\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8308\u97e6\u8c8a\uae5d\uc84e\uceb8, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, initobject:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::<init>, f2i:int(invokevirtual:float(CharacterManager::func_238350_a_, p1:CharacterManager, invokevirtual:String(String::substring, p0:String, p5:int, p2:int))), p4:int), initobject:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::<init>, f2i:int(invokevirtual:float(CharacterManager::func_238350_a_, p1:CharacterManager, invokevirtual:String(String::substring, p0:String, p5:int, p3:int))), add:int(p4:int, ldc:int(9)))))
        }
        
        goto(Label_0006)
    }
    
    private \u59ec\u8413\u97e6\uc229\u3776.\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69 \u8308\u97e6\u8c8a\uae5d\uc84e\uceb8(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uc2bd\u965f\u6435\u4c04\uff55\u12cb p0, \u6ec6\ubb2b\uf94d\u6d99\u4f52.\uc2bd\u965f\u6435\u4c04\uff55\u12cb p1) {
        var_5_67 : \uc2bd\u965f\u6435\u4c04\uff55\u12cb
        var_6_6E : \uc2bd\u965f\u6435\u4c04\uff55\u12cb
        var_7_7D : int
        var_8_8C : int
        var_9_9B : int
        
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
            var_5_67 = invokespecial:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u7c6b\ucb79\u8258\u3e75\ua068\u7873, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, p0:\uc2bd\u965f\u6435\u4c04\uff55\u12cb)
            var_6_6E = invokespecial:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u7c6b\ucb79\u8258\u3e75\ua068\u7873, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, p1:\uc2bd\u965f\u6435\u4c04\uff55\u12cb)
            var_7_7D = invokestatic:int(Math::min, getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\u647c\u960f\u51fa\u8308\u6435\u8308, var_5_67:\uc2bd\u965f\u6435\u4c04\uff55\u12cb), getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\u647c\u960f\u51fa\u8308\u6435\u8308, var_6_6E:\uc2bd\u965f\u6435\u4c04\uff55\u12cb))
            var_8_8C = invokestatic:int(Math::max, getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\u647c\u960f\u51fa\u8308\u6435\u8308, var_5_67:\uc2bd\u965f\u6435\u4c04\uff55\u12cb), getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\u647c\u960f\u51fa\u8308\u6435\u8308, var_6_6E:\uc2bd\u965f\u6435\u4c04\uff55\u12cb))
            var_9_9B = invokestatic:int(Math::min, getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\uc246\ube23\u5d20\u71ae\u600f\ud12e, var_5_67:\uc2bd\u965f\u6435\u4c04\uff55\u12cb), getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\uc246\ube23\u5d20\u71ae\u600f\ud12e, var_6_6E:\uc2bd\u965f\u6435\u4c04\uff55\u12cb))
            return:\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69(initobject:\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69(\u647c\uc3e3\u76bc\u8df4\ud4fe\u6d69::<init>, var_7_7D:int, var_9_9B:int, sub:int(var_8_8C:int, var_7_7D:int), sub:int(invokestatic:int(Math::max, getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\uc246\ube23\u5d20\u71ae\u600f\ud12e, var_5_67:\uc2bd\u965f\u6435\u4c04\uff55\u12cb), getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\uc246\ube23\u5d20\u71ae\u600f\ud12e, var_6_6E:\uc2bd\u965f\u6435\u4c04\uff55\u12cb)), var_9_9B:int)))
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u6198\u6d69\ubb2b\ubded\ub18d\u759a$10(org.apache.commons.lang3.mutable.MutableInt p0, java.lang.String p1, org.apache.commons.lang3.mutable.MutableBoolean p2, it.unimi.dsi.fastutil.ints.IntList p3, java.util.List p4, net.minecraft.util.text.Style p5, int p6, int p7) {
        var_11_69 : int
        var_12_73 : String
        var_13_99 : String
        var_15_B6 : \uc2bd\u965f\u6435\u4c04\uff55\u12cb
        
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
            var_11_69 = invokevirtual:int(MutableInt::getAndIncrement, p0:MutableInt)
            var_12_73 = invokevirtual:String(String::substring, p1:String, p6:int, p7:int)
            invokevirtual:void(MutableBoolean::setValue, p2:MutableBoolean, invokevirtual:boolean(String::endsWith, var_12_73:String, loadelement:String(getstatic:String[](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6b5f\u3dd3\u927d\u4c2b\u516c\u3dd3), xor:int(ldc:int(4098), ldc:int(4101)))))
            var_13_99 = invokestatic:String(StringUtils::stripEnd, var_12_73:String, loadelement:String(getstatic:String[](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6b5f\u3dd3\u927d\u4c2b\u516c\u3dd3), xor:int(ldc:int(3076), ldc:int(3086))))
            var_15_B6 = invokespecial:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u7c6b\ucb79\u8258\u3e75\ua068\u7873, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, initobject:\uc2bd\u965f\u6435\u4c04\uff55\u12cb(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::<init>, and:int(ldc:int(-24045), ldc:int(23968)), mul:int(var_11_69:int, ldc:int(9))))
            invokeinterface:boolean(IntList::add, p3:IntList, p6:int)
            invokeinterface:boolean(List<\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7>::add, p4:List<\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7>, initobject:\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7(\u0c95\u8df4\u51fa\ucfaf\u3c25\u99f7::<init>, p5:Style, var_13_99:String, getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\u647c\u960f\u51fa\u8308\u6435\u8308, var_15_B6:\uc2bd\u965f\u6435\u4c04\uff55\u12cb), getfield:int(\uc2bd\u965f\u6435\u4c04\uff55\u12cb::\uc246\ube23\u5d20\u71ae\u600f\ud12e, var_15_B6:\uc2bd\u965f\u6435\u4c04\uff55\u12cb)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u88c5\u5f50\ube23\ufe34\ucb79\u8640$9(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ud523\u7006\u5140\u446c\u74b1\u71ae, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u59ec\u5f50\u51fa\u16f6\ub8be\uc7fe$8(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ubb2b\u759a\u56bd\ub6ab\ua3b4\uafe7, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ub18d\u8d98\u5654\u5d20\u4ab3\u64ab$7(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            
            if (getfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8d98\u983f\ud158\u3d64\u873d\uc229, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)) {
                putfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8d98\u983f\ud158\u3d64\u873d\uc229, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, and:int[expected:boolean](ldc:int(-17692), ldc:int(17691)))
            }
            
            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u67d0\u3a62\ua562\u6ec6\ud171\uc29a, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u59ec\u6c56\u0c95\u3dd3\ub19c\u40a9$6(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            
            if (getfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8d98\u983f\ud158\u3d64\u873d\uc229, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)) {
                invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\uae5d\u960f\u3e2a\uc4d2\u3bd6\u983f, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, and:int[expected:boolean](ldc:int(1477), ldc:int(24619)))
                invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), checkcast:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006.class, aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u4492\u8df4\ud217\u1187\u8753\uc2e8$5(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, getfield:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u647c\u8709\u7c6b\uc246\u9033\u5245, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), checkcast:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006.class, aconstnull:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006()))
            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\uae5d\u960f\u3e2a\uc4d2\u3bd6\u983f, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, and:int[expected:boolean](ldc:int(20884), ldc:int(-29077)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uc9f6\uf94d\u34df\u760c\u4bc8\ub7dc$4(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            putfield:boolean(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8d98\u983f\ud158\u3d64\u873d\uc229, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, xor:int[expected:boolean](ldc:int(-32760), ldc:int(-32759)))
            invokespecial:void(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u67d0\u3a62\ua562\u6ec6\ud171\uc29a, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u3d64\u4daf\u759a\u8c8a\u9255\u4ab3$3(java.lang.String p0) {
        var_1_61 : int
        stack_8C_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-946705152), ldc:int(-342393700))
            
            if (cmpge:boolean(invokevirtual:int(String::length, p0:String), ldc:int(16))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-510396333))
                stack_8C_0 = and:int(ldc:int(3644), ldc:int(-7741))
            }
            else {
                stack_8C_0 = xor:int(ldc:int(-32760), ldc:int(-32759))
            }
            
            return:boolean(stack_8C_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u47c2\u52d3\u6b0d\u7e3f\u51b2\uc3e3$2(java.lang.String p0) {
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
            putfield:String(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u5140\u600f\u5fe1\u416d\u9af2\ud36e, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private java.lang.String lambda$\u64ab\u74b1\u8bb0\u6198\ud51e\u61a4$1() {
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
            return:String(getfield:String(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u5140\u600f\u5fe1\u416d\u9af2\ud36e, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a))
        }
        
        goto(Label_0006)
    }
    
    private boolean lambda$\ufe34\u51fa\uceb8\u6ec6\u61a4\u3c25$0(java.lang.String p0) {
        var_2_61 : int
        stack_AC_0 : int [generated]
        
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
            var_2_61 = and:int(ldc:int(-1211924048), ldc:int(-1093708835))
            
            if (logicaland:boolean(cmplt:boolean(invokevirtual:int(String::length, p0:String), and:int(ldc:int(1578), ldc:int(9220))), cmple:boolean(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u1187\u6b5f\u946b\ua61f\u983f\uceb8, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a), p0:String, ldc:int(114)), and:int(ldc:int(1204), ldc:int(24705))))) {
                stack_AC_0 = and:int(ldc:int(3075), ldc:int(4225))
            }
            else {
                var_2_61 = and:int(var_2_61:int, ldc:int(-73805988))
                stack_AC_0 = and:int(ldc:int(7714), ldc:int(-7715))
            }
            
            return:boolean(stack_AC_0:int)
        }
        
        goto(Label_0006)
    }
    
    public static int \u36d3\u3e75\u760c\uc7fe\u983f\u7330(int[] p0, int p1) {
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
            return:int(invokestatic:int(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u385b\ub7dc\u7873\u88c5\u7873\u927d, p0:int[], p1:int))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_B8 : int
        expr_6E : int [generated]
        stack_93_0 : byte[] [generated]
        stack_95_0 : byte[] [generated]
        stack_D5_0 : byte[] [generated]
        stack_D7_0 : byte[] [generated]
        stack_119_0 : byte[] [generated]
        stack_11B_0 : byte[] [generated]
        stack_148_0 : byte[] [generated]
        stack_34F_0 : byte[] [generated]
        stack_3DE_0 : byte[] [generated]
        stack_432_0 : byte[] [generated]
        stack_488_0 : byte[] [generated]
        var_4_330 : int
        var_3_335 : byte[]
        var_5_336 : int
        var_0_369 : int
        expr_34F : byte [generated]
        stack_3A1_2 : byte [generated]
        stack_375_0 : byte [generated]
        expr_3E1 : byte [generated]
        expr_95 : int [generated]
        var_2_D5 : byte[]
        expr_D9 : int [generated]
        var_3_420 : byte[]
        var_5_421 : int
        expr_11B : int [generated]
        var_3_476 : byte[]
        var_5_477 : int
        var_3_154 : String
        expr_15C : String[] [generated]
        expr_166 : String[] [generated]
        var_3_2CF : String[]
        
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
        var_0_B8 = and:int(ldc:int(533057425), ldc:int(2010435565))
        expr_6E = arraylength:int(stack_93_0 = stack_95_0 = stack_D5_0 = stack_D7_0 = stack_119_0 = stack_11B_0 = stack_148_0 = stack_34F_0 = stack_3DE_0 = stack_432_0 = stack_488_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("RVVMe3mABYYafwiECfvcBXd0gAWGGn+C+QWK3IZ3/P7/hvskAYB8fwnghvoOCvL8dYNsAAWGJH8EfH8J4Ib6Dn0AA3qIbAiAf4GZAHyABBNnAAL8/vZ1gf+E/vckf3l8BI/rfIB1/PD3DoqJ+vuFcXoQGZkOmZUA")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_330 = expr_6E:int
        var_3_335 = newarray:byte[](byte.class, expr_6E:int)
        var_5_336 = expr_6E:int
        Label_0824:
        
        while (cmpne:boolean(and:int(var_0_B8:int, ldc:int(1024)), ldc:int(0))) {
            var_0_369 = and:int(var_0_B8:int, ldc:int(-536981658))
            var_5_336 = add:int(var_5_336:int, ldc:int(-1))
            expr_34F = stack_3A1_2 = loadelement(stack_34F_0, var_5_336)
            
            if (cmplt:boolean(add:int(add:int(var_5_336:int, ldc:int(6)), neg:int(var_4_330:int)), ldc:int(0))) {
                stack_3A1_2 = stack_375_0 = add:byte(expr_34F:byte, loadelement:byte(var_3_335:byte[], add:int(var_5_336:int, ldc:int(6))))
                goto(Label_0901)
            }
            
            Label_0860:
            
            if (cmpeq:boolean(and:int(var_0_369:int, ldc:int(512)), ldc:int(0))) {
                var_0_369 = and:int(var_0_369:int, ldc:int(1625600872))
            }
            else {
                var_0_369 = and:int(var_0_369:int, ldc:int(1464168446))
                stack_3A1_2 = stack_375_0 = add:byte(expr_34F:byte, ldc:byte(6))
            }
            
            Label_0901:
            
            if (cmpeq:boolean(and:int(var_0_369:int, ldc:int(16384)), ldc:int(0))) {
                var_0_369 = and:int(var_0_369:int, ldc:int(643852353))
                goto(Label_0860)
            }
            
            var_0_B8 = and:int(var_0_369:int, ldc:int(-1823047864))
            storeelement:byte(var_3_335:byte[], var_5_336:int, stack_3A1_2:byte)
            
            if (cmpne:boolean(var_5_336:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_D5_0 = stack_D7_0 = stack_119_0 = stack_11B_0 = stack_148_0 = stack_34F_0 = stack_3DE_0 = stack_432_0 = stack_488_0 = var_3_335:byte[]
            goto(Label_0115)
        }
        
        Label_0967:
        
        while (cmpne:boolean(and:int(var_0_B8:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_B8 = and:int(var_0_B8:int, ldc:int(-147435617))
            var_5_336 = add:int(var_5_336:int, ldc:int(-1))
            expr_3E1 = xor:byte(loadelement:byte(stack_3DE_0:byte[], var_5_336:int), ldc:byte(3))
            storeelement:byte(var_3_335:byte[], var_5_336:int, or:int(and:int(shl:int(expr_3E1:byte, and:int(ldc:int(8716), ldc:int(372))), ldc:int(-16)), and:int(shr:int(expr_3E1:byte[expected:int], and:int(ldc:int(1388), ldc:int(8196))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_336:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_95_0 = stack_93_0 = stack_D5_0 = stack_D7_0 = stack_119_0 = stack_11B_0 = stack_148_0 = stack_34F_0 = stack_3DE_0 = stack_432_0 = stack_488_0 = var_3_335:byte[]
            goto(Label_0154)
        }
        
        goto(Label_0824)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_B8:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_0_B8:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_B8:int, ldc:int(1024)), ldc:int(0))) {
            var_0_B8 = and:int(var_0_B8:int, ldc:int(1405943782))
            expr_95 = arraylength:int(stack_95_0:byte[])
            
            if (cmpne:boolean(expr_95:int, ldc:int(0))) {
                var_4_330 = expr_95:int
                var_3_335 = newarray:byte[](byte.class, expr_95:int)
                var_5_336 = expr_95:int
                goto(Label_0967)
            }
        }
        
        Label_0154:
        
        if (cmpeq:boolean(and:int(var_0_B8:int, ldc:int(262144)), ldc:int(0))) {
            var_0_B8 = and:int(var_0_B8:int, ldc:int(388005080))
            goto(Label_0288)
        }
        
        if (cmpeq:boolean(and:int(var_0_B8:int, ldc:int(262144)), ldc:int(0))) {
            var_0_B8 = and:int(var_0_B8:int, ldc:int(1534691387))
        }
        else {
            if (cmpne:boolean(and:int(var_0_B8:int, ldc:int(64)), ldc:int(0))) {
                var_0_B8 = and:int(var_0_B8:int, ldc:int(-793037117))
                goto(Label_0115)
            }
            
            var_0_B8 = and:int(var_0_B8:int, ldc:int(2067066671))
            var_2_D5 = stack_D5_0:byte[]
            expr_D9 = add:int(arraylength:int(stack_D7_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_D9:int, ldc:int(0))) {
                var_3_420 = newarray:byte[](byte.class, expr_D9:int)
                var_5_421 = expr_D9:int
                
                loop {
                    var_0_B8 = and:int(var_0_B8:int, ldc:int(1940377574))
                    var_5_421 = add:int(var_5_421:int, ldc:int(-1))
                    storeelement:byte(var_3_420:byte[], var_5_421:int, add:int(shl:int(loadelement:byte(stack_432_0:byte[], var_5_421:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_D5:byte[], add:int(var_5_421:int, and:int(ldc:int(265), ldc:int(1249)))), ldc:int(3)), and:int(ldc:int(22559), ldc:int(8671)))))
                    
                    if (cmpne:boolean(var_5_421:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_D5_0 = stack_D7_0 = stack_119_0 = stack_11B_0 = stack_148_0 = stack_34F_0 = stack_3DE_0 = stack_432_0 = stack_488_0 = var_3_420:byte[]
            }
        }
        
        Label_0222:
        
        if (cmpeq:boolean(and:int(var_0_B8:int, ldc:int(256)), ldc:int(0))) {
            var_0_B8 = and:int(var_0_B8:int, ldc:int(-136316622))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_B8:int, ldc:int(16384)), ldc:int(0))) {
                var_0_B8 = and:int(var_0_B8:int, ldc:int(56615575))
                goto(Label_0154)
            }
            
            if (cmpne:boolean(and:int(var_0_B8:int, ldc:int(524288)), ldc:int(0))) {
                var_0_B8 = and:int(var_0_B8:int, ldc:int(-2034588219))
                goto(Label_0115)
            }
            
            var_0_B8 = and:int(var_0_B8:int, ldc:int(-607649913))
            expr_11B = arraylength:int(stack_11B_0:byte[])
            
            if (cmpne:boolean(expr_11B:int, ldc:int(0))) {
                var_3_476 = newarray:byte[](byte.class, expr_11B:int)
                var_5_477 = expr_11B:int
                
                loop {
                    var_0_B8 = and:int(var_0_B8:int, ldc:int(1606405903))
                    var_5_477 = add:int(var_5_477:int, ldc:int(-1))
                    storeelement:byte(var_3_476:byte[], var_5_477:int, add:byte(loadelement:byte(stack_488_0:byte[], var_5_477:int), ldc:byte(59)))
                    
                    if (cmpne:boolean(var_5_477:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_95_0 = stack_93_0 = stack_D5_0 = stack_D7_0 = stack_119_0 = stack_11B_0 = stack_148_0 = stack_34F_0 = stack_3DE_0 = stack_432_0 = stack_488_0 = var_3_476:byte[]
            }
        }
        
        Label_0288:
        
        if (cmpne:boolean(and:int(var_0_B8:int, ldc:int(524288)), ldc:int(0))) {
            var_0_B8 = and:int(var_0_B8:int, ldc:int(1475111486))
            goto(Label_0222)
        }
        
        if (cmpne:boolean(and:int(var_0_B8:int, ldc:int(2)), ldc:int(0))) {
            goto(Label_0154)
        }
        
        if (cmpne:boolean(and:int(var_0_B8:int, ldc:int(512)), ldc:int(0))) {
            var_3_154 = initobject:String(String::<init>, stack_148_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_15C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8393), ldc:int(8388)))
            expr_166 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2445), ldc:int(8781)))
            storeelement:String(expr_166:String[], and:int(ldc:int(20541), ldc:int(-20542)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(-9400), ldc:int(9379)), and:int(ldc:int(-10107), ldc:int(9842))))
            storeelement:String(expr_166:String[], and:int(ldc:int(24839), ldc:int(3591)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(-26019), ldc:int(25986)), and:int(ldc:int(289), ldc:int(19481))))
            storeelement:String(expr_166:String[], and:int(ldc:int(16906), ldc:int(4126)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(17591), ldc:int(9)), xor:int(ldc:int(128), ldc:int(131))))
            storeelement:String(expr_166:String[], and:int(ldc:int(792), ldc:int(3244)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(2122), ldc:int(2121)), and:int(ldc:int(660), ldc:int(38))))
            storeelement:String(expr_166:String[], xor:int(ldc:int(-12221), ldc:int(-12218)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(6145), ldc:int(6149)), xor:int(ldc:int(-32094), ldc:int(-32088))))
            storeelement:String(expr_166:String[], and:int(ldc:int(642), ldc:int(29702)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(16655), ldc:int(14378)), xor:int(ldc:int(4752), ldc:int(4743))))
            storeelement:String(expr_15C:String[], and:int(ldc:int(16395), ldc:int(8715)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(16651), ldc:int(16668)), and:int(ldc:int(309), ldc:int(12389))))
            storeelement:String(expr_166:String[], and:int(ldc:int(4244), ldc:int(1286)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(141), ldc:int(168)), xor:int(ldc:int(2064), ldc:int(2088))))
            storeelement:String(expr_15C:String[], xor:int(ldc:int(16385), ldc:int(16397)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(953), ldc:int(12350)), and:int(ldc:int(6606), ldc:int(1132))))
            storeelement:String(expr_166:String[], and:int(ldc:int(17545), ldc:int(2073)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(2637), ldc:int(13534)), and:int(ldc:int(1150), ldc:int(25183))))
            storeelement:String(expr_166:String[], and:int(ldc:int(395), ldc:int(1043)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(9086), ldc:int(95)), xor:int(ldc:int(4115), ldc:int(4222))))
            storeelement:String(expr_166:String[], xor:int(ldc:int(20672), ldc:int(20673)), invokevirtual:String[expected:String](String::substring, var_3_154:String, and:int(ldc:int(4845), ldc:int(2175)), xor:int(ldc:int(3), ldc:int(113))))
            storeelement:String(expr_166:String[], and:int(ldc:int(12679), ldc:int(19478)), invokevirtual:String[expected:String](String::substring, var_3_154:String, xor:int(ldc:int(20511), ldc:int(20589)), and:int(ldc:int(17535), ldc:int(631))))
            putstatic:String[](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6b5f\u3dd3\u927d\u4c2b\u516c\u3dd3, expr_166:String[])
            var_3_2CF = expr_15C:String[]
            putstatic:ITextComponent(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u8308\u8413\ua3b4\u72f1\u9255\u92ee, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_2CF:String[], and:int(ldc:int(527), ldc:int(26059)))))
            putstatic:ITextComponent(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u9255\u0800\u9255\u8bb0\u34df\u527a, initobject:TranslationTextComponent(TranslationTextComponent::<init>, loadelement:String(var_3_2CF:String[], and:int(ldc:int(668), ldc:int(2316)))))
            putstatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u64ab\uf9c5\uc246\u3711\u960f\ubb2b, invokestatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u718f\u8413\u1833\u72f1\u5fe1\u927d::\u071d\u9937\ud523\uae5d\u759a\uc238, loadelement:String(getstatic:String[](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6b5f\u3dd3\u927d\u4c2b\u516c\u3dd3), and:int(ldc:int(18056), ldc:int(298))), invokevirtual:Style(Style::setFormatting, getstatic:Style(Style::EMPTY), getstatic:TextFormatting(TextFormatting::BLACK))))
            putstatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u8389\u8258\uae5d\u5d20\u4d85\u527a::\ud217\ubf56\u8df4\u7043\ufe34\u7af6, invokestatic:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u718f\u8413\u1833\u72f1\u5fe1\u927d::\u071d\u9937\ud523\uae5d\u759a\uc238, loadelement:String(getstatic:String[](\u8389\u8258\uae5d\u5d20\u4d85\u527a::\u6b5f\u3dd3\u927d\u4c2b\u516c\u3dd3), and:int(ldc:int(11960), ldc:int(4104))), invokevirtual:Style(Style::setFormatting, getstatic:Style(Style::EMPTY), getstatic:TextFormatting(TextFormatting::GRAY))))
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_660 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
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
        var_3_660 = and:int(ldc:int(-1872997882), ldc:int(2128475844))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8389\u8258\uae5d\u5d20\u4d85\u527a[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
            var_3_660 = and:int(var_3_660:int, ldc:int(328744558))
        }
        else {
            var_3_660 = and:int(var_3_660:int, ldc:int(-1261076514))
            var_5_8A = and:int(ldc:int(-12030), ldc:int(9937))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-28113), ldc:int(26832)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_660:int, ldc:int(882301580))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, and:int(ldc:int(4609), ldc:int(17825)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(8713), ldc:int(2209)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_660 = and:int(var_3_DA:int, ldc:int(-581109842))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(9225), ldc:int(2853)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1036060094))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(85940925))
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(94190150))
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1001780455))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(404151063))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0604)
                            }
                            
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0411:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(66400663))
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1293230003))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1923862065))
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(128695018))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(848387505))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1097997295))
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1144782572))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(2063562740))
                            var_11_EB = and:int(ldc:int(-3229), ldc:int(3228))
                            goto(Label_1490)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0604:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1133309558))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-332868453))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1613386296))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1310860753))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0834)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-877142036))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1818605885))
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1751787529))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0834:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1831914481))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(2066685871))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1105488262))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1425245744))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(825710590))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = and:int(ldc:int(8805), ldc:int(2329))
                                goto(Label_1092)
                            }
                        }
                    }
                    
                    Label_0959:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(235208064))
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(2090792812))
                        var_11_EB = and:int(ldc:int(25357), ldc:int(-27438))
                    }
                    
                    Label_1092:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-448564991))
                        goto(Label_1353)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(125068787))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1284943398))
                            goto(Label_0834)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1268170809))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0411)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-2131711145))
                            loopcontinue()
                        }
                        
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1313416259))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1353)
                            }
                        }
                    }
                    
                    Label_1226:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1503276415))
                            goto(Label_1092)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0959)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0834)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(-1060307194))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0604)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(64)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(818728427))
                            goto(Label_0411)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_660 = and:int(var_3_660:int, ldc:int(1368751724))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1490)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1353:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1310323010))
                        goto(Label_1226)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(604739230))
                        goto(Label_0959)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-2026292304))
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1573991236))
                        goto(Label_0604)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0411)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(894957183))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1490:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66B = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1501:
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-2075855503))
                        goto(Label_1353)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(512)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1665310402))
                        goto(Label_1226)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1092)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(1887233054))
                        goto(Label_0959)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0834)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(2046393011))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0604)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_660:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-1753159415))
                        goto(Label_0411)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_660:int, ldc:int(32)), ldc:int(0))) {
                        var_3_660 = and:int(var_3_660:int, ldc:int(-803274876))
                        var_17_66B = add:int(var_16_119:int, and:int(ldc:int(14369), ldc:int(773)))
                        looporswitchbreak()
                    }
                    
                    var_3_660 = and:int(var_3_660:int, ldc:int(-2146810943))
                }
                
                var_3_660 = and:int(var_3_660:int, ldc:int(-17465820))
                
                if (cmple:boolean(var_5_8A = var_17_66B:int, sub:int(var_6_91:int, xor:int(ldc:int(2080), ldc:int(2081))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_660:int, ldc:int(16384)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
