public abstract class \u5245\u8aa5\u61a4\u7049\u4cd9.\u9033\u4179\ube23\u5f50\ucfaf {
    public void \u9033\u4179\ube23\u5f50\ucfaf() {
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
            invokespecial:Object(Object::<init>, this:\u9033\u4179\ube23\u5f50\ucfaf)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \u0b8e\u8308\u52d3\u7c6b\u97e6\u760c(int p0) {
        var_1_99 : int
        var_3_94 : InterruptedException
        
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
            var_1_99 = and:int(ldc:int(33616877), ldc:int(1310759911))
            
            try {
                loop {
                    if (cmpne:boolean(and:int(var_1_99:int, ldc:int(512)), ldc:int(0))) {
                        var_1_99 = and:int(var_1_99:int, ldc:int(193198065))
                        invokestatic:void(Thread::sleep, i2l:long(mul:int(p0:int, and:int(ldc:int(3064), ldc:int(9195)))))
                    }
                    
                    if (cmpeq:boolean(and:int(var_1_99:int, ldc:int(2)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                    
                    var_1_99 = and:int(var_1_99:int, ldc:int(-1111300407))
                }
                
                var_1_99 = and:int(var_1_99:int, ldc:int(237482723))
            }
            catch (java.lang.InterruptedException var_3_94) {
                var_1_99 = and:int(var_1_99:int, ldc:int(-74665117))
                invokeinterface:void(Logger::error, getstatic:Logger(\u9033\u4179\ube23\u5f50\ucfaf::\uc2e8\u6ec6\u72f1\u6198\u718f), ldc:String(""), var_3_94:InterruptedException[expected:Throwable])
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static void \ud12e\u71ae\u156b\u9937\u416d\u40a9(\u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p0) {
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
    
    public void \u718f\u183a\u2dcc\ud51e\ub32d\ua562(\u56bd\u8413\u647c\u5bc4\ud158.\u6c52\u93a2\u8709\ub102\u4bc8 p0) {
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
            putfield:\u6c52\u93a2\u8709\ub102\u4bc8(\u9033\u4179\ube23\u5f50\ucfaf::\u40a9\uf995\u7d52\u8d90\u76bc, this:\u9033\u4179\ube23\u5f50\ucfaf, p0:\u6c52\u93a2\u8709\ub102\u4bc8)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubcb0\u8350\u16f6\u718f\u5db4\uc229(net.minecraft.util.text.ITextComponent p0) {
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
            invokevirtual:void(\u6c52\u93a2\u8709\ub102\u4bc8::\ubcb0\u8350\u16f6\u718f\u5db4\uc229, getfield:\u6c52\u93a2\u8709\ub102\u4bc8(\u9033\u4179\ube23\u5f50\ucfaf::\u40a9\uf995\u7d52\u8d90\u76bc, this:\u9033\u4179\ube23\u5f50\ucfaf), p0:ITextComponent)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6b0d\uc246\ubb2b\u74b1\u4ab3\ub171(net.minecraft.util.text.ITextComponent p0) {
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
            invokevirtual:void(\u6c52\u93a2\u8709\ub102\u4bc8::\u385b\u3e2a\uf9c5\u7043\u12cb\ub32d, getfield:\u6c52\u93a2\u8709\ub102\u4bc8(\u9033\u4179\ube23\u5f50\ucfaf::\u40a9\uf995\u7d52\u8d90\u76bc, this:\u9033\u4179\ube23\u5f50\ucfaf), p0:ITextComponent)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3d4b\uc229\u3e2a\u72f1\ubb2b\u9255() {
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
            return:boolean(invokevirtual:boolean(\u6c52\u93a2\u8709\ub102\u4bc8::\u36d3\u8640\u92ff\ub113\u12b2\ud158, getfield:\u6c52\u93a2\u8709\ub102\u4bc8(\u9033\u4179\ube23\u5f50\ucfaf::\u40a9\uf995\u7d52\u8d90\u76bc, this:\u9033\u4179\ube23\u5f50\ucfaf)))
        }
        
        goto(Label_0006)
    }
    
    public void \ub83f\u4cd9\u76bc\uc9f6\ud4fe\u59ec() {
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
    
    public void \u47c2\u3e2a\uc9f6\u97e6\u40a9\u839e() {
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
    
    public void \u92ee\u3504\uc29a\u3bc9\u56bd\u446c() {
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
    
    private static void lambda$\u0b8e\u983f\u51b2\u93a2\u40a9\u9af2$0(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u67e9\u4daf\u760c\ud217\ua6bd\ubff1 p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\ua3b4\u965f\u6d99\u4492\ud4fe\u7006 p1) {
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
            invokevirtual:void(\u67e9\u4daf\u760c\ud217\ua6bd\ubff1::\u385b\u647c\u4492\u1187\u0a06\u0c95, p0:\u67e9\u4daf\u760c\ud217\ua6bd\ubff1, p1:\ua3b4\u965f\u6d99\u4492\ud4fe\u7006)
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
            putstatic:Logger(\u9033\u4179\ube23\u5f50\ucfaf::\uc2e8\u6ec6\u72f1\u6198\u718f, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3776\u839e\u5db4\u927d\u5140\u62da(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_656 : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_661 : int
        
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
        var_3_656 = and:int(ldc:int(1804191282), ldc:int(-1040617610))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u9033\u4179\ube23\u5f50\ucfaf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(67108864)), ldc:int(0))) {
            var_3_656 = and:int(var_3_656:int, ldc:int(1200453549))
            var_5_7D = and:int(ldc:int(-2208), ldc:int(2199))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(14392), ldc:int(-15552)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_656:int, ldc:int(1844301675))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(2566), ldc:int(2567)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, xor:int(ldc:int(85), ldc:int(84)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_656 = and:int(var_3_CA:int, ldc:int(-941785345))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), xor:int(ldc:int(2049), ldc:int(2048)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(616590066))
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(888550644))
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-760139947))
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-515739180))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1316807505))
                    }
                    else {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-175114443))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0541)
                            }
                            
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-490937050))
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(9507698))
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(64)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(821319547))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(213353306))
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(1105819316))
                        var_11_DB = and:int(ldc:int(-4979), ldc:int(4466))
                        goto(Label_1496)
                    }
                    
                    Label_0541:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(672733360))
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1759665282))
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-738680989))
                        goto(Label_0933)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1556044076))
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1812077000))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-110253639))
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(-874952961))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0806)
                        }
                    }
                    
                    Label_0668:
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(597294140))
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(804727977))
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-975216667))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-706161902))
                        goto(Label_0933)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(841186655))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1581641965))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(16777216)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(1507839536))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0806:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(1)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1283139618))
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(304047783))
                        goto(Label_1211)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(128)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1706108319))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1676023951))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(150086447))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(2147217260))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = and:int(ldc:int(6329), ldc:int(17669))
                                goto(Label_1085)
                            }
                        }
                    }
                    
                    Label_0933:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(299659345))
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(1)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(666341408))
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-890494569))
                            goto(Label_0668)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1072454425))
                            goto(Label_0541)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(1506526768))
                        var_11_DB = and:int(ldc:int(5806), ldc:int(-5807))
                    }
                    
                    Label_1085:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-976477282))
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(817754931))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1584822435))
                            goto(Label_0933)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0806)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(64)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1683872755))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(1)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-1318793421))
                            loopcontinue()
                        }
                        
                        var_3_656 = and:int(var_3_656:int, ldc:int(2144042988))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1377)
                            }
                        }
                    }
                    
                    Label_1211:
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(2083688901))
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-286054043))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(128)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-1300947706))
                            goto(Label_1085)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-2137083227))
                            goto(Label_0933)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1918773903))
                            goto(Label_0806)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(494216010))
                            goto(Label_0668)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-1467766489))
                            goto(Label_0541)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(-846801071))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_656 = and:int(var_3_656:int, ldc:int(1538082545))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                            goto(Label_1496)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1377:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1507)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-2023240057))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(256)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1849165305))
                        goto(Label_0806)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(741731759))
                        goto(Label_0668)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1073741824)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_656 = and:int(var_3_656:int, ldc:int(1239408161))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1496:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_661 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1507:
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1377)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(277751723))
                        goto(Label_1211)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1126314424))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0933)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0806)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1124385731))
                        goto(Label_0668)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0541)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_656:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(-1170517127))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_656:int, ldc:int(1)), ldc:int(0))) {
                        var_3_656 = and:int(var_3_656:int, ldc:int(1472951859))
                        var_17_661 = add:int(var_16_109:int, xor:int(ldc:int(150), ldc:int(151)))
                        looporswitchbreak()
                    }
                    
                    var_3_656 = and:int(var_3_656:int, ldc:int(-308354825))
                }
                
                var_3_656 = and:int(var_3_656:int, ldc:int(1472976690))
                
                if (cmple:boolean(var_5_7D = var_17_661:int, sub:int(var_6_84:int, xor:int(ldc:int(586), ldc:int(587))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_656:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
