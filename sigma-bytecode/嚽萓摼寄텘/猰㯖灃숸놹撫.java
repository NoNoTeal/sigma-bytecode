public class \u56bd\u8413\u647c\u5bc4\ud158.\u7330\u3bd6\u7043\uc238\ub1b9\u64ab {
    public void \u7330\u3bd6\u7043\uc238\ub1b9\u64ab(\u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 p0, boolean p1, int p2, int p3, java.util.Set<\u12b2\u4e72\u8df4\u67e9\u67e9.\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a> p4) {
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
            invokespecial:Object(Object::<init>, this:\u7330\u3bd6\u7043\uc238\ub1b9\u64ab)
            putfield:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\u7330\u3bd6\u7043\uc238\ub1b9\u64ab::\u51fa\uc29a\ua562\ucef1\u8cae\ud158, this:\u7330\u3bd6\u7043\uc238\ub1b9\u64ab, p0:\uf995\u8709\ua61f\ub32d\ubff1\u99f7)
            putfield:boolean(\u7330\u3bd6\u7043\uc238\ub1b9\u64ab::\u98a4\u7ce1\u1833\u71ae\u71ae\u0b8e, this:\u7330\u3bd6\u7043\uc238\ub1b9\u64ab, p1:boolean)
            putfield:int(\u7330\u3bd6\u7043\uc238\ub1b9\u64ab::\uae5d\u3dd3\u7c6b\u8aa5\u4cd9\u6c52, this:\u7330\u3bd6\u7043\uc238\ub1b9\u64ab, p2:int)
            putfield:int(\u7330\u3bd6\u7043\uc238\ub1b9\u64ab::\u2dcc\uc246\u16f6\u98a4\u3bd6\u67d0, this:\u7330\u3bd6\u7043\uc238\ub1b9\u64ab, p3:int)
            putfield:Set<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u7330\u3bd6\u7043\uc238\ub1b9\u64ab::\u64ab\ucfaf\u69d9\u3d64\u76bc\u416d, this:\u7330\u3bd6\u7043\uc238\ub1b9\u64ab, p4:Set<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\u72f1\u6435\u5bc4\u8cae\ub70c\ud4fe$5(com.mojang.serialization.codecs.RecordCodecBuilder$Instance p0) {
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
    
    private static java.util.Set lambda$\u0a06\u59ec\uc2e8\u1187\ub70c\u3504$4(\u56bd\u8413\u647c\u5bc4\ud158.\u7330\u3bd6\u7043\uc238\ub1b9\u64ab p0) {
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
            return:Set(getfield:Set<\ub1b9\u8cae\u7d52\u759a\u3e2a\u527a>(\u7330\u3bd6\u7043\uc238\ub1b9\u64ab::\u64ab\ucfaf\u69d9\u3d64\u76bc\u416d, p0:\u7330\u3bd6\u7043\uc238\ub1b9\u64ab))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\u2dcc\uf995\u120d\u1833\u8258\u416d$3(\u56bd\u8413\u647c\u5bc4\ud158.\u7330\u3bd6\u7043\uc238\ub1b9\u64ab p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\u7330\u3bd6\u7043\uc238\ub1b9\u64ab::\u2dcc\uc246\u16f6\u98a4\u3bd6\u67d0, p0:\u7330\u3bd6\u7043\uc238\ub1b9\u64ab)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Integer lambda$\u98a4\u8cae\u3dd3\uc229\u156b\ua61f$2(\u56bd\u8413\u647c\u5bc4\ud158.\u7330\u3bd6\u7043\uc238\ub1b9\u64ab p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\u7330\u3bd6\u7043\uc238\ub1b9\u64ab::\uae5d\u3dd3\u7c6b\u8aa5\u4cd9\u6c52, p0:\u7330\u3bd6\u7043\uc238\ub1b9\u64ab)))
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Boolean lambda$\u40a9\u647c\uc2bd\u4e72\u56bd\u6198$1(\u56bd\u8413\u647c\u5bc4\ud158.\u7330\u3bd6\u7043\uc238\ub1b9\u64ab p0) {
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
            return:Boolean(invokestatic:Boolean(Boolean::valueOf, getfield:boolean(\u7330\u3bd6\u7043\uc238\ub1b9\u64ab::\u98a4\u7ce1\u1833\u71ae\u71ae\u0b8e, p0:\u7330\u3bd6\u7043\uc238\ub1b9\u64ab)))
        }
        
        goto(Label_0006)
    }
    
    private static \u5d20\u7043\u88c5\u5db4\uf94d.\uf995\u8709\ua61f\ub32d\ubff1\u99f7 lambda$\u6ec6\ubf56\u6b0d\u5140\ub70c\u071d$0(\u56bd\u8413\u647c\u5bc4\ud158.\u7330\u3bd6\u7043\uc238\ub1b9\u64ab p0) {
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
            return:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(getfield:\uf995\u8709\ua61f\ub32d\ubff1\u99f7(\u7330\u3bd6\u7043\uc238\ub1b9\u64ab::\u51fa\uc29a\ua562\ucef1\u8cae\ud158, p0:\u7330\u3bd6\u7043\uc238\ub1b9\u64ab))
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
    
    public void \u4492\ud51e\ub83f\u93a2\ub83f\ua3b4(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6AC : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
        var_17_6B7 : int
        
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
        var_3_6AC = and:int(ldc:int(1600286007), ldc:int(-580229633))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7330\u3bd6\u7043\uc238\ub1b9\u64ab[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-155737683))
        }
        else {
            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-80239177))
            var_5_8A = and:int(ldc:int(3209), ldc:int(-7322))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(2338), ldc:int(-2339)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_6AC:int, ldc:int(2100782579))
                    var_9_D0 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_91:int, and:int(ldc:int(65), ldc:int(2569)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, xor:int(ldc:int(-15868), ldc:int(-15867)))), var_7_A0:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_6AC = and:int(var_3_E2:int, ldc:int(2144075131))
                    var_14_11D = var_7_A0:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(1025), ldc:int(297)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_91:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-146150871))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1360605600))
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1659914667))
                        goto(Label_0872)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-350460414))
                        goto(Label_0742)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-473991609))
                        goto(Label_0609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1655796045))
                    }
                    else {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(2098150775))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0609)
                            }
                            
                            goto(Label_0872)
                        }
                    }
                    
                    Label_0435:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1190695717))
                        goto(Label_1441)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1781074654))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-491477940))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0872)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0742)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-915519368))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1264494543))
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1572761075))
                        var_11_F3 = and:int(ldc:int(26690), ldc:int(-27204))
                        goto(Label_1568)
                    }
                    
                    Label_0609:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(841473444))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-850002039))
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1500218005))
                        goto(Label_0872)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1533540895))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0435)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-2120721191))
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(2066216951))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0872)
                        }
                    }
                    
                    Label_0742:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1906360860))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1544454192))
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1746092233))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0609)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1884417203))
                            goto(Label_0435)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(2037902847))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0872:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1406545969))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(6818470))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0742)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0609)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-277491712))
                            goto(Label_0435)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-77693069))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F3 = xor:int(ldc:int(450), ldc:int(451))
                                goto(Label_1163)
                            }
                        }
                    }
                    
                    Label_0987:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1811081308))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1476896903))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-799107869))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0872)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0742)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1916040112))
                            goto(Label_0609)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-96551186))
                            goto(Label_0435)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1441898935))
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(2075027455))
                        var_11_F3 = and:int(ldc:int(12376), ldc:int(-12377))
                    }
                    
                    Label_1163:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1177921509))
                        goto(Label_1579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-766885163))
                            goto(Label_0987)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0872)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1756689006))
                            goto(Label_0742)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-562472815))
                            goto(Label_0609)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(128)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-594617881))
                            goto(Label_0435)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(2069851443))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1441)
                            }
                        }
                    }
                    
                    Label_1296:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1251202859))
                        goto(Label_1579)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-736694418))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1163)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0987)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1168064165))
                            goto(Label_0872)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(81351877))
                            goto(Label_0742)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0609)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-2049364846))
                            goto(Label_0435)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-587057805))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_8A:int, var_16_121:int)
                            goto(Label_1568)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1441:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1579)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1379996480))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0872)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-2100271611))
                        goto(Label_0742)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(332101050))
                        goto(Label_0435)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_6AC = and:int(var_3_6AC:int, ldc:int(-548477069))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1568:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B7 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1579:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-535065250))
                        goto(Label_1441)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1729209328))
                        goto(Label_1296)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1607417660))
                        goto(Label_1163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0987)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(173530445))
                        goto(Label_0872)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-483726831))
                        goto(Label_0742)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(804310120))
                        goto(Label_0435)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(2033674227))
                        var_17_6B7 = add:int(var_16_121:int, xor:int(ldc:int(2309), ldc:int(2308)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6AC = and:int(var_3_6AC:int, ldc:int(2044669819))
                
                if (cmple:boolean(var_5_8A = var_17_6B7:int, sub:int(var_6_91:int, and:int(ldc:int(583), ldc:int(1))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-685514883))
            goto(Label_0108)
        }
    }
}
