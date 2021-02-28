public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 {
    public void \ucef1\u99f7\u4e72\u7873\u0800\u72f1(java.util.function.Function<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ufcaf\ud7e8\ud158\u6435\u759a\u6435> p0) {
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
    
    private \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ufcaf\ud7e8\ud158\u6435\u759a\u6435 \uc246\u5d20\uc2e8\u12cb\u7af6\uc3e3(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:\ufcaf\ud7e8\ud158\u6435\u759a\u6435(checkcast:\ufcaf\ud7e8\ud158\u6435\u759a\u6435(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ufcaf\ud7e8\ud158\u6435\u759a\u6435.class, invokeinterface:\ufcaf\ud7e8\ud158\u6435\u759a\u6435(Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ufcaf\ud7e8\ud158\u6435\u759a\u6435>::apply, getfield:Function<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \ufcaf\ud7e8\ud158\u6435\u759a\u6435>(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u5bc4\u97e6\ubded\u1833\uc9f6\uc31c, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)))
        }
        
        goto(Label_0006)
    }
    
    public int \ub83f\u527a\u0c95\u1833\uf9c5\ub7dc(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, java.lang.String p1, float p2, float p3, int p4) {
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
            return:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\uc29a\u7d52\ud51e\u4179\u7e3f\uc9f6, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p1:String, p2:float, p3:float, p4:int, invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)), and:int[expected:boolean](ldc:int(6017), ldc:int(8273)), invokevirtual:boolean(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u3dd3\uae87\u9255\u5654\uff55\u7873, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1)))
        }
        
        goto(Label_0006)
    }
    
    public int \u69d9\u6b0d\u647c\u12b2\u0a06\ub113(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, java.lang.String p1, float p2, float p3, int p4, boolean p5) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8413\u9033\u3bc9\uceb8\u1833\u97b7)
            return:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\uc29a\u7d52\ud51e\u4179\u7e3f\uc9f6, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p1:String, p2:float, p3:float, p4:int, invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)), xor:int[expected:boolean](ldc:int(-32640), ldc:int(-32639)), p5:boolean))
        }
        
        goto(Label_0006)
    }
    
    public int \u071d\u6198\ud12e\uc229\u93a2\ua6bd(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, java.lang.String p1, float p2, float p3, int p4) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8413\u9033\u3bc9\uceb8\u1833\u97b7)
            return:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\uc29a\u7d52\ud51e\u4179\u7e3f\uc9f6, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p1:String, p2:float, p3:float, p4:int, invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)), and:int[expected:boolean](ldc:int(-16487), ldc:int(16486)), invokevirtual:boolean(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u3dd3\uae87\u9255\u5654\uff55\u7873, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1)))
        }
        
        goto(Label_0006)
    }
    
    public int \u69d9\u4ab3\uc910\u8308\u516c\u7ce1(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d p1, float p2, float p3, int p4) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8413\u9033\u3bc9\uceb8\u1833\u97b7)
            return:int(invokespecial:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ubded\u5bc4\u120d\uff55\u7006\u4d85, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p1:\u718f\u8413\u1833\u72f1\u5fe1\u927d, p2:float, p3:float, p4:int, invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)), xor:int[expected:boolean](ldc:int(640), ldc:int(641))))
        }
        
        goto(Label_0006)
    }
    
    public int \u6bb9\u67e9\u8df4\u8413\u624e\ucb79(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, net.minecraft.util.text.ITextComponent p1, float p2, float p3, int p4) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8413\u9033\u3bc9\uceb8\u1833\u97b7)
            return:int(invokespecial:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ubded\u5bc4\u120d\uff55\u7006\u4d85, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, invokeinterface:\u718f\u8413\u1833\u72f1\u5fe1\u927d(ITextComponent::func_241878_f, p1:ITextComponent), p2:float, p3:float, p4:int, invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)), and:int[expected:boolean](ldc:int(10753), ldc:int(17473))))
        }
        
        goto(Label_0006)
    }
    
    public int \u8709\ub19c\ub8be\u52d3\u3dd3\u183a(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d p1, float p2, float p3, int p4) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8413\u9033\u3bc9\uceb8\u1833\u97b7)
            return:int(invokespecial:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ubded\u5bc4\u120d\uff55\u7006\u4d85, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p1:\u718f\u8413\u1833\u72f1\u5fe1\u927d, p2:float, p3:float, p4:int, invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)), and:int[expected:boolean](ldc:int(8835), ldc:int(-8836))))
        }
        
        goto(Label_0006)
    }
    
    public int \ub18d\u99f7\uc910\u97e6\u5245\uceb8(\u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uafe7\uc7fe\u4c04\u6b5f\u5bc4 p0, net.minecraft.util.text.ITextComponent p1, float p2, float p3, int p4) {
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
            invokestatic:void(\u9af2\u6ec6\u983f\ua068\u8c8a::\u8413\u9033\u3bc9\uceb8\u1833\u97b7)
            return:int(invokespecial:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ubded\u5bc4\u120d\uff55\u7006\u4d85, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, invokeinterface:\u718f\u8413\u1833\u72f1\u5fe1\u927d(ITextComponent::func_241878_f, p1:ITextComponent), p2:float, p3:float, p4:int, invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u3711\u6c52\ufcaf\u4bc8\ud158::\u6d99\uae87\u8aa5\u6c52\u4c2b\u88c5, invokevirtual:\u3711\u6c52\ufcaf\u4bc8\ud158(\uafe7\uc7fe\u4c04\u6b5f\u5bc4::\u9033\u12b2\u516c\u97e6\u6d99\ua3b4, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)), and:int[expected:boolean](ldc:int(-25952), ldc:int(25949))))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u6b0d\u494c\ua3b4\ub8be\u8389\u718f(java.lang.String p0) {
        var_2_5F : int
        var_4_7B : Bidi
        stack_BA_0 : String [generated]
        
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
        var_2_5F = and:int(ldc:int(954498396), ldc:int(1855241320))
        
        try {
            var_2_5F = and:int(var_2_5F:int, ldc:int(-1413202816))
            var_4_7B = initobject:Bidi(Bidi::<init>, invokevirtual:String(ArabicShaping::shape, initobject:ArabicShaping(ArabicShaping::<init>, ldc:int(8)), p0:String), ldc:int(127))
            
            loop {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1810316690))
                    invokevirtual:void(Bidi::setReorderingMode, var_4_7B:Bidi, and:int(ldc:int(-32009), ldc:int(31752)))
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(1073741824)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(724475394))
            }
            
            var_2_5F = and:int(var_2_5F:int, ldc:int(747437204))
            stack_BA_0 = invokevirtual:String(Bidi::writeReordered, var_4_7B:Bidi, and:int(ldc:int(16398), ldc:int(8610)))
            var_2_5F = and:int(var_2_5F:int, ldc:int(-1079165214))
            return:String(stack_BA_0:String)
        }
        catch (com.ibm.icu.text.ArabicShapingException var_4_BF) {
            return:String(p0:String)
        }
    }
    
    public int \uc29a\u7d52\ud51e\u4179\u7e3f\uc9f6(java.lang.String p0, float p1, float p2, int p3, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p4, boolean p5, boolean p6) {
        var_10_77 : \u61a4\u76bc\u0c95\u1833\u7043\u3711
        var_11_9A : int
        
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
        
        if (cmpne:boolean(p0:String, aconstnull:String())) {
            var_10_77 = invokestatic:\u61a4\u76bc\u0c95\u1833\u7043\u3711(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ud523\u927d\u97e6\ud51e\u99f7\u71f1, invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f)))
            var_11_9A = invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u5d20\u8308\u4f52\u71ae\u59ec\u5d20, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p0:String, p1:float, p2:float, p3:int, p5:boolean, p4:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_10_77:\u61a4\u76bc\u0c95\u1833\u7043\u3711[expected:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa], and:int[expected:boolean](ldc:int(-15730), ldc:int(15633)), and:int(ldc:int(2954), ldc:int(-19339)), ldc:int(15728880), p6:boolean)
            invokevirtual:void(\u61a4\u76bc\u0c95\u1833\u7043\u3711::\u52d3\ua3b4\uae87\u1833\u9a18\u51b2, var_10_77:\u61a4\u76bc\u0c95\u1833\u7043\u3711)
            return:int(var_11_9A:int)
        }
        
        return:int(and:int(ldc:int(2658), ldc:int(-23143)))
    }
    
    public void \u446c\u92ee\ubefe\u6c52\ud36e\u9af2(java.util.List<java.lang.String> p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\ud7e8\u5245\u839e\u927d\ua6bd\u8aa5[] p1, int p2, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p3, boolean p4, boolean p5) {
        var_7_86 : int
        var_9_6C : \u61a4\u76bc\u0c95\u1833\u7043\u3711
        var_10_75 : int
        var_11_C4 : String
        var_12_F0 : \ud7e8\u5245\u839e\u927d\ua6bd\u8aa5
        
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
            var_7_86 = and:int(ldc:int(-2029953359), ldc:int(-2088244140))
            var_9_6C = invokestatic:\u61a4\u76bc\u0c95\u1833\u7043\u3711(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ud523\u927d\u97e6\ud51e\u99f7\u71f1, invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f)))
            var_10_75 = and:int(ldc:int(-24513), ldc:int(24000))
            
            loop {
                if (cmpeq:boolean(and:int(var_7_86:int, ldc:int(256)), ldc:int(0))) {
                    var_7_86 = and:int(var_7_86:int, ldc:int(-1959564293))
                    
                    if (cmplt:boolean(var_10_75:int, invokeinterface:int(List<E>::size, p0:List<String>))) {
                        var_11_C4 = checkcast:String(java.lang.String.class, invokeinterface:String(List<String>::get, p0:List<String>, var_10_75:int))
                        
                        if (cmpne:boolean(var_11_C4:String, aconstnull:String())) {
                            if (logicalnot:boolean(invokevirtual:boolean(String::isEmpty, var_11_C4:String))) {
                                var_12_F0 = loadelement:\ud7e8\u5245\u839e\u927d\ua6bd\u8aa5(p1:\ud7e8\u5245\u839e\u927d\ua6bd\u8aa5[], var_10_75:int)
                                
                                if (cmpne:boolean(var_12_F0:\ud7e8\u5245\u839e\u927d\ua6bd\u8aa5, aconstnull:\ud7e8\u5245\u839e\u927d\ua6bd\u8aa5())) {
                                    invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u5d20\u8308\u4f52\u71ae\u59ec\u5d20, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, var_11_C4:String, i2f:float(invokevirtual:int(\ud7e8\u5245\u839e\u927d\ua6bd\u8aa5::\u6c52\u0a06\ub83f\u600f\uc246\ud12e, var_12_F0:\ud7e8\u5245\u839e\u927d\ua6bd\u8aa5)), i2f:float(invokevirtual:int(\ud7e8\u5245\u839e\u927d\ua6bd\u8aa5::\u6d99\u67d0\ud7e8\ud523\u8c8a\u5d20, var_12_F0:\ud7e8\u5245\u839e\u927d\ua6bd\u8aa5)), p2:int, p4:boolean, p3:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_9_6C:\u61a4\u76bc\u0c95\u1833\u7043\u3711[expected:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa], and:int[expected:boolean](ldc:int(16621), ldc:int(-25854)), and:int(ldc:int(16747), ldc:int(-16768)), ldc:int(15728880), p5:boolean)
                                }
                            }
                        }
                        
                        var_7_86 = and:int(var_7_86:int, ldc:int(-5670440))
                        inc:int(var_10_75, ldc:int(1))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_7_86:int, ldc:int(33554432)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_7_86 = and:int(var_7_86:int, ldc:int(1763419189))
            }
            
            invokevirtual:void(\u61a4\u76bc\u0c95\u1833\u7043\u3711::\u52d3\ua3b4\uae87\u1833\u9a18\u51b2, var_9_6C:\u61a4\u76bc\u0c95\u1833\u7043\u3711)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private int \ubded\u5bc4\u120d\uff55\u7006\u4d85(\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d p0, float p1, float p2, int p3, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p4, boolean p5) {
        var_9_6E : \u61a4\u76bc\u0c95\u1833\u7043\u3711
        var_10_8F : int
        
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
            var_9_6E = invokestatic:\u61a4\u76bc\u0c95\u1833\u7043\u3711(\u12cb\u12b2\ua3b4\u183a\ud158\u51fa::\ud523\u927d\u97e6\ud51e\u99f7\u71f1, invokevirtual:\u760c\u7ce1\u9a18\ub32d\u6d99\ub6ab(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u74b1\u7bad\u6435\uc87f\u6d69\uc238, invokestatic:\ub6ab\u8cae\u64ab\u5245\ubff1\u3711(\ub6ab\u8cae\u64ab\u5245\ubff1\u3711::\u3504\ud523\u99f7\u5140\u5d20\u983f)))
            var_10_8F = invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\uc87f\u3e2a\uc29a\ub113\u4cd9\u965f, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p0:\u718f\u8413\u1833\u72f1\u5fe1\u927d, p1:float, p2:float, p3:int, p5:boolean, p4:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, var_9_6E:\u61a4\u76bc\u0c95\u1833\u7043\u3711[expected:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa], and:int[expected:boolean](ldc:int(-26891), ldc:int(26890)), and:int(ldc:int(-21760), ldc:int(20715)), ldc:int(15728880))
            invokevirtual:void(\u61a4\u76bc\u0c95\u1833\u7043\u3711::\u52d3\ua3b4\uae87\u1833\u9a18\u51b2, var_9_6E:\u61a4\u76bc\u0c95\u1833\u7043\u3711)
            return:int(var_10_8F:int)
        }
        
        goto(Label_0006)
    }
    
    public int \uc29a\u7d52\ud51e\u4179\u7e3f\uc9f6(java.lang.String p0, float p1, float p2, int p3, boolean p4, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p5, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p6, boolean p7, int p8, int p9) {
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
            return:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u5d20\u8308\u4f52\u71ae\u59ec\u5d20, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p0:String, p1:float, p2:float, p3:int, p4:boolean, p5:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, p6:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p7:boolean, p8:int, p9:int, invokevirtual:boolean(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u3dd3\uae87\u9255\u5654\uff55\u7873, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1)))
        }
        
        goto(Label_0006)
    }
    
    public int \u5d20\u8308\u4f52\u71ae\u59ec\u5d20(java.lang.String p0, float p1, float p2, int p3, boolean p4, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p5, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p6, boolean p7, int p8, int p9, boolean p10) {
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
            return:int(invokespecial:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\uf9c5\u6ec6\u6ec6\u836c\u6d69\u67d0, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p0:String, p1:float, p2:float, p3:int, p4:boolean, p5:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, p6:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p7:boolean, p8:int, p9:int, p10:boolean))
        }
        
        goto(Label_0006)
    }
    
    public int \ucfaf\ub70c\u5db4\u647c\u8413\u7af6(net.minecraft.util.text.ITextComponent p0, float p1, float p2, int p3, boolean p4, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p5, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p6, boolean p7, int p8, int p9) {
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
            return:int(invokevirtual:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\uc87f\u3e2a\uc29a\ub113\u4cd9\u965f, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, invokeinterface:\u718f\u8413\u1833\u72f1\u5fe1\u927d(ITextComponent::func_241878_f, p0:ITextComponent), p1:float, p2:float, p3:int, p4:boolean, p5:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, p6:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p7:boolean, p8:int, p9:int))
        }
        
        goto(Label_0006)
    }
    
    public int \uc87f\u3e2a\uc29a\ub113\u4cd9\u965f(\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d p0, float p1, float p2, int p3, boolean p4, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p5, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p6, boolean p7, int p8, int p9) {
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
            return:int(invokespecial:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u873d\u183a\u5654\u61a4\u4c04\u0a06, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p0:\u718f\u8413\u1833\u72f1\u5fe1\u927d, p1:float, p2:float, p3:int, p4:boolean, p5:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, p6:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p7:boolean, p8:int, p9:int))
        }
        
        goto(Label_0006)
    }
    
    private static int \u4f52\u983f\u446c\u59ec\u51b2\u5f50(int p0) {
        var_1_61 : int
        stack_83_0 : int [generated]
        
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
            var_1_61 = and:int(ldc:int(-1475694445), ldc:int(-1384926247))
            
            if (cmpne:boolean(and:int(p0:int, ldc:int(-67108864)), ldc:int(0))) {
                var_1_61 = and:int(var_1_61:int, ldc:int(-87118441))
                stack_83_0 = p0:int
            }
            else {
                stack_83_0 = or:int(p0:int, ldc:int(-16777216))
            }
            
            return:int(stack_83_0:int)
        }
        
        goto(Label_0006)
    }
    
    private int \uf9c5\u6ec6\u6ec6\u836c\u6d69\u67d0(java.lang.String p0, float p1, float p2, int p3, boolean p4, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p5, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p6, boolean p7, int p8, int p9, boolean p10) {
        var_12_63 : int
        var_12_70 : int
        var_14_7E : \uc87f\u5f50\u16f6\ub113\u52d3\u12b2
        var_12_8B : int
        stack_10B_0 : int [generated]
        stack_10B_1 : int [generated]
        
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
            var_12_63 = and:int(ldc:int(1124521935), ldc:int(1802302528))
            
            if (p10:boolean) {
                p0 = invokevirtual:String(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6b0d\u494c\ua3b4\ub8be\u8389\u718f, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p0:String)
            }
            
            var_12_70 = and:int(var_12_63:int, ldc:int(-216730662))
            p3 = invokestatic:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u4f52\u983f\u446c\u59ec\u51b2\u5f50, p3:int)
            var_14_7E = invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::\u64f2\u527a\u97b7\u8640\u7006\u071d, p5:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2)
            
            if (p4:boolean) {
                invokespecial:float(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u3d4b\u92ee\u4c2b\ubff1\u624e\u7006, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p0:String, p1:float, p2:float, p3:int, and:int[expected:boolean](ldc:int(7169), ldc:int(16631)), p5:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, p6:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p7:boolean, p8:int, p9:int)
                invokevirtual:void(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::\uc9f6\ufcaf\u6b0d\u8389\ud51e\u8aa5, var_14_7E:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, getstatic:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u156b\u61a4\u8aa5\ubefe\u71ae\ube23))
            }
            
            var_12_8B = and:int(var_12_70:int, ldc:int(268300909))
            p1 = invokespecial:float(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u3d4b\u92ee\u4c2b\ubff1\u624e\u7006, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p0:String, p1:float, p2:float, p3:int, and:int[expected:boolean](ldc:int(-1644), ldc:int(1611)), var_14_7E:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, p6:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p7:boolean, p8:int, p9:int)
            stack_10B_0 = f2i:int(p1:float)
            
            if (logicalnot:boolean(p4:boolean)) {
                var_12_8B = and:int(var_12_8B:int, ldc:int(828824439))
                stack_10B_1 = and:int(ldc:int(-30415), ldc:int(24778))
            }
            else {
                stack_10B_1 = xor:int(ldc:int(-32368), ldc:int(-32367))
            }
            
            return:int(add:int(stack_10B_0:int, stack_10B_1:int))
        }
        
        goto(Label_0006)
    }
    
    private int \u873d\u183a\u5654\u61a4\u4c04\u0a06(\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d p0, float p1, float p2, int p3, boolean p4, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p5, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p6, boolean p7, int p8, int p9) {
        var_11_63 : int
        var_13_71 : \uc87f\u5f50\u16f6\ub113\u52d3\u12b2
        var_11_7E : int
        stack_F1_0 : int [generated]
        stack_F1_1 : int [generated]
        
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
            var_11_63 = and:int(ldc:int(-2017813805), ldc:int(-1884038830))
            p3 = invokestatic:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u4f52\u983f\u446c\u59ec\u51b2\u5f50, p3:int)
            var_13_71 = invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::\u64f2\u527a\u97b7\u8640\u7006\u071d, p5:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2)
            
            if (p4:boolean) {
                invokespecial:float(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6c52\u5140\uae5d\ua068\ua3b4\u4daf, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p0:\u718f\u8413\u1833\u72f1\u5fe1\u927d, p1:float, p2:float, p3:int, and:int[expected:boolean](ldc:int(273), ldc:int(6177)), p5:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, p6:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p7:boolean, p8:int, p9:int)
                invokevirtual:void(\uc87f\u5f50\u16f6\ub113\u52d3\u12b2::\uc9f6\ufcaf\u6b0d\u8389\ud51e\u8aa5, var_13_71:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, getstatic:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u156b\u61a4\u8aa5\ubefe\u71ae\ube23))
            }
            
            var_11_7E = and:int(var_11_63:int, ldc:int(-671958959))
            p1 = invokespecial:float(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u6c52\u5140\uae5d\ua068\ua3b4\u4daf, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p0:\u718f\u8413\u1833\u72f1\u5fe1\u927d, p1:float, p2:float, p3:int, and:int[expected:boolean](ldc:int(19780), ldc:int(-19814)), var_13_71:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, p6:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p7:boolean, p8:int, p9:int)
            stack_F1_0 = f2i:int(p1:float)
            
            if (logicalnot:boolean(p4:boolean)) {
                var_11_7E = and:int(var_11_7E:int, ldc:int(-806102153))
                stack_F1_1 = and:int(ldc:int(16504), ldc:int(-16509))
            }
            else {
                stack_F1_1 = and:int(ldc:int(2057), ldc:int(9283))
            }
            
            return:int(add:int(stack_F1_0:int, stack_F1_1:int))
        }
        
        goto(Label_0006)
    }
    
    private float \u3d4b\u92ee\u4c2b\ubff1\u624e\u7006(java.lang.String p0, float p1, float p2, int p3, boolean p4, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p5, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p6, boolean p7, int p8, int p9) {
        var_13_7B : \u88c5\u59ec\u93a2\u8258\ub6ab\u72f1
        
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
            var_13_7B = initobject:\u88c5\u59ec\u93a2\u8258\ub6ab\u72f1(\u88c5\u59ec\u93a2\u8258\ub6ab\u72f1::<init>, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p6:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p1:float, p2:float, p3:int, p4:boolean, p5:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, p7:boolean, p9:int)
            invokestatic:boolean(TextProcessing::func_238346_c_, p0:String, getstatic:Style(Style::EMPTY), var_13_7B:\u88c5\u59ec\u93a2\u8258\ub6ab\u72f1[expected:\ub8be\u1187\ud523\u3c25\u8d98\u760c])
            return:float(invokevirtual:float(\u88c5\u59ec\u93a2\u8258\ub6ab\u72f1::\u92ee\u5140\u8753\ub7dc\ucfaf\uc229, var_13_7B:\u88c5\u59ec\u93a2\u8258\ub6ab\u72f1, p8:int, p1:float))
        }
        
        goto(Label_0006)
    }
    
    private float \u6c52\u5140\uae5d\ua068\ua3b4\u4daf(\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d p0, float p1, float p2, int p3, boolean p4, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p5, \u927d\u92ff\u71ae\uafe7\u6bb9.\u12cb\u12b2\ua3b4\u183a\ud158\u51fa p6, boolean p7, int p8, int p9) {
        var_13_7B : \u88c5\u59ec\u93a2\u8258\ub6ab\u72f1
        
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
            var_13_7B = initobject:\u88c5\u59ec\u93a2\u8258\ub6ab\u72f1(\u88c5\u59ec\u93a2\u8258\ub6ab\u72f1::<init>, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p6:\u12cb\u12b2\ua3b4\u183a\ud158\u51fa, p1:float, p2:float, p3:int, p4:boolean, p5:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, p7:boolean, p9:int)
            invokeinterface:boolean(\u718f\u8413\u1833\u72f1\u5fe1\u927d::\u416d\ufcaf\u759a\ubff1\ud7e8\u12cb, p0:\u718f\u8413\u1833\u72f1\u5fe1\u927d, var_13_7B:\u88c5\u59ec\u93a2\u8258\ub6ab\u72f1[expected:\ub8be\u1187\ud523\u3c25\u8d98\u760c])
            return:float(invokevirtual:float(\u88c5\u59ec\u93a2\u8258\ub6ab\u72f1::\u92ee\u5140\u8753\ub7dc\ucfaf\uc229, var_13_7B:\u88c5\u59ec\u93a2\u8258\ub6ab\u72f1, p8:int, p1:float))
        }
        
        goto(Label_0006)
    }
    
    private void \u59ec\u836c\u416d\u385b\u9255\u8aa5(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf p0, boolean p1, boolean p2, float p3, float p4, float p5, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p6, \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p7, float p8, float p9, float p10, float p11, int p12) {
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
            invokevirtual:void(\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf::\u5140\ub19c\u0c95\u36d3\ubefe\uf9c5, p0:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf, p2:boolean, p4:float, p5:float, p6:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, p7:\u6b0d\uf9c5\ucfaf\ud36e\ub102, p8:float, p9:float, p10:float, p11:float, p12:int)
            
            if (p1:boolean) {
                invokevirtual:void(\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf::\u5140\ub19c\u0c95\u36d3\ubefe\uf9c5, p0:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf, p2:boolean, add:float(p4:float, p3:float), p5:float, p6:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, p7:\u6b0d\uf9c5\ucfaf\ud36e\ub102, p8:float, p9:float, p10:float, p11:float, p12:int)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u6435\u516c\u873d\u88c5\u3d4b\u1187(java.lang.String p0) {
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
            return:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, invokevirtual:float(CharacterManager::func_238350_a_, getfield:CharacterManager(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u718f\ub83f\ud36e\u3776\ub32d\uc84e, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1), p0:String)))
        }
        
        goto(Label_0006)
    }
    
    public int \ucb79\ua3b4\u946b\uc246\ua068\u36d3(net.minecraft.util.text.ITextProperties p0) {
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
            return:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, invokevirtual:float(CharacterManager::func_238356_a_, getfield:CharacterManager(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u718f\ub83f\ud36e\u3776\ub32d\uc84e, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1), p0:ITextProperties)))
        }
        
        goto(Label_0006)
    }
    
    public int \u4bc8\uc7fe\u3dd3\u3d64\u7043\u4c04(\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d p0) {
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
            return:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\u3e75\u4bc8\u416d\u92ff\u7c6b\ub6ab, invokevirtual:float(CharacterManager::func_243238_a, getfield:CharacterManager(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u718f\ub83f\ud36e\u3776\ub32d\uc84e, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1), p0:\u718f\u8413\u1833\u72f1\u5fe1\u927d)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u74b1\u385b\uafe7\ub83f\u7049\u51b2(java.lang.String p0, int p1, boolean p2) {
        var_4_63 : int
        stack_98_0 : String [generated]
        
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
            var_4_63 = and:int(ldc:int(949091856), ldc:int(-543969671))
            
            if (logicalnot:boolean(p2:boolean)) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-1175216197))
                stack_98_0 = invokevirtual:String(CharacterManager::func_238361_b_, getfield:CharacterManager(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u718f\ub83f\ud36e\u3776\ub32d\uc84e, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1), p0:String, p1:int, getstatic:Style(Style::EMPTY))
            }
            else {
                stack_98_0 = invokevirtual:String(CharacterManager::func_238364_c_, getfield:CharacterManager(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u718f\ub83f\ud36e\u3776\ub32d\uc84e, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1), p0:String, p1:int, getstatic:Style(Style::EMPTY))
            }
            
            return:String(stack_98_0:String)
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u6435\ubb2b\u7330\u446c\u8413\ubff1(java.lang.String p0, int p1) {
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
            return:String(invokevirtual:String(CharacterManager::func_238361_b_, getfield:CharacterManager(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u718f\ub83f\ud36e\u3776\ub32d\uc84e, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1), p0:String, p1:int, getstatic:Style(Style::EMPTY)))
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.ITextProperties \u8389\ub32d\u3504\u1833\u9af2\ub19c(net.minecraft.util.text.ITextProperties p0, int p1) {
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
            return:ITextProperties(invokevirtual:ITextProperties(CharacterManager::func_238358_a_, getfield:CharacterManager(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u718f\ub83f\ud36e\u3776\ub32d\uc84e, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1), p0:ITextProperties, p1:int, getstatic:Style(Style::EMPTY)))
        }
        
        goto(Label_0006)
    }
    
    public void \u3bc9\u9255\u156b\u836c\ubb2b\u960f(net.minecraft.util.text.ITextProperties p0, int p1, int p2, int p3, int p4) {
        var_6_63 : int
        var_8_6B : \uc87f\u5f50\u16f6\ub113\u52d3\u12b2
        var_9_79 : Iterator<\u718f\u8413\u1833\u72f1\u5fe1\u927d>
        
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
            var_6_63 = and:int(ldc:int(-579648852), ldc:int(-1209052427))
            var_8_6B = invokevirtual:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2(\u4c04\u56bd\ub7dc\u8709\u72f1\ufe34::\u647c\uf995\u759a\ub113\u3bc9\u6435, invokestatic:\u4c04\u56bd\ub7dc\u8709\u72f1\ufe34(\u4c04\u56bd\ub7dc\u8709\u72f1\ufe34::\ufe34\u71f1\ud7e8\ua068\u6d99\ua562))
            var_9_79 = invokeinterface:Iterator<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>::iterator, invokevirtual:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\uc7fe\u3bd6\u5db4\u4cd9\u8413\u6d69, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p0:ITextProperties, p3:int))
            
            loop {
                var_6_63 = and:int(var_6_63:int, ldc:int(-1046224207))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_9_79:Iterator))) {
                    looporswitchbreak()
                }
                
                invokespecial:int(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\ubded\u5bc4\u120d\uff55\u7006\u4d85, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, checkcast:\u718f\u8413\u1833\u72f1\u5fe1\u927d(\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d.class, invokeinterface:\u718f\u8413\u1833\u72f1\u5fe1\u927d(Iterator<\u718f\u8413\u1833\u72f1\u5fe1\u927d>::next, var_9_79:Iterator<\u718f\u8413\u1833\u72f1\u5fe1\u927d>)), i2f:float(p1:int), i2f:float(p2:int), p4:int, var_8_6B:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, and:int[expected:boolean](ldc:int(-8978), ldc:int(8977)))
                inc:int(p2, ldc:int(9))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public int \u1187\u6b5f\u946b\ua61f\u983f\uceb8(java.lang.String p0, int p1) {
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
            return:int(mul:int(ldc:int(9), invokeinterface:int(List<E>::size, invokevirtual:List<ITextProperties>(CharacterManager::func_238365_g_, getfield:CharacterManager(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u718f\ub83f\ud36e\u3776\ub32d\uc84e, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1), p0:String, p1:int, getstatic:Style(Style::EMPTY)))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u5d20\u7043\u88c5\u5db4\uf94d.\u718f\u8413\u1833\u72f1\u5fe1\u927d> \uc7fe\u3bd6\u5db4\u4cd9\u8413\u6d69(net.minecraft.util.text.ITextProperties p0, int p1) {
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
            return:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(invokevirtual:List<\u718f\u8413\u1833\u72f1\u5fe1\u927d>(LanguageMap::func_244260_a, invokestatic:LanguageMap(LanguageMap::getInstance), invokevirtual:List<ITextProperties>(CharacterManager::func_238362_b_, getfield:CharacterManager(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u718f\ub83f\ud36e\u3776\ub32d\uc84e, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1), p0:ITextProperties, p1:int, getstatic:Style(Style::EMPTY))))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3dd3\uae87\u9255\u5654\uff55\u7873() {
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
            return:boolean(invokevirtual:boolean(LanguageMap::func_230505_b_, invokestatic:LanguageMap(LanguageMap::getInstance)))
        }
        
        goto(Label_0006)
    }
    
    public net.minecraft.util.text.CharacterManager \u92ff\u760c\u3bc9\u6198\ubff1\u64ab() {
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
            return:CharacterManager(getfield:CharacterManager(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u718f\ub83f\ud36e\u3776\ub32d\uc84e, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1))
        }
        
        goto(Label_0006)
    }
    
    private float lambda$\u7ce1\u600f\ub32d\u8c8a\ucef1\uae87$0(int p0, net.minecraft.util.text.Style p1) {
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
            return:float(invokeinterface:float(\u8350\ub70c\u8753\u0800\u0c95\ud217::\u2dcc\u3a62\u67d0\u40a9\u5bc4\uf9c5, invokevirtual:\u8350\ub70c\u8753\u0800\u0c95\ud217(\ufcaf\ud7e8\ud158\u6435\u759a\u6435::\u0c95\u4c04\u718f\u64ab\ua562\ucb79, invokespecial:\ufcaf\ud7e8\ud158\u6435\u759a\u6435(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\uc246\u5d20\uc2e8\u12cb\u7af6\uc3e3, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Style::getFontId, p1:Style)), p0:int), invokevirtual:boolean(Style::getBold, p1:Style)))
        }
        
        goto(Label_0006)
    }
    
    public static void \u64f2\u4975\u2dcc\u6d99\u7873\ub171(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf p1, boolean p2, boolean p3, float p4, float p5, float p6, \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\uc87f\u5f50\u16f6\ub113\u52d3\u12b2 p7, \u59ec\u8413\u97e6\uc229\u3776.\u6b0d\uf9c5\ucfaf\ud36e\ub102 p8, float p9, float p10, float p11, float p12, int p13) {
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
            invokespecial:void(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u59ec\u836c\u416d\u385b\u9255\u8aa5, p0:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p1:\u8df4\u12cb\u8d98\u64f2\ucb79\ucfaf, p2:boolean, p3:boolean, p4:float, p5:float, p6:float, p7:\uc87f\u5f50\u16f6\ub113\u52d3\u12b2, p8:\u6b0d\uf9c5\ucfaf\ud36e\ub102, p9:float, p10:float, p11:float, p12:float, p13:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u51fa\u12cb\u7330\u74b1\u6c52.\u76bc\u4975\ua6bd\u4daf\u8d98.\ufcaf\ud7e8\ud158\u6435\u759a\u6435 \uc4d2\u3a62\u93a2\u72f1\u8cae\u3d4b(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\ucef1\u99f7\u4e72\u7873\u0800\u72f1 p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1) {
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
            return:\ufcaf\ud7e8\ud158\u6435\u759a\u6435(invokespecial:\ufcaf\ud7e8\ud158\u6435\u759a\u6435(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\uc246\u5d20\uc2e8\u12cb\u7af6\uc3e3, p0:\ucef1\u99f7\u4e72\u7873\u0800\u72f1, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))
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
            putstatic:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\ucef1\u99f7\u4e72\u7873\u0800\u72f1::\u156b\u61a4\u8aa5\ubefe\u71ae\ube23, initobject:\uae5d\ua068\u9a18\u8413\u51fa\ub83f(\uae5d\ua068\u9a18\u8413\u51fa\ub83f::<init>, ldc:float(0.0f), ldc:float(0.0f), ldc:float(0.03f)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ud217\u6cfe\ub8be\ud7e8\uc2bd\u93a2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_664 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_BF : double
        var_3_D1 : int
        var_11_E2 : int
        var_14_10C : double
        var_16_110 : int
        var_12_108 : double
        var_17_66F : int
        
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
        var_3_664 = and:int(ldc:int(-1848686685), ldc:int(-574007631))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ucef1\u99f7\u4e72\u7873\u0800\u72f1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_664 = and:int(var_3_664:int, ldc:int(836356073))
            var_5_81 = and:int(ldc:int(30545), ldc:int(-30674))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10607), ldc:int(10600)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D1 = and:int(var_3_664:int, ldc:int(2010244853))
                    var_9_BF = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E2 = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E2:int, sub:int(var_6_88:int, and:int(ldc:int(8231), ldc:int(5441)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E2:int, and:int(ldc:int(641), ldc:int(8257)))), var_7_97:double))) {
                        inc:int(var_11_E2, ldc:int(1))
                    }
                    
                    var_3_664 = and:int(var_3_D1:int, ldc:int(1407045561))
                    var_14_10C = var_7_97:double
                    var_16_110 = var_11_E2:int
                }
                else {
                    var_11_E2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(8218), ldc:int(8219)))
                    var_12_108 = var_14_10C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_110 = var_11_E2:int, var_6_88:int)) {
                        var_9_BF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E2:int)
                        var_16_110 = var_11_E2:int
                        var_14_10C = var_12_108:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1015468555))
                        goto(Label_1524)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1061163390))
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(745780195))
                        goto(Label_0911)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-76456637))
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(514828456))
                        goto(Label_0673)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1614956792))
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-845429906))
                    }
                    else {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-69777467))
                        
                        if (cmplt:boolean(var_16_110:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0567)
                            }
                            
                            goto(Label_0804)
                        }
                    }
                    
                    Label_0428:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1524)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0911)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(128)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-395190104))
                        goto(Label_0673)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1310470151))
                            var_11_E2 = and:int(ldc:int(18025), ldc:int(-24554))
                            goto(Label_1513)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0567:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1524)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0911)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(294911960))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1974199872))
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1275893785))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10C = var_9_BF:double
                            goto(Label_0804)
                        }
                    }
                    
                    Label_0673:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1524)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1178749088))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(20272719))
                        goto(Label_0911)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-94724830))
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(128)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(1574389305))
                            goto(Label_0428)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-134910333))
                        var_14_10C = mul:double(ldc:double(0.5), add:double(var_9_BF:double, var_14_10C:double))
                    }
                    
                    Label_0804:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1524)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1431982366))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(817247682))
                            goto(Label_0673)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(2043143889))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_E2 = xor:int(ldc:int(53), ldc:int(52))
                                goto(Label_1080)
                            }
                        }
                    }
                    
                    Label_0911:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1744558070))
                        goto(Label_1524)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1434663541))
                        goto(Label_1222)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-576602441))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(128)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-2042258861))
                            goto(Label_0804)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0673)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1787221610))
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-2662691))
                        var_11_E2 = and:int(ldc:int(30355), ldc:int(-30356))
                    }
                    
                    Label_1080:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1707027539))
                        goto(Label_1524)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1799288835))
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1260972835))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(1784058236))
                            goto(Label_0911)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(2113732849))
                            goto(Label_0804)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-511107163))
                            goto(Label_0673)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0567)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1713416521))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                                goto(Label_1367)
                            }
                        }
                    }
                    
                    Label_1222:
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1524)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(536870912)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(2007253719))
                            goto(Label_1080)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0911)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(-1309511988))
                            goto(Label_0804)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0673)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(360256810))
                            goto(Label_0567)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(683738512))
                            goto(Label_0428)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_664 = and:int(var_3_664:int, ldc:int(44562761))
                            loopcontinue()
                        }
                        
                        var_3_664 = and:int(var_3_664:int, ldc:int(-33992717))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10C:double, var_5_81:int, var_16_110:int)
                        goto(Label_1513)
                    }
                    
                    Label_1367:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1524)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1169923940))
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1297674269))
                        goto(Label_0911)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0673)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(512)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-1408589366))
                        goto(Label_0567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-907618530))
                        goto(Label_0428)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(128)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1594185922))
                        loopcontinue()
                    }
                    
                    var_3_664 = and:int(var_3_664:int, ldc:int(333176467))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10C:double, ldc:double(0.0))
                    Label_1513:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_66F = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_E2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1524:
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1367)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1222)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(4)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1300821850))
                        goto(Label_0911)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(65735717))
                        goto(Label_0804)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(1331697513))
                        goto(Label_0673)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_664:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-654597759))
                        goto(Label_0567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0428)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_664:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_664 = and:int(var_3_664:int, ldc:int(-704680289))
                        var_17_66F = add:int(var_16_110:int, and:int(ldc:int(19585), ldc:int(8961)))
                        looporswitchbreak()
                    }
                }
                
                var_3_664 = and:int(var_3_664:int, ldc:int(-37665149))
                
                if (cmple:boolean(var_5_81 = var_17_66F:int, sub:int(var_6_88:int, and:int(ldc:int(16449), ldc:int(6183))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_664:int, ldc:int(16384)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
