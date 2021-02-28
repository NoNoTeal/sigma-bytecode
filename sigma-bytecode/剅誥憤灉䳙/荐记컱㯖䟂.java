public class \u5245\u8aa5\u61a4\u7049\u4cd9.\u8350\u8bb0\ucef1\u3bd6\u47c2<E> {
    public void \u8350\u8bb0\ucef1\u3bd6\u47c2(float p0, boolean p1, int p2) {
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
    
    public void \u8350\u8bb0\ucef1\u3bd6\u47c2(java.util.function.Predicate<E> p0, float p1, boolean p2, int p3) {
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
            invokespecial:\u67e9\u7330\u62da\u3c25\u624e(\u67e9\u7330\u62da\u3c25\u624e::<init>, this:\u8350\u8bb0\ucef1\u3bd6\u47c2<E>, invokestatic:ImmutableMap[expected:Map](ImmutableMap::of, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u7ce1\u6b5f\u071d\u873d\ubf56\u74b1>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ua3b4\u4daf\u98a4\u527a\uc4d2\u36d3), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u52d3\uf94d\u7006\uc910\uf995\u6b0d), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\uc87f\ubcb0\uafe7\u64f2\u74b1>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\uceb8\u51b2\ud523\ud523\u3a62\u3c25), ternaryop:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](p2:boolean, getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6(\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u52d3\uf94d\u7006\uc910\uf995\u6b0d), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6(\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u51fa\ud7e8\u4179\u64f2\u5bc4\u61a4)), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u120d\u8bb0\u836c\u64f2\u3504>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u7c6b\u3c25\u446c\ubff1\u3d64\uae87), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u59ec\u7330\ucb79\u40a9\u6bb9\uff55)))
            putfield:Predicate<E>(\u8350\u8bb0\ucef1\u3bd6\u47c2::\u6435\u7e3f\u47c2\u64f2\u8753\u5654, this:\u8350\u8bb0\ucef1\u3bd6\u47c2<E>, p0:Predicate<E>)
            putfield:int(\u8350\u8bb0\ucef1\u3bd6\u47c2::\u36d3\u3bd6\u5db4\ub102\ufe34\u6fb0, this:\u8350\u8bb0\ucef1\u3bd6\u47c2<E>, p3:int)
            putfield:float(\u8350\u8bb0\ucef1\u3bd6\u47c2::\uc87f\u4f52\ub171\u8753\ud4fe\u16f6, this:\u8350\u8bb0\ucef1\u3bd6\u47c2<E>, p1:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4ab3\uafe7\u8709\ub171\ubefe\u759a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, E extends \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_3_5F : int
        stack_A4_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(2109336703), ldc:int(-29112858))
            
            if (logicaland:boolean(invokeinterface:boolean(Predicate<E>::test, getfield:Predicate<E>(\u8350\u8bb0\ucef1\u3bd6\u47c2::\u6435\u7e3f\u47c2\u64f2\u8753\u5654, this:\u8350\u8bb0\ucef1\u3bd6\u47c2<E>), p1:E extends \ube23\u67d0\u64f2\u839e\u76bc), invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ubded\u120d\u600f\ua068\u4f52\u8308, invokespecial:\u120d\u8bb0\u836c\u64f2\u3504[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8350\u8bb0\ucef1\u3bd6\u47c2<E>::\u3bc9\ubcb0\u6c52\u4ab3\u0b8e\u983f, this:\u8350\u8bb0\ucef1\u3bd6\u47c2<E>, p1:E extends \ube23\u67d0\u64f2\u839e\u76bc), p1:E extends \ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], i2d:double(getfield:int(\u8350\u8bb0\ucef1\u3bd6\u47c2::\u36d3\u3bd6\u5db4\ub102\ufe34\u6fb0, this:\u8350\u8bb0\ucef1\u3bd6\u47c2<E>))))) {
                stack_A4_0 = xor:int(ldc:int(-26368), ldc:int(-26367))
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(1510334438))
                stack_A4_0 = and:int(ldc:int(1611), ldc:int(-1628))
            }
            
            return:boolean(stack_A4_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u7873\uc7fe\u99f7\ubb2b\u1833\ua562(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, E extends \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, long p2) {
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
            invokestatic:void(\u4c2b\uc2e8\u4492\ubefe\u99f7::\u61a4\u392e\uf94d\ufcaf\u99f7\u74b1, p1:E extends \ube23\u67d0\u64f2\u839e\u76bc[expected:\ube23\u67d0\u64f2\u839e\u76bc], invokespecial:\u120d\u8bb0\u836c\u64f2\u3504[expected:\u7d52\u718f\u3776\u6fb0\ub83f](\u8350\u8bb0\ucef1\u3bd6\u47c2<E>::\u3bc9\ubcb0\u6c52\u4ab3\u0b8e\u983f, this:\u8350\u8bb0\ucef1\u3bd6\u47c2<E>, p1:E extends \ube23\u67d0\u64f2\u839e\u76bc), getfield:float(\u8350\u8bb0\ucef1\u3bd6\u47c2::\uc87f\u4f52\ub171\u8753\ud4fe\u16f6, this:\u8350\u8bb0\ucef1\u3bd6\u47c2<E>), and:int(ldc:int(2152), ldc:int(-2153)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u3d64\u7af6\uae87\uc238\u7d52.\u120d\u8bb0\u836c\u64f2\u3504 \u3bc9\ubcb0\u6c52\u4ab3\u0b8e\u983f(E extends \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:\u120d\u8bb0\u836c\u64f2\u3504(checkcast:\u120d\u8bb0\u836c\u64f2\u3504(\u3d64\u7af6\uae87\uc238\u7d52.\u120d\u8bb0\u836c\u64f2\u3504.class, invokevirtual:\u120d\u8bb0\u836c\u64f2\u3504(Optional<\u120d\u8bb0\u836c\u64f2\u3504>::get, invokevirtual:Optional<\u120d\u8bb0\u836c\u64f2\u3504>(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u836c\u8753\ub102\u9a18\uc910\u6fb0, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:E extends \ube23\u67d0\u64f2\u839e\u76bc[expected:\ube23\u67d0\u64f2\u839e\u76bc]), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u120d\u8bb0\u836c\u64f2\u3504>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u7c6b\u3c25\u446c\ubff1\u3d64\uae87)))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u600f\u4179\u40a9\u1833\u965f\u965f$0(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(1633), ldc:int(16535)))
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
        var_3_65A : int
        var_5_7D : int
        var_6_84 : int
        var_7_93 : double
        var_9_B9 : double
        var_3_CA : int
        var_11_DB : int
        var_14_105 : double
        var_16_109 : int
        var_12_101 : double
        var_17_665 : int
        
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
        var_3_65A = and:int(ldc:int(891252022), ldc:int(1068175332))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8350\u8bb0\ucef1\u3bd6\u47c2<E>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0167)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_65A = and:int(var_3_65A:int, ldc:int(1954500223))
            var_5_7D = and:int(ldc:int(17170), ldc:int(-17171))
            var_6_84 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_93 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-8676), ldc:int(8675)))
            invokestatic:int(m::a)
            
            loop {
                var_9_B9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_CA = and:int(var_3_65A:int, ldc:int(1967091684))
                    var_9_B9 = sub:double(var_7_93:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_DB = var_5_7D:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_DB:int, sub:int(var_6_84:int, xor:int(ldc:int(1032), ldc:int(1033)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_DB:int, and:int(ldc:int(6243), ldc:int(21)))), var_7_93:double))) {
                        inc:int(var_11_DB, ldc:int(1))
                    }
                    
                    var_3_65A = and:int(var_3_CA:int, ldc:int(-152347146))
                    var_14_105 = var_7_93:double
                    var_16_109 = var_11_DB:int
                }
                else {
                    var_11_DB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_7D:int), and:int(ldc:int(25), ldc:int(22629)))
                    var_12_101 = var_14_105 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D)
                    
                    if (cmplt:boolean(var_16_109 = var_11_DB:int, var_6_84:int)) {
                        var_9_B9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_DB:int)
                        var_16_109 = var_11_DB:int
                        var_14_105 = var_12_101:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(117040305))
                        goto(Label_1500)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1983797546))
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-694622503))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(983547393))
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1577585536))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-3416714))
                        
                        if (cmplt:boolean(var_16_109:int, var_6_84:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0549)
                            }
                            
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0389:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1500)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1051417617))
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1175145080))
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1434080676))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-488011704))
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1427081262))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1166037452))
                        var_11_DB = and:int(ldc:int(-10687), ldc:int(10678))
                        goto(Label_1489)
                    }
                    
                    Label_0549:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(984148813))
                        goto(Label_1500)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-347942250))
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-445474513))
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-629149112))
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-598734974))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1790484345))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(2129358773))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_105 = var_9_B9:double
                            goto(Label_0829)
                        }
                    }
                    
                    Label_0683:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1500)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-544968003))
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1438060951))
                        goto(Label_0940)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(107858134))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(64)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-938834196))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(11357254))
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(427539957))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(987700287))
                        var_14_105 = mul:double(ldc:double(0.5), add:double(var_9_B9:double, var_14_105:double))
                    }
                    
                    Label_0829:
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1500)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1215057055))
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-963588374))
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(295930083))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1123045714))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_7D:int), var_7_93:double)) {
                                var_11_DB = xor:int(ldc:int(1152), ldc:int(1153))
                                goto(Label_1094)
                            }
                        }
                    }
                    
                    Label_0940:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1500)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-75920944))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1650777652))
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(8)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(651767094))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1884045900))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1079271898))
                        var_11_DB = and:int(ldc:int(-20398), ldc:int(4009))
                    }
                    
                    Label_1094:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1500)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-12091004))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1111686354))
                            goto(Label_0940)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0829)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0683)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0549)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(289303186))
                            goto(Label_0389)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1024)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-240145027))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                                goto(Label_1341)
                            }
                        }
                    }
                    
                    Label_1205:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-926927035))
                        goto(Label_1500)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1115751198))
                            goto(Label_1094)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0940)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0829)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(395104025))
                            goto(Label_0683)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(-1909845414))
                            goto(Label_0549)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0389)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_65A = and:int(var_3_65A:int, ldc:int(1359922318))
                            loopcontinue()
                        }
                        
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-60089218))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_105:double, var_5_7D:int, var_16_109:int)
                        goto(Label_1489)
                    }
                    
                    Label_1341:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-896571899))
                        goto(Label_1500)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1290191808))
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1729005573))
                        goto(Label_0829)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-763698711))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(4)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1742591363))
                        goto(Label_0389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(2122477506))
                        loopcontinue()
                    }
                    
                    var_3_65A = and:int(var_3_65A:int, ldc:int(1985981861))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_105:double, ldc:double(0.0))
                    Label_1489:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_665 = var_5_7D:int
                        
                        if (cmpeq:boolean(var_11_DB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1500:
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1341)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1205)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1312521976))
                        goto(Label_1094)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(1719848815))
                        goto(Label_0940)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(2076826025))
                        goto(Label_0829)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0683)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1122012564))
                        goto(Label_0549)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(2043407406))
                        goto(Label_0389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65A:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65A = and:int(var_3_65A:int, ldc:int(-1126208284))
                        var_17_665 = add:int(var_16_109:int, xor:int(ldc:int(-32764), ldc:int(-32763)))
                        looporswitchbreak()
                    }
                    
                    var_3_65A = and:int(var_3_65A:int, ldc:int(69711828))
                }
                
                var_3_65A = and:int(var_3_65A:int, ldc:int(-77615554))
                
                if (cmple:boolean(var_5_7D = var_17_665:int, sub:int(var_6_84:int, xor:int(ldc:int(8482), ldc:int(8483))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0167:
        
        if (cmpne:boolean(and:int(var_3_65A:int, ldc:int(65536)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
