public class \ub113\ufcaf\u3c25\u071d\u97b7.\u4f4a\u183a\u1833\u156b\ua068 {
    private void \u4f4a\u183a\u1833\u156b\ua068(java.lang.Integer p0, java.lang.Integer p1) {
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
    
    public static \ub113\ufcaf\u3c25\u071d\u97b7.\u4f4a\u183a\u1833\u156b\ua068 \u16f6\u51b2\u5654\u446c\u61a4\u960f(int p0, int p1) {
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
            return:\u4f4a\u183a\u1833\u156b\ua068(initobject:\u4f4a\u183a\u1833\u156b\ua068(\u4f4a\u183a\u1833\u156b\ua068::<init>, invokestatic:Integer(Integer::valueOf, p0:int), invokestatic:Integer(Integer::valueOf, p1:int)))
        }
        
        goto(Label_0006)
    }
    
    public static \ub113\ufcaf\u3c25\u071d\u97b7.\u4f4a\u183a\u1833\u156b\ua068 \uc4d2\ua6bd\u8aa5\u76bc\u12cb\u927d(int p0) {
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
            return:\u4f4a\u183a\u1833\u156b\ua068(initobject:\u4f4a\u183a\u1833\u156b\ua068(\u4f4a\u183a\u1833\u156b\ua068::<init>, invokestatic:Integer(Integer::valueOf, p0:int), checkcast:Integer(java.lang.Integer.class, aconstnull:Integer())))
        }
        
