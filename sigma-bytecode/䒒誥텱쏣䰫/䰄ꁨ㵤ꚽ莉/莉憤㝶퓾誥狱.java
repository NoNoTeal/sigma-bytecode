public final class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u8389\u61a4\u3776\ud4fe\u8aa5\u72f1 {
    public void \u8389\u61a4\u3776\ud4fe\u8aa5\u72f1(int p0) {
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
    
    public java.lang.Runnable \u3d64\u7d52\u64ab\u98a4\u1833\u93a2() {
        var_1_75 : int
        var_3_69 : Iterator<Queue<Runnable>>
        var_5_AE : Runnable
        
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
        var_1_75 = and:int(ldc:int(788943338), ldc:int(2126997305))
        var_3_69 = invokeinterface:Iterator<Queue<Runnable>>(List<Queue<Runnable>>::iterator, getfield:List<Queue<Runnable>>(\u8389\u61a4\u3776\ud4fe\u8aa5\u72f1::\ucb79\u647c\u5f50\u8413\u8753\u3d4b, this:\u8389\u61a4\u3776\ud4fe\u8aa5\u72f1))
        
        loop {
            if (cmpne:boolean(and:int(var_1_75:int, ldc:int(33554432)), ldc:int(0))) {
                var_1_75 = and:int(var_1_75:int, ldc:int(-271660552))
                
                if (invokeinterface:boolean(Iterator<E>::hasNext, var_3_69:Iterator<Queue<Runnable>>)) {
                    var_5_AE = checkcast:Runnable(java.lang.Runnable.class, invokeinterface:Runnable(Queue<Runnable>::poll, checkcast:Queue<Runnable>(java.util.Queue<java.lang.Runnable>.class, invokeinterface:Queue<Runnable>(Iterator<Queue<Runnable>>::next, var_3_69:Iterator<Queue<Runnable>>))))
                    
                    if (cmpeq:boolean(var_5_AE:Runnable, aconstnull:Runnable())) {
                        var_1_75 = and:int(var_1_75:int, ldc:int(-1096922757))
                        loopcontinue()
                    }
                    
                    return:Runnable(var_5_AE:Runnable)
                }
            }
            
            if (cmpeq:boolean(and:int(var_1_75:int, ldc:int(1024)), ldc:int(0))) {
                return:Runnable(aconstnull:Runnable())
            }
            
            var_1_75 = and:int(var_1_75:int, ldc:int(-1610966028))
        }
    }
    
    public boolean \u965f\u3e2a\u836c\uc3e3\u4bc8\u9033(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u873d\ud523\u983f\u8d98\u0b8e\u8c8a p0) {
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
            invokeinterface:boolean(Queue<\u873d\ud523\u983f\u8d98\u0b8e\u8c8a>::add, checkcast:Queue<Runnable>(java.util.Queue<java.lang.Runnable>.class, invokeinterface:Queue<Runnable>(List<Queue<Runnable>>::get, getfield:List<Queue<Runnable>>(\u8389\u61a4\u3776\ud4fe\u8aa5\u72f1::\ucb79\u647c\u5f50\u8413\u8753\u3d4b, this:\u8389\u61a4\u3776\ud4fe\u8aa5\u72f1), invokevirtual:int(\u873d\ud523\u983f\u8d98\u0b8e\u8c8a::\u873d\ucef1\u4daf\uc7fe\ub19c\u5654, p0:\u873d\ud523\u983f\u8d98\u0b8e\u8c8a))), p0:\u873d\ud523\u983f\u8d98\u0b8e\u8c8a)
            return:boolean(and:int[expected:boolean](ldc:int(9283), ldc:int(20785)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u6bb9\u8258\u946b\u6d99\u3e75\u4daf() {
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
            return:boolean(invokeinterface:boolean(Stream<Object>::allMatch, invokeinterface:Stream<Object>(Collection<Object>::stream, getfield:List<Queue<Runnable>>[expected:Collection<Object>](\u8389\u61a4\u3776\ud4fe\u8aa5\u72f1::\ucb79\u647c\u5f50\u8413\u8753\u3d4b, this:\u8389\u61a4\u3776\ud4fe\u8aa5\u72f1)), invokedynamic:Predicate<? super Object>(test:()Ljava/util/function/Predicate;)))
        }
        
        goto(Label_0006)
    }
    
    public boolean \u965f\u3e2a\u836c\uc3e3\u4bc8\u9033(java.lang.Object p0) {
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
            return:boolean(invokevirtual:boolean(\u8389\u61a4\u3776\ud4fe\u8aa5\u72f1::\u965f\u3e2a\u836c\uc3e3\u4bc8\u9033, this:\u8389\u61a4\u3776\ud4fe\u8aa5\u72f1, checkcast:\u873d\ud523\u983f\u8d98\u0b8e\u8c8a(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u873d\ud523\u983f\u8d98\u0b8e\u8c8a.class, p0:Object[expected:\u873d\ud523\u983f\u8d98\u0b8e\u8c8a])))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u3d64\u7d52\u64ab\u98a4\u1833\u93a2() {
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
            return:Object(invokevirtual:Runnable[expected:Object](\u8389\u61a4\u3776\ud4fe\u8aa5\u72f1::\u3d64\u7d52\u64ab\u98a4\u1833\u93a2, this:\u8389\u61a4\u3776\ud4fe\u8aa5\u72f1))
        }
        
        goto(Label_0006)
    }
    
    private static java.util.concurrent.ConcurrentLinkedQueue lambda$\ud36e\u71f1\u4c2b\uc910\u71f1\ud158$0(int p0) {
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
            return:ConcurrentLinkedQueue(invokestatic:ConcurrentLinkedQueue(Queues::newConcurrentLinkedQueue))
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
    
    public void \u56bd\ufcaf\u416d\u9033\ubefe\u6d99(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_61C : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_627 : int
        
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
        var_3_61C = and:int(ldc:int(-1546424272), ldc:int(-1553495112))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u8389\u61a4\u3776\ud4fe\u8aa5\u72f1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(64)), ldc:int(0))) {
            var_3_61C = and:int(var_3_61C:int, ldc:int(-970658230))
        }
        else {
            var_3_61C = and:int(var_3_61C:int, ldc:int(-1142165199))
            var_5_85 = and:int(ldc:int(-8738), ldc:int(8737))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(22724), ldc:int(-23239)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_61C:int, ldc:int(-77115614))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, xor:int(ldc:int(60), ldc:int(61)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(17), ldc:int(4289)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_61C = and:int(var_3_DA:int, ldc:int(-413982170))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(12288), ldc:int(12289)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-418134451))
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-875879617))
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-143369659))
                        goto(Label_1204)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-799426207))
                        goto(Label_0787)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-401362034))
                        goto(Label_0653)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1412964180))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0555)
                            }
                            
                            goto(Label_0787)
                        }
                    }
                    
                    Label_0405:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1204)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1405656333))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-802353763))
                        goto(Label_0787)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-407818401))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-1141663961))
                            var_11_EB = and:int(ldc:int(-3783), ldc:int(3780))
                            goto(Label_1446)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0555:
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-2063118413))
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1204)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0787)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(344277555))
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(33554432)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1413370756))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0787)
                        }
                    }
                    
                    Label_0653:
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(131612937))
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1256650658))
                        goto(Label_1204)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1146439924))
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(2032789366))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0555)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-13988406))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1074267603))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0787:
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1893518911))
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(594040189))
                        goto(Label_1204)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(4)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(447394315))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(514611100))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0653)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-823702300))
                            goto(Label_0555)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(4)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-1279386776))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1143875524))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = and:int(ldc:int(28949), ldc:int(1091))
                                goto(Label_1085)
                            }
                        }
                    }
                    
                    Label_0925:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1204)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-467072042))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-1038793725))
                            goto(Label_0787)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(319649012))
                            goto(Label_0653)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0555)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1584610260))
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(512)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-177746461))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1552577217))
                        var_11_EB = and:int(ldc:int(-15061), ldc:int(14996))
                    }
                    
                    Label_1085:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1326)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(489378954))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0925)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(144260149))
                            goto(Label_0787)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1057169481))
                            goto(Label_0653)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(1906492492))
                            goto(Label_0555)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(32)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-213555078))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1326)
                            }
                        }
                    }
                    
                    Label_1204:
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(330480246))
                        goto(Label_1457)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1085)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-1577086674))
                            goto(Label_0925)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0787)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0653)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0555)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0405)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_61C = and:int(var_3_61C:int, ldc:int(-490998097))
                            loopcontinue()
                        }
                        
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1344294938))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                        goto(Label_1446)
                    }
                    
                    Label_1326:
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(965176282))
                        goto(Label_1457)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_1204)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(746242660))
                        goto(Label_1085)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(616529048))
                        goto(Label_0787)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0555)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0405)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_61C = and:int(var_3_61C:int, ldc:int(-347748049))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1446:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_627 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1457:
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1653659512))
                        goto(Label_1326)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-2006085402))
                        goto(Label_1204)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_61C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-724272745))
                        goto(Label_1085)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0925)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0787)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0653)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0555)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(2065483352))
                        goto(Label_0405)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_61C = and:int(var_3_61C:int, ldc:int(-1076527317))
                        var_17_627 = add:int(var_16_119:int, and:int(ldc:int(3665), ldc:int(28677)))
                        looporswitchbreak()
                    }
                }
                
                var_3_61C = and:int(var_3_61C:int, ldc:int(-210559503))
                
                if (cmple:boolean(var_5_85 = var_17_627:int, sub:int(var_6_8C:int, xor:int(ldc:int(898), ldc:int(899))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpne:boolean(and:int(var_3_61C:int, ldc:int(2)), ldc:int(0))) {
            var_3_61C = and:int(var_3_61C:int, ldc:int(-1158477754))
            goto(Label_0106)
        }
    }
}
