public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u8350\u760c\u4e72\u8cae\ua068\u93a2 {
    public void \u8350\u760c\u4e72\u8cae\ua068\u93a2() {
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
            invokespecial:Object(Object::<init>, this:\u8350\u760c\u4e72\u8cae\ua068\u93a2)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u5d20\u97b7\u8753\u873d\u16f6.\u446c\u3a62\u836c\ud171\u385b\u4f52<T> \u3776\u7e3f\u7ce1\u9033\u7330\u4f4a(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, java.util.function.Function<\u59ec\u8413\u97e6\uc229\u3776.\u88c5\uc2bd\u1833\u960f\u5db4\u4d85, \u8cae\u8bb0\ucef1\u8c8a\u3a62.\u8d90\u183a\ub171\u59ec\u836c\u8413<T>> p1) {
        var_4_68 : \u446c\u3a62\u836c\ud171\u385b\u4f52<Object>
        
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
        var_4_68 = initobject:\u446c\u3a62\u836c\ud171\u385b\u4f52<Object>(\u446c\u3a62\u836c\ud171\u385b\u4f52<Object>::<init>, p1:Function<\u88c5\uc2bd\u1833\u960f\u5db4\u4d85, \u8d90\u183a\ub171\u59ec\u836c\u8413<Object>>)
        
        if (cmpeq:boolean(checkcast:\u446c\u3a62\u836c\ud171\u385b\u4f52<Object>(\u5d20\u97b7\u8753\u873d\u16f6.\u446c\u3a62\u836c\ud171\u385b\u4f52<java.lang.Object>.class, invokeinterface:\u446c\u3a62\u836c\ud171\u385b\u4f52<Object>(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u446c\u3a62\u836c\ud171\u385b\u4f52<Object>>::putIfAbsent, getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u446c\u3a62\u836c\ud171\u385b\u4f52<?>>(\u8350\u760c\u4e72\u8cae\ua068\u93a2::\ud523\u7d52\u4ab3\u7043\ucb79\uc7fe), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, var_4_68:\u446c\u3a62\u836c\ud171\u385b\u4f52<Object>)), aconstnull:\u446c\u3a62\u836c\ud171\u385b\u4f52<?>())) {
            return:\u446c\u3a62\u836c\ud171\u385b\u4f52<T>(var_4_68:\u446c\u3a62\u836c\ud171\u385b\u4f52<Object>)
        }
        
        athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u8350\u760c\u4e72\u8cae\ua068\u93a2::\ub19c\u416d\u4c2b\u4bc8\u1187\uc29a), and:int(ldc:int(-9325), ldc:int(9320)))), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]))))
    }
    
    public static void \u6b0d\u4492\ua3b4\ub171\u6fb0\u8413(\u59ec\u8413\u97e6\uc229\u3776.\u88c5\uc2bd\u1833\u960f\u5db4\u4d85 p0) {
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
    
    public static void \u183a\ubcb0\u4e72\u8aa5\u92ff\u51b2() {
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
            invokeinterface:void(Iterable<Object>::forEach, invokeinterface:Collection<\u446c\u3a62\u836c\ud171\u385b\u4f52<?>>[expected:Iterable<Object>](Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u446c\u3a62\u836c\ud171\u385b\u4f52<?>>::values, getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u446c\u3a62\u836c\ud171\u385b\u4f52<?>>(\u8350\u760c\u4e72\u8cae\ua068\u93a2::\ud523\u7d52\u4ab3\u7043\ucb79\uc7fe)), invokedynamic:Consumer<? super Object>(accept:()Ljava/util/function/Consumer;))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static com.google.common.collect.Multimap<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \u47c2\ub70c\u59ec\ua3b4\ub102\u0800(\u59ec\u8413\u97e6\uc229\u3776.\u88c5\uc2bd\u1833\u960f\u5db4\u4d85 p0) {
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
    
    public static void \u71ae\u7af6\u647c\ua6bd\u9a18\uc2e8() {
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
    
    private static boolean lambda$\u8258\u6b5f\ubcb0\u9a18\u9af2\u8bb0$2(\u5d20\u97b7\u8753\u873d\u16f6.\u446c\u3a62\u836c\ud171\u385b\u4f52 p0) {
        var_1_5F : int
        stack_8B_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(1107766852), ldc:int(1457404876))
            
            if (invokeinterface:boolean(Map<K, V>::containsValue, getstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u446c\u3a62\u836c\ud171\u385b\u4f52<?>>(\u8350\u760c\u4e72\u8cae\ua068\u93a2::\ud523\u7d52\u4ab3\u7043\ucb79\uc7fe), p0:\u446c\u3a62\u836c\ud171\u385b\u4f52[expected:Object])) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1358348028))
                stack_8B_0 = and:int(ldc:int(-16043), ldc:int(16042))
            }
            else {
                stack_8B_0 = xor:int(ldc:int(16457), ldc:int(16456))
            }
            
            return:boolean(stack_8B_0:int)
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u600f\u4975\u76bc\u8df4\u61a4\u4ab3$1(com.google.common.collect.Multimap p0, \u59ec\u8413\u97e6\uc229\u3776.\u88c5\uc2bd\u1833\u960f\u5db4\u4d85 p1, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p2, \u5d20\u97b7\u8753\u873d\u16f6.\u446c\u3a62\u836c\ud171\u385b\u4f52 p3) {
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
            invokeinterface:boolean(Multimap::putAll, p0:Multimap, p2:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object], invokevirtual:Set[expected:Iterable](\u446c\u3a62\u836c\ud171\u385b\u4f52::\u527a\u946b\u5245\uf9c5\u071d\u8bb0, p3:\u446c\u3a62\u836c\ud171\u385b\u4f52, p1:\u88c5\uc2bd\u1833\u960f\u5db4\u4d85))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u760c\uc9f6\u5f50\uc2bd\u183a\u6435$0(\u59ec\u8413\u97e6\uc229\u3776.\u88c5\uc2bd\u1833\u960f\u5db4\u4d85 p0, \u5d20\u97b7\u8753\u873d\u16f6.\u446c\u3a62\u836c\ud171\u385b\u4f52 p1) {
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
            invokevirtual:void(\u446c\u3a62\u836c\ud171\u385b\u4f52::\uc2e8\u74b1\u6fb0\uc2bd\uf94d\uc2e8, p1:\u446c\u3a62\u836c\ud171\u385b\u4f52, p0:\u88c5\uc2bd\u1833\u960f\u5db4\u4d85)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_5F : int
        expr_6B : int [generated]
        stack_85_0 : byte[] [generated]
        stack_87_0 : byte[] [generated]
        stack_AA_0 : byte[] [generated]
        stack_AC_0 : byte[] [generated]
        stack_CA_0 : byte[] [generated]
        stack_14F_0 : byte[] [generated]
        stack_1B1_0 : byte[] [generated]
        stack_222_0 : byte[] [generated]
        var_4_131 : int
        var_3_136 : byte[]
        var_5_137 : int
        expr_152 : byte [generated]
        var_0_1A7 : int
        expr_1B1 : byte [generated]
        stack_1F0_2 : byte [generated]
        stack_1CE_0 : byte [generated]
        expr_87 : int [generated]
        var_2_AA : byte[]
        expr_AE : int [generated]
        var_3_210 : byte[]
        var_5_211 : int
        var_3_D6 : String
        stack_124_0 : String[] [generated]
        expr_E8 : String[] [generated]
        
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
        var_0_5F = and:int(ldc:int(828446627), ldc:int(-212659353))
        expr_6B = arraylength:int(stack_85_0 = stack_87_0 = stack_AA_0 = stack_AC_0 = stack_CA_0 = stack_14F_0 = stack_1B1_0 = stack_222_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("vIaBAYACAIVmIYyKDABrKwyKbaeFjoiFhOIgBYjsIo0JgP+CAIaEDF8JuzgBCv8EjGIiC4CLDYRopwaFDg4KjgCHhYQMf3w4")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_131 = expr_6B:int
        var_3_136 = newarray:byte[](byte.class, expr_6B:int)
        var_5_137 = expr_6B:int
        Label_0313:
        
        while (cmpne:boolean(and:int(var_0_5F:int, ldc:int(512)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(793586667))
            var_5_137 = add:int(var_5_137:int, ldc:int(-1))
            expr_152 = add:byte(loadelement:byte(stack_14F_0:byte[], var_5_137:int), ldc:byte(33))
            storeelement:byte(var_3_136:byte[], var_5_137:int, xor:int(or:int(and:int(shl:int(expr_152:byte, xor:int(ldc:int(1346), ldc:int(1350))), ldc:int(-16)), and:int(shr:int(expr_152:byte[expected:int], and:int(ldc:int(4684), ldc:int(2468))), ldc:int(15))), ldc:int(2)))
            
            if (cmpne:boolean(var_5_137:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_87_0 = stack_85_0 = stack_AA_0 = stack_AC_0 = stack_CA_0 = stack_14F_0 = stack_1B1_0 = stack_222_0 = var_3_136:byte[]
            goto(Label_0112)
        }
        
        Label_0410:
        
        while (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(16)), ldc:int(0))) {
            var_0_1A7 = and:int(var_0_5F:int, ldc:int(-337789257))
            var_5_137 = add:int(var_5_137:int, ldc:int(-1))
            expr_1B1 = stack_1F0_2 = loadelement(stack_1B1_0, var_5_137)
            
            if (cmplt:boolean(add:int(add:int(var_5_137:int, ldc:int(1)), neg:int(var_4_131:int)), ldc:int(0))) {
                stack_1F0_2 = stack_1CE_0 = add:byte(expr_1B1:byte, loadelement:byte(var_3_136:byte[], add:int(var_5_137:int, ldc:int(1))))
                goto(Label_0478)
            }
            
            Label_0446:
            
            if (cmpne:boolean(and:int(var_0_1A7:int, ldc:int(65536)), ldc:int(0))) {
                var_0_1A7 = and:int(var_0_1A7:int, ldc:int(-204777489))
                stack_1F0_2 = stack_1CE_0 = add:byte(expr_1B1:byte, ldc:byte(1))
            }
            
            Label_0478:
            
            if (cmpne:boolean(and:int(var_0_1A7:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0446)
            }
            
            var_0_5F = and:int(var_0_1A7:int, ldc:int(2042722923))
            storeelement:byte(var_3_136:byte[], var_5_137:int, stack_1F0_2:byte)
            
            if (cmpne:boolean(var_5_137:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_87_0 = stack_85_0 = stack_AA_0 = stack_AC_0 = stack_CA_0 = stack_14F_0 = stack_1B1_0 = stack_222_0 = var_3_136:byte[]
            goto(Label_0140)
        }
        
        goto(Label_0313)
        Label_0112:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(512)), ldc:int(0))) {
            goto(Label_0179)
        }
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(262144)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-171195605))
            expr_87 = arraylength:int(stack_87_0:byte[])
            
            if (cmpne:boolean(expr_87:int, ldc:int(0))) {
                var_4_131 = expr_87:int
                var_3_136 = newarray:byte[](byte.class, expr_87:int)
                var_5_137 = expr_87:int
                goto(Label_0410)
            }
        }
        
        Label_0140:
        
        if (cmpeq:boolean(and:int(var_0_5F:int, ldc:int(512)), ldc:int(0))) {
            var_0_5F = and:int(var_0_5F:int, ldc:int(-146307257))
        }
        else {
            if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0112)
            }
            
            var_0_5F = and:int(var_0_5F:int, ldc:int(1065177967))
            var_2_AA = stack_AA_0:byte[]
            expr_AE = add:int(arraylength:int(stack_AC_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_AE:int, ldc:int(0))) {
                var_3_210 = newarray:byte[](byte.class, expr_AE:int)
                var_5_211 = expr_AE:int
                
                loop {
                    var_0_5F = and:int(var_0_5F:int, ldc:int(2102109747))
                    var_5_211 = add:int(var_5_211:int, ldc:int(-1))
                    storeelement:byte(var_3_210:byte[], var_5_211:int, add:int(shl:int(loadelement:byte(stack_222_0:byte[], var_5_211:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_AA:byte[], add:int(var_5_211:int, xor:int(ldc:int(384), ldc:int(385)))), ldc:int(3)), xor:int(ldc:int(3601), ldc:int(3598)))))
                    
                    if (cmpne:boolean(var_5_211:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_87_0 = stack_85_0 = stack_AA_0 = stack_AC_0 = stack_CA_0 = stack_14F_0 = stack_1B1_0 = stack_222_0 = var_3_210:byte[]
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(64)), ldc:int(0))) {
            goto(Label_0140)
        }
        
        if (cmpne:boolean(and:int(var_0_5F:int, ldc:int(2)), ldc:int(0))) {
            var_3_D6 = initobject:String(String::<init>, stack_CA_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            stack_124_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(9923), ldc:int(266)))
            expr_E8 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(-32768), ldc:int(-32766)))
            storeelement:String(expr_E8:String[], and:int(ldc:int(490), ldc:int(-16891)), invokevirtual:String[expected:String](String::substring, var_3_D6:String, and:int(ldc:int(-6496), ldc:int(4381)), and:int(ldc:int(4523), ldc:int(575))))
            storeelement:String(expr_E8:String[], and:int(ldc:int(21), ldc:int(2241)), invokevirtual:String[expected:String](String::substring, var_3_D6:String, xor:int(ldc:int(16961), ldc:int(17002)), xor:int(ldc:int(19540), ldc:int(19475))))
            putstatic:String[](\u8350\u760c\u4e72\u8cae\ua068\u93a2::\ub19c\u416d\u4c2b\u4bc8\u1187\uc29a, expr_E8:String[])
            putstatic:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u446c\u3a62\u836c\ud171\u385b\u4f52<?>>(\u8350\u760c\u4e72\u8cae\ua068\u93a2::\ud523\u7d52\u4ab3\u7043\ucb79\uc7fe, invokestatic:HashMap[expected:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u446c\u3a62\u836c\ud171\u385b\u4f52<?>>](Maps::newHashMap))
            return:void()
        }
        
        goto(Label_0112)
    }
    
    public void \u71f1\u40a9\ua562\u6fb0\u6b0d\ua562(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_684 : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
        var_9_D0 : double
        var_3_E2 : int
        var_11_F3 : int
        var_14_11D : double
        var_16_121 : int
        var_12_119 : double
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
        var_3_684 = and:int(ldc:int(-918004259), ldc:int(198507007))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8350\u760c\u4e72\u8cae\ua068\u93a2[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(2110276011))
        }
        else {
            var_3_684 = and:int(var_3_684:int, ldc:int(-648512290))
            var_5_89 = and:int(ldc:int(-24821), ldc:int(24788))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(17110), ldc:int(-17111)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_684:int, ldc:int(-102434209))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, xor:int(ldc:int(-30463), ldc:int(-30464)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(18437), ldc:int(4137)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_684 = and:int(var_3_E2:int, ldc:int(1540520566))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(33), ldc:int(32)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(9846868))
                        goto(Label_1567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(275767135))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(918200549))
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-195440022))
                        goto(Label_0985)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(393587707))
                        goto(Label_0871)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(746685933))
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(2120264454))
                    }
                    else {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-876357545))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0583)
                            }
                            
                            goto(Label_0871)
                        }
                    }
                    
                    Label_0445:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0985)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0871)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1455500675))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(763198845))
                        var_11_F3 = and:int(ldc:int(-9812), ldc:int(9299))
                        goto(Label_1556)
                    }
                    
                    Label_0583:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-723288563))
                        goto(Label_1567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(829948440))
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0985)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1927216751))
                        goto(Label_0871)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1192363363))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-921292724))
                            goto(Label_0445)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(1455711231))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(771284692))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0871)
                        }
                    }
                    
                    Label_0722:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-212438420))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1549968963))
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-454642564))
                        goto(Label_0985)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1387686900))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(171237770))
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0445)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(449227792))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-648423051))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0871:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1724852332))
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(234815532))
                            goto(Label_0445)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1703256900))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(1834089084))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = xor:int(ldc:int(-30720), ldc:int(-30719))
                                goto(Label_1161)
                            }
                        }
                    }
                    
                    Label_0985:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-384299046))
                        goto(Label_1567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1406938004))
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1193536274))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0871)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(177280322))
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1419229892))
                            goto(Label_0445)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(675669412))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1077846025))
                        var_11_F3 = and:int(ldc:int(-20156), ldc:int(1210))
                    }
                    
                    Label_1161:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-900997983))
                        goto(Label_1567)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1880358112))
                        goto(Label_1410)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0985)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0871)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(2038472855))
                            goto(Label_0722)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_0445)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1847251957))
                            loopcontinue()
                        }
                        
                        var_3_684 = and:int(var_3_684:int, ldc:int(-371065860))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1410)
                            }
                        }
                    }
                    
                    Label_1285:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_1567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1584350678))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(446551478))
                            goto(Label_1161)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(-1215030134))
                            goto(Label_0985)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0871)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0722)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0583)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0445)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_684 = and:int(var_3_684:int, ldc:int(433094012))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                            goto(Label_1556)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1410:
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(798138450))
                        goto(Label_1567)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1285)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(426793647))
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0985)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0871)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(32)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(639418705))
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(312677618))
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(318672800))
                        goto(Label_0445)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_684 = and:int(var_3_684:int, ldc:int(735074429))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1556:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_68F = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1567:
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1410)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(2)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-704720071))
                        goto(Label_1285)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-371752875))
                        goto(Label_0985)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0871)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0722)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0583)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_684:int, ldc:int(64)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(1919418005))
                        goto(Label_0445)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_684:int, ldc:int(16)), ldc:int(0))) {
                        var_3_684 = and:int(var_3_684:int, ldc:int(-1924768516))
                        var_17_68F = add:int(var_16_121:int, and:int(ldc:int(18435), ldc:int(4129)))
                        looporswitchbreak()
                    }
                }
                
                var_3_684 = and:int(var_3_684:int, ldc:int(994859220))
                
                if (cmple:boolean(var_5_89 = var_17_68F:int, sub:int(var_6_90:int, xor:int(ldc:int(4098), ldc:int(4099))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpne:boolean(and:int(var_3_684:int, ldc:int(8192)), ldc:int(0))) {
            var_3_684 = and:int(var_3_684:int, ldc:int(-118375871))
            goto(Label_0108)
        }
    }
}
