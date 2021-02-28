public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u1833\u4f4a\u64f2\uc910\u5d20 {
    public void \u1833\u4f4a\u64f2\uc910\u5d20(it.unimi.dsi.fastutil.booleans.BooleanConsumer p0, \u6b0d\u12cb\u156b\u4179\u8bb0.\u5654\u7e3f\u3bd6\u6435\ua068 p1, net.minecraft.util.text.ITextComponent p2, net.minecraft.util.text.ITextComponent p3, boolean p4) {
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
            invokespecial:\u99f7\u7006\u6198\u47c2\ub1b9\u12cb(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::<init>, this:\u1833\u4f4a\u64f2\uc910\u5d20)
            putfield:BooleanConsumer(\u1833\u4f4a\u64f2\uc910\u5d20::\u6cfe\uc2bd\u7d52\u4f52\u446c\ub83f, this:\u1833\u4f4a\u64f2\uc910\u5d20, p0:BooleanConsumer)
            putfield:\u5654\u7e3f\u3bd6\u6435\ua068(\u1833\u4f4a\u64f2\uc910\u5d20::\u3e2a\u8413\u88c5\ub8be\u416d\ub83f, this:\u1833\u4f4a\u64f2\uc910\u5d20, p1:\u5654\u7e3f\u3bd6\u6435\ua068)
            putfield:ITextComponent(\u1833\u4f4a\u64f2\uc910\u5d20::\ub7dc\uc246\uc3e3\u6c56\u3bc9\u92ff, this:\u1833\u4f4a\u64f2\uc910\u5d20, p2:ITextComponent)
            putfield:ITextComponent(\u1833\u4f4a\u64f2\uc910\u5d20::\ub7dc\ube23\uc229\ufcaf\u16f6\u3711, this:\u1833\u4f4a\u64f2\uc910\u5d20, p3:ITextComponent)
            putfield:boolean(\u1833\u4f4a\u64f2\uc910\u5d20::\u527a\u6d69\u76bc\u527a\u1187\u8258, this:\u1833\u4f4a\u64f2\uc910\u5d20, p4:boolean)
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
        
        if (cmpne:boolean(p0:int, and:int(ldc:int(2404), ldc:int(13568)))) {
            return:boolean(invokespecial:boolean(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc229\u3a62\u12cb\ud51e\uafe7\u8308, this:\u1833\u4f4a\u64f2\uc910\u5d20[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:int, p1:int, p2:int))
        }
        
        invokeinterface:void(BooleanConsumer::accept, getfield:BooleanConsumer(\u1833\u4f4a\u64f2\uc910\u5d20::\u6cfe\uc2bd\u7d52\u4f52\u446c\ub83f, this:\u1833\u4f4a\u64f2\uc910\u5d20), and:int[expected:boolean](ldc:int(-9128), ldc:int(9127)))
        return:boolean(and:int[expected:boolean](ldc:int(20485), ldc:int(10817)))
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
            invokevirtual:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\u0a06\u12cb\u97b7\u4492\u1833\ubded, this:\u1833\u4f4a\u64f2\uc910\u5d20[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4)
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u1833\u4f4a\u64f2\uc910\u5d20::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u1833\u4f4a\u64f2\uc910\u5d20), getfield:String(\u5654\u7e3f\u3bd6\u6435\ua068::\u56bd\u7049\u624e\uc9f6\u4cd9\u7bad, getfield:\u5654\u7e3f\u3bd6\u6435\ua068(\u1833\u4f4a\u64f2\uc910\u5d20::\u3e2a\u8413\u88c5\ub8be\u416d\ub83f, this:\u1833\u4f4a\u64f2\uc910\u5d20)), div:int(getfield:int(\u1833\u4f4a\u64f2\uc910\u5d20::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u1833\u4f4a\u64f2\uc910\u5d20), xor:int(ldc:int(8480), ldc:int(8482))), invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, xor:int(ldc:int(1282), ldc:int(1280))), getfield:int(\u5654\u7e3f\u3bd6\u6435\ua068::\ud4fe\u3a62\ub171\ubefe\u7c6b\u40a9, getfield:\u5654\u7e3f\u3bd6\u6435\ua068(\u1833\u4f4a\u64f2\uc910\u5d20::\u3e2a\u8413\u88c5\ub8be\u416d\ub83f, this:\u1833\u4f4a\u64f2\uc910\u5d20)))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u1833\u4f4a\u64f2\uc910\u5d20::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u1833\u4f4a\u64f2\uc910\u5d20), getfield:ITextComponent(\u1833\u4f4a\u64f2\uc910\u5d20::\ub7dc\uc246\uc3e3\u6c56\u3bc9\u92ff, this:\u1833\u4f4a\u64f2\uc910\u5d20), div:int(getfield:int(\u1833\u4f4a\u64f2\uc910\u5d20::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u1833\u4f4a\u64f2\uc910\u5d20), xor:int(ldc:int(-23548), ldc:int(-23546))), invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, and:int(ldc:int(20), ldc:int(17349))), ldc:int(16777215))
            invokestatic:void(\ube23\u624e\u2dcc\u3a62\uf9c5\u8389::\ub19c\u3dd3\u7043\u76bc\uc910\uc4d2, p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, getfield:\ucef1\u99f7\u4e72\u7873\u0800\u72f1(\u1833\u4f4a\u64f2\uc910\u5d20::\ubf56\u4bc8\u7873\uc87f\u8bb0\u64f2, this:\u1833\u4f4a\u64f2\uc910\u5d20), getfield:ITextComponent(\u1833\u4f4a\u64f2\uc910\u5d20::\ub7dc\ube23\uc229\ufcaf\u16f6\u3711, this:\u1833\u4f4a\u64f2\uc910\u5d20), div:int(getfield:int(\u1833\u4f4a\u64f2\uc910\u5d20::\u1833\u3504\ud171\ubcb0\u7d52\uc9f6, this:\u1833\u4f4a\u64f2\uc910\u5d20), xor:int(ldc:int(1608), ldc:int(1610))), invokestatic:int(\u99f7\u7006\u6198\u47c2\ub1b9\u12cb::\ub6ab\u071d\u6cfe\u6c52\u5245\u6ec6, ldc:int(6)), ldc:int(16777215))
            invokespecial:void(\ua3b4\u965f\u6d99\u4492\ud4fe\u7006::\uc3e3\u7bad\u960f\u6d99\uc9f6\u97b7, this:\u1833\u4f4a\u64f2\uc910\u5d20[expected:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006], p0:\uafe7\uc7fe\u4c04\u6b5f\u5bc4, p1:int, p2:int, p3:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u385b\u4c2b\u8640\u8df4\u156b\ucfaf$2(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokeinterface:void(BooleanConsumer::accept, getfield:BooleanConsumer(\u1833\u4f4a\u64f2\uc910\u5d20::\u6cfe\uc2bd\u7d52\u4f52\u446c\ub83f, this:\u1833\u4f4a\u64f2\uc910\u5d20), and:int[expected:boolean](ldc:int(8581), ldc:int(3)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\ubf56\u4cd9\uc910\u965f\ua6bd\ud51e$1(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokeinterface:void(BooleanConsumer::accept, getfield:BooleanConsumer(\u1833\u4f4a\u64f2\uc910\u5d20::\u6cfe\uc2bd\u7d52\u4f52\u446c\ub83f, this:\u1833\u4f4a\u64f2\uc910\u5d20), and:int[expected:boolean](ldc:int(-15792), ldc:int(15531)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uc229\u946b\u8df4\ua3b4\u4179\u946b$0(\u494c\u4975\ua068\u0c95\uc84e.\u7043\ubcb0\ub1b9\u759a\u4975.\u69d9\u946b\u2dcc\u5fe1\u12b2\uae5d p0) {
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
            invokeinterface:void(BooleanConsumer::accept, getfield:BooleanConsumer(\u1833\u4f4a\u64f2\uc910\u5d20::\u6cfe\uc2bd\u7d52\u4f52\u446c\ub83f, this:\u1833\u4f4a\u64f2\uc910\u5d20), and:int[expected:boolean](ldc:int(2159), ldc:int(1553)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_94_0 : byte[] [generated]
        stack_96_0 : byte[] [generated]
        stack_C7_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_EC_0 : byte[] [generated]
        stack_EE_0 : byte[] [generated]
        stack_116_0 : byte[] [generated]
        stack_179_0 : byte[] [generated]
        stack_200_0 : byte[] [generated]
        stack_23A_0 : byte[] [generated]
        stack_28F_0 : byte[] [generated]
        var_4_15C : int
        var_3_161 : byte[]
        var_5_162 : int
        var_0_191 : int
        expr_179 : byte [generated]
        stack_1C5_2 : byte [generated]
        stack_19C_0 : byte [generated]
        expr_96 : int [generated]
        var_2_C7 : byte[]
        expr_CB : int [generated]
        var_3_229 : byte[]
        var_5_22A : int
        expr_EE : int [generated]
        var_3_27E : byte[]
        var_5_27F : int
        expr_292 : byte [generated]
        var_3_122 : String
        stack_155_0 : String[] [generated]
        expr_134 : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(1691405176), ldc:int(-168768615))
        expr_6B = arraylength:int(stack_94_0 = stack_96_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_179_0 = stack_200_0 = stack_23A_0 = stack_28F_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("YNYA6t6iA93T87U=")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_15C = expr_6B:int
        var_3_161 = newarray:byte[](byte.class, expr_6B:int)
        var_5_162 = expr_6B:int
        Label_0356:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(1024)), ldc:int(0))) {
            var_0_191 = and:int(var_0_5F:int, ldc:int(-161913000))
            var_5_162 = add:int(var_5_162:int, ldc:int(-1))
            expr_179 = stack_1C5_2 = loadelement(stack_179_0, var_5_162)
            
            if (cmplt:boolean(add:int(add:int(var_5_162:int, ldc:int(6)), neg:int(var_4_15C:int)), ldc:int(0))) {
                stack_1C5_2 = stack_19C_0 = add:byte(expr_179:byte, loadelement:byte(var_3_161:byte[], add:int(var_5_162:int, ldc:int(6))))
                goto(Label_0428)
            }
            
            Label_0390:
            
            if (cmpeq:boolean(and:int(var_0_191:int, ldc:int(8)), ldc:int(0))) {
                var_0_191 = and:int(var_0_191:int, ldc:int(914006170))
            }
            else {
                var_0_191 = and:int(var_0_191:int, ldc:int(2130666331))
                stack_1C5_2 = stack_19C_0 = add:byte(expr_179:byte, ldc:byte(6))
            }
            
            Label_0428:
            
            if (cmpeq:boolean(and:int(var_0_191:int, ldc:int(16384)), ldc:int(0))) {
                var_0_191 = and:int(var_0_191:int, ldc:int(376654696))
                goto(Label_0390)
            }
            
            var_0_5F = and:int(var_0_191:int, ldc:int(1743900440))
            storeelement:byte(var_3_161:byte[], var_5_162:int, stack_1C5_2:byte)
            
            if (cmpne:boolean(var_5_162:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_179_0 = stack_200_0 = stack_23A_0 = stack_28F_0 = var_3_161:byte[]
            goto(Label_0112)
        }
        
        Label_0491:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-463513729))
            var_5_162 = add:int(var_5_162:int, ldc:int(-1))
            storeelement:byte(var_3_161:byte[], var_5_162:int, xor:byte(loadelement:byte(stack_200_0:byte[], var_5_162:int), ldc:byte(59)))
            
            if (cmpne:boolean(var_5_162:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_179_0 = stack_200_0 = stack_23A_0 = stack_28F_0 = var_3_161:byte[]
            goto(Label_0155)
        }
        
        goto(Label_0356)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(1024)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(2063771631))
        }
        else {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1834614682))
            expr_96 = arraylength:int(stack_96_0:byte[])
            
            if (cmpne:boolean(expr_96:int, ldc:int(0))) {
                var_4_15C = expr_96:int
                var_3_161 = newarray:byte[](byte.class, expr_96:int)
                var_5_162 = expr_96:int
                goto(Label_0491)
            }
        }
        
        Label_0155:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(1676552899))
            goto(Label_0243)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(128)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_5F = and:int(var_0_5F:int, ldc:int(1553115392))
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-420348101))
            var_2_C7 = stack_C7_0:byte[]
            expr_CB = add:int(arraylength:int(stack_C9_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_3_229 = newarray:byte[](byte.class, expr_CB:int)
                var_5_22A = expr_CB:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-195245064))
                    var_5_22A = add:int(var_5_22A:int, ldc:int(-1))
                    storeelement:byte(var_3_229:byte[], var_5_22A:int, add:int(shl:int(loadelement:byte(stack_23A_0:byte[], var_5_22A:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_C7:byte[], add:int(var_5_22A:int, and:int(ldc:int(20553), ldc:int(9233)))), ldc:int(7)), and:int(ldc:int(617), ldc:int(4113)))))
                    
                    if (cmpne:boolean(var_5_22A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_179_0 = stack_200_0 = stack_23A_0 = stack_28F_0 = var_3_229:byte[]
            }
        }
        
        Label_0208:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0155)
            }
            
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(-50499687))
            expr_EE = arraylength:int(stack_EE_0:byte[])
            
            if (cmpne:boolean(expr_EE:int, ldc:int(0))) {
                var_3_27E = newarray:byte[](byte.class, expr_EE:int)
                var_5_27F = expr_EE:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(-405212324))
                    var_5_27F = add:int(var_5_27F:int, ldc:int(-1))
                    expr_292 = add:byte(loadelement:byte(stack_28F_0:byte[], var_5_27F:int), ldc:byte(49))
                    storeelement:byte(var_3_27E:byte[], var_5_27F:int, or:int(and:int(shl:int(expr_292:byte, and:int(ldc:int(135), ldc:int(13332))), ldc:int(-16)), and:int(shr:int(expr_292:byte[expected:int], and:int(ldc:int(16540), ldc:int(5670))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_27F:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_96_0 = stack_94_0 = stack_C7_0 = stack_C9_0 = stack_EC_0 = stack_EE_0 = stack_116_0 = stack_179_0 = stack_200_0 = stack_23A_0 = stack_28F_0 = var_3_27E:byte[]
            }
        }
        
        Label_0243:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(67108864)), ldc:int(0))) {
            goto(Label_0155)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-1743782396))
            goto(Label_0112)
        }
        
        var_3_122 = initobject:String(String::<init>, stack_116_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_155_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4432), ldc:int(4433)))
        expr_134 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(8513), ldc:int(8512)))
        storeelement:String(expr_134:String[], and:int(ldc:int(-21271), ldc:int(21270)), invokevirtual:String[expected:String](String::substring, var_3_122:String, and:int(ldc:int(23784), ldc:int(-24297)), xor:int(ldc:int(473), ldc:int(467))))
        putstatic:String[](\u1833\u4f4a\u64f2\uc910\u5d20::\u8709\u1833\u97b7\u6c56\ub102\u69d9, expr_134:String[])
    }
    
    public void \u7330\u0c95\u3504\ubcb0\u4d85\ubff1(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_62F : int
        var_5_88 : int
        var_6_8F : int
        var_7_9E : double
        var_9_C5 : double
        var_3_D7 : int
        var_11_E8 : int
        var_14_112 : double
        var_16_116 : int
        var_12_10E : double
        var_17_63A : int
        
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
        var_3_62F = and:int(ldc:int(-890544201), ldc:int(-888545353))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u1833\u4f4a\u64f2\uc910\u5d20[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0178)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2)), ldc:int(0))) {
            var_3_62F = and:int(var_3_62F:int, ldc:int(-239326791))
        }
        else {
            var_3_62F = and:int(var_3_62F:int, ldc:int(2039467955))
            var_5_88 = and:int(ldc:int(10289), ldc:int(-10290))
            var_6_8F = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9E = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18068), ldc:int(-22206)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C5 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D7 = and:int(var_3_62F:int, ldc:int(1518280427))
                    var_9_C5 = sub:double(var_7_9E:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E8 = var_5_88:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E8:int, sub:int(var_6_8F:int, xor:int(ldc:int(514), ldc:int(515)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E8:int, and:int(ldc:int(22065), ldc:int(10565)))), var_7_9E:double))) {
                        inc:int(var_11_E8, ldc:int(1))
                    }
                    
                    var_3_62F = and:int(var_3_D7:int, ldc:int(-651315529))
                    var_14_112 = var_7_9E:double
                    var_16_116 = var_11_E8:int
                }
                else {
                    var_11_E8 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_88:int), and:int(ldc:int(16417), ldc:int(4241)))
                    var_12_10E = var_14_112 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88)
                    
                    if (cmplt:boolean(var_16_116 = var_11_E8:int, var_6_8F:int)) {
                        var_9_C5 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E8:int)
                        var_16_116 = var_11_E8:int
                        var_14_112 = var_12_10E:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1500501095))
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1481681682))
                        goto(Label_0790)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0669)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(436264577))
                        goto(Label_0557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1766950835))
                        
                        if (cmplt:boolean(var_16_116:int, var_6_8F:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0557)
                            }
                            
                            goto(Label_0790)
                        }
                    }
                    
                    Label_0394:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-929362885))
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(312695665))
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(216077519))
                        goto(Label_0790)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-707910943))
                        goto(Label_0669)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-823275605))
                            var_11_E8 = and:int(ldc:int(-637), ldc:int(636))
                            goto(Label_1460)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0557:
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(491654802))
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-2134361931))
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(272960128))
                        goto(Label_0790)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(2064250539))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_112 = var_9_C5:double
                            goto(Label_0790)
                        }
                    }
                    
                    Label_0669:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-2077443803))
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(528574792))
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-1754680090))
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-350933277))
                        var_14_112 = mul:double(ldc:double(0.5), add:double(var_9_C5:double, var_14_112:double))
                    }
                    
                    Label_0790:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(118615428))
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1196)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1974704855))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0669)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-877025942))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(737641754))
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1793701803))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88:int), var_7_9E:double)) {
                                var_11_E8 = and:int(ldc:int(2183), ldc:int(25433))
                                goto(Label_1073)
                            }
                        }
                    }
                    
                    Label_0914:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1860468838))
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(2017483510))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-1878939827))
                            goto(Label_0790)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0669)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(64)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-1317341234))
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-22980873))
                        var_11_E8 = and:int(ldc:int(29125), ldc:int(-30720))
                    }
                    
                    Label_1073:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(778637669))
                        goto(Label_1319)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(1297581813))
                            goto(Label_0914)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0790)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-874624360))
                            goto(Label_0669)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(2110464691))
                            goto(Label_0394)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-380801281))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                                goto(Label_1319)
                            }
                        }
                    }
                    
                    Label_1196:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1638980187))
                        goto(Label_1471)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-1528758138))
                            goto(Label_1073)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0914)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0790)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0669)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(74690155))
                            goto(Label_0557)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0394)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                            var_3_62F = and:int(var_3_62F:int, ldc:int(-334897173))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_112:double, var_5_88:int, var_16_116:int)
                            goto(Label_1460)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1319:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1471)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(890620326))
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-946084519))
                        goto(Label_1073)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-848800337))
                        goto(Label_0790)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0669)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1074160956))
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(128)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-391735347))
                        goto(Label_0394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(268435456)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_62F = and:int(var_3_62F:int, ldc:int(-562229585))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_112:double, ldc:double(0.0))
                    Label_1460:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63A = var_5_88:int
                        
                        if (cmpeq:boolean(var_11_E8:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1471:
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1319)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(-1229772882))
                        goto(Label_1196)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(212387475))
                        goto(Label_1073)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1756790487))
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0790)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0669)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_62F:int, ldc:int(1)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(270505328))
                        goto(Label_0394)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(2)), ldc:int(0))) {
                        var_3_62F = and:int(var_3_62F:int, ldc:int(1551230955))
                        var_17_63A = add:int(var_16_116:int, and:int(ldc:int(4361), ldc:int(1029)))
                        looporswitchbreak()
                    }
                }
                
                var_3_62F = and:int(var_3_62F:int, ldc:int(1300330155))
                
                if (cmple:boolean(var_5_88 = var_17_63A:int, sub:int(var_6_8F:int, xor:int(ldc:int(1536), ldc:int(1537))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0178:
        
        if (cmpne:boolean(and:int(var_3_62F:int, ldc:int(1024)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
