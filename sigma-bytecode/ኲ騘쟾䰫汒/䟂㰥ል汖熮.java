public class \u12b2\u9a18\uc7fe\u4c2b\u6c52.\u47c2\u3c25\u120d\u6c56\u71ae<E> {
    public void \u47c2\u3c25\u120d\u6c56\u71ae(java.util.function.Predicate<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc> p0) {
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
            invokespecial:\u67e9\u7330\u62da\u3c25\u624e(\u67e9\u7330\u62da\u3c25\u624e::<init>, this:\u47c2\u3c25\u120d\u6c56\u71ae<E>, invokestatic:ImmutableMap[expected:Map](ImmutableMap::of, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u9a18\ubf56\u9033\u759a\u4bc8\u6cfe), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u59ec\u7330\ucb79\u40a9\u6bb9\uff55), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<Long>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u64ab\u4d85\ufcaf\u8bb0\u946b\u2dcc), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u52d3\uf94d\u7006\uc910\uf995\u6b0d)))
            putfield:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>(\u47c2\u3c25\u120d\u6c56\u71ae::\u3c25\u1833\u6bb9\u5140\u7049\u3e75, this:\u47c2\u3c25\u120d\u6c56\u71ae<E>, p0:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u47c2\u3c25\u120d\u6c56\u71ae() {
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
    
    public void \u7873\uc7fe\u99f7\ubb2b\u1833\ua562(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, E extends \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p1, long p2) {
        var_5_154 : int
        
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
            var_5_154 = and:int(ldc:int(-223964418), ldc:int(1482990559))
            
            if (logicalnot:boolean(invokestatic:boolean(\u47c2\u3c25\u120d\u6c56\u71ae<E>::\ud523\u6ec6\uceb8\u3bd6\u4c2b\uc31c, p1:E extends \u4f4a\uafe7\u76bc\u392e\ub8be))) {
                loop {
                    if (cmpne:boolean(and:int(var_5_154:int, ldc:int(4194304)), ldc:int(0))) {
                        var_5_154 = and:int(var_5_154:int, ldc:int(163873498))
                        goto(Label_0281)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_154:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_5_154:int, ldc:int(268435456)), ldc:int(0))) {
                        var_5_154 = and:int(var_5_154:int, ldc:int(614499956))
                    }
                    else {
                        var_5_154 = and:int(var_5_154:int, ldc:int(1507659470))
                        
                        if (invokespecial:boolean(\u47c2\u3c25\u120d\u6c56\u71ae<E>::\ucef1\u12cb\u9255\u92ff\u64f2\uc7fe, this:\u47c2\u3c25\u120d\u6c56\u71ae<E>, p1:E extends \u4f4a\uafe7\u76bc\u392e\ub8be)) {
                            invokespecial:void(\u47c2\u3c25\u120d\u6c56\u71ae<E>::\uf9c5\ud171\u600f\u92ff\uf995\u3e75, this:\u47c2\u3c25\u120d\u6c56\u71ae<E>, p1:E extends \u4f4a\uafe7\u76bc\u392e\ub8be)
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0165:
                    
                    if (cmpeq:boolean(and:int(var_5_154:int, ldc:int(64)), ldc:int(0))) {
                        var_5_154 = and:int(var_5_154:int, ldc:int(2040078186))
                        goto(Label_0281)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_154:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_5_154:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_5_154 = and:int(var_5_154:int, ldc:int(-1084397874))
                        
                        if (invokespecial:boolean(\u47c2\u3c25\u120d\u6c56\u71ae<E>::\u8258\u516c\u8350\u56bd\u4975\u927d, this:\u47c2\u3c25\u120d\u6c56\u71ae<E>, p1:E extends \u4f4a\uafe7\u76bc\u392e\ub8be)) {
                            invokespecial:void(\u47c2\u3c25\u120d\u6c56\u71ae<E>::\uf9c5\ud171\u600f\u92ff\uf995\u3e75, this:\u47c2\u3c25\u120d\u6c56\u71ae<E>, p1:E extends \u4f4a\uafe7\u76bc\u392e\ub8be)
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0214:
                    
                    if (cmpeq:boolean(and:int(var_5_154:int, ldc:int(262144)), ldc:int(0))) {
                        var_5_154 = and:int(var_5_154:int, ldc:int(20351131))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_5_154:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_5_154 = and:int(var_5_154:int, ldc:int(-229968568))
                            goto(Label_0165)
                        }
                        
                        if (cmpeq:boolean(and:int(var_5_154:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_5_154 = and:int(var_5_154:int, ldc:int(1563759583))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Predicate<\ube23\u67d0\u64f2\u839e\u76bc>::test, getstatic:Predicate<\u7d52\u718f\u3776\u6fb0\ub83f>(\u7006\u927d\u3e75\u3dd3\u7af6\u98a4::\u416d\u4f52\u74b1\u3d64\u3dd3\ufcaf), invokespecial:\ube23\u67d0\u64f2\u839e\u76bc(\u47c2\u3c25\u120d\u6c56\u71ae<E>::\u71ae\u8aa5\u93a2\ub19c\ubb2b\u4f52, this:\u47c2\u3c25\u120d\u6c56\u71ae<E>, p1:E extends \u4f4a\uafe7\u76bc\u392e\ub8be)))) {
                            invokespecial:void(\u47c2\u3c25\u120d\u6c56\u71ae<E>::\uf9c5\ud171\u600f\u92ff\uf995\u3e75, this:\u47c2\u3c25\u120d\u6c56\u71ae<E>, p1:E extends \u4f4a\uafe7\u76bc\u392e\ub8be)
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0281:
                    
                    if (cmpeq:boolean(and:int(var_5_154:int, ldc:int(268435456)), ldc:int(0))) {
                        var_5_154 = and:int(var_5_154:int, ldc:int(1133875234))
                        goto(Label_0214)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_154:int, ldc:int(524288)), ldc:int(0))) {
                        var_5_154 = and:int(var_5_154:int, ldc:int(134923568))
                        goto(Label_0165)
                    }
                    
                    if (cmpne:boolean(and:int(var_5_154:int, ldc:int(16384)), ldc:int(0))) {
                        var_5_154 = and:int(var_5_154:int, ldc:int(-1863751027))
                    }
                    else {
                        var_5_154 = and:int(var_5_154:int, ldc:int(2136363999))
                        
                        if (logicalnot:boolean(invokeinterface:boolean(Predicate<\ube23\u67d0\u64f2\u839e\u76bc>::test, getfield:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>(\u47c2\u3c25\u120d\u6c56\u71ae::\u3c25\u1833\u6bb9\u5140\u7049\u3e75, this:\u47c2\u3c25\u120d\u6c56\u71ae<E>), invokespecial:\ube23\u67d0\u64f2\u839e\u76bc(\u47c2\u3c25\u120d\u6c56\u71ae<E>::\u71ae\u8aa5\u93a2\ub19c\ubb2b\u4f52, this:\u47c2\u3c25\u120d\u6c56\u71ae<E>, p1:E extends \u4f4a\uafe7\u76bc\u392e\ub8be)))) {
                            looporswitchbreak()
                        }
                        
                        invokespecial:void(\u47c2\u3c25\u120d\u6c56\u71ae<E>::\uf9c5\ud171\u600f\u92ff\uf995\u3e75, this:\u47c2\u3c25\u120d\u6c56\u71ae<E>, p1:E extends \u4f4a\uafe7\u76bc\u392e\ub8be)
                        looporswitchbreak()
                    }
                }
            }
            else {
                invokespecial:void(\u47c2\u3c25\u120d\u6c56\u71ae<E>::\uf9c5\ud171\u600f\u92ff\uf995\u3e75, this:\u47c2\u3c25\u120d\u6c56\u71ae<E>, p1:E extends \u4f4a\uafe7\u76bc\u392e\ub8be)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \u8258\u516c\u8350\u56bd\u4975\u927d(E extends \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p0) {
        var_2_5F : int
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
            var_2_5F = and:int(ldc:int(-1674769015), ldc:int(71208411))
            
            if (cmpeq:boolean(getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ube23\u67d0\u64f2\u839e\u76bc::\u12cb\ubf56\u647c\u7330\u446c\u836c, invokespecial:\ube23\u67d0\u64f2\u839e\u76bc(\u47c2\u3c25\u120d\u6c56\u71ae<E>::\u71ae\u8aa5\u93a2\ub19c\ubb2b\u4f52, this:\u47c2\u3c25\u120d\u6c56\u71ae<E>, p0:E extends \u4f4a\uafe7\u76bc\u392e\ub8be)), getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\u4f4a\uafe7\u76bc\u392e\ub8be::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:E extends \u4f4a\uafe7\u76bc\u392e\ub8be[expected:\u4f4a\uafe7\u76bc\u392e\ub8be]))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(2129432271))
                stack_8E_0 = and:int(ldc:int(-460), ldc:int(459))
            }
            else {
                stack_8E_0 = and:int(ldc:int(49), ldc:int(2061))
            }
            
            return:boolean(stack_8E_0:int)
        }
        
        goto(Label_0006)
    }
    
    private \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc \u71ae\u8aa5\u93a2\ub19c\ubb2b\u4f52(E extends \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p0) {
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
            return:\ube23\u67d0\u64f2\u839e\u76bc(checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, invokevirtual:\ube23\u67d0\u64f2\u839e\u76bc(Optional<\ube23\u67d0\u64f2\u839e\u76bc>::get, invokevirtual:Optional<\ube23\u67d0\u64f2\u839e\u76bc>(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u836c\u8753\ub102\u9a18\uc910\u6fb0, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:E extends \u4f4a\uafe7\u76bc\u392e\ub8be[expected:\ube23\u67d0\u64f2\u839e\u76bc]), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u9a18\ubf56\u9033\u759a\u4bc8\u6cfe)))))
        }
        
        goto(Label_0006)
    }
    
    private static boolean \ud523\u6ec6\uceb8\u3bd6\u4c2b\uc31c(E extends \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
        var_1_5F : int
        var_3_6A : Optional<Long>
        stack_B1_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(542993677), ldc:int(-161516054))
            var_3_6A = invokevirtual:Optional<Long>(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u836c\u8753\ub102\u9a18\uc910\u6fb0, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:E extends \ube23\u67d0\u64f2\u839e\u76bc[expected:\ube23\u67d0\u64f2\u839e\u76bc]), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<Long>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u64ab\u4d85\ufcaf\u8bb0\u946b\u2dcc))
            
            if (logicaland:boolean(invokevirtual:boolean(Optional::isPresent, var_3_6A:Optional), cmpgt:boolean(sub:long(invokevirtual:long(\uf9c5\ud158\u4975\uf94d\ud523\uc31c::\u56bd\u8258\u8d98\u120d\uff55\uc229, getfield:\uf9c5\ud158\u4975\uf94d\ud523\uc31c(\ube23\u67d0\u64f2\u839e\u76bc::\u12cb\ubf56\u647c\u7330\u446c\u836c, p0:E extends \ube23\u67d0\u64f2\u839e\u76bc[expected:\ube23\u67d0\u64f2\u839e\u76bc])), invokevirtual:long(Long::longValue, checkcast:Long(java.lang.Long.class, invokevirtual:Long(Optional<Long>::get, var_3_6A:Optional<Long>)))), ldc:long(200L)))) {
                stack_B1_0 = and:int(ldc:int(16517), ldc:int(2313))
            }
            else {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1270728014))
                stack_B1_0 = and:int(ldc:int(-31669), ldc:int(14868))
            }
            
            return:boolean(stack_B1_0:int)
        }
        
        goto(Label_0006)
    }
    
    private boolean \ucef1\u12cb\u9255\u92ff\u64f2\uc7fe(E extends \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p0) {
        var_2_5F : int
        var_4_6A : Optional<\ube23\u67d0\u64f2\u839e\u76bc>
        stack_A8_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(896646035), ldc:int(-176689187))
            var_4_6A = invokevirtual:Optional<\ube23\u67d0\u64f2\u839e\u76bc>(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u836c\u8753\ub102\u9a18\uc910\u6fb0, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:E extends \u4f4a\uafe7\u76bc\u392e\ub8be[expected:\ube23\u67d0\u64f2\u839e\u76bc]), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u9a18\ubf56\u9033\u759a\u4bc8\u6cfe))
            
            if (logicaland:boolean(invokevirtual:boolean(Optional::isPresent, var_4_6A:Optional), logicalnot:boolean(invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, invokevirtual:\ube23\u67d0\u64f2\u839e\u76bc(Optional<\ube23\u67d0\u64f2\u839e\u76bc>::get, var_4_6A:Optional<\ube23\u67d0\u64f2\u839e\u76bc>)))))) {
                stack_A8_0 = and:int(ldc:int(5161), ldc:int(10881))
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1207976963))
                stack_A8_0 = and:int(ldc:int(-12375), ldc:int(4182))
            }
            
            return:boolean(stack_A8_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void \uf9c5\ud171\u600f\u92ff\uf995\u3e75(E extends \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p0) {
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
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u983f\ucfaf\ub8be\u120d\u3504\u4179, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:E extends \u4f4a\uafe7\u76bc\u392e\ub8be[expected:\ube23\u67d0\u64f2\u839e\u76bc]), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u9a18\ubf56\u9033\u759a\u4bc8\u6cfe))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7873\uc7fe\u99f7\ubb2b\u1833\ua562(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, long p2) {
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
            invokevirtual:void(\u47c2\u3c25\u120d\u6c56\u71ae<\u4f4a\uafe7\u76bc\u392e\ub8be>::\u7873\uc7fe\u99f7\ubb2b\u1833\ua562, this:\u47c2\u3c25\u120d\u6c56\u71ae<E>, p0:\ube23\uc238\u5140\u4cd9\u8aa5, checkcast:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be.class, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u4f4a\uafe7\u76bc\u392e\ub8be]), p2:long)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8350\u3bc9\u6c52\u8df4\u416d\u873d$0(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(29254), ldc:int(-29527)))
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
        var_3_69F : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C2 : double
        var_3_D4 : int
        var_11_E5 : int
        var_14_10F : double
        var_16_113 : int
        var_12_10B : double
        var_17_6AA : int
        
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
        var_3_69F = and:int(ldc:int(-1378514929), ldc:int(1808580111))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u47c2\u3c25\u120d\u6c56\u71ae<E>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
            var_3_69F = and:int(var_3_69F:int, ldc:int(-207284195))
        }
        else {
            var_3_69F = and:int(var_3_69F:int, ldc:int(938463343))
            var_5_85 = and:int(ldc:int(-8729), ldc:int(8728))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-1140), ldc:int(1107)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C2 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D4 = and:int(var_3_69F:int, ldc:int(568649805))
                    var_9_C2 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E5 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E5:int, sub:int(var_6_8C:int, xor:int(ldc:int(-24567), ldc:int(-24568)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E5:int, and:int(ldc:int(5443), ldc:int(2101)))), var_7_9B:double))) {
                        inc:int(var_11_E5, ldc:int(1))
                    }
                    
                    var_3_69F = and:int(var_3_D4:int, ldc:int(-1545172707))
                    var_14_10F = var_7_9B:double
                    var_16_113 = var_11_E5:int
                }
                else {
                    var_11_E5 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(299), ldc:int(17473)))
                    var_12_10B = var_14_10F = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_113 = var_11_E5:int, var_6_8C:int)) {
                        var_9_C2 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E5:int)
                        var_16_113 = var_11_E5:int
                        var_14_10F = var_12_10B:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1852135273))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-920137560))
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1278473374))
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1968898362))
                        goto(Label_0991)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1993586543))
                        goto(Label_0859)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1388340236))
                        goto(Label_0589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-422134624))
                    }
                    else {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1176522225))
                        
                        if (cmplt:boolean(var_16_113:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0589)
                            }
                            
                            goto(Label_0859)
                        }
                    }
                    
                    Label_0427:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-271129746))
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-632453426))
                        goto(Label_0991)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0859)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-728071014))
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-2128787528))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1976423503))
                            var_11_E5 = and:int(ldc:int(-14486), ldc:int(14469))
                            goto(Label_1546)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0589:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-276677796))
                        goto(Label_1557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-266356637))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0859)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1508337897))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(591354733))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1655107715))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1037367839))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10F = var_9_C2:double
                            goto(Label_0859)
                        }
                    }
                    
                    Label_0722:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(88886587))
                        goto(Label_1557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(50991598))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2074990424))
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0991)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1976943110))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(476877211))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(805173263))
                        var_14_10F = mul:double(ldc:double(0.5), add:double(var_9_C2:double, var_14_10F:double))
                    }
                    
                    Label_0859:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(824972156))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1525633164))
                        goto(Label_1177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-548943481))
                            goto(Label_0722)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-878643257))
                            goto(Label_0427)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(842520684))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1710019581))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E5 = and:int(ldc:int(821), ldc:int(3))
                                goto(Label_1177)
                            }
                        }
                    }
                    
                    Label_0991:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1529991609))
                        goto(Label_1557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-2069224675))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1016102536))
                            goto(Label_0859)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1477505976))
                            goto(Label_0722)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-493307161))
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(1)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(25602815))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(1593996239))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1708629117))
                        var_11_E5 = and:int(ldc:int(28878), ldc:int(-32719))
                    }
                    
                    Label_1177:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(2132504760))
                        goto(Label_1557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0991)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(945107130))
                            goto(Label_0859)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(2147483647)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1512048147))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E5:int, ldc:int(0))) {
                                goto(Label_1410)
                            }
                        }
                    }
                    
                    Label_1278:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1557)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-619195834))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_1177)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0991)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(634689897))
                            goto(Label_0859)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0589)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(32)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-1021590788))
                            goto(Label_0427)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_69F = and:int(var_3_69F:int, ldc:int(-837361928))
                            loopcontinue()
                        }
                        
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-402813395))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10F:double, var_5_85:int, var_16_113:int)
                        goto(Label_1546)
                    }
                    
                    Label_1410:
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1543062296))
                        goto(Label_1557)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1177)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(121704980))
                        goto(Label_0991)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0859)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1249598966))
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0589)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1516490517))
                        loopcontinue()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(2144187135))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10F:double, ldc:double(0.0))
                    Label_1546:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6AA = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E5:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1557:
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1159062219))
                        goto(Label_1278)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1248554158))
                        goto(Label_1177)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0991)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(49151881))
                        goto(Label_0859)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1514314688))
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(1447487525))
                        goto(Label_0589)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(-1436176852))
                        goto(Label_0427)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69F:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69F = and:int(var_3_69F:int, ldc:int(836146543))
                        var_17_6AA = add:int(var_16_113:int, and:int(ldc:int(8753), ldc:int(17409)))
                        looporswitchbreak()
                    }
                    
                    var_3_69F = and:int(var_3_69F:int, ldc:int(-757211090))
                }
                
                var_3_69F = and:int(var_3_69F:int, ldc:int(2112159277))
                
                if (cmple:boolean(var_5_85 = var_17_6AA:int, sub:int(var_6_8C:int, and:int(ldc:int(7083), ldc:int(9221))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_69F:int, ldc:int(4)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
