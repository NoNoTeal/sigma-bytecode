public abstract class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u836c\u67e9\u5d20\u5fe1\u7e3f.\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R> {
    public void \u4179\ubefe\u3711\u3a62\u3a62\u3bd6(java.lang.String p0) {
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
            invokespecial:Object(Object::<init>, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>)
            putfield:Queue<R>(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\u4bc8\u8df4\uc29a\u946b\u2dcc\u4cd9, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>, invokestatic:ConcurrentLinkedQueue[expected:Queue<R>](Queues::newConcurrentLinkedQueue))
            putfield:String(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\u4f52\u7bad\u392e\u67d0\u527a\ub102, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>, p0:String)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public abstract R extends java.lang.Runnable \u4c04\ud217\u7330\u67e9\u8389\u4c2b(java.lang.Runnable p0);
    
    public abstract boolean \u5fe1\u8413\uafe7\u98a4\ud158\u67d0(R extends java.lang.Runnable p0);
    
    public boolean \u16f6\u12cb\u71f1\ufe34\u4492\ub70c() {
        var_1_5F : int
        stack_89_0 : int [generated]
        
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
            var_1_5F = and:int(ldc:int(-1696721321), ldc:int(-152291593))
            
            if (cmpne:boolean(invokestatic:Thread(Thread::currentThread), invokevirtual:Thread(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\u5f50\u12b2\u92ee\uc31c\ub8be\u4ab3, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>))) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(-134727979))
                stack_89_0 = and:int(ldc:int(-12311), ldc:int(12310))
            }
            else {
                stack_89_0 = and:int(ldc:int(9569), ldc:int(2585))
            }
            
            return:boolean(stack_89_0:int)
        }
        
        goto(Label_0006)
    }
    
    public abstract java.lang.Thread \u5f50\u12b2\u92ee\uc31c\ub8be\u4ab3();
    
    public boolean \u8cae\uc4d2\ud171\ubefe\u16f6\uc246() {
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
            var_1_5F = and:int(ldc:int(1619580964), ldc:int(-1799397395))
            
            if (invokevirtual:boolean(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\u16f6\u12cb\u71f1\ufe34\u4492\ub70c, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>)) {
                var_1_5F = and:int(var_1_5F:int, ldc:int(2041597668))
                stack_86_0 = and:int(ldc:int(16798), ldc:int(-16864))
            }
            else {
                stack_86_0 = xor:int(ldc:int(-21504), ldc:int(-21503))
            }
            
            return:boolean(stack_86_0:int)
        }
        
        goto(Label_0006)
    }
    
    public int \u16f6\u6bb9\u6fb0\u5245\ua6bd\ubded() {
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
            return:int(invokeinterface:int(Collection<E>::size, getfield:Queue<R>[expected:Collection<R>](\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\u4bc8\u8df4\uc29a\u946b\u2dcc\u4cd9, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>)))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \uf9c5\u8389\u600f\u965f\u446c\ua3b4() {
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
            return:String(getfield:String(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\u4f52\u7bad\u392e\u67d0\u527a\ub102, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>))
        }
        
        goto(Label_0006)
    }
    
    public java.util.concurrent.CompletableFuture<V> \u99f7\u6b5f\u59ec\ud51e\u12cb\u516c(java.util.function.Supplier<V> p0) {
        var_2_5F : int
        stack_86_0 : CompletableFuture<V> [generated]
        
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
            var_2_5F = and:int(ldc:int(-693334047), ldc:int(-140663175))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\u8cae\uc4d2\ud171\ubefe\u16f6\uc246, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-552669599))
                stack_86_0 = invokestatic:CompletableFuture<V>(CompletableFuture<T>::completedFuture, invokeinterface:V(Supplier<V>::get, p0:Supplier<V>))
            }
            else {
                stack_86_0 = invokestatic:CompletableFuture<V>(CompletableFuture<T>::supplyAsync, p0:Supplier<V>, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>[expected:Executor])
            }
            
            return:CompletableFuture<V>(stack_86_0:CompletableFuture<V>)
        }
        
        goto(Label_0006)
    }
    
    private java.util.concurrent.CompletableFuture<java.lang.Void> \ube23\ufcaf\uc7fe\u8df4\u56bd\u88c5(java.lang.Runnable p0) {
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
    
    public java.util.concurrent.CompletableFuture<java.lang.Void> \uceb8\u385b\u4492\u4975\u9255\u0b8e(java.lang.Runnable p0) {
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
        
        if (logicalnot:boolean(invokevirtual:boolean(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\u8cae\uc4d2\ud171\ubefe\u16f6\uc246, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>))) {
            invokeinterface:void(Runnable::run, p0:Runnable)
            return:CompletableFuture<Void>(invokestatic:CompletableFuture<Void>(CompletableFuture<T>::completedFuture, checkcast:Void(java.lang.Void.class, aconstnull:Void())))
        }
        
        return:CompletableFuture<Void>(invokespecial:CompletableFuture<Void>(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\ube23\ufcaf\uc7fe\u8df4\u56bd\u88c5, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>, p0:Runnable))
    }
    
    public void \u6d99\u64f2\u8bb0\u56bd\ud51e\ubff1(java.lang.Runnable p0) {
        var_2_5F : int
        
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
            var_2_5F = and:int(ldc:int(1260445661), ldc:int(1534877695))
            
            if (invokevirtual:boolean(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\u16f6\u12cb\u71f1\ufe34\u4492\ub70c, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>)) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(453179167))
                invokeinterface:void(Runnable::run, p0:Runnable)
            }
            else {
                invokevirtual:Void(CompletableFuture<Void>::join, invokespecial:CompletableFuture<Void>(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\ube23\ufcaf\uc7fe\u8df4\u56bd\u88c5, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>, p0:Runnable))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubb2b\ud4fe\ub18d\ub171\u98a4\u873d(R extends java.lang.Runnable p0) {
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
            invokeinterface:boolean(Queue<R>::add, getfield:Queue<R>(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\u4bc8\u8df4\uc29a\u946b\u2dcc\u4cd9, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>), p0:R extends Runnable)
            invokestatic:void(LockSupport::unpark, invokevirtual:Thread(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\u5f50\u12b2\u92ee\uc31c\ub8be\u4ab3, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void execute(java.lang.Runnable p0) {
        var_2_5F : int
        
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
            var_2_5F = and:int(ldc:int(449912012), ldc:int(-1879220851))
            
            if (logicalnot:boolean(invokevirtual:boolean(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\u8cae\uc4d2\ud171\ubefe\u16f6\uc246, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1308655912))
                invokeinterface:void(Runnable::run, p0:Runnable)
            }
            else {
                invokevirtual:void(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\ubb2b\ud4fe\ub18d\ub171\u98a4\u873d, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>, invokevirtual:R extends Runnable(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\u4c04\ud217\u7330\u67e9\u8389\u4c2b, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>, p0:Runnable))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u64ab\u6d69\u72f1\u2dcc\u16f6\u965f() {
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
            invokeinterface:void(Collection<E>::clear, getfield:Queue<R>[expected:Collection<R>](\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\u4bc8\u8df4\uc29a\u946b\u2dcc\u4cd9, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \uff55\u61a4\u8bb0\ubded\ud7e8\u62da() {
        var_1_5F : int
        
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
            var_1_5F = and:int(ldc:int(509715537), ldc:int(-537873225))
            
            loop {
                var_1_5F = and:int(var_1_5F:int, ldc:int(1600894137))
                
                if (logicalnot:boolean(invokevirtual:boolean(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\u0c95\u36d3\u0a06\uc229\ufcaf\u527a, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>))) {
                    looporswitchbreak()
                }
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u0c95\u36d3\u0a06\uc229\ufcaf\u527a() {
        var_3_6C : Runnable
        
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
        var_3_6C = checkcast:R extends Runnable[expected:Runnable](R extends java.lang.Runnable.class, invokeinterface:R extends Runnable(Queue<R>::peek, getfield:Queue<R>(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\u4bc8\u8df4\uc29a\u946b\u2dcc\u4cd9, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>)))
        
        if (cmpeq:boolean(var_3_6C:Runnable, aconstnull:Runnable())) {
            return:boolean(and:int[expected:boolean](ldc:int(-16436), ldc:int(16435)))
        }
        
        if (logicaland:boolean(cmpeq:boolean(getfield:int(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\ucfaf\u16f6\ua068\ub1b9\u9937\u8c8a, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>), ldc:int(0)), logicalnot:boolean(invokevirtual:boolean(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\u5fe1\u8413\uafe7\u98a4\ud158\u67d0, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>, var_3_6C:R extends Runnable)))) {
            return:boolean(and:int[expected:boolean](ldc:int(-11209), ldc:int(11208)))
        }
        
        invokevirtual:void(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::run, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>, checkcast:R extends Runnable(R extends java.lang.Runnable.class, invokeinterface:R extends Runnable(Queue<R>::remove, getfield:Queue<R>(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\u4bc8\u8df4\uc29a\u946b\u2dcc\u4cd9, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>))))
        return:boolean(xor:int[expected:boolean](ldc:int(5504), ldc:int(5505)))
    }
    
    public void \ubcb0\u3504\u120d\u4bc8\ub1b9\u120d(java.util.function.BooleanSupplier p0) {
        var_2_183 : int
        
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
            var_2_183 = and:int(ldc:int(-1490806131), ldc:int(-1547902977))
            
            loop {
                Label_0096:
                
                if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(4096)), ldc:int(0))) {
                    var_2_183 = and:int(var_2_183:int, ldc:int(-26574767))
                    goto(Label_0590)
                }
                
                if (cmpne:boolean(and:int(var_2_183:int, ldc:int(2)), ldc:int(0))) {
                    var_2_183 = and:int(var_2_183:int, ldc:int(949621124))
                    goto(Label_0483)
                }
                
                if (cmpne:boolean(and:int(var_2_183:int, ldc:int(131072)), ldc:int(0))) {
                    goto(Label_0404)
                }
                
                if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_183 = and:int(var_2_183:int, ldc:int(-906217864))
                    goto(Label_0330)
                }
                
                if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0263)
                }
                
                if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0183)
                }
                
                var_2_183 = and:int(var_2_183:int, ldc:int(-182092851))
                putfield:int(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\ucfaf\u16f6\ua068\ub1b9\u9937\u8c8a, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>, add:int(getfield:int(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\ucfaf\u16f6\ua068\ub1b9\u9937\u8c8a, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>), xor:int(ldc:int(520), ldc:int(521))))
                
                try {
                    loop {
                        Label_0183:
                        
                        if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(262144)), ldc:int(0))) {
                            var_2_183 = and:int(var_2_183:int, ldc:int(535318802))
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_183:int, ldc:int(1048576)), ldc:int(0))) {
                            var_2_183 = and:int(var_2_183:int, ldc:int(-1512015742))
                            goto(Label_0483)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_183:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_183:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0330)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_183:int, ldc:int(65536)), ldc:int(0))) {
                            var_2_183 = and:int(var_2_183:int, ldc:int(787066325))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(512)), ldc:int(0))) {
                                loopcontinue(Label_0096)
                            }
                            
                            var_2_183 = and:int(var_2_183:int, ldc:int(-1083802931))
                            
                            if (invokeinterface:boolean(BooleanSupplier::getAsBoolean, p0:BooleanSupplier)) {
                                putfield:int(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\ucfaf\u16f6\ua068\ub1b9\u9937\u8c8a, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>, sub:int(getfield:int(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\ucfaf\u16f6\ua068\ub1b9\u9937\u8c8a, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>), xor:int(ldc:int(144), ldc:int(145))))
                                goto(Label_0590)
                            }
                        }
                        
                        Label_0263:
                        
                        if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(536870912)), ldc:int(0))) {
                            var_2_183 = and:int(var_2_183:int, ldc:int(946765695))
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_183:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0483)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_183:int, ldc:int(268435456)), ldc:int(0))) {
                            var_2_183 = and:int(var_2_183:int, ldc:int(138155421))
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_183:int, ldc:int(262144)), ldc:int(0))) {
                            if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(128)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(4)), ldc:int(0))) {
                                loopcontinue(Label_0096)
                            }
                            
                            var_2_183 = and:int(var_2_183:int, ldc:int(-214089809))
                        }
                        
                        Label_0330:
                        
                        if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(512)), ldc:int(0))) {
                            var_2_183 = and:int(var_2_183:int, ldc:int(-1310643489))
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_183:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0483)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(1073741824)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_2_183:int, ldc:int(131072)), ldc:int(0))) {
                                goto(Label_0263)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_183:int, ldc:int(131072)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(536870912)), ldc:int(0))) {
                                var_2_183 = and:int(var_2_183:int, ldc:int(1930694758))
                                loopcontinue(Label_0096)
                            }
                            
                            var_2_183 = and:int(var_2_183:int, ldc:int(-75607355))
                            
                            if (invokevirtual:boolean(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\u0c95\u36d3\u0a06\uc229\ufcaf\u527a, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>)) {
                                loopcontinue()
                            }
                        }
                        
                        Label_0404:
                        
                        if (cmpne:boolean(and:int(var_2_183:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0590)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_183:int, ldc:int(8388608)), ldc:int(0))) {
                            var_2_183 = and:int(var_2_183:int, ldc:int(-1989223802))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_2_183:int, ldc:int(1048576)), ldc:int(0))) {
                                goto(Label_0330)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_183:int, ldc:int(268435456)), ldc:int(0))) {
                                goto(Label_0263)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(4)), ldc:int(0))) {
                                var_2_183 = and:int(var_2_183:int, ldc:int(1253915592))
                                loopcontinue()
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(2147483647)), ldc:int(0))) {
                                var_2_183 = and:int(var_2_183:int, ldc:int(-310514750))
                                loopcontinue(Label_0096)
                            }
                            
                            var_2_183 = and:int(var_2_183:int, ldc:int(-38846747))
                        }
                        
                        Label_0483:
                        
                        if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(256)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_2_183:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_0404)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_183:int, ldc:int(16)), ldc:int(0))) {
                                var_2_183 = and:int(var_2_183:int, ldc:int(-1917814360))
                                goto(Label_0330)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_183:int, ldc:int(2)), ldc:int(0))) {
                                var_2_183 = and:int(var_2_183:int, ldc:int(1165625390))
                                goto(Label_0263)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_183:int, ldc:int(8388608)), ldc:int(0))) {
                                var_2_183 = and:int(var_2_183:int, ldc:int(-2033023457))
                                loopcontinue()
                            }
                            
                            if (cmpne:boolean(and:int(var_2_183:int, ldc:int(4)), ldc:int(0))) {
                                var_2_183 = and:int(var_2_183:int, ldc:int(-115048539))
                                invokevirtual:void(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\u1833\uf995\ud158\u12b2\u1833\u8413, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>)
                                loopcontinue()
                            }
                            
                            loopcontinue(Label_0096)
                        }
                        
                        Label_0590:
                        
                        if (cmpeq:boolean(and:int(var_2_183:int, ldc:int(16777216)), ldc:int(0))) {
                            var_2_183 = and:int(var_2_183:int, ldc:int(-2147390108))
                            goto(Label_0483)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_183:int, ldc:int(256)), ldc:int(0))) {
                            var_2_183 = and:int(var_2_183:int, ldc:int(-1073075201))
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_183:int, ldc:int(2)), ldc:int(0))) {
                            var_2_183 = and:int(var_2_183:int, ldc:int(-843598777))
                            goto(Label_0330)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_183:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0263)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_183:int, ldc:int(32)), ldc:int(0))) {
                            var_2_183 = and:int(var_2_183:int, ldc:int(-60202273))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_2_183:int, ldc:int(65536)), ldc:int(0))) {
                                var_2_183 = and:int(var_2_183:int, ldc:int(1502294520))
                                loopcontinue(Label_0096)
                            }
                            
                            var_2_183 = and:int(var_2_183:int, ldc:int(-404311395))
                            looporswitchbreak()
                        }
                    }
                }
                finally {
                    putfield:int(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\ucfaf\u16f6\ua068\ub1b9\u9937\u8c8a, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>, sub:int(getfield:int(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\ucfaf\u16f6\ua068\ub1b9\u9937\u8c8a, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>), xor:int(ldc:int(101), ldc:int(100))))
                    var_2_183 = and:int(var_2_183:int, ldc:int(-1549419803))
                }
                
                looporswitchbreak()
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u1833\uf995\ud158\u12b2\u1833\u8413() {
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
            invokestatic:void(Thread::yield)
            invokestatic:void(LockSupport::parkNanos, ldc:String[expected:Object]("waiting for tasks"), ldc:long(100000L))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void run(R extends java.lang.Runnable p0) {
        var_2_8A : int
        var_4_92 : Exception
        
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
            var_2_8A = and:int(ldc:int(1498355529), ldc:int(736079641))
            
            try {
                do {
                    if (cmpne:boolean(and:int(var_2_8A:int, ldc:int(536870912)), ldc:int(0))) {
                        var_2_8A = and:int(var_2_8A:int, ldc:int(1712724148))
                    }
                    else {
                        var_2_8A = and:int(var_2_8A:int, ldc:int(398921595))
                        invokeinterface:void(Runnable::run, p0:R extends Runnable[expected:Runnable])
                    }
                } while (cmpne:boolean(and:int(var_2_8A:int, ldc:int(32)), ldc:int(0)))
                
                var_2_8A = and:int(var_2_8A:int, ldc:int(-852003287))
            }
            catch (java.lang.Exception var_4_92) {
                loop {
                    if (cmpeq:boolean(and:int(var_2_8A:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0291)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_8A:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0252)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_8A:int, ldc:int(131072)), ldc:int(0))) {
                        var_2_8A = and:int(var_2_8A:int, ldc:int(1442345874))
                    }
                    else {
                        var_2_8A = and:int(var_2_8A:int, ldc:int(1830268491))
                        invokeinterface:void(Logger::fatal, getstatic:Logger(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\u946b\u97e6\ua6bd\u6198\u965f\u836c), ldc:String("Error executing task on {}"), invokevirtual:String[expected:Object](\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>::\uf9c5\u8389\u600f\u965f\u446c\ua3b4, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>), var_4_92:Exception[expected:Object])
                    }
                    
                    Label_0203:
                    
                    if (cmpeq:boolean(and:int(var_2_8A:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_8A:int, ldc:int(512)), ldc:int(0))) {
                        var_2_8A = and:int(var_2_8A:int, ldc:int(-1970473104))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_8A:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_2_8A = and:int(var_2_8A:int, ldc:int(-1986019765))
                        
                        if (logicalnot:boolean(instanceof:boolean(java.lang.OutOfMemoryError.class, invokevirtual:Throwable(Throwable::getCause, var_4_92:Exception[expected:Throwable])))) {
                            return:void()
                        }
                    }
                    
                    Label_0252:
                    
                    if (cmpeq:boolean(and:int(var_2_8A:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_2_8A:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0203)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_8A:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_2_8A = and:int(var_2_8A:int, ldc:int(-78384149))
                            loopcontinue()
                        }
                        
                        var_2_8A = and:int(var_2_8A:int, ldc:int(-341381543))
                    }
                    
                    Label_0291:
                    
                    if (cmpne:boolean(and:int(var_2_8A:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0252)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_8A:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0203)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_8A:int, ldc:int(33554432)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                athrow(checkcast:OutOfMemoryError(java.lang.OutOfMemoryError.class, invokevirtual:Throwable(Throwable::getCause, var_4_92:Exception[expected:Throwable])))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubb2b\ud4fe\ub18d\ub171\u98a4\u873d(java.lang.Object p0) {
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
            invokevirtual:void(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<Runnable>::\ubb2b\ud4fe\ub18d\ub171\u98a4\u873d, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>, checkcast:Runnable(java.lang.Runnable.class, p0:Object[expected:Runnable]))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static java.lang.Void lambda$\ud12e\u8d90\u8aa5\u965f\u8d90\ub70c$0(java.lang.Runnable p0) {
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
            invokeinterface:void(Runnable::run, p0:Runnable)
            return:Void(aconstnull:Void())
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
            putstatic:Logger(\u4179\ubefe\u3711\u3a62\u3a62\u3bd6::\u946b\u97e6\ua6bd\u6198\u965f\u836c, invokestatic:Logger(LogManager::getLogger))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u4492\u3776\u52d3\u1833\u8753\u7c6b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6AC : int
        var_5_89 : int
        var_6_90 : int
        var_7_9F : double
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
        var_3_6AC = and:int(ldc:int(1845510795), ldc:int(-2113909603))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4179\ubefe\u3711\u3a62\u3a62\u3bd6<R>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0179)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-85011415))
        }
        else {
            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1098547803))
            var_5_89 = and:int(ldc:int(10448), ldc:int(-10449))
            var_6_90 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9F = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-12671), ldc:int(8574)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D0 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E2 = and:int(var_3_6AC:int, ldc:int(-1860160839))
                    var_9_D0 = sub:double(var_7_9F:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F3 = var_5_89:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F3:int, sub:int(var_6_90:int, and:int(ldc:int(6721), ldc:int(161)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F3:int, and:int(ldc:int(4185), ldc:int(289)))), var_7_9F:double))) {
                        inc:int(var_11_F3, ldc:int(1))
                    }
                    
                    var_3_6AC = and:int(var_3_E2:int, ldc:int(1266370441))
                    var_14_11D = var_7_9F:double
                    var_16_121 = var_11_F3:int
                }
                else {
                    var_11_F3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_89:int), xor:int(ldc:int(840), ldc:int(841)))
                    var_12_119 = var_14_11D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89)
                    
                    if (cmplt:boolean(var_16_121 = var_11_F3:int, var_6_90:int)) {
                        var_9_D0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F3:int)
                        var_16_121 = var_11_F3:int
                        var_14_11D = var_12_119:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(16429556))
                        goto(Label_1590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(230348))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-304800823))
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(454331443))
                        goto(Label_0866)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-688267104))
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(33938223))
                        goto(Label_0588)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(104391005))
                        
                        if (cmplt:boolean(var_16_121:int, var_6_90:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0588)
                            }
                            
                            goto(Label_0866)
                        }
                    }
                    
                    Label_0433:
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-26431038))
                        goto(Label_1006)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0866)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-364987085))
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1060460424))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1007065383))
                            var_11_F3 = and:int(ldc:int(20578), ldc:int(-20579))
                            goto(Label_1579)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0588:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(90408863))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-176197122))
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(268435456)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(196400638))
                        goto(Label_1006)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0866)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(887570631))
                            goto(Label_0433)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1520042550))
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-764078119))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11D = var_9_D0:double
                            goto(Label_0866)
                        }
                    }
                    
                    Label_0717:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1328959715))
                        goto(Label_1443)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(650077297))
                        goto(Label_1161)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-2103432241))
                        goto(Label_1006)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1032083324))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-152732658))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8)), ldc:int(0))) {
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1857005754))
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-576656289))
                        var_14_11D = mul:double(ldc:double(0.5), add:double(var_9_D0:double, var_14_11D:double))
                    }
                    
                    Label_0866:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1634888382))
                        goto(Label_1590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(771046143))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1312003104))
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-235657981))
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(77662654))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(268435456)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1280664619))
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1957144759))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_89:int), var_7_9F:double)) {
                                var_11_F3 = xor:int(ldc:int(8274), ldc:int(8275))
                                goto(Label_1161)
                            }
                        }
                    }
                    
                    Label_1006:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(213415579))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1224861760))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0866)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1347936539))
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1671743291))
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(262144)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-360923365))
                        var_11_F3 = and:int(ldc:int(-32419), ldc:int(24098))
                    }
                    
                    Label_1161:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1899609583))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-192075369))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1006)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(251234299))
                            goto(Label_0866)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1949940339))
                            goto(Label_0588)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(2098842347))
                            goto(Label_0433)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1020413297))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                                goto(Label_1443)
                            }
                        }
                    }
                    
                    Label_1291:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(88189458))
                        goto(Label_1590)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1002814259))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_1161)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-2100049529))
                            goto(Label_1006)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-241901463))
                            goto(Label_0866)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(1067879459))
                            goto(Label_0717)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0588)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1282083034))
                            goto(Label_0433)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6AC = and:int(var_3_6AC:int, ldc:int(691009085))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11D:double, var_5_89:int, var_16_121:int)
                            goto(Label_1579)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1443:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1590)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-871575105))
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0866)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1934259690))
                        goto(Label_0717)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(2031162270))
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0433)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(1722361315))
                        loopcontinue()
                    }
                    
                    var_3_6AC = and:int(var_3_6AC:int, ldc:int(1250464553))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11D:double, ldc:double(0.0))
                    Label_1579:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6B7 = var_5_89:int
                        
                        if (cmpeq:boolean(var_11_F3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1590:
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-30026492))
                        goto(Label_1443)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1291)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1161)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1006)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0866)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-746273883))
                        goto(Label_0717)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1563903123))
                        goto(Label_0588)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6AC:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-2131859330))
                        goto(Label_0433)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6AC = and:int(var_3_6AC:int, ldc:int(-1725248263))
                        var_17_6B7 = add:int(var_16_121:int, and:int(ldc:int(417), ldc:int(12361)))
                        looporswitchbreak()
                    }
                    
                    var_3_6AC = and:int(var_3_6AC:int, ldc:int(250062346))
                }
                
                var_3_6AC = and:int(var_3_6AC:int, ldc:int(-250775411))
                
                if (cmple:boolean(var_5_89 = var_17_6B7:int, sub:int(var_6_90:int, and:int(ldc:int(19), ldc:int(5185))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0179:
        
        if (cmpeq:boolean(and:int(var_3_6AC:int, ldc:int(1)), ldc:int(0))) {
            var_3_6AC = and:int(var_3_6AC:int, ldc:int(-699591941))
            goto(Label_0108)
        }
    }
}
