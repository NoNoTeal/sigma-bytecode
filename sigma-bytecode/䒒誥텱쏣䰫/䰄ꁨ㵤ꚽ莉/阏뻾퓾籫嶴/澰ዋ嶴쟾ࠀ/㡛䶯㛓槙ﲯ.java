public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u385b\u4daf\u36d3\u69d9\ufcaf<E, T> {
    public void \u385b\u4daf\u36d3\u69d9\ufcaf(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c<? extends T> p0, int p1, java.util.function.Predicate<E> p2, java.util.function.Predicate<T> p3, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\ud36e\u4bc8\u6d69\u92ee\ubb2b<T> p4, float p5, int p6) {
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
            invokespecial:\u67e9\u7330\u62da\u3c25\u624e(\u67e9\u7330\u62da\u3c25\u624e::<init>, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>, invokestatic:ImmutableMap[expected:Map](ImmutableMap::of, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u7ce1\u6b5f\u071d\u873d\ubf56\u74b1>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ua3b4\u4daf\u98a4\u527a\uc4d2\u36d3), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u52d3\uf94d\u7006\uc910\uf995\u6b0d), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\uc87f\ubcb0\uafe7\u64f2\u74b1>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\uceb8\u51b2\ud523\ud523\u3a62\u3c25), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u51fa\ud7e8\u4179\u64f2\u5bc4\u61a4), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<List<\ube23\u67d0\u64f2\u839e\u76bc>>[expected:Object](\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u759a\ub7dc\u4ab3\u8753\ufe34\u56bd), getstatic:\u4ab3\u9a18\ub83f\u3bd6\u6ec6[expected:Object](\u4ab3\u9a18\ub83f\u3bd6\u6ec6::\u59ec\u7330\ucb79\u40a9\u6bb9\uff55)))
            putfield:\u9255\u0c95\u4cd9\ube23\u760c<? extends T>(\u385b\u4daf\u36d3\u69d9\ufcaf::\ua562\u5140\u5fe1\ud51e\u5245\u51b2, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>, p0:\u9255\u0c95\u4cd9\ube23\u760c<? extends T>)
            putfield:float(\u385b\u4daf\u36d3\u69d9\ufcaf::\u8df4\u983f\u9255\u8c8a\u8aa5\ub171, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>, p5:float)
            putfield:int(\u385b\u4daf\u36d3\u69d9\ufcaf::\ud4fe\ube23\u7043\u9a18\u74b1\uc9f6, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>, mul:int(p1:int, p1:int))
            putfield:int(\u385b\u4daf\u36d3\u69d9\ufcaf::\u64f2\u183a\u71ae\uf995\u9255\u4cd9, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>, p6:int)
            putfield:Predicate<T>(\u385b\u4daf\u36d3\u69d9\ufcaf::\uc4d2\u5140\u97e6\u624e\u97b7\u8cae, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>, p3:Predicate<T>)
            putfield:Predicate<E>(\u385b\u4daf\u36d3\u69d9\ufcaf::\u40a9\ub171\uc229\ub32d\uc9f6\u3504, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>, p2:Predicate<E>)
            putfield:\ud36e\u4bc8\u6d69\u92ee\ubb2b<T>(\u385b\u4daf\u36d3\u69d9\ufcaf::\u9937\u8258\u6ec6\ubefe\u8640\ubf56, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>, p4:\ud36e\u4bc8\u6d69\u92ee\ubb2b<T>)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u385b\u4daf\u36d3\u69d9\ufcaf<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc, T> \u61a4\u8d98\ua61f\u8753\ua3b4\u836c(\ub113\uc4d2\u183a\u527a\u6435.\u9255\u0c95\u4cd9\ube23\u760c<? extends T> p0, int p1, \ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\ud36e\u4bc8\u6d69\u92ee\ubb2b<T> p2, float p3, int p4) {
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
    
    public boolean \u4ab3\uafe7\u8709\ub171\ubefe\u759a(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, E extends \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_3_5F : int
        stack_9B_0 : int [generated]
        
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
            var_3_5F = and:int(ldc:int(-209419450), ldc:int(-1097790633))
            
            if (logicaland:boolean(invokeinterface:boolean(Predicate<E>::test, getfield:Predicate<E>(\u385b\u4daf\u36d3\u69d9\ufcaf::\u40a9\ub171\uc229\ub32d\uc9f6\u3504, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>), p1:E extends \ube23\u67d0\u64f2\u839e\u76bc), invokespecial:boolean(\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>::\u0c95\uc246\u7bad\ub113\u8640\u3bd6, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>, p1:E extends \ube23\u67d0\u64f2\u839e\u76bc))) {
                stack_9B_0 = and:int(ldc:int(1), ldc:int(4621))
            }
            else {
                var_3_5F = and:int(var_3_5F:int, ldc:int(-164090937))
                stack_9B_0 = and:int(ldc:int(-27658), ldc:int(27649))
            }
            
            return:boolean(stack_9B_0:int)
        }
        
        goto(Label_0006)
    }
    
    private boolean \u0c95\uc246\u7bad\ub113\u8640\u3bd6(E extends \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:boolean(invokeinterface:boolean(Stream<Object>::anyMatch, invokeinterface:Stream<Object>(Collection<Object>::stream, checkcast:List<\ube23\u67d0\u64f2\u839e\u76bc>[expected:Collection<Object>](java.util.List<\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc>.class, invokevirtual:List<\ube23\u67d0\u64f2\u839e\u76bc>(Optional<List<\ube23\u67d0\u64f2\u839e\u76bc>>::get, invokevirtual:Optional<List<\ube23\u67d0\u64f2\u839e\u76bc>>(\ub32d\u92ff\uc2bd\ud36e\ud36e<?>::\u836c\u8753\ub102\u9a18\uc910\u6fb0, invokevirtual:\ub32d\u92ff\uc2bd\ud36e\ud36e<?>(\ube23\u67d0\u64f2\u839e\u76bc::\u3d64\u16f6\u9a18\ucef1\ua6bd\u8bb0, p0:E extends \ube23\u67d0\u64f2\u839e\u76bc[expected:\ube23\u67d0\u64f2\u839e\u76bc]), getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<List<\ube23\u67d0\u64f2\u839e\u76bc>>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\u759a\ub7dc\u4ab3\u8753\ufe34\u56bd))))), invokedynamic:Predicate<\ube23\u67d0\u64f2\u839e\u76bc>(test:(L\u4492\u8aa5\ud171\uc3e3\u4c2b/\u4c04\ua068\u3d64\ua6bd\u8389/\u960f\ubefe\ud4fe\u7c6b\u5db4/\u6fb0\u12cb\u5db4\uc7fe\u0800/\u385b\u4daf\u36d3\u69d9\ufcaf;)Ljava/util/function/Predicate;, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>)))
        }
        
        goto(Label_0006)
    }
    
    private boolean \ubefe\uc910\u64ab\u6b0d\u7873\ua3b4(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
        var_2_5F : int
        stack_A1_0 : int [generated]
        
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
            var_2_5F = and:int(ldc:int(-1605758818), ldc:int(-1143032861))
            
            if (logicaland:boolean(invokevirtual:boolean(Object::equals, getfield:\u9255\u0c95\u4cd9\ube23\u760c<? extends T>[expected:Object](\u385b\u4daf\u36d3\u69d9\ufcaf::\ua562\u5140\u5fe1\ud51e\u5245\u51b2, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>), invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])), invokeinterface:boolean(Predicate<T>::test, getfield:Predicate<T>(\u385b\u4daf\u36d3\u69d9\ufcaf::\uc4d2\u5140\u97e6\u624e\u97b7\u8cae, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>), p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:T extends \ube23\u67d0\u64f2\u839e\u76bc]))) {
                stack_A1_0 = and:int(ldc:int(16969), ldc:int(5521))
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(980302067))
                stack_A1_0 = and:int(ldc:int(19662), ldc:int(-19664))
            }
            
            return:boolean(stack_A1_0:int)
        }
        
        goto(Label_0006)
    }
    
    public void \u7873\uc7fe\u99f7\ubb2b\u1833\ua562(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\ube23\uc238\u5140\u4cd9\u8aa5 p0, E extends \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1, long p2) {
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
    
    private void lambda$\u385b\ub32d\u1833\u7006\uf94d\u7af6$6(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u36d3\u9033\u6b0d\u983f\u8d90.\ub32d\u92ff\uc2bd\ud36e\ud36e p1, java.util.List p2) {
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
    
    private void lambda$\u7c6b\u97b7\u64f2\u4492\u624e\u12cb$5(\u36d3\u9033\u6b0d\u983f\u8d90.\ub32d\u92ff\uc2bd\ud36e\ud36e p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
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
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\ud36e\uc7fe\u7043\u965f\u92ee\u98a4, p0:\ub32d\u92ff\uc2bd\ud36e\ud36e, getfield:\ud36e\u4bc8\u6d69\u92ee\ubb2b<T>(\u385b\u4daf\u36d3\u69d9\ufcaf::\u9937\u8258\u6ec6\ubefe\u8640\ubf56, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>), p1:\ube23\u67d0\u64f2\u839e\u76bc)
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\ud36e\uc7fe\u7043\u965f\u92ee\u98a4, p0:\ub32d\u92ff\uc2bd\ud36e\ud36e, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\u7ce1\u6b5f\u071d\u873d\ubf56\u74b1>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\ua3b4\u4daf\u98a4\u527a\uc4d2\u36d3), initobject:\ubded\u4d85\u4e72\ud523\uf94d\u8df4(\ubded\u4d85\u4e72\ud523\uf94d\u8df4::<init>, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], xor:int[expected:boolean](ldc:int(-32686), ldc:int(-32685))))
            invokevirtual:void(\ub32d\u92ff\uc2bd\ud36e\ud36e<E>::\ud36e\uc7fe\u7043\u965f\u92ee\u98a4, p0:\ub32d\u92ff\uc2bd\ud36e\ud36e, getstatic:\ud36e\u4bc8\u6d69\u92ee\ubb2b<\uc87f\ubcb0\uafe7\u64f2\u74b1>(\ud36e\u4bc8\u6d69\u92ee\ubb2b::\uceb8\u51b2\ud523\ud523\u3a62\u3c25), initobject:\uc87f\ubcb0\uafe7\u64f2\u74b1(\uc87f\ubcb0\uafe7\u64f2\u74b1::<init>, initobject:\ubded\u4d85\u4e72\ud523\uf94d\u8df4[expected:\u7ce1\u6b5f\u071d\u873d\ubf56\u74b1](\ubded\u4d85\u4e72\ud523\uf94d\u8df4::<init>, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], and:int[expected:boolean](ldc:int(-5020), ldc:int(5018))), getfield:float(\u385b\u4daf\u36d3\u69d9\ufcaf::\u8df4\u983f\u9255\u8c8a\u8aa5\ub171, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>), getfield:int(\u385b\u4daf\u36d3\u69d9\ufcaf::\u64f2\u183a\u71ae\uf995\u9255\u4cd9, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean lambda$\u9a18\u624e\u6c52\u4daf\u718f\ua6bd$4(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0, \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p1) {
        var_3_61 : int
        stack_91_0 : int [generated]
        
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
            var_3_61 = and:int(ldc:int(1637842453), ldc:int(1205156411))
            
            if (cmpgt:boolean(invokevirtual:double(\u7d52\u718f\u3776\u6fb0\ub83f::\u3e2a\ua3b4\u4975\u4179\u64f2\u6c52, p1:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f], p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), i2d:double(getfield:int(\u385b\u4daf\u36d3\u69d9\ufcaf::\ud4fe\ube23\u7043\u9a18\u74b1\uc9f6, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>)))) {
                var_3_61 = and:int(var_3_61:int, ldc:int(2069837631))
                stack_91_0 = and:int(ldc:int(16800), ldc:int(-16801))
            }
            else {
                stack_91_0 = and:int(ldc:int(20515), ldc:int(8537))
            }
            
            return:boolean(stack_91_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static \u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc lambda$\u93a2\u36d3\u071d\u93a2\ubff1\uf9c5$3(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:\ube23\u67d0\u64f2\u839e\u76bc(p0:\ube23\u67d0\u64f2\u839e\u76bc)
        }
        
        goto(Label_0006)
    }
    
    private boolean lambda$\u6cfe\u4d85\u51b2\u071d\ud217\u760c$2(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:boolean(invokevirtual:boolean(Object::equals, getfield:\u9255\u0c95\u4cd9\ube23\u760c<? extends T>[expected:Object](\u385b\u4daf\u36d3\u69d9\ufcaf::\ua562\u5140\u5fe1\ud51e\u5245\u51b2, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>), invokevirtual:\u9255\u0c95\u4cd9\ube23\u760c<?>[expected:Object](\u7d52\u718f\u3776\u6fb0\ub83f::\uff55\ud523\ub171\u4975\u516c\uf995, p0:\ube23\u67d0\u64f2\u839e\u76bc[expected:\u7d52\u718f\u3776\u6fb0\ub83f])))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\u8753\ua6bd\u92ee\u624e\u624e\u98a4$1(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:boolean(and:int[expected:boolean](ldc:int(35), ldc:int(645)))
        }
        
        goto(Label_0006)
    }
    
    private static boolean lambda$\ub32d\u3a62\u88c5\ud171\u7bad\ub32d$0(\u71f1\uc910\u3bc9\u516c\u93a2.\ube23\u67d0\u64f2\u839e\u76bc p0) {
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
            return:boolean(xor:int[expected:boolean](ldc:int(16400), ldc:int(16401)))
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
        var_3_684 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_68F : int
        
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
        var_3_684 = and:int(ldc:int(-592717227), ldc:int(-788816009))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u385b\u4daf\u36d3\u69d9\ufcaf<E, T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(2072324391))
        }
        else {
            var_3_684 = and:int(var_3_684:int, ldc:int(1349246113))
            var_5_8A = and:int(ldc:int(-9805), ldc:int(9740))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-9729), ldc:int(9728)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_684:int, ldc:int(2026094577))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, and:int(ldc:int(18445), ldc:int(8449)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, and:int(ldc:int(673), ldc:int(26881)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_684 = and:int(var_3_E3:int, ldc:int(-661530987))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(97), ldc:int(11009)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(967865267))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(302184533))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1208082684))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-679122836))
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-295757186))
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-303151449))
                    }
                    else {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1516491105))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0613)
                            }
                            
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0438:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1504490985))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1809193030))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-979248345))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-497267458))
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(454605007))
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-645293163))
                            var_11_F4 = and:int(ldc:int(21651), ldc:int(-21652))
                            goto(Label_1535)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0613:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-557800028))
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(98758441))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1188384250))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-151903138))
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(2067256705))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0738:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1361663809))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1088950399))
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1110688680))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-736264880))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-107506665))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0870:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1670872720))
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(964910303))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(129911758))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(2012074619))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(3), ldc:int(28969))
                                goto(Label_1146)
                            }
                        }
                    }
                    
                    Label_0986:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(2055562854))
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(392603491))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1615371346))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1229003872))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(2020202917))
                        var_11_F4 = and:int(ldc:int(-4855), ldc:int(4726))
                    }
                    
                    Label_1146:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1033123397))
                            goto(Label_0738)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0613)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-379364306))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-673605543))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1389)
                            }
                        }
                    }
                    
                    Label_1253:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-224775269))
                            goto(Label_1146)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0986)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1641287740))
                            goto(Label_0738)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1605534852))
                            goto(Label_0613)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(715181584))
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(2098961465))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                            goto(Label_1535)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1389:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1546)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1797662060))
                        goto(Label_1253)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1404106046))
                        goto(Label_0986)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(156399454))
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0738)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-33605058))
                        goto(Label_0613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1066868527))
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_684 = and:int(var_3_684:int, ldc:int(1976417393))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1535:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68F = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1546:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1389)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1338136488))
                        goto(Label_1253)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1663959664))
                        goto(Label_1146)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1617713789))
                        goto(Label_0986)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(144404517))
                        goto(Label_0738)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(256)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1286845585))
                        goto(Label_0613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-193593857))
                        var_17_68F = add:int(var_16_122:int, and:int(ldc:int(1), ldc:int(18691)))
                        looporswitchbreak()
                    }
                }
                
                var_3_684 = and:int(var_3_684:int, ldc:int(-617375291))
                
                if (cmple:boolean(var_5_8A = var_17_68F:int, sub:int(var_6_91:int, and:int(ldc:int(4097), ldc:int(9765))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(-695806476))
            goto(Label_0108)
        }
    }
}
