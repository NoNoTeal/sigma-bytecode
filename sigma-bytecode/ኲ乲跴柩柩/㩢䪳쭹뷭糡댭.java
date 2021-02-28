public abstract class \u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T> {
    public void \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d(java.lang.String p0, java.lang.Class<T> p1) {
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
    
    public \u47c2\u2dcc\u12cb\ud171\u8c8a.\u40a9\u12cb\u62da\u836c\u92ee\u51fa<T> \ucfaf\u392e\u8308\u600f\u4ab3\u36d3(T extends java.lang.Comparable<T> p0) {
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
            return:\u40a9\u12cb\u62da\u836c\u92ee\u51fa<T>(initobject:\u40a9\u12cb\u62da\u836c\u92ee\u51fa<T>(\u40a9\u12cb\u62da\u836c\u92ee\u51fa<T>::<init>, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, p0:T extends Comparable<T>[expected:Comparable], aconstnull:\uc910\u7049\u4975\u97b7\u8c8a\u960f()))
        }
        
        goto(Label_0006)
    }
    
    public \u47c2\u2dcc\u12cb\ud171\u8c8a.\u40a9\u12cb\u62da\u836c\u92ee\u51fa<T> \u7043\ube23\u927d\ud4fe\u416d\u5d20(\u3bc9\u67e9\uc87f\u47c2\u5f50.\uc31c\u74b1\u8389\u494c\u88c5\u446c<?, ?> p0) {
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
            return:\u40a9\u12cb\u62da\u836c\u92ee\u51fa<T>(initobject:\u40a9\u12cb\u62da\u836c\u92ee\u51fa<T>(\u40a9\u12cb\u62da\u836c\u92ee\u51fa<T>::<init>, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, invokevirtual:Comparable(\uc31c\u74b1\u8389\u494c\u88c5\u446c<?, ?>::\u93a2\ub171\ub7dc\u4c04\u0a06\ubb2b, p0:\uc31c\u74b1\u8389\u494c\u88c5\u446c<?, ?>, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>), aconstnull:\uc910\u7049\u4975\u97b7\u8c8a\u960f()))
        }
        
        goto(Label_0006)
    }
    
    public java.util.stream.Stream<\u47c2\u2dcc\u12cb\ud171\u8c8a.\u40a9\u12cb\u62da\u836c\u92ee\u51fa<T>> \u4975\u965f\u839e\u183a\ud4fe\u6cfe() {
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
            return:Stream<\u40a9\u12cb\u62da\u836c\u92ee\u51fa<T>>(invokeinterface:Stream<\u40a9\u12cb\u62da\u836c\u92ee\u51fa<T>>(Stream<T>::map, invokeinterface:Stream<T>(Collection<T>::stream, invokevirtual:Collection<T>(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u12cb\u67e9\ud171\u6b5f\u6198\u36d3, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>)), invokedynamic:Function<Comparable, \u40a9\u12cb\u62da\u836c\u92ee\u51fa>(apply:(L\u12b2\u4e72\u8df4\u67e9\u67e9/\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d;)Ljava/util/function/Function;, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>)))
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.serialization.Codec<\u47c2\u2dcc\u12cb\ud171\u8c8a.\u40a9\u12cb\u62da\u836c\u92ee\u51fa<T>> \ua3b4\u3711\u71f1\uc238\u7049\u527a() {
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
            return:Codec<\u40a9\u12cb\u62da\u836c\u92ee\u51fa<T>>(getfield:Codec<\u40a9\u12cb\u62da\u836c\u92ee\u51fa<T>>(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\u9033\ud51e\u6c52\u4c2b\u8c8a\u516c, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1() {
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
            return:String(getfield:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\ubcb0\u8753\ua61f\ubefe\u61a4\u76bc, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>))
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Class<T> \u8aa5\uc910\u3e2a\u72f1\u6ec6\ud171() {
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
            return:Class<T>(getfield:Class<T>(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\u4bc8\ubded\uc31c\u72f1\ud36e\ud4fe, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>))
        }
        
        goto(Label_0006)
    }
    
    public abstract java.util.Collection<T> \u12cb\u67e9\ud171\u6b5f\u6198\u36d3();
    
    public abstract java.lang.String \u3bd6\u7e3f\ube23\u5fe1\u416d\u7ce1(T extends java.lang.Comparable<T> p0);
    
    public abstract java.util.Optional<T> \u873d\uc87f\ucef1\u9033\u3bc9\u6bb9(java.lang.String p0);
    
    public java.lang.String toString() {
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
            return:String(invokevirtual:String(MoreObjects$ToStringHelper::toString, invokevirtual:MoreObjects$ToStringHelper(MoreObjects$ToStringHelper::add, invokevirtual:MoreObjects$ToStringHelper(MoreObjects$ToStringHelper::add, invokevirtual:MoreObjects$ToStringHelper(MoreObjects$ToStringHelper::add, invokestatic:MoreObjects$ToStringHelper(MoreObjects::toStringHelper, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>[expected:Object]), ldc:String("name"), getfield:String[expected:Object](\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\ubcb0\u8753\ua61f\ubefe\u61a4\u76bc, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>)), ldc:String("clazz"), getfield:Class<T>[expected:Object](\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\u4bc8\ubded\uc31c\u72f1\ud36e\ud4fe, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>)), ldc:String("values"), invokevirtual:Collection<T>[expected:Object](\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u12cb\u67e9\ud171\u6b5f\u6198\u36d3, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>))))
        }
        
        goto(Label_0006)
    }
    
    public boolean equals(java.lang.Object p0) {
        var_2_5F : int
        var_2_70 : int
        var_2_93 : int
        var_4_98 : \u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d
        stack_FC_0 : int [generated]
        
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
        var_2_5F = and:int(ldc:int(-81991751), ldc:int(-50333706))
        
        if (cmpeq:boolean(this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>[expected:Object], p0:Object)) {
            return:boolean(and:int[expected:boolean](ldc:int(24593), ldc:int(257)))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16384)), ldc:int(0))) {
                var_2_70 = and:int(var_2_5F:int, ldc:int(1139788443))
            }
            else {
                var_2_70 = and:int(var_2_5F:int, ldc:int(-243411974))
                
                if (logicalnot:boolean(instanceof:boolean(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d.class, p0:Object))) {
                    return:boolean(and:int[expected:boolean](ldc:int(19491), ldc:int(-19492)))
                }
            }
            
            if (cmpne:boolean(and:int(var_2_70:int, ldc:int(524288)), ldc:int(0))) {
                var_2_93 = and:int(var_2_70:int, ldc:int(-218235978))
                var_4_98 = checkcast:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d(\u12b2\u4e72\u8df4\u67e9\u67e9.\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d.class, p0:Object[expected:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d])
                
                if (logicaland:boolean(invokevirtual:boolean(Object::equals, getfield:Class<T>[expected:Object](\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\u4bc8\ubded\uc31c\u72f1\ud36e\ud4fe, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>), getfield:Class<T>(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\u4bc8\ubded\uc31c\u72f1\ud36e\ud4fe, var_4_98:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d)), invokevirtual:boolean(String::equals, getfield:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\ubcb0\u8753\ua61f\ubefe\u61a4\u76bc, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>), getfield:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\ubcb0\u8753\ua61f\ubefe\u61a4\u76bc, var_4_98:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d)))) {
                    stack_FC_0 = and:int(ldc:int(10355), ldc:int(1285))
                }
                else {
                    var_2_93 = and:int(var_2_93:int, ldc:int(-228799555))
                    stack_FC_0 = and:int(ldc:int(-12833), ldc:int(12832))
                }
                
                return:boolean(stack_FC_0:int)
            }
            
            var_2_5F = and:int(var_2_70:int, ldc:int(401749063))
        }
    }
    
    public final int hashCode() {
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
            
            if (cmpeq:boolean(getfield:Integer(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\ubff1\u93a2\uae5d\u47c2\u5bc4\uf94d, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>), aconstnull:Integer())) {
                putfield:Integer(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\ubff1\u93a2\uae5d\u47c2\u5bc4\uf94d, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>, invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>::\u7d52\u6d99\uc29a\u9937\u7af6\ucb79, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>)))
            }
            
            return:int(invokevirtual:int(Integer::intValue, getfield:Integer(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\ubff1\u93a2\uae5d\u47c2\u5bc4\uf94d, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>)))
        }
        
        goto(Label_0006)
    }
    
    public int \u7d52\u6d99\uc29a\u9937\u7af6\ucb79() {
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
            return:int(add:int(mul:int(ldc:int(31), invokevirtual:int(Object::hashCode, getfield:Class<T>[expected:Object](\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\u4bc8\ubded\uc31c\u72f1\ud36e\ud4fe, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>))), invokevirtual:int(String::hashCode, getfield:String(\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d::\ubcb0\u8753\ua61f\ubefe\u61a4\u76bc, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>))))
        }
        
        goto(Label_0006)
    }
    
    private com.mojang.serialization.DataResult lambda$\u5d20\u759a\u8308\ud171\u47c2\u7ce1$1(java.lang.String p0) {
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
    
    private com.mojang.serialization.DataResult lambda$\u67e9\u71f1\uf995\u8308\u7873\u8df4$0(java.lang.String p0) {
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
            return:DataResult(invokestatic:DataResult(DataResult::error, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), ldc:String("Unable to read property: ")), this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>[expected:Object]), ldc:String(" with value: ")), p0:String))))
        }
        
        goto(Label_0006)
    }
    
    public void \ud171\u8cae\u59ec\u4cd9\u8d90\u836c(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6BA : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_D1 : double
        var_3_E3 : int
        var_11_F4 : int
        var_14_11E : double
        var_16_122 : int
        var_12_11A : double
        var_17_6C5 : int
        
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
        var_3_6BA = and:int(ldc:int(43863509), ldc:int(390024702))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u3a62\u4ab3\ucb79\ubded\u7ce1\ub32d<T>[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1502739388))
        }
        else {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-755812580))
            var_5_8A = and:int(ldc:int(-6202), ldc:int(6201))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16655), ldc:int(-17712)))
            invokestatic:int(m::a)
            
            loop {
                var_9_D1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_E3 = and:int(var_3_6BA:int, ldc:int(39061501))
                    var_9_D1 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_F4 = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_F4:int, sub:int(var_6_91:int, xor:int(ldc:int(2832), ldc:int(2833)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_F4:int, xor:int(ldc:int(18449), ldc:int(18448)))), var_7_A0:double))) {
                        inc:int(var_11_F4, ldc:int(1))
                    }
                    
                    var_3_6BA = and:int(var_3_E3:int, ldc:int(-489319114))
                    var_14_11E = var_7_A0:double
                    var_16_122 = var_11_F4:int
                }
                else {
                    var_11_F4 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), and:int(ldc:int(4865), ldc:int(1061)))
                    var_12_11A = var_14_11E = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_122 = var_11_F4:int, var_6_91:int)) {
                        var_9_D1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_F4:int)
                        var_16_122 = var_11_F4:int
                        var_14_11E = var_12_11A:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-249169882))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-474879743))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1492351290))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-101971188))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1839019607))
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1599781957))
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1017125092))
                        
                        if (cmplt:boolean(var_16_122:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0577)
                            }
                            
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0438:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-936185221))
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-950601836))
                            var_11_F4 = and:int(ldc:int(19408), ldc:int(-31701))
                            goto(Label_1598)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0577:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-703853003))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1324197170))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1563900134))
                        goto(Label_1155)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1704398706))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1790721320))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1598845623))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(509304724))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_11E = var_9_D1:double
                            goto(Label_0879)
                        }
                    }
                    
                    Label_0720:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1160527282))
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1139899480))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1679750914))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1026604774))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(846107599))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1272094202))
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(2030531054))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-550382145))
                        var_14_11E = mul:double(ldc:double(0.5), add:double(var_9_D1:double, var_14_11E:double))
                    }
                    
                    Label_0879:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(76216460))
                        goto(Label_1452)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1298)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1045837346))
                            goto(Label_0720)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1749997199))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(172230354))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(2144917309))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_F4 = and:int(ldc:int(25), ldc:int(8707))
                                goto(Label_1155)
                            }
                        }
                    }
                    
                    Label_1004:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1128204491))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(505389054))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1917876229))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-883204291))
                        var_11_F4 = and:int(ldc:int(-24790), ldc:int(24661))
                    }
                    
                    Label_1155:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-996544658))
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-167539118))
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(434836057))
                            goto(Label_1004)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(558110306))
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(1618513562))
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(694406753))
                            goto(Label_0438)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1871893789))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                                goto(Label_1452)
                            }
                        }
                    }
                    
                    Label_1298:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2097152)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-524825336))
                            goto(Label_1155)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(745327292))
                            goto(Label_1004)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-734808312))
                            goto(Label_0879)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(725503944))
                            goto(Label_0720)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                            goto(Label_0577)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(766700990))
                            goto(Label_0438)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                            var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1839090799))
                            loopcontinue()
                        }
                        
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1020078722))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_11E:double, var_5_8A:int, var_16_122:int)
                        goto(Label_1598)
                    }
                    
                    Label_1452:
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1609)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-2066322177))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1616105876))
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1004)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(536870912)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(141047400))
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-215254872))
                        goto(Label_0438)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1574538437))
                        loopcontinue()
                    }
                    
                    var_3_6BA = and:int(var_3_6BA:int, ldc:int(-1698978371))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_11E:double, ldc:double(0.0))
                    Label_1598:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6C5 = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_F4:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1609:
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_1452)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1334472823))
                        goto(Label_1298)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1155)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(-613996346))
                        goto(Label_1004)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0879)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0720)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0577)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(1264798309))
                        goto(Label_0438)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6BA:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_6BA = and:int(var_3_6BA:int, ldc:int(440112566))
                        var_17_6C5 = add:int(var_16_122:int, and:int(ldc:int(163), ldc:int(3149)))
                        looporswitchbreak()
                    }
                    
                    var_3_6BA = and:int(var_3_6BA:int, ldc:int(-459734579))
                }
                
                var_3_6BA = and:int(var_3_6BA:int, ldc:int(918298110))
                
                if (cmple:boolean(var_5_8A = var_17_6C5:int, sub:int(var_6_91:int, and:int(ldc:int(4629), ldc:int(201))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpeq:boolean(and:int(var_3_6BA:int, ldc:int(16)), ldc:int(0))) {
            var_3_6BA = and:int(var_3_6BA:int, ldc:int(794638134))
            goto(Label_0108)
        }
    }
}
