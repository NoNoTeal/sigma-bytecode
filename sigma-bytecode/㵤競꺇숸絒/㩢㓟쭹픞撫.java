public class \u3d64\u7af6\uae87\uc238\u7d52.\u3a62\u34df\ucb79\ud51e\u64ab {
    public void \u3a62\u34df\ucb79\ud51e\u64ab(float p0) {
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
            invokespecial:\u67e9\u7330\u62da\u3c25\u624e(\u67e9\u7330\u62da\u3c25\u624e::<init>, this:\u3a62\u34df\ucb79\ud51e\u64ab, invokestatic:ImmutableMap[expected:Map](ImmutableMap::of, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\uc87f\ubcb0\uafe7\u64f2\u74b1>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\uceb8\u51b2\ud523\ud523\u3a62\u3c25), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u51fa\ud7e8\u4179\u64f2\u5bc4\u61a4)))
            putfield:float(\u3a62\u34df\ucb79\ud51e\u64ab::\u600f\ud51e\u8753\u946b\ubf56\ub1b9, this:\u3a62\u34df\ucb79\ud51e\u64ab, p0:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7873\uc7fe\u99f7\ubb2b\u1833\ua562(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, long p2) {
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
    
    public boolean \u4ab3\uafe7\u8709\ub171\ubefe\u759a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_3_5F : int
        stack_8A_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(-2086294209), ldc:int(800386543))
            
            if (invokevirtual:boolean(\u8bb0\u759a\u3bc9\u527a\ube23\u5140::\u8df4\u71f1\u12b2\u9af2\u1833\ub1b9, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140], invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1182719806))
                stack_8A_0 = and:int(ldc:int(2693), ldc:int(-2694))
            }
            else {
                stack_8A_0 = and:int(ldc:int(43), ldc:int(257))
            }
            
            return:boolean(stack_8A_0:int)
        }
        
        goto(Label_0006)
    }
    
    private \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 \uc31c\u4f4a\uae87\u183a\ub113\u7043(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_3_5F : int
        var_5_64 : Random
        var_6_6A : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        var_7_73 : int
        var_8_C2 : \u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56
        
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
        var_3_5F = and:int(ldc:int(-112172256), ldc:int(-1286258831))
        var_5_64 = invokevirtual:Random(\ube23\u67d0\u64f2\u839e\u76bc::\u4daf\u446c\ubcb0\u759a\ua562\u5245, p1:\ube23\u67d0\u64f2\u839e\u76bc)
        var_6_6A = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7d52\u718f\u3776\u6fb0\ub83f::\u6c52\uc7fe\u600f\u72f1\u8640\u1833, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])
        var_7_73 = and:int(ldc:int(-8069), ldc:int(8068))
        
        loop {
            if (cmpeq:boolean(and:int(var_3_5F:int, ldc:int(64)), ldc:int(0))) {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-2024443347))
                
                if (cmplt:boolean(var_7_73:int, ldc:int(10))) {
                    var_8_C2 = invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\uc84e\u5f50\u92ff\u92ff\u2dcc\u7330, var_6_6A:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56, sub:int(invokevirtual:int(Random::nextInt, var_5_64:Random, ldc:int(20)), ldc:int(10)), sub:int(invokevirtual:int(Random::nextInt, var_5_64:Random, ldc:int(6)), and:int(ldc:int(1043), ldc:int(899))), sub:int(invokevirtual:int(Random::nextInt, var_5_64:Random, ldc:int(20)), ldc:int(10)))
                    
                    if (logicalnot:boolean(invokestatic:boolean(\u3a62\u34df\ucb79\ud51e\u64ab::\u3504\u4179\u4e72\u8389\u3dd3\ubefe, p0:\ube23\uc238\u5140\u4cd9\u8aa5, p1:\ube23\u67d0\u64f2\u839e\u76bc, var_8_C2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))) {
                        var_3_5F = and:int(var_3_5F:int, ldc:int(831684529))
                        inc:int(var_7_73, ldc:int(1))
                        loopcontinue()
                    }
                    
                    return:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(invokestatic:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(\u3a62\u5d20\u4f52\uc229\u8308\ud7e8::\u494c\u47c2\u9255\u69d9\u8c8a\u624e, var_8_C2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df]))
                }
            }
            
            if (cmpne:boolean(and:int(var_3_5F:int, ldc:int(16777216)), ldc:int(0))) {
                return:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8(aconstnull:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8())
            }
        }
    }
    
    public static boolean \u3504\u4179\u4e72\u8389\u3dd3\ubefe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, \u71f1\uc910\u3bc9\u516c\u93a2.\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56 p2) {
        var_3_5F : int
        stack_A2_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(83606504), ldc:int(-1828857875))
            
            if (logicaland:boolean(invokevirtual:boolean(\u8bb0\u759a\u3bc9\u527a\ube23\u5140::\u8df4\u71f1\u12b2\u9af2\u1833\ub1b9, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u8bb0\u759a\u3bc9\u527a\ube23\u5140], p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56), cmple:boolean(i2d:double(invokevirtual:int(\u3a62\uc9f6\u3776\u4f52\ua068\u34df::\u9af2\u8350\u8350\u93a2\u494c\u624e, invokevirtual:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56[expected:\u3a62\uc9f6\u3776\u4f52\ua068\u34df](\u7ce1\uc9f6\u61a4\u0a06\uff55::\uf995\uc7fe\u4daf\u71f1\u62da\ub102, p0:\ube23\uc238\u5140\u4cd9\u8aa5[expected:\u7ce1\uc9f6\u61a4\u0a06\uff55], getstatic:\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9(\ub19c\u74b1\u7af6\u7e3f\ucfaf\u3bc9::\uceb8\ua3b4\u4975\u4179\uf94d\u6198), p2:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56))), invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\ud51e\u12cb\u3dd3\uc84e\u8308\ube23, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))) {
                stack_A2_0 = and:int(ldc:int(593), ldc:int(6401))
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-973211653))
                stack_A2_0 = and:int(ldc:int(2961), ldc:int(-2962))
            }
            
            return:boolean(stack_A2_0:int)
        }
        
        goto(Label_0006)
    }
    
    private \u36d3\u9033\u6b0d\u983f\u8d90.\uc87f\ubcb0\uafe7\u64f2\u74b1 lambda$\u4ab3\u516c\u7043\uc4d2\u99f7\u5bc4$0(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u3a62\u5d20\u4f52\uc229\u8308\ud7e8 p0) {
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
            return:\uc87f\ubcb0\uafe7\u64f2\u74b1(initobject:\uc87f\ubcb0\uafe7\u64f2\u74b1(\uc87f\ubcb0\uafe7\u64f2\u74b1::<init>, p0:\u3a62\u5d20\u4f52\uc229\u8308\ud7e8, getfield:float(\u3a62\u34df\ucb79\ud51e\u64ab::\u600f\ud51e\u8753\u946b\ubf56\ub1b9, this:\u3a62\u34df\ucb79\ud51e\u64ab), and:int(ldc:int(-11308), ldc:int(11307))))
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
    
    public void \u6fb0\u8413\u8389\ub1b9\ub83f\u8258(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6A2 : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6AD : int
        
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
        var_3_6A2 = and:int(ldc:int(-1852051751), ldc:int(-607793435))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3a62\u34df\ucb79\ud51e\u64ab[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-45778425))
        }
        else {
            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-235811585))
            var_5_85 = and:int(ldc:int(16531), ldc:int(-16532))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-32018), ldc:int(27664)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6A2:int, ldc:int(-424936249))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(1033), ldc:int(145)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, xor:int(ldc:int(-32512), ldc:int(-32511)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6A2 = and:int(var_3_DA:int, ldc:int(-1673810215))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(16457), ldc:int(5269)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-443177393))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(914502715))
                        goto(Label_1156)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1015)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0856)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(676270840))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-549339431))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0856)
                        }
                    }
                    
                    Label_0400:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1761261637))
                        goto(Label_1279)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1798373117))
                        goto(Label_1156)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1990022888))
                        goto(Label_1015)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0856)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1368214333))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-526349949))
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-434246149))
                        var_11_EB = and:int(ldc:int(-19806), ldc:int(19801))
                        goto(Label_1566)
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1053333713))
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-208235031))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1156)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-811343593))
                        goto(Label_1015)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(887734658))
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1424934074))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1264675686))
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-597189427))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0856)
                        }
                    }
                    
                    Label_0716:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1548649163))
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1918324953))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1384778682))
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1359642263))
                        goto(Label_1156)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1015)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1416244440))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1831617037))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0856:
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(2115356492))
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(466854525))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1060977031))
                        goto(Label_1156)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-962984660))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1403433022))
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(20239920))
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-451630949))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(227614743))
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1035743797))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(4781), ldc:int(10497))
                                goto(Label_1156)
                            }
                        }
                    }
                    
                    Label_1015:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-149124704))
                        goto(Label_1422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0856)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-865117620))
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(536870912)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1553088571))
                        var_11_EB = and:int(ldc:int(17095), ldc:int(-22496))
                    }
                    
                    Label_1156:
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1314250156))
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(18888756))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_1015)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1759886889))
                            goto(Label_0856)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1870773555))
                            goto(Label_0716)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0400)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(256)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1832128777))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1422)
                            }
                        }
                    }
                    
                    Label_1279:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1328842784))
                        goto(Label_1577)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-110636621))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_1156)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_1015)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(383817576))
                            goto(Label_0856)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0716)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-786476934))
                            goto(Label_0400)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(64)), ldc:int(0))) {
                            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1961324311))
                            loopcontinue()
                        }
                        
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-994836521))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1566)
                    }
                    
                    Label_1422:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1373375487))
                        goto(Label_1279)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1156)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1882776349))
                        goto(Label_1015)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1816718280))
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1141883689))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0400)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-781519490))
                        loopcontinue()
                    }
                    
                    var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-296358411))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1566:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AD = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1577:
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-2021490625))
                        goto(Label_1279)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(64)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1151314106))
                        goto(Label_1156)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1015)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(412197659))
                        goto(Label_0856)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6A2:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0716)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1256255799))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1227310164))
                        goto(Label_0400)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-1442468665))
                        var_17_6AD = add:int(var_16_119:int, and:int(ldc:int(1155), ldc:int(12317)))
                        looporswitchbreak()
                    }
                }
                
                var_3_6A2 = and:int(var_3_6A2:int, ldc:int(-724455727))
                
                if (cmple:boolean(var_5_85 = var_17_6AD:int, sub:int(var_6_8C:int, and:int(ldc:int(20483), ldc:int(549))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_6A2:int, ldc:int(1073741824)), ldc:int(0))) {
            var_3_6A2 = and:int(var_3_6A2:int, ldc:int(1323506089))
            goto(Label_0106)
        }
    }
}
