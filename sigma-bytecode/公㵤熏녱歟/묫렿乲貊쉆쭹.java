public class \u516c\u3d64\u718f\ub171\u6b5f.\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79 {
    public static com.mojang.serialization.Codec<\u516c\u3d64\u718f\ub171\u6b5f.\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79> \u3776\u59ec\uc246\uc910\ub19c\ub18d(java.lang.Runnable p0) {
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
    
    private void \ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \ub113\uc4d2\u183a\u527a\u6435.\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0 p1, int p2, java.lang.Runnable p3) {
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
            invokespecial:Object(Object::<init>, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79)
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\uc9f6\u7873\u516c\ubded\u67d0\u7af6, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u183a\u647c\u71f1\u6435\u6c52\u8df4, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))
            putfield:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\u718f\ud217\ub70c\uc2e8\u3d4b\u6198, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79, p1:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0)
            putfield:int(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\ua068\ub8be\ub18d\u51fa\u9af2\uc4d2, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79, p2:int)
            putfield:Runnable(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\u8753\u3776\u6435\u4e72\ub83f\uc229, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79, p3:Runnable)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79(\u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p0, \ub113\uc4d2\u183a\u527a\u6435.\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0 p1, java.lang.Runnable p2) {
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
            invokespecial:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::<init>, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79, p0:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, p1:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0, invokevirtual:int(\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0::\u4f4a\u92ee\u183a\ub70c\u4f52\u516c, p1:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0), p2:Runnable)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u3d4b\u0800\ub19c\ub7dc\u600f\u59ec() {
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
        
        if (cmpgt:boolean(getfield:int(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\ua068\ub8be\ub18d\u51fa\u9af2\uc4d2, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79), ldc:int(0))) {
            putfield:int(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\ua068\ub8be\ub18d\u51fa\u9af2\uc4d2, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79, sub:int(getfield:int(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\ua068\ub8be\ub18d\u51fa\u9af2\uc4d2, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79), and:int(ldc:int(2305), ldc:int(1))))
            invokeinterface:void(Runnable::run, getfield:Runnable(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\u8753\u3776\u6435\u4e72\ub83f\uc229, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79))
            return:boolean(and:int[expected:boolean](ldc:int(1539), ldc:int(16449)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-19687), ldc:int(17510)))
    }
    
    public boolean \u494c\u839e\ucfaf\ua61f\u71ae\u34df() {
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
        
        if (cmplt:boolean(getfield:int(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\ua068\ub8be\ub18d\u51fa\u9af2\uc4d2, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79), invokevirtual:int(\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0::\u4f4a\u92ee\u183a\ub70c\u4f52\u516c, getfield:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\u718f\ud217\ub70c\uc2e8\u3d4b\u6198, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79)))) {
            putfield:int(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\ua068\ub8be\ub18d\u51fa\u9af2\uc4d2, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79, add:int(getfield:int(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\ua068\ub8be\ub18d\u51fa\u9af2\uc4d2, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79), and:int(ldc:int(16565), ldc:int(5633))))
            invokeinterface:void(Runnable::run, getfield:Runnable(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\u8753\u3776\u6435\u4e72\ub83f\uc229, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79))
            return:boolean(and:int[expected:boolean](ldc:int(29713), ldc:int(37)))
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(7229), ldc:int(-15422)))
    }
    
    public boolean \ub171\u5bc4\u516c\u6d99\u7e3f\u9937() {
        var_1_5F : int
        stack_86_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-39218581), ldc:int(2125250547))
            
            if (cmple:boolean(getfield:int(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\ua068\ub8be\ub18d\u51fa\u9af2\uc4d2, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79), ldc:int(0))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-1107952653))
                stack_86_0 = and:int(ldc:int(16530), ldc:int(-16531))
            }
            else {
                stack_86_0 = and:int(ldc:int(4129), ldc:int(131))
            }
            
            return:boolean(stack_86_0:int)
        }
        
        goto(Label_0006)
    }
    
    public boolean \u624e\u516c\u3a62\u74b1\u446c\u51b2() {
        var_1_5F : int
        stack_8D_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(1929767249), ldc:int(1806430294))
            
            if (cmpeq:boolean(getfield:int(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\ua068\ub8be\ub18d\u51fa\u9af2\uc4d2, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79), invokevirtual:int(\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0::\u4f4a\u92ee\u183a\ub70c\u4f52\u516c, getfield:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\u718f\ud217\ub70c\uc2e8\u3d4b\u6198, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79)))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-285481736))
                stack_8D_0 = and:int(ldc:int(22288), ldc:int(-22290))
            }
            else {
                stack_8D_0 = and:int(ldc:int(5), ldc:int(8481))
            }
            
            return:boolean(stack_8D_0:int)
        }
        
        goto(Label_0006)
    }
    
    public \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 \u3e75\u5fe1\ubcb0\ua3b4\ub18d\u494c() {
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
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\uc9f6\u7873\u516c\ubded\u67d0\u7af6, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79))
        }
        
        goto(Label_0006)
    }
    
    public \ub113\uc4d2\u183a\u527a\u6435.\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0 \uc2bd\uc238\u6d99\ud158\ub19c\u92ee() {
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
            return:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0(getfield:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\u718f\ud217\ub70c\uc2e8\u3d4b\u6198, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79))
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_88 : int
        stack_CB_0 : int [generated]
        
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
        var_2_88 = and:int(ldc:int(-136777604), ldc:int(1440382172))
        
        if (cmpne:boolean(this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79[expected:Object], p0:Object)) {
            loop {
                if (cmpne:boolean(and:int(var_2_88:int, ldc:int(16384)), ldc:int(0))) {
                    var_2_88 = and:int(var_2_88:int, ldc:int(-545559691))
                    
                    if (cmpne:boolean(p0:Object, aconstnull:Object())) {
                        if (cmpeq:boolean(invokevirtual:Class<? extends \ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79>(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::getClass, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79), invokevirtual:Class<?>(Object::getClass, p0:Object))) {
                            stack_CB_0 = invokestatic:boolean[expected:int](Objects::equals, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object](\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\uc9f6\u7873\u516c\ubded\u67d0\u7af6, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79), getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:Object](\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\uc9f6\u7873\u516c\ubded\u67d0\u7af6, checkcast:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79(\u516c\u3d64\u718f\ub171\u6b5f.\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79.class, p0:Object[expected:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79])))
                            looporswitchbreak()
                        }
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_88:int, ldc:int(128)), ldc:int(0))) {
                    var_2_88 = and:int(var_2_88:int, ldc:int(-6362786))
                    stack_CB_0 = and:int(ldc:int(2223), ldc:int(-2240))
                    looporswitchbreak()
                }
                
                var_2_88 = and:int(var_2_88:int, ldc:int(-2073301428))
            }
            
            return:boolean(stack_CB_0:int)
        }
        
        return:boolean(xor:int[expected:boolean](ldc:int(-16127), ldc:int(-16128)))
    }
    
    public int hashCode() {
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
            return:int(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::hashCode, getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\uc9f6\u7873\u516c\ubded\u67d0\u7af6, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79)))
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.datafixers.kinds.App lambda$\uc2bd\u839e\u16f6\u624e\u67d0\uc29a$3(java.lang.Runnable p0, com.mojang.serialization.codecs.RecordCodecBuilder$Instance p1) {
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
    
    private static java.lang.Integer lambda$\u3d4b\u12cb\u67e9\u4f52\u8258\u8bb0$2(\u516c\u3d64\u718f\ub171\u6b5f.\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79 p0) {
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
            return:Integer(invokestatic:Integer(Integer::valueOf, getfield:int(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\ua068\ub8be\ub18d\u51fa\u9af2\uc4d2, p0:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79)))
        }
        
        goto(Label_0006)
    }
    
    private static \ub113\uc4d2\u183a\u527a\u6435.\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0 lambda$\u34df\u4cd9\ub83f\u7006\u56bd\ufe34$1(\u516c\u3d64\u718f\ub171\u6b5f.\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79 p0) {
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
            return:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0(getfield:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\u718f\ud217\ub70c\uc2e8\u3d4b\u6198, p0:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79))
        }
        
        goto(Label_0006)
    }
    
    private static \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 lambda$\u3776\u8413\ub102\u6b0d\u8308\u3bc9$0(\u516c\u3d64\u718f\ub171\u6b5f.\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79 p0) {
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
            return:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(getfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\uc9f6\u7873\u516c\ubded\u67d0\u7af6, p0:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_295 : int
        expr_6E : int [generated]
        stack_B5_0 : byte[] [generated]
        stack_B7_0 : byte[] [generated]
        stack_108_0 : byte[] [generated]
        stack_10A_0 : byte[] [generated]
        stack_13F_0 : byte[] [generated]
        stack_141_0 : byte[] [generated]
        stack_182_0 : byte[] [generated]
        stack_184_0 : byte[] [generated]
        stack_1B8_0 : byte[] [generated]
        stack_25A_0 : byte[] [generated]
        stack_2B0_0 : byte[] [generated]
        stack_358_0 : byte[] [generated]
        stack_393_0 : byte[] [generated]
        stack_3E9_0 : byte[] [generated]
        var_4_234 : int
        var_3_239 : byte[]
        var_5_23A : int
        var_0_2CA : int
        expr_2B0 : byte [generated]
        stack_302_2 : byte [generated]
        stack_2D6_0 : byte [generated]
        expr_B7 : int [generated]
        expr_10A : int [generated]
        var_2_13F : byte[]
        expr_143 : int [generated]
        var_3_381 : byte[]
        var_5_382 : int
        expr_184 : int [generated]
        var_3_3D7 : byte[]
        var_5_3D8 : int
        expr_3E9 : byte [generated]
        var_3_1C4 : String
        stack_22D_0 : String[] [generated]
        expr_1D6 : String[] [generated]
        
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
        var_0_295 = and:int(ldc:int(501545280), ldc:int(1599929140))
        expr_6E = arraylength:int(stack_B5_0 = stack_B7_0 = stack_108_0 = stack_10A_0 = stack_13F_0 = stack_141_0 = stack_182_0 = stack_184_0 = stack_1B8_0 = stack_25A_0 = stack_2B0_0 = stack_358_0 = stack_393_0 = stack_3E9_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("O6ISwtF6SnI6osoaOpqiVZHZsVY=")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_234 = expr_6E:int
        var_3_239 = newarray:byte[](byte.class, expr_6E:int)
        var_5_23A = expr_6E:int
        Label_0572:
        
        while (cmpne:boolean(and:int(var_0_295:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0649)
            }
            
            var_0_295 = and:int(var_0_295:int, ldc:int(2035742621))
            var_5_23A = add:int(var_5_23A:int, ldc:int(-1))
            storeelement:byte(var_3_239:byte[], var_5_23A:int, add:byte(loadelement:byte(stack_25A_0:byte[], var_5_23A:int), ldc:byte(14)))
            
            if (cmpne:boolean(var_5_23A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B7_0 = stack_B5_0 = stack_108_0 = stack_10A_0 = stack_13F_0 = stack_141_0 = stack_182_0 = stack_184_0 = stack_1B8_0 = stack_25A_0 = stack_2B0_0 = stack_358_0 = stack_393_0 = stack_3E9_0 = var_3_239:byte[]
            goto(Label_0115)
        }
        
        goto(Label_0808)
        Label_0649:
        
        while (cmpne:boolean(and:int(var_0_295:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(32768)), ldc:int(0))) {
                goto(Label_0572)
            }
            
            var_0_2CA = and:int(var_0_295:int, ldc:int(424079171))
            var_5_23A = add:int(var_5_23A:int, ldc:int(-1))
            expr_2B0 = stack_302_2 = loadelement(stack_2B0_0, var_5_23A)
            
            if (cmplt:boolean(add:int(add:int(var_5_23A:int, ldc:int(4)), neg:int(var_4_234:int)), ldc:int(0))) {
                stack_302_2 = stack_2D6_0 = add:byte(expr_2B0:byte, loadelement:byte(var_3_239:byte[], add:int(var_5_23A:int, ldc:int(4))))
                goto(Label_0742)
            }
            
            Label_0701:
            
            if (cmpeq:boolean(and:int(var_0_2CA:int, ldc:int(8192)), ldc:int(0))) {
                var_0_2CA = and:int(var_0_2CA:int, ldc:int(-1039559831))
            }
            else {
                var_0_2CA = and:int(var_0_2CA:int, ldc:int(461238083))
                stack_302_2 = stack_2D6_0 = add:byte(expr_2B0:byte, ldc:byte(4))
            }
            
            Label_0742:
            
            if (cmpeq:boolean(and:int(var_0_2CA:int, ldc:int(32768)), ldc:int(0))) {
                var_0_2CA = and:int(var_0_2CA:int, ldc:int(-585362854))
                goto(Label_0701)
            }
            
            var_0_295 = and:int(var_0_2CA:int, ldc:int(-1143018523))
            storeelement:byte(var_3_239:byte[], var_5_23A:int, stack_302_2:byte)
            
            if (cmpne:boolean(var_5_23A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B7_0 = stack_B5_0 = stack_108_0 = stack_10A_0 = stack_13F_0 = stack_141_0 = stack_182_0 = stack_184_0 = stack_1B8_0 = stack_25A_0 = stack_2B0_0 = stack_358_0 = stack_393_0 = stack_3E9_0 = var_3_239:byte[]
            goto(Label_0188)
        }
        
        var_0_295 = and:int(var_0_295:int, ldc:int(-156971342))
        Label_0808:
        
        while (cmpeq:boolean(and:int(var_0_295:int, ldc:int(131072)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_295:int, ldc:int(128)), ldc:int(0))) {
                var_0_295 = and:int(var_0_295:int, ldc:int(484126591))
                goto(Label_0572)
            }
            
            var_0_295 = and:int(var_0_295:int, ldc:int(-1688737483))
            var_5_23A = add:int(var_5_23A:int, ldc:int(-1))
            storeelement:byte(var_3_239:byte[], var_5_23A:int, xor:byte(loadelement:byte(stack_358_0:byte[], var_5_23A:int), ldc:byte(104)))
            
            if (cmpne:boolean(var_5_23A:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_B7_0 = stack_B5_0 = stack_108_0 = stack_10A_0 = stack_13F_0 = stack_141_0 = stack_182_0 = stack_184_0 = stack_1B8_0 = stack_25A_0 = stack_2B0_0 = stack_358_0 = stack_393_0 = stack_3E9_0 = var_3_239:byte[]
            goto(Label_0271)
        }
        
        var_0_295 = and:int(var_0_295:int, ldc:int(444087088))
        goto(Label_0649)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(16384)), ldc:int(0))) {
            var_0_295 = and:int(var_0_295:int, ldc:int(1605066883))
            goto(Label_0393)
        }
        
        if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(4194304)), ldc:int(0))) {
            goto(Label_0328)
        }
        
        if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_295 = and:int(var_0_295:int, ldc:int(1466797725))
            goto(Label_0271)
        }
        
        if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(8192)), ldc:int(0))) {
            var_0_295 = and:int(var_0_295:int, ldc:int(-286829864))
        }
        else {
            var_0_295 = and:int(var_0_295:int, ldc:int(-2823725))
            expr_B7 = arraylength:int(stack_B7_0:byte[])
            
            if (cmpne:boolean(expr_B7:int, ldc:int(0))) {
                var_4_234 = expr_B7:int
                var_3_239 = newarray:byte[](byte.class, expr_B7:int)
                var_5_23A = expr_B7:int
                goto(Label_0649)
            }
        }
        
        Label_0188:
        
        if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(4194304)), ldc:int(0))) {
            var_0_295 = and:int(var_0_295:int, ldc:int(-1184323926))
            goto(Label_0393)
        }
        
        if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(16777216)), ldc:int(0))) {
            var_0_295 = and:int(var_0_295:int, ldc:int(695277028))
            goto(Label_0328)
        }
        
        if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_295 = and:int(var_0_295:int, ldc:int(1057639135))
        }
        else {
            if (cmpne:boolean(and:int(var_0_295:int, ldc:int(4)), ldc:int(0))) {
                var_0_295 = and:int(var_0_295:int, ldc:int(1220735445))
                goto(Label_0115)
            }
            
            var_0_295 = and:int(var_0_295:int, ldc:int(2144791510))
            expr_10A = arraylength:int(stack_10A_0:byte[])
            
            if (cmpne:boolean(expr_10A:int, ldc:int(0))) {
                var_4_234 = expr_10A:int
                var_3_239 = newarray:byte[](byte.class, expr_10A:int)
                var_5_23A = expr_10A:int
                goto(Label_0808)
            }
        }
        
        Label_0271:
        
        if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(256)), ldc:int(0))) {
            var_0_295 = and:int(var_0_295:int, ldc:int(1657689265))
            goto(Label_0393)
        }
        
        if (cmpne:boolean(and:int(var_0_295:int, ldc:int(16384)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0188)
            }
            
            if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_295 = and:int(var_0_295:int, ldc:int(526186468))
            var_2_13F = stack_13F_0:byte[]
            expr_143 = add:int(arraylength:int(stack_141_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_143:int, ldc:int(0))) {
                var_3_381 = newarray:byte[](byte.class, expr_143:int)
                var_5_382 = expr_143:int
                
                loop {
                    var_0_295 = and:int(var_0_295:int, ldc:int(1564867367))
                    var_5_382 = add:int(var_5_382:int, ldc:int(-1))
                    storeelement:byte(var_3_381:byte[], var_5_382:int, add:int(shl:int(loadelement:byte(stack_393_0:byte[], var_5_382:int), ldc:int(1)), and:int(shr:int(loadelement:byte(var_2_13F:byte[], add:int(var_5_382:int, and:int(ldc:int(8193), ldc:int(18725)))), ldc:int(7)), and:int(ldc:int(161), ldc:int(17177)))))
                    
                    if (cmpne:boolean(var_5_382:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B7_0 = stack_B5_0 = stack_108_0 = stack_10A_0 = stack_13F_0 = stack_141_0 = stack_182_0 = stack_184_0 = stack_1B8_0 = stack_25A_0 = stack_2B0_0 = stack_358_0 = stack_393_0 = stack_3E9_0 = var_3_381:byte[]
            }
        }
        
        Label_0328:
        
        if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(134217728)), ldc:int(0))) {
            var_0_295 = and:int(var_0_295:int, ldc:int(-1631728345))
        }
        else {
            if (cmpne:boolean(and:int(var_0_295:int, ldc:int(4)), ldc:int(0))) {
                goto(Label_0271)
            }
            
            if (cmpne:boolean(and:int(var_0_295:int, ldc:int(16)), ldc:int(0))) {
                goto(Label_0188)
            }
            
            if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(262144)), ldc:int(0))) {
                var_0_295 = and:int(var_0_295:int, ldc:int(-631524582))
                goto(Label_0115)
            }
            
            var_0_295 = and:int(var_0_295:int, ldc:int(-639110355))
            expr_184 = arraylength:int(stack_184_0:byte[])
            
            if (cmpne:boolean(expr_184:int, ldc:int(0))) {
                var_3_3D7 = newarray:byte[](byte.class, expr_184:int)
                var_5_3D8 = expr_184:int
                
                loop {
                    var_0_295 = and:int(var_0_295:int, ldc:int(961996638))
                    var_5_3D8 = add:int(var_5_3D8:int, ldc:int(-1))
                    expr_3E9 = loadelement:byte(stack_3E9_0:byte[], var_5_3D8:int)
                    storeelement:byte(var_3_3D7:byte[], var_5_3D8:int, or:int(and:int(shl:int(expr_3E9:byte, xor:int(ldc:int(653), ldc:int(649))), ldc:int(-16)), and:int(shr:int(expr_3E9:byte[expected:int], and:int(ldc:int(26629), ldc:int(2022))), ldc:int(15))))
                    
                    if (cmpne:boolean(var_5_3D8:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_B7_0 = stack_B5_0 = stack_108_0 = stack_10A_0 = stack_13F_0 = stack_141_0 = stack_182_0 = stack_184_0 = stack_1B8_0 = stack_25A_0 = stack_2B0_0 = stack_358_0 = stack_393_0 = stack_3E9_0 = var_3_3D7:byte[]
            }
        }
        
        Label_0393:
        
        if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(16384)), ldc:int(0))) {
            goto(Label_0328)
        }
        
        if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(16777216)), ldc:int(0))) {
            goto(Label_0271)
        }
        
        if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(256)), ldc:int(0))) {
            var_0_295 = and:int(var_0_295:int, ldc:int(-1572988810))
            goto(Label_0188)
        }
        
        if (cmpeq:boolean(and:int(var_0_295:int, ldc:int(536870912)), ldc:int(0))) {
            var_3_1C4 = initobject:String(String::<init>, stack_1B8_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_22D_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(4164), ldc:int(4167)))
            expr_1D6 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(3), ldc:int(29723)))
            storeelement:String(expr_1D6:String[], and:int(ldc:int(2754), ldc:int(17679)), invokevirtual:String[expected:String](String::substring, var_3_1C4:String, and:int(ldc:int(-31842), ldc:int(27744)), and:int(ldc:int(5020), ldc:int(44))))
            storeelement:String(expr_1D6:String[], and:int(ldc:int(21261), ldc:int(-23310)), invokevirtual:String[expected:String](String::substring, var_3_1C4:String, xor:int(ldc:int(17153), ldc:int(17165)), and:int(ldc:int(8399), ldc:int(1055))))
            storeelement:String(expr_1D6:String[], xor:int(ldc:int(-31472), ldc:int(-31471)), invokevirtual:String[expected:String](String::substring, var_3_1C4:String, xor:int(ldc:int(3), ldc:int(12)), and:int(ldc:int(16915), ldc:int(1171))))
            putstatic:String[](\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79::\uf9c5\u92ee\u4492\u8bb0\u600f\ud158, expr_1D6:String[])
            return:void()
        }
        
        goto(Label_0115)
    }
    
    public void \u76bc\u4cd9\u071d\u3d4b\uc9f6\u1833(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_696 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6A1 : int
        
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
        var_3_696 = and:int(ldc:int(-245533768), ldc:int(-1126303799))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubb2b\ub83f\u4e72\u8c8a\uc246\ucb79[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(-421593095))
            var_5_81 = and:int(ldc:int(29384), ldc:int(-30411))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-3490), ldc:int(3489)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_696:int, ldc:int(-346262548))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, and:int(ldc:int(20487), ldc:int(305)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(8289), ldc:int(2307)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_696 = and:int(var_3_DA:int, ldc:int(-1554120731))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), and:int(ldc:int(43), ldc:int(1)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-780113658))
                        goto(Label_1574)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1702651955))
                        goto(Label_1299)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(650772337))
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1638969659))
                        goto(Label_1006)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-27387259))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(14642048))
                        goto(Label_0742)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1920859132))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0601)
                            }
                            
                            goto(Label_0873)
                        }
                    }
                    
                    Label_0427:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-135292099))
                        goto(Label_1574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1083546272))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-546416195))
                        goto(Label_1192)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-430988892))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0742)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1905492326))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(2002712556))
                            var_11_EB = and:int(ldc:int(-25718), ldc:int(25697))
                            goto(Label_1563)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0601:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-578351345))
                        goto(Label_1574)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1493594573))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1972112678))
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(587584508))
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(718005662))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-423106179))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1126403179))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0873)
                        }
                    }
                    
                    Label_0742:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(662418151))
                        goto(Label_1574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(293948724))
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(2009431172))
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(478461823))
                        goto(Label_1006)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0601)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-245366890))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0873:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1730495079))
                        goto(Label_1574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1243981097))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1801236731))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1633213295))
                            goto(Label_0742)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-507048890))
                            goto(Label_0601)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(1985771393))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(4865), ldc:int(225))
                                goto(Label_1192)
                            }
                        }
                    }
                    
                    Label_1006:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1574)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-260992535))
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1228883629))
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(589784810))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1015595061))
                            goto(Label_0742)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1741651807))
                            goto(Label_0601)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1644312853))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1856961635))
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(962394003))
                        var_11_EB = and:int(ldc:int(-8683), ldc:int(8682))
                    }
                    
                    Label_1192:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1574)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1624373451))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1006)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(1448126125))
                            goto(Label_0742)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0601)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1243677779))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1426)
                            }
                        }
                    }
                    
                    Label_1299:
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1725431702))
                        goto(Label_1574)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_1192)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-1954046933))
                            goto(Label_1006)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0873)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0742)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0601)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(-548788697))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_696 = and:int(var_3_696:int, ldc:int(2004811706))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                            goto(Label_1563)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1426:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-227713722))
                        goto(Label_1574)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1192)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-2014404063))
                        goto(Label_0873)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0742)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1530071960))
                        goto(Label_0601)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-1529597247))
                        goto(Label_0427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(-1350565968))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1563:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A1 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1574:
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1426)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(82529760))
                        goto(Label_1299)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(1945973580))
                        goto(Label_1192)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0873)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0742)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0601)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(508136732))
                        goto(Label_0427)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_696:int, ldc:int(256)), ldc:int(0))) {
                        var_3_696 = and:int(var_3_696:int, ldc:int(-167873585))
                        var_17_6A1 = add:int(var_16_119:int, and:int(ldc:int(25633), ldc:int(6669)))
                        looporswitchbreak()
                    }
                    
                    var_3_696 = and:int(var_3_696:int, ldc:int(248433953))
                }
                
                var_3_696 = and:int(var_3_696:int, ldc:int(721353644))
                
                if (cmple:boolean(var_5_81 = var_17_6A1:int, sub:int(var_6_88:int, and:int(ldc:int(16645), ldc:int(14401))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpne:boolean(and:int(var_3_696:int, ldc:int(1024)), ldc:int(0))) {
            var_3_696 = and:int(var_3_696:int, ldc:int(-1488501498))
            goto(Label_0108)
        }
    }
}