        goto(Label_0006)
    }
    
    public static \ub113\ufcaf\u3c25\u071d\u97b7.\u4f4a\u183a\u1833\u156b\ua068 \u3711\u9a18\u4e72\uc4d2\u8cae\u97e6(int p0) {
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
            return:\u4f4a\u183a\u1833\u156b\ua068(initobject:\u4f4a\u183a\u1833\u156b\ua068(\u4f4a\u183a\u1833\u156b\ua068::<init>, checkcast:Integer(java.lang.Integer.class, aconstnull:Integer()), invokestatic:Integer(Integer::valueOf, p0:int)))
        }
        
        goto(Label_0006)
    }
    
    public int applyAsInt(int p0) {
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
            return:int(invokeinterface:int(IntUnaryOperator::applyAsInt, getfield:IntUnaryOperator(\u4f4a\u183a\u1833\u156b\ua068::\u5140\uf9c5\ubefe\u12b2\u3d64\u446c, this:\u4f4a\u183a\u1833\u156b\ua068), p0:int))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uafe7\u4d85\u47c2\u4d85\ud12e\u960f$3(int p0, int p1, int p2) {
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
            return:int(invokestatic:int(\u927d\uc7fe\u92ff\u98a4\uc84e\uf9c5::\uff55\ud36e\u7af6\ub8be\u5654\ucfaf, p2:int, p0:int, p1:int))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\ubded\u71f1\u1833\ub83f\u59ec\u7049$2(int p0, int p1) {
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
            return:int(invokestatic:int(Math::max, p0:int, p1:int))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\uc246\u416d\u93a2\uc246\u6c56\u7d52$1(int p0, int p1) {
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
            return:int(invokestatic:int(Math::min, p0:int, p1:int))
        }
        
        goto(Label_0006)
    }
    
    private static int lambda$\u76bc\u416d\u0a06\u3bd6\u98a4\u718f$0(int p0) {
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
            return:int(p0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u4f4a\u183a\u1833\u156b\ua068(java.lang.Integer p0, java.lang.Integer p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u647c\u0a06\ubded\ud7e8\u3bd6 p2) {
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
            invokespecial:\u4f4a\u183a\u1833\u156b\ua068(\u4f4a\u183a\u1833\u156b\ua068::<init>, this:\u4f4a\u183a\u1833\u156b\ua068, p0:Integer, p1:Integer)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.Integer \ud12e\uff55\u40a9\ube23\u12b2\u97b7(\ub113\ufcaf\u3c25\u071d\u97b7.\u4f4a\u183a\u1833\u156b\ua068 p0) {
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
            return:Integer(getfield:Integer(\u4f4a\u183a\u1833\u156b\ua068::\u7049\ub113\u1833\u516c\u416d\u759a, p0:\u4f4a\u183a\u1833\u156b\ua068))
        }
        
        goto(Label_0006)
    }
    
    public static java.lang.Integer \uc7fe\u8258\u8df4\u12cb\u4f52\uae5d(\ub113\ufcaf\u3c25\u071d\u97b7.\u4f4a\u183a\u1833\u156b\ua068 p0) {
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
            return:Integer(getfield:Integer(\u4f4a\u183a\u1833\u156b\ua068::\u6c56\ub18d\uc84e\u71ae\u64f2\u8389, p0:\u4f4a\u183a\u1833\u156b\ua068))
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
    
    public void \u6b0d\u4e72\u4c04\uc9f6\u7bad\u12b2(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_687 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_692 : int
        
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
        var_3_687 = and:int(ldc:int(-1784107673), ldc:int(-744876114))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4f4a\u183a\u1833\u156b\ua068[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_687 = and:int(var_3_687:int, ldc:int(-1951691290))
            var_5_7D = and:int(ldc:int(-27335), ldc:int(26822))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-18859), ldc:int(2442)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_687:int, ldc:int(-1852228698))
                    var_9_C1 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_84:int, and:int(ldc:int(6355), ldc:int(18213)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(16453), ldc:int(16452)))), var_7_93:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_687 = and:int(var_3_D2:int, ldc:int(-977536137))
                    var_14_10D = var_7_93:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(5256), ldc:int(5257)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_84:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1633159091))
                        goto(Label_1548)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1352149514))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-105842091))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(381431329))
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(130370246))
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(43184146))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1564534462))
                    }
                    else {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-374522057))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0413:
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1548)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1479784453))
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1806697036))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-2095343112))
                        goto(Label_1103)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1986471861))
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1472148884))
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-272948890))
                            var_11_E3 = and:int(ldc:int(-16446), ldc:int(16437))
                            goto(Label_1537)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0573:
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(2121137552))
                        goto(Label_1548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(2049212197))
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(143995397))
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-574101982))
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-877396452))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-143231052))
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(-643054225))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0845)
                        }
                    }
                    
                    Label_0700:
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(37631678))
                        goto(Label_1548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-968315998))
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1886594821))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1433812880))
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-958771160))
                        goto(Label_0952)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-738208205))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-2068055819))
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(-704974353))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0845:
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1281261945))
                        goto(Label_1548)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-2038163960))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(453776640))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1884502026))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_E3 = xor:int(ldc:int(520), ldc:int(521))
                                goto(Label_1103)
                            }
                        }
                    }
                    
                    Label_0952:
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1058180445))
                        goto(Label_1548)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1246)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(1017944055))
                            goto(Label_0845)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(32)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(1227754772))
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-490825226))
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(1073741824)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(-776200914))
                        var_11_E3 = and:int(ldc:int(7212), ldc:int(-7213))
                    }
                    
                    Label_1103:
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-854159549))
                        goto(Label_1548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(2143524495))
                        goto(Label_1391)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(497165094))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0952)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-1444358761))
                            goto(Label_0845)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(353975519))
                            goto(Label_0700)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(1435274965))
                            goto(Label_0413)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-1063013439))
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(-879222490))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1391)
                            }
                        }
                    }
                    
                    Label_1246:
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1548)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-879963117))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(466092698))
                            goto(Label_1103)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(4)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-1121153482))
                            goto(Label_0952)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-1116649829))
                            goto(Label_0845)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0700)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(-898548576))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0413)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_687 = and:int(var_3_687:int, ldc:int(1430996370))
                            loopcontinue()
                        }
                        
                        var_3_687 = and:int(var_3_687:int, ldc:int(-2014746641))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_7D:int, var_16_111:int)
                        goto(Label_1537)
                    }
                    
                    Label_1391:
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1548)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1853386200))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(968991077))
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1727384761))
                        goto(Label_0845)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(2077691223))
                        goto(Label_0700)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1366021588))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(227375901))
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_687 = and:int(var_3_687:int, ldc:int(-306686033))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1537:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_692 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1548:
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1391)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1698671578))
                        goto(Label_1246)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(256)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-2000303062))
                        goto(Label_1103)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(760829686))
                        goto(Label_0952)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(1558198957))
                        goto(Label_0845)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_687:int, ldc:int(8)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(372694868))
                        goto(Label_0700)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(2080578050))
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0413)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_687:int, ldc:int(128)), ldc:int(0))) {
                        var_3_687 = and:int(var_3_687:int, ldc:int(-1409423962))
                        var_17_692 = add:int(var_16_111:int, xor:int(ldc:int(8453), ldc:int(8452)))
                        looporswitchbreak()
                    }
                }
                
                var_3_687 = and:int(var_3_687:int, ldc:int(-408238106))
                
                if (cmple:boolean(var_5_7D = var_17_692:int, sub:int(var_6_84:int, and:int(ldc:int(5635), ldc:int(8249))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_687:int, ldc:int(65536)), ldc:int(0))) {
            var_3_687 = and:int(var_3_687:int, ldc:int(169691187))
            goto(Label_0106)
        }
    }
}
