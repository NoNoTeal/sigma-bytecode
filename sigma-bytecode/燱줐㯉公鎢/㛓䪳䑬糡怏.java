public class \u71f1\uc910\u3bc9\u516c\u93a2.\u36d3\u4ab3\u446c\u7ce1\u600f<E> {
    public void \u36d3\u4ab3\u446c\u7ce1\u600f(java.util.function.Predicate<E> p0, java.util.function.Function<E, java.util.Optional<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc>> p1) {
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
            invokespecial:\u67e9\u7330\u62da\u3c25\u624e(\u67e9\u7330\u62da\u3c25\u624e::<init>, this:\u36d3\u4ab3\u446c\u7ce1\u600f<E>, invokestatic:ImmutableMap[expected:Map](ImmutableMap::of, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u9a18\ubf56\u9033\u759a\u4bc8\u6cfe), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u51fa\ud7e8\u4179\u64f2\u5bc4\u61a4), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<Long>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u64ab\u4d85\ufcaf\u8bb0\u946b\u2dcc), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u52d3\uf94d\u7006\uc910\uf995\u6b0d)))
            putfield:Predicate<E>(\u36d3\u4ab3\u446c\u7ce1\u600f::\u3d64\u5140\u6fb0\u8308\u3bc9\u494c, this:\u36d3\u4ab3\u446c\u7ce1\u600f<E>, p0:Predicate<E>)
            putfield:Function<E, Optional<? extends \ube23\u67d0\u64f2\u839e\u76bc>>(\u36d3\u4ab3\u446c\u7ce1\u600f::\uc246\u8c8a\u9033\u6435\u62da\ufcaf, this:\u36d3\u4ab3\u446c\u7ce1\u600f<E>, p1:Function<E, Optional<? extends \ube23\u67d0\u64f2\u839e\u76bc>>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u36d3\u4ab3\u446c\u7ce1\u600f(java.util.function.Function<E, java.util.Optional<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc>> p0) {
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
    
    public boolean \u4ab3\uafe7\u8709\ub171\ubefe\u759a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, E extends \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p1) {
        var_3_5F : int
        var_3_71 : int
        var_5_7F : Optional<? extends \ube23\u67d0\u64f2\u839e\u76bc>
        stack_CC_0 : int [generated]
        
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
        var_3_5F = and:int(ldc:int(-1623531083), ldc:int(-675286082))
        
        if (invokeinterface:boolean(Predicate<E>::test, getfield:Predicate<E>(\u36d3\u4ab3\u446c\u7ce1\u600f::\u3d64\u5140\u6fb0\u8308\u3bc9\u494c, this:\u36d3\u4ab3\u446c\u7ce1\u600f<E>), p1:E extends \u4f4a\uafe7\u76bc\u392e\ub8be)) {
            var_3_71 = and:int(var_3_5F:int, ldc:int(-147200743))
            var_5_7F = checkcast:Optional<? extends \ube23\u67d0\u64f2\u839e\u76bc>(java.util.Optional<? extends \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc>.class, invokeinterface:Optional<? extends \ube23\u67d0\u64f2\u839e\u76bc>(Function<E, Optional<? extends \ube23\u67d0\u64f2\u839e\u76bc>>::apply, getfield:Function<E, Optional<? extends \ube23\u67d0\u64f2\u839e\u76bc>>(\u36d3\u4ab3\u446c\u7ce1\u600f::\uc246\u8c8a\u9033\u6435\u62da\ufcaf, this:\u36d3\u4ab3\u446c\u7ce1\u600f<E>), p1:E extends \u4f4a\uafe7\u76bc\u392e\ub8be))
            
            if (logicaland:boolean(invokevirtual:boolean(Optional<T>::isPresent, var_5_7F:Optional<? extends \ube23\u67d0\u64f2\u839e\u76bc>), invokevirtual:boolean(\ube23\u67d0\u64f2\u839e\u76bc::\u6b0d\u5bc4\u3504\u40a9\u7043\u98a4, checkcast:\ube23\u67d0\u64f2\u839e\u76bc(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc.class, invokevirtual:? extends \ube23\u67d0\u64f2\u839e\u76bc(Optional<? extends \ube23\u67d0\u64f2\u839e\u76bc>::get, var_5_7F:Optional<? extends \ube23\u67d0\u64f2\u839e\u76bc>))))) {
                stack_CC_0 = and:int(ldc:int(24617), ldc:int(2759))
            }
            else {
                var_3_71 = and:int(var_3_71:int, ldc:int(-440877768))
                stack_CC_0 = and:int(ldc:int(22056), ldc:int(-22057))
            }
            
            return:boolean(stack_CC_0:int)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(-3763), ldc:int(3762)))
    }
    
    public void \u7873\uc7fe\u99f7\ubb2b\u1833\ua562(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, E extends \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p1, long p2) {
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
    
    private void \u7873\u6c56\u8350\u0800\u4d85\ub102(E extends \u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\ud36e\uc7fe\u7043\u965f\u92ee\u98a4, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:E extends \u4f4a\uafe7\u76bc\u392e\ub8be[expected:\ube23\u67d0\u64f2\u839e\u76bc]), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\ube23\u67d0\u64f2\u839e\u76bc>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u9a18\ubf56\u9033\u759a\u4bc8\u6cfe), p1:\ube23\u67d0\u64f2\u839e\u76bc)
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u983f\ucfaf\ub8be\u120d\u3504\u4179, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:E extends \u4f4a\uafe7\u76bc\u392e\ub8be[expected:\ube23\u67d0\u64f2\u839e\u76bc]), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<Long>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u64ab\u4d85\ufcaf\u8bb0\u946b\u2dcc))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u4ab3\uafe7\u8709\ub171\ubefe\u759a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
            return:boolean(invokevirtual:boolean(\u36d3\u4ab3\u446c\u7ce1\u600f<\u4f4a\uafe7\u76bc\u392e\ub8be>::\u4ab3\uafe7\u8709\ub171\ubefe\u759a, this:\u36d3\u4ab3\u446c\u7ce1\u600f<E>, p0:\ube23\uc238\u5140\u4cd9\u8aa5, checkcast:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be.class, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u4f4a\uafe7\u76bc\u392e\ub8be])))
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
            invokevirtual:void(\u36d3\u4ab3\u446c\u7ce1\u600f<\u4f4a\uafe7\u76bc\u392e\ub8be>::\u7873\uc7fe\u99f7\ubb2b\u1833\ua562, this:\u36d3\u4ab3\u446c\u7ce1\u600f<E>, p0:\ube23\uc238\u5140\u4cd9\u8aa5, checkcast:\u4f4a\uafe7\u76bc\u392e\ub8be(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be.class, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u4f4a\uafe7\u76bc\u392e\ub8be]), p2:long)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void lambda$\uceb8\u12cb\u9937\u759a\u7049\ub113$1(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
            invokespecial:void(\u36d3\u4ab3\u446c\u7ce1\u600f<\u4f4a\uafe7\u76bc\u392e\ub8be>::\u7873\u6c56\u8350\u0800\u4d85\ub102, this:\u36d3\u4ab3\u446c\u7ce1\u600f<E>, p0:\u4f4a\uafe7\u76bc\u392e\ub8be, p1:\ube23\u67d0\u64f2\u839e\u76bc)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u71ae\u8413\u4f52\uff55\uc3e3\u3dd3$0(\u3bd6\u6b0d\ubff1\u8aa5\u4f4a.\u4f4a\uafe7\u76bc\u392e\ub8be p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(5139), ldc:int(16489)))
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
        var_3_66E : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_679 : int
        
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
        var_3_66E = and:int(ldc:int(1895105601), ldc:int(-571144635))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u36d3\u4ab3\u446c\u7ce1\u600f<E>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
            var_3_66E = and:int(var_3_66E:int, ldc:int(283830867))
        }
        else {
            var_3_66E = and:int(var_3_66E:int, ldc:int(1609650391))
            var_5_85 = and:int(ldc:int(3922), ldc:int(-24532))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-8744), ldc:int(8742)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_66E:int, ldc:int(-51041295))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(10285), ldc:int(20481)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, xor:int(ldc:int(12288), ldc:int(12289)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_66E = and:int(var_3_D2:int, ldc:int(1996192281))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), and:int(ldc:int(4105), ldc:int(897)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-593863335))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(498424070))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-22467098))
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1930020987))
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1883243080))
                        goto(Label_0835)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0696)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-596541611))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0572)
                            }
                            
                            goto(Label_0835)
                        }
                    }
                    
                    Label_0408:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1877891348))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(585801665))
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1173530745))
                        goto(Label_0835)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2048)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1220387570))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-788553067))
                        var_11_E3 = and:int(ldc:int(-24085), ldc:int(22036))
                        goto(Label_1508)
                    }
                    
                    Label_0572:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(759685074))
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(807258733))
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(2069489210))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1385168554))
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1542918987))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0835)
                        }
                    }
                    
                    Label_0696:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1097949710))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-188135697))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-2054858044))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1209339289))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1097137732))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1584613805))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0835:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1856397472))
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(2065992500))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-962829415))
                            goto(Label_0696)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1451078545))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = xor:int(ldc:int(904), ldc:int(905))
                                goto(Label_1117)
                            }
                        }
                    }
                    
                    Label_0949:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1750999569))
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1975938039))
                        goto(Label_1363)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_1238)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1479596014))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0835)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0696)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-744418201))
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1992543492))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-746912017))
                        var_11_E3 = and:int(ldc:int(-12462), ldc:int(12429))
                    }
                    
                    Label_1117:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1595296253))
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-2085095114))
                            goto(Label_0949)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(243463118))
                            goto(Label_0835)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1906642454))
                            goto(Label_0696)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-721873467))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1363)
                            }
                        }
                    }
                    
                    Label_1238:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_1117)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0949)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(-1143794098))
                            goto(Label_0835)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1186866930))
                            goto(Label_0696)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0572)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0408)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_66E = and:int(var_3_66E:int, ldc:int(1417923025))
                            loopcontinue()
                        }
                        
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1358027729))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                        goto(Label_1508)
                    }
                    
                    Label_1363:
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(742783729))
                        goto(Label_1519)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(202745164))
                        goto(Label_1238)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-1897489981))
                        goto(Label_0949)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(168162911))
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0696)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-306426469))
                        goto(Label_0572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(2048)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_66E = and:int(var_3_66E:int, ldc:int(-578835033))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1508:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_679 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1519:
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1363)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1435003110))
                        goto(Label_1238)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_1117)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1561384860))
                        goto(Label_0949)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-767898613))
                        goto(Label_0835)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(1)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(285070155))
                        goto(Label_0696)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0572)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(-402193879))
                        goto(Label_0408)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_66E:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_66E = and:int(var_3_66E:int, ldc:int(1501386233))
                        var_17_679 = add:int(var_16_111:int, and:int(ldc:int(17169), ldc:int(5321)))
                        looporswitchbreak()
                    }
                    
                    var_3_66E = and:int(var_3_66E:int, ldc:int(-124330742))
                }
                
                var_3_66E = and:int(var_3_66E:int, ldc:int(1409093101))
                
                if (cmple:boolean(var_5_85 = var_17_679:int, sub:int(var_6_8C:int, and:int(ldc:int(16897), ldc:int(1097))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_66E:int, ldc:int(2)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
