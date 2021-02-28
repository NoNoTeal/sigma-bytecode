public class \u12b2\u4e72\u8df4\u67e9\u67e9.\u4e72\ubcb0\u6d99\u8aa5\uc2e8 {
    public void \u4e72\ubcb0\u6d99\u8aa5\uc2e8(\u6b0d\u12cb\u156b\u4179\u8bb0.\u4975\ubff1\u965f\u416d\ua068 p0) {
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
            invokespecial:\u67e9\u7330\u62da\u3c25\u624e(\u67e9\u7330\u62da\u3c25\u624e::<init>, this:\u4e72\ubcb0\u6d99\u8aa5\uc2e8, invokestatic:ImmutableMap[expected:Map](ImmutableMap::of, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ubefe\u071d\u7c6b\u7e3f\u3711\u3e2a), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u59ec\u7330\ucb79\u40a9\u6bb9\uff55), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<List<\ube23\u67d0\u64f2\u839e\u76bc>>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u8d98\u8258\ub70c\uc238\u12b2\u6c52), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u59ec\u7330\ucb79\u40a9\u6bb9\uff55)))
            putfield:\u4975\ubff1\u965f\u416d\ua068(\u4e72\ubcb0\u6d99\u8aa5\uc2e8::\uc9f6\u51b2\u3a62\u7006\ua61f\u88c5, this:\u4e72\ubcb0\u6d99\u8aa5\uc2e8, p0:\u4975\ubff1\u965f\u416d\ua068)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7873\uc7fe\u99f7\ubb2b\u1833\ua562(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p1, long p2) {
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
    
    private static \ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb \u3d4b\u6bb9\u8308\uc910\ub171\u6c52(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p0, \ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p1) {
        var_2_5F : int
        var_4_71 : \u8d90\u927d\u7d52\uf94d\u12cb
        var_5_74 : \u8d90\u927d\u7d52\uf94d\u12cb
        
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
            var_2_5F = and:int(ldc:int(-1775604755), ldc:int(-214969458))
            
            if (cmple:boolean(invokevirtual:int(\u8d90\u927d\u7d52\uf94d\u12cb::\u6435\u5fe1\u8bb0\ub18d\u839e\u9937, p0:\u8d90\u927d\u7d52\uf94d\u12cb), invokevirtual:int(\u8d90\u927d\u7d52\uf94d\u12cb::\u6435\u5fe1\u8bb0\ub18d\u839e\u9937, p1:\u8d90\u927d\u7d52\uf94d\u12cb))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(698528732))
                var_4_71 = p1:\u8d90\u927d\u7d52\uf94d\u12cb
                var_5_74 = p0:\u8d90\u927d\u7d52\uf94d\u12cb
            }
            else {
                var_4_71 = p0:\u8d90\u927d\u7d52\uf94d\u12cb
                var_5_74 = p1:\u8d90\u927d\u7d52\uf94d\u12cb
            }
            
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<\u8d90\u927d\u7d52\uf94d\u12cb>::\u983f\ucfaf\ub8be\u120d\u3504\u4179, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<\u8d90\u927d\u7d52\uf94d\u12cb>(\u8d90\u927d\u7d52\uf94d\u12cb::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, var_5_74:\u8d90\u927d\u7d52\uf94d\u12cb), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ubefe\u071d\u7c6b\u7e3f\u3711\u3e2a))
            return:\u8d90\u927d\u7d52\uf94d\u12cb(var_4_71:\u8d90\u927d\u7d52\uf94d\u12cb)
        }
        
        goto(Label_0006)
    }
    
    private boolean \u71ae\u93a2\u6fb0\uafe7\ud158\ub83f(\ub113\uc4d2\u183a\u527a\u6435.\u8709\u8bb0\u718f\u416d\u6b0d\u92ee p0, \ub113\uc4d2\u183a\u527a\u6435.\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0 p1, \ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p2) {
        var_4_61 : int
        stack_BF_0 : int [generated]
        
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
            var_4_61 = and:int(ldc:int(1089970459), ldc:int(-983125735))
            
            if (invokespecial:boolean(\u4e72\ubcb0\u6d99\u8aa5\uc2e8::\u4bc8\u4e72\u8709\u1187\uc2e8\u3e2a, this:\u4e72\ubcb0\u6d99\u8aa5\uc2e8, p2:\u8d90\u927d\u7d52\uf94d\u12cb)) {
                if (invokevirtual:boolean(\u8709\u8bb0\u718f\u416d\u6b0d\u92ee::equals, p0:\u8709\u8bb0\u718f\u416d\u6b0d\u92ee, invokevirtual:\u8709\u8bb0\u718f\u416d\u6b0d\u92ee[expected:Object](Optional<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>::get, invokevirtual:Optional<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>(\ub32d\u92ff\uc2bd\ud36e\ud36e<\u8d90\u927d\u7d52\uf94d\u12cb>::\u836c\u8753\ub102\u9a18\uc910\u6fb0, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<\u8d90\u927d\u7d52\uf94d\u12cb>(\u8d90\u927d\u7d52\uf94d\u12cb::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p2:\u8d90\u927d\u7d52\uf94d\u12cb), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ubefe\u071d\u7c6b\u7e3f\u3711\u3e2a))))) {
                    if (invokespecial:boolean(\u4e72\ubcb0\u6d99\u8aa5\uc2e8::\u5fe1\ua61f\u93a2\uae5d\u34df\u7d52, this:\u4e72\ubcb0\u6d99\u8aa5\uc2e8, p1:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0, invokevirtual:\u4975\ubff1\u965f\u416d\ua068(\u12cb\u516c\u8cae\u8350\u4492::\u527a\ub7dc\u4e72\u56bd\u8389\u67e9, invokevirtual:\u12cb\u516c\u8cae\u8350\u4492(\u8d90\u927d\u7d52\uf94d\u12cb::\u8389\u494c\u3dd3\uc910\u6bb9\u99f7, p2:\u8d90\u927d\u7d52\uf94d\u12cb)))) {
                        stack_BF_0 = and:int[expected:boolean](ldc:int(14469), ldc:int(273))
                        return:boolean(stack_BF_0:boolean)
                    }
                }
            }
            
            var_4_61 = and:int(var_4_61:int, ldc:int(-1966169651))
            stack_BF_0 = and:int[expected:boolean](ldc:int(-19554), ldc:int(19521))
            return:boolean(stack_BF_0:boolean[expected:int])
        }
        
        goto(Label_0006)
    }
    
    private boolean \u5fe1\ua61f\u93a2\uae5d\u34df\u7d52(\ub113\uc4d2\u183a\u527a\u6435.\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0 p0, \u6b0d\u12cb\u156b\u4179\u8bb0.\u4975\ubff1\u965f\u416d\ua068 p1) {
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
            return:boolean(invokeinterface:boolean(Predicate<\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0>::test, invokevirtual:Predicate<\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0>(\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0::\u6bb9\u7af6\u6435\u6bb9\u8cae\ub113, invokevirtual:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0(\u4975\ubff1\u965f\u416d\ua068::\u965f\u71ae\u7ce1\u8aa5\u71f1\u12b2, p1:\u4975\ubff1\u965f\u416d\ua068)), p0:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0))
        }
        
        goto(Label_0006)
    }
    
    private boolean \u4bc8\u4e72\u8709\u1187\uc2e8\u3e2a(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p0) {
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
            return:boolean(invokevirtual:boolean(Optional<T>::isPresent, invokevirtual:Optional<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>(\ub32d\u92ff\uc2bd\ud36e\ud36e<\u8d90\u927d\u7d52\uf94d\u12cb>::\u836c\u8753\ub102\u9a18\uc910\u6fb0, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<\u8d90\u927d\u7d52\uf94d\u12cb>(\u8d90\u927d\u7d52\uf94d\u12cb::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:\u8d90\u927d\u7d52\uf94d\u12cb), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u8709\u8bb0\u718f\u416d\u6b0d\u92ee>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ubefe\u071d\u7c6b\u7e3f\u3711\u3e2a))))
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
            invokevirtual:void(\u4e72\ubcb0\u6d99\u8aa5\uc2e8::\u7873\uc7fe\u99f7\ubb2b\u1833\ua562, this:\u4e72\ubcb0\u6d99\u8aa5\uc2e8, p0:\ube23\uc238\u5140\u4cd9\u8aa5, checkcast:\u8d90\u927d\u7d52\uf94d\u12cb(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb.class, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u8d90\u927d\u7d52\uf94d\u12cb]), p2:long)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\u5f50\u4179\u6bb9\u8df4\u5f50\u61a4$1(\ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p0, \ub113\uc4d2\u183a\u527a\u6435.\u8709\u8bb0\u718f\u416d\u6b0d\u92ee p1, \ub113\uc4d2\u183a\u527a\u6435.\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0 p2) {
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
    
    private boolean lambda$\u64ab\u6c52\uc7fe\u527a\u8350\ud12e$0(\ub113\uc4d2\u183a\u527a\u6435.\u8709\u8bb0\u718f\u416d\u6b0d\u92ee p0, \ub113\uc4d2\u183a\u527a\u6435.\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0 p1, \ud36e\u6bb9\u960f\u4c04\u64ab.\u8d90\u927d\u7d52\uf94d\u12cb p2) {
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
            return:boolean(invokespecial:boolean(\u4e72\ubcb0\u6d99\u8aa5\uc2e8::\u71ae\u93a2\u6fb0\uafe7\ud158\ub83f, this:\u4e72\ubcb0\u6d99\u8aa5\uc2e8, p0:\u8709\u8bb0\u718f\u416d\u6b0d\u92ee, p1:\uafe7\u6d99\uf995\u92ee\u6d69\ubcb0, p2:\u8d90\u927d\u7d52\uf94d\u12cb))
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
        var_3_69D : int
        var_5_88 : int
        var_6_8F : int
        var_7_9E : double
        var_9_CF : double
        var_3_E1 : int
        var_11_F2 : int
        var_14_11C : double
        var_16_120 : int
        var_12_118 : double
        var_17_6A8 : int
        
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
        var_3_69D = and:int(ldc:int(1964667374), ldc:int(1979691519))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4e72\ubcb0\u6d99\u8aa5\uc2e8[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0178)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(131072)), ldc:int(0))) {
            var_3_69D = and:int(var_3_69D:int, ldc:int(-819384487))
        }
        else {
            var_3_69D = and:int(var_3_69D:int, ldc:int(-1086426129))
            var_5_88 = and:int(ldc:int(-5284), ldc:int(5283))
            var_6_8F = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9E = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(22746), ldc:int(-22783)))
            invokestatic:int(m::a)
            
            loop {
                var_9_CF = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E1 = and:int(var_3_69D:int, ldc:int(901460990))
                    var_9_CF = sub:double(var_7_9E:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F2 = var_5_88:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F2:int, sub:int(var_6_8F:int, xor:int(ldc:int(640), ldc:int(641)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F2:int, and:int(ldc:int(22529), ldc:int(19)))), var_7_9E:double))) {
                        inc:int(var_11_F2, ldc:int(1))
                    }
                    
                    var_3_69D = and:int(var_3_E1:int, ldc:int(924008431))
                    var_14_11C = var_7_9E:double
                    var_16_120 = var_11_F2:int
                }
                else {
                    var_11_F2 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_88:int), and:int(ldc:int(16929), ldc:int(10265)))
                    var_12_118 = var_14_11C = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88)
                    
                    if (cmplt:boolean(var_16_120 = var_11_F2:int, var_6_8F:int)) {
                        var_9_CF = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F2:int)
                        var_16_120 = var_11_F2:int
                        var_14_11C = var_12_118:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1128621769))
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1006564042))
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1287)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-424867914))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(108177190))
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1673685772))
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(592668499))
                        goto(Label_0745)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1119451462))
                        goto(Label_0593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(932380143))
                        
                        if (cmplt:boolean(var_16_120:int, var_6_8F:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0593)
                            }
                            
                            goto(Label_0877)
                        }
                    }
                    
                    Label_0445:
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1637551062))
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1261671879))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0745)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(-172820993))
                            var_11_F2 = and:int(ldc:int(28072), ldc:int(-28074))
                            goto(Label_1560)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0593:
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1882315615))
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1497972511))
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(256)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1530691505))
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-856366506))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1976901869))
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(2)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1620884452))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0445)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(8388608)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(-461598067))
                            loopcontinue()
                        }
                        
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1998567406))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11C = var_9_CF:double
                            goto(Label_0877)
                        }
                    }
                    
                    Label_0745:
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1287)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1568358283))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(760656641))
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(4)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1661423846))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0445)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(2040250801))
                            loopcontinue()
                        }
                        
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-138527745))
                        var_14_11C = mul:double(ldc:double(0.5), add:double(var_9_CF:double, var_14_11C:double))
                    }
                    
                    Label_0877:
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-727173150))
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1287)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0745)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(4)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(1706566631))
                            goto(Label_0593)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0445)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(-1971213569))
                            loopcontinue()
                        }
                        
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1118126610))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_88:int), var_7_9E:double)) {
                                var_11_F2 = xor:int(ldc:int(1300), ldc:int(1301))
                                goto(Label_1162)
                            }
                        }
                    }
                    
                    Label_0993:
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1933095919))
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(75520341))
                        goto(Label_1414)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1287)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(2)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(-702741081))
                            goto(Label_0877)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(208179))
                            goto(Label_0745)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(-1633520234))
                            goto(Label_0445)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1037514735))
                        var_11_F2 = and:int(ldc:int(18445), ldc:int(-18446))
                    }
                    
                    Label_1162:
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(503669197))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0993)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(1440172173))
                            goto(Label_0877)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(2)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(1217256923))
                            goto(Label_0745)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(390551097))
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0445)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(131072)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-168625154))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                                goto(Label_1414)
                            }
                        }
                    }
                    
                    Label_1287:
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(911407699))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(993273793))
                            goto(Label_1162)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0993)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0877)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0745)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(16)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(-221383024))
                            goto(Label_0593)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0445)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(256)), ldc:int(0))) {
                            var_3_69D = and:int(var_3_69D:int, ldc:int(-1078001666))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11C:double, var_5_88:int, var_16_120:int)
                            goto(Label_1560)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1414:
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(645277013))
                        goto(Label_1571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1287)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-146613511))
                        goto(Label_1162)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1648554459))
                        goto(Label_0993)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1417006527))
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0745)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(1861621454))
                        goto(Label_0593)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_69D = and:int(var_3_69D:int, ldc:int(-1120668689))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11C:double, ldc:double(0.0))
                    Label_1560:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6A8 = var_5_88:int
                        
                        if (cmpeq:boolean(var_11_F2:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1571:
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1414)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(669090609))
                        goto(Label_1287)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1720371202))
                        goto(Label_1162)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0993)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-1426166676))
                        goto(Label_0877)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(943408710))
                        goto(Label_0745)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0593)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0445)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_69D = and:int(var_3_69D:int, ldc:int(-38390290))
                        var_17_6A8 = add:int(var_16_120:int, and:int(ldc:int(3077), ldc:int(8321)))
                        looporswitchbreak()
                    }
                    
                    var_3_69D = and:int(var_3_69D:int, ldc:int(1108127679))
                }
                
                var_3_69D = and:int(var_3_69D:int, ldc:int(1964126702))
                
                if (cmple:boolean(var_5_88 = var_17_6A8:int, sub:int(var_6_8F:int, and:int(ldc:int(8195), ldc:int(9))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0178:
        
        if (cmpne:boolean(and:int(var_3_69D:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_69D = and:int(var_3_69D:int, ldc:int(2011864507))
            goto(Label_0106)
        }
    }
}
